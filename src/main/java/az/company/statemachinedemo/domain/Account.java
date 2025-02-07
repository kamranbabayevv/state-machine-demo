package az.company.statemachinedemo.domain;

import az.company.statemachinedemo.states.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AccountStatus status;

    private String accountNumber;

    private String ownerName;

    private BigDecimal balance;
}

