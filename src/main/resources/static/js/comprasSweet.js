
// Formulario empleados
document.querySelector('#tablaCompras').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    let name = document.getElementById('comprasNombre');
    let descripcion = document.getElementById('comprasDescrippcion');
    let producto = document.getElementById('comprasProducto');
    let precio = document.getElementById('comprasPrecio');
    let cantidad = document.getElementById('comprasCantidad');

    if(name.value === '' || descripcion.value === '' || producto.value === '' || precio.value === '' || cantidad.value === '') {
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire(
            'Campos vacíos',
            'Por favor, complete todos los campos obligatorios.',
            'warning'
        );
    }
    else {
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire({
            title: 'Buen trabajo',
            text: 'EL empleado ha sido registrado',
            icon:'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }
})

document.querySelector('#AtablaCompras').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('AcomprasNombre');
    let descripcion = document.getElementById('AcomprasDescrip');
    let producto = document.getElementById('AcomprasProducto');
    let precio = document.getElementById('AcomprasPrecio');
    let cantidad = document.getElementById('AcomprasCantidad');


    if(name.value === '' || descripcion.value === '' || producto.value === '' || precio.value === '' || cantidad.value === '') {
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire(
            'Campos vacíos',
            'Por favor, complete todos los campos obligatorios.',
            'warning'
        );
    }
    else {
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire({
            title: 'Buen trabajo',
            text: 'EL empleado ha sido registrado',
            icon:'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }
})
