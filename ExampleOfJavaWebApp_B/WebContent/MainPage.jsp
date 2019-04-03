<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Quotation History</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css" />
<link href="css/appstyle.css" rel="stylesheet" />
</head>
<body>

<!-- Include Header.jsp -->
    <div id="header">
		<%@ include file="Header.jsp" %>
	</div>

<!-- START - Create Form for Record selection	 -->
<div class ="container">
<div class="well">
 	<div class="panel-group">
     <form action="${pageContext.request.contextPath}/main?action=formPost" method="post">
     <div class="panel-default">
     <div class="panel-body">
  		
  		<!-- OSA Code Textbox -->
  		<div class ="col-sm-3">
  			<label for="osa">OSA Code:</label>
  			<input class="form-control" type="text" id="osaCode" name="osaCode" value="${osaCode}">
  		</div>	
  		
  		<!-- Customer Code textbox -->
  		<div class ="col-sm-3">
  			<label for="cust">Customer Code:</label>
  		 	<input class="form-control" type="text" id="custCode" name="custCode" value="${custCode}">
  		</div> 	
  		
  		<!-- Global Account Name textbox -->
  		<div class ="col-sm-3">
  		  	<label for="gAccountName">Global Account Name:</label>
  		  	<input class="form-control" type="text" id="globalAccountName" name="globalAccountName" value="${globalAccountName}">
  		</div>
  	</div>
  	</div>
  	
  	<div class="panel-default">
  	<div class="panel-body">	
  		<!-- Submit Button -->
  		<div class ="col-sm-3">
  			<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span> Search</button>			
		</div>
  	</div>
  	</div>
    </form> 
   </div>
</div>
</div>
<!-- END - Create Form for Record selection	 -->

<!--  START - Table creation for QUOTATION HISTORY Information -->
<div id="wrap">
  <div class = " container table-responsive">
  <table id="datatable" class="datatable table-striped table-bordered table-hover" cellspacing="0" cellpadding="0" width="100%">
  <!-- <h3>QUOTATION HISTORY</h3> -->
  <thead>
  <tr>  
           <th rowspan = "2">Cust Code</th>
           <th rowspan = "2">Quote Type</th>
           <th rowspan = "2">Site</th>
           <th rowspan = "2">CPN</th>
           <th rowspan = "2">MPN</th>
           <th rowspan = "2">Pkg Code</th>
           <th rowspan = "2">OEM</th>
           <th rowspan = "2">EAU</th>
           <th colspan="2">Next Quarter Price</th>
           <th colspan="2">Current Quarter Price</th> 
           <th rowspan = "2">LT</th>
           <th rowspan = "2">SPQ</th>
           <th rowspan = "2">MOQ</th>
           <th rowspan = "2">NCNR</th>
           <th rowspan = "2">STD/NON STD</th>
           <th rowspan = "2">Price Effective Date</th>
           <th rowspan = "2">Price VALID Quarter</th>
           <th rowspan = "2">Comment by MES</th>  
           <th colspan = "2" class="sorting_asc_disabled sorting_desc_disabled"></th> 
             
  </tr>
  <tr>        
           <td><b>S/P</b></td><td><b>Currency</b></td>
           <td><b>S/P</b></td><td><b>Currency</b></td>    
           <th class="sorting_asc_disabled sorting_desc_disabled"></th>         
  </tr>
  </thead>
  
   <tbody>
        <c:forEach var="qt" items="${quoteHisArr}" varStatus="qtIndex">        
        <tr>
           <td>${qt.endCustomer }</td>
           <td>${qt.quoteType }</td>
           <td>${qt.siteCode}</td>
           <td>${qt.cpn }</td>
           <td>${qt.mpnNoPlus }</td>
           <td>${qt.packCode }</td>
           <td>${qt.endCustomer }</td>
	       <td>${qt.estimatedAnnualUsage }</td>
	       <td>${qt.quotePrice }</td>
	       <td>${qt.currency }</td>  
	       <td>${qt.quotePrice }</td>
	       <td>${qt.currency }</td> 
	       <td>${qt.leadtime }</td> 	
	       <td>${qt.salesOrderIncrement }</td>
	       <td>${qt.minimumOrderQty }</td>
	       <td>${qt.nonCancelResched }</td>
	       <td>${qt.mpnStdCustom }</td>
	       <td>${qt.effectiveFrom }</td>
	       <td>${qt.validPeriod }</td>
	       <td>${qt.internalCommentsLine}</td>
	       <td></td>
        </tr> 
        </c:forEach>
   </tbody>
  </table>
  </div>
 </div>   
<!--  END - Table creation for QUOTATION HISTORY Information -->

<!-- Java Script function for Pagination -->
<script type="text/javascript">

$(document).ready(function() {
	$('.datatable').dataTable({
		"sPaginationType": "bs_full"
	});	

	$('.datatable').each(function(){
		var datatable = $(this);
		// SEARCH - Add the placeholder for Search and Turn this into in-line form control
		var search_input = datatable.closest('.dataTables_wrapper').find('div[id$=_filter] input');
		search_input.attr('placeholder', 'Search');
		search_input.addClass('form-control input-sm');
		// LENGTH - Inline-Form control
		var length_sel = datatable.closest('.dataTables_wrapper').find('div[id$=_length] select');
		length_sel.addClass('form-control input-sm');

		var info = datatable.page.info();
		alert(info.page+1);
	});
});
 
</script>

</body>
</html>