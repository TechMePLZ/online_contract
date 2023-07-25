package ru.onlinecontract.online_contract.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.onlinecontract.online_contract.entity.Buyer;
import ru.onlinecontract.online_contract.entity.Car;
import ru.onlinecontract.online_contract.entity.Dkp;
import ru.onlinecontract.online_contract.entity.Seller;
import ru.onlinecontract.online_contract.repository.DkpRepository;
import ru.onlinecontract.online_contract.utility.DkpCreateServiceTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DkpService {
    @Autowired
    private DkpCreateServiceTemplate dkpCreateServiceTemplate;
    @Autowired
    private DkpRepository dkpRepository;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Long saveDkp(Buyer buyer, Seller seller, Car car) {
        dkpCreateServiceTemplate.createNewDkp(buyer, seller, car);
        return dkpRepository.save(new Dkp("pseudoLink", LocalDateTime.now().format(formatter), buyer,
                seller)).getDkpId();
    }


}
