package ru.onlinecontract.online_contract.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    private String markModelCar;
    private String vin;
    private String createdAt;
    private String engineNumber;
    private String chassisNumber;
    private String bodyNumber;
    private String color;
    private String mileageInKM;
    private String registrationNumber;
    private String registrationDocNumber;
    private String registrationDocNumberCreatedAt;
    private BigDecimal price;

}
