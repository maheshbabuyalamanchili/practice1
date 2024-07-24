package OPPS_PRINCIPLES.Inheritance.Example_inheritance_interface;

public interface Iadmin extends Iguest,Ideveloper {
    public void read();
    public void write();
    public void manage();
}
