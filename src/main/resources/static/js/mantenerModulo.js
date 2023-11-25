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

