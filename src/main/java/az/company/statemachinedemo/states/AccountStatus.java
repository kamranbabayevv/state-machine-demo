package az.company.statemachinedemo.states;

import az.company.statemachinedemo.transitions.Approve;
import az.company.statemachinedemo.transitions.Notify;
import az.company.statemachinedemo.transitions.Reject;
import az.company.statemachinedemo.transitions.Submit;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum AccountStatus {

    DRAFT(Submit.NAME),
    IN_REVIEW(Approve.NAME, Reject.NAME),
    APPROVED(Approve.NAME, Notify.NAME),
    NOTIFIED();

    private final List<String> transitions;

    AccountStatus(String... transitions) {
        this.transitions = Arrays.asList(transitions);
    }
}
