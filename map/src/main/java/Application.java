import java.util.*;

public class Application {

  public static void main(String[] args) {
    Map<String, Integer> studentList = new HashMap<>();
    studentList.put("Linda", 18);
    studentList.put("Cindy", 19);
    studentList.put("Mary", 19);
    Teacher teacher = new Teacher("Bob", studentList);
    teacher.addStudent(new Student("Ben", 19));
    teacher.addStudent(new Student("Solider", 20));
    for (String key : studentList.keySet()) {
      String name = key;
      int age = studentList.get(key);
      System.out.println(key + "，今年" + age + "岁。");
    }
  }
}
