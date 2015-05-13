package com.mytest.dvita.shared;

import java.io.Serializable;

public class DocumentData implements Serializable {
	private static final long serialVersionUID = -7050966153161157486L;
	
	public String content;
	public String title;
	public String date;
	public String url;
	public Integer docId;
	public String copyright;
	public String authors;
}
