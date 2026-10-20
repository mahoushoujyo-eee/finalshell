/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Iterator;
import org.F.c;
import org.I;
import org.l.Y;
import org.v.NV;
import org.v.RG;
import org.v._w_0;
import org.v.nl_0;

/*
 * Renamed from org.v.Ne
 */
public final class ne_0
extends nl_0 {
    public final NV R;
    public final String A;
    public final NV k;
    private static final long[] a;
    private static final Integer[] d;

    public ne_0(I i2, NV nV2, String string, NV nV3) {
        super(i2);
        this.R = nV2;
        this.A = string;
        this.k = nV3;
    }

    @Override
    public String toString() {
        return this.R.toString() + (char)ne_0.a(12294, 2811603802152820739L) + this.A + (char)ne_0.a(29887, 7963919704743945403L) + this.k.toString();
    }

    public Iterator d() {
        ArrayList<NV> arrayList = new ArrayList<NV>();
        ne_0 ne_02 = this;
        String[] stringArray = RG.C();
        do {
            NV nV2;
            block3: {
                block4: {
                    arrayList.add(ne_02.k);
                    nV2 = ne_02.R;
                    if (!(nV2 instanceof ne_0)) break block3;
                    ne_0 ne_03 = (ne_0)nV2;
                    if (stringArray == null) break block4;
                    if (ne_03.A != this.A) break block3;
                    ne_03 = ne_02 = (ne_0)nV2;
                }
                if (stringArray != null) continue;
            }
            arrayList.add(nV2);
            if (stringArray != null) break;
        } while (stringArray != null);
        return new Y(arrayList.listIterator(arrayList.size()));
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.w(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7848386413696895385L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0091%\u0095x\u0084\u0098\u00ed\u0002\u00cc\u00f0x \u00ac\u0013)\u00ba";
        int n11 = "\u0091%\u0095x\u0084\u0098\u00ed\u0002\u00cc\u00f0x \u00ac\u0013)\u00ba".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        d = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5004;
        if (d[n11] == null) {
            ne_0.d[n11] = (int)(a[n11] ^ l2);
        }
        return d[n11];
    }
}

