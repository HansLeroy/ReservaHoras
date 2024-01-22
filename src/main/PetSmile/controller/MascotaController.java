// En el paquete com.petSmile.ReservaHora.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<Mascota> getAllMascotas() {
        return mascotaService.getAllMascotas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mascota> getMascotaById(@PathVariable Long id) {
        Mascota mascota = mascotaService.getMascotaById(id);
        return mascota != null ? ResponseEntity.ok(mascota) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Mascota> saveMascota(@RequestBody Mascota mascota) {
        Mascota savedMascota = mascotaService.saveMascota(mascota);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMascota);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMascota(@PathVariable Long id) {
        mascotaService.deleteMascota(id);
        return ResponseEntity.noContent().build();
    }

    // Puedes agregar otros métodos según sea necesario
}
