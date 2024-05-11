package com.example.repositorie.rentalServiceRepo;

import com.example.model.rentalService.AdditionalAndService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdditionalServiceRepo extends JpaRepository<AdditionalAndService , Integer> {
}
