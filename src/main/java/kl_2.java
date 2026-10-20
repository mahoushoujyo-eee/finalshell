/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pl_0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from kl
 */
public class kl_2
extends pl_0 {
    String[] a;
    private ArrayList s;
    tf_2 E;
    boolean u;
    boolean Z;
    boolean R;
    int J;
    zv_0 y;
    public static String W;
    public static String V;
    public static String H;
    public static String w;
    public static String e;
    public static String A;
    private static final long c;

    public kl_2(boolean bl) {
        block4: {
            int n10;
            kl_2 kl_22;
            block2: {
                block3: {
                    this.s = new ArrayList();
                    this.u = true;
                    String string = km_0.U();
                    this.Z = false;
                    this.R = true;
                    String string2 = string;
                    kl_22 = this;
                    n10 = bl;
                    if (string2 != null) break block2;
                    kl_22.u = n10 != 0;
                    if (!bl) break block3;
                    this.a = new String[]{(String)kl_2.W, (String)kl_2.V, (String)kl_2.H, (String)kl_2.w};
                    if (string2 == null) break block4;
                }
                kl_22 = this;
                n10 = (int)c;
            }
            String[] stringArray = new String[n10];
            stringArray[0] = (String)kl_2.W;
            stringArray[1] = (String)kl_2.V;
            stringArray[2] = (String)kl_2.H;
            stringArray[3] = (String)kl_2.w;
            stringArray[4] = (String)kl_2.e;
            stringArray[5] = (String)kl_2.A;
            kl_22.a = stringArray;
        }
    }

    @Override
    public String z(int n10) {
        return ((String[])this.a)[n10];
    }

    public void O(tf_2 tf_22) {
        block30: {
            block33: {
                List list;
                Serializable serializable;
                String string;
                block35: {
                    block29: {
                        kl_2 kl_22;
                        List list2;
                        block36: {
                            block37: {
                                List list3;
                                block34: {
                                    List list4;
                                    int n10;
                                    block31: {
                                        block32: {
                                            List list5;
                                            List list6;
                                            String string2 = km_0.U();
                                            this.E = tf_22;
                                            string = string2;
                                            ((ArrayList)this.s).clear();
                                            try {
                                                n10 = ((Boolean)tf_22.z()).booleanValue();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            if (string != null) break block31;
                                            if (n10 != 0) break block32;
                                            try {
                                                list6 = (List)tf_22.f();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            ((ArrayList)this.s).addAll(list6);
                                            try {
                                                list5 = (List)tf_22.M();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            ((ArrayList)this.s).addAll(list5);
                                            if (string == null) break block33;
                                        }
                                        n10 = this.J;
                                    }
                                    if (string != null) break block34;
                                    if (n10 == YB.M) break block35;
                                    try {
                                        list4 = (List)tf_22.f();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    n10 = ((ArrayList)this.s).addAll(list4) ? 1 : 0;
                                }
                                try {
                                    list3 = (List)tf_22.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                list2 = list3;
                                kl_22 = this;
                                if (string != null) break block36;
                                if ((zv_0)kl_22.y == null) break block37;
                                Object object = list2.iterator();
                                while (object.hasNext()) {
                                    boolean bl;
                                    serializable = (ck_2)object.next();
                                    try {
                                        bl = (Boolean)this.y.l(serializable);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    boolean bl2 = bl;
                                    if (string == null) {
                                        boolean bl3 = bl2;
                                        if (string == null && bl3) {
                                            bl3 = ((ArrayList)this.s).add(serializable);
                                        }
                                        if (string == null) continue;
                                    }
                                    break block29;
                                }
                                if (string == null) break block29;
                            }
                            kl_22 = this;
                        }
                        ((ArrayList)kl_22.s).addAll(list2);
                    }
                    if (string == null) break block33;
                }
                try {
                    list = (List)tf_22.f();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                for (Object object : list) {
                    block39: {
                        boolean bl;
                        block40: {
                            block38: {
                                File file;
                                try {
                                    file = (File)object.M();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                serializable = file;
                                if (string != null) break block30;
                                bl = ((File)serializable).isDirectory();
                                if (string != null) break block38;
                                if (!bl) break block39;
                                bl = ((File)serializable).isFile();
                            }
                            if (string != null) break block40;
                            if (bl) break block39;
                            bl = ((File)serializable).exists();
                        }
                        if (string == null && bl) {
                            bl = ((ArrayList)this.s).add(object);
                        }
                    }
                    if (string == null) continue;
                }
            }
            this.fireTableDataChanged();
        }
    }

    public int b(String string) {
        int n10;
        block8: {
            int n11 = -1;
            int n12 = 0;
            Iterator iterator = ((ArrayList)this.s).iterator();
            String string2 = km_0.U();
            while (iterator.hasNext()) {
                block14: {
                    int n13;
                    block13: {
                        String string3;
                        block11: {
                            String string4;
                            Object object;
                            Serializable serializable;
                            block12: {
                                boolean bl;
                                Object e2;
                                block9: {
                                    block10: {
                                        String string5;
                                        e2 = iterator.next();
                                        string3 = null;
                                        n10 = e2.getClass().equals(tf_2.class) ? 1 : 0;
                                        if (string2 != null) break block8;
                                        if (string2 != null) break block9;
                                        if (n10 == 0) break block10;
                                        serializable = (tf_2)e2;
                                        try {
                                            string5 = (String)serializable.k();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        string3 = string5;
                                        break block11;
                                    }
                                    object = e2.getClass();
                                    if (string2 != null) break block12;
                                    bl = object.equals(ck_2.class);
                                }
                                if (!bl) break block11;
                                object = e2;
                            }
                            serializable = (ck_2)object;
                            try {
                                string4 = (String)serializable.d();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            string3 = string4;
                        }
                        n13 = string3.equals(string);
                        if (string2 != null) break block13;
                        if (n13 == 0) break block14;
                        n13 = n12;
                    }
                    n11 = n13;
                    if (string2 == null) break;
                }
                ++n12;
                if (string2 == null) continue;
            }
            n10 = n11;
        }
        return n10;
    }

    public void y() {
        this.Z = true;
    }

    public void I(ck_2 ck_22) {
        ((ArrayList)this.s).add(ck_22);
        this.fireTableRowsInserted(((ArrayList)this.s).size(), ((ArrayList)this.s).size());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isCellEditable(int n10, int n11) {
        String string = km_0.U();
        int n12 = this.R;
        if (string == null) {
            if (n12 == 0) {
                return false;
            }
            n12 = n11;
        }
        if (string != null) return n12 != 0;
        if (n12 != 0) return 0 != 0;
        n12 = this.Z ? 1 : 0;
        if (string != null) return n12 != 0;
        if (n12 == 0) return 0 != 0;
        this.Z = false;
        return true;
    }

    @Override
    public void setValueAt(Object object, int n10, int n11) {
        super.setValueAt(object, n10, n11);
    }

    @Override
    public int getRowCount() {
        return ((ArrayList)this.s).size();
    }

    @Override
    public int getColumnCount() {
        return ((String[])this.a).length;
    }

    public Object G(int n10) {
        if (n10 > -1) {
            return ((ArrayList)this.s).get(n10);
        }
        return null;
    }

    public void w(Object object) {
        ((ArrayList)this.s).remove(object);
    }

    public void m(int n10) {
        String string = km_0.U();
        for (int i2 = 0; i2 < ((String[])this.a).length; ++i2) {
            this.fireTableCellUpdated(n10, i2);
            if (string == null) continue;
        }
    }

    @Override
    public Object getValueAt(int n10, int n11) {
        Object e2 = ((ArrayList)this.s).get(n10);
        return e2;
    }

    @Override
    public String getColumnName(int n10) {
        return ((String[])this.a)[n10];
    }

    public tf_2 V() {
        return (tf_2)this.E;
    }

    public void s(tf_2 tf_22) {
        this.E = tf_22;
    }

    public int V() {
        return this.J;
    }

    public void E(int n10) {
        this.J = n10;
    }

    public boolean o() {
        return this.R;
    }

    public void Q(boolean bl) {
        this.R = bl;
    }

    public zv_0 w() {
        return (zv_0)this.y;
    }

    public void C(zv_0 zv_02) {
        this.y = zv_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "\u5947\u5c16\u0004\u4f8e\u6520\u65a3\u95ac\u0006\u7548\u622ez\u7570\u6230\u7ed7\u0002\u7c1b\u5792";
                var7_3 = "\u5947\u5c16\u0004\u4f8e\u6520\u65a3\u95ac\u0006\u7548\u622ez\u7570\u6230\u7ed7\u0002\u7c1b\u5792".length();
                var4_4 = 2;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 118;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "\u6592\u4e9a\u542d\u0002\u6756\u963c";
                    var7_3 = "\u6592\u4e9a\u542d\u0002\u6756\u963c".length();
                    var4_4 = 3;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 3;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 22;
                            break;
                        }
                        case 1: {
                            v15 = 111;
                            break;
                        }
                        case 2: {
                            v15 = 35;
                            break;
                        }
                        case 3: {
                            v15 = 46;
                            break;
                        }
                        case 4: {
                            v15 = 113;
                            break;
                        }
                        case 5: {
                            v15 = 101;
                            break;
                        }
                        default: {
                            v15 = 42;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 2022834974747855474L;
        ** while (true)
        kl_2.c = -8850058581151249804L ^ var0_7;
        kl_2.W = var2[4];
        kl_2.V = var2[0];
        kl_2.H = var2[3];
        kl_2.w = var2[1];
        kl_2.e = var2[5];
        kl_2.A = var2[2];
    }
}

