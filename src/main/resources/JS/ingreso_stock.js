$(document).ready(function () {

    $("#registrar_stock").on("click", function () {

        let stock_id = $("#stock_id").val();
        let departamento_id = $("#departamento_id").val();
        let producto_id = $("#producto_id").val();
        let ubicacion_id = $("#ubicacion_id").val();

        let data = {
            "stock_id": stock_id,
            "departamento_id": departamento_id,
            "producto_id": producto_id,
            "ubicacion_id": ubicacion_id
        }

        console.log(data);

        let stockAjax = new StockAjax();

        stockAjax.postToTable(data);
    });
})