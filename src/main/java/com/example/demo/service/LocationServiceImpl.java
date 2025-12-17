package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationRepository.save(le);
    }

    @Override
    public List<LocationEntity> getalllocation() {
        return locationRepository.findAll();
    }
}