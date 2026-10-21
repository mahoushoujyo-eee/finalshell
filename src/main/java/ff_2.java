import com.pA_3;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

public class Ff_2 extends FK {
   pA_3 xu;
   private static final long[] cb;
   private static final Integer[] db;

   public Ff_2(pA_3 var1, Dv_2 var2) {
      super(var2, true, true);
      Object[] var10001 = com.c.a(com.c.c(376708942717725433L).get(this));
      Method var10003 = com.c.d(404783571443964257L);
      Object[] var10002 = var10001;
      Ff_2 var12 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var12, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(com.c.c(282658375549611139L).get(this));
      var10003 = com.c.d(404783571443964257L);
      var10002 = var10001;
      Ff_2 var14 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10001 = com.c.a(b(9336, 5327246559209332194L), b(1969, 2397974912023248426L));
      var10003 = com.c.d(620992058944098515L);
      var10002 = var10001;
      Ff_2 var16 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var16, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      com.c.c(486034766712698701L).set(this, var1);
      var10001 = com.c.a(false);
      var10003 = com.c.d(482653304504628027L);
      var10002 = var10001;
      Ff_2 var18 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var18, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(220872586276736931L);
      var10002 = var10001;
      Ff_2 var20 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var20, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      ((Dv_2)com.c.c(334241381080505095L).get(this)).setForeground(Color.white);
      ((Dv_2)com.c.c(334241381080505095L).get(this)).j().n(false);
      ((Dv_2)com.c.c(334241381080505095L).get(this))
         .j()
         .w(new Color(b(6055, 986013398667079230L), b(27209, 6445919796311446481L), b(27209, 6445919796311446481L)));
   }

   @Override
   public void D() {
      super.D();
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(601414556089179464L);
      Object[] var10002 = var10001;
      Ff_2 var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   protected void h(JButton var1) {
   }

   @Override
   protected void i(L1 var1, int var2) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(197395297555400075L);
      Object[] var10002 = var10001;
      Ff_2 var13 = this;
      Method var10000 = var10003;

      try {
         var7 = var10000.invoke(var13, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(190233821466993016L);
      var10002 = var10001;
      var10001 = (Object[])var7;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      Object[] var9 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var9;
      var10001 = null;

      try {
         var11 = var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = (Object[])var11;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   protected void L(String var1) {
   }

   @Override
   protected void k(L1 var1) {
      String[] var2 = F_.F();
      Ff_2 var10000 = this;
      if (var2 != null) {
         if (!com.c.c(461146548297071424L).getBoolean(this) && !CK.Ur) {
            return;
         }

         Dv_2 var4 = (Dv_2)com.c.c(334241381080505095L).get(this);
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(542058094445767607L);
         Object[] var10003 = var10002;
         L1 var6 = var1;
         Method var10001 = var10004;

         try {
            var5 = (String)var10001.invoke(var6, var10003);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var4.setText(var5);
         var10000 = this;
      }

      ((Dv_2)com.c.c(334241381080505095L).get(var10000)).requestFocus();
   }

   @Override
   protected dx_4 n() {
      return new dx_4();
   }

   @Override
   protected dx_4 k() {
      dx_4 var10000 = com.c.f();
      Method var5 = com.c.d(270389152141252877L);
      Object[] var16 = var10000;
      Object var11 = null;

      try {
         var10000 = (Object[])var5.invoke(var11, var16);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var11 = com.c.f();
      Method var10003 = com.c.d(306266403902896148L);
      var16 = (Object[])var11;
      var11 = var10000;
      Method var7 = var10003;

      try {
         var10000 = (Object[])var7.invoke(var11, var16);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var11 = com.c.f();
      var10003 = com.c.d(568950058787001160L);
      var16 = (Object[])var11;
      var11 = var10000;
      Method var9 = var10003;

      try {
         var10000 = (dx_4)var9.invoke(var11, var16);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return var10000;
   }

   void u(L1 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(197395297555400075L);
      Object[] var10002 = var10001;
      Ff_2 var15 = this;
      Method var10000 = var10003;

      try {
         var8 = (dx_4)var10000.invoke(var15, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      dx_4 var2 = var8;
      var10001 = com.c.a(var1);
      var10003 = com.c.d(331594575686452212L);
      var10002 = var10001;
      dx_4 var17 = var2;
      var10000 = var10003;

      try {
         var10000.invoke(var17, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var10 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var10;
      var10001 = null;

      try {
         var12 = var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = (Object[])var12;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      pA_3 var14 = (pA_3)com.c.c(486034766712698701L).get(this);
      var10002 = com.c.f();
      Method var10004 = com.c.d(542058094445767607L);
      Object[] var32 = var10002;
      L1 var29 = var1;
      Method var22 = var10004;

      try {
         var10001 = (String)var22.invoke(var29, var32);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var14.x(var10001, true);
      ((Dv_2)com.c.c(334241381080505095L).get(this)).setText("");
      ((pA_3)com.c.c(486034766712698701L).get(this)).requestFocus();
   }

   @Override
   public boolean p(L1 var1) {
      return true;
   }

   @Override
   protected void u(KeyEvent var1) {
   }

   @Override
   protected String c() {
      return ((Dv_2)com.c.c(265132846717086219L).get(this)).getText().trim();
   }

   @Override
   public void Q(L1 var1, int var2) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(364598167251173458L);
      Object[] var10002 = var10001;
      Ff_2 var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   public void h() {
      com.c.c(486034766712698701L).set(this, null);
   }

   @Override
   public void K() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new d0_2(this), com.c.c(222883478649268280L).getInt(null));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   static {
      long var0 = 1214873543476543772L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "¥î°d\b=Ò\u0005\u0095}\u007fÕV£/ê";
      int var5 = "¥î°d\b=Ò\u0005\u0095}\u007fÕV£/ê".length();
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
                     cb = var6;
                     db = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0012WÍ¤]h\u009d\nö7Ï\u000e.\u0081>¦";
                  var5 = "\u0012WÍ¤]h\u009d\nö7Ï\u000e.\u0081>¦".length();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14744;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }
}





