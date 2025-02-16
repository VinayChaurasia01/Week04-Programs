package reflections.basic;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateFieldTest {
    @Test
    void testValidClass() {
        assertDoesNotThrow(() -> AccessPrivateField.getClassInformation("java.lang.String"));
    }

    @Test
    void testInvalidClass() {
        assertThrows(ClassNotFoundException.class, () -> AccessPrivateField.getClassInformation("InvalidClass"));
    }

    @Test
    void testMethodsPresence() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
        Method methods[] = clazz.getDeclaredMethods();
        assertTrue(methods.length > 0);
    }

    @Test
    void testFieldsPresence() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
        Field fields[] = clazz.getDeclaredFields();
        assertNotNull(fields);
    }

    @Test
    void testConstructorsPresence() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
        Constructor constructors[] = clazz.getDeclaredConstructors();
        assertTrue(constructors.length > 0);
    }

    @Test
    void testAccessPrivateField() throws Exception {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person, 25);
        assertEquals(25, field.get(person));
    }
}
