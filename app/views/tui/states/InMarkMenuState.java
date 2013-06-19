package views.tui.states;

import com.google.inject.Inject;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.views.tui.MarkTUI;

public class InMarkMenuState implements TuiState {

	private final MarkTUI markTUI;
	private final StateFactory stateFactory;

	@Inject
	public InMarkMenuState(final StateFactory stateFactory, final IMarkController markController) {
		markTUI = new MarkTUI(markController);
		this.stateFactory = stateFactory;
	}

	@Override
	public void print() {
		markTUI.printTUI();
	}

	@Override
	public boolean process(final StateContext context, final String arg1) {
		if (arg1.equalsIgnoreCase("q")) {
			context.setState(stateFactory.createInMenuState());
			return true;
		}
		boolean ret =  markTUI.processInputLine(arg1);
		print();
		return ret;
	}

}
