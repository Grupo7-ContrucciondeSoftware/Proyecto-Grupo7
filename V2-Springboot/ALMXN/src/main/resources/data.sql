-- Insertamos un par de productos de prueba
INSERT INTO producto (nombre, descripcion) VALUES ('Monitor LG Ultragear 24G411a-b', 'Monitor gamer IPS 144Hz');
INSERT INTO producto (nombre, descripcion) VALUES ('Teclado Mecánico', 'Switches red, formato TKL');

-- Simulamos algunos movimientos en el almacén
INSERT INTO movimiento (tipo, cantidad, producto_id) VALUES ('ENTRADA', 15, 1);
INSERT INTO movimiento (tipo, cantidad, producto_id) VALUES ('SALIDA', 2, 1);
INSERT INTO movimiento (tipo, cantidad, producto_id) VALUES ('ENTRADA', 30, 2);