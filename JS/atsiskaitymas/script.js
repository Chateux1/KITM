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
        myGetFunction();
      } else if (response.isSuccessStatusCode == false) {
        alert("Error :(");
      }
    }
  });
});

function myGetFunction() {
  $.ajax({
    url: urlGet,
    type: "GET",
    crossDomain: true,
    success: function(response) {
      responseData = JSON.parse(response);
      setEmptyTable();
      $(".table tr + tr").remove();
      responseData.forEach(element => {
        if (element.isActive) {
          $(".table tr:last").after(
            "<tr><td>" +
              element.name +
              "</td><td>" +
              element.age +
              "</td><td class='picture'>" +
              "</td><td>" +
              element.balance +
              "</td><td>" +
              element.tags +
              "</td><td>" +
              element.registered +
              "</td><td>" +
              element.favoriteFruit +
              "</td></tr>"
          );
        }
      });
      setNewBalance();
      addNumeration();
    },
    error: function() {
      alert("Fail!");
    }
  });
}

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
  $(".output").append(table);
  $(".table").append(headers);
}

function setNewBalance() {
  var table = document.getElementsByClassName("table")[0];
  for (var i = 1, row; (row = table.rows[i]); i++) {
    let balanceString = row.cells[3].innerHTML;
    let balanceValue = balanceString.toString().replace(/[$,]+/g, "");
    let sumToAdd = 100;
    row.cells[3].innerHTML = JSON.parse(balanceValue) + sumToAdd;
  }
}

function addNumeration() {
  var table = document.getElementsByClassName("table")[0];
  for (var i = 0, row; (row = table.rows[i]); i++) {
    if (i == 0) {
      const numerationHeader = document.createElement("th");
      numerationHeader.innerText = "eiles nr.";
      table.rows[0].cells[0].before(numerationHeader);
    } else {
      const number = document.createElement("td");
      number.innerText = i;
      row.cells[0].before(number);
    }
  }

  //   console.log(table.rows[0].cells[0].before("<th>Eiles nr.</th>"));
}
