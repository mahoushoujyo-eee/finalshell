/*
 * Decompiled with CFR 0.152.
 */
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

class WP
implements HostnameVerifier {
    WP() {
    }

    @Override
    public boolean verify(String string, SSLSession sSLSession) {
        return true;
    }
}

