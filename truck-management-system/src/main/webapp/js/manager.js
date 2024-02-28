function validate()
{
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    if(username=="Manager" && password=="4321")
    {
        alert("login succesful")
        return false;
    }
    else{
        alert("incorrect credentials")
    }
}