var car1 = "BMW";
var car2 = "Audi";
var car3 = "Volvo";

let myObject = {};
console.log(typeof myObject);

let myArray = [ 'Opel', 'Honda', car1, car2, car3 ];
console.log(typeof myArray);
console.log(myArray);

console.log( myArray[ 0 ] );
console.log( myArray[ myArray.length - 1 ] )

console.log( myArray.toString() );
myArray.forEach(item => console.log(item) );
console.log( myArray.join(' * ') );

console.log('---------------------------------------------------------------------------------');

let digitsArray = [ 'zero', 'one', 'two', 'three', 'four',
				'five', 'six', 'seven', 'eight', 'nine'];

digitsArray.push( 'ten' );
console.log( digitsArray.push( 'ten' ) );

digitsArray.pop();
console.log( digitsArray );

let element = digitsArray.shift();
console.log( element );
console.log( digitsArray );

digitsArray.unshift( 'zero' ); 
console.log( digitsArray );

digitsArray.splice( 2, 2 ); 
console.log( digitsArray );

digitsArray.splice( 1, 1, 'one', 'two', 'three' );
console.log( digitsArray );

digitsArray.forEach( item => {
	if ( digitsArray.indexOf( item ) % 2 == 0) {
		console.log(item);
	}
})

console.log(' ');

// let notAnArray;
// Array.of( notAnArray ).forEach();

let lettersArray = [ 'a', 'b', 'c', 'd', 'e', 'f' ];

console.log( lettersArray.reverse() );
console.log( lettersArray.sort() );

let generateName = function() {
	let vowelsArray = [ 'a', 'o', 'i', 'e', 'u' ];
	let consonantsArray = [ 'd', 't', 'l', 'm', 'v', 'n' ];
	let name = '';
	for (let i = 0; i < 2; i++) {
		name += consonantsArray[ Math.floor( Math.random() * consonantsArray.length)];
		name += vowelsArray [ Math.floor( Math.random() * vowelsArray.length)];
	}
	name += 's';
	return name;
}

let names = new Array;
for (let i = 0; i < 10; i++) {
	names.push(generateName());
}

console.log(names);

let numberArray = [10, 100, 34, 25];
console.log( numberArray.sort() );
console.log( numberArray.sort(( a, b ) => a - b ));

console.log( Math.min.apply(null, numberArray) );
console.log( numberArray.sort(( a, b ) => a - b )[0] );

console.log( Math.max.apply(null, numberArray) );
console.log( numberArray.sort(( a, b ) => b - a )[0] );

let mappedNumberArray = numberArray.map( item => {
	return item + 1;
});
console.log( mappedNumberArray );

console.log(
	numberArray.forEach( item => {
		return console.log( item + 1 );
	})
);
