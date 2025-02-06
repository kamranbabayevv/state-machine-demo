package az.company.statemachinedemo.service;

import az.company.statemachinedemo.states.AccountStatus;

public interface Transition<T> {

    String getName();

    AccountStatus getTargetStatus();

    //This should do required pre processing
    void applyProcessing(T account);
}
