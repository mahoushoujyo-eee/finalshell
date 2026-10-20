/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ND;
import com.QC;
import com.ky_2;
import com.og_2;
import java.awt.Component;
import java.awt.LayoutManager;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.ki
 */
public class ki_2
extends ky_2
implements ND {
    protected boolean q;
    protected float H;
    private static final String a;

    public ki_2() {
        this.v();
    }

    public ki_2(boolean bl) {
        super(bl);
        this.v();
    }

    public ki_2(boolean bl, LayoutManager layoutManager) {
        super(bl, layoutManager);
        this.v();
    }

    public ki_2(boolean bl, Component component) {
        super(bl, component);
        this.v();
    }

    public ki_2(Component component) {
        super(component);
        this.v();
    }

    public ki_2(og_2 og_22) {
        super(og_22);
        this.v();
    }

    public ki_2(og_2 og_22, Component component) {
        super(og_22, component);
        this.v();
    }

    public ki_2(LayoutManager layoutManager) {
        super(layoutManager);
        this.v();
    }

    public ki_2(LayoutManager layoutManager, boolean bl) {
        super(layoutManager, bl);
        this.v();
    }

    private void v() {
        this.S(a);
    }

    @Override
    public void o(boolean bl) {
        this.q = bl;
        this.repaint();
    }

    @Override
    public boolean D() {
        return this.q;
    }

    @Override
    public void w(float f10) {
        this.H = f10;
        this.repaint();
    }

    @Override
    public float D() {
        return this.H;
    }

    @Override
    public boolean contains(int n10, int n11) {
        return QC.q(this, n10, n11);
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
                char[] cArray3 = "\u001eALyA\u0003`\t^K5@\fw\u0011VGl".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 114;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 91;
                            break;
                        }
                        case 3: {
                            n17 = 106;
                            break;
                        }
                        case 4: {
                            n17 = 87;
                            break;
                        }
                        case 5: {
                            n17 = 18;
                            break;
                        }
                        default: {
                            n17 = 96;
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

