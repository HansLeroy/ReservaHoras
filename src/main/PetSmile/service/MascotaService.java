// En el paquete com.petSmile.ReservaHora.service

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> getAllMascotas() {
        return mascotaRepository.findAll();
    }

    public Mascota getMascotaById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    public Mascota saveMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    // Puedes agregar otros métodos específicos según sea necesario
}
