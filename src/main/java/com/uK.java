/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.ky_2;
import com.oc_0;
import com.uT;
import com.yn_2;
import com.zS;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class uK
extends uT {
    private final int l;
    private final List k;
    private final yn_2 H;
    private final Object F;
    private final Map A;
    private final Collection t;

    public uK(yn_2 yn_22, List list, int n10) {
        super(null, null);
        this.H = yn_22;
        this.l = n10;
        this.k = list;
        this.F = null;
        this.A = null;
        this.t = null;
    }

    public uK(Map map, Object object) {
        super(null, null);
        this.H = null;
        this.l = -1;
        this.k = null;
        this.F = object;
        this.A = map;
        this.t = null;
    }

    public uK(Collection collection) {
        super(null, null);
        this.H = null;
        this.l = -1;
        this.k = null;
        this.F = null;
        this.A = null;
        this.t = collection;
    }

    @Override
    public void D(Object object, Object object2) {
        block8: {
            Object object3;
            Object object4;
            block12: {
                Object object5;
                block10: {
                    block11: {
                        int n10;
                        Object object6;
                        oc_0 oc_02;
                        ky_2[] ky_2Array;
                        block9: {
                            List list;
                            block7: {
                                ky_2Array = zS.p();
                                uK uK2 = this;
                                if (ky_2Array == null) {
                                    if (uK2.A != null) {
                                        this.A.put(this.F, object2);
                                        return;
                                    }
                                    uK2 = this;
                                }
                                Object object7 = uK2.t;
                                if (ky_2Array == null) {
                                    if (object7 != null) {
                                        this.t.add(object2);
                                        return;
                                    }
                                    object7 = this.k.set(this.l, object2);
                                }
                                list = this.k;
                                if (ky_2Array != null) break block7;
                                if (!(list instanceof oc_0)) break block8;
                                list = this.k;
                            }
                            oc_02 = (oc_0)list;
                            object6 = object4 = oc_02.U();
                            if (ky_2Array != null) break block9;
                            if (object6 == null) break block8;
                            object6 = object4;
                        }
                        if ((n10 = Array.getLength(object6)) <= this.l) break block8;
                        object5 = oc_02.v();
                        if (ky_2Array != null) break block10;
                        if (object5 == null) break block11;
                        object3 = B8.I(object2, oc_02.v(), this.H.L());
                        if (ky_2Array == null) break block12;
                    }
                    object5 = object2;
                }
                object3 = object5;
            }
            Array.set(object4, this.l, object3);
        }
    }

    @Override
    public void y(yn_2 yn_22, Object object, Type type, Map map) {
    }
}

