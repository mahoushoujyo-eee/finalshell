package com.finalshell.core;

import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public final class Oa4 {
   public static ColorConvertOp w;

   public static BufferedImage v(Image var0, Image var1, int var2, int var3, int var4) {
      return G(Xg2.v(var0), Xg2.v(var1), var2, var3, var4);
   }

   public static BufferedImage G(BufferedImage var0, BufferedImage var1, int var2, int var3, int var4) {
      return new Z1(var2, var3, var4).filter(var0, var1);
   }

   public static BufferedImage P(Image var0, Image var1) {
      return q(Xg2.v(var0), Xg2.v(var1));
   }

   public static BufferedImage q(BufferedImage var0, BufferedImage var1) {
      return w.filter(var0, var1);
   }

   public static BufferedImage u(Image var0, Image var1, float var2) {
      return W(Xg2.v(var0), Xg2.v(var1), var2);
   }

   public static BufferedImage W(BufferedImage var0, BufferedImage var1, float var2) {
      return new Z7(var2).filter(var0, var1);
   }

   public static BufferedImage V(Image var0, Image var1, float var2, float var3, float var4) {
      return V(Xg2.v(var0), Xg2.v(var1), var2, var3, var4);
   }

   public static BufferedImage V(BufferedImage var0, BufferedImage var1, float var2, float var3, float var4) {
      return new Zy2(0.0F, 0.0F, 0.0F, var2, var3, var4).filter(var0, var1);
   }

   public static BufferedImage n(Image var0, Image var1, float var2, float var3, float var4) {
      return G(Xg2.v(var0), Xg2.v(var1), var2, var3, var4);
   }

   public static BufferedImage G(BufferedImage var0, BufferedImage var1, float var2, float var3, float var4) {
      return new Zy2(0.0F, 0.0F, var2, 0.0F, var3, var4).filter(var0, var1);
   }

   public static BufferedImage p(Image var0, Image var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return N(Xg2.v(var0), Xg2.v(var1), var2, var3, var4, var5, var6, var7);
   }

   public static BufferedImage N(BufferedImage var0, BufferedImage var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return new Zy2(var2, var3, var4, var5, var6, var7).filter(var0, var1);
   }

   public static BufferedImage i(Image var0, Image var1, int var2) {
      return L(Xg2.v(var0), Xg2.v(var1), var2);
   }

   public static BufferedImage L(BufferedImage var0, BufferedImage var1, int var2) {
      return new Zi2(var2).filter(var0, var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var2 = 109975030304594454L;
      long var10002 = -5923044721546503683L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      w = new ColorConvertOp(ColorSpace.getInstance((int)var0), null);
   }
}





