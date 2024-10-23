CREATE DATABASE repsol_db;

USE repsol_db;

CREATE TABLE EstacionesServicio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    ubicacion VARCHAR(255),
    capacidadAlmacen INT,
    gerente VARCHAR(100),
    numeroEmpleados INT,
    tipoCombustible VARCHAR(50),
    disponibilidad BOOLEAN
);

CREATE TABLE InventarioCombustibles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tipoCombustible VARCHAR(50),
    cantidadActual DECIMAL(10, 2),
    precioLitro DECIMAL(10, 2),
    fechaActualizacion DATE,
    estacionServicioId BIGINT,
    FOREIGN KEY (estacionServicioId) REFERENCES EstacionesServicio(id)
);

CREATE TABLE Proveedores (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    contacto VARCHAR(100),
    productosSuministrados VARCHAR(255),
    contratoFechaInicio DATE,
    contratoFechaFin DATE,
    estacionServicioId BIGINT,
    FOREIGN KEY (estacionServicioId) REFERENCES EstacionesServicio(id)
);

CREATE TABLE Clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    documentoIdentidad VARCHAR(20),
    email VARCHAR(100),
    telefono VARCHAR(20),
    estacionFrecuenteId BIGINT,
    FOREIGN KEY (estacionFrecuenteId) REFERENCES EstacionesServicio(id)
);

CREATE TABLE Ventas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fechaVenta DATE,
    tipoCombustible VARCHAR(50),
    cantidadVendida DECIMAL(10, 2),
    montoTotal DECIMAL(10, 2),
    clienteId BIGINT,
    estacionServicioId BIGINT,
    FOREIGN KEY (clienteId) REFERENCES Clientes(id),
    FOREIGN KEY (estacionServicioId) REFERENCES EstacionesServicio(id)
);