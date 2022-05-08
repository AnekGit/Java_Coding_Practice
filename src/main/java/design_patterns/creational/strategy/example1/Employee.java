package design_patterns.creational.strategy.example1;

/**
 * created by ANEK on Monday 5/2/2022 at 5:55 PM
 */

public class Employee {
    private Role role;
    private String name;

    public Employee(String name ,Role role){
        this.name = name;
        this.role = role;
    }

    public void promote(Role promote){
        this.role = promote;
    }
    public void execute(){
        System.out.print("Emp :: "+name+" => ");
        role.resposibilities();
    }

    }
