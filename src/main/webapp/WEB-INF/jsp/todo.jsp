<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Adicionar Vehiculo</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="description">Placa</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>


						
						<fieldset class="form-group">
							<form:label path="horaEntrada">Hora entrada</form:label>
							<form:input path="horaEntrada" type="time" class="form-control"
								required="required" />
							<form:errors path="horaEntrada" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="horaSalida">Hora salida</form:label>
							<form:input path="horaSalida" type="time" class="form-control"
								required="required" />
							<form:errors path="horaSalida" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="ubicacion">Ubicacion</form:label>
							<form:input path="ubicacion" type="text" class="form-control"
								required="required" />
							<form:errors path="ubicacion" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
							<form:label path="tipoVehiculo">Tipo de vehiculo</form:label>
							<form:input path="tipoVehiculo" type="text" class="form-control"
								required="required" />
							<form:errors path="tipoVehiculo" cssClass="text-warning" />
						</fieldset>



						<button type="submit" class="btn btn-success">Guardar</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jsp"%>