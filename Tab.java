package table;

import java.util.ArrayList;

public interface Tab {
	
	public void setSchedule(String day,String time,String matter);
	public String getSchedule();
	public void setPlaylist1();
	public void setPlaylist2();
	
	public ArrayList<String> getPlayList();

}
