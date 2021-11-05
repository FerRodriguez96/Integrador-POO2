let borrar = function (txtDni) {
    fetch(`http://localhost:7000/repartidores/delete/${txtDni}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
