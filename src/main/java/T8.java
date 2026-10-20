/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class T8
extends TransferHandler {
    DataFlavor u;
    DataFlavor[] M;
    DefaultMutableTreeNode[] L;
    private static final String[] a;
    private static final String[] b;

    public T8() {
        this.M = new DataFlavor[1];
        try {
            String string = "application/x-java-jvm-local-objectref;class=\"" + DefaultMutableTreeNode[].class.getName() + "\"";
            this.u = new DataFlavor(string);
            ((DataFlavor[])c.c((long)468636989006284435L).get((Object)this))[0] = (DataFlavor)this.u;
        }
        catch (ClassNotFoundException classNotFoundException) {
            System.out.println("ClassNotFound: " + classNotFoundException.getMessage());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        int n10;
        int n11;
        int[] nArray;
        JTree jTree;
        JTree.DropLocation dropLocation;
        String[] stringArray;
        block12: {
            int n12;
            TransferHandler.TransferSupport transferSupport2;
            block14: {
                boolean bl;
                block13: {
                    stringArray = F8.y();
                    bl = transferSupport.isDrop();
                    if (stringArray != null) break block13;
                    if (!bl) {
                        return false;
                    }
                    transferSupport.setShowDropLocation(true);
                    transferSupport2 = transferSupport;
                    if (stringArray != null) break block14;
                    bl = transferSupport2.isDataFlavorSupported((DataFlavor)this.u);
                }
                if (!bl) {
                    return false;
                }
                transferSupport2 = transferSupport;
            }
            dropLocation = (JTree.DropLocation)transferSupport2.getDropLocation();
            jTree = (JTree)transferSupport.getComponent();
            int n13 = jTree.getRowForPath(dropLocation.getPath());
            nArray = jTree.getSelectionRows();
            for (n12 = 0; n12 < nArray.length; ++n12) {
                int n14 = nArray[n12];
                if (stringArray != null) return n14 != 0;
                n11 = n13;
                if (stringArray == null) {
                    if (n14 != n11) continue;
                    return 0 != 0;
                }
                break block12;
            }
            n10 = n12 = transferSupport.getDropAction();
            if (stringArray != null) return n10 != 0;
            n11 = 2;
        }
        if (n10 == n11) {
            try {
                n10 = ((Boolean)this.d(jTree)).booleanValue() ? 1 : 0;
                return n10 != 0;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        TreePath treePath = dropLocation.getPath();
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
        TreePath treePath2 = jTree.getPathForRow(nArray[0]);
        DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)treePath2.getLastPathComponent();
        int n15 = defaultMutableTreeNode2.getChildCount();
        if (stringArray != null) return n15 != 0;
        if (n15 <= 0) return 1 != 0;
        n15 = defaultMutableTreeNode.getLevel();
        if (stringArray != null) return n15 != 0;
        if (n15 >= defaultMutableTreeNode2.getLevel()) return 1 != 0;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean d(JTree var1_1) {
        block10: {
            var3_2 = var1_1.getSelectionRows();
            var4_3 = var1_1.getPathForRow(var3_2[0]);
            var2_4 = F8.y();
            var5_5 = (DefaultMutableTreeNode)var4_3.getLastPathComponent();
            v0 = var6_6 = var5_5.getChildCount();
            if (var2_4 == null) {
                if (v0 > 0) {
                    v0 = var3_2.length;
                    if (var2_4 == null) {
                        if (v0 == 1) {
                            return false;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = var7_7 = 1;
                }
            }
            while (var7_7 < var3_2.length) {
                block11: {
                    block12: {
                        block13: {
                            var4_3 = var1_1.getPathForRow(var3_2[var7_7]);
                            var8_8 = (DefaultMutableTreeNode)var4_3.getLastPathComponent();
                            if (var2_4 != null) break block11;
                            v1 = var5_5.isNodeChild(var8_8);
                            if (var2_4 != null) break block10;
                            if (!v1) break block12;
                            v2 = var6_6;
                            if (var2_4 != null) break block13;
                            if (v2 <= var3_2.length - 1) break block12;
                            v2 = 0;
                        }
                        return (boolean)v2;
                    }
                    ++var7_7;
                }
                if (var2_4 == null) continue;
            }
            v1 = true;
        }
        return v1;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        JTree jTree = (JTree)jComponent;
        TreePath[] treePathArray = jTree.getSelectionPaths();
        String[] stringArray = F8.y();
        if (treePathArray != null) {
            Serializable[] serializableArray;
            ArrayList<DefaultMutableTreeNode> arrayList;
            block10: {
                DefaultMutableTreeNode defaultMutableTreeNode;
                ArrayList<DefaultMutableTreeNode> arrayList2 = new ArrayList<DefaultMutableTreeNode>();
                arrayList = new ArrayList<DefaultMutableTreeNode>();
                DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)treePathArray[0].getLastPathComponent();
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.w(defaultMutableTreeNode2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode3 = defaultMutableTreeNode;
                arrayList2.add(defaultMutableTreeNode3);
                arrayList.add(defaultMutableTreeNode2);
                for (int i2 = 1; i2 < treePathArray.length; ++i2) {
                    DefaultMutableTreeNode defaultMutableTreeNode4;
                    serializableArray = treePathArray;
                    if (stringArray != null) break block10;
                    DefaultMutableTreeNode defaultMutableTreeNode5 = (DefaultMutableTreeNode)serializableArray[i2].getLastPathComponent();
                    int n10 = defaultMutableTreeNode5.getLevel();
                    int n11 = defaultMutableTreeNode2.getLevel();
                    if (stringArray == null) {
                        if (n10 < n11 && stringArray == null) break;
                        n10 = defaultMutableTreeNode5.getLevel();
                        if (stringArray != null) continue;
                        n11 = defaultMutableTreeNode2.getLevel();
                    }
                    if (n10 > n11) {
                        DefaultMutableTreeNode defaultMutableTreeNode6;
                        try {
                            defaultMutableTreeNode6 = (DefaultMutableTreeNode)this.w(defaultMutableTreeNode5);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        defaultMutableTreeNode3.add(defaultMutableTreeNode6);
                        if (stringArray == null) continue;
                    }
                    try {
                        defaultMutableTreeNode4 = (DefaultMutableTreeNode)this.w(defaultMutableTreeNode5);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList2.add(defaultMutableTreeNode4);
                    n10 = arrayList.add(defaultMutableTreeNode5) ? 1 : 0;
                    if (stringArray == null) continue;
                }
                serializableArray = arrayList2.toArray(new DefaultMutableTreeNode[arrayList2.size()]);
            }
            DefaultMutableTreeNode[] defaultMutableTreeNodeArray = (DefaultMutableTreeNode[])serializableArray;
            this.L = arrayList.toArray(new DefaultMutableTreeNode[arrayList.size()]);
            return new xs_0(this, defaultMutableTreeNodeArray);
        }
        return null;
    }

    private DefaultMutableTreeNode w(TreeNode treeNode) {
        return new DefaultMutableTreeNode(treeNode);
    }

    @Override
    protected void exportDone(JComponent jComponent, Transferable transferable, int n10) {
        String[] stringArray = F8.y();
        if ((n10 & 2) == 2) {
            JTree jTree = (JTree)jComponent;
            DefaultTreeModel defaultTreeModel = (DefaultTreeModel)jTree.getModel();
            for (int i2 = 0; i2 < ((DefaultMutableTreeNode[])this.L).length; ++i2) {
                defaultTreeModel.removeNodeFromParent(((DefaultMutableTreeNode[])this.L)[i2]);
                if (stringArray == null) continue;
            }
        }
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 3;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        int n10;
        int n11;
        DefaultTreeModel defaultTreeModel;
        DefaultMutableTreeNode defaultMutableTreeNode;
        DefaultMutableTreeNode[] defaultMutableTreeNodeArray;
        String[] stringArray;
        block12: {
            int n12;
            block13: {
                Object object;
                block11: {
                    boolean bl;
                    block10: {
                        stringArray = F8.y();
                        try {
                            try {
                                bl = (Boolean)this.canImport(transferSupport);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (stringArray != null) break block10;
                            if (bl) break block11;
                        }
                        catch (UnsupportedFlavorException unsupportedFlavorException) {
                            throw T8.a(unsupportedFlavorException);
                        }
                        bl = false;
                    }
                    return bl;
                }
                defaultMutableTreeNodeArray = null;
                try {
                    object = transferSupport.getTransferable();
                    defaultMutableTreeNodeArray = (DefaultMutableTreeNode[])object.getTransferData((DataFlavor)this.u);
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                object = (JTree.DropLocation)transferSupport.getDropLocation();
                int n13 = ((JTree.DropLocation)object).getChildIndex();
                TreePath treePath = ((JTree.DropLocation)object).getPath();
                defaultMutableTreeNode = (DefaultMutableTreeNode)treePath.getLastPathComponent();
                JTree jTree = (JTree)transferSupport.getComponent();
                defaultTreeModel = (DefaultTreeModel)jTree.getModel();
                n11 = n13;
                try {
                    n12 = n13;
                    if (stringArray != null) break block12;
                    if (n12 != -1) break block13;
                }
                catch (UnsupportedFlavorException unsupportedFlavorException) {
                    throw T8.a(unsupportedFlavorException);
                }
                n11 = defaultMutableTreeNode.getChildCount();
            }
            n12 = n10 = 0;
        }
        while (n10 < defaultMutableTreeNodeArray.length) {
            defaultTreeModel.insertNodeInto(defaultMutableTreeNodeArray[n10], defaultMutableTreeNode, n11++);
            ++n10;
            if (stringArray == null) continue;
        }
        return true;
    }

    public String toString() {
        return this.getClass().getName();
    }

    private static UnsupportedFlavorException a(UnsupportedFlavorException unsupportedFlavorException) {
        return unsupportedFlavorException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u00f4\u0097;\u001a\u00cb*0=\u0098\u00aa\u00c3CH\u00e3\u0017/+3K\u00aa\u00fb\u001cP\u00b7\u0017\u00cf\u00ea\u00f6>\u00ea\u00b5OFF\u0019\u00b6\u0006\u0014\u00c8\u00f0\u00c2\u001c\u00c9\u0007\u0081%\u000fY\u0011\u00f9J\u00ba\u00f1I\u00ceW\u00d4\u00eb\u00cd)L\u00ee";
            var4_3 = "\u00f4\u0097;\u001a\u00cb*0=\u0098\u00aa\u00c3CH\u00e3\u0017/+3K\u00aa\u00fb\u001cP\u00b7\u0017\u00cf\u00ea\u00f6>\u00ea\u00b5OFF\u0019\u00b6\u0006\u0014\u00c8\u00f0\u00c2\u001c\u00c9\u0007\u0081%\u000fY\u0011\u00f9J\u00ba\u00f1I\u00ceW\u00d4\u00eb\u00cd)L\u00ee".length();
            var1_4 = 46;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 41;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 7;
                            break;
                        }
                        case 1: {
                            v11 = 94;
                            break;
                        }
                        case 2: {
                            v11 = 116;
                            break;
                        }
                        case 3: {
                            v11 = 61;
                            break;
                        }
                        case 4: {
                            v11 = 57;
                            break;
                        }
                        case 5: {
                            v11 = 64;
                            break;
                        }
                        default: {
                            v11 = 71;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        T8.a = var5;
        T8.b = new String[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6342) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 2;
                    break;
                }
                case 1: {
                    n14 = 179;
                    break;
                }
                case 2: {
                    n14 = 235;
                    break;
                }
                case 3: {
                    n14 = 66;
                    break;
                }
                case 4: {
                    n14 = 10;
                    break;
                }
                case 5: {
                    n14 = 4;
                    break;
                }
                case 6: {
                    n14 = 103;
                    break;
                }
                case 7: {
                    n14 = 161;
                    break;
                }
                case 8: {
                    n14 = 123;
                    break;
                }
                case 9: {
                    n14 = 213;
                    break;
                }
                case 10: {
                    n14 = 114;
                    break;
                }
                case 11: {
                    n14 = 171;
                    break;
                }
                case 12: {
                    n14 = 11;
                    break;
                }
                case 13: {
                    n14 = 215;
                    break;
                }
                case 14: {
                    n14 = 115;
                    break;
                }
                case 15: {
                    n14 = 96;
                    break;
                }
                case 16: {
                    n14 = 176;
                    break;
                }
                case 17: {
                    n14 = 217;
                    break;
                }
                case 18: {
                    n14 = 238;
                    break;
                }
                case 19: {
                    n14 = 150;
                    break;
                }
                case 20: {
                    n14 = 216;
                    break;
                }
                case 21: {
                    n14 = 212;
                    break;
                }
                case 22: {
                    n14 = 224;
                    break;
                }
                case 23: {
                    n14 = 73;
                    break;
                }
                case 24: {
                    n14 = 80;
                    break;
                }
                case 25: {
                    n14 = 62;
                    break;
                }
                case 26: {
                    n14 = 22;
                    break;
                }
                case 27: {
                    n14 = 63;
                    break;
                }
                case 28: {
                    n14 = 102;
                    break;
                }
                case 29: {
                    n14 = 142;
                    break;
                }
                case 30: {
                    n14 = 3;
                    break;
                }
                case 31: {
                    n14 = 94;
                    break;
                }
                case 32: {
                    n14 = 53;
                    break;
                }
                case 33: {
                    n14 = 24;
                    break;
                }
                case 34: {
                    n14 = 32;
                    break;
                }
                case 35: {
                    n14 = 126;
                    break;
                }
                case 36: {
                    n14 = 207;
                    break;
                }
                case 37: {
                    n14 = 71;
                    break;
                }
                case 38: {
                    n14 = 122;
                    break;
                }
                case 39: {
                    n14 = 232;
                    break;
                }
                case 40: {
                    n14 = 95;
                    break;
                }
                case 41: {
                    n14 = 42;
                    break;
                }
                case 42: {
                    n14 = 109;
                    break;
                }
                case 43: {
                    n14 = 56;
                    break;
                }
                case 44: {
                    n14 = 169;
                    break;
                }
                case 45: {
                    n14 = 28;
                    break;
                }
                case 46: {
                    n14 = 193;
                    break;
                }
                case 47: {
                    n14 = 192;
                    break;
                }
                case 48: {
                    n14 = 134;
                    break;
                }
                case 49: {
                    n14 = 140;
                    break;
                }
                case 50: {
                    n14 = 1;
                    break;
                }
                case 51: {
                    n14 = 39;
                    break;
                }
                case 52: {
                    n14 = 203;
                    break;
                }
                case 53: {
                    n14 = 61;
                    break;
                }
                case 54: {
                    n14 = 166;
                    break;
                }
                case 55: {
                    n14 = 198;
                    break;
                }
                case 56: {
                    n14 = 191;
                    break;
                }
                case 57: {
                    n14 = 18;
                    break;
                }
                case 58: {
                    n14 = 87;
                    break;
                }
                case 59: {
                    n14 = 8;
                    break;
                }
                case 60: {
                    n14 = 252;
                    break;
                }
                case 61: {
                    n14 = 99;
                    break;
                }
                case 62: {
                    n14 = 70;
                    break;
                }
                case 63: {
                    n14 = 21;
                    break;
                }
                case 64: {
                    n14 = 194;
                    break;
                }
                case 65: {
                    n14 = 236;
                    break;
                }
                case 66: {
                    n14 = 143;
                    break;
                }
                case 67: {
                    n14 = 33;
                    break;
                }
                case 68: {
                    n14 = 227;
                    break;
                }
                case 69: {
                    n14 = 92;
                    break;
                }
                case 70: {
                    n14 = 44;
                    break;
                }
                case 71: {
                    n14 = 245;
                    break;
                }
                case 72: {
                    n14 = 175;
                    break;
                }
                case 73: {
                    n14 = 144;
                    break;
                }
                case 74: {
                    n14 = 139;
                    break;
                }
                case 75: {
                    n14 = 97;
                    break;
                }
                case 76: {
                    n14 = 165;
                    break;
                }
                case 77: {
                    n14 = 85;
                    break;
                }
                case 78: {
                    n14 = 141;
                    break;
                }
                case 79: {
                    n14 = 243;
                    break;
                }
                case 80: {
                    n14 = 105;
                    break;
                }
                case 81: {
                    n14 = 7;
                    break;
                }
                case 82: {
                    n14 = 152;
                    break;
                }
                case 83: {
                    n14 = 221;
                    break;
                }
                case 84: {
                    n14 = 246;
                    break;
                }
                case 85: {
                    n14 = 121;
                    break;
                }
                case 86: {
                    n14 = 35;
                    break;
                }
                case 87: {
                    n14 = 5;
                    break;
                }
                case 88: {
                    n14 = 106;
                    break;
                }
                case 89: {
                    n14 = 78;
                    break;
                }
                case 90: {
                    n14 = 131;
                    break;
                }
                case 91: {
                    n14 = 77;
                    break;
                }
                case 92: {
                    n14 = 50;
                    break;
                }
                case 93: {
                    n14 = 177;
                    break;
                }
                case 94: {
                    n14 = 174;
                    break;
                }
                case 95: {
                    n14 = 38;
                    break;
                }
                case 96: {
                    n14 = 160;
                    break;
                }
                case 97: {
                    n14 = 147;
                    break;
                }
                case 98: {
                    n14 = 231;
                    break;
                }
                case 99: {
                    n14 = 136;
                    break;
                }
                case 100: {
                    n14 = 197;
                    break;
                }
                case 101: {
                    n14 = 86;
                    break;
                }
                case 102: {
                    n14 = 155;
                    break;
                }
                case 103: {
                    n14 = 64;
                    break;
                }
                case 104: {
                    n14 = 196;
                    break;
                }
                case 105: {
                    n14 = 81;
                    break;
                }
                case 106: {
                    n14 = 76;
                    break;
                }
                case 107: {
                    n14 = 211;
                    break;
                }
                case 108: {
                    n14 = 206;
                    break;
                }
                case 109: {
                    n14 = 27;
                    break;
                }
                case 110: {
                    n14 = 186;
                    break;
                }
                case 111: {
                    n14 = 34;
                    break;
                }
                case 112: {
                    n14 = 133;
                    break;
                }
                case 113: {
                    n14 = 43;
                    break;
                }
                case 114: {
                    n14 = 162;
                    break;
                }
                case 115: {
                    n14 = 29;
                    break;
                }
                case 116: {
                    n14 = 36;
                    break;
                }
                case 117: {
                    n14 = 226;
                    break;
                }
                case 118: {
                    n14 = 74;
                    break;
                }
                case 119: {
                    n14 = 52;
                    break;
                }
                case 120: {
                    n14 = 67;
                    break;
                }
                case 121: {
                    n14 = 26;
                    break;
                }
                case 122: {
                    n14 = 233;
                    break;
                }
                case 123: {
                    n14 = 19;
                    break;
                }
                case 124: {
                    n14 = 172;
                    break;
                }
                case 125: {
                    n14 = 41;
                    break;
                }
                case 126: {
                    n14 = 6;
                    break;
                }
                case 127: {
                    n14 = 90;
                    break;
                }
                case 128: {
                    n14 = 47;
                    break;
                }
                case 129: {
                    n14 = 49;
                    break;
                }
                case 130: {
                    n14 = 9;
                    break;
                }
                case 131: {
                    n14 = 241;
                    break;
                }
                case 132: {
                    n14 = 149;
                    break;
                }
                case 133: {
                    n14 = 25;
                    break;
                }
                case 134: {
                    n14 = 209;
                    break;
                }
                case 135: {
                    n14 = 101;
                    break;
                }
                case 136: {
                    n14 = 249;
                    break;
                }
                case 137: {
                    n14 = 120;
                    break;
                }
                case 138: {
                    n14 = 107;
                    break;
                }
                case 139: {
                    n14 = 153;
                    break;
                }
                case 140: {
                    n14 = 195;
                    break;
                }
                case 141: {
                    n14 = 14;
                    break;
                }
                case 142: {
                    n14 = 75;
                    break;
                }
                case 143: {
                    n14 = 135;
                    break;
                }
                case 144: {
                    n14 = 222;
                    break;
                }
                case 145: {
                    n14 = 220;
                    break;
                }
                case 146: {
                    n14 = 89;
                    break;
                }
                case 147: {
                    n14 = 189;
                    break;
                }
                case 148: {
                    n14 = 255;
                    break;
                }
                case 149: {
                    n14 = 108;
                    break;
                }
                case 150: {
                    n14 = 170;
                    break;
                }
                case 151: {
                    n14 = 119;
                    break;
                }
                case 152: {
                    n14 = 17;
                    break;
                }
                case 153: {
                    n14 = 159;
                    break;
                }
                case 154: {
                    n14 = 45;
                    break;
                }
                case 155: {
                    n14 = 40;
                    break;
                }
                case 156: {
                    n14 = 188;
                    break;
                }
                case 157: {
                    n14 = 250;
                    break;
                }
                case 158: {
                    n14 = 234;
                    break;
                }
                case 159: {
                    n14 = 59;
                    break;
                }
                case 160: {
                    n14 = 0;
                    break;
                }
                case 161: {
                    n14 = 88;
                    break;
                }
                case 162: {
                    n14 = 128;
                    break;
                }
                case 163: {
                    n14 = 182;
                    break;
                }
                case 164: {
                    n14 = 148;
                    break;
                }
                case 165: {
                    n14 = 30;
                    break;
                }
                case 166: {
                    n14 = 60;
                    break;
                }
                case 167: {
                    n14 = 168;
                    break;
                }
                case 168: {
                    n14 = 79;
                    break;
                }
                case 169: {
                    n14 = 132;
                    break;
                }
                case 170: {
                    n14 = 98;
                    break;
                }
                case 171: {
                    n14 = 156;
                    break;
                }
                case 172: {
                    n14 = 68;
                    break;
                }
                case 173: {
                    n14 = 178;
                    break;
                }
                case 174: {
                    n14 = 13;
                    break;
                }
                case 175: {
                    n14 = 183;
                    break;
                }
                case 176: {
                    n14 = 146;
                    break;
                }
                case 177: {
                    n14 = 214;
                    break;
                }
                case 178: {
                    n14 = 110;
                    break;
                }
                case 179: {
                    n14 = 46;
                    break;
                }
                case 180: {
                    n14 = 16;
                    break;
                }
                case 181: {
                    n14 = 37;
                    break;
                }
                case 182: {
                    n14 = 184;
                    break;
                }
                case 183: {
                    n14 = 251;
                    break;
                }
                case 184: {
                    n14 = 145;
                    break;
                }
                case 185: {
                    n14 = 31;
                    break;
                }
                case 186: {
                    n14 = 151;
                    break;
                }
                case 187: {
                    n14 = 138;
                    break;
                }
                case 188: {
                    n14 = 83;
                    break;
                }
                case 189: {
                    n14 = 157;
                    break;
                }
                case 190: {
                    n14 = 248;
                    break;
                }
                case 191: {
                    n14 = 116;
                    break;
                }
                case 192: {
                    n14 = 127;
                    break;
                }
                case 193: {
                    n14 = 93;
                    break;
                }
                case 194: {
                    n14 = 55;
                    break;
                }
                case 195: {
                    n14 = 48;
                    break;
                }
                case 196: {
                    n14 = 254;
                    break;
                }
                case 197: {
                    n14 = 82;
                    break;
                }
                case 198: {
                    n14 = 72;
                    break;
                }
                case 199: {
                    n14 = 104;
                    break;
                }
                case 200: {
                    n14 = 200;
                    break;
                }
                case 201: {
                    n14 = 111;
                    break;
                }
                case 202: {
                    n14 = 240;
                    break;
                }
                case 203: {
                    n14 = 201;
                    break;
                }
                case 204: {
                    n14 = 163;
                    break;
                }
                case 205: {
                    n14 = 54;
                    break;
                }
                case 206: {
                    n14 = 23;
                    break;
                }
                case 207: {
                    n14 = 158;
                    break;
                }
                case 208: {
                    n14 = 244;
                    break;
                }
                case 209: {
                    n14 = 239;
                    break;
                }
                case 210: {
                    n14 = 205;
                    break;
                }
                case 211: {
                    n14 = 204;
                    break;
                }
                case 212: {
                    n14 = 117;
                    break;
                }
                case 213: {
                    n14 = 237;
                    break;
                }
                case 214: {
                    n14 = 137;
                    break;
                }
                case 215: {
                    n14 = 167;
                    break;
                }
                case 216: {
                    n14 = 124;
                    break;
                }
                case 217: {
                    n14 = 208;
                    break;
                }
                case 218: {
                    n14 = 12;
                    break;
                }
                case 219: {
                    n14 = 187;
                    break;
                }
                case 220: {
                    n14 = 130;
                    break;
                }
                case 221: {
                    n14 = 218;
                    break;
                }
                case 222: {
                    n14 = 181;
                    break;
                }
                case 223: {
                    n14 = 154;
                    break;
                }
                case 224: {
                    n14 = 100;
                    break;
                }
                case 225: {
                    n14 = 58;
                    break;
                }
                case 226: {
                    n14 = 125;
                    break;
                }
                case 227: {
                    n14 = 57;
                    break;
                }
                case 228: {
                    n14 = 228;
                    break;
                }
                case 229: {
                    n14 = 229;
                    break;
                }
                case 230: {
                    n14 = 242;
                    break;
                }
                case 231: {
                    n14 = 129;
                    break;
                }
                case 232: {
                    n14 = 180;
                    break;
                }
                case 233: {
                    n14 = 65;
                    break;
                }
                case 234: {
                    n14 = 225;
                    break;
                }
                case 235: {
                    n14 = 223;
                    break;
                }
                case 236: {
                    n14 = 118;
                    break;
                }
                case 237: {
                    n14 = 51;
                    break;
                }
                case 238: {
                    n14 = 190;
                    break;
                }
                case 239: {
                    n14 = 91;
                    break;
                }
                case 240: {
                    n14 = 173;
                    break;
                }
                case 241: {
                    n14 = 219;
                    break;
                }
                case 242: {
                    n14 = 210;
                    break;
                }
                case 243: {
                    n14 = 69;
                    break;
                }
                case 244: {
                    n14 = 185;
                    break;
                }
                case 245: {
                    n14 = 253;
                    break;
                }
                case 246: {
                    n14 = 112;
                    break;
                }
                case 247: {
                    n14 = 84;
                    break;
                }
                case 248: {
                    n14 = 113;
                    break;
                }
                case 249: {
                    n14 = 199;
                    break;
                }
                case 250: {
                    n14 = 230;
                    break;
                }
                case 251: {
                    n14 = 202;
                    break;
                }
                case 252: {
                    n14 = 247;
                    break;
                }
                case 253: {
                    n14 = 20;
                    break;
                }
                case 254: {
                    n14 = 15;
                    break;
                }
                default: {
                    n14 = 164;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            T8.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

