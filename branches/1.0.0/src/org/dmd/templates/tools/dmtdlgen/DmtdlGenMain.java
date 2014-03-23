package org.dmd.templates.tools.dmtdlgen;

import java.io.IOException;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.util.exceptions.ResultException;

public class DmtdlGenMain {

	public static void main(String[] args) {
		DmtdlGen gen = new DmtdlGen();
		
		try {
			gen.run(args);
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcRuleExceptionSet e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcNameClashException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueExceptionSet e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
