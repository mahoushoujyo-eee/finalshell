/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XM;
import com.ra_1;
import java.awt.image.ColorModel;

/*
 * Renamed from com.Ta
 */
class ta_0
extends XM {
    public ta_0(float f10, ColorModel colorModel, ColorModel colorModel2) {
        super(f10, colorModel, colorModel2);
    }

    @Override
    public void G(int[] nArray, int[] nArray2, float f10) {
        int n10 = nArray.length;
        String string = ra_1.c();
        for (int i2 = 0; i2 < n10; i2 += 4) {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block9: {
                int n19;
                block8: {
                    int n20 = nArray[i2];
                    n18 = nArray2[i2];
                    int n21 = nArray[i2 + 1];
                    n17 = nArray2[i2 + 1];
                    int n22 = nArray[i2 + 2];
                    n16 = nArray2[i2 + 2];
                    n15 = nArray[i2 + 3];
                    n14 = nArray2[i2 + 3];
                    int n23 = n13 = n18 - n20;
                    if (string == null) {
                        if (n23 < 0) {
                            n13 = 0;
                        }
                        n23 = n17 - n21;
                    }
                    int n24 = n12 = n23;
                    if (string == null) {
                        if (n24 < 0) {
                            n12 = 0;
                        }
                        n24 = n16 - n22;
                    }
                    n19 = n11 = n24;
                    if (string != null) break block8;
                    if (n19 >= 0) break block9;
                    n19 = 0;
                }
                n11 = n19;
            }
            float f11 = f10 * (float)n15 / 255.0f;
            float f12 = 1.0f - f11;
            nArray2[i2] = (int)(f11 * (float)n13 + f12 * (float)n18);
            nArray2[i2 + 1] = (int)(f11 * (float)n12 + f12 * (float)n17);
            nArray2[i2 + 2] = (int)(f11 * (float)n11 + f12 * (float)n16);
            nArray2[i2 + 3] = (int)((float)n15 * f10 + (float)n14 * f12);
            if (string == null) continue;
        }
    }
}

