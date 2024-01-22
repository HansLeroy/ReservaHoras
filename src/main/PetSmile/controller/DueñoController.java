
// En el paquete com.petSmile.ReservaHora.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dueños")
public class DueñoController {

    @Autowired
    private DueñoService dueñoService;

    @GetMapping
    public List<Dueño> getAllDueños() {
        return dueñoService.getAllDueños();
    }

    @GetMapping("/{rut}")
    public ResponseEntity<Dueño> getDueñoByRut(@PathVariable String rut) {
        Dueño dueño = dueñoService.getDueñoByRut(rut);
        return dueño != null ? ResponseEntity.ok(dueño) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Dueño> saveDueño(@RequestBody Dueño dueño) {
        Dueño savedDueño = dueñoService.saveDueño(dueño);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDueño);
    }

    @DeleteMapping("/{rut}")
    public ResponseEntity<Void> deleteDueño(@PathVariable String rut) {
        dueñoService.deleteDueño(rut);
        return ResponseEntity.noContent().build();
    }

    // Puedes agregar otros métodos según sea necesario
}
