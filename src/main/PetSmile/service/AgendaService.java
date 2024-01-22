// En el paquete com.petSmile.ReservaHora.service

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<Agenda> getAllAgendas() {
        return agendaRepository.findAll();
    }

    public Agenda getAgendaById(Long id) {
        return agendaRepository.findById(id).orElse(null);
    }

    public Agenda saveAgenda(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public void deleteAgenda(Long id) {
        agendaRepository.deleteById(id);
    }

    // Puedes agregar otros métodos específicos según sea necesario
}
