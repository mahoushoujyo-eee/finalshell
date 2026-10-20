/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.util.ArrayList;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV4CommonPacket;
import org.pcap4j.packet.IcmpV4EchoPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.IpV4Rfc791Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IcmpV4Code;
import org.pcap4j.packet.namednumber.IcmpV4Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.MacAddress;

public class gQ {
    static byte y;
    static short w;
    static byte r;
    static short v;
    public static boolean c;
    public static byte[] V;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4170119649347847823L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "@e\u00fe\u00bbX\u001f\u00b7\u00fe@\u00e69MJ\u00d0\u00ee\u0001\\\u001e\u00be\u0002\u00fa\u0019\u00c4*\u0016\u00ff\u0082\u00ac5\u00db\u00ca\u00e5d\u00e9\u0013\u009cN\u00c1o$\u00b9#<\u00ddX#,8\u0001\u001c:1t\"\u00d3\u00ee\u0084\u00cf\";\u00c7\u00f0uFvb\n\u00e0\u007f\u00d3\u00dcd!\u00b7\u00e6\u00c3\u00e0\u0017\u0088\u0094";
                var5_4 = "@e\u00fe\u00bbX\u001f\u00b7\u00fe@\u00e69MJ\u00d0\u00ee\u0001\\\u001e\u00be\u0002\u00fa\u0019\u00c4*\u0016\u00ff\u0082\u00ac5\u00db\u00ca\u00e5d\u00e9\u0013\u009cN\u00c1o$\u00b9#<\u00ddX#,8\u0001\u001c:1t\"\u00d3\u00ee\u0084\u00cf\";\u00c7\u00f0uFvb\n\u00e0\u007f\u00d3\u00dcd!\u00b7\u00e6\u00c3\u00e0\u0017\u0088\u0094".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "Ov\u009d=\u0019\u00fe0\u00f4\"\u008bHW#\u00afIN";
                    var5_4 = "Ov\u009d=\u0019\u00fe0\u00f4\"\u008bHW#\u00afIN".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
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
        gQ.a = var6_1;
        gQ.b = new Integer[12];
        gQ.y = (byte)gQ.a(12879, 6948827077934976897L);
        gQ.w = (short)gQ.a(13324, 5002668535703046602L);
        gQ.r = (byte)gQ.a(16228, 4524753934339310243L);
        gQ.v = (short)-1;
        gQ.c = false;
        v5 = new byte[gQ.a(10410, 7944810590095250793L)];
        v5[0] = gQ.a(29638, 4767486644055363082L);
        v5[2] = gQ.a(10082, 1386174394242603695L);
        v5[3] = gQ.a(5390, 9082958188656044234L);
        v5[5] = gQ.a(5390, 9082958188656044234L);
        v5[gQ.a((int)19379, (long)7876906249386686076L)] = gQ.a(3626, 42066682808710120L);
        gQ.V = v5;
    }

    public static Packet Z(MacAddress macAddress, MacAddress macAddress2, IpV4Packet.Builder builder) {
        AbstractPacket.AbstractBuilder abstractBuilder;
        AbstractPacket.AbstractBuilder abstractBuilder2 = null;
        EtherType etherType = null;
        EthernetPacket ethernetPacket = null;
        if (c) {
            etherType = EtherType.PPPOE_SESSION_STAGE;
            abstractBuilder = new UnknownPacket.Builder();
            byte[] byArray = builder.build().getRawData();
            byte[] byArray2 = new byte[2];
            try {
                cl_2.M((short)(byArray.length + 2), (Object)byArray2, 0);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            byte[] byArray3 = new byte[gQ.a(5218, 8272875314577680803L)];
            System.arraycopy(V, 0, byArray3, 0, byArray3.length);
            System.arraycopy(byArray2, 0, byArray3, 4, 2);
            byte[] byArray4 = new byte[byArray3.length + byArray.length];
            System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
            System.arraycopy(byArray, 0, byArray4, gQ.a(10410, 7944810590095250793L), byArray.length);
            ((UnknownPacket.Builder)abstractBuilder).rawData(byArray4);
            abstractBuilder2 = abstractBuilder;
        } else {
            etherType = EtherType.IPV4;
            abstractBuilder2 = builder;
        }
        abstractBuilder = new EthernetPacket.Builder();
        ((EthernetPacket.Builder)abstractBuilder).dstAddr(macAddress2).srcAddr(macAddress).type(etherType).payloadBuilder(abstractBuilder2).paddingAtBuild(true);
        ethernetPacket = ((EthernetPacket.Builder)abstractBuilder).build();
        return ethernetPacket;
    }

    public static Packet A(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, Inet4Address inet4Address2, int n10, int n11) {
        IcmpV4EchoPacket.Builder builder = new IcmpV4EchoPacket.Builder();
        builder.identifier((short)3).sequenceNumber((short)n10);
        IcmpV4CommonPacket.Builder builder2 = new IcmpV4CommonPacket.Builder();
        builder2.type(IcmpV4Type.ECHO).code(IcmpV4Code.NO_CODE).payloadBuilder(builder).correctChecksumAtBuild(true);
        IpV4Packet.Builder builder3 = new IpV4Packet.Builder();
        builder3.version(IpVersion.IPV4).tos(IpV4Rfc791Tos.newInstance((byte)0)).ttl((byte)n11).protocol(IpNumber.ICMPV4).srcAddr(inet4Address).dstAddr(inet4Address2).payloadBuilder(builder2).correctChecksumAtBuild(true).correctLengthAtBuild(true);
        Packet packet = gQ.Z(macAddress, macAddress2, builder3);
        return packet;
    }

    public static Packet S(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, Inet4Address inet4Address2, int n10) {
        IcmpV4EchoPacket.Builder builder = new IcmpV4EchoPacket.Builder();
        builder.identifier((short)3).sequenceNumber((short)n10);
        IcmpV4CommonPacket.Builder builder2 = new IcmpV4CommonPacket.Builder();
        builder2.type(IcmpV4Type.ECHO).code(IcmpV4Code.NO_CODE).payloadBuilder(builder).correctChecksumAtBuild(true);
        IpV4Packet.Builder builder3 = new IpV4Packet.Builder();
        builder3.version(IpVersion.IPV4).tos(IpV4Rfc791Tos.newInstance((byte)0)).ttl((byte)gQ.a(22327, 1989301605759085303L)).protocol(IpNumber.ICMPV4).srcAddr(inet4Address).dstAddr(inet4Address2).payloadBuilder(builder2).correctChecksumAtBuild(true).correctLengthAtBuild(true);
        Packet packet = gQ.Z(macAddress, macAddress2, builder3);
        return packet;
    }

    public static Packet q(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, byte[] byArray, short s4) {
        Packet packet = null;
        UdpPacket.Builder builder = new UdpPacket.Builder();
        builder.payloadBuilder(new UnknownPacket.Builder().rawData(byArray));
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new UdpPort(s3, ""));
        builder.srcAddr(inet4Address);
        builder.srcPort(new UdpPort(s2, ""));
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.dontFragmentFlag(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.fragmentOffset((short)0);
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(false);
        builder2.protocol(IpNumber.UDP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.ttl(y);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        packet = gQ.Z(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet i(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, byte[] byArray, short s4) {
        Packet packet = null;
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.payloadBuilder(new UnknownPacket.Builder().rawData(byArray));
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n11);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        builder.fin(false);
        builder.psh(false);
        builder.reserved((byte)0);
        builder.rst(false);
        builder.sequenceNumber(n10);
        builder.srcAddr(inet4Address);
        builder.srcPort(new TcpPort(s2, ""));
        builder.syn(false);
        builder.urg(false);
        builder.window(v);
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.dontFragmentFlag(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.fragmentOffset((short)0);
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(false);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.ttl(y);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        packet = gQ.Z(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet B(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, short s4) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n10);
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
        builder.window(v);
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.ttl(y);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = gQ.Z(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet I(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, short s4) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n10);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        ArrayList<TcpPacket.TcpOption> arrayList = new ArrayList<TcpPacket.TcpOption>();
        TcpNoOperationOption tcpNoOperationOption = TcpNoOperationOption.getInstance();
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(w).correctLengthAtBuild(true).build();
        arrayList.add(tcpMaximumSegmentSizeOption);
        arrayList.add(tcpNoOperationOption);
        arrayList.add(tcpNoOperationOption);
        TcpSackPermittedOption tcpSackPermittedOption = TcpSackPermittedOption.getInstance();
        arrayList.add(tcpSackPermittedOption);
        arrayList.add(tcpNoOperationOption);
        TcpWindowScaleOption tcpWindowScaleOption = new TcpWindowScaleOption.Builder().shiftCount(r).correctLengthAtBuild(true).build();
        arrayList.add(tcpWindowScaleOption);
        builder.options(arrayList);
        builder.psh(false);
        builder.reserved((byte)0);
        builder.rst(false);
        builder.sequenceNumber(n11);
        builder.srcAddr(inet4Address);
        builder.srcPort(new TcpPort(s2, ""));
        builder.syn(true);
        builder.urg(false);
        builder.window(v);
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        String[] stringArray = xQ.B();
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        builder2.identification(s4);
        String[] stringArray2 = stringArray;
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.ttl(y);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = gQ.Z(macAddress, macAddress2, builder2);
        if (stringArray2 == null) {
            ky_2.K(new String[2]);
        }
        return packet;
    }

    static Packet G(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, short s4) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        TcpNoOperationOption tcpNoOperationOption = TcpNoOperationOption.getInstance();
        String[] stringArray = xQ.B();
        ArrayList<TcpPacket.TcpOption> arrayList = new ArrayList<TcpPacket.TcpOption>();
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(w).correctLengthAtBuild(true).build();
        arrayList.add(tcpMaximumSegmentSizeOption);
        arrayList.add(tcpNoOperationOption);
        String[] stringArray2 = stringArray;
        TcpWindowScaleOption tcpWindowScaleOption = new TcpWindowScaleOption.Builder().shiftCount((byte)gQ.a(19634, 7411835535085203831L)).correctLengthAtBuild(true).build();
        arrayList.add(tcpWindowScaleOption);
        arrayList.add(tcpNoOperationOption);
        arrayList.add(tcpNoOperationOption);
        TcpSackPermittedOption tcpSackPermittedOption = TcpSackPermittedOption.getInstance();
        arrayList.add(tcpSackPermittedOption);
        builder.options(arrayList);
        builder.psh(false);
        builder.reserved((byte)0);
        builder.rst(false);
        builder.sequenceNumber(n10);
        builder.srcAddr(inet4Address);
        builder.srcPort(new TcpPort(s2, ""));
        builder.syn(true);
        builder.urg(false);
        builder.window(v);
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.ttl(y);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = gQ.Z(macAddress, macAddress2, builder2);
        if (ky_2.F() != null) {
            xQ.I(new String[4]);
        }
        return packet;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3DC5;
        if (b[n11] == null) {
            gQ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

