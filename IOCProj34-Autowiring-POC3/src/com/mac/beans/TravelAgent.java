package com.mac.beans;

public class TravelAgent {
	private TourPlan plan;

	public TravelAgent(TourPlan plan) {
		System.out.println("TravelAgent :: 1-param constructor");
		this.plan = plan;
	}
	/*public TravelAgent() {
		System.out.println("TravelAgent :: 0-param constructor");
	}*/
	public void setPlan(TourPlan plan) {
		this.plan = plan;
	}
	public void executePlan() {
		System.out.println(plan+" Places are visited....");
	}
}
