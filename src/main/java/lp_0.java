/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from Lp
 */
public class lp_0 {
    HashMap E;
    String R;
    String h;
    String U;
    HashMap z;
    String g;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public lp_0() {
        Object object;
        this.E = new HashMap();
        try {
            object = lk_0.P(lp_0.a(10897, 2363943096906769898L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.U = object;
        this.z = new HashMap();
        try {
            this.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public void c(String string, long l2) {
        ((HashMap)this.z).put(string, l2);
    }

    public void M(String string) {
        ((HashMap)this.z).get(string);
    }

    public HashMap u() {
        return (HashMap)this.z;
    }

    public void J(HashMap hashMap) {
        this.z = hashMap;
    }

    public void D(kb_2 kb_22) {
        String string;
        try {
            string = (String)kb_22.t();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashMap)this.E).put(string, kb_22);
    }

    public boolean t(String string) {
        return ((HashMap)this.E).containsKey(string);
    }

    public kb_2 P(String string) {
        return (kb_2)((HashMap)this.E).get(string);
    }

    public void r() throws Exception {
        String string;
        try {
            string = (String)lk_0.p(this.R);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        O0 o0 = O0.y(string2);
        try {
            this.q(o0);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    public ArrayList m() {
        ArrayList<kb_2> arrayList = new ArrayList<kb_2>();
        boolean bl = ln_2.R();
        for (String string : ((HashMap)this.E).keySet()) {
            boolean bl2;
            kb_2 kb_22 = (kb_2)((HashMap)this.E).get(string);
            try {
                bl2 = (Boolean)kb_22.u();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (!bl && !bl2) {
                bl2 = arrayList.add(kb_22);
            }
            if (!bl) continue;
        }
        return arrayList;
    }

    /*
     * Loose catch block
     */
    private void E() {
        block22: {
            Object object;
            StringBuffer stringBuffer = new StringBuffer();
            boolean bl = ln_2.i();
            stringBuffer.append((String)dd_1.s + "#" + (String)this.U + "#");
            try {
                Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
                HashSet<String> hashSet = new HashSet<String>();
                while (enumeration.hasMoreElements()) {
                    block25: {
                        String string;
                        block29: {
                            StringBuilder stringBuilder;
                            block26: {
                                boolean bl2;
                                byte[] byArray;
                                byte[] byArray2;
                                block24: {
                                    NetworkInterface networkInterface;
                                    block23: {
                                        NetworkInterface networkInterface2 = enumeration.nextElement();
                                        if (!bl) break block22;
                                        try {
                                            block31: {
                                                networkInterface = networkInterface2;
                                                if (!bl) break block23;
                                                break block31;
                                                catch (SocketException socketException) {
                                                    throw lp_0.a(socketException);
                                                }
                                            }
                                            if (networkInterface.isLoopback()) continue;
                                        }
                                        catch (SocketException socketException) {
                                            throw lp_0.a(socketException);
                                        }
                                        networkInterface = networkInterface2;
                                    }
                                    byArray2 = networkInterface.getHardwareAddress();
                                    try {
                                        byArray = byArray2;
                                        if (!bl) break block24;
                                        if (byArray == null) break block25;
                                    }
                                    catch (SocketException socketException) {
                                        throw lp_0.a(socketException);
                                    }
                                    byArray = byArray2;
                                }
                                try {
                                    bl2 = (Boolean)lk_0.B(byArray);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (bl2) break block25;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                for (int i2 = 0; i2 < byArray2.length; ++i2) {
                                    String string2;
                                    Object[] objectArray;
                                    String string3;
                                    block28: {
                                        block27: {
                                            stringBuilder = stringBuilder2;
                                            if (!bl) break block26;
                                            try {
                                                block32: {
                                                    string3 = lp_0.a(-12214, 1691);
                                                    Object[] objectArray2 = new Object[2];
                                                    objectArray2[0] = byArray2[i2];
                                                    Object[] objectArray3 = objectArray2;
                                                    objectArray = objectArray2;
                                                    int n10 = 1;
                                                    if (i2 >= byArray2.length - 1) break block27;
                                                    break block32;
                                                    catch (SocketException socketException) {
                                                        throw lp_0.a(socketException);
                                                    }
                                                }
                                                string2 = "-";
                                                break block28;
                                            }
                                            catch (SocketException socketException) {
                                                throw lp_0.a(socketException);
                                            }
                                        }
                                        string2 = "";
                                    }
                                    objectArray3[n10] = string2;
                                    stringBuilder.append(String.format(string3, objectArray));
                                    if (bl) continue;
                                }
                                stringBuilder = stringBuilder2;
                            }
                            string = stringBuilder.toString().trim();
                            boolean bl3 = hashSet.contains(string);
                            if (!bl) break block29;
                            try {
                                block33: {
                                    if (bl3) break block25;
                                    break block33;
                                    catch (SocketException socketException) {
                                        throw lp_0.a(socketException);
                                    }
                                }
                                bl3 = hashSet.add(string);
                            }
                            catch (SocketException socketException) {
                                throw lp_0.a(socketException);
                            }
                        }
                        stringBuffer.append(string + "#");
                    }
                    if (bl) continue;
                    break;
                }
            }
            catch (SocketException socketException) {
                socketException.printStackTrace();
            }
            try {
                object = lk_0.Z(stringBuffer.toString());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.h = object;
        }
    }

    public void q(O0 o0) {
        block42: {
            String string;
            O0 o02;
            boolean bl;
            block41: {
                boolean bl2;
                block37: {
                    block40: {
                        Object object;
                        block39: {
                            block38: {
                                bl = ln_2.R();
                                if (bl) break block38;
                                if (!o0.containsKey(lp_0.a(-12219, -5872))) break block39;
                                this.U = o0.C(lp_0.a(-12224, 21617));
                            }
                            if (!bl) break block40;
                        }
                        try {
                            object = lk_0.P(lp_0.a(26333, 1958984523079952807L));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.U = object;
                    }
                    try {
                        this.E();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    O0 o03 = o0;
                    String string2 = lp_0.a(-12211, -28814);
                    if (!bl) {
                        if (o03.containsKey(string2)) {
                            this.g = o0.C(lp_0.a(-12216, 2132));
                        }
                        o03 = o0;
                        string2 = lp_0.a(-12220, 28970);
                    }
                    O0 o04 = o03.D(string2);
                    for (Object object : o04.keySet()) {
                        boolean bl3;
                        Object object2 = o04.D((String)object);
                        kb_2 kb_22 = new kb_2();
                        try {
                            kb_22.I(object);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        bl2 = ((O0)object2).containsKey(lp_0.a(-12210, 11989));
                        if (bl) break block37;
                        if (!bl) {
                            if (bl2) {
                                String string3 = ((O0)object2).C(lp_0.a(-12221, 20227)).trim();
                                try {
                                    kb_22.v(string3);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            bl3 = ((O0)object2).containsKey(lp_0.a(-12213, 977));
                        }
                        if (!bl) {
                            if (bl3) {
                                try {
                                    kb_22.M(((O0)object2).G(lp_0.a(-12209, 30802)));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            bl3 = ((O0)object2).containsKey(lp_0.a(-12217, 26833));
                        }
                        if (!bl) {
                            if (bl3) {
                                try {
                                    kb_22.d(((O0)object2).C(lp_0.a(-12206, 24059)));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            bl3 = ((O0)object2).containsKey(lp_0.a(-12212, 30898));
                        }
                        if (!bl) {
                            if (bl3) {
                                try {
                                    kb_22.l(((O0)object2).h(lp_0.a(-12208, -793)));
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            bl3 = ((O0)object2).containsKey(lp_0.a(-12218, -29074));
                        }
                        if (bl3) {
                            try {
                                kb_22.n(((O0)object2).C(lp_0.a(-12222, 1463)));
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        try {
                            this.D(kb_22);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (!bl) continue;
                    }
                    ((HashMap)this.z).clear();
                    o02 = o0;
                    string = lp_0.a(-12215, -12981);
                    if (bl) break block41;
                    bl2 = o02.containsKey(string);
                }
                if (!bl2) break block42;
                o02 = o0;
                string = lp_0.a(-12223, 22305);
            }
            O0 o05 = o02.D(string);
            for (Object object2 : o05.keySet()) {
                ((HashMap)this.z).put(object2, o05.h((String)object2));
                if (!bl) continue;
            }
        }
    }

    public void O() {
        block20: {
            O0 o0;
            O0 o02 = new O0();
            boolean bl = ln_2.R();
            o02.C(lp_0.a(-12224, 21617), (String)this.U);
            o02.C(lp_0.a(-12206, 24059), (String)this.h);
            o02.C(lp_0.a(-12216, 2132), (String)this.g);
            O0 o03 = new O0();
            boolean bl2 = bl;
            o02.C(lp_0.a(-12207, -18746), o03);
            for (String string : ((HashMap)this.E).keySet()) {
                kb_2 kb_22 = (kb_2)((HashMap)this.E).get(string);
                O0 o04 = new O0();
                try {
                    long l2;
                    String string2;
                    boolean bl3;
                    String string3;
                    String string4;
                    try {
                        string4 = (String)kb_22.t();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o03.C(string4 + "", o04);
                    try {
                        string3 = (String)kb_22.V();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o04.C(lp_0.a(-12221, 20227), string3);
                    try {
                        bl3 = (Boolean)kb_22.u();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o04.C(lp_0.a(-12209, 30802), bl3);
                    try {
                        string2 = (String)kb_22.x();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o04.C(lp_0.a(-12206, 24059), string2);
                    try {
                        l2 = (Long)kb_22.o();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    o04.C(lp_0.a(-12208, -793), l2);
                    if (!bl2) {
                        if (!bl2) continue;
                        break;
                    }
                    break block20;
                }
                catch (Exception exception) {
                    throw lp_0.a(exception);
                }
            }
            try {
                o0 = (O0)this.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            o02.C(lp_0.a(-12223, 22305), o0);
            try {
                try {
                    lk_0.S((Object)o02.toString(), this.R);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void d(O0 o0) {
        Iterator iterator = o0.keySet().iterator();
        boolean bl = ln_2.i();
        while (iterator.hasNext()) {
            int n10;
            long l2;
            String string;
            block9: {
                int n11;
                block8: {
                    String string2;
                    HashMap hashMap;
                    block6: {
                        block7: {
                            string = (String)iterator.next();
                            l2 = o0.h(string);
                            n11 = 0;
                            hashMap = (HashMap)this.z;
                            string2 = string;
                            if (!bl) break block6;
                            if (hashMap.containsKey(string2)) break block7;
                            n11 = 1;
                            if (bl) break block8;
                        }
                        hashMap = (HashMap)this.z;
                        string2 = string;
                    }
                    long l3 = (Long)hashMap.get(string2);
                    n10 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (!bl) break block9;
                    if (n10 > 0) {
                        n11 = 1;
                    }
                }
                n10 = n11;
            }
            if (n10 != 0) {
                ((HashMap)this.z).put(string, l2);
            }
            if (bl) continue;
        }
    }

    public O0 M() {
        O0 o0;
        block2: {
            O0 o02 = new O0();
            Iterator iterator = ((HashMap)this.z).keySet().iterator();
            boolean bl = ln_2.i();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                o0 = o02;
                if (bl) {
                    o0.C(string, ((HashMap)this.z).get(string));
                    if (bl) continue;
                }
                break block2;
            }
            o0 = o02;
        }
        return o0;
    }

    public String C() {
        return (String)this.R;
    }

    public void A(String string) {
        this.R = string;
    }

    public HashMap y() {
        return (HashMap)this.E;
    }

    public void s(HashMap hashMap) {
        this.E = hashMap;
    }

    public String P() {
        return (String)this.h;
    }

    public String R() {
        return (String)this.U;
    }

    public String g() {
        return (String)this.g;
    }

    public String m() {
        String string = "";
        try {
            String string2;
            try {
                string2 = (String)DS.d(this.g);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            string = string2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return string;
    }

    public void I(String string) {
        this.g = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[19];
                        var11_1 = 0;
                        var10_2 = "\u00eb\u00ba\u0093\nTB\t\u00c3s\"47%\t4?\u0007\u001e\u0001o\u00ca\u00fe_|\t\u00e6B\u00c9\u0015\u00b6\u00d6=N+\u0005\u0080\u009b\u0005.\u0003\u0006r[\u00a062\u00c5\u0007\u0082\u00b3\u00fc\u009c\u008c\u00952\u0007\u0007\u00d4\u00ba\u00c0$\u00a4j\b0\u00a2\u00d8\u0016@c\u00dd\u00d0\t8\u00f0]D\u00d8+\u00f4\u00f5\u0080\u0006\u0006\u00d9\u00a0)t\u00d6\u0006\u00105ct\u0004\u00b2\u000b[K\u00d2H\u00d6\u00f2A\u00b9Qsw\bx\u0013\u00d1 a\u00a5\u00f9\b\tC\u00a8}H }\u00ef;q\u0006\u00a2\u00af5'\u00ce\u00d8\u000bB\u00f3\u00f1_\u00b2\u0010\u00cd\u00e5\u00c0\u00f8E";
                        var12_3 = "\u00eb\u00ba\u0093\nTB\t\u00c3s\"47%\t4?\u0007\u001e\u0001o\u00ca\u00fe_|\t\u00e6B\u00c9\u0015\u00b6\u00d6=N+\u0005\u0080\u009b\u0005.\u0003\u0006r[\u00a062\u00c5\u0007\u0082\u00b3\u00fc\u009c\u008c\u00952\u0007\u0007\u00d4\u00ba\u00c0$\u00a4j\b0\u00a2\u00d8\u0016@c\u00dd\u00d0\t8\u00f0]D\u00d8+\u00f4\u00f5\u0080\u0006\u0006\u00d9\u00a0)t\u00d6\u0006\u00105ct\u0004\u00b2\u000b[K\u00d2H\u00d6\u00f2A\u00b9Qsw\bx\u0013\u00d1 a\u00a5\u00f9\b\tC\u00a8}H }\u00ef;q\u0006\u00a2\u00af5'\u00ce\u00d8\u000bB\u00f3\u00f1_\u00b2\u0010\u00cd\u00e5\u00c0\u00f8E".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 44;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "L\f\u0017W\u00ca\u0007+\u00c3\u00b4\u00a9n\u0002\u00a8";
                            var12_3 = "L\f\u0017W\u00ca\u0007+\u00c3\u00b4\u00a9n\u0002\u00a8".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 75;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 120;
                                    break;
                                }
                                case 1: {
                                    v15 = 39;
                                    break;
                                }
                                case 2: {
                                    v15 = 117;
                                    break;
                                }
                                case 3: {
                                    v15 = 49;
                                    break;
                                }
                                case 4: {
                                    v15 = 54;
                                    break;
                                }
                                case 5: {
                                    v15 = 92;
                                    break;
                                }
                                default: {
                                    v15 = 81;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                lp_0.a = var13;
                lp_0.b = new String[19];
                var0_7 = 6310812272046531851L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00ae\u00ed\u00c8\u00b8-)L\u00a4\u009c\u00f1\u00ce\u00a4\u0097\u00df\u0000\u00f1";
                var5_11 = "\u00ae\u00ed\u00c8\u00b8-)L\u00a4\u009c\u00f1\u00ce\u00a4\u0097\u00df\u0000\u00f1".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        lp_0.c = var6_8;
        lp_0.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD040) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 182;
                    break;
                }
                case 1: {
                    n14 = 237;
                    break;
                }
                case 2: {
                    n14 = 5;
                    break;
                }
                case 3: {
                    n14 = 224;
                    break;
                }
                case 4: {
                    n14 = 71;
                    break;
                }
                case 5: {
                    n14 = 117;
                    break;
                }
                case 6: {
                    n14 = 92;
                    break;
                }
                case 7: {
                    n14 = 103;
                    break;
                }
                case 8: {
                    n14 = 218;
                    break;
                }
                case 9: {
                    n14 = 171;
                    break;
                }
                case 10: {
                    n14 = 185;
                    break;
                }
                case 11: {
                    n14 = 191;
                    break;
                }
                case 12: {
                    n14 = 6;
                    break;
                }
                case 13: {
                    n14 = 98;
                    break;
                }
                case 14: {
                    n14 = 135;
                    break;
                }
                case 15: {
                    n14 = 70;
                    break;
                }
                case 16: {
                    n14 = 72;
                    break;
                }
                case 17: {
                    n14 = 42;
                    break;
                }
                case 18: {
                    n14 = 26;
                    break;
                }
                case 19: {
                    n14 = 43;
                    break;
                }
                case 20: {
                    n14 = 99;
                    break;
                }
                case 21: {
                    n14 = 4;
                    break;
                }
                case 22: {
                    n14 = 114;
                    break;
                }
                case 23: {
                    n14 = 100;
                    break;
                }
                case 24: {
                    n14 = 143;
                    break;
                }
                case 25: {
                    n14 = 213;
                    break;
                }
                case 26: {
                    n14 = 54;
                    break;
                }
                case 27: {
                    n14 = 17;
                    break;
                }
                case 28: {
                    n14 = 60;
                    break;
                }
                case 29: {
                    n14 = 20;
                    break;
                }
                case 30: {
                    n14 = 101;
                    break;
                }
                case 31: {
                    n14 = 198;
                    break;
                }
                case 32: {
                    n14 = 136;
                    break;
                }
                case 33: {
                    n14 = 226;
                    break;
                }
                case 34: {
                    n14 = 46;
                    break;
                }
                case 35: {
                    n14 = 132;
                    break;
                }
                case 36: {
                    n14 = 230;
                    break;
                }
                case 37: {
                    n14 = 34;
                    break;
                }
                case 38: {
                    n14 = 201;
                    break;
                }
                case 39: {
                    n14 = 158;
                    break;
                }
                case 40: {
                    n14 = 106;
                    break;
                }
                case 41: {
                    n14 = 128;
                    break;
                }
                case 42: {
                    n14 = 155;
                    break;
                }
                case 43: {
                    n14 = 110;
                    break;
                }
                case 44: {
                    n14 = 22;
                    break;
                }
                case 45: {
                    n14 = 221;
                    break;
                }
                case 46: {
                    n14 = 122;
                    break;
                }
                case 47: {
                    n14 = 179;
                    break;
                }
                case 48: {
                    n14 = 212;
                    break;
                }
                case 49: {
                    n14 = 146;
                    break;
                }
                case 50: {
                    n14 = 82;
                    break;
                }
                case 51: {
                    n14 = 27;
                    break;
                }
                case 52: {
                    n14 = 129;
                    break;
                }
                case 53: {
                    n14 = 200;
                    break;
                }
                case 54: {
                    n14 = 220;
                    break;
                }
                case 55: {
                    n14 = 112;
                    break;
                }
                case 56: {
                    n14 = 108;
                    break;
                }
                case 57: {
                    n14 = 141;
                    break;
                }
                case 58: {
                    n14 = 210;
                    break;
                }
                case 59: {
                    n14 = 74;
                    break;
                }
                case 60: {
                    n14 = 163;
                    break;
                }
                case 61: {
                    n14 = 164;
                    break;
                }
                case 62: {
                    n14 = 208;
                    break;
                }
                case 63: {
                    n14 = 69;
                    break;
                }
                case 64: {
                    n14 = 215;
                    break;
                }
                case 65: {
                    n14 = 107;
                    break;
                }
                case 66: {
                    n14 = 41;
                    break;
                }
                case 67: {
                    n14 = 124;
                    break;
                }
                case 68: {
                    n14 = 168;
                    break;
                }
                case 69: {
                    n14 = 96;
                    break;
                }
                case 70: {
                    n14 = 246;
                    break;
                }
                case 71: {
                    n14 = 252;
                    break;
                }
                case 72: {
                    n14 = 255;
                    break;
                }
                case 73: {
                    n14 = 52;
                    break;
                }
                case 74: {
                    n14 = 150;
                    break;
                }
                case 75: {
                    n14 = 75;
                    break;
                }
                case 76: {
                    n14 = 29;
                    break;
                }
                case 77: {
                    n14 = 231;
                    break;
                }
                case 78: {
                    n14 = 65;
                    break;
                }
                case 79: {
                    n14 = 242;
                    break;
                }
                case 80: {
                    n14 = 160;
                    break;
                }
                case 81: {
                    n14 = 239;
                    break;
                }
                case 82: {
                    n14 = 36;
                    break;
                }
                case 83: {
                    n14 = 170;
                    break;
                }
                case 84: {
                    n14 = 109;
                    break;
                }
                case 85: {
                    n14 = 53;
                    break;
                }
                case 86: {
                    n14 = 187;
                    break;
                }
                case 87: {
                    n14 = 49;
                    break;
                }
                case 88: {
                    n14 = 97;
                    break;
                }
                case 89: {
                    n14 = 159;
                    break;
                }
                case 90: {
                    n14 = 133;
                    break;
                }
                case 91: {
                    n14 = 149;
                    break;
                }
                case 92: {
                    n14 = 238;
                    break;
                }
                case 93: {
                    n14 = 222;
                    break;
                }
                case 94: {
                    n14 = 80;
                    break;
                }
                case 95: {
                    n14 = 88;
                    break;
                }
                case 96: {
                    n14 = 14;
                    break;
                }
                case 97: {
                    n14 = 205;
                    break;
                }
                case 98: {
                    n14 = 56;
                    break;
                }
                case 99: {
                    n14 = 189;
                    break;
                }
                case 100: {
                    n14 = 64;
                    break;
                }
                case 101: {
                    n14 = 83;
                    break;
                }
                case 102: {
                    n14 = 59;
                    break;
                }
                case 103: {
                    n14 = 50;
                    break;
                }
                case 104: {
                    n14 = 12;
                    break;
                }
                case 105: {
                    n14 = 38;
                    break;
                }
                case 106: {
                    n14 = 137;
                    break;
                }
                case 107: {
                    n14 = 45;
                    break;
                }
                case 108: {
                    n14 = 51;
                    break;
                }
                case 109: {
                    n14 = 11;
                    break;
                }
                case 110: {
                    n14 = 19;
                    break;
                }
                case 111: {
                    n14 = 247;
                    break;
                }
                case 112: {
                    n14 = 131;
                    break;
                }
                case 113: {
                    n14 = 23;
                    break;
                }
                case 114: {
                    n14 = 121;
                    break;
                }
                case 115: {
                    n14 = 207;
                    break;
                }
                case 116: {
                    n14 = 165;
                    break;
                }
                case 117: {
                    n14 = 39;
                    break;
                }
                case 118: {
                    n14 = 138;
                    break;
                }
                case 119: {
                    n14 = 63;
                    break;
                }
                case 120: {
                    n14 = 0;
                    break;
                }
                case 121: {
                    n14 = 181;
                    break;
                }
                case 122: {
                    n14 = 7;
                    break;
                }
                case 123: {
                    n14 = 253;
                    break;
                }
                case 124: {
                    n14 = 125;
                    break;
                }
                case 125: {
                    n14 = 197;
                    break;
                }
                case 126: {
                    n14 = 184;
                    break;
                }
                case 127: {
                    n14 = 173;
                    break;
                }
                case 128: {
                    n14 = 178;
                    break;
                }
                case 129: {
                    n14 = 192;
                    break;
                }
                case 130: {
                    n14 = 24;
                    break;
                }
                case 131: {
                    n14 = 89;
                    break;
                }
                case 132: {
                    n14 = 77;
                    break;
                }
                case 133: {
                    n14 = 25;
                    break;
                }
                case 134: {
                    n14 = 37;
                    break;
                }
                case 135: {
                    n14 = 111;
                    break;
                }
                case 136: {
                    n14 = 145;
                    break;
                }
                case 137: {
                    n14 = 130;
                    break;
                }
                case 138: {
                    n14 = 8;
                    break;
                }
                case 139: {
                    n14 = 2;
                    break;
                }
                case 140: {
                    n14 = 44;
                    break;
                }
                case 141: {
                    n14 = 174;
                    break;
                }
                case 142: {
                    n14 = 176;
                    break;
                }
                case 143: {
                    n14 = 228;
                    break;
                }
                case 144: {
                    n14 = 236;
                    break;
                }
                case 145: {
                    n14 = 140;
                    break;
                }
                case 146: {
                    n14 = 249;
                    break;
                }
                case 147: {
                    n14 = 81;
                    break;
                }
                case 148: {
                    n14 = 10;
                    break;
                }
                case 149: {
                    n14 = 3;
                    break;
                }
                case 150: {
                    n14 = 105;
                    break;
                }
                case 151: {
                    n14 = 62;
                    break;
                }
                case 152: {
                    n14 = 48;
                    break;
                }
                case 153: {
                    n14 = 248;
                    break;
                }
                case 154: {
                    n14 = 115;
                    break;
                }
                case 155: {
                    n14 = 209;
                    break;
                }
                case 156: {
                    n14 = 116;
                    break;
                }
                case 157: {
                    n14 = 87;
                    break;
                }
                case 158: {
                    n14 = 58;
                    break;
                }
                case 159: {
                    n14 = 127;
                    break;
                }
                case 160: {
                    n14 = 91;
                    break;
                }
                case 161: {
                    n14 = 28;
                    break;
                }
                case 162: {
                    n14 = 232;
                    break;
                }
                case 163: {
                    n14 = 180;
                    break;
                }
                case 164: {
                    n14 = 118;
                    break;
                }
                case 165: {
                    n14 = 157;
                    break;
                }
                case 166: {
                    n14 = 104;
                    break;
                }
                case 167: {
                    n14 = 113;
                    break;
                }
                case 168: {
                    n14 = 142;
                    break;
                }
                case 169: {
                    n14 = 166;
                    break;
                }
                case 170: {
                    n14 = 161;
                    break;
                }
                case 171: {
                    n14 = 250;
                    break;
                }
                case 172: {
                    n14 = 94;
                    break;
                }
                case 173: {
                    n14 = 214;
                    break;
                }
                case 174: {
                    n14 = 223;
                    break;
                }
                case 175: {
                    n14 = 66;
                    break;
                }
                case 176: {
                    n14 = 95;
                    break;
                }
                case 177: {
                    n14 = 123;
                    break;
                }
                case 178: {
                    n14 = 47;
                    break;
                }
                case 179: {
                    n14 = 126;
                    break;
                }
                case 180: {
                    n14 = 211;
                    break;
                }
                case 181: {
                    n14 = 68;
                    break;
                }
                case 182: {
                    n14 = 235;
                    break;
                }
                case 183: {
                    n14 = 13;
                    break;
                }
                case 184: {
                    n14 = 33;
                    break;
                }
                case 185: {
                    n14 = 186;
                    break;
                }
                case 186: {
                    n14 = 202;
                    break;
                }
                case 187: {
                    n14 = 195;
                    break;
                }
                case 188: {
                    n14 = 188;
                    break;
                }
                case 189: {
                    n14 = 40;
                    break;
                }
                case 190: {
                    n14 = 206;
                    break;
                }
                case 191: {
                    n14 = 147;
                    break;
                }
                case 192: {
                    n14 = 15;
                    break;
                }
                case 193: {
                    n14 = 219;
                    break;
                }
                case 194: {
                    n14 = 85;
                    break;
                }
                case 195: {
                    n14 = 153;
                    break;
                }
                case 196: {
                    n14 = 55;
                    break;
                }
                case 197: {
                    n14 = 243;
                    break;
                }
                case 198: {
                    n14 = 240;
                    break;
                }
                case 199: {
                    n14 = 229;
                    break;
                }
                case 200: {
                    n14 = 199;
                    break;
                }
                case 201: {
                    n14 = 233;
                    break;
                }
                case 202: {
                    n14 = 16;
                    break;
                }
                case 203: {
                    n14 = 35;
                    break;
                }
                case 204: {
                    n14 = 148;
                    break;
                }
                case 205: {
                    n14 = 30;
                    break;
                }
                case 206: {
                    n14 = 244;
                    break;
                }
                case 207: {
                    n14 = 1;
                    break;
                }
                case 208: {
                    n14 = 225;
                    break;
                }
                case 209: {
                    n14 = 154;
                    break;
                }
                case 210: {
                    n14 = 167;
                    break;
                }
                case 211: {
                    n14 = 139;
                    break;
                }
                case 212: {
                    n14 = 120;
                    break;
                }
                case 213: {
                    n14 = 144;
                    break;
                }
                case 214: {
                    n14 = 177;
                    break;
                }
                case 215: {
                    n14 = 79;
                    break;
                }
                case 216: {
                    n14 = 151;
                    break;
                }
                case 217: {
                    n14 = 234;
                    break;
                }
                case 218: {
                    n14 = 57;
                    break;
                }
                case 219: {
                    n14 = 241;
                    break;
                }
                case 220: {
                    n14 = 152;
                    break;
                }
                case 221: {
                    n14 = 190;
                    break;
                }
                case 222: {
                    n14 = 86;
                    break;
                }
                case 223: {
                    n14 = 76;
                    break;
                }
                case 224: {
                    n14 = 204;
                    break;
                }
                case 225: {
                    n14 = 32;
                    break;
                }
                case 226: {
                    n14 = 90;
                    break;
                }
                case 227: {
                    n14 = 73;
                    break;
                }
                case 228: {
                    n14 = 67;
                    break;
                }
                case 229: {
                    n14 = 84;
                    break;
                }
                case 230: {
                    n14 = 93;
                    break;
                }
                case 231: {
                    n14 = 193;
                    break;
                }
                case 232: {
                    n14 = 61;
                    break;
                }
                case 233: {
                    n14 = 251;
                    break;
                }
                case 234: {
                    n14 = 196;
                    break;
                }
                case 235: {
                    n14 = 78;
                    break;
                }
                case 236: {
                    n14 = 194;
                    break;
                }
                case 237: {
                    n14 = 102;
                    break;
                }
                case 238: {
                    n14 = 18;
                    break;
                }
                case 239: {
                    n14 = 21;
                    break;
                }
                case 240: {
                    n14 = 216;
                    break;
                }
                case 241: {
                    n14 = 134;
                    break;
                }
                case 242: {
                    n14 = 254;
                    break;
                }
                case 243: {
                    n14 = 169;
                    break;
                }
                case 244: {
                    n14 = 203;
                    break;
                }
                case 245: {
                    n14 = 162;
                    break;
                }
                case 246: {
                    n14 = 183;
                    break;
                }
                case 247: {
                    n14 = 172;
                    break;
                }
                case 248: {
                    n14 = 227;
                    break;
                }
                case 249: {
                    n14 = 119;
                    break;
                }
                case 250: {
                    n14 = 175;
                    break;
                }
                case 251: {
                    n14 = 9;
                    break;
                }
                case 252: {
                    n14 = 245;
                    break;
                }
                case 253: {
                    n14 = 156;
                    break;
                }
                case 254: {
                    n14 = 217;
                    break;
                }
                default: {
                    n14 = 31;
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
            lp_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4F7A;
        if (d[n11] == null) {
            lp_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

