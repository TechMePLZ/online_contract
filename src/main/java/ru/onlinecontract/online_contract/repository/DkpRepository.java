package ru.onlinecontract.online_contract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.onlinecontract.online_contract.entity.Dkp;

@Repository
public interface DkpRepository extends JpaRepository<Dkp, Long> {
}
