package com.finalshell.core;

public class GS3 extends Gj4 {
   public float v = 1.0F;
   public static String a;

   public GS3() {
   }

   public GS3(float var1) {
      this.v = var1;
   }

   @Override
   protected float q(float var1) {
      return var1 * this.v;
   }

   public void L(float var1) {
      this.v = var1;
      this.N = false;
   }

   public float V() {
      return this.v;
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
      char[] var10003 = "\u0011\u0004lk`\u007fv\u0000\u000esgs`<|E.".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 112;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      } else {
         var6 = 112;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 112;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 34;
               break;
            case 1:
               var23 = 27;
               break;
            case 2:
               var23 = 112;
               break;
            case 3:
               var23 = 116;
               break;
            case 4:
               var23 = 98;
               break;
            case 5:
               var23 = 124;
               break;
            default:
               var23 = 41;
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





