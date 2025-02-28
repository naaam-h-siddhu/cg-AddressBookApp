package org.bridgelabz.siddhu.cgaddressbookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;

@Entity
@Data
@NoArgsConstructor
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String city;
    private Long zipCode;
    private String country;

    public AddressEntity(AddressDTO addressDTO){
        this.city =addressDTO.getCity();
        this.country = addressDTO.getCountry();
        this.zipCode = addressDTO.getZipCode();

    }


}
