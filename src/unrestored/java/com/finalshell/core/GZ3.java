package com.finalshell.core;

public class GZ3 extends Gj4 {
   public float j = 0.5F;
   public float A = 0.5F;
   public static String a;

   @Override
   public float q(float var1) {
      var1 = NM.w(var1, this.j);
      return NM.E(var1, this.A);
   }

   public void O(float var1) {
      this.j = var1;
      this.N = false;
   }

   public float y() {
      return this.j;
   }

   public void s(float var1) {
      this.A = var1;
      this.N = false;
   }

   public float k() {
      return this.A;
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
      char[] var10003 = "IA^\u007fG<TMO[~\u001baU".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 74;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      } else {
         var6 = 74;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 64;
               break;
            case 1:
               var23 = 100;
               break;
            case 2:
               var23 = 120;
               break;
            case 3:
               var23 = 90;
               break;
            case 4:
               var23 = 127;
               break;
            case 5:
               var23 = 5;
               break;
            default:
               var23 = 49;
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





