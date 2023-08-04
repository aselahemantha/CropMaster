package com.spincoders.cropmaster.repositary;

import com.spincoders.cropmaster.model.MachineryUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineryUsageRepositary extends JpaRepository<MachineryUsage,Integer> {
}
