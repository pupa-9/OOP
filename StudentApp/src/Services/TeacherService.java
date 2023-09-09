package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService  implements iPersonService<Teacher>{
    private int count;
    private List<Teacher> teachers; 

    public TeacherService(){
        this.teachers = new ArrayList<>();

    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher tch = new Teacher(name, age, name);
        count++;
        teachers.add(tch);
    }

    public void sortByFIO(){
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>(); 
        teachers.sort(persComp);
    } 
}
