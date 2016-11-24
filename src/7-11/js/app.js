/**
 * Created by JPMPC-B209 on 11/24/2016.
 */
var n = 5;
var x = 7;
var sum = n+x;
document.getElementById("result").innerHTML = "The result is " + (n+x);

var mySubmitBtn = document.getElementById("submitBtn");
mySubmitBtn.onclick = function(event) {
    event.preventDefault();
    mySubmitBtn.style.display = "none";
}


var myPlayBtn = document.getElementById("myVideo");

    if(myPlayBtn)
    function playVideo() {
        myPlayBtn.play();

    }

    function pauseVideo() {
        myPlayBtn.pause();

    }

    function stopVideo() {
        myPlayBtn.stop();

    }


