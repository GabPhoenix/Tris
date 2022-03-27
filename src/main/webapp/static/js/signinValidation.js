// get message layer
var btn = document.querySelector('#signin');
var message = document.querySelector('.message');
var text = message.querySelector('.text');
var closeButton = message.querySelector('.button');

var err = false;

btn.addEventListener("click", function(e){
    e.preventDefault();
    let us_name = signinForm.username.value;
    let password = signinForm.user_password.value;
    let email = signinForm.email.value;
    let group = signinForm.group.value;

    // default values
    if(us_name == "" || password == "" || email == "" || group == ""){
        err == false ? message.classList.toggle("error") : "";
        text.innerHTML = "All files are required!";
        err = true;
        return false;
    }
    //invalid email
    else if(email.search("@") == -1 || email.search(".") == -1){
        err == false ? message.classList.toggle("error") : "";
        text.innerHTML = "Please, inform a valid email!";
        err = true;
        return false;
    }
    // success
    else{
        err == true ? message.classList.toggle("error") : "";
        message.classList.toggle("success");
        text.innerHTML = "Signin realized! you will be redirected now..."
        err = false;
        setTimeout(function(){
            signinForm.submit();
        }, 3000);
    }
});

