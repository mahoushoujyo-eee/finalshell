package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class S2 extends JComponent {
   final X3 i;
   public static long[] a;
   public static Integer[] b;

   public S2(X3 var1) {
      this.i = var1;
      FN.Y(this);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      Graphics2D var2 = (Graphics2D)var1;
      var2.setPaint(Color.GRAY);
      var2.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
      var2.setPaint(Color.WHITE);
      var2.drawRect(1, 1, this.getWidth() - 3, this.getHeight() - 3);
      var2.setPaint(X3.o(this.i));
      var2.fillRect(2, 2, this.getWidth() - 4, this.getHeight() - 4);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(a(30760, 6596961787425933515L), a(8497, 7651104621442666963L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12514;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2420588774803213953L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ïuî`Ù\u0001\u001eVIâå¾U(Æ\\";
      int var5 = "Ïuî`Ù\u0001\u001eVIâå¾U(Æ\\".length();
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
   }
}





