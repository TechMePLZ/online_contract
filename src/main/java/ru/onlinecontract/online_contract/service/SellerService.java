package ru.onlinecontract.online_contract.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.onlinecontract.online_contract.dto.seller.SellerDto;
import ru.onlinecontract.online_contract.entity.Seller;
import ru.onlinecontract.online_contract.repository.SellerRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Seller createSeller(SellerDto sellerDto){
        Seller seller = sellerRepository.save(new Seller(sellerDto.getFullName(), sellerDto.getAddress(), sellerDto.getRegAddress(),
                sellerDto.getPassportSerial(), sellerDto.getPassportNumber(), sellerDto.getPassportCreatedAt(), LocalDateTime.now().format(formatter)));
      log.info("Продавец создан с id = {}", seller.getSellerId());
      return seller;
    }

}
