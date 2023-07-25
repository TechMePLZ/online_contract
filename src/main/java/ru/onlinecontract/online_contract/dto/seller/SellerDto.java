package ru.onlinecontract.online_contract.dto.seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class SellerDto {
    private String fullName;
    private String address;
    private String regAddress;
    private String passportSerial;
    private String passportNumber;
    private String passportCreatedAt;
}
