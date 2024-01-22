<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Veterinaria PetSmile</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<div class="container">
    <h1>Bienvenido a Veterinaria PetSmile</h1>
    
    <!-- Formulario de Registro de Usuario -->
    <form id="registroUsuarioForm">
        <label for="nombreUsuario">Nombre de Usuario:</label>
        <input type="text" id="nombreUsuario" name="nombreUsuario" required>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required>

        <button type="button" onclick="registrarUsuario()">Registrar Usuario</button>
    </form>

    <!-- Otros elementos y formularios pueden ir aquí -->
</div>

<script src="scripts.js"></script>
</body>
</html>
