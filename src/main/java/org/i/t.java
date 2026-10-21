package org.i;

public class t implements z_2 {
   public final i_2 L;
   private static final String a;

   public t(i_2 var1) {
      this.L = var1;
   }

   @Override
   public Object P(D var1) throws Throwable {
      return var1.u(this);
   }

   @Override
   public String toString() {
      return this.L.toString() + a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "!|".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 35;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 35;
         var10006 = var0;
      } else {
         var6 = 35;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 35;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 89;
               break;
            case 1:
               var23 = 2;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 10;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 45;
               break;
            default:
               var23 = 14;
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





