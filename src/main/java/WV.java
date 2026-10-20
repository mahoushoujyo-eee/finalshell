/*
 * Decompiled with CFR 0.152.
 */
import org.apache.hc.client5.http.ConnectionKeepAliveStrategy;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.util.TimeValue;

public class WV
implements ConnectionKeepAliveStrategy {
    static TimeValue c;
    private static int X;

    @Override
    public TimeValue getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (WV.U() != 0) {
            WV.I(109);
        }
        long l2 = 2301325400745936582L;
        long l3 = 0x1FEFF342500B6CA6L ^ l2;
        c = TimeValue.ofMilliseconds(l3);
    }

    public static void I(int n10) {
        X = n10;
    }

    public static int G() {
        return X;
    }

    public static int U() {
        int n10 = WV.G();
        if (n10 == 0) {
            return 24;
        }
        return 0;
    }
}

