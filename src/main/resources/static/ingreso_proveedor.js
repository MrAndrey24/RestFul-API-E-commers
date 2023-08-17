$(document).ready(function () {

    $("#registrar_proveedor").on("click", function () {

        let proveedor_id = $("#proveedor_id").val();
        let Nombre = $("#Nombre").val();
        let cedula_juridica = $("#cedula_juridica").val();
        let Direccion = $("#Direccion").val();

        let data = {
            "id": proveedor_id,
            "nombre": Nombre,
            "cedula_juridica": cedula_juridica,
            "direccion": Direccion
        };

        console.log(data);

        let ajax = new ProveedorAjax();  // Change [Category]Ajax() to the appropriate class name if needed
        ajax.postToTable(data);
    });
});
