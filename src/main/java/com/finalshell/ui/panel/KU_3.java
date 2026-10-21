package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class KU_3 extends K2_2 {
   public JLabel y;
   final com.finalshell.ui.frame.U a;
   public static long[] b;
   public static Integer[] c;

   public KU_3(com.finalshell.ui.frame.U var1, String var2) {
      super(new FlowLayout());
      this.a = var1;
      this.setMinimumSize(new Dimension(a(23845, 3071535225548551627L), a(21048, 3721634103344216784L)));
      this.setPreferredSize(new Dimension(a(8108, 5100437305593526083L), a(21169, 2787493154485811802L)));
      this.setBackground(Color.white);
      this.setBorder(BorderFactory.createLineBorder(Color.lightGray));
      JLabel var10001 = new JLabel(var2);
      long var4 = 465039462725491967L;
      JLabel var3 = var10001;
      Ref.s(465039462725491967L, var3, var4);
      Object var5 = 465039462725491967L;
      ((JLabel)Ref.g(465039462725491967L, var5))
         .setBorder(
            BorderFactory.createEmptyBorder(
               a(3467, 4038129186853872994L), a(19897, 9062887053425091923L), a(19897, 9062887053425091923L), a(19897, 9062887053425091923L)
            )
         );
      Object var7 = 465039462725491967L;
      this.add((JLabel)Ref.g(465039462725491967L, var7));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26859;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8247871120701688630L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "CË\"#\u0098U1ú£\u009c:WÌC.o\u0004\u009e\u000f?u/n^\u001b¼¥`wo1¶";
      int var5 = "CË\"#\u0098U1ú£\u009c:WÌC.o\u0004\u009e\u000f?u/n^\u001b¼¥`wo1¶".length();
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
                     b = var6;
                     c = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "´ã¿9\t\u00adüã\u0098¼Vú_K>\u00ad";
                  var5 = "´ã¿9\t\u00adüã\u0098¼Vú_K>\u00ad".length();
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





