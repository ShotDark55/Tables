package table;

import java.util.ArrayList;

import table.programing.java.Java;
import table.workout.Workout;

public class Run implements Tab{
	
	public Run(ArrayList<String> p1,ArrayList<String> p2){
		programmingLaunage = new Java(p1,p2);
		workout = new Workout();
		
	}
	private ArrayList<String> list_1,list_2;
	private Java programmingLaunage;
	private Workout workout;
	
	private String schedule; 

	@Override
	public void setSchedule(String day, String time, String matter) {
			schedule = "day : " + day + "\n";
			schedule += "time : " + time + "\n";
			schedule += "you do : " + matter; 
		
	}

	@Override
	public String getSchedule() {
		return schedule;
	}



	@Override
	public void setPlaylist1() {
		list_1 = programmingLaunage.getUdemyPlaylist();
		
		
	}

	@Override
	public void setPlaylist2() {
		list_2 = programmingLaunage.getYoutubePlaylist();
		
	}

	@Override
	public ArrayList<String> getPlayList() {
		return list_1;
	}

}
