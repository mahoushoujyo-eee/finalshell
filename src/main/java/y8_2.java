import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class y8_2 implements Runnable {
   final Yf_2 R;

   y8_2(Yf_2 var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(199832172921665052L).get(null);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(283087596964075372L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(246170643685295638L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(258495433430833129L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(483594750475642076L);
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





