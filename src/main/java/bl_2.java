/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bl
 */
public class bl_2
extends bn_1 {
    private static Exception T;
    private static Thread M;
    private static Thread g;
    private static final String a;
    private static final long b;

    /*
     * Loose catch block
     */
    static void H() throws Exception {
        int n10 = bn_1.C();
        try {
            block12: {
                Exception exception;
                block11: {
                    bl_2.r(a);
                    bl_2.m();
                    M = new Thread(new oh_0());
                    g = new Thread(new fo_1());
                    M.start();
                    g.start();
                    do {
                        int n11;
                        block10: {
                            block14: {
                                if (M.isAlive()) break block14;
                                n11 = g.isAlive() ? 1 : 0;
                                if (n10 != 0) break block10;
                                try {
                                    block15: {
                                        if (n10 != 0) break block10;
                                        break block15;
                                        catch (Exception exception2) {
                                            throw bl_2.a(exception2);
                                        }
                                    }
                                    if (n11 == 0) break;
                                }
                                catch (Exception exception3) {
                                    throw bl_2.a(exception3);
                                }
                            }
                            n11 = (int)b;
                        }
                        bl_2.D(n11);
                    } while (n10 == 0);
                    try {
                        exception = T;
                        if (n10 != 0) break block11;
                        if (exception == null) break block12;
                    }
                    catch (Exception exception4) {
                        throw bl_2.a(exception4);
                    }
                    exception = T;
                }
                throw exception;
            }
            bl_2.i();
        }
        finally {
            bl_2.Y();
        }
    }

    static Exception J() {
        return T;
    }

    static Exception g(Exception exception) {
        T = exception;
        return T;
    }

    static Thread x() {
        return M;
    }

    static Thread d() {
        return g;
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
                char[] cArray3 = "\u0005-I1>=/q!T!o{k?!N *\u007fn>+Q,dz".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 84;
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
                            n17 = 5;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 110;
                            break;
                        }
                        case 3: {
                            n17 = 17;
                            break;
                        }
                        case 4: {
                            n17 = 94;
                            break;
                        }
                        case 5: {
                            n17 = 73;
                            break;
                        }
                        default: {
                            n17 = 86;
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
        long l2 = 1138809120032891513L;
        b = 0xED2E51996A89221DL ^ l2;
        T = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

