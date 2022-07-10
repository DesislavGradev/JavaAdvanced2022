package OOP.Lec4_InterfacesAndAbstraction.LAB.Task3_SayHello;

public class European implements Person {

    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
