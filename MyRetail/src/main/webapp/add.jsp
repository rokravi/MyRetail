<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Inventory</title>

<%@include file="component/common_css.jsp" %>


</head>
<style >
.custom-bg{
background-color:#d1d1d3;
}

body
{
	
	background-image:url("img/add.jpg");
	background-repeat: no-repeat;
	background-position: center;
	/* height: 100%; */
	background-size: cover;

}
a{
	text-decoration:none;
}

</style>
<body>
<form action="AddInventoryServlet" method="post">
  <input type="hidden" name="operation" value="addInventory">
<div class="container">
<div class="card mt-5">
<div class="card-body mt-3">
<%@include file="component/message.jsp" %>
<div class="card-title mt-2 custom-bg text-center">
<h2>Add Inventory</h2>
</div>
  <div class="row mt-5">
           <div class="col-2">
              <label for="inventoryCode">Inventory code:</label>
            </div>
            <div class="col-3">
             <input type="text" class="form-control" id="inventoryCode" name="code" required="required">
             </div>
             <div class="col-2 offset-2">
             <label for="quantity">Quantity:</label>
             </div>
             <div class="col-3">
             <input type="number" class="form-control" id="quantity" name="quantity" required="required">
       </div>
   </div>
   
   <div class="row mt-3">   
     <div class="col-2">
       <label for="inventoryName">Inventory name:</label>
     </div>
     <div class="col-3">
      <input type="text" class="form-control" id="inventoryName" name="name" required="required">
      </div>
      <div class="col-2 offset-2">
      <label for="unitPrice">Unit Price(&#8377;):</label>
      </div>
      <div class="col-3">
      <input type="number" class="form-control" id="unitPrice" name="price" required="required">
       </div>
             
    </div>
    
    <div class="container text-right mt-4 ">
         <button type="reset" class="btn btn-secondary">Clear</button>
        <button type="submit" class="btn btn-secondary" >Submit</button>
     </div>


  </div>
  </div>
</div>
</form>
</body>
</html>

