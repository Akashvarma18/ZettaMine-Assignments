<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Zetta Bank</title>
    <link rel="icon" href="images/zettaBankLogo.png">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/ac42c3b1f7.js" crossorigin="anonymous"></script>
</head>

<body>

    <% String userType = request.getParameter("type"); %>
    <div class="bg d-flex flex-column justify-content-center">
        <div id="bgcard">
            <form action="login" method="post">
                <table>
                    <tr class="tablerows">
                        <td>Enter User id:</td>
                        <td><input type="text" name="user_id" required=required autofocus /></td>
                    </tr>
                    <tr class="tablerows">
                        <td>Enter Password:</td>
                        <td><input type="password" name="password" required=required /></td>
                    </tr>
                    <tr class="login">
                        <td colspan="2" class="text-center"><input type="submit" value="LOGIN" /></td>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="type" value=<%=userType %> /></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</body>

</html>
