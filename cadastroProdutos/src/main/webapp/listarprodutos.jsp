<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="entity.Produto"%>


<%
ArrayList<Produto> lp = (ArrayList<Produto>) request.getAttribute("lp");
%>



<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LISTAR PRODUTO</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>

<body>


	<div id="container" class="container">
		<div id="mensagens">${msg}</div>



		<form name="formulario" id="idform" method="get"
			action="listarprodutos">



			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Nome do Produto:</label> <input class="form-control"
						type="text" id="nome" name="nome" />
				</div>

			</div>

			<button class="btn btn-primary" type="submit" id="btnconsultar">Consultar</button>
			<button class="btn btn-default" type="reset" id="btnlimpar">Limpar</button>

		</form>

		<br /> <br />

		<table border="1" class="table table-striped">
			<thead class="bg-primary">

				<th>Codigo</th>
				<th>Nome</th>
				<th>A��es</th>

			</thead>

			<tbody>
			
				<%if (lp != null) {
					for (Produto produto : lp) {%>
				       <tr>

					      <td><%= produto.getCodigo() %></td>
					      <td><%= produto.getNome() %></td>
                          <td>
                           <img src="editar.png" style="float:left; margin:5px" width="40px"/>
                           <img src="delete.png" style="float:left; margin:5px" width="40px"/>
                          </td>
				      </tr>
				<%}
				
				}%>		

			</tbody>
		</table>
	</div>

</body>
</html>
