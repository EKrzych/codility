import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.util.HashMap;
import java.util.Map;

public class NestedStrings {
    public static int solution(String S) {

        StringBuilder sb = new StringBuilder(S);
        int lengthBeforeChange = S.length();
        do {

            S = S.replace("{}", "").replace("[]", "").replace("()", "");
        } while(S.length() != lengthBeforeChange);

        if (S.length() == 0) {
            return 1;
        }
        return 0;
    }

//    public static int solution(String S) { //'({{({}[]{})}}[]{})
//       if(S.isEmpty()) return 1;
//       Map<String, String> myMap = new HashMap<>();
//       myMap.put("(", ")");
//       myMap.put("[", "]");
//       myMap.put("{", "}");
//       String firstLetter = S.substring(0,1);
//       String secondLetter = S.substring(1,2);
//       String lastLetter = S.substring(S.length()-1);
//       String prevLetter = S.substring(S.length()-2, S.length()-1);
//       if(secondLetter.equals(myMap.get(firstLetter))) {
//           return solution(S.substring(2));
//        } else if(lastLetter.equals(myMap.get(prevLetter))) {
//           return solution(S.substring(0,S.length()-2));
//       } else if(lastLetter.equals(myMap.get(firstLetter))) {
//            return solution(S.substring(1,(S.length()-1)));
//        } else {
//           return 0;
//       }
//    }

    public static void main(String[] args) {
        String S = "({{({}[]{})}}[]{})";
        System.out.println(solution(S));
    }
}
