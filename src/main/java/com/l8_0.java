/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.zb_0;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.l8
 */
class l8_0 {
    private int U;
    private int E;
    private int S;
    private int[] Z;

    public l8_0(BufferedImage bufferedImage) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        this.Z = zb_0.Z(bufferedImage, 0, 0, n10, n11, null);
    }

    public int z(float f10, float f11) {
        int n10;
        int n11;
        int n12;
        int n13;
        float f12;
        float f13;
        block4: {
            int n14;
            int n15;
            int n16;
            block2: {
                block3: {
                    n16 = (int)Math.floor(f10);
                    String[] stringArray = W5.q();
                    n15 = (int)Math.floor(f11);
                    f13 = f10 - (float)n16;
                    f12 = f11 - (float)n15;
                    n14 = n16;
                    if (stringArray == null) break block2;
                    if (n14 < 0) break block3;
                    n14 = n16;
                    if (stringArray == null) break block2;
                    if (n14 >= this.E - 1) break block3;
                    n14 = n15;
                    if (stringArray == null) break block2;
                    if (n14 < 0) break block3;
                    n14 = n15;
                    if (stringArray == null) break block2;
                    if (n14 >= this.S - 1) break block3;
                    int n17 = this.E * n15 + n16;
                    n13 = this.Z[n17];
                    n12 = this.Z[n17 + 1];
                    n11 = this.Z[n17 + this.E];
                    n10 = this.Z[n17 + this.E + 1];
                    if (stringArray != null) break block4;
                }
                n14 = this.j(this.Z, n16, n15, this.E, this.S);
            }
            n13 = n14;
            n12 = this.j(this.Z, n16 + 1, n15, this.E, this.S);
            n11 = this.j(this.Z, n16, n15 + 1, this.E, this.S);
            n10 = this.j(this.Z, n16 + 1, n15 + 1, this.E, this.S);
        }
        return NM.O(f13, f12, n13, n12, n11, n10);
    }

    private final int j(int[] nArray, int n10, int n11, int n12, int n13) {
        int n14;
        block10: {
            block11: {
                int n15;
                String[] stringArray;
                block8: {
                    block9: {
                        stringArray = W5.q();
                        n15 = n10;
                        if (stringArray == null) break block8;
                        if (n15 < 0) break block9;
                        n15 = n10;
                        if (stringArray == null) break block8;
                        if (n15 >= n12) break block9;
                        n15 = n11;
                        if (stringArray == null) break block8;
                        if (n15 < 0) break block9;
                        n14 = n11;
                        if (stringArray == null) break block10;
                        if (n14 < n13) break block11;
                    }
                    n15 = this.U;
                }
                if (stringArray != null) {
                    switch (n15) {
                        default: {
                            return 0;
                        }
                        case 2: {
                            return nArray[NM.r(n11, n13) * n12 + NM.r(n10, n12)];
                        }
                        case 1: 
                    }
                    n15 = nArray[NM.L(n11, 0, n13 - 1) * n12 + NM.L(n10, 0, n12 - 1)];
                }
                return n15;
            }
            n14 = nArray[n11 * n12 + n10];
        }
        return n14;
    }
}

