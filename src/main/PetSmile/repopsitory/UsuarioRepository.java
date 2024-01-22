// En el paquete com.petSmile.ReservaHora.repository

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar métodos específicos si es necesario
}
