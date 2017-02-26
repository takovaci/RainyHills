package rainyhills.ws.resp;

import java.io.Serializable;

public class GetRainyHillsVolumeResp implements Serializable{

	private static final long serialVersionUID = 7074316848498476419L;
	private int volume;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
