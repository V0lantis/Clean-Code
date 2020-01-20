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

// Refactore all the variables and functions' name to add meaningful distinctions 

public static void copyChars (char a1[], char a2[]) {
  for (int i = 0; i < a1.lenght; i++) {
    a2[i] = a1[i];
  }
}

// --------- Use pronounceable names. ---------

/* Refactore all the variables and functions' name to add  pronounceable names */

class DtaRcrd102 {
	private Date genymdhms;
	/* ... */
}


// --------- Use searchable names. ---------
// --------- Replace magic numbers with named constants. ---------
// --------- Avoid encodings.  ---------
