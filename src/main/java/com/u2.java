/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EH;
import com.EY;
import com.RK;
import com.SA;
import com.a5;
import com.aL;
import com.cb_1;
import com.cy_1;
import com.cz_0;
import com.iz_1;
import com.on_0;
import com.r6_0;
import com.r7_0;
import com.us_0;
import java.awt.Rectangle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u2
extends us_0 {
    protected boolean i;
    protected EY Z;
    protected final Object G;
    protected int l;

    public u2() {
        this(RK.drives);
    }

    public u2(RK rK) {
        this(rK.I());
    }

    public u2(String string) {
        this(new File[]{new File(string)});
    }

    public u2(File[] fileArray) {
        this(aL.e(fileArray));
    }

    /*
     * Exception decompiling
     */
    public u2(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public r6_0 Y() {
        return (r6_0)super.W();
    }

    @Override
    public void setModel(TreeModel treeModel) {
        boolean bl = this.w();
        this.q(false);
        super.setModel(treeModel);
        this.q(bl);
    }

    protected EY V() {
        String[] stringArray = cb_1.C();
        EY eY = this.Z;
        if (stringArray != null) {
            if (eY == null) {
                this.Z = new EH(this);
            }
            eY = this.Z;
        }
        return eY;
    }

    public boolean M() {
        return this.i;
    }

    public void Z(boolean bl) {
        block4: {
            u2 u22;
            block5: {
                String[] stringArray;
                EY eY;
                block3: {
                    block2: {
                        this.i = bl;
                        eY = this.V();
                        stringArray = cb_1.C();
                        if (stringArray == null) break block2;
                        if (!bl) break block3;
                        this.setTransferHandler(eY);
                    }
                    if (stringArray != null) break block4;
                }
                u22 = this;
                if (stringArray == null) break block5;
                if (u22.getTransferHandler() != eY) break block4;
                u22 = this;
            }
            u22.setTransferHandler(null);
        }
    }

    public on_0 r() {
        on_0 on_02 = this.a();
        String[] stringArray = cb_1.C();
        on_0 on_03 = on_02;
        if (stringArray != null) {
            on_03 = on_03 instanceof iz_1 ? ((iz_1)on_02).u() : null;
        }
        return on_03;
    }

    public void M(on_0 on_02) {
        this.S(on_02 != null ? new iz_1(on_02) : null);
    }

    public void g(String string) {
        cy_1 cy_12 = (cy_1)this.M();
        cy_12.o(string);
        this.D().B(cy_12);
    }

    public void g(File file) {
        this.q(file, false);
    }

    public void q(File file, boolean bl) {
        this.X(file, true, bl);
    }

    public void O(File file) {
        this.X(file, false, true);
    }

    public void B(File file) {
        this.X(file, false, false);
    }

    public void b(File file, boolean bl) {
        this.X(file, bl, false);
    }

    public void X(File file, boolean bl, boolean bl2) {
        this.l(file, bl, bl2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void l(File file, boolean n10, boolean bl, Runnable runnable) {
        block12: {
            String[] stringArray;
            block14: {
                Serializable serializable;
                block10: {
                    int n11;
                    File file2;
                    int n12;
                    block15: {
                        block16: {
                            Runnable runnable2;
                            block20: {
                                block19: {
                                    int n13;
                                    block17: {
                                        block18: {
                                            Serializable serializable2;
                                            block13: {
                                                Object object;
                                                block11: {
                                                    stringArray = cb_1.C();
                                                    object = file;
                                                    if (stringArray == null) break block11;
                                                    if (object == null) break block12;
                                                    object = this.G;
                                                }
                                                serializable = object;
                                                // MONITORENTER : object
                                                ++this.l;
                                                n12 = this.l;
                                                // MONITOREXIT : serializable
                                                serializable2 = serializable = this.A(file);
                                                if (stringArray == null) break block13;
                                                if (serializable2 == null) break block14;
                                                serializable2 = serializable;
                                            }
                                            file2 = ((cy_1)serializable2).D();
                                            if (stringArray == null) break block15;
                                            if (!cz_0.n(file2, file)) break block16;
                                            n13 = n10;
                                            if (stringArray == null) break block17;
                                            if (n13 == 0) break block18;
                                            n13 = n12;
                                            if (stringArray == null) break block17;
                                            if (n13 != this.l) break block18;
                                            this.G((cy_1)serializable, bl);
                                            if (stringArray != null) break block19;
                                        }
                                        n13 = bl ? 1 : 0;
                                    }
                                    if (n13 != 0) {
                                        this.P((DefaultMutableTreeNode)serializable);
                                    }
                                    this.O((DefaultMutableTreeNode)serializable);
                                }
                                runnable2 = runnable;
                                if (stringArray == null) break block20;
                                if (runnable2 == null) break block14;
                                runnable2 = runnable;
                            }
                            runnable2.run();
                            if (stringArray != null) break block14;
                        }
                        file2 = file;
                    }
                    List list = cz_0.c(file2);
                    for (int i2 = n11 = list.indexOf(((cy_1)serializable).D()); i2 >= 0; --i2) {
                        list.remove(i2);
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block10;
                    }
                    this.d(new SA(this, (cy_1)serializable, list, n10 != 0, n12, bl, runnable));
                }
                this.K((cb_1)serializable);
            }
            if (stringArray != null) return;
        }
        if (n10 == 0) return;
        this.clearSelection();
    }

    /*
     * Unable to fully structure code
     */
    protected void G(cy_1 var1_1, boolean var2_2) {
        block21: {
            var3_3 = cb_1.C();
            try {
                block16: {
                    block20: {
                        block19: {
                            block17: {
                                block18: {
                                    block23: {
                                        block22: {
                                            var4_4 = var1_1.i();
                                            v0 = this;
                                            v1 = var4_4;
                                            if (var3_3 == null) break block16;
                                            v0.setSelectionPath(v1);
                                            if (!var2_2) ** GOTO lbl56
                                            break block22;
                                            catch (Throwable v2) {
                                                throw u2.b(v2);
                                            }
                                        }
                                        v3 = this;
                                        if (var3_3 == null) break block17;
                                        break block23;
                                        catch (Throwable v4) {
                                            throw u2.b(v4);
                                        }
                                    }
                                    try {
                                        block24: {
                                            if (v3.p()) break block18;
                                            break block24;
                                            catch (Throwable v5) {
                                                throw u2.b(v5);
                                            }
                                        }
                                        this.expandPath(var4_4);
                                    }
                                    catch (Throwable v6) {
                                        throw u2.b(v6);
                                    }
                                }
                                v3 = this;
                            }
                            var5_6 = v3.getPathBounds(var4_4);
                            v7 = var5_6;
                            if (var3_3 == null) break block19;
                            try {
                                block25: {
                                    if (v7 == null) break block20;
                                    break block25;
                                    catch (Throwable v8) {
                                        throw u2.b(v8);
                                    }
                                }
                                v7 = this.getVisibleRect();
                            }
                            catch (Throwable v9) {
                                throw u2.b(v9);
                            }
                        }
                        var6_7 = v7;
                        var7_8 = new Rectangle(var6_7.x, var5_6.y, var6_7.width, var6_7.height);
                        this.scrollRectToVisible(var7_8);
                    }
                    try {
                        if (var3_3 != null) break block21;
lbl56:
                        // 2 sources

                        v0 = this;
                        v1 = var4_4;
                    }
                    catch (Throwable v10) {
                        throw u2.b(v10);
                    }
                }
                v0.scrollPathToVisible(v1);
            }
            catch (Throwable var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public File N() {
        cy_1 cy_12 = (cy_1)this.Q();
        String[] stringArray = cb_1.C();
        cy_1 cy_13 = cy_12;
        if (stringArray != null) {
            if (cy_13 == null) return null;
            cy_13 = cy_12;
        }
        File file = cy_13.D();
        return file;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public List p() {
        ArrayList<File> arrayList;
        ArrayList<File> arrayList2;
        block4: {
            TreePath[] treePathArray;
            String[] stringArray;
            block3: {
                arrayList2 = new ArrayList<File>();
                stringArray = cb_1.C();
                treePathArray = this.getSelectionPaths();
                if (stringArray == null) break block3;
                if (treePathArray == null) break block4;
                treePathArray = this.getSelectionPaths();
            }
            for (TreePath treePath : treePathArray) {
                arrayList = arrayList2;
                if (stringArray == null) return arrayList;
                arrayList.add(((cy_1)this.b(treePath)).D());
                if (stringArray != null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public List V() {
        ArrayList<cy_1> arrayList;
        ArrayList<cy_1> arrayList2;
        block4: {
            TreePath[] treePathArray;
            String[] stringArray;
            block3: {
                arrayList2 = new ArrayList<cy_1>();
                stringArray = cb_1.C();
                treePathArray = this.getSelectionPaths();
                if (stringArray == null) break block3;
                if (treePathArray == null) break block4;
                treePathArray = this.getSelectionPaths();
            }
            for (TreePath treePath : treePathArray) {
                arrayList = arrayList2;
                if (stringArray == null) return arrayList;
                arrayList.add((cy_1)this.b(treePath));
                if (stringArray != null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public boolean E(File file, File file2) {
        return this.b(file, new File[]{file2});
    }

    public boolean S(cy_1 cy_12, File file) {
        return this.N(cy_12, new File[]{file});
    }

    public boolean b(File file, File[] fileArray) {
        return this.H(file, aL.e(fileArray));
    }

    public boolean N(cy_1 cy_12, File[] fileArray) {
        return this.O(cy_12, aL.e(fileArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean H(File file, List list) {
        cy_1 cy_12 = this.d(file);
        String[] stringArray = cb_1.C();
        if (cy_12 == null) return false;
        boolean bl = this.O(cy_12, list);
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    public boolean O(cy_1 cy_12, List list) {
        String[] stringArray = cb_1.C();
        boolean bl = this.hasBeenExpanded(this.N(cy_12));
        if (stringArray != null) {
            if (bl) {
                block4: {
                    ArrayList<cy_1> arrayList = new ArrayList<cy_1>(list.size());
                    for (File file : list) {
                        arrayList.add(new cy_1(file));
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block4;
                    }
                    this.z(cy_12, arrayList);
                }
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public boolean Y(File file) {
        return this.c(this.d(file));
    }

    public boolean U(File[] fileArray) {
        boolean bl;
        block2: {
            boolean bl2 = false;
            String[] stringArray = cb_1.C();
            for (File file : fileArray) {
                bl = bl2 | this.Y(file);
                if (stringArray != null) {
                    bl2 = bl;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            bl = bl2;
        }
        return bl;
    }

    public boolean r(List list) {
        boolean bl;
        block2: {
            boolean bl2 = false;
            Iterator iterator = list.iterator();
            String[] stringArray = cb_1.C();
            while (iterator.hasNext()) {
                File file = (File)iterator.next();
                bl = bl2 | this.Y(file);
                if (stringArray != null) {
                    bl2 = bl;
                    if (stringArray != null) continue;
                }
                break block2;
            }
            bl = bl2;
        }
        return bl;
    }

    public void r(File file) {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    cy_1 cy_12 = this.d(file);
                    stringArray = cb_1.C();
                    if (stringArray == null) break block2;
                    if (cy_12 == null) break block3;
                    this.b(cy_12);
                }
                if (stringArray != null) break block4;
            }
            this.l(file, false, false, new a5(this, file));
        }
    }

    public List d(cy_1 cy_12) {
        ArrayList<File> arrayList;
        block2: {
            ArrayList<File> arrayList2 = new ArrayList<File>();
            String[] stringArray = cb_1.C();
            for (int i2 = 0; i2 < cy_12.getChildCount(); ++i2) {
                arrayList = arrayList2;
                if (stringArray != null) {
                    arrayList.add(cy_12.V(i2).D());
                    if (stringArray != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public cy_1 d(File file) {
        cy_1 cy_12 = this.A(file);
        return cy_12 != null && cz_0.n(file, cy_12.D()) ? cy_12 : null;
    }

    public cy_1 A(File file) {
        return this.m((cy_1)this.getModel().getRoot(), cz_0.c(file));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected cy_1 m(cy_1 var1_1, List var2_2) {
        var4_3 = var1_1.D();
        var3_4 = cb_1.C();
        if (var4_3 != null) {
            v0 = var2_2.contains(var4_3);
            if (var3_4 != null) {
                if (v0 != 0) {
                    for (var6_7 = var5_5 = var2_2.indexOf(var4_3); var6_7 >= 0; --var6_7) {
                        var2_2.remove(var6_7);
                        if (var3_4 != null) continue;
                    }
                    return this.U(var1_1, var2_2);
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var5_6 = 0;
        }
        while (var5_6 < var1_1.getChildCount()) {
            var6_8 = this.m(var1_1.V(var5_6), var2_2);
            if (var3_4 != null) {
                if (var6_8 != null) {
                    return var6_8;
                }
                ++var5_6;
            }
            if (var3_4 != null) continue;
        }
        return null;
    }

    protected cy_1 U(cy_1 cy_12, List list) {
        cy_1 cy_13;
        block6: {
            block8: {
                int n10;
                String[] stringArray;
                block7: {
                    stringArray = cb_1.C();
                    int n11 = list.size();
                    if (stringArray == null) break block7;
                    if (n11 <= 0) break block8;
                    n11 = n10 = 0;
                }
                while (n10 < cy_12.getChildCount()) {
                    cy_1 cy_14 = cy_12.V(n10);
                    if (stringArray != null) {
                        cy_13 = cy_14;
                        if (stringArray == null) break block6;
                        if (cy_13.D().equals(list.get(0))) {
                            list.remove(0);
                            return this.U(cy_14, list);
                        }
                        ++n10;
                    }
                    if (stringArray != null) continue;
                }
            }
            cy_13 = cy_12;
        }
        return cy_13;
    }

    public void t(File file) {
        this.d(file, false);
    }

    public void d(File file, boolean bl) {
        cy_1 cy_12 = this.d(file);
        String[] stringArray = cb_1.C();
        cb_1 cb_12 = cy_12;
        if (stringArray != null && cb_12 != null) {
            cb_12 = this.S((cb_1)cy_12, bl);
        }
    }

    public void s(File file) {
        this.D(file, false);
    }

    public void D(File file, boolean bl) {
        cy_1 cy_12 = this.d(file);
        String[] stringArray = cb_1.C();
        cb_1 cb_12 = cy_12;
        if (stringArray != null && cb_12 != null) {
            cb_12 = this.B(cy_12, bl);
        }
    }

    @Override
    public r7_0 W() {
        return this.Y();
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }
}

