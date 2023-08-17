$(document).ready(function () {

    $("#registrar_producto").on("click", function () {

        let Producto_id = $("#Producto_id").val();
        let Nombre = $("#Nombre").val();
        let Precio = $("#Precio").val();
        let Departamento_id = $("#Departamento_id").val();
        let Expiracion = $("#Expiracion").val();
        let SKU = $("#SKU").val();
        let Proveedor_id = $("#Proveedor_id").val();

        let data = {
            "producto_id": Producto_id,
            "nombre": Nombre,
            "precio": Precio,
            "departamento_id": Departamento_id,
            "expiracion": Expiracion,
            "sku": SKU,
            "proveedor_id": Proveedor_id

        }

        console.log(data);

        let ajax = new ProductoAjax();

        ajax.postToTable(data);
    });
})