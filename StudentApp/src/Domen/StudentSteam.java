package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable <StudentGroup>{
    private List<StudentGroup> steam;
    private int steamNum;
    
    public StudentSteam(List<StudentGroup> steam, int steamNum) {
        this.steam = steam;
        this.steamNum = steamNum;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public int getSteamNum() {
        return steamNum;
    }

    public void setSteamNum(int steamNum) {
        this.steamNum = steamNum;
    }

    @Override
    public String toString() {
        return "Поток № "+ steamNum;
    }
    
    @Override
    public Iterator<StudentGroup> iterator() { 
        return new GroupIterator(steam);
    }

    
}

