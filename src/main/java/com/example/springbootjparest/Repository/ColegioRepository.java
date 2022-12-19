package com.example.springbootjparest.Repository;

import com.example.springbootjparest.Entity.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "colegio", path = "colegio")
public interface ColegioRepository extends JpaRepository<Colegio, Integer>,
        PagingAndSortingRepository<Colegio, Integer> {
    List<Colegio> findByDireccion(@Param("direccion") String direccion);


}