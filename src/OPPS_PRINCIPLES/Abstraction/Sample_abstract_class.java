package OPPS_PRINCIPLES.Abstraction;

import OPPS_PRINCIPLES.Abstraction_class.LAP;

public abstract class Sample_abstract_class implements LAP {
    public void keyboard() {
        System.out.println("aa keyboard code");
    }


    public void mouse() {
        System.out.println("aa mouse code");
    }

    public abstract void cpu();

    public  abstract void printer();
}
