import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	
   String message = "Hello World";	
   HelloWorld messageUtil = new HelloWorld(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}