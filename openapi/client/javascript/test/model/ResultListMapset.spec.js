/**
 * West Coast Informatics Terminology API
 * API documentation for the <a href=\"https://www.westcoastinformatics.com\">West Coast Informatics</a> terminology server API.<p>Request a 30-day bearer token from <a href=\"mailto:info@westcoastinformatics.com\">info@westcoastinformatics.com</a>.</p> <p>For full documentation on this service, please visit our wiki page at <a href=\"https://wci-wiki.atlassian.net/wiki/spaces/TSV2\">https://wci-wiki.atlassian.net/wiki/spaces/TSV2</a>.</p>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@westcoastinformatics.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.WestCoastInformaticsTerminologyApi);
  }
}(this, function(expect, WestCoastInformaticsTerminologyApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ResultListMapset', function() {
    it('should create an instance of ResultListMapset', function() {
      // uncomment below and update the code to test ResultListMapset
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be.a(WestCoastInformaticsTerminologyApi.ResultListMapset);
    });

    it('should have the property total (base name: "total")', function() {
      // uncomment below and update the code to test the property total
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be();
    });

    it('should have the property limit (base name: "limit")', function() {
      // uncomment below and update the code to test the property limit
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be();
    });

    it('should have the property offset (base name: "offset")', function() {
      // uncomment below and update the code to test the property offset
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be();
    });

    it('should have the property confidence (base name: "confidence")', function() {
      // uncomment below and update the code to test the property confidence
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be();
    });

    it('should have the property items (base name: "items")', function() {
      // uncomment below and update the code to test the property items
      //var instance = new WestCoastInformaticsTerminologyApi.ResultListMapset();
      //expect(instance).to.be();
    });

  });

}));
