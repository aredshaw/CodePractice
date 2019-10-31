function time(){
    var d = new Date();
    //alert("today's date is " + d + ".");
    var month = d.getMonth();
    var date = d.getDate();
    
    
    if(month ==1){
        alert("It is January " + date + ".");
    }
    else if(month ==2){
        alert("It is February " + date + ".");    
    }
    else if(month ==3){
        alert("It is March " + date + ".");    
    }
    else if(month ==4){
        alert("It is April " + date + ".");    
    }
    else if(month ==5){
        alert("It is May " + date + ".");    
    }
    else if(month ==6){
        alert("It is June " + date + ".");    
    }
    else if(month ==7){
        alert("It is July " + date + ".");    
    }
    else if(month ==8){
        alert("It is August " + date + ".");    
    }
    else if(month ==9){
        alert("It is September " + date + ".");    
    }
    else if(month ==10){
        alert("It is October " + date + ".");    
    }
    else if(month ==11){
        alert("It is November " + date + ".");    
    }
    else if(month ==12){
        alert("It is December " + date + ".");    
    }
}

time();