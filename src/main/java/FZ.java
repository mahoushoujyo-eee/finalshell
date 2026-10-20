/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FZ
extends AbstractTableModel {
    ArrayList W;
    public static String h;
    public static String e;
    public static String T;
    public static String f;
    public static String n;
    public static String a;
    public static String v;
    String[] c;

    public FZ() {
        this.W = new ArrayList();
        this.c = new String[]{(String)FZ.h, (String)FZ.e, (String)FZ.f, (String)FZ.v, (String)FZ.n};
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.W).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.c)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.c).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.W).get(n10);
    }

    public void X(ArrayList arrayList) {
        this.W = arrayList;
        this.fireTableDataChanged();
    }

    public void a(cn_2 cn_22) {
        int n10;
        int n11;
        try {
            n11 = (Integer)cn_22.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            n10 = (Integer)cn_22.Y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.fireTableRowsUpdated(n11, n10);
    }

    public ArrayList a() {
        return (ArrayList)this.W;
    }

    public void s(ArrayList arrayList) {
        this.W = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[6];
                var4_1 = 0;
                var3_2 = "\u4f05\u7f49\u0004\u5ebe\u8ff8\u007fX\u0002\u5399\u9026\u0003\u4e6a\u53227";
                var5_3 = "\u4f05\u7f49\u0004\u5ebe\u8ff8\u007fX\u0002\u5399\u9026\u0003\u4e6a\u53227".length();
                var2_4 = 2;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 35;
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
                    var3_2 = "\u4e75\u671b\u5419\u0002\u0007q";
                    var5_3 = "\u4e75\u671b\u5419\u0002\u0007q".length();
                    var2_4 = 3;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 37;
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
                            v15 = 107;
                            break;
                        }
                        case 1: {
                            v15 = 4;
                            break;
                        }
                        case 2: {
                            v15 = 49;
                            break;
                        }
                        case 3: {
                            v15 = 8;
                            break;
                        }
                        case 4: {
                            v15 = 94;
                            break;
                        }
                        case 5: {
                            v15 = 101;
                            break;
                        }
                        default: {
                            v15 = 20;
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
        FZ.h = "";
        FZ.e = var0[5];
        FZ.T = var0[4];
        FZ.f = var0[1];
        FZ.n = var0[0];
        FZ.a = var0[2];
        FZ.v = var0[3];
    }
}

