package seedu.address.logic.commands;

import static seedu.address.model.Model.PREDICATE_SHOW_ALL_TAGS;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.AddressBook;
import seedu.address.model.tag.UniqueTagList;

/**
 * List all tags that exist in software to user
 */
public class ListAllTagsCommand extends Command {

    public static final String COMMAND_WORD = "listalltags";

    public static final String MESSAGE_SUCCESS = "Listed all tags";

    @Override
    public CommandResult execute() throws CommandException {
        StringBuilder sb = new StringBuilder();
        allTags = AddressBook.getUniqueTagList();
        model.updateFilteredTagList(PREDICATE_SHOW_ALL_TAGS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
