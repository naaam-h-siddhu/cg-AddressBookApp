package org.bridgelabz.siddhu.cgaddressbookapp.repository;

import org.bridgelabz.siddhu.cgaddressbookapp.dto.AddressDTO;
import org.bridgelabz.siddhu.cgaddressbookapp.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
