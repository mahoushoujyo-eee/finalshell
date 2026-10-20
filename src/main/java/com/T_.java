/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

class T_
extends XM {
    public T_(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11 = nArray[i2];
            int n12 = nArray2[i2];
            int n13 = nArray[i2 + 1];
            int n14 = nArray2[i2 + 1];
            int n15 = nArray[i2 + 2];
            int n16 = nArray2[i2 + 2];
            int n17 = nArray[i2 + 3];
            int n18 = nArray2[i2 + 3];
            int n19 = (n12 + n11) / 2;
            int n20 = (n14 + n13) / 2;
            int n21 = (n16 + n15) / 2;
            float f11 = f10 * (float)n17 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n19 + f12 * (float)n12);
            nArray2[i2 + 1] = (int)(f11 * (float)n20 + f12 * (float)n14);
            nArray2[i2 + 2] = (int)(f11 * (float)n21 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n17 * f10 + (float)n18 * f12);
            if (string == null) continue;
        }
    }
}

