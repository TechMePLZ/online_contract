package ru.onlinecontract.online_contract.dto.requestDto;

import lombok.Data;
import ru.onlinecontract.online_contract.dto.buyer.BuyerDto;
import ru.onlinecontract.online_contract.dto.seller.SellerDto;
import ru.onlinecontract.online_contract.entity.Car;

@Data
public class RequestDto {
    private SellerDto sellerDto;
    private BuyerDto  buyerDto;
    private Car car;
}
