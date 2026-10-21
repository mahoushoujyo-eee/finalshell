package com.finalshell.core;

public class FA extends FK {
   public final String[] k;
   public static String a;

   public FA(com.finalshell.ui.model.I var1, String[] var2) {
      super(var1);
      this.k = var2;
   }

   @C_9
   @Override
   public final Object b(H22_2 var1) throws Throwable {
      return var1.r(this);
   }

   @Override
   public String toString() {
      return a + RG_2.N(this.k, ".") + ";";
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "0('$\u0001z8*16?\u001am8".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 47;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      } else {
         var6 = 47;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 47;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 118;
               break;
            case 1:
               var23 = 106;
               break;
            case 2:
               var23 = 120;
               break;
            case 3:
               var23 = 100;
               break;
            case 4:
               var23 = 92;
               break;
            case 5:
               var23 = 33;
               break;
            default:
               var23 = 55;
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





