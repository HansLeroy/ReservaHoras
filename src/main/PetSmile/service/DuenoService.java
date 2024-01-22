// En el paquete com.petSmile.ReservaHora.service

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DueñoService {

    @Autowired
    private DueñoRepository dueñoRepository;

    public List<Dueño> getAllDueños() {
        return dueñoRepository.findAll();
    }

    public Dueño getDueñoByRut(String rut) {
        return dueñoRepository.findById(rut).orElse(null);
    }

    public Dueño saveDueño(Dueño dueño) {
        return dueñoRepository.save(dueño);
    }

    public void deleteDueño(String rut) {
        dueñoRepository.deleteById(rut);
    }

    // Puedes agregar otros métodos específicos según sea necesario
}
