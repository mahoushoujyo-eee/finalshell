/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a9;
import com.kp_0;
import com.ne_1;
import com.pb_2;
import com.yd_0;
import java.awt.Color;
import java.awt.Stroke;
import javax.swing.JSeparator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class KA
extends JSeparator {
    private static final String a;

    public KA() {
        super(0);
    }

    public Color D() {
        return this.N().Y();
    }

    public KA Z(Color color) {
        this.N().D(color);
        return this;
    }

    public Stroke d() {
        return this.N().j();
    }

    public KA o(Stroke stroke) {
        this.N().o(stroke);
        return this;
    }

    public int d() {
        return this.N().A();
    }

    public KA J(int n10) {
        this.N().F(n10);
        return this;
    }

    public int h() {
        return this.N().I();
    }

    public KA E(int n10) {
        this.N().v(n10);
        return this;
    }

    public yd_0 N() {
        return (yd_0)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block13: {
            block12: {
                block11: {
                    block14: {
                        var1_1 = pb_2.g();
                        v0 = this;
                        if (var1_1 == null) ** GOTO lbl26
                        if (v0.getUI() == null) break block11;
                        break block14;
                        catch (Throwable v1) {
                            throw KA.a(v1);
                        }
                    }
                    try {
                        block15: {
                            v2 = this;
                            if (var1_1 == null) break block12;
                            break block15;
                            catch (Throwable v3) {
                                throw KA.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof yd_0)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw KA.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((yd_0)kp_0.w(a9.zI, new Object[0]));
                    break block13;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new yd_0());
                        if (var1_1 != null) break block13;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw KA.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
    }

    @Override
    public String getUIClassID() {
        return a;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
                char[] cArray3 = "?4X\u000f}#\u001e\u0001.{\u001f}\u000f\t\u000e/G\bX'".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 120;
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
                            n17 = 23;
                            break;
                        }
                        case 1: {
                            n17 = 35;
                            break;
                        }
                        case 2: {
                            n17 = 80;
                            break;
                        }
                        case 3: {
                            n17 = 2;
                            break;
                        }
                        case 4: {
                            n17 = 117;
                            break;
                        }
                        case 5: {
                            n17 = 22;
                            break;
                        }
                        default: {
                            n17 = 3;
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

