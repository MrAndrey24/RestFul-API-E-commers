$(document).ready(function () {

    $("#registrar_tienda").on("click", function () {

        let tienda_id = $("#tienda_id").val();
        let ubicacion = $("#ubicacion").val();
        let supervisor_id = $("#supervisor_id").val();

        let data = {
            "tienda_id": tienda_id,
            "ubicacion": ubicacion,
            "supervisor_id": supervisor_id
        };

        console.log(data);

        let ajax = new TiendaAjax();  // Change this to the appropriate class name if needed
        ajax.postToTable(data);
    });
});
