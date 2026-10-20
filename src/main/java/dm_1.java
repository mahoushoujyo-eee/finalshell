/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dM
 */
public abstract class dm_1
extends RowSorter {
    private boolean M;
    private OY[] z;
    private int[] L;
    private Comparator[] c;
    private boolean[] D;
    private RowSorter.SortKey[] n;
    private Comparator[] Z;
    private RowFilter e;
    private lj_0 A;
    private List u;
    private boolean[] g;
    private boolean U;
    private int q;
    private zP Y;
    private int f;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] h;

    public dm_1() {
        this.u = Collections.emptyList();
        this.q = dm_1.a(10542, 338652727483483887L);
    }

    protected final void y(zP zP2) {
        block21: {
            int n10;
            zP zP3;
            dm_1 dm_12;
            block19: {
                zP zP4;
                boolean bl;
                block17: {
                    block18: {
                        bl = uo_0.k();
                        try {
                            try {
                                zP4 = zP2;
                                if (!bl) break block17;
                                if (zP4 != null) break block18;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            throw new IllegalArgumentException(dm_1.a(-1475, 7303));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    zP4 = (zP)this.Y;
                }
                zP zP5 = zP4;
                try {
                    block20: {
                        try {
                            try {
                                dm_12 = this;
                                zP3 = zP2;
                                if (!bl) break block19;
                                dm_12.Y = zP3;
                                if (zP5 != null) {
                                }
                                break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            try {
                                this.modelStructureChanged();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (bl) break block21;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    dm_12 = this;
                    try {
                        zP3 = (zP)this.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            try {
                n10 = (Integer)zP3.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            dm_12.f = n10;
        }
    }

    protected final zP B() {
        return (zP)this.Y;
    }

    public final Object getModel() {
        Object object;
        Object object2;
        try {
            object2 = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return object;
    }

    public void K(int n10, boolean bl) {
        block15: {
            block13: {
                boolean[] blArray;
                block14: {
                    int n11;
                    Object object;
                    boolean bl2 = uo_0.i();
                    try {
                        this.x(n10);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    boolean bl3 = bl2;
                    try {
                        blArray = (boolean[])this.D;
                        if (bl3) break block13;
                        if (blArray == null) {
                        }
                        break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    try {
                        object = this.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n11 = (Integer)object.U();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.D = new boolean[n11];
                    for (int i2 = ((boolean[])this.D).length - 1; i2 >= 0; --i2) {
                        try {
                            ((boolean[])com.c.c((long)129299070682169446L).get((Object)this))[i2] = true;
                            if (!bl3) {
                                if (!bl3) continue;
                                break;
                            }
                            break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                }
                blArray = (boolean[])this.D;
            }
            blArray[n10] = bl;
        }
    }

    public boolean X(int n10) {
        boolean bl;
        block8: {
            boolean[] blArray;
            block6: {
                block7: {
                    boolean bl2 = uo_0.i();
                    try {
                        this.x(n10);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    boolean bl3 = bl2;
                    try {
                        try {
                            blArray = (boolean[])this.D;
                            if (bl3) break block6;
                            if (blArray != null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                blArray = (boolean[])this.D;
            }
            bl = blArray[n10];
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public void setSortKeys(List var1_1) {
        block53: {
            block52: {
                block51: {
                    block47: {
                        block46: {
                            block45: {
                                var3_2 = (List)this.u;
                                var2_3 = uo_0.k();
                                try {
                                    v0 = var1_1;
                                    if (!var2_3) break block45;
                                    if (v0 != null) {
                                    }
                                    ** GOTO lbl79
                                }
                                catch (IllegalArgumentException v1) {
                                    throw dm_1.a(v1);
                                }
                                v0 = var1_1;
                            }
                            try {
                                try {
                                    v2 = v0.size();
                                    if (!var2_3) break block46;
                                    if (v2 > 0) {
                                    }
                                    ** GOTO lbl79
                                }
                                catch (IllegalArgumentException v3) {
                                    throw dm_1.a(v3);
                                }
                                try {
                                    v4 = this.B();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                                try {
                                    v2 = (Integer)v4.U();
                                }
                                catch (InvocationTargetException v6) {
                                    throw v6.getTargetException();
                                }
                            }
                            catch (IllegalArgumentException v7) {
                                throw dm_1.a(v7);
                            }
                        }
                        var4_4 = v2;
                        for (RowSorter.SortKey var6_6 : var1_1) {
                            block50: {
                                block49: {
                                    block48: {
                                        try {
                                            try {
                                                if (!var2_3) break block47;
                                                v8 = var6_6;
                                                if (!var2_3) break block48;
                                            }
                                            catch (IllegalArgumentException v9) {
                                                throw dm_1.a(v9);
                                            }
                                            if (v8 != null) {
                                            }
                                            ** GOTO lbl68
                                        }
                                        catch (IllegalArgumentException v10) {
                                            throw dm_1.a(v10);
                                        }
                                        v8 = var6_6;
                                    }
                                    try {
                                        try {
                                            v11 = v8.getColumn();
                                            if (!var2_3) break block49;
                                            if (v11 >= 0) {
                                            }
                                            ** GOTO lbl68
                                        }
                                        catch (IllegalArgumentException v12) {
                                            throw dm_1.a(v12);
                                        }
                                        v11 = var6_6.getColumn();
                                    }
                                    catch (IllegalArgumentException v13) {
                                        throw dm_1.a(v13);
                                    }
                                }
                                try {
                                    if (v11 < var4_4) break block50;
lbl68:
                                    // 3 sources

                                    throw new IllegalArgumentException(dm_1.a(-1480, -4069));
                                }
                                catch (IllegalArgumentException v14) {
                                    throw dm_1.a(v14);
                                }
                            }
                            if (var2_3) continue;
                        }
                        this.u = Collections.unmodifiableList(new ArrayList<E>(var1_1));
                    }
                    try {
                        if (var2_3) break block51;
lbl79:
                        // 3 sources

                        this.u = Collections.emptyList();
                    }
                    catch (IllegalArgumentException v15) {
                        throw dm_1.a(v15);
                    }
                }
                try {
                    try {
                        v16 = this;
                        if (!var2_3) break block52;
                        if (((List)v16.u).equals(var3_2)) break block53;
                    }
                    catch (IllegalArgumentException v17) {
                        throw dm_1.a(v17);
                    }
                    this.fireSortOrderChanged();
                    v16 = this;
                }
                catch (IllegalArgumentException v18) {
                    throw dm_1.a(v18);
                }
            }
            try {
                block54: {
                    try {
                        try {
                            if (!var2_3) ** GOTO lbl122
                            if ((OY[])v16.z == null) {
                            }
                            break block54;
                        }
                        catch (IllegalArgumentException v19) {
                            throw dm_1.a(v19);
                        }
                        try {
                            this.X();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        if (var2_3) break block53;
                    }
                    catch (IllegalArgumentException v21) {
                        throw dm_1.a(v21);
                    }
                }
                v16 = this;
            }
            catch (IllegalArgumentException v22) {
                throw dm_1.a(v22);
            }
lbl122:
            // 2 sources

            try {
                v16.O();
            }
            catch (InvocationTargetException v23) {
                throw v23.getTargetException();
            }
        }
    }

    public List getSortKeys() {
        return (List)this.u;
    }

    public void j(int n10) {
        block4: {
            block5: {
                boolean bl = uo_0.k();
                try {
                    try {
                        if (!bl) break block4;
                        if (n10 >= 1) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(dm_1.a(-1478, -1138));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            this.q = n10;
        }
    }

    public int X() {
        return this.q;
    }

    public void m(boolean bl) {
        this.M = bl;
    }

    public boolean Y() {
        return this.M;
    }

    public void o(RowFilter rowFilter) {
        this.e = rowFilter;
        try {
            this.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public RowFilter K() {
        return (RowFilter)this.e;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void toggleSortOrder(int var1_1) {
        block40: {
            block39: {
                block38: {
                    block36: {
                        block35: {
                            block34: {
                                v0 = uo_0.i();
                                try {
                                    this.x(var1_1);
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                var2_2 = v0;
                                try {
                                    v2 = (Boolean)this.X(var1_1);
                                }
                                catch (InvocationTargetException v3) {
                                    throw v3.getTargetException();
                                }
                                if (!v2) break block40;
                                try {
                                    v4 = (List)this.getSortKeys();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                                var3_3 = new ArrayList<RowSorter.SortKey>(v4);
                                for (var5_4 = var3_3.size() - 1; var5_4 >= 0; --var5_4) {
                                    try {
                                        try {
                                            try {
                                                v6 = ((RowSorter.SortKey)var3_3.get(var5_4)).getColumn();
                                                v7 = var1_1;
                                                if (var2_2) break block34;
                                                if (v6 != v7) continue;
                                            }
                                            catch (IllegalArgumentException v8) {
                                                throw dm_1.a(v8);
                                            }
                                            if (!var2_2) break;
                                            continue;
                                        }
                                        catch (IllegalArgumentException v9) {
                                            throw dm_1.a(v9);
                                        }
                                    }
                                    catch (IllegalArgumentException v10) {
                                        throw dm_1.a(v10);
                                    }
                                }
                                try {
                                    v6 = var5_4;
                                    if (var2_2) break block35;
                                    v7 = -1;
                                }
                                catch (IllegalArgumentException v11) {
                                    throw dm_1.a(v11);
                                }
                            }
                            if (v6 != v7) ** GOTO lbl54
                            var4_5 = new RowSorter.SortKey(var1_1, SortOrder.ASCENDING);
                            try {
                                var3_3.add(0, var4_5);
                                if (!var2_2) break block36;
lbl54:
                                // 2 sources

                                v6 = var5_4;
                            }
                            catch (IllegalArgumentException v12) {
                                throw dm_1.a(v12);
                            }
                        }
                        try {
                            block37: {
                                try {
                                    if (v6 != 0) break block37;
                                    try {
                                        v13 = (RowSorter.SortKey)this.f((RowSorter.SortKey)var3_3.get(0));
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                    var3_3.set(0, v13);
                                    if (!var2_2) break block36;
                                }
                                catch (IllegalArgumentException v15) {
                                    throw dm_1.a(v15);
                                }
                            }
                            var3_3.remove(var5_4);
                            var3_3.add(0, new RowSorter.SortKey(var1_1, SortOrder.ASCENDING));
                        }
                        catch (IllegalArgumentException v16) {
                            throw dm_1.a(v16);
                        }
                    }
                    try {
                        try {
                            v17 /* !! */  = var3_3;
                            if (var2_2) break block38;
                            try {
                                v18 = (Integer)this.X();
                            }
                            catch (InvocationTargetException v19) {
                                throw v19.getTargetException();
                            }
                            if (v17 /* !! */ .size() > v18) {
                            }
                            break block39;
                        }
                        catch (IllegalArgumentException v20) {
                            throw dm_1.a(v20);
                        }
                        try {
                            v21 = (Integer)this.X();
                        }
                        catch (InvocationTargetException v22) {
                            throw v22.getTargetException();
                        }
                        v17 /* !! */  = var3_3.subList(0, v21);
                    }
                    catch (IllegalArgumentException v23) {
                        throw dm_1.a(v23);
                    }
                }
                var3_3 = v17 /* !! */ ;
            }
            try {
                this.setSortKeys(var3_3);
            }
            catch (InvocationTargetException v24) {
                throw v24.getTargetException();
            }
        }
    }

    protected RowSorter.SortKey f(RowSorter.SortKey sortKey) {
        RowSorter.SortKey sortKey2;
        block4: {
            block5: {
                boolean bl = uo_0.k();
                try {
                    try {
                        sortKey2 = sortKey;
                        if (!bl) break block4;
                        if (sortKey2.getSortOrder() != SortOrder.ASCENDING) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    return new RowSorter.SortKey(sortKey.getColumn(), SortOrder.DESCENDING);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            sortKey2 = new RowSorter.SortKey(sortKey.getColumn(), SortOrder.ASCENDING);
        }
        return sortKey2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int convertRowIndexToView(int n10) {
        int[] nArray;
        block14: {
            int n11;
            block16: {
                boolean bl;
                block15: {
                    bl = uo_0.k();
                    try {
                        try {
                            try {
                                nArray = (int[])this.L;
                                if (!bl) return nArray[n10];
                                if (nArray != null) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            n11 = n10;
                            if (!bl) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        if (n11 < 0) throw new IndexOutOfBoundsException(dm_1.a(-1473, 5550));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    n11 = n10;
                }
                try {
                    try {
                        int n12;
                        Object object;
                        if (!bl) return n11;
                        try {
                            object = this.B();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n12 = (Integer)object.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n11 < n12) break block16;
                        throw new IndexOutOfBoundsException(dm_1.a(-1473, 5550));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            n11 = n10;
            return n11;
        }
        nArray = (int[])this.L;
        return nArray[n10];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int convertRowIndexToModel(int n10) {
        OY[] oYArray;
        block14: {
            int n11;
            block16: {
                boolean bl;
                block15: {
                    bl = uo_0.k();
                    try {
                        try {
                            try {
                                oYArray = (OY[])this.z;
                                if (!bl) return oYArray[n10].t;
                                if (oYArray != null) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            n11 = n10;
                            if (!bl) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        if (n11 < 0) throw new IndexOutOfBoundsException(dm_1.a(-1474, -16390));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    n11 = n10;
                }
                try {
                    try {
                        int n12;
                        Object object;
                        if (!bl) return n11;
                        try {
                            object = this.B();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n12 = (Integer)object.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (n11 < n12) break block16;
                        throw new IndexOutOfBoundsException(dm_1.a(-1474, -16390));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            n11 = n10;
            return n11;
        }
        oYArray = (OY[])this.z;
        return oYArray[n10].t;
    }

    private boolean E() {
        boolean bl;
        block8: {
            block10: {
                List list;
                try {
                    list = (List)this.getSortKeys();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                List list2 = list;
                boolean bl2 = list2.size();
                boolean bl3 = uo_0.k();
                try {
                    block9: {
                        try {
                            try {
                                bl = bl2;
                                if (!bl3) break block8;
                                if (!bl) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            if (((RowSorter.SortKey)list2.get(0)).getSortOrder() != SortOrder.UNSORTED) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    bl = true;
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private void O() {
        block37: {
            block39: {
                block35: {
                    block36: {
                        try {
                            v0 = (int[])this.e((OY[])this.z);
                        }
                        catch (InvocationTargetException v1) {
                            throw v1.getTargetException();
                        }
                        var2_1 = v0;
                        var1_2 = uo_0.k();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            this.f();
                                        }
                                        catch (InvocationTargetException v2) {
                                            throw v2.getTargetException();
                                        }
                                        try {
                                            v3 = this.getSortKeys();
                                        }
                                        catch (InvocationTargetException v4) {
                                            throw v4.getTargetException();
                                        }
                                        try {
                                            this.r(v3);
                                        }
                                        catch (InvocationTargetException v5) {
                                            throw v5.getTargetException();
                                        }
                                        v6 = this;
                                        if (!var1_2) break block35;
                                        try {
                                            v7 = (Boolean)v6.E();
                                        }
                                        catch (InvocationTargetException v8) {
                                            throw v8.getTargetException();
                                        }
                                        if (v7) {
                                        }
                                        ** GOTO lbl95
                                    }
                                    catch (IllegalArgumentException v9) {
                                        throw dm_1.a(v9);
                                    }
                                    v10 = this;
                                    if (!var1_2) ** GOTO lbl64
                                }
                                catch (IllegalArgumentException v11) {
                                    throw dm_1.a(v11);
                                }
                                try {
                                    v12 = (RowFilter)v10.K();
                                }
                                catch (InvocationTargetException v13) {
                                    throw v13.getTargetException();
                                }
                                if (v12 == null) {
                                }
                                break block36;
                            }
                            catch (IllegalArgumentException v14) {
                                throw dm_1.a(v14);
                            }
                            this.z = null;
                            v10 = this;
                        }
                        catch (IllegalArgumentException v15) {
                            throw dm_1.a(v15);
                        }
lbl64:
                        // 2 sources

                        v10.L = null;
                        if (var1_2) break block39;
                    }
                    var3_3 = 0;
                    for (var4_4 = 0; var4_4 < ((int[])this.L).length; ++var4_4) {
                        block38: {
                            try {
                                try {
                                    try {
                                        v16 = this;
                                        if (!var1_2) break block37;
                                        v17 = (int[])v16.L;
                                        v18 = var4_4;
                                        if (!var1_2) break block38;
                                    }
                                    catch (IllegalArgumentException v19) {
                                        throw dm_1.a(v19);
                                    }
                                    if (v17[v18] == -1) continue;
                                }
                                catch (IllegalArgumentException v20) {
                                    throw dm_1.a(v20);
                                }
                                ((OY[])this.z)[var3_3].t = var4_4;
                                v17 = (int[])this.L;
                                v18 = var4_4;
                            }
                            catch (IllegalArgumentException v21) {
                                throw dm_1.a(v21);
                            }
                        }
                        v17[v18] = var3_3++;
                        if (var1_2) continue;
                    }
                    try {
                        if (var1_2) break block39;
lbl95:
                        // 2 sources

                        Arrays.sort((OY[])this.z);
                        v6 = this;
                    }
                    catch (IllegalArgumentException v22) {
                        throw dm_1.a(v22);
                    }
                }
                try {
                    v6.K(false);
                }
                catch (InvocationTargetException v23) {
                    throw v23.getTargetException();
                }
            }
            v16 = this;
        }
        v16.fireRowSorterChanged(var2_1);
    }

    /*
     * Unable to fully structure code
     */
    public void X() {
        block64: {
            block65: {
                block60: {
                    block61: {
                        block62: {
                            block63: {
                                v0 = uo_0.i();
                                this.U = true;
                                try {
                                    v1 = (int[])this.e((OY[])this.z);
                                }
                                catch (InvocationTargetException v2) {
                                    throw v2.getTargetException();
                                }
                                var2_1 = v1;
                                try {
                                    this.f();
                                }
                                catch (InvocationTargetException v3) {
                                    throw v3.getTargetException();
                                }
                                var1_2 = v0;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v4 = this;
                                                        if (var1_2) break block60;
                                                        try {
                                                            v5 = (Boolean)v4.E();
                                                        }
                                                        catch (InvocationTargetException v6) {
                                                            throw v6.getTargetException();
                                                        }
                                                        if (v5) {
                                                        }
                                                        ** GOTO lbl90
                                                    }
                                                    catch (IllegalArgumentException v7) {
                                                        throw dm_1.a(v7);
                                                    }
                                                    this.n = new RowSorter.SortKey[0];
                                                    v8 = this;
                                                    if (!var1_2) {
                                                    }
                                                    break block61;
                                                }
                                                catch (IllegalArgumentException v9) {
                                                    throw dm_1.a(v9);
                                                }
                                                try {
                                                    v10 = (RowFilter)v8.K();
                                                }
                                                catch (InvocationTargetException v11) {
                                                    throw v11.getTargetException();
                                                }
                                                if (v10 != null) break block62;
                                            }
                                            catch (IllegalArgumentException v12) {
                                                throw dm_1.a(v12);
                                            }
                                            v13 = this;
                                            if (var1_2) break block63;
                                        }
                                        catch (IllegalArgumentException v14) {
                                            throw dm_1.a(v14);
                                        }
                                        if ((OY[])v13.z != null) {
                                        }
                                        ** GOTO lbl74
                                    }
                                    catch (IllegalArgumentException v15) {
                                        throw dm_1.a(v15);
                                    }
                                    this.z = null;
                                    v13 = this;
                                }
                                catch (IllegalArgumentException v16) {
                                    throw dm_1.a(v16);
                                }
                            }
                            try {
                                v13.L = null;
                                if (!var1_2) break block64;
lbl74:
                                // 2 sources

                                return;
                            }
                            catch (IllegalArgumentException v17) {
                                throw dm_1.a(v17);
                            }
                        }
                        v8 = this;
                    }
                    try {
                        try {
                            v8.V();
                        }
                        catch (InvocationTargetException v18) {
                            throw v18.getTargetException();
                        }
                        if (!var1_2) break block64;
lbl90:
                        // 2 sources

                        try {
                            v19 = this.getSortKeys();
                        }
                        catch (InvocationTargetException v20) {
                            throw v20.getTargetException();
                        }
                        try {
                            this.r(v19);
                        }
                        catch (InvocationTargetException v21) {
                            throw v21.getTargetException();
                        }
                        v4 = this;
                    }
                    catch (IllegalArgumentException v22) {
                        throw dm_1.a(v22);
                    }
                }
                try {
                    try {
                        try {
                            if (var1_2) ** GOTO lbl151
                            try {
                                v23 = (RowFilter)v4.K();
                            }
                            catch (InvocationTargetException v24) {
                                throw v24.getTargetException();
                            }
                            if (v23 == null) ** GOTO lbl131
                        }
                        catch (IllegalArgumentException v25) {
                            throw dm_1.a(v25);
                        }
                        try {
                            this.V();
                        }
                        catch (InvocationTargetException v26) {
                            throw v26.getTargetException();
                        }
                        if (var1_2) {
                        }
                        break block65;
                    }
                    catch (IllegalArgumentException v27) {
                        throw dm_1.a(v27);
                    }
lbl131:
                    // 2 sources

                    try {
                        v28 = this.B();
                    }
                    catch (InvocationTargetException v29) {
                        throw v29.getTargetException();
                    }
                    try {
                        v30 = (Integer)v28.i();
                    }
                    catch (InvocationTargetException v31) {
                        throw v31.getTargetException();
                    }
                    try {
                        this.m(v30);
                    }
                    catch (InvocationTargetException v32) {
                        throw v32.getTargetException();
                    }
                    v4 = this;
                }
                catch (IllegalArgumentException v33) {
                    throw dm_1.a(v33);
                }
lbl151:
                // 2 sources

                try {
                    v34 = this.B();
                }
                catch (InvocationTargetException v35) {
                    throw v35.getTargetException();
                }
                try {
                    v36 = (Integer)v34.i();
                }
                catch (InvocationTargetException v37) {
                    throw v37.getTargetException();
                }
                try {
                    v4.L(v36);
                }
                catch (InvocationTargetException v38) {
                    throw v38.getTargetException();
                }
            }
            Arrays.sort((OY[])this.z);
            try {
                this.K(false);
            }
            catch (InvocationTargetException v39) {
                throw v39.getTargetException();
            }
        }
        this.fireRowSorterChanged(var2_1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f() {
        boolean bl;
        int n10;
        block17: {
            dm_1 dm_12;
            block15: {
                int n11;
                Object object;
                try {
                    object = this.B();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    n11 = (Integer)object.U();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = n11;
                bl = uo_0.k();
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    dm_12 = this;
                                    if (!bl) break block15;
                                    if ((boolean[])dm_12.g == null) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                                dm_12 = this;
                                if (!bl) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            if (((boolean[])dm_12.g).length == n10) break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    dm_12 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            dm_12.g = new boolean[n10];
        }
        --n10;
        while (n10 >= 0) {
            boolean bl2;
            try {
                bl2 = (Boolean)this.f(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((boolean[])com.c.c((long)270779122022644518L).get((Object)this))[n10] = bl2;
            --n10;
            if (bl) continue;
        }
    }

    private void V() {
        int n10;
        int n11;
        boolean bl;
        int n12;
        block25: {
            int n13;
            int n14;
            Object object;
            try {
                object = this.B();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                n14 = (Integer)object.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            n12 = n14;
            bl = uo_0.k();
            int n15 = 0;
            try {
                this.m(n12);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            for (n11 = 0; n11 < n12; ++n11) {
                block24: {
                    try {
                        dm_1 dm_12;
                        block26: {
                            try {
                                try {
                                    try {
                                        dm_12 = this;
                                        if (!bl) break block24;
                                        try {
                                            n13 = ((Boolean)dm_12.g(n11)).booleanValue();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (!bl) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw dm_1.a(illegalArgumentException);
                                    }
                                    if (n13 == 0) break block26;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                                ((int[])com.c.c((long)487785452946359037L).get((Object)this))[n11] = n11 - n15;
                                if (bl) continue;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                        }
                        dm_12 = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                ((int[])com.c.c((long)487785452946359037L).get((Object)dm_12))[n11] = -1;
                ++n15;
                if (bl) continue;
            }
            try {
                this.L(n12 - n15);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            n11 = 0;
            n13 = n10 = 0;
        }
        while (n11 < n12) {
            block28: {
                dm_1 dm_13;
                block27: {
                    try {
                        try {
                            dm_13 = this;
                            if (!bl) break block27;
                            if (((int[])dm_13.L)[n11] == -1) break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        dm_13 = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                int n15 = n10++;
                ((OY[])dm_13.z)[n15].t = n11;
            }
            ++n11;
            if (bl) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void m(int n10) {
        block10: {
            dm_1 dm_12;
            block8: {
                boolean bl = uo_0.i();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    dm_12 = this;
                                    if (bl) break block8;
                                    if ((int[])dm_12.L == null) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                                dm_12 = this;
                                if (bl) break block8;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            if (((int[])dm_12.L).length == n10) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    dm_12 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            dm_12.L = new int[n10];
        }
    }

    /*
     * Unable to fully structure code
     */
    private void L(int var1_1) {
        block19: {
            block17: {
                block18: {
                    block16: {
                        var3_2 = 0;
                        var2_3 = uo_0.i();
                        try {
                            v0 = this;
                            if (var2_3) break block16;
                            if ((OY[])v0.z != null) {
                            }
                            ** GOTO lbl25
                        }
                        catch (IllegalArgumentException v1) {
                            throw dm_1.a(v1);
                        }
                        var3_2 = Math.min(var1_1, ((OY[])this.z).length);
                        try {
                            v2 = ((OY[])this.z).length;
                            if (var2_3) break block17;
                            if (v2 == var1_1) break block18;
                        }
                        catch (IllegalArgumentException v3) {
                            throw dm_1.a(v3);
                        }
                        var4_4 = (OY[])this.z;
                        try {
                            this.z = new OY[var1_1];
                            System.arraycopy(var4_4, 0, (OY[])this.z, 0, var3_2);
                            if (!var2_3) break block18;
lbl25:
                            // 2 sources

                            v0 = this;
                        }
                        catch (IllegalArgumentException v4) {
                            throw dm_1.a(v4);
                        }
                    }
                    v0.z = new OY[var1_1];
                }
                v2 = var4_5 = 0;
            }
            while (var4_5 < var3_2) {
                try {
                    ((OY[])this.z)[var4_5].t = var4_5;
                    ++var4_5;
                    if (!var2_3) {
                        if (!var2_3) continue;
                        break;
                    }
                    break block19;
                }
                catch (IllegalArgumentException v5) {
                    throw dm_1.a(v5);
                }
            }
            var4_5 = var3_2;
        }
        try {
            while (var4_5 < var1_1) {
                ((OY[])com.c.c((long)278246634133162629L).get((Object)this))[var4_5] = new OY(this, var4_5);
                ++var4_5;
                if (!var2_3) continue;
                break;
            }
        }
        catch (IllegalArgumentException v6) {
            throw dm_1.a(v6);
        }
    }

    private void r(List list) {
        block6: {
            int n10 = list.size();
            this.Z = new Comparator[n10];
            boolean bl = uo_0.i();
            for (int i2 = 0; i2 < n10; ++i2) {
                try {
                    Comparator comparator;
                    try {
                        comparator = (Comparator)this.G(((RowSorter.SortKey)list.get(i2)).getColumn());
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((Comparator[])com.c.c((long)487108138525437099L).get((Object)this))[i2] = comparator;
                    if (!bl) {
                        if (!bl) continue;
                        break;
                    }
                    break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            this.n = list.toArray(new RowSorter.SortKey[n10]);
        }
    }

    protected boolean f(int n10) {
        boolean bl;
        try {
            Comparator comparator;
            try {
                comparator = (Comparator)this.Z(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            bl = comparator == null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
        return bl;
    }

    private void K(boolean n10) {
        int n11;
        boolean bl;
        block11: {
            int n12;
            block9: {
                block10: {
                    bl = uo_0.k();
                    try {
                        n12 = n10;
                        if (!bl) break block9;
                        if (n12 == 0) break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    for (n11 = ((int[])this.L).length - 1; n11 >= 0; --n11) {
                        try {
                            ((int[])com.c.c((long)487785452946359037L).get((Object)this))[n11] = -1;
                            if (bl) {
                                if (bl) continue;
                                break;
                            }
                            break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                }
                n12 = ((OY[])this.z).length - 1;
            }
            n11 = n12;
        }
        try {
            while (n11 >= 0) {
                ((int[])com.c.c((long)487785452946359037L).get((Object)this))[com.c.c((long)198606278652726872L).getInt((Object)((OY[])com.c.c((long)278246634133162629L).get((Object)this))[n11])] = n11;
                --n11;
                if (bl) continue;
                break;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
    }

    private int[] e(OY[] oYArray) {
        block7: {
            int[] nArray;
            block8: {
                OY[] oYArray2;
                boolean bl;
                block6: {
                    bl = uo_0.k();
                    try {
                        oYArray2 = oYArray;
                        if (!bl) break block6;
                        if (oYArray2 == null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    oYArray2 = oYArray;
                }
                int[] nArray2 = new int[oYArray2.length];
                for (int i2 = oYArray.length - 1; i2 >= 0; --i2) {
                    try {
                        nArray = nArray2;
                        if (bl) {
                            nArray[i2] = oYArray[i2].t;
                            if (bl) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                nArray = nArray2;
            }
            return nArray;
        }
        return new int[0];
    }

    public void X(int n10, Comparator comparator) {
        block11: {
            Comparator[] comparatorArray;
            block12: {
                boolean bl = uo_0.i();
                try {
                    this.x(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                boolean bl2 = bl;
                try {
                    int n11;
                    Object object;
                    try {
                        comparatorArray = (Comparator[])this.c;
                        if (bl2) break block11;
                        if (comparatorArray == null) {
                        }
                        break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    try {
                        object = this.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n11 = (Integer)object.U();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.c = new Comparator[n11];
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            comparatorArray = (Comparator[])this.c;
        }
        comparatorArray[n10] = comparator;
    }

    public Comparator Z(int n10) {
        block7: {
            Comparator[] comparatorArray;
            block6: {
                boolean bl = uo_0.k();
                try {
                    this.x(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                boolean bl2 = bl;
                try {
                    try {
                        comparatorArray = (Comparator[])this.c;
                        if (!bl2) break block6;
                        if (comparatorArray == null) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    comparatorArray = (Comparator[])this.c;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            return comparatorArray[n10];
        }
        return null;
    }

    private Comparator G(int n10) {
        block5: {
            Comparator comparator;
            block4: {
                Comparator comparator2;
                try {
                    comparator2 = (Comparator)this.Z(n10);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                Comparator comparator3 = comparator2;
                boolean bl = uo_0.k();
                try {
                    comparator = comparator3;
                    if (!bl) break block4;
                    if (comparator == null) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
                comparator = comparator3;
            }
            return comparator;
        }
        return Collator.getInstance();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private RowFilter.Entry p(int n10) {
        lj_0 lj_02;
        block4: {
            block5: {
                boolean bl = uo_0.i();
                try {
                    try {
                        lj_02 = (lj_0)this.A;
                        if (bl) break block4;
                        if (lj_02 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    this.A = new lj_0(this, null);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            this.A.h = n10;
            lj_02 = (lj_0)this.A;
        }
        return lj_02;
    }

    @Override
    public int getViewRowCount() {
        int n10;
        Object object;
        dm_1 dm_12;
        block8: {
            block9: {
                boolean bl = uo_0.k();
                try {
                    try {
                        dm_12 = this;
                        if (!bl) break block8;
                        if ((OY[])dm_12.z == null) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    return ((OY[])this.z).length;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            dm_12 = this;
        }
        try {
            object = dm_12.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    @Override
    public int getModelRowCount() {
        int n10;
        Object object;
        try {
            object = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void F() {
        dm_1 dm_12;
        block12: {
            this.L = null;
            this.z = null;
            boolean bl = uo_0.k();
            this.c = null;
            boolean bl2 = bl;
            try {
                block13: {
                    try {
                        try {
                            boolean bl3;
                            this.D = null;
                            dm_12 = this;
                            if (!bl2) break block12;
                            try {
                                bl3 = (Boolean)dm_12.E();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl3) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        try {
                            this.X();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl2) return;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                dm_12 = this;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw dm_1.a(illegalArgumentException);
            }
        }
        try {
            dm_12.setSortKeys(null);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void modelStructureChanged() {
        int n10;
        Object object;
        try {
            this.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.f = n10;
    }

    @Override
    public void allRowsChanged() {
        int n10;
        Object object;
        try {
            object = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.f = n10;
        try {
            this.X();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void rowsInserted(int n10, int n11) {
        block22: {
            int n12;
            int n13;
            dm_1 dm_12;
            block21: {
                int n14;
                block19: {
                    boolean bl;
                    int n15;
                    block20: {
                        int n16;
                        Object object;
                        try {
                            this.j(n10, n11);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object = this.B();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n16 = (Integer)object.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        n15 = n16;
                        bl = uo_0.i();
                        try {
                            try {
                                n14 = n11;
                                if (bl) break block19;
                                if (n14 < n15) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            throw new IndexOutOfBoundsException(dm_1.a(-1476, 26946));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        this.f = n15;
                        dm_12 = this;
                        n13 = n10;
                        n12 = n11;
                        if (bl) break block21;
                        try {
                            n14 = ((Boolean)dm_12.j(n13, n12)).booleanValue() ? 1 : 0;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                try {
                    if (n14 != 0) {
                        dm_12 = this;
                        n13 = n10;
                        n12 = n11;
                    }
                    break block22;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            try {
                dm_12.P(n13, n12);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void rowsDeleted(int n10, int n11) {
        int n12;
        int n13;
        dm_1 dm_12;
        block25: {
            int n14;
            block24: {
                int n15;
                boolean bl;
                block23: {
                    boolean bl2 = uo_0.k();
                    try {
                        this.j(n10, n11);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    bl = bl2;
                    try {
                        try {
                            try {
                                n14 = n10;
                                n15 = this.f;
                                if (!bl) break block23;
                                if (n14 >= n15) throw new IndexOutOfBoundsException(dm_1.a(-1476, 26946));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            n14 = n11;
                            if (!bl) break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        n15 = this.f;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                try {
                    if (n14 >= n15) {
                        throw new IndexOutOfBoundsException(dm_1.a(-1476, 26946));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
                try {
                    int n16;
                    Object object;
                    try {
                        object = this.B();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        n16 = (Integer)object.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.f = n16;
                    dm_12 = this;
                    n13 = n10;
                    n12 = n11;
                    if (!bl) break block25;
                    try {
                        n14 = ((Boolean)dm_12.j(n13, n12)).booleanValue() ? 1 : 0;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            try {
                if (n14 == 0) return;
                dm_12 = this;
                n13 = n10;
                n12 = n11;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw dm_1.a(illegalArgumentException);
            }
        }
        try {
            dm_12.I(n13, n12);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void rowsUpdated(int var1_1, int var2_2) {
        block38: {
            block36: {
                block37: {
                    block34: {
                        block35: {
                            block33: {
                                v0 = uo_0.i();
                                try {
                                    this.j(var1_1, var2_2);
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                var3_3 = v0;
                                try {
                                    try {
                                        try {
                                            v2 = var1_1;
                                            v3 = this.f;
                                            if (var3_3) break block33;
                                            if (v2 < v3) {
                                            }
                                            ** GOTO lbl33
                                        }
                                        catch (IllegalArgumentException v4) {
                                            throw dm_1.a(v4);
                                        }
                                        v2 = var2_2;
                                        if (var3_3) break block34;
                                    }
                                    catch (IllegalArgumentException v5) {
                                        throw dm_1.a(v5);
                                    }
                                    v3 = this.f;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw dm_1.a(v6);
                                }
                            }
                            try {
                                if (v2 < v3) break block35;
lbl33:
                                // 2 sources

                                throw new IndexOutOfBoundsException(dm_1.a(-1476, 26946));
                            }
                            catch (IllegalArgumentException v7) {
                                throw dm_1.a(v7);
                            }
                        }
                        try {
                            v8 = this;
                            if (var3_3) break block36;
                            try {
                                v2 = (int)((Boolean)v8.Y()).booleanValue();
                            }
                            catch (InvocationTargetException v9) {
                                throw v9.getTargetException();
                            }
                        }
                        catch (IllegalArgumentException v10) {
                            throw dm_1.a(v10);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v2 != 0) {
                                    v11 = this;
                                    v12 = var1_1;
                                    v13 = var2_2;
                                    if (!var3_3) {
                                    }
                                    break block37;
                                }
                                ** GOTO lbl87
                            }
                            catch (IllegalArgumentException v14) {
                                throw dm_1.a(v14);
                            }
                            try {
                                v15 = (Boolean)v11.j(v12, v13);
                            }
                            catch (InvocationTargetException v16) {
                                throw v16.getTargetException();
                            }
                            if (!v15) break block38;
                        }
                        catch (IllegalArgumentException v17) {
                            throw dm_1.a(v17);
                        }
                        v11 = this;
                        v12 = var1_1;
                        v13 = var2_2;
                    }
                    catch (IllegalArgumentException v18) {
                        throw dm_1.a(v18);
                    }
                }
                try {
                    try {
                        v11.K(v12, v13);
                    }
                    catch (InvocationTargetException v19) {
                        throw v19.getTargetException();
                    }
                    if (!var3_3) break block38;
lbl87:
                    // 2 sources

                    v8 = this;
                }
                catch (IllegalArgumentException v20) {
                    throw dm_1.a(v20);
                }
            }
            v8.U = false;
        }
    }

    @Override
    public void rowsUpdated(int n10, int n11, int n12) {
        try {
            this.x(n12);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.rowsUpdated(n10, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void j(int n10, int n11) {
        int n12;
        block12: {
            boolean bl;
            block11: {
                block10: {
                    bl = uo_0.i();
                    try {
                        try {
                            n12 = n10;
                            if (bl) break block10;
                            if (n12 > n11) throw new IndexOutOfBoundsException(dm_1.a(-1479, -12560));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        n12 = n10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                try {
                    if (bl) break block11;
                    if (n12 < 0) throw new IndexOutOfBoundsException(dm_1.a(-1479, -12560));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
                n12 = n11;
            }
            try {
                if (bl) break block12;
                if (n12 < 0) throw new IndexOutOfBoundsException(dm_1.a(-1479, -12560));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw dm_1.a(illegalArgumentException);
            }
            n12 = n10;
        }
        try {
            if (n12 <= this.f) return;
            throw new IndexOutOfBoundsException(dm_1.a(-1479, -12560));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
    }

    private boolean g(int n10) {
        block7: {
            RowFilter.Entry entry;
            RowFilter rowFilter;
            block6: {
                RowFilter rowFilter2;
                try {
                    rowFilter2 = (RowFilter)this.K();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                RowFilter rowFilter3 = rowFilter2;
                boolean bl = uo_0.i();
                try {
                    rowFilter = rowFilter3;
                    if (bl) break block6;
                    if (rowFilter == null) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
                rowFilter = rowFilter3;
            }
            try {
                entry = (RowFilter.Entry)this.p(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            return rowFilter.include(entry);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int e(int var1_1, int var2_2) {
        block40: {
            var3_4 = uo_0.k();
            for (var9_3 = 0; var9_3 < ((RowSorter.SortKey[])this.n).length; ++var9_3) {
                block47: {
                    block41: {
                        block46: {
                            block48: {
                                block44: {
                                    block45: {
                                        block43: {
                                            block42: {
                                                v0 = ((RowSorter.SortKey[])this.n)[var9_3].getColumn();
                                                if (!var3_4) break block40;
                                                var4_5 = v0;
                                                var5_6 = ((RowSorter.SortKey[])this.n)[var9_3].getSortOrder();
                                                if (var5_6 != SortOrder.UNSORTED) ** GOTO lbl12
                                                var8_9 = var1_1 - var2_2;
                                                try {
                                                    try {
                                                        if (var3_4) break block41;
lbl12:
                                                        // 2 sources

                                                        v1 /* !! */  = (boolean[])this.g;
                                                        if (!var3_4) break block42;
                                                    }
                                                    catch (IllegalArgumentException v2) {
                                                        throw dm_1.a(v2);
                                                    }
                                                    if (v1 /* !! */ [var4_5]) {
                                                    }
                                                    ** GOTO lbl48
                                                }
                                                catch (IllegalArgumentException v3) {
                                                    throw dm_1.a(v3);
                                                }
                                                try {
                                                    v4 = this.B();
                                                }
                                                catch (InvocationTargetException v5) {
                                                    throw v5.getTargetException();
                                                }
                                                try {
                                                    v6 = (String)v4.L(var1_1, var4_5);
                                                }
                                                catch (InvocationTargetException v7) {
                                                    throw v7.getTargetException();
                                                }
                                                var6_7 /* !! */  = (boolean[])v6;
                                                try {
                                                    v8 = this.B();
                                                }
                                                catch (InvocationTargetException v9) {
                                                    throw v9.getTargetException();
                                                }
                                                try {
                                                    v10 = (String)v8.L(var2_2, var4_5);
                                                }
                                                catch (InvocationTargetException v11) {
                                                    throw v11.getTargetException();
                                                }
                                                var7_8 = v10;
                                                try {
                                                    if (var3_4) break block43;
lbl48:
                                                    // 2 sources

                                                    try {
                                                        v12 = this.B();
                                                    }
                                                    catch (InvocationTargetException v13) {
                                                        throw v13.getTargetException();
                                                    }
                                                    try {
                                                        v1 /* !! */  = (boolean[])v12.o(var1_1, var4_5);
                                                    }
                                                    catch (InvocationTargetException v14) {
                                                        throw v14.getTargetException();
                                                    }
                                                }
                                                catch (IllegalArgumentException v15) {
                                                    throw dm_1.a(v15);
                                                }
                                            }
                                            var6_7 /* !! */  = v1 /* !! */ ;
                                            try {
                                                v16 = this.B();
                                            }
                                            catch (InvocationTargetException v17) {
                                                throw v17.getTargetException();
                                            }
                                            try {
                                                v18 = v16.o(var2_2, var4_5);
                                            }
                                            catch (InvocationTargetException v19) {
                                                throw v19.getTargetException();
                                            }
                                            var7_8 = v18;
                                        }
                                        try {
                                            try {
                                                v20 /* !! */  = var6_7 /* !! */ ;
                                                if (!var3_4) break block44;
                                                if (v20 /* !! */  == null) {
                                                }
                                                ** GOTO lbl94
                                            }
                                            catch (IllegalArgumentException v21) {
                                                throw dm_1.a(v21);
                                            }
                                            if (var7_8 != null) break block45;
                                        }
                                        catch (IllegalArgumentException v22) {
                                            throw dm_1.a(v22);
                                        }
                                        var8_9 = 0;
                                        if (var3_4) break block46;
                                    }
                                    var8_9 = -1;
                                    try {
                                        if (var3_4) break block46;
lbl94:
                                        // 2 sources

                                        v20 /* !! */  = (boolean[])var7_8;
                                    }
                                    catch (IllegalArgumentException v23) {
                                        throw dm_1.a(v23);
                                    }
                                }
                                if (v20 /* !! */  != null) break block48;
                                var8_9 = 1;
                                if (var3_4) break block46;
                            }
                            var8_9 = ((Comparator[])this.Z)[var9_3].compare(var6_7 /* !! */ , var7_8);
                        }
                        if (var5_6 == SortOrder.DESCENDING) {
                            var8_9 *= -1;
                        }
                    }
                    try {
                        v24 = var8_9;
                        if (!var3_4) break block47;
                        if (v24 == 0) continue;
                    }
                    catch (IllegalArgumentException v25) {
                        throw dm_1.a(v25);
                    }
                    v24 = var8_9;
                }
                return v24;
            }
            v0 = var1_1 - var2_2;
        }
        return v0;
    }

    private boolean G() {
        boolean bl;
        try {
            bl = (OY[])this.z != null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
        return bl;
    }

    private void L(List list, OY[] oYArray) {
        block5: {
            int n10 = 0;
            int n11 = list.size();
            boolean bl = uo_0.i();
            for (int i2 = 0; i2 < n11; ++i2) {
                int n12;
                block6: {
                    int n13;
                    block7: {
                        n13 = Arrays.binarySearch(oYArray, list.get(i2));
                        try {
                            try {
                                if (bl) break block5;
                                n12 = n13;
                                if (bl) break block6;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            if (n12 >= 0) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        n13 = -1 - n13;
                    }
                    System.arraycopy(oYArray, n10, (OY[])this.z, n10 + i2, n13 - n10);
                    ((OY[])com.c.c((long)278246634133162629L).get((Object)this))[n13 + i2] = (OY)list.get(i2);
                    n12 = n13;
                }
                n10 = n12;
                if (!bl) continue;
            }
            System.arraycopy(oYArray, n10, (OY[])this.z, n10 + n11, oYArray.length - n10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean j(int n10, int n11) {
        boolean bl;
        boolean bl2;
        block17: {
            bl2 = uo_0.i();
            try {
                try {
                    try {
                        bl = (Boolean)this.G();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl2) break block17;
                    if (!bl) {
                        return false;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw dm_1.a(illegalArgumentException);
            }
            bl = this.U;
        }
        try {
            block19: {
                try {
                    int n12;
                    try {
                        try {
                            if (bl2) return bl;
                            if (!bl) break block19;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                        n12 = n11 - n10;
                        if (bl2) return n12 != 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                    if (n12 <= ((OY[])this.z).length / dm_1.a(11202, 5414555227380794368L)) return 1 != 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw dm_1.a(illegalArgumentException);
                }
            }
            try {
                this.X();
                return false;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
    }

    private void P(int n10, int n11) {
        int n12;
        Object object;
        int[] nArray;
        block36: {
            ArrayList<OY> arrayList;
            ArrayList<OY> arrayList2;
            block35: {
                int n13;
                block33: {
                    int n14;
                    int n15;
                    boolean bl;
                    block31: {
                        int n16;
                        int[] nArray2;
                        try {
                            nArray2 = (int[])this.e((OY[])this.z);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        nArray = nArray2;
                        bl = uo_0.i();
                        n15 = n11 - n10 + 1;
                        arrayList2 = new ArrayList<OY>(n15);
                        for (n14 = n10; n14 <= n11; ++n14) {
                            try {
                                try {
                                    try {
                                        try {
                                            n16 = ((Boolean)this.g(n14)).booleanValue() ? 1 : 0;
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        if (bl) break block31;
                                        if (bl) continue;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw dm_1.a(illegalArgumentException);
                                    }
                                    if (n16 == 0) continue;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                                arrayList2.add(new OY(this, n14));
                                continue;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                        }
                        n16 = n14 = ((int[])this.L).length - 1;
                    }
                    while (n14 >= n10) {
                        block32: {
                            block34: {
                                int n17 = ((int[])this.L)[n14];
                                try {
                                    try {
                                        try {
                                            if (bl) break block32;
                                            n13 = n17;
                                            if (bl) break block33;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw dm_1.a(illegalArgumentException);
                                        }
                                        if (n13 == -1) break block34;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw dm_1.a(illegalArgumentException);
                                    }
                                    OY oY = ((OY[])this.z)[n17];
                                    oY.t = oY.t + n15;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                            }
                            --n14;
                        }
                        if (!bl) continue;
                    }
                    try {
                        arrayList = arrayList2;
                        if (bl) break block35;
                        n13 = arrayList.size();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw dm_1.a(illegalArgumentException);
                    }
                }
                if (n13 <= 0) break block36;
                arrayList = arrayList2;
            }
            Collections.sort(arrayList);
            OY[] oYArray = (OY[])this.z;
            this.z = new OY[((OY[])this.z).length + arrayList2.size()];
            try {
                this.L(arrayList2, (Object)oYArray);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        try {
            object = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n12 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.m(n12);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.K(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.fireRowSorterChanged(nArray);
    }

    private void I(int n10, int n11) {
        int n12;
        Object object;
        int[] nArray;
        block42: {
            int n13;
            OY[] oYArray;
            int n14;
            int n15;
            OY[] oYArray2;
            block43: {
                int n16;
                boolean bl;
                int n17;
                block41: {
                    int n18;
                    int n19;
                    block39: {
                        int n20;
                        int n21;
                        int n22;
                        int n23;
                        block36: {
                            int[] nArray2;
                            try {
                                nArray2 = (int[])this.e((OY[])this.z);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            nArray = nArray2;
                            n23 = 0;
                            n17 = n10;
                            bl = uo_0.k();
                            while (n17 <= n11) {
                                block35: {
                                    block37: {
                                        n22 = ((int[])this.L)[n17];
                                        try {
                                            try {
                                                try {
                                                    if (!bl) break block35;
                                                    n21 = n22;
                                                    n20 = -1;
                                                    if (!bl) break block36;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw dm_1.a(illegalArgumentException);
                                                }
                                                if (n21 == n20) break block37;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw dm_1.a(illegalArgumentException);
                                            }
                                            ++n23;
                                            ((OY[])com.c.c((long)278246634133162629L).get((Object)this))[n22] = null;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw dm_1.a(illegalArgumentException);
                                        }
                                    }
                                    ++n17;
                                }
                                if (bl) continue;
                            }
                            n21 = n11 - n10;
                            n20 = 1;
                        }
                        int n24 = n21 + n20;
                        n17 = ((int[])this.L).length - 1;
                        while (n17 > n11) {
                            block38: {
                                block40: {
                                    n22 = ((int[])this.L)[n17];
                                    try {
                                        try {
                                            try {
                                                if (!bl) break block38;
                                                n19 = n22;
                                                n18 = -1;
                                                if (!bl) break block39;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw dm_1.a(illegalArgumentException);
                                            }
                                            if (n19 == n18) break block40;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw dm_1.a(illegalArgumentException);
                                        }
                                        OY oY = ((OY[])this.z)[n22];
                                        oY.t = oY.t - n24;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw dm_1.a(illegalArgumentException);
                                    }
                                }
                                --n17;
                            }
                            if (bl) continue;
                        }
                        try {
                            try {
                                n16 = n23;
                                if (!bl) break block41;
                                if (n16 <= 0) break block42;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            n19 = ((OY[])this.z).length;
                            n18 = n23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    n16 = n19 - n18;
                }
                oYArray2 = new OY[n16];
                n15 = 0;
                n14 = 0;
                for (n17 = 0; n17 < ((OY[])this.z).length; ++n17) {
                    int n25;
                    OY[] oYArray3;
                    block44: {
                        try {
                            try {
                                try {
                                    oYArray = (OY[])this.z;
                                    n13 = n17;
                                    if (!bl) break block43;
                                    if (!bl) break block44;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw dm_1.a(illegalArgumentException);
                                }
                                if (oYArray[n13] != null) continue;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw dm_1.a(illegalArgumentException);
                            }
                            oYArray3 = (OY[])this.z;
                            n25 = n14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw dm_1.a(illegalArgumentException);
                        }
                    }
                    System.arraycopy(oYArray3, n25, oYArray2, n15, n17 - n14);
                    n15 += n17 - n14;
                    n14 = n17 + 1;
                    if (bl) continue;
                }
                oYArray = (OY[])this.z;
                n13 = n14;
            }
            System.arraycopy(oYArray, n13, oYArray2, n15, ((OY[])this.z).length - n14);
            this.z = oYArray2;
        }
        try {
            object = this.B();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n12 = (Integer)object.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.m(n12);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.K(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.fireRowSorterChanged(nArray);
    }

    /*
     * Unable to fully structure code
     */
    private void K(int var1_1, int var2_2) {
        block71: {
            block68: {
                block63: {
                    block70: {
                        block60: {
                            block59: {
                                try {
                                    v0 = (int[])this.e((OY[])this.z);
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                var4_3 = v0;
                                var7_4 = var2_2 - var1_1 + 1;
                                var3_5 = uo_0.i();
                                try {
                                    v2 = (RowFilter)this.K();
                                }
                                catch (InvocationTargetException v3) {
                                    throw v3.getTargetException();
                                }
                                if (v2 != null) break block70;
                                var11_6 = new OY[var7_4];
                                var6_7 = 0;
                                var5_8 = var1_1;
                                while (var5_8 <= var2_2) {
                                    try {
                                        var11_6[var6_7] = ((OY[])this.z)[((int[])this.L)[var5_8]];
                                        ++var5_8;
                                        ++var6_7;
                                        if (!var3_5) {
                                            if (!var3_5) continue;
                                            break;
                                        }
                                        break block59;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw dm_1.a(v4);
                                    }
                                }
                                Arrays.sort(var11_6);
                            }
                            var12_9 = new OY[((OY[])this.z).length - var7_4];
                            var6_7 = 0;
                            for (var5_8 = 0; var5_8 < ((OY[])this.z).length; ++var5_8) {
                                block61: {
                                    var8_11 = ((OY[])this.z)[var5_8].t;
                                    try {
                                        try {
                                            try {
                                                if (var3_5) break block60;
                                                v5 = var8_11;
                                                v6 = var1_1;
                                                if (var3_5) break block61;
                                            }
                                            catch (IllegalArgumentException v7) {
                                                throw dm_1.a(v7);
                                            }
                                            if (v5 >= v6) {
                                            }
                                            ** GOTO lbl60
                                        }
                                        catch (IllegalArgumentException v8) {
                                            throw dm_1.a(v8);
                                        }
                                        v5 = var8_11;
                                        v6 = var2_2;
                                    }
                                    catch (IllegalArgumentException v9) {
                                        throw dm_1.a(v9);
                                    }
                                }
                                try {
                                    if (v5 <= v6) continue;
lbl60:
                                    // 2 sources

                                    var12_9[var6_7++] = ((OY[])this.z)[var5_8];
                                    continue;
                                }
                                catch (IllegalArgumentException v10) {
                                    throw dm_1.a(v10);
                                }
                            }
                            try {
                                this.L(Arrays.asList(var11_6), (Object)var12_9);
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            try {
                                this.K(false);
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                        }
                        if (!var3_5) break block71;
                    }
                    var11_6 = new ArrayList<E>(var7_4);
                    var12_10 = 0;
                    var13_12 = 0;
                    var14_13 = 0;
                    for (var5_8 = var1_1; var5_8 <= var2_2; ++var5_8) {
                        block65: {
                            block62: {
                                block64: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v13 = ((int[])this.L)[var5_8];
                                                        if (var3_5) break block62;
                                                        v14 = -1;
                                                        if (var3_5) break block63;
                                                    }
                                                    catch (IllegalArgumentException v15) {
                                                        throw dm_1.a(v15);
                                                    }
                                                    if (v13 == v14) {
                                                    }
                                                    ** GOTO lbl124
                                                }
                                                catch (IllegalArgumentException v16) {
                                                    throw dm_1.a(v16);
                                                }
                                                try {
                                                    v17 = (Boolean)this.g(var5_8);
                                                }
                                                catch (InvocationTargetException v18) {
                                                    throw v18.getTargetException();
                                                }
                                                if (var3_5) break block64;
                                            }
                                            catch (IllegalArgumentException v19) {
                                                throw dm_1.a(v19);
                                            }
                                            if (!v17) continue;
                                        }
                                        catch (IllegalArgumentException v20) {
                                            throw dm_1.a(v20);
                                        }
                                        v17 = var11_6.add(new OY(this, var5_8));
                                    }
                                    catch (IllegalArgumentException v21) {
                                        throw dm_1.a(v21);
                                    }
                                }
                                try {
                                    ++var12_10;
                                    if (!var3_5) continue;
lbl124:
                                    // 2 sources

                                    try {
                                        v13 = (int)((Boolean)this.g(var5_8)).booleanValue();
                                    }
                                    catch (InvocationTargetException v22) {
                                        throw v22.getTargetException();
                                    }
                                }
                                catch (IllegalArgumentException v23) {
                                    throw dm_1.a(v23);
                                }
                            }
                            try {
                                block66: {
                                    try {
                                        try {
                                            if (var3_5) break block65;
                                            if (v13 != 0) break block66;
                                        }
                                        catch (IllegalArgumentException v24) {
                                            throw dm_1.a(v24);
                                        }
                                        ++var13_12;
                                        if (!var3_5) break block65;
                                    }
                                    catch (IllegalArgumentException v25) {
                                        throw dm_1.a(v25);
                                    }
                                }
                                v13 = (int)var11_6.add(((OY[])this.z)[((int[])this.L)[var5_8]]);
                            }
                            catch (IllegalArgumentException v26) {
                                throw dm_1.a(v26);
                            }
                        }
                        ((int[])com.c.c((long)487785452946359037L).get((Object)this))[var5_8] = dm_1.a(10849, 554123652886283682L);
                        ++var14_13;
                        if (!var3_5) continue;
                    }
                    Collections.sort(var11_6);
                    v27 = ((OY[])this.z).length;
                    v14 = var14_13;
                }
                var15_14 = new OY[v27 - v14];
                var5_8 = 0;
                var6_7 = 0;
                while (var5_8 < ((OY[])this.z).length) {
                    block67: {
                        block69: {
                            var8_11 = ((OY[])this.z)[var5_8].t;
                            try {
                                try {
                                    try {
                                        if (var3_5) break block67;
                                        v28 = ((int[])this.L)[var8_11];
                                        v29 = dm_1.a(29451, 1237652641240325323L);
                                        if (var3_5) break block68;
                                    }
                                    catch (IllegalArgumentException v30) {
                                        throw dm_1.a(v30);
                                    }
                                    if (v28 == v29) break block69;
                                }
                                catch (IllegalArgumentException v31) {
                                    throw dm_1.a(v31);
                                }
                                var15_14[var6_7++] = ((OY[])this.z)[var5_8];
                            }
                            catch (IllegalArgumentException v32) {
                                throw dm_1.a(v32);
                            }
                        }
                        ++var5_8;
                    }
                    if (!var3_5) continue;
                }
                v28 = var12_10;
                v29 = var13_12;
            }
            try {
                if (v28 == v29) ** GOTO lbl195
                this.z = new OY[((OY[])this.z).length + var12_10 - var13_12];
            }
            catch (IllegalArgumentException v33) {
                throw dm_1.a(v33);
            }
lbl195:
            // 2 sources

            try {
                this.L((Object)var11_6, (Object)var15_14);
            }
            catch (InvocationTargetException v34) {
                throw v34.getTargetException();
            }
            try {
                this.K(true);
            }
            catch (InvocationTargetException v35) {
                throw v35.getTargetException();
            }
        }
        this.fireRowSorterChanged(var4_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void x(int n10) {
        int n11;
        block8: {
            boolean bl = uo_0.i();
            try {
                n11 = n10;
                if (bl) break block8;
                if (n11 < 0) throw new IndexOutOfBoundsException(dm_1.a(-1477, 10294));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw dm_1.a(illegalArgumentException);
            }
            n11 = n10;
        }
        try {
            int n12;
            Object object;
            try {
                object = this.B();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                n12 = (Integer)object.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (n11 < n12) return;
            throw new IndexOutOfBoundsException(dm_1.a(-1477, 10294));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw dm_1.a(illegalArgumentException);
        }
    }

    static int e(dm_1 dm_12, int n10, int n11) {
        int n12;
        try {
            n12 = (Integer)dm_12.e(n10, n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        return n12;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[8];
                        var11_1 = 0;
                        var10_2 = "\u009ez\u00fd\u00e2\n|\u00c9\u00b3v\u000b\u00f3*\u00bc\u000fM$\u0087)E\u0005 \u009cj\u00e0i\u008b^\u00e3\u00c8!\u00a8\u0093N\u00ea$\u00eci\u0004\u00b9\u00ef\u00fe\u00a4=\u001ae\u00d3\u00c6?\u007fHD\u0013\u00ff\u00a4\u00d5I\u009fo\u0007\u009eX[\u00ee\u000b\u0013fLa<\f\u000f\u00bd\u00b1\u00ca\u00e1\u001d\u0090.\u008eM43\u0018\u00e2\u009aY'F\t\u00942\u00f4\u0088\u00cc\u00e8\u00dc\u001ed]yk\u0083\u0094\u00b2}\r\u00a1\u00ce\u001at\u00f6\u00aeV\u00e9\u0085@\u008dCs";
                        var12_3 = "\u009ez\u00fd\u00e2\n|\u00c9\u00b3v\u000b\u00f3*\u00bc\u000fM$\u0087)E\u0005 \u009cj\u00e0i\u008b^\u00e3\u00c8!\u00a8\u0093N\u00ea$\u00eci\u0004\u00b9\u00ef\u00fe\u00a4=\u001ae\u00d3\u00c6?\u007fHD\u0013\u00ff\u00a4\u00d5I\u009fo\u0007\u009eX[\u00ee\u000b\u0013fLa<\f\u000f\u00bd\u00b1\u00ca\u00e1\u001d\u0090.\u008eM43\u0018\u00e2\u009aY'F\t\u00942\u00f4\u0088\u00cc\u00e8\u00dc\u001ed]yk\u0083\u0094\u00b2}\r\u00a1\u00ce\u001at\u00f6\u00aeV\u00e9\u0085@\u008dCs".length();
                        var9_4 = 13;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 104;
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
                            var10_2 = "\u0095\b(\u0018\u0004\u0097\u00bczw\u0089\u0015\"\u0082\r\u001f\\y\u0092.\u00c6\u00f9P\u00df\u00cc\u0000\u008a ";
                            var12_3 = "\u0095\b(\u0018\u0004\u0097\u00bczw\u0089\u0015\"\u0082\r\u001f\\y\u0092.\u00c6\u00f9P\u00df\u00cc\u0000\u008a ".length();
                            var9_4 = 13;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 55;
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
                                    v15 = 49;
                                    break;
                                }
                                case 1: {
                                    v15 = 16;
                                    break;
                                }
                                case 2: {
                                    v15 = 123;
                                    break;
                                }
                                case 3: {
                                    v15 = 8;
                                    break;
                                }
                                case 4: {
                                    v15 = 107;
                                    break;
                                }
                                case 5: {
                                    v15 = 96;
                                    break;
                                }
                                default: {
                                    v15 = 5;
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
                dm_1.a = var13;
                dm_1.b = new String[8];
                var0_7 = 5611620547195163644L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "!\u00cdc\u00ff\u00cd\u00cb\u00e9\u00a0\u00f3\u00c0K6A\u001d\u0097\u00f6";
                var5_11 = "!\u00cdc\u00ff\u00cd\u00cb\u00e9\u00a0\u00f3\u00c0K6A\u001d\u0097\u00f6".length();
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
                    var4_10 = "\u00b8\u0004k+r\u0007\u0015\u0010\u0089#\u007f\u00e2\u001aR0\u00c9";
                    var5_11 = "\u00b8\u0004k+r\u0007\u0015\u0010\u0089#\u007f\u00e2\u001aR0\u00c9".length();
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
        dm_1.d = var6_8;
        dm_1.h = new Integer[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFFA39) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 242;
                    break;
                }
                case 1: {
                    n14 = 60;
                    break;
                }
                case 2: {
                    n14 = 142;
                    break;
                }
                case 3: {
                    n14 = 42;
                    break;
                }
                case 4: {
                    n14 = 62;
                    break;
                }
                case 5: {
                    n14 = 54;
                    break;
                }
                case 6: {
                    n14 = 129;
                    break;
                }
                case 7: {
                    n14 = 158;
                    break;
                }
                case 8: {
                    n14 = 124;
                    break;
                }
                case 9: {
                    n14 = 238;
                    break;
                }
                case 10: {
                    n14 = 48;
                    break;
                }
                case 11: {
                    n14 = 5;
                    break;
                }
                case 12: {
                    n14 = 211;
                    break;
                }
                case 13: {
                    n14 = 168;
                    break;
                }
                case 14: {
                    n14 = 0;
                    break;
                }
                case 15: {
                    n14 = 82;
                    break;
                }
                case 16: {
                    n14 = 73;
                    break;
                }
                case 17: {
                    n14 = 140;
                    break;
                }
                case 18: {
                    n14 = 125;
                    break;
                }
                case 19: {
                    n14 = 14;
                    break;
                }
                case 20: {
                    n14 = 190;
                    break;
                }
                case 21: {
                    n14 = 108;
                    break;
                }
                case 22: {
                    n14 = 28;
                    break;
                }
                case 23: {
                    n14 = 95;
                    break;
                }
                case 24: {
                    n14 = 78;
                    break;
                }
                case 25: {
                    n14 = 170;
                    break;
                }
                case 26: {
                    n14 = 213;
                    break;
                }
                case 27: {
                    n14 = 114;
                    break;
                }
                case 28: {
                    n14 = 2;
                    break;
                }
                case 29: {
                    n14 = 237;
                    break;
                }
                case 30: {
                    n14 = 121;
                    break;
                }
                case 31: {
                    n14 = 235;
                    break;
                }
                case 32: {
                    n14 = 131;
                    break;
                }
                case 33: {
                    n14 = 218;
                    break;
                }
                case 34: {
                    n14 = 27;
                    break;
                }
                case 35: {
                    n14 = 148;
                    break;
                }
                case 36: {
                    n14 = 236;
                    break;
                }
                case 37: {
                    n14 = 151;
                    break;
                }
                case 38: {
                    n14 = 41;
                    break;
                }
                case 39: {
                    n14 = 133;
                    break;
                }
                case 40: {
                    n14 = 132;
                    break;
                }
                case 41: {
                    n14 = 198;
                    break;
                }
                case 42: {
                    n14 = 160;
                    break;
                }
                case 43: {
                    n14 = 15;
                    break;
                }
                case 44: {
                    n14 = 191;
                    break;
                }
                case 45: {
                    n14 = 46;
                    break;
                }
                case 46: {
                    n14 = 228;
                    break;
                }
                case 47: {
                    n14 = 253;
                    break;
                }
                case 48: {
                    n14 = 247;
                    break;
                }
                case 49: {
                    n14 = 68;
                    break;
                }
                case 50: {
                    n14 = 75;
                    break;
                }
                case 51: {
                    n14 = 61;
                    break;
                }
                case 52: {
                    n14 = 249;
                    break;
                }
                case 53: {
                    n14 = 229;
                    break;
                }
                case 54: {
                    n14 = 74;
                    break;
                }
                case 55: {
                    n14 = 147;
                    break;
                }
                case 56: {
                    n14 = 29;
                    break;
                }
                case 57: {
                    n14 = 85;
                    break;
                }
                case 58: {
                    n14 = 173;
                    break;
                }
                case 59: {
                    n14 = 167;
                    break;
                }
                case 60: {
                    n14 = 224;
                    break;
                }
                case 61: {
                    n14 = 99;
                    break;
                }
                case 62: {
                    n14 = 243;
                    break;
                }
                case 63: {
                    n14 = 83;
                    break;
                }
                case 64: {
                    n14 = 226;
                    break;
                }
                case 65: {
                    n14 = 101;
                    break;
                }
                case 66: {
                    n14 = 122;
                    break;
                }
                case 67: {
                    n14 = 3;
                    break;
                }
                case 68: {
                    n14 = 181;
                    break;
                }
                case 69: {
                    n14 = 25;
                    break;
                }
                case 70: {
                    n14 = 214;
                    break;
                }
                case 71: {
                    n14 = 128;
                    break;
                }
                case 72: {
                    n14 = 162;
                    break;
                }
                case 73: {
                    n14 = 34;
                    break;
                }
                case 74: {
                    n14 = 139;
                    break;
                }
                case 75: {
                    n14 = 233;
                    break;
                }
                case 76: {
                    n14 = 217;
                    break;
                }
                case 77: {
                    n14 = 96;
                    break;
                }
                case 78: {
                    n14 = 112;
                    break;
                }
                case 79: {
                    n14 = 187;
                    break;
                }
                case 80: {
                    n14 = 219;
                    break;
                }
                case 81: {
                    n14 = 195;
                    break;
                }
                case 82: {
                    n14 = 209;
                    break;
                }
                case 83: {
                    n14 = 134;
                    break;
                }
                case 84: {
                    n14 = 179;
                    break;
                }
                case 85: {
                    n14 = 50;
                    break;
                }
                case 86: {
                    n14 = 10;
                    break;
                }
                case 87: {
                    n14 = 186;
                    break;
                }
                case 88: {
                    n14 = 123;
                    break;
                }
                case 89: {
                    n14 = 52;
                    break;
                }
                case 90: {
                    n14 = 169;
                    break;
                }
                case 91: {
                    n14 = 63;
                    break;
                }
                case 92: {
                    n14 = 84;
                    break;
                }
                case 93: {
                    n14 = 31;
                    break;
                }
                case 94: {
                    n14 = 232;
                    break;
                }
                case 95: {
                    n14 = 120;
                    break;
                }
                case 96: {
                    n14 = 72;
                    break;
                }
                case 97: {
                    n14 = 118;
                    break;
                }
                case 98: {
                    n14 = 90;
                    break;
                }
                case 99: {
                    n14 = 143;
                    break;
                }
                case 100: {
                    n14 = 251;
                    break;
                }
                case 101: {
                    n14 = 152;
                    break;
                }
                case 102: {
                    n14 = 245;
                    break;
                }
                case 103: {
                    n14 = 135;
                    break;
                }
                case 104: {
                    n14 = 32;
                    break;
                }
                case 105: {
                    n14 = 252;
                    break;
                }
                case 106: {
                    n14 = 192;
                    break;
                }
                case 107: {
                    n14 = 225;
                    break;
                }
                case 108: {
                    n14 = 36;
                    break;
                }
                case 109: {
                    n14 = 188;
                    break;
                }
                case 110: {
                    n14 = 156;
                    break;
                }
                case 111: {
                    n14 = 88;
                    break;
                }
                case 112: {
                    n14 = 18;
                    break;
                }
                case 113: {
                    n14 = 119;
                    break;
                }
                case 114: {
                    n14 = 43;
                    break;
                }
                case 115: {
                    n14 = 157;
                    break;
                }
                case 116: {
                    n14 = 97;
                    break;
                }
                case 117: {
                    n14 = 55;
                    break;
                }
                case 118: {
                    n14 = 19;
                    break;
                }
                case 119: {
                    n14 = 38;
                    break;
                }
                case 120: {
                    n14 = 91;
                    break;
                }
                case 121: {
                    n14 = 202;
                    break;
                }
                case 122: {
                    n14 = 241;
                    break;
                }
                case 123: {
                    n14 = 56;
                    break;
                }
                case 124: {
                    n14 = 144;
                    break;
                }
                case 125: {
                    n14 = 255;
                    break;
                }
                case 126: {
                    n14 = 126;
                    break;
                }
                case 127: {
                    n14 = 26;
                    break;
                }
                case 128: {
                    n14 = 49;
                    break;
                }
                case 129: {
                    n14 = 106;
                    break;
                }
                case 130: {
                    n14 = 47;
                    break;
                }
                case 131: {
                    n14 = 23;
                    break;
                }
                case 132: {
                    n14 = 178;
                    break;
                }
                case 133: {
                    n14 = 104;
                    break;
                }
                case 134: {
                    n14 = 161;
                    break;
                }
                case 135: {
                    n14 = 244;
                    break;
                }
                case 136: {
                    n14 = 194;
                    break;
                }
                case 137: {
                    n14 = 116;
                    break;
                }
                case 138: {
                    n14 = 103;
                    break;
                }
                case 139: {
                    n14 = 53;
                    break;
                }
                case 140: {
                    n14 = 208;
                    break;
                }
                case 141: {
                    n14 = 69;
                    break;
                }
                case 142: {
                    n14 = 185;
                    break;
                }
                case 143: {
                    n14 = 248;
                    break;
                }
                case 144: {
                    n14 = 71;
                    break;
                }
                case 145: {
                    n14 = 20;
                    break;
                }
                case 146: {
                    n14 = 204;
                    break;
                }
                case 147: {
                    n14 = 212;
                    break;
                }
                case 148: {
                    n14 = 57;
                    break;
                }
                case 149: {
                    n14 = 222;
                    break;
                }
                case 150: {
                    n14 = 92;
                    break;
                }
                case 151: {
                    n14 = 105;
                    break;
                }
                case 152: {
                    n14 = 4;
                    break;
                }
                case 153: {
                    n14 = 6;
                    break;
                }
                case 154: {
                    n14 = 221;
                    break;
                }
                case 155: {
                    n14 = 184;
                    break;
                }
                case 156: {
                    n14 = 111;
                    break;
                }
                case 157: {
                    n14 = 45;
                    break;
                }
                case 158: {
                    n14 = 81;
                    break;
                }
                case 159: {
                    n14 = 136;
                    break;
                }
                case 160: {
                    n14 = 254;
                    break;
                }
                case 161: {
                    n14 = 30;
                    break;
                }
                case 162: {
                    n14 = 176;
                    break;
                }
                case 163: {
                    n14 = 35;
                    break;
                }
                case 164: {
                    n14 = 203;
                    break;
                }
                case 165: {
                    n14 = 196;
                    break;
                }
                case 166: {
                    n14 = 67;
                    break;
                }
                case 167: {
                    n14 = 89;
                    break;
                }
                case 168: {
                    n14 = 1;
                    break;
                }
                case 169: {
                    n14 = 107;
                    break;
                }
                case 170: {
                    n14 = 64;
                    break;
                }
                case 171: {
                    n14 = 239;
                    break;
                }
                case 172: {
                    n14 = 146;
                    break;
                }
                case 173: {
                    n14 = 223;
                    break;
                }
                case 174: {
                    n14 = 231;
                    break;
                }
                case 175: {
                    n14 = 59;
                    break;
                }
                case 176: {
                    n14 = 113;
                    break;
                }
                case 177: {
                    n14 = 138;
                    break;
                }
                case 178: {
                    n14 = 200;
                    break;
                }
                case 179: {
                    n14 = 130;
                    break;
                }
                case 180: {
                    n14 = 22;
                    break;
                }
                case 181: {
                    n14 = 33;
                    break;
                }
                case 182: {
                    n14 = 171;
                    break;
                }
                case 183: {
                    n14 = 215;
                    break;
                }
                case 184: {
                    n14 = 172;
                    break;
                }
                case 185: {
                    n14 = 205;
                    break;
                }
                case 186: {
                    n14 = 16;
                    break;
                }
                case 187: {
                    n14 = 154;
                    break;
                }
                case 188: {
                    n14 = 8;
                    break;
                }
                case 189: {
                    n14 = 159;
                    break;
                }
                case 190: {
                    n14 = 207;
                    break;
                }
                case 191: {
                    n14 = 150;
                    break;
                }
                case 192: {
                    n14 = 94;
                    break;
                }
                case 193: {
                    n14 = 201;
                    break;
                }
                case 194: {
                    n14 = 80;
                    break;
                }
                case 195: {
                    n14 = 17;
                    break;
                }
                case 196: {
                    n14 = 40;
                    break;
                }
                case 197: {
                    n14 = 12;
                    break;
                }
                case 198: {
                    n14 = 115;
                    break;
                }
                case 199: {
                    n14 = 98;
                    break;
                }
                case 200: {
                    n14 = 182;
                    break;
                }
                case 201: {
                    n14 = 227;
                    break;
                }
                case 202: {
                    n14 = 93;
                    break;
                }
                case 203: {
                    n14 = 77;
                    break;
                }
                case 204: {
                    n14 = 166;
                    break;
                }
                case 205: {
                    n14 = 109;
                    break;
                }
                case 206: {
                    n14 = 177;
                    break;
                }
                case 207: {
                    n14 = 79;
                    break;
                }
                case 208: {
                    n14 = 163;
                    break;
                }
                case 209: {
                    n14 = 87;
                    break;
                }
                case 210: {
                    n14 = 66;
                    break;
                }
                case 211: {
                    n14 = 11;
                    break;
                }
                case 212: {
                    n14 = 7;
                    break;
                }
                case 213: {
                    n14 = 70;
                    break;
                }
                case 214: {
                    n14 = 206;
                    break;
                }
                case 215: {
                    n14 = 197;
                    break;
                }
                case 216: {
                    n14 = 127;
                    break;
                }
                case 217: {
                    n14 = 51;
                    break;
                }
                case 218: {
                    n14 = 165;
                    break;
                }
                case 219: {
                    n14 = 141;
                    break;
                }
                case 220: {
                    n14 = 117;
                    break;
                }
                case 221: {
                    n14 = 175;
                    break;
                }
                case 222: {
                    n14 = 65;
                    break;
                }
                case 223: {
                    n14 = 246;
                    break;
                }
                case 224: {
                    n14 = 193;
                    break;
                }
                case 225: {
                    n14 = 183;
                    break;
                }
                case 226: {
                    n14 = 86;
                    break;
                }
                case 227: {
                    n14 = 189;
                    break;
                }
                case 228: {
                    n14 = 100;
                    break;
                }
                case 229: {
                    n14 = 250;
                    break;
                }
                case 230: {
                    n14 = 180;
                    break;
                }
                case 231: {
                    n14 = 13;
                    break;
                }
                case 232: {
                    n14 = 76;
                    break;
                }
                case 233: {
                    n14 = 24;
                    break;
                }
                case 234: {
                    n14 = 37;
                    break;
                }
                case 235: {
                    n14 = 44;
                    break;
                }
                case 236: {
                    n14 = 220;
                    break;
                }
                case 237: {
                    n14 = 110;
                    break;
                }
                case 238: {
                    n14 = 230;
                    break;
                }
                case 239: {
                    n14 = 9;
                    break;
                }
                case 240: {
                    n14 = 39;
                    break;
                }
                case 241: {
                    n14 = 164;
                    break;
                }
                case 242: {
                    n14 = 174;
                    break;
                }
                case 243: {
                    n14 = 21;
                    break;
                }
                case 244: {
                    n14 = 102;
                    break;
                }
                case 245: {
                    n14 = 149;
                    break;
                }
                case 246: {
                    n14 = 210;
                    break;
                }
                case 247: {
                    n14 = 153;
                    break;
                }
                case 248: {
                    n14 = 145;
                    break;
                }
                case 249: {
                    n14 = 58;
                    break;
                }
                case 250: {
                    n14 = 199;
                    break;
                }
                case 251: {
                    n14 = 240;
                    break;
                }
                case 252: {
                    n14 = 155;
                    break;
                }
                case 253: {
                    n14 = 137;
                    break;
                }
                case 254: {
                    n14 = 216;
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
            dm_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6FC3;
        if (h[n11] == null) {
            dm_1.h[n11] = (int)(d[n11] ^ l2);
        }
        return h[n11];
    }
}

