package Models;

import java.time.LocalDateTime;;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;

public class Slot{
    private final String slotId;
    private final String title;
    private final LocalDateTime start;
    private final LocalDateTime end;
    private final int capacity;
    private final Set<String> bookedUsers;

    public Slot(String slotId ,String title, LocalDateTime start,LocalDateTime end,int capacity){
        this.slotId = slotId;
        this.title = title;
        this.start = start;
        this.end = end;
        this.capacity =capacity;
        this.bookedUsers = new HashSet<>();
    }

    public String getSlotId(){ return slotId; }
    public String getTitle(){ return title; }
    public LocalDateTime getStart(){ return start;}
    public LocalDateTime getEnd(){ return end;}
    public int getCapacity(){return capacity;}
    public Set<String> getBookedUsers(){return bookedUsers;}

    public boolean addBooking(String userId){
        if(capacity > bookedUsers.size())return false;
        return bookedUsers.add(userId);
    }
    public boolean removeBooking(String userId){
        return bookedUsers.remove(userId);
    }
    public int getBookedCount(){
        return bookedUsers.size();
    }

}
// c -> r -> s ->m