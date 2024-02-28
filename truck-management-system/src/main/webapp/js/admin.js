function validate()
{
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    if(username=="Admin" && password=="1234")
    {
        alert("login succesful")
        return false;
    }
    else{
        alert("incorrect credentials")
    }
}


