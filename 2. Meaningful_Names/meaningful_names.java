// meaningful_names.java

// --------- Choose descriptive and unambiguous names. ---------

// Refactore all the variables and functions' names to remove comments 
// And remove an ambiguity

int d; //  elapsed time in days

public List<int[]> getThem() {
  List<int[]> list1 = new ArrayList<int[]>();

  for (int[] x: theList)
    if (x[0] == 4)
      list1.add(x);
  return list1
}

// --------- Make meaningful distinction. ---------

// Refactore all the variables and functions' name to add meaningful distinctions 

public static void copyChars (char a1[], char a2[]) {
  for (int i = 0; i < a1.lenght; i++) {
    a2[i] = a1[i];
  }
}

// --------- Use pronounceable names. ---------

// Refactore all the variables and functions' name to add  pronounceable names 

class DtaRcrd102 {
	private Date genymdhms;
	/* ... */
}

// --------- Use searchable names. ---------

// Refactore all the variables and functions' name to add  searchable names 

for (int j=0; j<34; j++) {
	s += (t[j]*4)/5;
}

// --------- Add Meaningful Context --------- 

// Refactore all the variables and functions' name to add Meaningful Context

private void printGuessStatistics(char candidate, int count) {
  String number;
  String verb;
  String pluralModifier;
  if (count == 0) {
    number = "no";
    verb = "are";
    pluralModifier = "s";
  } else if (count == 1) {
    number = "1";
    verb = "is";
    pluralModifier = "";
  } else {
    number = Integer.toString(count);
    verb = "are";
    pluralModifier = "s";
  }
  String guessMessage = String.format(
    "There %s %s %s%s", verb, number, candidate, pluralModifier
  );
  print(guessMessage);
}
