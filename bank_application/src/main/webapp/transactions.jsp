<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zetta Bank</title>
</head>
<body>
<%
    HttpSession currentSession = request.getSession(false);
    if (currentSession == null || currentSession.getAttribute("userType") == null) {
    	response.sendRedirect(request.getContextPath() + "/unauthorized.jsp");
        return;
    }
%>

<h1>Transaction Details</h1>
<form action="adminController?action=transactions" method ="post">

	Enter Account Number to get transactions: <input type="text" name="accountNumber" onblur="validateAccountNumber(this.value)" required><br><br>
				<td> <span id="name"></span></td>
				Select from date:<input type="date" name="fromDate"><br>
				Select to date:<input type="date" name="toDate">
				
				 <input type="submit" value="Get Transactions">
</form>

	<script src="js/validate.js"></script>
</body>
</html>