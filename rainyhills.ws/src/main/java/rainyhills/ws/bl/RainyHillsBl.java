package rainyhills.ws.bl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@LocalBean
@Stateless
public class RainyHillsBl {

	public int getRainyHillsVolume(int[] inList) {
		int result = 0; //result is zero until we collect some water
		int index = 0; //temp index put 0;
		int maxValue = inList[0]; //we store max value, at start is this first value;
		int potentialVolume = 0; // for storing partial water 
		for (int i = 1 ; i < inList.length ; i++){ //going from left to right
			if(maxValue > inList[i]){ //collecting all water left from highest hill
				potentialVolume += (maxValue-inList[i]); //we temporary store difference between current hill and max hill 
			}else{ //we store water and index if we found higher hill
				result +=potentialVolume;
				potentialVolume = 0;
				maxValue = inList[i];
				index = i;
			}
		}
		if(potentialVolume > 0){ //we check right from highest hill only if we have some potential water
			maxValue = inList[inList.length-1]; //now we set highest value last value in list
			potentialVolume = 0; //reset potential water
			for(int i = inList.length-2 ; i >=index; i--){ //we check from second to last index to highest in the table
				if(maxValue > inList[i]){ // potential water
					potentialVolume += (maxValue - inList[i]);
				} else { //we store potential water if we found higher hill
					result += potentialVolume;
					potentialVolume = 0;
					maxValue = inList[i]; 
				}
			}
		}
		
		return result;
	}
}
