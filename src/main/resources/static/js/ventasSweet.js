
// Formulario empleados
document.querySelector('#tablaVentas').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('AventasNombre');
    let ape = document.getElementById('AventasApellido');
    let email = document.getElementById('AventasCorreo');
    let dir = document.getElementById('AventasDireccion');
    let tel = document.getElementById('AventasTelefono');
    let pais = document.getElementById('AventasPais');
    let empleado = document.getElementById('AventasEmpleado');
    let producto = document.getElementById('AventasProducto');
    let precio = document.getElementById('AventasPrecio');
    let cantidad = document.getElementById('AventasCantidad');


    if(name.value === '' || ape.value === '' || email.value === '' || dir.value === ''
        || tel.value === ''|| pais.value === '' || empleado.value === '' || producto.value === '' || precio.value === ''|| cantidad.value === '') {
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
            text: 'La venta ha sido registrada',
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
    let name = document.getElementById('EventasNombre');
    let ape = document.getElementById('EventasApellido');
    let email = document.getElementById('EventasCorreo');
    let dir = document.getElementById('EventasDireccion');
    let tel = document.getElementById('EventasTelefono');
    let pais = document.getElementById('EventasPais');
    let empleado = document.getElementById('EventasEmpleado');
    let producto = document.getElementById('EventasProducto');
    let precio = document.getElementById('EventasPrecio');
    let cantidad = document.getElementById('EventasCantidad');


    if(name.value === '' || ape.value === '' || email.value === '' || dir.value === ''
        || tel.value === ''|| pais.value === '' || empleado.value === '' || producto.value === '' || precio.value === ''|| cantidad.value === '') {
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
            text: 'La venta ha sido actualizada',
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
