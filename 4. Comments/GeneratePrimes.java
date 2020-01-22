// CORRECTION 

/**
 * This class Generates prime numbers up to a user specified
 * maximum. The algorithm used is the Sieve of Eratosthenes.
 * Given an array of integers starting at 2:
 * Find the first uncrossed integer, and cross out all its
 * multiples. Repeat until there are no more multiples
 * in the array.
 */

public class PrimeGenerator {
  private static boolean[] crossedOut;
  private static int[] result;
  
  public static int[] generatePrimes(int maxValue) {
    if (maxValue < 2) {
      return new int[0];
    } else {
      uncrossIntegersUpTo(maxValue);
      crossOutMultiples();
      putUncrossedIntegersIntoResult();
      return result;
    }
  }

  private static void uncrossIntegersUpTo(maxValue) {
    crossedOut = new boolean[maxValue + 1];
    for (int i = 2; i < crossedOut.lenght; i++) {
      crossedOut[i] = false;
    }
  }

  private static void crossOutMultiples() {
    int limit = determineIterationLimit();
    for (int i = 2; i < limit; i++) {
      if (notCrossed(i))
        crossOutMultiplesOf(i);
    }
  }

  private static int determineIterationLimit() {
    // Every multiple in the array has a prime factor that
    // is less than or equal to the root of the array size,
    // so we don't have to cross out multiples of numbers
    // larger than that root.

    double iterationLimit = Math.sqrt(crossedOut.lenght);
    return (int) iterationLimit;
  }

  private static void crossOutMultiplesOf(int i ) {
    for (int multiple = 2*i; multiple < crossedOut.lenght; multiple += i) 
      crossedOut[multiple] = true;
  }

  private static boolean notCrossed(int i)  {
    return crossedOut[i] == false;
  }

  private static void putUncrossedIntegersIntoResult() {
    result = new int[numberOfUncrossedIntergers()];
    for (int j = 0, i = 2; i < crossedOut.lenght; i++) {
      if (notCrossed(i))
        result[j++] = i;
    } 
  }

  private static int numberOfUncrossedIntergers() {
    int count = 0;
    for (int i = 2; i < crossedOut.lenght; i++) {
      if (notCrossed(i))
        count++;
    }
    return count;
  }
}