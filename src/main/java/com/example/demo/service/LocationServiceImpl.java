package com.example.demo.service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public LocationEntity createLocation(LocationEntity location) {
        return locationRepository.save(location);
    }

    @Override
    public List<LocationEntity> getAllLocation() {
        return locationRepository.findAll();
    }
}
