package com.finalshell.ui.panel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Bi2 extends JPanel {
   public static long[] a;
   public static Integer[] b;

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.setColor(new Color(a(5322, 8166423488860772340L), a(2798, 7607016043794647505L), a(2798, 7607016043794647505L)));
      int var2 = a(18612, 1673463886484835208L);
      var1.drawLine(this.getWidth() - 1, var2, this.getWidth() - 1, this.getHeight() - var2);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17214;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5550589772441252277L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\u0094\r\u0081q\"µ&×\u0000úg®£U8ò*zN\u008a²\u0019z;";
      int var5 = "\u0094\r\u0081q\"µ&×\u0000úg®£U8ò*zN\u008a²\u0019z;".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
      b = new Integer[3];
   }
}





