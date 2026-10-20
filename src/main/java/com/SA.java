/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ST;
import com.cb_1;
import com.cy_1;
import com.u2;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

class SA
extends ST {
    private cy_1 p;
    final cy_1 l;
    final List M;
    final boolean O;
    final int T;
    final boolean Q;
    final Runnable b;
    final u2 w;

    SA(u2 u22, cy_1 cy_12, List list, boolean bl, int n10, boolean bl2, Runnable runnable) {
        this.w = u22;
        this.l = cy_12;
        this.M = list;
        this.O = bl;
        this.T = n10;
        this.Q = bl2;
        this.b = runnable;
        this.p = this.l;
    }

    public void U(cy_1 cy_12, List list) {
        block13: {
            Runnable runnable;
            block26: {
                String[] stringArray;
                block25: {
                    SA sA;
                    block23: {
                        block24: {
                            boolean bl;
                            block22: {
                                block12: {
                                    stringArray = cb_1.C();
                                    if (cy_12 != this.p) break block13;
                                    boolean bl2 = false;
                                    for (cy_1 cy_13 : list) {
                                        block15: {
                                            block16: {
                                                List list2;
                                                block17: {
                                                    block20: {
                                                        SA sA2;
                                                        block21: {
                                                            int n10;
                                                            block18: {
                                                                block19: {
                                                                    int n11;
                                                                    block14: {
                                                                        bl = cy_13.D().equals(this.M.get(0));
                                                                        if (stringArray == null) break block12;
                                                                        if (stringArray == null) break block14;
                                                                        if (!bl) break block15;
                                                                        bl2 = true;
                                                                        list2 = this.M;
                                                                        if (stringArray == null) break block16;
                                                                        n11 = list2.size();
                                                                    }
                                                                    if (n11 != true) break block17;
                                                                    this.w.C(this);
                                                                    n10 = this.O;
                                                                    if (stringArray == null) break block18;
                                                                    if (n10 == 0) break block19;
                                                                    n10 = this.T;
                                                                    if (stringArray == null) break block18;
                                                                    if (n10 != this.w.l) break block19;
                                                                    this.w.G(cy_13, this.Q);
                                                                    if (stringArray != null) break block20;
                                                                }
                                                                sA2 = this;
                                                                if (stringArray == null) break block21;
                                                                n10 = sA2.Q ? 1 : 0;
                                                            }
                                                            if (n10 != 0) {
                                                                this.w.P((DefaultMutableTreeNode)cy_13);
                                                            }
                                                            sA2 = this;
                                                        }
                                                        sA2.w.O((DefaultMutableTreeNode)cy_13);
                                                    }
                                                    Runnable runnable2 = this.b;
                                                    if (stringArray != null) {
                                                        if (runnable2 == null) break;
                                                        runnable2 = this.b;
                                                    }
                                                    runnable2.run();
                                                    if (stringArray != null) break;
                                                }
                                                this.p = cy_13;
                                                list2 = this.M.remove(0);
                                            }
                                            this.w.K(cy_13);
                                            if (stringArray != null) break;
                                        }
                                        if (stringArray != null) continue;
                                    }
                                    bl = bl2;
                                }
                                if (stringArray == null) break block22;
                                if (bl) break block13;
                                this.w.C(this);
                                sA = this;
                                if (stringArray == null) break block23;
                                bl = sA.O;
                            }
                            if (!bl) break block24;
                            sA = this;
                            if (stringArray == null) break block23;
                            if (sA.T != this.w.l) break block24;
                            this.w.G(cy_12, false);
                            if (stringArray != null) break block25;
                        }
                        sA = this;
                    }
                    sA.w.O((DefaultMutableTreeNode)cy_12);
                }
                runnable = this.b;
                if (stringArray == null) break block26;
                if (runnable == null) break block13;
                runnable = this.b;
            }
            runnable.run();
        }
    }

    public void Z(cy_1 cy_12, Throwable throwable) {
        block5: {
            Runnable runnable;
            block9: {
                String[] stringArray;
                block8: {
                    SA sA;
                    block6: {
                        block7: {
                            block4: {
                                stringArray = cb_1.C();
                                if (stringArray == null) break block4;
                                if (cy_12 != this.p) break block5;
                                this.w.C(this);
                            }
                            sA = this;
                            if (stringArray == null) break block6;
                            if (!sA.O) break block7;
                            sA = this;
                            if (stringArray == null) break block6;
                            if (sA.T != this.w.l) break block7;
                            this.w.G(cy_12, false);
                            if (stringArray != null) break block8;
                        }
                        sA = this;
                    }
                    sA.w.O((DefaultMutableTreeNode)cy_12);
                }
                runnable = this.b;
                if (stringArray == null) break block9;
                if (runnable == null) break block5;
                runnable = this.b;
            }
            runnable.run();
        }
    }

    @Override
    public void X(cb_1 cb_12, Throwable throwable) {
        this.Z((cy_1)cb_12, throwable);
    }

    @Override
    public void y(cb_1 cb_12, List list) {
        this.U((cy_1)cb_12, list);
    }
}

