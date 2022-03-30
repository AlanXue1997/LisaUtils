package lisautils.list;

abstract public class LisaIntList {
  LisaIntList(int maxLength) {

  }

  abstract boolean add(int number);

  abstract boolean add(int index, int number);

  abstract void clear();

  abstract int get(int index);

  abstract int size();
}
