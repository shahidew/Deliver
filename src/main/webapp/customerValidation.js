function isValid(){
    var name = document.forms["myForm"]["fname"].value;
    var family = document.forms["myForm"]["lname"].value;
    var email = document.forms["myForm"]["email"].value;
    var phone = document.forms["myForm"]["phone"].value;
    var address = document.forms["myForm"]["address"].value;
    var postal = document.forms["myForm"]["postal"].value;
    var user = document.forms["myForm"]["user"].value;
    var pass = document.forms["myForm"]["pass"].value;

    if(name == "" || validateName(name)){
        alert("Please enter your name.");
        return false;
    }else if(family == "" || validateFamily(family)){
        alert("Please enter your family.");
        return false;
    }else if(email == "" || validateEmail(email)){
        alert("Please enter a valid e-mail address.");
        return false;
    }else if(phone == "" || validatePhone(phone)){
        alert("Please enter your telephone number.");
        return false;
    }else if(address == ""){
        alert("Please enter your address.");
        return false;
    }else if(postal == "" || validatePostal(postal)){
        alert("Please enter your postal code.");
        return false;
    }else if(user == "" || validateUser(user)){
        alert("Please enter your user name.");
        return false;
    }else if(pass == "" || checkPassword(pass)){
        alert("Please enter your password.");
        return false;
    }
    return true;
}

function validateName(name){
    var regex = /^[a-z0-9_-]{3,16}$/;
    if(!regex.test(name)){
        alert('Enter a correct first name:');
    }
}

function validateFamily(family){
    var regex = /^[a-z0-9_-]{3,16}$/;
    if(!regex.test(family)){
        alert('Enter a correct last name:');
    }
}

function validateEmail(email) {
    const regex = /\S+@\S+\.\S+/g;
    if (!regex.test(email)) {
        alert('Enter a valid email:');
    }
}

function validatePhone(phone) {
    const regex = /^\(?([0-9]{4})\)?[-. ]?([0-9]{4})[-. ]?([0-9]{3})$/;
    if (!regex.test(phone)) {
        alert('Enter a valid phone:')
    }
}

function validatePostal(postal) {
    const regex = /^\d{10}$/;
    if (!regex.test(postal)) {
        alert('Enter a valid postal code:');
    }
}

function validateUser(user) {
    const regex = /^[a-zA-Z0-9]+$/;
    if (!regex.test(user)) {
        alert('Enter a valid user name:');
    }
}

function checkPassword(pass)
{
    var decimal=  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
    if(!pass.value.match(decimal))
    {
        alert('Wrong...!');
    }
}