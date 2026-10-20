/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ND;
import com.O_;
import com.QC;
import javax.swing.Icon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Ov
 */
public class ov_0
extends O_
implements ND {
    protected boolean W;
    protected float Z;
    private static final String a;

    public ov_0() {
        this.f();
    }

    public ov_0(Icon icon) {
        super(icon);
        this.f();
    }

    public ov_0(Icon icon, int n10) {
        super(icon, n10);
        this.f();
    }

    public ov_0(String string) {
        super(string);
        this.f();
    }

    public ov_0(String string, int n10) {
        super(string, n10, new Object[0]);
        this.f();
    }

    public ov_0(String string, Icon icon) {
        super(string, icon);
        this.f();
    }

    public ov_0(String string, Icon icon, int n10) {
        super(string, icon, n10, new Object[0]);
        this.f();
    }

    private void f() {
        this.S(a);
    }

    @Override
    public void o(boolean bl) {
        this.W = bl;
        this.repaint();
    }

    @Override
    public boolean D() {
        return this.W;
    }

    @Override
    public void w(float f10) {
        this.Z = f10;
        this.repaint();
    }

    @Override
    public float D() {
        return this.Z;
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
                char[] cArray3 = "tWCSaSccHD\u001f`\\t{@HF".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 4;
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
                            n17 = 18;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 34;
                            break;
                        }
                        case 3: {
                            n17 = 54;
                            break;
                        }
                        case 4: {
                            n17 = 1;
                            break;
                        }
                        case 5: {
                            n17 = 52;
                            break;
                        }
                        default: {
                            n17 = 21;
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

