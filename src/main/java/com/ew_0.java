/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Ew
 */
public final class ew_0
extends Enum {
    public static final ew_0 d;
    public static final ew_0 h;
    public static final ew_0 m;
    public static final ew_0 s;
    public static final ew_0 ms;
    private static final ew_0[] H;

    public static ew_0[] values() {
        return (ew_0[])H.clone();
    }

    public static ew_0 valueOf(String string) {
        return Enum.valueOf(ew_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ew_0() {
        void var2_-1;
        void var1_-1;
    }

    private static ew_0[] w() {
        return new ew_0[]{d, h, m, s, ms};
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
                char[] cArray3 = "[\u001e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 24;
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
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 46;
                            break;
                        }
                        case 1: {
                            n17 = 117;
                            break;
                        }
                        case 2: {
                            n17 = 88;
                            break;
                        }
                        case 3: {
                            n17 = 57;
                            break;
                        }
                        case 4: {
                            n17 = 117;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 94;
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
        String string = new String(cArray).intern();
        d = new ew_0("d", 0);
        h = new ew_0("h", 1);
        m = new ew_0("m", 2);
        s = new ew_0("s", 3);
        ms = new ew_0(string, 4);
        H = ew_0.w();
    }
}

