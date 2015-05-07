package com.mytest.dvita.server;

import com.mytest.dvita.shared.ConfigTopicminingShared;

// informationen f�rs topic mining
public class ConfigTopicminingServer extends ConfigTopicminingShared {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int rawdataID;
	
	public String tablePrefix;
	
	
	
	public int similarDocsTimeShift = 1; // gehe maximal x zeitpunkte in vergangenheit bzw. zukunft (in Thesis: Delta Parameter)
	public int similarDocsCount = 10; // zu jeden dieser zeitpunkte finde die y �hnlichsten dokumente
	
}
