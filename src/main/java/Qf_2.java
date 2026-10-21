import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Qf_2 implements Runnable {
   final Dt_2 O;

   Qf_2(Dt_2 var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(333047311854084958L).get(com.c.c(383580557368510690L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(280719233919219121L);
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





