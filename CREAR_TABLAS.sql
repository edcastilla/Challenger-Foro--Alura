-- Crear tabla Curso
CREATE TABLE foro.Curso (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    categoria VARCHAR(255)
);

-- Crear tabla Perfil
CREATE TABLE foro.Perfil (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255)
);

-- Crear tabla Usuarios
CREATE TABLE foro.Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    correoElectronico VARCHAR(255),
    contrasena VARCHAR(255),
    perfil_id INT,
    FOREIGN KEY (perfil_id) REFERENCES Perfil(id)
);

-- Crear tabla Topico
CREATE TABLE foro.Topico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    mensaje TEXT,
    fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(255),
    autor_id INT,
    curso_id INT,
    FOREIGN KEY (autor_id) REFERENCES Usuarios(id),
    FOREIGN KEY (curso_id) REFERENCES Curso(id)
);

-- Crear tabla Respuesta
CREATE TABLE foro.Respuesta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mensaje TEXT,
    topico_id INT,
    fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    autor_id INT,
    solucion BOOLEAN,
    FOREIGN KEY (topico_id) REFERENCES Topico(id),
    FOREIGN KEY (autor_id) REFERENCES Usuarios(id)
);
