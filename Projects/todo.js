let btn = document.querySelector("button");
let ul = document.querySelector("ul");
let inp = document.querySelector("input");

btn.addEventListener("click", function () {
    let item = document.createElement("li");
item.innerText = inp.value;

    let dltbtn = document.createElement("button");
    dltbtn.innerText="Delete";
    dltbtn.classList.add("delete");

    item.appendChild(dltbtn);
    ul.appendChild(item);
    inp.value = "";
});

ul.addEventListener("click", function(event){
    console.dir(event.target.nodeName=="BUTTON");
    let listItem=event.target.parentElement;
    listItem.remove();890

})

// let dltbts= document.querySelectorAll("delete");
// for(dltbtn of dltbts){
//     dltbtn.addEventListener("click", function(){
//         let par = this.parentElement;
//         console.log(par);
//         par.remove();
//     });
// }