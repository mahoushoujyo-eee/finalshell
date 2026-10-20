/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.MacAddress;

public class FR {
    InetAddress U;
    int k;
    HashMap O = new HashMap();
    HashMap b = new HashMap();
    int p = FR.a(27671, 8373575933482908695L);
    Random t = new Random();
    PcapHandle K;
    HashSet a = new HashSet();
    HashMap x = new HashMap();
    MacAddress d;
    int H;
    Packet L = null;
    int u = 0;
    private static final String[] c;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;
    private static final long h;

    FR(int n10, PcapHandle pcapHandle) {
        this.K = pcapHandle;
        this.H = n10;
    }

    /*
     * Unable to fully structure code
     */
    public void L(Packet var1_1, EthernetPacket.EthernetHeader var2_2, IpV4Packet.IpV4Header var3_3, TcpPacket var4_4, boolean var5_5) {
        block63: {
            block67: {
                block68: {
                    block65: {
                        block66: {
                            block64: {
                                block55: {
                                    block61: {
                                        block62: {
                                            block59: {
                                                block60: {
                                                    block58: {
                                                        block56: {
                                                            block57: {
                                                                block72: {
                                                                    block71: {
                                                                        block54: {
                                                                            block69: {
                                                                                var7_6 = var4_4.getHeader();
                                                                                var8_7 = null;
                                                                                var6_8 = QI.N();
                                                                                v0 = var4_4.getPayload();
                                                                                if (var6_8 == null) break block69;
                                                                                try {
                                                                                    block70: {
                                                                                        if (v0 == null) break block54;
                                                                                        break block70;
                                                                                        catch (PcapNativeException v1) {
                                                                                            throw FR.a(v1);
                                                                                        }
                                                                                    }
                                                                                    v0 = var4_4.getPayload();
                                                                                }
                                                                                catch (PcapNativeException v2) {
                                                                                    throw FR.a(v2);
                                                                                }
                                                                            }
                                                                            var8_7 = v0.getRawData();
                                                                        }
                                                                        v3 = var5_5;
                                                                        if (var6_8 == null) break block55;
                                                                        if (!v3) ** GOTO lbl133
                                                                        break block71;
                                                                        catch (PcapNativeException v4) {
                                                                            throw FR.a(v4);
                                                                        }
                                                                    }
                                                                    this.d = var2_2.getSrcAddr();
                                                                    v5 = var7_6.getSyn();
                                                                    if (var6_8 == null) break block56;
                                                                    break block72;
                                                                    catch (PcapNativeException v6) {
                                                                        throw FR.a(v6);
                                                                    }
                                                                }
                                                                try {
                                                                    block73: {
                                                                        if (!v5) break block57;
                                                                        break block73;
                                                                        catch (PcapNativeException v7) {
                                                                            throw FR.a(v7);
                                                                        }
                                                                    }
                                                                    var7_6.getAck();
                                                                }
                                                                catch (PcapNativeException v8) {
                                                                    throw FR.a(v8);
                                                                }
                                                            }
                                                            v5 = var7_6.getSyn();
                                                        }
                                                        if (var6_8 == null) break block58;
                                                        try {
                                                            block74: {
                                                                if (v5) break block59;
                                                                break block74;
                                                                catch (PcapNativeException v9) {
                                                                    throw FR.a(v9);
                                                                }
                                                            }
                                                            v5 = var7_6.getAck();
                                                        }
                                                        catch (PcapNativeException v10) {
                                                            throw FR.a(v10);
                                                        }
                                                    }
                                                    if (var6_8 == null) break block60;
                                                    try {
                                                        block75: {
                                                            if (!v5) break block59;
                                                            break block75;
                                                            catch (PcapNativeException v11) {
                                                                throw FR.a(v11);
                                                            }
                                                        }
                                                        this.O.remove(var7_6.getAcknowledgmentNumber());
                                                        v5 = this.a.contains(var3_3.getIdentification());
                                                    }
                                                    catch (PcapNativeException v12) {
                                                        throw FR.a(v12);
                                                    }
                                                }
                                                var9_9 = (int)v5;
                                            }
                                            if (var4_4.getPayload() != null) {
                                                var9_10 = new String(var8_7);
                                            }
                                            v13 = var7_6.getSequenceNumber();
                                            v14 = this.p;
                                            if (var6_8 == null) break block61;
                                            try {
                                                block76: {
                                                    if (v13 <= v14) break block62;
                                                    break block76;
                                                    catch (PcapNativeException v15) {
                                                        throw FR.a(v15);
                                                    }
                                                }
                                                this.p = var7_6.getSequenceNumber();
                                            }
                                            catch (PcapNativeException v16) {
                                                throw FR.a(v16);
                                            }
                                        }
                                        v13 = bg_0.A;
                                        v14 = bg_0.g;
                                    }
                                    try {
                                        if (v13 != v14 || var4_4.getPayload() == null) break block63;
                                    }
                                    catch (PcapNativeException v17) {
                                        throw FR.a(v17);
                                    }
                                    var9_9 = var7_6.getSequenceNumber();
                                    try {
                                        if (this.x.containsKey(var9_9)) break block63;
                                        var10_11 = new aV();
                                        this.x.put(var9_9, var10_11);
                                        var11_14 = var9_9;
                                        var12_16 = 0;
                                        if (var6_8 != null) ** GOTO lbl127
                                        do {
                                            var13_19 = FR.Y(var1_1, var11_14 + this.t.nextInt(FR.a(26427, 3556159475663714101L)), new byte[FR.a(29145, 5806713907765256659L)]);
                                            try {
                                                this.K.sendPacket(var13_19);
                                            }
                                            catch (PcapNativeException var14_22) {
                                                var14_22.printStackTrace();
                                            }
                                            catch (NotOpenException var14_23) {
                                                var14_23.printStackTrace();
                                            }
                                            Thread.sleep(FR.h);
                                            ++var12_16;
lbl127:
                                            // 2 sources

                                        } while (var12_16 < FR.a(22102, 161573514968893019L));
                                        break block63;
                                    }
                                    catch (Exception var10_12) {
                                        try {
                                            var10_12.printStackTrace();
                                            if (var6_8 != null) break block63;
lbl133:
                                            // 2 sources

                                            v3 = var7_6.getSyn();
                                        }
                                        catch (PcapNativeException v18) {
                                            throw FR.a(v18);
                                        }
                                    }
                                }
                                if (var6_8 == null) break block64;
                                try {
                                    block77: {
                                        if (!v3) break block64;
                                        break block77;
                                        catch (PcapNativeException v19) {
                                            throw FR.a(v19);
                                        }
                                    }
                                    v3 = var7_6.getAck();
                                }
                                catch (PcapNativeException v20) {
                                    throw FR.a(v20);
                                }
                            }
                            if (var4_4.getPayload() == null) break block63;
                            var9_9 = var7_6.getSequenceNumber() + var8_7.length;
                            v21 = this.b;
                            v22 = var9_9;
                            if (var6_8 == null) break block65;
                            try {
                                block78: {
                                    if (v21.containsKey(v22)) break block66;
                                    break block78;
                                    catch (PcapNativeException v23) {
                                        throw FR.a(v23);
                                    }
                                }
                                this.b.put(var9_9, var4_4);
                            }
                            catch (PcapNativeException v24) {
                                throw FR.a(v24);
                            }
                        }
                        v21 = this.O;
                        v22 = var9_9;
                    }
                    v21.put(v22, var4_4);
                    var10_13 = this.f(this.d, var2_2.getSrcAddr(), var3_3.getDstAddr(), (Short)var7_6.getDstPort().value(), var3_3.getSrcAddr(), (Short)var7_6.getSrcPort().value(), var9_9, this.p);
                    var11_15 = var7_6.getSequenceNumber();
                    try {
                        try {
                            v25 = (int)this.x.containsKey(var11_15);
                            if (var6_8 == null) break block67;
                            if (v25 != 0) break block68;
                        }
                        catch (PcapNativeException v26) {
                            throw FR.a(v26);
                        }
                        var12_17 = new aV();
                        this.x.put(var11_15, var12_17);
                        var13_20 = 0;
                        try {
                            if (var6_8 == null) {
                                while (true) {
                                    ++var13_20;
                                    continue;
                                    break;
                                }
                            }
                        }
                        catch (PcapNativeException v27) {
                            throw FR.a(v27);
                        }
                        if (var13_20 < FR.a(19552, 2534144807940103279L)) ** continue;
                    }
                    catch (Exception var12_18) {
                        var12_18.printStackTrace();
                    }
                }
                v25 = bg_0.A;
            }
            try {
                if (v25 == bg_0.Z) {
                    System.out.println("开启服务端模拟");
                }
            }
            catch (PcapNativeException v28) {
                throw FR.a(v28);
            }
        }
    }

