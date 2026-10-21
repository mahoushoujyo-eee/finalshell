package com.finalshell.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Q extends V2 {
   public static Color C;
   public static Color X;
   public static long[] b;
   public static Integer[] h;

   @Override
   public void u(Graphics2D var1, Rectangle var2, JLabel var3) {
      var1.setPaint(Color.WHITE);
      var1.fillRoundRect(var2.x, var2.y, var2.width, var2.height - 1, a(22996, 1095822548412599027L), a(20759, 4925044994517893685L));
      var1.setPaint(X);
      var1.fillRect(var2.x + 3, var2.y + 3, var2.width - a(20759, 4925044994517893685L), var2.height - a(8411, 7389959874918937597L));
      var1.setPaint(C);
      var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 2, a(20759, 4925044994517893685L), a(20759, 4925044994517893685L));
      var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 1, a(20759, 4925044994517893685L), a(20759, 4925044994517893685L));
      super.u(var1, var2, var3);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.u(var1, var2, (JLabel)var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21284;
      if (h[var3] == null) {
         h[var3] = (int)(b[var3] ^ var1);
      }

      return h[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1099736943979045524L;
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "}\u00ad_*\u0093ð\f\u0014\u0005<óà+0U$FD×qÄÐQn ²Ã\u001dÂÁ¨a\u0019y\u0094\u0080\u0014G\u0011\u008a";
      int var5 = "}\u00ad_*\u0093ð\f\u0014\u0005<óà+0U$FD×qÄÐQn ²Ã\u001dÂÁ¨a\u0019y\u0094\u0080\u0014G\u0011\u008a".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     b = var6;
                     h = new Integer[7];
                     C = new Color(a(9305, 2397745262061614972L), a(24818, 9012245611809453010L), a(24818, 9012245611809453010L));
                     X = new Color(a(32083, 1971180738456759927L), a(30178, 7254752993972201155L), a(30178, 7254752993972201155L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "c\t@)¦Ô\u0084 \f\u0003\u00adó\u009d0 §";
                  var5 = "c\t@)¦Ô\u0084 \f\u0003\u00adó\u009d0 §".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





