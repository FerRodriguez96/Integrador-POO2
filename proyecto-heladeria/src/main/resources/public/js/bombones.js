let borrar = function (txtSabor) {
    fetch(`http://localhost:7000/bombon/delete/${txtSabor}`, {
            method: 'DELETE',
        }
    ).then(res => location.reload());
}
