import java.util.ArrayList;
import java.util.Iterator;

public class CricketTeam {

	String country;
	String players;
	
	@Override
	public String toString() {
		return "CricketTeam [country=" + country + ", players=" + players + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlayers() {
		return players;
	}

	public void setPlayers(String players) {
		this.players = players;
	}

	public CricketTeam(String country, String players) {
		super();
		this.country = country;
		this.players = players;
	}
	
}

 class CricketTest{

	 public static void main(String args[]) {
		 
		 CricketTeam cric = new CricketTeam("India","11Players");
		 CricketTeam cric1 = new CricketTeam("Australia","11Players");
		 CricketTeam cric2 = new CricketTeam("New Zealand","11Players");
		 CricketTeam cric3 = new CricketTeam("England","11Players");
		 CricketTeam cric4 = new CricketTeam("west Indies","11Players");
		 
		 ArrayList al = new ArrayList();
		 
		 al.add(cric);
		 al.add(cric1);
		 al.add(cric2);
		 al.add(cric3);
		 al.add(cric4);
		 
		 Iterator it = al.iterator();
		 
		 while(it.hasNext()) {
			 
			 Object o = it.next();
			 
			 CricketTeam x = (CricketTeam) o;
			 System.out.println("Cricket Team :" +x);
		 }
		 
	 }
}

 
 
 
 
 