package com.finalshell.core;

public class G62 extends Gj4 {
   public float h = 1.0F;
   public float W = 1.0F;
   public static String a;

   @Override
   public float q(float var1) {
      var1 *= this.h;
      return (var1 - 0.5F) * this.W + 0.5F;
   }

   public void V(float var1) {
      this.h = var1;
      this.N = false;
   }

   public float a() {
      return this.h;
   }

   public void b(float var1) {
      this.W = var1;
      this.N = false;
   }

   public float X() {
      return this.W;
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
      char[] var10003 = "#k\u0015\u0004@\u001dp#k\u0017\u001f@\u000f,\u0014*WE".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 44;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 44;
         var10006 = var0;
      } else {
         var6 = 44;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 44;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 76;
               break;
            case 1:
               var23 = 40;
               break;
            case 2:
               var23 = 85;
               break;
            case 3:
               var23 = 71;
               break;
            case 4:
               var23 = 30;
               break;
            case 5:
               var23 = 66;
               break;
            default:
               var23 = 115;
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





