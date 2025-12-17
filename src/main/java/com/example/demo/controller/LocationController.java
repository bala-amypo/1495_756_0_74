package com.example.demo.controller;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationService.createLocation(le);
    }

    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationService.getAllLocation();
    }
}
