
// Formulario empleados
document.querySelector('#tablaCLiente').addEventListener('submit', function (event) {
    // Evita que el formulario se envíe
    console.log("Hola mundo");
    let name = document.getElementById('ClienteNom');
    let name2 = document.getElementById('ClienteNom2');
    let apellido = document.getElementById('ClienteApe');
    let apellido2 = document.getElementById('ClienteApe2');
    let correo = document.getElementById('ClienteCorreo');
    let direccion = document.getElementById('ClienteDireccion');
    let telefono = document.getElementById('CLienteTelefono');

    if (name.value === "" || name2.value === "" || apellido.value === "" || apellido2.value === ""
        || correo.value === "" || direccion.value === "" || telefono.value === "") {
        event.preventDefault();
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
            text: 'El cliente ha sido actualizado',
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
})
