/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from fk
 */
class fk_2
implements KeyListener {
    final a3 G;
    private static final long a;

    fk_2(a3 a32) {
        this.G = a32;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block16: {
            a3 a32;
            DefaultMutableTreeNode defaultMutableTreeNode;
            block18: {
                block19: {
                    boolean bl;
                    int[] nArray;
                    block17: {
                        String string;
                        String string2;
                        DefaultMutableTreeNode defaultMutableTreeNode2;
                        int n10;
                        block15: {
                            nArray = a3.I();
                            n10 = keyEvent.getKeyCode();
                            if (nArray == null) break block15;
                            if (n10 != (int)a) break block16;
                            n10 = ((a3)this.G).getMinSelectionRow();
                        }
                        int n11 = n10;
                        try {
                            defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.G.i(n11);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        defaultMutableTreeNode = defaultMutableTreeNode2;
                        tf_2 tf_22 = (tf_2)defaultMutableTreeNode.getUserObject();
                        boolean bl2 = false;
                        TreePath treePath = ((a3)this.G.K).getPathForRow(n11);
                        try {
                            string2 = (String)tf_22.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((HashSet)this.G.T).add(string2);
                        DefaultMutableTreeNode defaultMutableTreeNode3 = (DefaultMutableTreeNode)defaultMutableTreeNode.getParent();
                        try {
                            this.G.s((Object)defaultMutableTreeNode3, (Object)tf_22, (Object)treePath, null, true, false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            string = (String)tf_22.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl = ((HashSet)this.G.Z).contains(string);
                        if (nArray == null) break block17;
                        if (!bl) break block16;
                        a32 = (a3)this.G;
                        if (nArray != null) {
                            try {
                                bl = (Boolean)a32.x(defaultMutableTreeNode);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        break block18;
                    }
                    if (!bl) break block19;
                    ((a3)this.G).collapsePath(new TreePath(defaultMutableTreeNode.getPath()));
                    if (nArray != null) break block16;
                }
                a32 = (a3)this.G;
            }
            a32.expandPath(new TreePath(defaultMutableTreeNode.getPath()));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7404190692422060865L;
        a = 0x626B7D44A7120B4BL ^ l2;
    }
}

