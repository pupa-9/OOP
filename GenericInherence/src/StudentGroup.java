import java.util.Iterator;
import java.util.List;

public class StudentGroup <T extends Comparable<T>, V> implements Iterable <Student <T, V>> {
    private List <Student <T, V>> group;
    private V groupId;
    
    public StudentGroup(List<Student<T, V>> group, V groupId) {
        this.group = group;
        this.groupId = groupId;
    }

    public List<Student<T, V>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<T, V>> group) {
        this.group = group;
    }

    public V getGroupId() {
        return groupId;
    }

    public void setGroupId(V groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Группа № "+ groupId;
    }

    @Override
    public Iterator<Student<T, V>> iterator() {
        return new StudentIterator<T, V>(group);
    }
}