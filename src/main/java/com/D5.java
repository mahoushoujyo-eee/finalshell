/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SV;
import com.aL;
import com.cb_1;
import com.m.U;
import com.nb_0;
import com.od_1;
import com.pt_0;
import com.u3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class D5
implements SV {
    protected u3 b;
    protected Map D = new WeakHashMap();
    protected List d = new ArrayList(1);

    public D5(u3 u32) {
        this.b = u32;
    }

    public u3 F() {
        return this.b;
    }

    public void f(u3 u32) {
        this.D.clear();
        this.b = u32;
    }

    @Override
    public List p(boolean bl) {
        return this.E(pt_0.checked, bl);
    }

    @Override
    public List O() {
        return this.E(pt_0.mixed, false);
    }

    protected List E(pt_0 pt_02, boolean bl) {
        ArrayList<DefaultMutableTreeNode> arrayList;
        block4: {
            arrayList = new ArrayList<DefaultMutableTreeNode>(this.D.size());
            String[] stringArray = cb_1.C();
            for (Map.Entry entry : this.D.entrySet()) {
                if (stringArray != null) {
                    if (entry.getValue() == pt_02) {
                        arrayList.add((DefaultMutableTreeNode)entry.getKey());
                    }
                    if (stringArray != null) continue;
                }
                break block4;
            }
            if (bl) {
                U.z(arrayList);
            }
        }
        return arrayList;
    }

    @Override
    public void g(Collection collection, boolean bl) {
        block4: {
            String[] stringArray = cb_1.C();
            int n10 = this.d.size();
            if (stringArray != null) {
                n10 = n10 > 0 ? 1 : 0;
            }
            int n11 = n10;
            ArrayList arrayList = null;
            if (n11 != 0) {
                arrayList = new ArrayList(collection.size());
            }
            ArrayList arrayList2 = new ArrayList();
            for (DefaultMutableTreeNode defaultMutableTreeNode : collection) {
                this.g(defaultMutableTreeNode, bl, arrayList2, arrayList);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block4;
            }
            this.S(arrayList2);
            this.o(arrayList);
        }
    }

    @Override
    public pt_0 P(DefaultMutableTreeNode defaultMutableTreeNode) {
        pt_0 pt_02 = (pt_0)((Object)this.D.get(defaultMutableTreeNode));
        String[] stringArray = cb_1.C();
        pt_0 pt_03 = pt_02;
        if (stringArray != null) {
            pt_03 = pt_03 != null ? pt_02 : pt_0.unchecked;
        }
        return pt_03;
    }

    @Override
    public void s(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl) {
        String[] stringArray = cb_1.C();
        int n10 = this.d.size();
        if (stringArray != null) {
            n10 = n10 > 0 ? 1 : 0;
        }
        int n11 = n10;
        ArrayList arrayList = null;
        if (n11 != 0) {
            arrayList = new ArrayList(1);
        }
        ArrayList arrayList2 = new ArrayList();
        this.g(defaultMutableTreeNode, bl, arrayList2, arrayList);
        this.S(arrayList2);
        this.o(arrayList);
    }

    protected void g(DefaultMutableTreeNode defaultMutableTreeNode, boolean bl, List list, List list2) {
        block8: {
            D5 d5;
            block10: {
                pt_0 pt_02;
                String[] stringArray;
                block9: {
                    pt_0 pt_03;
                    block7: {
                        pt_03 = this.P(defaultMutableTreeNode);
                        stringArray = cb_1.C();
                        pt_0 pt_04 = pt_02 = bl ? pt_0.checked : pt_0.unchecked;
                        if (stringArray == null) break block7;
                        if (pt_03 == pt_02) break block8;
                        d5 = this;
                        if (stringArray == null) break block9;
                        d5.g(defaultMutableTreeNode, pt_02, list);
                    }
                    if (list2 != null) {
                        list2.add(new od_1(defaultMutableTreeNode, pt_03, pt_02));
                    }
                    d5 = this;
                }
                if (stringArray == null) break block10;
                if (!d5.b.e()) break block8;
                this.h(defaultMutableTreeNode, pt_02, list, list2);
                d5 = this;
            }
            d5.f(defaultMutableTreeNode, list, list2);
        }
    }

    protected void f(DefaultMutableTreeNode defaultMutableTreeNode, List list, List list2) {
        DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getParent();
        String[] stringArray = cb_1.C();
        while (defaultMutableTreeNode2 != null) {
            block17: {
                block18: {
                    pt_0 pt_02;
                    block20: {
                        List list3;
                        pt_0 pt_03;
                        block19: {
                            block14: {
                                pt_0 pt_04;
                                pt_02 = pt_0.unchecked;
                                boolean bl = false;
                                boolean bl2 = false;
                                for (int i2 = 0; i2 < defaultMutableTreeNode2.getChildCount(); ++i2) {
                                    block16: {
                                        block15: {
                                            pt_0 pt_05;
                                            pt_0 pt_06;
                                            pt_04 = pt_06 = this.P((DefaultMutableTreeNode)defaultMutableTreeNode2.getChildAt(i2));
                                            if (stringArray == null) break block14;
                                            pt_0 pt_07 = pt_0.mixed;
                                            if (stringArray != null) {
                                                if (pt_04 == pt_07) {
                                                    pt_02 = pt_0.mixed;
                                                    if (stringArray != null) break;
                                                }
                                                pt_05 = pt_06;
                                                pt_07 = pt_0.checked;
                                            }
                                            if (stringArray != null) {
                                                if (pt_05 == pt_07) {
                                                    bl = true;
                                                    if (stringArray != null) {
                                                        if (bl2) {
                                                            pt_02 = pt_0.mixed;
                                                            if (stringArray != null) break;
                                                        }
                                                        pt_02 = pt_0.checked;
                                                    }
                                                    if (stringArray != null) continue;
                                                }
                                                pt_05 = pt_06;
                                                pt_07 = pt_0.unchecked;
                                            }
                                            if (pt_05 != pt_07) continue;
                                            bl2 = true;
                                            if (stringArray == null) break block15;
                                            if (!bl) break block16;
                                            pt_02 = pt_0.mixed;
                                        }
                                        if (stringArray != null) break;
                                    }
                                    pt_02 = pt_0.unchecked;
                                    if (stringArray != null) continue;
                                }
                                pt_04 = pt_03 = this.P(defaultMutableTreeNode2);
                            }
                            if (stringArray == null) break block17;
                            if (pt_03 == pt_02) break block18;
                            list3 = list2;
                            if (stringArray == null) break block19;
                            if (list3 == null) break block20;
                            list3 = list2;
                        }
                        list3.add(new od_1(defaultMutableTreeNode2, pt_03, pt_02));
                    }
                    this.g(defaultMutableTreeNode2, pt_02, list);
                }
                defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode2.getParent();
            }
            if (stringArray != null) continue;
        }
    }

    protected void h(DefaultMutableTreeNode defaultMutableTreeNode, pt_0 pt_02, List list, List list2) {
        int n10 = 0;
        String[] stringArray = cb_1.C();
        while (n10 < defaultMutableTreeNode.getChildCount()) {
            DefaultMutableTreeNode defaultMutableTreeNode2 = (DefaultMutableTreeNode)defaultMutableTreeNode.getChildAt(n10);
            if (stringArray != null) {
                if (list2 != null) {
                    list2.add(new od_1(defaultMutableTreeNode2, this.P(defaultMutableTreeNode2), pt_02));
                }
                this.g(defaultMutableTreeNode2, pt_02, list);
                this.h(defaultMutableTreeNode2, pt_02, list, list2);
                ++n10;
            }
            if (stringArray != null) continue;
        }
    }

    protected void g(DefaultMutableTreeNode defaultMutableTreeNode, pt_0 pt_02, List list) {
        block2: {
            pt_0 pt_03;
            block3: {
                String[] stringArray = cb_1.C();
                pt_03 = pt_02;
                if (stringArray == null) break block2;
                if (pt_03 == pt_0.unchecked) break block3;
                this.D.put(defaultMutableTreeNode, pt_02);
                if (stringArray != null) break block2;
            }
            pt_03 = this.D.remove(defaultMutableTreeNode);
        }
        list.add(defaultMutableTreeNode);
    }

    @Override
    public void j(DefaultMutableTreeNode defaultMutableTreeNode) {
        String[] stringArray = cb_1.C();
        int n10 = this.d.size();
        if (stringArray != null) {
            n10 = n10 > 0 ? 1 : 0;
        }
        int n11 = n10;
        ArrayList arrayList = null;
        if (n11 != 0) {
            arrayList = new ArrayList(1);
        }
        ArrayList arrayList2 = new ArrayList();
        this.g(defaultMutableTreeNode, this.k(this.P(defaultMutableTreeNode)) == pt_0.checked, arrayList2, arrayList);
        this.S(arrayList2);
        this.o(arrayList);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void I(Collection var1_1) {
        block9: {
            var2_2 = cb_1.C();
            v0 = this.d.size();
            if (var2_2 != null) {
                v0 = v0 > 0 ? 1 : 0;
            }
            var3_3 = v0;
            var4_4 = null;
            if (var3_3 != 0) {
                var4_4 = new ArrayList<E>(var1_1.size());
            }
            var5_5 = new ArrayList<E>();
            var6_6 = false;
            var7_7 = var1_1.iterator();
            while (var7_7.hasNext()) {
                block11: {
                    block10: {
                        var8_8 = (DefaultMutableTreeNode)var7_7.next();
                        if (var2_2 == null) break block10;
                        v1 /* !! */  = this.P(var8_8);
                        if (var2_2 == null) ** GOTO lbl-1000
                        if (v1 /* !! */  == pt_0.checked) break block11;
                        var6_6 = true;
                    }
                    if (var2_2 != null) break;
                }
                if (var2_2 != null) continue;
            }
            for (E v1 : var1_1) lbl-1000:
            // 2 sources

            {
                var8_8 = (DefaultMutableTreeNode)v1 /* !! */ ;
                this.g(var8_8, var6_6, var5_5, var4_4);
                if (var2_2 != null) {
                    if (var2_2 != null) continue;
                }
                break block9;
            }
            this.S(var5_5);
            this.o(var4_4);
        }
    }

    @Override
    public void c() {
        block3: {
            ArrayList<od_1> arrayList;
            block4: {
                arrayList = null;
                String[] stringArray = cb_1.C();
                if (this.d.size() <= 0) break block4;
                arrayList = new ArrayList<od_1>(this.D.size());
                for (Map.Entry entry : this.D.entrySet()) {
                    block7: {
                        pt_0 pt_02;
                        block6: {
                            pt_0 pt_03;
                            pt_0 pt_04;
                            block5: {
                                pt_02 = (pt_0)((Object)entry.getValue());
                                if (stringArray == null) break block3;
                                pt_04 = pt_02;
                                pt_03 = pt_0.mixed;
                                if (stringArray == null) break block5;
                                if (pt_04 == pt_03) break block6;
                                pt_04 = pt_02;
                                pt_03 = pt_0.checked;
                            }
                            if (pt_04 != pt_03) break block7;
                        }
                        arrayList.add(new od_1((DefaultMutableTreeNode)entry.getKey(), pt_02, pt_0.unchecked));
                    }
                    if (stringArray != null) continue;
                }
            }
            this.D.clear();
            this.F();
            this.o(arrayList);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void h() {
        block5: {
            block6: {
                var2_1 = this.b.W();
                var3_2 = null;
                var1_3 = cb_1.C();
                if (this.d.size() <= 0) break block6;
                var3_2 = new ArrayList<od_1>(var2_1.size());
                var4_4 = var2_1.iterator();
                while (var4_4.hasNext()) {
                    var5_5 = (DefaultMutableTreeNode)var4_4.next();
                    v0 = var6_6 = this.P(var5_5);
                    if (var1_3 != null) {
                        if (v0 != pt_0.checked) {
                            var3_2.add(new od_1(var5_5, var6_6, pt_0.checked));
                        }
                        if (var1_3 != null) continue;
                    }
                    ** GOTO lbl19
                }
            }
            for (DefaultMutableTreeNode var5_5 : var2_1) {
                v0 = this.D.put(var5_5, pt_0.checked);
lbl19:
                // 2 sources

                if (var1_3 != null) {
                    if (var1_3 != null) continue;
                }
                break block5;
            }
            this.F();
            this.o(var3_2);
        }
    }

    protected pt_0 k(pt_0 pt_02) {
        switch (pt_02) {
            case unchecked: {
                return pt_0.checked;
            }
            case checked: {
                return pt_0.unchecked;
            }
            case mixed: {
                return this.b.X() ? pt_0.checked : pt_0.unchecked;
            }
        }
        return pt_0.unchecked;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void y(boolean var1_1) {
        block12: {
            block14: {
                block13: {
                    var2_2 = cb_1.C();
                    v0 = this.d.size();
                    if (var2_2 != null) {
                        v0 = v0 > 0 ? 1 : 0;
                    }
                    var3_3 = v0;
                    var4_4 = null;
                    if (var3_3 != 0) {
                        var4_4 = new ArrayList<od_1>();
                    }
                    var5_5 = new ArrayList<Object>();
                    if (!var1_1) break block13;
                    var6_6 = new ArrayList<E>(this.D.size());
                    var7_7 = this.D.entrySet().iterator();
                    while (var7_7.hasNext()) {
                        var8_8 = (Map.Entry)var7_7.next();
                        v1 /* !! */  = var8_8.getValue();
                        if (var2_2 != null) {
                            if (v1 /* !! */  == pt_0.checked) {
                                var6_6.add((DefaultMutableTreeNode)var8_8.getKey());
                            }
                            if (var2_2 != null) continue;
                        }
                        ** GOTO lbl26
                    }
                    this.I((List)var6_6);
                    var7_7 = var6_6.iterator();
                    while (var7_7.hasNext()) {
                        v1 /* !! */  = var7_7.next();
lbl26:
                        // 2 sources

                        var8_8 = (DefaultMutableTreeNode)v1 /* !! */ ;
                        this.f((DefaultMutableTreeNode)var8_8, var5_5, var4_4);
                        this.h((DefaultMutableTreeNode)var8_8, pt_0.checked, var5_5, var4_4);
                        if (var2_2 != null) {
                            if (var2_2 != null) continue;
                        }
                        break block12;
                    }
                    if (var2_2 != null) break block14;
                }
                var6_6 = this.D.entrySet().iterator();
                while (var6_6.hasNext()) {
                    block16: {
                        block17: {
                            block15: {
                                var7_7 = (Map.Entry)var6_6.next();
                                if (var2_2 == null) break block12;
                                v2 /* !! */  = var7_7.getValue();
                                if (var2_2 == null) break block15;
                                if (v2 /* !! */  != pt_0.mixed) break block16;
                                v2 /* !! */  = var7_7.getKey();
                            }
                            var8_8 = (DefaultMutableTreeNode)v2 /* !! */ ;
                            var5_5.add(var8_8);
                            var6_6.remove();
                            v3 = var4_4;
                            if (var2_2 == null) break block17;
                            if (v3 == null) break block16;
                            v3 = var4_4;
                        }
                        v3.add(new od_1((DefaultMutableTreeNode)var8_8, pt_0.mixed, pt_0.unchecked));
                    }
                    if (var2_2 != null) continue;
                }
            }
            this.S(var5_5);
            this.o(var4_4);
        }
    }

    protected void I(List list) {
        Iterator iterator = list.iterator();
        String[] stringArray = cb_1.C();
        block0: while (true) {
            boolean bl = iterator.hasNext();
            block1: while (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)iterator.next();
                for (DefaultMutableTreeNode defaultMutableTreeNode2 : list) {
                    block6: {
                        block5: {
                            if (stringArray == null) break block5;
                            bl = this.E(defaultMutableTreeNode, defaultMutableTreeNode2);
                            if (stringArray == null) continue block1;
                            if (!bl) break block6;
                            iterator.remove();
                        }
                        if (stringArray != null) continue block0;
                    }
                    if (stringArray != null) continue;
                }
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    protected boolean E(DefaultMutableTreeNode defaultMutableTreeNode, DefaultMutableTreeNode defaultMutableTreeNode2) {
        DefaultMutableTreeNode defaultMutableTreeNode3;
        String[] stringArray = cb_1.C();
        TreeNode treeNode = defaultMutableTreeNode;
        if (stringArray != null) {
            if (treeNode == defaultMutableTreeNode2) {
                return false;
            }
            treeNode = defaultMutableTreeNode2;
        }
        if (stringArray != null) {
            if (treeNode == null) {
                return true;
            }
            treeNode = defaultMutableTreeNode3 = defaultMutableTreeNode.getParent();
        }
        while (defaultMutableTreeNode3 != null) {
            TreeNode treeNode2 = defaultMutableTreeNode3;
            if (stringArray != null) {
                if (treeNode2 == defaultMutableTreeNode2) {
                    return true;
                }
                treeNode2 = defaultMutableTreeNode3 = defaultMutableTreeNode3.getParent();
            }
            if (stringArray != null) continue;
        }
        return false;
    }

    protected void F() {
        this.b.repaint(this.b.getVisibleRect());
    }

    protected void S(List list) {
        this.b.t(list);
    }

    @Override
    public void J(nb_0 nb_02) {
        this.d.add(nb_02);
    }

    @Override
    public void e(nb_0 nb_02) {
        this.d.remove(nb_02);
    }

    public void o(List list) {
        block4: {
            List list2;
            String[] stringArray;
            block3: {
                stringArray = cb_1.C();
                list2 = list;
                if (stringArray == null) break block3;
                if (list2 == null) break block4;
                list2 = this.d;
            }
            for (nb_0 nb_02 : aL.J((Collection)list2)) {
                nb_02.f(list);
                if (stringArray != null) continue;
            }
        }
    }
}

