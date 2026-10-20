/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

/*
 * Renamed from dX
 */
public class dx_1
implements Q0 {
    short K = dx_1.I();
    yu_0 P = new yu_0();
    String B;
    Q0 F;
    boolean S = true;
    int A;
    boolean w = false;
    gH G;
    private static final long[] a;
    private static final Integer[] b;

    public dx_1(String string) {
        this.B = string;
    }

    public void C() throws UnknownHostException, PcapNativeException, NotOpenException {
        ((ThreadPoolExecutor)yd_2.h).execute(new fh_1(this));
    }

    public void v() {
        String[] stringArray = xQ.B();
        this.P.C().clear();
        String[] stringArray2 = stringArray;
        dx_1 dx_12 = this;
        if (stringArray2 != null) {
            if (dx_12.G != null) {
                try {
                    this.G.Z();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            dx_12 = this;
        }
        dx_12.F = null;
    }

    static short I() {
        short s2;
        int n10 = dx_1.a(20338, 4574849776412187L);
        int n11 = dx_1.a(9255, 3454409876788809039L);
        String[] stringArray = xQ.B();
        short s3 = s2 = (short)new Random().nextInt(n11);
        if (stringArray != null) {
            if (s3 < n10) {
                s2 = (short)(s2 + n10);
            }
            s3 = s2;
        }
        return s3;
    }

    @Override
    public void a(B0 b0) {
        block3: {
            Q0 q0;
            block2: {
                String[] stringArray = xQ.B();
                q0 = this.F;
                if (stringArray == null) break block2;
                if (q0 == null) break block3;
                q0 = this.F;
            }
            q0.a(b0);
        }
    }

    public Q0 i() {
        return this.F;
    }

    public void j(Q0 q0) {
        this.F = q0;
    }

    public yu_0 n() {
        return this.P;
    }

    public void C(yu_0 yu_02) {
        this.P = yu_02;
    }

    public boolean R() {
        return this.w;
    }

    public void O(boolean bl) {
        this.w = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3506461730338835122L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "nM\u00b6\u00ba\u0091\u00c0{\u00ea\u001f.\u00b1\u00af\u00a8\u008b\u00efA";
        int n11 = "nM\u00b6\u00ba\u0091\u00c0{\u00ea\u001f.\u00b1\u00af\u00a8\u008b\u00efA".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2968;
        if (b[n11] == null) {
            dx_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

