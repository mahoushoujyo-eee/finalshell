/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import org.icmp4j.j;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;

/*
 * Renamed from dw
 */
public class dw_2 {
    ArrayList N;
    String U;
    String j;
    InetAddress f;
    f3_0 k;
    boolean i;
    Object n;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    dw_2(f3_0 f3_02, String string) {
        this.N = new ArrayList();
        this.i = true;
        this.n = new Object();
        this.k = f3_02;
        this.U = string;
    }

    void Q() {
        try {
            yt_1.F.J(new kd_0(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    synchronized void Z(int n10, String string) {
        block13: {
            int n11;
            String string2;
            int n12;
            int[] nArray;
            block14: {
                block12: {
                    nArray = L9.X();
                    n12 = string.equals((String)this.j);
                    if (nArray != null) break block12;
                    if (n12 == 0) break block13;
                    n12 = n10;
                }
                if (nArray != null) break block14;
                if (n12 >= ((ArrayList)this.N).size() - 1) break block13;
                n12 = 0;
            }
            int n13 = n12;
            ArrayList<L9> arrayList = new ArrayList<L9>();
            L9 l9 = (L9)((ArrayList)this.N).get(((ArrayList)this.N).size() - 1);
            try {
                string2 = (String)l9.o();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            String string3 = string2;
            try {
                n11 = (Integer)l9.O();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            int n14 = n11;
            if (string3 != null) {
                int n15 = 1;
                while (n15 < ((ArrayList)this.N).size()) {
                    L9 l92 = (L9)((ArrayList)this.N).get(((ArrayList)this.N).size() - n15 - 1);
                    if (nArray == null) {
                        String string4;
                        try {
                            string4 = (String)l92.o();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string3.equals(string4)) {
                            arrayList.add(l92);
                            --n14;
                        }
                        ++n15;
                    }
                    if (nArray == null) continue;
                }
            }
        }
    }

    synchronized void S() {
        block20: {
            ArrayList<L9> arrayList;
            int n10;
            int[] nArray;
            block19: {
                int n11;
                String string;
                int n12;
                block21: {
                    nArray = L9.X();
                    n12 = ((ArrayList)this.N).size();
                    if (nArray != null) break block21;
                    if (n12 <= 1) break block20;
                    n12 = 0;
                }
                n10 = n12;
                L9 l9 = (L9)((ArrayList)this.N).get(((ArrayList)this.N).size() - 1);
                try {
                    string = (String)l9.o();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string2 = string;
                if (string2 == null) {
                    return;
                }
                try {
                    n11 = (Integer)l9.O();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                int n13 = n11;
                arrayList = new ArrayList<L9>();
                int n14 = 1;
                while (n14 < ((ArrayList)this.N).size()) {
                    L9 l92 = (L9)((ArrayList)this.N).get(((ArrayList)this.N).size() - n14 - 1);
                    if (nArray != null) break block19;
                    if (nArray == null) {
                        String string3;
                        try {
                            string3 = (String)l92.o();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (string2.equals(string3)) {
                            arrayList.add(l92);
                            --n13;
                        }
                        ++n14;
                    }
                    if (nArray == null) continue;
                }
                try {
                    l9.l(n13);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            for (L9 l92 : arrayList) {
                ((ArrayList)this.N).remove(l92);
                n10 = 1;
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block20;
            }
            if (n10 != 0) {
                try {
                    this.k.m();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }

    void f(L9 l9) {
        String string;
        int n10;
        int n11;
        try {
            n11 = (Integer)l9.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n12 = n11;
        int n13 = Math.abs(new Random().nextInt(dw_2.a(14120, 6740195840310472513L)));
        try {
            n10 = (Integer)l9.O();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n14 = n10 + 1;
        j j2 = new j();
        j2.v(false);
        j2.R(System.currentTimeMillis());
        try {
            xq_0.A().E((InetAddress)this.f, n13, n14, new lo_2(this, j2, l9));
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            xQ.x.W((Object)new cn_0(this, j2, l9), dw_2.a(13039, 794786308109888132L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string = (String)l9.o();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (string == null) {
            // empty if block
        }
    }

    void M() {
        this.i = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void o() {
        var2_1 = this.n;
        synchronized (var2_1) {
            block48: {
                block53: {
                    block47: {
                        var1_2 = L9.X();
                        var3_3 = new ArrayList<L9>();
                        var4_4 = dw_2.a(10859, 3771339016516334083L);
                        var5_5 = new TreeMap<Integer, j>();
                        var6_6 = Math.abs(new Random().nextInt(dw_2.a(20864, 3848744046678215146L)));
                        for (var7_7 = 1; var7_7 <= var4_4; ++var7_7) {
                            var8_10 = var6_6 + var7_7;
                            var9_12 = var7_7;
                            var10_13 = new j();
                            try {
                                var10_13.R(System.currentTimeMillis());
                                var5_5.put(var9_12, var10_13);
                                xq_0.A().E((InetAddress)this.f, var8_10, var9_12, new kk_2(this, var10_13, var9_12));
                                if (var1_2 == null) {
                                    continue;
                                }
                                break block47;
                            }
                            catch (InterruptedException v0) {
                                throw dw_2.a(v0);
                            }
                            {
                                catch (NotOpenException | PcapNativeException var11_14) {
                                    // empty catch block
                                }
                            }
                            if (var1_2 == null) continue;
                        }
                        try {
                            Thread.sleep(dw_2.c);
                        }
                        catch (InterruptedException var7_8) {
                            // empty catch block
                        }
                    }
                    var7_9 = 0;
                    var8_11 = var5_5.keySet().iterator();
                    while (var8_11.hasNext()) {
                        block52: {
                            block51: {
                                block49: {
                                    block50: {
                                        var9_12 = (Integer)var8_11.next();
                                        var10_13 = (j)var5_5.get(var9_12);
                                        var11_15 = var10_13.A();
                                        var12_16 = null;
                                        try {
                                            v1 = var11_15;
                                            if (var1_2 != null) break block48;
                                            if (v1 != null) {
                                                // empty if block
                                            }
                                        }
                                        catch (PcapNativeException v2) {
                                            throw dw_2.a(v2);
                                        }
                                        if (var12_16 == null) {
                                            var12_16 = new L9();
                                            var13_17 = new KV();
                                            try {
                                                var13_17.s(true);
                                            }
                                            catch (InvocationTargetException v3) {
                                                throw v3.getTargetException();
                                            }
                                            try {
                                                var12_16.E(var13_17);
                                            }
                                            catch (InvocationTargetException v4) {
                                                throw v4.getTargetException();
                                            }
                                            try {
                                                var12_16.u(var11_15);
                                            }
                                            catch (InvocationTargetException v5) {
                                                throw v5.getTargetException();
                                            }
                                        }
                                        try {
                                            var12_16.l(var7_9);
                                        }
                                        catch (InvocationTargetException v6) {
                                            throw v6.getTargetException();
                                        }
                                        v7 = var3_3.add(var12_16);
                                        if (var1_2 != null) break block49;
                                        try {
                                            block54: {
                                                if (var11_15 == null) break block50;
                                                break block54;
                                                catch (PcapNativeException v8) {
                                                    throw dw_2.a(v8);
                                                }
                                            }
                                            try {
                                                lk_0.x((Object)var12_16, this.k);
                                            }
                                            catch (InvocationTargetException v9) {
                                                throw v9.getTargetException();
                                            }
                                            try {
                                                lk_0.E((Object)var12_16, this.k);
                                            }
                                            catch (InvocationTargetException v10) {
                                                throw v10.getTargetException();
                                            }
                                        }
                                        catch (PcapNativeException v11) {
                                            throw dw_2.a(v11);
                                        }
                                    }
                                    try {
                                        v12 = var10_13;
                                        if (var1_2 != null) break block51;
                                        v7 = v12.q();
                                    }
                                    catch (PcapNativeException v13) {
                                        throw dw_2.a(v13);
                                    }
                                }
                                if (!v7) {
                                    var13_17 = var10_13.h();
                                    var14_18 = var10_13.A();
                                    try {
                                        var12_16.g(true);
                                    }
                                    catch (InvocationTargetException v14) {
                                        throw v14.getTargetException();
                                    }
                                }
                                v12 = var10_13;
                            }
                            v15 = v12.A();
                            if (var1_2 != null) break block52;
                            try {
                                block55: {
                                    if (v15 == null) ** GOTO lbl143
                                    break block55;
                                    catch (PcapNativeException v16) {
                                        throw dw_2.a(v16);
                                    }
                                }
                                v15 = (String)this.j;
                            }
                            catch (PcapNativeException v17) {
                                throw dw_2.a(v17);
                            }
                        }
                        if (!v15.equals(var10_13.A())) ** GOTO lbl143
                        try {
                            block56: {
                                if (var1_2 == null) break block53;
                                break block56;
                                catch (PcapNativeException v18) {
                                    throw dw_2.a(v18);
                                }
                            }
                            ++var7_9;
                            if (var1_2 == null) continue;
                            break;
                        }
                        catch (PcapNativeException v19) {
                            throw dw_2.a(v19);
                        }
                    }
                }
                this.N = var3_3;
                try {
                    this.k.m();
                }
                catch (InvocationTargetException v20) {
                    throw v20.getTargetException();
                }
                v1 = var2_1;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return;
        }
    }

    public f3_0 W() {
        return (f3_0)this.k;
    }

    public void b(f3_0 f3_02) {
        this.k = f3_02;
    }

    public ArrayList R() {
        return (ArrayList)this.N;
    }

    public void v(ArrayList arrayList) {
        this.N = arrayList;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                block8: {
                    var2 = 2032872822685852955L;
                    var8_1 = new long[4];
                    var5_2 = 0;
                    var6_3 = "\u00a8l\u00c7\u00c4b\u00ba\u00978\u001f>q\u00b3\u001f\u00f95\u00a5";
                    var7_4 = "\u00a8l\u00c7\u00c4b\u00ba\u00978\u001f>q\u00b3\u001f\u00f95\u00a5".length();
                    var4_5 = 0;
                    while (true) {
                        var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                        v0 = var8_1;
                        v1 = var5_2++;
                        v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                        v3 = -1;
                        break block8;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        var6_3 = "t\u00d1y\u0096`\u001b\u00d3\u000e\u00a3Fl\u008cj\u0087\u008c\u001b";
                        var7_4 = "t\u00d1y\u0096`\u001b\u00d3\u000e\u00a3Fl\u008cj\u0087\u008c\u001b".length();
                        var4_5 = 0;
                        while (true) {
                            var9_6 = var6_3.substring(var4_5, var4_5 += 8).getBytes("ISO-8859-1");
                            v0 = var8_1;
                            v1 = var5_2++;
                            v2 = ((long)var9_6[0] & 255L) << 56 | ((long)var9_6[1] & 255L) << 48 | ((long)var9_6[2] & 255L) << 40 | ((long)var9_6[3] & 255L) << 32 | ((long)var9_6[4] & 255L) << 24 | ((long)var9_6[5] & 255L) << 16 | ((long)var9_6[6] & 255L) << 8 | (long)var9_6[7] & 255L;
                            v3 = 0;
                            break block8;
                            break;
                        }
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        v0[v1] = v4;
                        if (var4_5 < var7_4) ** continue;
                        break block9;
                        break;
                    }
                }
                v4 = v2 ^ var2;
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl38:
                    // 1 sources

                    ** continue;
                }
            }
            dw_2.a = var8_1;
            dw_2.b = new Integer[4];
            break block10;
lbl43:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 2724642410473835435L;
        ** while (true)
        dw_2.c = 2724642410473834563L ^ var0_7;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5868;
        if (b[n11] == null) {
            dw_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

