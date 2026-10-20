/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
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
import org.pcap4j.packet.TcpMaximumSegmentSizeOption;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.TcpSackPermittedOption;
import org.pcap4j.packet.TcpWindowScaleOption;
import org.pcap4j.packet.UnknownPacket;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.TcpPort;
import org.pcap4j.util.MacAddress;

/*
 * Renamed from tp
 */
public class tp_2 {
    InetAddress b;
    int o;
    HashMap t = new HashMap();
    HashMap X = new HashMap();
    int G = tp_2.a(30717, 7622254120363138489L);
    Random A = new Random();
    PcapHandle y;
    HashSet Y = new HashSet();
    HashMap v = new HashMap();
    MacAddress O;
    int D = -1;
    boolean w = false;
    int L;
    int F;
    int Q;
    Packet g;
    short j = (short)tp_2.a(10692, 9107184885653521295L);
    fl_0 x;
    fl_0 m;
    int q;
    ArrayList U = new ArrayList();
    HashMap C = new HashMap();
    HashMap p = new HashMap();
    HashMap d = new HashMap();
    HashMap k = new HashMap();
    ArrayList S = new ArrayList();
    Object I = new Object();
    int e = tp_2.a(32125, 1756407798871136060L);
    int V = 0;
    long n = 0L;
    long T = tp_2.b(10845, 7076075993947414457L);
    Object a = new Object();
    Thread M;
    private static final String[] c;
    private static final String[] f;
    private static final long[] h;
    private static final Integer[] i;
    private static final long[] l;
    private static final Long[] r;

    tp_2(PcapHandle pcapHandle) {
        this.y = pcapHandle;
    }

