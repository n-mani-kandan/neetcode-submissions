class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr= s.trim().split(" ");
        int length = arr.length;

    System.out.println(arr[length-1].length());
        return arr[length-1].length();
    }
}