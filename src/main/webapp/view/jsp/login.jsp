<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

	<head>
		<title>MVC</title>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    	<link rel="stylesheet"
                  href="/webjars/bootstrap/4.4.1-1//css/bootstrap.min.css" />
	</head>

	<body>
        <div class="container"><br/>
            <div class="alert alert-success">
                <strong>Success!</strong> It is working as we expected.
            </div>
        </div>
        <font color="red">${errorMessage}</font>
		<form method = "POST">
		    User: <input type = "text" placeholder = "user" name="user"/>
            Password: <input type = "password" placeholder = "password" name="password"/>
            <input type = "submit" value="Submit"/>
		</form>

	</body>
	<script src="/webjars/jquery/3.4.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</html>