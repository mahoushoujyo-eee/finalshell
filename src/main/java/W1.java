/*
 * Decompiled with CFR 0.152.
 */
import java.net.Inet4Address;
import java.util.ArrayList;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.IpV4Rfc1349Tos;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpNoOperationOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UdpPacket;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.packet.namednumber.UdpPort;
import org.pcap4j.util.MacAddress;

public class W1 {
    static byte R;
    static short s;
    static byte N;
    static short e;
    public static boolean A;
    public static byte[] v;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4988440534531918095L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u001fd>\u00c2)\u008e\u00c3\u001b1])s\u00b1y\u00dc\u0005\u00c9\u008d\u00f5\u00d0\u00aa?i\u0015\u00aa\u0012\u00ac\u009cT6\u001b2\u009a\u00a9 \u00a4\u00cc%.\u008d\u00aad&\u00f8\u00c3\u00d6\u007f\t$\teR6\u000b6\u00b4m\n\u00e3\u00a8\u00af\u00c4\u00f1\u00c5\u00ba\u00ba\u00fc\u00bc<\u008f|\u00e0";
                var5_4 = "\u001fd>\u00c2)\u008e\u00c3\u001b1])s\u00b1y\u00dc\u0005\u00c9\u008d\u00f5\u00d0\u00aa?i\u0015\u00aa\u0012\u00ac\u009cT6\u001b2\u009a\u00a9 \u00a4\u00cc%.\u008d\u00aad&\u00f8\u00c3\u00d6\u007f\t$\teR6\u000b6\u00b4m\n\u00e3\u00a8\u00af\u00c4\u00f1\u00c5\u00ba\u00ba\u00fc\u00bc<\u008f|\u00e0".length();
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
                    var4_3 = "}\nA\u00ba\u00e2%\u001bb;\u00be\u00c5\u00eb4\u008eV.";
                    var5_4 = "}\nA\u00ba\u00e2%\u001bb;\u00be\u00c5\u00eb4\u008eV.".length();
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
        W1.a = var6_1;
        W1.b = new Integer[11];
        W1.R = (byte)W1.a(1032, 2917806376082887213L);
        W1.s = (short)W1.a(434, 5793923162418272157L);
        W1.N = (byte)W1.a(30258, 6758803618474762268L);
        W1.e = (short)-1;
        W1.A = false;
        v5 = new byte[W1.a(10649, 8129016643178495923L)];
        v5[0] = W1.a(18710, 1966758087010361136L);
        v5[2] = W1.a(28325, 8194617786931853454L);
        v5[3] = W1.a(12782, 9044307431664543686L);
        v5[5] = W1.a(12782, 9044307431664543686L);
        v5[W1.a((int)25548, (long)7853854860261733864L)] = W1.a(17158, 8125069690584601899L);
        W1.v = v5;
    }

    public static Packet u(MacAddress macAddress, MacAddress macAddress2, IpV4Packet.Builder builder) {
        AbstractPacket.AbstractBuilder abstractBuilder;
        AbstractPacket.AbstractBuilder abstractBuilder2 = null;
        EtherType etherType = null;
        EthernetPacket ethernetPacket = null;
        if (A) {
            etherType = EtherType.PPPOE_SESSION_STAGE;
            abstractBuilder = new UnknownPacket.Builder();
            byte[] byArray = builder.build().getRawData();
            byte[] byArray2 = new byte[2];
            B8.P((short)(byArray.length + 2), byArray2, 0);
            byte[] byArray3 = new byte[W1.a(24615, 6763004697356350990L)];
            System.arraycopy(v, 0, byArray3, 0, byArray3.length);
            System.arraycopy(byArray2, 0, byArray3, 4, 2);
            byte[] byArray4 = new byte[byArray3.length + byArray.length];
            System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
            System.arraycopy(byArray, 0, byArray4, W1.a(10649, 8129016643178495923L), byArray.length);
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

    public static Packet S(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, byte[] byArray, short s4) {
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
        builder2.ttl(R);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        packet = W1.u(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet V(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, byte[] byArray, short s4) {
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
        builder.window(e);
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
        builder2.ttl(R);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        packet = W1.u(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet X(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, short s4) {
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
        builder.window(e);
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
        builder2.ttl(R);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = W1.u(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet o(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11, short s4) {
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
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(s).correctLengthAtBuild(true).build();
        arrayList.add(tcpMaximumSegmentSizeOption);
        arrayList.add(tcpNoOperationOption);
        arrayList.add(tcpNoOperationOption);
        TcpSackPermittedOption tcpSackPermittedOption = TcpSackPermittedOption.getInstance();
        arrayList.add(tcpSackPermittedOption);
        arrayList.add(tcpNoOperationOption);
        TcpWindowScaleOption tcpWindowScaleOption = new TcpWindowScaleOption.Builder().shiftCount(N).correctLengthAtBuild(true).build();
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
        builder.window(e);
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
        builder2.ttl(R);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = W1.u(macAddress, macAddress2, builder2);
        return packet;
    }

    static Packet j(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, short s4) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        TcpNoOperationOption tcpNoOperationOption = TcpNoOperationOption.getInstance();
        ArrayList<TcpPacket.TcpOption> arrayList = new ArrayList<TcpPacket.TcpOption>();
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = new TcpMaximumSegmentSizeOption.Builder().maxSegSize(s).correctLengthAtBuild(true).build();
        arrayList.add(tcpMaximumSegmentSizeOption);
        arrayList.add(tcpNoOperationOption);
        TcpWindowScaleOption tcpWindowScaleOption = new TcpWindowScaleOption.Builder().shiftCount((byte)W1.a(23614, 471096908037851666L)).correctLengthAtBuild(true).build();
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
        builder.window(e);
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
        builder2.ttl(R);
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        Packet packet = W1.u(macAddress, macAddress2, builder2);
        return packet;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x562C;
        if (b[n11] == null) {
            W1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

