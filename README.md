# 🏋️‍♀️ Fitness Slot Booking System (LLD)

This project is a **Low-Level Design (LLD)** implementation of a **Fitness Slot Booking System** — allowing users to book, cancel, and list fitness session slots.  
It was developed under the guidance of **Kartik Sapra Sir**.

---

## 📘 Overview

The goal of this project is to simulate a **CLI-based Fitness Booking System** where users can:

- Add new workout slots (e.g., Yoga, HIIT)
- View available slots by date
- Book or cancel their participation
- List their active bookings

The design follows **clean architecture principles**, using:
- Controllers
- Services
- Repositories
- Models

This ensures modularity, separation of concerns, and easy scalability.

---

## 🧩 Project Structure
📁 FitnessSlotBookingLLD
 ┣ 📂 Controllers
 ┃ ┗ 📄 FitnessBookingCLI.java → CLI entry point and user interaction
 ┣ 📂 Models
 ┃ ┗ 📄 Slot.java → Represents a fitness slot (id, title, time, capacity)
 ┣ 📂 Repository
 ┃ ┣ 📄 InMemorySlotRepository.java → Stores slots in memory
 ┃ ┗ 📄 InMemoryUserBookingRepository.java → Manages user-slot relationships
 ┣ 📂 Services
 ┃ ┗ 📄 BookingService.java → Core business logic for booking, cancelling, and listing
 ┗ 📄 README.md → Project documentation


## ⚙️ Features

✅ **Add Slot** – Create new time slots for workouts  
✅ **List Slots** – View all slots or those on a specific date  
✅ **Book Slot** – Users can book an available slot  
✅ **Cancel Booking** – Users can cancel their existing bookings  
✅ **View Bookings** – Users can list all their current bookings  

---

## 🧠 Command Format (CLI)

You can interact with the system using the following commands:

| Command | Description | Example |
|----------|--------------|----------|
| `ADD_SLOT <slotId> <title> <start> <end> <capacity>` | Add a new fitness slot | `ADD_SLOT S1 Yoga 2025-09-01T07:00 2025-09-01T08:00 2` |
| `LIST_SLOTS [date]` | List all slots or slots for a given date | `LIST_SLOTS 2025-09-01` |
| `BOOK <userId> <slotId>` | Book a slot for a user | `BOOK u1 S1` |
| `CANCEL <userId> <slotId>` | Cancel a user’s booking | `CANCEL u1 S1` |
| `LIST_BOOKINGS <userId>` | Show all bookings for a user | `LIST_BOOKINGS u1` |
| `exit` | Exit the CLI | `exit` |

---

## 🧾 Example Session

### Input:


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


### Output (Sample):


Slot added successfully: S1
Slot added successfully: S2
S1 Yoga 07:00-08:00 capacity=2 booked=0
S2 HIIT 08:00-09:00 capacity=1 booked=0
Booking successful
Booking successful
Slot full
Booking successful
u1 -> [S1 2025-09-01T07:00-2025-09-01T08:00, S2 2025-09-01T08:00-2025-09-01T09:00]
Booking cancelled
S1 Yoga 07:00-08:00 capacity=2 booked=1
S2 HIIT 08:00-09:00 capacity=1 booked=1
Booking successful
u3 -> [S1 2025-09-01T07:00-2025-09-01T08:00]
Error: User not found or booking does not exist
S1 Yoga 07:00-08:00 capacity=2 booked=2
S2 HIIT 08:00-09:00 capacity=1 booked=1


---

## 🏗️ Design Approach

The system follows **object-oriented principles**:

- **Controller Layer:** Handles CLI input/output and user interaction.
- **Service Layer:** Encapsulates business logic (validations, booking rules).
- **Repository Layer:** Manages in-memory data persistence for slots and bookings.
- **Model Layer:** Defines entities like `Slot`.

This separation ensures that:
- Business logic is independent of input type (CLI/UI/REST API).
- Code is extendable and testable.

---

## 👨‍🏫 Mentor

This project was created under the guidance of **Kartik Sapra Sir**,  
who provided insights into software design patterns and clean architecture.

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Data Storage:** In-Memory Repositories  
- **Architecture:** Layered (Controller → Service → Repository → Model)  
- **CLI Interface:** For command-line based interaction

---

## 🚀 Future Enhancements

- Add persistence using a database (e.g., MySQL, MongoDB)
- Add user authentication and role-based access
- Expose REST APIs 
- Add slot conflict detection and waitlist management

---
