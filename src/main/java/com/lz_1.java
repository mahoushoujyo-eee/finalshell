/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.K0;
import com.ky_2;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from com.lZ
 */
public class lz_1
extends AbstractMap
implements Serializable {
    private final Map w = new HashMap();
    private final Map R = new HashMap();
    private final ReferenceQueue B = new ReferenceQueue();
    private static int[] G;

    @Override
    public Object get(Object object) {
        SoftReference softReference;
        block6: {
            SoftReference softReference2;
            block5: {
                SoftReference softReference3;
                int[] nArray;
                SoftReference softReference4;
                block4: {
                    int[] nArray2 = lz_1.O();
                    this.L();
                    softReference2 = null;
                    softReference4 = (SoftReference)this.w.get(object);
                    nArray = nArray2;
                    softReference3 = softReference4;
                    if (nArray == null) break block4;
                    if (softReference3 == null) break block5;
                    softReference3 = softReference4.get();
                }
                softReference = softReference2 = softReference3;
                if (nArray == null) break block6;
                if (softReference == null) {
                    this.w.remove(object);
                    this.R.remove(softReference4);
                }
            }
            softReference = softReference2;
        }
        return softReference;
    }

    private void L() {
        Reference reference;
        int[] nArray = lz_1.O();
        while ((reference = this.B.poll()) != null) {
            this.w.remove(this.R.remove(reference));
            if (nArray != null) continue;
        }
    }

    @Override
    public Object put(Object object, Object object2) {
        int[] nArray = lz_1.O();
        this.L();
        SoftReference<Object> softReference = new SoftReference<Object>(object2, this.B);
        this.R.put(softReference, object);
        int[] nArray2 = nArray;
        SoftReference<Object> softReference2 = this.w.put(object, softReference);
        Object object3 = softReference2;
        if (nArray2 != null) {
            if (object3 == null) {
                return null;
            }
            object3 = softReference2.get();
        }
        if (nArray2 == null) {
            ky_2.K(new String[5]);
        }
        return object3;
    }

    @Override
    public Object remove(Object object) {
        SoftReference softReference;
        int[] nArray = lz_1.O();
        this.L();
        int[] nArray2 = nArray;
        SoftReference softReference2 = softReference = (SoftReference)this.w.remove(object);
        if (nArray2 != null) {
            if (softReference2 == null) {
                return null;
            }
            softReference2 = softReference.get();
        }
        return softReference2;
    }

    @Override
    public void clear() {
        this.w.clear();
        this.R.clear();
    }

    @Override
    public int size() {
        this.L();
        return this.w.size();
    }

    @Override
    public Set entrySet() {
        int[] nArray = lz_1.O();
        this.L();
        int[] nArray2 = nArray;
        LinkedHashSet<K0> linkedHashSet = new LinkedHashSet<K0>();
        for (Map.Entry entry : this.w.entrySet()) {
            Object t2 = ((SoftReference)entry.getValue()).get();
            if (t2 != null) {
                linkedHashSet.add(new K0(this, entry, t2));
            }
            if (nArray2 != null) continue;
        }
        if (ky_2.F() != null) {
            lz_1.F(new int[5]);
        }
        return linkedHashSet;
    }

    static ReferenceQueue n(lz_1 lz_12) {
        return lz_12.B;
    }

    public static void F(int[] nArray) {
        G = nArray;
    }

    public static int[] O() {
        return G;
    }

    static {
        if (lz_1.O() == null) {
            lz_1.F(new int[1]);
        }
    }
}

