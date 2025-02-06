package az.company.statemachinedemo.events;


import az.company.statemachinedemo.dto.AccountDto;
import az.company.statemachinedemo.states.AccountStatus;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class AccountTransitionedEvent extends ApplicationEvent {

    private final AccountDto accountDto;
    private final AccountStatus accountStatus;

    public AccountTransitionedEvent(Object source, AccountStatus accountStatus, AccountDto accountDto) {
        super(source);
        this.accountDto = accountDto;
        this.accountStatus=accountStatus;

    }

}

