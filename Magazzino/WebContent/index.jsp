    <%@include file="header.jsp" %>
    <%@ page import="controller.ProdottiController" %>
    <%@ page import="database.ProdottiDAO" %>
        <%@ page import="model.Prodotto" %>
    
    
    <!-- Page Content -->
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h1 class="mt-5">A Bootstrap 4 Starter Template</h1>
          <p class="lead">Complete with pre-defined file paths and responsive navigation!</p>
          <ul class="list-unstyled">
            <li>Bootstrap 4.0.0</li>
            <li>jQuery 3.3.0</li>
          </ul>
        </div>
        <table class=" table table-striped">
        <%
        ProdottiController pc = new ProdottiController();
		System.out.println(pc.getElencoProdotti());
		ProdottiDAO prodottiDAO = new ProdottiDAO() ;
		 for(Prodotto p : prodottiDAO.getProdotti()) {
			 %>
		
			 <tr>
			 <td>
			 <%= p.getDescrizione	() %></td>
			  	 <td><%= p.getMarca() %></td>
			  	 <td> <%= p.getModello() %></td>
			    	 <td><%= p.getPrezzo() %></td>
			     </tr>
			 
		<%
		 }
		
		%>
			 
		 
			 
        
        
       
        
        </table>
      </div>
    </div>
    
   <%@include file="footer.jsp" %>