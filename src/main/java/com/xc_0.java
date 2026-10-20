/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.j_0;
import com.xv_1;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Renamed from com.Xc
 */
class xc_0
implements xv_1 {
    private static int v;
    private SortedSet a = new TreeSet();
    private int C;
    private int M;
    private static final long[] b;
    private static final Integer[] c;

    public xc_0(int n10) {
        this(n10, v);
    }

    public xc_0(int n10, int n11) {
        this.C = n10;
        this.M = n11;
        this.o(n10, n11);
    }

    private void o(int n10, int n11) {
        boolean bl = j_0.g();
        for (int i2 = n11; i2 < n10; i2 += n11) {
            this.a.add(i2);
            if (bl) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void K(int n10) {
        block10: {
            boolean bl;
            block9: {
                int n11;
                int n12;
                block8: {
                    bl = j_0.P();
                    n12 = n10;
                    n11 = this.C;
                    if (bl) break block8;
                    if (n12 <= n11) break block9;
                    n12 = this.M;
                    n11 = this.C / this.M;
                }
                int n13 = n12 * n11;
                while (n13 < n10) {
                    if (bl) return;
                    int n14 = n13;
                    int n15 = this.C;
                    if (!bl) {
                        if (n14 >= n15) {
                            this.a.add(n13);
                        }
                        n14 = n13;
                        n15 = this.M;
                    }
                    n13 = n14 + n15;
                    if (!bl) continue;
                }
                if (!bl) break block10;
            }
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                int n16 = (Integer)iterator.next();
                if (bl) return;
                if (n16 > n10) {
                    iterator.remove();
                }
                if (!bl) continue;
            }
        }
        this.C = n10;
    }

    @Override
    public void c(int n10) {
        this.a.remove(n10);
    }

    @Override
    public void n() {
        this.a.clear();
    }

    @Override
    public int r(int n10) {
        return this.U(n10) - n10;
    }

    @Override
    public int M(int n10) {
        return n10 - this.G(n10);
    }

    @Override
    public int U(int n10) {
        int n11 = xc_0.a(18622, 6774740100010319664L);
        boolean bl = j_0.P();
        SortedSet<Integer> sortedSet = this.a.tailSet(n10 + 1);
        int n12 = sortedSet.isEmpty();
        if (!bl) {
            if (n12 == 0) {
                n11 = sortedSet.first();
            }
            n12 = Math.min(n11, this.C - 1);
        }
        return n12;
    }

    @Override
    public int G(int n10) {
        int n11 = 0;
        boolean bl = j_0.g();
        SortedSet<Integer> sortedSet = this.a.headSet(n10);
        int n12 = sortedSet.isEmpty();
        if (bl) {
            if (n12 == 0) {
                n11 = sortedSet.last();
            }
            n12 = Math.max(0, n11);
        }
        return n12;
    }

    @Override
    public void h(int n10) {
        this.a.add(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5043970017563678638L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0087\u009f\u00b7g\u00f6q\u000b!C\u00bb\u00a9\u0087\u00af\u00d0\u00f7a";
        int n11 = "\u0087\u009f\u00b7g\u00f6q\u000b!C\u00bb\u00a9\u0087\u00af\u00d0\u00f7a".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        b = lArray;
        c = new Integer[2];
        v = xc_0.a(19208, 4224967885537909895L);
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x578F;
        if (c[n11] == null) {
            xc_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

