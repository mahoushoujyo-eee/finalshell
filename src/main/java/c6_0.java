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
 * Renamed from c6
 */
public class c6_0
extends AbstractTableModel {
    ArrayList y;
    public static String c;
    public static String v;
    public static String E;
    public static String D;
    public static String a;
    public static String S;
    String[] K;
    String w;

    public c6_0() {
        this.y = new ArrayList();
        this.K = new String[]{(String)c6_0.S, (String)c6_0.c, (String)c6_0.v, (String)c6_0.E, (String)c6_0.D};
    }

    public String M(int n10) {
        return ((String[])this.K)[n10];
    }

    public int C(String string) {
        int n10;
        block6: {
            int n11 = -1;
            int n12 = 0;
            Iterator iterator = ((ArrayList)this.y).iterator();
            ky_2[] ky_2Array = z_.t();
            while (iterator.hasNext()) {
                ld_1 ld_12 = (ld_1)iterator.next();
                if (ky_2Array == null) {
                    String string2;
                    try {
                        string2 = (String)ld_12.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = string2.equals(string) ? 1 : 0;
                    if (ky_2Array != null) break block6;
                    if (n10 != 0) {
                        n11 = n12;
                        if (ky_2Array == null) break;
                    }
                    ++n12;
                }
                if (ky_2Array == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public void Z(ArrayList arrayList) {
        this.y = arrayList;
        this.fireTableDataChanged();
    }

    public ld_1 p(int n10) {
        return (ld_1)((ArrayList)this.y).get(n10);
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.y).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.K)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.K).length;
    }

    public Class getColumnClass(int n10) {
        if (n10 == 0) {
            return Boolean.class;
        }
        return ld_1.class;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        block4: {
            boolean bl;
            block3: {
                String string;
                ld_1 ld_12 = (ld_1)((ArrayList)this.y).get(n10);
                ky_2[] ky_2Array = z_.t();
                bl = n11;
                if (ky_2Array != null) break block3;
                if (bl) break block4;
                try {
                    string = (String)ld_12.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bl = string.equals((String)this.w);
            }
            return bl;
        }
        return ((ArrayList)this.y).get(n10);
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        block15: {
            int n12;
            ky_2[] ky_2Array;
            block13: {
                int n13;
                ld_1 ld_12;
                block16: {
                    boolean bl;
                    block14: {
                        ky_2[] ky_2Array2 = z_.t();
                        super.setValueAt(object, n10, n11);
                        ld_12 = (ld_1)((ArrayList)this.y).get(n10);
                        ky_2Array = ky_2Array2;
                        boolean bl2 = n11;
                        if (ky_2Array != null) break block14;
                        if (bl2) break block15;
                        bl2 = bl = (boolean)((Boolean)object);
                    }
                    if (ky_2Array != null) break block16;
                    bl = true;
                    if (true) {
                        Object object2;
                        try {
                            object2 = ld_12.g();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.w = object2;
                        try {
                            ld_12.s(bl);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block15;
                }
                Iterator iterator = ((ArrayList)this.y).iterator();
                while (iterator.hasNext()) {
                    block18: {
                        ld_1 ld_13;
                        block17: {
                            ld_1 ld_14;
                            ld_13 = ld_14 = (ld_1)iterator.next();
                            if (ky_2Array != null) break block17;
                            n13 = ld_13.equals(ld_12);
                            if (ky_2Array != null) break block13;
                            if (n13 != 0) break block18;
                            ld_13 = ld_14;
                        }
                        try {
                            ld_13.s(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (ky_2Array == null) continue;
                }
                n13 = n12 = 0;
            }
            while (n12 < ((ArrayList)this.y).size()) {
                this.fireTableCellUpdated(n12, 0);
                ++n12;
                if (ky_2Array == null) continue;
            }
        }
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        ky_2[] ky_2Array = z_.t();
        boolean bl = n11;
        if (ky_2Array == null) {
            if (!bl) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public String c() {
        return (String)this.w;
    }

    public void f(String string) {
        this.w = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[6];
                var4_1 = 0;
                var3_2 = "\u4e6f\u671c\u0002\u7c2f\u57ad\u0002\u5f07\u526b\u0002\u5459\u79d6";
                var5_3 = "\u4e6f\u671c\u0002\u7c2f\u57ad\u0002\u5f07\u526b\u0002\u5459\u79d6".length();
                var2_4 = 2;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 62;
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
                    var3_2 = "\u7ab2\u53cc\u0003\u7575\u6218\u5418";
                    var5_3 = "\u7ab2\u53cc\u0003\u7575\u6218\u5418".length();
                    var2_4 = 2;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 55;
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
                            v15 = 106;
                            break;
                        }
                        case 1: {
                            v15 = 24;
                            break;
                        }
                        case 2: {
                            v15 = 34;
                            break;
                        }
                        case 3: {
                            v15 = 123;
                            break;
                        }
                        case 4: {
                            v15 = 70;
                            break;
                        }
                        case 5: {
                            v15 = 113;
                            break;
                        }
                        default: {
                            v15 = 35;
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
        c6_0.c = var0[3];
        c6_0.v = var0[1];
        c6_0.E = var0[0];
        c6_0.D = var0[4];
        c6_0.a = var0[5];
        c6_0.S = var0[2];
    }
}

