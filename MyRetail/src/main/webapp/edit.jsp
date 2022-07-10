<%@page import="java.util.List"%>
<%@page import="com.deloitte.myretail.helper.FactoryProvider"%>
<%@page import="com.deloitte.myretail.dao.InventoryDao"%>
<%@page import="com.deloitte.myretail.entities.Inventory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Inventory</title>
<%@include file="component/common_css.jsp" %>


<script>

function getCode(code){

	let c = new URLSearchParams( window.location.search );
	return c.get(code)
	
	}



</script>
</head>
<style >
.custom-bg{
background-color:#d1d1d3;

}
body
{
	
	background-image:url("img/edit.jpg");
	background-repeat: no-repeat;
	background-position: center;
	/* height: 100%; */
	background-size: cover;

}

</style>
<body>
<%

String id = request.getParameter("id");
System.out.println(id);

InventoryDao idao = new InventoryDao(FactoryProvider.getFactory());
	List<Inventory> ilist = idao.getItem();


%>
<div class="container">
<div class="card mt-5">
<div class="card-body mt-3">
<div class="card-title mt-2 custom-bg text-center">
<h2>Edit Inventory</h2>
</div>
<form action="EditServlet" method="post">
  <input type="hidden" name="operation2" value="editInventory">
  <input type="hidden" name="name2" value="<%= idao.editInventory(id).getCode()%>">
  <div class="row mt-5">
           <div class="col-2">
              <label for="inventoryCode">Inventory code:</label>
            </div>
            <div class="col-3">
             <input type="text" class="form-control" id="inventoryCode" name ="code" value="<%= idao.editInventory(id).getCode()%>" readonly="readonly" >
             </div>
             <div class="col-2 offset-2">
             <label for="quantity">Quantity:</label>
             </div>
             <div class="col-3">
             <input type="number" class="form-control" id="quantity" name ="quantity" value="<%= idao.editInventory(id).getQuantity()%>" >
       </div>
   </div>
   
   <div class="row mt-3">   
     <div class="col-2">
       <label for="inventoryName">Inventory name:</label>
     </div>
     <div class="col-3">
      <input type="text" class="form-control" id="inventoryName" name = "name" disabled="disabled" value="<%= idao.editInventory(id).getName()%>" >
      </div>
      <div class="col-2 offset-2">
      <label for="unitPrice">Unit Price(&#8377;):</label>
      </div>
      <div class="col-3">
      <input type="number" class="form-control" id="unitPrice" name ="price" value="<%= idao.editInventory(id).getUnitPrice()%>">
       </div>
             
    </div>
    
    <div class="container text-right mt-4 ">
         <button type="submit" class="btn btn-secondary">Submit</button>
     </div>

</form>

  </div>
  </div>
</div>

</body>
</html>

