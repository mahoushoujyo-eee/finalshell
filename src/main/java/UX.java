import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UX implements Runnable {
   private static final long a;

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }

         Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new Jw_2(this));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      }
   }

   static {
      long var0 = 8196352957545191836L;
      long var10002 = 8196352957545189924L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





