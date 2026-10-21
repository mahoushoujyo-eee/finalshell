import org.apache.hc.client5.http.ConnectionKeepAliveStrategy;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.util.TimeValue;

public class WV implements ConnectionKeepAliveStrategy {
   static TimeValue c;
   private static int X;

   @Override
   public TimeValue getKeepAliveDuration(HttpResponse var1, HttpContext var2) {
      return c;
   }

   static {
      if (U() != 0) {
         I(109);
      }

      long var2 = 2301325400745936582L;
      long var10002 = 2301325400745929894L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      c = TimeValue.ofMilliseconds(var0);
   }

   public static void I(int var0) {
      X = var0;
   }

   public static int G() {
      return X;
   }

   public static int U() {
      int var0 = G();
      return var0 == 0 ? 24 : 0;
   }
}





