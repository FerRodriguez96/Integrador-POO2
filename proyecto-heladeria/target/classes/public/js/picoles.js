let borrar = function (txtSabor) {
    fetch(`http://localhost:7000/picoles/delete/${txtSabor}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
