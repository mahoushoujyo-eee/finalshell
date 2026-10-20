/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from yk
 */
class yk_2
implements TreeSelectionListener {
    final DefaultMutableTreeNode l;
    final DefaultMutableTreeNode u;
    final DefaultMutableTreeNode E;
    final DefaultMutableTreeNode M;
    final DefaultMutableTreeNode L;
    final DefaultMutableTreeNode Q;
    final ox_2 X;

    yk_2(ox_2 ox_22, DefaultMutableTreeNode defaultMutableTreeNode, DefaultMutableTreeNode defaultMutableTreeNode2, DefaultMutableTreeNode defaultMutableTreeNode3, DefaultMutableTreeNode defaultMutableTreeNode4, DefaultMutableTreeNode defaultMutableTreeNode5, DefaultMutableTreeNode defaultMutableTreeNode6) {
        this.X = ox_22;
        this.l = defaultMutableTreeNode;
        this.u = defaultMutableTreeNode2;
        this.E = defaultMutableTreeNode3;
        this.M = defaultMutableTreeNode4;
        this.L = defaultMutableTreeNode5;
        String string = ox_2.D();
        this.Q = defaultMutableTreeNode6;
        if (ky_2.F() != null) {
            ox_2.M("TIBij");
        }
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        block22: {
            boolean bl;
            block31: {
                block32: {
                    String string;
                    block29: {
                        block30: {
                            block27: {
                                block28: {
                                    block25: {
                                        block26: {
                                            block23: {
                                                block24: {
                                                    block20: {
                                                        block21: {
                                                            DefaultMutableTreeNode defaultMutableTreeNode2;
                                                            try {
                                                                defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.X.B.u();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            defaultMutableTreeNode = defaultMutableTreeNode2;
                                                            string = ox_2.D();
                                                            DefaultMutableTreeNode defaultMutableTreeNode3 = defaultMutableTreeNode;
                                                            if (string == null) {
                                                                if (defaultMutableTreeNode3 == null) {
                                                                    return;
                                                                }
                                                                defaultMutableTreeNode3 = defaultMutableTreeNode;
                                                            }
                                                            bl = defaultMutableTreeNode3.equals((DefaultMutableTreeNode)this.l);
                                                            if (string != null) break block20;
                                                            if (!bl) break block21;
                                                            try {
                                                                this.X.K.P(this.X.X);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            if (string == null) break block22;
                                                        }
                                                        bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.u);
                                                    }
                                                    if (string != null) break block23;
                                                    if (!bl) break block24;
                                                    try {
                                                        this.X.K.P(this.X.D);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    if (string == null) break block22;
                                                }
                                                bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.E);
                                            }
                                            if (string != null) break block25;
                                            if (!bl) break block26;
                                            try {
                                                this.X.K.P(this.X.Q);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (string == null) break block22;
                                        }
                                        bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.M);
                                    }
                                    if (string != null) break block27;
                                    if (!bl) break block28;
                                    try {
                                        this.X.K.P(this.X.s);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    if (string == null) break block22;
                                }
                                bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.L);
                            }
                            if (string != null) break block29;
                            if (!bl) break block30;
                            try {
                                this.X.K.P(this.X.R);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string == null) break block22;
                        }
                        bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.Q);
                    }
                    if (string != null) break block31;
                    if (!bl) break block32;
                    try {
                        this.X.K.P(this.X.P);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string == null) break block22;
                }
                bl = defaultMutableTreeNode.equals((DefaultMutableTreeNode)this.X.m);
            }
            if (bl) {
                try {
                    this.X.K.P(this.X.z);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
        this.X.J = defaultMutableTreeNode;
    }
}

