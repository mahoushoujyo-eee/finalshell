/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from c1
 */
public class c1_0
extends AbstractTableModel {
    ArrayList g;
    public static String e;
    public static String q;
    public static String Y;
    public static String z;
    public static String V;
    String[] t;
    int p;

    public c1_0() {
        this.g = new ArrayList();
        this.t = new String[]{(String)c1_0.e, (String)c1_0.q, (String)c1_0.Y, (String)c1_0.z, (String)c1_0.V};
    }

    public String t(int n10) {
        return ((String[])this.t)[n10];
    }

    public int c(int n10) {
        int n11;
        block6: {
            int n12 = -1;
            int n13 = 0;
            String string = zw_0.V();
            for (YE yE : (ArrayList)this.g) {
                if (string != null) {
                    try {
                        n11 = (Integer)yE.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (string == null) break block6;
                    if (n11 == n10) {
                        n12 = n13;
                        if (string != null) break;
                    }
                    ++n13;
                }
                if (string != null) continue;
            }
            n11 = n12;
        }
        return n11;
    }

    public void D(ArrayList arrayList) {
        this.g = arrayList;
        this.fireTableDataChanged();
    }

    public YE s(int n10) {
        return (YE)((ArrayList)this.g).get(n10);
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.g).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.t)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.t).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.g).get(n10);
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        return false;
    }

    public int x() {
        return this.p;
    }

    public void b(int n10) {
        this.p = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "\u7684\u6802\u7ab9\u53a3\u0002\u7c11\u578e\u0004\u76bb\u5429\u7ab9\u53a3";
                var5_3 = "\u7684\u6802\u7ab9\u53a3\u0002\u7c11\u578e\u0004\u76bb\u5429\u7ab9\u53a3".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 118;
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
                    var3_2 = "\u5420\u79b2\u0004\u76c3\u6845\u5721\u5747";
                    var5_3 = "\u5420\u79b2\u0004\u76c3\u6845\u5721\u5747".length();
                    var2_4 = 2;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 49;
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
                            v15 = 28;
                            break;
                        }
                        case 1: {
                            v15 = 115;
                            break;
                        }
                        case 2: {
                            v15 = 32;
                            break;
                        }
                        case 3: {
                            v15 = 54;
                            break;
                        }
                        case 4: {
                            v15 = 22;
                            break;
                        }
                        case 5: {
                            v15 = 23;
                            break;
                        }
                        default: {
                            v15 = 42;
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
        c1_0.e = var0[3];
        c1_0.q = var0[1];
        c1_0.Y = var0[2];
        c1_0.z = var0[4];
        c1_0.V = var0[0];
    }
}

