import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class no_2 implements Runnable {
   final U i;

   no_2(U var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(565460019918896506L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(399329213267848661L);
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





