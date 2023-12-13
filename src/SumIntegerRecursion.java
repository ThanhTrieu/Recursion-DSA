public class SumIntegerRecursion {
      public static long sumNumber(int n){
          if(n == 1){
              return 1;
          }
          return sumNumber(n-1) + n;
          // tinh tong cac so tu 1 toi N bang de quy
      }
}

