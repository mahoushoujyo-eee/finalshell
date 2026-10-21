package org.v;

import org.I;

public class NF extends NV {
   public final hN j;
   public final J_2 a;
   private static final String d;

   public NF(I var1, hN var2, J_2 var3) {
      super(var1);
      this.j = var2;
      this.a = var3;
   }

   @org.F.c
   @Override
   public Object i(_w_2 var1) throws Throwable {
      return var1.O(this);
   }

   @Override
   public String toString() {
      return this.j + d + this.a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "X\u007fv[".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 126;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      } else {
         var6 = 126;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 126;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 6;
               break;
            case 1:
               var23 = 44;
               break;
            case 2:
               var23 = 54;
               break;
            case 3:
               var23 = 5;
               break;
            case 4:
               var23 = 98;
               break;
            case 5:
               var23 = 73;
               break;
            default:
               var23 = 90;
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
               d = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





