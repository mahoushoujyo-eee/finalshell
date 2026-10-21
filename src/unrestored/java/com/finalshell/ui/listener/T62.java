package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Xw2;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

public class T62 implements MouseListener {
   public final String O;
   public final JTextArea z;
   public final Color c;
   public final Xw2 Q;
   public static long[] a;
   public static Integer[] b;

   public T62(Xw2 var1, String var2, JTextArea var3, Color var4) {
      this.Q = var1;
      this.O = var2;
      this.z = var3;
      this.c = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 1) {
         Object var2 = 234327104644884975L;
         Ref.g(234327104644884975L, var2);
         Object var4 = 171354759103384428L;
         Object[] var10003 = Registry.packArgs(Ref.g(171354759103384428L, var4), true, false);
         long var7 = 633945515680537718L;
         Object[] var6 = var10003;
         Ref.h(633945515680537718L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 575933832999332612L;
      JTextArea var10001 = (JTextArea)Ref.g(575933832999332612L, var2);
      Object var4 = 505268545378852829L;
      this.setForeground((Color)Ref.g(505268545378852829L, var4));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 575933832999332612L;
      ((JTextArea)Ref.g(575933832999332612L, var2))
         .setForeground(new Color(a(4857, 6734463482494783977L), a(17112, 1464686875404157386L), a(22260, 7380108076858004965L)));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 784;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 661930374963496008L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "¤æ\u0093D\u000bL\u0095¿w\u0093¾\u0086\u0084¡Qe³\u000b\u009fÊ²\u0019ÅÒ";
      int var5 = "¤æ\u0093D\u000bL\u0095¿w\u0093¾\u0086\u0084¡Qe³\u000b\u009fÊ²\u0019ÅÒ".length();
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
      b = new Integer[3];
   }
}





