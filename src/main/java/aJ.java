/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DropMode;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.apache.commons.io.FileUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aJ
extends aA
implements xv_0 {
    na_0 B;
    yo_2 j;
    aJ D;
    HashMap G;
    tf_2 E;
    DefaultMutableTreeNode p;
    FileSystemView h;
    as_0 L;
    long S;
    boolean g;
    TreePath N;
    Object M;
    DefaultMutableTreeNode Z;
    int J;
    boolean w;
    int e;
    lu_2 d;
    nj_0 C;
    l5_0 k;
    boolean K;
    String W;
    UG Y;
    boolean T;
    public d6_0 I;
    boolean x;
    String H;
    HashSet A;
    private static final String[] a;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] i;

    public aJ(nj_0 nj_02, boolean bl) {
        super(new DefaultMutableTreeNode("treeroot", true));
        Object object;
        Object object2;
        String string = aA.z();
        this.G = new HashMap();
        this.E = null;
        this.g = false;
        this.w = false;
        this.e = aJ.b(23977, 3387944876465546672L);
        this.k = null;
        this.T = true;
        this.I = new d6_0();
        this.x = false;
        this.A = new HashSet();
        this.K = bl;
        this.C = nj_02;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.d();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.d = object;
        String string2 = string;
        this.setBorder(null);
        this.setOpaque(false);
        this.D = this;
        this.W = dd_1.d;
        this.getSelectionModel().setSelectionMode(4);
        this.Y = new uc_1(this);
        try {
            this.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.setRootVisible(false);
        this.B = new na_0();
        this.setCellRenderer((na_0)this.B);
        this.setEditable(true);
        DN dN = new DN(aJ.b(28117, 4288013608912016841L));
        TM tM = new TM(this, dN, nj_02);
        this.setCellEditor(tM);
        this.setAutoscrolls(true);
        ((aJ)this.D).setDragEnabled(true);
        ((aJ)this.D).setDropMode(DropMode.ON_OR_INSERT);
        ((aJ)this.D).setTransferHandler(new wa_0((aJ)this.D));
        ((aJ)this.D).setEditable(true);
        this.getSelectionModel().addTreeSelectionListener(new af_0(this));
        this.addMouseListener(new oq_1(this, nj_02, bl));
        ((aJ)this.D).addTreeWillExpandListener(new a7(this));
        ((aJ)this.D).addMouseMotionListener(new nu_0(this));
        this.h = FileSystemView.getFileSystemView();
        if (string2 == null) {
            if (bl) {
                this.setDragEnabled(false);
                this.setEditable(false);
            }
            try {
                yt_1.F.J(new cw_1(this));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        if (string2 != null) {
            ky_2.K(new String[3]);
        }
    }

    public boolean p() {
        return this.T;
    }

    void p() {
        this.Z = new DefaultMutableTreeNode("root");
        this.j = new yo_2((DefaultMutableTreeNode)this.Z);
        this.setModel((yo_2)this.j);
    }

    void Y() {
        String string = aA.z();
        this.E = new tf_2();
        String string2 = string;
        File file = new File((String)dd_1.d);
        if (string2 == null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                this.E.t(file);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.E.D("连接");
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public Rectangle m(Point point) {
        return null;
    }

    public l5_0 v() {
        KQ kQ;
        try {
            kQ = (KQ)this.C.p();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        KQ kQ2 = kQ;
        this.k = new l5_0((aJ)this.D, (DefaultMutableTreeNode)this.p, kQ2, true, this.K);
        try {
            kQ2.r(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((l5_0)this.k).addPopupMenuListener(new ok_2(this, kQ2));
        return (l5_0)this.k;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void k() {
        block100: {
            block101: {
                block114: {
                    block109: {
                        block110: {
                            block99: {
                                block111: {
                                    block112: {
                                        block113: {
                                            block108: {
                                                block107: {
                                                    block106: {
                                                        block105: {
                                                            try {
                                                                v0 = (List)this.D.B();
                                                            }
                                                            catch (InvocationTargetException v1) {
                                                                throw v1.getTargetException();
                                                            }
                                                            var2_1 = v0;
                                                            var3_2 = false;
                                                            var1_3 = aA.z();
                                                            var4_4 = new ArrayList<ck_2>();
                                                            var5_5 = new ArrayList<Object>();
                                                            var6_6 = new ArrayList<E>();
                                                            var7_7 = var2_1.iterator();
                                                            while (var7_7.hasNext()) {
                                                                block104: {
                                                                    block102: {
                                                                        block103: {
                                                                            var8_8 = (DefaultMutableTreeNode)var7_7.next();
                                                                            v2 = var8_8.getUserObject().getClass().equals(ck_2.class);
                                                                            if (var1_3 != null) ** GOTO lbl40
                                                                            if (var1_3 != null) break block102;
                                                                            if (!v2) break block103;
                                                                            var9_9 = (ck_2)var8_8.getUserObject();
                                                                            var4_4.add((ck_2)var9_9);
                                                                            if (var1_3 == null) break block104;
                                                                        }
                                                                        v3 = var8_8.getUserObject().getClass().equals(tf_2.class);
                                                                    }
                                                                    if (v3) {
                                                                        try {
                                                                            this.h((Object)var8_8, var4_4);
                                                                        }
                                                                        catch (InvocationTargetException v4) {
                                                                            throw v4.getTargetException();
                                                                        }
                                                                    }
                                                                }
                                                                if (var1_3 == null) continue;
                                                            }
                                                            var7_7 = var4_4.iterator();
                                                            do {
                                                                v2 = var7_7.hasNext();
lbl40:
                                                                // 2 sources

                                                                if (!v2) break;
                                                                var8_8 = (ck_2)var7_7.next();
                                                                try {
                                                                    v5 = yt_1.i();
                                                                }
                                                                catch (InvocationTargetException v6) {
                                                                    throw v6.getTargetException();
                                                                }
                                                                try {
                                                                    v7 = v5.g();
                                                                }
                                                                catch (InvocationTargetException v8) {
                                                                    throw v8.getTargetException();
                                                                }
                                                                try {
                                                                    v9 = var8_8.d();
                                                                }
                                                                catch (InvocationTargetException v10) {
                                                                    throw v10.getTargetException();
                                                                }
                                                                try {
                                                                    v11 = (lv_2)v7.q(v9);
                                                                }
                                                                catch (InvocationTargetException v12) {
                                                                    throw v12.getTargetException();
                                                                }
                                                                v13 = var9_9 = v11;
                                                                if (var1_3 == null) {
                                                                    if (v13 == null) continue;
                                                                    v13 = var9_9;
                                                                }
                                                                try {
                                                                    v14 = (Integer)v13.I();
                                                                }
                                                                catch (InvocationTargetException v15) {
                                                                    throw v15.getTargetException();
                                                                }
                                                                v16 = lv_2.C;
                                                                if (var1_3 == null) {
                                                                    if (v14 == v16) {
                                                                        var5_5.add(var9_9);
                                                                        if (var1_3 == null) continue;
                                                                    }
                                                                    try {
                                                                        v14 = (Integer)var9_9.I();
                                                                    }
                                                                    catch (InvocationTargetException v17) {
                                                                        throw v17.getTargetException();
                                                                    }
                                                                    if (var1_3 != null) continue;
                                                                    v16 = lv_2.F;
                                                                }
                                                                if (v14 != v16) continue;
                                                                v14 = (int)var6_6.add(var9_9);
                                                            } while (var1_3 == null);
                                                            try {
                                                                v18 = (KQ)this.C.p();
                                                            }
                                                            catch (InvocationTargetException v19) {
                                                                throw v19.getTargetException();
                                                            }
                                                            var7_7 = v18;
                                                            try {
                                                                v20 = (U)var7_7.S();
                                                            }
                                                            catch (InvocationTargetException v21) {
                                                                throw v21.getTargetException();
                                                            }
                                                            var8_8 = v20;
                                                            var9_10 = 0;
                                                            try {
                                                                v22 = var8_8.o();
                                                            }
                                                            catch (InvocationTargetException v23) {
                                                                throw v23.getTargetException();
                                                            }
                                                            try {
                                                                v24 = v22.Q();
                                                            }
                                                            catch (InvocationTargetException v25) {
                                                                throw v25.getTargetException();
                                                            }
                                                            try {
                                                                v26 = (F8)v24.P();
                                                            }
                                                            catch (InvocationTargetException v27) {
                                                                throw v27.getTargetException();
                                                            }
                                                            var10_11 = v26;
                                                            var11_12 = null;
                                                            v28 = var10_11 instanceof CL;
                                                            if (var1_3 != null) break block105;
                                                            if (v28 == 0) break block106;
                                                            v28 = 1;
                                                        }
                                                        var9_10 = v28;
                                                        var11_12 = (CL)var10_11;
                                                    }
                                                    try {
                                                        v29 = var8_8.o();
                                                    }
                                                    catch (InvocationTargetException v30) {
                                                        throw v30.getTargetException();
                                                    }
                                                    try {
                                                        v31 = (ArrayList)v29.g();
                                                    }
                                                    catch (InvocationTargetException v32) {
                                                        throw v32.getTargetException();
                                                    }
                                                    var12_13 = v31.size();
                                                    try {
                                                        v33 = var8_8.o();
                                                    }
                                                    catch (InvocationTargetException v34) {
                                                        throw v34.getTargetException();
                                                    }
                                                    try {
                                                        v35 = (ArrayList)v33.g();
                                                    }
                                                    catch (InvocationTargetException v36) {
                                                        throw v36.getTargetException();
                                                    }
                                                    try {
                                                        v37 = (F8)(t3_0)v35.get(var12_13 - 1).P();
                                                    }
                                                    catch (InvocationTargetException v38) {
                                                        throw v38.getTargetException();
                                                    }
                                                    var13_14 = v37;
                                                    var14_15 = null;
                                                    v39 = var13_14;
                                                    if (var1_3 != null) break block107;
                                                    if (!(v39 instanceof CL)) break block108;
                                                    v39 = var13_14;
                                                }
                                                var14_15 = (CL)v39;
                                            }
                                            v40 = var9_10;
                                            if (var1_3 != null) break block109;
                                            if (v40 == 0) break block110;
                                            v41 = var5_5;
                                            if (var1_3 != null) break block111;
                                            if (v41.size() <= 0) break block112;
                                            if (var5_5.size() != 1) break block113;
                                            try {
                                                v42 = (String)(lv_2)var5_5.get(0).G();
                                            }
                                            catch (InvocationTargetException v43) {
                                                throw v43.getTargetException();
                                            }
                                            try {
                                                var11_12.v((Object)new File(v42), (Object)var8_8);
                                            }
                                            catch (InvocationTargetException v44) {
                                                throw v44.getTargetException();
                                            }
                                            if (var1_3 == null) break block112;
                                        }
                                        v45 /* !! */  = var14_15;
                                        if (var1_3 == null && v45 /* !! */  != null) {
                                            try {
                                                v46 = (String)(lv_2)var5_5.get(0).G();
                                            }
                                            catch (InvocationTargetException v47) {
                                                throw v47.getTargetException();
                                            }
                                            try {
                                                var14_15.v((Object)new File(v46), (Object)var8_8);
                                            }
                                            catch (InvocationTargetException v48) {
                                                throw v48.getTargetException();
                                            }
                                            v45 /* !! */  = var5_5.remove(0);
                                        }
                                        var15_16 = var5_5.iterator();
                                        while (var15_16.hasNext()) {
                                            var16_17 = (lv_2)var15_16.next();
                                            try {
                                                v49 = (String)var16_17.G();
                                            }
                                            catch (InvocationTargetException v50) {
                                                throw v50.getTargetException();
                                            }
                                            try {
                                                var8_8.H((Object)new File(v49), true);
                                            }
                                            catch (InvocationTargetException v51) {
                                                throw v51.getTargetException();
                                            }
                                            if (var1_3 == null) {
                                                if (var1_3 == null) continue;
                                            }
                                            break block99;
                                        }
                                    }
                                    v41 = var6_6;
                                }
                                var15_16 = v41.iterator();
                            }
                            while (var15_16.hasNext()) {
                                var16_17 = (lv_2)var15_16.next();
                                try {
                                    v52 = (String)var16_17.G();
                                }
                                catch (InvocationTargetException v53) {
                                    throw v53.getTargetException();
                                }
                                try {
                                    var8_8.H((Object)new File(v52), true);
                                }
                                catch (InvocationTargetException v54) {
                                    throw v54.getTargetException();
                                }
                                if (var1_3 == null) {
                                    if (var1_3 == null) continue;
                                }
                                break block100;
                            }
                            if (var1_3 == null) break block100;
                        }
                        v55 = var5_5;
                        if (var1_3 != null) break block114;
                        v40 = v55.size();
                    }
                    if (v40 > 0) {
                        v56 /* !! */  = var14_15;
                        if (var1_3 == null && v56 /* !! */  != null) {
                            try {
                                v57 = (String)(lv_2)var5_5.get(0).G();
                            }
                            catch (InvocationTargetException v58) {
                                throw v58.getTargetException();
                            }
                            try {
                                var14_15.v((Object)new File(v57), (Object)var8_8);
                            }
                            catch (InvocationTargetException v59) {
                                throw v59.getTargetException();
                            }
                            v56 /* !! */  = var5_5.remove(0);
                        }
                        var15_16 = var5_5.iterator();
                        while (var15_16.hasNext()) {
                            var16_17 = (lv_2)var15_16.next();
                            try {
                                v60 = (String)var16_17.G();
                            }
                            catch (InvocationTargetException v61) {
                                throw v61.getTargetException();
                            }
                            try {
                                var8_8.H((Object)new File(v60), true);
                            }
                            catch (InvocationTargetException v62) {
                                throw v62.getTargetException();
                            }
                            if (var1_3 == null) {
                                if (var1_3 == null) continue;
                            }
                            break block101;
                        }
                    }
                    v55 = var6_6;
                }
                var15_16 = v55.iterator();
            }
            while (var15_16.hasNext()) {
                var16_17 = (lv_2)var15_16.next();
                try {
                    v63 = (String)var16_17.G();
                }
                catch (InvocationTargetException v64) {
                    throw v64.getTargetException();
                }
                try {
                    var8_8.H((Object)new File(v63), true);
                }
                catch (InvocationTargetException v65) {
                    throw v65.getTargetException();
                }
                if (var1_3 == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void N() {
        block50: {
            block46: {
                block51: {
                    block48: {
                        block49: {
                            block47: {
                                var2_1 = (String)this.W;
                                try {
                                    v0 = yt_1.i();
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                try {
                                    v2 = (u6_0)v0.h();
                                }
                                catch (InvocationTargetException v3) {
                                    throw v3.getTargetException();
                                }
                                var3_2 = v2;
                                try {
                                    v4 = (String)var3_2.z();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                                var4_3 = v4;
                                var1_4 = aA.z();
                                var5_5 = 0;
                                v6 = var2_1.equals((String)dd_1.d);
                                if (var1_4 != null) break block47;
                                if (v6 == 0) break block48;
                                v6 = new File((String)dd_1.d).listFiles().length;
                            }
                            if (var1_4 != null) break block49;
                            if (v6 != 0) break block48;
                            v6 = 1;
                        }
                        var5_5 = v6;
                    }
                    try {
                        v7 = (KQ)this.C.p();
                    }
                    catch (InvocationTargetException v8) {
                        throw v8.getTargetException();
                    }
                    var6_6 = v7;
                    try {
                        v9 = (U)var6_6.S();
                    }
                    catch (InvocationTargetException v10) {
                        throw v10.getTargetException();
                    }
                    var7_7 = v9;
                    var8_8 = new YB(YB.g, var7_7, "选择导入文件", new dv_2(), false);
                    if (var1_4 != null) ** GOTO lbl65
                    if (var4_3 != null) {
                        v11 = var4_3.equals((String)lk_0.G);
                        if (var1_4 == null) {
                            if (v11 == 0) {
                                try {
                                    var8_8.s((Object)var4_3, true, true);
                                }
                                catch (InvocationTargetException v12) {
                                    throw v12.getTargetException();
                                }
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 4 sources

                    {
                        var8_8.setSize(aJ.b(30930, 1570349893146755279L), aJ.b(20038, 8833900715546408542L));
                        var8_8.setLocationRelativeTo(var7_7);
                        var8_8.setVisible(true);
lbl65:
                        // 2 sources

                        try {
                            v11 = (Integer)var8_8.s();
                        }
                        catch (InvocationTargetException v13) {
                            throw v13.getTargetException();
                        }
                    }
                    if ((var9_9 = v11) != YB.O) break block50;
                    var10_10 = new ArrayList<E>();
                    try {
                        v14 = (ArrayList)var8_8.n();
                    }
                    catch (InvocationTargetException v15) {
                        throw v15.getTargetException();
                    }
                    var11_11 = v14;
                    var12_12 = null;
                    if (var11_11.size() <= 0) break block51;
                    var13_13 = new J7();
                    try {
                        var13_13.C(var7_7);
                    }
                    catch (InvocationTargetException v16) {
                        throw v16.getTargetException();
                    }
                    try {
                        var13_13.e(this.Y);
                    }
                    catch (InvocationTargetException v17) {
                        throw v17.getTargetException();
                    }
                    for (E var15_15 : var11_11) {
                        block54: {
                            block52: {
                                block53: {
                                    try {
                                        v18 = (File)lk_0.E(var15_15);
                                    }
                                    catch (InvocationTargetException v19) {
                                        throw v19.getTargetException();
                                    }
                                    var16_16 = v18;
                                    if (var1_4 != null) break block46;
                                    v20 = var16_16.isFile();
                                    if (var1_4 != null) break block52;
                                    if (!v20) break block53;
                                    var12_12 = var16_16.getParent();
                                    if (var1_4 == null) break block54;
                                }
                                v20 = var16_16.isDirectory();
                            }
                            if (v20) {
                                // empty if block
                            }
                        }
                        try {
                            this.a((Object)var16_16, (Object)var2_1);
                        }
                        catch (InvocationTargetException v21) {
                            throw v21.getTargetException();
                        }
                        if (var1_4 == null) continue;
                    }
                }
                SwingUtilities.invokeLater(new g0(this, var2_1));
                try {
                    var3_2.Z(var12_12);
                }
                catch (InvocationTargetException v22) {
                    throw v22.getTargetException();
                }
            }
            try {
                v23 = yt_1.i();
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
            try {
                v23.S();
            }
            catch (InvocationTargetException v25) {
                throw v25.getTargetException();
            }
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void a() {
        block101: {
            block102: {
                block97: {
                    block98: {
                        var2_1 = new ArrayList<Object>();
                        var3_2 = (String)this.W;
                        var1_3 = aA.z();
                        try {
                            v0 = this;
                            if (var1_3 != null) break block97;
                            if (!v0.x) {
                            }
                            ** GOTO lbl107
                        }
                        catch (Exception v1) {
                            throw aJ.a(v1);
                        }
                        try {
                            v2 = (ArrayList)this.I.u();
                        }
                        catch (InvocationTargetException v3) {
                            throw v3.getTargetException();
                        }
                        for (Object var5_5 : v2) {
                            block99: {
                                var6_6 = (DefaultMutableTreeNode)((HashMap)this.G).get(var5_5);
                                v4 = var6_6;
                                if (var1_3 != null) break block98;
                                try {
                                    block107: {
                                        if (v4 == null) break block99;
                                        break block107;
                                        catch (Exception v5) {
                                            throw aJ.a(v5);
                                        }
                                    }
                                    var2_1.add(var6_6);
                                }
                                catch (Exception v6) {
                                    throw aJ.a(v6);
                                }
                            }
                            var7_9 = new lv_2();
                            try {
                                var7_9.n(var5_5);
                            }
                            catch (InvocationTargetException v7) {
                                throw v7.getTargetException();
                            }
                            try {
                                try {
                                    var7_9.L();
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                            }
                            catch (Exception var8_11) {
                                var8_11.printStackTrace();
                            }
                            try {
                                var7_9.Z(var3_2);
                            }
                            catch (InvocationTargetException v9) {
                                throw v9.getTargetException();
                            }
                            try {
                                v10 = le_2.q();
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            try {
                                var7_9.p(v10);
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                            var8_10 = System.currentTimeMillis();
                            try {
                                v13 = yt_1.i();
                            }
                            catch (InvocationTargetException v14) {
                                throw v14.getTargetException();
                            }
                            try {
                                v15 = v13.g();
                            }
                            catch (InvocationTargetException v16) {
                                throw v16.getTargetException();
                            }
                            try {
                                v15.n(var7_9, 0, false);
                            }
                            catch (InvocationTargetException v17) {
                                throw v17.getTargetException();
                            }
                            if (var1_3 == null) continue;
                        }
                        v4 = (DefaultMutableTreeNode)((HashMap)this.G).get(var3_2);
                    }
                    var4_4 = v4;
                    try {
                        try {
                            this.J(var4_4);
                        }
                        catch (InvocationTargetException v18) {
                            throw v18.getTargetException();
                        }
                        try {
                            v19 = (ArrayList)this.I.u();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        v19.clear();
                        if (var1_3 == null) break block101;
lbl107:
                        // 2 sources

                        v0 = this;
                    }
                    catch (Exception v21) {
                        throw aJ.a(v21);
                    }
                }
                try {
                    v22 = (ArrayList)v0.I.u();
                }
                catch (InvocationTargetException v23) {
                    throw v23.getTargetException();
                }
                for (Object var5_5 : v22) {
                    block103: {
                        block104: {
                            var6_7 = false;
                            v24 = new File((String)var5_5).getParentFile().getAbsolutePath();
                            if (var1_3 != null) break block102;
                            try {
                                block108: {
                                    v25 = v24.equals(var3_2);
                                    if (var1_3 != null) break block103;
                                    break block108;
                                    catch (Exception v26) {
                                        throw aJ.a(v26);
                                    }
                                }
                                if (!v25) break block104;
                            }
                            catch (Exception v27) {
                                throw aJ.a(v27);
                            }
                            var6_7 = true;
                        }
                        v25 = var6_7;
                    }
                    if (!v25) {
                        var7_9 = (DefaultMutableTreeNode)((HashMap)this.G).get(var5_5);
                        try {
                            if (var7_9 != null) {
                                var2_1.add(var7_9);
                            }
                        }
                        catch (Exception v28) {
                            throw aJ.a(v28);
                        }
                    }
                    if (var1_3 == null) continue;
                }
                v24 = ((HashMap)this.G).get(var3_2);
            }
            var4_4 = (DefaultMutableTreeNode)v24;
            try {
                this.J(var4_4);
            }
            catch (InvocationTargetException v29) {
                throw v29.getTargetException();
            }
            try {
                v30 = (ArrayList)this.I.u();
            }
            catch (InvocationTargetException v31) {
                throw v31.getTargetException();
            }
            v30.clear();
            for (DefaultMutableTreeNode var6_8 : var2_1) {
                block106: {
                    block105: {
                        try {
                            v32 = var6_8.getUserObject().getClass().equals(ck_2.class);
                            if (var1_3 != null) break block105;
                            if (v32) {
                            }
                            ** GOTO lbl308
                        }
                        catch (Exception v33) {
                            throw aJ.a(v33);
                        }
                        var7_9 = (ck_2)var6_8.getUserObject();
                        try {
                            v34 = (File)var7_9.i();
                        }
                        catch (InvocationTargetException v35) {
                            throw v35.getTargetException();
                        }
                        var8_12 = v34.getAbsolutePath();
                        try {
                            v36 = (File)var7_9.i();
                        }
                        catch (InvocationTargetException v37) {
                            throw v37.getTargetException();
                        }
                        var9_13 = v36.getParentFile().getAbsolutePath();
                        var10_14 = null;
                        var11_15 = (DefaultMutableTreeNode)((HashMap)this.G).get(var3_2);
                        var10_14 = (tf_2)var11_15.getUserObject();
                        try {
                            v38 = (File)var10_14.M();
                        }
                        catch (InvocationTargetException v39) {
                            throw v39.getTargetException();
                        }
                        try {
                            v40 = (File)var7_9.i();
                        }
                        catch (InvocationTargetException v41) {
                            throw v41.getTargetException();
                        }
                        var12_16 = v38.getAbsolutePath() + File.separator + v40.getName();
                        var13_17 = new File(var12_16);
                        var14_18 = true;
                        try {
                            try {
                                v42 = (File)var7_9.i();
                            }
                            catch (InvocationTargetException v43) {
                                throw v43.getTargetException();
                            }
                            FileUtils.moveFile(v42, var13_17);
                        }
                        catch (IOException var15_20) {
                            var15_20.printStackTrace();
                            var14_18 = false;
                        }
                        if (var14_18) {
                            try {
                                v44 = (DefaultMutableTreeNode)this.D.r(var9_13);
                            }
                            catch (InvocationTargetException v45) {
                                throw v45.getTargetException();
                            }
                            var15_19 = v44;
                            ((yo_2)this.j).removeNodeFromParent(var6_8);
                            var16_21 = (tf_2)var15_19.getUserObject();
                            try {
                                var16_21.F(var8_12);
                            }
                            catch (InvocationTargetException v46) {
                                throw v46.getTargetException();
                            }
                            try {
                                this.D.G(var8_12);
                            }
                            catch (InvocationTargetException v47) {
                                throw v47.getTargetException();
                            }
                            var17_22 = new ck_2();
                            try {
                                var17_22.N(var13_17);
                            }
                            catch (InvocationTargetException v48) {
                                throw v48.getTargetException();
                            }
                            try {
                                lk_0.n(var17_22);
                            }
                            catch (InvocationTargetException v49) {
                                throw v49.getTargetException();
                            }
                            try {
                                v50 = (List)var10_14.M();
                            }
                            catch (InvocationTargetException v51) {
                                throw v51.getTargetException();
                            }
                            v50.add(var17_22);
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
                                v56 = var7_9.d();
                            }
                            catch (InvocationTargetException v57) {
                                throw v57.getTargetException();
                            }
                            try {
                                v54.U(v56, (Object)var12_16);
                            }
                            catch (InvocationTargetException v58) {
                                throw v58.getTargetException();
                            }
                            var18_23 = new DefaultMutableTreeNode(var17_22);
                            try {
                                this.D.V((Object)var18_23, (Object)var17_22);
                            }
                            catch (InvocationTargetException v59) {
                                throw v59.getTargetException();
                            }
                            var19_24 = 0;
                            ((yo_2)this.j).insertNodeInto(var18_23, var11_15, var19_24);
                            var20_25 = new File(var12_16).getParentFile().getAbsolutePath();
                            try {
                                v60 = (DefaultMutableTreeNode)this.D.r(var20_25);
                            }
                            catch (InvocationTargetException v61) {
                                throw v61.getTargetException();
                            }
                            var21_26 = v60;
                            try {
                                this.D.J(var21_26);
                            }
                            catch (InvocationTargetException v62) {
                                throw v62.getTargetException();
                            }
                        }
                        try {
                            if (var1_3 == null) break block106;
lbl308:
                            // 2 sources

                            v32 = var6_8.getUserObject().getClass().equals(tf_2.class);
                        }
                        catch (Exception v63) {
                            throw aJ.a(v63);
                        }
                    }
                    if (v32) {
                        // empty if block
                    }
                }
                if (var1_3 == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void a(File var1_1, String var2_2) {
        block50: {
            block48: {
                var3_3 = aA.z();
                try {
                    v0 = var1_1.isFile();
                    if (var3_3 != null) break block48;
                    if (v0) {
                    }
                    ** GOTO lbl87
                }
                catch (Exception v1) {
                    throw aJ.a(v1);
                }
                var4_4 = new lv_2();
                try {
                    var4_4.n(var1_1.getAbsolutePath());
                }
                catch (InvocationTargetException v2) {
                    throw v2.getTargetException();
                }
                try {
                    try {
                        var4_4.L();
                    }
                    catch (InvocationTargetException v3) {
                        throw v3.getTargetException();
                    }
                }
                catch (Exception var5_5) {
                    var5_5.printStackTrace();
                }
                try {
                    var4_4.Z(var2_2);
                }
                catch (InvocationTargetException v4) {
                    throw v4.getTargetException();
                }
                try {
                    v5 = le_2.q();
                }
                catch (InvocationTargetException v6) {
                    throw v6.getTargetException();
                }
                try {
                    var4_4.p(v5);
                }
                catch (InvocationTargetException v7) {
                    throw v7.getTargetException();
                }
                var5_6 = System.currentTimeMillis();
                try {
                    var4_4.d(var5_6);
                }
                catch (InvocationTargetException v8) {
                    throw v8.getTargetException();
                }
                try {
                    var4_4.Z(var5_6);
                }
                catch (InvocationTargetException v9) {
                    throw v9.getTargetException();
                }
                try {
                    v10 = yt_1.i();
                }
                catch (InvocationTargetException v11) {
                    throw v11.getTargetException();
                }
                try {
                    v12 = v10.g();
                }
                catch (InvocationTargetException v13) {
                    throw v13.getTargetException();
                }
                try {
                    v12.n(var4_4, 0, false);
                }
                catch (InvocationTargetException v14) {
                    throw v14.getTargetException();
                }
                var7_8 = (DefaultMutableTreeNode)((HashMap)this.G).get(var2_2);
                try {
                    try {
                        this.J(var7_8);
                    }
                    catch (InvocationTargetException v15) {
                        throw v15.getTargetException();
                    }
                    if (var3_3 == null) break block50;
lbl87:
                    // 2 sources

                    v0 = var1_1.isDirectory();
                }
                catch (Exception v16) {
                    throw aJ.a(v16);
                }
            }
            if (v0) {
                var4_4 = var2_2;
                try {
                    v17 = yt_1.i();
                }
                catch (InvocationTargetException v18) {
                    throw v18.getTargetException();
                }
                try {
                    v19 = v17.g();
                }
                catch (InvocationTargetException v20) {
                    throw v20.getTargetException();
                }
                try {
                    v21 = (lo_1)v19.D(var4_4, (Object)var1_1.getName());
                }
                catch (InvocationTargetException v22) {
                    throw v22.getTargetException();
                }
                var5_7 = v21;
                try {
                    v23 = (String)var5_7.g();
                }
                catch (InvocationTargetException v24) {
                    throw v24.getTargetException();
                }
                var6_9 = (String)var4_4 + File.separator + v23;
                try {
                    this.N((Object)var6_9, 0, false, false);
                }
                catch (InvocationTargetException v25) {
                    throw v25.getTargetException();
                }
                var7_8 = (DefaultMutableTreeNode)((HashMap)this.G).get(var6_9);
                for (File var12_14 : var8_10 = var1_1.listFiles()) {
                    try {
                        v26 = (String)var5_7.g();
                    }
                    catch (InvocationTargetException v27) {
                        throw v27.getTargetException();
                    }
                    var13_15 = var2_2 + File.separator + v26;
                    try {
                        try {
                            this.a((Object)var12_14, (Object)var13_15);
                        }
                        catch (InvocationTargetException v28) {
                            throw v28.getTargetException();
                        }
                        if (var3_3 == null) {
                            if (var3_3 == null) continue;
                            break;
                        }
                        break block50;
                    }
                    catch (Exception v29) {
                        throw aJ.a(v29);
                    }
                }
                SwingUtilities.invokeLater(new OE(this, var7_8));
            }
        }
    }

    public void N(JTree jTree) {
        TreeNode treeNode = (TreeNode)jTree.getModel().getRoot();
        try {
            this.e((Object)jTree, (Object)new TreePath(treeNode));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void e(JTree jTree, TreePath treePath) {
        block6: {
            TreeNode treeNode = (TreeNode)treePath.getLastPathComponent();
            String string = aA.z();
            if (string == null) {
                if (treeNode.getChildCount() >= 0) {
                    Enumeration<? extends TreeNode> enumeration = treeNode.children();
                    while (enumeration.hasMoreElements()) {
                        TreeNode treeNode2 = enumeration.nextElement();
                        TreePath treePath2 = treePath.pathByAddingChild(treeNode2);
                        try {
                            this.e((Object)jTree, (Object)treePath2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block6;
                    }
                }
                jTree.collapsePath(treePath);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void L() {
        block52: {
            var2_1 = new J7();
            try {
                v0 = (List)this.D.B();
            }
            catch (InvocationTargetException v1) {
                throw v1.getTargetException();
            }
            var3_2 = v0;
            var4_3 = new ArrayList<Object>();
            var5_4 = new ArrayList<DefaultMutableTreeNode>();
            var6_5 = var3_2.iterator();
            var1_6 = aA.z();
            block40: while (true) {
                v2 = var6_5.hasNext();
                block41: while (v2) {
                    var7_7 = (DefaultMutableTreeNode)var6_5.next();
                    v3 = var5_4.add(var7_7);
                    if (var1_6 != null) ** GOTO lbl34
                    while ((var8_8 = var7_7.getParent()) != null) {
                        var9_9 = (DefaultMutableTreeNode)var8_8;
                        v2 = var9_9.equals((DefaultMutableTreeNode)this.Z);
                        if (var1_6 != null) continue block41;
                        if (var1_6 == null) {
                            if (v2) continue block40;
                            v4 = var5_4.contains(var9_9);
                        }
                        if (var1_6 == null && !v4) {
                            v4 = var5_4.add((DefaultMutableTreeNode)var9_9);
                        }
                        var7_7 = (DefaultMutableTreeNode)var8_8;
                        if (var1_6 == null) continue;
                    }
                    if (var1_6 == null) continue block40;
                }
                break;
            }
            var6_5 = var5_4.iterator();
            do {
                block54: {
                    block53: {
                        v3 = var6_5.hasNext();
lbl34:
                        // 2 sources

                        if (!v3) break;
                        var7_7 = (DefaultMutableTreeNode)var6_5.next();
                        if (var1_6 != null) break block52;
                        v5 = var7_7.getUserObject().getClass().equals(ck_2.class);
                        if (var1_6 != null) break block53;
                        if (v5) {
                            var8_8 = (ck_2)var7_7.getUserObject();
                            var4_3.add(var8_8);
                            try {
                                v6 = yt_1.i();
                            }
                            catch (InvocationTargetException v7) {
                                throw v7.getTargetException();
                            }
                            try {
                                v8 = v6.g();
                            }
                            catch (InvocationTargetException v9) {
                                throw v9.getTargetException();
                            }
                            try {
                                v10 = var8_8.d();
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            try {
                                v12 = (lv_2)v8.q(v10);
                            }
                            catch (InvocationTargetException v13) {
                                throw v13.getTargetException();
                            }
                            var9_9 = v12;
                            try {
                                v14 = (Boolean)le_2.H(var9_9);
                            }
                            catch (InvocationTargetException v15) {
                                throw v15.getTargetException();
                            }
                            if (v14) {
                                try {
                                    v16 = yt_1.i();
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                                try {
                                    v18 = v16.g();
                                }
                                catch (InvocationTargetException v19) {
                                    throw v19.getTargetException();
                                }
                                try {
                                    v20 = var8_8.d();
                                }
                                catch (InvocationTargetException v21) {
                                    throw v21.getTargetException();
                                }
                                try {
                                    v18.h(v20);
                                }
                                catch (InvocationTargetException v22) {
                                    throw v22.getTargetException();
                                }
                            }
                            if (var1_6 == null) continue;
                        }
                        v23 = var7_7.getUserObject().getClass();
                        if (var1_6 != null) break block54;
                        v5 = v23.equals(tf_2.class);
                    }
                    if (!v5) continue;
                    v23 = var7_7.getUserObject();
                }
                var8_8 = (tf_2)v23;
                try {
                    v24 = (String)var8_8.k();
                }
                catch (InvocationTargetException v25) {
                    throw v25.getTargetException();
                }
                if (v24.equals(new File((String)dd_1.d).getAbsolutePath())) continue;
                try {
                    v26 = yt_1.i();
                }
                catch (InvocationTargetException v27) {
                    throw v27.getTargetException();
                }
                try {
                    v28 = v26.g();
                }
                catch (InvocationTargetException v29) {
                    throw v29.getTargetException();
                }
                try {
                    v30 = var8_8.M();
                }
                catch (InvocationTargetException v31) {
                    throw v31.getTargetException();
                }
                try {
                    v32 = (lo_1)v28.m(v30);
                }
                catch (InvocationTargetException v33) {
                    throw v33.getTargetException();
                }
                var9_9 = v32;
                try {
                    v34 = (Boolean)le_2.H(var9_9);
                }
                catch (InvocationTargetException v35) {
                    throw v35.getTargetException();
                }
                if (!v34) continue;
                try {
                    v36 = yt_1.i();
                }
                catch (InvocationTargetException v37) {
                    throw v37.getTargetException();
                }
                try {
                    v38 = v36.g();
                }
                catch (InvocationTargetException v39) {
                    throw v39.getTargetException();
                }
                try {
                    v40 = var8_8.k();
                }
                catch (InvocationTargetException v41) {
                    throw v41.getTargetException();
                }
                try {
                    v38.g(v40);
                }
                catch (InvocationTargetException v42) {
                    throw v42.getTargetException();
                }
            } while (var1_6 == null);
            this.repaint();
        }
    }

    public void d() {
        List list;
        J7 j7 = new J7();
        try {
            list = (List)this.D.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        List list2 = list;
        String string = aA.z();
        ArrayList<ck_2> arrayList = new ArrayList<ck_2>();
        for (DefaultMutableTreeNode defaultMutableTreeNode : list2) {
            block26: {
                String string2;
                Class<?> clazz;
                Serializable serializable;
                block27: {
                    boolean bl;
                    block24: {
                        block25: {
                            Object object;
                            Object object2;
                            Object object3;
                            bl = defaultMutableTreeNode.getUserObject().getClass().equals(ck_2.class);
                            if (string != null) break block24;
                            if (!bl) break block25;
                            serializable = (ck_2)defaultMutableTreeNode.getUserObject();
                            arrayList.add((ck_2)serializable);
                            try {
                                object3 = yt_1.i();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object2 = object3.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object = serializable.d();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                object2.Y(object);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string == null) break block26;
                        }
                        clazz = defaultMutableTreeNode.getUserObject().getClass();
                        if (string != null) break block27;
                        bl = clazz.equals(tf_2.class);
                    }
                    if (!bl) break block26;
                    clazz = defaultMutableTreeNode.getUserObject();
                }
                serializable = (tf_2)((Object)clazz);
                try {
                    string2 = (String)serializable.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (!string2.equals(new File((String)dd_1.d).getAbsolutePath())) {
                    Object object;
                    Object object4;
                    Object object5;
                    try {
                        object5 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = object5.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = serializable.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4.x(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
            }
            if (string == null) continue;
        }
    }

    public d6_0 n(boolean bl) {
        List list;
        String string = aA.z();
        this.x = bl;
        d6_0 d6_02 = new d6_0();
        J7 j7 = new J7();
        try {
            list = (List)this.D.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        List list2 = list;
        String string2 = string;
        ArrayList<ck_2> arrayList = new ArrayList<ck_2>();
        for (DefaultMutableTreeNode defaultMutableTreeNode : list2) {
            block13: {
                boolean bl2;
                block11: {
                    block12: {
                        String string3;
                        ArrayList arrayList2;
                        bl2 = defaultMutableTreeNode.getUserObject().getClass().equals(ck_2.class);
                        if (string2 != null) break block11;
                        if (!bl2) break block12;
                        ck_2 ck_22 = (ck_2)defaultMutableTreeNode.getUserObject();
                        arrayList.add(ck_22);
                        try {
                            arrayList2 = (ArrayList)d6_02.u();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            string3 = (String)ck_22.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        arrayList2.add(string3);
                        if (string2 == null) break block13;
                    }
                    bl2 = defaultMutableTreeNode.getUserObject().getClass().equals(tf_2.class);
                }
                if (bl2) {
                    // empty if block
                }
            }
            if (string2 == null) continue;
        }
        return d6_02;
    }

    public boolean X() {
        boolean bl;
        block7: {
            List list;
            J7 j7 = new J7();
            String string = aA.z();
            try {
                list = (List)this.D.B();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            boolean bl2 = false;
            for (DefaultMutableTreeNode defaultMutableTreeNode : list2) {
                bl = defaultMutableTreeNode.getUserObject().getClass().equals(ck_2.class);
                if (string == null) {
                    boolean bl3;
                    if (string == null) {
                        if (bl) {
                            bl2 = true;
                            if (string == null) break;
                        }
                        bl3 = defaultMutableTreeNode.getUserObject().getClass().equals(tf_2.class);
                    }
                    if (bl3) {
                        // empty if block
                    }
                    if (string == null) continue;
                }
                break block7;
            }
            bl = bl2;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void Y(boolean var1_1) {
        block97: {
            block110: {
                block100: {
                    block99: {
                        block98: {
                            block96: {
                                block94: {
                                    block95: {
                                        block107: {
                                            block106: {
                                                try {
                                                    v0 = yt_1.i();
                                                }
                                                catch (InvocationTargetException v1) {
                                                    throw v1.getTargetException();
                                                }
                                                try {
                                                    v2 = (u6_0)v0.h();
                                                }
                                                catch (InvocationTargetException v3) {
                                                    throw v3.getTargetException();
                                                }
                                                var3_2 = v2;
                                                try {
                                                    v4 = (String)var3_2.e();
                                                }
                                                catch (InvocationTargetException v5) {
                                                    throw v5.getTargetException();
                                                }
                                                var4_3 = v4;
                                                try {
                                                    v6 = (KQ)this.C.p();
                                                }
                                                catch (InvocationTargetException v7) {
                                                    throw v7.getTargetException();
                                                }
                                                var5_4 = v6;
                                                try {
                                                    v8 = (U)var5_4.S();
                                                }
                                                catch (InvocationTargetException v9) {
                                                    throw v9.getTargetException();
                                                }
                                                var6_5 = v8;
                                                var2_6 = aA.z();
                                                var7_7 = new YB(YB.M, var6_5, "选择导出保存位置", false);
                                                if (var2_6 != null) break block94;
                                                if (var4_3 == null) break block95;
                                                break block106;
                                                catch (IOException v10) {
                                                    throw aJ.a(v10);
                                                }
                                            }
                                            v11 = (int)var4_3.equals((String)lk_0.G);
                                            if (var2_6 != null) break block96;
                                            break block107;
                                            catch (IOException v12) {
                                                throw aJ.a(v12);
                                            }
                                        }
                                        try {
                                            block108: {
                                                if (v11 != 0) break block95;
                                                break block108;
                                                catch (IOException v13) {
                                                    throw aJ.a(v13);
                                                }
                                            }
                                            try {
                                                var7_7.s((Object)var4_3, true, true);
                                            }
                                            catch (InvocationTargetException v14) {
                                                throw v14.getTargetException();
                                            }
                                        }
                                        catch (IOException v15) {
                                            throw aJ.a(v15);
                                        }
                                    }
                                    var7_7.setSize(aJ.b(30263, 1611283600550907437L), aJ.b(30211, 2770556333707709976L));
                                    var7_7.setLocationRelativeTo(var6_5);
                                    var7_7.setVisible(true);
                                }
                                try {
                                    v11 = (Integer)var7_7.s();
                                }
                                catch (InvocationTargetException v16) {
                                    throw v16.getTargetException();
                                }
                            }
                            if ((var8_8 = v11) != YB.O) break block97;
                            try {
                                v17 = (String)var7_7.E();
                            }
                            catch (InvocationTargetException v18) {
                                throw v18.getTargetException();
                            }
                            var9_9 = v17;
                            if (var2_6 != null) break block98;
                            try {
                                block109: {
                                    if (var9_9 == null) break block97;
                                    break block109;
                                    catch (IOException v19) {
                                        throw aJ.a(v19);
                                    }
                                }
                                try {
                                    var3_2.Y(var9_9);
                                }
                                catch (InvocationTargetException v20) {
                                    throw v20.getTargetException();
                                }
                                try {
                                    v21 = yt_1.i();
                                }
                                catch (InvocationTargetException v22) {
                                    throw v22.getTargetException();
                                }
                                try {
                                    v21.S();
                                }
                                catch (InvocationTargetException v23) {
                                    throw v23.getTargetException();
                                }
                            }
                            catch (IOException v24) {
                                throw aJ.a(v24);
                            }
                        }
                        var10_10 = new J7();
                        try {
                            var10_10.C(var6_5);
                        }
                        catch (InvocationTargetException v25) {
                            throw v25.getTargetException();
                        }
                        var11_11 = new ArrayList();
                        try {
                            v26 = var1_1;
                            if (var2_6 != null) break block99;
                            if (!v26) {
                            }
                            break block100;
                        }
                        catch (IOException v27) {
                            throw aJ.a(v27);
                        }
                        try {
                            v28 = this.D.B();
                        }
                        catch (InvocationTargetException v29) {
                            throw v29.getTargetException();
                        }
                        var11_11 = (ArrayList)v28;
                        v26 = var12_12 = false;
                    }
                    if (var2_6 == null) break block110;
                }
                var12_13 = ((DefaultMutableTreeNode)this.p).children();
                while (var12_13.hasMoreElements()) {
                    try {
                        var11_11.add((DefaultMutableTreeNode)var12_13.nextElement());
                        if (var2_6 == null) {
                            if (var2_6 == null) continue;
                            break;
                        }
                        break block97;
                    }
                    catch (IOException v30) {
                        throw aJ.a(v30);
                    }
                }
            }
            block85: for (DefaultMutableTreeNode var13_15 : var11_11) {
                block103: {
                    block104: {
                        block101: {
                            try {
                                v31 = var13_15.getUserObject().getClass().equals(ck_2.class);
                                if (var2_6 != null) break block101;
                                if (v31) {
                                }
                                ** GOTO lbl194
                            }
                            catch (IOException v32) {
                                throw aJ.a(v32);
                            }
                            var14_16 /* !! */  = (ck_2)var13_15.getUserObject();
                            var15_17 = (DefaultMutableTreeNode)var13_15.getParent();
                            try {
                                v33 = (String)this.c(var15_17);
                            }
                            catch (InvocationTargetException v34) {
                                throw v34.getTargetException();
                            }
                            var16_18 = v33;
                            try {
                                v35 = (String)this.H((Object)var13_15, (Object)var16_18, var9_9);
                            }
                            catch (InvocationTargetException v36) {
                                throw v36.getTargetException();
                            }
                            var17_19 = v35;
                            try {
                                try {
                                    v37 = (String)var14_16 /* !! */.d();
                                }
                                catch (InvocationTargetException v38) {
                                    throw v38.getTargetException();
                                }
                                try {
                                    var10_10.D((Object)new File(v37), (Object)new File((String)var17_19));
                                }
                                catch (InvocationTargetException v39) {
                                    throw v39.getTargetException();
                                }
                            }
                            catch (IOException var18_21) {
                                var18_21.printStackTrace();
                            }
                            if (var2_6 == null) break block103;
lbl194:
                            // 2 sources

                            try {
                                block111: {
                                    v40 = var13_15.getUserObject().getClass();
                                    if (var2_6 != null) break block104;
                                    break block111;
                                    catch (IOException v41) {
                                        throw aJ.a(v41);
                                    }
                                }
                                v31 = v40.equals(tf_2.class);
                            }
                            catch (IOException v42) {
                                throw aJ.a(v42);
                            }
                        }
                        try {
                            if (!v31) break block103;
                            v40 = var13_15.getUserObject();
                        }
                        catch (IOException v43) {
                            throw aJ.a(v43);
                        }
                    }
                    var14_16 /* !! */  = (tf_2)v40;
                    var15_17 = (DefaultMutableTreeNode)var13_15.getParent();
                    try {
                        v44 = (String)this.c(var15_17);
                    }
                    catch (InvocationTargetException v45) {
                        throw v45.getTargetException();
                    }
                    var16_18 = v44;
                    var17_19 = new ArrayList<E>();
                    var18_20 = new ArrayList<tf_2>();
                    try {
                        this.a((Object)var13_15, var17_19, var18_20);
                    }
                    catch (InvocationTargetException v46) {
                        throw v46.getTargetException();
                    }
                    var18_20.add((tf_2)var13_15.getUserObject());
                    var19_22 = var18_20.iterator();
                    while (var19_22.hasNext()) {
                        block105: {
                            block112: {
                                var20_23 /* !! */  = (tf_2)var19_22.next();
                                try {
                                    v47 = (String)var20_23 /* !! */.k();
                                }
                                catch (InvocationTargetException v48) {
                                    throw v48.getTargetException();
                                }
                                var21_24 = (DefaultMutableTreeNode)((HashMap)this.G).get(v47);
                                try {
                                    v49 = (String)this.H((Object)var21_24, (Object)var16_18, var9_9);
                                }
                                catch (InvocationTargetException v50) {
                                    throw v50.getTargetException();
                                }
                                var22_25 = v49;
                                var23_26 = new File(var22_25);
                                v51 = var23_26.exists();
                                if (var2_6 != null) ** GOTO lbl275
                                if (var2_6 != null) break block105;
                                break block112;
                                catch (IOException v52) {
                                    throw aJ.a(v52);
                                }
                            }
                            try {
                                block113: {
                                    if (v51) break block105;
                                    break block113;
                                    catch (IOException v53) {
                                        throw aJ.a(v53);
                                    }
                                }
                                var23_26.mkdirs();
                            }
                            catch (IOException v54) {
                                throw aJ.a(v54);
                            }
                        }
                        if (var2_6 == null) continue;
                    }
                    var19_22 = var17_19.iterator();
                    do {
                        v51 = var19_22.hasNext();
lbl275:
                        // 2 sources

                        if (!v51) break;
                        var20_23 /* !! */  = (ck_2)var19_22.next();
                        try {
                            v55 = (String)var20_23 /* !! */.d();
                        }
                        catch (InvocationTargetException v56) {
                            throw v56.getTargetException();
                        }
                        var21_24 = (DefaultMutableTreeNode)((HashMap)this.G).get(v55);
                        try {
                            v57 = (String)this.H((Object)var21_24, (Object)var16_18, var9_9);
                        }
                        catch (InvocationTargetException v58) {
                            throw v58.getTargetException();
                        }
                        var22_25 = v57;
                        try {
                            try {
                                v59 = (String)var20_23 /* !! */.d();
                            }
                            catch (InvocationTargetException v60) {
                                throw v60.getTargetException();
                            }
                            try {
                                var10_10.D((Object)new File(v59), (Object)new File(var22_25));
                            }
                            catch (InvocationTargetException v61) {
                                throw v61.getTargetException();
                            }
                            if (var2_6 != null) continue block85;
                        }
                        catch (IOException var23_27) {
                            var23_27.printStackTrace();
                        }
                    } while (var2_6 == null);
                }
                if (var2_6 == null) continue;
            }
        }
    }

    void a(DefaultMutableTreeNode defaultMutableTreeNode, ArrayList arrayList, ArrayList arrayList2) {
        String string = aA.z();
        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
            Class<?> clazz;
            Serializable serializable;
            block8: {
                boolean bl;
                DefaultMutableTreeNode defaultMutableTreeNode2;
                block7: {
                    defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
                    bl = defaultMutableTreeNode2.getUserObject().getClass().equals(tf_2.class);
                    if (string != null) break block7;
                    if (bl) {
                        serializable = (tf_2)defaultMutableTreeNode2.getUserObject();
                        arrayList2.add(serializable);
                        try {
                            this.a((Object)defaultMutableTreeNode2, (Object)arrayList, arrayList2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string == null) continue;
                    }
                    clazz = defaultMutableTreeNode2.getUserObject().getClass();
                    if (string != null) break block8;
                    bl = clazz.equals(ck_2.class);
                }
                if (!bl) continue;
                clazz = defaultMutableTreeNode2.getUserObject();
            }
            serializable = (ck_2)((Object)clazz);
            arrayList.add(serializable);
            if (string == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String c(DefaultMutableTreeNode var1_1) {
        block40: {
            block43: {
                block42: {
                    block41: {
                        block38: {
                            block39: {
                                var3_2 = null;
                                var2_3 = aA.z();
                                var4_4 = null;
                                v0 = var1_1.getUserObject().getClass().equals(ck_2.class);
                                if (var2_3 != null) break block38;
                                if (!v0) break block39;
                                var5_5 /* !! */  = (ck_2)var1_1.getUserObject();
                                try {
                                    v1 = yt_1.i();
                                }
                                catch (InvocationTargetException v2) {
                                    throw v2.getTargetException();
                                }
                                try {
                                    v3 = v1.g();
                                }
                                catch (InvocationTargetException v4) {
                                    throw v4.getTargetException();
                                }
                                try {
                                    v5 = var5_5 /* !! */.d();
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                                try {
                                    v7 = (lv_2)v3.q(v5);
                                }
                                catch (InvocationTargetException v8) {
                                    throw v8.getTargetException();
                                }
                                var6_6 = v7;
                                try {
                                    v9 = (String)var6_6.F();
                                }
                                catch (InvocationTargetException v10) {
                                    throw v10.getTargetException();
                                }
                                var3_2 = v9 + "_connect_config.json";
                                break block40;
                            }
                            v11 = var1_1.getUserObject().getClass();
                            if (var2_3 != null) break block41;
                            v0 = v11.equals(tf_2.class);
                        }
                        if (!v0) break block40;
                        v11 = var1_1.getUserObject();
                    }
                    var5_5 /* !! */  = (tf_2)v11;
                    try {
                        v12 = (String)var5_5 /* !! */.k();
                    }
                    catch (InvocationTargetException v13) {
                        throw v13.getTargetException();
                    }
                    if (var2_3 != null) break block42;
                    if (v12.equals((String)dd_1.d)) {
                        try {
                            v12 = (String)var5_5 /* !! */.M();
                        }
                        catch (InvocationTargetException v14) {
                            throw v14.getTargetException();
                        }
                    }
                    break block43;
                }
                var3_2 = v12;
                break block40;
            }
            try {
                v15 = yt_1.i();
            }
            catch (InvocationTargetException v16) {
                throw v16.getTargetException();
            }
            try {
                v17 = v15.g();
            }
            catch (InvocationTargetException v18) {
                throw v18.getTargetException();
            }
            try {
                v19 = var5_5 /* !! */.M();
            }
            catch (InvocationTargetException v20) {
                throw v20.getTargetException();
            }
            try {
                v21 = (lo_1)v17.m(v19);
            }
            catch (InvocationTargetException v22) {
                throw v22.getTargetException();
            }
            var6_6 = v21;
            try {
                v23 = (String)var6_6.F();
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
            var3_2 = v23;
        }
        while ((var4_4 = (DefaultMutableTreeNode)var1_1.getParent()) != null) {
            block44: {
                block45: {
                    v25 = var4_4;
                    if (var2_3 != null) break block44;
                    if (!(v25.getUserObject() instanceof tf_2)) break block45;
                    var5_5 /* !! */  = (tf_2)var4_4.getUserObject();
                    try {
                        v26 = (File)var5_5 /* !! */.M();
                    }
                    catch (InvocationTargetException v27) {
                        throw v27.getTargetException();
                    }
                    var6_6 = v26.getName();
                    var7_7 = null;
                    v28 = var6_6;
                    if (var2_3 != null) ** GOTO lbl111
                    if (v28.equals("conn")) {
                        v28 = var6_6;
lbl111:
                        // 2 sources

                        var7_7 = v28;
                    } else {
                        try {
                            v29 = yt_1.i();
                        }
                        catch (InvocationTargetException v30) {
                            throw v30.getTargetException();
                        }
                        try {
                            v31 = v29.g();
                        }
                        catch (InvocationTargetException v32) {
                            throw v32.getTargetException();
                        }
                        try {
                            v33 = (lo_1)v31.m(var6_6);
                        }
                        catch (InvocationTargetException v34) {
                            throw v34.getTargetException();
                        }
                        var8_8 = v33;
                        try {
                            v35 = (String)var8_8.F();
                        }
                        catch (InvocationTargetException v36) {
                            throw v36.getTargetException();
                        }
                        var7_7 = v35;
                    }
                    var3_2 = var7_7 + File.separator + var3_2;
                }
                v25 = var1_1 = var4_4;
            }
            if (var2_3 == null) continue;
        }
        return var3_2;
    }

    public String H(DefaultMutableTreeNode defaultMutableTreeNode, String string, String string2) {
        String string3;
        String string4 = null;
        try {
            string3 = (String)this.c(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        string4 = string3;
        string4 = string4.substring(string.length() + 1);
        string4 = string2 + File.separator + string4;
        return string4;
    }

    void h(DefaultMutableTreeNode defaultMutableTreeNode, ArrayList arrayList) {
        String string = aA.z();
        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
            Class<?> clazz;
            block8: {
                boolean bl;
                DefaultMutableTreeNode defaultMutableTreeNode2;
                block7: {
                    defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
                    bl = defaultMutableTreeNode2.getUserObject().getClass().equals(tf_2.class);
                    if (string != null) break block7;
                    if (bl) {
                        try {
                            this.h((Object)defaultMutableTreeNode2, (Object)arrayList);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string == null) continue;
                    }
                    clazz = defaultMutableTreeNode2.getUserObject().getClass();
                    if (string != null) break block8;
                    bl = clazz.equals(ck_2.class);
                }
                if (!bl) continue;
                clazz = defaultMutableTreeNode2.getUserObject();
            }
            ck_2 ck_22 = (ck_2)((Object)clazz);
            arrayList.add(ck_22);
            if (string == null) continue;
        }
    }

    public int U(Point point) {
        int n10;
        try {
            n10 = (Integer)this.P((Object)point, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    public int P(Point point, boolean bl) {
        int n10;
        block7: {
            String string = aA.z();
            if ((aJ)this.D != null) {
                int n11 = 0;
                while (n11 < ((aJ)this.D).getRowCount()) {
                    Rectangle rectangle;
                    try {
                        rectangle = (Rectangle)this.F(n11, bl);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    Rectangle rectangle2 = rectangle;
                    if (string == null) {
                        n10 = rectangle2.contains(point) ? 1 : 0;
                        if (string != null) break block7;
                        if (n10 != 0) {
                            return n11;
                        }
                        ++n11;
                    }
                    if (string == null) continue;
                }
            }
            n10 = -1;
        }
        return n10;
    }

    public Rectangle F(int n10, boolean bl) {
        Rectangle rectangle;
        if (bl) {
            try {
                rectangle = (Rectangle)this.g(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } else {
            rectangle = ((aJ)this.D).getRowBounds(n10);
        }
        return rectangle;
    }

    public Rectangle G(DefaultMutableTreeNode defaultMutableTreeNode) {
        Rectangle rectangle;
        int n10;
        try {
            n10 = (Integer)this.I(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            rectangle = (Rectangle)this.g(n10);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return rectangle;
    }

    public int I(DefaultMutableTreeNode defaultMutableTreeNode) {
        TreePath treePath;
        try {
            treePath = (TreePath)this.y(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return this.getRowForPath(treePath);
    }

    public Rectangle g(int n10) {
        Rectangle rectangle = ((aJ)this.D).getRowBounds(n10);
        String string = aA.z();
        Rectangle rectangle2 = rectangle;
        if (string == null) {
            if (rectangle2 != null) {
                Insets insets = ((aJ)this.D).getInsets();
                rectangle.x = insets.left;
                rectangle.width = ((aJ)this.D).getWidth() - insets.left - insets.right;
            }
            rectangle2 = rectangle;
        }
        return rectangle2;
    }

    public as_0 p() {
        return (as_0)this.L;
    }

    public void b(as_0 as_02) {
        this.L = as_02;
    }

    public void M() {
        try {
            this.A(this.p);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
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

    public DefaultMutableTreeNode r(String string) {
        return (DefaultMutableTreeNode)((HashMap)this.G).get(string);
    }

    public void A(String string, int n10) {
        DefaultMutableTreeNode defaultMutableTreeNode;
        block8: {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            block7: {
                String string2 = new File(string).getParentFile().getAbsolutePath();
                defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string2);
                String string3 = aA.z();
                defaultMutableTreeNode2 = defaultMutableTreeNode;
                if (string3 != null) break block7;
                if (defaultMutableTreeNode2 != null) break block8;
                try {
                    this.h((Object)string2, 0);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                defaultMutableTreeNode2 = (DefaultMutableTreeNode)((HashMap)this.G).get(string2);
            }
            defaultMutableTreeNode = defaultMutableTreeNode2;
        }
        ck_2 ck_22 = new ck_2(new File(string));
        try {
            lk_0.n(ck_22);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        DefaultMutableTreeNode defaultMutableTreeNode3 = new DefaultMutableTreeNode(ck_22);
        ((HashMap)this.G).put(string, defaultMutableTreeNode3);
        ((yo_2)this.j).insertNodeInto(defaultMutableTreeNode3, defaultMutableTreeNode, n10);
        try {
            this.A(defaultMutableTreeNode3);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        SwingUtilities.invokeLater(new mb_0(this, defaultMutableTreeNode3));
    }

    public void q(String string) {
        block7: {
            aJ aJ2;
            block4: {
                block5: {
                    TreeNode treeNode;
                    String string2;
                    DefaultMutableTreeNode defaultMutableTreeNode;
                    block6: {
                        DefaultMutableTreeNode defaultMutableTreeNode2;
                        try {
                            defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.D.r(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        defaultMutableTreeNode = defaultMutableTreeNode2;
                        string2 = aA.z();
                        aJ2 = this;
                        if (string2 != null) break block4;
                        if (!aJ2.T) break block5;
                        treeNode = defaultMutableTreeNode;
                        if (string2 != null) break block6;
                        if (treeNode == null) break block7;
                        treeNode = defaultMutableTreeNode.getParent();
                    }
                    if (treeNode == null) break block7;
                    ((yo_2)this.j).removeNodeFromParent(defaultMutableTreeNode);
                    if (string2 == null) break block7;
                }
                aJ2 = this;
            }
            aJ2.repaint();
        }
    }

    public void W(String string) {
        block13: {
            aJ aJ2;
            block9: {
                block10: {
                    String string2;
                    block12: {
                        TreeNode treeNode;
                        DefaultMutableTreeNode defaultMutableTreeNode;
                        block11: {
                            DefaultMutableTreeNode defaultMutableTreeNode2;
                            string2 = aA.z();
                            aJ2 = this;
                            if (string2 != null) break block9;
                            if (!aJ2.T) break block10;
                            try {
                                defaultMutableTreeNode2 = (DefaultMutableTreeNode)this.D.r(string);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            treeNode = defaultMutableTreeNode = defaultMutableTreeNode2;
                            if (string2 != null) break block11;
                            if (treeNode == null) break block12;
                            treeNode = defaultMutableTreeNode.getParent();
                        }
                        if (treeNode != null) {
                            ((yo_2)this.j).removeNodeFromParent(defaultMutableTreeNode);
                        }
                    }
                    if (string2 == null) break block13;
                }
                aJ2 = this;
            }
            aJ2.repaint();
        }
    }

    public tf_2 j(String string, String string2, boolean bl) {
        tf_2 tf_22 = null;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string);
        ((HashMap)this.G).remove(string);
        ((HashMap)this.G).put(string2, defaultMutableTreeNode);
        tf_22 = new tf_2(new File(string2));
        defaultMutableTreeNode.setUserObject(tf_22);
        ((yo_2)this.j).nodeChanged(defaultMutableTreeNode);
        try {
            this.V((Object)defaultMutableTreeNode, (Object)string2, string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return tf_22;
    }

    public void j(String string) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string);
        String string2 = aA.z();
        if (string2 == null) {
            if (defaultMutableTreeNode != null) {
                try {
                    this.J((DefaultMutableTreeNode)defaultMutableTreeNode.getParent());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        } else {
            try {
                this.A(defaultMutableTreeNode);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public ck_2 x(String string, String string2, boolean bl) {
        ck_2 ck_22 = null;
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string);
        ((HashMap)this.G).remove(string);
        ((HashMap)this.G).put(string2, defaultMutableTreeNode);
        ck_22 = new ck_2(new File(string2));
        try {
            lk_0.n(ck_22);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        defaultMutableTreeNode.setUserObject(ck_22);
        ((yo_2)this.j).nodeChanged(defaultMutableTreeNode);
        return ck_22;
    }

    void V(DefaultMutableTreeNode defaultMutableTreeNode, String string, String string2) {
        String string3 = aA.z();
        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
            try {
                this.J((Object)defaultMutableTreeNode2, (Object)string, string2);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    void J(DefaultMutableTreeNode defaultMutableTreeNode, String string, String string2) {
        block23: {
            Object object;
            Object object2;
            String string3;
            Class<?> clazz;
            String string4;
            String string5;
            Serializable serializable;
            block26: {
                boolean bl;
                Class<?> clazz2;
                block24: {
                    String string6;
                    block25: {
                        String string7;
                        clazz2 = defaultMutableTreeNode.getUserObject();
                        string6 = aA.z();
                        bl = clazz2.getClass().equals(tf_2.class);
                        if (string6 != null) break block24;
                        if (!bl) break block25;
                        serializable = (tf_2)((Object)clazz2);
                        try {
                            string7 = (String)serializable.k();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        string5 = string7;
                        string4 = string + string5.substring(string2.length());
                        try {
                            serializable.u(string4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            serializable.t(new File(string4));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((HashMap)this.G).remove(string5);
                        ((HashMap)this.G).put(string4, defaultMutableTreeNode);
                        for (int i2 = 0; i2 < defaultMutableTreeNode.getChildCount(); ++i2) {
                            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(i2);
                            try {
                                this.J((Object)defaultMutableTreeNode2, (Object)string, string2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (string6 == null) {
                                if (string6 == null) continue;
                            }
                            break block23;
                        }
                        if (string6 == null) break block23;
                    }
                    clazz = clazz2.getClass();
                    if (string6 != null) break block26;
                    bl = clazz.equals(ck_2.class);
                }
                if (!bl) break block23;
                clazz = clazz2;
            }
            serializable = (ck_2)((Object)clazz);
            try {
                string3 = (String)serializable.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            string4 = string5 = string3;
            string5 = string + string5.substring(string2.length());
            try {
                serializable.o(string5);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                serializable.N(new File(string5));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((HashMap)this.G).remove(string4);
            ((HashMap)this.G).put(string5, defaultMutableTreeNode);
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.g();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.p((Object)string4, (Object)string5, true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void scrollRectToVisible(Rectangle rectangle) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String convertValueToText(Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        String string;
        String string2 = aA.z();
        Object object2 = object;
        if (string2 == null) {
            if (object2 == null) return "";
            object2 = object;
        }
        String string3 = string = object2.toString();
        if (string2 != null) return string3;
        if (string3 == null) return "";
        return string;
    }

    public void B() {
        block40: {
            Serializable serializable;
            Object object;
            block31: {
                Object object2;
                block39: {
                    Serializable serializable2;
                    Object object3;
                    String string;
                    ArrayList<String> arrayList;
                    block35: {
                        String string2;
                        Class<?> clazz;
                        block38: {
                            boolean bl;
                            DefaultMutableTreeNode defaultMutableTreeNode;
                            block36: {
                                block37: {
                                    String string3;
                                    Object object4;
                                    block34: {
                                        DefaultMutableTreeNode defaultMutableTreeNode2;
                                        aJ aJ2;
                                        block30: {
                                            arrayList = new ArrayList<String>();
                                            int n10 = 0;
                                            string = aA.z();
                                            while (n10 < this.getRowCount() - 1) {
                                                block32: {
                                                    block33: {
                                                        object3 = this.getPathForRow(n10);
                                                        aJ2 = this;
                                                        if (string != null) break block30;
                                                        object = aJ2.getPathForRow(n10 + 1);
                                                        if (string != null) break block32;
                                                        if (!((TreePath)object3).isDescendant((TreePath)object)) break block33;
                                                        DefaultMutableTreeNode object5 = (DefaultMutableTreeNode)((TreePath)object3).getLastPathComponent();
                                                        if (string != null) break block32;
                                                        if (object5.getUserObject().getClass().equals(tf_2.class)) {
                                                            String string4;
                                                            serializable2 = (tf_2)object5.getUserObject();
                                                            try {
                                                                string4 = (String)serializable2.k();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            arrayList.add(string4);
                                                        }
                                                    }
                                                    ++n10;
                                                }
                                                if (string == null) continue;
                                            }
                                            aJ2 = this;
                                        }
                                        try {
                                            defaultMutableTreeNode2 = (DefaultMutableTreeNode)aJ2.u();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        defaultMutableTreeNode = defaultMutableTreeNode2;
                                        object3 = null;
                                        object4 = defaultMutableTreeNode;
                                        if (string != null) break block34;
                                        if (object4 == null) break block35;
                                        object4 = defaultMutableTreeNode.getUserObject();
                                    }
                                    bl = object4.getClass().equals(tf_2.class);
                                    if (string != null) break block36;
                                    if (!bl) break block37;
                                    object = (tf_2)defaultMutableTreeNode.getUserObject();
                                    try {
                                        string3 = (String)object.k();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    object3 = string3;
                                    break block35;
                                }
                                clazz = defaultMutableTreeNode.getUserObject().getClass();
                                if (string != null) break block38;
                                bl = clazz.equals(ck_2.class);
                            }
                            if (!bl) break block35;
                            clazz = defaultMutableTreeNode.getUserObject();
                        }
                        object = (ck_2)((Object)clazz);
                        try {
                            string2 = (String)object.d();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        object3 = string2;
                    }
                    ((HashMap)this.G).clear();
                    try {
                        this.Y();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.p();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.D();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    for (String string5 : arrayList) {
                        serializable2 = (DefaultMutableTreeNode)((HashMap)this.G).get(string5);
                        serializable = serializable2;
                        if (string == null) {
                            if (serializable != null) {
                                this.expandPath(new TreePath(((DefaultMutableTreeNode)serializable2).getPath()));
                            }
                            if (string == null) continue;
                        }
                        break block31;
                    }
                    object2 = object3;
                    if (string != null) break block39;
                    if (object2 == null) break block40;
                    object2 = ((HashMap)this.G).get(object3);
                }
                serializable = (DefaultMutableTreeNode)object2;
            }
            object = serializable;
            try {
                this.A(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private void D() {
        try {
            this.n(this.E);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.E(this.Z, this.E, 0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.expandPath(new TreePath(((DefaultMutableTreeNode)this.p).getPath()));
    }

    public synchronized void U(String string) {
        List list;
        List list2;
        this.H = string.toLowerCase();
        try {
            list2 = (List)this.E.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        list2.clear();
        try {
            list = (List)this.E.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        list.clear();
        ((DefaultMutableTreeNode)this.Z).removeAllChildren();
        this.Z = new DefaultMutableTreeNode("root");
        this.j = new yo_2((DefaultMutableTreeNode)this.Z);
        this.setModel((yo_2)this.j);
        try {
            this.n(this.E);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.o(this.E);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.E(this.Z, this.E, 0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.expandPath(new TreePath(((DefaultMutableTreeNode)this.p).getPath()));
    }

    public void h(String string, int n10) {
        try {
            this.N((Object)string, n10, true, true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void N(String string, int n10, boolean bl, boolean bl2) {
        List list;
        String string2 = new File(string).getParentFile().getAbsolutePath();
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string2);
        String string3 = aA.z();
        Object object = defaultMutableTreeNode;
        if (string3 == null) {
            if (object == null) {
                try {
                    this.h((Object)string2, 0);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                defaultMutableTreeNode = (DefaultMutableTreeNode)((HashMap)this.G).get(string2);
            }
            object = defaultMutableTreeNode.getUserObject();
        }
        tf_2 tf_22 = (tf_2)object;
        tf_2 tf_23 = new tf_2(new File(string));
        try {
            list = (List)tf_22.f();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        list.add(tf_23);
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(tf_23);
        ((HashMap)this.G).put(string, defaultMutableTreeNode2);
        defaultMutableTreeNode.insert(defaultMutableTreeNode2, 0);
        ((yo_2)this.j).insertNodeInto(defaultMutableTreeNode2, defaultMutableTreeNode, n10);
        TreePath treePath = new TreePath(defaultMutableTreeNode2.getPath());
        boolean bl3 = bl;
        if (string3 == null) {
            if (bl3) {
                ((aJ)this.D).setSelectionPath(treePath);
            }
            bl3 = bl2;
        }
        if (bl3) {
            ((aJ)this.D).startEditingAtPath(treePath);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public DefaultMutableTreeNode E(DefaultMutableTreeNode var1_1, tf_2 var2_2, int var3_3) {
        block65: {
            block64: {
                block63: {
                    block62: {
                        block61: {
                            var5_4 = new DefaultMutableTreeNode(var2_2);
                            v0 = aA.z();
                            try {
                                v1 = (File)var2_2.M();
                            }
                            catch (InvocationTargetException v2) {
                                throw v2.getTargetException();
                            }
                            ((HashMap)this.G).put(v1.getAbsolutePath(), var5_4);
                            var4_5 = v0;
                            v3 = this;
                            if (var4_5 != null) break block61;
                            try {
                                block72: {
                                    ((yo_2)v3.j).insertNodeInto(var5_4, var1_1, var3_3);
                                    try {
                                        v4 = (File)var2_2.M();
                                    }
                                    catch (InvocationTargetException v5) {
                                        throw v5.getTargetException();
                                    }
                                    if (!v4.getPath().equals((String)dd_1.d)) break block62;
                                    break block72;
                                    catch (Exception v6) {
                                        throw aJ.a(v6);
                                    }
                                }
                                v3 = this;
                            }
                            catch (Exception v7) {
                                throw aJ.a(v7);
                            }
                        }
                        v3.p = var5_4;
                    }
                    var6_6 = new ArrayList<tf_2>();
                    try {
                        v8 = (List)var2_2.f();
                    }
                    catch (InvocationTargetException v9) {
                        throw v9.getTargetException();
                    }
                    var7_7 = v8.iterator();
                    while (var7_7.hasNext()) {
                        var8_8 = (tf_2)var7_7.next();
                        try {
                            var6_6.add((tf_2)var8_8);
                            if (var4_5 == null) {
                                if (var4_5 == null) continue;
                                break;
                            }
                            break block63;
                        }
                        catch (Exception v10) {
                            throw aJ.a(v10);
                        }
                    }
                    try {
                        v11 = (List)var2_2.M();
                    }
                    catch (InvocationTargetException v12) {
                        throw v12.getTargetException();
                    }
                    var7_7 = v11.iterator();
                }
                while (var7_7.hasNext()) {
                    var8_8 = (ck_2)var7_7.next();
                    try {
                        var6_6.add((tf_2)var8_8);
                        if (var4_5 == null) {
                            if (var4_5 == null) continue;
                            break;
                        }
                        break block64;
                    }
                    catch (Exception v13) {
                        throw aJ.a(v13);
                    }
                }
                var7_7 = var6_6.iterator();
            }
            while (var7_7.hasNext()) {
                block70: {
                    block71: {
                        block66: {
                            block67: {
                                block68: {
                                    var8_8 = var7_7.next();
                                    var9_9 = "";
                                    if (var4_5 != null) break block65;
                                    try {
                                        block73: {
                                            v14 = var8_8.getClass().equals(ck_2.class);
                                            if (var4_5 != null) break block66;
                                            break block73;
                                            catch (Exception v15) {
                                                throw aJ.a(v15);
                                            }
                                        }
                                        if (v14) {
                                        }
                                        ** GOTO lbl172
                                    }
                                    catch (Exception v16) {
                                        throw aJ.a(v16);
                                    }
                                    var10_10 /* !! */  = (ck_2)var8_8;
                                    try {
                                        v17 = (File)var10_10 /* !! */.i();
                                    }
                                    catch (InvocationTargetException v18) {
                                        throw v18.getTargetException();
                                    }
                                    var11_11 = v17.getAbsolutePath();
                                    v19 = var11_11.endsWith("_connect_config.json");
                                    if (var4_5 != null) break block67;
                                    try {
                                        block74: {
                                            if (v19 != 0) break block68;
                                            break block74;
                                            catch (Exception v20) {
                                                throw aJ.a(v20);
                                            }
                                        }
                                        if (var4_5 == null) continue;
                                    }
                                    catch (Exception v21) {
                                        throw aJ.a(v21);
                                    }
                                }
                                v19 = 0;
                            }
                            var12_12 = v19;
                            try {
                                v22 = yt_1.i();
                            }
                            catch (InvocationTargetException v23) {
                                throw v23.getTargetException();
                            }
                            try {
                                v24 = v22.g();
                            }
                            catch (InvocationTargetException v25) {
                                throw v25.getTargetException();
                            }
                            try {
                                v26 = (lv_2)v24.q(var11_11);
                            }
                            catch (InvocationTargetException v27) {
                                throw v27.getTargetException();
                            }
                            var13_13 = v26;
                            try {
                                try {
                                    v28 = (Integer)var13_13.I();
                                }
                                catch (InvocationTargetException v29) {
                                    throw v29.getTargetException();
                                }
                                var12_12 = v28;
                                try {
                                    var10_10 /* !! */.U(var12_12);
                                }
                                catch (InvocationTargetException v30) {
                                    throw v30.getTargetException();
                                }
                            }
                            catch (Exception var14_15) {
                                var14_15.printStackTrace();
                                if (var4_5 == null) continue;
                            }
                            try {
                                v31 = (File)var10_10 /* !! */.i();
                            }
                            catch (InvocationTargetException v32) {
                                throw v32.getTargetException();
                            }
                            var9_9 = v31.getAbsolutePath();
                            var14_14 = new DefaultMutableTreeNode(var10_10 /* !! */ );
                            try {
                                try {
                                    ((yo_2)this.j).insertNodeInto(var14_14, var5_4, var5_4.getChildCount());
                                    try {
                                        v33 = (File)var10_10 /* !! */.i();
                                    }
                                    catch (InvocationTargetException v34) {
                                        throw v34.getTargetException();
                                    }
                                    ((HashMap)this.G).put(v33.getAbsolutePath(), var14_14);
                                    if (var4_5 == null) break block70;
lbl172:
                                    // 2 sources

                                    v35 = var8_8.getClass();
                                    if (var4_5 != null) break block71;
                                }
                                catch (Exception v36) {
                                    throw aJ.a(v36);
                                }
                                v14 = v35.equals(tf_2.class);
                            }
                            catch (Exception v37) {
                                throw aJ.a(v37);
                            }
                        }
                        if (!v14) break block70;
                        v35 = var8_8;
                    }
                    var10_10 /* !! */  = (tf_2)v35;
                    try {
                        v38 = (File)var10_10 /* !! */.M();
                    }
                    catch (InvocationTargetException v39) {
                        throw v39.getTargetException();
                    }
                    var9_9 = v38.getAbsolutePath();
                    try {
                        this.E((Object)var5_4, (Object)var10_10 /* !! */, var5_4.getChildCount());
                    }
                    catch (InvocationTargetException v40) {
                        throw v40.getTargetException();
                    }
                }
                if (var4_5 == null) continue;
            }
            try {
                this.J(var5_4);
            }
            catch (InvocationTargetException v41) {
                throw v41.getTargetException();
            }
        }
        return var5_4;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(DefaultMutableTreeNode defaultMutableTreeNode) {
        boolean bl;
        DefaultMutableTreeNode defaultMutableTreeNode2;
        ArrayList arrayList;
        try {
            arrayList = (ArrayList)lk_0.V(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ArrayList arrayList2 = arrayList;
        ArrayList<DefaultMutableTreeNode> arrayList3 = new ArrayList<DefaultMutableTreeNode>();
        String string = aA.z();
        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            defaultMutableTreeNode2 = (DefaultMutableTreeNode)iterator.next();
            try {
                bl = (Boolean)this.x(defaultMutableTreeNode2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (string != null) return;
            if (string == null && bl) {
                arrayList3.add(defaultMutableTreeNode2);
            }
            if (string == null) continue;
        }
        try {
            lk_0.z(defaultMutableTreeNode);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((yo_2)this.j).nodeStructureChanged(defaultMutableTreeNode);
        iterator = arrayList3.iterator();
        do {
            bl = iterator.hasNext();
            if (!bl) return;
            defaultMutableTreeNode2 = (DefaultMutableTreeNode)iterator.next();
            this.expandPath(new TreePath(defaultMutableTreeNode2.getPath()));
        } while (string == null);
    }

    public void h() {
        try {
            lk_0.L((Object)this, false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.expandPath(new TreePath(((DefaultMutableTreeNode)this.p).getPath()));
    }

    void E(DefaultMutableTreeNode defaultMutableTreeNode) {
        block6: {
            Object object;
            nj_0 nj_02;
            block5: {
                String string = aA.z();
                nj_02 = (nj_0)this.C;
                if (string != null) break block5;
                if (nj_02 == null) break block6;
                nj_02 = (nj_0)this.C;
            }
            try {
                object = nj_02.p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.r(true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    int y(Object object) {
        int n10;
        block22: {
            int n11;
            block21: {
                Serializable serializable;
                String string;
                block19: {
                    block20: {
                        int n12;
                        int n13;
                        Object object2;
                        n11 = 0;
                        string = aA.z();
                        n10 = object.getClass().equals(ck_2.class);
                        if (string != null) break block19;
                        if (n10 == 0) break block20;
                        serializable = (ck_2)object;
                        try {
                            object2 = serializable.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n13 = (Integer)this.d.Q(object2);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            serializable.l(n13);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n12 = (Integer)serializable.p();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n11 = n12;
                        if (string == null) break block21;
                    }
                    n10 = object.getClass().equals(tf_2.class) ? 1 : 0;
                }
                if (string != null) break block22;
                if (n10 != 0) {
                    int n14;
                    int n15;
                    Object object3;
                    serializable = (tf_2)object;
                    try {
                        object3 = serializable.M();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n15 = (Integer)this.d.Q(object3);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        serializable.z(n15);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n14 = (Integer)serializable.r();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n11 = n14;
                }
            }
            n10 = n11;
        }
        return n10;
    }

    public void V(DefaultMutableTreeNode defaultMutableTreeNode, ck_2 ck_22) {
        File file;
        try {
            file = (File)ck_22.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.G).put(file.getAbsolutePath(), defaultMutableTreeNode);
    }

    public void C(DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22) {
        File file;
        try {
            file = (File)tf_22.M();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.G).put(file.getAbsolutePath(), defaultMutableTreeNode);
    }

    public void G(String string) {
        ((HashMap)this.G).remove(string);
    }

    public void I(tf_2 tf_22) {
    }

    public boolean o(tf_2 tf_22) {
        boolean bl;
        block16: {
            Object object;
            Object object2;
            File file;
            try {
                file = (File)tf_22.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            File file2 = file;
            String string = aA.z();
            try {
                tf_22.t(file2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = tf_22.f();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Vector vector = (Vector)object2;
            try {
                object = tf_22.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            Vector vector2 = (Vector)object;
            boolean bl2 = false;
            List list = vector2;
            if (string == null) {
                if (list.size() > 0) {
                    bl2 = true;
                }
                list = (List)vector.clone();
            }
            Vector vector3 = list;
            for (tf_2 tf_23 : vector3) {
                block17: {
                    block18: {
                        boolean bl3;
                        boolean bl4;
                        try {
                            bl4 = (Boolean)this.o(tf_23);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl = bl3 = bl4;
                        if (string != null) break block16;
                        if (string != null) break block17;
                        if (!bl) break block18;
                        bl2 = true;
                        if (string == null) break block17;
                    }
                    vector.remove(tf_23);
                }
                if (string == null) continue;
            }
            bl = bl2;
        }
        return bl;
    }

    public void Q(boolean bl) {
        this.T = bl;
        try {
            this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void n(tf_2 tf_22) {
        block76: {
            Vector<tf_2> vector;
            Vector<tf_2> vector2;
            block77: {
                File file;
                try {
                    file = (File)tf_22.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                File file2 = file;
                String string = aA.z();
                try {
                    tf_22.t(file2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string2 = string;
                File[] fileArray = file2.listFiles();
                vector2 = new Vector<tf_2>();
                vector = new Vector<tf_2>();
                if (string2 != null) break block76;
                if (fileArray == null) break block77;
                for (File file3 : fileArray) {
                    int n10;
                    Serializable serializable;
                    block97: {
                        int n11;
                        block98: {
                            String string3;
                            int n12;
                            lv_2 lv_22;
                            block105: {
                                int n13;
                                block106: {
                                    String string4;
                                    block103: {
                                        block104: {
                                            String string5;
                                            block101: {
                                                block102: {
                                                    String string6;
                                                    block99: {
                                                        block100: {
                                                            String string7;
                                                            block93: {
                                                                block94: {
                                                                    boolean bl;
                                                                    block95: {
                                                                        block96: {
                                                                            String string8;
                                                                            String string9;
                                                                            String string10;
                                                                            String string11;
                                                                            int n14;
                                                                            Object object;
                                                                            Object object2;
                                                                            int n15;
                                                                            block92: {
                                                                                block91: {
                                                                                    boolean bl2;
                                                                                    block90: {
                                                                                        String string12;
                                                                                        block89: {
                                                                                            boolean bl3;
                                                                                            block87: {
                                                                                                boolean bl4;
                                                                                                block88: {
                                                                                                    boolean bl5;
                                                                                                    lv_2 lv_23;
                                                                                                    Object object3;
                                                                                                    Object object4;
                                                                                                    boolean bl6;
                                                                                                    block78: {
                                                                                                        block79: {
                                                                                                            block86: {
                                                                                                                block85: {
                                                                                                                    boolean bl7;
                                                                                                                    block84: {
                                                                                                                        boolean bl8;
                                                                                                                        block80: {
                                                                                                                            block81: {
                                                                                                                                block83: {
                                                                                                                                    boolean bl9;
                                                                                                                                    lo_1 lo_12;
                                                                                                                                    block82: {
                                                                                                                                        lo_1 lo_13;
                                                                                                                                        lo_1 lo_14;
                                                                                                                                        Object object5;
                                                                                                                                        Object object6;
                                                                                                                                        if (string2 != null) break block76;
                                                                                                                                        bl6 = file3.isDirectory();
                                                                                                                                        if (string2 != null) break block78;
                                                                                                                                        if (!bl6) break block79;
                                                                                                                                        serializable = new tf_2();
                                                                                                                                        try {
                                                                                                                                            serializable.t(file3);
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                        }
                                                                                                                                        bl7 = false;
                                                                                                                                        bl8 = this.T;
                                                                                                                                        if (string2 != null) break block80;
                                                                                                                                        if (!bl8) break block81;
                                                                                                                                        try {
                                                                                                                                            object6 = yt_1.i();
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            object5 = object6.g();
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            lo_14 = (lo_1)object5.m(file3.getName());
                                                                                                                                        }
                                                                                                                                        catch (InvocationTargetException invocationTargetException) {
                                                                                                                                            throw invocationTargetException.getTargetException();
                                                                                                                                        }
                                                                                                                                        lo_12 = lo_13 = lo_14;
                                                                                                                                        if (string2 != null) break block82;
                                                                                                                                        if (lo_12 == null) break block83;
                                                                                                                                        lo_12 = lo_13;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        bl9 = (Boolean)le_2.H(lo_12);
                                                                                                                                    }
                                                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                                                    }
                                                                                                                                    if (string2 == null) {
                                                                                                                                        bl9 = bl7 = !bl9;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (string2 == null) break block84;
                                                                                                                            }
                                                                                                                            bl8 = true;
                                                                                                                        }
                                                                                                                        bl7 = bl8;
                                                                                                                    }
                                                                                                                    boolean bl10 = bl7;
                                                                                                                    if (string2 != null) break block85;
                                                                                                                    if (!bl10) break block86;
                                                                                                                    bl10 = vector2.add((tf_2)serializable);
                                                                                                                }
                                                                                                                try {
                                                                                                                    this.n(serializable);
                                                                                                                }
                                                                                                                catch (InvocationTargetException invocationTargetException) {
                                                                                                                    throw invocationTargetException.getTargetException();
                                                                                                                }
                                                                                                            }
                                                                                                            if (string2 == null) continue;
                                                                                                        }
                                                                                                        bl6 = file3.isFile();
                                                                                                    }
                                                                                                    if (string2 == null) {
                                                                                                        if (!bl6) continue;
                                                                                                        bl6 = file3.getName().endsWith("_connect_config.json");
                                                                                                    }
                                                                                                    if (!bl6) continue;
                                                                                                    serializable = new ck_2();
                                                                                                    try {
                                                                                                        serializable.N(file3);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    try {
                                                                                                        object4 = yt_1.i();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    try {
                                                                                                        object3 = object4.g();
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    try {
                                                                                                        lv_23 = (lv_2)object3.q(file3.getAbsolutePath());
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    lv_22 = lv_23;
                                                                                                    bl3 = false;
                                                                                                    bl4 = this.T;
                                                                                                    if (string2 != null) break block87;
                                                                                                    if (!bl4) break block88;
                                                                                                    try {
                                                                                                        bl5 = (Boolean)le_2.H(lv_22);
                                                                                                    }
                                                                                                    catch (InvocationTargetException invocationTargetException) {
                                                                                                        throw invocationTargetException.getTargetException();
                                                                                                    }
                                                                                                    if (string2 == null) {
                                                                                                        bl5 = bl3 = !bl5;
                                                                                                    }
                                                                                                    if (string2 == null) break block87;
                                                                                                }
                                                                                                bl4 = bl3 = true;
                                                                                            }
                                                                                            if (!bl3) continue;
                                                                                            string12 = (String)this.H;
                                                                                            if (string2 != null) break block89;
                                                                                            if (string12 == null) break block90;
                                                                                            string12 = (String)this.H;
                                                                                        }
                                                                                        bl2 = string12.equals("");
                                                                                        if (string2 != null) break block91;
                                                                                        if (!bl2) break block92;
                                                                                    }
                                                                                    bl2 = vector.add((tf_2)serializable);
                                                                                }
                                                                                if (string2 == null) continue;
                                                                            }
                                                                            if (lv_22 == null) {
                                                                                return;
                                                                            }
                                                                            try {
                                                                                n15 = (Integer)lv_22.X();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            string5 = n15 + "";
                                                                            try {
                                                                                object2 = yt_1.i();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            try {
                                                                                object = object2.h();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            try {
                                                                                n14 = (Integer)object.s();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            n13 = n14;
                                                                            n11 = 0;
                                                                            n10 = n13;
                                                                            n12 = u6_0.ng;
                                                                            if (string2 != null) break block93;
                                                                            if (n10 != n12) break block94;
                                                                            try {
                                                                                string11 = (String)lv_22.v();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            bl = string11.toLowerCase().contains((String)this.H);
                                                                            if (string2 != null) break block95;
                                                                            if (bl) break block96;
                                                                            try {
                                                                                string10 = (String)lv_22.F();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            bl = string10.toLowerCase().contains((String)this.H);
                                                                            if (string2 != null) break block95;
                                                                            if (bl) break block96;
                                                                            try {
                                                                                string9 = (String)lv_22.E();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            bl = string9.toLowerCase().contains((String)this.H);
                                                                            if (string2 != null) break block95;
                                                                            if (bl) break block96;
                                                                            bl = string5.toLowerCase().contains((String)this.H);
                                                                            if (string2 != null) break block95;
                                                                            if (bl) break block96;
                                                                            try {
                                                                                string8 = (String)lv_22.Q();
                                                                            }
                                                                            catch (InvocationTargetException invocationTargetException) {
                                                                                throw invocationTargetException.getTargetException();
                                                                            }
                                                                            n10 = string8.contains((String)this.H) ? 1 : 0;
                                                                            if (string2 != null) break block97;
                                                                            if (n10 == 0) break block98;
                                                                        }
                                                                        bl = true;
                                                                    }
                                                                    n11 = bl ? 1 : 0;
                                                                    if (string2 == null) break block98;
                                                                }
                                                                n10 = n13;
                                                                n12 = u6_0.c;
                                                            }
                                                            if (string2 != null) break block99;
                                                            if (n10 != n12) break block100;
                                                            try {
                                                                string7 = (String)lv_22.F();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            n10 = string7.toLowerCase().contains((String)this.H) ? 1 : 0;
                                                            if (string2 != null) break block97;
                                                            if (n10 == 0) break block98;
                                                            n11 = 1;
                                                            if (string2 == null) break block98;
                                                        }
                                                        n10 = n13;
                                                        n12 = u6_0.nZ;
                                                    }
                                                    if (string2 != null) break block101;
                                                    if (n10 != n12) break block102;
                                                    try {
                                                        string6 = (String)lv_22.v();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    n10 = string6.toLowerCase().contains((String)this.H) ? 1 : 0;
                                                    if (string2 != null) break block97;
                                                    if (n10 == 0) break block98;
                                                    n11 = 1;
                                                    if (string2 == null) break block98;
                                                }
                                                n10 = n13;
                                                n12 = u6_0.n9;
                                            }
                                            if (string2 != null) break block103;
                                            if (n10 != n12) break block104;
                                            n10 = string5.toLowerCase().contains((String)this.H) ? 1 : 0;
                                            if (string2 != null) break block97;
                                            if (n10 == 0) break block98;
                                            n11 = 1;
                                            if (string2 == null) break block98;
                                        }
                                        n10 = n13;
                                        n12 = u6_0.nn;
                                    }
                                    if (string2 != null) break block105;
                                    if (n10 != n12) break block106;
                                    try {
                                        string4 = (String)lv_22.Q();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n10 = string4.toLowerCase().contains((String)this.H) ? 1 : 0;
                                    if (string2 != null) break block97;
                                    if (n10 == 0) break block98;
                                    n11 = 1;
                                    if (string2 == null) break block98;
                                }
                                n10 = n13;
                                if (string2 != null) break block97;
                                n12 = u6_0.Z;
                            }
                            if (n10 != n12) break block98;
                            try {
                                string3 = (String)lv_22.E();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            n10 = string3.toLowerCase().contains((String)this.H) ? 1 : 0;
                            if (string2 != null) break block97;
                            if (n10 != 0) {
                                n11 = 1;
                            }
                        }
                        n10 = n11;
                    }
                    if (string2 != null || n10 == 0) continue;
                    n10 = vector.add((tf_2)serializable) ? 1 : 0;
                    if (string2 == null) continue;
                }
            }
            try {
                tf_22.b(vector2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                tf_22.P(vector);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void p(TreeNode treeNode) {
        ((yo_2)this.j).removeNodeFromParent((MutableTreeNode)treeNode);
    }

    @Override
    public int getClosestRowForLocation(int n10, int n11) {
        int n12 = this.getRowForPath(this.getClosestPathForLocation(n10, n11));
        return n12;
    }

    int v() {
        aJ aJ2 = this;
        int n10 = 0;
        try {
            Field field = JTree.DropLocation.class.getDeclaredField("expandRow");
            field.setAccessible(true);
            n10 = field.getInt(aJ2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n10;
    }

    int u(int n10) {
        aJ aJ2 = this;
        int n11 = 0;
        try {
            Field field = JTree.DropLocation.class.getDeclaredField("expandRow");
            field.setAccessible(true);
            field.setInt(aJ2, n10);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n11;
    }

    JTree.DropLocation e(Point point, TreePath treePath, int n10) {
        Class<JTree.DropLocation> clazz = JTree.DropLocation.class;
        JTree.DropLocation dropLocation = null;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(Point.class, TreePath.class, Integer.class);
            constructor.setAccessible(true);
            dropLocation = (JTree.DropLocation)constructor.newInstance(point, treePath, n10);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return dropLocation;
    }

    void l(DefaultMutableTreeNode defaultMutableTreeNode) {
    }

    private void j(File file) {
        File[] fileArray;
        File[] fileArray2 = fileArray = file.listFiles();
        int n10 = fileArray2.length;
        String string = aA.z();
        for (int i2 = 0; i2 < n10; ++i2) {
            File file2 = fileArray2[i2];
            if (!file2.isDirectory()) continue;
        }
    }

    private void i() {
    }

    @Override
    public JComponent K() {
        return null;
    }

    static void o(aJ aJ2) {
        try {
            aJ2.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[11];
                        var11_1 = 0;
                        var10_2 = "j\u00d2\u00bb\u00e9\u0002\u8f3a\u63c8\b\u9026\u62e0\u5bb5\u5177\u4f90\u5b5c\u4f9f\u7f51\u0004Cw\u009e]\u0006\u9028\u627d\u5b74\u515b\u65f2\u4e1b\t\u000b}}\u00fc'\u00f9\u00b3_'\u0014Mb\u00d7h\u008e\u0084\u00b7\u00ca\u0098e\u008dU\u001a\u00c6i\u008ciL\u00fd\u00b5\t\u0005\u001b\u00bc0\u001f`\u00b4l\u00c7\u00149\u00f1Y\u001a_\u00ca\u008d\u0003\u00df\\er\u0007\"\u00ca\u0010\u001d\u00dfs\u00c7";
                        var12_3 = "j\u00d2\u00bb\u00e9\u0002\u8f3a\u63c8\b\u9026\u62e0\u5bb5\u5177\u4f90\u5b5c\u4f9f\u7f51\u0004Cw\u009e]\u0006\u9028\u627d\u5b74\u515b\u65f2\u4e1b\t\u000b}}\u00fc'\u00f9\u00b3_'\u0014Mb\u00d7h\u008e\u0084\u00b7\u00ca\u0098e\u008dU\u001a\u00c6i\u008ciL\u00fd\u00b5\t\u0005\u001b\u00bc0\u001f`\u00b4l\u00c7\u00149\u00f1Y\u001a_\u00ca\u008d\u0003\u00df\\er\u0007\"\u00ca\u0010\u001d\u00dfs\u00c7".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 108;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00d0\u00b82\u0019w\u00d8\t\u0018\u0004$UR\u0011";
                            var12_3 = "\u00d0\u00b82\u0019w\u00d8\t\u0018\u0004$UR\u0011".length();
                            var9_4 = 8;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 124;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 106;
                                    break;
                                }
                                case 1: {
                                    v15 = 86;
                                    break;
                                }
                                case 2: {
                                    v15 = 9;
                                    break;
                                }
                                case 3: {
                                    v15 = 110;
                                    break;
                                }
                                case 4: {
                                    v15 = 88;
                                    break;
                                }
                                case 5: {
                                    v15 = 99;
                                    break;
                                }
                                default: {
                                    v15 = 76;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                aJ.a = var13;
                aJ.c = new String[11];
                var0_7 = 8775940994058784566L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "_\u00ae\u0083\u000b\u00c3\u009f\u00f8\u009c.D\u00b4\u00f1\u0010\u00fc\u00eb\u00aa\u00b9\u0091Du\u0083\u0096C\u00a7\u00d5f\u00f9^$r\u00c0\u00da";
                var5_11 = "_\u00ae\u0083\u000b\u00c3\u009f\u00f8\u009c.D\u00b4\u00f1\u0010\u00fc\u00eb\u00aa\u00b9\u0091Du\u0083\u0096C\u00a7\u00d5f\u00f9^$r\u00c0\u00da".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00b2+}\u0089\u00df\u0094Z\u00f0\u00ee\u0085\u001a\u00d22\u00bcME";
                    var5_11 = "\u00b2+}\u0089\u00df\u0094Z\u00f0\u00ee\u0085\u001a\u00d22\u00bcME".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        aJ.f = var6_8;
        aJ.i = new Integer[6];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x2BA2) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 58;
                    break;
                }
                case 1: {
                    n14 = 245;
                    break;
                }
                case 2: {
                    n14 = 248;
                    break;
                }
                case 3: {
                    n14 = 31;
                    break;
                }
                case 4: {
                    n14 = 109;
                    break;
                }
                case 5: {
                    n14 = 50;
                    break;
                }
                case 6: {
                    n14 = 21;
                    break;
                }
                case 7: {
                    n14 = 79;
                    break;
                }
                case 8: {
                    n14 = 179;
                    break;
                }
                case 9: {
                    n14 = 112;
                    break;
                }
                case 10: {
                    n14 = 12;
                    break;
                }
                case 11: {
                    n14 = 234;
                    break;
                }
                case 12: {
                    n14 = 133;
                    break;
                }
                case 13: {
                    n14 = 184;
                    break;
                }
                case 14: {
                    n14 = 28;
                    break;
                }
                case 15: {
                    n14 = 252;
                    break;
                }
                case 16: {
                    n14 = 222;
                    break;
                }
                case 17: {
                    n14 = 237;
                    break;
                }
                case 18: {
                    n14 = 24;
                    break;
                }
                case 19: {
                    n14 = 62;
                    break;
                }
                case 20: {
                    n14 = 215;
                    break;
                }
                case 21: {
                    n14 = 57;
                    break;
                }
                case 22: {
                    n14 = 72;
                    break;
                }
                case 23: {
                    n14 = 115;
                    break;
                }
                case 24: {
                    n14 = 254;
                    break;
                }
                case 25: {
                    n14 = 98;
                    break;
                }
                case 26: {
                    n14 = 45;
                    break;
                }
                case 27: {
                    n14 = 197;
                    break;
                }
                case 28: {
                    n14 = 231;
                    break;
                }
                case 29: {
                    n14 = 123;
                    break;
                }
                case 30: {
                    n14 = 201;
                    break;
                }
                case 31: {
                    n14 = 162;
                    break;
                }
                case 32: {
                    n14 = 131;
                    break;
                }
                case 33: {
                    n14 = 118;
                    break;
                }
                case 34: {
                    n14 = 106;
                    break;
                }
                case 35: {
                    n14 = 107;
                    break;
                }
                case 36: {
                    n14 = 186;
                    break;
                }
                case 37: {
                    n14 = 243;
                    break;
                }
                case 38: {
                    n14 = 147;
                    break;
                }
                case 39: {
                    n14 = 200;
                    break;
                }
                case 40: {
                    n14 = 250;
                    break;
                }
                case 41: {
                    n14 = 226;
                    break;
                }
                case 42: {
                    n14 = 239;
                    break;
                }
                case 43: {
                    n14 = 207;
                    break;
                }
                case 44: {
                    n14 = 19;
                    break;
                }
                case 45: {
                    n14 = 16;
                    break;
                }
                case 46: {
                    n14 = 217;
                    break;
                }
                case 47: {
                    n14 = 203;
                    break;
                }
                case 48: {
                    n14 = 204;
                    break;
                }
                case 49: {
                    n14 = 159;
                    break;
                }
                case 50: {
                    n14 = 77;
                    break;
                }
                case 51: {
                    n14 = 103;
                    break;
                }
                case 52: {
                    n14 = 140;
                    break;
                }
                case 53: {
                    n14 = 93;
                    break;
                }
                case 54: {
                    n14 = 27;
                    break;
                }
                case 55: {
                    n14 = 39;
                    break;
                }
                case 56: {
                    n14 = 120;
                    break;
                }
                case 57: {
                    n14 = 20;
                    break;
                }
                case 58: {
                    n14 = 232;
                    break;
                }
                case 59: {
                    n14 = 126;
                    break;
                }
                case 60: {
                    n14 = 59;
                    break;
                }
                case 61: {
                    n14 = 148;
                    break;
                }
                case 62: {
                    n14 = 117;
                    break;
                }
                case 63: {
                    n14 = 9;
                    break;
                }
                case 64: {
                    n14 = 143;
                    break;
                }
                case 65: {
                    n14 = 104;
                    break;
                }
                case 66: {
                    n14 = 191;
                    break;
                }
                case 67: {
                    n14 = 174;
                    break;
                }
                case 68: {
                    n14 = 114;
                    break;
                }
                case 69: {
                    n14 = 158;
                    break;
                }
                case 70: {
                    n14 = 208;
                    break;
                }
                case 71: {
                    n14 = 193;
                    break;
                }
                case 72: {
                    n14 = 108;
                    break;
                }
                case 73: {
                    n14 = 246;
                    break;
                }
                case 74: {
                    n14 = 180;
                    break;
                }
                case 75: {
                    n14 = 253;
                    break;
                }
                case 76: {
                    n14 = 227;
                    break;
                }
                case 77: {
                    n14 = 43;
                    break;
                }
                case 78: {
                    n14 = 49;
                    break;
                }
                case 79: {
                    n14 = 185;
                    break;
                }
                case 80: {
                    n14 = 44;
                    break;
                }
                case 81: {
                    n14 = 74;
                    break;
                }
                case 82: {
                    n14 = 223;
                    break;
                }
                case 83: {
                    n14 = 152;
                    break;
                }
                case 84: {
                    n14 = 235;
                    break;
                }
                case 85: {
                    n14 = 220;
                    break;
                }
                case 86: {
                    n14 = 242;
                    break;
                }
                case 87: {
                    n14 = 55;
                    break;
                }
                case 88: {
                    n14 = 63;
                    break;
                }
                case 89: {
                    n14 = 228;
                    break;
                }
                case 90: {
                    n14 = 213;
                    break;
                }
                case 91: {
                    n14 = 94;
                    break;
                }
                case 92: {
                    n14 = 41;
                    break;
                }
                case 93: {
                    n14 = 3;
                    break;
                }
                case 94: {
                    n14 = 37;
                    break;
                }
                case 95: {
                    n14 = 15;
                    break;
                }
                case 96: {
                    n14 = 214;
                    break;
                }
                case 97: {
                    n14 = 30;
                    break;
                }
                case 98: {
                    n14 = 83;
                    break;
                }
                case 99: {
                    n14 = 52;
                    break;
                }
                case 100: {
                    n14 = 26;
                    break;
                }
                case 101: {
                    n14 = 66;
                    break;
                }
                case 102: {
                    n14 = 18;
                    break;
                }
                case 103: {
                    n14 = 182;
                    break;
                }
                case 104: {
                    n14 = 40;
                    break;
                }
                case 105: {
                    n14 = 168;
                    break;
                }
                case 106: {
                    n14 = 178;
                    break;
                }
                case 107: {
                    n14 = 173;
                    break;
                }
                case 108: {
                    n14 = 91;
                    break;
                }
                case 109: {
                    n14 = 155;
                    break;
                }
                case 110: {
                    n14 = 128;
                    break;
                }
                case 111: {
                    n14 = 4;
                    break;
                }
                case 112: {
                    n14 = 89;
                    break;
                }
                case 113: {
                    n14 = 36;
                    break;
                }
                case 114: {
                    n14 = 100;
                    break;
                }
                case 115: {
                    n14 = 105;
                    break;
                }
                case 116: {
                    n14 = 85;
                    break;
                }
                case 117: {
                    n14 = 216;
                    break;
                }
                case 118: {
                    n14 = 135;
                    break;
                }
                case 119: {
                    n14 = 240;
                    break;
                }
                case 120: {
                    n14 = 199;
                    break;
                }
                case 121: {
                    n14 = 221;
                    break;
                }
                case 122: {
                    n14 = 136;
                    break;
                }
                case 123: {
                    n14 = 121;
                    break;
                }
                case 124: {
                    n14 = 33;
                    break;
                }
                case 125: {
                    n14 = 75;
                    break;
                }
                case 126: {
                    n14 = 171;
                    break;
                }
                case 127: {
                    n14 = 251;
                    break;
                }
                case 128: {
                    n14 = 6;
                    break;
                }
                case 129: {
                    n14 = 99;
                    break;
                }
                case 130: {
                    n14 = 65;
                    break;
                }
                case 131: {
                    n14 = 116;
                    break;
                }
                case 132: {
                    n14 = 177;
                    break;
                }
                case 133: {
                    n14 = 153;
                    break;
                }
                case 134: {
                    n14 = 64;
                    break;
                }
                case 135: {
                    n14 = 70;
                    break;
                }
                case 136: {
                    n14 = 170;
                    break;
                }
                case 137: {
                    n14 = 60;
                    break;
                }
                case 138: {
                    n14 = 150;
                    break;
                }
                case 139: {
                    n14 = 48;
                    break;
                }
                case 140: {
                    n14 = 206;
                    break;
                }
                case 141: {
                    n14 = 163;
                    break;
                }
                case 142: {
                    n14 = 67;
                    break;
                }
                case 143: {
                    n14 = 154;
                    break;
                }
                case 144: {
                    n14 = 190;
                    break;
                }
                case 145: {
                    n14 = 212;
                    break;
                }
                case 146: {
                    n14 = 241;
                    break;
                }
                case 147: {
                    n14 = 35;
                    break;
                }
                case 148: {
                    n14 = 7;
                    break;
                }
                case 149: {
                    n14 = 169;
                    break;
                }
                case 150: {
                    n14 = 53;
                    break;
                }
                case 151: {
                    n14 = 211;
                    break;
                }
                case 152: {
                    n14 = 90;
                    break;
                }
                case 153: {
                    n14 = 76;
                    break;
                }
                case 154: {
                    n14 = 198;
                    break;
                }
                case 155: {
                    n14 = 210;
                    break;
                }
                case 156: {
                    n14 = 244;
                    break;
                }
                case 157: {
                    n14 = 1;
                    break;
                }
                case 158: {
                    n14 = 238;
                    break;
                }
                case 159: {
                    n14 = 97;
                    break;
                }
                case 160: {
                    n14 = 187;
                    break;
                }
                case 161: {
                    n14 = 119;
                    break;
                }
                case 162: {
                    n14 = 229;
                    break;
                }
                case 163: {
                    n14 = 102;
                    break;
                }
                case 164: {
                    n14 = 47;
                    break;
                }
                case 165: {
                    n14 = 110;
                    break;
                }
                case 166: {
                    n14 = 183;
                    break;
                }
                case 167: {
                    n14 = 130;
                    break;
                }
                case 168: {
                    n14 = 92;
                    break;
                }
                case 169: {
                    n14 = 124;
                    break;
                }
                case 170: {
                    n14 = 96;
                    break;
                }
                case 171: {
                    n14 = 82;
                    break;
                }
                case 172: {
                    n14 = 194;
                    break;
                }
                case 173: {
                    n14 = 138;
                    break;
                }
                case 174: {
                    n14 = 144;
                    break;
                }
                case 175: {
                    n14 = 101;
                    break;
                }
                case 176: {
                    n14 = 122;
                    break;
                }
                case 177: {
                    n14 = 166;
                    break;
                }
                case 178: {
                    n14 = 142;
                    break;
                }
                case 179: {
                    n14 = 69;
                    break;
                }
                case 180: {
                    n14 = 129;
                    break;
                }
                case 181: {
                    n14 = 2;
                    break;
                }
                case 182: {
                    n14 = 84;
                    break;
                }
                case 183: {
                    n14 = 202;
                    break;
                }
                case 184: {
                    n14 = 225;
                    break;
                }
                case 185: {
                    n14 = 54;
                    break;
                }
                case 186: {
                    n14 = 87;
                    break;
                }
                case 187: {
                    n14 = 218;
                    break;
                }
                case 188: {
                    n14 = 23;
                    break;
                }
                case 189: {
                    n14 = 88;
                    break;
                }
                case 190: {
                    n14 = 247;
                    break;
                }
                case 191: {
                    n14 = 134;
                    break;
                }
                case 192: {
                    n14 = 146;
                    break;
                }
                case 193: {
                    n14 = 195;
                    break;
                }
                case 194: {
                    n14 = 25;
                    break;
                }
                case 195: {
                    n14 = 157;
                    break;
                }
                case 196: {
                    n14 = 161;
                    break;
                }
                case 197: {
                    n14 = 95;
                    break;
                }
                case 198: {
                    n14 = 42;
                    break;
                }
                case 199: {
                    n14 = 0;
                    break;
                }
                case 200: {
                    n14 = 14;
                    break;
                }
                case 201: {
                    n14 = 71;
                    break;
                }
                case 202: {
                    n14 = 224;
                    break;
                }
                case 203: {
                    n14 = 205;
                    break;
                }
                case 204: {
                    n14 = 172;
                    break;
                }
                case 205: {
                    n14 = 165;
                    break;
                }
                case 206: {
                    n14 = 10;
                    break;
                }
                case 207: {
                    n14 = 8;
                    break;
                }
                case 208: {
                    n14 = 151;
                    break;
                }
                case 209: {
                    n14 = 188;
                    break;
                }
                case 210: {
                    n14 = 46;
                    break;
                }
                case 211: {
                    n14 = 145;
                    break;
                }
                case 212: {
                    n14 = 5;
                    break;
                }
                case 213: {
                    n14 = 68;
                    break;
                }
                case 214: {
                    n14 = 38;
                    break;
                }
                case 215: {
                    n14 = 189;
                    break;
                }
                case 216: {
                    n14 = 249;
                    break;
                }
                case 217: {
                    n14 = 160;
                    break;
                }
                case 218: {
                    n14 = 192;
                    break;
                }
                case 219: {
                    n14 = 175;
                    break;
                }
                case 220: {
                    n14 = 32;
                    break;
                }
                case 221: {
                    n14 = 167;
                    break;
                }
                case 222: {
                    n14 = 81;
                    break;
                }
                case 223: {
                    n14 = 164;
                    break;
                }
                case 224: {
                    n14 = 11;
                    break;
                }
                case 225: {
                    n14 = 17;
                    break;
                }
                case 226: {
                    n14 = 233;
                    break;
                }
                case 227: {
                    n14 = 125;
                    break;
                }
                case 228: {
                    n14 = 141;
                    break;
                }
                case 229: {
                    n14 = 61;
                    break;
                }
                case 230: {
                    n14 = 196;
                    break;
                }
                case 231: {
                    n14 = 111;
                    break;
                }
                case 232: {
                    n14 = 73;
                    break;
                }
                case 233: {
                    n14 = 176;
                    break;
                }
                case 234: {
                    n14 = 29;
                    break;
                }
                case 235: {
                    n14 = 137;
                    break;
                }
                case 236: {
                    n14 = 51;
                    break;
                }
                case 237: {
                    n14 = 209;
                    break;
                }
                case 238: {
                    n14 = 181;
                    break;
                }
                case 239: {
                    n14 = 113;
                    break;
                }
                case 240: {
                    n14 = 219;
                    break;
                }
                case 241: {
                    n14 = 236;
                    break;
                }
                case 242: {
                    n14 = 80;
                    break;
                }
                case 243: {
                    n14 = 230;
                    break;
                }
                case 244: {
                    n14 = 86;
                    break;
                }
                case 245: {
                    n14 = 13;
                    break;
                }
                case 246: {
                    n14 = 139;
                    break;
                }
                case 247: {
                    n14 = 22;
                    break;
                }
                case 248: {
                    n14 = 56;
                    break;
                }
                case 249: {
                    n14 = 149;
                    break;
                }
                case 250: {
                    n14 = 127;
                    break;
                }
                case 251: {
                    n14 = 78;
                    break;
                }
                case 252: {
                    n14 = 132;
                    break;
                }
                case 253: {
                    n14 = 34;
                    break;
                }
                case 254: {
                    n14 = 255;
                    break;
                }
                default: {
                    n14 = 156;
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
            aJ.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3818;
        if (i[n11] == null) {
            aJ.i[n11] = (int)(f[n11] ^ l2);
        }
        return i[n11];
    }
}

