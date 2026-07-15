// Last updated: 7/15/2026, 2:10:34 PM
class Solution {
    public String intToRoman(int num) {
        char[] symbols = new char[8];
        symbols[0] = 'I';
        symbols[1] = 'V';
        symbols[2] = 'X';
        symbols[3] = 'L';
        symbols[4] = 'C';
        symbols[5] = 'D';
        symbols[6] = 'M';
        int k = 0;

        char[] arr = new char[15];
        int ptr = 14;
        for (; num > 0; num /= 10) {
            switch(num % 10) {
                case 0:
                    break;

                case 1:
                    arr[ptr--] = symbols[k];
                    break;

                case 2:
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    break;

                case 3:
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    break;

                case 4:
                    arr[ptr--] = symbols[k + 1];
                    arr[ptr--] = symbols[k];
                    break;

                case 5:
                    arr[ptr--] = symbols[k + 1];
                    break;

                case 6:
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k + 1];
                    break;

                case 7:
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k + 1];
                    break;

                case 8:
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k];
                    arr[ptr--] = symbols[k + 1];
                    break;

                case 9:
                    arr[ptr--] = symbols[k + 2];
                    arr[ptr--] = symbols[k];
                    break;
            }
            k += 2;
        }

        int offset = 0;
        while (arr[offset] == 0) offset++;

        return new String(arr, offset, 15 - offset);
    }
}