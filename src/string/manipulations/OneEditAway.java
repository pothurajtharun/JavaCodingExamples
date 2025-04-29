package string.manipulations;

public class OneEditAway {
    public static boolean oneEditAway(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        String shorter = s1.length() < s2.length() ? s1 : s2;
        String longer = s1.length() < s2.length() ? s2 : s1;
        int i = 0, j = 0;
        boolean foundDifference = false;

        while (i < shorter.length() && j < longer.length()) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (foundDifference) return false;
                foundDifference = true;
                if (shorter.length() == longer.length()) i++;
            } else {
                i++;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("One edit away (pale, ple): " + oneEditAway("pale", "ple"));
    }
}
