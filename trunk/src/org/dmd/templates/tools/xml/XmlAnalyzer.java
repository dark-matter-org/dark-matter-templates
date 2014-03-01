package org.dmd.templates.tools.xml;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.dmd.dmc.types.IntegerVar;
import org.dmd.util.exceptions.ResultException;


/**
 * Reads an XML file and determines its structure.
 */
public class XmlAnalyzer {

	public void parse(String fn) throws ResultException, IOException {
        LineNumberReader	in			= null;
		in = new LineNumberReader(new FileReader(fn));
		String str;
		IntegerVar	pos = new IntegerVar();
		StringBuffer content = null;

        while ((str = in.readLine()) != null){
        	for(int i=0; i<str.length();i++){
        		if (str.charAt(i) == '<'){
        			pos.set(i+1);
        			content = new StringBuffer();
        			parseOpenAngle(str, pos, content);
        		}
        	}
        }
        
        in.close();
	}
	
	void parseOpenAngle(String str, IntegerVar pos, StringBuffer content) throws ResultException{
		if (pos.intValue() == str.length()){
			ResultException ex = new ResultException("Unclosed open bracket.");
			throw(ex);
		}
		
		for(int i=pos.intValue(); i<str.length(); i++){
			if (str.charAt(i) == '>'){
				
			}
			if (str.charAt(i) == '/'){
				// Might be start of end bracket
				if ((i+1) == str.length()){
					// Nothing left, close might be on next line 
					// will indicate to 
				}
			}
		}
	}
	
}
