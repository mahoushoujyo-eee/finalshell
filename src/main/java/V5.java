import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

class V5 extends SystemDefaultDnsResolver {
   @Override
   public InetAddress[] resolve(String var1) throws UnknownHostException {
      try {
         if (var1.equals((String)com.c.c(381524296324133692L).get(null))) {
            return super.resolve((String)com.c.c(434787546011183607L).get(null));
         }
      } catch (UnknownHostException var2) {
         throw a(var2);
      }

      return super.resolve(var1);
   }

   private static UnknownHostException a(UnknownHostException var0) {
      return var0;
   }
}