    void B() {
        int n10 = 0;
        while (true) {
            ++n10;
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            int n11 = 3;
            aV aV2 = new aV();
            this.x.put(n11, aV2);
            Packet packet = FR.Y(this.L, this.u + FR.a(28386, 1027342367398117097L) * n10, new byte[FR.a(24099, 5359861936110964258L)]);
            try {
                this.K.sendPacket(packet);
                System.out.println("发送模拟 " + packet.getRawData().length);
                continue;
            }
            catch (PcapNativeException pcapNativeException) {
                pcapNativeException.printStackTrace();
                continue;
            }
            catch (NotOpenException notOpenException) {
                notOpenException.printStackTrace();
                continue;
            }
            break;
        }
    }

    static Packet Y(Packet packet, int n10, byte[] byArray) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        short s2 = (Short)tcpHeader.getSrcPort().value();
        short s3 = (Short)tcpHeader.getDstPort().value();
        String[] stringArray = QI.N();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        if (stringArray != null) {
            if (tcpPacket.getPayload() != null) {
                builder.payloadBuilder(new UnknownPacket.Builder().rawData(byArray));
            }
            builder.correctChecksumAtBuild(true);
            builder.correctLengthAtBuild(true);
            builder.paddingAtBuild(true);
            builder.ack(true);
            builder.acknowledgmentNumber(tcpHeader.getAcknowledgmentNumber());
            builder.checksum(tcpHeader.getChecksum());
            builder.dataOffset(tcpHeader.getDataOffset());
            builder.dstAddr(ipV4Header.getDstAddr());
            builder.dstPort(new TcpPort(s3, ""));
            builder.fin(tcpHeader.getFin());
            builder.options(tcpHeader.getOptions());
            builder.padding(tcpHeader.getPadding());
            builder.psh(tcpHeader.getPsh());
            builder.reserved(tcpHeader.getReserved());
            builder.rst(tcpHeader.getRst());
            builder.sequenceNumber(n10);
            builder.srcAddr(ipV4Header.getSrcAddr());
            builder.srcPort(new TcpPort(s2, ""));
            builder.syn(tcpHeader.getSyn());
            builder.urg(tcpHeader.getUrg());
            builder.urgentPointer(tcpHeader.getUrgentPointer());
            builder.window(tcpHeader.getWindow());
        }
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(ipV4Header.getDstAddr());
        builder2.fragmentOffset((short)0);
        builder2.headerChecksum(ipV4Header.getHeaderChecksum());
        builder2.identification(ipV4Header.getIdentification());
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(ipV4Header.getMoreFragmentFlag());
        builder2.options(ipV4Header.getOptions());
        builder2.padding(ipV4Header.getPadding());
        builder2.protocol(IpNumber.TCP);
        builder2.reservedFlag(ipV4Header.getReservedFlag());
        builder2.srcAddr(ipV4Header.getSrcAddr());
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)FR.a(14128, 3302240601966602041L));
        builder2.ttl((byte)FR.a(25108, 1795155023343366679L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        if (stringArray == null) {
            ky_2.K(new String[1]);
        }
        return ethernetPacket;
    }

    Packet a(Packet packet, int n10) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        String[] stringArray = QI.N();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.payloadBuilder(new UnknownPacket.Builder().rawData(tcpPacket.getPayload().getRawData()));
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(tcpHeader.getAcknowledgmentNumber());
        builder.checksum(tcpHeader.getChecksum());
        builder.dataOffset(tcpHeader.getDataOffset());
        builder.dstAddr(ipV4Header.getDstAddr());
        builder.dstPort(new TcpPort((Short)tcpHeader.getDstPort().value(), ""));
        builder.fin(tcpHeader.getFin());
        builder.options(tcpHeader.getOptions());
        builder.padding(tcpHeader.getPadding());
        builder.psh(tcpHeader.getPsh());
        builder.reserved(tcpHeader.getReserved());
        builder.rst(tcpHeader.getRst());
        builder.sequenceNumber(n10);
        builder.srcAddr(ipV4Header.getSrcAddr());
        builder.srcPort(new TcpPort((Short)tcpHeader.getSrcPort().value(), ""));
        builder.syn(tcpHeader.getSyn());
        String[] stringArray2 = stringArray;
        builder.urg(tcpHeader.getUrg());
        builder.urgentPointer(tcpHeader.getUrgentPointer());
        builder.window(tcpHeader.getWindow());
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(ipV4Header.getDstAddr());
        builder2.fragmentOffset((short)0);
        builder2.headerChecksum(ipV4Header.getHeaderChecksum());
        builder2.identification(ipV4Header.getIdentification());
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(ipV4Header.getMoreFragmentFlag());
        builder2.options(ipV4Header.getOptions());
        builder2.padding(ipV4Header.getPadding());
        builder2.protocol(IpNumber.TCP);
        builder2.reservedFlag(ipV4Header.getReservedFlag());
        builder2.srcAddr(ipV4Header.getSrcAddr());
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)FR.a(14128, 3302240601966602041L));
        builder2.ttl((byte)FR.a(9447, 6315362085436749024L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        if (ky_2.F() != null) {
            QI.p(new String[1]);
        }
        return ethernetPacket;
    }

    Packet f(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n10);
        builder.dataOffset((byte)5);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        builder.psh(false);
        builder.reserved((byte)0);
        builder.rst(false);
        builder.sequenceNumber(n11);
        builder.srcAddr(inet4Address);
        builder.srcPort(new TcpPort(s2, ""));
        builder.syn(false);
        builder.urg(false);
        builder.window((short)FR.a(7403, 2878021800271105255L));
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        short s4 = (short)Math.abs(this.t.nextInt(FR.a(20504, 6098610844995420176L)));
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)FR.a(19839, 8143512145391689085L));
        builder2.ttl((byte)FR.a(14128, 3302240601966602041L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(macAddress2).srcAddr(macAddress).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        EthernetPacket ethernetPacket = builder3.build();
        IpV4Packet ipV4Packet = builder2.build();
        TcpPacket tcpPacket = builder.build();
        this.a.add(s4);
        return ethernetPacket;
    }

    public InetAddress q() {
        return this.U;
    }

    public void w(InetAddress inetAddress) {
        this.U = inetAddress;
    }

    public int c() {
        return this.k;
    }

    public void o(int n10) {
        this.k = n10;
    }

    public int A() {
        return this.H;
    }

    public void l(int n10) {
        this.H = n10;
    }

    private static PcapNativeException a(PcapNativeException pcapNativeException) {
        return pcapNativeException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var15 = new String[2];
                        var13_1 = 0;
                        var12_2 = "\u5371\u904f\u6aed\u6281\u00d9\u0007\u5f23\u5430\u6760\u52fb\u7a0e\u6ac9\u62b9";
                        var14_3 = "\u5371\u904f\u6aed\u6281\u00d9\u0007\u5f23\u5430\u6760\u52fb\u7a0e\u6ac9\u62b9".length();
                        var11_4 = 5;
                        var10_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var15[var13_1++] = new String(v0).intern();
                            if ((var10_5 += var11_4) < var14_3) {
                                var11_4 = var12_2.charAt(var10_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                        v1 = ++var10_5;
                        v2 = var12_2.substring(v1, v1 + var11_4).toCharArray();
                        v3 = v2.length;
                        var16_6 = 0;
                        v4 = 124;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl67
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v11 = 39;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 82;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 30;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 47;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 113;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 20;
                                        break;
                                    }
                                    default: {
                                        v11 = 104;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var16_6;
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
                        } while (v6 > var16_6);
                        ** while (true)
                    }
                    FR.c = var15;
                    FR.e = new String[2];
                    var2_7 = 3048035834704825174L;
                    var8_8 = new long[13];
                    var5_9 = 0;
                    var6_10 = "\u0092H\u0092\u001a\u00e1G0c$\u0007\u00b8\u00e4\u00ee\u0095+\u00a9\u00c0>\u0081X\u009d)l[\u00d0\u001fFk)rt\u00b9_j@\u00be\u00f8\u0095\u0097'\u00b5\u000b\u00baO\u00e1\u00ad\u001bsf\u00bb\u000fy:\u00ec\u00ac-\u00a7\u00d29\u00ba\u008d<\u00b8\u008d\u00fb\u00e8\u00c2\u00fc\u00cd\u001d\u00b9\u0001\u00f6\u00dbe\u0080,\u0018\u0096\u001fn`\"\u00c4=6\u0000`";
                    var7_11 = "\u0092H\u0092\u001a\u00e1G0c$\u0007\u00b8\u00e4\u00ee\u0095+\u00a9\u00c0>\u0081X\u009d)l[\u00d0\u001fFk)rt\u00b9_j@\u00be\u00f8\u0095\u0097'\u00b5\u000b\u00baO\u00e1\u00ad\u001bsf\u00bb\u000fy:\u00ec\u00ac-\u00a7\u00d29\u00ba\u008d<\u00b8\u008d\u00fb\u00e8\u00c2\u00fc\u00cd\u001d\u00b9\u0001\u00f6\u00dbe\u0080,\u0018\u0096\u001fn`\"\u00c4=6\u0000`".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v12 = var8_8;
                        v13 = var5_9++;
                        v14 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v15 = -1;
                        break block22;
                        break;
                    }
lbl90:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\n\u00e6\u00ed\u00ca\u0081<7A\u00ff]\u00ea#\u0004S\u007f\u00f6";
                        var7_11 = "\n\u00e6\u00ed\u00ca\u0081<7A\u00ff]\u00ea#\u0004S\u007f\u00f6".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v12 = var8_8;
                            v13 = var5_9++;
                            v14 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v15 = 0;
                            break block22;
                            break;
                        }
                        break;
                    }
