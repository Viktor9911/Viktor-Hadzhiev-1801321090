package cucumber.project.cinema.clases;


import java.util.*;

/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    private User user;

    /**
     * 
     */
    private Movie movie;

    /**
     * 
     */
    private String seatNumber;

    /**
     * 
     */
    public String reservation;

    /**
     * 
     */
    private Set<User> users;

    /**
     * 
     */
    private Set<Movie> movies;

    /**
     * @return
     */

    public String getReservation() {
        // TODO implement here
        return reservation;
    }


    public void setReservation(String reservation) {
        // TODO implement here
        this.reservation = reservation;
    }

}