    /*
     * Exception decompiling
     */
    public void l(Packet var1_1, EthernetPacket.EthernetHeader var2_2, IpV4Packet.IpV4Header var3_3, TcpPacket var4_4, boolean var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [75[DOLOOP]], but top level block is 23[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void R() {
        var2_1 = this.I;
        synchronized (var2_1) {
            var1_2 = li_0.I();
            var4_3 = this.S.iterator();
            if (var1_2 == null) ** GOTO lbl25
            block6: while (true) {
                var3_4 = (fl_0)var4_3.next();
                var5_5 = System.currentTimeMillis() - var3_4.q;
                cfr_temp_0 = (float)var5_5 - (float)this.T * 5.0f * (float)(1L + var3_4.K);
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                if (var1_2 != null) ** GOTO lbl27
                if (v0 > 0) {
                    System.out.println("超时重发 " + var3_4.c + " " + var5_5 + "ms " + " resend_count " + var3_4.K + " presend " + this.q / tp_2.a(20795, 7006528147168738173L) + "KB" + " unack " + this.p.size() + " lastDelay " + this.T + "ms");
                    try {
                        this.y.sendPacket(var3_4.l);
                    }
                    catch (PcapNativeException var7_7) {
                        var7_7.printStackTrace();
                    }
                    catch (NotOpenException var7_8) {
                        var7_8.printStackTrace();
                    }
                    var3_4.q = System.currentTimeMillis();
                    ++var3_4.K;
                }
lbl25:
                // 4 sources

                do {
                    v0 = var4_3.hasNext();
lbl27:
                    // 2 sources

                    if (v0 != 0) continue block6;
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 6, 7] lbl28 : MonitorExitStatement: MONITOREXIT : var2_1
                } while (var1_2 != null);
                break;
            }
        }
    }

    void q(long l2) {
        this.T = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void A(int var1_1) {
        block16: {
            block15: {
                block14: {
                    var3_2 = -1;
                    var4_3 = var1_1;
                    var5_4 = 0;
                    var2_5 = li_0.I();
                    var6_6 = false;
                    if (var2_5 == null) ** GOTO lbl11
                    do {
                        ++var4_3;
                        var6_6 = true;
                        if (--var5_4 > tp_2.a(19665, 4180409510138160769L) && var2_5 == null) break;
lbl11:
                        // 2 sources

                    } while (!this.C.containsKey(var4_3));
                    var7_7 = (fl_0)this.C.get(var4_3);
                    if (var6_6) {
                        System.out.println("currectcurrect_Ack " + var5_4 + " " + var7_7.c);
                    }
                    v0 = var7_7;
                    if (var2_5 != null) break block14;
                    if (v0 == null) break block15;
                    v0 = var7_7;
                }
                var3_2 = v0.c;
                if (var2_5 == null) break block16;
            }
            System.out.println("exit 222");
            return;
        }
        var8_8 = var7_7.H;
        var9_9 = this.I;
        synchronized (var9_9) {
            block13: {
                if (var2_5 != null) break block13;
                if (var8_8 <= this.e) break block13;
                this.e = var8_8;
                var10_10 = 0;
                var11_11 = 0;
                if (var2_5 == null) ** GOTO lbl52
                do {
                    block19: {
                        block17: {
                            block18: {
                                var12_13 = (fl_0)this.U.get(var11_11);
                                var13_14 = var12_13.H + var12_13.M;
                                v1 = var8_8;
                                v2 = var13_14;
                                if (var2_5 != null) break block17;
                                if (v1 < v2) break block18;
                                ++var10_10;
                                if (var2_5 == null) break block19;
                            }
                            v1 = var8_8;
                            v2 = var13_14;
                        }
                        if (v1 < v2 && var2_5 == null) ** GOTO lbl68
                    }
                    ++var11_11;
lbl52:
                    // 2 sources

                } while (var11_11 < this.U.size());
                if (var2_5 != null || var2_5 == null) ** GOTO lbl68
                do {
                    block21: {
                        block20: {
                            var11_12 = (fl_0)this.U.remove(0);
                            var12_13 = (fl_0)this.p.remove(var11_12.H);
                            if (var2_5 != null) break block20;
                            if (var12_13 == null) break block21;
                            this.S.remove(var12_13);
                            this.x = var12_13;
                        }
                        var13_15 = System.currentTimeMillis() - var12_13.q;
                        this.q(var13_15);
                        System.out.println("确认延迟_ACK " + var12_13.c + " " + var13_15 + "ms");
                    }
                    --var10_10;
lbl68:
                    // 3 sources

                } while (var10_10 > 0);
            }
            return;
        }
    }

    void t() {
        block3: {
            block4: {
                tp_2 tp_22;
                block5: {
                    fl_0 fl_02;
                    String[] stringArray;
                    block2: {
                        stringArray = li_0.I();
                        fl_02 = this.m;
                        if (stringArray != null) break block2;
                        if (fl_02 == null) break block3;
                        tp_22 = this;
                        if (stringArray != null) break block4;
                        fl_02 = tp_22.x;
                    }
                    if (fl_02 != null) break block5;
                    this.q = this.m.H + this.m.M - this.Q;
                    if (stringArray == null) break block3;
                }
                tp_22 = this;
            }
            tp_22.q = this.m.H + this.m.M - (this.x.H + this.x.M);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void i(Packet var1_1, int var2_2) {
        var4_3 = this.Q;
        var3_4 = li_0.I();
        var5_5 = 0;
        var6_6 = (short)(this.j + 1);
        var7_7 = System.currentTimeMillis();
        while (true) {
            block53: {
                block58: {
                    block57: {
                        block56: {
                            block55: {
                                block54: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                var9_8 = "123456789aaa";
                                                var10_9 = var9_8.getBytes();
                                                var10_9 = new byte[tp_2.a(10629, 6355465892062184415L)];
                                                try {
                                                    this.Q = var4_3;
                                                    this.t();
                                                    if (var3_4 == null) ** GOTO lbl26
lbl14:
                                                    // 3 sources

                                                    while (true) {
                                                        Thread.sleep(1L);
                                                        break block50;
                                                        break;
                                                    }
                                                }
                                                catch (PcapNativeException v0) {
                                                    throw tp_2.a(v0);
                                                }
                                                {
                                                    catch (InterruptedException var11_11) {
                                                        var11_11.printStackTrace();
                                                    }
                                                }
                                            }
                                            v1 = this;
                                            do {
                                                v1.t();
lbl26:
                                                // 2 sources

                                                if (this.q > tp_2.a(24620, 7215755022451444320L)) ** GOTO lbl14
                                                v1 = this;
                                            } while (var3_4 != null);
                                            try {
                                                v2 = v1.p.size();
                                                v3 = tp_2.a(10544, 1571649051110327144L);
                                                if (var3_4 != null) break block51;
                                                if (v2 <= v3) ** break;
                                                ** continue;
                                            }
                                            catch (InterruptedException v4) {
                                                throw tp_2.a(v4);
                                            }
                                            v2 = var6_6;
                                            v3 = 1;
                                        }
                                        var6_6 = (short)(v2 + v3);
                                        var11_10 = this.W(var1_1, var4_3, var10_9, var6_6, var2_2);
                                        try {
                                            this.y.sendPacket(var11_10);
                                        }
                                        catch (PcapNativeException var12_13) {
                                            var12_13.printStackTrace();
                                        }
                                        catch (NotOpenException var12_14) {
                                            var12_14.printStackTrace();
                                        }
                                        var12_15 = this.I;
                                        synchronized (var12_15) {
                                            var13_17 = new fl_0();
                                            var13_17.H = var4_3;
                                            var13_17.M = var10_9.length;
                                            var13_17.l = var11_10;
                                            var13_17.c = var5_5++;
                                            var13_17.J = var14_18 = System.currentTimeMillis();
                                            var13_17.q = var14_18;
                                            this.U.add(var13_17);
                                            this.C.put(var4_3 + var10_9.length, var13_17);
                                            this.p.put(var4_3, var13_17);
                                            this.S.add(var13_17);
                                            this.d.put(var13_17.c, var4_3);
                                            this.k.put(var4_3, var13_17.c);
                                            this.m = var13_17;
                                        }
                                        var4_3 += var10_9.length;
                                        var6_6 = (short)(var6_6 + 1);
                                        var12_12 = var5_5;
                                        var13_16 = 1;
                                        var14_18 = System.currentTimeMillis() - var7_7;
                                        try {
                                            cfr_temp_0 = var14_18 - tp_2.b(24019, 6792029314525784116L);
                                            v6 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                            if (var3_4 != null) break block52;
                                            if (v6 < 0) {
                                            }
                                            ** GOTO lbl94
                                        }
                                        catch (InterruptedException v7) {
                                            throw tp_2.a(v7);
                                        }
                                        var13_16 = tp_2.a(14483, 7909588994563068624L);
                                        try {
                                            if (var3_4 == null) break block53;
lbl94:
                                            // 2 sources

                                            v6 = (cfr_temp_1 = var14_18 - tp_2.b(14485, 902501413453335923L)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                        }
                                        catch (InterruptedException v8) {
                                            throw tp_2.a(v8);
                                        }
                                    }
                                    try {
                                        if (var3_4 != null) break block54;
                                        if (v6 < 0) {
                                        }
                                        ** GOTO lbl109
                                    }
                                    catch (InterruptedException v9) {
                                        throw tp_2.a(v9);
                                    }
                                    var13_16 = tp_2.a(23221, 7920085693321654525L);
                                    try {
                                        if (var3_4 == null) break block53;
lbl109:
                                        // 2 sources

                                        v6 = (cfr_temp_2 = var14_18 - tp_2.b(19341, 4047038017731296877L)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                    }
                                    catch (InterruptedException v10) {
                                        throw tp_2.a(v10);
                                    }
                                }
                                try {
                                    if (var3_4 != null) break block55;
                                    if (v6 < 0) {
                                    }
                                    ** GOTO lbl124
                                }
                                catch (InterruptedException v11) {
                                    throw tp_2.a(v11);
                                }
                                var13_16 = tp_2.a(13841, 6817484015001459807L);
                                try {
                                    if (var3_4 == null) break block53;
lbl124:
                                    // 2 sources

                                    v6 = (cfr_temp_3 = var14_18 - tp_2.b(8502, 1981799304617596115L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                }
                                catch (InterruptedException v12) {
                                    throw tp_2.a(v12);
                                }
                            }
                            try {
                                if (var3_4 != null) break block56;
                                if (v6 < 0) {
                                }
                                ** GOTO lbl139
                            }
                            catch (InterruptedException v13) {
                                throw tp_2.a(v13);
                            }
                            var13_16 = tp_2.a(26913, 8358765797908087656L);
                            try {
                                if (var3_4 == null) break block53;
lbl139:
                                // 2 sources

                                v6 = (cfr_temp_4 = var14_18 - tp_2.b(30328, 7145823961090966427L)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                            }
                            catch (InterruptedException v14) {
                                throw tp_2.a(v14);
                            }
                        }
                        try {
                            if (var3_4 != null) break block57;
                            if (v6 < 0) {
                            }
                            ** GOTO lbl154
                        }
                        catch (InterruptedException v15) {
                            throw tp_2.a(v15);
                        }
                        var13_16 = 3;
                        try {
                            if (var3_4 == null) break block53;
lbl154:
                            // 2 sources

                            v6 = (cfr_temp_5 = var14_18 - tp_2.b(8052, 3019064083911322261L)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                        }
                        catch (InterruptedException v16) {
                            throw tp_2.a(v16);
                        }
                    }
                    try {
                        if (var3_4 != null) break block58;
                        if (v6 < 0) {
                        }
                        ** GOTO lbl169
                    }
                    catch (InterruptedException v17) {
                        throw tp_2.a(v17);
                    }
                    var13_16 = 2;
                    if (var3_4 == null) break block53;
lbl169:
                    // 2 sources

                    try {
                        block59: {
                            v18 = var14_18;
                            if (var3_4 != null) ** GOTO lbl187
                            break block59;
                            catch (InterruptedException v19) {
                                throw tp_2.a(v19);
                            }
                        }
                        cfr_temp_6 = v18 - tp_2.b(19463, 6173073564605676005L);
                        v6 = cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1);
                    }
                    catch (InterruptedException v20) {
                        throw tp_2.a(v20);
                    }
                }
                if (v6 < 0) {
                    var13_16 = 1;
                }
            }
            try {
                v18 = 1L;
lbl187:
                // 2 sources

                Thread.sleep(v18);
                continue;
            }
            catch (InterruptedException var16_19) {
                var16_19.printStackTrace();
                continue;
            }
            break;
        }
    }

    Packet K(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11) {
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n10);
        builder.dataOffset((byte)tp_2.a(10524, 6945168932502553438L));
        builder.dstAddr(inet4Address2);
        builder.dstPort(new TcpPort(s3, ""));
        ArrayList<TcpPacket.TcpOption> arrayList = new ArrayList<TcpPacket.TcpOption>();
        TcpMaximumSegmentSizeOption tcpMaximumSegmentSizeOption = new TcpMaximumSegmentSizeOption.Builder().maxSegSize((short)tp_2.a(10474, 6484525272380588724L)).correctLengthAtBuild(true).build();
        arrayList.add(tcpMaximumSegmentSizeOption);
        TcpSackPermittedOption tcpSackPermittedOption = TcpSackPermittedOption.getInstance();
        arrayList.add(tcpSackPermittedOption);
        TcpWindowScaleOption tcpWindowScaleOption = new TcpWindowScaleOption.Builder().shiftCount((byte)tp_2.a(28247, 7451438915530687511L)).correctLengthAtBuild(true).build();
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
        builder.window((short)tp_2.a(29426, 6545203654348675246L));
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        short s4 = (short)Math.abs(this.A.nextInt(tp_2.a(7838, 2957296431174055109L)));
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)tp_2.a(13575, 230848830825750349L));
        builder2.ttl((byte)tp_2.a(13575, 230848830825750349L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(macAddress2).srcAddr(macAddress).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        EthernetPacket ethernetPacket = builder3.build();
        IpV4Packet ipV4Packet = builder2.build();
        TcpPacket tcpPacket = builder.build();
        this.Y.add(s4);
        return ethernetPacket;
    }

    Packet D(Packet packet, int n10, byte[] byArray) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.payloadBuilder(new UnknownPacket.Builder().rawData(byArray));
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
        String[] stringArray = li_0.I();
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(ipV4Header.getMoreFragmentFlag());
        builder2.options(ipV4Header.getOptions());
        builder2.padding(ipV4Header.getPadding());
        builder2.protocol(IpNumber.TCP);
        String[] stringArray2 = stringArray;
        builder2.reservedFlag(ipV4Header.getReservedFlag());
        builder2.srcAddr(ipV4Header.getSrcAddr());
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)tp_2.a(13575, 230848830825750349L));
        builder2.ttl((byte)tp_2.a(27367, 87871014116491448L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        if (stringArray2 != null) {
            ky_2.K(new String[3]);
        }
        return ethernetPacket;
    }

    Packet y(Packet packet, int n10, int n11) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n11);
        builder.checksum(tcpHeader.getChecksum());
        builder.dataOffset(tcpHeader.getDataOffset());
        builder.dstAddr(ipV4Header.getDstAddr());
        builder.dstPort(new TcpPort((Short)tcpHeader.getDstPort().value(), ""));
        builder.fin(false);
        builder.padding(tcpHeader.getPadding());
        builder.psh(false);
        builder.reserved(tcpHeader.getReserved());
        builder.rst(false);
        builder.sequenceNumber(n10);
        builder.srcAddr(ipV4Header.getSrcAddr());
        builder.srcPort(new TcpPort((Short)tcpHeader.getSrcPort().value(), ""));
        builder.syn(false);
        builder.urg(false);
        builder.urgentPointer(tcpHeader.getUrgentPointer());
        builder.window(tcpHeader.getWindow());
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.dontFragmentFlag(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(ipV4Header.getDstAddr());
        builder2.fragmentOffset((short)0);
        builder2.headerChecksum(ipV4Header.getHeaderChecksum());
        short s2 = (short)Math.abs(this.A.nextInt(tp_2.a(22779, 4308538693246530238L)));
        builder2.identification(s2);
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(false);
        builder2.padding(ipV4Header.getPadding());
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(ipV4Header.getSrcAddr());
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)tp_2.a(13575, 230848830825750349L));
        builder2.ttl((byte)tp_2.a(27367, 87871014116491448L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        return ethernetPacket;
    }

    Packet W(Packet packet, int n10, byte[] byArray, short s2, int n11) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        String[] stringArray = li_0.I();
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        builder.payloadBuilder(new UnknownPacket.Builder().rawData(byArray));
        builder.correctChecksumAtBuild(true);
        builder.correctLengthAtBuild(true);
        String[] stringArray2 = stringArray;
        builder.paddingAtBuild(true);
        builder.ack(true);
        builder.acknowledgmentNumber(n11);
        builder.checksum(tcpHeader.getChecksum());
        builder.dataOffset(tcpHeader.getDataOffset());
        builder.dstAddr(ipV4Header.getDstAddr());
        builder.dstPort(new TcpPort((Short)tcpHeader.getDstPort().value(), ""));
        builder.fin(false);
        builder.padding(tcpHeader.getPadding());
        builder.psh(false);
        builder.reserved(tcpHeader.getReserved());
        builder.rst(false);
        builder.sequenceNumber(n10);
        builder.srcAddr(ipV4Header.getSrcAddr());
        builder.srcPort(new TcpPort((Short)tcpHeader.getSrcPort().value(), ""));
        builder.syn(false);
        builder.urg(false);
        builder.urgentPointer(tcpHeader.getUrgentPointer());
        builder.window(tcpHeader.getWindow());
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.dontFragmentFlag(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(ipV4Header.getDstAddr());
        builder2.fragmentOffset((short)0);
        builder2.headerChecksum(ipV4Header.getHeaderChecksum());
        short s3 = (short)Math.abs(this.A.nextInt(tp_2.a(22779, 4308538693246530238L)));
        s3 = s2;
        builder2.identification(s3);
        builder2.ihl((byte)5);
        builder2.moreFragmentFlag(false);
        builder2.padding(ipV4Header.getPadding());
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(ipV4Header.getSrcAddr());
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)tp_2.a(13575, 230848830825750349L));
        builder2.ttl((byte)tp_2.a(27367, 87871014116491448L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        if (ky_2.F() != null) {
            li_0.K(new String[1]);
        }
        return ethernetPacket;
    }

    static Packet j(Packet packet) {
        EthernetPacket ethernetPacket = null;
        EthernetPacket ethernetPacket2 = (EthernetPacket)packet;
        EthernetPacket.EthernetHeader ethernetHeader = ethernetPacket2.getHeader();
        IpV4Packet ipV4Packet = (IpV4Packet)ethernetPacket2.getPayload();
        IpV4Packet.IpV4Header ipV4Header = ipV4Packet.getHeader();
        String[] stringArray = li_0.I();
        TcpPacket tcpPacket = (TcpPacket)ipV4Packet.getPayload();
        TcpPacket.TcpHeader tcpHeader = tcpPacket.getHeader();
        TcpPacket.Builder builder = new TcpPacket.Builder();
        if (stringArray == null) {
            if (tcpPacket.getPayload() != null) {
                builder.payloadBuilder(new UnknownPacket.Builder().rawData(tcpPacket.getPayload().getRawData()));
            }
            builder.correctChecksumAtBuild(true);
            builder.correctLengthAtBuild(true);
            builder.paddingAtBuild(true);
            builder.ack(true);
            builder.acknowledgmentNumber(tcpHeader.getAcknowledgmentNumber());
            builder.checksum(tcpHeader.getChecksum());
            builder.dataOffset(tcpHeader.getDataOffset());
            builder.dstAddr(ipV4Header.getDstAddr());
            builder.dstPort(tcpHeader.getDstPort());
            builder.fin(tcpHeader.getFin());
            builder.options(tcpHeader.getOptions());
            builder.padding(tcpHeader.getPadding());
            builder.psh(tcpHeader.getPsh());
            builder.reserved(tcpHeader.getReserved());
            builder.rst(tcpHeader.getRst());
            builder.sequenceNumber(tcpHeader.getSequenceNumber());
            builder.srcAddr(ipV4Header.getSrcAddr());
            builder.srcPort(tcpHeader.getSrcPort());
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
        builder2.totalLength((short)tp_2.a(18594, 403647554778800895L));
        builder2.ttl((byte)tp_2.a(6176, 6492683245522776685L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(ethernetHeader.getDstAddr()).srcAddr(ethernetHeader.getSrcAddr()).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        ethernetPacket = builder3.build();
        return ethernetPacket;
    }

    Packet X(MacAddress macAddress, MacAddress macAddress2, Inet4Address inet4Address, short s2, Inet4Address inet4Address2, short s3, int n10, int n11) {
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
        builder.window((short)tp_2.a(21595, 4149604998274891292L));
        IpV4Packet.Builder builder2 = new IpV4Packet.Builder();
        builder2.correctChecksumAtBuild(true);
        builder2.correctLengthAtBuild(true);
        builder2.paddingAtBuild(true);
        builder2.dstAddr(inet4Address2);
        builder2.dontFragmentFlag(true);
        builder2.fragmentOffset((short)0);
        short s4 = (short)Math.abs(this.A.nextInt(tp_2.a(22779, 4308538693246530238L)));
        builder2.identification(s4);
        builder2.ihl((byte)5);
        builder2.protocol(IpNumber.TCP);
        builder2.srcAddr(inet4Address);
        builder2.tos(IpV4Rfc1349Tos.newInstance((byte)0));
        builder2.totalLength((short)tp_2.a(13575, 230848830825750349L));
        builder2.ttl((byte)tp_2.a(13575, 230848830825750349L));
        builder2.version(IpVersion.IPV4);
        builder2.payloadBuilder(builder);
        EthernetPacket.Builder builder3 = new EthernetPacket.Builder();
        builder3.dstAddr(macAddress2).srcAddr(macAddress).type(EtherType.IPV4).payloadBuilder(builder2).paddingAtBuild(true);
        EthernetPacket ethernetPacket = builder3.build();
        IpV4Packet ipV4Packet = builder2.build();
        TcpPacket tcpPacket = builder.build();
        this.Y.add(s4);
        return ethernetPacket;
    }

    public InetAddress H() {
        return this.b;
    }

    public void V(InetAddress inetAddress) {
        this.b = inetAddress;
    }

    public int c() {
        return this.o;
    }

    public void d(int n10) {
        this.o = n10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

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
                                var21 = new String[24];
                                var19_1 = 0;
                                var18_2 = "\u00f78i\u0007\u0083\u8bfa\u6c61\u7a3c\u53a5t\u00cd\u0011\t7\u00c6\u009a\u00f5\u0084~F\u00bb\u00b8\u00bdZ-\u0093\u0097=\u009d\b\u009d\u0085d6\u0088\u00d6\u00c2g\u000fq\t$\r\u00bd%\u00ccSn`\u00e15\u00b8\u00dd\u00a3\u0006\u6742\u5209\u7a7c\u63d0\u62b6<\t\u7868\u8bd4\u5e2f\u8ff0\u00f2\u00a0o\u00ad\u009e\u000bD\u0000\u00ba\u0017\u000e`\u00987\u00c3\t\u0090\bq\u001a\u00f9\u00c5;\u00ab\u00b7\u00a8\u0006\\\u00de\u00a1-8\u00fd\u0007F\u760f\u689c\u7ab8\u53f7\u00e4\u0087\u0013\u00c9\u00d43\u00b6_R\u0090\u00bd\u00e5\u00bd\u0090\u008e\u0096\u00aa\u0019\u0096\u0083U?\u0012\u7b55\u4e58\u6b55\u636f\u6284\u5b49\u6243\u7aab\u8b36\u6c52\u5446\u6b45\u00be\u00d4\u0011\u009194\f\u0090\u00f5A{(0gU|\u0083u<\u0007jCpW\u00ae\u0017<\n\u784f\u8b68\u5ecb\u8f67n@\u00fe\u00e9\u0085A\u0002\u0099\u00f2\u000e\u00a4C\u00a2\u00a2\u0098\u00fcx\u00f8\u00fc\u00b3`\u00fax\u001a\tL\u00b0\u00a8\u0088:f\u00f2\u00fa\u00a5\u0010\u7b47\u4ef7\u6b17\u63b2\u62cc\u5bf2\u624a\u7adc\u542d\u5e6atJ\u0012\u00a9\u00eck\u0018\u7b76\u4e3b\u6b31\u631e\u6208\u67c8\u5244\u5646\u54a8\u5e4e\u54e8\u6bcag\u5e20\u8b29\u6c86\u5457\u6b3a'4e;\u00e16\u0005\u8d47\u6597\u9167\u538e\u00d8";
                                var20_3 = "\u00f78i\u0007\u0083\u8bfa\u6c61\u7a3c\u53a5t\u00cd\u0011\t7\u00c6\u009a\u00f5\u0084~F\u00bb\u00b8\u00bdZ-\u0093\u0097=\u009d\b\u009d\u0085d6\u0088\u00d6\u00c2g\u000fq\t$\r\u00bd%\u00ccSn`\u00e15\u00b8\u00dd\u00a3\u0006\u6742\u5209\u7a7c\u63d0\u62b6<\t\u7868\u8bd4\u5e2f\u8ff0\u00f2\u00a0o\u00ad\u009e\u000bD\u0000\u00ba\u0017\u000e`\u00987\u00c3\t\u0090\bq\u001a\u00f9\u00c5;\u00ab\u00b7\u00a8\u0006\\\u00de\u00a1-8\u00fd\u0007F\u760f\u689c\u7ab8\u53f7\u00e4\u0087\u0013\u00c9\u00d43\u00b6_R\u0090\u00bd\u00e5\u00bd\u0090\u008e\u0096\u00aa\u0019\u0096\u0083U?\u0012\u7b55\u4e58\u6b55\u636f\u6284\u5b49\u6243\u7aab\u8b36\u6c52\u5446\u6b45\u00be\u00d4\u0011\u009194\f\u0090\u00f5A{(0gU|\u0083u<\u0007jCpW\u00ae\u0017<\n\u784f\u8b68\u5ecb\u8f67n@\u00fe\u00e9\u0085A\u0002\u0099\u00f2\u000e\u00a4C\u00a2\u00a2\u0098\u00fcx\u00f8\u00fc\u00b3`\u00fax\u001a\tL\u00b0\u00a8\u0088:f\u00f2\u00fa\u00a5\u0010\u7b47\u4ef7\u6b17\u63b2\u62cc\u5bf2\u624a\u7adc\u542d\u5e6atJ\u0012\u00a9\u00eck\u0018\u7b76\u4e3b\u6b31\u631e\u6208\u67c8\u5244\u5646\u54a8\u5e4e\u54e8\u6bcag\u5e20\u8b29\u6c86\u5457\u6b3a'4e;\u00e16\u0005\u8d47\u6597\u9167\u538e\u00d8".length();
                                var17_4 = 3;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 122;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00aa\u0088\u0002F\u00ea";
                                    var20_3 = "\u00aa\u0088\u0002F\u00ea".length();
                                    var17_4 = 2;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 126;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
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
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 2;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 103;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 92;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 21;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 101;
                                            break;
                                        }
                                        default: {
                                            v15 = 81;
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
lbl85:
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
lbl95:
                                // 1 sources

                                ** continue;
                            }
                        }
                        tp_2.c = var21;
                        tp_2.f = new String[24];
                        var8_7 = 4931268133112260417L;
                        var14_8 = new long[25];
                        var11_9 = 0;
                        var12_10 = "3\u00dfs\u0088\u00b3K\u0017\u00b5(j\u0094\u00b8\u0096\u00a3$/\u00de=\u0090:\u00a8r\u00f88\u0096\u00a3\u0017\u00ad\u00bbsd\u00aa\u001c\u00ae[\u00d1%>\u00dd!a\u00dd\u00811n\u00df\u00d5l\u0099.\u0001H&L\u00fb\u0016xr\u0004\u00fa\u00d9Si\u00e6\u001e\u00cf@\u00e7\u00af\u00e6\u00a3P-\u00f7\u00c5\u00cc\u00a2,\u00b0}\rJ/\u00a2\u00a0\u00b8\u00e4\u0017\u00109\u00f3I\u00d2\u0019u\u009b\u00e4\u00b7\u0004X\u0006\\\u00ba\u00f8\u0095\u0095\u0090\u0010Q\u00a0j\u0000\u009ee\u0099\u00d6>\u0098\u0098<\u00e8\f\u00f8\u0085!\u00ff\u00e6ak\u0084\u00b1\u00e2]^\u00e7\t\u00c5\u0017b\\\u0080#\u00eej#\u00a7>\u00a0(&a\u00e6\u00b0g|\u008b\u00fd\u00f4\u00ac{\u0095\u0087\u0013\u00199\u00a9@\u00d3\u001a|\u00c6U\u008bW\u0085\u008a\u0087\u00f4\u00d0h\u0083\u0015\u00e0Y";
                        var13_11 = "3\u00dfs\u0088\u00b3K\u0017\u00b5(j\u0094\u00b8\u0096\u00a3$/\u00de=\u0090:\u00a8r\u00f88\u0096\u00a3\u0017\u00ad\u00bbsd\u00aa\u001c\u00ae[\u00d1%>\u00dd!a\u00dd\u00811n\u00df\u00d5l\u0099.\u0001H&L\u00fb\u0016xr\u0004\u00fa\u00d9Si\u00e6\u001e\u00cf@\u00e7\u00af\u00e6\u00a3P-\u00f7\u00c5\u00cc\u00a2,\u00b0}\rJ/\u00a2\u00a0\u00b8\u00e4\u0017\u00109\u00f3I\u00d2\u0019u\u009b\u00e4\u00b7\u0004X\u0006\\\u00ba\u00f8\u0095\u0095\u0090\u0010Q\u00a0j\u0000\u009ee\u0099\u00d6>\u0098\u0098<\u00e8\f\u00f8\u0085!\u00ff\u00e6ak\u0084\u00b1\u00e2]^\u00e7\t\u00c5\u0017b\\\u0080#\u00eej#\u00a7>\u00a0(&a\u00e6\u00b0g|\u008b\u00fd\u00f4\u00ac{\u0095\u0087\u0013\u00199\u00a9@\u00d3\u001a|\u00c6U\u008bW\u0085\u008a\u0087\u00f4\u00d0h\u0083\u0015\u00e0Y".length();
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
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "w\u00ee\u0012W\u00b0+\u00a7\u00b9\u00e7\u00ee\u00a9,\u008d/\u0007\u0080";
                            var13_11 = "w\u00ee\u0012W\u00b0+\u00a7\u00b9\u00e7\u00ee\u00a9,\u008d/\u0007\u0080".length();
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
lbl125:
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
lbl136:
                        // 1 sources

                        ** continue;
                    }
                }
                tp_2.h = var14_8;
                tp_2.i = new Integer[25];
                var0_14 = 5015786292918098338L;
                var6_15 = new long[8];
                var3_16 = 0;
                var4_17 = "}\u00b2P\u00ad\u008d\u00f7\u00ecwl~y\u00c6\u00e1\u0004\u00a4G\u00100\u008e\u00bc\\\u0004\u00fb\u001f&\u00b0\u00b6\u0007N\u00e5I\u00b1'\u00a8\u00e2\u00af4O\u00877^\u001bd\u00f8\u00adq\u0002\u00d1";
                var5_18 = "}\u00b2P\u00ad\u008d\u00f7\u00ecwl~y\u00c6\u00e1\u0004\u00a4G\u00100\u008e\u00bc\\\u0004\u00fb\u001f&\u00b0\u00b6\u0007N\u00e5I\u00b1'\u00a8\u00e2\u00af4O\u00877^\u001bd\u00f8\u00adq\u0002\u00d1".length();
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
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "I\u001d\u00f3O\u00fc\u0084\u0093\u0001\u001b\u00d9\u0085\u00a2\u0006\u00f1r~";
                    var5_18 = "I\u001d\u00f3O\u00fc\u0084\u0093\u0001\u001b\u00d9\u0085\u00a2\u0006\u00f1r~".length();
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
lbl166:
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
lbl177:
                // 1 sources

                ** continue;
            }
        }
        tp_2.l = var6_15;
        tp_2.r = new Long[8];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x13F8) & 0xFFFF;
        if (f[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 253;
                    break;
                }
                case 1: {
                    n14 = 139;
                    break;
                }
                case 2: {
                    n14 = 179;
                    break;
                }
                case 3: {
                    n14 = 239;
                    break;
                }
                case 4: {
                    n14 = 113;
                    break;
                }
                case 5: {
                    n14 = 127;
                    break;
                }
                case 6: {
                    n14 = 171;
                    break;
                }
                case 7: {
                    n14 = 104;
                    break;
                }
                case 8: {
                    n14 = 114;
                    break;
                }
                case 9: {
                    n14 = 166;
                    break;
                }
                case 10: {
                    n14 = 161;
                    break;
                }
                case 11: {
                    n14 = 159;
                    break;
                }
                case 12: {
                    n14 = 254;
                    break;
                }
                case 13: {
                    n14 = 167;
                    break;
                }
                case 14: {
                    n14 = 201;
                    break;
                }
                case 15: {
                    n14 = 85;
                    break;
                }
                case 16: {
                    n14 = 248;
                    break;
                }
                case 17: {
                    n14 = 23;
                    break;
                }
                case 18: {
                    n14 = 240;
                    break;
                }
                case 19: {
                    n14 = 186;
                    break;
                }
                case 20: {
                    n14 = 32;
                    break;
                }
                case 21: {
                    n14 = 206;
                    break;
                }
                case 22: {
                    n14 = 193;
                    break;
                }
                case 23: {
                    n14 = 72;
                    break;
                }
                case 24: {
                    n14 = 49;
                    break;
                }
                case 25: {
                    n14 = 1;
                    break;
                }
                case 26: {
                    n14 = 77;
                    break;
                }
                case 27: {
                    n14 = 188;
                    break;
                }
                case 28: {
                    n14 = 89;
                    break;
                }
                case 29: {
                    n14 = 223;
                    break;
                }
                case 30: {
                    n14 = 189;
                    break;
                }
                case 31: {
                    n14 = 218;
                    break;
                }
                case 32: {
                    n14 = 103;
                    break;
                }
                case 33: {
                    n14 = 88;
                    break;
                }
                case 34: {
                    n14 = 192;
                    break;
                }
                case 35: {
                    n14 = 20;
                    break;
                }
                case 36: {
                    n14 = 79;
                    break;
                }
                case 37: {
                    n14 = 56;
                    break;
                }
                case 38: {
                    n14 = 4;
                    break;
                }
                case 39: {
                    n14 = 153;
                    break;
                }
                case 40: {
                    n14 = 38;
                    break;
                }
                case 41: {
                    n14 = 10;
                    break;
                }
                case 42: {
                    n14 = 169;
                    break;
                }
                case 43: {
                    n14 = 134;
                    break;
                }
                case 44: {
                    n14 = 236;
                    break;
                }
                case 45: {
                    n14 = 160;
                    break;
                }
                case 46: {
                    n14 = 63;
                    break;
                }
                case 47: {
                    n14 = 45;
                    break;
                }
                case 48: {
                    n14 = 225;
                    break;
                }
                case 49: {
                    n14 = 75;
                    break;
                }
                case 50: {
                    n14 = 70;
                    break;
                }
                case 51: {
                    n14 = 17;
                    break;
                }
                case 52: {
                    n14 = 182;
                    break;
                }
                case 53: {
                    n14 = 227;
                    break;
                }
                case 54: {
                    n14 = 170;
                    break;
                }
                case 55: {
                    n14 = 181;
                    break;
                }
                case 56: {
                    n14 = 168;
                    break;
                }
                case 57: {
                    n14 = 150;
                    break;
                }
                case 58: {
                    n14 = 29;
                    break;
                }
                case 59: {
                    n14 = 105;
                    break;
                }
                case 60: {
                    n14 = 185;
                    break;
                }
                case 61: {
                    n14 = 154;
                    break;
                }
                case 62: {
                    n14 = 11;
                    break;
                }
                case 63: {
                    n14 = 180;
                    break;
                }
                case 64: {
                    n14 = 58;
                    break;
                }
                case 65: {
                    n14 = 252;
                    break;
                }
                case 66: {
                    n14 = 27;
                    break;
                }
                case 67: {
                    n14 = 5;
                    break;
                }
                case 68: {
                    n14 = 118;
                    break;
                }
                case 69: {
                    n14 = 92;
                    break;
                }
                case 70: {
                    n14 = 202;
                    break;
                }
                case 71: {
                    n14 = 149;
                    break;
                }
                case 72: {
                    n14 = 247;
                    break;
                }
                case 73: {
                    n14 = 249;
                    break;
                }
                case 74: {
                    n14 = 59;
                    break;
                }
                case 75: {
                    n14 = 141;
                    break;
                }
                case 76: {
                    n14 = 187;
                    break;
                }
                case 77: {
                    n14 = 26;
                    break;
                }
                case 78: {
                    n14 = 61;
                    break;
                }
                case 79: {
                    n14 = 46;
                    break;
                }
                case 80: {
                    n14 = 142;
                    break;
                }
                case 81: {
                    n14 = 205;
                    break;
                }
                case 82: {
                    n14 = 37;
                    break;
                }
                case 83: {
                    n14 = 136;
                    break;
                }
                case 84: {
                    n14 = 233;
                    break;
                }
                case 85: {
                    n14 = 177;
                    break;
                }
                case 86: {
                    n14 = 67;
                    break;
                }
                case 87: {
                    n14 = 212;
                    break;
                }
                case 88: {
                    n14 = 100;
                    break;
                }
                case 89: {
                    n14 = 151;
                    break;
                }
                case 90: {
                    n14 = 2;
                    break;
                }
                case 91: {
                    n14 = 135;
                    break;
                }
                case 92: {
                    n14 = 147;
                    break;
                }
                case 93: {
                    n14 = 224;
                    break;
                }
                case 94: {
                    n14 = 125;
                    break;
                }
                case 95: {
                    n14 = 90;
                    break;
                }
                case 96: {
                    n14 = 172;
                    break;
                }
                case 97: {
                    n14 = 244;
                    break;
                }
                case 98: {
                    n14 = 12;
                    break;
                }
                case 99: {
                    n14 = 107;
                    break;
                }
                case 100: {
                    n14 = 51;
                    break;
                }
                case 101: {
                    n14 = 48;
                    break;
                }
                case 102: {
                    n14 = 211;
                    break;
                }
                case 103: {
                    n14 = 84;
                    break;
                }
                case 104: {
                    n14 = 81;
                    break;
                }
                case 105: {
                    n14 = 220;
                    break;
                }
                case 106: {
                    n14 = 16;
                    break;
                }
                case 107: {
                    n14 = 174;
                    break;
                }
                case 108: {
                    n14 = 232;
                    break;
                }
                case 109: {
                    n14 = 121;
                    break;
                }
                case 110: {
                    n14 = 116;
                    break;
                }
                case 111: {
                    n14 = 208;
                    break;
                }
                case 112: {
                    n14 = 216;
                    break;
                }
                case 113: {
                    n14 = 42;
                    break;
                }
                case 114: {
                    n14 = 198;
                    break;
                }
                case 115: {
                    n14 = 178;
                    break;
                }
                case 116: {
                    n14 = 158;
                    break;
                }
                case 117: {
                    n14 = 204;
                    break;
                }
                case 118: {
                    n14 = 173;
                    break;
                }
                case 119: {
                    n14 = 124;
                    break;
                }
                case 120: {
                    n14 = 203;
                    break;
                }
                case 121: {
                    n14 = 175;
                    break;
                }
                case 122: {
                    n14 = 145;
                    break;
                }
                case 123: {
                    n14 = 235;
                    break;
                }
                case 124: {
                    n14 = 122;
                    break;
                }
                case 125: {
                    n14 = 71;
                    break;
                }
                case 126: {
                    n14 = 228;
                    break;
                }
                case 127: {
                    n14 = 215;
                    break;
                }
                case 128: {
                    n14 = 95;
                    break;
                }
                case 129: {
                    n14 = 86;
                    break;
                }
                case 130: {
                    n14 = 78;
                    break;
                }
                case 131: {
                    n14 = 241;
                    break;
                }
                case 132: {
                    n14 = 230;
                    break;
                }
                case 133: {
                    n14 = 184;
                    break;
                }
                case 134: {
                    n14 = 214;
                    break;
                }
                case 135: {
                    n14 = 119;
                    break;
                }
                case 136: {
                    n14 = 117;
                    break;
                }
                case 137: {
                    n14 = 251;
                    break;
                }
                case 138: {
                    n14 = 219;
                    break;
                }
                case 139: {
                    n14 = 109;
                    break;
                }
                case 140: {
                    n14 = 120;
                    break;
                }
                case 141: {
                    n14 = 138;
                    break;
                }
                case 142: {
                    n14 = 53;
                    break;
                }
                case 143: {
                    n14 = 157;
                    break;
                }
                case 144: {
                    n14 = 199;
                    break;
                }
                case 145: {
                    n14 = 14;
                    break;
                }
                case 146: {
                    n14 = 196;
                    break;
                }
                case 147: {
                    n14 = 91;
                    break;
                }
                case 148: {
                    n14 = 243;
                    break;
                }
                case 149: {
                    n14 = 57;
                    break;
                }
                case 150: {
                    n14 = 133;
                    break;
                }
                case 151: {
                    n14 = 123;
                    break;
                }
                case 152: {
                    n14 = 3;
                    break;
                }
                case 153: {
                    n14 = 15;
                    break;
                }
                case 154: {
                    n14 = 44;
                    break;
                }
                case 155: {
                    n14 = 35;
                    break;
                }
                case 156: {
                    n14 = 226;
                    break;
                }
                case 157: {
                    n14 = 148;
                    break;
                }
                case 158: {
                    n14 = 9;
                    break;
                }
                case 159: {
                    n14 = 54;
                    break;
                }
                case 160: {
                    n14 = 8;
                    break;
                }
                case 161: {
                    n14 = 64;
                    break;
                }
                case 162: {
                    n14 = 73;
                    break;
                }
                case 163: {
                    n14 = 112;
                    break;
                }
                case 164: {
                    n14 = 137;
                    break;
                }
                case 165: {
                    n14 = 162;
                    break;
                }
                case 166: {
                    n14 = 222;
                    break;
                }
                case 167: {
                    n14 = 155;
                    break;
                }
                case 168: {
                    n14 = 190;
                    break;
                }
                case 169: {
                    n14 = 55;
                    break;
                }
                case 170: {
                    n14 = 217;
                    break;
                }
                case 171: {
                    n14 = 115;
                    break;
                }
                case 172: {
                    n14 = 229;
                    break;
                }
                case 173: {
                    n14 = 194;
                    break;
                }
                case 174: {
                    n14 = 43;
                    break;
                }
                case 175: {
                    n14 = 74;
                    break;
                }
                case 176: {
                    n14 = 99;
                    break;
                }
                case 177: {
                    n14 = 28;
                    break;
                }
                case 178: {
                    n14 = 24;
                    break;
                }
                case 179: {
                    n14 = 31;
                    break;
                }
                case 180: {
                    n14 = 131;
                    break;
                }
                case 181: {
                    n14 = 34;
                    break;
                }
                case 182: {
                    n14 = 52;
                    break;
                }
                case 183: {
                    n14 = 234;
                    break;
                }
                case 184: {
                    n14 = 111;
                    break;
                }
                case 185: {
                    n14 = 106;
                    break;
                }
                case 186: {
                    n14 = 82;
                    break;
                }
                case 187: {
                    n14 = 200;
                    break;
                }
                case 188: {
                    n14 = 176;
                    break;
                }
                case 189: {
                    n14 = 237;
                    break;
                }
                case 190: {
                    n14 = 50;
                    break;
                }
                case 191: {
                    n14 = 94;
                    break;
                }
                case 192: {
                    n14 = 87;
                    break;
                }
                case 193: {
                    n14 = 62;
                    break;
                }
                case 194: {
                    n14 = 7;
                    break;
                }
                case 195: {
                    n14 = 108;
                    break;
                }
                case 196: {
                    n14 = 30;
                    break;
                }
                case 197: {
                    n14 = 40;
                    break;
                }
                case 198: {
                    n14 = 210;
                    break;
                }
                case 199: {
                    n14 = 6;
                    break;
                }
                case 200: {
                    n14 = 39;
                    break;
                }
                case 201: {
                    n14 = 110;
                    break;
                }
                case 202: {
                    n14 = 22;
                    break;
                }
                case 203: {
                    n14 = 195;
                    break;
                }
                case 204: {
                    n14 = 47;
                    break;
                }
                case 205: {
                    n14 = 41;
                    break;
                }
                case 206: {
                    n14 = 0;
                    break;
                }
                case 207: {
                    n14 = 146;
                    break;
                }
                case 208: {
                    n14 = 96;
                    break;
                }
                case 209: {
                    n14 = 246;
                    break;
                }
                case 210: {
                    n14 = 152;
                    break;
                }
                case 211: {
                    n14 = 165;
                    break;
                }
                case 212: {
                    n14 = 97;
                    break;
                }
                case 213: {
                    n14 = 65;
                    break;
                }
                case 214: {
                    n14 = 143;
                    break;
                }
                case 215: {
                    n14 = 250;
                    break;
                }
                case 216: {
                    n14 = 128;
                    break;
                }
                case 217: {
                    n14 = 156;
                    break;
                }
                case 218: {
                    n14 = 21;
                    break;
                }
                case 219: {
                    n14 = 83;
                    break;
                }
                case 220: {
                    n14 = 209;
                    break;
                }
                case 221: {
                    n14 = 36;
                    break;
                }
                case 222: {
                    n14 = 126;
                    break;
                }
                case 223: {
                    n14 = 33;
                    break;
                }
                case 224: {
                    n14 = 207;
                    break;
                }
                case 225: {
                    n14 = 13;
                    break;
                }
                case 226: {
                    n14 = 130;
                    break;
                }
                case 227: {
                    n14 = 231;
                    break;
                }
                case 228: {
                    n14 = 69;
                    break;
                }
                case 229: {
                    n14 = 255;
                    break;
                }
                case 230: {
                    n14 = 238;
                    break;
                }
                case 231: {
                    n14 = 93;
                    break;
                }
                case 232: {
                    n14 = 242;
                    break;
                }
                case 233: {
                    n14 = 164;
                    break;
                }
                case 234: {
                    n14 = 68;
                    break;
                }
                case 235: {
                    n14 = 101;
                    break;
                }
                case 236: {
                    n14 = 18;
                    break;
                }
                case 237: {
                    n14 = 245;
                    break;
                }
                case 238: {
                    n14 = 213;
                    break;
                }
                case 239: {
                    n14 = 19;
                    break;
                }
                case 240: {
                    n14 = 221;
                    break;
                }
                case 241: {
                    n14 = 76;
                    break;
                }
                case 242: {
                    n14 = 197;
                    break;
                }
                case 243: {
                    n14 = 140;
                    break;
                }
                case 244: {
                    n14 = 183;
                    break;
                }
                case 245: {
                    n14 = 144;
                    break;
                }
                case 246: {
                    n14 = 102;
                    break;
                }
                case 247: {
                    n14 = 66;
                    break;
                }
                case 248: {
                    n14 = 129;
                    break;
                }
                case 249: {
                    n14 = 80;
                    break;
                }
                case 250: {
                    n14 = 25;
                    break;
                }
                case 251: {
                    n14 = 98;
                    break;
                }
                case 252: {
                    n14 = 191;
                    break;
                }
                case 253: {
                    n14 = 132;
                    break;
                }
                case 254: {
                    n14 = 163;
                    break;
                }
                default: {
                    n14 = 60;
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
            tp_2.f[n12] = new String(cArray).intern();
        }
        return f[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A48;
        if (i[n11] == null) {
            tp_2.i[n11] = (int)(h[n11] ^ l2);
        }
        return i[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x35E0) & Short.MAX_VALUE;
        if (r[n11] == null) {
            tp_2.r[n11] = l[n11] ^ l2;
        }
        return r[n11];
    }
}

