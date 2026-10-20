/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class gR
extends AbstractTableModel {
    ArrayList B;
    public static String u;
    public static String Y;
    public static String s;
    public static String Z;
    public static String R;
    String[] I;
    boolean l;

    public gR() {
        this.B = new ArrayList();
        this.l = false;
        this.I = new String[]{(String)gR.u, (String)gR.Y, (String)gR.s, (String)gR.Z, (String)gR.R};
    }

    public String V(int n10) {
        return ((String[])this.I)[n10];
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.B).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.I)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.I).length;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.B).get(n10);
    }

    public void G(ArrayList arrayList, KV kV) {
        this.B = arrayList;
        this.fireTableDataChanged();
    }

    public int W(int n10) {
        int n11;
        block4: {
            int n12 = -1;
            String[] stringArray = y6_0.Z();
            for (ya_1 ya_12 : (ArrayList)this.B) {
                ++n12;
                try {
                    n11 = (Integer)ya_12.q();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (stringArray != null) {
                    if ((n11 != n10 || stringArray == null) && stringArray != null) continue;
                }
                break block4;
            }
            n11 = n12;
        }
        return n11;
    }

    public int h(String string) {
        int n10;
        block4: {
            int n11 = -1;
            Iterator iterator = ((ArrayList)this.B).iterator();
            String[] stringArray = y6_0.Z();
            while (iterator.hasNext()) {
                String string2;
                ya_1 ya_12 = (ya_1)iterator.next();
                ++n11;
                try {
                    string2 = (String)ya_12.Q();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = string2.equals(string) ? 1 : 0;
                if (stringArray != null) {
                    if ((n10 == 0 || stringArray == null) && stringArray != null) continue;
                }
                break block4;
            }
            n10 = n11;
        }
        return n10;
    }

    public ArrayList F() {
        return (ArrayList)this.B;
    }

    public void P(ArrayList arrayList) {
        this.B = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "\u4f6e\u7f5f\u0002\u7acc\u53d2\u0002\u4e29\u4f11";
                var5_3 = "\u4f6e\u7f5f\u0002\u7acc\u53d2\u0002\u4e29\u4f11".length();
                var2_4 = 2;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 83;
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
                    var3_2 = "\u4e15\u8f71\u0002W\\";
                    var5_3 = "\u4e15\u8f71\u0002W\\".length();
                    var2_4 = 2;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 110;
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
                            v15 = 112;
                            break;
                        }
                        case 1: {
                            v15 = 98;
                            break;
                        }
                        case 2: {
                            v15 = 42;
                            break;
                        }
                        case 3: {
                            v15 = 44;
                            break;
                        }
                        case 4: {
                            v15 = 30;
                            break;
                        }
                        case 5: {
                            v15 = 60;
                            break;
                        }
                        default: {
                            v15 = 28;
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
        gR.u = var0[0];
        gR.Y = var0[4];
        gR.s = var0[1];
        gR.Z = var0[2];
        gR.R = var0[3];
    }
}

