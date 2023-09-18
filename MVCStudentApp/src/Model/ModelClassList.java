package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    // @Override
    // public void addStudent(long id, Student student) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    // }

    @Override
    public void deleteStudent(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    } 
}