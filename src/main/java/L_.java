import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class L_ implements Runnable {
   final Tv_2 U;
   private static final long a;

   L_(Tv_2 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(a);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }

         Method var10000 = (Method)com.c.c(312739476035184007L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(413561020881451532L);
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
      long var0 = 8467135376623373278L;
      long var10002 = 8467135376623372342L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





