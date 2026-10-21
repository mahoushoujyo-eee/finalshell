import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

class kt_4 implements Runnable {
   final Socket F;
   final Wh_2 f;

   kt_4(Wh_2 var1, Socket var2) {
      this.f = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      int var1 = ((ServerSocket)com.c.c(418793406764192211L).get(com.c.c(298501892220573627L).get(this))).getLocalPort();
      BS var2 = (BS)((HashMap)com.c.c(152539223357988449L).get(com.c.c(329223149633585311L).get(com.c.c(298501892220573627L).get(this)))).get(var1);
      if (var2 != null) {
         tb_4 var3 = new tb_4(
            (String)com.c.c(311768198477767120L).get(null),
            com.c.c(469230216286842026L).getInt(null),
            (String)com.c.c(611732392331370513L).get(var2),
            com.c.c(624294956745947517L).getInt(var2),
            null,
            com.c.c(258191693237450664L).getInt(null)
         );
         Object[] var10001 = com.c.a(com.c.c(192668626894744828L).get(this));
         Method var10003 = com.c.d(477058552633814652L);
         Object[] var10002 = var10001;
         tb_4 var5 = var3;
         Method var10000 = var10003;

         try {
            var10000.invoke(var5, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }
}





