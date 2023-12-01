
// Formaurio productos
document.getElementById('miFormulario').addEventListener('submit', function (event) {
    // Obtener los campos de entrada
    console.log("Hola mundo")
    let name = document.getElementById('nombres');
    let descripcion = document.getElementById('descripcion');
    let precioCompra = document.getElementById('P_compra');
    let precioVenta = document.getElementById('P_venta');
    let stock = document.getElementById('stock');
    let categoria = document.getElementById('categoria');

    // Validar si los campos están vacíos
    if (name.value === '' || descripcion.value === ''  || precioCompra.value === '' || precioVenta.value === ''  || stock.value === '' || categoria.value === '') {
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
            text: 'EL producto ha sido registrado',
            icon: 'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }

});
document.getElementById('miFormulario2').addEventListener('submit', function (event) {
    // Obtener los campos de entrada
    let name = document.getElementById('nombres2');
    let descripcion = document.getElementById('descripcion2');
    let precioCompra = document.getElementById('P_compra2');
    let precioVenta = document.getElementById('P_venta2');
    let stock = document.getElementById('stock2');
    let categoria = document.getElementById('categoria2');

    // Validar si los campos están vacíos
    // Validar si los campos están vacíos
    if (name.value === '' || descripcion.value === ''  || precioCompra.value === '' || precioVenta.value === '' || stock.value === '' || categoria.value === '') {
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
            text: 'EL producto ha sido actualizado',
            icon: 'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }

});
// Formulario categorias
document.getElementById('miFormulario3').addEventListener('submit', function (event) {
    // Obtener los campos de entrada
    let name = document.getElementById('nombres3');
    let descripcion = document.getElementById('descripcion3');

    // Validar si los campos están vacíos
    // Validar si los campos están vacíos
    if (name.value === '' || descripcion.value === '') {
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
            text: 'La categoria ha sido registrada',
            icon: 'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }

});
document.getElementById('miFormulario4').addEventListener('submit', function (event) {
    // Obtener los campos de entrada
    let name = document.getElementById('nombres4');
    let descripcion = document.getElementById('descripcion4');

    // Validar si los campos están vacíos
    // Validar si los campos están vacíos
    if (name.value === '' || descripcion.value === '' ) {
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
            text: 'La categoria ha sido actualizado',
            icon: 'success',
            showCancelButton: false,
            confirmButtonText: 'OK',
        }).then((result) => {
            // Si el usuario cierra la alerta, envía el formulario
            if (result.isConfirmed) {
                this.submit();
            }
        })
    }

});
// Formulario empleados

function eliminarProducto() {
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras el cliente",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, eliminar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Eliminado',
                'El cliente ha sido borrado.',
                'success'
            )
        }
    })
}

function eliminarCategoria(event,btn) {
    event.preventDefault();
    
    let id = btn.getAttribute('data-id');
    let href = location+"eliminarCate/"+id;
    console.log(href);
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras la categoria",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, eliminar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Eliminado',
                'El cliente ha sido borrado.',
                'success'
            )
            
            window.location.href = href;
            console.log(href);
        }
    })
}

function eliminarEmpleado() {
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras el empleado",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, eliminar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Eliminado',
                'El cliente ha sido borrado.',
                'success'
            )
        }
    })
}
function eliminarCargo() {
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras el empleado",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, eliminar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Eliminado',
                'El cliente ha sido borrado.',
                'success'
            )
        }
    })
}
function eliminarArea() {
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras el empleado",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, eliminar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Eliminado',
                'El cliente ha sido borrado.',
                'success'
            )
        }
    })
}