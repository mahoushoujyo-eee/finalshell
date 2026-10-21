import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class kh_4 implements Runnable {
   final Vo_2 e;

   kh_4(Vo_2 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(288736546242913911L).get(com.c.c(130967415689204029L).get(this)));
      Method var3 = com.c.d(385643251219565463L);
      Object[] var10 = var10000;
      Object var7 = null;

      try {
         var10000 = (Object[])var3.invoke(var7, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var7 = com.c.f();
      Method var10003 = com.c.d(613805675130464613L);
      var10 = (Object[])var7;
      var7 = var10000;
      Method var5 = var10003;

      try {
         var6 = (Boolean)var5.invoke(var7, var10);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      if (var6) {
         com.c.c(194285877583497070L).set(null, new cB_3(null));
      }
   }
}





