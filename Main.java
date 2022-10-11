
class Main {

  // Given an array of sorted numbers, remove all duplicates from it. You should
  // not use any extra space; after removing the duplicates in-place return the
  // new length of the array.

  // Input: [2, 3, 3, 3, 6, 9, 9]
  // Output: 4
  // Explanation: The first four elements after removing the duplicates will be
  // [2, 3, 6, 9].

  private static int lengthOfNonDuplicates(int[] arr) {
    int nonDuplicateIndex = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[nonDuplicateIndex - 1] != arr[i]) {
        arr[nonDuplicateIndex] = arr[i];
        nonDuplicateIndex++;
      }
    }
    return nonDuplicateIndex;
  }

  // Problem 1: Given an unsorted array of numbers and a target ‘key’, remove all
  // instances of ‘key’ in-place and return the new length of the array.
  // Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
  // Output: 4
  // Explanation: The first four elements after removing every 'Key' will be [2,
  // 6, 10, 9].

  private static int removeKeyInstances(int[] arr, int key) {
    int nonDuplicateIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      if (key != arr[i]) {
        arr[nonDuplicateIndex] = arr[i];
        nonDuplicateIndex++;
      }
    }
    return nonDuplicateIndex;
  }

  public static void main(String[] args) {
    int result = Main.lengthOfNonDuplicates(new int[] { 2, 3, 3, 3, 6, 9, 9 });
    System.out.println(result);
    int result2 = Main.removeKeyInstances(new int[] { 3, 2, 3, 6, 3, 10, 9, 3 }, 3);
    System.out.println(result2);

  }

}