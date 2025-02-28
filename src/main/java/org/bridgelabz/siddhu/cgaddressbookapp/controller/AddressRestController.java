package org.bridgelabz.siddhu.cgaddressbookapp.controller;

import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;
import org.bridgelabz.siddhu.cgaddressbookapp.entity.AddressEntity;
import org.bridgelabz.siddhu.cgaddressbookapp.repository.AddressRepository;
import org.bridgelabz.siddhu.cgaddressbookapp.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    @Autowired
    private AddressService addressService;

    // get all the addresses
    @GetMapping()
    public List<AddressEntity> getAddresses(){
        return addressService.getAddresses();
    }

    //get the address by id
    @GetMapping("{id}")
    public AddressEntity getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }

    // add the address
    @PostMapping("/add")
    public AddressEntity addAddress(@RequestBody AddressDTO addressDTO ){
        return addressService.addAddress(addressDTO);
    }

    //update the adddress
    @PutMapping("/update/{id}")
    public AddressEntity updateAddress(@PathVariable Long id, @RequestBody AddressDTO addressDTO){
        return addressService.updateAddress(id,addressDTO);
    }

    // delete the address
    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id){

        return addressService.deleteAddress(id);

    }




}
