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
 * The ConceptRelationship model module.
 * @module model/ConceptRelationship
 * @version 1.0.0
 */
class ConceptRelationship {
    /**
     * Constructs a new <code>ConceptRelationship</code>.
     * Represents a relationship between two concepts
     * @alias module:model/ConceptRelationship
     * @param hierarchical {Boolean} indicates whether this relationship is part of the hierarchy
     * @param type {String} the high level type of relationship (more information about this label is provided in the terminology metadata)
     * @param assertedDirection {Boolean} indicates whether this relationship is in the direction asserted by the terminology. This is meaninful because in some instances relationships are loaded in both directions
     * @param defining {Boolean} indicates whether this is a relationship is part of the concept logical definition
     * @param created {Date} the created date
     * @param local {Boolean} indicates whether this data element was created by local editing
     * @param modifiedBy {String} the identifier of the user who made the last modification
     * @param modified {Date} the last modified date
     * @param id {String} the unique identifier
     * @param active {Boolean} indicates whether or not this data element is active
     * @param terminology {String} the terminology abbreviation
     */
    constructor(hierarchical, type, assertedDirection, defining, created, local, modifiedBy, modified, id, active, terminology) { 
        
        ConceptRelationship.initialize(this, hierarchical, type, assertedDirection, defining, created, local, modifiedBy, modified, id, active, terminology);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, hierarchical, type, assertedDirection, defining, created, local, modifiedBy, modified, id, active, terminology) { 
        obj['hierarchical'] = hierarchical;
        obj['type'] = type;
        obj['assertedDirection'] = assertedDirection;
        obj['defining'] = defining;
        obj['created'] = created;
        obj['local'] = local;
        obj['modifiedBy'] = modifiedBy;
        obj['modified'] = modified;
        obj['id'] = id;
        obj['active'] = active;
        obj['terminology'] = terminology;
    }

