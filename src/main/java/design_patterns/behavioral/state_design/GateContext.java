package design_patterns.behavioral.state_design;

/**
 * created by ANEK on Sunday 5/8/2022 at 12:34 PM
 */

public class GateContext {

    private GateState gateState ;

    public GateContext(GateState initialGateState){
        this.gateState = initialGateState;
    }
    void enter(){
        gateState.enter();
    }
    void pay(){
        gateState.pay();
    }
    void payOk(){
        gateState.payOk();
    }
    void payFailed(){
        gateState.payFailed();
    }

}
