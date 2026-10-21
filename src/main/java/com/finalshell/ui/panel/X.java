package com.finalshell.ui.panel;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPanel;

public class X extends JPanel {
   public Color o;
   public Color u;
   public final U62 q;
   public final com.finalshell.ui.frame.MainFrame S;
   public static long[] a;
   public static Integer[] b;

   public X(com.finalshell.ui.frame.MainFrame var1, LayoutManager var2, U62 var3) {
      super(var2);
      this.S = var1;
      this.q = var3;
      Color var10001 = new Color(a(11358, 8756166312212592970L), a(21513, 162557676342509854L), a(21513, 162557676342509854L));
      long var5 = 155999215617506830L;
      Color var4 = var10001;
      Ref.s(155999215617506830L, var4, var5);
      Color var10002 = new Color(a(1565, 4617671624137626379L), a(19849, 7124401421776230555L), a(19849, 7124401421776230555L));
      long var7 = 433327328574911333L;
      Color var6 = var10002;
      Ref.s(433327328574911333L, var6, var7);
   }

   @Override
   public void paintComponent(Graphics var1) {
      X var10001;
      label28: {
         String[] var10000 = F8.y();
         super.paintComponent(var1);
         String[] var2 = var10000;
         Graphics2D var3 = (Graphics2D)var1;
         Object var6 = 155999215617506830L;
         Color var4 = (Color)Ref.g(155999215617506830L, var6);
         if (var2 == null) {
            var10001 = this;
            Object var8 = 172689974155154823L;
            Ref.g(172689974155154823L, var8);
            Object var10 = 493158471773442262L;
            if ((AM)Ref.g(493158471773442262L, var10) != null) {
               Object var12 = 172689974155154823L;
               Ref.g(172689974155154823L, var12);
               Object var14 = 493158471773442262L;
               Ref.g(493158471773442262L, var14);
               ArrayList var10006 = Registry.emptyArgs();
               long var17 = 230171768324088030L;
               Object var16 = var10006;
               var10006 = Ref.h(230171768324088030L, var16, var17);

               try {
                  var10006 = (ArrayList)var10006;
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               int var23 = var10006.size();
               if (var2 != null) {
                  break label28;
               }

               if (var23 > 0) {
                  Object var18 = 433327328574911333L;
                  var4 = (Color)Ref.g(433327328574911333L, var18);
               }
            }

            var1.setColor(var4);
         }

         var10001 = 3;
      }

      X var5 = var10001;
      var1.drawLine(0, this.getHeight() - var5, this.getWidth(), this.getHeight() - var5);
   }

   @Override
   public void paint(Graphics var1) {
      boolean var12;
      String[] var10000 = F8.y();
      super.paint(var1);
      String[] var2 = var10000;
      Object var3 = 244518086307245336L;
      U62 var10001 = (U62)Ref.g(244518086307245336L, var3);
      if (var2 == null) {
         if (var10001 == null) {
            return;
         }

         Object var5 = 244518086307245336L;
         U62 var10002 = (U62)Ref.g(244518086307245336L, var5);
      }

      Object var10 = Registry.emptyArgs();
      long var8 = 577875833820570498L;
      Object var7 = var10;
      var10 = Ref.h(577875833820570498L, var7, var8);

      try {
         var12 = (Boolean)var10;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (var12) {
         var1.setColor(new Color(a(4779, 7555857428914292664L), a(5565, 8906316268934283432L), a(5565, 8906316268934283432L)));
         var1.drawLine(0, 0, 0, this.getHeight() - 3);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21782;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8970885630801764745L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "}à\u0086\u0088þ\u0087²(\u0097x qùpà_øJ?\u0099ù4\u0018\u000b£~crë\u0084!Ç";
      int var5 = "}à\u0086\u0088þ\u0087²(\u0097x qùpà_øJ?\u0099ù4\u0018\u000b£~crë\u0084!Ç".length();
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

                  var4 = "\u008b\u00134\u0089>Úù¸U\u0012\u008c\u0015\u0017v¦×";
                  var5 = "\u008b\u00134\u0089>Úù¸U\u0012\u008c\u0015\u0017v¦×".length();
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





