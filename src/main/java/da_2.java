/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from da
 */
public class da_2 {
    private static final long[] a;
    private static final Integer[] b;

    private JScrollPane j() {
        JTree jTree = new JTree();
        jTree.setDragEnabled(true);
        jTree.setDropMode(DropMode.ON_OR_INSERT);
        jTree.setTransferHandler(new T8());
        jTree.getSelectionModel().setSelectionMode(2);
        try {
            this.H(jTree);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return new JScrollPane(jTree);
    }

    private void H(JTree jTree) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)jTree.getModel().getRoot();
        String[] stringArray = F8.y();
        Enumeration<TreeNode> enumeration = defaultMutableTreeNode.breadthFirstEnumeration();
        while (enumeration.hasMoreElements()) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)enumeration.nextElement();
            int n10 = defaultMutableTreeNode2.isLeaf();
            if (stringArray == null) {
                if (n10 != 0) continue;
                n10 = jTree.getRowForPath(new TreePath(defaultMutableTreeNode2.getPath()));
            }
            int n11 = n10;
            jTree.expandRow(n11);
            if (stringArray == null) continue;
        }
    }

    public static void main(String[] stringArray) {
        JScrollPane jScrollPane;
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(3);
        try {
            jScrollPane = (JScrollPane)new da_2().j();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        jFrame.add(jScrollPane);
        jFrame.setSize(da_2.a(9918, 4914330257659809117L), da_2.a(11822, 3670117610238035406L));
        jFrame.setLocation(da_2.a(18280, 9010126470277147785L), da_2.a(7687, 1898245755519038949L));
        jFrame.setVisible(true);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2957805752508551391L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "E\u00b9\u0095Y,%\\\u0012\u00d7\u0089s\u00a3:\u00fb\u00e5\u00f2";
                var5_4 = "E\u00b9\u0095Y,%\\\u0012\u00d7\u0089s\u00a3:\u00fb\u00e5\u00f2".length();
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
                    var4_3 = "\u00aa\u00f9\u0013oR\u00d7\u00bc\u009e\u00e4 \u00dc[R\u00c5\u00d4\u0081";
                    var5_4 = "\u00aa\u00f9\u0013oR\u00d7\u00bc\u009e\u00e4 \u00dc[R\u00c5\u00d4\u0081".length();
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
        da_2.a = var6_1;
        da_2.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6BE3;
        if (b[n11] == null) {
            da_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

