import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;

class gU implements Runnable {
   final String y;
   final F5 q;

   gU(F5 var1, String var2) {
      this.q = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      try {
         InetAddress var2 = InetAddress.getByName((String)com.c.c(354017514645348159L).get(this));
         Method var10000 = (Method)com.c.c(474524358810565567L).get(com.c.c(358155008855524918L).get(this));
         Object[] var10001 = com.c.a(var2.getHostAddress());
         Method var10003 = com.c.d(484159971549207596L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         Object[] var8 = com.c.a(var2.getHostAddress());
         var10000 = com.c.d(310988506867275920L);
         var10002 = var8;
         var10001 = null;

         try {
            var10 = (String)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         String var1 = var10;
         var10000 = (Method)com.c.c(474524358810565567L).get(com.c.c(358155008855524918L).get(this));
         var10001 = com.c.a(var1);
         var10003 = com.c.d(550424599682494568L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } catch (UnknownHostException var6) {
         var6.printStackTrace();
      }
   }
}





