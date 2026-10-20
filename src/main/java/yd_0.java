/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

/*
 * Renamed from Yd
 */
public class yd_0
extends TransferHandler {
    DataFlavor p;
    DataFlavor u;
    private static final String[] a;
    private static final String[] b;

    public yd_0() {
        String string = "application/x-java-jvm-local-objectref;class=\"" + Object.class.getName() + "\"";
        try {
            this.p = new DataFlavor(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        try {
            this.u = new DataFlavor("text/uri-list;class=java.io.Reader;charset=Unicode");
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public boolean canImport(TransferHandler.TransferSupport var1_1) {
        block39: {
            block43: {
                block44: {
                    block41: {
                        block42: {
                            block50: {
                                block49: {
                                    block40: {
                                        block36: {
                                            block37: {
                                                block38: {
                                                    var3_2 = null;
                                                    var4_3 = null;
                                                    var2_4 = km_0.U();
                                                    var5_5 = var1_1.getComponent();
                                                    try {
                                                        v0 = var5_5.getClass().equals(JScrollPane.class);
                                                        if (var2_4 != null) break block36;
                                                        if (!v0) break block37;
                                                    }
                                                    catch (Exception v1) {
                                                        throw yd_0.a(v1);
                                                    }
                                                    var4_3 = (JScrollPane)var1_1.getComponent();
                                                    var3_2 = (km_0)var4_3.getViewport().getView();
                                                    var6_6 = (kl_2)var3_2.getModel();
                                                    var7_8 = var1_1.getDropLocation();
                                                    try {
                                                        v2 = var1_1.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
                                                        if (var2_4 != null) break block38;
                                                        if (!v2) break block39;
                                                    }
                                                    catch (Exception v3) {
                                                        throw yd_0.a(v3);
                                                    }
                                                    v2 = true;
                                                }
                                                return v2;
                                            }
                                            try {
                                                v4 = var5_5;
                                                if (var2_4 != null) break block40;
                                                v0 = v4.getClass().equals(JScrollPane.class);
                                            }
                                            catch (Exception v5) {
                                                throw yd_0.a(v5);
                                            }
                                        }
                                        if (!v0) break block39;
                                        v4 = var5_5;
                                    }
                                    var6_7 = (JScrollPane)v4;
                                    var3_2 = (km_0)var6_7.getViewport().getView();
                                    var7_9 = (kl_2)var3_2.getModel();
                                    var8_10 = (JTable.DropLocation)var1_1.getDropLocation();
                                    var9_11 = var8_10.getRow();
                                    try {
                                        v6 = var3_2.L(var9_11);
                                    }
                                    catch (InvocationTargetException v7) {
                                        throw v7.getTargetException();
                                    }
                                    var10_12 = v6;
                                    v8 = var1_1.isDataFlavorSupported((DataFlavor)this.p);
                                    if (var2_4 != null) break block41;
                                    if (v8 == 0) break block42;
                                    break block49;
                                    catch (Exception v9) {
                                        throw yd_0.a(v9);
                                    }
                                }
                                v8 = (int)var10_12.getClass().equals(tf_2.class);
                                if (var2_4 != null) break block41;
                                break block50;
                                catch (Exception v10) {
                                    throw yd_0.a(v10);
                                }
                            }
                            try {
                                block51: {
                                    if (v8 != 0) break block42;
                                    break block51;
                                    catch (Exception v11) {
                                        throw yd_0.a(v11);
                                    }
                                }
                                return false;
                            }
                            catch (Exception v12) {
                                throw yd_0.a(v12);
                            }
                        }
                        v8 = var1_1.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
                    }
                    if (var2_4 != null) break block43;
                    try {
                        block52: {
                            if (v8 == 0) break block44;
                            break block52;
                            catch (Exception v13) {
                                throw yd_0.a(v13);
                            }
                        }
                        return true;
                    }
                    catch (Exception v14) {
                        throw yd_0.a(v14);
                    }
                }
                v8 = var11_13 = var8_10.getColumn();
            }
            if (!(var13_15 = (var12_14 = var1_1.getTransferable()).getTransferDataFlavors()[0]).equals((DataFlavor)this.p)) break block39;
            var14_16 = null;
            try {
                var14_16 = (Object[])var12_14.getTransferData((DataFlavor)this.p);
            }
            catch (Exception var15_17) {
                var15_17.printStackTrace();
            }
            var15_18 = (tf_2)var10_12;
            try {
                v15 = (String)var15_18.k();
            }
            catch (InvocationTargetException v16) {
                throw v16.getTargetException();
            }
            var16_19 = v15;
            for (Class<?> var20_23 : var14_16) {
                block48: {
                    block45: {
                        block47: {
                            block46: {
                                try {
                                    v17 = var20_23.getClass().equals(tf_2.class);
                                    if (var2_4 != null) break block45;
                                    if (v17) {
                                    }
                                    ** GOTO lbl137
                                }
                                catch (Exception v18) {
                                    throw yd_0.a(v18);
                                }
                                var21_24 /* !! */  = (tf_2)var20_23;
                                try {
                                    try {
                                        v19 = (String)var21_24 /* !! */.k();
                                    }
                                    catch (InvocationTargetException v20) {
                                        throw v20.getTargetException();
                                    }
                                    v21 = v19.equals(var16_19);
                                    if (var2_4 != null) break block46;
                                    if (!v21) break block47;
                                }
                                catch (Exception v22) {
                                    throw yd_0.a(v22);
                                }
                                v21 = false;
                            }
                            return v21;
                        }
                        try {
                            try {
                                if (var2_4 == null) continue;
lbl137:
                                // 2 sources

                                v23 = var20_23.getClass();
                                if (var2_4 != null) break block48;
                            }
                            catch (Exception v24) {
                                throw yd_0.a(v24);
                            }
                            v17 = v23.equals(ck_2.class);
                        }
                        catch (Exception v25) {
                            throw yd_0.a(v25);
                        }
                    }
                    if (!v17) continue;
                    v23 = var20_23;
                }
                var21_24 /* !! */  = (ck_2)v23;
            }
        }
        return true;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        String string = km_0.U();
        JTable jTable = (JTable)jComponent;
        int n10 = jTable.getSelectedRow();
        int n11 = jTable.getSelectedColumn();
        jTable.getModel().setValueAt(null, n10, n11);
        int[] nArray = jTable.getSelectedRows();
        Object[] objectArray = new Object[nArray.length];
        kl_2 kl_22 = (kl_2)jTable.getModel();
        String string2 = string;
        int[] nArray2 = jTable.getSelectedRows();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            Object object;
            try {
                object = kl_22.G(jTable.convertRowIndexToModel(nArray2[i2]));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            objectArray[i2] = object;
            if (string2 == null) continue;
        }
        uk_2 uk_22 = new uk_2(this, objectArray);
        return uk_22;
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
        block164: {
            block160: {
                block158: {
                    block159: {
                        var3_2 = null;
                        var4_3 = null;
                        var2_4 = km_0.U();
                        v0 = var1_1.isDrop();
                        if (var2_4 != null) break block158;
                        try {
                            block184: {
                                if (v0) break block159;
                                break block184;
                                catch (Exception v1) {
                                    throw yd_0.a(v1);
                                }
                            }
                            return false;
                        }
                        catch (Exception v2) {
                            throw yd_0.a(v2);
                        }
                    }
                    try {
                        v0 = (Boolean)this.canImport(var1_1);
                    }
                    catch (InvocationTargetException v3) {
                        throw v3.getTargetException();
                    }
                }
                if (var2_4 != null) ** GOTO lbl43
                try {
                    block185: {
                        if (v0) break block160;
                        break block185;
                        catch (Exception v4) {
                            throw yd_0.a(v4);
                        }
                    }
                    return false;
                }
                catch (Exception v5) {
                    throw yd_0.a(v5);
                }
            }
            try {
                block183: {
                    block182: {
                        block179: {
                            block176: {
                                block177: {
                                    block175: {
                                        block174: {
                                            block173: {
                                                block194: {
                                                    block161: {
                                                        block186: {
                                                            block172: {
                                                                block171: {
                                                                    block168: {
                                                                        block165: {
                                                                            block166: {
                                                                                block163: {
                                                                                    block162: {
                                                                                        try {
                                                                                            v6 = var1_1.getComponent();
                                                                                            if (var2_4 != null) break block161;
                                                                                            v0 = v6 instanceof JScrollPane;
                                                                                        }
                                                                                        catch (Exception v7) {
                                                                                            throw yd_0.a(v7);
                                                                                        }
lbl43:
                                                                                        // 2 sources

                                                                                        if (!v0) break block186;
                                                                                        var4_3 = (JScrollPane)var1_1.getComponent();
                                                                                        var3_2 = (km_0)var4_3.getViewport().getView();
                                                                                        try {
                                                                                            v8 = (F6)var3_2.b();
                                                                                        }
                                                                                        catch (InvocationTargetException v9) {
                                                                                            throw v9.getTargetException();
                                                                                        }
                                                                                        var5_5 = v8;
                                                                                        var6_8 = (kl_2)var3_2.getModel();
                                                                                        var7_10 = var1_1.getDropLocation();
                                                                                        var8_12 = var1_1.getTransferable();
                                                                                        var9_14 = var8_12.getTransferDataFlavors()[0];
                                                                                        v10 = var9_14.equals(DataFlavor.javaFileListFlavor);
                                                                                        if (var2_4 != null) break block162;
                                                                                        try {
                                                                                            block187: {
                                                                                                if (v10) break block163;
                                                                                                break block187;
                                                                                                catch (Exception v11) {
                                                                                                    throw yd_0.a(v11);
                                                                                                }
                                                                                            }
                                                                                            v10 = var9_14.equals((DataFlavor)this.u);
                                                                                        }
                                                                                        catch (Exception v12) {
                                                                                            throw yd_0.a(v12);
                                                                                        }
                                                                                    }
                                                                                    if (!v10) break block164;
                                                                                }
                                                                                var10_16 = var8_12.getTransferDataFlavors();
                                                                                var11_18 = DataFlavor.javaFileListFlavor;
                                                                                try {
                                                                                    v13 = var9_14;
                                                                                    if (var2_4 != null) break block165;
                                                                                    if (!v13.equals((DataFlavor)this.u)) break block166;
                                                                                }
                                                                                catch (Exception v14) {
                                                                                    throw yd_0.a(v14);
                                                                                }
                                                                                var12_20 = var10_16;
                                                                                var13_22 = var12_20.length;
                                                                                var14_25 = 0;
                                                                                while (var14_25 < var13_22) {
                                                                                    block167: {
                                                                                        var15_29 = var12_20[var14_25];
                                                                                        if (var2_4 != null) break block167;
                                                                                        try {
                                                                                            block188: {
                                                                                                v13 = var15_29;
                                                                                                if (var2_4 != null) break block165;
                                                                                                break block188;
                                                                                                catch (Exception v15) {
                                                                                                    throw yd_0.a(v15);
                                                                                                }
                                                                                            }
                                                                                            if (v13.equals(DataFlavor.javaFileListFlavor)) {
                                                                                            }
                                                                                            ** GOTO lbl104
                                                                                        }
                                                                                        catch (Exception v16) {
                                                                                            throw yd_0.a(v16);
                                                                                        }
                                                                                        var11_18 = var15_29;
                                                                                        try {
                                                                                            if (var2_4 == null) break;
lbl104:
                                                                                            // 2 sources

                                                                                            ++var14_25;
                                                                                        }
                                                                                        catch (Exception v17) {
                                                                                            throw yd_0.a(v17);
                                                                                        }
                                                                                    }
                                                                                    if (var2_4 == null) continue;
                                                                                }
                                                                            }
                                                                            v13 = var8_12.getTransferData(var11_18);
                                                                        }
                                                                        var12_20 = (DataFlavor[])v13;
                                                                        for (File var14_26 : var12_20) {
                                                                            if (var2_4 == null) continue;
                                                                        }
                                                                        var13_23 = new ArrayList<E>();
                                                                        var14_27 = new ArrayList<File>();
                                                                        var15_29 = null;
                                                                        try {
                                                                            v18 = var3_2.b();
                                                                        }
                                                                        catch (InvocationTargetException v19) {
                                                                            throw v19.getTargetException();
                                                                        }
                                                                        try {
                                                                            v20 = v18.M();
                                                                        }
                                                                        catch (InvocationTargetException v21) {
                                                                            throw v21.getTargetException();
                                                                        }
                                                                        try {
                                                                            v22 = v20.f();
                                                                        }
                                                                        catch (InvocationTargetException v23) {
                                                                            throw v23.getTargetException();
                                                                        }
                                                                        try {
                                                                            v24 = (String)v22.k();
                                                                        }
                                                                        catch (InvocationTargetException v25) {
                                                                            throw v25.getTargetException();
                                                                        }
                                                                        var16_31 = v24;
                                                                        var17_34 = var12_20.iterator();
                                                                        block144: while (true) {
                                                                            v26 = var17_34.hasNext();
                                                                            block145: while (v26) {
                                                                                block169: {
                                                                                    var18_38 = (File)var17_34.next();
                                                                                    var15_29 = var18_38.getParent();
                                                                                    v27 = var18_38.isDirectory();
                                                                                    if (var2_4 != null) break block168;
                                                                                    try {
                                                                                        block189: {
                                                                                            if (var2_4 != null) break block169;
                                                                                            break block189;
                                                                                            catch (Exception v28) {
                                                                                                throw yd_0.a(v28);
                                                                                            }
                                                                                        }
                                                                                        if (v27) {
                                                                                        }
                                                                                        ** GOTO lbl196
                                                                                    }
                                                                                    catch (Exception v29) {
                                                                                        throw yd_0.a(v29);
                                                                                    }
                                                                                    var13_23.add(new File(var18_38.getPath()));
                                                                                    try {
                                                                                        v30 = (ArrayList)lk_0.a(var18_38.getPath());
                                                                                    }
                                                                                    catch (InvocationTargetException v31) {
                                                                                        throw v31.getTargetException();
                                                                                    }
                                                                                    var19_40 = v30;
                                                                                    for (File var21_44 : var19_40) {
                                                                                        block170: {
                                                                                            block190: {
                                                                                                v26 = var21_44.isDirectory();
                                                                                                if (var2_4 != null) continue block145;
                                                                                                if (var2_4 != null) break block170;
                                                                                                if (!v26) ** GOTO lbl187
                                                                                                break block190;
                                                                                                catch (Exception v32) {
                                                                                                    throw yd_0.a(v32);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                block191: {
                                                                                                    var13_23.add(var21_44);
                                                                                                    if (var2_4 == null) break block170;
                                                                                                    break block191;
                                                                                                    catch (Exception v33) {
                                                                                                        throw yd_0.a(v33);
                                                                                                    }
                                                                                                }
                                                                                                var14_27.add(var21_44);
                                                                                            }
                                                                                            catch (Exception v34) {
                                                                                                throw yd_0.a(v34);
                                                                                            }
                                                                                        }
                                                                                        if (var2_4 == null) continue;
                                                                                    }
                                                                                    try {
                                                                                        if (var2_4 == null) continue block144;
lbl196:
                                                                                        // 2 sources

                                                                                        v35 = var18_38.isFile();
                                                                                    }
                                                                                    catch (Exception v36) {
                                                                                        throw yd_0.a(v36);
                                                                                    }
                                                                                }
                                                                                if (var2_4 != null) continue block144;
                                                                                try {
                                                                                    block192: {
                                                                                        if (!v35) continue block144;
                                                                                        break block192;
                                                                                        catch (Exception v37) {
                                                                                            throw yd_0.a(v37);
                                                                                        }
                                                                                    }
                                                                                    v35 = var14_27.add(new File(var18_38.getPath()));
                                                                                    continue block144;
                                                                                }
                                                                                catch (Exception v38) {
                                                                                    throw yd_0.a(v38);
                                                                                }
                                                                                if (var2_4 == null) continue block144;
                                                                            }
                                                                            break;
                                                                        }
                                                                        try {
                                                                            v39 = yt_1.i();
                                                                        }
                                                                        catch (InvocationTargetException v40) {
                                                                            throw v40.getTargetException();
                                                                        }
                                                                        try {
                                                                            v41 = v39.h();
                                                                        }
                                                                        catch (InvocationTargetException v42) {
                                                                            throw v42.getTargetException();
                                                                        }
                                                                        try {
                                                                            v27 = (Boolean)v41.I();
                                                                        }
                                                                        catch (InvocationTargetException v43) {
                                                                            throw v43.getTargetException();
                                                                        }
                                                                    }
                                                                    if (var2_4 != null) break block171;
                                                                    try {
                                                                        block193: {
                                                                            if (!v27) break block172;
                                                                            break block193;
                                                                            catch (Exception v44) {
                                                                                throw yd_0.a(v44);
                                                                            }
                                                                        }
                                                                        try {
                                                                            v45 = yt_1.i();
                                                                        }
                                                                        catch (InvocationTargetException v46) {
                                                                            throw v46.getTargetException();
                                                                        }
                                                                        try {
                                                                            v47 = v45.P();
                                                                        }
                                                                        catch (InvocationTargetException v48) {
                                                                            throw v48.getTargetException();
                                                                        }
                                                                        try {
                                                                            v27 = (Boolean)v47.v();
                                                                        }
                                                                        catch (InvocationTargetException v49) {
                                                                            throw v49.getTargetException();
                                                                        }
                                                                    }
                                                                    catch (Exception v50) {
                                                                        throw yd_0.a(v50);
                                                                    }
                                                                }
                                                                if (v27) {
                                                                    var17_34 = var15_29;
                                                                    var18_38 = new nq_0(SwingUtilities.getWindowAncestor(var5_5), var5_5);
                                                                    try {
                                                                        yt_1.F.J(new am_0(this, (String)var17_34, (nq_0)var18_38, (List)var12_20, var16_31));
                                                                    }
                                                                    catch (InvocationTargetException v51) {
                                                                        throw v51.getTargetException();
                                                                    }
                                                                }
                                                            }
                                                            var17_34 = var15_29;
                                                            try {
                                                                yt_1.F.J(new ch_2(this, var13_23, var5_5, (String)var17_34, var16_31, var14_27));
                                                            }
                                                            catch (InvocationTargetException v52) {
                                                                throw v52.getTargetException();
                                                            }
                                                            return true;
                                                        }
                                                        v6 = var1_1.getComponent();
                                                    }
                                                    var3_2 = (km_0)v6;
                                                    try {
                                                        v53 = (F6)var3_2.b();
                                                    }
                                                    catch (InvocationTargetException v54) {
                                                        throw v54.getTargetException();
                                                    }
                                                    var5_6 = v53;
                                                    var6_9 = (kl_2)var3_2.getModel();
                                                    var7_11 = (JTable.DropLocation)var1_1.getDropLocation();
                                                    var8_13 = var7_11.getRow();
                                                    var9_15 = var7_11.getColumn();
                                                    var10_17 = var1_1.getTransferable();
                                                    var11_19 = var10_17.getTransferDataFlavors()[0];
                                                    var12_21 = var3_2;
                                                    v55 = var11_19.equals((DataFlavor)this.p);
                                                    if (var2_4 != null) break block173;
                                                    if (!v55) ** GOTO lbl315
                                                    break block194;
                                                    catch (Exception v56) {
                                                        throw yd_0.a(v56);
                                                    }
                                                }
                                                try {
                                                    block195: {
                                                        try {
                                                            yt_1.F.J(new A(this, var10_17, var12_21, var8_13));
                                                        }
                                                        catch (InvocationTargetException v57) {
                                                            throw v57.getTargetException();
                                                        }
                                                        if (var2_4 == null) break block164;
                                                        break block195;
                                                        catch (Exception v58) {
                                                            throw yd_0.a(v58);
                                                        }
                                                    }
                                                    v55 = var11_19.equals(DataFlavor.javaFileListFlavor);
                                                }
                                                catch (Exception v59) {
                                                    throw yd_0.a(v59);
                                                }
                                            }
                                            if (var2_4 != null) break block174;
                                            try {
                                                block196: {
                                                    if (v55) break block175;
                                                    break block196;
                                                    catch (Exception v60) {
                                                        throw yd_0.a(v60);
                                                    }
                                                }
                                                v55 = var11_19.equals((DataFlavor)this.u);
                                            }
                                            catch (Exception v61) {
                                                throw yd_0.a(v61);
                                            }
                                        }
                                        if (!v55) break block164;
                                    }
                                    var13_24 = var10_17.getTransferDataFlavors();
                                    var14_28 = DataFlavor.javaFileListFlavor;
                                    try {
                                        v62 = var11_19;
                                        if (var2_4 != null) break block176;
                                        if (!v62.equals((DataFlavor)this.u)) break block177;
                                    }
                                    catch (Exception v63) {
                                        throw yd_0.a(v63);
                                    }
                                    var15_30 = var13_24;
                                    var16_32 = var15_30.length;
                                    var17_35 = 0;
                                    while (var17_35 < var16_32) {
                                        block178: {
                                            var18_39 = var15_30[var17_35];
                                            if (var2_4 != null) break block178;
                                            try {
                                                block197: {
                                                    v62 = var18_39;
                                                    if (var2_4 != null) break block176;
                                                    break block197;
                                                    catch (Exception v64) {
                                                        throw yd_0.a(v64);
                                                    }
                                                }
                                                if (v62.equals(DataFlavor.javaFileListFlavor)) {
                                                }
                                                ** GOTO lbl367
                                            }
                                            catch (Exception v65) {
                                                throw yd_0.a(v65);
                                            }
                                            var14_28 = var18_39;
                                            try {
                                                if (var2_4 == null) break;
lbl367:
                                                // 2 sources

                                                ++var17_35;
                                            }
                                            catch (Exception v66) {
                                                throw yd_0.a(v66);
                                            }
                                        }
                                        if (var2_4 == null) continue;
                                    }
                                }
                                v62 = var10_17.getTransferData(var14_28);
                            }
                            var15_30 = (DataFlavor[])v62;
                            for (File var17_36 : var15_30) {
                                if (var2_4 == null) continue;
                            }
                            var16_33 = new ArrayList<E>();
                            var17_37 = new ArrayList<File>();
                            var18_39 = null;
                            try {
                                v67 = var3_2.b();
                            }
                            catch (InvocationTargetException v68) {
                                throw v68.getTargetException();
                            }
                            try {
                                v69 = v67.M();
                            }
                            catch (InvocationTargetException v70) {
                                throw v70.getTargetException();
                            }
                            try {
                                v71 = v69.f();
                            }
                            catch (InvocationTargetException v72) {
                                throw v72.getTargetException();
                            }
                            try {
                                v73 = (String)v71.k();
                            }
                            catch (InvocationTargetException v74) {
                                throw v74.getTargetException();
                            }
                            var19_41 = v73;
                            var20_43 = var15_30.iterator();
                            block149: while (true) {
                                v75 = var20_43.hasNext();
                                block150: while (v75) {
                                    block180: {
                                        var21_45 = (File)var20_43.next();
                                        var18_39 = var21_45.getParent();
                                        v76 = var21_45.isDirectory();
                                        if (var2_4 != null) break block179;
                                        try {
                                            block198: {
                                                if (var2_4 != null) break block180;
                                                break block198;
                                                catch (Exception v77) {
                                                    throw yd_0.a(v77);
                                                }
                                            }
                                            if (v76) {
                                            }
                                            ** GOTO lbl459
                                        }
                                        catch (Exception v78) {
                                            throw yd_0.a(v78);
                                        }
                                        var16_33.add(new File(var21_45.getPath()));
                                        try {
                                            v79 = (ArrayList)lk_0.a(var21_45.getPath());
                                        }
                                        catch (InvocationTargetException v80) {
                                            throw v80.getTargetException();
                                        }
                                        var22_46 = v79;
                                        for (File var24_48 : var22_46) {
                                            block181: {
                                                block199: {
                                                    v75 = var24_48.isDirectory();
                                                    if (var2_4 != null) continue block150;
                                                    if (var2_4 != null) break block181;
                                                    if (!v75) ** GOTO lbl450
                                                    break block199;
                                                    catch (Exception v81) {
                                                        throw yd_0.a(v81);
                                                    }
                                                }
                                                try {
                                                    block200: {
                                                        var16_33.add(var24_48);
                                                        if (var2_4 == null) break block181;
                                                        break block200;
                                                        catch (Exception v82) {
                                                            throw yd_0.a(v82);
                                                        }
                                                    }
                                                    var17_37.add(var24_48);
                                                }
                                                catch (Exception v83) {
                                                    throw yd_0.a(v83);
                                                }
                                            }
                                            if (var2_4 == null) continue;
                                        }
                                        try {
                                            if (var2_4 == null) continue block149;
lbl459:
                                            // 2 sources

                                            v84 = var21_45.isFile();
                                        }
                                        catch (Exception v85) {
                                            throw yd_0.a(v85);
                                        }
                                    }
                                    if (var2_4 != null) continue block149;
                                    try {
                                        block201: {
                                            if (!v84) continue block149;
                                            break block201;
                                            catch (Exception v86) {
                                                throw yd_0.a(v86);
                                            }
                                        }
                                        v84 = var17_37.add(new File(var21_45.getPath()));
                                        continue block149;
                                    }
                                    catch (Exception v87) {
                                        throw yd_0.a(v87);
                                    }
                                    if (var2_4 == null) continue block149;
                                }
                                break;
                            }
                            try {
                                v88 = yt_1.i();
                            }
                            catch (InvocationTargetException v89) {
                                throw v89.getTargetException();
                            }
                            try {
                                v90 = v88.h();
                            }
                            catch (InvocationTargetException v91) {
                                throw v91.getTargetException();
                            }
                            try {
                                v76 = (Boolean)v90.I();
                            }
                            catch (InvocationTargetException v92) {
                                throw v92.getTargetException();
                            }
                        }
                        if (var2_4 != null) break block182;
                        try {
                            block202: {
                                if (!v76) break block183;
                                break block202;
                                catch (Exception v93) {
                                    throw yd_0.a(v93);
                                }
                            }
                            try {
                                v94 = yt_1.i();
                            }
                            catch (InvocationTargetException v95) {
                                throw v95.getTargetException();
                            }
                            try {
                                v96 = v94.P();
                            }
                            catch (InvocationTargetException v97) {
                                throw v97.getTargetException();
                            }
                            try {
                                v76 = (Boolean)v96.v();
                            }
                            catch (InvocationTargetException v98) {
                                throw v98.getTargetException();
                            }
                        }
                        catch (Exception v99) {
                            throw yd_0.a(v99);
                        }
                    }
                    if (v76) {
                        var20_43 = var18_39;
                        var21_45 = new nq_0(SwingUtilities.getWindowAncestor(var5_6), var5_6);
                        try {
                            yt_1.F.J(new QJ(this, (String)var20_43, (nq_0)var21_45, (List)var15_30, var19_41));
                        }
                        catch (InvocationTargetException v100) {
                            throw v100.getTargetException();
                        }
                    }
                }
                var20_43 = var18_39;
                try {
                    yt_1.F.J(new fh_0(this, var16_33, var5_6, (String)var20_43, var19_41, var17_37));
                }
                catch (InvocationTargetException v101) {
                    throw v101.getTargetException();
                }
                return true;
            }
            catch (Exception var5_7) {
                var5_7.printStackTrace();
            }
        }
        return true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = " \u00da\u0001\u00ff\u00f7\u00ad#(\u008b\u00aa\u0089H\u00dcJ-\u0087L{8\u0092\u0015\u0086\r{.\u00c4\u009c\u0097l\u0082s\u00e4\u00c9\u00db\u00ae\u000b\u001f\u0088\u00ed\u00a09\u0018\u00fcR\u00ec\u00c5\u00d2NT\u0001.\u0016\u00d5x\u00b1\u0097i\u00b2y\u008c=\u00a2\u0085R2xQ\u00d9\u001f!\u0019\u00bfF\u009c\u00e3mq\u0093(=u\u00ca_\u009drk\u001c\f^j\u008d\u00a0\u00ba\u00a9\u0097\u0092\u00d4";
            var4_3 = " \u00da\u0001\u00ff\u00f7\u00ad#(\u008b\u00aa\u0089H\u00dcJ-\u0087L{8\u0092\u0015\u0086\r{.\u00c4\u009c\u0097l\u0082s\u00e4\u00c9\u00db\u00ae\u000b\u001f\u0088\u00ed\u00a09\u0018\u00fcR\u00ec\u00c5\u00d2NT\u0001.\u0016\u00d5x\u00b1\u0097i\u00b2y\u008c=\u00a2\u0085R2xQ\u00d9\u001f!\u0019\u00bfF\u009c\u00e3mq\u0093(=u\u00ca_\u009drk\u001c\f^j\u008d\u00a0\u00ba\u00a9\u0097\u0092\u00d4".length();
            var1_4 = 50;
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
            v4 = 60;
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
                            v11 = 113;
                            break;
                        }
                        case 1: {
                            v11 = 71;
                            break;
                        }
                        case 2: {
                            v11 = 18;
                            break;
                        }
                        case 3: {
                            v11 = 74;
                            break;
                        }
                        case 4: {
                            v11 = 118;
                            break;
                        }
                        case 5: {
                            v11 = 47;
                            break;
                        }
                        default: {
                            v11 = 16;
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
        yd_0.a = var5;
        yd_0.b = new String[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9BAB) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 81;
                    break;
                }
                case 1: {
                    n14 = 1;
                    break;
                }
                case 2: {
                    n14 = 106;
                    break;
                }
                case 3: {
                    n14 = 201;
                    break;
                }
                case 4: {
                    n14 = 86;
                    break;
                }
                case 5: {
                    n14 = 11;
                    break;
                }
                case 6: {
                    n14 = 140;
                    break;
                }
                case 7: {
                    n14 = 70;
                    break;
                }
                case 8: {
                    n14 = 32;
                    break;
                }
                case 9: {
                    n14 = 89;
                    break;
                }
                case 10: {
                    n14 = 90;
                    break;
                }
                case 11: {
                    n14 = 232;
                    break;
                }
                case 12: {
                    n14 = 172;
                    break;
                }
                case 13: {
                    n14 = 202;
                    break;
                }
                case 14: {
                    n14 = 96;
                    break;
                }
                case 15: {
                    n14 = 149;
                    break;
                }
                case 16: {
                    n14 = 176;
                    break;
                }
                case 17: {
                    n14 = 154;
                    break;
                }
                case 18: {
                    n14 = 163;
                    break;
                }
                case 19: {
                    n14 = 88;
                    break;
                }
                case 20: {
                    n14 = 33;
                    break;
                }
                case 21: {
                    n14 = 133;
                    break;
                }
                case 22: {
                    n14 = 235;
                    break;
                }
                case 23: {
                    n14 = 233;
                    break;
                }
                case 24: {
                    n14 = 73;
                    break;
                }
                case 25: {
                    n14 = 107;
                    break;
                }
                case 26: {
                    n14 = 218;
                    break;
                }
                case 27: {
                    n14 = 174;
                    break;
                }
                case 28: {
                    n14 = 63;
                    break;
                }
                case 29: {
                    n14 = 209;
                    break;
                }
                case 30: {
                    n14 = 182;
                    break;
                }
                case 31: {
                    n14 = 165;
                    break;
                }
                case 32: {
                    n14 = 97;
                    break;
                }
                case 33: {
                    n14 = 150;
                    break;
                }
                case 34: {
                    n14 = 94;
                    break;
                }
                case 35: {
                    n14 = 139;
                    break;
                }
                case 36: {
                    n14 = 27;
                    break;
                }
                case 37: {
                    n14 = 214;
                    break;
                }
                case 38: {
                    n14 = 192;
                    break;
                }
                case 39: {
                    n14 = 85;
                    break;
                }
                case 40: {
                    n14 = 229;
                    break;
                }
                case 41: {
                    n14 = 203;
                    break;
                }
                case 42: {
                    n14 = 60;
                    break;
                }
                case 43: {
                    n14 = 231;
                    break;
                }
                case 44: {
                    n14 = 51;
                    break;
                }
                case 45: {
                    n14 = 169;
                    break;
                }
                case 46: {
                    n14 = 55;
                    break;
                }
                case 47: {
                    n14 = 242;
                    break;
                }
                case 48: {
                    n14 = 224;
                    break;
                }
                case 49: {
                    n14 = 0;
                    break;
                }
                case 50: {
                    n14 = 47;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 40;
                    break;
                }
                case 53: {
                    n14 = 17;
                    break;
                }
                case 54: {
                    n14 = 100;
                    break;
                }
                case 55: {
                    n14 = 77;
                    break;
                }
                case 56: {
                    n14 = 254;
                    break;
                }
                case 57: {
                    n14 = 72;
                    break;
                }
                case 58: {
                    n14 = 141;
                    break;
                }
                case 59: {
                    n14 = 38;
                    break;
                }
                case 60: {
                    n14 = 71;
                    break;
                }
                case 61: {
                    n14 = 7;
                    break;
                }
                case 62: {
                    n14 = 99;
                    break;
                }
                case 63: {
                    n14 = 159;
                    break;
                }
                case 64: {
                    n14 = 18;
                    break;
                }
                case 65: {
                    n14 = 49;
                    break;
                }
                case 66: {
                    n14 = 217;
                    break;
                }
                case 67: {
                    n14 = 36;
                    break;
                }
                case 68: {
                    n14 = 67;
                    break;
                }
                case 69: {
                    n14 = 21;
                    break;
                }
                case 70: {
                    n14 = 237;
                    break;
                }
                case 71: {
                    n14 = 56;
                    break;
                }
                case 72: {
                    n14 = 44;
                    break;
                }
                case 73: {
                    n14 = 6;
                    break;
                }
                case 74: {
                    n14 = 155;
                    break;
                }
                case 75: {
                    n14 = 39;
                    break;
                }
                case 76: {
                    n14 = 171;
                    break;
                }
                case 77: {
                    n14 = 108;
                    break;
                }
                case 78: {
                    n14 = 234;
                    break;
                }
                case 79: {
                    n14 = 245;
                    break;
                }
                case 80: {
                    n14 = 57;
                    break;
                }
                case 81: {
                    n14 = 59;
                    break;
                }
                case 82: {
                    n14 = 2;
                    break;
                }
                case 83: {
                    n14 = 124;
                    break;
                }
                case 84: {
                    n14 = 93;
                    break;
                }
                case 85: {
                    n14 = 80;
                    break;
                }
                case 86: {
                    n14 = 87;
                    break;
                }
                case 87: {
                    n14 = 126;
                    break;
                }
                case 88: {
                    n14 = 119;
                    break;
                }
                case 89: {
                    n14 = 5;
                    break;
                }
                case 90: {
                    n14 = 105;
                    break;
                }
                case 91: {
                    n14 = 207;
                    break;
                }
                case 92: {
                    n14 = 210;
                    break;
                }
                case 93: {
                    n14 = 102;
                    break;
                }
                case 94: {
                    n14 = 145;
                    break;
                }
                case 95: {
                    n14 = 143;
                    break;
                }
                case 96: {
                    n14 = 180;
                    break;
                }
                case 97: {
                    n14 = 193;
                    break;
                }
                case 98: {
                    n14 = 196;
                    break;
                }
                case 99: {
                    n14 = 61;
                    break;
                }
                case 100: {
                    n14 = 188;
                    break;
                }
                case 101: {
                    n14 = 131;
                    break;
                }
                case 102: {
                    n14 = 136;
                    break;
                }
                case 103: {
                    n14 = 161;
                    break;
                }
                case 104: {
                    n14 = 251;
                    break;
                }
                case 105: {
                    n14 = 113;
                    break;
                }
                case 106: {
                    n14 = 178;
                    break;
                }
                case 107: {
                    n14 = 241;
                    break;
                }
                case 108: {
                    n14 = 213;
                    break;
                }
                case 109: {
                    n14 = 132;
                    break;
                }
                case 110: {
                    n14 = 104;
                    break;
                }
                case 111: {
                    n14 = 130;
                    break;
                }
                case 112: {
                    n14 = 211;
                    break;
                }
                case 113: {
                    n14 = 92;
                    break;
                }
                case 114: {
                    n14 = 122;
                    break;
                }
                case 115: {
                    n14 = 120;
                    break;
                }
                case 116: {
                    n14 = 9;
                    break;
                }
                case 117: {
                    n14 = 58;
                    break;
                }
                case 118: {
                    n14 = 164;
                    break;
                }
                case 119: {
                    n14 = 112;
                    break;
                }
                case 120: {
                    n14 = 117;
                    break;
                }
                case 121: {
                    n14 = 185;
                    break;
                }
                case 122: {
                    n14 = 223;
                    break;
                }
                case 123: {
                    n14 = 101;
                    break;
                }
                case 124: {
                    n14 = 123;
                    break;
                }
                case 125: {
                    n14 = 118;
                    break;
                }
                case 126: {
                    n14 = 187;
                    break;
                }
                case 127: {
                    n14 = 114;
                    break;
                }
                case 128: {
                    n14 = 204;
                    break;
                }
                case 129: {
                    n14 = 225;
                    break;
                }
                case 130: {
                    n14 = 91;
                    break;
                }
                case 131: {
                    n14 = 227;
                    break;
                }
                case 132: {
                    n14 = 194;
                    break;
                }
                case 133: {
                    n14 = 153;
                    break;
                }
                case 134: {
                    n14 = 240;
                    break;
                }
                case 135: {
                    n14 = 198;
                    break;
                }
                case 136: {
                    n14 = 15;
                    break;
                }
                case 137: {
                    n14 = 64;
                    break;
                }
                case 138: {
                    n14 = 75;
                    break;
                }
                case 139: {
                    n14 = 238;
                    break;
                }
                case 140: {
                    n14 = 151;
                    break;
                }
                case 141: {
                    n14 = 221;
                    break;
                }
                case 142: {
                    n14 = 228;
                    break;
                }
                case 143: {
                    n14 = 98;
                    break;
                }
                case 144: {
                    n14 = 206;
                    break;
                }
                case 145: {
                    n14 = 76;
                    break;
                }
                case 146: {
                    n14 = 200;
                    break;
                }
                case 147: {
                    n14 = 20;
                    break;
                }
                case 148: {
                    n14 = 54;
                    break;
                }
                case 149: {
                    n14 = 222;
                    break;
                }
                case 150: {
                    n14 = 142;
                    break;
                }
                case 151: {
                    n14 = 134;
                    break;
                }
                case 152: {
                    n14 = 48;
                    break;
                }
                case 153: {
                    n14 = 212;
                    break;
                }
                case 154: {
                    n14 = 111;
                    break;
                }
                case 155: {
                    n14 = 179;
                    break;
                }
                case 156: {
                    n14 = 220;
                    break;
                }
                case 157: {
                    n14 = 190;
                    break;
                }
                case 158: {
                    n14 = 109;
                    break;
                }
                case 159: {
                    n14 = 244;
                    break;
                }
                case 160: {
                    n14 = 35;
                    break;
                }
                case 161: {
                    n14 = 65;
                    break;
                }
                case 162: {
                    n14 = 205;
                    break;
                }
                case 163: {
                    n14 = 46;
                    break;
                }
                case 164: {
                    n14 = 236;
                    break;
                }
                case 165: {
                    n14 = 247;
                    break;
                }
                case 166: {
                    n14 = 43;
                    break;
                }
                case 167: {
                    n14 = 3;
                    break;
                }
                case 168: {
                    n14 = 28;
                    break;
                }
                case 169: {
                    n14 = 181;
                    break;
                }
                case 170: {
                    n14 = 249;
                    break;
                }
                case 171: {
                    n14 = 74;
                    break;
                }
                case 172: {
                    n14 = 82;
                    break;
                }
                case 173: {
                    n14 = 79;
                    break;
                }
                case 174: {
                    n14 = 52;
                    break;
                }
                case 175: {
                    n14 = 26;
                    break;
                }
                case 176: {
                    n14 = 246;
                    break;
                }
                case 177: {
                    n14 = 250;
                    break;
                }
                case 178: {
                    n14 = 42;
                    break;
                }
                case 179: {
                    n14 = 23;
                    break;
                }
                case 180: {
                    n14 = 175;
                    break;
                }
                case 181: {
                    n14 = 215;
                    break;
                }
                case 182: {
                    n14 = 30;
                    break;
                }
                case 183: {
                    n14 = 29;
                    break;
                }
                case 184: {
                    n14 = 25;
                    break;
                }
                case 185: {
                    n14 = 34;
                    break;
                }
                case 186: {
                    n14 = 116;
                    break;
                }
                case 187: {
                    n14 = 167;
                    break;
                }
                case 188: {
                    n14 = 50;
                    break;
                }
                case 189: {
                    n14 = 31;
                    break;
                }
                case 190: {
                    n14 = 137;
                    break;
                }
                case 191: {
                    n14 = 177;
                    break;
                }
                case 192: {
                    n14 = 84;
                    break;
                }
                case 193: {
                    n14 = 95;
                    break;
                }
                case 194: {
                    n14 = 4;
                    break;
                }
                case 195: {
                    n14 = 166;
                    break;
                }
                case 196: {
                    n14 = 19;
                    break;
                }
                case 197: {
                    n14 = 45;
                    break;
                }
                case 198: {
                    n14 = 157;
                    break;
                }
                case 199: {
                    n14 = 195;
                    break;
                }
                case 200: {
                    n14 = 37;
                    break;
                }
                case 201: {
                    n14 = 115;
                    break;
                }
                case 202: {
                    n14 = 158;
                    break;
                }
                case 203: {
                    n14 = 146;
                    break;
                }
                case 204: {
                    n14 = 199;
                    break;
                }
                case 205: {
                    n14 = 78;
                    break;
                }
                case 206: {
                    n14 = 16;
                    break;
                }
                case 207: {
                    n14 = 129;
                    break;
                }
                case 208: {
                    n14 = 152;
                    break;
                }
                case 209: {
                    n14 = 41;
                    break;
                }
                case 210: {
                    n14 = 216;
                    break;
                }
                case 211: {
                    n14 = 243;
                    break;
                }
                case 212: {
                    n14 = 189;
                    break;
                }
                case 213: {
                    n14 = 255;
                    break;
                }
                case 214: {
                    n14 = 248;
                    break;
                }
                case 215: {
                    n14 = 121;
                    break;
                }
                case 216: {
                    n14 = 83;
                    break;
                }
                case 217: {
                    n14 = 148;
                    break;
                }
                case 218: {
                    n14 = 128;
                    break;
                }
                case 219: {
                    n14 = 127;
                    break;
                }
                case 220: {
                    n14 = 208;
                    break;
                }
                case 221: {
                    n14 = 183;
                    break;
                }
                case 222: {
                    n14 = 110;
                    break;
                }
                case 223: {
                    n14 = 125;
                    break;
                }
                case 224: {
                    n14 = 10;
                    break;
                }
                case 225: {
                    n14 = 226;
                    break;
                }
                case 226: {
                    n14 = 253;
                    break;
                }
                case 227: {
                    n14 = 197;
                    break;
                }
                case 228: {
                    n14 = 160;
                    break;
                }
                case 229: {
                    n14 = 138;
                    break;
                }
                case 230: {
                    n14 = 230;
                    break;
                }
                case 231: {
                    n14 = 12;
                    break;
                }
                case 232: {
                    n14 = 144;
                    break;
                }
                case 233: {
                    n14 = 191;
                    break;
                }
                case 234: {
                    n14 = 62;
                    break;
                }
                case 235: {
                    n14 = 173;
                    break;
                }
                case 236: {
                    n14 = 170;
                    break;
                }
                case 237: {
                    n14 = 22;
                    break;
                }
                case 238: {
                    n14 = 156;
                    break;
                }
                case 239: {
                    n14 = 135;
                    break;
                }
                case 240: {
                    n14 = 162;
                    break;
                }
                case 241: {
                    n14 = 8;
                    break;
                }
                case 242: {
                    n14 = 69;
                    break;
                }
                case 243: {
                    n14 = 168;
                    break;
                }
                case 244: {
                    n14 = 14;
                    break;
                }
                case 245: {
                    n14 = 239;
                    break;
                }
                case 246: {
                    n14 = 184;
                    break;
                }
                case 247: {
                    n14 = 186;
                    break;
                }
                case 248: {
                    n14 = 219;
                    break;
                }
                case 249: {
                    n14 = 24;
                    break;
                }
                case 250: {
                    n14 = 103;
                    break;
                }
                case 251: {
                    n14 = 147;
                    break;
                }
                case 252: {
                    n14 = 68;
                    break;
                }
                case 253: {
                    n14 = 13;
                    break;
                }
                case 254: {
                    n14 = 53;
                    break;
                }
                default: {
                    n14 = 66;
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
            yd_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

