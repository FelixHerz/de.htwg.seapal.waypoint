package org.xtext.htwg.seapal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.htwg.seapal.services.WaypointGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWaypointParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WAYPOINT'", "'none'", "'Tack'", "'Jibe'", "'Layto'", "'Set Sails'", "'Change Sails'", "'Sails Down'", "'Reff'", "'Anker Up'", "'Anker Down'", "'Genua1'", "'Genua2'", "'Genua3'", "'Fock'", "'Storm Fock'", "'Bister'", "'Spinacker'", "'full'", "'Reef1'", "'Reef2'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalWaypointParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWaypointParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWaypointParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g"; }



     	private WaypointGrammarAccess grammarAccess;
     	
        public InternalWaypointParser(TokenStream input, WaypointGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Waypoint";	
       	}
       	
       	@Override
       	protected WaypointGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWaypoint"
    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:68:1: entryRuleWaypoint returns [EObject current=null] : iv_ruleWaypoint= ruleWaypoint EOF ;
    public final EObject entryRuleWaypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaypoint = null;


        try {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:69:2: (iv_ruleWaypoint= ruleWaypoint EOF )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:70:2: iv_ruleWaypoint= ruleWaypoint EOF
            {
             newCompositeNode(grammarAccess.getWaypointRule()); 
            pushFollow(FOLLOW_ruleWaypoint_in_entryRuleWaypoint75);
            iv_ruleWaypoint=ruleWaypoint();

            state._fsp--;

             current =iv_ruleWaypoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWaypoint85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWaypoint"


    // $ANTLR start "ruleWaypoint"
    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:77:1: ruleWaypoint returns [EObject current=null] : (otherlv_0= 'WAYPOINT' ( (lv_waypoint_1_0= RULE_STRING ) ) ( (lv_position_2_0= RULE_STRING ) ) ( (lv_note_3_0= RULE_STRING ) ) ( (lv_btm_4_0= RULE_STRING ) ) ( (lv_dtm_5_0= RULE_STRING ) ) ( (lv_cog_6_0= RULE_STRING ) ) ( (lv_sog_7_0= RULE_STRING ) ) ( (lv_maneuver_8_0= ruleManeuver ) ) ( (lv_foresail_9_0= ruleForesail ) ) ( (lv_mainsail_10_0= ruleMainsail ) ) ) ;
    public final EObject ruleWaypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_waypoint_1_0=null;
        Token lv_position_2_0=null;
        Token lv_note_3_0=null;
        Token lv_btm_4_0=null;
        Token lv_dtm_5_0=null;
        Token lv_cog_6_0=null;
        Token lv_sog_7_0=null;
        Enumerator lv_maneuver_8_0 = null;

        Enumerator lv_foresail_9_0 = null;

        Enumerator lv_mainsail_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:80:28: ( (otherlv_0= 'WAYPOINT' ( (lv_waypoint_1_0= RULE_STRING ) ) ( (lv_position_2_0= RULE_STRING ) ) ( (lv_note_3_0= RULE_STRING ) ) ( (lv_btm_4_0= RULE_STRING ) ) ( (lv_dtm_5_0= RULE_STRING ) ) ( (lv_cog_6_0= RULE_STRING ) ) ( (lv_sog_7_0= RULE_STRING ) ) ( (lv_maneuver_8_0= ruleManeuver ) ) ( (lv_foresail_9_0= ruleForesail ) ) ( (lv_mainsail_10_0= ruleMainsail ) ) ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:81:1: (otherlv_0= 'WAYPOINT' ( (lv_waypoint_1_0= RULE_STRING ) ) ( (lv_position_2_0= RULE_STRING ) ) ( (lv_note_3_0= RULE_STRING ) ) ( (lv_btm_4_0= RULE_STRING ) ) ( (lv_dtm_5_0= RULE_STRING ) ) ( (lv_cog_6_0= RULE_STRING ) ) ( (lv_sog_7_0= RULE_STRING ) ) ( (lv_maneuver_8_0= ruleManeuver ) ) ( (lv_foresail_9_0= ruleForesail ) ) ( (lv_mainsail_10_0= ruleMainsail ) ) )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:81:1: (otherlv_0= 'WAYPOINT' ( (lv_waypoint_1_0= RULE_STRING ) ) ( (lv_position_2_0= RULE_STRING ) ) ( (lv_note_3_0= RULE_STRING ) ) ( (lv_btm_4_0= RULE_STRING ) ) ( (lv_dtm_5_0= RULE_STRING ) ) ( (lv_cog_6_0= RULE_STRING ) ) ( (lv_sog_7_0= RULE_STRING ) ) ( (lv_maneuver_8_0= ruleManeuver ) ) ( (lv_foresail_9_0= ruleForesail ) ) ( (lv_mainsail_10_0= ruleMainsail ) ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:81:3: otherlv_0= 'WAYPOINT' ( (lv_waypoint_1_0= RULE_STRING ) ) ( (lv_position_2_0= RULE_STRING ) ) ( (lv_note_3_0= RULE_STRING ) ) ( (lv_btm_4_0= RULE_STRING ) ) ( (lv_dtm_5_0= RULE_STRING ) ) ( (lv_cog_6_0= RULE_STRING ) ) ( (lv_sog_7_0= RULE_STRING ) ) ( (lv_maneuver_8_0= ruleManeuver ) ) ( (lv_foresail_9_0= ruleForesail ) ) ( (lv_mainsail_10_0= ruleMainsail ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleWaypoint122); 

                	newLeafNode(otherlv_0, grammarAccess.getWaypointAccess().getWAYPOINTKeyword_0());
                
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:85:1: ( (lv_waypoint_1_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:86:1: (lv_waypoint_1_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:86:1: (lv_waypoint_1_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:87:3: lv_waypoint_1_0= RULE_STRING
            {
            lv_waypoint_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint139); 

            			newLeafNode(lv_waypoint_1_0, grammarAccess.getWaypointAccess().getWaypointSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"waypoint",
                    		lv_waypoint_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:103:2: ( (lv_position_2_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:104:1: (lv_position_2_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:104:1: (lv_position_2_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:105:3: lv_position_2_0= RULE_STRING
            {
            lv_position_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint161); 

            			newLeafNode(lv_position_2_0, grammarAccess.getWaypointAccess().getPositionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"position",
                    		lv_position_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:121:2: ( (lv_note_3_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:122:1: (lv_note_3_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:122:1: (lv_note_3_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:123:3: lv_note_3_0= RULE_STRING
            {
            lv_note_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint183); 

            			newLeafNode(lv_note_3_0, grammarAccess.getWaypointAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:139:2: ( (lv_btm_4_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:140:1: (lv_btm_4_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:140:1: (lv_btm_4_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:141:3: lv_btm_4_0= RULE_STRING
            {
            lv_btm_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint205); 

            			newLeafNode(lv_btm_4_0, grammarAccess.getWaypointAccess().getBtmSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"btm",
                    		lv_btm_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:157:2: ( (lv_dtm_5_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:158:1: (lv_dtm_5_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:158:1: (lv_dtm_5_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:159:3: lv_dtm_5_0= RULE_STRING
            {
            lv_dtm_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint227); 

            			newLeafNode(lv_dtm_5_0, grammarAccess.getWaypointAccess().getDtmSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dtm",
                    		lv_dtm_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:175:2: ( (lv_cog_6_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:176:1: (lv_cog_6_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:176:1: (lv_cog_6_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:177:3: lv_cog_6_0= RULE_STRING
            {
            lv_cog_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint249); 

            			newLeafNode(lv_cog_6_0, grammarAccess.getWaypointAccess().getCogSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cog",
                    		lv_cog_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:193:2: ( (lv_sog_7_0= RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:194:1: (lv_sog_7_0= RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:194:1: (lv_sog_7_0= RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:195:3: lv_sog_7_0= RULE_STRING
            {
            lv_sog_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWaypoint271); 

            			newLeafNode(lv_sog_7_0, grammarAccess.getWaypointAccess().getSogSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWaypointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sog",
                    		lv_sog_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:211:2: ( (lv_maneuver_8_0= ruleManeuver ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:212:1: (lv_maneuver_8_0= ruleManeuver )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:212:1: (lv_maneuver_8_0= ruleManeuver )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:213:3: lv_maneuver_8_0= ruleManeuver
            {
             
            	        newCompositeNode(grammarAccess.getWaypointAccess().getManeuverManeuverEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleManeuver_in_ruleWaypoint297);
            lv_maneuver_8_0=ruleManeuver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaypointRule());
            	        }
                   		set(
                   			current, 
                   			"maneuver",
                    		lv_maneuver_8_0, 
                    		"Maneuver");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:229:2: ( (lv_foresail_9_0= ruleForesail ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:230:1: (lv_foresail_9_0= ruleForesail )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:230:1: (lv_foresail_9_0= ruleForesail )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:231:3: lv_foresail_9_0= ruleForesail
            {
             
            	        newCompositeNode(grammarAccess.getWaypointAccess().getForesailForesailEnumRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleForesail_in_ruleWaypoint318);
            lv_foresail_9_0=ruleForesail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaypointRule());
            	        }
                   		set(
                   			current, 
                   			"foresail",
                    		lv_foresail_9_0, 
                    		"Foresail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:247:2: ( (lv_mainsail_10_0= ruleMainsail ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:248:1: (lv_mainsail_10_0= ruleMainsail )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:248:1: (lv_mainsail_10_0= ruleMainsail )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:249:3: lv_mainsail_10_0= ruleMainsail
            {
             
            	        newCompositeNode(grammarAccess.getWaypointAccess().getMainsailMainsailEnumRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleMainsail_in_ruleWaypoint339);
            lv_mainsail_10_0=ruleMainsail();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWaypointRule());
            	        }
                   		set(
                   			current, 
                   			"mainsail",
                    		lv_mainsail_10_0, 
                    		"Mainsail");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWaypoint"


    // $ANTLR start "ruleManeuver"
    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:273:1: ruleManeuver returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Tack' ) | (enumLiteral_2= 'Jibe' ) | (enumLiteral_3= 'Layto' ) | (enumLiteral_4= 'Set Sails' ) | (enumLiteral_5= 'Change Sails' ) | (enumLiteral_6= 'Sails Down' ) | (enumLiteral_7= 'Reff' ) | (enumLiteral_8= 'Anker Up' ) | (enumLiteral_9= 'Anker Down' ) ) ;
    public final Enumerator ruleManeuver() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:275:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Tack' ) | (enumLiteral_2= 'Jibe' ) | (enumLiteral_3= 'Layto' ) | (enumLiteral_4= 'Set Sails' ) | (enumLiteral_5= 'Change Sails' ) | (enumLiteral_6= 'Sails Down' ) | (enumLiteral_7= 'Reff' ) | (enumLiteral_8= 'Anker Up' ) | (enumLiteral_9= 'Anker Down' ) ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:276:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Tack' ) | (enumLiteral_2= 'Jibe' ) | (enumLiteral_3= 'Layto' ) | (enumLiteral_4= 'Set Sails' ) | (enumLiteral_5= 'Change Sails' ) | (enumLiteral_6= 'Sails Down' ) | (enumLiteral_7= 'Reff' ) | (enumLiteral_8= 'Anker Up' ) | (enumLiteral_9= 'Anker Down' ) )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:276:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Tack' ) | (enumLiteral_2= 'Jibe' ) | (enumLiteral_3= 'Layto' ) | (enumLiteral_4= 'Set Sails' ) | (enumLiteral_5= 'Change Sails' ) | (enumLiteral_6= 'Sails Down' ) | (enumLiteral_7= 'Reff' ) | (enumLiteral_8= 'Anker Up' ) | (enumLiteral_9= 'Anker Down' ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            case 19:
                {
                alt1=8;
                }
                break;
            case 20:
                {
                alt1=9;
                }
                break;
            case 21:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:276:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:276:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:276:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_12_in_ruleManeuver389); 

                            current = grammarAccess.getManeuverAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getManeuverAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:282:6: (enumLiteral_1= 'Tack' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:282:6: (enumLiteral_1= 'Tack' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:282:8: enumLiteral_1= 'Tack'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_13_in_ruleManeuver406); 

                            current = grammarAccess.getManeuverAccess().getTACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getManeuverAccess().getTACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:288:6: (enumLiteral_2= 'Jibe' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:288:6: (enumLiteral_2= 'Jibe' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:288:8: enumLiteral_2= 'Jibe'
                    {
                    enumLiteral_2=(Token)match(input,14,FOLLOW_14_in_ruleManeuver423); 

                            current = grammarAccess.getManeuverAccess().getJIBEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getManeuverAccess().getJIBEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:294:6: (enumLiteral_3= 'Layto' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:294:6: (enumLiteral_3= 'Layto' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:294:8: enumLiteral_3= 'Layto'
                    {
                    enumLiteral_3=(Token)match(input,15,FOLLOW_15_in_ruleManeuver440); 

                            current = grammarAccess.getManeuverAccess().getLAYTOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getManeuverAccess().getLAYTOEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:300:6: (enumLiteral_4= 'Set Sails' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:300:6: (enumLiteral_4= 'Set Sails' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:300:8: enumLiteral_4= 'Set Sails'
                    {
                    enumLiteral_4=(Token)match(input,16,FOLLOW_16_in_ruleManeuver457); 

                            current = grammarAccess.getManeuverAccess().getSETSAILSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getManeuverAccess().getSETSAILSEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:306:6: (enumLiteral_5= 'Change Sails' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:306:6: (enumLiteral_5= 'Change Sails' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:306:8: enumLiteral_5= 'Change Sails'
                    {
                    enumLiteral_5=(Token)match(input,17,FOLLOW_17_in_ruleManeuver474); 

                            current = grammarAccess.getManeuverAccess().getCHANGESAILSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getManeuverAccess().getCHANGESAILSEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:312:6: (enumLiteral_6= 'Sails Down' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:312:6: (enumLiteral_6= 'Sails Down' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:312:8: enumLiteral_6= 'Sails Down'
                    {
                    enumLiteral_6=(Token)match(input,18,FOLLOW_18_in_ruleManeuver491); 

                            current = grammarAccess.getManeuverAccess().getSAILSDOWNEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getManeuverAccess().getSAILSDOWNEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:318:6: (enumLiteral_7= 'Reff' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:318:6: (enumLiteral_7= 'Reff' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:318:8: enumLiteral_7= 'Reff'
                    {
                    enumLiteral_7=(Token)match(input,19,FOLLOW_19_in_ruleManeuver508); 

                            current = grammarAccess.getManeuverAccess().getREFFEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getManeuverAccess().getREFFEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:324:6: (enumLiteral_8= 'Anker Up' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:324:6: (enumLiteral_8= 'Anker Up' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:324:8: enumLiteral_8= 'Anker Up'
                    {
                    enumLiteral_8=(Token)match(input,20,FOLLOW_20_in_ruleManeuver525); 

                            current = grammarAccess.getManeuverAccess().getANKERUPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getManeuverAccess().getANKERUPEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:330:6: (enumLiteral_9= 'Anker Down' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:330:6: (enumLiteral_9= 'Anker Down' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:330:8: enumLiteral_9= 'Anker Down'
                    {
                    enumLiteral_9=(Token)match(input,21,FOLLOW_21_in_ruleManeuver542); 

                            current = grammarAccess.getManeuverAccess().getANKERDOWNEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getManeuverAccess().getANKERDOWNEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManeuver"


    // $ANTLR start "ruleForesail"
    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:340:1: ruleForesail returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Genua1' ) | (enumLiteral_2= 'Genua2' ) | (enumLiteral_3= 'Genua3' ) | (enumLiteral_4= 'Fock' ) | (enumLiteral_5= 'Storm Fock' ) | (enumLiteral_6= 'Bister' ) | (enumLiteral_7= 'Spinacker' ) ) ;
    public final Enumerator ruleForesail() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:342:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Genua1' ) | (enumLiteral_2= 'Genua2' ) | (enumLiteral_3= 'Genua3' ) | (enumLiteral_4= 'Fock' ) | (enumLiteral_5= 'Storm Fock' ) | (enumLiteral_6= 'Bister' ) | (enumLiteral_7= 'Spinacker' ) ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:343:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Genua1' ) | (enumLiteral_2= 'Genua2' ) | (enumLiteral_3= 'Genua3' ) | (enumLiteral_4= 'Fock' ) | (enumLiteral_5= 'Storm Fock' ) | (enumLiteral_6= 'Bister' ) | (enumLiteral_7= 'Spinacker' ) )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:343:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'Genua1' ) | (enumLiteral_2= 'Genua2' ) | (enumLiteral_3= 'Genua3' ) | (enumLiteral_4= 'Fock' ) | (enumLiteral_5= 'Storm Fock' ) | (enumLiteral_6= 'Bister' ) | (enumLiteral_7= 'Spinacker' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:343:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:343:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:343:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_12_in_ruleForesail587); 

                            current = grammarAccess.getForesailAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getForesailAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:349:6: (enumLiteral_1= 'Genua1' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:349:6: (enumLiteral_1= 'Genua1' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:349:8: enumLiteral_1= 'Genua1'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleForesail604); 

                            current = grammarAccess.getForesailAccess().getGENUA1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getForesailAccess().getGENUA1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:355:6: (enumLiteral_2= 'Genua2' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:355:6: (enumLiteral_2= 'Genua2' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:355:8: enumLiteral_2= 'Genua2'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleForesail621); 

                            current = grammarAccess.getForesailAccess().getGENUA2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getForesailAccess().getGENUA2EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:361:6: (enumLiteral_3= 'Genua3' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:361:6: (enumLiteral_3= 'Genua3' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:361:8: enumLiteral_3= 'Genua3'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleForesail638); 

                            current = grammarAccess.getForesailAccess().getGENUA3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getForesailAccess().getGENUA3EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:367:6: (enumLiteral_4= 'Fock' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:367:6: (enumLiteral_4= 'Fock' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:367:8: enumLiteral_4= 'Fock'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleForesail655); 

                            current = grammarAccess.getForesailAccess().getFOCKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getForesailAccess().getFOCKEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:373:6: (enumLiteral_5= 'Storm Fock' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:373:6: (enumLiteral_5= 'Storm Fock' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:373:8: enumLiteral_5= 'Storm Fock'
                    {
                    enumLiteral_5=(Token)match(input,26,FOLLOW_26_in_ruleForesail672); 

                            current = grammarAccess.getForesailAccess().getSTORMFOCKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getForesailAccess().getSTORMFOCKEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:379:6: (enumLiteral_6= 'Bister' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:379:6: (enumLiteral_6= 'Bister' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:379:8: enumLiteral_6= 'Bister'
                    {
                    enumLiteral_6=(Token)match(input,27,FOLLOW_27_in_ruleForesail689); 

                            current = grammarAccess.getForesailAccess().getBISTEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getForesailAccess().getBISTEREnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:385:6: (enumLiteral_7= 'Spinacker' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:385:6: (enumLiteral_7= 'Spinacker' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:385:8: enumLiteral_7= 'Spinacker'
                    {
                    enumLiteral_7=(Token)match(input,28,FOLLOW_28_in_ruleForesail706); 

                            current = grammarAccess.getForesailAccess().getSPINACKEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getForesailAccess().getSPINACKEREnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForesail"


    // $ANTLR start "ruleMainsail"
    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:395:1: ruleMainsail returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'full' ) | (enumLiteral_2= 'Reef1' ) | (enumLiteral_3= 'Reef2' ) ) ;
    public final Enumerator ruleMainsail() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:397:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'full' ) | (enumLiteral_2= 'Reef1' ) | (enumLiteral_3= 'Reef2' ) ) )
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:398:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'full' ) | (enumLiteral_2= 'Reef1' ) | (enumLiteral_3= 'Reef2' ) )
            {
            // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:398:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'full' ) | (enumLiteral_2= 'Reef1' ) | (enumLiteral_3= 'Reef2' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:398:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:398:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:398:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_12_in_ruleMainsail751); 

                            current = grammarAccess.getMainsailAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMainsailAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:404:6: (enumLiteral_1= 'full' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:404:6: (enumLiteral_1= 'full' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:404:8: enumLiteral_1= 'full'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleMainsail768); 

                            current = grammarAccess.getMainsailAccess().getFULLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMainsailAccess().getFULLEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:410:6: (enumLiteral_2= 'Reef1' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:410:6: (enumLiteral_2= 'Reef1' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:410:8: enumLiteral_2= 'Reef1'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleMainsail785); 

                            current = grammarAccess.getMainsailAccess().getREEF1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMainsailAccess().getREEF1EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:416:6: (enumLiteral_3= 'Reef2' )
                    {
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:416:6: (enumLiteral_3= 'Reef2' )
                    // ../org.xtext.htwg.seapal.waypoint/src-gen/org/xtext/htwg/seapal/parser/antlr/internal/InternalWaypoint.g:416:8: enumLiteral_3= 'Reef2'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleMainsail802); 

                            current = grammarAccess.getMainsailAccess().getREEF2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMainsailAccess().getREEF2EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainsail"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWaypoint_in_entryRuleWaypoint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWaypoint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleWaypoint122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWaypoint271 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_ruleManeuver_in_ruleWaypoint297 = new BitSet(new long[]{0x000000001FC01000L});
    public static final BitSet FOLLOW_ruleForesail_in_ruleWaypoint318 = new BitSet(new long[]{0x00000000E0001000L});
    public static final BitSet FOLLOW_ruleMainsail_in_ruleWaypoint339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleManeuver389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleManeuver406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleManeuver423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleManeuver440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleManeuver457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleManeuver474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleManeuver491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleManeuver508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleManeuver525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleManeuver542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleForesail587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleForesail604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleForesail621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleForesail638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleForesail655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleForesail672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleForesail689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleForesail706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMainsail751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMainsail768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMainsail785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMainsail802 = new BitSet(new long[]{0x0000000000000002L});

}