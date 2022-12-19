package com.example.springbootjparest.Repository;

import com.example.springbootjparest.Entity.Componente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponenteRepository extends JpaRepository<Componente, String> {
}