let myHeader = document.getElementById('myHeading');
let mySubtitle = document.getElementsByTagName('h2')[0];

myHeader.innerHTML = 'Labas Vakaras';
myHeader.classList.add('red', 'blue');
console.log(mySubtitle.innerText);
console.log(myHeader.classList.contains('red'));

myHeader.classList.replace('blue', 'yellow');
console.log(myHeader.classList);
myHeader.classList.remove('yellow');
console.log(myHeader.classList);

setTimeout( () => myHeader.classList.add('green'), 1000);
setTimeout( function() {
    myHeader.classList.add('yellow');
}, 1000);

setInterval( function() {
    if (myHeader.classList.contains('red')) {
        myHeader.classList.replace('red','green');
    } else {
        myHeader.classList.replace('green','red');
    }
}, 100);


setInterval( function() {
    if (document.body.style.backgroundColor == 'yellow') {
        document.body.style.backgroundColor = 'purple';
    } else {
        document.body.style.backgroundColor = 'yellow';
    }
}, 200);

// document.body.onload = addElement;

// function addElement() {
//     var newDiv = document.createElement('div');
//     var newContent = document.createTextNode('hi there');
//     newDiv.appendChild(newContent);
//     var currentDiv = document.getElementById('div1');
//     document.body.insertBefore(newDiv, currentDiv);
// }

function changeTextColor( id, color1, color2 , delay) {
    var element = document.getElementById( id );
    element.style.color = color1;
    var innerFunction = setInterval( function() {
        if ( element.style.color == color1 ) {
            element.style.color = color2 ;
        } else {
            element.style.color = color1;
        }
    }, delay);
}

changeTextColor( 'myParagraph', 'red', 'blue', 200);
changeTextColor( 'myHeading', 'green', 'yellow', 100);
changeTextColor( 'mySubheading1', 'blue', 'purple', 1000);
changeTextColor( 'mySubheading2', 'black', 'brown', 50);



let colors = ['red','blue','green'];
let target = document.getElementById('div1');

let i = 0;
let myBtn = document
    .getElementById('meClick')
    .addEventListener('click', function() {
        if ( i > colors.length - 1 ) {
            i = 0;
        }
        target.style.backgroundColor = colors[i++];
    });