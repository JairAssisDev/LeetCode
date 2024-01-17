class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[]{1};
        }
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0 && digits[i] > 9; i--) {
            digits[i] = 0;
            digits[i - 1]++;
        }
        if (digits[0] > 9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = digits[0] % 10;
            return result;
        } else {
            return digits;
        }
    }
}
