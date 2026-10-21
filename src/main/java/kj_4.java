import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class kj_4 implements Runnable {
   final yT_3 d;

   kj_4(yT_3 var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      long var1 = System.currentTimeMillis();
      com.c.c(498028056500556957L).set(com.c.c(359338737929576679L).get(this), new fx_4());
      Method var10000 = (Method)com.c.c(498028056500556957L).get(com.c.c(359338737929576679L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(385944803922021920L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





