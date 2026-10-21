package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Bb2 extends JLabel {
   public float t;
   public Color j;
   public Color S;
   public Color M;
   public static long[] a;
   public static Integer[] b;

   public Bb2() {
      Color var10001 = new Color(a(13150, 5018521600442028481L), a(3250, 4933275102930693678L), a(3250, 4933275102930693678L), a(16264, 2382114477901208848L));
      long var2 = 320109642003167991L;
      Color var1 = var10001;
      Ref.s(320109642003167991L, var1, var2);
      Color var10002 = new Color(a(22997, 1285890374411270987L), a(22997, 1285890374411270987L), a(22997, 1285890374411270987L), a(22997, 1285890374411270987L));
      long var4 = 241244696636935484L;
      Color var3 = var10002;
      Ref.s(241244696636935484L, var3, var4);
      Color var10003 = new Color(a(6491, 178927690734074816L), a(22997, 1285890374411270987L), a(19754, 8561380314086485943L), a(25562, 1403116900173644099L));
      long var6 = 175684390310739956L;
      Color var5 = var10003;
      Ref.s(175684390310739956L, var5, var6);
      this.setHorizontalAlignment(2);
      this.setForeground(new Color(a(30092, 3631477624986998557L), a(8203, 8756770977363214993L), a(8203, 8756770977363214993L)));
      this.setBorder(new EmptyBorder(0, 3, 0, 0));
   }

   @Override
   public void paint(Graphics var1) {
      label33: {
         Graphics2D var3;
         byte var5;
         byte var6;
         int var9;
         int var10;
         label35: {
            byte var2;
            int var10001;
            label36: {
               var3 = (Graphics2D)var1;
               float var4 = Registry.lookupField(224347986923037516L).getFloat(this);
               int var10000 = (XN.T()) ? 1 : 0;
               var5 = 0;
               var6 = 0;
               byte var7 = 0;
               byte var8 = 0;
               var2 = (byte)var10000;
               var9 = (int)(((float)this.getWidth() - (float)var8) * var4) + var7;
               float var16;
               var10000 = (var16 = var4 - 0.006F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
               if (var2 != 0) {
                  if (var10000 > 0) {
                     var10 = 1;
                     var10001 = var2;
                     if (var2 == 0) {
                        break label36;
                     }

                     if (var9 < var10) {
                        var9 = var10;
                     }
                  }

                  var10000 = var5;
               }

               var10 = var10000;
               Object var11 = 175684390310739956L;
               this.setColor((Color)Ref.g(175684390310739956L, var11));
               if (var2 == 0) {
                  break label35;
               }

               float var17;
               var10001 = (var17 = var4 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            }

            if (var10001 > 0) {
               var3.fillRect(var6, var10, var9, this.getHeight() - 2 * var5);
               if (var2 != 0) {
                  break label33;
               }
            }

            Object var13 = 320109642003167991L;
            this.setColor((Color)Ref.g(320109642003167991L, var13));
         }

         var3.fillRect(var6, var10, var9, this.getHeight() - 2 * var5);
      }

      super.paint(var1);
   }

   public float Z() {
      return Registry.lookupField(224347986923037516L).getFloat(this);
   }

   public void F(float var1) {
      Registry.lookupField(224347986923037516L).setFloat(this, var1);
      new StringBuilder();
      Object var10001 = Registry.packArgs(100.0F * var1);
      long var3 = 443004786775321843L;
      Object var10002 = Ref.h2(443004786775321843L, var3);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      String var2 = ((java.lang.StringBuilder)var10001).append((String)var10002).append("%").toString();
      this.setText(var2);
      this.repaint();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25241;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 208316726611882267L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "½ \u0016¸wK°Î\u001aÈÀV¯äìÃ\u0015×]\u0088ìÖJé8JuñwVsÌ+Î\u009e6\u0092\\\u009eüí)=\u0003\u0003\u000f_ÏK\u001e¹¬á\u0081à ";
      int var5 = "½ \u0016¸wK°Î\u001aÈÀV¯äìÃ\u0015×]\u0088ìÖJé8JuñwVsÌ+Î\u009e6\u0092\\\u009eüí)=\u0003\u0003\u000f_ÏK\u001e¹¬á\u0081à ".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0017Î\u008cí\u0000\u0099\u008a\u0098Û\u008b\u007f\u008c]X&@";
                  var5 = "\u0017Î\u008cí\u0000\u0099\u008a\u0098Û\u008b\u007f\u008c]X&@".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





