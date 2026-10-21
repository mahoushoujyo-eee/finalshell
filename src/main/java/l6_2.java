import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class l6_2 implements Runnable {
   final JA O;

   l6_2(JA var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(301426101075703034L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(464203837310502625L);
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





