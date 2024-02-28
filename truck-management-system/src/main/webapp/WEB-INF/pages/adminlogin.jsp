<!DOCTYPE html>
<html>
<head>

<title>Admin Login</title>
<link rel="stylesheet" href="css/stylenew.css">
<script src="js/admin.js"></script>
</head>

<body>
	<form class="login-form" action="alogin" method="POST">
		<h1>Admin</h1>

		<input type="text" name="username" placeholder="Enter Username"
			id="username" /> <input type="password" name="Password"
			placeholder="Enter Password" id="password" />

		<button type="submit">LOGIN</button>
		<div class="home">
			<a href="home">
				<button type="button">
					<span></span>Home Page
				</button>
		</div>

	</form>

	<div>
		<p style="color: red">${msg}
	</div>
</body>
</html>