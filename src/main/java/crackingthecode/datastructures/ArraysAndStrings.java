package crackingthecode.datastructures;

import java.util.Arrays;

/**
 * Cracking the code - page 73, Question 1.2 :
 */
public class ArraysAndStrings {

    /**************** Q1.2 *******************/
    /**
     * Given 2 strings, give a method that returns if one is permutation of the other
     * @param s1
     * @param s2
     * @return
     */
    public boolean isPermutationOf(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }

        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        s1 = String.valueOf(s1CharArray);
        s2 = String.valueOf(s2CharArray);

        return s1.equals(s2);
    }

    /**************** Q1.5 *******************/

    /**
     * Q1.5: write a method that applies a basic string compression ('aabbbc' -> 'a2b3c1')
     * @param str
     */
    public String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String result;
        char[] strCharArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        char c = strCharArray[0];
        sb.append(c);
        int i = 1;
        int cpt = 1;
        while (i < strCharArray.length) {
            if (strCharArray[i] == c) {
                cpt++;
            } else {
                c = strCharArray[i];
                sb.append(cpt).append(c);
                cpt = 1;
            }
            i++;
        }

        result = sb.append(cpt).toString();
        return result;
    }

//    public String compressString2(String str) {
//        if (str == null || str.isEmpty()) {
//            return str;
//        }
//        String result = "";
//        char[] strCharArray = str.toCharArray();
//        char c = strCharArray[0];
//        result += c;
//        int cpt = 1;
//        for  (int i=1; i < strCharArray.length; i++) {
//            if (strCharArray[i] == c) {
//                cpt++;
//            } else {
//                c = strCharArray[i];
//                result += cpt + c;
//                cpt = 1;
//            }
//        }
//
//        result += cpt;
//        return result;
//    }

    /**************** Q1.8 *******************/

    /**
     * indicates if s1 is a rotation of s2. Example : 'java' is a rotation of 'ajav'
     * @param s1
     * @param s2
     * @return
     */
    public boolean isRotationOf(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }

        if (s1 == null || s2 == null) {
            return false;
        }

        char c = s1.charAt(0);
        int indexOfC;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == c) {
                indexOfC = i;
                String lastPart = s2.substring(0, indexOfC);
                String firstPart = s2.substring(indexOfC);

                String s2Recomposition = firstPart + lastPart;
                if (s2Recomposition.equalsIgnoreCase(s1)) {
                    return true;
                }
            }
        }

        return false;
    }

//    public boolean isRotationOf_subtle_way(String s1, String s2) {
//        String s1s2 = s1 + s2;
//        if (isSubstring(s1s2)) {
//            return true;
//        }
//        return false;
//    }
//
//    private boolean isSubstring(String s1s2) {
//        return false;
//    }


}
