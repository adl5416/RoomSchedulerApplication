
import java.sql.Date;
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shado
 */
public class ReservationEntry {

    public String getFaculty() {
        return faculty;
    }

    public String getRoom() {
        return room;
    }

    public int getSeats() {
        return seats;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public ReservationEntry(String faculty, String room, DateEntry date, int seats, Timestamp timestamp) {
        this.faculty = faculty;
        this.room = room;
        this.date = date;
        this.seats = seats;
        this.timestamp = timestamp;

    }
    String faculty;
    String room;
    DateEntry date;

    public DateEntry getDate() {
        return date;
    }
    int seats;
    Timestamp timestamp;
}
