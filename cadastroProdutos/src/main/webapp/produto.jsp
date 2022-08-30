<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CADASTRAR PRODUTO</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>		
</head>

<body>
    
    
    <div id="container" class="container">
        <form name="formulario" id="idform" method="post" action="incluirproduto">
			<fieldset>
				<legend>Dados do Produto</legend>

				<div class="form-row">
					<div class="form-group col-md-4">
						<label>Nome do Produto:</label>
						<input class="form-control" type="text" id="nome" name="nome"
						placeholder="M�nimo de 10 e m�ximo 100 caracteres." required  />
					</div>
					<div class="form-group col-md-4">
						<label>Categoria:</label>
						<select id="categoria" name="categoria" class="form-control" required>
							 <option value="">  </option>
							 <option value="1">Eletrodomestico</option>
							 <option value="2">Celular</option>
							 <option value="3">M�vel</option>
							 <option value="4">Outros</option>
						</select>
					</div>

					<div class="form-group col-md-4">
						<label>Vende em loja f�sica?:</label>
						<div class="form-check">
							<div class="form-check-inline">
								<input class="form-check-input" type="radio" name="lojafisica" id="opsim" value="S" />
								<label class="form-check-label" for="opsim">Sim</label>
							</div>
							<div class="form-check-inline">
								<input class="form-check-input" type="radio" name="lojafisica" id="opnao" value="N" />
								<label class="form-check-label" for="opnao">N�o</label>
							</div>
						</div>
					</div>
				</div>

				<div class="form-row">
					<div class="form-group col-md-4">
						<label>Quantidade:</label>
						<input class="form-control" type="number" placeholder="99999"
							   min="0" id="quantidade" name="quantidade" />
					</div>
					<div class="form-group col-md-4">
						<label>Pre�o:</label>
						<input class="form-control" type="text" pattern="[0-9]+([,][0-9]{2})?" placeholder="99999,99"
							   min="0" step="any" id="preco" name="preco" />
					</div>
					<div class="form-group col-md-4">
						<label>Data de Validade:</label>
						<input class="form-control" type="date" class="data" id="datavalidade" name="datavalidade" />
					</div>
				</div>

				<div class="form-row">
					<div class="form-group col-md-12">
						<label for="descricao">Descri��o:</label>
						<textarea class="form-control" id="descricao" name="descricao" rows="5"  
							placeholder="<Descreva detalhes do produto aqui>"></textarea>
					</div>
				</div>

				<button class="btn btn-primary" type="submit" id="btnenviar">Salvar</button>
				<button class="btn btn-default" type="reset" id="btnlimpar">Limpar</button>
			</fieldset>
		</form>
	</div>

</body>
</html>
