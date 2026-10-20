/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IN;
import com.ky_2;
import com.pt_0;
import com.yn_0;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import javax.swing.JToggleButton;

public class S
extends JToggleButton.ToggleButtonModel {
    protected boolean p = IN.G;
    private static final long[] a;
    private static final Integer[] b;

    public boolean O() {
        return this.p;
    }

    public void y(boolean bl) {
        this.p = bl;
    }

    /*
     * Unable to fully structure code
     */
    public void f(pt_0 var1_1) {
        var2_2 = pt_0.b();
        if (var2_2 != null) ** GOTO lbl6
        switch (yn_0.M[var1_1.ordinal()]) {
            case 1: {
                this.setSelected(false);
lbl6:
                // 2 sources

                if (var2_2 == null) break;
            }
            case 2: {
                this.setSelected(true);
                if (var2_2 == null) break;
            }
            case 3: {
                this.g(true);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public pt_0 y() {
        pt_0 pt_02;
        ky_2[] ky_2Array = pt_0.b();
        boolean bl = this.X();
        if (ky_2Array == null) {
            if (bl) {
                pt_02 = pt_0.mixed;
                return pt_02;
            }
            bl = this.isSelected();
        }
        if (bl) {
            pt_02 = pt_0.checked;
            return pt_02;
        }
        pt_02 = pt_0.unchecked;
        return pt_02;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setPressed(boolean var1_1) {
        block20: {
            block24: {
                block25: {
                    block22: {
                        block23: {
                            block21: {
                                block19: {
                                    block18: {
                                        block17: {
                                            block16: {
                                                block14: {
                                                    block15: {
                                                        block13: {
                                                            block12: {
                                                                var2_2 = pt_0.b();
                                                                v0 = this.isEnabled();
                                                                if (var2_2 != null) break block12;
                                                                if (!v0) break block13;
                                                                v0 = this.isPressed();
                                                            }
                                                            if (var2_2 != null) break block14;
                                                            if (v0 != var1_1) break block15;
                                                        }
                                                        return;
                                                    }
                                                    v0 = var1_1;
                                                }
                                                if (var2_2 != null) break block16;
                                                if (v0) break block17;
                                                v1 = this;
                                                if (var2_2 != null) break block18;
                                                v0 = v1.isArmed();
                                            }
                                            if (v0) {
                                                this.d();
                                            }
                                        }
                                        v1 = this;
                                    }
                                    v2 = var1_1;
                                    if (var2_2 != null) ** GOTO lbl31
                                    if (v2 != 0) {
                                        v3 = this.stateMask | 4;
                                    } else {
                                        v2 = this.stateMask;
lbl31:
                                        // 2 sources

                                        v3 = v2 & S.a(4766, 3863445292575446678L);
                                    }
                                    v1.stateMask = v3;
                                    this.fireStateChanged();
                                    v4 = this.isPressed();
                                    if (var2_2 != null) break block19;
                                    if (v4 != 0) break block20;
                                    v4 = this.isArmed();
                                }
                                if (var2_2 != null) break block21;
                                if (v4 == 0) break block20;
                                v4 = 0;
                            }
                            var3_3 = v4;
                            var4_4 = EventQueue.getCurrentEvent();
                            v5 = var4_4 instanceof InputEvent;
                            if (var2_2 != null) break block22;
                            if (v5 == 0) break block23;
                            var3_3 = ((InputEvent)var4_4).getModifiers();
                            if (var2_2 == null) break block24;
                        }
                        v5 = var4_4 instanceof ActionEvent;
                    }
                    if (var2_2 != null) break block25;
                    if (v5 == 0) break block24;
                    v5 = ((ActionEvent)var4_4).getModifiers();
                }
                var3_3 = v5;
            }
            var5_5 = EventQueue.getMostRecentEventTime();
            this.fireActionPerformed(new ActionEvent(this, S.a(5724, 489063734572372561L), this.getActionCommand(), var5_5, var3_3));
        }
    }

    protected void d() {
        this.f(this.Y(this.y()));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void setSelected(boolean var1_1) {
        block2: {
            block3: {
                var3_2 = this.X();
                var2_3 = pt_0.b();
                if (var2_3 != null) break block2;
                if (!var3_2) break block3;
                this.stateMask &= S.a(3451, 8044606198164277621L);
                v0 = var1_1;
                if (var2_3 != null) ** GOTO lbl12
                if (v0 != 0) {
                    v1 = this.stateMask & S.a(7556, 5045667298793806223L);
                } else {
                    v0 = this.stateMask;
lbl12:
                    // 2 sources

                    v1 = v0 | 2;
                }
                this.stateMask = v1;
            }
            super.setSelected(var1_1);
        }
    }

    public boolean X() {
        ky_2[] ky_2Array = pt_0.b();
        boolean bl = this.stateMask & S.a(29808, 216269436117168255L);
        if (ky_2Array == null) {
            bl = bl;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void g(boolean var1_1) {
        var2_2 = pt_0.b();
        v0 = this;
        if (var2_2 == null) {
            if (v0.X() == var1_1) {
                return;
            }
            v0 = this;
        }
        v1 = var1_1;
        if (var2_2 != null) ** GOTO lbl13
        if (v1 != 0) {
            v2 = this.stateMask | S.a(9977, 4060913670531310325L) | 2;
        } else {
            v1 = this.stateMask;
lbl13:
            // 2 sources

            v2 = v1 & S.a(4750, 6830364874690188932L);
        }
        v0.stateMask = v2;
        this.fireStateChanged();
        this.fireItemStateChanged(new ItemEvent(this, S.a(23821, 7849490957253515524L), this, 3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected pt_0 Y(pt_0 pt_02) {
        ky_2[] ky_2Array = pt_0.b();
        int n10 = yn_0.M[pt_02.ordinal()];
        if (ky_2Array != null) return n10 != 0 ? pt_0.mixed : pt_0.checked;
        switch (n10) {
            case 1: {
                n10 = this.p ? 1 : 0;
                return n10 != 0 ? pt_0.mixed : pt_0.checked;
            }
            case 2: {
                return this.p ? pt_0.unchecked : pt_0.mixed;
            }
            case 3: {
                return this.p ? pt_0.checked : pt_0.unchecked;
            }
        }
        return pt_0.unchecked;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5499702052714726613L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "*\u00bb\u00e2\u0087m\u0007\u00a6\u00a0\u0088\u00cbKf\u00cd:\u0015m\u00a5\u00fa\u0017\u00d4&\u000fr\u00df\u0092\u0014\u00ede\u00d5\u0005\u00f4*Q~B\u00d1\u0018n\u00ed\u00b8]\u008d\u00da\u008e80\u00dfl";
                var5_4 = "*\u00bb\u00e2\u0087m\u0007\u00a6\u00a0\u0088\u00cbKf\u00cd:\u0015m\u00a5\u00fa\u0017\u00d4&\u000fr\u00df\u0092\u0014\u00ede\u00d5\u0005\u00f4*Q~B\u00d1\u0018n\u00ed\u00b8]\u008d\u00da\u008e80\u00dfl".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "BG\u00aer\u0003Em.B\u001d\u00b3>\u00fe\u001bb\u00a7";
                    var5_4 = "BG\u00aer\u0003Em.B\u001d\u00b3>\u00fe\u001bb\u00a7".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        S.a = var6_1;
        S.b = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x440C;
        if (b[n11] == null) {
            S.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

