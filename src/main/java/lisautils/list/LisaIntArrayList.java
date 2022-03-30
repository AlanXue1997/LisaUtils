package lisautils.list;

public class LisaIntArrayList extends LisaIntList{
  LisaIntArrayList(int maxLength) {
    super(maxLength);
  }

  @Override
  boolean add(int number) {
    return false;
  }

  @Override
  boolean add(int index, int number) {
    return false;
  }

  @Override
  void clear() {

  }

  @Override
  int get(int index) {
    return 0;
  }

  @Override
  int size() {
    return 0;
  }
}
