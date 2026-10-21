package com.finalshell.ui.adapter;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class CC3 extends DefaultTableCellRenderer {
   public Border j;
   public JLabel s;
   public static long[] a;
   public static Integer[] b;

   public CC3() {
      Border var10001 = BorderFactory.createEmptyBorder(0, a(18607, 3269062062980860896L), 0, 4);
      long var2 = 332556289657322240L;
      Border var1 = var10001;
      Ref.s(332556289657322240L, var1, var2);
      JLabel var10002 = new JLabel();
      long var4 = 328499212841214311L;
      JLabel var3 = var10002;
      Ref.s(328499212841214311L, var3, var4);
      Object var5 = 328499212841214311L;
      ((JLabel)Ref.g(328499212841214311L, var5)).setOpaque(false);
      Object var7 = 328499212841214311L;
      JLabel var10004 = (JLabel)Ref.g(328499212841214311L, var7);
      Object var9 = 332556289657322240L;
      this.setBorder((Border)Ref.g(332556289657322240L, var9));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      boolean var10000 = Uo2.i();
      String var8 = "";
      boolean var7 = var10000;
      CC3 var28 = var2.getClass().equals(String.class);
      if (!var7) {
         if (var28 == null) {
            var8 = (String)var2;
         }

         var28 = this;
         Object var10 = 328499212841214311L;
         ((JLabel)Ref.g(328499212841214311L, var10)).setText(var8);
      }

      label36: {
         if (!var7) {
            if (var28 == null) {
               Object var12 = 328499212841214311L;
               ((JLabel)Ref.g(328499212841214311L, var12)).setBackground((Color)Registry.lookupField(623875439513009390L).get(null));
               Object var14 = 328499212841214311L;
               ((JLabel)Ref.g(328499212841214311L, var14)).setForeground((Color)Registry.lookupField(513155505692963448L).get(null));
               Object var16 = 328499212841214311L;
               ((JLabel)Ref.g(328499212841214311L, var16)).setOpaque(true);
               if (!var7) {
                  break label36;
               }
            }

            var28 = var5 % 2;
         }

         CC3 var9 = var28;
         Object var18 = 328499212841214311L;
         ((JLabel)Ref.g(328499212841214311L, var18))
            .setForeground(new Color(a(18064, 8934967926841968094L), a(29928, 4784423068431398816L), a(29928, 4784423068431398816L)));
         if (!var7) {
            if (var9 == null) {
               Object var20 = 328499212841214311L;
               ((JLabel)Ref.g(328499212841214311L, var20)).setOpaque(false);
               if (!var7) {
                  break label36;
               }
            }

            Object var22 = 328499212841214311L;
            ((JLabel)Ref.g(328499212841214311L, var22)).setOpaque(true);
         }

         Object var24 = 328499212841214311L;
         ((JLabel)Ref.g(328499212841214311L, var24))
            .setBackground(
               new Color(a(27875, 6152197716845539240L), a(4519, 3305820026644452077L), a(4519, 3305820026644452077L), a(222, 1429018933008253847L))
            );
      }

      Object var26 = 328499212841214311L;
      return (JLabel)Ref.g(328499212841214311L, var26);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17226;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9118749117672873083L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u009eùö\u0099ùO\u008eòëoàÑ.@s·kõ\u009cÎëÅëéÚ}q<\u0095\u008f\u009fæ";
      int var5 = "\u009eùö\u0099ùO\u008eòëoàÑ.@s·kõ\u009cÎëÅëéÚ}q<\u0095\u008f\u009fæ".length();
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
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ÿ´]7\f Ù\u0097¸Í\u008b{&bW\u0093";
                  var5 = "ÿ´]7\f Ù\u0097¸Í\u008b{&bW\u0093".length();
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





