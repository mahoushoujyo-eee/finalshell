/*
 * Decompiled with CFR 0.152.
 */
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

class YF
implements HostnameVerifier {
    YF() {
    }

    @Override
    public boolean verify(String string, SSLSession sSLSession) {
        return true;
    }
}

