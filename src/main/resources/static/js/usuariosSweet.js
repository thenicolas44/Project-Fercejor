
// Formulario empleados
document.querySelector('#tablaEmpleado').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('EprimerNombre');
    let name2 = document.getElementById('EsegundoNombre');
    let apellido = document.getElementById('EapellidoPaterno');
    let apellido2 = document.getElementById('EapellidoMaterno');
    let correo = document.getElementById('Ecorreo');
    let direccion = document.getElementById('Edireccion');
    let telefono = document.getElementById('Etelefono');
    let fecha = document.getElementById('Efecha');
    let categoria = document.getElementById('Ecategoria');

    if(name.value === '' || name2.value === '' || apellido.value === '' || apellido2.value === '' || correo.value === ''
        || direccion.value === '' || telefono.value === '' || fecha.value === '' || categoria.value === '') {
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
document.querySelector('#tablaEmpleadoE').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    event.preventDefault();
    let name = document.getElementById('EprimerNombreE');
    let name2 = document.getElementById('EsegundoNombreE');
    let apellido = document.getElementById('EapellidoPaternoE');
    let apellido2 = document.getElementById('EapellidoMaternoE');
    let correo = document.getElementById('EcorreoE');
    let direccion = document.getElementById('EdireccionE');
    let telefono = document.getElementById('EtelefonoE');
    let fecha = document.getElementById('EfechaE');
    let categoria = document.getElementById('EcategoriaE');

    if(name.value === '' || name2.value === '' || apellido.value === '' || apellido2.value === '' || correo.value === ''
        || direccion.value === '' || telefono.value === '' || fecha.value === '' || categoria.value === '') {
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
// Formulario cargo
document.querySelector('#tablaCargo').addEventListener('submit', function (event) {
    let name = document.getElementById('Cnombre');
    let descripcion = document.getElementById('Cdescripcion');

    if(name.value === '' || descripcion.value === '') {
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
            text: 'EL cargo ha sido registrado',
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
document.querySelector('#tablaCargoE').addEventListener('submit', function (event) {
    let name = document.getElementById('CarNombre');
    let descripcion = document.getElementById('CarDescripcion');

    if(name.value === '' || descripcion.value === '') {
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
            text: 'EL cargo ha sido Actualizado',
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


document.querySelector('#tablaArea').addEventListener('submit', function (event) {
    let name = document.getElementById('AreaNombre');
    let descripcion = document.getElementById('AreaDescripcion');

    if(name.value === '' || descripcion.value === '') {
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire(
            'Campos vacíos',
            'Por favor, complete todos los campos obligatorios.',
            'warning'
        );
    }
    else{
        event.preventDefault(); // Evita que el formulario se envíe
        Swal.fire({
            title: 'Buen trabajo',
            text: 'EL Area ha sido registrada',
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
document.querySelector('#tablaAreaE').addEventListener('submit', function (event) {
    let name = document.getElementById('AreaNombreE');
    let descripcion = document.getElementById('AreaDescripcionE');

    if(name.value === '' || descripcion.value === '') {
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
            text: 'EL Area ha sido Actualizada',
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
        text: "Eliminaras el cargo",
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
                'El cargo ha sido borrado.',
                'success'
            )
        }
    })
}
function eliminarArea() {
    Swal.fire({
        title: 'Estas seguro?',
        text: "Eliminaras el area",
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
                'El area ha sido borrada.',
                'success'
            )
        }
    })
}


function generarCreden(){
    Swal.fire({
        title: 'Deseas proceder?',
        text: "Generaras una credencial para el empleado",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Si, generar',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire(
                'Generado',
                'La credencial se ha creado correctamente',
                'success'
            )
        }
    })
}


function NOgenerarCreden(){
    Swal.fire({
        icon: "error",
        title: "Ha sucedido un error!",
        text: "La credencial ya ha sido generada anteriormente",
    })
}