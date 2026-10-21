import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ue_2 extends Thread {
   final d8_2 k;
   private static final long a;

   Ue_2(d8_2 var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      while (true) {
         Method var10000 = (Method)com.c.c(204787616236471256L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(445643277824358917L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }
      }
   }

   static {
      long var0 = 2203987499599607839L;
      long var10002 = 2203987499599607853L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





