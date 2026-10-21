import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m7 implements Runnable {
   final dA_3 P;

   m7(dA_3 var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(330322124816829715L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(611344775103445562L);
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





