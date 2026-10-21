import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class dU_3 implements Runnable {
   final yJ_3 o;

   dU_3(yJ_3 var1) {
      this.o = var1;
   }

   @Override
   public void run() {
      int[] var1 = a3.I();
      Wx_2 var10000 = (Wx_2)com.c.c(239395089633094126L).get(com.c.c(605613512724604290L).get(this));
      if (var1 != null) {
         if ((tf_4)com.c.c(515525013030853953L).get(var10000) == null) {
            return;
         }

         var10000 = (Wx_2)com.c.c(239395089633094126L).get(com.c.c(605613512724604290L).get(this));
      }

      var10000 = (Wx_2)com.c.c(305402254993059552L).get(var10000);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(346382751221538814L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var5 = var10003;

      try {
         var10000 = (Wx_2)var5.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(com.c.c(515525013030853953L).get(com.c.c(239395089633094126L).get(com.c.c(605613512724604290L).get(this))));
      var10003 = com.c.d(191479498782345680L);
      var10002 = var10001;
      var10001 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





