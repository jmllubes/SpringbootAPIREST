package com.example.springbootjparest.Repository;

import com.example.springbootjparest.Entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Integer> {
}