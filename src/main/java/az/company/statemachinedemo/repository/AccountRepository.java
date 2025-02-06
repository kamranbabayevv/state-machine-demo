package az.company.statemachinedemo.repository;

import az.company.statemachinedemo.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
