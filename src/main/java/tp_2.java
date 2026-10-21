import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tp_2 implements Runnable {
   final F_ d;

   Tp_2(F_ var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(306481791184023029L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(496821856781947383L);
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





