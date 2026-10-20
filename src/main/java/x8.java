/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class x8
implements TreeSelectionListener {
    final DefaultMutableTreeNode p;
    final zb_0 l;
    final DefaultMutableTreeNode q;
    final z9 U;
    final DefaultMutableTreeNode f;
    final km_2 O;

    x8(km_2 km_22, DefaultMutableTreeNode defaultMutableTreeNode, zb_0 zb_02, DefaultMutableTreeNode defaultMutableTreeNode2, z9 z92, DefaultMutableTreeNode defaultMutableTreeNode3) {
        this.O = km_22;
        this.p = defaultMutableTreeNode;
        this.l = zb_02;
        this.q = defaultMutableTreeNode2;
        this.U = z92;
        this.f = defaultMutableTreeNode3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void valueChanged(TreeSelectionEvent var1_1) {
        block36: {
            block35: {
                block34: {
                    block32: {
                        block33: {
                            block30: {
                                block31: {
                                    block28: {
                                        block29: {
                                            this.O.P = System.currentTimeMillis();
                                            try {
                                                v0 = (DefaultMutableTreeNode)this.O.B.u();
                                            }
                                            catch (InvocationTargetException v1) {
                                                throw v1.getTargetException();
                                            }
                                            var3_2 = v0;
                                            var2_3 = z7.M();
                                            v2 = var3_2;
                                            if (var2_3 == 0) {
                                                if (v2 == null) {
                                                    return;
                                                }
                                                v2 = var3_2;
                                            }
                                            v3 = v2.equals((DefaultMutableTreeNode)this.p);
                                            if (var2_3 != 0) break block28;
                                            if (!v3) break block29;
                                            try {
                                                this.O.w.P(this.l);
                                            }
                                            catch (InvocationTargetException v4) {
                                                throw v4.getTargetException();
                                            }
                                            if (var2_3 == 0) ** GOTO lbl-1000
                                        }
                                        v3 = var3_2.equals((DefaultMutableTreeNode)this.q);
                                    }
                                    if (var2_3 != 0) break block30;
                                    if (!v3) break block31;
                                    try {
                                        this.O.w.P(this.U);
                                    }
                                    catch (InvocationTargetException v5) {
                                        throw v5.getTargetException();
                                    }
                                    if (var2_3 == 0) ** GOTO lbl-1000
                                }
                                v3 = var3_2.equals((DefaultMutableTreeNode)this.O.V);
                            }
                            if (var2_3 != 0) break block32;
                            if (!v3) break block33;
                            try {
                                this.O.w.P(this.O.t);
                            }
                            catch (InvocationTargetException v6) {
                                throw v6.getTargetException();
                            }
                            if (var2_3 == 0) ** GOTO lbl-1000
                        }
                        v3 = var3_2.equals((DefaultMutableTreeNode)this.O.C);
                    }
                    if (var2_3 != 0) ** GOTO lbl69
                    if (!v3) ** GOTO lbl-1000
                    try {
                        this.O.w.P(this.O.F);
                    }
                    catch (InvocationTargetException v7) {
                        throw v7.getTargetException();
                    }
                    if (var2_3 != 0) lbl-1000:
                    // 2 sources

                    {
                        v3 = var3_2.equals((DefaultMutableTreeNode)this.f);
lbl69:
                        // 2 sources

                        if (var2_3 == 0) {
                            if (v3) {
                                try {
                                    this.O.w.P(this.O.h);
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 7 sources

                    {
                        try {
                            v3 = (Boolean)this.O.w();
                        }
                        catch (InvocationTargetException v9) {
                            throw v9.getTargetException();
                        }
                    }
                    var4_4 = v3;
                    if (var1_1.getOldLeadSelectionPath() != null) {
                        // empty if block
                    }
                    v10 = var4_4;
                    if (var2_3 != 0) break block34;
                    if (v10) break block35;
                    v10 = var3_2.equals((DefaultMutableTreeNode)this.O.L);
                }
                if (v10) break block36;
                try {
                    this.O.A();
                }
                catch (InvocationTargetException v11) {
                    throw v11.getTargetException();
                }
                if (var2_3 == 0) break block36;
            }
            this.O.L = var3_2;
        }
    }
}

