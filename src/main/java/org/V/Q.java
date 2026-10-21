package org.V;

import java.util.Collections;

class Q extends org.V.U {
   private static final String b;

   @org.F.c
   @Override
   public org.V.N J(String var1) {
      return null;
   }

   @org.F.c
   @Override
   public Iterable E(String var1, boolean var2) {
      return Collections.emptyList();
   }

   @Override
   public String toString() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "T-[uf08T3Dtm,/N&Bo{*8".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 19;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      } else {
         var6 = 19;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 19;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 2;
               break;
            case 1:
               var23 = 115;
               break;
            case 2:
               var23 = 24;
               break;
            case 3:
               var23 = 50;
               break;
            case 4:
               var23 = 44;
               break;
            case 5:
               var23 = 124;
               break;
            default:
               var23 = 121;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





