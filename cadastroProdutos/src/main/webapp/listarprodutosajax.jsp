<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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

<script>
	 $(function(){
		$("#headtabela").hide();
		$("#nome").keyup(function(){
			var nome = $("#nome").val();
			$.ajax({
				type:"GET",
				url:"listarprodutosajax",
				data:"nome="+nome,
				success:function(response) {
					$("#headtabela").show();
					$("#resultadoconsulta").html(response);
					$("#mensagens").html("");
				},
                error:function(response) {
                	$("#headtabela").hide();
					$("#resultadoconsulta").html("");
					$("#mensagens").html(response);
				}
			});
		});
	 });
	</script>


</head>

<body>


	<div id="container" class="container">
		<div id="mensagens"></div>



		<form name="meuform" id="meuform">



			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Nome do Produto:</label> <input class="form-control"
						type="text" id="nome" name="nome" />
				</div>

			</div>


			<button class="btn btn-default" type="reset" id="btnlimpar">Limpar</button>

		</form>

		<br /> <br />

		<table border="1" class="table table-striped">
			<thead class="bg-primary" id="headtabela">

				<th>Codigo</th>
				<th>Nome</th>
				<th>A��es</th>

			</thead>

			<tbody id="resultadoconsulta">


			</tbody>
		</table>
	</div>

</body>
</html>
