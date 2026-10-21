public class uJ_3 {
   private static final long a;

   public static int G(int[] var0) {
      int var10000 = D5.e();
      int var2 = (int)a;
      int[] var3 = var0;
      int var4 = var0.length;
      int var5 = 0;
      int var1 = var10000;

      while (true) {
         if (var5 < var4) {
            int var6 = var3[var5];
            var10000 = var6;
            if (var1 != 0) {
               break;
            }

            if (var1 == 0) {
               var10000 = var6 < var2 ? var6 : var2;
            }

            var2 = var10000;
            var5++;
            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   static {
      long var0 = 3844962900489249930L;
      long var10002 = -1237889716418225291L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





