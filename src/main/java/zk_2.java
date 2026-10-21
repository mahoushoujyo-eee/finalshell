import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class zk_2 implements Runnable {
   final gJ X;

   zk_2(gJ var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(156604263834063936L).get(com.c.c(350317579936282484L).get(this));
      Object[] var10001 = com.c.a(com.c.c(189389645615350517L).getInt(null), true);
      Method var10003 = com.c.d(547792367998174127L);
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





