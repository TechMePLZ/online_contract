package ru.onlinecontract.online_contract.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Dkp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dkpId;
    private String dkpLink;
    private String createdAt;
    @ManyToOne
    @JoinColumn(name = "buyerId")
    private Buyer buyer;
    @ManyToOne
    @JoinColumn(name = "sellerId")
    private Seller seller;


    public Dkp(String dkpLink, String createdAt, Buyer buyer, Seller seller) {
        this.dkpLink = dkpLink;
        this.createdAt = createdAt;
        this.buyer = buyer;
        this.seller = seller;
    }
}
