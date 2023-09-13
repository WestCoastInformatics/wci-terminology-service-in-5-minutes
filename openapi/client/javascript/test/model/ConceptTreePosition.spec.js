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
    instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
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

  describe('ConceptTreePosition', function() {
    it('should create an instance of ConceptTreePosition', function() {
      // uncomment below and update the code to test ConceptTreePosition
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be.a(WestCoastInformaticsTerminologyApi.ConceptTreePosition);
    });

    it('should have the property children (base name: "children")', function() {
      // uncomment below and update the code to test the property children
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property level (base name: "level")', function() {
      // uncomment below and update the code to test the property level
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property ancestorPath (base name: "ancestorPath")', function() {
      // uncomment below and update the code to test the property ancestorPath
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property code (base name: "code")', function() {
      // uncomment below and update the code to test the property code
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property additionalType (base name: "additionalType")', function() {
      // uncomment below and update the code to test the property additionalType
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property childCt (base name: "childCt")', function() {
      // uncomment below and update the code to test the property childCt
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property created (base name: "created")', function() {
      // uncomment below and update the code to test the property created
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property local (base name: "local")', function() {
      // uncomment below and update the code to test the property local
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property modifiedBy (base name: "modifiedBy")', function() {
      // uncomment below and update the code to test the property modifiedBy
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property modified (base name: "modified")', function() {
      // uncomment below and update the code to test the property modified
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property active (base name: "active")', function() {
      // uncomment below and update the code to test the property active
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

    it('should have the property terminology (base name: "terminology")', function() {
      // uncomment below and update the code to test the property terminology
      //var instance = new WestCoastInformaticsTerminologyApi.ConceptTreePosition();
      //expect(instance).to.be();
    });

  });

}));