package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

/**
 * Сделан вариант класса ModelClassHash с хранилищем типа HashMap<Long,Student>, подключен к нему интерфейс iGetModel. Класс подключен к контроллеру.
 */
public class ModelClassHash implements iGetModel {

    private Map<Long,Student> studentMap;

    public ModelClassHash(){
        this.studentMap = new HashMap<Long,Student>();
    }

    
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudents'");
    }

    @Override
    public void deleteStudent(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }    
}
