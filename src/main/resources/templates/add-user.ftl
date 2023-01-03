<#import "page.ftl" as common>
<@common.page>
    <form class="form-horizontal" action="/user/add", method="post">
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
</@common.page>