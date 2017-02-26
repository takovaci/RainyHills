package rainyhills.ws.bl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@LocalBean
@Stateless
public class RainyHillsBl {

	public int getRainyHillsVolume(int[] inList) {
		int result = 0;
		int maxHeight = 0;
		int previousIndex = 0;
		int previousValue = 0;
		int partialVolume = 0;
		if (inList == null || inList.length < 3) {
			return result;
		}
		//fin first peak, after that water can start collecting
		while(inList[previousIndex] > maxHeight) {
	        maxHeight = inList[previousIndex];
	        previousIndex++;
	        if(previousIndex==inList.length)            // if every next value is higher then we don't collect any water )
	            return result;
	        else
	        	previousValue = inList[previousIndex];
	    }
		
		for(int i = previousIndex; i<inList.length; i++) {
	        if(inList[i] >= maxHeight) {      // collect all partialVolume water
	            result += partialVolume;
	            partialVolume = 0;
	            maxHeight = inList[i];        // set new max height
	        }
	        else {
	        	partialVolume += maxHeight - inList[i];
	            if(inList[i] > previousValue) {  // we went up... collect some water
	                int collWater = (i-previousIndex)*(inList[i]-previousValue);
	                result += collWater;
	                partialVolume -= collWater;
	            }
	        }

	        // previousHeight only changes if consecutive towers are not same height
	        if(inList[i] != previousValue) {
	        	previousValue = inList[i];
	        	previousIndex = i;
	        }
	    }
		return result;
	}
}
