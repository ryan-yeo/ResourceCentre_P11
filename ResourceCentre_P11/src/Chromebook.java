
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	// Vanessa's part done ->
	public String toString(){
		String output = "";
		
		// Write your codes here
		output = super.toString();
		return String.format("%-63s %-20d", output, getOs());
	}
}


