import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class Ox_2 implements X509TrustManager {
   @Override
   public void checkClientTrusted(X509Certificate[] var1, String var2) throws CertificateException {
   }

   @Override
   public void checkServerTrusted(X509Certificate[] var1, String var2) throws CertificateException {
   }

   @Override
   public X509Certificate[] getAcceptedIssuers() {
      return null;
   }
}





