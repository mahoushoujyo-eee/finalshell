/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Renamed from fH
 */
class fh_1
implements Runnable {
    final dx_1 h;
    private static final long a;

    fh_1(dx_1 dx_12) {
        this.h = dx_12;
    }

    @Override
    public void run() {
        try {
            gH gH2;
            InetAddress inetAddress = InetAddress.getByName(this.h.B);
            try {
                gH2 = (gH)xQ.x.V((Object)new qt_0(this, inetAddress), (int)a);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.h.G = gH2;
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
    }

    static dx_1 P(fh_1 fh_12) {
        return fh_12.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3148035430290545526L;
        a = 0xCB2FD537ACFD89EL ^ l2;
    }
}

