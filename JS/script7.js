let apiUrl = 'http://kitmjavascript.azurewebsites.net/api/studentai';
		
$.ajax({
    url: apiUrl,
    type: 'GET',
    crossDomain: true,
    success: function(response) {
        console.log(response)
    }
});