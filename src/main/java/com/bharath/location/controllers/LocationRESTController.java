package com.bharath.location.controllers;

import com.bharath.location.entities.Location;
import com.bharath.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Location> getLocations(){ //getLocations oder getLocation?
        return  locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    @DeleteMapping
    public void deleteLocation(@RequestBody Location location){
        locationRepository.delete(location);
    }

    @GetMapping("/{id}")
    public Optional<Location> getLocation(@PathVariable("id") int id){
        return locationRepository.findById(id);
    }
}
