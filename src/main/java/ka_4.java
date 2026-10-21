import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ka_4 implements Runnable {
   final U E;

   ka_4(U var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(153427872343135490L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(176356587927714575L);
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





