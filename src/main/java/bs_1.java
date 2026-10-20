/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bS
 */
public class bs_1
extends bn_1 {
    private static Exception E;
    private static Thread c;
    private static Thread n;
    private static volatile long L;
    private static final String a;
    private static final long b;

    /*
     * Loose catch block
     */
    static void L() throws Exception {
        int n10 = bn_1.C();
        try {
            block12: {
                Exception exception;
                block11: {
                    bs_1.r(a);
                    bs_1.m();
                    c = new Thread(new kf_0());
                    n = new Thread(new tf_1());
                    c.start();
                    n.start();
                    do {
                        int n11;
                        block10: {
                            block14: {
                                if (c.isAlive()) break block14;
                                n11 = n.isAlive() ? 1 : 0;
                                if (n10 != 0) break block10;
                                try {
                                    block15: {
                                        if (n10 != 0) break block10;
                                        break block15;
                                        catch (Exception exception2) {
                                            throw bs_1.a(exception2);
                                        }
                                    }
                                    if (n11 == 0) break;
                                }
                                catch (Exception exception3) {
                                    throw bs_1.a(exception3);
                                }
                            }
                            n11 = (int)b;
                        }
                        bs_1.D(n11);
                    } while (n10 == 0);
                    try {
                        exception = E;
                        if (n10 != 0) break block11;
                        if (exception == null) break block12;
                    }
                    catch (Exception exception4) {
                        throw bs_1.a(exception4);
                    }
                    exception = E;
                }
                throw exception;
            }
            bs_1.i();
        }
        finally {
            bs_1.Y();
        }
    }

    static long F() {
        return L;
    }

    static Exception m() {
        return E;
    }

    static Exception w(Exception exception) {
        E = exception;
        return E;
    }

    static Thread G() {
        return c;
    }

    static Thread D() {
        return n;
    }

    static long v(long l2) {
        L = l2;
        return L;
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
                char[] cArray3 = "I\u001e\u0013\u001f\u000e\u001bV=\u000f\b\u0019\\H\u0013r\u0017\u0004".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 52;
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
                            n17 = 41;
                            break;
                        }
                        case 1: {
                            n17 = 79;
                            break;
                        }
                        case 2: {
                            n17 = 84;
                            break;
                        }
                        case 3: {
                            n17 = 95;
                            break;
                        }
                        case 4: {
                            n17 = 13;
                            break;
                        }
                        case 5: {
                            n17 = 15;
                            break;
                        }
                        default: {
                            n17 = 79;
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
        long l2 = 6355311844809110400L;
        b = 0xCC860BBF72ADF3E4L ^ l2;
        E = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

