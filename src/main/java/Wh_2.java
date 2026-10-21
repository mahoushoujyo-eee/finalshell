import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

class Wh_2 implements Runnable {
   final ServerSocket s;
   final Ta_2 t;

   Wh_2(Ta_2 var1, ServerSocket var2) {
      this.t = var1;
      this.s = var2;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = ((ServerSocket)com.c.c(418793406764192211L).get(this)).accept();
            Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
            Object[] var10001 = com.c.a(new kt_4(this, var1));
            Method var10003 = com.c.d(434592463220957006L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            var10000 = var10003;

            try {
               var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var2) {
               throw var2.getTargetException();
            }
         } catch (IOException var3) {
            var3.printStackTrace();
            return;
         }
      }
   }
}





