package com.example.demo.controller;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/addlocation")
    @Operation(summary = "Add a new location")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationService.createLocation(le);
    }

    @GetMapping("/showlocation")
    @Operation(summary = "Get all locations")
    public List<LocationEntity> show() {
        return locationService.getAllLocation();
    }
}
