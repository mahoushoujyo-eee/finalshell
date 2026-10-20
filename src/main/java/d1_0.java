/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from d1
 */
public class d1_0
extends AbstractTableModel {
    ArrayList X;
    public static String r;
    public static String N;
    public static String I;
    String[] n;

    d1_0() {
        this.X = new ArrayList();
        this.n = new String[]{(String)d1_0.r, (String)d1_0.N};
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.X).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.n)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.n).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.X).get(n10);
    }

    public void X(ArrayList arrayList) {
        this.X = arrayList;
        this.fireTableDataChanged();
    }

    public ArrayList d() {
        return (ArrayList)this.X;
    }

    public void D(ArrayList arrayList) {
        this.X = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u5395\u7516F\u5925\u5c2c\u0002\u8d95\u5fba\u0004\u65fd\u4ec8\u7c92\u7edd";
            var5_3 = "\u5395\u7516F\u5925\u5c2c\u0002\u8d95\u5fba\u0004\u65fd\u4ec8\u7c92\u7edd".length();
            var2_4 = 5;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 120;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 2;
                            break;
                        }
                        case 1: {
                            v11 = 70;
                            break;
                        }
                        case 2: {
                            v11 = 17;
                            break;
                        }
                        case 3: {
                            v11 = 122;
                            break;
                        }
                        case 4: {
                            v11 = 91;
                            break;
                        }
                        case 5: {
                            v11 = 9;
                            break;
                        }
                        default: {
                            v11 = 30;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        d1_0.r = var0[1];
        d1_0.N = var0[0];
        d1_0.I = var0[2];
    }
}

