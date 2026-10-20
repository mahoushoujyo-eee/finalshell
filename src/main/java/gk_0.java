/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from gk
 */
public class gk_0
extends AbstractTableModel {
    ArrayList y;
    public static String t;
    public static String i;
    public static String s;
    public static String P;
    public static String j;
    public static String S;
    public static String T;
    public static String a;
    public static String h;
    public static String B;
    public static String K;
    public static String O;
    public static String W;
    String[] l;
    boolean g;
    private static final long[] b;
    private static final Integer[] c;

    public gk_0(boolean bl) {
        block4: {
            int n10;
            gk_0 gk_02;
            block2: {
                block3: {
                    boolean bl2 = uo_0.i();
                    boolean bl3 = bl2;
                    this.y = new ArrayList();
                    this.g = false;
                    gk_02 = this;
                    n10 = bl;
                    if (bl3) break block2;
                    gk_02.g = n10 != 0;
                    if (bl) break block3;
                    String[] stringArray = new String[gk_0.a(9105, 778820718585847637L)];
                    stringArray[0] = (String)gk_0.t;
                    stringArray[1] = (String)gk_0.i;
                    stringArray[2] = (String)gk_0.s;
                    stringArray[3] = (String)gk_0.P;
                    stringArray[4] = (String)gk_0.a;
                    stringArray[5] = (String)gk_0.S;
                    this.l = stringArray;
                    if (!bl3) break block4;
                }
                gk_02 = this;
                n10 = gk_0.a(14879, 4719541130005481178L);
            }
            String[] stringArray = new String[n10];
            stringArray[0] = (String)gk_0.t;
            stringArray[1] = (String)gk_0.a;
            stringArray[2] = (String)gk_0.B;
            stringArray[3] = (String)gk_0.h;
            stringArray[4] = (String)gk_0.K;
            stringArray[5] = (String)gk_0.O;
            gk_02.l = stringArray;
        }
    }

    public String e(int n10) {
        return ((String[])this.l)[n10];
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.y).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.l)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.l).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.y).get(n10);
    }

    public void r(ArrayList arrayList, KV kV) {
        block4: {
            block3: {
                gk_0 gk_02;
                boolean bl;
                block2: {
                    bl = uo_0.k();
                    gk_02 = this;
                    if (!bl) break block2;
                    if (!gk_02.g) break block3;
                    gk_02 = this;
                }
                gk_02.y = arrayList;
                if (bl) break block4;
            }
            ArrayList arrayList2 = new ArrayList();
            this.y = arrayList;
        }
        this.fireTableDataChanged();
    }

    public int y(int n10) {
        int n11 = -1;
        Iterator iterator = ((ArrayList)this.y).iterator();
        boolean bl = uo_0.k();
        while (iterator.hasNext()) {
            int n12;
            li_1 li_12 = (li_1)iterator.next();
            ++n11;
            li_1 li_13 = li_12;
            if (bl) {
                if (li_13 == null) {
                    return n11;
                }
                li_13 = li_12;
            }
            try {
                n12 = (Integer)li_13.m();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if ((n12 != n10 || !bl) && bl) continue;
        }
        return n11;
    }

    public void H(li_1 li_12) {
        int n10;
        int n11;
        try {
            n11 = (Integer)li_12.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)li_12.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.fireTableRowsUpdated(n11, n10);
    }

    public ArrayList O() {
        return (ArrayList)this.y;
    }

    public void b(ArrayList arrayList) {
        this.y = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[13];
                        var12_1 = 0;
                        var11_2 = "\u5463\u79af\u2559\u5452\u4e91\u880b\u0003'\u000f\u6522\u0003>\u0016\u0016\u0004\u5d8b\u4f03\u76bc\u5f7a\u0002\u5463\u79af\u0003\u8fb0\u63fa\u6522\u0002\u4e65\u8f22\u0002\u7546\u6268\u0002\u51eb\u5b07\u0003\u4e4c\u535aw\u0002\u4e64\u4f7f";
                        var13_3 = "\u5463\u79af\u2559\u5452\u4e91\u880b\u0003'\u000f\u6522\u0003>\u0016\u0016\u0004\u5d8b\u4f03\u76bc\u5f7a\u0002\u5463\u79af\u0003\u8fb0\u63fa\u6522\u0002\u4e65\u8f22\u0002\u7546\u6268\u0002\u51eb\u5b07\u0003\u4e4c\u535aw\u0002\u4e64\u4f7f".length();
                        var10_4 = 6;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 67;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\u4f35\u7f27\u0003;\u0019\u0011";
                            var13_3 = "\u4f35\u7f27\u0003;\u0019\u0011".length();
                            var10_4 = 2;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 85;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block22;
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
                                    v15 = 45;
                                    break;
                                }
                                case 1: {
                                    v15 = 28;
                                    break;
                                }
                                case 2: {
                                    v15 = 17;
                                    break;
                                }
                                case 3: {
                                    v15 = 108;
                                    break;
                                }
                                case 4: {
                                    v15 = 54;
                                    break;
                                }
                                case 5: {
                                    v15 = 4;
                                    break;
                                }
                                default: {
                                    v15 = 36;
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
                var0_7 = 5145722619523642703L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "S\u0017\u0094\u00f1\u00a2`*\u001c\u0095\u0085\u009c\u00e9\u009d\u00b4\u00b3\u0093";
                var5_11 = "S\u0017\u0094\u00f1\u00a2`*\u001c\u0095\u0085\u009c\u00e9\u009d\u00b4\u00b3\u0093".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl105:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        gk_0.b = var6_8;
        gk_0.c = new Integer[2];
        gk_0.t = var8[2];
        gk_0.i = var8[7];
        gk_0.s = var8[8];
        gk_0.P = var8[12];
        gk_0.j = var8[4];
        gk_0.S = var8[11];
        gk_0.T = var8[3];
        gk_0.a = var8[0];
        gk_0.h = var8[5];
        gk_0.B = var8[1];
        gk_0.K = var8[10];
        gk_0.O = var8[6];
        gk_0.W = var8[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3CC4;
        if (c[n11] == null) {
            gk_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

