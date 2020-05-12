import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyTestClass2 extends SeleniumAbstractTest {

  @Test(threadPoolSize = 5,invocationCount = 6)
  public void myTestMethod3() {
    System.out.println("myTestMethod3");
  }

  @Test
  public void myTestMethod4() {
    System.out.println("myTestMethod4");
  }
}
