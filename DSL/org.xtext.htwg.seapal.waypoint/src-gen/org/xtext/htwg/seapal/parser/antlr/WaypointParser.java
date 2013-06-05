/*
* generated by Xtext
*/
package org.xtext.htwg.seapal.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.htwg.seapal.services.WaypointGrammarAccess;

public class WaypointParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private WaypointGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.htwg.seapal.parser.antlr.internal.InternalWaypointParser createParser(XtextTokenStream stream) {
		return new org.xtext.htwg.seapal.parser.antlr.internal.InternalWaypointParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Waypoint";
	}
	
	public WaypointGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WaypointGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
