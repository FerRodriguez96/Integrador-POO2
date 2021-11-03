let borrar = function (txtDni) {
    fetch(`http://localhost:7000/clientes/${txtDni}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}