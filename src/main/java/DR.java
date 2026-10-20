/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DR
extends AbstractTableModel {
    ArrayList s;
    public static String Z;
    public static String M;
    public static String G;
    public static String a;
    public static String I;
    public static String i;
    public static String j;
    String[] S;

    public DR() {
        this.s = new ArrayList();
        this.S = new String[]{(String)DR.Z, (String)DR.M, (String)DR.a, (String)DR.j, (String)DR.I};
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.s).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.S)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.S).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.s).get(n10);
    }

    public void n(ArrayList arrayList) {
        this.s = arrayList;
        this.fireTableDataChanged();
    }

    public void o(L9 l9) {
        int n10;
        int n11;
        try {
            n11 = (Integer)l9.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)l9.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.fireTableRowsUpdated(n11, n10);
    }

    public ArrayList N() {
        return (ArrayList)this.s;
    }

    public void r(ArrayList arrayList) {
        this.s = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[6];
                var4_1 = 0;
                var3_2 = "\u4f60\u7f78\u0004\u5edb\u8fc9w4\u0002\u53fc\u9017\u0002dF";
                var5_3 = "\u4f60\u7f78\u0004\u5edb\u8fc9w4\u0002\u53fc\u9017\u0002dF".length();
                var2_4 = 2;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 112;
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
                    var3_2 = "\u4e6c\u6756\u546d\u0003\u4e75\u5369E";
                    var5_3 = "\u4e6c\u6756\u546d\u0003\u4e75\u5369E".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 10;
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
                            v15 = 93;
                            break;
                        }
                        case 1: {
                            v15 = 102;
                            break;
                        }
                        case 2: {
                            v15 = 106;
                            break;
                        }
                        case 3: {
                            v15 = 55;
                            break;
                        }
                        case 4: {
                            v15 = 16;
                            break;
                        }
                        case 5: {
                            v15 = 27;
                            break;
                        }
                        default: {
                            v15 = 24;
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
        DR.Z = "";
        DR.M = var0[3];
        DR.G = var0[4];
        DR.a = var0[1];
        DR.I = var0[0];
        DR.i = var0[2];
        DR.j = var0[5];
    }
}

