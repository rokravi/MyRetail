<%@page import="com.deloitte.myretail.entities.Inventory"%>
<%@page import="java.util.List"%>
<%@page import="com.deloitte.myretail.helper.FactoryProvider"%>
<%@page import="com.deloitte.myretail.dao.InventoryDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home/Landing Screen</title>
<%@include file="component/common_css.jsp" %>
<script type="text/javascript" src="js/script.js"></script>

<style>
body
{
	
	background-image:url("img/landing.jpg");
	background-repeat: no-repeat;
	background-position: center;
	height: 100%;
	background-size: cover;

}

.card
{
	position:center;
}


</style>

</head>
<body>
<div class="container mt-5 md-2">
<div class="card mt-5 ml-2" >
	<div class="card-body">
	<%@include file="component/message.jsp" %>
	<div class="card-title text-center">
	<p>
	<h2 style="background-color: #d1d1d3">Inventory List</h2>
	</p>
	</div>
	
	<form class="form mt-2" >
		<div class="form-row ml-2">
	  		<div class="form-group mb-2 col-1">
	   			 <label for="Name" class="col-form-label">Name</label>
	  		</div>
	 		 <div class="form-group mx-sm-3 mb-2 col-2">
	      			<input type="text" class="form-control" id="searchName" placeholder="search" name ="search" onkeyup="searchItem()" style="border-radius:20px">
	 		 </div>
	 		 <div class="col-1">
	 			 <button type="button" class="btn btn-outline-success float-right mb-2" id ="search" style="border-radius:20px">Search</button>
	 		 </div>
 		</div>
	</form>
	<br>
<table class="table table-dark table-striped table-hover" id = "itemTable">
  <thead>
    <tr>
      <th scope="col">Code</th>
      <th scope="col">Name</th>
      <th scope="col">Qty</th>
      <th scope="col">Unit Price(&#8377;)</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <%
  InventoryDao idao = new InventoryDao(FactoryProvider.getFactory());
	List<Inventory> ilist = idao.getItem();
  
	if(ilist.size()==0)
	{
	%>
	<td colspan="5" align="center"><h2 style="color:black;">No Records In Database</h2></td>
		
	<%
		}	
	else
		{
	  	for (Inventory iv: ilist)
	  {
  
  %>
    <tr>
      <th scope="row"><%= iv.getCode() %></th>
      <td><%= iv.getName() %></td>
      <td><%= iv.getQuantity() %></td>
      <td><%= iv.getUnitPrice() %></td>
      <td><a href="edit.jsp?id=<%= iv.getCode()%>" onclick = "getCode('id');" >Edit</a></td>
      
      <!-- <td><a href="edit.jsp">Edit</a></td> -->
    </tr>
    
    <% 
    }
	}
  	%>
 
  </tbody>
</table>
<div class="float-right mr-5" >
	 <a href="add.jsp"><button type="submit" class="btn btn-secondary  mb-3">Add</button></a>
	 
</div>
</div>

</div>
 </div>
</body>
</html>