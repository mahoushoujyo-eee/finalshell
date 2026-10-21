import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

class lJ_3 implements Runnable {
   final Socket t;
   final ga_2 I;

   lJ_3(ga_2 var1, Socket var2) {
      this.I = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(531809486992927708L).get(com.c.c(129013387913622757L).get(this));
      Object[] var10001 = com.c.a(com.c.c(422681488151755413L).get(this));
      Method var10003 = com.c.d(410208588171090910L);
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





