// En el paquete com.petSmile.ReservaHora.controller

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public List<Agenda> getAllAgendas() {
        return agendaService.getAllAgendas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agenda> getAgendaById(@PathVariable Long id) {
        Agenda agenda = agendaService.getAgendaById(id);
        return agenda != null ? ResponseEntity.ok(agenda) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Agenda> saveAgenda(@RequestBody Agenda agenda) {
        Agenda savedAgenda = agendaService.saveAgenda(agenda);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAgenda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgenda(@PathVariable Long id) {
        agendaService.deleteAgenda(id);
        return ResponseEntity.noContent().build();
    }

    // Puedes agregar otros métodos según sea necesario
}
