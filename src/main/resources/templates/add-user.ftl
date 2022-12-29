<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<div  class="container">
    <form class="form-horizontal" action="/add-user", method="post">
        <div class="form-group">
            <label for="inputName" class="col-sm-2 control-label">First Name: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" name="name" placeholder="First Name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputLastName" class="col-sm-2 control-label">Last Name:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputLastName" name="lastName" placeholder="Last Name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputBirthDate" class="col-sm-2 control-label">Birth Date:</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputBirthDate" name="birthDate" placeholder="yyyy-MM-dd">
            </div>
        </div>
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">Email:</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="inputEmail3" name="email" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="Password">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Sign up</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>