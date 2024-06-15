let gameSeq=[];
let userSeq=[];
let btns = ["yellow", "red", "purple","green"];

let started=false;
let level=0;
let highScore=0;

let h2=document.querySelector("h2");

document.addEventListener("keypress", function(){
    if(started==false){
        console.log("game is started");
        started = true;

        levelUp();
    }
});

function btnFlash(btn){
    btn.classList.add("flash");
    setTimeout(function(){
        btn.classList.remove("flash");
    }, 200);
}
function userFlash(btn){
    btn.classList.add("userFlash");
    setTimeout(function(){
        btn.classList.remove("userFlash");
    }, 300);
}

function levelUp(){
    userSeq=[];
    level++;
    h2.innerText=`Level ${level}`;
     
    let randInx = Math.floor(Math.random() * 4);
    let randCol = btns[randInx];
    let randBtn = document.querySelector(`.${randCol}`);
    console.log(randBtn);
    console.log(randCol);
    console.log(randInx);
    gameSeq.push(randCol);
    btnFlash(randBtn);
}
// function checkAns(idx){
//     console.log("current level", level);

//    //let idx = level-1;

//     if (userSeq[idx]===gameSeq[idx]){
//         if(userSeq.length==gameSeq.length){
//            setTimeout(levelUp, 1000);
//             // levelUp();
//         }
//        // console.log("same value");
//     } else {
//         h2.innerHTML=`Game over! Your Score was <b> ${level} </b> <br> Press any key to start.`;
//         document.querySelector("body").style.backgroundColor="red";
//         setTimeout(function(){
//             document.querySelector("body").style.backgroundColor="white";
//         }, 150);
//         reset();

//     }
// }
function checkAns(idx) {
    console.log("current level", level);

    if (userSeq[idx] === gameSeq[idx]) {
        if (userSeq.length === gameSeq.length) {
            setTimeout(levelUp, 1000);
        }
    } else {
        if (level > highScore) {
            highScore = level; // Update high score
        }
        h2.innerHTML = `Game over! Your Score was <b>${level}</b> <br> High Score: <b>${highScore}</b> <br> Press any key to start.`;
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout(function () {
            document.querySelector("body").style.backgroundColor = "white";
        }, 500); // Increased the timeout for visibility
        reset();
    }
}


function btnPress(){
    console.log(this);
    let btn = this;
    userFlash(btn);

    userColor=btn.getAttribute("id");
    userSeq.push(userColor);

    checkAns(userSeq.length-1);

}

let allbtns= document.querySelectorAll(".btn");
for( let btn of allbtns){
    btn.addEventListener("click", btnPress);
}
function reset(){
    started=false;
    gameSeq=[];
    userSeq=[];
    level=0;

}
