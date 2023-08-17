$(document).ready(function () {

    $("#registrar_cliente").on("click", function () {

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
})