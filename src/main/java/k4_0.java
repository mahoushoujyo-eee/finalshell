/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from k4
 */
public class k4_0
extends AbstractTableModel {
    ArrayList g;
    public static String a;
    public static String y;
    public static String G;
    public static String S;
    public static String V;
    public static String m;
    public static String C;
    public static String u;
    public static String U;
    public static String K;
    public static String D;
    public static String v;
    public static String t;
    String[] A;
    boolean Q;

    public k4_0() {
        this.g = new ArrayList();
        this.Q = false;
        this.A = new String[]{(String)k4_0.G, (String)k4_0.S, (String)k4_0.u};
    }

    public String c(int n10) {
        return ((String[])this.A)[n10];
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.g).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.A)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.A).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.g).get(n10);
    }

    public void r(ArrayList arrayList) {
        this.g = arrayList;
        this.fireTableDataChanged();
    }

    public int G(int n10) {
        int n11;
        block4: {
            int n12 = -1;
            Iterator iterator = ((ArrayList)this.g).iterator();
            ky_2[] ky_2Array = ka_1.y();
            while (iterator.hasNext()) {
                li_1 li_12 = (li_1)iterator.next();
                ++n12;
                try {
                    n11 = (Integer)li_12.m();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (ky_2Array == null) {
                    if ((n11 != n10 || ky_2Array != null) && ky_2Array == null) continue;
                }
                break block4;
            }
            n11 = n12;
        }
        return n11;
    }

    public void E(li_1 li_12) {
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

    public ArrayList R() {
        return (ArrayList)this.g;
    }

    public void U(ArrayList arrayList) {
        this.g = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[13];
                var4_1 = 0;
                var3_2 = "\u4e54\u4f5c\u0002\u51db\u5b24\u0002\u5453\u798c\u0003\u8f80\u63d9\u651b\u0002\u4f13\u7f12\u0003\u4e7c\u5379N\u0003\u000e5/\u0002\u7576\u624b\u0003\u0017,\u651b\u0002\u5423\u4e98\u0004\u5dbb\u4f20\u7685\u5f43";
                var5_3 = "\u4e54\u4f5c\u0002\u51db\u5b24\u0002\u5453\u798c\u0003\u8f80\u63d9\u651b\u0002\u4f13\u7f12\u0003\u4e7c\u5379N\u0003\u000e5/\u0002\u7576\u624b\u0003\u0017,\u651b\u0002\u5423\u4e98\u0004\u5dbb\u4f20\u7685\u5f43".length();
                var2_4 = 2;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 38;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "6\u0007\u0015\u0002\u4e7e\u8f2a";
                    var5_3 = "6\u0007\u0015\u0002\u4e7e\u8f2a".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 13;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 120;
                            break;
                        }
                        case 1: {
                            v15 = 90;
                            break;
                        }
                        case 2: {
                            v15 = 77;
                            break;
                        }
                        case 3: {
                            v15 = 48;
                            break;
                        }
                        case 4: {
                            v15 = 78;
                            break;
                        }
                        case 5: {
                            v15 = 84;
                            break;
                        }
                        default: {
                            v15 = 39;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        k4_0.a = var0[6];
        k4_0.y = var0[7];
        k4_0.G = var0[1];
        k4_0.S = var0[11];
        k4_0.V = var0[2];
        k4_0.m = var0[4];
        k4_0.C = var0[10];
        k4_0.u = var0[9];
        k4_0.U = var0[3];
        k4_0.K = var0[8];
        k4_0.D = var0[0];
        k4_0.v = var0[12];
        k4_0.t = var0[5];
    }
}

