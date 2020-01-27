'use strict';

var myApp = angular.module('myApp', [ 'ui.bootstrap' ]).config(
  function($rootScopeProvider) {

    // Set recursive digest limit higher to handle very deep trees.
    $rootScopeProvider.digestTtl(17);
  });

// Declare top level URL vars
var baseUrl = "http://localhost:8080/api/v1";

// Initialization of myApp
myApp.run([ '$rootScope', '$http', '$window',
  function($rootScope, $http, $window) {
    // n/a
  } ]);

// Controller for the page
myApp.controller('SimpleCtrl', function($scope, $http) {

  // Scope variables
  $scope.errorMsg = null;
  $scope.findByQueryResult = null;
  $scope.findByQueryUrl = null;
  $scope.findByQueryCt = 0;
  $scope.findByDescriptionIdResult = null;
  $scope.findByDescriptionIdUrl = null;
  $scope.findByConceptIdResult = null;
  $scope.findByConceptIdUrl = null;
  $scope.findByQueryWithFitlerResult = null;
  $scope.findByQueryWithFilterUrl = null;

  // Clear error
  $scope.clearError = function() {
    $scope.errorMsg = null;
  }

  // Clear all scope vars
  $scope.clear = function() {
    $scope.errorMsg = null;
    $scope.findByQueryResult = null;
    $scope.findByQueryUrl = null;
    $scope.findByQueryCt = 0;
    $scope.findByDescriptionIdResult = null;
    $scope.findByDescriptionIdUrl = null;
    $scope.findByConceptIdResult = null;
    $scope.findByConceptIdUrl = null;
    $scope.findByQueryWithFitlerResult = null;
    $scope.findByQueryWithFilterUrl = null;
  }

  // Find by query and set the scrollable raw json result
  $scope.findByQuery = function(query) {
    console.debug('findByQuery', query);

    // Make the HTTP Call
    $scope.findByQueryUrl = baseUrl + '/' + edition + '/' + version
      + '/concepts?term=' + encodeURIComponent(query)
      + '&activeFilter=true&offset=0&limit=50';
    $http.get($scope.findByQueryUrl).then(
    // success
    function(response) {
      console.debug('  matches = ', response.data);
      $scope.findByQueryResult = JSON.stringify(response.data, null, 2);
      $scope.findByQueryCt = response.data.total;
    },
    // error
    function(response) {
      $scope.errorMsg = response;
    });
  }

  // end
});
