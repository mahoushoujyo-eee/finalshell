import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JPanel;

class X extends JPanel {
   Color o;
   Color u;
   final u6_2 q;
   final U S;
   private static final long[] a;
   private static final Integer[] b;

   X(U var1, LayoutManager var2, u6_2 var3) {
      super(var2);
      this.S = var1;
      this.q = var3;
      com.c.c(155999215617506830L).set(this, new Color(a(11358, 8756166312212592970L), a(21513, 162557676342509854L), a(21513, 162557676342509854L)));
      com.c.c(433327328574911333L).set(this, new Color(a(1565, 4617671624137626379L), a(19849, 7124401421776230555L), a(19849, 7124401421776230555L)));
   }

   @Override
   protected void paintComponent(Graphics var1) {
      int var10;
      label28: {
         String[] var10000 = F8.y();
         super.paintComponent(var1);
         String[] var2 = var10000;
         Graphics2D var3 = (Graphics2D)var1;
         Color var4 = (Color)com.c.c(155999215617506830L).get(this);
         if (var2 == null) {
            if ((aM)com.c.c(493158471773442262L).get(com.c.c(172689974155154823L).get(this)) != null) {
               Object var7 = com.c.c(493158471773442262L).get(com.c.c(172689974155154823L).get(this));
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(230171768324088030L);
               Object[] var10002 = var10001;
               var10001 = (Object[])var7;
               Method var8 = var10003;

               try {
                  var9 = (ArrayList)var8.invoke(var10001, var10002);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }

               var10 = var9.size();
               if (var2 != null) {
                  break label28;
               }

               if (var10 > 0) {
                  var4 = (Color)com.c.c(433327328574911333L).get(this);
               }
            }

            var1.setColor(var4);
         }

         var10 = 3;
      }

      int var5 = var10;
      var1.drawLine(0, this.getHeight() - var5, this.getWidth(), this.getHeight() - var5);
   }

   @Override
   public void paint(Graphics var1) {
      String[] var10000 = F8.y();
      super.paint(var1);
      String[] var2 = var10000;
      u6_2 var4 = (u6_2)com.c.c(244518086307245336L).get(this);
      if (var2 == null) {
         if (var4 == null) {
            return;
         }

         var4 = (u6_2)com.c.c(244518086307245336L).get(this);
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(577875833820570498L);
      Object[] var10002 = var10001;
      u6_2 var7 = var4;
      Method var5 = var10003;

      try {
         var6 = (Boolean)var5.invoke(var7, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      if (var6) {
         var1.setColor(new Color(a(4779, 7555857428914292664L), a(5565, 8906316268934283432L), a(5565, 8906316268934283432L)));
         var1.drawLine(0, 0, 0, this.getHeight() - 3);
      }
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21782;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





