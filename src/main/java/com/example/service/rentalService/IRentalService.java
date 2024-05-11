package com.example.service.rentalService;

import com.example.model.rentalService.RentalAndService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRentalService {
    Page<RentalAndService> getRental(int page, int size);

    Object getAll();

    void saveRental(RentalAndService rental);

    void deleteUser(Integer id);

    RentalAndService getRentalByID(Integer id);

    Page<RentalAndService> findByName(String key, Pageable pageable);
}
