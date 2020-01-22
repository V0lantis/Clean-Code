// formatting.java

// --------- Vertical Density ---------

// CORRECTION

public class ReporterConfig {
  private String m_className;
  private List<Property> m_properties = new ArrayList<Property>();
 
  public void addProperty(Property property) {
    m_properties.add(property);
 }
}

// --------- Instance variables ---------

// CORRECTION

public class TestSuite implements Test {
  private String fName;
  private Vector <Test> fTests = new Vector <Test>(10);
  
  static public Test createTest(Class << ? extends TestCase > theClass,
      String name) {
       //...
  }

  public static Constructor <? extends TestCase >
  getTestConstructor(Class << ? extends TestCase > theClass)
  throws NoSuchMethodException {  
    //...
  }

  public static Test warning(final String message) {  
    //...
  }

  private static String exceptionToString(Throwable t) {  
    //...
  }

  public TestSuite() {}

  public TestSuite(final Class << ? extends TestCase > theClass) {  
    //...
  }

  public TestSuite(Class << ? extends TestCase > theClass, String name){  
    //...
  } 
  //...............
}
