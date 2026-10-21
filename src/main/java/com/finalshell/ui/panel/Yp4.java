package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;

public class Yp4 extends JPanel {
   BufferedImage a;
   com.finalshell.ui.frame.U t;
   BufferedImage I;
   Dimension Z;
   public static long[] b;
   public static Integer[] c;

   public Yp4(com.finalshell.ui.frame.U var1) {
      Dimension var10001 = new Dimension();
      long var3 = 144144297701832345L;
      Dimension var2 = var10001;
      Ref.s(144144297701832345L, var2, var3);
      long var5 = 353594629265861369L;
      Ref.s(353594629265861369L, var1, var5);
      this.setBackground(new Color(a(23044, 7231760300941467345L), a(30567, 7967035522027418547L), a(30567, 7967035522027418547L)));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
   }

   public void C(Graphics var1) {
      F8.y();
      Graphics2D var3 = (Graphics2D)var1;
      Object var8 = 598164442605824123L;
      int var4 = ((BufferedImage)Ref.g(598164442605824123L, var8)).getWidth();
      Yp4 var2 = this;
      Object var10 = 598164442605824123L;
      int var5 = ((BufferedImage)Ref.g(598164442605824123L, var10)).getHeight();
      int var6 = 0;

      while (true) {
         if (var6 < this.getHeight()) {
            if (var2 != null) {
               break;
            }

            int var7 = 0;

            label27: {
               while (var7 < this.getWidth()) {
                  Object var12 = 598164442605824123L;
                  this.drawImage((BufferedImage)Ref.g(598164442605824123L, var12), var7, var6, this);
                  var7 += var4;
                  if (var2 != null) {
                     break label27;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var6 += var5;
            }

            if (var2 == null) {
               continue;
            }
         }

         Object var14 = 598164442605824123L;
         this.drawImage((BufferedImage)Ref.g(598164442605824123L, var14), 0, 0, this.getWidth(), this.getHeight(), this);
         break;
      }
   }

   public void s(BufferedImage var1) {
      Object[] var10001 = Registry.packArgs(var1.getGraphics());
      long var3 = 625791441337438829L;
      Object[] var2 = var10001;
      Ref.h(625791441337438829L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void C(BufferedImage var1, Point var2) {
      Graphics2D var3 = (Graphics2D)var1.getGraphics();
      Object var4 = 452126640426893815L;
      if ((BufferedImage)Ref.g(452126640426893815L, var4) != null) {
         Object var6 = 452126640426893815L;
         this.drawImage((BufferedImage)Ref.g(452126640426893815L, var6), -var2.x, -var2.y, null);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1236;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4738516379375152624L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008b>î\u008d\bZ^¼=\u0083ä3\reóÞ";
      int var5 = "\u008b>î\u008d\bZ^¼=\u0083ä3\reóÞ".length();
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
      c = new Integer[2];
   }
}





