/**
 * Main JavaScript File
 */

/*Turns JSON into String*/
//function formToJSON() {
//	return JSON.stringify({
//		"make": $('#make').val(),
//		"model": $('#model').val(),
//		"year": $('#year').val()
//	});
//}

var $table = $('#table');
var mydata = "";

jQuery.ajax({
            url: "rest/test/get",
            type: "GET",

            contentType: 'application/json; charset=utf-8',
            success: function(resultData) {
                /**resultData is the JSON**/
            	/**Commented code is if you want to view the raw JSON file**/
            	/**document.getElementById("json").innerHTML = JSON.stringify(resultData);**/
            	mydata = resultData;

            },
            error : function(jqXHR, textStatus, errorThrown) {
            },

            timeout: 120000,
        });

$(function () {
    $('#table').bootstrapTable({url: "rest/test/get"});
});