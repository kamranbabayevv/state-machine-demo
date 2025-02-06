package az.company.statemachinedemo.service;

import java.util.List;

public interface TransitionService<T> {

    T transition(Long id, String transition);

    public List<String> getAllowedTransitions(Long id);
}
