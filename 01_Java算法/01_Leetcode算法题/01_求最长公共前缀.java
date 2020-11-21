public class Test {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        int m = strs[0].length();
        int[] a = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            a[i] = strs[i].length();
        }
        for (int i = 0; i < strs.length; i++) {
            m = m < strs[i].length() ? m : strs[i].length();
        }
        if(m==0)return "";
        for (int i = 1; i < strs.length; i++) {
            while (!strs[0].substring(0, m).equals(strs[i].substring(0, m))) {
                m--;
            }
        }
        return strs[0].substring(0, m);
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}
