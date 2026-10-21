package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.listener.Ng2;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;

public class NT extends JPanel {
   public Color P;
   public static long[] c;
   public static Integer[] d;

   public NT() {
      Color var10001 = new Color(a(18309, 3323874423531133518L), a(18309, 3323874423531133518L), a(18309, 3323874423531133518L), a(11939, 4348966307409933162L));
      long var2 = 252265086804302055L;
      Color var1 = var10001;
      Ref.s(252265086804302055L, var1, var2);
      this.addMouseListener(new Ng2(this));
   }

   public NT(LayoutManager var1) {
      Color var10001 = new Color(a(25323, 6743261566705237795L), a(18309, 3323874423531133518L), a(18309, 3323874423531133518L), a(29547, 2229753643738754721L));
      long var3 = 252265086804302055L;
      Color var2 = var10001;
      Ref.s(252265086804302055L, var2, var3);
      this.setLayout(var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7625;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2777747773715257367L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u008dl\u0010\u009b\u009a¡«\u0019wÞ¥\u0098èìgË";
      int var5 = "\u008dl\u0010\u009b\u009a¡«\u0019wÞ¥\u0098èìgË".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     c = var6;
                     d = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "èæ\u0012g{zB¦4\u009em7\u0000@vÒ";
                  var5 = "èæ\u0012g{zB¦4\u009em7\u0000@vÒ".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





