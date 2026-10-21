package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Cn2;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Xq2 extends KeyAdapter {
   public final JTextField Y;
   public final FocusAdapter b;
   public final int Z;
   public final Component D;
   public final com.finalshell.core.T5 R;
   public final com.finalshell.core.X0 K;
   public static long[] a;
   public static Integer[] c;

   public Xq2(com.finalshell.core.X0 var1, JTextField var2, FocusAdapter var3, int var4, Component var5, com.finalshell.core.T5 var6) {
      this.K = var1;
      this.Y = var2;
      this.b = var3;
      this.Z = var4;
      this.D = var5;
      this.R = var6;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      label27: {
         String[] var2;
         int var10000;
         label30: {
            var2 = Cn2.Q$arrString();
            var10000 = var1.getKeyCode();
            int var10001 = a(24329, 730080405954399023L);
            if (var2 != null) {
               if (var10000 == var10001) {
                  this.Y.removeFocusListener(this.b);
                  com.finalshell.core.X0.k(this.Z, this.D, null, this.R);
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = var1.getKeyCode();
               if (var2 == null) {
                  break label30;
               }

               var10001 = a(29844, 4767306496160014515L);
            }

            if (var10000 != var10001) {
               break label27;
            }

            this.Y.removeFocusListener(this.b);
            var10000 = this.Z;
         }

         com.finalshell.core.X0.k(var10000, this.D, this.Y.getText(), this.R);
         if (var2 != null) {
            return;
         }
      }

      super.keyPressed(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21542;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 911298554295336899L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ú\u009aè®#{4÷\"\u008f\u009d-\n\u001e\u001fz";
      int var5 = "ú\u009aè®#{4÷\"\u008f\u009d-\n\u001e\u001fz".length();
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
      c = new Integer[2];
   }
}





