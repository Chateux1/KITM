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

$('#button').on('click', function() {
    let inputName = $('#username').val();
    let inputPassword = $('#psw').val();
    
    $.post({
        url: apiUrlOnlyPost,
        contentType: 'application/json',
        data: JSON.stringify(
            {   username: inputName,
                password: inputPassword
            }),
        success: function(response) {
            if ( response.isSuccessStatusCode == true ) {
                alert('Login succesful');
            } else if ( response.isSuccessStatusCode == false ) {
                alert('Problemyte!!!')
            }
        }
    })
});

myGetFunction();

