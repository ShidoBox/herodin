package com.ey.br.herodin.repository;

import com.ey.br.herodin.models.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroRepository extends JpaRepository<Heroes, Long> {

    Heroes findById(long id);
    List<Heroes> findByNameContaining(String name);
}
