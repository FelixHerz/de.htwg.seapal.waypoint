package org.xtext.htwg.seapal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.htwg.seapal.services.WaypointGrammarAccess;
import org.xtext.htwg.seapal.waypoint.Waypoint;
import org.xtext.htwg.seapal.waypoint.WaypointPackage;

@SuppressWarnings("all")
public class WaypointSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WaypointGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == WaypointPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WaypointPackage.WAYPOINT:
				if(context == grammarAccess.getWaypointRule()) {
					sequence_Waypoint(context, (Waypoint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         waypoint=STRING 
	 *         position=STRING 
	 *         note=STRING 
	 *         btm=STRING 
	 *         dtm=STRING 
	 *         cog=STRING 
	 *         sog=STRING 
	 *         maneuver=Maneuver 
	 *         foresail=Foresail 
	 *         mainsail=Mainsail
	 *     )
	 */
	protected void sequence_Waypoint(EObject context, Waypoint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__WAYPOINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__WAYPOINT));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__POSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__POSITION));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__NOTE));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__BTM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__BTM));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__DTM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__DTM));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__COG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__COG));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__SOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__SOG));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__MANEUVER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__MANEUVER));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__FORESAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__FORESAIL));
			if(transientValues.isValueTransient(semanticObject, WaypointPackage.Literals.WAYPOINT__MAINSAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WaypointPackage.Literals.WAYPOINT__MAINSAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWaypointAccess().getWaypointSTRINGTerminalRuleCall_1_0(), semanticObject.getWaypoint());
		feeder.accept(grammarAccess.getWaypointAccess().getPositionSTRINGTerminalRuleCall_2_0(), semanticObject.getPosition());
		feeder.accept(grammarAccess.getWaypointAccess().getNoteSTRINGTerminalRuleCall_3_0(), semanticObject.getNote());
		feeder.accept(grammarAccess.getWaypointAccess().getBtmSTRINGTerminalRuleCall_4_0(), semanticObject.getBtm());
		feeder.accept(grammarAccess.getWaypointAccess().getDtmSTRINGTerminalRuleCall_5_0(), semanticObject.getDtm());
		feeder.accept(grammarAccess.getWaypointAccess().getCogSTRINGTerminalRuleCall_6_0(), semanticObject.getCog());
		feeder.accept(grammarAccess.getWaypointAccess().getSogSTRINGTerminalRuleCall_7_0(), semanticObject.getSog());
		feeder.accept(grammarAccess.getWaypointAccess().getManeuverManeuverEnumRuleCall_8_0(), semanticObject.getManeuver());
		feeder.accept(grammarAccess.getWaypointAccess().getForesailForesailEnumRuleCall_9_0(), semanticObject.getForesail());
		feeder.accept(grammarAccess.getWaypointAccess().getMainsailMainsailEnumRuleCall_10_0(), semanticObject.getMainsail());
		feeder.finish();
	}
}
