/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.InetAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from Dl
 */
public class dl_0 {
    HashMap t = new HashMap();
    Thread W;
    la_1 e;
    int q = dl_0.a(24232, 5758382157581959059L);
    int o = dl_0.a(21290, 7845052718463431184L);
    Object y = new Object();
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    dl_0(la_1 la_12) {
        this.e = la_12;
        this.W = new p_0(this);
        this.W.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void D() {
        var2_1 = this.u();
        var1_2 = qm_0.J();
        var3_3 = System.currentTimeMillis();
        if (var1_2 != null) ** GOTO lbl30
        block3: while (true) {
            block7: {
                block9: {
                    block8: {
                        if ((var5_4 = (f9_0)this.t.get(var2_1.next())) == null) break block7;
                        cfr_temp_0 = var3_3 - var5_4.A() - (long)this.q;
                        v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        if (var1_2 == null) break block8;
                        if (v0 >= 0) break block9;
                        cfr_temp_1 = var3_3 - var5_4.Y() - (long)this.o;
                        v0 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                    }
                    if (var1_2 == null) ** GOTO lbl33
                    if (v0 <= 0) break block7;
                    var5_4.I();
                    if (var1_2 != null) break block7;
                }
                var7_6 = String.valueOf(new Date());
                var8_7 = var5_4.p;
                var9_8 = var5_4.U.getHostAddress();
                lx_2.u(dl_0.a + var9_8 + ":" + var8_7 + " " + var7_6);
                var6_5 = this.y;
                synchronized (var6_5) {
                    var5_4.q();
                }
            }
            do {
                v0 = var2_1.hasNext();
lbl33:
                // 2 sources

                if (v0 != 0) continue block3;
            } while (var1_2 == null);
            break;
        }
    }

    void J(int n10) {
        this.t.remove(n10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Iterator u() {
        TQ tQ = null;
        Object object = this.y;
        synchronized (object) {
            tQ = new TQ(this.t.keySet().iterator());
        }
        return tQ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    f9_0 d(int n10, InetAddress inetAddress, int n11) {
        f9_0 f9_02 = (f9_0)this.t.get(n10);
        ky_2[] ky_2Array = qm_0.J();
        f9_0 f9_03 = f9_02;
        if (ky_2Array != null) {
            if (f9_03 == null) {
                f9_02 = new f9_0(this.e, n10, inetAddress, n11);
                Object object = this.y;
                synchronized (object) {
                    this.t.put(n10, f9_02);
                }
            }
            f9_03 = f9_02;
        }
        return f9_03;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\u8ddc\u65c9\u511e\u95b6;V=<Q\u0019{".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 67;
                        case 1 -> 37;
                        case 2 -> 119;
                        case 3 -> 65;
                        case 4 -> 66;
                        case 5 -> 32;
                        default -> 78;
                    })));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 3827733119428819545L;
        long[] lArray = new long[2];
        int n17 = 0;
        String string = "40\u00c0\u00f5\u00c9\u0013\u00da\u008au]S\u00a7\u001e\u00b4\u00cb\u00a1";
        int n18 = "40\u00c0\u00f5\u00c9\u0013\u00da\u008au]S\u00a7\u001e\u00b4\u00cb\u00a1".length();
        int n19 = 0;
        do {
            byte[] byArray = string.substring(n19, n19 += 8).getBytes("ISO-8859-1");
            int n20 = n17++;
            lArray[n20] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n19 < n18);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x613B;
        if (c[n11] == null) {
            dl_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

