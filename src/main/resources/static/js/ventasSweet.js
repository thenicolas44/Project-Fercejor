
// Formulario empleados
document.querySelector('#tablaVentas').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('ventasNombre');
    let descripcion = document.getElementById('ventasDescrippcion');
    let producto = document.getElementById('ventasProducto');
    let precio = document.getElementById('ventasPrecio');
    let cantidad = document.getElementById('ventasCantidad');
    let precioTotal = document.getElementById('ventasTotal');


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

document.querySelector('#AtablaVentas').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('AventasNombre');
    let descripcion = document.getElementById('AventasDescrippcion');
    let producto = document.getElementById('AventasProducto');
    let precio = document.getElementById('AventasPrecio');
    let cantidad = document.getElementById('AventasCantidad');
    let precioTotal = document.getElementById('AventasTotal');


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
