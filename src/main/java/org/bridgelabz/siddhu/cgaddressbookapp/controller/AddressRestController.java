package org.bridgelabz.siddhu.cgaddressbookapp.controller;

import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;
import org.bridgelabz.siddhu.cgaddressbookapp.entity.AddressEntity;
import org.bridgelabz.siddhu.cgaddressbookapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    @Autowired
    AddressRepository addressRepository;

    // get all the addresses
    @GetMapping()
    public List<AddressEntity> getAddresses(){
        return addressRepository.findAll();
    }

    //get the address by id
    @GetMapping("{id}")
    public AddressEntity getAddress(@PathVariable Long id){
        return addressRepository.findById(id).get();
    }

    // add the address
    @PostMapping("/add")
    public AddressEntity addAddress(@RequestBody AddressDTO addressDTO ){
        AddressEntity addressEntity = new AddressEntity(addressDTO);
        return addressRepository.save(addressEntity);
    }

    //update the adddress
    @PutMapping("/update/{id}")
    public AddressEntity updateAddress(@PathVariable Long id, @RequestBody AddressDTO addressDTO){
       AddressEntity tempAddress = addressRepository.findById(id).orElse(null);
       if(tempAddress != null){
           tempAddress.setCity(addressDTO.getCity());
           tempAddress.setZipCode(addressDTO.getZipCode());
           tempAddress.setCountry(addressDTO.getCountry());
           return addressRepository.save(tempAddress);
       }
       return null;
    }

    // delete the address
    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id){
        AddressEntity addressEntity = addressRepository.findById(id).orElse(null);
        if(addressEntity != null){
            addressRepository.delete(addressEntity);

            return "Successfully delete address with id "+id;
        }
        return "Address with id "+id+" does not exist!";

    }




}
