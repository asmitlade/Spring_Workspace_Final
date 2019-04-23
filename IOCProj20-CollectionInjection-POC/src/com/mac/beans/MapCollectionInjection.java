package com.mac.beans;

import java.util.Map;

public class MapCollectionInjection {
	private Map<?,?> uid;

	public void setUid(Map<?, ?> uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "MapCollectionInjection [uid=" + uid + "]";
	}
}