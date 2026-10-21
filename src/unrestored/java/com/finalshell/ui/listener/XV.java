package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.core.SN;
import com.finalshell.core.WC_2;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XV implements ActionListener {
   public int L;
   public final Rectangle h;
   public final int m;
   public final int E;
   public final Window n;
   public static long[] a;
   public static Integer[] b;

   public XV(Rectangle var1, int var2, int var3, Window var4) {
      this.h = var1;
      this.m = var2;
      this.E = var3;
      this.n = var4;
      this.L = 1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      label15: {
         String var2 = FV_2.D();
         Object var10000 = this;
         if (var2 == null) {
            if (this.L <= a(20114, 1000204779819488227L)) {
               int var3 = this.h.width + this.m * this.L / a(7759, 2278290378248356671L);
               int var4 = this.h.height + this.E * this.L / a(7759, 2278290378248356671L);
               Rectangle var5 = new Rectangle(this.h.x + this.h.width / 2 - var3 / 2, this.h.y + this.h.height / 2 - var4 / 2, var3, var4);
               this.n.setBounds(var5);
               if (var2 == null) {
                  break label15;
               }
            }

            var10000 = SN.E().get(this.n);
         }

         ((WC_2)var10000).Y();
      }

      this.L++;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7536;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9092564293235972177L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "J\u0000\u0089_é\u0014\u001bd·»\u0001ÉprË¸";
      int var5 = "J\u0000\u0089_é\u0014\u001bd·»\u0001ÉprË¸".length();
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
      b = new Integer[2];
   }
}





