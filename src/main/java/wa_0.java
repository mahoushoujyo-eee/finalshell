/*
 * Decompiled with CFR 0.152.
 */
import com.c;
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
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.apache.commons.io.FileUtils;

/*
 * Renamed from Wa
 */
public class wa_0
extends TransferHandler {
    DataFlavor Y;
    DataFlavor F;
    DataFlavor[] k;
    DefaultMutableTreeNode[] y;
    DefaultMutableTreeNode P;
    aJ v;
    private static final String[] a;
    private static final String[] b;

    public wa_0(aJ aJ2) {
        this.k = new DataFlavor[1];
        this.v = aJ2;
        try {
            String string = "application/x-java-jvm-local-objectref;class=\"" + DefaultMutableTreeNode[].class.getName() + "\"";
            this.Y = new DataFlavor(string);
            ((DataFlavor[])c.c((long)151856102573410630L).get((Object)this))[0] = (DataFlavor)this.Y;
            String string2 = "application/x-java-jvm-local-objectref;class=\"" + ck_2.class.getName() + "\"";
            this.F = new DataFlavor(string2);
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
    }

    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        transferSupport.setShowDropLocation(false);
        return true;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        JTree jTree = (JTree)jComponent;
        String string = aA.z();
        TreePath[] treePathArray = jTree.getSelectionPaths();
        if (treePathArray != null) {
            Serializable[] serializableArray;
            ArrayList<DefaultMutableTreeNode> arrayList;
            block10: {
                DefaultMutableTreeNode defaultMutableTreeNode;
                ArrayList<DefaultMutableTreeNode> arrayList2 = new ArrayList<DefaultMutableTreeNode>();
                arrayList = new ArrayList<DefaultMutableTreeNode>();
                this.P = (DefaultMutableTreeNode)treePathArray[0].getLastPathComponent();
                try {
                    defaultMutableTreeNode = (DefaultMutableTreeNode)this.z(this.P);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode;
                arrayList2.add(defaultMutableTreeNode2);
                arrayList.add((DefaultMutableTreeNode)this.P);
                for (int i2 = 1; i2 < treePathArray.length; ++i2) {
                    DefaultMutableTreeNode defaultMutableTreeNode3;
                    serializableArray = treePathArray;
                    if (string != null) break block10;
                    DefaultMutableTreeNode defaultMutableTreeNode4 = (DefaultMutableTreeNode)serializableArray[i2].getLastPathComponent();
                    int n10 = defaultMutableTreeNode4.getLevel();
                    int n11 = ((DefaultMutableTreeNode)this.P).getLevel();
                    if (string == null) {
                        if (n10 < n11 && string == null) break;
                        n10 = defaultMutableTreeNode4.getLevel();
                        if (string != null) continue;
                        n11 = ((DefaultMutableTreeNode)this.P).getLevel();
                    }
                    if (n10 > n11) {
                        DefaultMutableTreeNode defaultMutableTreeNode5;
                        try {
                            defaultMutableTreeNode5 = (DefaultMutableTreeNode)this.z(defaultMutableTreeNode4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        defaultMutableTreeNode2.add(defaultMutableTreeNode5);
                        if (string == null) continue;
                    }
                    try {
                        defaultMutableTreeNode3 = (DefaultMutableTreeNode)this.z(defaultMutableTreeNode4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    arrayList2.add(defaultMutableTreeNode3);
                    n10 = arrayList.add(defaultMutableTreeNode4) ? 1 : 0;
                    if (string == null) continue;
                }
                serializableArray = arrayList2.toArray(new DefaultMutableTreeNode[arrayList2.size()]);
            }
            DefaultMutableTreeNode[] defaultMutableTreeNodeArray = (DefaultMutableTreeNode[])serializableArray;
            this.y = arrayList.toArray(new DefaultMutableTreeNode[arrayList.size()]);
            return new TH(this, defaultMutableTreeNodeArray);
        }
        return null;
    }

    private DefaultMutableTreeNode z(TreeNode treeNode) {
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean importData(TransferHandler.TransferSupport var1_1) {
        block181: {
            block172: {
                block170: {
                    block185: {
                        block201: {
                            block189: {
                                block188: {
                                    block186: {
                                        block187: {
                                            block184: {
                                                block200: {
                                                    block182: {
                                                        block183: {
                                                            block173: {
                                                                block177: {
                                                                    block176: {
                                                                        block199: {
                                                                            block174: {
                                                                                block175: {
                                                                                    block171: {
                                                                                        block197: {
                                                                                            block196: {
                                                                                                block169: {
                                                                                                    block167: {
                                                                                                        block168: {
                                                                                                            block194: {
                                                                                                                block193: {
                                                                                                                    block166: {
                                                                                                                        block165: {
                                                                                                                            block164: {
                                                                                                                                block163: {
                                                                                                                                    block161: {
                                                                                                                                        block162: {
                                                                                                                                            var2_2 = aA.z();
                                                                                                                                            v0 = this;
                                                                                                                                            if (var2_2 != null) break block161;
                                                                                                                                            try {
                                                                                                                                                block190: {
                                                                                                                                                    try {
                                                                                                                                                        v1 = (Boolean)v0.canImport(var1_1);
                                                                                                                                                    }
                                                                                                                                                    catch (InvocationTargetException v2) {
                                                                                                                                                        throw v2.getTargetException();
                                                                                                                                                    }
                                                                                                                                                    if (v1) break block162;
                                                                                                                                                    break block190;
                                                                                                                                                    catch (IOException v3) {
                                                                                                                                                        throw wa_0.a(v3);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            catch (IOException v4) {
                                                                                                                                                throw wa_0.a(v4);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v0 = this;
                                                                                                                                    }
                                                                                                                                    var3_3 = (aJ)v0.v;
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
                                                                                                                                    var10_10 = 0;
                                                                                                                                    v9 = var6_6;
                                                                                                                                    if (var2_2 != null) break block163;
                                                                                                                                    try {
                                                                                                                                        block191: {
                                                                                                                                            if (v9 <= -1) break block164;
                                                                                                                                            break block191;
                                                                                                                                            catch (IOException v10) {
                                                                                                                                                throw wa_0.a(v10);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v9 = 1;
                                                                                                                                    }
                                                                                                                                    catch (IOException v11) {
                                                                                                                                        throw wa_0.a(v11);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                var10_10 = v9;
                                                                                                                            }
                                                                                                                            var11_11 = ((aJ)this.v).getUI();
                                                                                                                            v12 = var9_9;
                                                                                                                            if (var2_2 != null) break block165;
                                                                                                                            try {
                                                                                                                                block192: {
                                                                                                                                    if (v12 == null) break block166;
                                                                                                                                    break block192;
                                                                                                                                    catch (IOException v13) {
                                                                                                                                        throw wa_0.a(v13);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v12 = (DefaultMutableTreeNode)var9_9.getParent();
                                                                                                                            }
                                                                                                                            catch (IOException v14) {
                                                                                                                                throw wa_0.a(v14);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var12_12 = v12;
                                                                                                                        var13_13 = var9_9.getUserObject();
                                                                                                                        try {
                                                                                                                            v15 = (Rectangle)var3_3.f(var9_9);
                                                                                                                        }
                                                                                                                        catch (InvocationTargetException v16) {
                                                                                                                            throw v16.getTargetException();
                                                                                                                        }
                                                                                                                        var14_15 = v15;
                                                                                                                    }
                                                                                                                    var12_12 = (yo_2)((aJ)this.v).getModel();
                                                                                                                    var13_14 = ((DefaultMutableTreeNode)this.P).getParent().getIndex((DefaultMutableTreeNode)this.P);
                                                                                                                    v17 = var13_14;
                                                                                                                    if (var2_2 != null) break block167;
                                                                                                                    if (v17 >= var6_6) ** GOTO lbl119
                                                                                                                    break block193;
                                                                                                                    catch (IOException v18) {
                                                                                                                        throw wa_0.a(v18);
                                                                                                                    }
                                                                                                                }
                                                                                                                v19 = var6_6;
                                                                                                                v20 = 1;
                                                                                                                if (var2_2 != null) break block168;
                                                                                                                break block194;
                                                                                                                catch (IOException v21) {
                                                                                                                    throw wa_0.a(v21);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                block195: {
                                                                                                                    if (v19 <= v20) break block169;
                                                                                                                    break block195;
                                                                                                                    catch (IOException v22) {
                                                                                                                        throw wa_0.a(v22);
                                                                                                                    }
                                                                                                                }
                                                                                                                v19 = var6_6;
                                                                                                                v20 = 1;
                                                                                                            }
                                                                                                            catch (IOException v23) {
                                                                                                                throw wa_0.a(v23);
                                                                                                            }
                                                                                                        }
                                                                                                        var6_6 = v19 - v20;
                                                                                                        try {
                                                                                                            if (var2_2 == null) break block169;
lbl119:
                                                                                                            // 2 sources

                                                                                                            v17 = var6_6;
                                                                                                        }
                                                                                                        catch (IOException v24) {
                                                                                                            throw wa_0.a(v24);
                                                                                                        }
                                                                                                    }
                                                                                                    var6_6 = v17;
                                                                                                }
                                                                                                var14_15 = null;
                                                                                                var15_16 = var1_1.getTransferable();
                                                                                                var16_17 = var15_16.getTransferDataFlavors()[0];
                                                                                                v25 = var16_17.equals((DataFlavor)this.Y);
                                                                                                if (var2_2 != null) break block170;
                                                                                                if (!v25) ** GOTO lbl566
                                                                                                break block196;
                                                                                                catch (IOException v26) {
                                                                                                    throw wa_0.a(v26);
                                                                                                }
                                                                                            }
                                                                                            v27 = (DefaultMutableTreeNode)this.P;
                                                                                            if (var2_2 != null) break block171;
                                                                                            break block197;
                                                                                            catch (IOException v28) {
                                                                                                throw wa_0.a(v28);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block198: {
                                                                                                if (v27 == null) break block172;
                                                                                                break block198;
                                                                                                catch (IOException v29) {
                                                                                                    throw wa_0.a(v29);
                                                                                                }
                                                                                            }
                                                                                            v27 = ((DefaultMutableTreeNode)this.P).getUserObject();
                                                                                        }
                                                                                        catch (IOException v30) {
                                                                                            throw wa_0.a(v30);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v25 = v27.getClass().equals(ck_2.class);
                                                                                        if (var2_2 != null) break block173;
                                                                                        if (v25) {
                                                                                        }
                                                                                        ** GOTO lbl368
                                                                                    }
                                                                                    catch (IOException v31) {
                                                                                        throw wa_0.a(v31);
                                                                                    }
                                                                                    var17_18 /* !! */  = (ck_2)((DefaultMutableTreeNode)this.P).getUserObject();
                                                                                    try {
                                                                                        v32 = (File)var17_18 /* !! */.i();
                                                                                    }
                                                                                    catch (InvocationTargetException v33) {
                                                                                        throw v33.getTargetException();
                                                                                    }
                                                                                    var18_19 = v32.getAbsolutePath();
                                                                                    try {
                                                                                        v34 = (File)var17_18 /* !! */.i();
                                                                                    }
                                                                                    catch (InvocationTargetException v35) {
                                                                                        throw v35.getTargetException();
                                                                                    }
                                                                                    var19_22 = v34.getParentFile().getAbsolutePath();
                                                                                    try {
                                                                                        v36 = (TreePath)var3_3.g(var4_4.getDropPoint());
                                                                                    }
                                                                                    catch (InvocationTargetException v37) {
                                                                                        throw v37.getTargetException();
                                                                                    }
                                                                                    var20_23 /* !! */  = v36;
                                                                                    var21_24 = var3_3.getPathBounds(var20_23 /* !! */ );
                                                                                    var22_25 = null;
                                                                                    try {
                                                                                        v38 = var8_8.getUserObject().getClass();
                                                                                        if (var2_2 != null) break block174;
                                                                                        if (!v38.equals(ck_2.class)) break block175;
                                                                                    }
                                                                                    catch (IOException v39) {
                                                                                        throw wa_0.a(v39);
                                                                                    }
                                                                                    var23_26 = (DefaultMutableTreeNode)var8_8.getParent();
                                                                                    var22_25 = (tf_2)var23_26.getUserObject();
                                                                                    var8_8 = var23_26;
                                                                                    break block199;
                                                                                }
                                                                                v38 = var8_8.getUserObject();
                                                                            }
                                                                            var22_25 = (tf_2)v38;
                                                                        }
                                                                        try {
                                                                            v40 = (File)var22_25.M();
                                                                        }
                                                                        catch (InvocationTargetException v41) {
                                                                            throw v41.getTargetException();
                                                                        }
                                                                        try {
                                                                            v42 = (File)var17_18 /* !! */.i();
                                                                        }
                                                                        catch (InvocationTargetException v43) {
                                                                            throw v43.getTargetException();
                                                                        }
                                                                        var23_26 = v40.getAbsolutePath() + File.separator + v42.getName();
                                                                        var24_28 = new File((String)var23_26);
                                                                        var25_30 = true;
                                                                        try {
                                                                            if (var2_2 != null) break block176;
                                                                            try {
                                                                                v44 = (File)var22_25.M();
                                                                            }
                                                                            catch (InvocationTargetException v45) {
                                                                                throw v45.getTargetException();
                                                                            }
                                                                            if (var19_22.equals(v44.getAbsolutePath())) break block177;
                                                                        }
                                                                        catch (IOException v46) {
                                                                            throw wa_0.a(v46);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v47 = (File)var17_18 /* !! */.i();
                                                                            }
                                                                            catch (InvocationTargetException v48) {
                                                                                throw v48.getTargetException();
                                                                            }
                                                                            FileUtils.moveFile(v47, (File)var24_28);
                                                                        }
                                                                        catch (IOException var26_32) {
                                                                            var26_32.printStackTrace();
                                                                            var25_30 = false;
                                                                        }
                                                                    }
                                                                    if (var25_30) {
                                                                        block178: {
                                                                            block180: {
                                                                                block179: {
                                                                                    try {
                                                                                        v49 = (DefaultMutableTreeNode)this.v.r(var19_22);
                                                                                    }
                                                                                    catch (InvocationTargetException v50) {
                                                                                        throw v50.getTargetException();
                                                                                    }
                                                                                    var26_33 /* !! */  = v49;
                                                                                    var12_12.removeNodeFromParent((DefaultMutableTreeNode)this.P);
                                                                                    var27_34 = (tf_2)var26_33 /* !! */ .getUserObject();
                                                                                    try {
                                                                                        var27_34.F(var18_19);
                                                                                    }
                                                                                    catch (InvocationTargetException v51) {
                                                                                        throw v51.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        this.v.G(var18_19);
                                                                                    }
                                                                                    catch (InvocationTargetException v52) {
                                                                                        throw v52.getTargetException();
                                                                                    }
                                                                                    var28_35 /* !! */  = new ck_2();
                                                                                    try {
                                                                                        var28_35 /* !! */.N(var24_28);
                                                                                    }
                                                                                    catch (InvocationTargetException v53) {
                                                                                        throw v53.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        lk_0.n(var28_35 /* !! */);
                                                                                    }
                                                                                    catch (InvocationTargetException v54) {
                                                                                        throw v54.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        v55 = (List)var22_25.M();
                                                                                    }
                                                                                    catch (InvocationTargetException v56) {
                                                                                        throw v56.getTargetException();
                                                                                    }
                                                                                    v55.add(var28_35 /* !! */ );
                                                                                    try {
                                                                                        v57 = yt_1.i();
                                                                                    }
                                                                                    catch (InvocationTargetException v58) {
                                                                                        throw v58.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        v59 = v57.g();
                                                                                    }
                                                                                    catch (InvocationTargetException v60) {
                                                                                        throw v60.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        v61 = var17_18 /* !! */.d();
                                                                                    }
                                                                                    catch (InvocationTargetException v62) {
                                                                                        throw v62.getTargetException();
                                                                                    }
                                                                                    try {
                                                                                        v59.U(v61, var23_26);
                                                                                    }
                                                                                    catch (InvocationTargetException v63) {
                                                                                        throw v63.getTargetException();
                                                                                    }
                                                                                    var29_36 = new DefaultMutableTreeNode(var28_35 /* !! */ );
                                                                                    try {
                                                                                        try {
                                                                                            this.v.V((Object)var29_36, (Object)var28_35 /* !! */);
                                                                                        }
                                                                                        catch (InvocationTargetException v64) {
                                                                                            throw v64.getTargetException();
                                                                                        }
                                                                                        v65 = var19_22;
                                                                                        if (var2_2 != null) break block178;
                                                                                        try {
                                                                                            v66 = (File)var22_25.M();
                                                                                        }
                                                                                        catch (InvocationTargetException v67) {
                                                                                            throw v67.getTargetException();
                                                                                        }
                                                                                        if (v65.equals(v66.getAbsolutePath())) break block179;
                                                                                    }
                                                                                    catch (IOException v68) {
                                                                                        throw wa_0.a(v68);
                                                                                    }
                                                                                    var6_6 = var4_4.getChildIndex();
                                                                                    try {
                                                                                        if (var2_2 != null) break block180;
                                                                                        if (var6_6 != -1) break block179;
                                                                                    }
                                                                                    catch (IOException v69) {
                                                                                        throw wa_0.a(v69);
                                                                                    }
                                                                                    var6_6 = 0;
                                                                                }
                                                                                var12_12.insertNodeInto(var29_36, (MutableTreeNode)var8_8, var6_6);
                                                                            }
                                                                            v65 = new File((String)var23_26).getParentFile().getAbsolutePath();
                                                                        }
                                                                        var30_37 = v65;
                                                                        try {
                                                                            v70 = (DefaultMutableTreeNode)this.v.r(var30_37);
                                                                        }
                                                                        catch (InvocationTargetException v71) {
                                                                            throw v71.getTargetException();
                                                                        }
                                                                        var31_38 = v70;
                                                                        try {
                                                                            this.v.J(var31_38);
                                                                        }
                                                                        catch (InvocationTargetException v72) {
                                                                            throw v72.getTargetException();
                                                                        }
                                                                        ((aJ)this.v).expandPath(new TreePath(var8_8.getPath()));
                                                                        try {
                                                                            this.v.A(var29_36);
                                                                        }
                                                                        catch (InvocationTargetException v73) {
                                                                            throw v73.getTargetException();
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    if (var2_2 == null) break block172;
lbl368:
                                                                    // 2 sources

                                                                    v25 = ((DefaultMutableTreeNode)this.P).getUserObject().getClass().equals(tf_2.class);
                                                                }
                                                                catch (IOException v74) {
                                                                    throw wa_0.a(v74);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_2 != null) break block181;
                                                                if (!v25) break block172;
                                                            }
                                                            catch (IOException v75) {
                                                                throw wa_0.a(v75);
                                                            }
                                                            var17_18 /* !! */  = (tf_2)((DefaultMutableTreeNode)this.P).getUserObject();
                                                            try {
                                                                v76 = (File)var17_18 /* !! */.M();
                                                            }
                                                            catch (InvocationTargetException v77) {
                                                                throw v77.getTargetException();
                                                            }
                                                            var18_19 = v76.getAbsolutePath();
                                                            try {
                                                                v78 = (File)var17_18 /* !! */.M();
                                                            }
                                                            catch (InvocationTargetException v79) {
                                                                throw v79.getTargetException();
                                                            }
                                                            var19_22 = v78.getParentFile().getAbsolutePath();
                                                            var20_23 /* !! */  = null;
                                                            try {
                                                                v80 = var8_8.getUserObject().getClass();
                                                                if (var2_2 != null) break block182;
                                                                if (!v80.equals(ck_2.class)) break block183;
                                                            }
                                                            catch (IOException v81) {
                                                                throw wa_0.a(v81);
                                                            }
                                                            var21_24 = (DefaultMutableTreeNode)var8_8.getParent();
                                                            var20_23 /* !! */  = (tf_2)var21_24.getUserObject();
                                                            var8_8 = var21_24;
                                                            break block200;
                                                        }
                                                        v80 = var8_8.getUserObject();
                                                    }
                                                    var20_23 /* !! */  = (tf_2)v80;
                                                }
                                                try {
                                                    v82 = (File)var20_23 /* !! */.M();
                                                }
                                                catch (InvocationTargetException v83) {
                                                    throw v83.getTargetException();
                                                }
                                                try {
                                                    v84 = (File)var17_18 /* !! */.M();
                                                }
                                                catch (InvocationTargetException v85) {
                                                    throw v85.getTargetException();
                                                }
                                                var21_24 = v82.getAbsolutePath() + File.separator + v84.getName();
                                                var22_25 = new File((String)var21_24);
                                                var23_27 = true;
                                                try {
                                                    if (var2_2 != null) break block184;
                                                    try {
                                                        v86 = (File)var20_23 /* !! */.M();
                                                    }
                                                    catch (InvocationTargetException v87) {
                                                        throw v87.getTargetException();
                                                    }
                                                    if (var19_22.equals(v86.getAbsolutePath())) break block185;
                                                }
                                                catch (IOException v88) {
                                                    throw wa_0.a(v88);
                                                }
                                                try {
                                                    try {
                                                        v89 = (File)var17_18 /* !! */.M();
                                                    }
                                                    catch (InvocationTargetException v90) {
                                                        throw v90.getTargetException();
                                                    }
                                                    FileUtils.moveDirectory(v89, (File)var22_25);
                                                }
                                                catch (IOException var24_29) {
                                                    var23_27 = false;
                                                }
                                            }
                                            if (!var23_27) break block185;
                                            try {
                                                v91 = (DefaultMutableTreeNode)this.v.r(var19_22);
                                            }
                                            catch (InvocationTargetException v92) {
                                                throw v92.getTargetException();
                                            }
                                            var24_28 = v91;
                                            var12_12.removeNodeFromParent((DefaultMutableTreeNode)this.P);
                                            var25_31 = (tf_2)var24_28.getUserObject();
                                            try {
                                                var25_31.F(var18_19);
                                            }
                                            catch (InvocationTargetException v93) {
                                                throw v93.getTargetException();
                                            }
                                            try {
                                                this.v.G(var18_19);
                                            }
                                            catch (InvocationTargetException v94) {
                                                throw v94.getTargetException();
                                            }
                                            var26_33 /* !! */  = new tf_2((File)var22_25);
                                            try {
                                                v95 = yt_1.i();
                                            }
                                            catch (InvocationTargetException v96) {
                                                throw v96.getTargetException();
                                            }
                                            try {
                                                v97 = v95.g();
                                            }
                                            catch (InvocationTargetException v98) {
                                                throw v98.getTargetException();
                                            }
                                            try {
                                                v97.D(var22_25.getAbsolutePath());
                                            }
                                            catch (InvocationTargetException v99) {
                                                throw v99.getTargetException();
                                            }
                                            var27_34 = new File((String)var21_24).getParentFile().getAbsolutePath();
                                            try {
                                                v100 = (DefaultMutableTreeNode)this.v.r(var27_34);
                                            }
                                            catch (InvocationTargetException v101) {
                                                throw v101.getTargetException();
                                            }
                                            var28_35 /* !! */  = v100;
                                            try {
                                                try {
                                                    this.v.n(var26_33 /* !! */);
                                                }
                                                catch (InvocationTargetException v102) {
                                                    throw v102.getTargetException();
                                                }
                                                try {
                                                    v103 = (File)var20_23 /* !! */.M();
                                                }
                                                catch (InvocationTargetException v104) {
                                                    throw v104.getTargetException();
                                                }
                                                v105 = var19_22.equals(v103.getAbsolutePath());
                                                if (var2_2 != null) break block186;
                                                if (v105 != 0) break block187;
                                            }
                                            catch (IOException v106) {
                                                throw wa_0.a(v106);
                                            }
                                            var6_6 = var4_4.getChildIndex();
                                            try {
                                                v105 = var6_6;
                                                v107 = -1;
                                                if (var2_2 != null) break block188;
                                                if (v105 != v107) break block187;
                                            }
                                            catch (IOException v108) {
                                                throw wa_0.a(v108);
                                            }
                                            var6_6 = 0;
                                        }
                                        v105 = var6_6;
                                    }
                                    try {
                                        if (var2_2 != null) break block189;
                                        v107 = -1;
                                    }
                                    catch (IOException v109) {
                                        throw wa_0.a(v109);
                                    }
                                }
                                if (v105 != v107) break block201;
                                v105 = 0;
                            }
                            var6_6 = v105;
                        }
                        try {
                            v110 = (DefaultMutableTreeNode)this.v.E((Object)var8_8, (Object)var26_33 /* !! */, var6_6);
                        }
                        catch (InvocationTargetException v111) {
                            throw v111.getTargetException();
                        }
                        var29_36 = v110;
                        try {
                            this.v.J(var28_35 /* !! */);
                        }
                        catch (InvocationTargetException v112) {
                            throw v112.getTargetException();
                        }
                        ((aJ)this.v).expandPath(new TreePath(var8_8.getPath()));
                        try {
                            this.v.A(var29_36);
                        }
                        catch (InvocationTargetException v113) {
                            throw v113.getTargetException();
                        }
                    }
                    try {
                        if (var2_2 == null) break block172;
lbl566:
                        // 2 sources

                        v25 = var16_17.equals((DataFlavor)this.F);
                    }
                    catch (IOException v114) {
                        throw wa_0.a(v114);
                    }
                }
                try {
                    if (var2_2 != null) break block181;
                    if (!v25) break block172;
                }
                catch (IOException v115) {
                    throw wa_0.a(v115);
                }
                var17_18 /* !! */  = null;
                try {
                    var17_18 /* !! */  = (ck_2[])var15_16.getTransferData((DataFlavor)this.F);
                }
                catch (UnsupportedFlavorException var18_20) {
                    var18_20.printStackTrace();
                }
                catch (IOException var18_21) {
                    var18_21.printStackTrace();
                }
                if (var17_18 /* !! */  != null) {
                    // empty if block
                }
            }
            v25 = true;
        }
        return v25;
    }

    public String toString() {
        return this.getClass().getName();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "0W\u00e1K\u00d5\u00cc\u00ae\u00b7\u0092\u00b9\u00cbd\u0085Z\u00f8\u00c1\u0094\u00a7\u00f9\u00f4\u00f0\u0081\u00e8FI\u00b4\u00ed\u00c4\u0088u!\u00f5\u0091\u00dd\u00be\u0093+\u00f2$i\u0093r\u00b5\u0013L\u00ee.\n-\u00a6\u0004=%\u00b3\u008a1\u001e\u00bf\u0090\u000b\u00c4)\u0012\u00ae\u00dd\u00be\u00bb\u0018h\u00f5{\u00ea\u0013\u00990\u0006\u00eb\u00f0&\u00ab\u00a7\u00f9\u00dc\u00c3\u001b9T0\u00d5\u00c1\u00e7\u00c2p";
            var4_3 = "0W\u00e1K\u00d5\u00cc\u00ae\u00b7\u0092\u00b9\u00cbd\u0085Z\u00f8\u00c1\u0094\u00a7\u00f9\u00f4\u00f0\u0081\u00e8FI\u00b4\u00ed\u00c4\u0088u!\u00f5\u0091\u00dd\u00be\u0093+\u00f2$i\u0093r\u00b5\u0013L\u00ee.\n-\u00a6\u0004=%\u00b3\u008a1\u001e\u00bf\u0090\u000b\u00c4)\u0012\u00ae\u00dd\u00be\u00bb\u0018h\u00f5{\u00ea\u0013\u00990\u0006\u00eb\u00f0&\u00ab\u00a7\u00f9\u00dc\u00c3\u001b9T0\u00d5\u00c1\u00e7\u00c2p".length();
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
            v4 = 82;
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
                            v11 = 47;
                            break;
                        }
                        case 1: {
                            v11 = 86;
                            break;
                        }
                        case 2: {
                            v11 = 39;
                            break;
                        }
                        case 3: {
                            v11 = 97;
                            break;
                        }
                        case 4: {
                            v11 = 2;
                            break;
                        }
                        case 5: {
                            v11 = 19;
                            break;
                        }
                        default: {
                            v11 = 105;
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
        wa_0.a = var5;
        wa_0.b = new String[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1490) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 150;
                    break;
                }
                case 1: {
                    n14 = 116;
                    break;
                }
                case 2: {
                    n14 = 221;
                    break;
                }
                case 3: {
                    n14 = 34;
                    break;
                }
                case 4: {
                    n14 = 202;
                    break;
                }
                case 5: {
                    n14 = 238;
                    break;
                }
                case 6: {
                    n14 = 209;
                    break;
                }
                case 7: {
                    n14 = 197;
                    break;
                }
                case 8: {
                    n14 = 64;
                    break;
                }
                case 9: {
                    n14 = 40;
                    break;
                }
                case 10: {
                    n14 = 63;
                    break;
                }
                case 11: {
                    n14 = 44;
                    break;
                }
                case 12: {
                    n14 = 72;
                    break;
                }
                case 13: {
                    n14 = 66;
                    break;
                }
                case 14: {
                    n14 = 125;
                    break;
                }
                case 15: {
                    n14 = 53;
                    break;
                }
                case 16: {
                    n14 = 122;
                    break;
                }
                case 17: {
                    n14 = 222;
                    break;
                }
                case 18: {
                    n14 = 22;
                    break;
                }
                case 19: {
                    n14 = 219;
                    break;
                }
                case 20: {
                    n14 = 88;
                    break;
                }
                case 21: {
                    n14 = 8;
                    break;
                }
                case 22: {
                    n14 = 73;
                    break;
                }
                case 23: {
                    n14 = 5;
                    break;
                }
                case 24: {
                    n14 = 58;
                    break;
                }
                case 25: {
                    n14 = 245;
                    break;
                }
                case 26: {
                    n14 = 165;
                    break;
                }
                case 27: {
                    n14 = 112;
                    break;
                }
                case 28: {
                    n14 = 119;
                    break;
                }
                case 29: {
                    n14 = 101;
                    break;
                }
                case 30: {
                    n14 = 162;
                    break;
                }
                case 31: {
                    n14 = 166;
                    break;
                }
                case 32: {
                    n14 = 74;
                    break;
                }
                case 33: {
                    n14 = 156;
                    break;
                }
                case 34: {
                    n14 = 240;
                    break;
                }
                case 35: {
                    n14 = 208;
                    break;
                }
                case 36: {
                    n14 = 175;
                    break;
                }
                case 37: {
                    n14 = 30;
                    break;
                }
                case 38: {
                    n14 = 171;
                    break;
                }
                case 39: {
                    n14 = 183;
                    break;
                }
                case 40: {
                    n14 = 51;
                    break;
                }
                case 41: {
                    n14 = 124;
                    break;
                }
                case 42: {
                    n14 = 96;
                    break;
                }
                case 43: {
                    n14 = 137;
                    break;
                }
                case 44: {
                    n14 = 231;
                    break;
                }
                case 45: {
                    n14 = 213;
                    break;
                }
                case 46: {
                    n14 = 154;
                    break;
                }
                case 47: {
                    n14 = 46;
                    break;
                }
                case 48: {
                    n14 = 24;
                    break;
                }
                case 49: {
                    n14 = 252;
                    break;
                }
                case 50: {
                    n14 = 144;
                    break;
                }
                case 51: {
                    n14 = 42;
                    break;
                }
                case 52: {
                    n14 = 210;
                    break;
                }
                case 53: {
                    n14 = 1;
                    break;
                }
                case 54: {
                    n14 = 81;
                    break;
                }
                case 55: {
                    n14 = 91;
                    break;
                }
                case 56: {
                    n14 = 235;
                    break;
                }
                case 57: {
                    n14 = 142;
                    break;
                }
                case 58: {
                    n14 = 172;
                    break;
                }
                case 59: {
                    n14 = 236;
                    break;
                }
                case 60: {
                    n14 = 196;
                    break;
                }
                case 61: {
                    n14 = 148;
                    break;
                }
                case 62: {
                    n14 = 194;
                    break;
                }
                case 63: {
                    n14 = 251;
                    break;
                }
                case 64: {
                    n14 = 212;
                    break;
                }
                case 65: {
                    n14 = 110;
                    break;
                }
                case 66: {
                    n14 = 164;
                    break;
                }
                case 67: {
                    n14 = 118;
                    break;
                }
                case 68: {
                    n14 = 25;
                    break;
                }
                case 69: {
                    n14 = 9;
                    break;
                }
                case 70: {
                    n14 = 176;
                    break;
                }
                case 71: {
                    n14 = 35;
                    break;
                }
                case 72: {
                    n14 = 211;
                    break;
                }
                case 73: {
                    n14 = 97;
                    break;
                }
                case 74: {
                    n14 = 77;
                    break;
                }
                case 75: {
                    n14 = 155;
                    break;
                }
                case 76: {
                    n14 = 36;
                    break;
                }
                case 77: {
                    n14 = 225;
                    break;
                }
                case 78: {
                    n14 = 189;
                    break;
                }
                case 79: {
                    n14 = 244;
                    break;
                }
                case 80: {
                    n14 = 149;
                    break;
                }
                case 81: {
                    n14 = 108;
                    break;
                }
                case 82: {
                    n14 = 106;
                    break;
                }
                case 83: {
                    n14 = 214;
                    break;
                }
                case 84: {
                    n14 = 3;
                    break;
                }
                case 85: {
                    n14 = 68;
                    break;
                }
                case 86: {
                    n14 = 94;
                    break;
                }
                case 87: {
                    n14 = 230;
                    break;
                }
                case 88: {
                    n14 = 109;
                    break;
                }
                case 89: {
                    n14 = 115;
                    break;
                }
                case 90: {
                    n14 = 95;
                    break;
                }
                case 91: {
                    n14 = 136;
                    break;
                }
                case 92: {
                    n14 = 160;
                    break;
                }
                case 93: {
                    n14 = 18;
                    break;
                }
                case 94: {
                    n14 = 153;
                    break;
                }
                case 95: {
                    n14 = 227;
                    break;
                }
                case 96: {
                    n14 = 41;
                    break;
                }
                case 97: {
                    n14 = 55;
                    break;
                }
                case 98: {
                    n14 = 79;
                    break;
                }
                case 99: {
                    n14 = 50;
                    break;
                }
                case 100: {
                    n14 = 13;
                    break;
                }
                case 101: {
                    n14 = 20;
                    break;
                }
                case 102: {
                    n14 = 250;
                    break;
                }
                case 103: {
                    n14 = 60;
                    break;
                }
                case 104: {
                    n14 = 188;
                    break;
                }
                case 105: {
                    n14 = 76;
                    break;
                }
                case 106: {
                    n14 = 7;
                    break;
                }
                case 107: {
                    n14 = 82;
                    break;
                }
                case 108: {
                    n14 = 92;
                    break;
                }
                case 109: {
                    n14 = 103;
                    break;
                }
                case 110: {
                    n14 = 43;
                    break;
                }
                case 111: {
                    n14 = 129;
                    break;
                }
                case 112: {
                    n14 = 200;
                    break;
                }
                case 113: {
                    n14 = 246;
                    break;
                }
                case 114: {
                    n14 = 113;
                    break;
                }
                case 115: {
                    n14 = 71;
                    break;
                }
                case 116: {
                    n14 = 2;
                    break;
                }
                case 117: {
                    n14 = 131;
                    break;
                }
                case 118: {
                    n14 = 32;
                    break;
                }
                case 119: {
                    n14 = 52;
                    break;
                }
                case 120: {
                    n14 = 180;
                    break;
                }
                case 121: {
                    n14 = 243;
                    break;
                }
                case 122: {
                    n14 = 134;
                    break;
                }
                case 123: {
                    n14 = 86;
                    break;
                }
                case 124: {
                    n14 = 45;
                    break;
                }
                case 125: {
                    n14 = 201;
                    break;
                }
                case 126: {
                    n14 = 54;
                    break;
                }
                case 127: {
                    n14 = 169;
                    break;
                }
                case 128: {
                    n14 = 59;
                    break;
                }
                case 129: {
                    n14 = 0;
                    break;
                }
                case 130: {
                    n14 = 75;
                    break;
                }
                case 131: {
                    n14 = 14;
                    break;
                }
                case 132: {
                    n14 = 105;
                    break;
                }
                case 133: {
                    n14 = 185;
                    break;
                }
                case 134: {
                    n14 = 253;
                    break;
                }
                case 135: {
                    n14 = 80;
                    break;
                }
                case 136: {
                    n14 = 184;
                    break;
                }
                case 137: {
                    n14 = 168;
                    break;
                }
                case 138: {
                    n14 = 33;
                    break;
                }
                case 139: {
                    n14 = 233;
                    break;
                }
                case 140: {
                    n14 = 254;
                    break;
                }
                case 141: {
                    n14 = 111;
                    break;
                }
                case 142: {
                    n14 = 239;
                    break;
                }
                case 143: {
                    n14 = 249;
                    break;
                }
                case 144: {
                    n14 = 37;
                    break;
                }
                case 145: {
                    n14 = 102;
                    break;
                }
                case 146: {
                    n14 = 39;
                    break;
                }
                case 147: {
                    n14 = 193;
                    break;
                }
                case 148: {
                    n14 = 57;
                    break;
                }
                case 149: {
                    n14 = 138;
                    break;
                }
                case 150: {
                    n14 = 31;
                    break;
                }
                case 151: {
                    n14 = 170;
                    break;
                }
                case 152: {
                    n14 = 127;
                    break;
                }
                case 153: {
                    n14 = 98;
                    break;
                }
                case 154: {
                    n14 = 174;
                    break;
                }
                case 155: {
                    n14 = 6;
                    break;
                }
                case 156: {
                    n14 = 141;
                    break;
                }
                case 157: {
                    n14 = 216;
                    break;
                }
                case 158: {
                    n14 = 70;
                    break;
                }
                case 159: {
                    n14 = 179;
                    break;
                }
                case 160: {
                    n14 = 237;
                    break;
                }
                case 161: {
                    n14 = 145;
                    break;
                }
                case 162: {
                    n14 = 117;
                    break;
                }
                case 163: {
                    n14 = 195;
                    break;
                }
                case 164: {
                    n14 = 135;
                    break;
                }
                case 165: {
                    n14 = 217;
                    break;
                }
                case 166: {
                    n14 = 167;
                    break;
                }
                case 167: {
                    n14 = 23;
                    break;
                }
                case 168: {
                    n14 = 114;
                    break;
                }
                case 169: {
                    n14 = 11;
                    break;
                }
                case 170: {
                    n14 = 56;
                    break;
                }
                case 171: {
                    n14 = 26;
                    break;
                }
                case 172: {
                    n14 = 128;
                    break;
                }
                case 173: {
                    n14 = 229;
                    break;
                }
                case 174: {
                    n14 = 190;
                    break;
                }
                case 175: {
                    n14 = 29;
                    break;
                }
                case 176: {
                    n14 = 248;
                    break;
                }
                case 177: {
                    n14 = 178;
                    break;
                }
                case 178: {
                    n14 = 181;
                    break;
                }
                case 179: {
                    n14 = 10;
                    break;
                }
                case 180: {
                    n14 = 21;
                    break;
                }
                case 181: {
                    n14 = 121;
                    break;
                }
                case 182: {
                    n14 = 228;
                    break;
                }
                case 183: {
                    n14 = 204;
                    break;
                }
                case 184: {
                    n14 = 163;
                    break;
                }
                case 185: {
                    n14 = 161;
                    break;
                }
                case 186: {
                    n14 = 87;
                    break;
                }
                case 187: {
                    n14 = 85;
                    break;
                }
                case 188: {
                    n14 = 205;
                    break;
                }
                case 189: {
                    n14 = 242;
                    break;
                }
                case 190: {
                    n14 = 191;
                    break;
                }
                case 191: {
                    n14 = 78;
                    break;
                }
                case 192: {
                    n14 = 203;
                    break;
                }
                case 193: {
                    n14 = 100;
                    break;
                }
                case 194: {
                    n14 = 99;
                    break;
                }
                case 195: {
                    n14 = 199;
                    break;
                }
                case 196: {
                    n14 = 198;
                    break;
                }
                case 197: {
                    n14 = 90;
                    break;
                }
                case 198: {
                    n14 = 107;
                    break;
                }
                case 199: {
                    n14 = 146;
                    break;
                }
                case 200: {
                    n14 = 49;
                    break;
                }
                case 201: {
                    n14 = 69;
                    break;
                }
                case 202: {
                    n14 = 15;
                    break;
                }
                case 203: {
                    n14 = 192;
                    break;
                }
                case 204: {
                    n14 = 104;
                    break;
                }
                case 205: {
                    n14 = 47;
                    break;
                }
                case 206: {
                    n14 = 241;
                    break;
                }
                case 207: {
                    n14 = 61;
                    break;
                }
                case 208: {
                    n14 = 215;
                    break;
                }
                case 209: {
                    n14 = 220;
                    break;
                }
                case 210: {
                    n14 = 120;
                    break;
                }
                case 211: {
                    n14 = 140;
                    break;
                }
                case 212: {
                    n14 = 143;
                    break;
                }
                case 213: {
                    n14 = 130;
                    break;
                }
                case 214: {
                    n14 = 19;
                    break;
                }
                case 215: {
                    n14 = 232;
                    break;
                }
                case 216: {
                    n14 = 67;
                    break;
                }
                case 217: {
                    n14 = 84;
                    break;
                }
                case 218: {
                    n14 = 151;
                    break;
                }
                case 219: {
                    n14 = 223;
                    break;
                }
                case 220: {
                    n14 = 182;
                    break;
                }
                case 221: {
                    n14 = 48;
                    break;
                }
                case 222: {
                    n14 = 206;
                    break;
                }
                case 223: {
                    n14 = 17;
                    break;
                }
                case 224: {
                    n14 = 186;
                    break;
                }
                case 225: {
                    n14 = 158;
                    break;
                }
                case 226: {
                    n14 = 83;
                    break;
                }
                case 227: {
                    n14 = 147;
                    break;
                }
                case 228: {
                    n14 = 38;
                    break;
                }
                case 229: {
                    n14 = 207;
                    break;
                }
                case 230: {
                    n14 = 89;
                    break;
                }
                case 231: {
                    n14 = 28;
                    break;
                }
                case 232: {
                    n14 = 123;
                    break;
                }
                case 233: {
                    n14 = 133;
                    break;
                }
                case 234: {
                    n14 = 152;
                    break;
                }
                case 235: {
                    n14 = 93;
                    break;
                }
                case 236: {
                    n14 = 247;
                    break;
                }
                case 237: {
                    n14 = 159;
                    break;
                }
                case 238: {
                    n14 = 218;
                    break;
                }
                case 239: {
                    n14 = 177;
                    break;
                }
                case 240: {
                    n14 = 12;
                    break;
                }
                case 241: {
                    n14 = 255;
                    break;
                }
                case 242: {
                    n14 = 126;
                    break;
                }
                case 243: {
                    n14 = 65;
                    break;
                }
                case 244: {
                    n14 = 187;
                    break;
                }
                case 245: {
                    n14 = 173;
                    break;
                }
                case 246: {
                    n14 = 157;
                    break;
                }
                case 247: {
                    n14 = 27;
                    break;
                }
                case 248: {
                    n14 = 4;
                    break;
                }
                case 249: {
                    n14 = 139;
                    break;
                }
                case 250: {
                    n14 = 62;
                    break;
                }
                case 251: {
                    n14 = 224;
                    break;
                }
                case 252: {
                    n14 = 132;
                    break;
                }
                case 253: {
                    n14 = 16;
                    break;
                }
                case 254: {
                    n14 = 226;
                    break;
                }
                default: {
                    n14 = 234;
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
            wa_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

