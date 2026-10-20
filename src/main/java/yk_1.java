/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from yK
 */
class yk_1
implements fw_1 {
    final int[] M;
    private static final long[] a;
    private static final Integer[] b;

    yk_1(int[] nArray) {
        this.M = nArray;
    }

    /*
     * Loose catch block
     */
    @Override
    public void w(TX tX) {
        int n10 = bn_1.C();
        try {
            int n11;
            int n12;
            block21: {
                block22: {
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    n12 = tX.C();
                                    n11 = 3;
                                    if (n10 != 0) break block17;
                                    try {
                                        block24: {
                                            if (n12 != n11) break block18;
                                            break block24;
                                            catch (Exception exception) {
                                                throw yk_1.a(exception);
                                            }
                                        }
                                        this.M[3] = this.M[3] + 1;
                                    }
                                    catch (Exception exception) {
                                        throw yk_1.a(exception);
                                    }
                                }
                                n12 = tX.C();
                                n11 = 5;
                            }
                            if (n10 != 0) break block19;
                            try {
                                block25: {
                                    if (n12 != n11) break block20;
                                    break block25;
                                    catch (Exception exception) {
                                        throw yk_1.a(exception);
                                    }
                                }
                                this.M[5] = this.M[5] + 1;
                            }
                            catch (Exception exception) {
                                throw yk_1.a(exception);
                            }
                        }
                        n12 = tX.C();
                        n11 = yk_1.a(5446, 1453797078823476111L);
                    }
                    if (n10 != 0) break block21;
                    try {
                        block26: {
                            if (n12 != n11) break block22;
                            break block26;
                            catch (Exception exception) {
                                throw yk_1.a(exception);
                            }
                        }
                        int n13 = yk_1.a(22049, 6289867132438796521L);
                        this.M[n13] = this.M[n13] + 1;
                    }
                    catch (Exception exception) {
                        throw yk_1.a(exception);
                    }
                }
                n12 = tX.C();
                n11 = 4;
            }
            try {
                if (n12 == n11) {
                    this.M[4] = this.M[4] + 1;
                }
            }
            catch (Exception exception) {
                throw yk_1.a(exception);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1265709999880789886L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u008a\u00e0v\u00c4iK\u00c4\u00f7\u0002\f\u00af\u00e7\u0002\u00e6\u0087\u0091";
        int n11 = "\u008a\u00e0v\u00c4iK\u00c4\u00f7\u0002\f\u00af\u00e7\u0002\u00e6\u0087\u0091".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xEC9;
        if (b[n11] == null) {
            yk_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

