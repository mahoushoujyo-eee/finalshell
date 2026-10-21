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
import java.lang.reflect.Method;

public class lt_4 {
   D2 n;
   BufferedImage M;
   Component z;
   Dimension m;
   static boolean F;
   float N;
   boolean X;
   boolean O;
   String L;
   private static final long[] a;
   private static final Integer[] b;

   public lt_4(Component var1, D2 var2) {
      com.c.c(317543909232717328L).set(this, null);
      com.c.c(634698459927178616L).set(this, new Dimension());
      com.c.c(413025875926542572L).setFloat(this, 2.0F);
      com.c.c(620025160312266442L).setBoolean(this, false);
      com.c.c(443961478089940624L).setBoolean(this, true);
      com.c.c(352606861628793322L).set(this, "");
      com.c.c(395056686905588257L).set(this, var1);
      com.c.c(253045562885453091L).set(this, var2);
   }

   public void a(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      float var3 = (float)var2.getTransform().getScaleX();
      Object[] var10000 = com.c.a(var3);
      Method var6 = com.c.d(327569382508225867L);
      Object[] var11 = var10000;
      Object var8 = null;

      try {
         var6.invoke(var8, var11);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var8 = com.c.a(
         var1, var3, ((Component)com.c.c(395056686905588257L).get(this)).getWidth(), ((Component)com.c.c(395056686905588257L).get(this)).getHeight()
      );
      Method var10003 = com.c.d(319180977424850283L);
      var11 = (Object[])var8;
      var8 = this;
      Method var7 = var10003;

      try {
         var7.invoke(var8, var11);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void w(Graphics var1, float var2, int var3, int var4) {
      String[] var10000 = F8.y();
      Graphics2D var6 = (Graphics2D)var1;
      AffineTransform var7 = var6.getTransform();
      String[] var5 = var10000;
      Object[] var25 = com.c.f();
      Method var26 = com.c.d(253808553645062345L);
      Object[] var45 = var25;
      Method var36 = null;

      try {
         var27 = (Boolean)var26.invoke(var36, var45);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      if (var5 == null) {
         if (!var27 && var2 == 1.0F) {
         }

         Object[] var28 = com.c.f();
         Method var29 = com.c.d(253808553645062345L);
         var45 = var28;
         var36 = null;

         try {
            var27 = (Boolean)var29.invoke(var36, var45);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }
      }

      if (!var27) {
      }

      label118: {
         int var8;
         int var9;
         label119: {
            var8 = (int)((float)var3 * var2);
            var9 = (int)((float)var4 * var2);
            lt_4 var30 = this;
            if (var5 == null) {
               if ((BufferedImage)com.c.c(317543909232717328L).get(this) != null) {
                  break label119;
               }

               var30 = this;
            }

            var45 = com.c.a(var8, var9);
            Method var10004 = com.c.d(150833406772144195L);
            Object[] var10003 = var45;
            lt_4 var49 = this;
            var36 = var10004;

            try {
               var36 = (Method)var36.invoke(var49, var10003);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            com.c.c(317543909232717328L).set(var30, var36);
            if (var5 == null) {
               break label118;
            }
         }

         int var10;
         label100: {
            var10 = 0;
            var31 = var8;
            label99:
            if (var5 == null) {
               if (var8 == ((Dimension)com.c.c(634698459927178616L).get(this)).width) {
                  var31 = var9;
                  if (var5 != null) {
                     break label99;
                  }

                  if (var9 == ((Dimension)com.c.c(634698459927178616L).get(this)).height) {
                     break label100;
                  }
               }

               var31 = 1;
            }

            var10 = var31;
         }

         String var11 = var6.getDeviceConfiguration().getDevice().getIDstring();
         int var32 = ((String)com.c.c(352606861628793322L).get(this)).equals(var11);
         if (var5 == null) {
            if (var32 == 0) {
               var10 = 1;
            }

            var32 = var10;
         }

         if (var32 != 0) {
            var45 = com.c.a(var8, var9);
            Method var55 = com.c.d(150833406772144195L);
            Object[] var53 = var45;
            lt_4 var51 = this;
            var36 = var55;

            try {
               var36 = (Method)var36.invoke(var51, var53);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            com.c.c(317543909232717328L).set(this, var36);
            ((Dimension)com.c.c(634698459927178616L).get(this)).width = var8;
            ((Dimension)com.c.c(634698459927178616L).get(this)).height = var9;
         }
      }

      Color var12;
      Graphics2D var21;
      label90: {
         com.c.c(352606861628793322L).set(this, var6.getDeviceConfiguration().getDevice().getIDstring());
         AffineTransform var20 = new AffineTransform(var2, 0.0F, 0.0F, var2, 0.0F, 0.0F);
         var21 = (Graphics2D)((BufferedImage)com.c.c(317543909232717328L).get(this)).getGraphics();
         var21.setTransform(var20);
         var12 = var21.getColor();
         Graphics2D var33 = var21;
         if (var5 == null) {
            var21.setColor(new Color(a(21216, 4670391162059273871L), a(8279, 2351571850038035513L), a(8279, 2351571850038035513L)));
            if (!com.c.c(443961478089940624L).getBoolean(this)) {
               var21.fillRect(0, 0, var3, var4);
               if (var5 == null) {
                  break label90;
               }
            }

            var33 = var21;
         }

         Composite var13 = var33.getComposite();
         var21.setComposite(AlphaComposite.getInstance(1, 0.0F));
         Double var14 = new Double(0.0, 0.0, (double)var3, (double)var4);
         var21.fill(var14);
         var21.setComposite(var13);
      }

      var21.setColor(var12);
      var10000 = (String[])com.c.c(253045562885453091L).get(this);
      Object[] var43 = com.c.a(var21);
      Method var54 = com.c.d(434289389554389747L);
      var45 = var43;
      var36 = var10000;
      Method var35 = var54;

      try {
         var35.invoke(var36, var45);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      label82: {
         var21.dispose();
         if (com.c.c(620025160312266442L).getBoolean(this)) {
            float var22 = 1.0F / com.c.c(413025875926542572L).getFloat(this);
            AffineTransform var24 = new AffineTransform((double)var22, 0.0, 0.0, (double)var22, var7.getTranslateX(), var7.getTranslateY());
            var6.setTransform(var24);
            if (var5 == null) {
               break label82;
            }
         }

         AffineTransform var23 = new AffineTransform(1.0, 0.0, 0.0, 1.0, var7.getTranslateX(), var7.getTranslateY());
         var6.setTransform(var23);
      }

      var6.drawImage((BufferedImage)com.c.c(317543909232717328L).get(this), 0, 0, null);
      var6.setTransform(var7);
   }

   BufferedImage Y(int var1, int var2) {
      String[] var3 = F8.y();
      int var10000 = com.c.c(443961478089940624L).getBoolean(this);
      if (var3 == null) {
         if (var10000 != 0) {
            Object[] var8 = com.c.a(var1, var2);
            Method var9 = com.c.d(401056956354921780L);
            Object[] var15 = var8;
            Object var12 = null;

            try {
               return (BufferedImage)var9.invoke(var12, var15);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         var10000 = var1;
      }

      Object[] var6 = com.c.a(var10000, var2);
      Method var7 = com.c.d(225394079158613941L);
      Object[] var13 = var6;
      Object var10 = null;

      try {
         return (BufferedImage)var7.invoke(var10, var13);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public boolean J() {
      return com.c.c(443961478089940624L).getBoolean(this);
   }

   public void Q(boolean var1) {
      com.c.c(443961478089940624L).setBoolean(this, var1);
   }

   static {
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
      com.c.c(207199684450790455L).setBoolean(null, false);
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25711;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





