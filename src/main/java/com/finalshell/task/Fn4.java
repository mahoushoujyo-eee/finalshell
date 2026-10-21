package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.dialog.EditDialog3;
import java.awt.Component;
import javax.swing.SwingUtilities;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

public class Fn4 implements Runnable {
   final Component S;
   final RSyntaxTextArea U;
   final EditDialog3 p;
   public static long[] a;
   public static Integer[] b;

   Fn4(EditDialog3 var1, Component var2, RSyntaxTextArea var3) {
      this.p = var1;
      this.S = var2;
      this.U = var3;
   }

   @Override
   public void run() {
      Object var1 = 199577697489155795L;
      ((EditDialog3)Ref.g(199577697489155795L, var1)).setSize(a(4257, 3190588006658207218L), a(11646, 9016145284451323948L));
      Object var3 = 199577697489155795L;
      EditDialog3 var10002 = (EditDialog3)Ref.g(199577697489155795L, var3);
      Object var5 = 621560698028342333L;
      this.setLocationRelativeTo(SwingUtilities.getWindowAncestor((Component)Ref.g(621560698028342333L, var5)));
      Object var7 = 449381642067527995L;
      ((RSyntaxTextArea)Ref.g(449381642067527995L, var7)).setCaretPosition(0);
      Object var9 = 199577697489155795L;
      ((EditDialog3)Ref.g(199577697489155795L, var9)).setVisible(true);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32083;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 537708178508238922L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ñª| uµ¼LfÊ+/\u0097Æ\u0081ö";
      int var5 = "ñª| uµ¼LfÊ+/\u0097Æ\u0081ö".length();
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





