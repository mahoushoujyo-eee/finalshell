/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aA
extends JTree {
    private static String u;
    private static final String b;
    private static final long[] q;
    private static final Integer[] v;

    public aA() {
        try {
            this.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public aA(DefaultMutableTreeNode defaultMutableTreeNode) {
        super(defaultMutableTreeNode);
        try {
            this.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void E() {
        this.putClientProperty(b, new Color(aA.a(13560, 3873196748215737387L), aA.a(17886, 5022847974886354190L), aA.a(15719, 8150349306695603638L)));
    }

    public void V() {
        TreePath treePath = this.getSelectionPath();
        if (treePath != null) {
            this.startEditingAtPath(treePath);
        }
    }

    public void f(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        TreePath treePath2 = treePath;
        if (treePath2 != null) {
            this.startEditingAtPath(treePath2);
        }
    }

    public TreePath K(Point point) {
        return this.getPathForLocation(point.x, point.y);
    }

    public boolean N(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.isPathSelected(treePath);
    }

    public void X(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.expandPath(treePath);
    }

    public void g(int n10, int n11) {
        this.setSelectionPath(this.getPathForLocation(n10, n11));
    }

    public void A(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        TreePath treePath2 = treePath;
        if (treePath2 != null) {
            this.setSelectionPath(treePath2);
        }
    }

    public DefaultMutableTreeNode o(Point point) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.k(point.x, point.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public DefaultMutableTreeNode k(int n10, int n11) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(this.getPathForLocation(n10, n11));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public Rectangle f(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.getPathBounds(treePath);
    }

    public TreePath y(DefaultMutableTreeNode defaultMutableTreeNode) {
        return defaultMutableTreeNode != null ? new TreePath(defaultMutableTreeNode.getPath()) : null;
    }

    public void J() {
        String string = aA.z();
        for (int i2 = 0; i2 < this.getRowCount(); ++i2) {
            this.expandRow(i2);
            if (string == null) continue;
        }
    }

    public boolean x(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.isExpanded(treePath);
    }

    public DefaultMutableTreeNode u() {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(this.getSelectionPath());
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public List B() {
        ArrayList<DefaultMutableTreeNode> arrayList;
        block4: {
            ArrayList<DefaultMutableTreeNode> arrayList2;
            block6: {
                TreePath[] treePathArray;
                String string;
                block5: {
                    TreePath[] treePathArray2;
                    arrayList2 = new ArrayList<DefaultMutableTreeNode>();
                    string = aA.z();
                    treePathArray = treePathArray2 = this.getSelectionPaths();
                    if (string != null) break block5;
                    if (treePathArray == null) break block6;
                    treePathArray = treePathArray2;
                }
                for (TreePath treePath : treePathArray) {
                    DefaultMutableTreeNode defaultMutableTreeNode;
                    arrayList = arrayList2;
                    if (string != null) break block4;
                    try {
                        defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(treePath);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList.add(defaultMutableTreeNode);
                    if (string == null) continue;
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public DefaultMutableTreeNode i(int n10) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(this.getPathForRow(n10));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DefaultMutableTreeNode C(TreePath treePath) {
        String string = aA.z();
        Object object = treePath;
        if (string == null) {
            if (object == null) return null;
            object = treePath.getLastPathComponent();
        }
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)object;
        return defaultMutableTreeNode;
    }

    public DefaultMutableTreeNode p(Point point) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.J(point.x, point.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public DefaultMutableTreeNode J(int n10, int n11) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        try {
            defaultMutableTreeNode = (DefaultMutableTreeNode)this.C(this.getClosestPathForLocation(n10, n11));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return defaultMutableTreeNode;
    }

    public TreePath g(Point point) {
        return this.getClosestPathForLocation(point.x, point.y);
    }

    public static void F(String string) {
        u = string;
    }

    public static String z() {
        return u;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                if (aA.z() != null) {
                    aA.F("zJLXkc");
                }
                char[] cArray3 = "J\u001f\u0007\f<5\fr\b\u0001\u001d{)\u0007\\\f\u0001\u0002u4\u0006k\u0003\u0006".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 54;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 40;
                            break;
                        }
                        case 1: {
                            n17 = 91;
                            break;
                        }
                        case 2: {
                            n17 = 84;
                            break;
                        }
                        case 3: {
                            n17 = 95;
                            break;
                        }
                        case 4: {
                            n17 = 36;
                            break;
                        }
                        case 5: {
                            n17 = 112;
                            break;
                        }
                        default: {
                            n17 = 95;
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
        b = new String(cArray).intern();
        long l2 = 8096708686331357986L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00e1A?t\u00feh\u00fe\u00e4c\u00b8\u008bU\u001d}\u0086\u0014\u00e4|[\u0095\b\u0001w\u0011";
        int n19 = "\u00e1A?t\u00feh\u00fe\u00e4c\u00b8\u008bU\u001d}\u0086\u0014\u00e4|[\u0095\b\u0001w\u0011".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        q = lArray;
        v = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x68D1;
        if (v[n11] == null) {
            aA.v[n11] = (int)(q[n11] ^ l2);
        }
        return v[n11];
    }
}

