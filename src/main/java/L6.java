/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

public class L6 {
    public String W;
    long N;
    long F;
    long U;
    long l;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public L6(String string) {
        this.W = string;
        try {
            this.n();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void n() {
        String[] stringArray;
        String string = W2.F();
        String string2 = (String)this.W;
        if (string != null) {
            if (string2.equals("")) {
                return;
            }
            string2 = (String)this.W;
        }
        try {
            stringArray = (String[])lk_0.B(string2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        String string3 = stringArray2[0];
        String[] stringArray3 = string3.split(a);
        this.U = Long.parseLong(stringArray3[1]);
        this.l = Long.parseLong(stringArray3[3]);
        this.N = Long.parseLong(stringArray3[4]);
        this.F = Long.parseLong(stringArray3[2]) + Long.parseLong(stringArray3[3]) + Long.parseLong(stringArray3[4]) + Long.parseLong(stringArray3[L6.a(10588, 8385445159910840421L)]) + Long.parseLong(stringArray3[5]) + Long.parseLong(stringArray3[L6.a(10597, 237713707668478045L)]) + Long.parseLong(stringArray3[L6.a(24315, 5678749286017462208L)]);
    }

    public long x() {
        return this.N;
    }

    public void w(long l2) {
        this.N = l2;
    }

    public long M() {
        return this.F;
    }

    public void U(long l2) {
        this.F = l2;
    }

    public long Q() {
        return this.U;
    }

    public void c(long l2) {
        this.U = l2;
    }

    public long Y() {
        return this.l;
    }

    public void p(long l2) {
        this.l = l2;
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
                char[] cArray3 = "%\u0004\u001b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 72;
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
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 49;
                            break;
                        }
                        case 1: {
                            n17 = 63;
                            break;
                        }
                        case 2: {
                            n17 = 120;
                            break;
                        }
                        case 3: {
                            n17 = 125;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 27;
                            break;
                        }
                        default: {
                            n17 = 45;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
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
        long l2 = 6218767433551814329L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00fe\b\u00b5\u00b6\u00a1\u009e\u0086\u00daH\u00d0\u00acj\u00c6M\u0086\u00e3\u00ce#L\u009d \rqq";
        int n19 = "\u00fe\b\u00b5\u00b6\u00a1\u009e\u0086\u00daH\u00d0\u00acj\u00c6M\u0086\u00e3\u00ce#L\u009d \rqq".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3139;
        if (c[n11] == null) {
            L6.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

