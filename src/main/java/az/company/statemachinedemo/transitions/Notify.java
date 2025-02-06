package az.company.statemachinedemo.transitions;


import az.company.statemachinedemo.dto.AccountDto;
import az.company.statemachinedemo.service.Transition;
import az.company.statemachinedemo.states.AccountStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Notify implements Transition<AccountDto> {
    public static final String NAME = "NOTIFY";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public AccountStatus getTargetStatus() {
        return AccountStatus.NOTIFIED;
    }

    @Override
    public void applyProcessing(AccountDto accountDto) {
        log.info("Account is transitioning to notification state {}", accountDto.getId());
    }
}