lbl103:
                    // 1 sources

                    while (true) {
                        v12[v13] = v16;
                        if (var4_12 < var7_11) ** continue;
                        break block23;
                        break;
                    }
                }
                v16 = v14 ^ var2_7;
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
            FR.f = var8_8;
            FR.g = new Integer[13];
            break block24;
lbl119:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 7024049030228112637L;
        ** while (true)
        FR.h = 7024049030228112638L ^ var0_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC291) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 158;
                    break;
                }
                case 1: {
                    n14 = 85;
                    break;
                }
                case 2: {
                    n14 = 245;
                    break;
                }
                case 3: {
                    n14 = 243;
                    break;
                }
                case 4: {
                    n14 = 167;
                    break;
                }
                case 5: {
                    n14 = 35;
                    break;
                }
                case 6: {
                    n14 = 110;
                    break;
                }
                case 7: {
                    n14 = 53;
                    break;
                }
                case 8: {
                    n14 = 196;
                    break;
                }
                case 9: {
                    n14 = 28;
                    break;
                }
                case 10: {
                    n14 = 160;
                    break;
                }
                case 11: {
                    n14 = 84;
                    break;
                }
                case 12: {
                    n14 = 203;
                    break;
                }
                case 13: {
                    n14 = 141;
                    break;
                }
                case 14: {
                    n14 = 251;
                    break;
                }
                case 15: {
                    n14 = 189;
                    break;
                }
                case 16: {
                    n14 = 222;
                    break;
                }
                case 17: {
                    n14 = 64;
                    break;
                }
                case 18: {
                    n14 = 179;
                    break;
                }
                case 19: {
                    n14 = 109;
                    break;
                }
                case 20: {
                    n14 = 49;
                    break;
                }
                case 21: {
                    n14 = 205;
                    break;
                }
                case 22: {
                    n14 = 105;
                    break;
                }
                case 23: {
                    n14 = 238;
                    break;
                }
                case 24: {
                    n14 = 228;
                    break;
                }
                case 25: {
                    n14 = 74;
                    break;
                }
                case 26: {
                    n14 = 142;
                    break;
                }
                case 27: {
                    n14 = 98;
                    break;
                }
                case 28: {
                    n14 = 224;
                    break;
                }
                case 29: {
                    n14 = 71;
                    break;
                }
                case 30: {
                    n14 = 6;
                    break;
                }
                case 31: {
                    n14 = 221;
                    break;
                }
                case 32: {
                    n14 = 248;
                    break;
                }
                case 33: {
                    n14 = 117;
                    break;
                }
                case 34: {
                    n14 = 2;
                    break;
                }
                case 35: {
                    n14 = 133;
                    break;
                }
                case 36: {
                    n14 = 65;
                    break;
                }
                case 37: {
                    n14 = 180;
                    break;
                }
                case 38: {
                    n14 = 67;
                    break;
                }
                case 39: {
                    n14 = 130;
                    break;
                }
                case 40: {
                    n14 = 201;
                    break;
                }
                case 41: {
                    n14 = 44;
                    break;
                }
                case 42: {
                    n14 = 119;
                    break;
                }
                case 43: {
                    n14 = 1;
                    break;
                }
                case 44: {
                    n14 = 124;
                    break;
                }
                case 45: {
                    n14 = 94;
                    break;
                }
                case 46: {
                    n14 = 61;
                    break;
                }
                case 47: {
                    n14 = 93;
                    break;
                }
                case 48: {
                    n14 = 4;
                    break;
                }
                case 49: {
                    n14 = 181;
                    break;
                }
                case 50: {
                    n14 = 170;
                    break;
                }
                case 51: {
                    n14 = 129;
                    break;
                }
                case 52: {
                    n14 = 204;
                    break;
                }
                case 53: {
                    n14 = 101;
                    break;
                }
                case 54: {
                    n14 = 157;
                    break;
                }
                case 55: {
                    n14 = 103;
                    break;
                }
                case 56: {
                    n14 = 175;
                    break;
                }
                case 57: {
                    n14 = 11;
                    break;
                }
                case 58: {
                    n14 = 25;
                    break;
                }
                case 59: {
                    n14 = 62;
                    break;
                }
                case 60: {
                    n14 = 112;
                    break;
                }
                case 61: {
                    n14 = 164;
                    break;
                }
                case 62: {
                    n14 = 231;
                    break;
                }
                case 63: {
                    n14 = 146;
                    break;
                }
                case 64: {
                    n14 = 218;
                    break;
                }
                case 65: {
                    n14 = 92;
                    break;
                }
                case 66: {
                    n14 = 225;
                    break;
                }
                case 67: {
                    n14 = 14;
                    break;
                }
                case 68: {
                    n14 = 27;
                    break;
                }
                case 69: {
                    n14 = 36;
                    break;
                }
                case 70: {
                    n14 = 159;
                    break;
                }
                case 71: {
                    n14 = 113;
                    break;
                }
                case 72: {
                    n14 = 18;
                    break;
                }
                case 73: {
                    n14 = 138;
                    break;
                }
                case 74: {
                    n14 = 192;
                    break;
                }
                case 75: {
                    n14 = 42;
                    break;
                }
                case 76: {
                    n14 = 195;
                    break;
                }
                case 77: {
                    n14 = 144;
                    break;
                }
                case 78: {
                    n14 = 45;
                    break;
                }
                case 79: {
                    n14 = 216;
                    break;
                }
                case 80: {
                    n14 = 193;
                    break;
                }
                case 81: {
                    n14 = 127;
                    break;
                }
                case 82: {
                    n14 = 173;
                    break;
                }
                case 83: {
                    n14 = 229;
                    break;
                }
                case 84: {
                    n14 = 246;
                    break;
                }
                case 85: {
                    n14 = 128;
                    break;
                }
                case 86: {
                    n14 = 197;
                    break;
                }
                case 87: {
                    n14 = 200;
                    break;
                }
                case 88: {
                    n14 = 90;
                    break;
                }
                case 89: {
                    n14 = 86;
                    break;
                }
                case 90: {
                    n14 = 249;
                    break;
                }
                case 91: {
                    n14 = 70;
                    break;
                }
                case 92: {
                    n14 = 154;
                    break;
                }
                case 93: {
                    n14 = 17;
                    break;
                }
                case 94: {
                    n14 = 254;
                    break;
                }
                case 95: {
                    n14 = 210;
                    break;
                }
                case 96: {
                    n14 = 178;
                    break;
                }
                case 97: {
                    n14 = 43;
                    break;
                }
                case 98: {
                    n14 = 247;
                    break;
                }
                case 99: {
                    n14 = 151;
                    break;
                }
                case 100: {
                    n14 = 95;
                    break;
                }
                case 101: {
                    n14 = 69;
                    break;
                }
                case 102: {
                    n14 = 207;
                    break;
                }
                case 103: {
                    n14 = 165;
                    break;
                }
                case 104: {
                    n14 = 145;
                    break;
                }
                case 105: {
                    n14 = 155;
                    break;
                }
                case 106: {
                    n14 = 41;
                    break;
                }
                case 107: {
                    n14 = 108;
                    break;
                }
                case 108: {
                    n14 = 73;
                    break;
                }
                case 109: {
                    n14 = 212;
                    break;
                }
                case 110: {
                    n14 = 50;
                    break;
                }
                case 111: {
                    n14 = 46;
                    break;
                }
                case 112: {
                    n14 = 163;
                    break;
                }
                case 113: {
                    n14 = 217;
                    break;
                }
                case 114: {
                    n14 = 169;
                    break;
                }
                case 115: {
                    n14 = 199;
                    break;
                }
                case 116: {
                    n14 = 156;
                    break;
                }
                case 117: {
                    n14 = 37;
                    break;
                }
                case 118: {
                    n14 = 131;
                    break;
                }
                case 119: {
                    n14 = 75;
                    break;
                }
                case 120: {
                    n14 = 3;
                    break;
                }
                case 121: {
                    n14 = 55;
                    break;
                }
                case 122: {
                    n14 = 80;
                    break;
                }
                case 123: {
                    n14 = 242;
                    break;
                }
                case 124: {
                    n14 = 190;
                    break;
                }
                case 125: {
                    n14 = 60;
                    break;
                }
                case 126: {
                    n14 = 116;
                    break;
                }
                case 127: {
                    n14 = 72;
                    break;
                }
                case 128: {
                    n14 = 183;
                    break;
                }
                case 129: {
                    n14 = 152;
                    break;
                }
                case 130: {
                    n14 = 89;
                    break;
                }
                case 131: {
                    n14 = 123;
                    break;
                }
                case 132: {
                    n14 = 137;
                    break;
                }
                case 133: {
                    n14 = 134;
                    break;
                }
                case 134: {
                    n14 = 252;
                    break;
                }
                case 135: {
                    n14 = 176;
                    break;
                }
                case 136: {
                    n14 = 5;
                    break;
                }
                case 137: {
                    n14 = 107;
                    break;
                }
                case 138: {
                    n14 = 219;
                    break;
                }
                case 139: {
                    n14 = 32;
                    break;
                }
                case 140: {
                    n14 = 34;
                    break;
                }
                case 141: {
                    n14 = 202;
                    break;
                }
                case 142: {
                    n14 = 120;
                    break;
                }
                case 143: {
                    n14 = 31;
                    break;
                }
                case 144: {
                    n14 = 63;
                    break;
                }
                case 145: {
                    n14 = 22;
                    break;
                }
                case 146: {
                    n14 = 111;
                    break;
                }
                case 147: {
                    n14 = 166;
                    break;
                }
                case 148: {
                    n14 = 223;
                    break;
                }
                case 149: {
                    n14 = 48;
                    break;
                }
                case 150: {
                    n14 = 237;
                    break;
                }
                case 151: {
                    n14 = 241;
                    break;
                }
                case 152: {
                    n14 = 198;
                    break;
                }
                case 153: {
                    n14 = 250;
                    break;
                }
                case 154: {
                    n14 = 122;
                    break;
                }
                case 155: {
                    n14 = 76;
                    break;
                }
                case 156: {
                    n14 = 118;
                    break;
                }
                case 157: {
                    n14 = 81;
                    break;
                }
                case 158: {
                    n14 = 52;
                    break;
                }
                case 159: {
                    n14 = 39;
                    break;
                }
                case 160: {
                    n14 = 57;
                    break;
                }
                case 161: {
                    n14 = 56;
                    break;
                }
                case 162: {
                    n14 = 214;
                    break;
                }
                case 163: {
                    n14 = 99;
                    break;
                }
                case 164: {
                    n14 = 102;
                    break;
                }
                case 165: {
                    n14 = 66;
                    break;
                }
                case 166: {
                    n14 = 24;
                    break;
                }
                case 167: {
                    n14 = 143;
                    break;
                }
                case 168: {
                    n14 = 104;
                    break;
                }
                case 169: {
                    n14 = 255;
                    break;
                }
                case 170: {
                    n14 = 26;
                    break;
                }
                case 171: {
                    n14 = 13;
                    break;
                }
                case 172: {
                    n14 = 244;
                    break;
                }
                case 173: {
                    n14 = 172;
                    break;
                }
                case 174: {
                    n14 = 168;
                    break;
                }
                case 175: {
                    n14 = 162;
                    break;
                }
                case 176: {
                    n14 = 140;
                    break;
                }
                case 177: {
                    n14 = 233;
                    break;
                }
                case 178: {
                    n14 = 125;
                    break;
                }
                case 179: {
                    n14 = 88;
                    break;
                }
                case 180: {
                    n14 = 213;
                    break;
                }
                case 181: {
                    n14 = 100;
                    break;
                }
                case 182: {
                    n14 = 185;
                    break;
                }
                case 183: {
                    n14 = 58;
                    break;
                }
                case 184: {
                    n14 = 19;
                    break;
                }
                case 185: {
                    n14 = 106;
                    break;
                }
                case 186: {
                    n14 = 10;
                    break;
                }
                case 187: {
                    n14 = 239;
                    break;
                }
                case 188: {
                    n14 = 191;
                    break;
                }
                case 189: {
                    n14 = 97;
                    break;
                }
                case 190: {
                    n14 = 240;
                    break;
                }
                case 191: {
                    n14 = 115;
                    break;
                }
                case 192: {
                    n14 = 77;
                    break;
                }
                case 193: {
                    n14 = 235;
                    break;
                }
                case 194: {
                    n14 = 220;
                    break;
                }
                case 195: {
                    n14 = 59;
                    break;
                }
                case 196: {
                    n14 = 148;
                    break;
                }
                case 197: {
                    n14 = 227;
                    break;
                }
                case 198: {
                    n14 = 33;
                    break;
                }
                case 199: {
                    n14 = 8;
                    break;
                }
                case 200: {
                    n14 = 132;
                    break;
                }
                case 201: {
                    n14 = 114;
                    break;
                }
                case 202: {
                    n14 = 188;
                    break;
                }
                case 203: {
                    n14 = 78;
                    break;
                }
                case 204: {
                    n14 = 54;
                    break;
                }
                case 205: {
                    n14 = 139;
                    break;
                }
                case 206: {
                    n14 = 174;
                    break;
                }
                case 207: {
                    n14 = 150;
                    break;
                }
                case 208: {
                    n14 = 187;
                    break;
                }
                case 209: {
                    n14 = 149;
                    break;
                }
                case 210: {
                    n14 = 177;
                    break;
                }
                case 211: {
                    n14 = 9;
                    break;
                }
                case 212: {
                    n14 = 186;
                    break;
                }
                case 213: {
                    n14 = 7;
                    break;
                }
                case 214: {
                    n14 = 147;
                    break;
                }
                case 215: {
                    n14 = 29;
                    break;
                }
                case 216: {
                    n14 = 38;
                    break;
                }
                case 217: {
                    n14 = 121;
                    break;
                }
                case 218: {
                    n14 = 79;
                    break;
                }
                case 219: {
                    n14 = 136;
                    break;
                }
                case 220: {
                    n14 = 194;
                    break;
                }
                case 221: {
                    n14 = 15;
                    break;
                }
                case 222: {
                    n14 = 153;
                    break;
                }
                case 223: {
                    n14 = 253;
                    break;
                }
                case 224: {
                    n14 = 184;
                    break;
                }
                case 225: {
                    n14 = 51;
                    break;
                }
                case 226: {
                    n14 = 230;
                    break;
                }
                case 227: {
                    n14 = 30;
                    break;
                }
                case 228: {
                    n14 = 82;
                    break;
                }
                case 229: {
                    n14 = 96;
                    break;
                }
                case 230: {
                    n14 = 211;
                    break;
                }
                case 231: {
                    n14 = 68;
                    break;
                }
                case 232: {
                    n14 = 209;
                    break;
                }
                case 233: {
                    n14 = 21;
                    break;
                }
                case 234: {
                    n14 = 171;
                    break;
                }
                case 235: {
                    n14 = 215;
                    break;
                }
                case 236: {
                    n14 = 232;
                    break;
                }
                case 237: {
                    n14 = 23;
                    break;
                }
                case 238: {
                    n14 = 16;
                    break;
                }
                case 239: {
                    n14 = 226;
                    break;
                }
                case 240: {
                    n14 = 182;
                    break;
                }
                case 241: {
                    n14 = 206;
                    break;
                }
                case 242: {
                    n14 = 47;
                    break;
                }
                case 243: {
                    n14 = 126;
                    break;
                }
                case 244: {
                    n14 = 208;
                    break;
                }
                case 245: {
                    n14 = 87;
                    break;
                }
                case 246: {
                    n14 = 20;
                    break;
                }
                case 247: {
                    n14 = 91;
                    break;
                }
                case 248: {
                    n14 = 0;
                    break;
                }
                case 249: {
                    n14 = 161;
                    break;
                }
                case 250: {
                    n14 = 135;
                    break;
                }
                case 251: {
                    n14 = 83;
                    break;
                }
                case 252: {
                    n14 = 236;
                    break;
                }
                case 253: {
                    n14 = 234;
                    break;
                }
                case 254: {
                    n14 = 12;
                    break;
                }
                default: {
                    n14 = 40;
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
            FR.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x500B;
        if (g[n11] == null) {
            FR.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

