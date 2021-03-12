package cucumber.project.cinema.service;

import java.util.ArrayList;
import java.util.List;

import cucumber.project.cinema.clases.Movie;
import cucumber.project.cinema.clases.Reservation;

public class InsertReservation {
	
	public static String Insert(String movieName,String movieTime,String reservation) {
		
		if(movieName.isEmpty() && movieTime.isEmpty()) {
			return "There is no movie name";
		}
		
		
		int reservationNum = Integer.parseInt(reservation);
		int movieTimeNum = Integer.parseInt(movieTime);
		double result = (Math.abs(movieTimeNum) - Math.abs(reservationNum));
		
		
		
		if(reservation.isEmpty()) {
			return "There is no movie name";
		}
		
		if(result <= 0.99) {
			return "Invalid reservation. Your reservation must be 60 min before the beginning of the movie";
		}
		
		List<Movie> movieList = getMovie();
		boolean checkMovie = movieList
				.stream()
				.anyMatch(movie -> movie.getMovie().equals(movieName) && movie.getTime().equals(movieTime));
		

				
		if(checkMovie && result >= 1) {
			return "You have made a successful reservation";
		}
				
		return "Incorrect movie time or name";
	}
	
	public static List<Movie> getMovie(){
		Movie movie = new Movie();
		movie.setMovie("Inception");
		movie.setTime("11");
		List<Movie> movieList = new ArrayList<>();
		movieList.add(movie);
		return movieList;
		
	}
	
	public static List<Reservation> getReservation(){
		Reservation reservation = new Reservation();
		reservation.setReservation("10");	
		List<Reservation> reservationList = new ArrayList<>();
		reservationList.add(reservation);
		return reservationList;
		
	}
}
