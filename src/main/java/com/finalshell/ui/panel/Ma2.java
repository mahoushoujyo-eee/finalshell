package com.finalshell.ui.panel;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.WY;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.Autoscroll;
import javax.swing.JTree;

public class Ma2 extends JTree implements Autoscroll {
   public int t;
   public final WY p;
   public static long[] a;
   public static Integer[] b;

   public Ma2(WY var1) {
      this.p = var1;
      Registry.lookupField(488074350194265753L).setInt(this, a(4158, 4417524758015965507L));
   }

   @Override
   public void autoscroll(Point var1) {
      int var7;
      label34: {
         int[] var10000 = Connection4.I();
         int var3 = this.getRowForLocation(var1.x, var1.y);
         int[] var2 = var10000;
         Rectangle var4 = this.getBounds();
         var7 = var1.y + var4.y;
         int var10001 = Registry.lookupField(488074350194265753L).getInt(this);
         if (var2 != null) {
            if (var7 <= var10001) {
               var7 = var3;
               byte var9 = 1;
               if (var2 != null) {
                  if (var3 < 1) {
                     var7 = 0;
                     break label34;
                  }

                  var7 = var3;
                  var9 = 1;
               }

               var7 -= var9;
               break label34;
            }

            var7 = var3;
            var10001 = this.getRowCount() - 1;
         }

         if (var2 != null) {
            if (var7 >= var10001) {
               var7 = var3;
               break label34;
            }

            var7 = var3;
            var10001 = 1;
         }

         var7 += var10001;
      }

      int var5 = var7;
      this.scrollRowToVisible(var5);
   }

   @Override
   public Insets getAutoscrollInsets() {
      Rectangle var1 = this.getBounds();
      Rectangle var2 = this.getParent().getBounds();
      return new Insets(
         var2.y - var1.y + Registry.lookupField(488074350194265753L).getInt(this),
         var2.x - var1.x + Registry.lookupField(488074350194265753L).getInt(this),
         var1.height - var2.height - var2.y + var1.y + Registry.lookupField(488074350194265753L).getInt(this),
         var1.width - var2.width - var2.x + var1.x + Registry.lookupField(488074350194265753L).getInt(this)
      );
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Rectangle var2 = this.getBounds();
      Rectangle var3 = this.getParent().getBounds();
      var1.setColor(Color.red);
      var1.drawRect(
         -var2.x + a(12543, 7818527805531380096L),
         -var2.y + a(4158, 4417524758015965507L),
         var3.width - a(1836, 321678234831351376L),
         var3.height - a(7680, 130109224610264958L)
      );
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27007;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4247185512232968962L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "êØh\u000bäâº\u008e\u0094\u009722\u00051\u0094d";
      int var5 = "êØh\u000bäâº\u008e\u0094\u009722\u00051\u0094d".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0088R\u0080âCÜ\u001aMs\u009dêÜðÌ\rJ";
                  var5 = "\u0088R\u0080âCÜ\u001aMs\u009dêÜðÌ\rJ".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





