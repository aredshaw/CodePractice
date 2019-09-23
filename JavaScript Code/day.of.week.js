function time(){
    var d = new Date();
    //alert("today's date is " + d + ".");
    var day = d.getDay();
    var date = d.getDate();

    if(day == 1){
        alert("Today is Monday.");
    }
    else if(day == 2){
        alert("Today is Tuesday.");
    }
        else if(day == 3){
        alert("Today is Wednesday.");
    }
        else if(day == 4){
        alert("Today is Thursday.");
    }
        else if(day == 5){
        alert("Today is Friday.");
    }
        else if(day == 6){
        alert("Today is Saturday.");
    }
        else if(day == 7){
        alert("Today is Sunday.");
    }
}

time();