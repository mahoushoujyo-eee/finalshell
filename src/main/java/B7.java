import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class B7 implements KeyListener {
   L1 W;
   final boolean R;
   final FK r;
   private static final long[] a;
   private static final Integer[] b;

   B7(FK var1, boolean var2) {
      this.r = var1;
      this.R = var2;
      com.c.c(308750888373001143L).set(this, null);
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String[] var2 = FK.i();
      FK var10000 = (FK)com.c.c(484003208200249497L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(634403491225282499L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (Boolean)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      if (var2 == null) {
         if (!var12) {
            return;
         }

         ((tq_4)com.c.c(618427502576624312L).get(com.c.c(484003208200249497L).get(this))).getSelectedRow();
      }

      int var13 = com.c.c(361141657865972500L).getBoolean(this);
      if (var2 == null) {
         if (var13 != 0) {
            return;
         }

         var13 = var1.getModifiers();
      }

      if (var2 == null) {
         if (var13 != 0) {
            return;
         }

         var13 = var1.getKeyCode();
      }

      if (var2 == null) {
         if (var13 != a(20141, 8189760722115350579L)) {
            return;
         }

         var13 = ((FK)com.c.c(484003208200249497L).get(this)).isVisible();
      }

      if (var13 == 0) {
      }

      if (!com.c.c(361141657865972500L).getBoolean(this)) {
         label105: {
            long var4 = System.currentTimeMillis() - com.c.c(202023651119989609L).getLong(com.c.c(484003208200249497L).get(this));
            int var14 = com.c.c(552009030867017299L).getInt(com.c.c(484003208200249497L).get(this));
            if (var2 == null) {
               if (var14 != a(22529, 5405553293530154653L)) {
                  return;
               }

               var10000 = (FK)com.c.c(484003208200249497L).get(this);
               var10001 = com.c.a(false);
               var10003 = com.c.d(464995000560394494L);
               var10002 = var10001;
               var10001 = var10000;
               Method var16 = var10003;

               try {
                  var16.invoke(var10001, var10002);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var10000 = (FK)com.c.c(484003208200249497L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(306221011327708335L);
               var10002 = var10001;
               var10001 = var10000;
               Method var18 = var10003;

               try {
                  var18.invoke(var10001, var10002);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               var10000 = (FK)com.c.c(484003208200249497L).get(this);
               if (var2 != null) {
                  break label105;
               }

               var14 = var10000.isVisible();
            }

            if (var14 == 0) {
               var10000 = (FK)com.c.c(484003208200249497L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(612990022110170911L);
               var10002 = var10001;
               var10001 = var10000;
               Method var21 = var10003;

               try {
                  var21.invoke(var10001, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               if (var2 == null) {
                  return;
               }
            }

            var10000 = (FK)com.c.c(484003208200249497L).get(this);
         }

         var10001 = com.c.f();
         var10003 = com.c.d(496821856781947383L);
         var10002 = var10001;
         FK var31 = var10000;
         Method var22 = var10003;

         try {
            var22.invoke(var31, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String[] var10000 = FK.i();
      com.c.c(202023651119989609L).setLong(com.c.c(484003208200249497L).get(this), System.currentTimeMillis());
      String[] var2 = var10000;
      com.c.c(552009030867017299L).setInt(com.c.c(484003208200249497L).get(this), var1.getKeyCode());
      FK var5 = (FK)com.c.c(484003208200249497L).get(this);
      if (var2 == null) {
         com.c.c(600941127808801108L).setBoolean(var5, true);
         if (var1.getKeyCode() != a(28338, 2849901760476180525L)) {
            return;
         }

         var5 = (FK)com.c.c(484003208200249497L).get(this);
      }

      String var3 = ((Dv_2)com.c.c(334241381080505095L).get(var5)).getText().trim();
      var10000 = (String[])com.c.c(484003208200249497L).get(this);
      Object[] var10001 = com.c.a(var3);
      Method var10003 = com.c.d(170585917374516338L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static {
      long var0 = 4905433317014324509L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = ";\u008aå\u0098× \u0095<îa{æ§ð5:Äx6s9O\u0083\u0092";
      int var5 = ";\u008aå\u0098× \u0095<îa{æ§ð5:Äx6s9O\u0083\u0092".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7838;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





