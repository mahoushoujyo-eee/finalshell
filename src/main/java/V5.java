/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.hc.client5.http.SystemDefaultDnsResolver;

class V5
extends SystemDefaultDnsResolver {
    V5() {
    }

    @Override
    public InetAddress[] resolve(String string) throws UnknownHostException {
        try {
            if (string.equals((String)bh_2.D)) {
                return super.resolve((String)bh_2.V);
            }
        }
        catch (UnknownHostException unknownHostException) {
            throw V5.a(unknownHostException);
        }
        return super.resolve(string);
    }

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }
}

