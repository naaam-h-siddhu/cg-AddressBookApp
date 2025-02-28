package org.bridgelabz.siddhu.cgaddressbookapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AddressDTO {


    private String city;
    private Long zipCode;
    private String country;

    public AddressDTO(String city,Long zipCode,String country){
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;

    }
}
