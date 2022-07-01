package OOP.Lec1_WorkingWithAbstraction.LAB.Task3_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void parseCommand(String[] commandParts) {
        String command = commandParts[0];
        String name = commandParts[1];
        if (command.equals("Create")) {

            int age = Integer.parseInt(commandParts[2]);
            double grade = Double.parseDouble(commandParts[3]);

            if (!students.containsKey(name)) {
                Student student = new Student(name, age, grade);
                students.put(name, student);
            }
        } else if (command.equals("Show")) {
            Student student = students.get(name);

            if (student != null) {
                System.out.println(student.getInfo());
            }
        }
    }
}
