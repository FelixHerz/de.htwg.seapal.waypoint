package org.xtext.htwg.seapal.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.htwg.seapal.services.WaypointGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWaypointParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'Tack'", "'Jibe'", "'Layto'", "'Set Sails'", "'Change Sails'", "'Sails Down'", "'Reff'", "'Anker Up'", "'Anker Down'", "'Genua1'", "'Genua2'", "'Genua3'", "'Fock'", "'Storm Fock'", "'Bister'", "'Spinacker'", "'full'", "'Reef1'", "'Reef2'", "'WAYPOINT'"
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
    public String getGrammarFileName() { return "../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g"; }


     
     	private WaypointGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WaypointGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleWaypoint"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:60:1: entryRuleWaypoint : ruleWaypoint EOF ;
    public final void entryRuleWaypoint() throws RecognitionException {
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:61:1: ( ruleWaypoint EOF )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:62:1: ruleWaypoint EOF
            {
             before(grammarAccess.getWaypointRule()); 
            pushFollow(FOLLOW_ruleWaypoint_in_entryRuleWaypoint61);
            ruleWaypoint();

            state._fsp--;

             after(grammarAccess.getWaypointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWaypoint68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWaypoint"


    // $ANTLR start "ruleWaypoint"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:69:1: ruleWaypoint : ( ( rule__Waypoint__Group__0 ) ) ;
    public final void ruleWaypoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:73:2: ( ( ( rule__Waypoint__Group__0 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:74:1: ( ( rule__Waypoint__Group__0 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:74:1: ( ( rule__Waypoint__Group__0 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:75:1: ( rule__Waypoint__Group__0 )
            {
             before(grammarAccess.getWaypointAccess().getGroup()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:76:1: ( rule__Waypoint__Group__0 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:76:2: rule__Waypoint__Group__0
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__0_in_ruleWaypoint94);
            rule__Waypoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaypoint"


    // $ANTLR start "ruleManeuver"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:89:1: ruleManeuver : ( ( rule__Maneuver__Alternatives ) ) ;
    public final void ruleManeuver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:93:1: ( ( ( rule__Maneuver__Alternatives ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:94:1: ( ( rule__Maneuver__Alternatives ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:94:1: ( ( rule__Maneuver__Alternatives ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:95:1: ( rule__Maneuver__Alternatives )
            {
             before(grammarAccess.getManeuverAccess().getAlternatives()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:96:1: ( rule__Maneuver__Alternatives )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:96:2: rule__Maneuver__Alternatives
            {
            pushFollow(FOLLOW_rule__Maneuver__Alternatives_in_ruleManeuver131);
            rule__Maneuver__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManeuverAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManeuver"


    // $ANTLR start "ruleForesail"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:108:1: ruleForesail : ( ( rule__Foresail__Alternatives ) ) ;
    public final void ruleForesail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:112:1: ( ( ( rule__Foresail__Alternatives ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:113:1: ( ( rule__Foresail__Alternatives ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:113:1: ( ( rule__Foresail__Alternatives ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:114:1: ( rule__Foresail__Alternatives )
            {
             before(grammarAccess.getForesailAccess().getAlternatives()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:115:1: ( rule__Foresail__Alternatives )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:115:2: rule__Foresail__Alternatives
            {
            pushFollow(FOLLOW_rule__Foresail__Alternatives_in_ruleForesail167);
            rule__Foresail__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getForesailAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForesail"


    // $ANTLR start "ruleMainsail"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:127:1: ruleMainsail : ( ( rule__Mainsail__Alternatives ) ) ;
    public final void ruleMainsail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:131:1: ( ( ( rule__Mainsail__Alternatives ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:132:1: ( ( rule__Mainsail__Alternatives ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:132:1: ( ( rule__Mainsail__Alternatives ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:133:1: ( rule__Mainsail__Alternatives )
            {
             before(grammarAccess.getMainsailAccess().getAlternatives()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:134:1: ( rule__Mainsail__Alternatives )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:134:2: rule__Mainsail__Alternatives
            {
            pushFollow(FOLLOW_rule__Mainsail__Alternatives_in_ruleMainsail203);
            rule__Mainsail__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMainsailAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainsail"


    // $ANTLR start "rule__Maneuver__Alternatives"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:145:1: rule__Maneuver__Alternatives : ( ( ( 'none' ) ) | ( ( 'Tack' ) ) | ( ( 'Jibe' ) ) | ( ( 'Layto' ) ) | ( ( 'Set Sails' ) ) | ( ( 'Change Sails' ) ) | ( ( 'Sails Down' ) ) | ( ( 'Reff' ) ) | ( ( 'Anker Up' ) ) | ( ( 'Anker Down' ) ) );
    public final void rule__Maneuver__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:149:1: ( ( ( 'none' ) ) | ( ( 'Tack' ) ) | ( ( 'Jibe' ) ) | ( ( 'Layto' ) ) | ( ( 'Set Sails' ) ) | ( ( 'Change Sails' ) ) | ( ( 'Sails Down' ) ) | ( ( 'Reff' ) ) | ( ( 'Anker Up' ) ) | ( ( 'Anker Down' ) ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
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
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:150:1: ( ( 'none' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:150:1: ( ( 'none' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:151:1: ( 'none' )
                    {
                     before(grammarAccess.getManeuverAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:152:1: ( 'none' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:152:3: 'none'
                    {
                    match(input,11,FOLLOW_11_in_rule__Maneuver__Alternatives239); 

                    }

                     after(grammarAccess.getManeuverAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:157:6: ( ( 'Tack' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:157:6: ( ( 'Tack' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:158:1: ( 'Tack' )
                    {
                     before(grammarAccess.getManeuverAccess().getTACKEnumLiteralDeclaration_1()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:159:1: ( 'Tack' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:159:3: 'Tack'
                    {
                    match(input,12,FOLLOW_12_in_rule__Maneuver__Alternatives260); 

                    }

                     after(grammarAccess.getManeuverAccess().getTACKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:164:6: ( ( 'Jibe' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:164:6: ( ( 'Jibe' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:165:1: ( 'Jibe' )
                    {
                     before(grammarAccess.getManeuverAccess().getJIBEEnumLiteralDeclaration_2()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:166:1: ( 'Jibe' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:166:3: 'Jibe'
                    {
                    match(input,13,FOLLOW_13_in_rule__Maneuver__Alternatives281); 

                    }

                     after(grammarAccess.getManeuverAccess().getJIBEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:171:6: ( ( 'Layto' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:171:6: ( ( 'Layto' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:172:1: ( 'Layto' )
                    {
                     before(grammarAccess.getManeuverAccess().getLAYTOEnumLiteralDeclaration_3()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:173:1: ( 'Layto' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:173:3: 'Layto'
                    {
                    match(input,14,FOLLOW_14_in_rule__Maneuver__Alternatives302); 

                    }

                     after(grammarAccess.getManeuverAccess().getLAYTOEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:178:6: ( ( 'Set Sails' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:178:6: ( ( 'Set Sails' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:179:1: ( 'Set Sails' )
                    {
                     before(grammarAccess.getManeuverAccess().getSETSAILSEnumLiteralDeclaration_4()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:180:1: ( 'Set Sails' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:180:3: 'Set Sails'
                    {
                    match(input,15,FOLLOW_15_in_rule__Maneuver__Alternatives323); 

                    }

                     after(grammarAccess.getManeuverAccess().getSETSAILSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:185:6: ( ( 'Change Sails' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:185:6: ( ( 'Change Sails' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:186:1: ( 'Change Sails' )
                    {
                     before(grammarAccess.getManeuverAccess().getCHANGESAILSEnumLiteralDeclaration_5()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:187:1: ( 'Change Sails' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:187:3: 'Change Sails'
                    {
                    match(input,16,FOLLOW_16_in_rule__Maneuver__Alternatives344); 

                    }

                     after(grammarAccess.getManeuverAccess().getCHANGESAILSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:192:6: ( ( 'Sails Down' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:192:6: ( ( 'Sails Down' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:193:1: ( 'Sails Down' )
                    {
                     before(grammarAccess.getManeuverAccess().getSAILSDOWNEnumLiteralDeclaration_6()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:194:1: ( 'Sails Down' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:194:3: 'Sails Down'
                    {
                    match(input,17,FOLLOW_17_in_rule__Maneuver__Alternatives365); 

                    }

                     after(grammarAccess.getManeuverAccess().getSAILSDOWNEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:199:6: ( ( 'Reff' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:199:6: ( ( 'Reff' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:200:1: ( 'Reff' )
                    {
                     before(grammarAccess.getManeuverAccess().getREFFEnumLiteralDeclaration_7()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:201:1: ( 'Reff' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:201:3: 'Reff'
                    {
                    match(input,18,FOLLOW_18_in_rule__Maneuver__Alternatives386); 

                    }

                     after(grammarAccess.getManeuverAccess().getREFFEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:206:6: ( ( 'Anker Up' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:206:6: ( ( 'Anker Up' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:207:1: ( 'Anker Up' )
                    {
                     before(grammarAccess.getManeuverAccess().getANKERUPEnumLiteralDeclaration_8()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:208:1: ( 'Anker Up' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:208:3: 'Anker Up'
                    {
                    match(input,19,FOLLOW_19_in_rule__Maneuver__Alternatives407); 

                    }

                     after(grammarAccess.getManeuverAccess().getANKERUPEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:213:6: ( ( 'Anker Down' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:213:6: ( ( 'Anker Down' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:214:1: ( 'Anker Down' )
                    {
                     before(grammarAccess.getManeuverAccess().getANKERDOWNEnumLiteralDeclaration_9()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:215:1: ( 'Anker Down' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:215:3: 'Anker Down'
                    {
                    match(input,20,FOLLOW_20_in_rule__Maneuver__Alternatives428); 

                    }

                     after(grammarAccess.getManeuverAccess().getANKERDOWNEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maneuver__Alternatives"


    // $ANTLR start "rule__Foresail__Alternatives"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:225:1: rule__Foresail__Alternatives : ( ( ( 'none' ) ) | ( ( 'Genua1' ) ) | ( ( 'Genua2' ) ) | ( ( 'Genua3' ) ) | ( ( 'Fock' ) ) | ( ( 'Storm Fock' ) ) | ( ( 'Bister' ) ) | ( ( 'Spinacker' ) ) );
    public final void rule__Foresail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:229:1: ( ( ( 'none' ) ) | ( ( 'Genua1' ) ) | ( ( 'Genua2' ) ) | ( ( 'Genua3' ) ) | ( ( 'Fock' ) ) | ( ( 'Storm Fock' ) ) | ( ( 'Bister' ) ) | ( ( 'Spinacker' ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            case 26:
                {
                alt2=7;
                }
                break;
            case 27:
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
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:230:1: ( ( 'none' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:230:1: ( ( 'none' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:231:1: ( 'none' )
                    {
                     before(grammarAccess.getForesailAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:232:1: ( 'none' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:232:3: 'none'
                    {
                    match(input,11,FOLLOW_11_in_rule__Foresail__Alternatives464); 

                    }

                     after(grammarAccess.getForesailAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:237:6: ( ( 'Genua1' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:237:6: ( ( 'Genua1' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:238:1: ( 'Genua1' )
                    {
                     before(grammarAccess.getForesailAccess().getGENUA1EnumLiteralDeclaration_1()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:239:1: ( 'Genua1' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:239:3: 'Genua1'
                    {
                    match(input,21,FOLLOW_21_in_rule__Foresail__Alternatives485); 

                    }

                     after(grammarAccess.getForesailAccess().getGENUA1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:244:6: ( ( 'Genua2' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:244:6: ( ( 'Genua2' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:245:1: ( 'Genua2' )
                    {
                     before(grammarAccess.getForesailAccess().getGENUA2EnumLiteralDeclaration_2()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:246:1: ( 'Genua2' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:246:3: 'Genua2'
                    {
                    match(input,22,FOLLOW_22_in_rule__Foresail__Alternatives506); 

                    }

                     after(grammarAccess.getForesailAccess().getGENUA2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:251:6: ( ( 'Genua3' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:251:6: ( ( 'Genua3' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:252:1: ( 'Genua3' )
                    {
                     before(grammarAccess.getForesailAccess().getGENUA3EnumLiteralDeclaration_3()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:253:1: ( 'Genua3' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:253:3: 'Genua3'
                    {
                    match(input,23,FOLLOW_23_in_rule__Foresail__Alternatives527); 

                    }

                     after(grammarAccess.getForesailAccess().getGENUA3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:258:6: ( ( 'Fock' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:258:6: ( ( 'Fock' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:259:1: ( 'Fock' )
                    {
                     before(grammarAccess.getForesailAccess().getFOCKEnumLiteralDeclaration_4()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:260:1: ( 'Fock' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:260:3: 'Fock'
                    {
                    match(input,24,FOLLOW_24_in_rule__Foresail__Alternatives548); 

                    }

                     after(grammarAccess.getForesailAccess().getFOCKEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:265:6: ( ( 'Storm Fock' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:265:6: ( ( 'Storm Fock' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:266:1: ( 'Storm Fock' )
                    {
                     before(grammarAccess.getForesailAccess().getSTORMFOCKEnumLiteralDeclaration_5()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:267:1: ( 'Storm Fock' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:267:3: 'Storm Fock'
                    {
                    match(input,25,FOLLOW_25_in_rule__Foresail__Alternatives569); 

                    }

                     after(grammarAccess.getForesailAccess().getSTORMFOCKEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:272:6: ( ( 'Bister' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:272:6: ( ( 'Bister' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:273:1: ( 'Bister' )
                    {
                     before(grammarAccess.getForesailAccess().getBISTEREnumLiteralDeclaration_6()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:274:1: ( 'Bister' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:274:3: 'Bister'
                    {
                    match(input,26,FOLLOW_26_in_rule__Foresail__Alternatives590); 

                    }

                     after(grammarAccess.getForesailAccess().getBISTEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:279:6: ( ( 'Spinacker' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:279:6: ( ( 'Spinacker' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:280:1: ( 'Spinacker' )
                    {
                     before(grammarAccess.getForesailAccess().getSPINACKEREnumLiteralDeclaration_7()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:281:1: ( 'Spinacker' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:281:3: 'Spinacker'
                    {
                    match(input,27,FOLLOW_27_in_rule__Foresail__Alternatives611); 

                    }

                     after(grammarAccess.getForesailAccess().getSPINACKEREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Foresail__Alternatives"


    // $ANTLR start "rule__Mainsail__Alternatives"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:291:1: rule__Mainsail__Alternatives : ( ( ( 'none' ) ) | ( ( 'full' ) ) | ( ( 'Reef1' ) ) | ( ( 'Reef2' ) ) );
    public final void rule__Mainsail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:295:1: ( ( ( 'none' ) ) | ( ( 'full' ) ) | ( ( 'Reef1' ) ) | ( ( 'Reef2' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 30:
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
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:296:1: ( ( 'none' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:296:1: ( ( 'none' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:297:1: ( 'none' )
                    {
                     before(grammarAccess.getMainsailAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:298:1: ( 'none' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:298:3: 'none'
                    {
                    match(input,11,FOLLOW_11_in_rule__Mainsail__Alternatives647); 

                    }

                     after(grammarAccess.getMainsailAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:303:6: ( ( 'full' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:303:6: ( ( 'full' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:304:1: ( 'full' )
                    {
                     before(grammarAccess.getMainsailAccess().getFULLEnumLiteralDeclaration_1()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:305:1: ( 'full' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:305:3: 'full'
                    {
                    match(input,28,FOLLOW_28_in_rule__Mainsail__Alternatives668); 

                    }

                     after(grammarAccess.getMainsailAccess().getFULLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:310:6: ( ( 'Reef1' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:310:6: ( ( 'Reef1' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:311:1: ( 'Reef1' )
                    {
                     before(grammarAccess.getMainsailAccess().getREEF1EnumLiteralDeclaration_2()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:312:1: ( 'Reef1' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:312:3: 'Reef1'
                    {
                    match(input,29,FOLLOW_29_in_rule__Mainsail__Alternatives689); 

                    }

                     after(grammarAccess.getMainsailAccess().getREEF1EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:317:6: ( ( 'Reef2' ) )
                    {
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:317:6: ( ( 'Reef2' ) )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:318:1: ( 'Reef2' )
                    {
                     before(grammarAccess.getMainsailAccess().getREEF2EnumLiteralDeclaration_3()); 
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:319:1: ( 'Reef2' )
                    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:319:3: 'Reef2'
                    {
                    match(input,30,FOLLOW_30_in_rule__Mainsail__Alternatives710); 

                    }

                     after(grammarAccess.getMainsailAccess().getREEF2EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mainsail__Alternatives"


    // $ANTLR start "rule__Waypoint__Group__0"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:331:1: rule__Waypoint__Group__0 : rule__Waypoint__Group__0__Impl rule__Waypoint__Group__1 ;
    public final void rule__Waypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:335:1: ( rule__Waypoint__Group__0__Impl rule__Waypoint__Group__1 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:336:2: rule__Waypoint__Group__0__Impl rule__Waypoint__Group__1
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__0__Impl_in_rule__Waypoint__Group__0743);
            rule__Waypoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__1_in_rule__Waypoint__Group__0746);
            rule__Waypoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__0"


    // $ANTLR start "rule__Waypoint__Group__0__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:343:1: rule__Waypoint__Group__0__Impl : ( 'WAYPOINT' ) ;
    public final void rule__Waypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:347:1: ( ( 'WAYPOINT' ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:348:1: ( 'WAYPOINT' )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:348:1: ( 'WAYPOINT' )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:349:1: 'WAYPOINT'
            {
             before(grammarAccess.getWaypointAccess().getWAYPOINTKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Waypoint__Group__0__Impl774); 
             after(grammarAccess.getWaypointAccess().getWAYPOINTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__0__Impl"


    // $ANTLR start "rule__Waypoint__Group__1"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:362:1: rule__Waypoint__Group__1 : rule__Waypoint__Group__1__Impl rule__Waypoint__Group__2 ;
    public final void rule__Waypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:366:1: ( rule__Waypoint__Group__1__Impl rule__Waypoint__Group__2 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:367:2: rule__Waypoint__Group__1__Impl rule__Waypoint__Group__2
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__1__Impl_in_rule__Waypoint__Group__1805);
            rule__Waypoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__2_in_rule__Waypoint__Group__1808);
            rule__Waypoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__1"


    // $ANTLR start "rule__Waypoint__Group__1__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:374:1: rule__Waypoint__Group__1__Impl : ( ( rule__Waypoint__WaypointAssignment_1 ) ) ;
    public final void rule__Waypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:378:1: ( ( ( rule__Waypoint__WaypointAssignment_1 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:379:1: ( ( rule__Waypoint__WaypointAssignment_1 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:379:1: ( ( rule__Waypoint__WaypointAssignment_1 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:380:1: ( rule__Waypoint__WaypointAssignment_1 )
            {
             before(grammarAccess.getWaypointAccess().getWaypointAssignment_1()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:381:1: ( rule__Waypoint__WaypointAssignment_1 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:381:2: rule__Waypoint__WaypointAssignment_1
            {
            pushFollow(FOLLOW_rule__Waypoint__WaypointAssignment_1_in_rule__Waypoint__Group__1__Impl835);
            rule__Waypoint__WaypointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getWaypointAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__1__Impl"


    // $ANTLR start "rule__Waypoint__Group__2"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:391:1: rule__Waypoint__Group__2 : rule__Waypoint__Group__2__Impl rule__Waypoint__Group__3 ;
    public final void rule__Waypoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:395:1: ( rule__Waypoint__Group__2__Impl rule__Waypoint__Group__3 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:396:2: rule__Waypoint__Group__2__Impl rule__Waypoint__Group__3
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__2__Impl_in_rule__Waypoint__Group__2865);
            rule__Waypoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__3_in_rule__Waypoint__Group__2868);
            rule__Waypoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__2"


    // $ANTLR start "rule__Waypoint__Group__2__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:403:1: rule__Waypoint__Group__2__Impl : ( ( rule__Waypoint__PositionAssignment_2 ) ) ;
    public final void rule__Waypoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:407:1: ( ( ( rule__Waypoint__PositionAssignment_2 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:408:1: ( ( rule__Waypoint__PositionAssignment_2 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:408:1: ( ( rule__Waypoint__PositionAssignment_2 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:409:1: ( rule__Waypoint__PositionAssignment_2 )
            {
             before(grammarAccess.getWaypointAccess().getPositionAssignment_2()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:410:1: ( rule__Waypoint__PositionAssignment_2 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:410:2: rule__Waypoint__PositionAssignment_2
            {
            pushFollow(FOLLOW_rule__Waypoint__PositionAssignment_2_in_rule__Waypoint__Group__2__Impl895);
            rule__Waypoint__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__2__Impl"


    // $ANTLR start "rule__Waypoint__Group__3"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:420:1: rule__Waypoint__Group__3 : rule__Waypoint__Group__3__Impl rule__Waypoint__Group__4 ;
    public final void rule__Waypoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:424:1: ( rule__Waypoint__Group__3__Impl rule__Waypoint__Group__4 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:425:2: rule__Waypoint__Group__3__Impl rule__Waypoint__Group__4
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__3__Impl_in_rule__Waypoint__Group__3925);
            rule__Waypoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__4_in_rule__Waypoint__Group__3928);
            rule__Waypoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__3"


    // $ANTLR start "rule__Waypoint__Group__3__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:432:1: rule__Waypoint__Group__3__Impl : ( ( rule__Waypoint__NoteAssignment_3 ) ) ;
    public final void rule__Waypoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:436:1: ( ( ( rule__Waypoint__NoteAssignment_3 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:437:1: ( ( rule__Waypoint__NoteAssignment_3 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:437:1: ( ( rule__Waypoint__NoteAssignment_3 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:438:1: ( rule__Waypoint__NoteAssignment_3 )
            {
             before(grammarAccess.getWaypointAccess().getNoteAssignment_3()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:439:1: ( rule__Waypoint__NoteAssignment_3 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:439:2: rule__Waypoint__NoteAssignment_3
            {
            pushFollow(FOLLOW_rule__Waypoint__NoteAssignment_3_in_rule__Waypoint__Group__3__Impl955);
            rule__Waypoint__NoteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getNoteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__3__Impl"


    // $ANTLR start "rule__Waypoint__Group__4"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:449:1: rule__Waypoint__Group__4 : rule__Waypoint__Group__4__Impl rule__Waypoint__Group__5 ;
    public final void rule__Waypoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:453:1: ( rule__Waypoint__Group__4__Impl rule__Waypoint__Group__5 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:454:2: rule__Waypoint__Group__4__Impl rule__Waypoint__Group__5
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__4__Impl_in_rule__Waypoint__Group__4985);
            rule__Waypoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__5_in_rule__Waypoint__Group__4988);
            rule__Waypoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__4"


    // $ANTLR start "rule__Waypoint__Group__4__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:461:1: rule__Waypoint__Group__4__Impl : ( ( rule__Waypoint__BtmAssignment_4 ) ) ;
    public final void rule__Waypoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:465:1: ( ( ( rule__Waypoint__BtmAssignment_4 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:466:1: ( ( rule__Waypoint__BtmAssignment_4 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:466:1: ( ( rule__Waypoint__BtmAssignment_4 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:467:1: ( rule__Waypoint__BtmAssignment_4 )
            {
             before(grammarAccess.getWaypointAccess().getBtmAssignment_4()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:468:1: ( rule__Waypoint__BtmAssignment_4 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:468:2: rule__Waypoint__BtmAssignment_4
            {
            pushFollow(FOLLOW_rule__Waypoint__BtmAssignment_4_in_rule__Waypoint__Group__4__Impl1015);
            rule__Waypoint__BtmAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getBtmAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__4__Impl"


    // $ANTLR start "rule__Waypoint__Group__5"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:478:1: rule__Waypoint__Group__5 : rule__Waypoint__Group__5__Impl rule__Waypoint__Group__6 ;
    public final void rule__Waypoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:482:1: ( rule__Waypoint__Group__5__Impl rule__Waypoint__Group__6 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:483:2: rule__Waypoint__Group__5__Impl rule__Waypoint__Group__6
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__5__Impl_in_rule__Waypoint__Group__51045);
            rule__Waypoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__6_in_rule__Waypoint__Group__51048);
            rule__Waypoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__5"


    // $ANTLR start "rule__Waypoint__Group__5__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:490:1: rule__Waypoint__Group__5__Impl : ( ( rule__Waypoint__DtmAssignment_5 ) ) ;
    public final void rule__Waypoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:494:1: ( ( ( rule__Waypoint__DtmAssignment_5 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:495:1: ( ( rule__Waypoint__DtmAssignment_5 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:495:1: ( ( rule__Waypoint__DtmAssignment_5 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:496:1: ( rule__Waypoint__DtmAssignment_5 )
            {
             before(grammarAccess.getWaypointAccess().getDtmAssignment_5()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:497:1: ( rule__Waypoint__DtmAssignment_5 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:497:2: rule__Waypoint__DtmAssignment_5
            {
            pushFollow(FOLLOW_rule__Waypoint__DtmAssignment_5_in_rule__Waypoint__Group__5__Impl1075);
            rule__Waypoint__DtmAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getDtmAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__5__Impl"


    // $ANTLR start "rule__Waypoint__Group__6"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:507:1: rule__Waypoint__Group__6 : rule__Waypoint__Group__6__Impl rule__Waypoint__Group__7 ;
    public final void rule__Waypoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:511:1: ( rule__Waypoint__Group__6__Impl rule__Waypoint__Group__7 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:512:2: rule__Waypoint__Group__6__Impl rule__Waypoint__Group__7
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__6__Impl_in_rule__Waypoint__Group__61105);
            rule__Waypoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__7_in_rule__Waypoint__Group__61108);
            rule__Waypoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__6"


    // $ANTLR start "rule__Waypoint__Group__6__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:519:1: rule__Waypoint__Group__6__Impl : ( ( rule__Waypoint__CogAssignment_6 ) ) ;
    public final void rule__Waypoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:523:1: ( ( ( rule__Waypoint__CogAssignment_6 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:524:1: ( ( rule__Waypoint__CogAssignment_6 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:524:1: ( ( rule__Waypoint__CogAssignment_6 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:525:1: ( rule__Waypoint__CogAssignment_6 )
            {
             before(grammarAccess.getWaypointAccess().getCogAssignment_6()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:526:1: ( rule__Waypoint__CogAssignment_6 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:526:2: rule__Waypoint__CogAssignment_6
            {
            pushFollow(FOLLOW_rule__Waypoint__CogAssignment_6_in_rule__Waypoint__Group__6__Impl1135);
            rule__Waypoint__CogAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getCogAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__6__Impl"


    // $ANTLR start "rule__Waypoint__Group__7"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:536:1: rule__Waypoint__Group__7 : rule__Waypoint__Group__7__Impl rule__Waypoint__Group__8 ;
    public final void rule__Waypoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:540:1: ( rule__Waypoint__Group__7__Impl rule__Waypoint__Group__8 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:541:2: rule__Waypoint__Group__7__Impl rule__Waypoint__Group__8
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__7__Impl_in_rule__Waypoint__Group__71165);
            rule__Waypoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__8_in_rule__Waypoint__Group__71168);
            rule__Waypoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__7"


    // $ANTLR start "rule__Waypoint__Group__7__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:548:1: rule__Waypoint__Group__7__Impl : ( ( rule__Waypoint__SogAssignment_7 ) ) ;
    public final void rule__Waypoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:552:1: ( ( ( rule__Waypoint__SogAssignment_7 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:553:1: ( ( rule__Waypoint__SogAssignment_7 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:553:1: ( ( rule__Waypoint__SogAssignment_7 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:554:1: ( rule__Waypoint__SogAssignment_7 )
            {
             before(grammarAccess.getWaypointAccess().getSogAssignment_7()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:555:1: ( rule__Waypoint__SogAssignment_7 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:555:2: rule__Waypoint__SogAssignment_7
            {
            pushFollow(FOLLOW_rule__Waypoint__SogAssignment_7_in_rule__Waypoint__Group__7__Impl1195);
            rule__Waypoint__SogAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getSogAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__7__Impl"


    // $ANTLR start "rule__Waypoint__Group__8"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:565:1: rule__Waypoint__Group__8 : rule__Waypoint__Group__8__Impl rule__Waypoint__Group__9 ;
    public final void rule__Waypoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:569:1: ( rule__Waypoint__Group__8__Impl rule__Waypoint__Group__9 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:570:2: rule__Waypoint__Group__8__Impl rule__Waypoint__Group__9
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__8__Impl_in_rule__Waypoint__Group__81225);
            rule__Waypoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__9_in_rule__Waypoint__Group__81228);
            rule__Waypoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__8"


    // $ANTLR start "rule__Waypoint__Group__8__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:577:1: rule__Waypoint__Group__8__Impl : ( ( rule__Waypoint__ManeuverAssignment_8 ) ) ;
    public final void rule__Waypoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:581:1: ( ( ( rule__Waypoint__ManeuverAssignment_8 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:582:1: ( ( rule__Waypoint__ManeuverAssignment_8 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:582:1: ( ( rule__Waypoint__ManeuverAssignment_8 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:583:1: ( rule__Waypoint__ManeuverAssignment_8 )
            {
             before(grammarAccess.getWaypointAccess().getManeuverAssignment_8()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:584:1: ( rule__Waypoint__ManeuverAssignment_8 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:584:2: rule__Waypoint__ManeuverAssignment_8
            {
            pushFollow(FOLLOW_rule__Waypoint__ManeuverAssignment_8_in_rule__Waypoint__Group__8__Impl1255);
            rule__Waypoint__ManeuverAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getManeuverAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__8__Impl"


    // $ANTLR start "rule__Waypoint__Group__9"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:594:1: rule__Waypoint__Group__9 : rule__Waypoint__Group__9__Impl rule__Waypoint__Group__10 ;
    public final void rule__Waypoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:598:1: ( rule__Waypoint__Group__9__Impl rule__Waypoint__Group__10 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:599:2: rule__Waypoint__Group__9__Impl rule__Waypoint__Group__10
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__9__Impl_in_rule__Waypoint__Group__91285);
            rule__Waypoint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Waypoint__Group__10_in_rule__Waypoint__Group__91288);
            rule__Waypoint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__9"


    // $ANTLR start "rule__Waypoint__Group__9__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:606:1: rule__Waypoint__Group__9__Impl : ( ( rule__Waypoint__ForesailAssignment_9 ) ) ;
    public final void rule__Waypoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:610:1: ( ( ( rule__Waypoint__ForesailAssignment_9 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:611:1: ( ( rule__Waypoint__ForesailAssignment_9 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:611:1: ( ( rule__Waypoint__ForesailAssignment_9 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:612:1: ( rule__Waypoint__ForesailAssignment_9 )
            {
             before(grammarAccess.getWaypointAccess().getForesailAssignment_9()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:613:1: ( rule__Waypoint__ForesailAssignment_9 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:613:2: rule__Waypoint__ForesailAssignment_9
            {
            pushFollow(FOLLOW_rule__Waypoint__ForesailAssignment_9_in_rule__Waypoint__Group__9__Impl1315);
            rule__Waypoint__ForesailAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getForesailAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__9__Impl"


    // $ANTLR start "rule__Waypoint__Group__10"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:623:1: rule__Waypoint__Group__10 : rule__Waypoint__Group__10__Impl ;
    public final void rule__Waypoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:627:1: ( rule__Waypoint__Group__10__Impl )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:628:2: rule__Waypoint__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Waypoint__Group__10__Impl_in_rule__Waypoint__Group__101345);
            rule__Waypoint__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__10"


    // $ANTLR start "rule__Waypoint__Group__10__Impl"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:634:1: rule__Waypoint__Group__10__Impl : ( ( rule__Waypoint__MainsailAssignment_10 ) ) ;
    public final void rule__Waypoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:638:1: ( ( ( rule__Waypoint__MainsailAssignment_10 ) ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:639:1: ( ( rule__Waypoint__MainsailAssignment_10 ) )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:639:1: ( ( rule__Waypoint__MainsailAssignment_10 ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:640:1: ( rule__Waypoint__MainsailAssignment_10 )
            {
             before(grammarAccess.getWaypointAccess().getMainsailAssignment_10()); 
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:641:1: ( rule__Waypoint__MainsailAssignment_10 )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:641:2: rule__Waypoint__MainsailAssignment_10
            {
            pushFollow(FOLLOW_rule__Waypoint__MainsailAssignment_10_in_rule__Waypoint__Group__10__Impl1372);
            rule__Waypoint__MainsailAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getWaypointAccess().getMainsailAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__Group__10__Impl"


    // $ANTLR start "rule__Waypoint__WaypointAssignment_1"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:674:1: rule__Waypoint__WaypointAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Waypoint__WaypointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:678:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:679:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:679:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:680:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getWaypointSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__WaypointAssignment_11429); 
             after(grammarAccess.getWaypointAccess().getWaypointSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__WaypointAssignment_1"


    // $ANTLR start "rule__Waypoint__PositionAssignment_2"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:689:1: rule__Waypoint__PositionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Waypoint__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:693:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:694:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:694:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:695:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getPositionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__PositionAssignment_21460); 
             after(grammarAccess.getWaypointAccess().getPositionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__PositionAssignment_2"


    // $ANTLR start "rule__Waypoint__NoteAssignment_3"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:704:1: rule__Waypoint__NoteAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Waypoint__NoteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:708:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:709:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:709:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:710:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getNoteSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__NoteAssignment_31491); 
             after(grammarAccess.getWaypointAccess().getNoteSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__NoteAssignment_3"


    // $ANTLR start "rule__Waypoint__BtmAssignment_4"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:719:1: rule__Waypoint__BtmAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Waypoint__BtmAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:723:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:724:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:724:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:725:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getBtmSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__BtmAssignment_41522); 
             after(grammarAccess.getWaypointAccess().getBtmSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__BtmAssignment_4"


    // $ANTLR start "rule__Waypoint__DtmAssignment_5"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:734:1: rule__Waypoint__DtmAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Waypoint__DtmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:738:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:739:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:739:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:740:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getDtmSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__DtmAssignment_51553); 
             after(grammarAccess.getWaypointAccess().getDtmSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__DtmAssignment_5"


    // $ANTLR start "rule__Waypoint__CogAssignment_6"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:749:1: rule__Waypoint__CogAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Waypoint__CogAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:753:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:754:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:754:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:755:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getCogSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__CogAssignment_61584); 
             after(grammarAccess.getWaypointAccess().getCogSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__CogAssignment_6"


    // $ANTLR start "rule__Waypoint__SogAssignment_7"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:764:1: rule__Waypoint__SogAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Waypoint__SogAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:768:1: ( ( RULE_STRING ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:769:1: ( RULE_STRING )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:769:1: ( RULE_STRING )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:770:1: RULE_STRING
            {
             before(grammarAccess.getWaypointAccess().getSogSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Waypoint__SogAssignment_71615); 
             after(grammarAccess.getWaypointAccess().getSogSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__SogAssignment_7"


    // $ANTLR start "rule__Waypoint__ManeuverAssignment_8"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:779:1: rule__Waypoint__ManeuverAssignment_8 : ( ruleManeuver ) ;
    public final void rule__Waypoint__ManeuverAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:783:1: ( ( ruleManeuver ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:784:1: ( ruleManeuver )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:784:1: ( ruleManeuver )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:785:1: ruleManeuver
            {
             before(grammarAccess.getWaypointAccess().getManeuverManeuverEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleManeuver_in_rule__Waypoint__ManeuverAssignment_81646);
            ruleManeuver();

            state._fsp--;

             after(grammarAccess.getWaypointAccess().getManeuverManeuverEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__ManeuverAssignment_8"


    // $ANTLR start "rule__Waypoint__ForesailAssignment_9"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:794:1: rule__Waypoint__ForesailAssignment_9 : ( ruleForesail ) ;
    public final void rule__Waypoint__ForesailAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:798:1: ( ( ruleForesail ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:799:1: ( ruleForesail )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:799:1: ( ruleForesail )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:800:1: ruleForesail
            {
             before(grammarAccess.getWaypointAccess().getForesailForesailEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleForesail_in_rule__Waypoint__ForesailAssignment_91677);
            ruleForesail();

            state._fsp--;

             after(grammarAccess.getWaypointAccess().getForesailForesailEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__ForesailAssignment_9"


    // $ANTLR start "rule__Waypoint__MainsailAssignment_10"
    // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:809:1: rule__Waypoint__MainsailAssignment_10 : ( ruleMainsail ) ;
    public final void rule__Waypoint__MainsailAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:813:1: ( ( ruleMainsail ) )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:814:1: ( ruleMainsail )
            {
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:814:1: ( ruleMainsail )
            // ../org.xtext.htwg.seapal.waypoint.ui/src-gen/org/xtext/htwg/seapal/ui/contentassist/antlr/internal/InternalWaypoint.g:815:1: ruleMainsail
            {
             before(grammarAccess.getWaypointAccess().getMainsailMainsailEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleMainsail_in_rule__Waypoint__MainsailAssignment_101708);
            ruleMainsail();

            state._fsp--;

             after(grammarAccess.getWaypointAccess().getMainsailMainsailEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Waypoint__MainsailAssignment_10"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWaypoint_in_entryRuleWaypoint61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWaypoint68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__0_in_ruleWaypoint94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Maneuver__Alternatives_in_ruleManeuver131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Foresail__Alternatives_in_ruleForesail167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mainsail__Alternatives_in_ruleMainsail203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Maneuver__Alternatives239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Maneuver__Alternatives260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Maneuver__Alternatives281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Maneuver__Alternatives302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Maneuver__Alternatives323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Maneuver__Alternatives344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Maneuver__Alternatives365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Maneuver__Alternatives386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Maneuver__Alternatives407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Maneuver__Alternatives428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Foresail__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Foresail__Alternatives485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Foresail__Alternatives506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Foresail__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Foresail__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Foresail__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Foresail__Alternatives590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Foresail__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Mainsail__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Mainsail__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mainsail__Alternatives689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Mainsail__Alternatives710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__0__Impl_in_rule__Waypoint__Group__0743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__1_in_rule__Waypoint__Group__0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Waypoint__Group__0__Impl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__1__Impl_in_rule__Waypoint__Group__1805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__2_in_rule__Waypoint__Group__1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__WaypointAssignment_1_in_rule__Waypoint__Group__1__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__2__Impl_in_rule__Waypoint__Group__2865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__3_in_rule__Waypoint__Group__2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__PositionAssignment_2_in_rule__Waypoint__Group__2__Impl895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__3__Impl_in_rule__Waypoint__Group__3925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__4_in_rule__Waypoint__Group__3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__NoteAssignment_3_in_rule__Waypoint__Group__3__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__4__Impl_in_rule__Waypoint__Group__4985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__5_in_rule__Waypoint__Group__4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__BtmAssignment_4_in_rule__Waypoint__Group__4__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__5__Impl_in_rule__Waypoint__Group__51045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__6_in_rule__Waypoint__Group__51048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__DtmAssignment_5_in_rule__Waypoint__Group__5__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__6__Impl_in_rule__Waypoint__Group__61105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__7_in_rule__Waypoint__Group__61108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__CogAssignment_6_in_rule__Waypoint__Group__6__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__7__Impl_in_rule__Waypoint__Group__71165 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__8_in_rule__Waypoint__Group__71168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__SogAssignment_7_in_rule__Waypoint__Group__7__Impl1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__8__Impl_in_rule__Waypoint__Group__81225 = new BitSet(new long[]{0x000000000FE00800L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__9_in_rule__Waypoint__Group__81228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__ManeuverAssignment_8_in_rule__Waypoint__Group__8__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__9__Impl_in_rule__Waypoint__Group__91285 = new BitSet(new long[]{0x0000000070000800L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__10_in_rule__Waypoint__Group__91288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__ForesailAssignment_9_in_rule__Waypoint__Group__9__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__Group__10__Impl_in_rule__Waypoint__Group__101345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Waypoint__MainsailAssignment_10_in_rule__Waypoint__Group__10__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__WaypointAssignment_11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__PositionAssignment_21460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__NoteAssignment_31491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__BtmAssignment_41522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__DtmAssignment_51553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__CogAssignment_61584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Waypoint__SogAssignment_71615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleManeuver_in_rule__Waypoint__ManeuverAssignment_81646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForesail_in_rule__Waypoint__ForesailAssignment_91677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainsail_in_rule__Waypoint__MainsailAssignment_101708 = new BitSet(new long[]{0x0000000000000002L});

}