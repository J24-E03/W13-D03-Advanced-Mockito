package com.dci.powermock;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UtilityTest {

    @Test
    void verifySayHelloStaticMethod() {
        String name = "Robert Bosch";

        try (MockedStatic<Utility> mockedStatic = mockStatic(Utility.class)) {
            mockedStatic.when(() -> Utility.sayHello(name)).thenReturn("Hello! Robert Bosch");

            String actualMessage = Utility.sayHello(name);
            assertEquals("Hello! Robert Bosch", actualMessage);
        }
    }

    @Test
    void verifyGetGreetingMessagePrivateMethod() {
        String name = "Robert Bosch";

        Utility utility = spy(new Utility());
        doReturn("Good Morning! Robert Bosch").when(utility).getMessage(name);

        String actualMessage = utility.getGreetingMessage(name);
        assertEquals("Good Morning! Robert Bosch", actualMessage);
    }

    @Test
    void verifyGetGreetingMessageFinalMethod() {
        String name = "Robert Bosch";

        Utility utility = mock(Utility.class);
        when(utility.getCongratsMessage(name)).thenReturn("Congratulations! Robert Bosch");

        String actualMessage = utility.getCongratsMessage(name);
        assertEquals("Congratulations! Robert Bosch", actualMessage);
    }
}