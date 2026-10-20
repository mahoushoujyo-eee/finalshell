/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.cz_0;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class nK
extends TransferHandler {
    DataFlavor J;
    DataFlavor N;
    DataFlavor[] w;
    DefaultMutableTreeNode[] A;
    DefaultMutableTreeNode q;
    a3 B;
    private static final String[] a;
    private static final String[] b;

    public nK(a3 a32) {
        this.w = new DataFlavor[1];
        this.B = a32;
        try {
            String string = "application/x-java-jvm-local-objectref;class=\"" + DefaultMutableTreeNode[].class.getName() + "\"";
            this.J = new DataFlavor(string);
            ((DataFlavor[])c.c((long)495072085072944463L).get((Object)this))[0] = (DataFlavor)this.J;
            String string2 = "application/x-java-jvm-local-objectref;class=\"" + Object.class.getName() + "\"";
            this.N = new DataFlavor(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport var1_1) {
        block49: {
            block43: {
                block44: {
                    block47: {
                        block48: {
                            block45: {
                                block46: {
                                    block39: {
                                        block40: {
                                            block41: {
                                                block42: {
                                                    block37: {
                                                        block38: {
                                                            block36: {
                                                                var2_2 = a3.I();
                                                                v0 = var1_1.isDrop();
                                                                if (var2_2 == null) break block36;
                                                                if (!v0) {
                                                                    return false;
                                                                }
                                                                var1_1.setShowDropLocation(true);
                                                                v1 = var1_1;
                                                                if (var2_2 == null) break block37;
                                                                v0 = v1.isDataFlavorSupported((DataFlavor)this.J);
                                                            }
                                                            if (!v0) break block38;
                                                            v1 = var1_1;
                                                            if (var2_2 == null) break block37;
                                                            if (v1.isDataFlavorSupported((DataFlavor)this.N)) {
                                                                v1 = var1_1;
                                                                if (var2_2 != null) {
                                                                    if (!v1.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                                                                        return false;
                                                                    } else {
                                                                        ** GOTO lbl21
                                                                    }
                                                                } else {
                                                                    ** GOTO lbl20
                                                                }
                                                            }
                                                            break block38;
lbl20:
                                                            // 2 sources

                                                            break block37;
                                                        }
                                                        v1 = var1_1;
                                                    }
                                                    var3_3 = (JTree.DropLocation)v1.getDropLocation();
                                                    var4_4 = var3_3.getPath();
                                                    var5_5 = 0;
                                                    v2 = var3_3.getChildIndex();
                                                    if (var2_2 != null && v2 > -1) {
                                                        v2 = var5_5 = 1;
                                                    }
                                                    if ((DefaultMutableTreeNode)this.q == null) ** GOTO lbl-1000
                                                    var6_6 = new TreePath(((DefaultMutableTreeNode)this.q).getPath());
                                                    if (var6_6.isDescendant(var4_4)) {
                                                        // empty if block
                                                    }
                                                    v3 = var4_4;
                                                    if (var2_2 == null) break block39;
                                                    if (v3 == null) break block40;
                                                    v3 = var4_4;
                                                    if (var2_2 == null) break block39;
                                                    if (!v3.isDescendant(var6_6)) break block40;
                                                    v3 = var6_6.getParentPath();
                                                    if (var2_2 == null) break block39;
                                                    if (!v3.equals(var4_4)) break block40;
                                                    v4 = var3_3.getChildIndex();
                                                    if (var2_2 == null) break block41;
                                                    if (v4 == ((DefaultMutableTreeNode)this.q).getParent().getIndex((DefaultMutableTreeNode)this.q)) break block42;
                                                    v3 = var3_3;
                                                    if (var2_2 == null) break block39;
                                                    if (v3.getChildIndex() != ((DefaultMutableTreeNode)this.q).getParent().getIndex((DefaultMutableTreeNode)this.q) + 1) break block40;
                                                }
                                                v4 = 0;
                                            }
                                            return (boolean)v4;
                                        }
                                        v3 = ((DefaultMutableTreeNode)this.q).getUserObject();
                                    }
                                    var7_7 = v3.getClass();
                                    var8_8 = (JTree.DropLocation)var1_1.getDropLocation();
                                    var9_9 = var8_8.getChildIndex();
                                    var10_10 = var8_8.getPath();
                                    var11_11 = (DefaultMutableTreeNode)var10_10.getLastPathComponent();
                                    var12_12 = var11_11.getUserObject().getClass();
                                    v5 = var7_7.equals(tf_2.class);
                                    if (var2_2 != null) {
                                        if (v5) {
                                            v5 = var12_12.equals(ck_2.class);
                                            if (var2_2 != null) {
                                                if (v5) {
                                                    return false;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v5 = var7_7.equals(ck_2.class);
                                        }
                                    }
                                    if (var2_2 != null) {
                                        if (v5) {
                                            v5 = var12_12.equals(ck_2.class);
                                            if (var2_2 != null) {
                                                if (v5) {
                                                    return false;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v5 = var6_6.getParentPath().equals(var4_4);
                                        }
                                    }
                                    if (var2_2 == null) break block43;
                                    if (!v5) break block44;
                                    v5 = var7_7.equals(ck_2.class);
                                    if (var2_2 == null) break block45;
                                    if (!v5) break block46;
                                    v6 = var12_12.equals(tf_2.class);
                                    if (var2_2 == null) break block47;
                                    if (v6 != 0) break block48;
                                }
                                v5 = var7_7.equals(tf_2.class);
                            }
                            if (var2_2 == null) break block43;
                            if (!v5) break block44;
                            v5 = var12_12.equals(tf_2.class);
                            if (var2_2 == null) break block43;
                            if (!v5) break block44;
                        }
                        v6 = var9_9;
                    }
                    if (v6 == -1) {
                        // empty if block
                    }
                }
                v5 = var6_6.equals(var4_4);
            }
            if (var2_2 != null) {
                if (v5) {
                    return false;
                }
                v5 = var12_12.equals(tf_2.class);
            }
            if (var2_2 != null) {
                ** if (v5) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    v5 = var12_12.equals(ck_2.class);
                    if (var2_2 != null) {
                        if (!v5) {
                            return false;
                        } else {
                            ** GOTO lbl-1000
                        }
                    } else {
                        ** GOTO lbl113
                    }
lbl113:
                    // 2 sources

                    ** GOTO lbl116
                }
            }
            break block49;
lbl-1000:
            // 4 sources

            {
                v5 = true;
            }
        }
        return v5;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        JTree jTree = (JTree)jComponent;
        int[] nArray = a3.I();
        TreePath[] treePathArray = jTree.getSelectionPaths();
        if (treePathArray != null) {
            Serializable[] serializableArray;
            ArrayList<DefaultMutableTreeNode> arrayList;
            block10: {
                DefaultMutableTreeNode defaultMutableTreeNode;
                ArrayList<DefaultMutableTreeNode> arrayList2 = new ArrayList<DefaultMutableTreeNode>();
                arrayList = new ArrayList<DefaultMutableTreeNode>();
                this.q = (DefaultMutableTreeNode)treePathArray[0].getLastPathComponent();
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.P(this.q);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                arrayList2.add(defaultMutableTreeNode2);
                arrayList.add((DefaultMutableTreeNode)this.q);
                for (int i2 = 1; i2 < treePathArray.length; ++i2) {
                    DefaultMutableTreeNode defaultMutableTreeNode3;
                    serializableArray = treePathArray;
                    if (nArray == null) break block10;
                    DefaultMutableTreeNode defaultMutableTreeNode4 = (DefaultMutableTreeNode)serializableArray[i2].getLastPathComponent();
                    int n10 = defaultMutableTreeNode4.getLevel();
                    int n11 = ((DefaultMutableTreeNode)this.q).getLevel();
                    if (nArray != null) {
                        if (n10 < n11 && nArray != null) break;
                        n10 = defaultMutableTreeNode4.getLevel();
                        if (nArray == null) continue;
                        n11 = ((DefaultMutableTreeNode)this.q).getLevel();
                    }
                    if (n10 > n11) {
                        DefaultMutableTreeNode defaultMutableTreeNode5;
                        try {
                            defaultMutableTreeNode5 = (DefaultMutableTreeNode)this.P(defaultMutableTreeNode4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        defaultMutableTreeNode2.add(defaultMutableTreeNode5);
                        if (nArray != null) continue;
                    }
                    try {
                        defaultMutableTreeNode3 = (DefaultMutableTreeNode)this.P(defaultMutableTreeNode4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList2.add(defaultMutableTreeNode3);
                    n10 = arrayList.add(defaultMutableTreeNode4) ? 1 : 0;
                    if (nArray != null) continue;
                }
                serializableArray = arrayList2.toArray(new DefaultMutableTreeNode[arrayList2.size()]);
            }
            DefaultMutableTreeNode[] defaultMutableTreeNodeArray = (DefaultMutableTreeNode[])serializableArray;
            this.A = arrayList.toArray(new DefaultMutableTreeNode[arrayList.size()]);
            return new t0_0(this, defaultMutableTreeNodeArray);
        }
        return null;
    }

    private DefaultMutableTreeNode P(TreeNode treeNode) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)treeNode;
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode();
        defaultMutableTreeNode2.setUserObject(defaultMutableTreeNode.getUserObject());
        return defaultMutableTreeNode2;
    }

    @Override
    protected void exportDone(JComponent jComponent, Transferable transferable, int n10) {
        if ((n10 & 2) == 2) {
            JTree jTree = (JTree)jComponent;
            DefaultTreeModel defaultTreeModel = (DefaultTreeModel)jTree.getModel();
        }
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 2;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport var1_1) {
        block208: {
            block200: {
                block221: {
                    block220: {
                        block216: {
                            block209: {
                                block210: {
                                    block197: {
                                        block198: {
                                            block201: {
                                                block202: {
                                                    block205: {
                                                        block207: {
                                                            block206: {
                                                                block203: {
                                                                    block199: {
                                                                        block226: {
                                                                            block225: {
                                                                                block196: {
                                                                                    block195: {
                                                                                        block194: {
                                                                                            block193: {
                                                                                                block191: {
                                                                                                    block192: {
                                                                                                        var2_2 = a3.I();
                                                                                                        v0 = this;
                                                                                                        if (var2_2 == null) break block191;
                                                                                                        try {
                                                                                                            block222: {
                                                                                                                try {
                                                                                                                    v1 = (Boolean)v0.canImport(var1_1);
                                                                                                                }
                                                                                                                catch (InvocationTargetException v2) {
                                                                                                                    throw v2.getTargetException();
                                                                                                                }
                                                                                                                if (v1) break block192;
                                                                                                                break block222;
                                                                                                                catch (UnsupportedFlavorException v3) {
                                                                                                                    throw nK.a(v3);
                                                                                                                }
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        catch (UnsupportedFlavorException v4) {
                                                                                                            throw nK.a(v4);
                                                                                                        }
                                                                                                    }
                                                                                                    v0 = this;
                                                                                                }
                                                                                                var3_3 = (a3)v0.B;
                                                                                                var4_4 = (JTree.DropLocation)var1_1.getDropLocation();
                                                                                                var5_5 = var4_4.getDropPoint();
                                                                                                var6_6 = var4_4.getChildIndex();
                                                                                                var7_7 = var4_4.getPath();
                                                                                                var8_8 = (DefaultMutableTreeNode)var7_7.getLastPathComponent();
                                                                                                try {
                                                                                                    v5 = (DefaultMutableTreeNode)var3_3.o(var5_5);
                                                                                                }
                                                                                                catch (InvocationTargetException v6) {
                                                                                                    throw v6.getTargetException();
                                                                                                }
                                                                                                var9_9 = v5;
                                                                                                try {
                                                                                                    v7 = (DefaultMutableTreeNode)var3_3.p(var5_5);
                                                                                                }
                                                                                                catch (InvocationTargetException v8) {
                                                                                                    throw v8.getTargetException();
                                                                                                }
                                                                                                var9_9 = v7;
                                                                                                try {
                                                                                                    v9 = (F6)this.B.R();
                                                                                                }
                                                                                                catch (InvocationTargetException v10) {
                                                                                                    throw v10.getTargetException();
                                                                                                }
                                                                                                var10_10 = v9;
                                                                                                var11_11 = 0;
                                                                                                v11 = var6_6;
                                                                                                if (var2_2 == null) break block193;
                                                                                                try {
                                                                                                    block223: {
                                                                                                        if (v11 <= -1) break block194;
                                                                                                        break block223;
                                                                                                        catch (UnsupportedFlavorException v12) {
                                                                                                            throw nK.a(v12);
                                                                                                        }
                                                                                                    }
                                                                                                    v11 = 1;
                                                                                                }
                                                                                                catch (UnsupportedFlavorException v13) {
                                                                                                    throw nK.a(v13);
                                                                                                }
                                                                                            }
                                                                                            var11_11 = v11;
                                                                                        }
                                                                                        v14 = var9_9;
                                                                                        if (var2_2 == null) break block195;
                                                                                        try {
                                                                                            block224: {
                                                                                                if (v14 == null) break block196;
                                                                                                break block224;
                                                                                                catch (UnsupportedFlavorException v15) {
                                                                                                    throw nK.a(v15);
                                                                                                }
                                                                                            }
                                                                                            v14 = (DefaultMutableTreeNode)var9_9.getParent();
                                                                                        }
                                                                                        catch (UnsupportedFlavorException v16) {
                                                                                            throw nK.a(v16);
                                                                                        }
                                                                                    }
                                                                                    var12_12 = v14;
                                                                                    var13_13 = var9_9.getUserObject();
                                                                                    try {
                                                                                        v17 = (Rectangle)var3_3.f(var9_9);
                                                                                    }
                                                                                    catch (InvocationTargetException v18) {
                                                                                        throw v18.getTargetException();
                                                                                    }
                                                                                    var14_14 = v17;
                                                                                }
                                                                                var12_12 = (fy_0)((a3)this.B).getModel();
                                                                                var13_13 = null;
                                                                                var14_14 = var1_1.getTransferable();
                                                                                var15_15 = var14_14.getTransferDataFlavors()[0];
                                                                                for (Object var19_30 : var14_14.getTransferDataFlavors()) {
                                                                                    try {
                                                                                        var20_33 = var14_14.getTransferData((DataFlavor)var19_30);
                                                                                        continue;
                                                                                    }
                                                                                    catch (UnsupportedFlavorException var20_34) {
                                                                                        var20_34.printStackTrace();
                                                                                        continue;
                                                                                    }
                                                                                    catch (IOException var20_35) {
                                                                                        var20_35.printStackTrace();
                                                                                    }
                                                                                    if (var2_2 != null) continue;
                                                                                }
                                                                                var16_16 /* !! */  = SwingUtilities.windowForComponent((a3)this.B);
                                                                                v19 = var15_15.equals((DataFlavor)this.J);
                                                                                if (var2_2 == null) break block197;
                                                                                if (!v19) break block198;
                                                                                break block225;
                                                                                catch (UnsupportedFlavorException v20) {
                                                                                    throw nK.a(v20);
                                                                                }
                                                                            }
                                                                            v21 = (DefaultMutableTreeNode)this.q;
                                                                            if (var2_2 == null) break block199;
                                                                            break block226;
                                                                            catch (UnsupportedFlavorException v22) {
                                                                                throw nK.a(v22);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block227: {
                                                                                if (v21 == null) break block200;
                                                                                break block227;
                                                                                catch (UnsupportedFlavorException v23) {
                                                                                    throw nK.a(v23);
                                                                                }
                                                                            }
                                                                            v21 = ((DefaultMutableTreeNode)this.q).getUserObject();
                                                                        }
                                                                        catch (UnsupportedFlavorException v24) {
                                                                            throw nK.a(v24);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v19 = v21.getClass().equals(ck_2.class);
                                                                        if (var2_2 == null) break block201;
                                                                        if (!v19) break block202;
                                                                    }
                                                                    catch (UnsupportedFlavorException v25) {
                                                                        throw nK.a(v25);
                                                                    }
                                                                    var17_18 = (ck_2)((DefaultMutableTreeNode)this.q).getUserObject();
                                                                    try {
                                                                        v26 = (File)var17_18.i();
                                                                    }
                                                                    catch (InvocationTargetException v27) {
                                                                        throw v27.getTargetException();
                                                                    }
                                                                    var18_23 = v26.getAbsolutePath();
                                                                    try {
                                                                        v28 = (File)var17_18.i();
                                                                    }
                                                                    catch (InvocationTargetException v29) {
                                                                        throw v29.getTargetException();
                                                                    }
                                                                    var19_30 = v28.getParentFile().getAbsolutePath();
                                                                    try {
                                                                        v30 = (TreePath)var3_3.g(var4_4.getDropPoint());
                                                                    }
                                                                    catch (InvocationTargetException v31) {
                                                                        throw v31.getTargetException();
                                                                    }
                                                                    var20_33 = v30;
                                                                    var21_37 = var3_3.getPathBounds((TreePath)var20_33);
                                                                    var22_40 = (tf_2)var8_8.getUserObject();
                                                                    try {
                                                                        v32 = (File)var22_40.M();
                                                                    }
                                                                    catch (InvocationTargetException v33) {
                                                                        throw v33.getTargetException();
                                                                    }
                                                                    try {
                                                                        v34 = (File)var17_18.i();
                                                                    }
                                                                    catch (InvocationTargetException v35) {
                                                                        throw v35.getTargetException();
                                                                    }
                                                                    var23_43 = v32.getAbsolutePath() + File.separator + v34.getName();
                                                                    var24_46 = new File(var23_43);
                                                                    try {
                                                                        v36 = (DefaultMutableTreeNode)this.B.M(var19_30);
                                                                    }
                                                                    catch (InvocationTargetException v37) {
                                                                        throw v37.getTargetException();
                                                                    }
                                                                    var25_49 = v36;
                                                                    var12_12.removeNodeFromParent((DefaultMutableTreeNode)this.q);
                                                                    var26_52 = (tf_2)var25_49.getUserObject();
                                                                    try {
                                                                        var26_52.F(var18_23);
                                                                    }
                                                                    catch (InvocationTargetException v38) {
                                                                        throw v38.getTargetException();
                                                                    }
                                                                    try {
                                                                        this.B.M(var18_23);
                                                                    }
                                                                    catch (InvocationTargetException v39) {
                                                                        throw v39.getTargetException();
                                                                    }
                                                                    try {
                                                                        v40 = (File)var22_40.M();
                                                                    }
                                                                    catch (InvocationTargetException v41) {
                                                                        throw v41.getTargetException();
                                                                    }
                                                                    v42 = var19_30.equals(v40.getAbsolutePath());
                                                                    if (var2_2 == null) break block203;
                                                                    try {
                                                                        block228: {
                                                                            if (v42) break block203;
                                                                            break block228;
                                                                            catch (UnsupportedFlavorException v43) {
                                                                                throw nK.a(v43);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v44 = (File)var17_18.i();
                                                                        }
                                                                        catch (InvocationTargetException v45) {
                                                                            throw v45.getTargetException();
                                                                        }
                                                                        cz_0.v(v44, var24_46);
                                                                        try {
                                                                            v46 = (File)var17_18.i();
                                                                        }
                                                                        catch (InvocationTargetException v47) {
                                                                            throw v47.getTargetException();
                                                                        }
                                                                        v42 = v46.delete();
                                                                    }
                                                                    catch (UnsupportedFlavorException v48) {
                                                                        throw nK.a(v48);
                                                                    }
                                                                }
                                                                var27_55 = new ck_2();
                                                                try {
                                                                    var27_55.N(var24_46);
                                                                }
                                                                catch (InvocationTargetException v49) {
                                                                    throw v49.getTargetException();
                                                                }
                                                                try {
                                                                    v50 = (List)var22_40.M();
                                                                }
                                                                catch (InvocationTargetException v51) {
                                                                    throw v51.getTargetException();
                                                                }
                                                                v50.add(var27_55);
                                                                try {
                                                                    try {
                                                                        v52 = yt_1.i();
                                                                    }
                                                                    catch (InvocationTargetException v53) {
                                                                        throw v53.getTargetException();
                                                                    }
                                                                    try {
                                                                        v54 = v52.g();
                                                                    }
                                                                    catch (InvocationTargetException v55) {
                                                                        throw v55.getTargetException();
                                                                    }
                                                                    try {
                                                                        v54.c(var23_43);
                                                                    }
                                                                    catch (InvocationTargetException v56) {
                                                                        throw v56.getTargetException();
                                                                    }
                                                                }
                                                                catch (Exception var28_57) {
                                                                    var28_57.printStackTrace();
                                                                }
                                                                var28_58 = new DefaultMutableTreeNode(var27_55);
                                                                try {
                                                                    try {
                                                                        this.B.F((Object)var28_58, (Object)var27_55);
                                                                    }
                                                                    catch (InvocationTargetException v57) {
                                                                        throw v57.getTargetException();
                                                                    }
                                                                    v58 = var19_30;
                                                                    if (var2_2 == null) break block205;
                                                                    try {
                                                                        v59 = (File)var22_40.M();
                                                                    }
                                                                    catch (InvocationTargetException v60) {
                                                                        throw v60.getTargetException();
                                                                    }
                                                                    if (v58.equals(v59.getAbsolutePath())) break block206;
                                                                }
                                                                catch (UnsupportedFlavorException v61) {
                                                                    throw nK.a(v61);
                                                                }
                                                                var6_6 = var4_4.getChildIndex();
                                                                try {
                                                                    if (var2_2 == null) break block207;
                                                                    if (var6_6 != -1) break block206;
                                                                }
                                                                catch (UnsupportedFlavorException v62) {
                                                                    throw nK.a(v62);
                                                                }
                                                                var6_6 = 0;
                                                            }
                                                            var12_12.insertNodeInto(var28_58, var8_8, var6_6);
                                                        }
                                                        v58 = new File(var23_43).getParentFile().getAbsolutePath();
                                                    }
                                                    var29_59 = v58;
                                                    try {
                                                        v63 = (DefaultMutableTreeNode)this.B.M(var29_59);
                                                    }
                                                    catch (InvocationTargetException v64) {
                                                        throw v64.getTargetException();
                                                    }
                                                    var30_60 = v63;
                                                    ((a3)this.B).expandPath(new TreePath(var8_8.getPath()));
                                                    try {
                                                        this.B.A(var28_58);
                                                    }
                                                    catch (InvocationTargetException v65) {
                                                        throw v65.getTargetException();
                                                    }
                                                }
                                                v19 = ((DefaultMutableTreeNode)this.q).getUserObject().getClass().equals(tf_2.class);
                                            }
                                            try {
                                                if (var2_2 == null) break block208;
                                                if (!v19) break block200;
                                            }
                                            catch (UnsupportedFlavorException v66) {
                                                throw nK.a(v66);
                                            }
                                            var17_19 = (tf_2)((DefaultMutableTreeNode)this.q).getUserObject();
                                            var18_24 = (tf_2)var8_8.getUserObject();
                                            try {
                                                v67 = (String)var17_19.k();
                                            }
                                            catch (InvocationTargetException v68) {
                                                throw v68.getTargetException();
                                            }
                                            try {
                                                v69 = (String)var18_24.k();
                                            }
                                            catch (InvocationTargetException v70) {
                                                throw v70.getTargetException();
                                            }
                                            var19_31 = JOptionPane.showConfirmDialog((Component)var16_16 /* !! */ , "是否将目录： " + v67 + "" + v69 + "", "提醒", 2);
                                            try {
                                                if (var19_31 != 0) ** GOTO lbl662
                                                try {
                                                    yt_1.F.J(new kc_1(this, var3_3, var17_19, var18_24));
                                                }
                                                catch (InvocationTargetException v71) {
                                                    throw v71.getTargetException();
                                                }
                                            }
                                            catch (UnsupportedFlavorException v72) {
                                                throw nK.a(v72);
                                            }
                                        }
                                        v19 = var15_15.equals((DataFlavor)this.N);
                                    }
                                    try {
                                        if (var2_2 == null) break block209;
                                        if (!v19) break block210;
                                    }
                                    catch (UnsupportedFlavorException v73) {
                                        throw nK.a(v73);
                                    }
                                    var17_20 = null;
                                    try {
                                        var17_20 = (Object[])var14_14.getTransferData((DataFlavor)this.N);
                                    }
                                    catch (Exception var18_25) {
                                        var18_25.printStackTrace();
                                    }
                                    var18_26 = var17_20;
                                    var19_32 = var18_26.length;
                                    var20_36 = 0;
                                    while (var20_36 < var19_32) {
                                        block215: {
                                            block213: {
                                                block214: {
                                                    block211: {
                                                        block212: {
                                                            var21_38 = var18_26[var20_36];
                                                            v19 = var21_38.getClass().equals(tf_2.class);
                                                            if (var2_2 == null) break block208;
                                                            try {
                                                                block229: {
                                                                    if (var2_2 == null) break block211;
                                                                    break block229;
                                                                    catch (UnsupportedFlavorException v74) {
                                                                        throw nK.a(v74);
                                                                    }
                                                                }
                                                                if (v19) {
                                                                }
                                                                ** GOTO lbl430
                                                            }
                                                            catch (UnsupportedFlavorException v75) {
                                                                throw nK.a(v75);
                                                            }
                                                            var22_41 /* !! */  = (tf_2)var21_38;
                                                            var23_44 = (tf_2)var8_8.getUserObject();
                                                            try {
                                                                v76 = (zD)var3_3.N();
                                                            }
                                                            catch (InvocationTargetException v77) {
                                                                throw v77.getTargetException();
                                                            }
                                                            var24_47 = v76;
                                                            try {
                                                                v78 = var22_41 /* !! */.k();
                                                            }
                                                            catch (InvocationTargetException v79) {
                                                                throw v79.getTargetException();
                                                            }
                                                            try {
                                                                v80 = (String)lk_0.e(v78);
                                                            }
                                                            catch (InvocationTargetException v81) {
                                                                throw v81.getTargetException();
                                                            }
                                                            var25_50 = v80;
                                                            try {
                                                                v82 = (String)var22_41 /* !! */.k();
                                                            }
                                                            catch (InvocationTargetException v83) {
                                                                throw v83.getTargetException();
                                                            }
                                                            try {
                                                                v84 = (String)var23_44.k();
                                                            }
                                                            catch (InvocationTargetException v85) {
                                                                throw v85.getTargetException();
                                                            }
                                                            var26_53 = JOptionPane.showConfirmDialog((Component)var16_16 /* !! */ , "是否将目录： " + v82 + "" + v84 + "", "提醒", 2);
                                                            try {
                                                                if (var26_53 != 0) break block212;
                                                                try {
                                                                    yt_1.F.J(new m2(this, var24_47, (tf_2)var22_41 /* !! */ , var23_44, var25_50, var3_3));
                                                                }
                                                                catch (InvocationTargetException v86) {
                                                                    throw v86.getTargetException();
                                                                }
                                                            }
                                                            catch (UnsupportedFlavorException v87) {
                                                                throw nK.a(v87);
                                                            }
                                                        }
                                                        if (var2_2 != null) break block213;
lbl430:
                                                        // 2 sources

                                                        try {
                                                            block230: {
                                                                v88 = var21_38.getClass();
                                                                if (var2_2 == null) break block214;
                                                                break block230;
                                                                catch (UnsupportedFlavorException v89) {
                                                                    throw nK.a(v89);
                                                                }
                                                            }
                                                            v90 = v88.equals(ck_2.class);
                                                        }
                                                        catch (UnsupportedFlavorException v91) {
                                                            throw nK.a(v91);
                                                        }
                                                    }
                                                    if (!v90) break block213;
                                                    v88 = var21_38;
                                                }
                                                var22_41 /* !! */  = (ck_2)v88;
                                                var23_44 = (tf_2)var8_8.getUserObject();
                                                try {
                                                    v92 = (zD)var3_3.N();
                                                }
                                                catch (InvocationTargetException v93) {
                                                    throw v93.getTargetException();
                                                }
                                                var24_47 = v92;
                                                try {
                                                    v94 = var22_41 /* !! */.d();
                                                }
                                                catch (InvocationTargetException v95) {
                                                    throw v95.getTargetException();
                                                }
                                                try {
                                                    v96 = (String)lk_0.e(v94);
                                                }
                                                catch (InvocationTargetException v97) {
                                                    throw v97.getTargetException();
                                                }
                                                var25_50 = v96;
                                                try {
                                                    v98 = (String)var22_41 /* !! */.d();
                                                }
                                                catch (InvocationTargetException v99) {
                                                    throw v99.getTargetException();
                                                }
                                                try {
                                                    v100 = (String)var23_44.k();
                                                }
                                                catch (InvocationTargetException v101) {
                                                    throw v101.getTargetException();
                                                }
                                                var26_53 = JOptionPane.showConfirmDialog((Component)var16_16 /* !! */ , "是否将文件： " + v98 + "" + v100 + "", "提醒", 2);
                                                if (var2_2 == null) break block215;
                                                try {
                                                    block231: {
                                                        if (var26_53 != 0) break block213;
                                                        break block231;
                                                        catch (UnsupportedFlavorException v102) {
                                                            throw nK.a(v102);
                                                        }
                                                    }
                                                    try {
                                                        yt_1.F.J(new uu_1(this, var24_47, var22_41 /* !! */ , var23_44, var25_50, var3_3));
                                                    }
                                                    catch (InvocationTargetException v103) {
                                                        throw v103.getTargetException();
                                                    }
                                                }
                                                catch (UnsupportedFlavorException v104) {
                                                    throw nK.a(v104);
                                                }
                                            }
                                            ++var20_36;
                                        }
                                        if (var2_2 != null) continue;
                                        break block200;
                                    }
                                    break block200;
                                }
                                v19 = var15_15.equals(DataFlavor.javaFileListFlavor);
                            }
                            try {
                                if (var2_2 == null) break block208;
                                if (!v19) break block200;
                            }
                            catch (UnsupportedFlavorException v105) {
                                throw nK.a(v105);
                            }
                            var17_21 = null;
                            try {
                                var17_21 = (List)var14_14.getTransferData(DataFlavor.javaFileListFlavor);
                            }
                            catch (UnsupportedFlavorException var18_27) {
                                var18_27.printStackTrace();
                            }
                            catch (IOException var18_28) {
                                var18_28.printStackTrace();
                            }
                            for (Object var19_30 : var17_21) {
                                if (var2_2 != null) continue;
                            }
                            var18_29 = new ArrayList<E>();
                            var19_30 = new ArrayList<E>();
                            var20_33 = null;
                            var21_39 = (tf_2)var8_8.getUserObject();
                            try {
                                v106 = (String)var21_39.k();
                            }
                            catch (InvocationTargetException v107) {
                                throw v107.getTargetException();
                            }
                            var22_42 = v106;
                            var23_45 = var17_21.iterator();
                            block185: while (true) {
                                v108 = var23_45.hasNext();
                                block186: while (v108) {
                                    block217: {
                                        var24_48 /* !! */  = (File)var23_45.next();
                                        var20_33 = var24_48 /* !! */ .getParent();
                                        try {
                                            try {
                                                v109 = var24_48 /* !! */ .isDirectory();
                                                if (var2_2 == null) break block216;
                                                if (var2_2 == null) break block217;
                                            }
                                            catch (UnsupportedFlavorException v110) {
                                                throw nK.a(v110);
                                            }
                                            if (v109) {
                                            }
                                            ** GOTO lbl584
                                        }
                                        catch (UnsupportedFlavorException v111) {
                                            throw nK.a(v111);
                                        }
                                        var18_29.add(new File(var24_48 /* !! */ .getPath()));
                                        try {
                                            v112 = (ArrayList)lk_0.a(var24_48 /* !! */ .getPath());
                                        }
                                        catch (InvocationTargetException v113) {
                                            throw v113.getTargetException();
                                        }
                                        var25_51 = v112;
                                        for (File var27_56 : var25_51) {
                                            block218: {
                                                v108 = var27_56.isDirectory();
                                                if (var2_2 == null) continue block186;
                                                try {
                                                    block219: {
                                                        try {
                                                            try {
                                                                if (var2_2 == null) break block218;
                                                                if (!v108) break block219;
                                                            }
                                                            catch (UnsupportedFlavorException v114) {
                                                                throw nK.a(v114);
                                                            }
                                                            var18_29.add(var27_56);
                                                            if (var2_2 != null) break block218;
                                                        }
                                                        catch (UnsupportedFlavorException v115) {
                                                            throw nK.a(v115);
                                                        }
                                                    }
                                                    var19_30.add(var27_56);
                                                }
                                                catch (UnsupportedFlavorException v116) {
                                                    throw nK.a(v116);
                                                }
                                            }
                                            if (var2_2 != null) continue;
                                        }
                                        try {
                                            if (var2_2 != null) continue block185;
lbl584:
                                            // 2 sources

                                            v117 = var24_48 /* !! */ .isFile();
                                        }
                                        catch (UnsupportedFlavorException v118) {
                                            throw nK.a(v118);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var2_2 == null || !v117) continue block185;
                                        }
                                        catch (UnsupportedFlavorException v119) {
                                            throw nK.a(v119);
                                        }
                                        v117 = var19_30.add(new File(var24_48 /* !! */ .getPath()));
                                        continue block185;
                                    }
                                    catch (UnsupportedFlavorException v120) {
                                        throw nK.a(v120);
                                    }
                                    if (var2_2 != null) continue block185;
                                }
                                break;
                            }
                            try {
                                v121 = yt_1.i();
                            }
                            catch (InvocationTargetException v122) {
                                throw v122.getTargetException();
                            }
                            try {
                                v123 = v121.h();
                            }
                            catch (InvocationTargetException v124) {
                                throw v124.getTargetException();
                            }
                            try {
                                v109 = (Boolean)v123.I();
                            }
                            catch (InvocationTargetException v125) {
                                throw v125.getTargetException();
                            }
                        }
                        try {
                            try {
                                if (var2_2 == null) break block220;
                                if (!v109) break block221;
                            }
                            catch (UnsupportedFlavorException v126) {
                                throw nK.a(v126);
                            }
                            try {
                                v127 = yt_1.i();
                            }
                            catch (InvocationTargetException v128) {
                                throw v128.getTargetException();
                            }
                            try {
                                v129 = v127.P();
                            }
                            catch (InvocationTargetException v130) {
                                throw v130.getTargetException();
                            }
                            try {
                                v109 = (Boolean)v129.v();
                            }
                            catch (InvocationTargetException v131) {
                                throw v131.getTargetException();
                            }
                        }
                        catch (UnsupportedFlavorException v132) {
                            throw nK.a(v132);
                        }
                    }
                    if (v109) {
                        var23_45 = var20_33;
                        var24_48 /* !! */  = new nq_0(SwingUtilities.getWindowAncestor(var10_10), var10_10);
                        var25_51 = var17_21;
                        try {
                            yt_1.F.J(new TG(this, (String)var23_45, (nq_0)var24_48 /* !! */ , var25_51, var22_42));
                        }
                        catch (InvocationTargetException v133) {
                            throw v133.getTargetException();
                        }
                    }
                }
                var23_45 = var20_33;
                try {
                    yt_1.F.J(new DE(this, var18_29, var10_10, (String)var23_45, var22_42, (ArrayList)var19_30));
                }
                catch (InvocationTargetException v134) {
                    throw v134.getTargetException();
                }
                return true;
            }
            v19 = true;
        }
        return v19;
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
        block20: {
            block19: {
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "\u63b3\u9105\u0006\u00e9\u79af\u5213\u52ba\uff92l.\u0015\u008eR8\n\u00a8\u00d3\u00f5;\u00e6\u00b6& \u0094\u0082\u001e\u00cc\u0014[\u0088\"\u00c0\u00b4y\u008a\u00fa\u009f\u008b\b\u009a&@\u00d8a\u0011\u00ca\u00d8\u00ce\u0012G_1\u00e2}\u00b1k\u00064\u79bb\u52a8\u5238\uffe5<\u0007\u66c4\u54a1\u5c99\u65aa\u4e54\uff155\u0002\u6373\u91ca\u0007\u665b\u54dd\u5c6a\u764c\u5f89\uff8dY";
                var4_3 = "\u63b3\u9105\u0006\u00e9\u79af\u5213\u52ba\uff92l.\u0015\u008eR8\n\u00a8\u00d3\u00f5;\u00e6\u00b6& \u0094\u0082\u001e\u00cc\u0014[\u0088\"\u00c0\u00b4y\u008a\u00fa\u009f\u008b\b\u009a&@\u00d8a\u0011\u00ca\u00d8\u00ce\u0012G_1\u00e2}\u00b1k\u00064\u79bb\u52a8\u5238\uffe5<\u0007\u66c4\u54a1\u5c99\u65aa\u4e54\uff155\u0002\u6373\u91ca\u0007\u665b\u54dd\u5c6a\u764c\u5f89\uff8dY".length();
                var1_4 = 2;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 8;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "\u660b\u54fb\u5cd4\u763c\u5fea\uff37\u0081.\u00033$;p|(\u00db\u00f0\u0097{\u00bc-s\u0097V\u00da\u00a9-\u008bX\u0014OWA\u008bR\u0011\u0005}3\b\u00ce\u00dcg\u00c9\u00a2\u001a\u00e9i\u0094@/\u00e7\u00bc\u008c";
                    var4_3 = "\u660b\u54fb\u5cd4\u763c\u5fea\uff37\u0081.\u00033$;p|(\u00db\u00f0\u0097{\u00bc-s\u0097V\u00da\u00a9-\u008bX\u0014OWA\u008bR\u0011\u0005}3\b\u00ce\u00dcg\u00c9\u00a2\u001a\u00e9i\u0094@/\u00e7\u00bc\u008c".length();
                    var1_4 = 7;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 87;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 126;
                            break;
                        }
                        case 1: {
                            v15 = 71;
                            break;
                        }
                        case 2: {
                            v15 = 11;
                            break;
                        }
                        case 3: {
                            v15 = 26;
                            break;
                        }
                        case 4: {
                            v15 = 63;
                            break;
                        }
                        case 5: {
                            v15 = 103;
                            break;
                        }
                        default: {
                            v15 = 89;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        nK.a = var5;
        nK.b = new String[9];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x17F3) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 19;
                    break;
                }
                case 1: {
                    n14 = 5;
                    break;
                }
                case 2: {
                    n14 = 176;
                    break;
                }
                case 3: {
                    n14 = 167;
                    break;
                }
                case 4: {
                    n14 = 145;
                    break;
                }
                case 5: {
                    n14 = 123;
                    break;
                }
                case 6: {
                    n14 = 29;
                    break;
                }
                case 7: {
                    n14 = 231;
                    break;
                }
                case 8: {
                    n14 = 253;
                    break;
                }
                case 9: {
                    n14 = 124;
                    break;
                }
                case 10: {
                    n14 = 73;
                    break;
                }
                case 11: {
                    n14 = 118;
                    break;
                }
                case 12: {
                    n14 = 106;
                    break;
                }
                case 13: {
                    n14 = 111;
                    break;
                }
                case 14: {
                    n14 = 84;
                    break;
                }
                case 15: {
                    n14 = 189;
                    break;
                }
                case 16: {
                    n14 = 56;
                    break;
                }
                case 17: {
                    n14 = 142;
                    break;
                }
                case 18: {
                    n14 = 171;
                    break;
                }
                case 19: {
                    n14 = 99;
                    break;
                }
                case 20: {
                    n14 = 198;
                    break;
                }
                case 21: {
                    n14 = 117;
                    break;
                }
                case 22: {
                    n14 = 200;
                    break;
                }
                case 23: {
                    n14 = 172;
                    break;
                }
                case 24: {
                    n14 = 209;
                    break;
                }
                case 25: {
                    n14 = 101;
                    break;
                }
                case 26: {
                    n14 = 85;
                    break;
                }
                case 27: {
                    n14 = 76;
                    break;
                }
                case 28: {
                    n14 = 100;
                    break;
                }
                case 29: {
                    n14 = 128;
                    break;
                }
                case 30: {
                    n14 = 233;
                    break;
                }
                case 31: {
                    n14 = 173;
                    break;
                }
                case 32: {
                    n14 = 183;
                    break;
                }
                case 33: {
                    n14 = 219;
                    break;
                }
                case 34: {
                    n14 = 191;
                    break;
                }
                case 35: {
                    n14 = 8;
                    break;
                }
                case 36: {
                    n14 = 14;
                    break;
                }
                case 37: {
                    n14 = 20;
                    break;
                }
                case 38: {
                    n14 = 135;
                    break;
                }
                case 39: {
                    n14 = 180;
                    break;
                }
                case 40: {
                    n14 = 92;
                    break;
                }
                case 41: {
                    n14 = 186;
                    break;
                }
                case 42: {
                    n14 = 245;
                    break;
                }
                case 43: {
                    n14 = 68;
                    break;
                }
                case 44: {
                    n14 = 94;
                    break;
                }
                case 45: {
                    n14 = 133;
                    break;
                }
                case 46: {
                    n14 = 116;
                    break;
                }
                case 47: {
                    n14 = 121;
                    break;
                }
                case 48: {
                    n14 = 113;
                    break;
                }
                case 49: {
                    n14 = 136;
                    break;
                }
                case 50: {
                    n14 = 64;
                    break;
                }
                case 51: {
                    n14 = 90;
                    break;
                }
                case 52: {
                    n14 = 125;
                    break;
                }
                case 53: {
                    n14 = 226;
                    break;
                }
                case 54: {
                    n14 = 65;
                    break;
                }
                case 55: {
                    n14 = 22;
                    break;
                }
                case 56: {
                    n14 = 254;
                    break;
                }
                case 57: {
                    n14 = 195;
                    break;
                }
                case 58: {
                    n14 = 193;
                    break;
                }
                case 59: {
                    n14 = 160;
                    break;
                }
                case 60: {
                    n14 = 184;
                    break;
                }
                case 61: {
                    n14 = 227;
                    break;
                }
                case 62: {
                    n14 = 181;
                    break;
                }
                case 63: {
                    n14 = 251;
                    break;
                }
                case 64: {
                    n14 = 146;
                    break;
                }
                case 65: {
                    n14 = 86;
                    break;
                }
                case 66: {
                    n14 = 187;
                    break;
                }
                case 67: {
                    n14 = 66;
                    break;
                }
                case 68: {
                    n14 = 26;
                    break;
                }
                case 69: {
                    n14 = 162;
                    break;
                }
                case 70: {
                    n14 = 154;
                    break;
                }
                case 71: {
                    n14 = 229;
                    break;
                }
                case 72: {
                    n14 = 51;
                    break;
                }
                case 73: {
                    n14 = 53;
                    break;
                }
                case 74: {
                    n14 = 225;
                    break;
                }
                case 75: {
                    n14 = 3;
                    break;
                }
                case 76: {
                    n14 = 16;
                    break;
                }
                case 77: {
                    n14 = 217;
                    break;
                }
                case 78: {
                    n14 = 252;
                    break;
                }
                case 79: {
                    n14 = 33;
                    break;
                }
                case 80: {
                    n14 = 159;
                    break;
                }
                case 81: {
                    n14 = 21;
                    break;
                }
                case 82: {
                    n14 = 40;
                    break;
                }
                case 83: {
                    n14 = 237;
                    break;
                }
                case 84: {
                    n14 = 70;
                    break;
                }
                case 85: {
                    n14 = 248;
                    break;
                }
                case 86: {
                    n14 = 91;
                    break;
                }
                case 87: {
                    n14 = 122;
                    break;
                }
                case 88: {
                    n14 = 175;
                    break;
                }
                case 89: {
                    n14 = 132;
                    break;
                }
                case 90: {
                    n14 = 156;
                    break;
                }
                case 91: {
                    n14 = 202;
                    break;
                }
                case 92: {
                    n14 = 105;
                    break;
                }
                case 93: {
                    n14 = 42;
                    break;
                }
                case 94: {
                    n14 = 157;
                    break;
                }
                case 95: {
                    n14 = 213;
                    break;
                }
                case 96: {
                    n14 = 25;
                    break;
                }
                case 97: {
                    n14 = 163;
                    break;
                }
                case 98: {
                    n14 = 27;
                    break;
                }
                case 99: {
                    n14 = 88;
                    break;
                }
                case 100: {
                    n14 = 185;
                    break;
                }
                case 101: {
                    n14 = 207;
                    break;
                }
                case 102: {
                    n14 = 110;
                    break;
                }
                case 103: {
                    n14 = 87;
                    break;
                }
                case 104: {
                    n14 = 95;
                    break;
                }
                case 105: {
                    n14 = 12;
                    break;
                }
                case 106: {
                    n14 = 166;
                    break;
                }
                case 107: {
                    n14 = 98;
                    break;
                }
                case 108: {
                    n14 = 170;
                    break;
                }
                case 109: {
                    n14 = 13;
                    break;
                }
                case 110: {
                    n14 = 137;
                    break;
                }
                case 111: {
                    n14 = 164;
                    break;
                }
                case 112: {
                    n14 = 235;
                    break;
                }
                case 113: {
                    n14 = 242;
                    break;
                }
                case 114: {
                    n14 = 115;
                    break;
                }
                case 115: {
                    n14 = 179;
                    break;
                }
                case 116: {
                    n14 = 216;
                    break;
                }
                case 117: {
                    n14 = 161;
                    break;
                }
                case 118: {
                    n14 = 75;
                    break;
                }
                case 119: {
                    n14 = 220;
                    break;
                }
                case 120: {
                    n14 = 223;
                    break;
                }
                case 121: {
                    n14 = 158;
                    break;
                }
                case 122: {
                    n14 = 46;
                    break;
                }
                case 123: {
                    n14 = 69;
                    break;
                }
                case 124: {
                    n14 = 103;
                    break;
                }
                case 125: {
                    n14 = 222;
                    break;
                }
                case 126: {
                    n14 = 241;
                    break;
                }
                case 127: {
                    n14 = 60;
                    break;
                }
                case 128: {
                    n14 = 109;
                    break;
                }
                case 129: {
                    n14 = 35;
                    break;
                }
                case 130: {
                    n14 = 89;
                    break;
                }
                case 131: {
                    n14 = 23;
                    break;
                }
                case 132: {
                    n14 = 47;
                    break;
                }
                case 133: {
                    n14 = 67;
                    break;
                }
                case 134: {
                    n14 = 151;
                    break;
                }
                case 135: {
                    n14 = 45;
                    break;
                }
                case 136: {
                    n14 = 238;
                    break;
                }
                case 137: {
                    n14 = 11;
                    break;
                }
                case 138: {
                    n14 = 155;
                    break;
                }
                case 139: {
                    n14 = 126;
                    break;
                }
                case 140: {
                    n14 = 82;
                    break;
                }
                case 141: {
                    n14 = 48;
                    break;
                }
                case 142: {
                    n14 = 192;
                    break;
                }
                case 143: {
                    n14 = 169;
                    break;
                }
                case 144: {
                    n14 = 177;
                    break;
                }
                case 145: {
                    n14 = 190;
                    break;
                }
                case 146: {
                    n14 = 6;
                    break;
                }
                case 147: {
                    n14 = 144;
                    break;
                }
                case 148: {
                    n14 = 120;
                    break;
                }
                case 149: {
                    n14 = 143;
                    break;
                }
                case 150: {
                    n14 = 34;
                    break;
                }
                case 151: {
                    n14 = 255;
                    break;
                }
                case 152: {
                    n14 = 218;
                    break;
                }
                case 153: {
                    n14 = 165;
                    break;
                }
                case 154: {
                    n14 = 134;
                    break;
                }
                case 155: {
                    n14 = 77;
                    break;
                }
                case 156: {
                    n14 = 205;
                    break;
                }
                case 157: {
                    n14 = 63;
                    break;
                }
                case 158: {
                    n14 = 54;
                    break;
                }
                case 159: {
                    n14 = 36;
                    break;
                }
                case 160: {
                    n14 = 83;
                    break;
                }
                case 161: {
                    n14 = 188;
                    break;
                }
                case 162: {
                    n14 = 81;
                    break;
                }
                case 163: {
                    n14 = 49;
                    break;
                }
                case 164: {
                    n14 = 236;
                    break;
                }
                case 165: {
                    n14 = 224;
                    break;
                }
                case 166: {
                    n14 = 250;
                    break;
                }
                case 167: {
                    n14 = 247;
                    break;
                }
                case 168: {
                    n14 = 131;
                    break;
                }
                case 169: {
                    n14 = 39;
                    break;
                }
                case 170: {
                    n14 = 7;
                    break;
                }
                case 171: {
                    n14 = 127;
                    break;
                }
                case 172: {
                    n14 = 71;
                    break;
                }
                case 173: {
                    n14 = 215;
                    break;
                }
                case 174: {
                    n14 = 152;
                    break;
                }
                case 175: {
                    n14 = 196;
                    break;
                }
                case 176: {
                    n14 = 78;
                    break;
                }
                case 177: {
                    n14 = 28;
                    break;
                }
                case 178: {
                    n14 = 212;
                    break;
                }
                case 179: {
                    n14 = 182;
                    break;
                }
                case 180: {
                    n14 = 240;
                    break;
                }
                case 181: {
                    n14 = 43;
                    break;
                }
                case 182: {
                    n14 = 201;
                    break;
                }
                case 183: {
                    n14 = 234;
                    break;
                }
                case 184: {
                    n14 = 221;
                    break;
                }
                case 185: {
                    n14 = 93;
                    break;
                }
                case 186: {
                    n14 = 149;
                    break;
                }
                case 187: {
                    n14 = 112;
                    break;
                }
                case 188: {
                    n14 = 211;
                    break;
                }
                case 189: {
                    n14 = 138;
                    break;
                }
                case 190: {
                    n14 = 130;
                    break;
                }
                case 191: {
                    n14 = 168;
                    break;
                }
                case 192: {
                    n14 = 150;
                    break;
                }
                case 193: {
                    n14 = 50;
                    break;
                }
                case 194: {
                    n14 = 243;
                    break;
                }
                case 195: {
                    n14 = 30;
                    break;
                }
                case 196: {
                    n14 = 79;
                    break;
                }
                case 197: {
                    n14 = 80;
                    break;
                }
                case 198: {
                    n14 = 32;
                    break;
                }
                case 199: {
                    n14 = 114;
                    break;
                }
                case 200: {
                    n14 = 139;
                    break;
                }
                case 201: {
                    n14 = 147;
                    break;
                }
                case 202: {
                    n14 = 41;
                    break;
                }
                case 203: {
                    n14 = 232;
                    break;
                }
                case 204: {
                    n14 = 107;
                    break;
                }
                case 205: {
                    n14 = 228;
                    break;
                }
                case 206: {
                    n14 = 204;
                    break;
                }
                case 207: {
                    n14 = 72;
                    break;
                }
                case 208: {
                    n14 = 153;
                    break;
                }
                case 209: {
                    n14 = 10;
                    break;
                }
                case 210: {
                    n14 = 55;
                    break;
                }
                case 211: {
                    n14 = 61;
                    break;
                }
                case 212: {
                    n14 = 140;
                    break;
                }
                case 213: {
                    n14 = 148;
                    break;
                }
                case 214: {
                    n14 = 38;
                    break;
                }
                case 215: {
                    n14 = 2;
                    break;
                }
                case 216: {
                    n14 = 57;
                    break;
                }
                case 217: {
                    n14 = 74;
                    break;
                }
                case 218: {
                    n14 = 206;
                    break;
                }
                case 219: {
                    n14 = 102;
                    break;
                }
                case 220: {
                    n14 = 129;
                    break;
                }
                case 221: {
                    n14 = 0;
                    break;
                }
                case 222: {
                    n14 = 246;
                    break;
                }
                case 223: {
                    n14 = 1;
                    break;
                }
                case 224: {
                    n14 = 104;
                    break;
                }
                case 225: {
                    n14 = 199;
                    break;
                }
                case 226: {
                    n14 = 15;
                    break;
                }
                case 227: {
                    n14 = 24;
                    break;
                }
                case 228: {
                    n14 = 58;
                    break;
                }
                case 229: {
                    n14 = 174;
                    break;
                }
                case 230: {
                    n14 = 31;
                    break;
                }
                case 231: {
                    n14 = 203;
                    break;
                }
                case 232: {
                    n14 = 119;
                    break;
                }
                case 233: {
                    n14 = 194;
                    break;
                }
                case 234: {
                    n14 = 230;
                    break;
                }
                case 235: {
                    n14 = 44;
                    break;
                }
                case 236: {
                    n14 = 178;
                    break;
                }
                case 237: {
                    n14 = 96;
                    break;
                }
                case 238: {
                    n14 = 141;
                    break;
                }
                case 239: {
                    n14 = 18;
                    break;
                }
                case 240: {
                    n14 = 37;
                    break;
                }
                case 241: {
                    n14 = 97;
                    break;
                }
                case 242: {
                    n14 = 210;
                    break;
                }
                case 243: {
                    n14 = 17;
                    break;
                }
                case 244: {
                    n14 = 108;
                    break;
                }
                case 245: {
                    n14 = 197;
                    break;
                }
                case 246: {
                    n14 = 208;
                    break;
                }
                case 247: {
                    n14 = 62;
                    break;
                }
                case 248: {
                    n14 = 59;
                    break;
                }
                case 249: {
                    n14 = 52;
                    break;
                }
                case 250: {
                    n14 = 4;
                    break;
                }
                case 251: {
                    n14 = 9;
                    break;
                }
                case 252: {
                    n14 = 244;
                    break;
                }
                case 253: {
                    n14 = 249;
                    break;
                }
                case 254: {
                    n14 = 239;
                    break;
                }
                default: {
                    n14 = 214;
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
            nK.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

