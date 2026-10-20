/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from oa
 */
public class oa_2
extends AbstractTableModel {
    ArrayList L;
    public static String d;
    public static String W;
    String[] y;
    int U;

    public oa_2() {
        this.L = new ArrayList();
        this.y = new String[]{(String)oa_2.W, (String)oa_2.d};
    }

    public String o(int n10) {
        return ((String[])this.y)[n10];
    }

    public int g(int n10) {
        int n11;
        block6: {
            int n12 = -1;
            int n13 = 0;
            Iterator iterator = ((ArrayList)this.L).iterator();
            String[] stringArray = zK.B();
            while (iterator.hasNext()) {
                zG zG2 = (zG)iterator.next();
                if (stringArray != null) {
                    try {
                        n11 = (Integer)zG2.K();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray == null) break block6;
                    if (n11 == n10) {
                        n12 = n13;
                        if (stringArray != null) break;
                    }
                    ++n13;
                }
                if (stringArray != null) continue;
            }
            n11 = n12;
        }
        return n11;
    }

    public void G(ArrayList arrayList) {
        this.L = arrayList;
        this.fireTableDataChanged();
    }

    public zG q(int n10) {
        return (zG)((ArrayList)this.L).get(n10);
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.L).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.y)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.y).length;
    }

    public Class getColumnClass(int n10) {
        return zG.class;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        return ((ArrayList)this.L).get(n10);
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        return false;
    }

    public int M() {
        return this.U;
    }

    public void B(int n10) {
        this.U = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u6311\u9521\u0002\u64d5\u4f53";
            var5_3 = "\u6311\u9521\u0002\u64d5\u4f53".length();
            var2_4 = 2;
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
            v4 = 118;
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
                            v11 = 110;
                            break;
                        }
                        case 1: {
                            v11 = 121;
                            break;
                        }
                        case 2: {
                            v11 = 78;
                            break;
                        }
                        case 3: {
                            v11 = 91;
                            break;
                        }
                        case 4: {
                            v11 = 2;
                            break;
                        }
                        case 5: {
                            v11 = 30;
                            break;
                        }
                        default: {
                            v11 = 60;
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
        oa_2.d = var0[0];
        oa_2.W = var0[1];
    }
}

