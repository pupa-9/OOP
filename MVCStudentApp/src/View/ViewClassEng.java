package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Сделан вариант класса ViewClassEng с текстом на английском языке, подключен к нему интерфейс iGetView. Класс ViewEng подключен к контроллеру.
 */

public class ViewClassEng implements iGetView {

    public void printAllStudent(List<Student> students)
    {
        System.out.println("----------- Students list -----------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    @Override
    public void deleteStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }
}

   