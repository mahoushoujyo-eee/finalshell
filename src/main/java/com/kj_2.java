/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.kj
 */
public class kj_2 {
    public BufferedImage W;
    public int p;
    private static ky_2[] P;

    public kj_2(BufferedImage bufferedImage, int n10) {
        this.W = bufferedImage;
        this.p = n10;
    }

    public static void C(ky_2[] ky_2Array) {
        P = ky_2Array;
    }

    public static ky_2[] d() {
        return P;
    }

    static {
        if (kj_2.d() == null) {
            kj_2.C(new ky_2[4]);
        }
    }
}

