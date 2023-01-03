<#import "page.ftl" as common>
<@common.page>
    <form class="form-horizontal" action="/bet/add", method="post">
        <div class="form-group">
            <label for="inputName" class="col-sm-2 control-label">Money: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control"
                       id="inputMoney" name="value"
                       placeholder="Bet value">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Add Bet</button>
            </div>
        </div>
    </form>
</@common.page>