package ru.onlinecontract.online_contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.onlinecontract.online_contract.entity.Buyer;

@Repository
public interface ByuerRepository extends JpaRepository<Buyer, Long> {
}
