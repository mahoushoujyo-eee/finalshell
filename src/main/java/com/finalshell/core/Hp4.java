package com.finalshell.core;

import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Hp4 extends W5 {
   public Composite f;
   public AffineTransform r;
   public static String a;

   public Hp4() {
   }

   public Hp4(Composite var1) {
      this.f = var1;
   }

   public Hp4(Composite var1, AffineTransform var2) {
      this.f = var1;
      this.r = var2;
   }

   public void F(Composite var1) {
      this.f = var1;
   }

   public Composite M() {
      return this.f;
   }

   public void F(AffineTransform var1) {
      this.r = var1;
   }

   public AffineTransform X() {
      return this.r;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = W5.q();
      BufferedImage var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var2;
      }

      Graphics2D var4 = var10000.createGraphics();
      var4.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var4.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var4.setComposite(this.f);
      var4.drawRenderedImage(var1, this.r);
      var4.dispose();
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
      char[] var10003 = "KP;\u0018=YB|Z".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 62;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 62;
         var10006 = var0;
      } else {
         var6 = 62;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 62;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 54;
               break;
            case 1:
               var23 = 1;
               break;
            case 2:
               var23 = 104;
               break;
            case 3:
               var23 = 86;
               break;
            case 4:
               var23 = 108;
               break;
            case 5:
               var23 = 20;
               break;
            default:
               var23 = 21;
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





