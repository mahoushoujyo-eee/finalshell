/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Renamed from x
 */
public class x_0
extends y_0
implements Cloneable {
    String i;
    private static final long[] d;
    private static final Integer[] e;

    public x_0(y_0 y_02, String string, int n10, String string2) throws UnknownHostException {
        super(y_02, string, n10);
        this.i = new String(string2);
        this.w = x_0.b(15036, 6236850909096161465L);
    }

    public x_0(String string, int n10, String string2) throws UnknownHostException {
        this(null, string, n10, string2);
    }

    public x_0(y_0 y_02, InetAddress inetAddress, int n10, String string) {
        super(y_02, inetAddress, n10);
        this.i = new String(string);
        this.w = x_0.b(30218, 3849814687758711822L);
    }

    public x_0(InetAddress inetAddress, int n10, String string) {
        this(null, inetAddress, n10, string);
    }

    public Object clone() {
        x_0 x_02 = new x_0(this.v, this.k, this.i);
        x_02.s = (TR)this.s.clone();
        x_02.T = this.T;
        return x_02;
    }

    @Override
    protected y_0 B() {
        x_0 x_02 = new x_0(this.v, this.k, this.i);
        x_02.s = this.s;
        x_02.T = this.T;
        return x_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected jk_0 k(int var1_1, InetAddress var2_2, int var3_3) {
        var4_4 = jk_0.Y();
        v0 = var1_1;
        if (var4_4 == null) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = var1_1 = 1;
lbl7:
                // 2 sources

                if (var4_4 != null) break;
            }
            case 2: {
                var1_1 = 2;
                if (var4_4 != null) break;
            }
            default: {
                return null;
            }
        }
        return new jo_0(var1_1, var2_2, var3_3, this.i);
    }

    @Override
    protected jk_0 Q(int n10, String string, int n11) throws UnknownHostException {
        return this.k(n10, InetAddress.getByName(string), n11);
    }

    @Override
    protected jk_0 o(InputStream inputStream) throws b5_0, IOException {
        return new jo_0(inputStream, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1948999304541795403L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "v\u0010^\u008e<B\bA\u00c1\u00e5\u00f7\u00df\u0007\r\u00c4\u00f6";
        int n11 = "v\u0010^\u008e<B\bA\u00c1\u00e5\u00f7\u00df\u0007\r\u00c4\u00f6".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        d = lArray;
        e = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xA04;
        if (e[n11] == null) {
            x_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

