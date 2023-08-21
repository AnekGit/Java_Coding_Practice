package design_patterns.behavioral.state_design;

/**
 * created by ANEK on Sunday 5/8/2022 at 12:34 PM
 */

public interface GateState {
    void enter();
    void pay();
    void payOk();
    void payFailed();
}
