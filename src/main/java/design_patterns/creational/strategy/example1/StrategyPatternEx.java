package design_patterns.creational.strategy.example1;

/**
 * created by ANEK on Monday 5/2/2022 at 1:42 PM
 */

public class StrategyPatternEx {

    public static void main(String[] args) {

        Role role = new Consultant();
        Role role1 = new SeniorConsultant();

        Employee emp = new Employee("anek",role);

        emp.execute();
        emp.promote(role1);

        System.out.println("promoting employee ...now role is");
        emp.execute();


    }
}
