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
		Assert.assertEquals("Not correct value", 2, rainyHillsVolume, 0);
	}
	
	@Test
	public void secondTest(){
		
		List<Integer> inList = new ArrayList<>(Arrays.asList(4,1,1,0,2,3));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 8, rainyHillsVolume, 0);
	}

	@Test
	public void thirdTest(){
		List<Integer> inList = new ArrayList<>(Arrays.asList(7,4,0,9));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 10, rainyHillsVolume, 0);
	}
	
	@Test
	public void fourthTest(){
		List<Integer> inList = new ArrayList<>(Arrays.asList(6,9,9));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 0, rainyHillsVolume, 0);
	}
	
	@Test
	public void fifthTest(){
		List<Integer> inList = new ArrayList<>(Arrays.asList(6,2,9));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 4, rainyHillsVolume, 0);
	}
	
	@Test
	public void sixtTest(){
		List<Integer> inList = new ArrayList<>(Arrays.asList(1,5,3,7,2));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 2, rainyHillsVolume, 0);
	}
	
	@Test
	public void seventhTest(){
		List<Integer> inList = new ArrayList<>(Arrays.asList(5,3,7,2,6,4,5,9,1,2));
		int rainyHillsVolume = wsc.getRainyHillsVolume(inList);
		Assert.assertEquals("Not correct value", 14, rainyHillsVolume, 0);
	}
}
