package org.dmd.templates.tools.xml;

import java.util.ArrayList;

import org.dmd.dmc.util.ParsedNameValuePair;

public class XmlElement {

	// The name of the element
	String 							name;
	
	// Set to true if it's of the form <p/>
	boolean							complete;
	
	// The elements embedded within this element
	ArrayList<XmlElement>			subelements;
	
	ArrayList<ParsedNameValuePair>	attributes;
	
	public XmlElement(String n){
		name 		= n;
		complete 	= false;
		subelements	= null;
		attributes	= null;
	}
	
	public String toString(){
		return(toString(""));
	}
		
	public String toString(String indent){
		if (complete){
			return("<" + name + "/>");
		}
		else{
			StringBuffer sb = new StringBuffer();
			
			sb.append("<" + name + " ");
			
			if (attributes != null){
				
			}
			
			if (subelements != null){
				
			}
			
			sb.append("</" + name + ">");
			
			return(sb.toString());
		}
	}
}
