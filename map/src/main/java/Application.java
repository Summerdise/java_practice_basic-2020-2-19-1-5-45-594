import java.util.*;

public class Application {

  public static void main(String[] args) {
    Map<Integer,List> studentMap = new HashMap<>();
    List<Student> studentsAge18 = new ArrayList<>();
    List<Student> studentsAge19 = new ArrayList<>();
    studentsAge18.add(new Student("Linda", 18));
    studentsAge19.add(new Student("Cindy", 19));
    studentsAge19.add(new Student("Mary", 19));
    studentMap.put(18,studentsAge18);
    studentMap.put(19,studentsAge19);
    Teacher teacher = new Teacher("Bob", studentMap);
    teacher.addStudent(new Student("Ben", 19));
    teacher.addStudent(new Student("Solider", 20));
    for (int age : teacher.getStudentMap().keySet()) {
      List<Student> student = teacher.getStudentMap().get(age);
      for (Student value : student) {
        String name = value.getName();
        System.out.println(name + "，今年" + age + "岁。");
      }

    }
  }
}
