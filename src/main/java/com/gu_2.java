/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gu
 */
public class gu_2
extends gy_2 {
    private int Q;
    private int Z;
    private int W;
    private int l;
    private boolean i;
    private static final String a;

    public gu_2() {
        this(0, 0, true);
    }

    public gu_2(int n10, int n11, boolean bl) {
        this.W = n10;
        this.l = n11;
        this.i = bl;
        this.Y(0);
    }

    public void g(int n10) {
        this.W = n10;
    }

    public int q() {
        return this.W;
    }

    public void b(int n10) {
        this.l = n10;
    }

    public int M() {
        return this.l;
    }

    public void J(boolean bl) {
        this.i = bl;
    }

    public boolean V() {
        return this.i;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        block4: {
            block2: {
                block3: {
                    String[] stringArray = W5.q();
                    if (stringArray == null) break block2;
                    if (!this.i) break block3;
                    fArray[0] = (n10 + this.Q - this.W) % this.Q;
                    fArray[1] = (n11 + this.Z - this.l) % this.Z;
                    if (stringArray != null) break block4;
                }
                fArray[0] = n10 - this.W;
            }
            fArray[1] = n11 - this.l;
        }
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.Q = bufferedImage.getWidth();
        String[] stringArray = W5.q();
        this.Z = bufferedImage.getHeight();
        gu_2 gu_22 = this;
        if (stringArray != null) {
            if (gu_22.i) {
                block6: {
                    while (this.W < 0) {
                        this.W += this.Q;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block6;
                    }
                    while (this.l < 0) {
                        this.l += this.Z;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block6;
                    }
                    this.W %= this.Q;
                }
                this.l %= this.Z;
            }
            gu_22 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    public String toString() {
        return a;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = ";}6C\u001cU\u0010P[#Q\u0000B\u0010Q:k".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 46;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 20;
                            break;
                        }
                        case 3: {
                            n17 = 102;
                            break;
                        }
                        case 4: {
                            n17 = 34;
                            break;
                        }
                        case 5: {
                            n17 = 118;
                            break;
                        }
                        default: {
                            n17 = 53;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

