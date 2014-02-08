package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.util.ArrayList;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.TemplateDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.server.util.SectionIF;
import org.dmd.templates.shared.generated.dmo.TemplateDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.util.exceptions.ResultException;


public class Template extends TemplateDMW {
	
	ArrayList<Element>	elements;

    public Template(){
        super();
    }

    public Template(TemplateDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    public void format(SectionIF section, StringBuffer sb){
    	
    }
    
    /**
     * Parses the format and breaks it down into Elements, which are either chunks of
     * text or references to named values that will be provided by a Section.
     * @param insertMarker a string that indicates where named values may be inserted in the format
     * @throws DmcValueException 
     * @throws ResultException 
     */
    public void initialize(String insertMarker) throws ResultException {
    	// Shorthand for the marker length
    	int ML = insertMarker.length();
    	elements = new ArrayList<Template.Element>();
    	
    	if (getFormat() == null)
    		throw(new IllegalStateException("A Template should never have a null format"));
    	
    	String format = getFormat();
    	
    	boolean wantIM 	= false;
    	int		IMstart = 0;
    	int		textPOS = 0;
    	
    	for(int i=0; i<format.length(); ){
    		int IMpos = format.indexOf(insertMarker, i);
    		
//    		System.out.println("[" + i + "] = " + format.charAt(i) + "  IMpos = " + IMpos);
    		
    		if (IMpos == -1){
    			break;
    		}
    		else{
    			if (wantIM){
//        			System.out.println("FOUND END " + IMpos);
    				// We've hit the terminating IM, grab the value name
    				elements.add(new Element(null,format.substring(IMstart+ML, IMpos).trim()));
    				textPOS = IMpos+ML;
    				i 		= IMpos+ML;
    				wantIM = false;
    			}
    			else{
//        			System.out.println("FOUND START " + IMpos);
    				IMstart = IMpos;
    				wantIM 	= true;
    				
    				if (textPOS < IMstart){
    					elements.add(new Element(format.substring(textPOS,IMstart),null));
    				}
    				
    				i = IMstart+ML;
    			}
    		}
    	}
    	
//    	System.out.println("DONE ");
    	
    	if (wantIM){
    		// We had a start insert marker but never found the closing one
			ResultException ex = new ResultException("Unmatched insert marker: " + insertMarker + "" + showErrorLocation(IMstart, format));
			ex.setLocationInfo(getFile(), getLineNumber());
			throw(ex);    		
    	}
    	
    	if (textPOS < format.length()){
    		elements.add(new Element(format.substring(textPOS), null));
    	}
    	
    }
    
    public String getElement(int i){
    	if (elements == null)
    		throw(new IllegalStateException("The Template has not been initialized yet!"));

    	if (i < elements.size()){
    		Element e = elements.get(i);
    		if (e.text == null)
    			return(e.valueName);
    		return(e.text);
    	}
    	else{
    		return(null);
    	}
    }
    
    public int getElementCount(){
    	if (elements == null)
    		throw(new IllegalStateException("The Template has not been initialized yet!"));
    	
    	return(elements.size());
    }
    
    class Element {
    	String text;
    	String valueName;
    	
    	Element(String t, String v){
    		text = t;
    		valueName = v;
    	}
    }

	private String showErrorLocation(int position, String input){
		StringBuffer sb = new StringBuffer("\n" + input + "\n");
		for(int i=0; i< position; i++){
			sb.append(" ");
		}
		sb.append("^");
		return(sb.toString());
	}

}

