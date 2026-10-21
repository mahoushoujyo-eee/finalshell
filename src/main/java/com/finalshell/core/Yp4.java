package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Yp4 extends Yj4 {
   public float Z = 0.5F;
   public float h = 1.0F;
   public static String c;

   public void X(float var1) {
      this.Z = var1;
   }

   public float z() {
      return this.Z;
   }

   public void x(float var1) {
      this.h = var1;
   }

   public float N() {
      return this.h;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.E(1);
      var2 = super.filter(var1, var2);
      Gp4 var3 = new Gp4(this);
      return var3.filter(var2, var2);
   }

   @Override
   public String toString() {
      return c;
   }

   static float f(Yp4 var0) {
      return var0.Z;
   }

   static float o(Yp4 var0) {
      return var0.h;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "T\u00171HqS\">2?_}J4?_y".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 26;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      } else {
         var6 = 26;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 11;
               break;
            case 1:
               var23 = 107;
               break;
            case 2:
               var23 = 77;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 8;
               break;
            case 5:
               var23 = 61;
               break;
            default:
               var23 = 75;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





