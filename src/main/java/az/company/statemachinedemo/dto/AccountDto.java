package az.company.statemachinedemo.dto;

import az.company.statemachinedemo.states.AccountStatus;
import lombok.Data;

@Data
public class AccountDto {

    private Long id;

    private AccountStatus status;
}

