const axios = require('axios');

/**
 * @function  [termSearch]
 * @returns {Json} restult
 */
const termSearch = (term) => {
    axios.get('http://localhost:8080/api/v1/search?term=' + encodeURI(term))
	.then(response => {
	    console.log(response.data);
	})
	.catch(error => {
	    console.log(error);
	});
}


/**
 * @function  [f1]
 */
const f1 = (param1) => {
    console.info('f1',param1);
}

/**
 * @function  [f2]
 */
const f2 = (param2, param3) => {
    console.info('f2',param2,param3);
}

// Export all methods
module.exports = { f1, f2 };
