package ru.onlinecontract.online_contract.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.onlinecontract.online_contract.dto.buyer.BuyerDto;
import ru.onlinecontract.online_contract.entity.Buyer;
import ru.onlinecontract.online_contract.repository.ByuerRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Slf4j
public class BuyerService {
    @Autowired
    private ByuerRepository byuerRepository;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    @Transactional
    public Buyer createBuyer(BuyerDto buyerDto) {
        Buyer buyer = byuerRepository.save(new Buyer(buyerDto.getFullName(), buyerDto.getAddress(), buyerDto.getRegAddress(),
                buyerDto.getPassportSerial(), buyerDto.getPassportNumber(), buyerDto.getPassportCreatedAt(),
                        LocalDateTime.now().format(formatter)));
        log.info("Покупатель создан с id = {}", buyer.getBuyerId());
        return buyer;
    }

}
