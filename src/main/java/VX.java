/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class VX
extends AbstractTableModel {
    ArrayList r;
    public static String z;
    public static String c;
    public static String O;
    String[] M;
    String f;

    public VX() {
        this.r = new ArrayList();
        this.M = new String[]{(String)VX.z, (String)VX.c, (String)VX.O};
    }

    public String m(int n10) {
        return ((String[])this.M)[n10];
    }

    public int N(String string) {
        int n10;
        block6: {
            int n11 = -1;
            int n12 = 0;
            Iterator iterator = ((ArrayList)this.r).iterator();
            String[] stringArray = Y_.j();
            while (iterator.hasNext()) {
                ln_1 ln_12 = (ln_1)iterator.next();
                if (stringArray != null) {
                    String string2;
                    try {
                        string2 = (String)ln_12.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    n10 = string2.equals(string) ? 1 : 0;
                    if (stringArray == null) break block6;
                    if (n10 != 0) {
                        n11 = n12;
                        if (stringArray != null) break;
                    }
                    ++n12;
                }
                if (stringArray != null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public void b(ArrayList arrayList) {
        this.r = arrayList;
        this.fireTableDataChanged();
    }

    public ln_1 O(int n10) {
        return (ln_1)((ArrayList)this.r).get(n10);
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.r).size();
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.M)[n10];
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.M).length;
    }

    public Class getColumnClass(int n10) {
        return ln_1.class;
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        ln_1 ln_12 = (ln_1)((ArrayList)this.r).get(n10);
        return ((ArrayList)this.r).get(n10);
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        block15: {
            int n12;
            String[] stringArray;
            block13: {
                int n13;
                ln_1 ln_12;
                block16: {
                    boolean bl;
                    block14: {
                        super.setValueAt(object, n10, n11);
                        ln_12 = (ln_1)((ArrayList)this.r).get(n10);
                        stringArray = Y_.j();
                        boolean bl2 = n11;
                        if (stringArray == null) break block14;
                        if (bl2) break block15;
                        bl2 = bl = (boolean)((Boolean)object);
                    }
                    if (stringArray == null) break block16;
                    bl = true;
                    if (true) {
                        Object object2;
                        try {
                            object2 = ln_12.g();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.f = object2;
                        try {
                            ln_12.F(bl);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block15;
                }
                Iterator iterator = ((ArrayList)this.r).iterator();
                while (iterator.hasNext()) {
                    block18: {
                        ln_1 ln_13;
                        block17: {
                            ln_1 ln_14;
                            ln_13 = ln_14 = (ln_1)iterator.next();
                            if (stringArray == null) break block17;
                            n13 = ln_13.equals(ln_12);
                            if (stringArray == null) break block13;
                            if (n13 != 0) break block18;
                            ln_13 = ln_14;
                        }
                        try {
                            ln_13.F(false);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (stringArray != null) continue;
                }
                n13 = n12 = 0;
            }
            while (n12 < ((ArrayList)this.r).size()) {
                this.fireTableCellUpdated(n12, 0);
                ++n12;
                if (stringArray != null) continue;
            }
        }
    }

    @Override
    public boolean isCellEditable(int n10, int n11) {
        String[] stringArray = Y_.j();
        boolean bl = n11;
        if (stringArray != null) {
            if (!bl) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public String C() {
        return (String)this.f;
    }

    public void B(String string) {
        this.f = string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u7c1a\u57c2\u0002\u951e\u5eef\u0002\u546c\u79b9";
            var5_3 = "\u7c1a\u57c2\u0002\u951e\u5eef\u0002\u546c\u79b9".length();
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
                            v11 = 25;
                            break;
                        }
                        case 1: {
                            v11 = 49;
                            break;
                        }
                        case 2: {
                            v11 = 44;
                            break;
                        }
                        case 3: {
                            v11 = 58;
                            break;
                        }
                        case 4: {
                            v11 = 115;
                            break;
                        }
                        case 5: {
                            v11 = 54;
                            break;
                        }
                        default: {
                            v11 = 98;
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
        VX.z = var0[2];
        VX.c = var0[0];
        VX.O = var0[1];
    }
}

