import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

public class LI extends JLabel {
   boolean z;
   Kl_2 J;
   private static final long[] a;
   private static final Integer[] b;

   public LI() {
      com.c.c(489863265832754423L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      LI var14;
      boolean var10000 = s.p();
      Graphics2D var3 = (Graphics2D)var1;
      boolean var2 = var10000;
      var14 = this;
      label44:
      if (!var2) {
         if ((Kl_2)com.c.c(227134258213482384L).get(this) != null) {
            var14 = this;
            if (var2) {
               break label44;
            }

            label40:
            if (com.c.c(489863265832754423L).getBoolean(this)) {
               Color var4 = new Color(
                  a(14128, 5120093020140478051L), a(22044, 7117432141894647630L), a(3014, 3587927999217345174L), a(25358, 3707060545719781983L)
               );
               var3.setColor(var4);
               Object var15 = com.c.c(227134258213482384L).get(this);
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(431375544983974376L);
               Object[] var10002 = var10001;
               var10001 = (Object[])var15;
               var15 = var10003;

               try {
                  var17 = (Long)var15.invoke(var10001, var10002);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               float var18 = (float)var17;
               var10001 = (Object[])com.c.c(227134258213482384L).get(this);
               var10002 = com.c.f();
               Method var10004 = com.c.d(399113218510016089L);
               Object[] var25 = var10002;
               var10002 = var10001;
               Method var21 = var10004;

               try {
                  var22 = (Long)var21.invoke(var10002, var25);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               float var5 = var18 / (float)var22;
               byte var6 = 2;
               byte var7 = 2;
               byte var8 = 0;
               byte var9 = 2;
               int var10 = (int)(((float)this.getWidth() - (float)var9) * var5) + var8;
               if (!var2) {
                  if (var5 > 0.0F) {
                     var3.fillRect(this.getWidth() - var10 - var7, var6, var10, this.getHeight() - 2 * var6);
                     if (!var2) {
                        break label40;
                     }
                  }

                  var3.setColor(var4);
               }

               var3.fillRect(this.getWidth() - var10 - var7, var6, var10, this.getHeight() - 2 * var6);
            }
         }

         var14 = this;
      }

      var14.paint(var1);
   }

   public boolean X() {
      return com.c.c(489863265832754423L).getBoolean(this);
   }

   public void R(boolean var1) {
      com.c.c(489863265832754423L).setBoolean(this, var1);
   }

   public Kl_2 Y() {
      return (Kl_2)com.c.c(227134258213482384L).get(this);
   }

   public void e(Kl_2 var1) {
      com.c.c(227134258213482384L).set(this, var1);
   }

   static {
      long var0 = 9081866470908194073L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "/ôi\u001frms \u009ag\u0016cÂ\u0090\u0092ý";
      int var5 = "/ôi\u001frms \u009ag\u0016cÂ\u0090\u0092ý".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "³&²Vì}'\u0016QMÉ«q\u0004O\u0019";
                  var5 = "³&²Vì}'\u0016QMÉ«q\u0004O\u0019".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10579;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





