import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class kp_4 implements Runnable {
   final fe_4 H;

   kp_4(fe_4 var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(305402254993059552L).get(com.c.c(270662763281156011L).get(com.c.c(218112836542140074L).get(this)));
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
         com.c.c(515525013030853953L).get(com.c.c(270662763281156011L).get(com.c.c(218112836542140074L).get(this))),
         ((a3)com.c.c(305402254993059552L).get(com.c.c(270662763281156011L).get(com.c.c(218112836542140074L).get(this)))).getParent(),
         true
      );
      var10003 = com.c.d(244589320073274134L);
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





