//editar categoria
(function(){
    var listaBontonesEditar = document.querySelectorAll(".editarCategoria");
    listaBontonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('idCate').value = item.dataset.id;
            document.getElementById('nombres4').value = item.dataset.nombre;
            document.getElementById('descripcion4').value = item.dataset.descripcion;
            new bootstrap.Modal(document.getElementById('modalEditarCategoria')).show();
        })
    })
})();

//editar producto
(function(){
    var listaBontonesEditar = document.querySelectorAll(".editarProducto");
    listaBontonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('idProd').value = item.dataset.id;
            document.getElementById('nombres2').value = item.dataset.nombre;
            document.getElementById('descripcion2').value = item.dataset.descripcion;
            document.getElementById('categoria2').value = item.dataset.categoria;
            document.getElementById('stock2').value = item.dataset.stock;
            document.getElementById('P_compra2').value = item.dataset.pcompra;
            document.getElementById('P_venta2').value = item.dataset.pventa;
            new bootstrap.Modal(document.getElementById('modalEditarProducto')).show();
        })
    })
})();
//editar cargo
(function(){
    var listaBontonesEditar = document.querySelectorAll(".editarCargo");
    listaBontonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            
            document.getElementById('idCrg').value = item.dataset.id;
            document.getElementById('CarNombre').value = item.dataset.nombre;
            document.getElementById('CarDescripcion').value = item.dataset.descripcion;

            new bootstrap.Modal(document.getElementById('modalEditarCargo')).show();
        })
    })
})();
//editar empleado
(function(){
    var listaBontonesEditar = document.querySelectorAll(".editarEmpleado");
    listaBontonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            
            document.getElementById('idEmpl').value = item.dataset.id;
            document.getElementById('EprimerNombreE').value = item.dataset.prinombre;
            document.getElementById('EsegundoNombreE').value = item.dataset.secnombre;
            document.getElementById('EapellidoPaternoE').value = item.dataset.patapellido;
            document.getElementById('EapellidoMaternoE').value = item.dataset.matapellido;
            document.getElementById('EcorreoE').value = item.dataset.correo;
            document.getElementById('EdireccionE').value = item.dataset.direccion;
            document.getElementById('EtelefonoE').value = item.dataset.telefono;
            var fechaOriginal = new Date(item.dataset.fecha);
            var fechaFormateada = fechaOriginal.toISOString().split('T')[0];
            document.getElementById('EfechaE').value = fechaFormateada;
            document.getElementById('EcargoE').value = item.dataset.cargo;
            document.getElementById('EcategoriaE').value = item.dataset.estado;
            new bootstrap.Modal(document.getElementById('modalEditarEmpleado')).show();
        })
    })
})();