// En el paquete com.petSmile.ReservaHora.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Usuario usuario = usuarioService.getUsuarioById(id);
        return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
        Usuario savedUsuario = usuarioService.saveUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }

    // Puedes agregar otros métodos según sea necesario
}
