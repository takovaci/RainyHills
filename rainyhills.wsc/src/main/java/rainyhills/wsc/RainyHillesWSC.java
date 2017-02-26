package rainyhills.wsc;

import java.util.List;

import rainyhills.wsc.generated.GetRainyHillsVolumeReq;
import rainyhills.wsc.generated.GetRainyHillsVolumeResp;
import rainyhills.wsc.generated.RainyHillsWS;
import rainyhills.wsc.generated.RainyHillsWSService;

public class RainyHillesWSC {

	private static RainyHillsWS impl;

	public int getRainyHillsVolume(List<Integer> inList) {
		this.connect();
		GetRainyHillsVolumeReq req = new GetRainyHillsVolumeReq();
		req.getHillsHights().addAll(inList);
		GetRainyHillsVolumeResp rainyHillsVolume = impl.getRainyHillsVolume(req);
		return rainyHillsVolume==null?0:rainyHillsVolume.getVolume();

	}

	private void connect() {
		if (impl == null) {
			RainyHillsWSService service = new RainyHillsWSService();
			impl = service.getRainyHillsWSPort();
		}
	}

}
