package com.mac.service;

import com.mac.external.ExternalIPLScoreComp;

public class CrickbuzzFindScoreServiceImpl implements CrickbuzzFindScoreService {

	private ExternalIPLScoreComp extComp;
	

	public CrickbuzzFindScoreServiceImpl(ExternalIPLScoreComp extComp) {
		this.extComp = extComp;
	}
	
	@Override
	public String findScore(int matchId) {
		return extComp.getScore(matchId);
	}
}
