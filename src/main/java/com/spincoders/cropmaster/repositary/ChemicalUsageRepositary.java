package com.spincoders.cropmaster.repositary;

import com.spincoders.cropmaster.model.ChemicalUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChemicalUsageRepositary extends JpaRepository<ChemicalUsage,Integer> {
}
