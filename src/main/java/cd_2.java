/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from cd
 */
public class cd_2
extends AbstractTableModel {
    ArrayList O;
    public static String g;
    public static String Y;
    public static String V;
    public static String d;
    public static String q;
    public static String z;
    public static String a;
    public static String P;
    public static String N;
    public static String C;
    public static String j;
    public static String f;
    public static String I;
    public static String m;
    public static String G;
    String[] o;
    boolean v;
    private static final long[] b;
    private static final Integer[] c;

    public cd_2(boolean bl) {
        this.O = new ArrayList();
        this.v = false;
        String[] stringArray = new String[cd_2.a(9522, 7778887644426868874L)];
        stringArray[0] = (String)cd_2.g;
        stringArray[1] = (String)cd_2.P;
        stringArray[2] = (String)cd_2.N;
        stringArray[3] = (String)cd_2.C;
        stringArray[4] = (String)cd_2.f;
        stringArray[5] = (String)cd_2.j;
        stringArray[cd_2.a((int)10230, (long)4749739209174260301L)] = (String)cd_2.I;
        stringArray[cd_2.a((int)3772, (long)1660604052449768198L)] = (String)cd_2.m;
        this.o = stringArray;
    }

    public String r(int n10) {
        return ((String[])this.o)[n10];
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.O).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.o)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.o).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.O).get(n10);
    }

    public void Y(ArrayList arrayList, KV kV) {
        this.O = arrayList;
        this.fireTableDataChanged();
    }

    public int X(String string) {
        int n10;
        block4: {
            int n11 = -1;
            Iterator iterator = ((ArrayList)this.O).iterator();
            int[] nArray = CE.S();
            while (iterator.hasNext()) {
                String string2;
                kw_2 kw_22 = (kw_2)iterator.next();
                ++n11;
                try {
                    string2 = (String)kw_22.C();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = string2.equals(string) ? 1 : 0;
                if (nArray != null) {
                    if ((n10 == 0 || nArray == null) && nArray != null) continue;
                }
                break block4;
            }
            n10 = n11;
        }
        return n10;
    }

    public ArrayList T() {
        return (ArrayList)this.O;
    }

    public void l(ArrayList arrayList) {
        this.O = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var8 = new String[15];
                        var12_1 = 0;
                        var11_2 = "\u5ddb\u4f52\u76e3\u5f70\u0002\u7ad1\u53ed\u0002\u4f73\u7f60\u0002\u5433\u79fe\u0002\u7516\u6239\u0003\u8fe0\u63ab\u657d\u0003\u4e1c\u530b(\u0004\u76ef\u5422Du\u0002\u4e35\u8f73\u0003w^\u657d\u0002\u51bb\u5b56\u0002\u5433\u79fe\u0003nGI";
                        var13_3 = "\u5ddb\u4f52\u76e3\u5f70\u0002\u7ad1\u53ed\u0002\u4f73\u7f60\u0002\u5433\u79fe\u0002\u7516\u6239\u0003\u8fe0\u63ab\u657d\u0003\u4e1c\u530b(\u0004\u76ef\u5422Du\u0002\u4e35\u8f73\u0003w^\u657d\u0002\u51bb\u5b56\u0002\u5433\u79fe\u0003nGI".length();
                        var10_4 = 4;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 111;
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
                            var11_2 = "aBD\u0002\u4e28\u4f32";
                            var13_3 = "aBD\u0002\u4e28\u4f32".length();
                            var10_4 = 3;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 115;
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
                                    v15 = 81;
                                    break;
                                }
                                case 1: {
                                    v15 = 97;
                                    break;
                                }
                                case 2: {
                                    v15 = 98;
                                    break;
                                }
                                case 3: {
                                    v15 = 74;
                                    break;
                                }
                                case 4: {
                                    v15 = 79;
                                    break;
                                }
                                case 5: {
                                    v15 = 52;
                                    break;
                                }
                                default: {
                                    v15 = 35;
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
                var0_7 = 8905424418495413818L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "<Y\u00ea\u00f3<U\u008d;P\u0007\u00d6\u0093\u001c\u0011\u00a4q\u0082\u00ea\u0018\u00e5w?&\u00b8";
                var5_11 = "<Y\u00ea\u00f3<U\u008d;P\u0007\u00d6\u0093\u001c\u0011\u00a4q\u0082\u00ea\u0018\u00e5w?&\u00b8".length();
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
        cd_2.b = var6_8;
        cd_2.c = new Integer[3];
        cd_2.g = var8[12];
        cd_2.Y = var8[4];
        cd_2.V = var8[10];
        cd_2.d = var8[13];
        cd_2.q = var8[11];
        cd_2.z = var8[2];
        cd_2.a = var8[0];
        cd_2.P = var8[3];
        cd_2.N = var8[7];
        cd_2.C = var8[1];
        cd_2.j = var8[5];
        cd_2.f = var8[9];
        cd_2.I = var8[14];
        cd_2.m = var8[8];
        cd_2.G = var8[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3DBA;
        if (c[n11] == null) {
            cd_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

