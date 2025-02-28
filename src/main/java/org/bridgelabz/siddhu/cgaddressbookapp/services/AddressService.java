package org.bridgelabz.siddhu.cgaddressbookapp.services;

import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;
import org.bridgelabz.siddhu.cgaddressbookapp.entity.AddressEntity;
import org.bridgelabz.siddhu.cgaddressbookapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<AddressEntity> getAddresses(){
        return addressRepository.findAll();
    }

    public AddressEntity getAddress(Long id){
        return addressRepository.findById(id).get();
    }

    public AddressEntity addAddress( AddressDTO addressDTO){
        return addressRepository.save(new AddressEntity(addressDTO));
    }

    public AddressEntity updateAddress(Long id, AddressDTO addressDTO){
        AddressEntity temp = addressRepository.findById(id).orElse(null);
        if(temp != null){
            temp.setCity(addressDTO.getCity());
            temp.setCountry(addressDTO.getCountry());
            temp.setZipCode(addressDTO.getZipCode());
            return addressRepository.save(temp);
        }
        return  null;
    }

    public String deleteAddress(Long id){
        AddressEntity addressEntity = addressRepository.findById(id).orElse(null);
        if(addressEntity != null){
            addressRepository.delete(addressEntity);
            return "Successfully delete address with id "+id;
        }
        return "Address with id "+id+" does not exist !";

    }


}
