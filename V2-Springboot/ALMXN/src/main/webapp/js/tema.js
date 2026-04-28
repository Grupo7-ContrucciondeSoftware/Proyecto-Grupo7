// ============================================
// CAMBIAR DE MODOS (CLARO/OSCURO)
// ============================================

// Revisar si hay un tema guardado
document.addEventListener('DOMContentLoaded', function () {

    const toggle = document.getElementById('theme-toggle');
    const temaGuardado = localStorage.getItem('tema');

    if (temaGuardado === 'oscuro') {
        toggle.checked = true;
    }

    toggle.addEventListener('change', function () {
        if (this.checked) {
            localStorage.setItem('tema', 'oscuro');
        } else {
            localStorage.setItem('tema', 'claro');
        }
    });

});