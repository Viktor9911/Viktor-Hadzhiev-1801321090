Feature: Make a registration

Scenario: Valid Reservation
 Given User opens screen for reservations
 When User enters information about him
 And Choose movie "Inception", "11"
 And Make reservation at "10"
 Then See message "You have made a successful reservation"

Scenario: Invalid Reservation because it was made too late
 Given User opens screen for reservations
 When User enters information about him
 And Choose movie "Inception", "11"
 And Make reservation at "11"
 Then See message "Invalid reservation. Your reservation must be 60 min before the beginning of the movie"

Scenario: Invalid Reservation because the starting hour of the movie is incorect
 Given User opens screen for reservations
 When User enters information about him
 And Choose movie "Inception", "12"
 And Make reservation at "10"
 Then See message "Incorrect movie time or name"

Scenario: Invalid Reservation with different movie name
 Given User opens screen for reservations
 When User enters information about him
 And Choose movie "Incaption", "11"
 And Make reservation at "10"
 Then See message "Incorrect movie time or name"

Scenario: Invalid Reservation with empty movie
 Given User opens screen for reservations
 When User enters information about him
 And Choose movie "", ""
 And Make reservation at "10"
 Then See message "There is no movie name"
 
 