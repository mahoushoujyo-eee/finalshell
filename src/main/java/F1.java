import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class F1 implements Runnable {
   final ux_4 H;

   F1(ux_4 var1) {
      this.H = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(275353081768743222L).get(com.c.c(133013519344596583L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(119751058421524022L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





