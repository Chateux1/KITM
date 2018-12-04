let urlGet = "http://kitmjavascript.azurewebsites.net/api/studentai";
let urlPost = "http://kitmjavascript.azurewebsites.net/api/login";
let input = document.getElementsByClassName("input")[0];
let output = document.getElementsByClassName("output")[0];

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
        // alert("Success!!!");
      } else if (response.isSuccessStatusCode == false) {
        alert("Error :(");
      }
    }
  });
});

function setHeaderRow() {
  let headerLabels = [
    "name",
    "age",
    "picture",
    "balance",
    "tags",
    "registered",
    "favoriteFruit"
  ];
  let headerString = "<tr>";
  headerLabels.forEach(element => {
    headerString += "<th>" + element + "</th>";
  });
  headerString += "</tr>";
  return headerString;
}
function setEmptyTable() {
  let table = "<table class='table'></table>";
  let headers = setHeaderRow();
  //   alert(headers);

  $(".output").append(table);
  $(".table").append(headers);
}

setEmptyTable();
