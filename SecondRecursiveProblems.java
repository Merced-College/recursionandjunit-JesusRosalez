public class SecondRecursiveProblems {

   // 1. count8
   public static int count8(int n) {
      if (n == 0) return 0;
      if (n % 10 == 8) {
         if ((n / 10) % 10 == 8) {
            return 2 + count8(n / 10);
         }
         return 1 + count8(n / 10);
      }
      return count8(n / 10);
   }

   // 2. countHi
   public static int countHi(String str) {
      if (str.length() < 2) return 0;
      if (str.startsWith("hi")) {
         return 1 + countHi(str.substring(2));
      }
      return countHi(str.substring(1));
   }

   // 3. countHi2
   public static int countHi2(String str) {
      if (str.length() < 2) return 0;
      if (str.startsWith("hi")) {
         return 1 + countHi2(str.substring(2));
      } else if (str.length() >= 3 && str.startsWith("xhi")) {
         return countHi2(str.substring(3));
      }
      return countHi2(str.substring(1));
   }

   // 4. strCount
   public static int strCount(String str, String sub) {
      if (str.length() < sub.length()) return 0;
      if (str.startsWith(sub)) {
         return 1 + strCount(str.substring(sub.length()), sub);
      }
      return strCount(str.substring(1), sub);
   }

   // 5. stringClean
   public static String stringClean(String str) {
      if (str.length() < 2) return str;
      if (str.charAt(0) == str.charAt(1)) {
         return stringClean(str.substring(1));
      }
      return str.charAt(0) + stringClean(str.substring(1));
   }
}
