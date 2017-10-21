package dinnertime;
import java.*;

public class Restaurant {
	private String name; // Name of the restaurant
	private int genre = 3,   // Number of food 'genres' a restaurant can have (e.g Italian, American, Asian, etc) 
			    cuisine = 3; // Subtypes of each genre available (e.g American-Pizza, Italian-Pizza, etc)
	private String restaurantTypes[][] = new String[genre][cuisine]; // An array to carry all the restaurant types
	private String specialties[] = new String[5]; // Specialty items or sort options (delivery, take-out, alcohol, dessert)
	private double price; // Indicates the average price/person
	private int waitTime; // Average wait time from arrival to eating
	
	public Restaurant() {
		
	}
}
