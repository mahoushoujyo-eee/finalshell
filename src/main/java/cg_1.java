/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from cG
 */
class cg_1
implements KeyListener {
    final a3 r;

    cg_1(a3 a32) {
        this.r = a32;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block29: {
            String string;
            Object object;
            DefaultMutableTreeNode defaultMutableTreeNode;
            int n10;
            int n11;
            int n12;
            String string2;
            int[] nArray;
            block35: {
                int n13;
                block27: {
                    int n14;
                    block28: {
                        nArray = a3.I();
                        if (keyEvent.getModifiers() > 0) {
                            return;
                        }
                        string2 = (keyEvent.getKeyChar() + "").toLowerCase();
                        n14 = string2.length();
                        if (nArray == null) break block28;
                        if (n14 != 1) break block29;
                        n14 = ((a3)this.r).getMinSelectionRow();
                    }
                    int n15 = n14;
                    n12 = ((a3)this.r).getRowCount();
                    n11 = 0;
                    n10 = n15 + 1;
                    while (n10 < n12) {
                        block34: {
                            boolean bl;
                            block33: {
                                block32: {
                                    Serializable serializable;
                                    block30: {
                                        block31: {
                                            String string3;
                                            DefaultMutableTreeNode defaultMutableTreeNode2;
                                            try {
                                                defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.r.i(n10);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            defaultMutableTreeNode = defaultMutableTreeNode2;
                                            object = defaultMutableTreeNode.getUserObject();
                                            string = "";
                                            n13 = object.getClass().equals(ck_2.class) ? 1 : 0;
                                            if (nArray == null) break block27;
                                            if (nArray == null) break block30;
                                            if (n13 == 0) break block31;
                                            serializable = (ck_2)object;
                                            try {
                                                string3 = (String)serializable.a();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            string = string3;
                                            if (nArray != null) break block32;
                                        }
                                        bl = object.getClass().equals(tf_2.class);
                                    }
                                    if (nArray == null) break block33;
                                    if (bl) {
                                        String string4;
                                        serializable = (tf_2)object;
                                        try {
                                            string4 = (String)serializable.M();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        string = string4;
                                    }
                                }
                                string = string.toLowerCase();
                                if (nArray == null) break block34;
                                bl = string.startsWith(string2);
                            }
                            if (bl) {
                                int n16 = n10;
                                ((a3)this.r).setSelectionRow(n16);
                                ((a3)this.r).scrollRowToVisible(n16);
                                n11 = 1;
                                if (nArray != null) break;
                            }
                            ++n10;
                        }
                        if (nArray != null) continue;
                    }
                    n13 = n11;
                }
                if (nArray == null) break block35;
                if (n13 != 0) break block29;
                n13 = n10 = 0;
            }
            while (n10 < n12) {
                block40: {
                    boolean bl;
                    block39: {
                        block38: {
                            block36: {
                                block37: {
                                    String string5;
                                    DefaultMutableTreeNode defaultMutableTreeNode3;
                                    try {
                                        defaultMutableTreeNode3 = (DefaultMutableTreeNode)this.r.i(n10);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    defaultMutableTreeNode = defaultMutableTreeNode3;
                                    object = defaultMutableTreeNode.getUserObject();
                                    string = "";
                                    bl = object.getClass().equals(ck_2.class);
                                    if (nArray == null) break block36;
                                    if (!bl) break block37;
                                    ck_2 ck_22 = (ck_2)object;
                                    try {
                                        string5 = (String)ck_22.a();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    string = string5;
                                    if (nArray != null) break block38;
                                }
                                bl = object.getClass().equals(tf_2.class);
                            }
                            if (nArray == null) break block39;
                            if (bl) {
                                String string6;
                                tf_2 tf_22 = (tf_2)object;
                                try {
                                    string6 = (String)tf_22.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                string = string6;
                            }
                        }
                        string = string.toLowerCase();
                        if (nArray == null) break block40;
                        bl = string.startsWith(string2);
                    }
                    if (bl) {
                        int n17 = n10;
                        ((a3)this.r).setSelectionRow(n17);
                        ((a3)this.r).scrollRowToVisible(n17);
                        n11 = 1;
                        if (nArray != null) break;
                    }
                    ++n10;
                }
                if (nArray != null) continue;
            }
        }
    }
}

