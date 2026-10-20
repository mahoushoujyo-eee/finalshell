/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import com.G6;
import com.K3;
import com.OQ;
import com.SZ;
import com._E;
import com.cz_0;
import com.ep_1;
import com.oq_1;
import com.sq_0;
import com.w2_0;
import com.wo_2;
import com.xb_2;
import java.awt.Dimension;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.Co
 */
public class co_0
extends CI {
    protected boolean n = _E.d;
    protected int g = _E.M;
    protected int d = _E.P;
    protected G6 j = _E.z;
    protected FileFilter W = _E.Z;
    protected oq_1 z;
    protected File G = null;
    protected SZ h = null;
    private static String m;

    public co_0() {
        super((ListModel)new ep_1());
        this.Y();
    }

    public co_0(String string) {
        super((ListModel)new ep_1(string));
        this.Y();
    }

    public co_0(File file) {
        super((ListModel)new ep_1(file));
        this.Y();
    }

    public co_0(File[] fileArray) {
        super((ListModel)new ep_1(fileArray));
        this.Y();
    }

    public co_0(List list) {
        super((ListModel)new ep_1(list));
        this.Y();
    }

    protected void Y() {
        this.setLayoutOrientation(2);
        this.setVisibleRowCount(0);
        this.setCellRenderer(new OQ(this));
    }

    public OQ l() throws ClassCastException {
        OQ oQ;
        block6: {
            block5: {
                ListCellRenderer listCellRenderer;
                block4: {
                    ListCellRenderer listCellRenderer2 = this.getCellRenderer();
                    String string = co_0.U();
                    try {
                        try {
                            listCellRenderer = listCellRenderer2;
                            if (string == null) break block4;
                            if (!(listCellRenderer instanceof OQ)) break block5;
                        }
                        catch (ClassCastException classCastException) {
                            throw co_0.a(classCastException);
                        }
                        listCellRenderer = listCellRenderer2;
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                }
                oQ = (OQ)listCellRenderer;
                break block6;
            }
            oQ = null;
        }
        return oQ;
    }

    public ep_1 Y() throws ClassCastException {
        return (ep_1)this.getModel();
    }

    @Override
    protected K3 O() {
        return new w2_0();
    }

    public void g(int n10) {
        this.g = n10;
    }

    public int r() {
        return this.g;
    }

    public int l() {
        return this.d;
    }

    public void m(int n10) {
        this.d = n10;
    }

    public boolean R() {
        return this.n;
    }

    public void y(boolean bl) {
        this.n = bl;
    }

    public G6 Q() {
        return this.j;
    }

    public void l(G6 g62) {
        this.j = g62;
        this.l().g();
    }

    public FileFilter Z() {
        return this.W;
    }

    public void N(FileFilter fileFilter) {
        this.W = fileFilter;
        this.I();
    }

    public void I() {
        this.e(this.v());
    }

    public oq_1 p() {
        return this.z;
    }

    public void W(oq_1 oq_12) {
        oq_1 oq_13 = this.z;
        this.z = oq_12;
        this.Z(oq_13);
        this.Z(oq_12);
        this.repaint();
    }

    protected void Z(oq_1 oq_12) {
        String string = co_0.U();
        if (oq_12 != null) {
            for (wo_2 wo_22 : this.Y().p()) {
                try {
                    if (oq_12.accept(wo_22.T())) {
                        xb_2.G(wo_22);
                    }
                }
                catch (ClassCastException classCastException) {
                    throw co_0.a(classCastException);
                }
                if (string != null) continue;
            }
        }
    }

    public File v() {
        return this.G;
    }

    public void e(File file) {
        block8: {
            co_0 co_02;
            block9: {
                File[] fileArray;
                String string;
                List list;
                block10: {
                    block7: {
                        File file2;
                        block6: {
                            String string2 = co_0.U();
                            this.X();
                            list = this.U();
                            string = string2;
                            try {
                                file2 = file;
                                if (string == null) break block6;
                                if (file2 == null) break block7;
                            }
                            catch (ClassCastException classCastException) {
                                throw co_0.a(classCastException);
                            }
                            file2 = file;
                        }
                        fileArray = cz_0.C(file2.listFiles(this.W));
                        break block10;
                    }
                    fileArray = cz_0.z();
                }
                File[] fileArray2 = fileArray;
                try {
                    try {
                        this.Y().v(fileArray2);
                        co_02 = this;
                        if (string == null) break block8;
                        if (!cz_0.n(co_02.G, file)) break block9;
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                    this.J(list);
                }
                catch (ClassCastException classCastException) {
                    throw co_0.a(classCastException);
                }
            }
            co_02 = this;
        }
        co_02.G = file;
    }

    public List U() {
        ArrayList<File> arrayList;
        block4: {
            Object[] objectArray = this.getSelectedValues();
            ArrayList<File> arrayList2 = new ArrayList<File>(objectArray.length);
            Object[] objectArray2 = objectArray;
            int n10 = objectArray2.length;
            String string = co_0.U();
            for (int i2 = 0; i2 < n10; ++i2) {
                Object object = objectArray2[i2];
                try {
                    arrayList = arrayList2;
                    if (string != null) {
                        arrayList.add(((wo_2)object).T());
                        if (string != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (ClassCastException classCastException) {
                    throw co_0.a(classCastException);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public File J() {
        File file;
        block4: {
            block3: {
                Object e2;
                block2: {
                    Object e3 = this.getSelectedValue();
                    String string = co_0.U();
                    try {
                        e2 = e3;
                        if (string == null) break block2;
                        if (e2 == null) break block3;
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                    e2 = e3;
                }
                file = ((wo_2)e2).T();
                break block4;
            }
            file = null;
        }
        return file;
    }

    public void P(File file) {
        this.U(file, true);
    }

    /*
     * Unable to fully structure code
     */
    public void U(File var1_1, boolean var2_2) {
        block9: {
            block8: {
                var4_3 = this.Y().X(var1_1);
                var3_4 = co_0.U();
                try {
                    try {
                        if (var3_4 == null) break block8;
                        if (var4_3 != null) {
                        }
                        ** GOTO lbl18
                    }
                    catch (ClassCastException v0) {
                        throw co_0.a(v0);
                    }
                    this.setSelectedValue(var4_3, var2_2);
                }
                catch (ClassCastException v1) {
                    throw co_0.a(v1);
                }
            }
            try {
                if (var3_4 != null) break block9;
lbl18:
                // 2 sources

                this.clearSelection();
            }
            catch (ClassCastException v2) {
                throw co_0.a(v2);
            }
        }
    }

    public void J(Collection collection) {
        block5: {
            ArrayList<wo_2> arrayList = new ArrayList<wo_2>(collection.size());
            String string = co_0.U();
            for (File file : collection) {
                block6: {
                    wo_2 wo_22 = this.Y().X(file);
                    try {
                        try {
                            if (string == null) break block5;
                            if (wo_22 == null) break block6;
                        }
                        catch (ClassCastException classCastException) {
                            throw co_0.a(classCastException);
                        }
                        arrayList.add(wo_22);
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                }
                if (string != null) continue;
            }
            this.I(arrayList);
        }
    }

    public SZ x() {
        SZ sZ;
        block4: {
            block5: {
                String string = co_0.U();
                try {
                    try {
                        sZ = this.h;
                        if (string == null) break block4;
                        if (sZ != null) break block5;
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                    this.h = this.K();
                }
                catch (ClassCastException classCastException) {
                    throw co_0.a(classCastException);
                }
            }
            sZ = this.h;
        }
        return sZ;
    }

    public SZ K() {
        return new sq_0(this, this);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension dimension;
        block5: {
            co_0 co_02;
            block4: {
                dimension = super.getPreferredSize();
                String string = co_0.U();
                try {
                    try {
                        co_02 = this;
                        if (string == null) break block4;
                        if (co_02.getModel().getSize() <= 0) break block5;
                    }
                    catch (ClassCastException classCastException) {
                        throw co_0.a(classCastException);
                    }
                    co_02 = this;
                }
                catch (ClassCastException classCastException) {
                    throw co_0.a(classCastException);
                }
            }
            Dimension dimension2 = co_02.getCellBounds(0, 0).getSize();
            dimension.width = dimension2.width * this.g;
        }
        return dimension;
    }

    public static void E(String string) {
        m = string;
    }

    public static String U() {
        return m;
    }

    private static ClassCastException a(ClassCastException classCastException) {
        return classCastException;
    }

    static {
        if (co_0.U() == null) {
            co_0.E("AsYfEc");
        }
    }
}

