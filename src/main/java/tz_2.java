/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from tz
 */
public class tz_2 {
    D8 T;
    boolean r = false;
    qm_0 d;
    private static final String a;

    tz_2(qm_0 qm_02) {
        this.d = qm_02;
        this.T = qm_02.j;
    }

    public int u(byte[] byArray, int n10, int n11) throws fg_1, InterruptedException {
        int n12;
        block4: {
            byte[] byArray2;
            block5: {
                byArray2 = null;
                ky_2[] ky_2Array = qm_0.J();
                byArray2 = this.h();
                try {
                    try {
                        n12 = n11;
                        if (ky_2Array == null) break block4;
                        if (n12 >= byArray2.length) break block5;
                    }
                    catch (fg_1 fg_12) {
                        throw tz_2.a(fg_12);
                    }
                    throw new fg_1(a);
                }
                catch (fg_1 fg_13) {
                    throw tz_2.a(fg_13);
                }
            }
            System.arraycopy(byArray2, 0, byArray, n10, byArray2.length);
            n12 = byArray2.length;
        }
        return n12;
    }

    public byte[] h() throws fg_1, InterruptedException {
        return this.T.e();
    }

    public void X() {
        block3: {
            tz_2 tz_22;
            block2: {
                ky_2[] ky_2Array = qm_0.J();
                tz_22 = this;
                if (ky_2Array == null) break block2;
                if (tz_22.r) break block3;
                tz_22 = this;
            }
            tz_22.T.g();
        }
    }

    private static fg_1 a(fg_1 fg_12) {
        return fg_12;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0001s\u0012\u0010$.".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 126;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 26;
                        case 1 -> 127;
                        case 2 -> 30;
                        case 3 -> 1;
                        case 4 -> 40;
                        case 5 -> 101;
                        default -> 88;
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
    }
}

