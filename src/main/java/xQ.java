/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.icmp4j.j;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV4DestinationUnreachablePacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IcmpV4EchoReplyPacket;
import org.pcap4j.packet.IcmpV4TimeExceededPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.util.MacAddress;

public class xQ {
    public MacAddress T;
    public MacAddress i;
    public PcapHandle z;
    String A;
    int k;
    String v;
    PcapNetworkInterface B;
    PcapNetworkInterface c;
    private final int S = -1;
    public int u;
    public static d8_0 x;
    private final int M;
    LinkedBlockingQueue n;
    Random I;
    boolean G;
    short V;
    boolean E;
    public boolean h;
    boolean e;
    public boolean R;
    Inet4Address j;
    public static ScheduledExecutorService W;
    HashMap Q;
    HashMap s;
    HashSet t;
    HashSet C;
    private static String[] b;
    private static final String[] d;
    private static final String[] f;
    private static final long[] a;
    private static final Integer[] g;
    private static final long[] l;
    private static final Long[] m;

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[7];
                                var19_1 = 0;
                                var18_2 = "WB\u00d5/Ed\u00b2R\u0083\u0087\u00c6\u0098\u00a4J(\u0018\u000b\u00a4\u00f5o\u00c2o\u0098Dq1\u00f2\u00faf\u0001\u00d8\u001c\u008f\u0084\u00a5Oi\u00f4\u00ad\u001e\u000f,4\u00ba\u00e1\u00a8\u00bd\u000fi4\u00e00tz\u00d7\u00f3\u000f\u00ed0\u00d7 \u00f5\u00de\u001c|\u00ee\u00be\u00f5\u00e5\u0090\u00ec\u0087\u0007\u00a4\u0093\u008f3\u00cb0I";
                                var20_3 = "WB\u00d5/Ed\u00b2R\u0083\u0087\u00c6\u0098\u00a4J(\u0018\u000b\u00a4\u00f5o\u00c2o\u0098Dq1\u00f2\u00faf\u0001\u00d8\u001c\u008f\u0084\u00a5Oi\u00f4\u00ad\u001e\u000f,4\u00ba\u00e1\u00a8\u00bd\u000fi4\u00e00tz\u00d7\u00f3\u000f\u00ed0\u00d7 \u00f5\u00de\u001c|\u00ee\u00be\u00f5\u00e5\u0090\u00ec\u0087\u0007\u00a4\u0093\u008f3\u00cb0I".length();
                                xQ.I(new String[1]);
                                var17_4 = 15;
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 23;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "D\u00c7\u00fd\u0092\u00ab\u00af\b\u00c8\u00ea\u0001\u00b6\u00a2\u00a7\u001e\u000b";
                                    var20_3 = "D\u00c7\u00fd\u0092\u00ab\u00af\b\u00c8\u00ea\u0001\u00b6\u00a2\u00a7\u001e\u000b".length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 60;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl29:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl86
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 82;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 75;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 24;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 41;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 101;
                                            break;
                                        }
                                        default: {
                                            v15 = 70;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
                                    v8 = v11;
                                    if (v11 != 0) break;
                                    v11 = v8;
                                    v9 = v9;
                                    v14 = v8;
                                    v12 = v9;
                                    v13 = v8;
                                }
