import java.util.Set;

public class Uh_2 implements bG_3 {
   private static int[] i;

   @Override
   public double N(String var1, String var2) {
      Set var4 = D5.f().H(var1);
      Set var5 = D5.f().H(var2);
      int[] var10000 = B();
      double var6 = 0.0;
      int[] var3 = var10000;

      for (String var9 : var4) {
         for (String var11 : var5) {
            double var12 = (double)new bJ_3().r(var9, var11);
            if (var3 != null) {
               return 1.0;
            }

            int var19;
            label49: {
               String var10002 = var9;
               if (var3 == null) {
                  if (var9.length() > var11.length()) {
                     var19 = var9.length();
                     break label49;
                  }

                  var10002 = var11;
               }

               var19 = var10002.length();
            }

            double var14 = 1.0 - var12 / (double)var19;
            double var17 = var6;
            if (var3 == null) {
               var17 = var6 > var14 ? var6 : var14;
            }

            var6 = var17;
            if (var3 != null) {
               return var6;
            }

            if (var6 == 1.0) {
               return var6;
            }

            if (var3 != null) {
               com.ky_4.K(new String[5]);
               break;
            }
         }

         if (var3 != null) {
            break;
         }
      }

      return var6;
   }

   public static void h(int[] var0) {
      i = var0;
   }

   public static int[] B() {
      return i;
   }

   static {
      if (B() != null) {
         h(new int[2]);
      }
   }
}





