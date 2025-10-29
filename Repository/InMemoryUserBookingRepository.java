package Repository;

import java.util.*;
// import java.util.concurrent.ArrayBlockingQueue;

import Models.Slot;

public class InMemoryUserBookingRepository implements UserBookingRepository{
    private final Map<String,List<Slot>> userBooking  = new HashMap<>();

    @Override
    public List<Slot> getUserBookings(String userId) {
        return userBooking.getOrDefault(userId, new ArrayList<>());
    }

  
    @Override
    public void addBooking(String userId, Slot slot) {
        userBooking.computeIfAbsent(userId, k-> new ArrayList<>()).add(slot);
    }

    @Override
    public void removeBooking(String userId, Slot slot) {
        List<Slot> slots = userBooking.get(userId);
        if(slots != null)slots.remove(slot);
    }
}