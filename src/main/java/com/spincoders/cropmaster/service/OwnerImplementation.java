package com.spincoders.cropmaster.service;

import com.spincoders.cropmaster.model.Owner;
import com.spincoders.cropmaster.repositary.OwnerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerImplementation implements OwnerService {

    @Autowired
    private OwnerRepositary ownerRepositary;

    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepositary.save(owner);
    }
}
