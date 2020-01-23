// objects_and_Data_Structures.java file

// What better implementation of the following class we could think of?

public interface Vehicule {
  double getFuelTankCapacityInGallons();
  double getGallonsOfGasoline();
}

// Law of Demeter : Refactore the following code in order to respect the Law of Demeter:

final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();