package Controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import Models.Slot;
import Repository.InMemoryUserBookingRepository;
import Repository.InMemorySlotRepository;
import Services.BookingService;

public class FitnessBookingCLI {
    public static void main(String[] args) {
        var slotRepo = new InMemorySlotRepository();
        var userRepo = new InMemoryUserBookingRepository();
        var service = new BookingService(slotRepo, userRepo);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            S

        }
    }
}

/*    Input Type-:

            ADD_SLOT S1 Yoga 2025-09-01T07:00 2025-09-01T08:00 2
			ADD_SLOT S2 HIIT 2025-09-01T08:00 2025-09-01T09:00 1
			LIST_SLOTS 2025-09-01
			BOOK u1 S1
			BOOK u2 S1
			BOOK u3 S1
			BOOK u1 S2
			LIST_BOOKINGS u1
			CANCEL u2 S1
			LIST_SLOTS 2025-09-01
			BOOK u3 S1
			LIST_BOOKINGS u3
			CANCEL u4 S1
			LIST_SLOTS
			exit
             */