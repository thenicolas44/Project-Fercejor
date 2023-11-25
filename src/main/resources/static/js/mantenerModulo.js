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
