/*
 * Decompiled with CFR 0.152.
 */
package org.s;

import com.ky_2;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.F.c;
import org.s.W;

/*
 * Renamed from org.s.K
 */
class k_0
extends Reader {
    private final Iterator W;
    private Reader m;
    final Iterable u;
    private static final long[] a;
    private static final Long[] b;

    k_0(Iterable iterable) {
        this.u = iterable;
        this.W = this.u.iterator();
        String string = org.s.W.v();
        this.m = org.s.W.c;
        if (ky_2.F() != null) {
            org.s.W.i("dninhc");
        }
    }

    @Override
    public void close() throws IOException {
        Iterator iterator = this.u.iterator();
        String string = org.s.W.v();
        while (iterator.hasNext()) {
            Reader reader = (Reader)iterator.next();
            reader.close();
            if (string != null) continue;
        }
    }

    @Override
    public int read() throws IOException {
        String string = org.s.W.v();
        while (true) {
            block12: {
                k_0 k_02;
                int n10;
                block11: {
                    block10: {
                        int n11 = this.m.read();
                        try {
                            try {
                                if (n11 == -1) break block10;
                                n10 = n11;
                                if (string == null) break block11;
                            }
                            catch (IOException iOException) {
                                throw k_0.a(iOException);
                            }
                            return n10;
                        }
                        catch (IOException iOException) {
                            throw k_0.a(iOException);
                        }
                    }
                    try {
                        k_02 = this;
                        if (string == null) break block12;
                        n10 = k_02.W.hasNext() ? 1 : 0;
                    }
                    catch (IOException iOException) {
                        throw k_0.a(iOException);
                    }
                }
                try {
                    if (n10 == 0) {
                        return -1;
                    }
                }
                catch (IOException iOException) {
                    throw k_0.a(iOException);
                }
                k_02 = this;
            }
            k_02.m = (Reader)this.W.next();
        }
    }

    @Override
    public long skip(long l2) throws IOException {
        String string = org.s.W.v();
        while (true) {
            block11: {
                k_0 k_02;
                block12: {
                    long l3;
                    block10: {
                        block9: {
                            long l4 = this.m.skip(l2);
                            try {
                                try {
                                    if (l4 == k_0.a(32332, 1496831238319552163L)) break block9;
                                    l3 = l4;
                                    if (string == null) break block10;
                                }
                                catch (IOException iOException) {
                                    throw k_0.a(iOException);
                                }
                                return l3;
                            }
                            catch (IOException iOException) {
                                throw k_0.a(iOException);
                            }
                        }
                        try {
                            try {
                                k_02 = this;
                                if (string == null) break block11;
                                if (k_02.W.hasNext()) break block12;
                            }
                            catch (IOException iOException) {
                                throw k_0.a(iOException);
                            }
                            l3 = 0L;
                        }
                        catch (IOException iOException) {
                            throw k_0.a(iOException);
                        }
                    }
                    return l3;
                }
                k_02 = this;
            }
            k_02.m = (Reader)this.W.next();
        }
    }

    @Override
    public int read(@c char[] cArray, int n10, int n11) throws IOException {
        String string = org.s.W.v();
        while (true) {
            block12: {
                k_0 k_02;
                int n12;
                block11: {
                    block10: {
                        int n13 = this.m.read(cArray, n10, n11);
                        try {
                            try {
                                if ((long)n13 == k_0.a(21786, 8359636198903094772L)) break block10;
                                n12 = n13;
                                if (string == null) break block11;
                            }
                            catch (IOException iOException) {
                                throw k_0.a(iOException);
                            }
                            return n12;
                        }
                        catch (IOException iOException) {
                            throw k_0.a(iOException);
                        }
                    }
                    try {
                        k_02 = this;
                        if (string == null) break block12;
                        n12 = k_02.W.hasNext() ? 1 : 0;
                    }
                    catch (IOException iOException) {
                        throw k_0.a(iOException);
                    }
                }
                try {
                    if (n12 == 0) {
                        return -1;
                    }
                }
                catch (IOException iOException) {
                    throw k_0.a(iOException);
                }
                k_02 = this;
            }
            k_02.m = (Reader)this.W.next();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8780395618586326185L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0092\u00e0\u0014\u00a0>z\u00bd\u00f5\u00f2&\u00a0`q\u00d9\u0096\u00a2";
        int n11 = "\u0092\u00e0\u0014\u00a0>z\u00bd\u00f5\u00f2&\u00a0`q\u00d9\u0096\u00a2".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x48EF) & Short.MAX_VALUE;
        if (b[n11] == null) {
            k_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

