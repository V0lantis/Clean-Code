// objects_and_Data_Structures.java file

// What better implementation of the following class we could think of? CORRECTION

public interface Vehicule {
  double getPercentFuelRemaining();
} 

// Abstract vehicle doesn't expose the details of the data.
// The worst option is to blithely add getters and setters