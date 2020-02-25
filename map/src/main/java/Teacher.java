import java.util.*;

public class Teacher {
    String name;
    Map<Integer, List> studentMap;

    public Teacher() {
    }

    public Teacher(String name, Map<Integer, List> studentMap) {
        this.name = name;
        this.studentMap = studentMap;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, List> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, List> studentMap) {
        this.studentMap = studentMap;
    }

    public void addStudent(Student student) {
        int age = student.getAge();
        List<Student> studentList;
        if(studentMap.containsKey(age)){
            studentList = studentMap.get(age);
            studentList.add(student);
        } else{
            studentList = new ArrayList<>();
            studentList.add(student);
        }
        studentMap.put(age,studentList);
    }
}
