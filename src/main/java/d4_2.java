import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class d4_2 implements Runnable {
   final yT_3 t;

   d4_2(yT_3 var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(581600672436814503L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(412189052060962364L);
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





