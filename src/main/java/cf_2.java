/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cf
 */
public class cf_2 {
    Object f = new Object();
    int z;
    long T = 0L;
    long u = 0L;
    Object W = new Object();
    long Y;
    long I;
    private static final long[] a;
    private static final Long[] b;

    public cf_2(int n10) {
        this.z = n10;
    }

    /*
     * Loose catch block
     */
    public synchronized void V(long l2, int n10) {
        block25: {
            block27: {
                long l3;
                block30: {
                    block31: {
                        long l4;
                        long l5;
                        long l6;
                        long l7;
                        String[] stringArray;
                        block28: {
                            block29: {
                                long l8;
                                block34: {
                                    long l9;
                                    long l10;
                                    block26: {
                                        long l11;
                                        block24: {
                                            long l12;
                                            block22: {
                                                block23: {
                                                    stringArray = QI.N();
                                                    long l13 = this.T - 0L;
                                                    l12 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                                                    if (stringArray == null) break block22;
                                                    try {
                                                        block32: {
                                                            if (l12 != false) break block23;
                                                            break block32;
                                                            catch (InterruptedException interruptedException) {
                                                                throw cf_2.a(interruptedException);
                                                            }
                                                        }
                                                        this.u = l2;
                                                    }
                                                    catch (InterruptedException interruptedException) {
                                                        throw cf_2.a(interruptedException);
                                                    }
                                                }
                                                try {
                                                    this.T += (long)n10;
                                                    l11 = this.T;
                                                    if (stringArray == null) break block24;
                                                    long l14 = l11 - cf_2.a(11877, 6820222292677765034L);
                                                    l12 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                                }
                                                catch (InterruptedException interruptedException) {
                                                    throw cf_2.a(interruptedException);
                                                }
                                            }
                                            try {
                                                if (l12 <= 0) break block25;
                                                l11 = (long)(1.0E9f * (float)this.T / (float)this.z);
                                            }
                                            catch (InterruptedException interruptedException) {
                                                throw cf_2.a(interruptedException);
                                            }
                                        }
                                        l7 = l11;
                                        long l15 = System.nanoTime() - this.u;
                                        l10 = l15;
                                        l9 = l7;
                                        if (stringArray == null) break block26;
                                        try {
                                            block33: {
                                                if (l10 >= l9) break block27;
                                                break block33;
                                                catch (InterruptedException interruptedException) {
                                                    throw cf_2.a(interruptedException);
                                                }
                                            }
                                            l10 = l7;
                                            l9 = l15;
                                        }
                                        catch (InterruptedException interruptedException) {
                                            throw cf_2.a(interruptedException);
                                        }
                                    }
                                    l6 = l10 - l9;
                                    this.Y += l6;
                                    l8 = this.I - this.Y;
                                    l5 = l8;
                                    l4 = 0L;
                                    if (stringArray == null) break block28;
                                    if (l5 <= l4) break block29;
                                    break block34;
                                    catch (InterruptedException interruptedException) {
                                        throw cf_2.a(interruptedException);
                                    }
                                }
                                try {
                                    block35: {
                                        l5 = l6;
                                        l4 = l8;
                                        if (stringArray == null) break block28;
                                        break block35;
                                        catch (InterruptedException interruptedException) {
                                            throw cf_2.a(interruptedException);
                                        }
                                    }
                                    if (l5 > l4) break block29;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw cf_2.a(interruptedException);
                                }
                                l6 = 0L;
                                this.I -= l6;
                            }
                            l5 = l7;
                            l4 = cf_2.a(26313, 6796033583056940805L);
                        }
                        long l16 = l5 / l4;
                        int n11 = (int)(l7 % cf_2.a(22179, 422734991612010349L));
                        long l17 = System.nanoTime();
                        try {
                            l3 = l6;
                            if (stringArray == null) break block30;
                            if (l3 <= 0L) break block31;
                        }
                        catch (InterruptedException interruptedException) {
                            throw cf_2.a(interruptedException);
                        }
                        try {
                            Thread.sleep(l16, n11);
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        this.I += System.nanoTime() - l17;
                    }
                    l3 = System.nanoTime();
                }
                long l18 = l3;
            }
            this.T = 0L;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6718733727889700929L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "X\u00e0g\u0086Vk%l\u0003\u009b\u00f0\u00b0#\u000f7\u00eb\u0003m\u00e03\b\u00f9\u0095\u0004";
        int n11 = "X\u00e0g\u0086Vk%l\u0003\u009b\u00f0\u00b0#\u000f7\u00eb\u0003m\u00e03\b\u00f9\u0095\u0004".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[3];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x9CE) & Short.MAX_VALUE;
        if (b[n11] == null) {
            cf_2.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

