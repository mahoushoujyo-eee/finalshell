package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

public class Lx4 implements Icon {
   public final com.finalshell.ui.listener.YM k;
   public static long[] a;
   public static Integer[] b;

   public Lx4(com.finalshell.ui.listener.YM var1) {
      this.k = var1;
   }

   @Override
   public void paintIcon(Component var1, Graphics var2, int var3, int var4) {
      if (com.finalshell.ui.listener.YM.O(this.k) != null) {
         Graphics2D var5 = (Graphics2D)var2;
         var5.setPaint(Color.BLACK);
         var5.drawRect(var3, var4, a(6128, 1208588880344985760L), a(2447, 5313736253602836184L));
         var5.setPaint(Color.WHITE);
         var5.drawRect(var3 + 1, var4 + 1, a(1802, 5677968033197269084L), a(15881, 7951179266183371100L));
         var5.setPaint(com.finalshell.ui.listener.YM.O(this.k));
         var5.fillRect(var3 + 2, var4 + 2, a(3557, 2920510128524995252L), a(29210, 6261549951566206280L));
      }
   }

   @Override
   public int getIconWidth() {
      return a(4515, 1740688611933959920L);
   }

   @Override
   public int getIconHeight() {
      return a(13821, 8312665302388314793L);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10067;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5255419814602072006L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "Â\u001a\u000fið\u0003é&ç\u0089úåd\u0090\n\u00820\u0089ËZ\u001fNu~\tÀÖ\u001cö\u0094ïibEYÈ8ûq\u00114ÔïÇÊXÿ\u0097";
      int var5 = "Â\u001a\u000fið\u0003é&ç\u0089úåd\u0090\n\u00820\u0089ËZ\u001fNu~\tÀÖ\u001cö\u0094ïibEYÈ8ûq\u00114ÔïÇÊXÿ\u0097".length();
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
                     a = var6;
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "¤Zî¿@¨F\u0097Ò£ÌiÏuÍ\u007f";
                  var5 = "¤Zî¿@¨F\u0097Ò£ÌiÏuÍ\u007f".length();
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





