package com.finalshell.ui.panel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;

public class GC extends JScrollPane {
   public static long[] a;
   public static Integer[] b;

   public GC(Component var1) {
      super(var1);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      var1.setColor(new Color(a(9027, 7207630479965414036L), a(17656, 7074004464367273261L), a(17656, 7074004464367273261L), a(10517, 6162690979598231747L)));
      var1.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16855;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2328232635136771963L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "JãKÞÝQe'h\u0081\u0085Zh¸oÀlÇRÄ¥ï\u0002\u009e";
      int var5 = "JãKÞÝQe'h\u0081\u0085Zh¸oÀlÇRÄ¥ï\u0002\u009e".length();
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





