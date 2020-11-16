package Data_Structures.Pallindrome;

public class Pallindrome {
    public int longestPalindrome(String s) {
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] == 0)
                a[s.charAt(i)] = 1;
            else
                a[s.charAt(i)] = a[s.charAt(i)] + 1;
        }

        int odd = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0)
                odd = odd + 1;

        }
        if (odd == 0 || odd == 1)
            return s.length();
        return s.length() - odd + 1;
    }

    public int countSubstrings(String s) {
        char[] cs = s.toCharArray();
        int cnt = 0;
        for (int i = 0; i < cs.length; ++i) {
            cnt += getPalindromeSub(cs, i, i);
            cnt += getPalindromeSub(cs, i, i + 1);
        }
        return cnt;
    }

    private int getPalindromeSub(char[] cs, int i, int j) {
        int cnt = 0;
        while (i >= 0 && j < cs.length) {
            if (cs[i--] == cs[j++]) {
                ++cnt;
            } else {
                break;
            }
        }
        return cnt;
    }

}
