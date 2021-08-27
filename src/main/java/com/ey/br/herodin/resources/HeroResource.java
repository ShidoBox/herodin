package com.ey.br.herodin.resources;


import com.ey.br.herodin.models.Heroes;
import com.ey.br.herodin.repository.HeroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Heroes")
@CrossOrigin(origins = "*")
public class HeroResource {

    @Autowired
    HeroRepository heroRepository;

    @GetMapping("/heroes")
    @ApiOperation(value = "Returns a list of all heroes")
    public List<Heroes> listHeroes(){
        return heroRepository.findAll();
    }

    @GetMapping("/heroes/{id}")
    @ApiOperation(value = "Returns a unique hero by its id")
    public Heroes listHero(@PathVariable(value="id") long id){
        return heroRepository.findById(id);
    }

    @PostMapping("/heroes/create")
    @ApiOperation(value = "Create a new hero")
    public Heroes saveHero(@RequestBody Heroes heroes){
        return heroRepository.save(heroes);
    }

    @DeleteMapping("/heroes/delete")
    @ApiOperation(value = "Deletes all heroes")
    public void deleteHeroes(){
        heroRepository.deleteAll();
    }

    @DeleteMapping("/heroes/delete/{id}")
    @ApiOperation(value = "Deletes a unique hero by its id")
    public void deleteHero(@PathVariable(value = "id") long id) {
        heroRepository.deleteById(id);
    }

    @PutMapping("/heroes")
    @ApiOperation(value = "Update a hero")
    public Heroes updateHero(@RequestBody Heroes heroes){
        return heroRepository.save(heroes);
    }

    @GetMapping("/heroes/search")
    @ApiOperation("Search heroes by name")
    public List<Heroes> searchByName(@RequestParam String name){
        return heroRepository.findByNameContainingIgnoreCase(name);
    }

}
