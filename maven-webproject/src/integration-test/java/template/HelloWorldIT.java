package template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldIT {

    @Test
    public void testGetHelloWorldSlow() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World (slow version)", helloWorld.getHelloWorldSlow());
    }

}
