$(document).ready(function () {

    $("#registrar_factura").on("click", function () {

        let factura_id = $("#factura_id").val();
        let cliente_id = $("#cliente_id").val();
        let Moneda = $("#Moneda").val();
        let metodo_pago_id = $("#metodo_pago_id").val();



        let data = {
            "factura_id": factura_id,
            "cliente_id": cliente_id,
            "moneda": Moneda,
            "metodo_pago_id": metodo_pago_id
        }

        console.log(data);

        var facturaAjax = new FacturaAjax();

        facturaAjax.postToTable(data);

        return false;
    });
})