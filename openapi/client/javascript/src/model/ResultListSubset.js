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
import Subset from './Subset';

/**
 * The ResultListSubset model module.
 * @module model/ResultListSubset
 * @version 1.0.0
 */
class ResultListSubset {
    /**
     * Constructs a new <code>ResultListSubset</code>.
     * @alias module:model/ResultListSubset
     * @param total {Number} the total number of potential results
     * @param limit {Number} the max number results requested
     * @param offset {Number} the starting index requested
     * @param items {Array.<module:model/Subset>} the items themselves (the format will vary depending on the type of list)
     */
    constructor(total, limit, offset, items) { 
        
        ResultListSubset.initialize(this, total, limit, offset, items);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, total, limit, offset, items) { 
        obj['total'] = total;
        obj['limit'] = limit;
        obj['offset'] = offset;
        obj['items'] = items;
    }

    /**
     * Constructs a <code>ResultListSubset</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResultListSubset} obj Optional instance to populate.
     * @return {module:model/ResultListSubset} The populated <code>ResultListSubset</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResultListSubset();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
            if (data.hasOwnProperty('confidence')) {
                obj['confidence'] = ApiClient.convertToType(data['confidence'], 'Number');
            }
            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [Subset]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ResultListSubset</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ResultListSubset</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ResultListSubset.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['items']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['items'])) {
                throw new Error("Expected the field `items` to be an array in the JSON data but got " + data['items']);
            }
            // validate the optional field `items` (array)
            for (const item of data['items']) {
                Subset.validateJSON(item);
            };
        }

        return true;
    }


}

ResultListSubset.RequiredProperties = ["total", "limit", "offset", "items"];

/**
 * the total number of potential results
 * @member {Number} total
 */
ResultListSubset.prototype['total'] = undefined;

/**
 * the max number results requested
 * @member {Number} limit
 */
ResultListSubset.prototype['limit'] = undefined;

/**
 * the starting index requested
 * @member {Number} offset
 */
ResultListSubset.prototype['offset'] = undefined;

/**
 * the score of the search result, when used
 * @member {Number} confidence
 */
ResultListSubset.prototype['confidence'] = undefined;

/**
 * the items themselves (the format will vary depending on the type of list)
 * @member {Array.<module:model/Subset>} items
 */
ResultListSubset.prototype['items'] = undefined;






export default ResultListSubset;

