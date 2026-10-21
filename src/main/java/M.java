import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class M implements Runnable {
   final kR_3 n;

   M(kR_3 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(481028078493164457L).get(com.c.c(497805502478041018L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(346382751221538814L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(
         com.c.c(515525013030853953L).get(com.c.c(481028078493164457L).get(com.c.c(497805502478041018L).get(this))),
         ((a3)com.c.c(305402254993059552L).get(com.c.c(481028078493164457L).get(com.c.c(497805502478041018L).get(this)))).getParent(),
         true
      );
      var10003 = com.c.d(424588502733950890L);
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





