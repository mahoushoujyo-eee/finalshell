import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ac_2 implements Runnable {
   final Y3 e;

   ac_2(Y3 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(575424184787798525L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(196680627597967655L);
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





