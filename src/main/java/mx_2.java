import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class mx_2 implements Runnable {
   final yT_3 s;

   mx_2(yT_3 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      long var2 = System.currentTimeMillis();
      com.ky_4[] var1 = var10000;
      var10000 = (com.ky_4[])com.c.c(596574325639006435L).get(this);
      Object[] var10001 = com.c.a(com.c.c(596574325639006435L).get(this));
      Method var22 = com.c.d(385643251219565463L);
      Object[] var46 = var10001;
      Object var36 = null;

      try {
         var10001 = (Object[])var22.invoke(var36, var46);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var36 = com.c.f();
      Method var10004 = com.c.d(227837117761533093L);
      var46 = (Object[])var36;
      var36 = var10001;
      Method var24 = var10004;

      try {
         var10001 = (Object[])var24.invoke(var36, var46);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10001 = com.c.a(var10001);
      Method var48 = com.c.d(448378562507554122L);
      var36 = var10001;
      var10001 = var10000;
      Method var12 = var48;

      try {
         var12.invoke(var10001, (Object[])var36);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      if (var1 != null) {
         Object[] var13 = com.c.f();
         Method var14 = com.c.d(454647487873911743L);
         var36 = var13;
         var10001 = null;

         try {
            var15 = (Boolean)var14.invoke(var10001, (Object[])var36);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (var15) {
            Object[] var16 = com.c.f();
            Method var17 = com.c.d(258164365275909391L);
            var36 = var16;
            var10001 = null;

            try {
               var17.invoke(var10001, (Object[])var36);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var10000 = (com.ky_4[])com.c.c(388376917454860932L).get(null);
         var10001 = com.c.a(new bH_3(this));
         Method var49 = com.c.d(434592463220957006L);
         var36 = var10001;
         var10001 = var10000;
         Method var19 = var49;

         try {
            var19.invoke(var10001, (Object[])var36);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10000 = (com.ky_4[])com.c.c(388376917454860932L).get(null);
         var10001 = com.c.a(new Fo_2(this));
         Method var50 = com.c.d(434592463220957006L);
         var36 = var10001;
         var10001 = var10000;
         Method var21 = var50;

         try {
            var21.invoke(var10001, (Object[])var36);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }
}





