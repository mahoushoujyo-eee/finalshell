package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

public class Hf4 extends W5 {
   public float s = 1.0F;
   public float j = 0.5F;
   public float z;
   public float x;
   public float c;
   public float b;
   public static String a;
   public static long d;

   public void j(float var1) {
      this.x = var1;
   }

   public float a() {
      return this.x;
   }

   public void G(float var1) {
      this.z = var1;
   }

   public float i() {
      return this.z;
   }

   public void X(float var1) {
      this.c = var1;
   }

   public float x() {
      return this.c;
   }

   public void w(float var1) {
      this.b = var1;
   }

   public float y() {
      return this.b;
   }

   public void b(float var1) {
      this.s = var1;
   }

   public float w() {
      return this.s;
   }

   public void J(float var1) {
      this.j = var1;
   }

   public float P() {
      return this.j;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = W5.q();
      if (var3 != null && var2 == null) {
         var2 = this.createCompatibleDestImage(var1, null);
      }

      int var6 = var1.getWidth();
      int var7 = var1.getHeight();
      int var8 = (int)(this.j * (float)var7);
      int var9 = (int)(this.b * (float)var7);
      Graphics2D var10 = var2.createGraphics();
      Shape var5 = var10.getClip();
      var10.clipRect(0, 0, var6, var8);
      var10.drawRenderedImage(var1, null);
      var10.setClip(var5);
      var10.clipRect(0, var8 + var9, var6, var7 - var8 - var9);
      var10.translate(0, 2 * var8 + var9);
      var10.scale(1.0, -1.0);
      var10.drawRenderedImage(var1, null);
      var10.setPaint(new GradientPaint(0.0F, 0.0F, new Color(1.0F, 0.0F, 0.0F, 0.0F), 0.0F, (float)var8, new Color(0.0F, 1.0F, 0.0F, this.s)));
      var10.setComposite(AlphaComposite.getInstance((int)d));
      var10.fillRect(0, 0, var6, var8);
      var10.setClip(var5);
      var10.dispose();
      return var2;
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
      char[] var10003 = "Wdh%7\\\u0003=Og2&G\u0002<, ".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 75;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 75;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 89;
               break;
            case 1:
               var21 = 73;
               break;
            case 2:
               var21 = 69;
               break;
            case 3:
               var21 = 11;
               break;
            case 4:
               var21 = 31;
               break;
            case 5:
               var21 = 99;
               break;
            default:
               var21 = 59;
         }
      } else {
         var13 = 75;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 8132161516603784665L;
            long var12 = 2920365058213363167L ^ var3;
            var8 = -1;
            d = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 75;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 89;
               break;
            case 1:
               var21 = 73;
               break;
            case 2:
               var21 = 69;
               break;
            case 3:
               var21 = 11;
               break;
            case 4:
               var21 = 31;
               break;
            case 5:
               var21 = 99;
               break;
            default:
               var21 = 59;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 89;
                  break;
               case 1:
                  var21 = 73;
                  break;
               case 2:
                  var21 = 69;
                  break;
               case 3:
                  var21 = 11;
                  break;
               case 4:
                  var21 = 31;
                  break;
               case 5:
                  var21 = 99;
                  break;
               default:
                  var21 = 59;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 8132161516603784665L;
               long var11 = 2920365058213363167L ^ var0;
               var6 = -1;
               d = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 89;
                  break;
               case 1:
                  var21 = 73;
                  break;
               case 2:
                  var21 = 69;
                  break;
               case 3:
                  var21 = 11;
                  break;
               case 4:
                  var21 = 31;
                  break;
               case 5:
                  var21 = 99;
                  break;
               default:
                  var21 = 59;
            }
         }
      }
   }
}





