import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private static LocalDate arrivalDate;
	private static LocalDate departureDate; 
	public final static double nightlyRate=145.00;

	public Reservation() {
		//empty class
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		//this.arrivalDate = arrivalDate; Though this object instance seems to work, below constructor is appropriate for Static methods
		Reservation.arrivalDate = arrivalDate; // Static methods - use Class rather than an object instance
		Reservation.departureDate = departureDate;	
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public static String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
				FormatStyle.LONG);  //other options SHORT, MEDIUM or FULL      
		return dtf.format(arrivalDate);
	}    

	public void setArrivalDate(LocalDate arrivalDate) {
		Reservation.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public static String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
				FormatStyle.LONG);        
		return dtf.format(departureDate);
	}    

	public void setDepartureDate(LocalDate departureDate) {
		Reservation.departureDate = departureDate;
	}
	//biz logic below
	public static  int getnumNights() {

		int numNights=(int) ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return numNights;
	}
	public final static double getNightlyRate() { //why do I have this method here if it is defined above?

		return nightlyRate;
	}

	public static double getTotalPrice() {

		int numNights=(int) ChronoUnit.DAYS.between(arrivalDate, departureDate);
		double totalPrice=(numNights*nightlyRate);//why without the line above, numNights can't see the numNightsin the getNights?
		return totalPrice;
	}
	//format TotalPrice and nightlyRate below
	public static String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotalPrice());
	}
	public static  String getNightlyRateFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getNightlyRate());
	}

}
