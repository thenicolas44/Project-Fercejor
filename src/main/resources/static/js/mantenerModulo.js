(function(){
    var listaBontonesEditar = document.querySelectorAll(".editarCategoria");
    listaBontonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{

            new bootstrap.Modal(document.getElementById('modalEditarCategoria')).show();
        })
    })
})();
