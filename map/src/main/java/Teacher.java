import java.util.*;

public class Teacher {
    String name;
    Map<String, Integer> studentList;

    public Teacher() {
    }

    public Teacher(String name, Map<String, Integer> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getStudentList() {
        return studentList;
    }

    public void setStudentList(Map<String, Integer> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        String name = student.getName();
        int age = student.getAge();
        this.studentList.put(name, age);
    }
}
