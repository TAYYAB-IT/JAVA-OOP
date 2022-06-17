import Classes.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class task5 {
    public static void main(String[] args) {

        Student s = new Student("1901-1", "Tayyab", 20);
        s.AddResult("Android", 80);
        s.AddResult("AI", 70);
        s.AddResult("ML", 60);
        s.AddResult("ToA&FL", 48);
        System.out.println("Your CGPA is " + s.GetCgpa());
        HashMap<String, Character> grades = s.GetGrades();
        System.out.println("----------------Grades-----------------");
        for (Entry<String, Character> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }
}
