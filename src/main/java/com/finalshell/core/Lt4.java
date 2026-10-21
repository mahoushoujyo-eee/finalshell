package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

public class Lt4 {
   D2 n;
   BufferedImage M;
   Component z;
   Dimension m;
   static boolean F;
   float N;
   boolean X;
   boolean O;
   String L;
   public static long[] a;
   public static Integer[] b;

   public Lt4(Component var1, D2 var2) {
      long var4 = 317543909232717328L;
      Object var3 = null;
      Ref.s(317543909232717328L, var3, var4);
      Dimension var10002 = new Dimension();
      long var6 = 634698459927178616L;
      Dimension var5 = var10002;
      Ref.s(634698459927178616L, var5, var6);
      Registry.lookupField(413025875926542572L).setFloat(this, 2.0F);
      Registry.lookupField(620025160312266442L).setBoolean(this, false);
      Registry.lookupField(443961478089940624L).setBoolean(this, true);
      long var8 = 352606861628793322L;
      String var7 = "";
      Ref.s(352606861628793322L, var7, var8);
      long var10 = 395056686905588257L;
      Ref.s(395056686905588257L, var1, var10);
      long var12 = 253045562885453091L;
      Ref.s(253045562885453091L, var2, var12);
   }

   public void a(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      float var3 = (float)var2.getTransform().getScaleX();
      Registry.packArgs(var3);
      long var4 = 327569382508225867L;
      Ref.h2(327569382508225867L, var4);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object var6 = 395056686905588257L;
      float var10005 = (float)((Component)Ref.g(395056686905588257L, var6)).getWidth();
      Object var8 = 395056686905588257L;
      Object[] var10004 = Registry.packArgs(this, var10005, (int)this, ((Component)Ref.g(395056686905588257L, var8)).getHeight());
      long var11 = 319180977424850283L;
      Object[] var10 = var10004;
      Ref.h(319180977424850283L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public void w(Graphics var1, float var2, int var3, int var4) {
      String[] var10000 = com.finalshell.ui.panel.F8.y();
      Graphics2D var6 = (Graphics2D)var1;
      AffineTransform var7 = var6.getTransform();
      String[] var5 = var10000;
      Registry.emptyArgs();
      long var15 = 253808553645062345L;
      Object var10001 = Ref.h2(253808553645062345L, var15);

      try {
         var10001 = (Boolean)var10001;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      if (var5 == null) {
         if (var10001 == false && var2 == 1.0F) {
         }

         var10001 = Registry.emptyArgs();
         long var17 = 253808553645062345L;
         Object var10002 = Ref.h2(253808553645062345L, var17);

         try {
         } catch (InvocationTargetException var50) {
            throw var50.getTargetException();
         }
      }

      if (var10001 == false) {
      }

      label108: {
         int var8;
         int var9;
         label99: {
            var8 = (int)((float)var3 * var2);
            var9 = (int)((float)var4 * var2);
            if (var5 == null) {
               Object var19 = 317543909232717328L;
               if ((BufferedImage)Ref.g(317543909232717328L, var19) != null) {
                  break label99;
               }
            }

            Object[] var10003 = Registry.packArgs(var8, var9);
            long var22 = 150833406772144195L;
            Object[] var21 = var10003;
            var10003 = Ref.h(150833406772144195L, var21, var22);
            long var24 = 317543909232717328L;
            Object var23 = var10003;
            Ref.s(317543909232717328L, var23, var24);
            if (var5 == null) {
               break label108;
            }
         }

         int var10;
         label91: {
            var10 = 0;
            label90:
            if (var5 == null) {
               Object var25 = 634698459927178616L;
               if (this == ((Dimension)Ref.g(634698459927178616L, var25)).width) {
                  if (var5 != null) {
                     break label90;
                  }

                  Object var27 = 634698459927178616L;
                  if (this == ((Dimension)Ref.g(634698459927178616L, var27)).height) {
                     break label91;
                  }
               }

               boolean var10004 = true;
            }

            var10 = var8;
         }

         String var11 = var6.getDeviceConfiguration().getDevice().getIDstring();
         Object var29 = 352606861628793322L;
         int var59 = (((String)Ref.g(352606861628793322L, var29)).equals(var11)) ? 1 : 0;
         if (var5 == null) {
            if (var59 == 0) {
               var10 = 1;
            }

            var59 = var10;
         }

         if (var59 != 0) {
            Object[] var10006 = Registry.packArgs(var8, var9);
            long var32 = 150833406772144195L;
            Object[] var31 = var10006;
            var10006 = Ref.h(150833406772144195L, var31, var32);
            long var34 = 317543909232717328L;
            Object var33 = var10006;
            Ref.s(317543909232717328L, var33, var34);
            Object var35 = 634698459927178616L;
            ((Dimension)Ref.g(634698459927178616L, var35)).width = var8;
            Object var37 = 634698459927178616L;
            ((Dimension)Ref.g(634698459927178616L, var37)).height = var9;
         }
      }

      Color var12;
      Graphics2D var53;
      label81: {
         String var60 = var6.getDeviceConfiguration().getDevice().getIDstring();
         long var40 = 352606861628793322L;
         String var39 = var60;
         Ref.s(352606861628793322L, var39, var40);
         AffineTransform var52 = new AffineTransform(var2, 0.0F, 0.0F, var2, 0.0F, 0.0F);
         Object var41 = 317543909232717328L;
         var53 = (Graphics2D)((BufferedImage)Ref.g(317543909232717328L, var41)).getGraphics();
         var53.setTransform(var52);
         var12 = var53.getColor();
         Graphics2D var10005 = var53;
         if (var5 == null) {
            var53.setColor(new Color(a(21216, 4670391162059273871L), a(8279, 2351571850038035513L), a(8279, 2351571850038035513L)));
            if (!Registry.lookupField(443961478089940624L).getBoolean(this)) {
               var53.fillRect(0, 0, var3, var4);
               if (var5 == null) {
                  break label81;
               }
            }

            var10005 = var53;
         }

         Composite var13 = var10005.getComposite();
         var53.setComposite(AlphaComposite.getInstance(1, 0.0F));
         Double var14 = new Double(0.0, 0.0, (double)var3, (double)var4);
         var53.fill(var14);
         var53.setComposite(var13);
      }

      var53.setColor(var12);
      Object var43 = 253045562885453091L;
      Ref.g(253045562885453091L, var43);
      Object[] var10007 = Registry.packArgs(var53);
      long var46 = 434289389554389747L;
      Object[] var45 = var10007;
      Ref.h(434289389554389747L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      label73: {
         var53.dispose();
         if (Registry.lookupField(620025160312266442L).getBoolean(this)) {
            float var54 = 1.0F / Registry.lookupField(413025875926542572L).getFloat(this);
            AffineTransform var56 = new AffineTransform((double)var54, 0.0, 0.0, (double)var54, var7.getTranslateX(), var7.getTranslateY());
            var6.setTransform(var56);
            if (var5 == null) {
               break label73;
            }
         }

         AffineTransform var55 = new AffineTransform(1.0, 0.0, 0.0, 1.0, var7.getTranslateX(), var7.getTranslateY());
         var6.setTransform(var55);
      }

      Object var47 = 317543909232717328L;
      this.drawImage((BufferedImage)Ref.g(317543909232717328L, var47), 0, 0, null);
      var6.setTransform(var7);
   }

   BufferedImage Y(int var1, int var2) {
      String[] var3 = com.finalshell.ui.panel.F8.y();
      int var10000 = (Registry.lookupField(443961478089940624L).getBoolean(this)) ? 1 : 0;
      if (var3 == null) {
         if (var10000 != 0) {
            Registry.packArgs(var1, var2);
            long var4 = 401056956354921780L;
            Object var10 = Ref.h2(401056956354921780L, var4);

            try {
               return (BufferedImage)var10;
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }
         }

         var10000 = var1;
      }

      Registry.packArgs(var10000, var2);
      long var6 = 225394079158613941L;
      Object var10001 = Ref.h2(225394079158613941L, var6);

      try {
         return (BufferedImage)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public boolean J() {
      return Registry.lookupField(443961478089940624L).getBoolean(this);
   }

   public void Q(boolean var1) {
      Registry.lookupField(443961478089940624L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25711;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8571628829633698297L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "z\u0089\f'ðzï\u0089\u0011Ô\u0013«á\u0083\u001d?";
      int var5 = "z\u0089\f'ðzï\u0089\u0011Ô\u0013«á\u0083\u001d?".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
      Registry.lookupField(207199684450790455L).setBoolean(null, false);
   }
}





