package OOP.Lec4_InterfacesAndAbstraction.LAB.Task4_SayHelloExtended;

public class Chinese extends BasePerson {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
