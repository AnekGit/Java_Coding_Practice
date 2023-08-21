package design_patterns.behavioral.state_design;

/**
 * created by ANEK on Sunday 5/8/2022 at 12:33 PM
 */

public class Client {
    public static void main(String[] args) {

        GateContext gateContext = new GateContext(new ClosedGateState());    

    }
}
