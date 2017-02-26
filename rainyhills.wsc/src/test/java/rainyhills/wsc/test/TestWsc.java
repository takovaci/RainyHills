package rainyhills.wsc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import rainyhills.wsc.RainyHillesWSC;

public class TestWsc {
	
	RainyHillesWSC wsc;
	
	@Before
	public void startup(){
		wsc = new RainyHillesWSC();
	}
	
	@Test
	public void firstTest(){
		
		List<Integer> inList = new ArrayList<>(Arrays.asList(3,2,4,1,2));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not corret value", 2, rainyHillsVolume, 0);
	}
	
	@Test
	public void secondTest(){
		
		List<Integer> inList = new ArrayList<>(Arrays.asList(4,1,1,0,2,3));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not corret value", 8, rainyHillsVolume, 0);
	}

}
