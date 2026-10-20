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
 * Renamed from dP
 */
class dp_1
extends TableRowSorter {
    final UT d;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    dp_1(UT uT2, cd_2 cd_22) {
        this.d = uT2;
        super(cd_22);
    }

    private RowSorter.SortKey t(RowSorter.SortKey sortKey) {
        RowSorter.SortKey sortKey2;
        block4: {
            block5: {
                int[] nArray = CE.S();
                try {
                    try {
                        sortKey2 = sortKey;
                        if (nArray == null) break block4;
                        if (sortKey2.getSortOrder() != SortOrder.ASCENDING) break block5;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw dp_1.a(indexOutOfBoundsException);
                    }
                    return new RowSorter.SortKey(sortKey.getColumn(), SortOrder.DESCENDING);
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw dp_1.a(indexOutOfBoundsException);
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
        block61: {
            block59: {
                block58: {
                    block56: {
                        block55: {
                            block54: {
                                block52: {
                                    block53: {
                                        block51: {
                                            block50: {
                                                block60: {
                                                    block47: {
                                                        block49: {
                                                            block48: {
                                                                block46: {
                                                                    v0 = CE.S();
                                                                    this.d.H = this.d.C;
                                                                    var2_2 = v0;
                                                                    this.d.C = var1_1;
                                                                    var3_3 = SortOrder.ASCENDING;
                                                                    try {
                                                                        try {
                                                                            v1 = var1_1;
                                                                            v2 = 4;
                                                                            if (var2_2 == null) break block46;
                                                                            if (v1 == v2) break block47;
                                                                        }
                                                                        catch (IndexOutOfBoundsException v3) {
                                                                            throw dp_1.a(v3);
                                                                        }
                                                                        v1 = var1_1;
                                                                        v2 = 5;
                                                                    }
                                                                    catch (IndexOutOfBoundsException v4) {
                                                                        throw dp_1.a(v4);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var2_2 == null) break block48;
                                                                        if (v1 == v2) break block47;
                                                                    }
                                                                    catch (IndexOutOfBoundsException v5) {
                                                                        throw dp_1.a(v5);
                                                                    }
                                                                    v1 = var1_1;
                                                                    v2 = dp_1.a(14267, 5851305096518317405L);
                                                                }
                                                                catch (IndexOutOfBoundsException v6) {
                                                                    throw dp_1.a(v6);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var2_2 == null) break block49;
                                                                        if (v1 == v2) break block47;
                                                                    }
                                                                    catch (IndexOutOfBoundsException v7) {
                                                                        throw dp_1.a(v7);
                                                                    }
                                                                    v1 = var1_1;
                                                                    if (var2_2 == null) break block50;
                                                                }
                                                                catch (IndexOutOfBoundsException v8) {
                                                                    throw dp_1.a(v8);
                                                                }
                                                                v2 = dp_1.a(24127, 883278026876509400L);
                                                            }
                                                            catch (IndexOutOfBoundsException v9) {
                                                                throw dp_1.a(v9);
                                                            }
                                                        }
                                                        if (v1 != v2) break block60;
                                                    }
                                                    var3_3 = SortOrder.DESCENDING;
                                                }
                                                v1 = var1_1;
                                            }
                                            try {
                                                if (var2_2 == null) break block51;
                                                if (v1 >= 0) {
                                                }
                                                ** GOTO lbl76
                                            }
                                            catch (IndexOutOfBoundsException v10) {
                                                throw dp_1.a(v10);
                                            }
                                            v1 = var1_1;
                                        }
                                        try {
                                            try {
                                                if (var2_2 == null) break block52;
                                                if (v1 < this.getModelWrapper().getColumnCount()) break block53;
                                            }
                                            catch (IndexOutOfBoundsException v11) {
                                                throw dp_1.a(v11);
                                            }
lbl76:
                                            // 2 sources

                                            throw new IndexOutOfBoundsException(dp_1.a);
                                        }
                                        catch (IndexOutOfBoundsException v12) {
                                            throw dp_1.a(v12);
                                        }
                                    }
                                    v1 = (int)this.isSortable(var1_1);
                                }
                                if (v1 == 0) break block61;
                                var4_4 = new ArrayList<RowSorter.SortKey>(this.getSortKeys());
                                for (var6_5 = var4_4.size() - 1; var6_5 >= 0; --var6_5) {
                                    try {
                                        try {
                                            try {
                                                v13 = ((RowSorter.SortKey)var4_4.get(var6_5)).getColumn();
                                                v14 = var1_1;
                                                if (var2_2 == null) break block54;
                                                if (v13 != v14) continue;
                                            }
                                            catch (IndexOutOfBoundsException v15) {
                                                throw dp_1.a(v15);
                                            }
                                            if (var2_2 != null) break;
                                            continue;
                                        }
                                        catch (IndexOutOfBoundsException v16) {
                                            throw dp_1.a(v16);
                                        }
                                    }
                                    catch (IndexOutOfBoundsException v17) {
                                        throw dp_1.a(v17);
                                    }
                                }
                                try {
                                    v13 = var6_5;
                                    if (var2_2 == null) break block55;
                                    v14 = -1;
                                }
                                catch (IndexOutOfBoundsException v18) {
                                    throw dp_1.a(v18);
                                }
                            }
                            if (v13 != v14) ** GOTO lbl114
                            var5_6 = new RowSorter.SortKey(var1_1, var3_3);
                            try {
                                var4_4.add(0, var5_6);
                                if (var2_2 != null) break block56;
lbl114:
                                // 2 sources

                                v13 = var6_5;
                            }
                            catch (IndexOutOfBoundsException v19) {
                                throw dp_1.a(v19);
                            }
                        }
                        try {
                            block57: {
                                try {
                                    if (v13 != 0) break block57;
                                    try {
                                        v20 = (RowSorter.SortKey)this.t((RowSorter.SortKey)var4_4.get(0));
                                    }
                                    catch (InvocationTargetException v21) {
                                        throw v21.getTargetException();
                                    }
                                    var4_4.set(0, v20);
                                    if (var2_2 != null) break block56;
                                }
                                catch (IndexOutOfBoundsException v22) {
                                    throw dp_1.a(v22);
                                }
                            }
                            var4_4.remove(var6_5);
                            var4_4.add(0, new RowSorter.SortKey(var1_1, var3_3));
                        }
                        catch (IndexOutOfBoundsException v23) {
                            throw dp_1.a(v23);
                        }
                    }
                    try {
                        try {
                            v24 /* !! */  = var4_4;
                            if (var2_2 == null) break block58;
                            if (v24 /* !! */ .size() <= this.getMaxSortKeys()) break block59;
                        }
                        catch (IndexOutOfBoundsException v25) {
                            throw dp_1.a(v25);
                        }
                        v24 /* !! */  = var4_4.subList(0, this.getMaxSortKeys());
                    }
                    catch (IndexOutOfBoundsException v26) {
                        throw dp_1.a(v26);
                    }
                }
                var4_4 = v24 /* !! */ ;
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
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "%\u0014\u0017Y\u0010MU$\u001e\u0002C\u0013GU4\u001a\u0015K\u0018\u0003\u001a [/M\u001fO\u0010\u000b\u0014\u001fI\u0011".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 54;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 112;
                            break;
                        }
                        case 1: {
                            n17 = 77;
                            break;
                        }
                        case 2: {
                            n17 = 77;
                            break;
                        }
                        case 3: {
                            n17 = 26;
                            break;
                        }
                        case 4: {
                            n17 = 75;
                            break;
                        }
                        case 5: {
                            n17 = 21;
                            break;
                        }
                        default: {
                            n17 = 67;
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
        long l2 = 632690917215362454L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00ee\u00d6\u00adc\u00f8\u00dd\u0001I\u00a2T\u0085\u001b\u00abT\u00e8\u00cd";
        int n19 = "\u00ee\u00d6\u00adc\u00f8\u00dd\u0001I\u00a2T\u0085\u001b\u00abT\u00e8\u00cd".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2E7;
        if (c[n11] == null) {
            dp_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

