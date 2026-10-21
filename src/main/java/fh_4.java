import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fh_4 implements Runnable {
   final d8_2 L;
   private final gH p;

   fh_4(d8_2 var1, gH var2) {
      this.L = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      String var10000 = d8_2.Q();
      Method var10001 = (Method)com.c.c(391045987025414928L).get(this);
      Object[] var10002 = com.c.a(Thread.currentThread());
      Method var10004 = com.c.d(310185339103778335L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var10001 = (Method)com.c.c(391045987025414928L).get(this);
      var10002 = com.c.f();
      var10004 = com.c.d(341542274982347937L);
      var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var20 = (Runnable)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var20.run();
      String var1 = var10000;
      var10000 = (String)com.c.c(391045987025414928L).get(this);
      Object[] var21 = com.c.f();
      Method var41 = com.c.d(434390456563867566L);
      var10002 = var21;
      var10001 = var10000;
      Method var10 = var41;

      try {
         var11 = (Boolean)var10.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      label79: {
         if (var1 == null) {
            if (var11 != 0) {
               return;
            }

            var12 = (gH)com.c.c(391045987025414928L).get(this);
            if (var1 != null) {
               break label79;
            }

            Object[] var23 = com.c.f();
            Method var42 = com.c.d(140051292629163334L);
            var10002 = var23;
            gH var24 = var12;
            Method var13 = var42;

            try {
               var11 = (Integer)var13.invoke(var24, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         if (var11 != com.c.c(439517225992595079L).getInt(null)) {
            return;
         }

         gH var14 = (gH)com.c.c(391045987025414928L).get(this);
         long var25 = System.currentTimeMillis();
         var10002 = (Object[])com.c.c(391045987025414928L).get(this);
         var10003 = com.c.f();
         Method var10005 = com.c.d(175209733329813569L);
         Object[] var48 = var10003;
         var10003 = var10002;
         Method var36 = var10005;

         try {
            var37 = (Integer)var36.invoke(var10003, var48);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         Object[] var26 = com.c.e(var25 + (long)var37);
         Method var45 = com.c.d(231959045328111640L);
         var10002 = var26;
         gH var27 = var14;
         Method var15 = var45;

         try {
            var15.invoke(var27, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var12 = (gH)com.c.c(391045987025414928L).get(this);
      }

      Object[] var28 = com.c.a(false);
      Method var46 = com.c.d(573074163756087155L);
      var10002 = var28;
      gH var29 = var12;
      Method var16 = var46;

      try {
         var16.invoke(var29, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





