/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/*
 * Renamed from Ox
 */
public class ox_0
implements X509TrustManager {
    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}

