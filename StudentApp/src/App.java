import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;

public class App {
    public static void main(String[] args) throws Exception {
       Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        
        StudentGroup group5123 = new StudentGroup(listStud, 5123);
        System.out.println(group5123);

        for(Student s : group5123) {
            System.out.println(s);  
        }
        
        System.out.println("Группа отсортирована");

        Collections.sort(group5123.getGroup());

        for(Student s : group5123) {
            System.out.println(s);  
        }
    }
}