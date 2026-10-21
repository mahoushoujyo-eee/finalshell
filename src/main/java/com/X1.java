package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

class X1 implements ActionListener {
   final JProgressBar H;
   final Ej_2 V;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   X1(Ej_2 var1, JProgressBar var2) {
      this.V = var1;
      this.H = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = com.By_2.y();
      int var10000 = Ej_2.g(this.V);
      if (var2 != 0) {
         if (var10000 < Ej_2.I(this.V)) {
            Ej_2.C(this.V, a(21520, 9110738063845259727L));
            this.S(this.H);
            if (var2 != 0) {
               return;
            }
         }

         Ej_2.X(this.V, a(2958, 898257431738132048L));
      }

      this.S(this.H);
      rD_3.l(c);
   }

   private void S(JProgressBar var1) {
      int var2 = com.By_2.y();
      int var10000 = var1.isIndeterminate();
      if (var2 != 0) {
         if (var10000 != 0) {
            return;
         }

         var10000 = var1.getValue();
      }

      if (var10000 > var1.getMinimum()) {
         SwingUtilities.invokeLater(new I2(this, var1));
      }
   }

   static {
      long var2 = 1682504722857885809L;
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "§\u0081j\u0003\u0003üù±æº\u0015s\u0092¸Y©";
      int var7 = "§\u0081j\u0003\u0003üù±æº\u0015s\u0092¸Y©".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10004 = (
               ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      b = new Integer[2];
      long var0 = 135952753654703297L;
      long var10002 = 135952753654702365L ^ var0;
      byte var11 = -1;
      c = var10002;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11743;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





