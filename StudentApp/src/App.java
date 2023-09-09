import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controlers.AccountController;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Мишель", 20);
        Student s8 = new Student("Айдар", 22);
        Student s9 = new Student("Элла", 23);
        Student s10 = new Student("Том", 25);
        Student s11 = new Student("Кевин", 20);
        Student s12 = new Student("Оскар", 21);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud1.add(s5);
        listStud1.add(s6);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud1.add(s7);
        listStud1.add(s8);
        listStud1.add(s9);
        listStud1.add(s10);
        listStud1.add(s11);

        List<Student> listStud4 = new ArrayList<Student>();
        listStud1.add(s12);

        StudentGroup group5123 = new StudentGroup(listStud1,5123);        
        StudentGroup group5124 = new StudentGroup(listStud2, 5124);
        StudentGroup group5125 = new StudentGroup(listStud3, 5125);
        StudentGroup group5126 = new StudentGroup(listStud4, 5126);


        // for (Student s : group5123) {
        //     System.out.println(s);
        // }

        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group5123);
        listGroup1.add(group5124);

        List<StudentGroup> listGroup2 = new ArrayList<StudentGroup>();
        listGroup2.add(group5125);
        listGroup2.add(group5126);
        
        StudentSteam steam109 = new StudentSteam(listGroup1,109);
        StudentSteam steam110 = new StudentSteam(listGroup1,110);
        System.out.println("Существуют следующие потоки групп студентов: " + steam109 + " и " + steam110);
        System.out.println("");
        
        /**
         * Вывели через for несколько групп со списком студентов
         */
        // for (StudentGroup g : listGroup1) {
        //     System.out.println(g);
        //     System.out.println("");
        //     for (Student s : group5123) {
        //         System.out.println(s);
        //     }
        //     System.out.println("--------------------");
        //     for (Student s : group5124) {
        //         System.out.println(s);
        //     }     
        // }   
         
       

        System.out.println("_____________________________________________________________");
        System.out.println("СОРТИРОВКА");
        System.out.println("_____________________________________________________________");
        
        
        Collections.sort(steam109.getSteam());

        for (StudentGroup x : steam109) {
            System.out.println(x);
        }

        // Collections.sort(group5123.getGroup());

        // for(Student s : group5123) {
        //     System.out.println(s);  
        // }
        
        /**
         * Сравнение через Comparator   
         */
        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");

        System.out.println(new PersonComparator<Student>().compare(s1,s3));
        System.out.println(new PersonComparator<Teacher>().compare(t1, t2));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);

        AccountController.paySalary(t1, 50000); 
        
        System.out.println(AccountController.averageAge(listStud1));
    }
}