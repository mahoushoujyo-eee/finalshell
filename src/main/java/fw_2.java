import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Fw_2 extends FK {
   WS eL;
   String ed;
   lj_4 eJ;
   private static final long[] cb;
   private static final Integer[] db;

   public Fw_2(String var1, WS var2, Dv_2 var3) {
      super(var3, true);
      Object[] var10001 = com.c.a(b(29988, 1516009930303765884L), b(19668, 4005540325463934093L));
      Method var10003 = com.c.d(620992058944098515L);
      Object[] var10002 = var10001;
      Fw_2 var15 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var15, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      com.c.c(187140034186517946L).set(this, var1);
      com.c.c(426573730261755490L).set(this, var2);
      var10001 = com.c.a(false);
      var10003 = com.c.d(482653304504628027L);
      var10002 = var10001;
      Fw_2 var17 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var17, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10001 = com.c.a(false);
      var10003 = com.c.d(481279655071834828L);
      var10002 = var10001;
      Fw_2 var19 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var19, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(false);
      var10003 = com.c.d(464995000560394494L);
      var10002 = var10001;
      Fw_2 var21 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var21, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10001 = com.c.a(false);
      var10003 = com.c.d(539780336826110266L);
      var10002 = var10001;
      Fw_2 var23 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var23, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.a(true);
      var10003 = com.c.d(338129737384235253L);
      var10002 = var10001;
      Fw_2 var25 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var25, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public lj_4 a() {
      return (lj_4)com.c.c(289445681920008656L).get(this);
   }

   public void t(lj_4 var1) {
      com.c.c(289445681920008656L).set(this, var1);
   }

   public String T() {
      return (String)com.c.c(187140034186517946L).get(this);
   }

   public void Z(String var1) {
      com.c.c(187140034186517946L).set(this, var1);
   }

   @Override
   public boolean p(L1 var1) {
      return true;
   }

   @Override
   protected dx_4 k() {
      int[] var10000 = yB_3.Y();
      Object var2 = null;
      int[] var1 = var10000;
      lj_4 var5 = (lj_4)com.c.c(289445681920008656L).get(this);
      if (var1 == null) {
         if (var5 == null) {
            return new dx_4();
         }

         var5 = (lj_4)com.c.c(289445681920008656L).get(this);
      }

      Object[] var10001 = com.c.a(com.c.c(187140034186517946L).get(this));
      Method var10003 = com.c.d(242040625560871861L);
      Object[] var10002 = var10001;
      lj_4 var8 = var5;
      Method var6 = var10003;

      try {
         var7 = (dx_4)var6.invoke(var8, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return var7;
   }

   @Override
   protected void L(String var1) {
      Object[] var10000 = com.c.a(var1);
      Method var6 = com.c.d(330094358428833085L);
      Object[] var16 = var10000;
      Object var11 = null;

      try {
         var7 = (Boolean)var6.invoke(var11, var16);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (!var7) {
         L1 var2 = new L1("", var1);
         var11 = com.c.f();
         Method var10003 = com.c.d(247369048764074052L);
         var16 = (Object[])var11;
         var11 = this;
         Method var8 = var10003;

         try {
            var10000 = (Object[])var8.invoke(var11, var16);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var11 = com.c.a(var2);
         var10003 = com.c.d(331594575686452212L);
         var16 = (Object[])var11;
         var11 = var10000;
         Method var10 = var10003;

         try {
            var10.invoke(var11, var16);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   @Override
   protected void i(L1 var1, int var2) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(247369048764074052L);
      Object[] var10002 = var10001;
      Fw_2 var22 = this;
      Method var10000 = var10003;

      try {
         var10 = var10000.invoke(var22, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(190233821466993016L);
      var10002 = var10001;
      var10001 = (Object[])var10;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var12 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var12;
      var10001 = null;

      try {
         var14 = var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = (Object[])var14;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var16 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var16;
      var10001 = null;

      try {
         var18 = var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(612604310671515822L);
      var10002 = var10001;
      var10001 = (Object[])var18;
      var10000 = var10003;

      try {
         var20 = var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(200561288808923907L);
      var10002 = var10001;
      var10001 = (Object[])var20;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   protected void k(L1 var1) {
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(499180481011525071L);
      Object[] var10002 = var10001;
      Fw_2 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Dv_2 var4 = (Dv_2)com.c.c(334241381080505095L).get(this);
      var10002 = com.c.f();
      Method var10004 = com.c.d(542058094445767607L);
      Object[] var10 = var10002;
      L1 var9 = var1;
      Method var6 = var10004;

      try {
         var10001 = (String)var6.invoke(var9, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var4.setText(var10001);
      ((Dv_2)com.c.c(334241381080505095L).get(this)).requestFocus();
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
      Method var10003 = com.c.d(565532503448267938L);
      Object[] var10002 = var10001;
      Fw_2 var7 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Method var5 = (Method)com.c.c(426573730261755490L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(469112436702288424L);
      var10002 = var10001;
      var10001 = var5;
      var5 = var10003;

      try {
         var5.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   @Override
   protected dx_4 n() {
      return null;
   }

   static {
      long var0 = 7541713775315075023L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = ";©$\n§\u0094úÒ<zXLTëC½";
      int var5 = ";©$\n§\u0094úÒ<zXLTëC½".length();
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

      cb = var6;
      db = new Integer[2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2137;
      if (db[var3] == null) {
         db[var3] = (int)(cb[var3] ^ var1);
      }

      return db[var3];
   }
}





