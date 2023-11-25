window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple,{
            perPage:5,
        });
    }
    const tablaCategorias = document.getElementById('tablaCategorias');
    
    if (tablaCategorias) {
        new simpleDatatables.DataTable(tablaCategorias, {
            perPage:5
        });
    }

    const tablaEmpleados = document.getElementById('tablaEmple');
    if (tablaEmpleados) {
        new simpleDatatables.DataTable(tablaEmpleados,{
            perPage:5,
        });
    }
    const tablaEmpleadosE = document.getElementById('tablaEmpleE');
    if (tablaEmpleadosE) {
        new simpleDatatables.DataTable(tablaEmpleadosE, {
            perPage:5
        });
    }
});
