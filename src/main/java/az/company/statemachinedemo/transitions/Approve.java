package az.company.statemachinedemo.transitions;

import az.company.statemachinedemo.dto.AccountDto;
import az.company.statemachinedemo.service.Transition;
import az.company.statemachinedemo.states.AccountStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Approve implements Transition<AccountDto> {
    public static final String NAME = "APPROVE";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public AccountStatus getTargetStatus() {
        return AccountStatus.APPROVED;
    }

    @Override
    public void applyProcessing(AccountDto accountDto) {
        log.info("Account is transitioning to approved state {}", accountDto.getId());
    }
}
