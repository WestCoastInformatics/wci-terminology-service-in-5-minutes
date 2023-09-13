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

import ApiClient from '../ApiClient';

/**
 * The Atom model module.
 * @module model/Atom
 * @version 1.0.0
 */
class Atom {
    /**
     * Constructs a new <code>Atom</code>.
     * Represents a name with a term type that contributes meaning to a concept
     * @alias module:model/Atom
     * @param codeId {String} the code in the specified terminology
     * @param localeMap {Object.<String, Boolean>} a map of language codes to boolean values indicated whether this definition is preferred in that language context
     * @param termType {String} the term type
     * @param created {Date} the created date
     * @param local {Boolean} indicates whether this data element was created by local editing
     * @param modifiedBy {String} the identifier of the user who made the last modification
     * @param modified {Date} the last modified date
     * @param id {String} the unique identifier
     * @param active {Boolean} indicates whether or not this data element is active
     * @param name {String} the name
     * @param terminology {String} the terminology abbreviation
     */
    constructor(codeId, localeMap, termType, created, local, modifiedBy, modified, id, active, name, terminology) { 
        
        Atom.initialize(this, codeId, localeMap, termType, created, local, modifiedBy, modified, id, active, name, terminology);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, codeId, localeMap, termType, created, local, modifiedBy, modified, id, active, name, terminology) { 
        obj['codeId'] = codeId;
        obj['localeMap'] = localeMap;
        obj['termType'] = termType;
        obj['created'] = created;
        obj['local'] = local;
        obj['modifiedBy'] = modifiedBy;
        obj['modified'] = modified;
        obj['id'] = id;
        obj['active'] = active;
        obj['name'] = name;
        obj['terminology'] = terminology;
    }

    /**
     * Constructs a <code>Atom</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Atom} obj Optional instance to populate.
     * @return {module:model/Atom} The populated <code>Atom</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Atom();

            if (data.hasOwnProperty('codeId')) {
                obj['codeId'] = ApiClient.convertToType(data['codeId'], 'String');
            }
            if (data.hasOwnProperty('localeMap')) {
                obj['localeMap'] = ApiClient.convertToType(data['localeMap'], {'String': 'Boolean'});
            }
            if (data.hasOwnProperty('conceptId')) {
                obj['conceptId'] = ApiClient.convertToType(data['conceptId'], 'String');
            }
            if (data.hasOwnProperty('descriptorId')) {
                obj['descriptorId'] = ApiClient.convertToType(data['descriptorId'], 'String');
            }
            if (data.hasOwnProperty('termType')) {
                obj['termType'] = ApiClient.convertToType(data['termType'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
            if (data.hasOwnProperty('local')) {
                obj['local'] = ApiClient.convertToType(data['local'], 'Boolean');
            }
            if (data.hasOwnProperty('modifiedBy')) {
                obj['modifiedBy'] = ApiClient.convertToType(data['modifiedBy'], 'String');
            }
            if (data.hasOwnProperty('modified')) {
                obj['modified'] = ApiClient.convertToType(data['modified'], 'Date');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('terminologyId')) {
                obj['terminologyId'] = ApiClient.convertToType(data['terminologyId'], 'String');
            }
            if (data.hasOwnProperty('terminology')) {
                obj['terminology'] = ApiClient.convertToType(data['terminology'], 'String');
            }
            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], {'String': 'String'});
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Atom</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Atom</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Atom.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['codeId'] && !(typeof data['codeId'] === 'string' || data['codeId'] instanceof String)) {
            throw new Error("Expected the field `codeId` to be a primitive type in the JSON string but got " + data['codeId']);
        }
        // ensure the json data is a string
        if (data['conceptId'] && !(typeof data['conceptId'] === 'string' || data['conceptId'] instanceof String)) {
            throw new Error("Expected the field `conceptId` to be a primitive type in the JSON string but got " + data['conceptId']);
        }
        // ensure the json data is a string
        if (data['descriptorId'] && !(typeof data['descriptorId'] === 'string' || data['descriptorId'] instanceof String)) {
            throw new Error("Expected the field `descriptorId` to be a primitive type in the JSON string but got " + data['descriptorId']);
        }
        // ensure the json data is a string
        if (data['termType'] && !(typeof data['termType'] === 'string' || data['termType'] instanceof String)) {
            throw new Error("Expected the field `termType` to be a primitive type in the JSON string but got " + data['termType']);
        }
        // ensure the json data is a string
        if (data['modifiedBy'] && !(typeof data['modifiedBy'] === 'string' || data['modifiedBy'] instanceof String)) {
            throw new Error("Expected the field `modifiedBy` to be a primitive type in the JSON string but got " + data['modifiedBy']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['terminologyId'] && !(typeof data['terminologyId'] === 'string' || data['terminologyId'] instanceof String)) {
            throw new Error("Expected the field `terminologyId` to be a primitive type in the JSON string but got " + data['terminologyId']);
        }
        // ensure the json data is a string
        if (data['terminology'] && !(typeof data['terminology'] === 'string' || data['terminology'] instanceof String)) {
            throw new Error("Expected the field `terminology` to be a primitive type in the JSON string but got " + data['terminology']);
        }

        return true;
    }


}

Atom.RequiredProperties = ["codeId", "localeMap", "termType", "created", "local", "modifiedBy", "modified", "id", "active", "name", "terminology"];

/**
 * the code in the specified terminology
 * @member {String} codeId
 */
Atom.prototype['codeId'] = undefined;

/**
 * a map of language codes to boolean values indicated whether this definition is preferred in that language context
 * @member {Object.<String, Boolean>} localeMap
 */
Atom.prototype['localeMap'] = undefined;

/**
 * the concept id (for terminologies that use concepts)
 * @member {String} conceptId
 */
Atom.prototype['conceptId'] = undefined;

/**
 * the descriptor id (for terminologies that use descriptors)
 * @member {String} descriptorId
 */
Atom.prototype['descriptorId'] = undefined;

/**
 * the term type
 * @member {String} termType
 */
Atom.prototype['termType'] = undefined;

/**
 * the created date
 * @member {Date} created
 */
Atom.prototype['created'] = undefined;

/**
 * indicates whether this data element was created by local editing
 * @member {Boolean} local
 */
Atom.prototype['local'] = undefined;

/**
 * the identifier of the user who made the last modification
 * @member {String} modifiedBy
 */
Atom.prototype['modifiedBy'] = undefined;

/**
 * the last modified date
 * @member {Date} modified
 */
Atom.prototype['modified'] = undefined;

/**
 * the unique identifier
 * @member {String} id
 */
Atom.prototype['id'] = undefined;

/**
 * indicates whether or not this data element is active
 * @member {Boolean} active
 */
Atom.prototype['active'] = undefined;

/**
 * the name
 * @member {String} name
 */
Atom.prototype['name'] = undefined;

/**
 * the identifier asserted by the terminology
 * @member {String} terminologyId
 */
Atom.prototype['terminologyId'] = undefined;

/**
 * the terminology abbreviation
 * @member {String} terminology
 */
Atom.prototype['terminology'] = undefined;

/**
 * key/value pairs associated with this object. Entries in this map are terminology-specific
 * @member {Object.<String, String>} attributes
 */
Atom.prototype['attributes'] = undefined;






export default Atom;

