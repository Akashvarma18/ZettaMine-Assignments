<%@ page import="com.zettamine.bank.dto.Admin"%>
<!DOCTYPE html>
<html>
<head>

 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/ac42c3b1f7.js" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/ac42c3b1f7.js" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Zetta Bank</title>
<link type="text/css" rel="stylesheet" href="css/admin.css" />
<script src="https://kit.fontawesome.com/c323173fb6.js"
	crossorigin="anonymous"></script>

</head>
<body>


    <nav class="navbar navbar-expand-lg bg-dark navbar-danger">
  <a class="navbar-brand" href="#">ZETTA BANK</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav m-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logout">Logout</a>
      </li>
      
    </ul>
  </div>
</nav>











	<%
	HttpSession currentSession = request.getSession(false);
	if (currentSession != null && currentSession.getAttribute("userType") != null) {
		if (!"A".equals(currentSession.getAttribute("userType"))) {
			response.sendRedirect(request.getContextPath() + "/unauthorized.jsp");
			return;
		}
	} else {
		response.sendRedirect(request.getContextPath() + "/unauthorized.jsp");
		return;
	}
	%>
	<%
	Admin admin = (Admin) session.getAttribute("userData");
	//out.print(admin);
	%>
    <div id="welcome" >
    
    <div>WELCOME TO ADMIN PAGE</div>
    </div>
    <div class="d-flex flex-row justify-content-center">
	  <div id="admin-div">
		<table>
			<tr class="tb-row">
				<td>ADMIN ID</td>
				<td>:</td>
				<td><%=admin.getAdminId()%></td>
			</tr>
			<tr class="tb-row">
				<td>ADMIN NAME</td>
				<td>:</td>
				<td><%=admin.getAdminName()%></td>
			</tr>

			<tr class="tb-row">
				<td>ADMIN Email</td>
				<td>:</td>
				<td><%=admin.getEmail()%></td>
			</tr>
		 </table>
	    </div>
	    
	    <div class="icon">
	    
	         <div class="image">
	         
	         <img class= "admin-image "src="https://res.cloudinary.com/drgd7mvem/image/upload/v1704282573/rrtkjo0xouhniw0btnr3.png">
	         
	         
	         </div>
	    
	    
	    </div>
	    
	    
	    
	    
	    
	  </div>
	<div class="btn-div">
		<div class="button">
			<a href="createAccount.jsp">create account</a>
		</div>
		<div class="button">
			<a href="withdraw.jsp">Withdraw</a>
		</div>

		<div class="button">
			<a href="deposit.jsp">Deposit</a>
		</div>

		<div class="button">
			<a href="transfer.jsp">Transfer</a>
		</div>
		<div class="button">
			<a href="searchCustomer.jsp">Search Customer</a>
		</div>
		<div class="button">
			<a href="transactions.jsp">View Transactions</a>
		</div>
	</div>
	
	
</body>
</html>
                          
