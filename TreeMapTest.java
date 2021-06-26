import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Movie
{
	String actorName;
	String movieName;
	String movieType;
	String rating;
	
	public Movie(String actorName, String movieName, String movieType, String rating) {
		super();
		this.actorName = actorName;
		this.movieName = movieName;
		this.movieType = movieType;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Country [actorName=" + actorName + ", movieName=" + movieName + ", movieType="
				+ movieType + ", rating=" + rating + "]";
	}

}
public class TreeMapTest {
	public static void main(String[] args) {
		
		TreeMap<String,Movie> tm = new TreeMap<String,Movie>();
		
		Movie a = new Movie("Shahrukh khan", "Ra-one", "Action", "Flow");
		Movie b = new Movie("salman khan", "Ek tha Tiger", "Action- Romance", "Hit");
		Movie c = new Movie("Akshay Kumar", "Hera Pheri", "Comedy", "average");
		Movie d = new Movie("Ranvir Singh", "Padmavat", "Historic", "superHit");
		
		// Adding element use (put)
		tm.put("Shahrukh",a);
		tm.put("salman",b);
		tm.put("Akshay",c);
		tm.put("Ranvir",d);
	
		System.out.println("Retrieving the Elements");
		
		Set<String> allKeys = tm.keySet();
		Iterator<String> keyIter = allKeys.iterator();
		while(keyIter.hasNext()) {
			String actualKey = keyIter.next();
			Movie mv = tm.get(actualKey);
			System.out.println("The Country : "+mv);
		}
		System.out.println("================");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter key : ");
		String key = scan.nextLine();
		
		if(tm.containsKey(key)) {
			Movie Actor = tm.get(key);
			System.out.println("Actor  : "+Actor);
		}
		else {
			System.out.println("Key not found "+key);
		}
	}
}
