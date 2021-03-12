package cucumber.project.cinema;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.project.cinema.model.ReservationSreenModel;

public class ReservationFeature {

	ReservationSreenModel reservationScreenModel = new ReservationSreenModel();
	
	@Given("^User opens screen for reservations$")
	public void homeScreenModel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.OpenScreen();
	}

	@When("^User enters information about him$")
	public void userEnteringData() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.InsertUserData();
	}

	@When("^Choose movie \"([^\"]*)\", \"([^\"]*)\"$")
	public void choosingMovie(String movie, String time) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reservationScreenModel.InsertFilmData(movie, time);;
	}

	@When("^Make reservation at \"([^\"]*)\"$")
	public void makingReservation(String reservation) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    reservationScreenModel.InsertReservation(reservation);
	}

	@Then("^See message \"([^\"]*)\"$")
	public void seeMassage(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String returnMsg = reservationScreenModel.getMessage();
		assertEquals(message, returnMsg);
	}
	
}
