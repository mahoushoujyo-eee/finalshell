/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KH;
import com.XS;
import com.ky_2;
import com.ru_0;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@XStreamAlias(value="style")
@XStreamConverter(value=ru_0.class)
public final class BN
implements Serializable {
    private KH i;
    private String R;
    private String n;
    private Map B;
    private Map w;
    private List p;
    private static ky_2[] K;

    public KH j() {
        return this.i;
    }

    public void H(KH kH) {
        this.i = kH;
    }

    public String H() {
        return this.R;
    }

    public void A(String string) {
        this.R = string;
    }

    public String E() {
        return this.n;
    }

    public void o(String string) {
        this.n = string;
    }

    public Map G() {
        return this.B;
    }

    public void K(Map map) {
        this.B = map;
    }

    public Map Y() {
        return this.w;
    }

    public void T(Map map) {
        this.w = map;
    }

    public List X() {
        return this.p;
    }

    public void Y(List list) {
        this.p = list;
    }

    public XS T() {
        ky_2[] ky_2Array = BN.A();
        List list = this.p;
        if (ky_2Array != null) {
            if (list.size() == 1) {
                return (XS)this.p.get(0);
            }
            list = this.p;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            block7: {
                XS xS2;
                block6: {
                    XS xS3;
                    xS2 = xS3 = (XS)iterator.next();
                    if (ky_2Array == null) break block6;
                    if (!xS2.p()) break block7;
                    xS2 = xS3;
                }
                return xS2;
            }
            if (ky_2Array != null) continue;
        }
        return null;
    }

    public static void k(ky_2[] ky_2Array) {
        K = ky_2Array;
    }

    public static ky_2[] A() {
        return K;
    }

    static {
        if (BN.A() == null) {
            BN.k(new ky_2[1]);
        }
    }
}

