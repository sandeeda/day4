package com.sandeep.day4;

public class Television {

	private boolean active;
	private int volume;
	private int channel;


	public Television (boolean active, int volume, int channel) {
		this.active=active;
		this.channel=channel;
		this.volume=volume;	
	}


	public int changeVolume(char command) {
		// TODO Auto-generated method stub
		if(command=='+') 
		{
			volume++;
			return volume;
		}
		else if(command=='-')
		{
			volume--;
			return volume;
		}

		return volume;
	}


	public int changeChannel(char command) {
		// TODO Auto-generated method stub
		if(command=='>') 
		{
			channel++;
			return channel;
		}
		else if(command=='<')
		{
			channel--;
			return channel;
		}

		return channel;
	}


	public boolean switchOnOff() {
		// TODO Auto-generated method stub
		if(this.active==false)
		{
			active=true;
			return active;
		}
		else if(this.active==true)
		{
			active=false;
			return active;
		}
		return active;
	}










}
