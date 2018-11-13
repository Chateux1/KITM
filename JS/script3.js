function printLine() {
	console.log("--------------------------------------------------");
}

function myObj(id) {
	this.id = id;
	this.name = 'Aurimas';
};
let newObj = new myObj(123);
console.log(newObj.name);
printLine();

let newObj1 = { name: 'John', age: 30, car: null};
console.log(newObj1);
console.log(JSON.stringify(newObj1));

printLine();
let str = '{ "name": "John", "age": 30, "car": null}'
let othr = JSON.parse(str);
console.log(othr);

printLine();
let newObj2 = { 
	name: 'John', 
	age: 30, 
	car: { make: 'MB', year: 2018}
};
for (const key in newObj2) {
	console.log(newObj2[key]);
}

printLine();
class Vehicle {
	constructor ( id, color ) {
		this.id = id;
		this.color = color;
	}
}
class Car extends Vehicle {
	constructor( id, color, make, fuel, year ) {
		super( id, color);
		this.make = make;
		this.fuel = fuel;
		this.year = year;
	}
}
let myOpel = new Car ( 1, 'green', 'Opel', 'diesel', '2000');
console.log( myOpel );

printLine();
class Person {
	constructor ( firstName, lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = function() {
			return this.firstName + " " + this.lastName;
		};
	}
}
let myPerson1 = new Person ( 'Paulius', 'Paulauskas');
console.log(myPerson1.fullName());

printLine();
function myPersonFunction( firstName, lastName, age ) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}
myPersonFunction.prototype.fullName = function( prefix ) {
	return `${prefix} ${this.firstName} ${this.lastName}`;
};
let myPerson2 = new myPersonFunction( 'Jonas', 'Jonaitis', 25);
let myPerson3 = new myPersonFunction( 'Petras', 'Petraitis', 30)
console.log(myPerson2.fullName(''));
console.log(myPerson3.fullName(15));

printLine();
let myStr = "Martynas";
String.prototype.hello = function() {
	return 'Hello ' + this + '!';
}
console.log(myStr.hello());

printLine();
'use strict';
let x = 3;

console.log(Math.PI);
console.log(Math.round(3.14));
console.log(Math.random());

var d = new Date();
console.log(d.getDay());
console.log(d.getHours());
console.log(d.toString());

let day = d.getDate();
let month = d.getMonth();
let year = d.getFullYear();

function formatDate( date ) {
	var d = new Date(date),
		month = '' + (d.getMonth() + 1 ),
		day = '' + d.getDate(),
		year = d.getFullYear();

	if ( month.length < 2 ) month = '0' + month;
	if ( day.length < 2 ) day = '0' + day;

	return [year, month, day].join('-');
}

console.log(formatDate(d));