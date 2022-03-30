package lisautils.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class LisaIntListTest {
  LisaIntList list;

  @BeforeEach
  abstract void setup();

  @Test
  void test() {
    list.add(0);
    list.add(1);
    list.add(2);
    assertEquals(3, list.size());
    assertEquals(0, list.get(0));
    assertEquals(1, list.get(1));
    assertEquals(2, list.get(2));
    list.add(2, 0);
    list.add(1, 1);
    list.add(0, 2);
    assertEquals(0, list.get(2));
    assertEquals(1, list.get(1));
    assertEquals(2, list.get(0));
    list.clear();
    assertEquals(0, list.size());
  }
}