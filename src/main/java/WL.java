import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class WL implements PropertyChangeListener {
   final Ux_2 m;
   private static final long[] a;
   private static final Long[] b;

   WL(Ux_2 var1) {
      this.m = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String[] var10000 = F8.y();
      long var3 = System.currentTimeMillis() - com.c.c(130882364772064219L).getLong(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
      String[] var2 = var10000;
      long var68;
      int var15 = (var68 = var3 - a(10515, 2619215024826120798L)) == 0L ? 0 : (var68 < 0L ? -1 : 1);
      if (var2 == null) {
         if (var15 <= 0) {
            return;
         }

         long var69;
         var15 = (
                  var69 = com.c.c(130882364772064219L).getLong(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)))
                     - a(12161, 6512755223826758861L)
               )
               == 0L
            ? 0
            : (var69 < 0L ? -1 : 1);
      }

      if (var2 == null) {
         if (var15 <= 0) {
            return;
         }

         int var16 = ((aE)com.c.c(132798821314429637L).get(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)))).getHeight();
         Object var10001 = com.c.c(132798821314429637L).get(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(608818074819783119L);
         Object[] var10003 = var10002;
         var10002 = (Object[])var10001;
         var10001 = var10004;

         try {
            var34 = (Integer)var10001.invoke(var10002, var10003);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var15 = var16 - var34 - com.c.c(515873310631527540L).getInt(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
      }

      int var5 = var15;
      var10000 = (String[])com.c.c(395703699466617837L).get(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
      Object[] var35 = com.c.f();
      Method var61 = com.c.d(483219322811206313L);
      Object[] var52 = var35;
      var35 = var10000;
      Method var18 = var61;

      try {
         var19 = (Kj_2)var18.invoke(var35, var52);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      if (var2 == null) {
         var35 = com.c.f();
         var61 = com.c.d(571514335693873067L);
         var52 = var35;
         Kj_2 var38 = var19;
         Method var20 = var61;

         try {
            var21 = (Boolean)var20.invoke(var38, var52);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         if (!var21) {
            return;
         }

         var10000 = (String[])com.c.c(395703699466617837L).get(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
         var35 = com.c.f();
         var61 = com.c.d(483219322811206313L);
         var52 = var35;
         var35 = var10000;
         Method var23 = var61;

         try {
            var10000 = (String[])var23.invoke(var35, var52);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var35 = com.c.a(var5);
         var61 = com.c.d(364834420547747177L);
         var52 = var35;
         var35 = var10000;
         Method var25 = var61;

         try {
            var25.invoke(var35, var52);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         var10000 = (String[])com.c.c(395703699466617837L).get(com.c.c(338897995870391143L).get(com.c.c(495603700922808760L).get(this)));
         var35 = com.c.f();
         var61 = com.c.d(503550115260388056L);
         var52 = var35;
         var35 = var10000;
         Method var27 = var61;

         try {
            var19 = (Kj_2)var27.invoke(var35, var52);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      }

      var35 = com.c.a(var5);
      var61 = com.c.d(364834420547747177L);
      var52 = var35;
      Kj_2 var46 = var19;
      Method var28 = var61;

      try {
         var28.invoke(var46, var52);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var29 = com.c.f();
      Method var30 = com.c.d(270389152141252877L);
      var52 = var29;
      var35 = null;

      try {
         var10000 = (String[])var30.invoke(var35, var52);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var35 = com.c.f();
      var61 = com.c.d(578864097947885485L);
      var52 = var35;
      var35 = var10000;
      Method var32 = var61;

      try {
         var32.invoke(var35, var52);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   static {
      long var0 = 8953957269610244155L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÙÜÓ\u0013\u0013\u0099«\tX\u001b\u008a\u0082L\u0005R\u00ad";
      int var5 = "ÙÜÓ\u0013\u0013\u0099«\tX\u001b\u008a\u0082L\u0005R\u00ad".length();
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
      b = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 21324) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





