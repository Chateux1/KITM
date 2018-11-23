let apiUrl = 'http://kitmjavascript.azurewebsites.net/api/studentai';
let apiUrlOnlyPost = 'http://kitmjavascript.azurewebsites.net/api/login';
let myParagraph = $('#myParagraph');	


function myGetFunction() {
    $.ajax({
        url: apiUrl,
        type: 'GET',
        crossDomain: true,
        success: function(response) {
            responseData = JSON.parse(response);
            
            myParagraph.text(responseData[0].name);
            //console.log(responseData[0]);
        },
        error: function() {
            alert('Fail!');
        },
        complete: function() {
            // happens everytime whether there is an error or not from the server.
        }
    });
};

function myPostFunction() {
    $.ajax({
        url: apiUrlOnlyPost,
        type: 'POST',
        crossDomain: true,
    });
};

myGetFunction();


