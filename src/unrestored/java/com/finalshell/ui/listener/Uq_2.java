package com.finalshell.ui.listener;

import com.finalshell.ui.model.Bi2;
import com.finalshell.ui.panel.OZ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uq_2 implements ActionListener {
   public final OZ N;
   public static long[] a;
   public static Long[] b;

   public Uq_2(OZ var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      OZ var3;
      label28: {
         label27: {
            String[] var2 = Bi2.Y();
            boolean var10000 = this.N.j.equals(Bi2.stopwatch);
            if (var2 == null) {
               if (var10000) {
                  this.N.k = this.N.k + a(16406, 8879035748290835358L);
                  if (var2 == null) {
                     break label27;
                  }
               }

               var3 = this.N;
               if (var2 != null) {
                  break label28;
               }

               var10000 = this.N.j.equals(Bi2.timer);
            }

            if (var10000) {
               this.N.k = this.N.k - a(18246, 2710468243110671567L);
               var3 = this.N;
               if (var2 != null) {
                  break label28;
               }

               if (this.N.k <= a(24148, 3164689764988071391L)) {
                  this.N.k = 0L;
                  this.N.B();
                  this.N.M.Y();
               }
            }
         }

         var3 = this.N;
      }

      var3.f();
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 29577) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2999752775283029725L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\f<ÇÀÝ*\u0002vR\u0099è¹4b\u0005'\u0002J\u007fÓ\u008aÑ\u0018ê";
      int var5 = "\f<ÇÀÝ*\u0002vR\u0099è¹4b\u0005'\u0002J\u007fÓ\u008aÑ\u0018ê".length();
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
      b = new Long[3];
   }
}





