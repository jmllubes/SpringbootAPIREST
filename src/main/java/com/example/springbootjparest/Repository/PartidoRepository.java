package com.example.springbootjparest.Repository;

import com.example.springbootjparest.Entity.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidoRepository extends JpaRepository<Partido, String> {
}