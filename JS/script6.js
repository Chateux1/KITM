// var xhttp = new XMLHttpRequest();

// xhttp.open('GET', 'https://api.apitore.com/api/9', true);
// xhttp.send();
// xhttp.response;

// rest api
// jquery

var deleteButton = "<button class='delete-btn'> delete</button>";

$(document).ready(

    function() {

        $('.button').on('click', function() {

            var input = $('.input');
            if ( input.val() != '' ) {
                $('.list').append('<li>' + input.val() + deleteButton + '</li>');
                input.val('');

            }
        });

        $(document).on('click', '.delete-btn', function() {
            $(this).parent().remove();
        });
    }
)