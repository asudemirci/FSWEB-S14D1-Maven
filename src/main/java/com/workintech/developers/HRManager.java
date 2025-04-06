package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }
    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Hatalı index");
            return;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = dev;
            System.out.println(dev.getName() + " added to junior team.");
        } else {
            System.out.println("Index " + index + " already occupied.");
        }
    }
    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Hatalı index");
            return;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = dev;
            System.out.println(dev.getName() + " added to mid team.");
        } else {
            System.out.println("Index " + index + " already occupied.");
        }
    }
    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Hatalı index");
            return;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = dev;
            System.out.println(dev.getName() + " added to senior team.");
        } else {
            System.out.println("Index " + index + " already occupied.");
        }
    }
    @Override
    public void work() {
        System.out.println(getName() + " is managing hiring and developers.");
    }
}