lbl86:
                                // 2 sources

                                v16 = v9;
                                v10 = v10;
                            } while (v10 > var22_6);
                            v4 = new String(v16);
                            switch (v3) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl96:
                                // 1 sources

                                ** continue;
                            }
                        }
                        xQ.d = var21;
                        xQ.f = new String[7];
                        var8_7 = 2151814781096946377L;
                        var14_8 = new long[9];
                        var11_9 = 0;
                        var12_10 = "O\u00cb%\u00ee\u0019\u0013\u00a5\u00b9KyP\u00fb\u00a5\n\u00b1\u0017\u00c0\u0087\u00acS.\u00afg\u0011;-\u00ff\u00bf\u001a6\u00fes\u0097J;\u00c4\u00b5\u00d8\u0002\u0005\u001e{\u00e6C\u00f2\u008e\u009a\u00daT\u00ad\u009eVz\u00f6\u0082\u00e3";
                        var13_11 = "O\u00cb%\u00ee\u0019\u0013\u00a5\u00b9KyP\u00fb\u00a5\n\u00b1\u0017\u00c0\u0087\u00acS.\u00afg\u0011;-\u00ff\u00bf\u001a6\u00fes\u0097J;\u00c4\u00b5\u00d8\u0002\u0005\u001e{\u00e6C\u00f2\u008e\u009a\u00daT\u00ad\u009eVz\u00f6\u0082\u00e3".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl113:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "y\u00c9\u00ec\u00fe]\u00ae\u00d0\u00d0\u0018\u00ca\u00e7\u0012\u00d9|\u00fd\u0085";
                            var13_11 = "y\u00c9\u00ec\u00fe]\u00ae\u00d0\u00d0\u0018\u00ca\u00e7\u0012\u00d9|\u00fd\u0085".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl126:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
                    switch (v20) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl137:
                        // 1 sources

                        ** continue;
                    }
                }
                xQ.a = var14_8;
                xQ.g = new Integer[9];
                var0_14 = 7246504059379158680L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = ".ro\u0000\u00b7\u00bd\u0089\u00e9y\u00ad\u00ab5\u00e9\u0001\u00cc\u00a1";
                var5_18 = ".ro\u0000\u00b7\u00bd\u0089\u00e9y\u00ad\u00ab5\u00e9\u0001\u00cc\u00a1".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl154:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "L}\u0006[\u00b9\u00ed\u0081~hlB>2\u0096\bd";
                    var5_18 = "L}\u0006[\u00b9\u00ed\u0081~hlB>2\u0096\bd".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl167:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl178:
                // 1 sources

                ** continue;
            }
        }
        xQ.l = var6_15;
        xQ.m = new Long[4];
        xQ.x = new d8_0();
        xQ.W = Executors.newSingleThreadScheduledExecutor();
    }

    public xQ(boolean bl, boolean bl2) {
        block11: {
            boolean bl3;
            block12: {
                block13: {
                    String[] stringArray;
                    block9: {
                        block10: {
                            this.A = "5.5.5.5";
                            stringArray = xQ.B();
                            this.k = xQ.a(28505, 1083944260511327002L);
                            this.v = "";
                            this.S = -1;
                            this.u = 1;
                            this.M = xQ.a(13056, 1352336992268664652L);
                            this.n = new LinkedBlockingQueue();
                            this.I = new Random();
                            this.G = false;
                            this.E = true;
                            this.h = false;
                            this.e = false;
                            this.R = true;
                            this.j = null;
                            try {
                                bl3 = (Boolean)vk_0.s();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (stringArray == null) break block9;
                            if (!bl3) break block10;
                            this.u = 1;
                            if (stringArray != null) break block11;
                        }
                        try {
                            bl3 = (Boolean)vk_0.f();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    if (stringArray == null) break block12;
                    if (!bl3) break block13;
                    this.u = 0;
                    if (stringArray != null) break block11;
                }
                try {
                    bl3 = (Boolean)vk_0.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            if (bl3) {
                this.u = 1;
            }
        }
        this.Q = new HashMap();
        this.s = new HashMap();
        this.t = new HashSet();
        this.C = new HashSet();
        this.G = bl;
        this.R = bl2;
    }

    public void u() throws Exception {
        try {
            x.V((Object)new do_0(this), xQ.a(20555, 2451780543939697678L));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * Unable to fully structure code
     */
    void x() {
        var2_1 = null;
        var1_2 = xQ.B();
        try {
            var2_1 = Pcaps.findAllDevs();
        }
        catch (PcapNativeException var3_3) {
            return;
        }
        var4_5 = var2_1.iterator();
        if (var1_2 != null) ** GOTO lbl39
        block8: while (true) {
            block10: {
                var3_4 = var4_5.next();
                v0 = this.t.contains(var3_4.getName());
                if (var1_2 == null) ** GOTO lbl42
                if (v0) break block10;
                try {
                    block11: {
                        v0 = this.C.contains(var3_4.getName());
                        if (var1_2 == null) ** GOTO lbl42
                        break block11;
                        catch (PcapNativeException v1) {
                            throw xQ.a(v1);
                        }
                    }
                    if (v0) break block10;
                }
                catch (PcapNativeException v2) {
                    throw xQ.a(v2);
                }
                try {
                    this.D(var3_4);
                    this.t.add(var3_4.getName());
                }
                catch (NotOpenException | PcapNativeException var5_6) {
                    this.C.add(var3_4.getName());
                    var5_6.getMessage().contains("denied");
                    var5_6.getMessage().contains("not implemented");
                }
            }
            do {
                v0 = var4_5.hasNext();
lbl42:
                // 3 sources

                if (v0) continue block8;
            } while (var1_2 == null);
            break;
        }
    }

    void D(PcapNetworkInterface pcapNetworkInterface) throws PcapNativeException, NotOpenException {
        PcapHandle pcapHandle = pcapNetworkInterface.openLive(xQ.a(19596, 7166196519583858892L), this.r(pcapNetworkInterface), this.u);
        Object object = "";
        object = "icmp or ( udp and  host " + this.A + ")";
        kg_0 kg_02 = new kg_0(this, pcapNetworkInterface, pcapHandle);
        jj_0 jj_02 = new jj_0(this, pcapHandle, kg_02, pcapNetworkInterface);
        jj_02.start();
    }

    PcapNetworkInterface.PromiscuousMode r(PcapNetworkInterface pcapNetworkInterface) {
        PcapNetworkInterface.PromiscuousMode promiscuousMode = null;
        String string = (pcapNetworkInterface.getDescription() + ":" + pcapNetworkInterface.getName()).toLowerCase();
        promiscuousMode = string.contains("wireless") ? PcapNetworkInterface.PromiscuousMode.NONPROMISCUOUS : PcapNetworkInterface.PromiscuousMode.PROMISCUOUS;
        return promiscuousMode;
    }

    public j E(InetAddress inetAddress, int n10, int n11, Q0 q0) throws PcapNativeException, NotOpenException {
        j j2;
        block8: {
            InetAddress inetAddress2;
            block7: {
                j2 = null;
                String[] stringArray = xQ.B();
                try {
                    if (this.i == null) {
                        throw new NotOpenException("local_mac==null");
                    }
                }
                catch (PcapNativeException pcapNativeException) {
                    throw xQ.a(pcapNativeException);
                }
                try {
                    try {
                        inetAddress2 = inetAddress;
                        if (stringArray == null) break block7;
                        if (!(inetAddress2 instanceof Inet4Address)) break block8;
                    }
                    catch (PcapNativeException pcapNativeException) {
                        throw xQ.a(pcapNativeException);
                    }
                    inetAddress2 = inetAddress;
                }
                catch (PcapNativeException pcapNativeException) {
                    throw xQ.a(pcapNativeException);
                }
            }
            Inet4Address inet4Address = (Inet4Address)inetAddress2;
            Packet packet = gQ.A(this.i, this.T, this.j, inet4Address, n10, n11);
            j2 = new j();
            j2.a(q0);
            j2.f(inetAddress);
            j2.q(n10);
            String string = "" + j2.H();
            this.s.put(string, j2);
            W.schedule(new O5(this, string), xQ.b(17691, 935767074703057388L), TimeUnit.MILLISECONDS);
            this.z.sendPacket(packet);
            j2.R(System.currentTimeMillis());
        }
        return j2;
    }

    public j p(InetAddress inetAddress, int n10, Q0 q0) throws PcapNativeException, NotOpenException {
        j j2;
        block8: {
            InetAddress inetAddress2;
            block7: {
                j2 = null;
                String[] stringArray = xQ.B();
                try {
                    if (this.i == null) {
                        throw new NotOpenException("local_mac==null");
                    }
                }
                catch (PcapNativeException pcapNativeException) {
                    throw xQ.a(pcapNativeException);
                }
                try {
                    try {
                        inetAddress2 = inetAddress;
                        if (stringArray == null) break block7;
                        if (!(inetAddress2 instanceof Inet4Address)) break block8;
                    }
                    catch (PcapNativeException pcapNativeException) {
                        throw xQ.a(pcapNativeException);
                    }
                    inetAddress2 = inetAddress;
                }
                catch (PcapNativeException pcapNativeException) {
                    throw xQ.a(pcapNativeException);
                }
            }
            Inet4Address inet4Address = (Inet4Address)inetAddress2;
            Packet packet = gQ.S(this.i, this.T, this.j, inet4Address, n10);
            j2 = new j();
            j2.a(q0);
            j2.f(inetAddress);
            j2.q(n10);
            String string = j2.Y().getHostAddress() + ":" + j2.H();
            this.Q.put(string, j2);
            W.schedule(new jn_0(this, string), xQ.b(19456, 2949232511153416438L), TimeUnit.MILLISECONDS);
            this.z.sendPacket(packet);
            j2.R(System.currentTimeMillis());
        }
        return j2;
    }

    /*
     * Unable to fully structure code
     */
    public void i(Packet var1_1) {
        block21: {
            var2_2 = xQ.B();
            try {
                block20: {
                    block19: {
                        block18: {
                            block16: {
                                block17: {
                                    var3_3 = (EthernetPacket)var1_1;
                                    var4_5 = null;
                                    try {
                                        v0 = this.e;
                                        if (var2_2 == null) break block16;
                                        if (!v0) break block17;
                                    }
                                    catch (IllegalRawDataException v1) {
                                        throw xQ.a(v1);
                                    }
                                    var4_5 = this.n(var3_3);
                                    break block19;
                                }
                                try {
                                    v2 = var3_3.getPayload();
                                    if (var2_2 == null) break block18;
                                    v0 = v2 instanceof IpV4Packet;
                                }
                                catch (IllegalRawDataException v3) {
                                    throw xQ.a(v3);
                                }
                            }
                            try {
                                if (!v0) break block19;
                                v2 = var3_3.getPayload();
                            }
                            catch (IllegalRawDataException v4) {
                                throw xQ.a(v4);
                            }
                        }
                        var4_5 = (IpV4Packet)v2;
                    }
                    try {
                        v5 = var4_5;
                        if (var2_2 == null) break block20;
                        if (v5 == null) break block21;
                    }
                    catch (IllegalRawDataException v6) {
                        throw xQ.a(v6);
                    }
                    v5 = var4_5;
                }
                var5_6 = v5.getHeader();
                try {
                    v7 = var4_5.getPayload() instanceof IcmpV4CommonPacket;
                    if (var2_2 == null) break block21;
                    if (v7) {
                    }
                    ** GOTO lbl54
                }
                catch (IllegalRawDataException v8) {
                    throw xQ.a(v8);
                }
                var6_7 = (IcmpV4CommonPacket)var4_5.getPayload();
                try {
                    this.C(var6_7, var5_6);
                    if (var2_2 != null) break block21;
lbl54:
                    // 2 sources

                    v7 = var3_3.getPayload() instanceof IllegalPacket;
                }
                catch (IllegalRawDataException v9) {
                    throw xQ.a(v9);
                }
            }
            catch (IllegalRawDataException var3_4) {
                var3_4.printStackTrace();
            }
        }
    }

    public void C(IcmpV4CommonPacket icmpV4CommonPacket, IpV4Packet.IpV4Header ipV4Header) {
        block21: {
            IcmpV4Type icmpV4Type;
            IcmpV4CommonPacket.IcmpV4CommonHeader icmpV4CommonHeader;
            block24: {
                Object object;
                B0 b0;
                Q0 q0;
                Object object2;
                String[] stringArray;
                block25: {
                    j j2;
                    Object object3;
                    AbstractPacket.AbstractHeader abstractHeader;
                    AbstractPacket abstractPacket;
                    IcmpV4Type icmpV4Type2;
                    block22: {
                        block23: {
                            String string;
                            block19: {
                                block20: {
                                    icmpV4CommonHeader = icmpV4CommonPacket.getHeader();
                                    stringArray = xQ.B();
                                    icmpV4Type = icmpV4CommonHeader.getType();
                                    icmpV4Type2 = IcmpV4Type.DESTINATION_UNREACHABLE;
                                    if (stringArray == null) break block19;
                                    if (icmpV4Type != icmpV4Type2) break block20;
                                    abstractPacket = (IcmpV4DestinationUnreachablePacket)icmpV4CommonPacket.getPayload();
                                    abstractHeader = ((IcmpV4DestinationUnreachablePacket)abstractPacket).getHeader();
                                    object3 = ipV4Header.getSrcAddr().getHostAddress() + ":" + ((IcmpV4DestinationUnreachablePacket.IcmpV4DestinationUnreachableHeader)abstractHeader).getUnused();
                                    object2 = (j)this.Q.get(object3);
                                    if (object2 == null) break block21;
                                    long l2 = System.currentTimeMillis() - (long)this.u;
                                    if (stringArray != null) {
                                        if (l2 < ((j)object2).R()) {
                                            l2 = ((j)object2).R();
                                        }
                                        ((j)object2).i(l2);
                                        ((j)object2).w((int)(((j)object2).q() - ((j)object2).R()));
                                        ((j)object2).P(true);
                                    }
                                    Q0 q02 = ((j)object2).E();
                                    if (stringArray != null) {
                                        if (q02 != null) {
                                            B0 b02 = new B0(B0.t);
                                            b02.q((j)object2);
                                            q02.a(b02);
                                        }
                                        ((j)object2).v(true);
                                    }
                                    if (stringArray != null) break block21;
                                }
                                icmpV4Type = icmpV4CommonHeader.getType();
                                icmpV4Type2 = IcmpV4Type.TIME_EXCEEDED;
                            }
                            if (stringArray == null) break block22;
                            if (icmpV4Type != icmpV4Type2) break block23;
                            abstractPacket = (IcmpV4TimeExceededPacket)icmpV4CommonPacket.getPayload();
                            abstractHeader = ((IcmpV4TimeExceededPacket)abstractPacket).getHeader();
                            Object object4 = object3 = (IcmpV4EchoPacket)((IcmpV4TimeExceededPacket)abstractPacket).getPayload().getPayload().getPayload();
                            if (stringArray != null) {
                                if (object4 == null) {
                                    return;
                                }
                                object4 = object3;
                            }
                            if ((j2 = (j)this.s.get(string = "" + ((IcmpV4EchoPacket.IcmpV4EchoHeader)(object2 = ((IcmpV4EchoPacket)object4).getHeader())).getSequenceNumberAsInt())) == null) break block21;
                            long l3 = System.currentTimeMillis() - (long)this.u;
                            if (stringArray != null) {
                                if (l3 < j2.R()) {
                                    l3 = j2.R();
                                }
                                j2.i(l3);
                                j2.w((int)(j2.q() - j2.R()));
                                j2.P(true);
                                j2.S(ipV4Header.getSrcAddr().getHostAddress());
                            }
                            q0 = j2.E();
                            if (stringArray != null) {
                                if (q0 != null) {
                                    b0 = new B0(B0.m);
                                    b0.q(j2);
                                    q0.a(b0);
                                }
                                j2.v(true);
                            }
                            if (stringArray != null) break block21;
                        }
                        icmpV4Type = icmpV4CommonHeader.getType();
                        if (stringArray == null) break block21;
                        icmpV4Type2 = IcmpV4Type.ECHO_REPLY;
                    }
                    if (icmpV4Type != icmpV4Type2) break block24;
                    abstractPacket = (IcmpV4EchoReplyPacket)icmpV4CommonPacket.getPayload();
                    abstractHeader = ((IcmpV4EchoReplyPacket)abstractPacket).getHeader();
                    object3 = ipV4Header.getSrcAddr().getHostAddress() + ":" + ((IcmpV4EchoReplyPacket.IcmpV4EchoReplyHeader)abstractHeader).getSequenceNumberAsInt();
                    object2 = (j)this.Q.get(object3);
                    String string = "" + ((IcmpV4EchoReplyPacket.IcmpV4EchoReplyHeader)abstractHeader).getSequenceNumberAsInt();
                    j2 = (j)this.s.get(string);
                    object = object2;
                    if (stringArray != null) {
                        if (object == null) {
                            object2 = j2;
                        }
                        object = object2;
                    }
                    if (stringArray == null) break block25;
                    if (object == null) break block21;
                    object = object2;
                }
                ((j)object).S(ipV4Header.getSrcAddr().getHostAddress());
                long l4 = System.currentTimeMillis() - (long)this.u;
                if (stringArray != null) {
                    if (l4 < ((j)object2).R()) {
                        l4 = ((j)object2).R();
                    }
                    ((j)object2).i(l4);
                    ((j)object2).w((int)(((j)object2).q() - ((j)object2).R()));
                    ((j)object2).P(true);
                }
                q0 = ((j)object2).E();
                if (stringArray != null) {
                    if (q0 != null) {
                        b0 = new B0(B0.t);
                        b0.q((j)object2);
                        q0.a(b0);
                    }
                    ((j)object2).v(true);
                }
                if (stringArray != null) break block21;
            }
            icmpV4CommonHeader.getType();
            icmpV4Type = IcmpV4Type.ECHO;
        }
    }

    IpV4Packet n(EthernetPacket ethernetPacket) throws IllegalRawDataException {
        IpV4Packet ipV4Packet;
        block14: {
            byte[] byArray;
            block16: {
                short s2;
                int n10;
                String[] stringArray;
                byte[] byArray2;
                block15: {
                    int n11;
                    block13: {
                        ipV4Packet = null;
                        byArray2 = ethernetPacket.getPayload().getRawData();
                        stringArray = xQ.B();
                        try {
                            try {
                                try {
                                    n10 = byArray2.length;
                                    n11 = xQ.a(17212, 3610664135112806264L);
                                    if (stringArray == null) break block13;
                                    if (n10 <= n11) break block14;
                                }
                                catch (IllegalRawDataException illegalRawDataException) {
                                    throw xQ.a(illegalRawDataException);
                                }
                                n10 = byArray2[xQ.a(25696, 1409686679685523490L)];
                                if (stringArray == null) break block15;
                            }
                            catch (IllegalRawDataException illegalRawDataException) {
                                throw xQ.a(illegalRawDataException);
                            }
                            n11 = xQ.a(31767, 7136118817418735702L);
                        }
                        catch (IllegalRawDataException illegalRawDataException) {
                            throw xQ.a(illegalRawDataException);
                        }
                    }
                    if (n10 != n11) break block14;
                    n10 = 2;
                }
                byte[] byArray3 = new byte[n10];
                System.arraycopy(byArray2, 4, byArray3, 0, 2);
                try {
                    s2 = (Short)cl_2.N((Object)byArray3, 0);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                short s3 = s2;
                int n12 = xQ.c(s3) - 2;
                byArray = new byte[n12];
                int n13 = byArray2.length - xQ.a(25696, 1409686679685523490L);
                try {
                    try {
                        gQ.V[2] = byArray2[2];
                        gQ.V[3] = byArray2[3];
                        if (stringArray == null) break block16;
                        if (n12 != byArray2.length - xQ.a(25696, 1409686679685523490L)) break block14;
                    }
                    catch (IllegalRawDataException illegalRawDataException) {
                        throw xQ.a(illegalRawDataException);
                    }
                    System.arraycopy(byArray2, xQ.a(25696, 1409686679685523490L), byArray, 0, n12);
                }
                catch (IllegalRawDataException illegalRawDataException) {
                    throw xQ.a(illegalRawDataException);
                }
            }
            ipV4Packet = IpV4Packet.newPacket(byArray, 0, byArray.length);
        }
        return ipV4Packet;
    }

    /*
     * Unable to fully structure code
     */
    public static String F(byte[] var0) {
        var2_1 = new StringBuffer();
        var3_2 = 0;
        var1_3 = xQ.B();
        if (var1_3 != null) ** GOTO lbl16
        block0: while (true) {
            v0 = Integer.toHexString(var0[var3_2] & xQ.a(6146, 2752411197042136133L));
            do {
                var4_4 = v0;
                var4_4 = var4_4.replaceAll(":", " ");
                if (var1_3 != null) {
                    if (var4_4.length() == 1) {
                        var4_4 = "0" + (String)var4_4;
                    }
                    var2_1.append((String)var4_4 + " ");
                }
                ++var3_2;
lbl16:
                // 2 sources

                if (var3_2 < var0.length) continue block0;
                v0 = var2_1.toString();
            } while (var1_3 == null);
            break;
        }
        return v0;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        InetAddress inetAddress;
        String[] stringArray;
        block11: {
            InetAddress inetAddress2 = null;
            stringArray = xQ.B();
            try {
                inetAddress2 = InetAddress.getByName(this.A);
            }
            catch (UnknownHostException unknownHostException) {
                // empty catch block
            }
            try {
                inetAddress = inetAddress2;
                if (stringArray == null) break block11;
                if (inetAddress == null) {
                    return;
                }
            }
            catch (UnknownHostException unknownHostException) {
                throw xQ.a(unknownHostException);
            }
            inetAddress = inetAddress2;
        }
        String string = inetAddress.getHostAddress();
        int n10 = 0;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && stringArray != null) continue;
            try {
                DatagramSocket datagramSocket = new DatagramSocket();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[1], 1);
                datagramPacket.setAddress(InetAddress.getByName(string));
                datagramPacket.setPort(this.k);
                datagramSocket.send(datagramPacket);
                datagramSocket.close();
                Thread.sleep(xQ.b(10040, 2106956996069114829L));
                if (this.i != null) {
                    return;
                }
            }
            catch (Exception exception) {
                try {
                    Thread.sleep(xQ.b(25569, 5396066673679992597L));
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            ++n10;
        } while (n10 < 3);
    }

    public short E() {
        return this.V;
    }

    public void K(short s2) {
        this.V = s2;
    }

    public static int c(short s2) {
        return s2 & xQ.a(32353, 7043884782288663079L);
    }

    public static void I(String[] stringArray) {
        b = stringArray;
    }

    public static String[] B() {
        return b;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x1ECD) & 0xFFFF;
        if (f[n12] == null) {
            int n13;
            char[] cArray = d[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 167;
                case 1 -> 55;
                case 2 -> 158;
                case 3 -> 96;
                case 4 -> 116;
                case 5 -> 92;
                case 6 -> 20;
                case 7 -> 171;
                case 8 -> 155;
                case 9 -> 123;
                case 10 -> 98;
                case 11 -> 159;
                case 12 -> 139;
                case 13 -> 66;
                case 14 -> 235;
                case 15 -> 9;
                case 16 -> 228;
                case 17 -> 85;
                case 18 -> 175;
                case 19 -> 152;
                case 20 -> 57;
                case 21 -> 208;
                case 22 -> 128;
                case 23 -> 19;
                case 24 -> 113;
                case 25 -> 59;
                case 26 -> 243;
                case 27 -> 70;
                case 28 -> 166;
                case 29 -> 81;
                case 30 -> 99;
                case 31 -> 217;
                case 32 -> 68;
                case 33 -> 40;
                case 34 -> 174;
                case 35 -> 252;
                case 36 -> 241;
                case 37 -> 125;
                case 38 -> 104;
                case 39 -> 124;
                case 40 -> 148;
                case 41 -> 225;
                case 42 -> 106;
                case 43 -> 37;
                case 44 -> 43;
                case 45 -> 95;
                case 46 -> 17;
                case 47 -> 213;
                case 48 -> 115;
                case 49 -> 232;
                case 50 -> 110;
                case 51 -> 199;
                case 52 -> 206;
                case 53 -> 94;
                case 54 -> 183;
                case 55 -> 74;
                case 56 -> 146;
                case 57 -> 67;
                case 58 -> 86;
                case 59 -> 83;
                case 60 -> 6;
                case 61 -> 242;
                case 62 -> 77;
                case 63 -> 120;
                case 64 -> 53;
                case 65 -> 4;
                case 66 -> 11;
                case 67 -> 204;
                case 68 -> 224;
                case 69 -> 7;
                case 70 -> 103;
                case 71 -> 131;
                case 72 -> 193;
                case 73 -> 89;
                case 74 -> 25;
                case 75 -> 196;
                case 76 -> 44;
                case 77 -> 82;
                case 78 -> 255;
                case 79 -> 218;
                case 80 -> 226;
                case 81 -> 150;
                case 82 -> 22;
                case 83 -> 240;
                case 84 -> 169;
                case 85 -> 173;
                case 86 -> 21;
                case 87 -> 64;
                case 88 -> 119;
                case 89 -> 222;
                case 90 -> 246;
                case 91 -> 178;
                case 92 -> 200;
                case 93 -> 79;
                case 94 -> 63;
                case 95 -> 32;
                case 96 -> 47;
                case 97 -> 97;
                case 98 -> 3;
                case 99 -> 39;
                case 100 -> 34;
                case 101 -> 231;
                case 102 -> 162;
                case 103 -> 163;
                case 104 -> 132;
                case 105 -> 80;
                case 106 -> 214;
                case 107 -> 108;
                case 108 -> 8;
                case 109 -> 16;
                case 110 -> 221;
                case 111 -> 72;
                case 112 -> 51;
                case 113 -> 233;
                case 114 -> 220;
                case 115 -> 189;
                case 116 -> 185;
                case 117 -> 42;
                case 118 -> 50;
                case 119 -> 88;
                case 120 -> 181;
                case 121 -> 177;
                case 122 -> 238;
                case 123 -> 230;
                case 124 -> 38;
                case 125 -> 90;
                case 126 -> 101;
                case 127 -> 176;
                case 128 -> 165;
                case 129 -> 69;
                case 130 -> 192;
                case 131 -> 227;
                case 132 -> 239;
                case 133 -> 102;
                case 134 -> 93;
                case 135 -> 251;
                case 136 -> 0;
                case 137 -> 136;
                case 138 -> 156;
                case 139 -> 24;
                case 140 -> 161;
                case 141 -> 109;
                case 142 -> 201;
                case 143 -> 62;
                case 144 -> 133;
                case 145 -> 15;
                case 146 -> 105;
                case 147 -> 137;
                case 148 -> 129;
                case 149 -> 149;
                case 150 -> 184;
                case 151 -> 5;
                case 152 -> 46;
                case 153 -> 75;
                case 154 -> 28;
                case 155 -> 58;
                case 156 -> 249;
                case 157 -> 65;
                case 158 -> 247;
                case 159 -> 209;
                case 160 -> 170;
                case 161 -> 141;
                case 162 -> 33;
                case 163 -> 56;
                case 164 -> 160;
                case 165 -> 138;
                case 166 -> 71;
                case 167 -> 190;
                case 168 -> 207;
                case 169 -> 172;
                case 170 -> 219;
                case 171 -> 229;
                case 172 -> 107;
                case 173 -> 54;
                case 174 -> 234;
                case 175 -> 45;
                case 176 -> 180;
                case 177 -> 253;
                case 178 -> 1;
                case 179 -> 145;
                case 180 -> 60;
                case 181 -> 26;
                case 182 -> 100;
                case 183 -> 195;
                case 184 -> 14;
                case 185 -> 194;
                case 186 -> 154;
                case 187 -> 52;
                case 188 -> 188;
                case 189 -> 237;
                case 190 -> 142;
                case 191 -> 121;
                case 192 -> 48;
                case 193 -> 122;
                case 194 -> 182;
                case 195 -> 117;
                case 196 -> 147;
                case 197 -> 215;
                case 198 -> 254;
                case 199 -> 203;
                case 200 -> 205;
                case 201 -> 29;
                case 202 -> 144;
                case 203 -> 31;
                case 204 -> 10;
                case 205 -> 73;
                case 206 -> 91;
                case 207 -> 236;
                case 208 -> 84;
                case 209 -> 13;
                case 210 -> 49;
                case 211 -> 153;
                case 212 -> 143;
                case 213 -> 244;
                case 214 -> 78;
                case 215 -> 114;
                case 216 -> 12;
                case 217 -> 118;
                case 218 -> 198;
                case 219 -> 140;
                case 220 -> 191;
                case 221 -> 27;
                case 222 -> 23;
                case 223 -> 151;
                case 224 -> 186;
                case 225 -> 111;
                case 226 -> 18;
                case 227 -> 76;
                case 228 -> 157;
                case 229 -> 164;
                case 230 -> 210;
                case 231 -> 2;
                case 232 -> 168;
                case 233 -> 30;
                case 234 -> 112;
                case 235 -> 35;
                case 236 -> 41;
                case 237 -> 134;
                case 238 -> 187;
                case 239 -> 126;
                case 240 -> 248;
                case 241 -> 223;
                case 242 -> 202;
                case 243 -> 197;
                case 244 -> 127;
                case 245 -> 87;
                case 246 -> 250;
                case 247 -> 179;
                case 248 -> 130;
                case 249 -> 212;
                case 250 -> 211;
                case 251 -> 245;
                case 252 -> 135;
                case 253 -> 61;
                case 254 -> 36;
                default -> 216;
            };
            int n15 = (n11 & 0xFF) - n14;
            if (n15 < 0) {
                n15 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n14) < 0) {
                n13 += 256;
            }
            int n16 = 0;
            while (n16 < cArray.length) {
                int n17 = n16 % 2;
                int n18 = n16;
                char[] cArray2 = cArray;
                char c2 = cArray[n18];
                if (n17 == 0) {
                    cArray2[n18] = (char)(c2 ^ n15);
                    n15 = ((n15 >>> 3 | n15 << 5) ^ cArray[n16]) & 0xFF;
                } else {
                    cArray2[n18] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n16]) & 0xFF;
                }
                ++n16;
            }
            xQ.f[n12] = new String(cArray).intern();
        }
        return f[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC44;
        if (g[n11] == null) {
            xQ.g[n11] = (int)(a[n11] ^ l2);
        }
        return g[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x64F4) & Short.MAX_VALUE;
        if (m[n11] == null) {
            xQ.m[n11] = l[n11] ^ l2;
        }
        return m[n11];
    }
}

