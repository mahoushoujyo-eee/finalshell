import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextArea;

class t6_2 implements MouseListener {
   final String O;
   final JTextArea z;
   final Color c;
   final xw_2 Q;
   private static final long[] a;
   private static final Integer[] b;

   t6_2(xw_2 var1, String var2, JTextArea var3, Color var4) {
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
         Method var10000 = (Method)com.c.c(234327104644884975L).get(this);
         Object[] var10001 = com.c.a(com.c.c(171354759103384428L).get(this), true, false);
         Method var10003 = com.c.d(633945515680537718L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      ((JTextArea)com.c.c(575933832999332612L).get(this)).setForeground((Color)com.c.c(505268545378852829L).get(this));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      ((JTextArea)com.c.c(575933832999332612L).get(this))
         .setForeground(new Color(a(4857, 6734463482494783977L), a(17112, 1464686875404157386L), a(22260, 7380108076858004965L)));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 784;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





