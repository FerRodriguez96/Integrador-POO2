let borrar = function (txtId) {
    fetch(`http://localhost:7000/picoles/delete/${txtId}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
