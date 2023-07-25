package ru.onlinecontract.online_contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.onlinecontract.online_contract.dto.buyer.BuyerDto;
import ru.onlinecontract.online_contract.dto.requestDto.RequestDto;
import ru.onlinecontract.online_contract.dto.seller.SellerDto;
import ru.onlinecontract.online_contract.entity.Buyer;
import ru.onlinecontract.online_contract.entity.Car;
import ru.onlinecontract.online_contract.entity.Seller;
import ru.onlinecontract.online_contract.service.BuyerService;
import ru.onlinecontract.online_contract.service.DkpService;
import ru.onlinecontract.online_contract.service.SellerService;

@RestController
@RequestMapping("/api/v1")
public class DkpController {
    @Autowired
    private BuyerService buyerService;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private DkpService dkpService;
    @PostMapping("/dkp")
    public ResponseEntity createNewDkp(@RequestBody RequestDto requestDto){
        SellerDto sellerDto = requestDto.getSellerDto();
        BuyerDto buyerDto =requestDto.getBuyerDto();
        Car car = requestDto.getCar();
        Seller seller = sellerService.createSeller(sellerDto);
        Buyer buyer = buyerService.createBuyer(buyerDto);
        dkpService.saveDkp( buyer , seller, car);
        return ResponseEntity.ok().body("Договор купли продажи сохранен");
    }

}
