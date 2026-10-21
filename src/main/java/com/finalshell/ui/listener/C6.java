package com.finalshell.ui.listener;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class C6 extends MouseAdapter {
   public boolean l;
   final com.finalshell.ui.panel.L w;
   public static long[] a;
   public static Integer[] b;

   public C6(com.finalshell.ui.panel.L var1) {
      this.w = var1;
      this.l = false;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.l = true;
      com.finalshell.ui.panel.L.R(this.w, true);
      this.b(var1.getPoint());
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.b(var1.getPoint());
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var10000 = com.finalshell.ui.panel.N_2.g();
      this.l = false;
      int var2 = var10000;
      com.finalshell.ui.panel.L.R(this.w, false);
      com.finalshell.ui.panel.L var3 = this.w;
      if (var2 == 0) {
         if (com.finalshell.ui.panel.L.N(this.w).getVisibleRect().contains(var1.getPoint())) {
            return;
         }

         var3 = this.w;
      }

      var3.setCursor(Cursor.getDefaultCursor());
   }

   public void b(Point var1) {
      int var2;
      int var3;
      int var10001;
      label43: {
         label46: {
            var3 = com.finalshell.ui.panel.N_2.W();
            com.finalshell.ui.panel.L.u(this.w, var1);
            var2 = var3;
            var3 = com.finalshell.ui.panel.L.H(this.w).x;
            var10001 = 2;
            if (var2 != 0) {
               if (var3 < 2) {
                  com.finalshell.ui.panel.L.H(this.w).x = 2;
                  if (var2 != 0) {
                     break label46;
                  }
               }

               var3 = com.finalshell.ui.panel.L.H(this.w).x;
               var10001 = a(16814, 2416795011955695764L);
            }

            if (var2 == 0) {
               break label43;
            }

            if (var3 > var10001) {
               com.finalshell.ui.panel.L.H(this.w).x = a(22101, 6800546665711974254L);
            }
         }

         var3 = com.finalshell.ui.panel.L.H(this.w).y;
         var10001 = 2;
      }

      label32: {
         label31: {
            if (var2 != 0) {
               if (var3 < var10001) {
                  com.finalshell.ui.panel.L.H(this.w).y = 2;
                  if (var2 != 0) {
                     break label31;
                  }
               }

               var4 = this.w;
               if (var2 == 0) {
                  break label32;
               }

               var3 = com.finalshell.ui.panel.L.H(this.w).y;
               var10001 = a(22101, 6800546665711974254L);
            }

            if (var3 > var10001) {
               com.finalshell.ui.panel.L.H(this.w).y = a(22101, 6800546665711974254L);
            }
         }

         var4 = this.w;
      }

      var4.p(com.finalshell.ui.panel.L.l(this.w).X(com.finalshell.ui.panel.L.H(this.w).x, com.finalshell.ui.panel.L.H(this.w).y));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.w.setCursor(com.finalshell.ui.panel.L.z(this.w));
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int var2 = com.finalshell.ui.panel.N_2.g();
      C6 var10000 = this;
      if (var2 == 0) {
         if (this.l) {
            return;
         }

         var10000 = this;
      }

      var10000.w.setCursor(Cursor.getDefaultCursor());
   }

   C6(com.finalshell.ui.panel.L var1, com.finalshell.ui.panel.W2 var2) {
      this(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24890;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 574130379787635079L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "U\u0093s+è\u008e¨\u0011Å×vª¾:?ë";
      int var5 = "U\u0093s+è\u008e¨\u0011Å×vª¾:?ë".length();
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





