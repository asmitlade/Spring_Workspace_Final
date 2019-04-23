package com.mac.external;

public class ExternalIPLScoreCompImpl implements ExternalIPLScoreComp {
	
	@Override
	public String getScore(int matchId) {
		if(matchId == 1001)
			return "KKR vs  RCB --------> 120/4 (KKR)";
		else if(matchId == 1002)
			return "CSK vs  RCB --------> 110/2 (CSK)";
		else if(matchId == 1003)
			return "SRH vs  MI --------> 110/2 (MI)";
		else
			return "Match Not Found..";
	}
}