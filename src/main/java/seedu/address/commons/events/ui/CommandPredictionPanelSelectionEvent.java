package seedu.address.commons.events.ui;

import seedu.address.commons.events.BaseEvent;

//@@author zameschua
/**
 * Indicates a change in selection of the CommandPredictionPanel
 */
public class CommandPredictionPanelSelectionEvent extends BaseEvent {

    private String currentSelection;

    public CommandPredictionPanelSelectionEvent(String currentSelection) {
        this.currentSelection = currentSelection;
    }

    public String getCurrentSelection() {
        return currentSelection;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
