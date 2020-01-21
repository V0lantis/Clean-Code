// meaningful_names.java

// --------- Choose descriptive and unambiguous names. ---------

/* CORRECTION */

int elapsedTimeInDays; // ALSO ACCEPTED : daysSinceCreation | daysSinceModification | fileAgeInDays

public List<int[]> getFlaggedCells() {
  List<int[]> flaggedCells = new ArrayList<int[]>();

  for (int[] cell: gameBoard)
    if (cell[STATUS_VALUE] == FLAGGED)
      flaggedCells.add(cell);
  return flaggedCells;
}

/* ----------- OR ------------ */
public List<Cell> getFlaggedCells() {
  List<Cell> flaggedCells = new ArrayList<Cell>();

  for (Cell cell: gameBoard)
    if (cell.isFlagged())
      flaggedCells.add(cell);
  return flaggedCells;
}


// --------- Make meaningful distinction. ---------

/* CORRECTION */

public static void copyChars (char origin[], char destination[]) {
  for (int i = 0; i < origin.lenght; i++) {
    destination[i] = origin[i];
  }
}

// --------- Use pronounceable names. ---------

/* Refactore all the variables and functions' name to add  pronounceable names */

class Customer {
	private Date generationTimestamp;
	/* ... */
}

// --------- Use searchable names. ---------

/* CORRECTION */

int realDaysPerIdealDay = 4;
const int WORK_DAYS_PER_WEEK = 5;
int sum = 0;
for (int j=0; j < NUMBER_OF_TASKS; j++) {
	int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
	int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
	sum += realTaskWeeks;
}

// --------- Add Meaningful Context --------- 

// CORRECTION

private class GuessStaticMessage {
  private String number;
  private String verb;
  private String pluralModifier;
  
  public String make(char candidate, int count) {
    createPluralDependentMessageParts(count);
    return String.format(
      "There %s %s %s%s",
      verb, number, candidate, pluralModifier );
  }

  private void createPluralDependentMessageParts(int count) {
    if (count == 0) {
      thereAreNoLetters();
    } else if (count == 1) {
      thereIsOneLetter();
    } else {
      thereAreManyLetters(count);
    }
  }

  private void thereAreNoLetters() {
    number = "no";
    verb = "are";
    pluralModifier = "s";
  }

  private void thereIsOneLetter() {
    number = "1";
    verb = "is";
    pluralModifier = "";
  }

  private void thereAreManyLetters(count) {
    number = Integer.toString(count);
    verb = "are";
    pluralModifier = "s";
  }
}

