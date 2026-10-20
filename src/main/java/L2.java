/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.FileDescriptor;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import jtermios.X;
import jtermios.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L2 {
    private static volatile Object V;
    private volatile String b;
    private volatile int v;
    private volatile nv_0 E;
    private static volatile Hashtable C;
    private static volatile Hashtable Y;
    private static volatile Hashtable L;
    private volatile Hashtable j = new Hashtable();
    private static final String a;
    private static final long c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        ky_2[] ky_2Array = xA.P();
        boolean bl = object instanceof L2;
        if (ky_2Array != null) {
            if (!bl) return false;
            bl = this.b.equals(((L2)object).b);
        }
        if (ky_2Array == null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Z(String string, int n10, nv_0 nv_02) {
        Object object = V;
        synchronized (object) {
            C.put(string, new L2(string, n10, nv_02));
        }
    }

    private L2(String string, int n10, nv_0 nv_02) {
        this.b = string;
        this.v = n10;
        this.E = nv_02;
    }

    /*
     * Unable to fully structure code
     */
    public static L2 f(String var0) throws lq_1 {
        var2_1 = L2.V;
        synchronized (var2_1) {
            block39: {
                block44: {
                    block46: {
                        block47: {
                            block45: {
                                block57: {
                                    block56: {
                                        block55: {
                                            block54: {
                                                block43: {
                                                    block42: {
                                                        block50: {
                                                            block37: {
                                                                var1_2 = xA.P();
                                                                var3_3 = false;
                                                                for (L2 var5_5 : L2.Y.values()) {
                                                                    block38: {
                                                                        block36: {
                                                                            block48: {
                                                                                v0 = var5_5;
                                                                                if (var1_2 == null) break block36;
                                                                                v1 = v0.U().equals(var0);
                                                                                if (var1_2 == null) break block37;
                                                                                break block48;
                                                                                catch (lq_1 v2) {
                                                                                    throw L2.a(v2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block49: {
                                                                                    if (!v1) break block38;
                                                                                    break block49;
                                                                                    catch (lq_1 v3) {
                                                                                        throw L2.a(v3);
                                                                                    }
                                                                                }
                                                                                v0 = var5_5;
                                                                            }
                                                                            catch (lq_1 v4) {
                                                                                throw L2.a(v4);
                                                                            }
                                                                        }
                                                                        return v0;
                                                                    }
                                                                    if (var1_2 != null) continue;
                                                                }
                                                                v1 = var3_3;
                                                            }
                                                            if (!v1) break block50;
                                                            var4_4 = L2.N();
                                                            while (var4_4.hasMoreElements()) {
                                                                block41: {
                                                                    block40: {
                                                                        block51: {
                                                                            var5_5 = (L2)var4_4.nextElement();
                                                                            if (var1_2 == null) break block39;
                                                                            v5 = var5_5;
                                                                            if (var1_2 == null) break block40;
                                                                            break block51;
                                                                            catch (lq_1 v6) {
                                                                                throw L2.a(v6);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block52: {
                                                                                if (!v5.U().equals(var0)) break block41;
                                                                                break block52;
                                                                                catch (lq_1 v7) {
                                                                                    throw L2.a(v7);
                                                                                }
                                                                            }
                                                                            v5 = var5_5;
                                                                        }
                                                                        catch (lq_1 v8) {
                                                                            throw L2.a(v8);
                                                                        }
                                                                    }
                                                                    return v5;
                                                                }
                                                                if (var1_2 != null) continue;
                                                                break block39;
                                                            }
                                                            break block39;
                                                        }
                                                        var4_4 = (L2)L2.C.get(var0);
                                                        v9 = var4_4;
                                                        if (var1_2 == null) break block42;
                                                        try {
                                                            block53: {
                                                                if (v9 == null) break block43;
                                                                break block53;
                                                                catch (lq_1 v10) {
                                                                    throw L2.a(v10);
                                                                }
                                                            }
                                                            v9 = var4_4;
                                                        }
                                                        catch (lq_1 v11) {
                                                            throw L2.a(v11);
                                                        }
                                                    }
                                                    return v9;
                                                }
                                                var5_6 = jtermios.j.D(var0, jtermios.j.HV | jtermios.j.z | jtermios.j.J);
                                                v12 = var5_6;
                                                v13 = -1;
                                                if (var1_2 == null) break block44;
                                                if (v12 == v13) ** GOTO lbl128
                                                break block54;
                                                catch (lq_1 v14) {
                                                    throw L2.a(v14);
                                                }
                                            }
                                            v15 = jtermios.j.T(var5_6, new X());
                                            if (var1_2 == null) break block45;
                                            break block55;
                                            catch (lq_1 v16) {
                                                throw L2.a(v16);
                                            }
                                        }
                                        if (v15 != -1) ** GOTO lbl116
                                        break block56;
                                        catch (lq_1 v17) {
                                            throw L2.a(v17);
                                        }
                                    }
                                    v18 = jtermios.j.z();
                                    if (var1_2 == null) break block46;
                                    break block57;
                                    catch (lq_1 v19) {
                                        throw L2.a(v19);
                                    }
                                }
                                try {
                                    block58: {
                                        if (v18 == jtermios.j.K) break block47;
                                        break block58;
                                        catch (lq_1 v20) {
                                            throw L2.a(v20);
                                        }
                                    }
                                    v15 = jtermios.j.m(var5_6);
                                }
                                catch (lq_1 v21) {
                                    throw L2.a(v21);
                                }
                            }
                            return new L2(var0, 1, null);
                        }
                        v18 = jtermios.j.m(var5_6);
                    }
                    try {
                        if (var1_2 != null) break block39;
lbl128:
                        // 2 sources

                        v12 = jtermios.j.z();
                        v13 = jtermios.j.H1;
                    }
                    catch (lq_1 v22) {
                        throw L2.a(v22);
                    }
                }
                if (v12 != v13) {
                    return new L2(var0, 1, null);
                }
            }
            throw new lq_1();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public static L2 v(xA xA2) throws lq_1 {
        Object object = V;
        synchronized (object) {
            L2 l2;
            block7: {
                L2 l22;
                block8: {
                    ky_2[] ky_2Array = xA.P();
                    l22 = (L2)Y.get(xA2);
                    l2 = l22;
                    if (ky_2Array == null) break block7;
                    try {
                        block9: {
                            if (l2 != null) break block8;
                            break block9;
                            catch (lq_1 lq_12) {
                                throw L2.a(lq_12);
                            }
                        }
                        throw new lq_1();
                    }
                    catch (lq_1 lq_13) {
                        throw L2.a(lq_13);
                    }
                }
                l2 = l22;
            }
            return l2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public xA r(String string, int n10) throws O_ {
        Object object = V;
        synchronized (object) {
            xA xA2;
            block23: {
                block21: {
                    L2 l2;
                    L2 l22;
                    ky_2[] ky_2Array;
                    block20: {
                        L2 l23;
                        block18: {
                            block19: {
                                block17: {
                                    ky_2Array = xA.P();
                                    long l3 = System.currentTimeMillis();
                                    String string2 = (String)L.get(this);
                                    try {
                                        if (string2 == null) break block17;
                                        this.X(3);
                                    }
                                    catch (InterruptedException interruptedException) {
                                        throw L2.a(interruptedException);
                                    }
                                    try {
                                        while (System.currentTimeMillis() - l3 < (long)n10) {
                                            V.wait(c);
                                            while (!this.N()) {
                                                if (ky_2Array == null) continue;
                                                break block17;
                                            }
                                        }
                                    }
                                    catch (InterruptedException interruptedException) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                l23 = this;
                                if (ky_2Array == null) break block18;
                                try {
                                    block22: {
                                        if (!l23.N()) break block19;
                                        break block22;
                                        catch (InterruptedException interruptedException) {
                                            throw L2.a(interruptedException);
                                        }
                                    }
                                    throw new O_(this.x());
                                }
                                catch (InterruptedException interruptedException) {
                                    throw L2.a(interruptedException);
                                }
                            }
                            l23 = (L2)C.get(this.b);
                        }
                        l22 = l23;
                        try {
                            l2 = l22;
                            if (ky_2Array == null) break block20;
                            if (l2 == null) break block21;
                        }
                        catch (InterruptedException interruptedException) {
                            throw L2.a(interruptedException);
                        }
                        l2 = l22;
                    }
                    xA2 = l2.E.E(this.b, l22.v);
                    if (ky_2Array != null) break block23;
                }
                xA2 = new x3(this.b, n10);
            }
            Y.put(xA2, this);
            L.put(this, string);
            this.X(1);
            return xA2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void B(xA xA2) {
        Object object = V;
        synchronized (object) {
            ky_2[] ky_2Array = xA.P();
            L2 l2 = (L2)Y.remove(xA2);
            Object object2 = l2;
            if (ky_2Array != null) {
                if (object2 != null) {
                    l2.X(2);
                    L.remove(l2);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    public xA K(FileDescriptor fileDescriptor) throws mw_0 {
        throw new mw_0(a);
    }

    public String U() {
        return this.b;
    }

    public int r() {
        return this.v;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Enumeration N() {
        Object object = V;
        synchronized (object) {
            return new YG();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String x() {
        Object object = V;
        synchronized (object) {
            return (String)L.get(this);
        }
    }

    public boolean N() {
        return this.x() != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void x(ob_0 ob_02) {
        Object object = V;
        synchronized (object) {
            ky_2[] ky_2Array = xA.P();
            LinkedList<ob_0> linkedList = (LinkedList<ob_0>)this.j.get(this);
            Object object2 = linkedList;
            if (ky_2Array != null) {
                if (object2 == null) {
                    linkedList = new LinkedList<ob_0>();
                    this.j.put(this, linkedList);
                }
                linkedList.add(ob_02);
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Q(ob_0 ob_02) {
        Object object = V;
        synchronized (object) {
            ky_2[] ky_2Array = xA.P();
            List list = (List)this.j.get(this);
            Object object2 = list;
            if (ky_2Array != null) {
                if (object2 == null) {
                    return;
                }
                list.remove(ob_02);
                object2 = list;
            }
            if (ky_2Array != null) {
                if (object2.isEmpty()) {
                    this.j.remove(this);
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void X(int n10) {
        Object object = V;
        synchronized (object) {
            List list;
            ky_2[] ky_2Array = xA.P();
            List list2 = list = (List)this.j.get(this);
            if (ky_2Array != null) {
                if (list2 == null) {
                    return;
                }
                list2 = list;
            }
            for (ob_0 ob_02 : list2) {
                ob_02.o(n10);
                if (ky_2Array != null) {
                    if (ky_2Array != null) continue;
                }
                break;
            }
            return;
        }
    }

    static Hashtable X() {
        return C;
    }

    L2(String string, int n10, nv_0 nv_02, YG yG) {
        this(string, n10, nv_02);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = " $21xrd 9w91xso02,;f\u007f? 8-xzy;t$*(dy= 2;".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 92;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 19;
                            break;
                        }
                        case 1: {
                            n17 = 8;
                            break;
                        }
                        case 2: {
                            n17 = 11;
                            break;
                        }
                        case 3: {
                            n17 = 3;
                            break;
                        }
                        case 4: {
                            n17 = 4;
                            break;
                        }
                        case 5: {
                            n17 = 72;
                            break;
                        }
                        default: {
                            n17 = 74;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 4492757750992385759L;
        c = 0x3E597B5EF1C8B6DAL ^ l2;
        V = new Object();
        C = new Hashtable();
        Y = new Hashtable();
        L = new Hashtable();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

