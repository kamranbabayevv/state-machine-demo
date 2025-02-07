package az.company.statemachinedemo;

import az.company.statemachinedemo.domain.Account;
import az.company.statemachinedemo.dto.AccountDto;
import az.company.statemachinedemo.repository.AccountRepository;
import az.company.statemachinedemo.service.TransitionService;
import az.company.statemachinedemo.states.AccountStatus;
import az.company.statemachinedemo.transitions.Submit;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class StateMachineDemoApplication implements CommandLineRunner {

    private final TransitionService<AccountDto> transitionService;
    private final AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(StateMachineDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account account = new Account();
        account.setBalance(BigDecimal.valueOf(1000));
        account.setOwnerName("John Doe");
        account.setAccountNumber("1234567890");
        account.setStatus(AccountStatus.DRAFT);
        accountRepository.save(account);

        transitionService.getAllowedTransitions(account.getId()).forEach(System.out::println);

        transitionService.transition(account.getId(), Submit.NAME);
    }
}
