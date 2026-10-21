import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class mz_2 implements Runnable {
   final U N;

   mz_2(U var1) {
      this.N = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(493158471773442262L).get(com.c.c(144829688074724944L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(194560825135347400L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(424156930953488367L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var8 = (F8)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      F8 var1 = var8;
      if (var1.getClass().equals(CL.class)) {
         var10000 = (Method)com.c.c(144829688074724944L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(449998053918244409L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }
}





