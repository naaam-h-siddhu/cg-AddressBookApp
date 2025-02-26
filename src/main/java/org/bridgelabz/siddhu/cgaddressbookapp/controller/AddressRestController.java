package org.bridgelabz.siddhu.cgaddressbookapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressRestController {

    // get all the addresses
    @GetMapping()
    public String getAddresses(){
        return "List of Address";
    }

    //get the address by id
    @GetMapping("{id}")
    public String getAddress(@PathVariable Long id){
        return "Details of address id = "+id;
    }

    // add the address
    @PostMapping("/add/{id}")
    public String addAddress(@PathVariable Long id){
        return "Successfully added the address of id "+id;
    }

    //update the adddress
    @PutMapping("/update/{id}")
    public String updateAddress(@PathVariable Long id){
        return "Successfully update the address of id "+id;
    }

    // delete the address
    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Long id){
        return "Successfully deleted the address of id "+id;
    }


}
