package Repository;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.LocalDate;

import Models.Slot;

public class InMemorySlotRepository implements SlotRepository{

    private final Map<String, Slot> slots = new HashMap<>();
    //S1 -> [S1, Yoga, start, end, cap]
    //S2 -> [S2, HIIT, start, end, cap]
    //S3 -> [S3, gym] --> eg given by kartik sir

    @Override
    public boolean addSlot(Slot slot) {
        if(slots.containsKey(slot.getSlotId()))return false;
        slots.put(slot.getSlotId(),slot);
        return true;
    }

    @Override
    public Optional<Slot> getSlotById(String slotId) {
       return Optional.ofNullable(slots.get(slotId));
    }

    @Override
    public List<Slot> listSlots(LocalDate date) {
        return slots.values().stream()
        .filter(s->date == null || s.getStart().toLocalDate().equals(date))
        .sorted(Comparator.comparing(Slot::getStart))
        .collect(Collectors.toList());
    }

}

