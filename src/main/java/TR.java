/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

public class TR
implements Cloneable {
    Hashtable d;
    Vector l = new Vector();
    Vector N;
    boolean O = true;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;
    private static final long[] f;
    private static final Long[] g;

    public TR() {
        this.d = new Hashtable();
        this.N = new Vector();
    }

    /*
     * Unable to fully structure code
     */
    public synchronized boolean K(String var1_1) {
        block38: {
            block40: {
                block39: {
                    block35: {
                        block36: {
                            block33: {
                                block34: {
                                    block31: {
                                        block32: {
                                            var2_2 = jk_0.Y();
                                            try {
                                                try {
                                                    v0 = var1_1;
                                                    if (var2_2 == null) break block31;
                                                    if (v0 != null) break block32;
                                                }
                                                catch (NumberFormatException v1) {
                                                    throw TR.a(v1);
                                                }
                                                return false;
                                            }
                                            catch (NumberFormatException v2) {
                                                throw TR.a(v2);
                                            }
                                        }
                                        v0 = var1_1 = var1_1.trim();
                                    }
                                    try {
                                        try {
                                            v3 = v0.length();
                                            if (var2_2 == null) break block33;
                                            if (v3 != 0) break block34;
                                        }
                                        catch (NumberFormatException v4) {
                                            throw TR.a(v4);
                                        }
                                        return false;
                                    }
                                    catch (NumberFormatException v5) {
                                        throw TR.a(v5);
                                    }
                                }
                                v3 = var1_1.charAt(var1_1.length() - 1);
                            }
                            try {
                                v6 = TR.a(26490, 4664272378163898213L);
                                if (var2_2 == null) break block35;
                                if (v3 == v6) {
                                }
                                ** GOTO lbl82
                            }
                            catch (NumberFormatException v7) {
                                throw TR.a(v7);
                            }
                            var4_3 = TR.X(var1_1);
                            var7_4 = 0L;
                            var5_5 = 0L;
                            try {
                                if (var4_3 == null) {
                                    return false;
                                }
                            }
                            catch (NumberFormatException v8) {
                                throw TR.a(v8);
                            }
                            var9_6 = 0;
                            try {
                                if (var2_2 == null) {
                                    while (true) {
                                        if (var4_3[var9_6] < 0) break block36;
                                        break;
                                    }
                                }
                                ** GOTO lbl71
                            }
                            catch (NumberFormatException v9) {
                                throw TR.a(v9);
                            }
                            var5_5 += (long)var4_3[var9_6] << TR.a(12504, 4729875909600112836L) * (3 - var9_6);
                            if (var2_2 != null) ** GOTO lbl67
                        }
                        var7_4 = var5_5;
                        do {
                            block37: {
                                if (var2_2 != null) ** GOTO lbl64
                                do {
                                    var7_4 += TR.b(24527, 4228090076581626330L) << TR.a(643, 610822574488568472L) * (3 - var9_6++);
lbl64:
                                    // 2 sources

                                } while (var9_6 < 4);
                                try {
                                    if (var2_2 != null) break block37;
lbl67:
                                    // 2 sources

                                    ++var9_6;
                                }
                                catch (NumberFormatException v10) {
                                    throw TR.a(v10);
                                }
lbl71:
                                // 2 sources

                                if (var9_6 < 4) ** continue;
                            }
                            v11 = new Object[4];
                            v11[0] = var1_1;
                            v11[2] = new Long(var5_5);
                            v11[3] = new Long(var7_4);
                            var3_7 = v11;
                            this.l.addElement(var3_7);
                        } while (var2_2 == null);
                        try {
                            if (var2_2 != null) break block38;
lbl82:
                            // 2 sources

                            v3 = var1_1.charAt(0);
                            v6 = TR.a(22468, 8750353965831591898L);
                        }
                        catch (NumberFormatException v12) {
                            throw TR.a(v12);
                        }
                    }
                    try {
                        if (v3 != v6) break block39;
                        this.N.addElement(var1_1);
                        v13 = new Object[4];
                        v13[0] = var1_1;
                        this.l.addElement(v13);
                        if (var2_2 != null) break block38;
                    }
                    catch (NumberFormatException v14) {
                        throw TR.a(v14);
                    }
                }
                var4_3 = new StringTokenizer(var1_1, " \t");
                try {
                    v15 = var4_3.countTokens();
                    if (var2_2 == null) break block40;
                    if (v15 > 1) {
                    }
                    ** GOTO lbl115
                }
                catch (NumberFormatException v16) {
                    throw TR.a(v16);
                }
                v17 = new Object[4];
                v17[0] = var1_1;
                var3_7 = v17;
                try {
                    this.h(var3_7, var4_3.nextToken(), var4_3.nextToken());
                    this.l.addElement(var3_7);
                    if (var2_2 != null) break block38;
lbl115:
                    // 2 sources

                    v15 = 4;
                }
                catch (NumberFormatException v18) {
                    throw TR.a(v18);
                }
            }
            v19 = new Object[v15];
            v19[0] = var1_1;
            var3_7 = v19;
            this.l.addElement(var3_7);
            this.d.put(var1_1, var3_7);
            this.R(var3_7);
        }
        return true;
    }

    public synchronized void Y(InetAddress inetAddress) {
        long l2;
        long l3 = l2 = TR.J(inetAddress);
        this.l.addElement(new Object[]{inetAddress.getHostName(), inetAddress, new Long(l3), new Long(l2)});
    }

    public synchronized void f(InetAddress inetAddress, InetAddress inetAddress2) {
        Object[] objectArray = new Object[4];
        objectArray[0] = String.valueOf(inetAddress.getHostAddress()) + ":" + inetAddress2.getHostAddress();
        objectArray[2] = new Long(TR.J(inetAddress));
        objectArray[3] = new Long(TR.J(inetAddress2));
        this.l.addElement(objectArray);
    }

    public synchronized boolean t(String string) {
        return this.P(string, true);
    }

    /*
     * Loose catch block
     */
    public synchronized boolean P(String string, boolean bl) {
        block35: {
            long l2;
            block34: {
                String[] stringArray;
                block32: {
                    block33: {
                        String string2;
                        TR tR;
                        block31: {
                            int n10;
                            block29: {
                                block30: {
                                    block27: {
                                        block28: {
                                            block25: {
                                                block26: {
                                                    stringArray = jk_0.Y();
                                                    n10 = this.l.size();
                                                    if (stringArray == null) break block25;
                                                    try {
                                                        block36: {
                                                            if (n10 != 0) break block26;
                                                            break block36;
                                                            catch (UnknownHostException unknownHostException) {
                                                                throw TR.a(unknownHostException);
                                                            }
                                                        }
                                                        return false;
                                                    }
                                                    catch (UnknownHostException unknownHostException) {
                                                        throw TR.a(unknownHostException);
                                                    }
                                                }
                                                string = string.trim();
                                                n10 = string.length();
                                            }
                                            if (stringArray == null) break block27;
                                            try {
                                                block37: {
                                                    if (n10 != 0) break block28;
                                                    break block37;
                                                    catch (UnknownHostException unknownHostException) {
                                                        throw TR.a(unknownHostException);
                                                    }
                                                }
                                                return false;
                                            }
                                            catch (UnknownHostException unknownHostException) {
                                                throw TR.a(unknownHostException);
                                            }
                                        }
                                        n10 = this.h(string) ? 1 : 0;
                                    }
                                    if (stringArray == null) break block29;
                                    try {
                                        block38: {
                                            if (n10 == 0) break block30;
                                            break block38;
                                            catch (UnknownHostException unknownHostException) {
                                                throw TR.a(unknownHostException);
                                            }
                                        }
                                        return true;
                                    }
                                    catch (UnknownHostException unknownHostException) {
                                        throw TR.a(unknownHostException);
                                    }
                                }
                                try {
                                    tR = this;
                                    string2 = string;
                                    if (stringArray == null) break block31;
                                    n10 = tR.a(string2) ? 1 : 0;
                                }
                                catch (UnknownHostException unknownHostException) {
                                    throw TR.a(unknownHostException);
                                }
                            }
                            try {
                                if (n10 != 0) {
                                    return true;
                                }
                            }
                            catch (UnknownHostException unknownHostException) {
                                throw TR.a(unknownHostException);
                            }
                            tR = this;
                            string2 = string;
                        }
                        long l3 = tR.e(string2);
                        long l4 = l3 - 0L;
                        l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (stringArray == null) break block32;
                        try {
                            block39: {
                                if (l2 < 0) break block33;
                                break block39;
                                catch (UnknownHostException unknownHostException) {
                                    throw TR.a(unknownHostException);
                                }
                            }
                            return this.u(l3);
                        }
                        catch (UnknownHostException unknownHostException) {
                            throw TR.a(unknownHostException);
                        }
                    }
                    l2 = (long)bl;
                }
                try {
                    if (stringArray == null) break block34;
                    if (l2 != false) break block35;
                }
                catch (UnknownHostException unknownHostException) {
                    throw TR.a(unknownHostException);
                }
                l2 = 0;
            }
            return (boolean)l2;
        }
        try {
            InetAddress inetAddress = InetAddress.getByName(string);
            return this.a(inetAddress);
        }
        catch (UnknownHostException unknownHostException) {
            return false;
        }
    }

    public synchronized boolean a(InetAddress inetAddress) {
        boolean bl;
        block10: {
            block11: {
                String[] stringArray;
                block8: {
                    block9: {
                        stringArray = jk_0.Y();
                        try {
                            try {
                                bl = this.a(inetAddress.getHostName());
                                if (stringArray == null) break block8;
                                if (!bl) break block9;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw TR.a(numberFormatException);
                            }
                            return true;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw TR.a(numberFormatException);
                        }
                    }
                    bl = this.h(inetAddress.getHostName());
                }
                try {
                    try {
                        if (stringArray == null) break block10;
                        if (!bl) break block11;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw TR.a(numberFormatException);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw TR.a(numberFormatException);
                }
            }
            bl = this.u(TR.J(inetAddress));
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized String[] D() {
        var2_1 = this.l.size();
        var1_2 = jk_0.Y();
        var4_3 = new String[var2_1];
        var5_4 = 0;
        try {
            if (var1_2 == null) {
                while (true) {
                    v0 = (Object[])this.l.elementAt(var5_4);
                    break;
                }
            }
            ** GOTO lbl17
        }
        catch (NumberFormatException v1) {
            throw TR.a(v1);
        }
        do {
            var3_5 = v0;
            var4_3[var5_4] = (String)var3_5[0];
            ++var5_4;
lbl17:
            // 2 sources

            if (var5_4 < var2_1) ** continue;
            v0 = var4_3;
        } while (var1_2 == null);
        return v0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public synchronized boolean R(String string) {
        Enumeration enumeration = this.l.elements();
        boolean bl = true;
        do {
            String[] stringArray;
            if (bl && !(bl = false) && (stringArray = jk_0.Y()) != null) continue;
            Object[] objectArray = (Object[])enumeration.nextElement();
            if (!string.equals(objectArray[0])) continue;
            try {
                this.l.removeElement(objectArray);
                this.N.removeElement(string);
                this.d.remove(string);
                boolean bl2 = true;
                if (stringArray == null) return bl2;
                return bl2;
            }
            catch (NumberFormatException numberFormatException) {
                throw TR.a(numberFormatException);
            }
        } while (enumeration.hasMoreElements());
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public String toString() {
        block9: {
            block10: {
                var2_1 = this.D();
                var1_2 = jk_0.Y();
                try {
                    try {
                        v0 = var2_1;
                        if (var1_2 == null) break block9;
                        if (v0.length != 0) break block10;
                    }
                    catch (NumberFormatException v1) {
                        throw TR.a(v1);
                    }
                    return "";
                }
                catch (NumberFormatException v2) {
                    throw TR.a(v2);
                }
            }
            v0 = var2_1;
        }
        var3_3 = v0[0];
        var4_4 = 1;
        try {
            if (var1_2 == null) {
                while (true) {
                    v3 = String.valueOf(var3_3) + "; " + var2_1[var4_4];
                    break;
                }
            }
            ** GOTO lbl30
        }
        catch (NumberFormatException v4) {
            throw TR.a(v4);
        }
        do {
            var3_3 = v3;
            ++var4_4;
lbl30:
            // 2 sources

            if (var4_4 < var2_1.length) ** continue;
            v3 = var3_3;
        } while (var1_2 == null);
        return v3;
    }

    public Object clone() {
        TR tR = new TR();
        tR.l = (Vector)this.l.clone();
        tR.N = (Vector)this.N.clone();
        tR.d = (Hashtable)this.d.clone();
        return tR;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private synchronized boolean u(long l2) {
        block28: {
            int n10;
            String[] stringArray;
            Enumeration enumeration;
            block27: {
                enumeration = this.l.elements();
                stringArray = jk_0.Y();
                if (stringArray == null) break block27;
                n10 = enumeration.hasMoreElements() ? 1 : 0;
                if (n10 == 0) break block28;
            }
            do {
                block26: {
                    Long l3;
                    Long l4;
                    block25: {
                        Long l5;
                        Long l6;
                        block24: {
                            Object object;
                            block22: {
                                Object[] objectArray;
                                block23: {
                                    Long l7;
                                    block21: {
                                        objectArray = (Object[])enumeration.nextElement();
                                        Object object2 = objectArray[2];
                                        if (stringArray != null) {
                                            block20: {
                                                try {
                                                    if (object2 != null) break block20;
                                                    l7 = null;
                                                    break block21;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw TR.a(numberFormatException);
                                                }
                                            }
                                            object2 = objectArray[2];
                                        }
                                        l7 = (Long)object2;
                                    }
                                    l6 = l7;
                                    try {
                                        try {
                                            object = objectArray[3];
                                            if (stringArray == null) break block22;
                                            if (object != null) break block23;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw TR.a(numberFormatException);
                                        }
                                        l5 = null;
                                        break block24;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw TR.a(numberFormatException);
                                    }
                                }
                                object = objectArray[3];
                            }
                            l5 = (Long)object;
                        }
                        l4 = l5;
                        try {
                            l3 = l6;
                            if (stringArray == null) break block25;
                            if (l3 == null) break block26;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw TR.a(numberFormatException);
                        }
                        l3 = l6;
                    }
                    try {
                        try {
                            try {
                                try {
                                    long l8 = l3 - l2;
                                    n10 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                    if (stringArray == null) continue;
                                    if (n10 > 0) break block26;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw TR.a(numberFormatException);
                                }
                                if (l4 < l2) break block26;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw TR.a(numberFormatException);
                            }
                            boolean bl = true;
                            if (stringArray == null) return bl;
                            return bl;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw TR.a(numberFormatException);
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw TR.a(numberFormatException);
                    }
                }
                n10 = enumeration.hasMoreElements();
            } while (n10 != 0);
        }
        return false;
    }

    private boolean h(String string) {
        return this.d.containsKey(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(String var1_1) {
        var3_2 = this.N.elements();
        var2_3 = jk_0.Y();
        try {
            if (var2_3 == null) {
            }
            ** GOTO lbl17
        }
        catch (NumberFormatException v0) {
            throw TR.a(v0);
        }
        do {
            if (!var1_1.endsWith((String)var3_2.nextElement())) continue;
            try {
                v1 = true;
                if (var2_3 == null) return v1;
                return v1;
            }
            catch (NumberFormatException v2) {
                throw TR.a(v2);
            }
lbl17:
            // 2 sources

        } while (var3_2.hasMoreElements());
        return false;
    }

    private void R(Object[] objectArray) {
        block8: {
            block7: {
                String[] stringArray;
                block6: {
                    long l2 = this.e((String)objectArray[0]);
                    stringArray = jk_0.Y();
                    try {
                        try {
                            if (stringArray == null) break block6;
                            if (l2 < 0L) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw TR.a(numberFormatException);
                        }
                        objectArray[2] = objectArray[3] = new Long(l2);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw TR.a(numberFormatException);
                    }
                }
                if (stringArray != null) break block8;
            }
            kn_2 kn_22 = new kn_2(objectArray);
            kn_22.Q(this.O);
        }
    }

    private void h(Object[] objectArray, String string, String string2) {
        block8: {
            block7: {
                long l2;
                long l3;
                long l4;
                String[] stringArray;
                block6: {
                    stringArray = jk_0.Y();
                    l3 = l4 = this.e(string);
                    try {
                        try {
                            l2 = 0L;
                            if (stringArray == null) break block6;
                            if (l3 < l2) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw TR.a(numberFormatException);
                        }
                        long l5 = this.e(string2);
                        l2 = l5;
                        l3 = l5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw TR.a(numberFormatException);
                    }
                }
                long l6 = l2;
                try {
                    if (l3 < 0L) break block7;
                    objectArray[2] = new Long(l4);
                    objectArray[3] = new Long(l6);
                    if (stringArray != null) break block8;
                }
                catch (NumberFormatException numberFormatException) {
                    throw TR.a(numberFormatException);
                }
            }
            kn_2 kn_22 = new kn_2(objectArray, string, string2);
            kn_22.Q(this.O);
        }
    }

    /*
     * Unable to fully structure code
     */
    static long J(InetAddress var0) {
        block11: {
            block10: {
                var2_1 = 0L;
                var4_2 = var0.getAddress();
                var1_3 = jk_0.Y();
                try {
                    try {
                        v0 = var4_2.length;
                        if (var1_3 == null) break block10;
                        if (v0 == 4) {
                        }
                        ** GOTO lbl28
                    }
                    catch (NumberFormatException v1) {
                        throw TR.a(v1);
                    }
                    v0 = 0;
                }
                catch (NumberFormatException v2) {
                    throw TR.a(v2);
                }
            }
            var5_4 = v0;
            if (var1_3 != null) ** GOTO lbl24
            block6: while (true) {
                var2_1 += ((long)var4_2[var5_4] & TR.b(5420, 6219678247215254331L)) << TR.a(643, 610822574488568472L) * (3 - var5_4);
                do {
                    ++var5_4;
lbl24:
                    // 2 sources

                    if (var5_4 < 4) continue block6;
                } while (var1_3 == null);
                break;
            }
            try {
                if (var1_3 != null) break block11;
lbl28:
                // 2 sources

                return 0L;
            }
            catch (NumberFormatException v3) {
                throw TR.a(v3);
            }
        }
        return var2_1;
    }

    /*
     * Unable to fully structure code
     */
    long e(String var1_1) {
        block15: {
            block16: {
                var3_2 = 0L;
                var2_3 = jk_0.Y();
                try {
                    try {
                        v0 = var1_1;
                        if (var2_3 == null) break block15;
                        if (Character.isDigit(v0.charAt(0))) break block16;
                    }
                    catch (NumberFormatException v1) {
                        throw TR.a(v1);
                    }
                    return TR.b(27952, 1754076243955921700L);
                }
                catch (NumberFormatException v2) {
                    throw TR.a(v2);
                }
            }
            v0 = var1_1;
        }
        var5_4 = TR.X(v0);
        try {
            if (var5_4 == null) {
                return TR.b(28344, 1256994436608700590L);
            }
        }
        catch (NumberFormatException v3) {
            throw TR.a(v3);
        }
        var6_5 = 0;
        try {
            if (var2_3 == null) {
                while (true) {
                    v4 = var3_2;
                    break;
                }
            }
            ** GOTO lbl42
        }
        catch (NumberFormatException v5) {
            throw TR.a(v5);
        }
        do {
            v6 = var5_4[var6_5];
            if (var2_3 != null) {
                try {
                    v6 = v6 >= 0 ? var5_4[var6_5] : 0;
                }
                catch (NumberFormatException v7) {
                    throw TR.a(v7);
                }
            }
            var3_2 = v4 + ((long)v6 << TR.a(643, 610822574488568472L) * (3 - var6_5));
            ++var6_5;
lbl42:
            // 2 sources

            if (var6_5 < var5_4.length) ** continue;
            v4 = var3_2;
        } while (var2_3 == null);
        return v4;
    }

    /*
     * Unable to fully structure code
     */
    static int[] X(String var0) {
        var2_1 = new int[]{-1, -1, -1, -1};
        var3_2 = 0;
        var4_3 = new StringTokenizer(var0, ".");
        var1_4 = jk_0.Y();
        v0 = var4_3.countTokens();
        if (var1_4 == null) ** GOTO lbl28
        try {
            block8: {
                block9: {
                    if (v0 <= 4) break block8;
                    break block9;
                    catch (NumberFormatException v1) {
                        throw TR.a(v1);
                    }
                }
                return null;
            }
            if (true) ** GOTO lbl27
        }
        catch (NumberFormatException v2) {
            throw TR.a(v2);
        }
        do {
            try {
                v3 = var2_1;
lbl22:
                // 2 sources

                while (true) {
                    v3[var3_2++] = Integer.parseInt(var4_3.nextToken()) & TR.a(20226, 7033398132176817951L);
                    break;
                }
            }
            catch (NumberFormatException var5_5) {
                return null;
            }
lbl27:
            // 2 sources

            v0 = (int)var4_3.hasMoreTokens();
lbl28:
            // 2 sources

        } while (v0 != 0);
        v3 = var2_1;
        ** while (var1_4 == null)
lbl31:
        // 1 sources

        return v3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var21 = new String[2];
                            var19_1 = 0;
                            var18_2 = "M\u00d5\u0006\u00b0`w\u0082\u0092i";
                            var20_3 = "M\u00d5\u0006\u00b0`w\u0082\u0092i".length();
                            var17_4 = 2;
                            var16_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block27;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v3 = v2.length;
                            var22_6 = 0;
                            v4 = 34;
                            v5 = v2;
                            v6 = v3;
                            if (v3 > 1) ** GOTO lbl67
                            do {
                                v7 = v4;
                                v5 = v5;
                                v8 = v5;
                                v9 = v4;
                                v10 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v11 = 83;
                                            break;
                                        }
                                        case 1: {
                                            v11 = 23;
                                            break;
                                        }
                                        case 2: {
                                            v11 = 68;
                                            break;
                                        }
                                        case 3: {
                                            v11 = 40;
                                            break;
                                        }
                                        case 4: {
                                            v11 = 50;
                                            break;
                                        }
                                        case 5: {
                                            v11 = 43;
                                            break;
                                        }
                                        default: {
                                            v11 = 46;
                                        }
                                    }
                                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                    ++var22_6;
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
                            } while (v6 > var22_6);
                            ** while (true)
                        }
                        TR.a = var21;
                        TR.b = new String[2];
                        var8_7 = 7496333484551392058L;
                        var14_8 = new long[5];
                        var11_9 = 0;
                        var12_10 = "*\u008e\u008bU\u00bc\u00adlq\u00e37\u00187P\u00df\u00dc\u00ce\u0098\u00f1J\u00b7p\u00c6\u00c4\u00da";
                        var13_11 = "*\u008e\u008bU\u00bc\u00adlq\u00e37\u00187P\u00df\u00dc\u00ce\u0098\u00f1J\u00b7p\u00c6\u00c4\u00da".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v12 = var14_8;
                            v13 = var11_9++;
                            v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v15 = -1;
                            break block28;
                            break;
                        }
lbl90:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u000b\u00db\u00d7\u00c0/\u00e9;\u00f6R\u0002\u00daom\u00a3\t\u00aa";
                            var13_11 = "\u000b\u00db\u00d7\u00c0/\u00e9;\u00f6R\u0002\u00daom\u00a3\t\u00aa".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v12 = var14_8;
                                v13 = var11_9++;
                                v14 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v15 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl103:
                        // 1 sources

                        while (true) {
                            v12[v13] = v16;
                            if (var10_12 < var13_11) ** continue;
                            break block29;
                            break;
                        }
                    }
                    v16 = v14 ^ var8_7;
                    switch (v15) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl114:
                        // 1 sources

                        ** continue;
                    }
                }
                TR.c = var14_8;
                TR.e = new Integer[5];
                var0_14 = 25985116824437617L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "V\f\u00ed:\u00e7\u00b9\u00c8\u00b5\u00ee\u00d2\u0013k8\u008fL ";
                var5_18 = "V\f\u00ed:\u00e7\u00b9\u00c8\u00b5\u00ee\u00d2\u0013k8\u008fL ".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v17 = var6_15;
                    v18 = var3_16++;
                    v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl131:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = ":\u00f1`\u00d6\u008c\u00c4\u0002T\u00e7\u00f4\u0015\u00a0c\u00ca\u00cf\u00aa";
                    var5_18 = ":\u00f1`\u00d6\u008c\u00c4\u0002T\u00e7\u00f4\u0015\u00a0c\u00ca\u00cf\u00aa".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v17 = var6_15;
                        v18 = var3_16++;
                        v19 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl144:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_19 < var5_18) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_14;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl155:
                // 1 sources

                ** continue;
            }
        }
        TR.f = var6_15;
        TR.g = new Long[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x280F) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 124;
                    break;
                }
                case 1: {
                    n14 = 195;
                    break;
                }
                case 2: {
                    n14 = 223;
                    break;
                }
                case 3: {
                    n14 = 88;
                    break;
                }
                case 4: {
                    n14 = 222;
                    break;
                }
                case 5: {
                    n14 = 26;
                    break;
                }
                case 6: {
                    n14 = 100;
                    break;
                }
                case 7: {
                    n14 = 5;
                    break;
                }
                case 8: {
                    n14 = 134;
                    break;
                }
                case 9: {
                    n14 = 148;
                    break;
                }
                case 10: {
                    n14 = 95;
                    break;
                }
                case 11: {
                    n14 = 185;
                    break;
                }
                case 12: {
                    n14 = 61;
                    break;
                }
                case 13: {
                    n14 = 49;
                    break;
                }
                case 14: {
                    n14 = 45;
                    break;
                }
                case 15: {
                    n14 = 108;
                    break;
                }
                case 16: {
                    n14 = 152;
                    break;
                }
                case 17: {
                    n14 = 96;
                    break;
                }
                case 18: {
                    n14 = 128;
                    break;
                }
                case 19: {
                    n14 = 150;
                    break;
                }
                case 20: {
                    n14 = 169;
                    break;
                }
                case 21: {
                    n14 = 126;
                    break;
                }
                case 22: {
                    n14 = 105;
                    break;
                }
                case 23: {
                    n14 = 54;
                    break;
                }
                case 24: {
                    n14 = 179;
                    break;
                }
                case 25: {
                    n14 = 84;
                    break;
                }
                case 26: {
                    n14 = 122;
                    break;
                }
                case 27: {
                    n14 = 216;
                    break;
                }
                case 28: {
                    n14 = 50;
                    break;
                }
                case 29: {
                    n14 = 6;
                    break;
                }
                case 30: {
                    n14 = 63;
                    break;
                }
                case 31: {
                    n14 = 71;
                    break;
                }
                case 32: {
                    n14 = 97;
                    break;
                }
                case 33: {
                    n14 = 130;
                    break;
                }
                case 34: {
                    n14 = 164;
                    break;
                }
                case 35: {
                    n14 = 99;
                    break;
                }
                case 36: {
                    n14 = 110;
                    break;
                }
                case 37: {
                    n14 = 106;
                    break;
                }
                case 38: {
                    n14 = 234;
                    break;
                }
                case 39: {
                    n14 = 21;
                    break;
                }
                case 40: {
                    n14 = 180;
                    break;
                }
                case 41: {
                    n14 = 59;
                    break;
                }
                case 42: {
                    n14 = 212;
                    break;
                }
                case 43: {
                    n14 = 147;
                    break;
                }
                case 44: {
                    n14 = 36;
                    break;
                }
                case 45: {
                    n14 = 162;
                    break;
                }
                case 46: {
                    n14 = 46;
                    break;
                }
                case 47: {
                    n14 = 28;
                    break;
                }
                case 48: {
                    n14 = 66;
                    break;
                }
                case 49: {
                    n14 = 20;
                    break;
                }
                case 50: {
                    n14 = 37;
                    break;
                }
                case 51: {
                    n14 = 237;
                    break;
                }
                case 52: {
                    n14 = 111;
                    break;
                }
                case 53: {
                    n14 = 74;
                    break;
                }
                case 54: {
                    n14 = 29;
                    break;
                }
                case 55: {
                    n14 = 27;
                    break;
                }
                case 56: {
                    n14 = 125;
                    break;
                }
                case 57: {
                    n14 = 197;
                    break;
                }
                case 58: {
                    n14 = 1;
                    break;
                }
                case 59: {
                    n14 = 117;
                    break;
                }
                case 60: {
                    n14 = 231;
                    break;
                }
                case 61: {
                    n14 = 3;
                    break;
                }
                case 62: {
                    n14 = 2;
                    break;
                }
                case 63: {
                    n14 = 118;
                    break;
                }
                case 64: {
                    n14 = 156;
                    break;
                }
                case 65: {
                    n14 = 161;
                    break;
                }
                case 66: {
                    n14 = 228;
                    break;
                }
                case 67: {
                    n14 = 62;
                    break;
                }
                case 68: {
                    n14 = 137;
                    break;
                }
                case 69: {
                    n14 = 51;
                    break;
                }
                case 70: {
                    n14 = 184;
                    break;
                }
                case 71: {
                    n14 = 48;
                    break;
                }
                case 72: {
                    n14 = 86;
                    break;
                }
                case 73: {
                    n14 = 75;
                    break;
                }
                case 74: {
                    n14 = 0;
                    break;
                }
                case 75: {
                    n14 = 151;
                    break;
                }
                case 76: {
                    n14 = 17;
                    break;
                }
                case 77: {
                    n14 = 135;
                    break;
                }
                case 78: {
                    n14 = 227;
                    break;
                }
                case 79: {
                    n14 = 211;
                    break;
                }
                case 80: {
                    n14 = 4;
                    break;
                }
                case 81: {
                    n14 = 77;
                    break;
                }
                case 82: {
                    n14 = 146;
                    break;
                }
                case 83: {
                    n14 = 176;
                    break;
                }
                case 84: {
                    n14 = 136;
                    break;
                }
                case 85: {
                    n14 = 220;
                    break;
                }
                case 86: {
                    n14 = 76;
                    break;
                }
                case 87: {
                    n14 = 34;
                    break;
                }
                case 88: {
                    n14 = 87;
                    break;
                }
                case 89: {
                    n14 = 68;
                    break;
                }
                case 90: {
                    n14 = 249;
                    break;
                }
                case 91: {
                    n14 = 201;
                    break;
                }
                case 92: {
                    n14 = 138;
                    break;
                }
                case 93: {
                    n14 = 158;
                    break;
                }
                case 94: {
                    n14 = 208;
                    break;
                }
                case 95: {
                    n14 = 202;
                    break;
                }
                case 96: {
                    n14 = 91;
                    break;
                }
                case 97: {
                    n14 = 7;
                    break;
                }
                case 98: {
                    n14 = 67;
                    break;
                }
                case 99: {
                    n14 = 52;
                    break;
                }
                case 100: {
                    n14 = 174;
                    break;
                }
                case 101: {
                    n14 = 240;
                    break;
                }
                case 102: {
                    n14 = 44;
                    break;
                }
                case 103: {
                    n14 = 112;
                    break;
                }
                case 104: {
                    n14 = 78;
                    break;
                }
                case 105: {
                    n14 = 121;
                    break;
                }
                case 106: {
                    n14 = 13;
                    break;
                }
                case 107: {
                    n14 = 254;
                    break;
                }
                case 108: {
                    n14 = 178;
                    break;
                }
                case 109: {
                    n14 = 253;
                    break;
                }
                case 110: {
                    n14 = 242;
                    break;
                }
                case 111: {
                    n14 = 22;
                    break;
                }
                case 112: {
                    n14 = 92;
                    break;
                }
                case 113: {
                    n14 = 236;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 127;
                    break;
                }
                case 116: {
                    n14 = 38;
                    break;
                }
                case 117: {
                    n14 = 60;
                    break;
                }
                case 118: {
                    n14 = 218;
                    break;
                }
                case 119: {
                    n14 = 165;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 139;
                    break;
                }
                case 122: {
                    n14 = 238;
                    break;
                }
                case 123: {
                    n14 = 33;
                    break;
                }
                case 124: {
                    n14 = 175;
                    break;
                }
                case 125: {
                    n14 = 81;
                    break;
                }
                case 126: {
                    n14 = 14;
                    break;
                }
                case 127: {
                    n14 = 113;
                    break;
                }
                case 128: {
                    n14 = 98;
                    break;
                }
                case 129: {
                    n14 = 188;
                    break;
                }
                case 130: {
                    n14 = 204;
                    break;
                }
                case 131: {
                    n14 = 182;
                    break;
                }
                case 132: {
                    n14 = 30;
                    break;
                }
                case 133: {
                    n14 = 219;
                    break;
                }
                case 134: {
                    n14 = 193;
                    break;
                }
                case 135: {
                    n14 = 31;
                    break;
                }
                case 136: {
                    n14 = 16;
                    break;
                }
                case 137: {
                    n14 = 206;
                    break;
                }
                case 138: {
                    n14 = 103;
                    break;
                }
                case 139: {
                    n14 = 173;
                    break;
                }
                case 140: {
                    n14 = 70;
                    break;
                }
                case 141: {
                    n14 = 232;
                    break;
                }
                case 142: {
                    n14 = 224;
                    break;
                }
                case 143: {
                    n14 = 94;
                    break;
                }
                case 144: {
                    n14 = 41;
                    break;
                }
                case 145: {
                    n14 = 40;
                    break;
                }
                case 146: {
                    n14 = 101;
                    break;
                }
                case 147: {
                    n14 = 102;
                    break;
                }
                case 148: {
                    n14 = 239;
                    break;
                }
                case 149: {
                    n14 = 205;
                    break;
                }
                case 150: {
                    n14 = 35;
                    break;
                }
                case 151: {
                    n14 = 248;
                    break;
                }
                case 152: {
                    n14 = 119;
                    break;
                }
                case 153: {
                    n14 = 217;
                    break;
                }
                case 154: {
                    n14 = 221;
                    break;
                }
                case 155: {
                    n14 = 190;
                    break;
                }
                case 156: {
                    n14 = 131;
                    break;
                }
                case 157: {
                    n14 = 207;
                    break;
                }
                case 158: {
                    n14 = 23;
                    break;
                }
                case 159: {
                    n14 = 160;
                    break;
                }
                case 160: {
                    n14 = 80;
                    break;
                }
                case 161: {
                    n14 = 109;
                    break;
                }
                case 162: {
                    n14 = 213;
                    break;
                }
                case 163: {
                    n14 = 187;
                    break;
                }
                case 164: {
                    n14 = 115;
                    break;
                }
                case 165: {
                    n14 = 116;
                    break;
                }
                case 166: {
                    n14 = 72;
                    break;
                }
                case 167: {
                    n14 = 199;
                    break;
                }
                case 168: {
                    n14 = 90;
                    break;
                }
                case 169: {
                    n14 = 183;
                    break;
                }
                case 170: {
                    n14 = 53;
                    break;
                }
                case 171: {
                    n14 = 15;
                    break;
                }
                case 172: {
                    n14 = 196;
                    break;
                }
                case 173: {
                    n14 = 89;
                    break;
                }
                case 174: {
                    n14 = 24;
                    break;
                }
                case 175: {
                    n14 = 154;
                    break;
                }
                case 176: {
                    n14 = 149;
                    break;
                }
                case 177: {
                    n14 = 42;
                    break;
                }
                case 178: {
                    n14 = 209;
                    break;
                }
                case 179: {
                    n14 = 157;
                    break;
                }
                case 180: {
                    n14 = 56;
                    break;
                }
                case 181: {
                    n14 = 12;
                    break;
                }
                case 182: {
                    n14 = 73;
                    break;
                }
                case 183: {
                    n14 = 203;
                    break;
                }
                case 184: {
                    n14 = 163;
                    break;
                }
                case 185: {
                    n14 = 230;
                    break;
                }
                case 186: {
                    n14 = 142;
                    break;
                }
                case 187: {
                    n14 = 85;
                    break;
                }
                case 188: {
                    n14 = 133;
                    break;
                }
                case 189: {
                    n14 = 215;
                    break;
                }
                case 190: {
                    n14 = 198;
                    break;
                }
                case 191: {
                    n14 = 255;
                    break;
                }
                case 192: {
                    n14 = 153;
                    break;
                }
                case 193: {
                    n14 = 241;
                    break;
                }
                case 194: {
                    n14 = 192;
                    break;
                }
                case 195: {
                    n14 = 82;
                    break;
                }
                case 196: {
                    n14 = 225;
                    break;
                }
                case 197: {
                    n14 = 55;
                    break;
                }
                case 198: {
                    n14 = 214;
                    break;
                }
                case 199: {
                    n14 = 172;
                    break;
                }
                case 200: {
                    n14 = 140;
                    break;
                }
                case 201: {
                    n14 = 145;
                    break;
                }
                case 202: {
                    n14 = 233;
                    break;
                }
                case 203: {
                    n14 = 18;
                    break;
                }
                case 204: {
                    n14 = 229;
                    break;
                }
                case 205: {
                    n14 = 170;
                    break;
                }
                case 206: {
                    n14 = 247;
                    break;
                }
                case 207: {
                    n14 = 200;
                    break;
                }
                case 208: {
                    n14 = 251;
                    break;
                }
                case 209: {
                    n14 = 141;
                    break;
                }
                case 210: {
                    n14 = 120;
                    break;
                }
                case 211: {
                    n14 = 168;
                    break;
                }
                case 212: {
                    n14 = 79;
                    break;
                }
                case 213: {
                    n14 = 32;
                    break;
                }
                case 214: {
                    n14 = 19;
                    break;
                }
                case 215: {
                    n14 = 129;
                    break;
                }
                case 216: {
                    n14 = 9;
                    break;
                }
                case 217: {
                    n14 = 246;
                    break;
                }
                case 218: {
                    n14 = 189;
                    break;
                }
                case 219: {
                    n14 = 155;
                    break;
                }
                case 220: {
                    n14 = 167;
                    break;
                }
                case 221: {
                    n14 = 58;
                    break;
                }
                case 222: {
                    n14 = 245;
                    break;
                }
                case 223: {
                    n14 = 143;
                    break;
                }
                case 224: {
                    n14 = 57;
                    break;
                }
                case 225: {
                    n14 = 25;
                    break;
                }
                case 226: {
                    n14 = 65;
                    break;
                }
                case 227: {
                    n14 = 210;
                    break;
                }
                case 228: {
                    n14 = 43;
                    break;
                }
                case 229: {
                    n14 = 181;
                    break;
                }
                case 230: {
                    n14 = 83;
                    break;
                }
                case 231: {
                    n14 = 69;
                    break;
                }
                case 232: {
                    n14 = 243;
                    break;
                }
                case 233: {
                    n14 = 177;
                    break;
                }
                case 234: {
                    n14 = 11;
                    break;
                }
                case 235: {
                    n14 = 8;
                    break;
                }
                case 236: {
                    n14 = 235;
                    break;
                }
                case 237: {
                    n14 = 166;
                    break;
                }
                case 238: {
                    n14 = 104;
                    break;
                }
                case 239: {
                    n14 = 39;
                    break;
                }
                case 240: {
                    n14 = 159;
                    break;
                }
                case 241: {
                    n14 = 194;
                    break;
                }
                case 242: {
                    n14 = 252;
                    break;
                }
                case 243: {
                    n14 = 191;
                    break;
                }
                case 244: {
                    n14 = 226;
                    break;
                }
                case 245: {
                    n14 = 47;
                    break;
                }
                case 246: {
                    n14 = 93;
                    break;
                }
                case 247: {
                    n14 = 64;
                    break;
                }
                case 248: {
                    n14 = 132;
                    break;
                }
                case 249: {
                    n14 = 244;
                    break;
                }
                case 250: {
                    n14 = 123;
                    break;
                }
                case 251: {
                    n14 = 107;
                    break;
                }
                case 252: {
                    n14 = 144;
                    break;
                }
                case 253: {
                    n14 = 171;
                    break;
                }
                case 254: {
                    n14 = 10;
                    break;
                }
                default: {
                    n14 = 186;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            TR.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x401F;
        if (e[n11] == null) {
            TR.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x5E17) & Short.MAX_VALUE;
        if (g[n11] == null) {
            TR.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

