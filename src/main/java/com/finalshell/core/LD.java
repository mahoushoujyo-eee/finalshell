package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LD extends Lz2_2 {
   final com.finalshell.ui.listener.YM a;
   public static long[] b;
   public static Integer[] e;

   LD(com.finalshell.ui.listener.YM var1) {
      this.a = var1;
   }

   public void d(Graphics2D var1, Rectangle var2, Ky4 var3) {
      int var4 = Nx4.R();
      com.finalshell.ui.listener.YM var10000 = this.a;
      if (var4 == 0) {
         if (!com.finalshell.ui.listener.YM.M(this.a).isShowing()) {
            return;
         }

         var10000 = this.a;
      }

      if (var10000.O.j != null) {
         var1.drawImage(com.finalshell.ui.listener.YM.q(this.a), var2.x + 2, var2.y + 2, var2.width - 4, var2.height - 4, null);
         var1.setPaint(Color.BLACK);
         var1.drawRect(0, 0, var2.width - 1, var2.height - 1);
         var1.setPaint(Color.WHITE);
         var1.drawRect(1, 1, var2.width - 3, var2.height - 3);
         int var5 = var2.x + var2.width / 2;
         int var6 = var2.y + var2.height / 2;
         var1.setPaint(Color.WHITE);
         var1.drawLine(var5 - 1, var6 - a(9662, 736673284630892496L), var5 - 1, var6 + a(30869, 1820307675219661562L));
         var1.drawLine(var5 + 1, var6 - a(30869, 1820307675219661562L), var5 + 1, var6 + a(30869, 1820307675219661562L));
         var1.drawLine(var5 - a(30869, 1820307675219661562L), var6 - 1, var5 + a(30869, 1820307675219661562L), var6 - 1);
         var1.drawLine(var5 - a(30869, 1820307675219661562L), var6 + 1, var5 + a(30869, 1820307675219661562L), var6 + 1);
         var1.setPaint(Color.BLACK);
         var1.drawLine(var5, var6 - a(30869, 1820307675219661562L), var5, var6 + a(30869, 1820307675219661562L));
         var1.drawLine(var5 - a(30869, 1820307675219661562L), var6, var5 + a(30869, 1820307675219661562L), var6);
      }
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.d(var1, var2, (Ky4)var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27246;
      if (e[var3] == null) {
         e[var3] = (int)(b[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2074378631410572291L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "-<Ä¿ë\u0012\u0093Ô£A¡GE\u0081Îþ";
      int var5 = "-<Ä¿ë\u0012\u0093Ô£A¡GE\u0081Îþ".length();
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

      b = var6;
      e = new Integer[2];
   }
}





