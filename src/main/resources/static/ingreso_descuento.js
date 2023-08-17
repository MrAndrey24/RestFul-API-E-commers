$(document).ready(function () {

    $("#registrar_empleado").on("click", function () {

        let cliente_id = $("#cliente_d").val();
        let Nombre = $("#Nombre").val();
        let Apellidos = $("#Apellidos").val();
        let Direccion = $("#Direccion").val();
        let Telefono = $("#Telefono").val();
        let correo_electronico = $("#correo_electronico").val();

        let data = {
            "cliente_id": cliente_id,
            "nombre": Nombre,
            "apellidos": Apellidos,
            "direccion": Direccion,
            "telefono": Telefono,
            "correo": correo_electronico
        }

        console.log(data);

        var cliente = new ClienteAjax();

        cliente.postToTable(data);
    });
    $.ajax( {
        url:"http://localhost:8081/api/v1/clientes",
        type:"GET",
        contentType:"application/json; charset=utf-8",
        success: function (data) {
            console.log(data);
        },
        error: function (data) {
            console.log("Error saving career");
            console.log(data);
        }
    })
})