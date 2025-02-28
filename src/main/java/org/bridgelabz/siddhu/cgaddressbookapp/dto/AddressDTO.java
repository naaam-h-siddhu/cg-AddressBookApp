package org.bridgelabz.siddhu.cgaddressbookapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AddressDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String city;
    Long zipCode;
    String country;

    public AddressDTO(String city,Long zipCode,String country){
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;

    }
}
