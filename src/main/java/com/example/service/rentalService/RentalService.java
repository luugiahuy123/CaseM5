package com.example.service.rentalService;

import com.example.model.rentalService.RentalAndService;
import com.example.repositorie.rentalServiceRepo.IRentalServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RentalService implements IRentalService {
    @Autowired
    private IRentalServiceRepo iRentalServiceRepo;
    @Override
    public Page<RentalAndService> getRental(int page, int size) {
        return iRentalServiceRepo.findAll(PageRequest.of(page, size));
    }

    @Override
    public Object getAll() {
        return null;
    }

    @Override
    public void saveRental(RentalAndService rental) {
        iRentalServiceRepo.save(rental);
    }

    @Override
    public void deleteUser(Integer id) {
        iRentalServiceRepo.deleteById(id);
    }

    @Override
    public RentalAndService getRentalByID(Integer id) {
        return iRentalServiceRepo.findById(id).get();
    }

    @Override
    public Page<RentalAndService> findByName(String key, Pageable pageable) {
        return iRentalServiceRepo.findByNameContainingIgnoreCaseOrderByName(pageable,key);
    }
}
