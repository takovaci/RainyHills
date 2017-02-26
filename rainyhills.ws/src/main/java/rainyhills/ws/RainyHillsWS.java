package rainyhills.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import rainyhills.ws.bl.RainyHillsBl;
import rainyhills.ws.req.GetRainyHillsVolumeReq;
import rainyhills.ws.resp.GetRainyHillsVolumeResp;

@WebService
@Stateless
public class RainyHillsWS {

	@EJB
	RainyHillsBl bl;

	@WebMethod
	public GetRainyHillsVolumeResp getRainyHillsVolume(GetRainyHillsVolumeReq req) {
		GetRainyHillsVolumeResp result = new GetRainyHillsVolumeResp();
		if (req != null) {
			result.setVolume(bl.getRainyHillsVolume(req.getHillsHights()));
		}
		return result;
	}
}
