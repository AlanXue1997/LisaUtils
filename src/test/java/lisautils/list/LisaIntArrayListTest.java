package lisautils.list;


import org.junit.jupiter.api.BeforeEach;

class LisaIntArrayListTest extends LisaIntListTest {

  @Override
  @BeforeEach
  void setup() {
    list = new LisaIntArrayList(3);
  }
}