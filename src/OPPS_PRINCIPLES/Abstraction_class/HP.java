package OPPS_PRINCIPLES.Abstraction_class;

public class HP extends Sample_abstract_class {

    @Override
    public void cpu() {
        System.out.println("cpu code");
    }

    @Override
    public void printer() {
        System.out.println("printer code");

    }
    public void scanner(){
        System.out.println("scanner code");
    }
}
