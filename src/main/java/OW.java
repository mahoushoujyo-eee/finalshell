import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OW implements Runnable {
   final Ln_2 l;
   private static final long a;

   OW(Ln_2 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      boolean var1 = ln_4.i();

      try {
         Object var10000 = com.c.c(444888628147674524L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(349012733953542138L);
         Object[] var10002 = var10001;
         var10001 = (Object[])var10000;
         var10000 = var10003;

         try {
            var17 = (Boolean)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (!var17) {
            return;
         }
      } catch (Exception var15) {
         throw a(var15);
      }

      Object[] var18 = com.c.f();
      Method var19 = com.c.d(270389152141252877L);
      Object[] var48 = var18;
      Object var34 = null;

      try {
         var18 = (Object[])var19.invoke(var34, var48);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var34 = com.c.f();
      Method var57 = com.c.d(375944019649708240L);
      var48 = (Object[])var34;
      var34 = var18;
      Method var21 = var57;

      try {
         var18 = (U5)var21.invoke(var34, var48);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      U5 var2 = var18;
      int var3 = (int)a;

      label90: {
         try {
            if (!var1) {
               break label90;
            }

            long var23 = System.currentTimeMillis();
            var48 = com.c.f();
            Method var10004 = com.c.d(186487761808053297L);
            Object[] var58 = var48;
            U5 var51 = var2;
            var34 = var10004;

            try {
               var38 = (Long)var34.invoke(var51, var58);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var23 - var38 <= (long)var3) {
               return;
            }
         } catch (Exception var14) {
            throw a(var14);
         }

         try {
            var18 = (Object[])com.c.c(444888628147674524L).get(this);
            var34 = com.c.a(com.c.c(358782464092968093L).get(com.c.c(444888628147674524L).get(this)));
            var57 = com.c.d(355391844538089141L);
            var48 = (Object[])var34;
            var34 = var18;
            Method var25 = var57;

            try {
               var25.invoke(var34, var48);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }
         } catch (Exception var9) {
         }
      }

      var18 = com.c.f();
      Method var27 = com.c.d(270389152141252877L);
      var48 = var18;
      var34 = null;

      try {
         var18 = (Object[])var27.invoke(var34, var48);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var34 = com.c.f();
      var57 = com.c.d(375944019649708240L);
      var48 = (Object[])var34;
      var34 = var18;
      Method var29 = var57;

      try {
         var18 = (Object[])var29.invoke(var34, var48);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var34 = com.c.e(System.currentTimeMillis());
      var57 = com.c.d(511675613308694766L);
      var48 = (Object[])var34;
      var34 = var18;
      Method var31 = var57;

      try {
         var31.invoke(var34, var48);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 8592086498739285636L;
      long var10002 = 3124416405911935924L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





