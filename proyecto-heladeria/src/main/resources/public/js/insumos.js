let borrar = function (txtId) {
    fetch(`http://localhost:7000/insumos/delete/${txtId}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
