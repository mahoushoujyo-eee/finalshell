package com.finalshell.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class W2_2 extends D2_2 {
   public static Color p;
   public static Color Y;
   public static Color z;
   public static Color S;
   public com.finalshell.ui.model.G R = com.finalshell.ui.model.G.thick;
   public static long[] e;
   public static Integer[] n;

   public com.finalshell.ui.model.G b() {
      return this.R;
   }

   public void L(com.finalshell.ui.model.G var1) {
      this.R = var1;
   }

   @Override
   public void h(Graphics2D var1, Rectangle var2, JPanel var3) {
      int[] var4 = W_2.B$arrint();
      Object var10000 = var3;
      if (var4 == null) {
         if (var3.isOpaque()) {
            var1.setPaint(var3.getBackground());
            var1.fillRect(var2.x, var2.y, var2.width, var2.height);
         }

         var10000 = RV.X(var1);
      }

      Object var5;
      label24: {
         var5 = var10000;
         var10000 = this.R;
         com.finalshell.ui.model.G var10001 = com.finalshell.ui.model.G.bold;
         if (var4 == null) {
            if (this.R == com.finalshell.ui.model.G.bold) {
               var1.setPaint(Color.WHITE);
               var1.fillRoundRect(var2.x, var2.y, var2.width, var2.height - 1, b(31782, 4162003507853097130L), b(16384, 4836687837971104906L));
               var1.setPaint(Y);
               var1.fillRoundRect(var2.x + 3, var2.y + 3, var2.width - b(16384, 4836687837971104906L), var2.height - b(11137, 3946449415819472648L), 3, 3);
               var1.setPaint(p);
               var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 2, b(16384, 4836687837971104906L), b(16384, 4836687837971104906L));
               var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 1, b(16384, 4836687837971104906L), b(16384, 4836687837971104906L));
               if (var4 == null) {
                  break label24;
               }
            }

            var10000 = this.R;
            var10001 = com.finalshell.ui.model.G.thick;
         }

         if (var10000 == var10001) {
            var1.setPaint(S);
            var1.fillRoundRect(var2.x, var2.y, var2.width, var2.height, b(16384, 4836687837971104906L), b(16384, 4836687837971104906L));
            var1.setPaint(z);
            var1.drawRoundRect(var2.x, var2.y, var2.width - 1, var2.height - 2, b(16384, 4836687837971104906L), b(16384, 4836687837971104906L));
         }
      }

      RV.X(var1, var5);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.h(var1, var2, (JPanel)var3);
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1163;
      if (n[var3] == null) {
         n[var3] = (int)(e[var3] ^ var1);
      }

      return n[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4596321958908359035L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "ÝÜe\u0015ÑÕ\u0005û\u001c°IÚU·5÷óðÞt\u0083øÞt&\u0001(\u009dL\n\u009a\t\u0096\u0007\u007fòîë\u0090\f,Ï\u0088«#ÆÕóÜ\u0005XÖ+ß§Z\u0015¿\nÑ½\u008c\t×§ãª\nMàVF";
      int var5 = "ÝÜe\u0015ÑÕ\u0005û\u001c°IÚU·5÷óðÞt\u0083øÞt&\u0001(\u009dL\n\u009a\t\u0096\u0007\u007fòîë\u0090\f,Ï\u0088«#ÆÕóÜ\u0005XÖ+ß§Z\u0015¿\nÑ½\u008c\t×§ãª\nMàVF"
         .length();
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
                     e = var6;
                     n = new Integer[11];
                     p = new Color(b(17884, 3819912836176396638L), b(21088, 4276421137754281709L), b(21088, 4276421137754281709L));
                     Y = new Color(b(28429, 6612226141153782661L), b(9033, 5422170035805169610L), b(9033, 5422170035805169610L));
                     z = new Color(b(25893, 6732309691720065450L), b(1485, 1841200718260666700L), b(1485, 1841200718260666700L));
                     S = new Color(b(28915, 2765777544771433592L), b(8446, 8315402648996652144L), b(8446, 8315402648996652144L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "«¹\u0094\u0014{0°é\u009f\\;6v\u0010pê";
                  var5 = "«¹\u0094\u0014{0°é\u009f\\;6v\u0010pê".length();
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





