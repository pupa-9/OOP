package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();
    void deleteStudent(long id);

    /**
     * Интерфейс для получения модели
     * @param id
     * @param student
     */
    

}