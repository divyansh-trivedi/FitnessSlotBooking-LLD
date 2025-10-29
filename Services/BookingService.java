package Services;

import java.time.LocalDate;
import java.util.List;

import Models.Slot;
import Repository.UserBookingRepository;
import Repository.SlotRepository;

public class BookingService{
    private final SlotRepository slotRepo;
    private final UserBookingRepository userRepo;

    public BookingService(SlotRepository slotRepo, UserBookingRepository userRepo){
        this.slotRepo = slotRepo;
        this.userRepo = userRepo;
    }

    public string addSlot(Slot slot){
        if(slot.Repo.add(Slot))
    }
}
