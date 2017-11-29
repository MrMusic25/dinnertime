package dinnertime;
import java.*;

public class Restaurant {
	private String name;     // Name of the restaurant
	private int genre = 3,   // Number of food 'genres' a restaurant can have (e.g Italian, American, Asian, etc) 
			      cuisine = 3; // Subtypes of each genre available (e.g American-Pizza, Italian-Pizza, etc)
   /*
   
      Array data format: g=genre, c=cuisine
     
       0   1   2   3
      ---------------
     | g | c | c | c | 0
     | g | c | c | c | 1
     | g | c | c | c | 2
      ---------------
      
     c can be extended in the future, as can g due to this format
     Original design, however, was to have one less g than c (due to the way multi-dimension arrays work)
   
   */   
	private String restaurantTypes[][] = new String[genre][cuisine+1]; // An array to carry all the restaurant types
	private String specialties[] = new String[5];                      // Specialty items or sort options (delivery, take-out, alcohol, dessert)
	private double price;                                              // Indicates the average price/person
	private int waitTime;                                              // Average wait time from arrival to eating
	
	public Restaurant(int inName, String data[][], String specialty[], double inPrice, int inWaitTime) {
		// Set the easy values
      name = inName;
      price = inPrice;
      waitTime = inWaitTime;
      
      // Next, cycle through the arrays
      for (int i = 0; i < genre; i++)
         for (int j = 0; j <= cuisine; j++) // cuisine declaration =+ 1
            if (data[i][j].length() < 1)
               break; // Skip blank lines
            else
               restaurantTypes[i][j] = data[i][j]; // Assumes data is already properly formatted; TODO: Error checking
            
      for (int i = 0; i < 5 /* Hard coded for now because I forgot Java */; i++)
         if (specialty[i].length() < 1)
            break;
         else
            specialties[i] = specialty[i];
	}
}
