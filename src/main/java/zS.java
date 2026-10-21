import com.ne_4;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class zS implements Runnable {
   final KQ l;

   zS(KQ var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(144581259712304790L).get(com.c.c(337673702137830950L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(150976763033464620L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var3 = (ne_4)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var3.requestFocus();
   }
}





