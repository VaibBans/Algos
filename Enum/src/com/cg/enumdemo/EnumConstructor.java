package com.cg.enumdemo;

public class EnumConstructor {

	enum TrafficSignal{
		RED("STOP"), YELLOW("WAIT"), GREEN("GO");
		
		String action;
		TrafficSignal(String action){
			this.action = action;
		}
		
		public String getAction() {
			return this.action;
		}
	}
	
	
	public static void main(String[] args) {
		TrafficSignal[] signals = TrafficSignal.values();
		for(TrafficSignal sig:signals)
			System.out.println(sig.name()+"- "+sig.getAction());

	}
}