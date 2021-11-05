let borrar = function (txtId) {
    fetch(`http://localhost:7000/bombones/delete/${txtId}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
