package com.example.springbootjparest.Repository;

import com.example.springbootjparest.Entity.Recuento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecuentoRepository extends JpaRepository<Recuento, Integer> {
}