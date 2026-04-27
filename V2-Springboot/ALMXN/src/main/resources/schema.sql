-- Tabla para los productos del almacén
CREATE TABLE IF NOT EXISTS producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

-- Tabla para registrar si entra o sale mercancía
CREATE TABLE IF NOT EXISTS movimiento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL, -- Ej: 'ENTRADA' o 'SALIDA'
    cantidad INT NOT NULL,
    producto_id INT,
    FOREIGN KEY (producto_id) REFERENCES producto(id)
);