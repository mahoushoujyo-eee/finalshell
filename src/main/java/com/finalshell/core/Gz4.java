package com.finalshell.core;

import java.awt.Rectangle;

public class Gz4 extends Gy4 {
   public float R = 0.0F;
   public float w = 0.0F;
   public float Z = 0.0F;
   public float u = 0.0F;
   public float V = 0.0F;
   public float E = 0.0F;
   public boolean T = true;
   public static String a;

   public void P(boolean var1) {
      this.T = var1;
   }

   public boolean m() {
      return this.T;
   }

   public void P(float var1) {
      this.R = var1;
      this.y();
   }

   public float c() {
      return this.R;
   }

   public void z(float var1) {
      this.w = var1;
      this.y();
   }

   public float z() {
      return this.w;
   }

   public void y() {
      this.Z = (float)Math.sin((double)this.R);
      this.u = (float)Math.sin((double)this.w);
   }

   @Override
   protected void T(Rectangle var1) {
      String[] var10000 = W5.q();
      float var3 = (float)Math.tan((double)this.R);
      this.V = (float)(-var1.height) * var3;
      String[] var2 = var10000;
      double var5;
      int var4 = (var5 = (double)var3 - 0.0) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
      if (var2 != null) {
         if (var4 < 0) {
            var3 = -var3;
         }

         var1.width = (int)((float)var1.height * var3 + (float)var1.width + 0.999999F);
         var3 = (float)Math.tan((double)this.w);
         this.E = (float)(-var1.width) * var3;
         if (var2 == null) {
            return;
         }

         double var6;
         var4 = (var6 = (double)var3 - 0.0) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
      }

      if (var4 < 0) {
         var3 = -var3;
      }

      var1.height = (int)((float)var1.width * var3 + (float)var1.height + 0.999999F);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      var3[0] = (float)var1 + this.V + (float)var2 * this.Z;
      var3[1] = (float)var2 + this.E + (float)var1 * this.u;
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
      char[] var10003 = "r-#\tZ&\t\u0019\u00178\u0018T&S\u0018j".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 22;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      } else {
         var6 = 22;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 22;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 32;
               break;
            case 1:
               var23 = 82;
               break;
            case 2:
               var23 = 70;
               break;
            case 3:
               var23 = 107;
               break;
            case 4:
               var23 = 35;
               break;
            case 5:
               var23 = 66;
               break;
            default:
               var23 = 107;
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





