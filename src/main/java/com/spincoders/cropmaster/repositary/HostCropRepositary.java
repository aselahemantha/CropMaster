package com.spincoders.cropmaster.repositary;

import com.spincoders.cropmaster.model.HostCrop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostCropRepositary extends JpaRepository<HostCrop, Integer> {
}
