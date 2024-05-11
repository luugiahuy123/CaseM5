package com.example.repositorie.rentalServiceRepo;

import com.example.model.rentalService.RentalAndService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentalServiceRepo extends JpaRepository<RentalAndService, Integer> {
    Page<RentalAndService> findByNameContainingIgnoreCaseOrderByName(Pageable pageable, String key);
}
