package com.example.service.rentalService;

import com.example.model.rentalService.AdditionalAndService;
import com.example.repositorie.rentalServiceRepo.IAdditionalServiceRepo;
import com.example.repositorie.rentalServiceRepo.IRentalServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalService implements IAdditionalService {
    @Autowired
    private IAdditionalServiceRepo iAdditionalService;
    @Override
    public List<AdditionalAndService> getAll() {
        return iAdditionalService.findAll();
    }
}
