class AjaxTemplateMethods {
    constructor(url_prefix) {
        this.url_prefix = url_prefix;
    }

    async postToTable(url_suffix, data) {
        $.ajax({
            url: this.url_prefix + url_suffix,
            type: "POST",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            success: function (data) {
                console.log("Data saved");
                console.log(data);
            },
            error: function (data) {
                console.log("Error saving data");
                console.log(data);
            }
        })
    }

    validateData(data, validation_function) {

        if (data === undefined || data === null || data === "") {
            return false;
        }

        for (let key in data) {
            if (data[key] === undefined || data[key] === null || data[key] === "") {
                return false;
            }
        }

        return validation_function(data);
    }
}

class ClienteAjax extends AjaxTemplateMethods {
    constructor() {
        super("http://localhost:8081/api/v1/clientes");
    }

    async postToTable(data) {

        super.postToTable("", data);
    }
}

class FacturaAjax extends AjaxTemplateMethods {
    constructor() {
        super("http://localhost:8081/api/v1/factura");
    }

    async postToTable(data) {

        super.postToTable("", data);
    }
}

class StockAjax extends AjaxTemplateMethods {
    constructor() {
        super("http://localhost:8081/api/v1/stocks");
    }

    async postToTable(data) {

        super.postToTable("", data);
    }
}