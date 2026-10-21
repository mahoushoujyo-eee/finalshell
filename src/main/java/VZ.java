import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VZ implements Runnable {
   final String Q;
   final boolean H;
   final boolean n;
   final F6 u;

   VZ(F6 var1, String var2, boolean var3, boolean var4) {
      this.u = var1;
      this.Q = var2;
      this.H = var3;
      this.n = var4;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(362622006565678895L).get(this);
      Object[] var10001 = com.c.a(
         com.c.c(224814590812340268L).get(this), com.c.c(383034791155443148L).getBoolean(this), com.c.c(155686081050602246L).getBoolean(this)
      );
      Method var10003 = com.c.d(326794563214348939L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10000 = (Method)com.c.c(362622006565678895L).get(this);
      var10001 = com.c.a(com.c.c(224814590812340268L).get(this), true);
      var10003 = com.c.d(203282927631494339L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





