package unit_testing.basic;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.basic.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager(); // Initialize before each test
        list = new ArrayList<>(); // Create a new empty list for each test
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 5);
        assertEquals(1, list.size(), "List size should be 1 after adding an element");
        assertTrue(list.contains(5), "List should contain the added element 5");
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        boolean removed = listManager.removeElement(list, 10);

        assertTrue(removed, "Element 10 should be removed");
        assertFalse(list.contains(10), "List should not contain removed element 10");
        assertEquals(1, list.size(), "List size should be 1 after removal");
    }

    @Test
    void testRemoveElement_NotFound() {
        listManager.addElement(list, 30);
        boolean removed = listManager.removeElement(list, 40);

        assertFalse(removed, "Element 40 is not in the list, so remove should return false");
        assertEquals(1, list.size(), "List size should remain unchanged");
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        listManager.addElement(list, 25);

        assertEquals(3, listManager.getSize(list), "List size should be 3 after adding elements");
    }
}