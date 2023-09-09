package Controlers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {
    /**
     * Безопасность по типам
     */
    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачена зарплата " + salary + "р.");
    }
    /**
     * Обобщенный метод averageAge для подсчета среднего возраста студентов, учителей и работников
     */
    public static <T extends Person> double averageAge(List<T> persons){
        int sum=0;
        for(T person : persons){
            sum += person.getAge();
        }
        return (double) sum/persons.size();
    }    
}
