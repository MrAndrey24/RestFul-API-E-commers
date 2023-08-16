$(document).ready(function () {

    $("#registrar_factura").on("click", function () {

        //<div className="campo">
        //             <label htmlFor="factura_id">Código de Factura:</label>
        //             <input type="number" id="factura_id" name="factura_id" required>
        //         </div>
        //         <div className="campo">
        //             <label htmlFor="cliente_id">Código de Cliente:</label>
        //             <input type="number" id="cliente_id" name="cliente_id" required>
        //         </div>
        //         <div className="campo">
        //             <label htmlFor="Moneda">Moneda:</label>
        //             <input type="text" id="Moneda" name="Moneda" maxLength="10" required>
        //         </div>
        //         <div className="campo">
        //             <label htmlFor="metodo_pago_id">Código de Método de Pago:</label>
        //             <input type="number" id="metodo_pago_id" name="metodo_pago_id" required>
        //         </div>

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