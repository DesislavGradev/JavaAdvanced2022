package university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        if (getStudentCount() < capacity) {
            if ((getStudent(student.getFirstName(), student.getLastName()) != null)) {
                return "Student is already in the university";
            }
            students.add(student);
            return "Added student " + student.getFirstName() + " " + student.getLastName();
        }
        return "No seats in the university";
    }


    public String dismissStudent(Student student) {
        Student foundStudent = getStudent(student.getFirstName(), student.getLastName());
        if (foundStudent != null) {
            students.remove(student);
            return "Removed student " + foundStudent.getFirstName() + " " + foundStudent.getLastName();
        }
        return "Student not found";
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
            return students.stream()
                            .map(e -> String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s",
                                    e.getFirstName(), e.getLastName(), e.getBestSubject()))
                    .collect(Collectors.joining(System.lineSeparator()));
    }
}
