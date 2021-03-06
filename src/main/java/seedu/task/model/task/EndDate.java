package seedu.task.model.task;

import seedu.task.commons.exceptions.IllegalValueException;

/**
 * Represents a Person's deadline number in the task manager.
 * Guarantees: immutable; is valid as declared in {@link #isValidDeadline(String)}
 */
public class EndDate {

    public static final String MESSAGE_DEADLINE_CONSTRAINTS = "Task deadline should be of dd/mm/yyyy format";
    public static final String DEADLINE_VALIDATION_REGEX = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";

    public final String value;

    /**
     * Validates given deadline number.
     *
     * @throws IllegalValueException if given deadline string is invalid.
     */
    public EndDate(String endDate) throws IllegalValueException {
        assert endDate != null;
        String trimmedDeadline = endDate.trim();
        if (!isValidDeadline(trimmedDeadline)) {
            throw new IllegalValueException(MESSAGE_DEADLINE_CONSTRAINTS);
        }
        this.value = trimmedDeadline;
    }

    /**
     * Returns true if a given string is a valid person deadline number.
     */
    public static boolean isValidDeadline(String test) {
        return test.matches(DEADLINE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof EndDate // instanceof handles nulls
                && this.value.equals(((EndDate) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
