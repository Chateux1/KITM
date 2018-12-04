let urlGet = "http://kitmjavascript.azurewebsites.net/api/studentai";
let urlPost = "http://kitmjavascript.azurewebsites.net/api/login";
let input = document.getElementsByClassName("input")[0];

$(".input-button > button").on("click", function() {
  let inputName = $(".input-username > input").val();
  let inputPassword = $(".input-password > input").val();

  $.post({
    url: urlPost,
    contentType: "application/json",
    data: JSON.stringify({
      username: inputName,
      password: inputPassword
    }),

    success: function(response) {
      if (response.isSuccessStatusCode == true) {
        input.style.display = "none";
        alert("Success!!!");
      } else if (response.isSuccessStatusCode == false) {
        alert("Error :(");
      }
    }
  });
});
