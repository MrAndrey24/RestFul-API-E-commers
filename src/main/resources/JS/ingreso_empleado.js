$(document).ready(function () {

    $("#registrar_empleado").on("click", function () {


        let empleado_id = $("#Empleado_id").val();
        let Nombre = $("#Nombre").val();
        let Apellidos = $("#Apellidos").val();
        let Direccion = $("#Direccion").val();
        let Departamento_supervisor = $("#Departamento_supervisor").val();
        let Supervisor_id = $("#Supervisor_id").val();

        let data = {
            "empleado_id": empleado_id,
            "nombre": Nombre,
            "apellidos": Apellidos,
            "direccion": Direccion,
            "departamento_supervisor": Departamento_supervisor,
            "supervisor_id": Supervisor_id
        }

        console.log(data);

        var empleado = new EmpleadoAjax();

        empleado.postToTable(data);
    });
})