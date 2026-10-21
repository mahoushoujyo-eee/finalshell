import java.awt.Component;
import javax.swing.SwingUtilities;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;

class fn_4 implements Runnable {
   final Component S;
   final RSyntaxTextArea U;
   final mY p;
   private static final long[] a;
   private static final Integer[] b;

   fn_4(mY var1, Component var2, RSyntaxTextArea var3) {
      this.p = var1;
      this.S = var2;
      this.U = var3;
   }

   @Override
   public void run() {
      ((mY)com.c.c(199577697489155795L).get(this)).setSize(a(4257, 3190588006658207218L), a(11646, 9016145284451323948L));
      ((mY)com.c.c(199577697489155795L).get(this)).setLocationRelativeTo(SwingUtilities.getWindowAncestor((Component)com.c.c(621560698028342333L).get(this)));
      ((RSyntaxTextArea)com.c.c(449381642067527995L).get(this)).setCaretPosition(0);
      ((mY)com.c.c(199577697489155795L).get(this)).setVisible(true);
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32083;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





