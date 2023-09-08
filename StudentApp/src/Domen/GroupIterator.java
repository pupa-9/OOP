package Domen;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> steam;
    
    public GroupIterator(List<StudentGroup> steam) {
        this.steam = steam;
    }
    
    @Override
    public boolean hasNext() {
       return count<steam.size();
    }
    @Override
    public StudentGroup next() {
        count++;
        return steam.get(count-1);  
    }
    
}

