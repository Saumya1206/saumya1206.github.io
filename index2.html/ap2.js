// let btn = document.querySelector("button");
// let p = document.querySelector("p");
// let h1 = document.querySelector("h1");
// let h2 = document.querySelector("h3");

// btn.addEventListener("click", function(){
//     console.dir(this.innerText);
//     this.style.backgroundColor= "blue";
// });

// p.addEventListener("click", function(){
//     console.dir(this.innerText);
//     this.style.background="yellow";
// } );

// h1.addEvenetListener("click", function(){
//     console.dir(this.innertext);
//     this.style.background="green"
// });

//or we can just

// function changeColor(){
//     console.dir(this.innerText);
//     this.style.background="blue";
// }

// Btn.addEventListener("click", changeColor);
// p.addEventListener("click", changeColor );
// h1.addEventListener("click", changeColor);


//Text editor

let inp = document.querySelector("text");
let p = document.querySelector("p");

inp.addEventListener("input", function(){
    console.log(inp.value);
    p.innerText = inp.value;
});