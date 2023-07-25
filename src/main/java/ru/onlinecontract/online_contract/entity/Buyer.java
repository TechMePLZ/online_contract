package ru.onlinecontract.online_contract.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buyerId;
    private String buyerFullName;
    private String buyerAddress;
    private String buyerRegAddress;
    private String buyerPassportSerial;
    private String buyerPassportNumber;
    private String buyerPassportCreatedAt;
    private String createdAt;
    @OneToMany
    private List<Dkp> listDkp;

    public Buyer(String buyerFullName, String buyerAddress, String buyerRegAddress, String buyerPassportSerial,
                 String buyerPassportNumber, String byuerPassportCreatedAt, String createdAt) {
        this.buyerFullName = buyerFullName;
        this.buyerAddress = buyerAddress;
        this.buyerRegAddress = buyerRegAddress;
        this.buyerPassportSerial = buyerPassportSerial;
        this.buyerPassportNumber = buyerPassportNumber;
        this.buyerPassportCreatedAt = byuerPassportCreatedAt;
        this.createdAt = createdAt;
    }
}
