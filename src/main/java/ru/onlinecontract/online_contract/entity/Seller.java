package ru.onlinecontract.online_contract.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellerId;
    private String sellerFullName;
    private String sellerAddress;
    private String sellerRegAddress;
    private String sellerPassportSerial;
    private String sellerPassportNumber;
    private String sellerPassportCreatedAt;
    private String createdAt;
    @OneToMany
    private List<Dkp> listDkp;

    public Seller(String sellerFullName, String sellerAddress, String sellerRegAddress,
                  String sellerPassportSerial, String sellerPassportNumber, String sellerPassportCreatedAt, String createdAt) {
        this.sellerFullName = sellerFullName;
        this.sellerAddress = sellerAddress;
        this.sellerRegAddress = sellerRegAddress;
        this.sellerPassportSerial = sellerPassportSerial;
        this.sellerPassportNumber = sellerPassportNumber;
        this.sellerPassportCreatedAt = sellerPassportCreatedAt;
        this.createdAt = createdAt;
    }
}
