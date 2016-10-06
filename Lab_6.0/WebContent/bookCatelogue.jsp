<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Map"%>
<%@page import="com.seed.beans.Product"%>
<%@page import="com.seed.util.ProductsRepository"%>
<%@page import="com.seed.util.ProductsRepositoryInMemoryImpl"%>
<%@page import="java.util.Set"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
		private Map<Integer, Product> productEntries;

		public void jspInit(){
			ProductsRepository repositoryRef;
			
//			- Load map of product entries from repository(ProductsRepositoryInMemoryImpl)
//			- and make this map available as member variable "productEntries"
			
			repositoryRef = new ProductsRepositoryInMemoryImpl();
			productEntries = repositoryRef.getProductEntries();
			System.out.println("productEntries "+ productEntries);
		}
%>

<form action="storeWishListDetails.jsp" method="post">
	<h1>Select books</h1>

<%-- Write a scriptlet to display product name and its id as checkboxes 
			from "productEntries" member variable--%>

<!-- 
	FOR EXAMPLE :----------
	
	<input type="checkbox" name="bookID" 
				value="<%-- it should be product id from repository--%>"
				/><%-- name of the product--%>
 -->
<%
		Set<Integer> ids = productEntries.keySet();

		for(int productID : ids){
			Product product = productEntries.get(productID);
			
%>
		<input type="checkbox" name="bookID" 
				value="<%=productID%>"
				/><%=product.getName()%><br/>
<%		
		}

%>

	<br/>
	<input type="submit" value="Add to Wish List & shop more?" name="addToList"/>
	<input type="submit" value="Check Out" name="checkout"/>
</form>

</body>
</html>