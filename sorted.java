abstract class Sorted {
    public boolean isSorted(int[] array) {
        int prev = array[0];
    
        for (int i = 0; i < array.length; i++) {
            if (negativeCompare(prev, array[i])) {
                return false;
            }
            prev = array[i];
        }
        return true;
    }
    
    abstract protected boolean negativeCompare(int a, int b);
}

class SortedAscending extends Sorted {
    protected boolean negativeCompare(int a, int b) {
        return a > b;
    }
}

class SortedDescending extends Sorted {
    protected boolean negativeCompare(int a, int b) {
        return a < b;
    }
}

class Solution {
  public static String isSortedAndHow(int[] array) {
      Sorted asc = new SortedAscending();
      Sorted des = new SortedDescending();
  
      if (asc.isSorted(array)) {
          return "yes, ascending";
      }
      
      if (des.isSorted(array)) {
          return "yes, descending";
      }
      
      return "no";
  }
  
}