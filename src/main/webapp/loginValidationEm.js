function isValid(){
    var user = document.forms["myForm"]["user"].value;
    var pass = document.forms["myForm"]["pass"].value;

    if(user == "" || validateUser(user)){
        alert("Please enter your user name.");
        return false;
    }else if(pass == "" || checkPassword(pass)){
        alert("Please enter your password.");
        return false;
    }
    return true;
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