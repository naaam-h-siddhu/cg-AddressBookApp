package org.bridgelabz.siddhu.cgaddressbookapp.repository;

import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressDTO,Long> {
}
