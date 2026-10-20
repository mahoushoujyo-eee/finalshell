/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from k7
 */
class k7_0
implements TreeSelectionListener {
    final DefaultMutableTreeNode s;
    final zd_0 q;
    final kb_0 I;

    k7_0(kb_0 kb_02, DefaultMutableTreeNode defaultMutableTreeNode, zd_0 zd_02) {
        this.I = kb_02;
        this.s = defaultMutableTreeNode;
        this.q = zd_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void valueChanged(TreeSelectionEvent var1_1) {
        block24: {
            block23: {
                block22: {
                    v0 = z7.m();
                    this.I.H = System.currentTimeMillis();
                    var2_2 = v0;
                    try {
                        v1 = (DefaultMutableTreeNode)this.I.S.u();
                    }
                    catch (InvocationTargetException v2) {
                        throw v2.getTargetException();
                    }
                    v3 = var3_3 = v1;
                    if (var2_2 != 0) {
                        if (v3 == null) {
                            return;
                        }
                        v3 = var3_3;
                    }
                    v4 = v3.equals((DefaultMutableTreeNode)this.s);
                    if (var2_2 == 0) ** GOTO lbl30
                    if (!v4) ** GOTO lbl-1000
                    try {
                        this.I.R.P(this.q);
                    }
                    catch (InvocationTargetException v5) {
                        throw v5.getTargetException();
                    }
                    if (var2_2 == 0) lbl-1000:
                    // 2 sources

                    {
                        v4 = var3_3.equals((DefaultMutableTreeNode)this.I.y);
lbl30:
                        // 2 sources

                        if (var2_2 != 0) {
                            if (v4) {
                                try {
                                    this.I.R.P(this.I.j);
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        try {
                            v4 = (Boolean)this.I.l();
                        }
                        catch (InvocationTargetException v7) {
                            throw v7.getTargetException();
                        }
                    }
                    var4_4 = v4;
                    if (var1_1.getOldLeadSelectionPath() != null) {
                        // empty if block
                    }
                    v8 = var4_4;
                    if (var2_2 == 0) break block22;
                    if (v8) break block23;
                    v8 = var3_3.equals((DefaultMutableTreeNode)this.I.Q);
                }
                if (v8) break block24;
                try {
                    this.I.s();
                }
                catch (InvocationTargetException v9) {
                    throw v9.getTargetException();
                }
                if (var2_2 != 0) break block24;
            }
            this.I.Q = var3_3;
        }
    }
}

