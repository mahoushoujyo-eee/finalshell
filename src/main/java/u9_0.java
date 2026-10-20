/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;

/*
 * Renamed from u9
 */
class u9_0
extends TableRowSorter {
    final uo_0 T;
    private static final String a;

    u9_0(uo_0 uo_02, gk_0 gk_02) {
        this.T = uo_02;
        super(gk_02);
    }

    private RowSorter.SortKey f(RowSorter.SortKey sortKey) {
        RowSorter.SortKey sortKey2;
        block4: {
            block5: {
                boolean bl = uo_0.i();
                try {
                    try {
                        sortKey2 = sortKey;
                        if (bl) break block4;
                        if (sortKey2.getSortOrder() != SortOrder.ASCENDING) break block5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw u9_0.a(indexOutOfBoundsException);
                    }
                    return new RowSorter.SortKey(sortKey.getColumn(), SortOrder.DESCENDING);
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw u9_0.a(indexOutOfBoundsException);
                }
            }
            sortKey2 = new RowSorter.SortKey(sortKey.getColumn(), SortOrder.ASCENDING);
        }
        return sortKey2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void toggleSortOrder(int var1_1) {
        block51: {
            block49: {
                block48: {
                    block46: {
                        block45: {
                            block44: {
                                block42: {
                                    block43: {
                                        block41: {
                                            block40: {
                                                block50: {
                                                    block39: {
                                                        block38: {
                                                            this.T.T = this.T.p;
                                                            v0 = uo_0.i();
                                                            this.T.p = var1_1;
                                                            var2_2 = v0;
                                                            var3_3 = SortOrder.ASCENDING;
                                                            try {
                                                                try {
                                                                    try {
                                                                        v1 = var1_1;
                                                                        v2 = 2;
                                                                        if (var2_2) break block38;
                                                                        if (v1 == v2) break block39;
                                                                    }
                                                                    catch (IndexOutOfBoundsException v3) {
                                                                        throw u9_0.a(v3);
                                                                    }
                                                                    v1 = var1_1;
                                                                    if (var2_2) break block40;
                                                                }
                                                                catch (IndexOutOfBoundsException v4) {
                                                                    throw u9_0.a(v4);
                                                                }
                                                                v2 = 3;
                                                            }
                                                            catch (IndexOutOfBoundsException v5) {
                                                                throw u9_0.a(v5);
                                                            }
                                                        }
                                                        if (v1 != v2) break block50;
                                                    }
                                                    var3_3 = SortOrder.DESCENDING;
                                                }
                                                v1 = var1_1;
                                            }
                                            try {
                                                if (var2_2) break block41;
                                                if (v1 >= 0) {
                                                }
                                                ** GOTO lbl50
                                            }
                                            catch (IndexOutOfBoundsException v6) {
                                                throw u9_0.a(v6);
                                            }
                                            v1 = var1_1;
                                        }
                                        try {
                                            try {
                                                if (var2_2) break block42;
                                                if (v1 < this.getModelWrapper().getColumnCount()) break block43;
                                            }
                                            catch (IndexOutOfBoundsException v7) {
                                                throw u9_0.a(v7);
                                            }
lbl50:
                                            // 2 sources

                                            throw new IndexOutOfBoundsException(u9_0.a);
                                        }
                                        catch (IndexOutOfBoundsException v8) {
                                            throw u9_0.a(v8);
                                        }
                                    }
                                    v1 = (int)this.isSortable(var1_1);
                                }
                                if (v1 == 0) break block51;
                                var4_4 = new ArrayList<RowSorter.SortKey>(this.getSortKeys());
                                for (var6_5 = var4_4.size() - 1; var6_5 >= 0; --var6_5) {
                                    try {
                                        try {
                                            try {
                                                v9 = ((RowSorter.SortKey)var4_4.get(var6_5)).getColumn();
                                                v10 = var1_1;
                                                if (var2_2) break block44;
                                                if (v9 != v10) continue;
                                            }
                                            catch (IndexOutOfBoundsException v11) {
                                                throw u9_0.a(v11);
                                            }
                                            if (!var2_2) break;
                                            continue;
                                        }
                                        catch (IndexOutOfBoundsException v12) {
                                            throw u9_0.a(v12);
                                        }
                                    }
                                    catch (IndexOutOfBoundsException v13) {
                                        throw u9_0.a(v13);
                                    }
                                }
                                try {
                                    v9 = var6_5;
                                    if (var2_2) break block45;
                                    v10 = -1;
                                }
                                catch (IndexOutOfBoundsException v14) {
                                    throw u9_0.a(v14);
                                }
                            }
                            if (v9 != v10) ** GOTO lbl88
                            var5_6 = new RowSorter.SortKey(var1_1, var3_3);
                            try {
                                var4_4.add(0, var5_6);
                                if (!var2_2) break block46;
lbl88:
                                // 2 sources

                                v9 = var6_5;
                            }
                            catch (IndexOutOfBoundsException v15) {
                                throw u9_0.a(v15);
                            }
                        }
                        try {
                            block47: {
                                try {
                                    if (v9 != 0) break block47;
                                    try {
                                        v16 = (RowSorter.SortKey)this.f((RowSorter.SortKey)var4_4.get(0));
                                    }
                                    catch (InvocationTargetException v17) {
                                        throw v17.getTargetException();
                                    }
                                    var4_4.set(0, v16);
                                    if (!var2_2) break block46;
                                }
                                catch (IndexOutOfBoundsException v18) {
                                    throw u9_0.a(v18);
                                }
                            }
                            var4_4.remove(var6_5);
                            var4_4.add(0, new RowSorter.SortKey(var1_1, var3_3));
                        }
                        catch (IndexOutOfBoundsException v19) {
                            throw u9_0.a(v19);
                        }
                    }
                    try {
                        try {
                            v20 /* !! */  = var4_4;
                            if (var2_2) break block48;
                            if (v20 /* !! */ .size() <= this.getMaxSortKeys()) break block49;
                        }
                        catch (IndexOutOfBoundsException v21) {
                            throw u9_0.a(v21);
                        }
                        v20 /* !! */  = var4_4.subList(0, this.getMaxSortKeys());
                    }
                    catch (IndexOutOfBoundsException v22) {
                        throw u9_0.a(v22);
                    }
                }
                var4_4 = v20 /* !! */ ;
            }
            this.setSortKeys(var4_4);
        }
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u001dq>~#vA\u001c{+d |A\f\u007f<l+8\u000e\u0018>\u0006j,t\u00043q6n\"".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 125;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 3;
                            break;
                        }
                        case 1: {
                            n17 = 99;
                            break;
                        }
                        case 2: {
                            n17 = 47;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 51;
                            break;
                        }
                        case 5: {
                            n17 = 101;
                            break;
                        }
                        default: {
                            n17 = 28;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

