<!DOCTYPE html>
<html>
    <head>
      
        <title>Admin Login</title>
        <link rel="stylesheet" href="css/stylenew.css">
        <script src ="js/manager.js"></script>
        </head>
        
        <body>
           <form class="login-form" action="ManagerLogin.html" method="POST">
               <h1>Manager</h1>
                   
                   <input type="text" name="user" placeholder="Enter Username" id="username">
                   
                   <input type="password" name="Password" placeholder="Enter Password" id="password">

                   <button type="submit" onclick="validate()">LOGIN</button>
                   <div class="home">
                    <a href="Main.html">
                     <button type="button"><span></span>Home Page</button>
                 </div>
                   
           </form>
        </body>
</html>