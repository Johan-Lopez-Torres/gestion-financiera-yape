package com.gestion_financiera.Repository;

import com.gestion_financiera.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.persistence.Id;
public interface UsuarioRepository extends JpaRepository<User, Long> {

}