    /**
     * Constructs a <code>ConceptRelationship</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConceptRelationship} obj Optional instance to populate.
     * @return {module:model/ConceptRelationship} The populated <code>ConceptRelationship</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConceptRelationship();

            if (data.hasOwnProperty('hierarchical')) {
                obj['hierarchical'] = ApiClient.convertToType(data['hierarchical'], 'Boolean');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('group')) {
                obj['group'] = ApiClient.convertToType(data['group'], 'String');
            }
            if (data.hasOwnProperty('assertedDirection')) {
                obj['assertedDirection'] = ApiClient.convertToType(data['assertedDirection'], 'Boolean');
            }
            if (data.hasOwnProperty('additionalType')) {
                obj['additionalType'] = ApiClient.convertToType(data['additionalType'], 'String');
            }
            if (data.hasOwnProperty('defining')) {
                obj['defining'] = ApiClient.convertToType(data['defining'], 'Boolean');
            }
            if (data.hasOwnProperty('toTerminology')) {
                obj['toTerminology'] = ApiClient.convertToType(data['toTerminology'], 'String');
            }
            if (data.hasOwnProperty('toCode')) {
                obj['toCode'] = ApiClient.convertToType(data['toCode'], 'String');
            }
            if (data.hasOwnProperty('toValue')) {
                obj['toValue'] = ApiClient.convertToType(data['toValue'], 'String');
            }
            if (data.hasOwnProperty('toName')) {
                obj['toName'] = ApiClient.convertToType(data['toName'], 'String');
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
            if (data.hasOwnProperty('terminologyId')) {
                obj['terminologyId'] = ApiClient.convertToType(data['terminologyId'], 'String');
            }
            if (data.hasOwnProperty('terminology')) {
                obj['terminology'] = ApiClient.convertToType(data['terminology'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ConceptRelationship</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ConceptRelationship</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ConceptRelationship.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['group'] && !(typeof data['group'] === 'string' || data['group'] instanceof String)) {
            throw new Error("Expected the field `group` to be a primitive type in the JSON string but got " + data['group']);
        }
        // ensure the json data is a string
        if (data['additionalType'] && !(typeof data['additionalType'] === 'string' || data['additionalType'] instanceof String)) {
            throw new Error("Expected the field `additionalType` to be a primitive type in the JSON string but got " + data['additionalType']);
        }
        // ensure the json data is a string
        if (data['toTerminology'] && !(typeof data['toTerminology'] === 'string' || data['toTerminology'] instanceof String)) {
            throw new Error("Expected the field `toTerminology` to be a primitive type in the JSON string but got " + data['toTerminology']);
        }
        // ensure the json data is a string
        if (data['toCode'] && !(typeof data['toCode'] === 'string' || data['toCode'] instanceof String)) {
            throw new Error("Expected the field `toCode` to be a primitive type in the JSON string but got " + data['toCode']);
        }
        // ensure the json data is a string
        if (data['toValue'] && !(typeof data['toValue'] === 'string' || data['toValue'] instanceof String)) {
            throw new Error("Expected the field `toValue` to be a primitive type in the JSON string but got " + data['toValue']);
        }
        // ensure the json data is a string
        if (data['toName'] && !(typeof data['toName'] === 'string' || data['toName'] instanceof String)) {
            throw new Error("Expected the field `toName` to be a primitive type in the JSON string but got " + data['toName']);
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

ConceptRelationship.RequiredProperties = ["hierarchical", "type", "assertedDirection", "defining", "created", "local", "modifiedBy", "modified", "id", "active", "terminology"];

/**
 * indicates whether this relationship is part of the hierarchy
 * @member {Boolean} hierarchical
 */
ConceptRelationship.prototype['hierarchical'] = undefined;

/**
 * the high level type of relationship (more information about this label is provided in the terminology metadata)
 * @member {String} type
 */
ConceptRelationship.prototype['type'] = undefined;

/**
 * used by terminologies that group relationships (e.g. SNOMEDCT) to indicate the group value
 * @member {String} group
 */
ConceptRelationship.prototype['group'] = undefined;

/**
 * indicates whether this relationship is in the direction asserted by the terminology. This is meaninful because in some instances relationships are loaded in both directions
 * @member {Boolean} assertedDirection
 */
ConceptRelationship.prototype['assertedDirection'] = undefined;

/**
 * the more specific type of relationship (more information about this label is provided in the terminology metadata)
 * @member {String} additionalType
 */
ConceptRelationship.prototype['additionalType'] = undefined;

/**
 * indicates whether this is a relationship is part of the concept logical definition
 * @member {Boolean} defining
 */
ConceptRelationship.prototype['defining'] = undefined;

/**
 * the terminology of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'
 * @member {String} toTerminology
 */
ConceptRelationship.prototype['toTerminology'] = undefined;

/**
 * the code of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'
 * @member {String} toCode
 */
ConceptRelationship.prototype['toCode'] = undefined;

/**
 * the literal value relationship is to (the right-hand side). If this is null, the relationship will have a 'to'
 * @member {String} toValue
 */
ConceptRelationship.prototype['toValue'] = undefined;

/**
 * the name of the concept this relationship is to (the right-hand side). If this is not used, the relationship will have a 'toValue'
 * @member {String} toName
 */
ConceptRelationship.prototype['toName'] = undefined;

/**
 * the created date
 * @member {Date} created
 */
ConceptRelationship.prototype['created'] = undefined;

/**
 * indicates whether this data element was created by local editing
 * @member {Boolean} local
 */
ConceptRelationship.prototype['local'] = undefined;

/**
 * the identifier of the user who made the last modification
 * @member {String} modifiedBy
 */
ConceptRelationship.prototype['modifiedBy'] = undefined;

/**
 * the last modified date
 * @member {Date} modified
 */
ConceptRelationship.prototype['modified'] = undefined;

/**
 * the unique identifier
 * @member {String} id
 */
ConceptRelationship.prototype['id'] = undefined;

/**
 * indicates whether or not this data element is active
 * @member {Boolean} active
 */
ConceptRelationship.prototype['active'] = undefined;

/**
 * the identifier asserted by the terminology
 * @member {String} terminologyId
 */
ConceptRelationship.prototype['terminologyId'] = undefined;

/**
 * the terminology abbreviation
 * @member {String} terminology
 */
ConceptRelationship.prototype['terminology'] = undefined;






export default ConceptRelationship;

