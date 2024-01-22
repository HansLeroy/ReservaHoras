<form action="AgregarHoraServlet" method="post">
    <label for="idMascota">Seleccione una mascota:</label>
    <select name="idMascota">
        <!-- Aquí puedes obtener y mostrar las mascotas existentes desde la base de datos -->
        <!-- Por simplicidad, asumimos que tienes una lista de mascotas -->
        <option value="1">Mascota1</option>
        <option value="2">Mascota2</option>
        <!-- Agrega más opciones según sea necesario -->
    </select><br>

    <label for="rutDueño">Rut del Dueño:</label>
    <input type="text" name="rutDueño" required><br>

    <label for="nombreMascota">Nombre de la mascota:</label>
    <input type="text" name="nombreMascota" required><br>

    <label for="hora">Hora:</label>
    <input type="time" name="hora" required><br>

    <label for="fecha">Fecha:</label>
    <input type="date" name="fecha" required><br>

    <button type="submit">Agendar Cita</button>
</form>
