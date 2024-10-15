package table.programing.java;

import java.util.ArrayList;

public class Java {
	
	private ArrayList<String> bachakla,theNewBaghdad;
	public String level;
	
	
	public Java(ArrayList<String> firstlist,ArrayList<String> secondlist) {
		this.bachakla = firstlist;
		this.theNewBaghdad = secondlist;
	}
	
	
 public ArrayList<String> getUdemyPlaylist() {
		return bachakla;
	}
	
  public ArrayList<String> getYoutubePlaylist() {
		return theNewBaghdad;
	}
	
	

}
