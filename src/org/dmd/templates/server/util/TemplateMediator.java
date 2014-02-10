package org.dmd.templates.server.util;

import java.io.IOException;

import org.dmd.templates.server.extended.Template;

/**
 * The TemplateMediator provides the linkage between a Section and the associated
 * Template that has been loaded from the separate template definition file.
 */
public class TemplateMediator {
	
	String 		name;
	Template	template;

	public TemplateMediator(String n){
		name = n;
		template = null;
	}
	
	public void reset(){
		template = null;
	}
	
	public Template getTemplate(){
		return(template);
	}
	
	public void setTemplate(Template t){
		template = t;
	}
	
	/**
	 * If the template has been loaded, we format the information in the Section and
	 * write it to the artifact. Otherwise we do nothing.
	 * @param section
	 * @param artifact
	 * @throws IOException
	 */
	public void format(SectionIF section, FormattedArtifactIF artifact) throws IOException {
		if (template == null)
			return;
		template.format(section, artifact);
	}
}
