package org.v;

import org.I;

class Nd_2 extends NV {
   final H_3 E;
   private static final String a;

   Nd_2(H_3 var1, I var2) {
      super(var2);
      this.E = var1;
   }

   @org.F.c
   @Override
   public Object i(_w_2 var1) {
      return null;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ">Oc".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 97;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 97;
         var10006 = var0;
      } else {
         var6 = 97;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 97;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 96;
               break;
            case 1:
               var23 = 17;
               break;
            case 2:
               var23 = 61;
               break;
            case 3:
               var23 = 71;
               break;
            case 4:
               var23 = 12;
               break;
            case 5:
               var23 = 49;
               break;
            default:
               var23 = 30;
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





