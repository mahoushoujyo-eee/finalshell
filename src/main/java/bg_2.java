/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bg
 */
public class bg_2
extends bn_1 {
    private static Exception L;
    private static Thread f;
    private static Thread O;
    private static final String a;
    private static final long b;

    /*
     * Loose catch block
     */
    static void T() throws Exception {
        int n10 = bn_1.Z();
        try {
            block12: {
                Exception exception;
                block11: {
                    bg_2.r(a);
                    bg_2.m();
                    f = new Thread(new z4());
                    O = new Thread(new ck_1());
                    f.start();
                    O.start();
                    do {
                        int n11;
                        block10: {
                            block14: {
                                if (f.isAlive()) break block14;
                                n11 = O.isAlive() ? 1 : 0;
                                if (n10 == 0) break block10;
                                try {
                                    block15: {
                                        if (n10 == 0) break block10;
                                        break block15;
                                        catch (Exception exception2) {
                                            throw bg_2.a(exception2);
                                        }
                                    }
                                    if (n11 == 0) break;
                                }
                                catch (Exception exception3) {
                                    throw bg_2.a(exception3);
                                }
                            }
                            n11 = (int)b;
                        }
                        bg_2.D(n11);
                    } while (n10 != 0);
                    try {
                        exception = L;
                        if (n10 == 0) break block11;
                        if (exception == null) break block12;
                    }
                    catch (Exception exception4) {
                        throw bg_2.a(exception4);
                    }
                    exception = L;
                }
                throw exception;
            }
            bg_2.i();
        }
        finally {
            bg_2.Y();
        }
    }

    static Exception D() {
        return L;
    }

    static Exception t(Exception exception) {
        L = exception;
        return L;
    }

    static Thread b() {
        return f;
    }

    static Thread Y() {
        return O;
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
                char[] cArray3 = "F9H::-\u00002(R#jbXf".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 110;
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
                            n17 = 124;
                            break;
                        }
                        case 1: {
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 85;
                            break;
                        }
                        case 3: {
                            n17 = 32;
                            break;
                        }
                        case 4: {
                            n17 = 97;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 67;
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
        long l2 = 8713189916433717069L;
        b = 0x458A58F6858C1729L ^ l2;
        L = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

