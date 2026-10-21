package com.finalshell.core;

public class Gt4 extends Gj4 {
   public float Y = 1.0F;
   public static String a;

   @Override
   public float q(float var1) {
      return 1.0F - (float)Math.exp((double)(-var1 * this.Y));
   }

   public void o(float var1) {
      this.Y = var1;
      this.N = false;
   }

   public float D() {
      return this.Y;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001eaU~Iq\u001f\u0018vI~HwB8 \u0017?".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      } else {
         var6 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 106;
               break;
            case 1:
               var23 = 57;
               break;
            case 2:
               var23 = 14;
               break;
            case 3:
               var23 = 38;
               break;
            case 4:
               var23 = 12;
               break;
            case 5:
               var23 = 53;
               break;
            default:
               var23 = 7;
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





