let variable1 = "Part1";
let variable2 = "Part2"

console.log(variable1 + " " + variable2);

let x = 5.3;
let y = 5.1;

console.log(x + y);
console.log((x * 10 + y * 10) / 10);

y = '3';
console.log(x + parseInt(y));

console.log(pakeltiKvadratu(2))

function pakeltiKvadratu(x) {
	return x * x;
}

let myFunction = (x, y) => {
	return x + y;
};

console.log(myFunction(5, 8));

(function() {
	//alert();
})();

function test(x) {
	if (x === 10) {
		return;
	}
	console.log(x);
	x++;
	test(x);
};

test(1);

function arRytas() {
	
	//let laikas = window.prompt("koks laikas");
	let sistemosLaikas = new Date().getHours();

	if (sistemosLaikas < 12) {
		alert("Labas rytas");
	}
	else if (sistemosLaikas >= 12 && sistemosLaikas < 18) {
		alert("Laba diena");
	}
	else if (sistemosLaikas <= 24) {
		alert("Labas vakaras");
	}
	else {
		alert("Klaida: negalimas valandų skaičius");
	}
}

//arRytas();

function rodyti() {
	document.getElementById("heading1").style.color = "red";
	document.getElementById("heading1").style.fontSize = "200px";
}

rodyti();

var myVar = setInterval(setColor, 33);

function setColor() {
    var x = document.body;
    x.style.backgroundColor = x.style.backgroundColor == "yellow" ? "red" : "yellow";
}

function stopColor() {
    clearInterval(myVar);
}

setColor();


