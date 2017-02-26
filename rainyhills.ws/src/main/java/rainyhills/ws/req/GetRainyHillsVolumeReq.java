package rainyhills.ws.req;

import java.io.Serializable;

public class GetRainyHillsVolumeReq implements Serializable {

	private static final long serialVersionUID = -4901529518534937934L;

	private int[] hillsHights;

	public int[] getHillsHights() {
		return hillsHights;
	}

	public void setHillsHights(int[] hillsHights) {
		this.hillsHights = hillsHights;
	}

	
}
