function searchItem() {
  var input, filter, table, tr, td, i, txtValue,show,ginti=0;
  input = document.getElementById("searchName");
  filter = input.value.toUpperCase();
  table = document.getElementById("itemTable");
  tr = table.getElementsByTagName("tr");
show=document.getElementById("noRecordTR");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
		
      } else {
      			 tr[i].style.display = "none";
					ginti++;
				if(ginti==tr.length-1)
		       	tr[0].innerHTML = "<h2 align='center' style='color:black;'>Product not found!</h2>";
		       
      }
    }
  }
	if(input.value=="")
		window.location="index.jsp";
  }
  


