package org.v;

public class hy_2 {
   public final String l;
   public final t_4 R;
   private static final String a;

   public hy_2(String var1, t_4 var2) {
      this.l = var1;
      this.R = var2;
   }

   @Override
   public String toString() {
      return this.l + a + this.R;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "~w%".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 51;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 51;
         var10006 = var0;
      } else {
         var6 = 51;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 51;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 109;
               break;
            case 1:
               var23 = 121;
               break;
            case 2:
               var23 = 54;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 46;
               break;
            case 5:
               var23 = 124;
               break;
            default:
               var23 = 126;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





