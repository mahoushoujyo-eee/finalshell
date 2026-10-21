import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class JH implements Runnable {
   final bO_3 h;

   JH(bO_3 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(476201740043670453L).get(com.c.c(217384029588736691L).get(com.c.c(182737286098539567L).get(this)));
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

      var10001 = com.c.f();
      var10003 = com.c.d(433046742012662407L);
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





