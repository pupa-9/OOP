package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable <Student>, Comparable <StudentGroup> {
    private List <Student> group;
    private int groupId;
    
    public StudentGroup(List<Student> group, int groupId) {
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Группа № "+ groupId;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        System.out.println(this.getGroup() + " - " + o.getGroup());
        if (this.getGroupId() == o.getGroupId()) {
            return 0;
        }
        else if (this.getGroupId() > o.getGroupId()) {
            return 1;
        }
        else return -1;
        
    }
}
