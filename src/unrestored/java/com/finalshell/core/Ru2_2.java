package com.finalshell.core;

public final class Ru2_2 extends Re2_2 {
   public final String s;
   public final R8_2 P;
   public static String d;

   public Ru2_2(com.finalshell.ui.model.I var1, String var2, R8_2 var3) {
      super(var1);
      this.s = var2;
      (this.P = var3).G(this);
   }

   @Override
   public String toString() {
      return this.s + d + this.P;
   }

   @C_9
   @Override
   public Object R(H_4_2 var1) throws Throwable {
      return var1.q(this);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Hi".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 31;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 31;
         var10006 = var0;
      } else {
         var6 = 31;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            d = var9;
            return;
         }

         var10005 = var10003;
         var10 = 31;
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
               var23 = 86;
               break;
            case 2:
               var23 = 93;
               break;
            case 3:
               var23 = 99;
               break;
            case 4:
               var23 = 42;
               break;
            case 5:
               var23 = 53;
               break;
            default:
               var23 = 85;
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





