function isValid(){
    var typeOfTransport = document.forms["Delivery"]["typeOfTransport"].value;
    var origin = document.forms["Delivery"]["origin"].value;
    var destination = document.forms["Delivery"]["destination"].value;
    var name = document.forms["Delivery"]["name"].value;
    var family = document.forms["Delivery"]["family"].value;
    var phone = document.forms["Delivery"]["phone"].value;
    var packageContent = document.forms["Delivery"]["packageContent"].value;
    var packageLength = document.forms["Delivery"]["packageLength"].value;
    var packageWidth = document.forms["Delivery"]["packageWidth"].value;
    var packageHeight = document.forms["Delivery"]["packageHeight"].value;
    var non_document = document.forms["Delivery"]["non_document"].value;
    var docu = document.forms["Delivery"]["document"].value;
    if(origin == ""){
        alert("Please enter your address.");
        return false;
    }else if(destination == ""){
        alert("Please enter receiver address.");
        return false;
    }
    else if(name == "" || validateName(name)){
        alert("Please enter receiver name.");
        return false;
    }else if(family == "" || validateFamily(family)){
        alert("Please enter receiver family.");
        return false;
    }else if(phone == "" || validatePhone(phone)){
        alert("Please enter receiver telephone number.");
        return false;
    }
    if(typeOfTransport == docu){
        if(packageContent == "" || validateContent(packageContent)){
            alert("Please enter your package's Content.");
            return false;
        }else if(packageLength == "" || validateNum(packageLength)){
            alert("Please enter your package's Length.");
            return false;
        }else if(packageWidth == "" || validateNum(packageWidth)){
            alert("Please enter your package's Width.");
            return false;
        }else if(packageHeight == "" || validateNum(packageHeight)){
            alert("Please enter your package's Height.");
            return false;
        }
    }
    else if(typeOfTransport == non_document){
        packageContent = null;
        packageWidth = null;
        packageHeight = null;
        packageLength = null;
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

function validateNum(Num) {
    const regex = /^\d$/;
    if (!regex.test(Num)) {
        alert('Enter a valid postal code:');
    }
}

function validateContent(user) {
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











var weight = document.getElementById("weight").value;
function setPriceByPremium(weight){
    var price = (parseInt(weight) * 20_000);
    document.getElementById("Premium").innerHTML = "Price is :" + price;
}

function setPriceByGold(weight){
    var price = parseInt(weight) * 14_000;
    document.getElementById("Gold").innerHTML = "Price is :" + price;
}

function setPriceBySilver(weight){
    var price = parseInt(weight) * 10_000;
    document.getElementById("Silver").innerHTML = "Price is :" + price;
}