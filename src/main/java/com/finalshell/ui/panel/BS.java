package com.finalshell.ui.panel;

import com.finalshell.core.NB;
import java.awt.Dimension;
import javax.swing.JPanel;

public class BS extends JPanel {
   public Y3 m;
   public static long[] a;
   public static Integer[] b;

   public BS(Y3 var1) {
      NB var2 = new NB();
      this.setLayout(var2);
      this.m = var1;
      this.setOpaque(false);
      this.setPreferredSize(new Dimension(a(29379, 8305696419938623317L), a(13510, 5822189323777546577L)));
      this.add(var1);
   }

   public Y3 N() {
      return this.m;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11670;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 393518101829894274L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "N¤ú\u0086\u0082í\u001eû\fý?ïJ\u0094Øÿ";
      int var5 = "N¤ú\u0086\u0082í\u001eû\fý?ïJ\u0094Øÿ".length();
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





