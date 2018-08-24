package com.sandeep.day4.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sandeep.day4.Television;

class TelevisionTest {

	Television tv1;
	@BeforeEach
	void setUp()
	{
		tv1=new Television(true,15,10);
	}
	@Test
	void testChangeVolume() {
		assertEquals(16, tv1.changeVolume('+'));
		assertEquals(17, tv1.changeVolume('+'));
		assertEquals(16, tv1.changeVolume('-'));
	}
	@Test
	void testChangeChannel()
	{
		assertEquals(11, tv1.changeChannel('>'));
		assertEquals(12, tv1.changeChannel('>'));
		assertEquals(11, tv1.changeChannel('<'));
		assertEquals(10, tv1.changeChannel('<'));
		assertEquals(11, tv1.changeChannel('>'));
	}
	@Test
	void testSwitchOnOff()
	{
		assertEquals(false, tv1.switchOnOff());
		assertEquals(true, tv1.switchOnOff());
		assertEquals(false, tv1.switchOnOff());
		assertEquals(true, tv1.switchOnOff());
		assertEquals(false, tv1.switchOnOff());

	}
	

}
