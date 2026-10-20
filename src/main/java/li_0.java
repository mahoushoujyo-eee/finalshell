/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IllegalPacket;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.IpV4Packet;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.util.MacAddress;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from Li
 */
public class li_0 {
    public MacAddress c;
    public MacAddress F;
    Inet4Address W;
    public PcapHandle h;
    D_ f;
    String l = "";
    String Y = li_0.a(-17268, 13934);
    String U = null;
    String g = "";
    PcapNetworkInterface E;
    private final int Q = -1;
    private final int G = 1;
    private final int A = li_0.a(114, 4234654109733814218L);
    HashMap C = new HashMap();
    LinkedBlockingQueue o = new LinkedBlockingQueue();
    Random y = new Random();
    boolean j = false;
    short d;
    bh_0 Z = null;
    li_0 b = this;
    Thread q;
    boolean I = true;
    public boolean T = false;
    boolean k = false;
    public boolean s = true;
    private static String[] J;
    private static final String[] e;
    private static final String[] i;
    private static final long[] a;
    private static final Integer[] m;
    private static final long[] n;
    private static final Long[] p;

    public li_0(boolean bl, boolean bl2) {
        this.j = bl;
        this.s = bl2;
        this.Z = new bh_0(this);
    }

    public void I() throws Exception {
        block5: {
            li_0 li_02;
            block4: {
                String[] stringArray = li_0.I();
                this.R();
                L5 l5 = new L5(this);
                String[] stringArray2 = stringArray;
                try {
                    try {
                        li_02 = this;
                        if (stringArray2 != null) break block4;
                        if (li_02.j) break block5;
                    }
                    catch (Exception exception) {
                        throw li_0.a(exception);
                    }
                    this.q = new qx_0(this);
                    li_02 = this;
                }
                catch (Exception exception) {
                    throw li_0.a(exception);
                }
            }
            li_02.q.start();
        }
        bv_1 bv_12 = new bv_1(this);
        bv_12.start();
    }

    /*
     * Exception decompiling
     */
    boolean E() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 2[TRYBLOCK]
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

    PcapNetworkInterface.PromiscuousMode Z(PcapNetworkInterface pcapNetworkInterface) {
        PcapNetworkInterface.PromiscuousMode promiscuousMode = null;
        String string = (String.valueOf(pcapNetworkInterface.getDescription()) + ":" + pcapNetworkInterface.getName()).toLowerCase();
        promiscuousMode = string.contains(li_0.a(-17280, -27172)) ? PcapNetworkInterface.PromiscuousMode.NONPROMISCUOUS : PcapNetworkInterface.PromiscuousMode.PROMISCUOUS;
        return promiscuousMode;
    }

    /*
     * Exception decompiling
     */
    boolean R() throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [32[DOLOOP]], but top level block is 6[TRYBLOCK]
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
     * Unable to fully structure code
     */
    void B(Packet var1_1) {
        block41: {
            var2_2 = li_0.I();
            try {
                block42: {
                    block49: {
                        block48: {
                            block47: {
                                block46: {
                                    block45: {
                                        block43: {
                                            block44: {
                                                block50: {
                                                    block40: {
                                                        block39: {
                                                            block38: {
                                                                block36: {
                                                                    block37: {
                                                                        var3_3 = (EthernetPacket)var1_1;
                                                                        var4_5 = var3_3.getHeader();
                                                                        var5_6 = null;
                                                                        try {
                                                                            v0 = this.k;
                                                                            if (var2_2 != null) break block36;
                                                                            if (!v0) break block37;
                                                                        }
                                                                        catch (IllegalRawDataException v1) {
                                                                            throw li_0.a(v1);
                                                                        }
                                                                        var5_6 = this.v(var3_3);
                                                                        break block39;
                                                                    }
                                                                    try {
                                                                        v2 = var3_3.getPayload();
                                                                        if (var2_2 != null) break block38;
                                                                        v0 = v2 instanceof IpV4Packet;
                                                                    }
                                                                    catch (IllegalRawDataException v3) {
                                                                        throw li_0.a(v3);
                                                                    }
                                                                }
                                                                try {
                                                                    if (!v0) break block39;
                                                                    v2 = var3_3.getPayload();
                                                                }
                                                                catch (IllegalRawDataException v4) {
                                                                    throw li_0.a(v4);
                                                                }
                                                            }
                                                            var5_6 = (IpV4Packet)v2;
                                                        }
                                                        try {
                                                            v5 = var5_6;
                                                            if (var2_2 != null) break block40;
                                                            if (v5 == null) break block41;
                                                        }
                                                        catch (IllegalRawDataException v6) {
                                                            throw li_0.a(v6);
                                                        }
                                                        v5 = var5_6;
                                                    }
                                                    var6_7 = v5.getHeader();
                                                    try {
                                                        v7 = var5_6.getPayload() instanceof TcpPacket;
                                                        if (var2_2 != null) break block42;
                                                        if (v7) {
                                                        }
                                                        ** GOTO lbl138
                                                    }
                                                    catch (IllegalRawDataException v8) {
                                                        throw li_0.a(v8);
                                                    }
                                                    var7_8 = (TcpPacket)var5_6.getPayload();
                                                    var8_9 = var7_8.getHeader();
                                                    v9 = this;
                                                    if (var2_2 != null) break block50;
                                                    try {
                                                        block51: {
                                                            if (!v9.j) break block43;
                                                            break block51;
                                                            catch (IllegalRawDataException v10) {
                                                                throw li_0.a(v10);
                                                            }
                                                        }
                                                        v9 = this;
                                                    }
                                                    catch (IllegalRawDataException v11) {
                                                        throw li_0.a(v11);
                                                    }
                                                }
                                                var9_10 = v9.Z.u(var6_7.getSrcAddr().getHostAddress(), (Short)var8_9.getSrcPort().value(), (Short)var8_9.getDstPort().value());
                                                try {
                                                    v12 = var9_10;
                                                    if (var2_2 != null) break block44;
                                                    if (v12 == null) break block41;
                                                }
                                                catch (IllegalRawDataException v13) {
                                                    throw li_0.a(v13);
                                                }
                                                v12 = var9_10;
                                            }
                                            v12.P(this.b, var1_1, var4_5, var6_7, var7_8, false);
                                            if (var2_2 == null) break block41;
                                        }
                                        var9_10 = null;
                                        var9_10 = this.Z.z(var6_7.getSrcAddr().getHostAddress(), (Short)var8_9.getSrcPort().value());
                                        v14 = (Short)var8_9.getDstPort().value();
                                        if (var2_2 != null) break block45;
                                        try {
                                            block52: {
                                                if (v14 != this.d) break block41;
                                                break block52;
                                                catch (IllegalRawDataException v15) {
                                                    throw li_0.a(v15);
                                                }
                                            }
                                            v14 = (short)var8_9.getSyn();
                                        }
                                        catch (IllegalRawDataException v16) {
                                            throw li_0.a(v16);
                                        }
                                    }
                                    if (var2_2 != null) break block46;
                                    try {
                                        block53: {
                                            if (v14 == 0) break block47;
                                            break block53;
                                            catch (IllegalRawDataException v17) {
                                                throw li_0.a(v17);
                                            }
                                        }
                                        v14 = (short)var8_9.getAck();
                                    }
                                    catch (IllegalRawDataException v18) {
                                        throw li_0.a(v18);
                                    }
                                }
                                if (v14 != 0) break block47;
                                try {
                                    block54: {
                                        v19 = var9_10;
                                        if (var2_2 != null) break block48;
                                        break block54;
                                        catch (IllegalRawDataException v20) {
                                            throw li_0.a(v20);
                                        }
                                    }
                                    if (v19 != null) break block47;
                                }
                                catch (IllegalRawDataException v21) {
                                    throw li_0.a(v21);
                                }
                                var9_10 = new xx_0(this.b, var6_7.getSrcAddr(), (Short)var8_9.getSrcPort().value());
                                this.Z.p(var9_10);
                            }
                            v19 = var9_10 = this.Z.z(var6_7.getSrcAddr().getHostAddress(), (Short)var8_9.getSrcPort().value());
                        }
                        try {
                            if (var2_2 != null) break block49;
                            if (v19 == null) break block41;
                        }
                        catch (IllegalRawDataException v22) {
                            throw li_0.a(v22);
                        }
                        v19 = var9_10;
                    }
                    try {
                        v19.w(var1_1, var4_5, var6_7, var7_8, true);
                        if (var2_2 == null) break block41;
lbl138:
                        // 2 sources

                        v7 = var3_3.getPayload() instanceof IllegalPacket;
                    }
                    catch (IllegalRawDataException v23) {
                        throw li_0.a(v23);
                    }
                }
                if (v7) {
                    jy_0.g(li_0.a(-17277, -29618));
                }
            }
            catch (IllegalRawDataException var3_4) {
                var3_4.printStackTrace();
            }
        }
    }

    /*
     * Exception decompiling
     */
    void e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    IpV4Packet v(EthernetPacket ethernetPacket) throws IllegalRawDataException {
        IpV4Packet ipV4Packet;
        block12: {
            block15: {
                byte[] byArray;
                block14: {
                    int n10;
                    byte[] byArray2;
                    String[] stringArray;
                    block13: {
                        int n11;
                        block11: {
                            ipV4Packet = null;
                            stringArray = li_0.I();
                            byArray2 = ethernetPacket.getPayload().getRawData();
                            try {
                                try {
                                    try {
                                        n10 = byArray2.length;
                                        n11 = li_0.a(18125, 4065531694929852792L);
                                        if (stringArray != null) break block11;
                                        if (n10 <= n11) break block12;
                                    }
                                    catch (IllegalRawDataException illegalRawDataException) {
                                        throw li_0.a(illegalRawDataException);
                                    }
                                    n10 = byArray2[li_0.a(25837, 28280717075553114L)];
                                    if (stringArray != null) break block13;
                                }
                                catch (IllegalRawDataException illegalRawDataException) {
                                    throw li_0.a(illegalRawDataException);
                                }
                                n11 = li_0.a(26558, 7800019661343102991L);
                            }
                            catch (IllegalRawDataException illegalRawDataException) {
                                throw li_0.a(illegalRawDataException);
                            }
                        }
                        if (n10 != n11) break block12;
                        n10 = 2;
                    }
                    byte[] byArray3 = new byte[n10];
                    System.arraycopy(byArray2, 4, byArray3, 0, 2);
                    short s2 = B8.M(byArray3, 0);
                    int n12 = li_0.S(s2) - 2;
                    byArray = new byte[n12];
                    int n13 = byArray2.length - li_0.a(25837, 28280717075553114L);
                    try {
                        try {
                            W1.v[2] = byArray2[2];
                            W1.v[3] = byArray2[3];
                            if (stringArray != null) break block14;
                            if (n12 != byArray2.length - li_0.a(25837, 28280717075553114L)) break block15;
                        }
                        catch (IllegalRawDataException illegalRawDataException) {
                            throw li_0.a(illegalRawDataException);
                        }
                        System.arraycopy(byArray2, li_0.a(25837, 28280717075553114L), byArray, 0, n12);
                    }
                    catch (IllegalRawDataException illegalRawDataException) {
                        throw li_0.a(illegalRawDataException);
                    }
                }
                ipV4Packet = IpV4Packet.newPacket(byArray, 0, byArray.length);
                break block12;
            }
            jy_0.g(li_0.a(-17272, -20753));
        }
        return ipV4Packet;
    }

    /*
     * Unable to fully structure code
     */
    public static String r(byte[] var0) {
        var2_1 = new StringBuffer();
        var3_2 = 0;
        var1_3 = li_0.I();
        if (var1_3 == null) ** GOTO lbl16
        block0: while (true) {
            v0 = Integer.toHexString(var0[var3_2] & li_0.a(18642, 936627641441236844L));
            do {
                var4_4 = v0;
                var4_4 = var4_4.replaceAll(":", " ");
                if (var1_3 == null) {
                    if (var4_4.length() == 1) {
                        var4_4 = String.valueOf((char)li_0.a(2593, 1737502362660992410L)) + var4_4;
                    }
                    var2_1.append(String.valueOf(var4_4) + " ");
                }
                ++var3_2;
lbl16:
                // 2 sources

                if (var3_2 < var0.length) continue block0;
                v0 = var2_1.toString();
            } while (var1_3 != null);
            break;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public void w(String var1_1, short var2_2) throws Exception {
        block12: {
            v0 = li_0.I();
            var4_3 = (Inet4Address)Inet4Address.getByName(var1_1);
            var5_4 = new xx_0(this, var4_3, var2_2, this.F, this.c);
            this.Z.l(var5_4);
            var6_5 = false;
            var3_6 = v0;
            var7_7 = 0;
            if (var3_6 == null) ** GOTO lbl28
            block8: while (true) {
                try {
                    Thread.sleep(li_0.b(12438, 8235661184933128765L));
                }
                catch (InterruptedException var8_8) {
                    var8_8.printStackTrace();
                }
                v1 = var5_4.v;
                do {
                    block10: {
                        block13: {
                            if (var3_6 != null) break block13;
                            if (!v1) ** GOTO lbl24
                            v1 = true;
                        }
                        var6_5 = v1;
                        try {
                            if (var3_6 == null) break block10;
lbl24:
                            // 2 sources

                            ++var7_7;
                        }
                        catch (InterruptedException v2) {
                            throw li_0.a(v2);
                        }
lbl28:
                        // 2 sources

                        if (var7_7 < li_0.a(19878, 7686055020522353183L)) continue block8;
                    }
                    v3 = var6_5;
                } while (var3_6 != null);
                break;
            }
            try {
                block11: {
                    try {
                        if (!v3) break block11;
                        this.Z.E(var5_4);
                        if (var3_6 == null) break block12;
                    }
                    catch (InterruptedException v4) {
                        throw li_0.a(v4);
                    }
                }
                this.Z.M(var5_4);
                this.Z.E(null);
                throw new Exception(li_0.a(-17261, 30409));
            }
            catch (InterruptedException v5) {
                throw li_0.a(v5);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void y() throws UnknownHostException {
        var2_1 = null;
        var1_2 = li_0.I();
        try {
            var2_1 = InetAddress.getByName(li_0.a(-17273, -12320));
        }
        catch (UnknownHostException var3_3) {
            var3_3.printStackTrace();
            try {
                var2_1 = InetAddress.getByName(li_0.a(-17265, 28228));
            }
            catch (UnknownHostException var4_5) {
                var4_5.printStackTrace();
                try {
                    var2_1 = InetAddress.getByName(li_0.a(-17279, -6805));
                }
                catch (UnknownHostException var5_7) {
                    var5_7.printStackTrace();
                }
            }
        }
        try {
            if (var2_1 == null) {
                jy_0.g(li_0.a(-17269, 7579));
                return;
            }
        }
        catch (UnknownHostException v0) {
            throw li_0.a(v0);
        }
        var3_4 = li_0.a(5317, 2038973188262947703L);
        this.l = var2_1.getHostAddress();
        var4_6 = 0;
        if (var1_2 == null) ** GOTO lbl45
        do {
            try {
                QI.U.execute(new xu_0(this));
                Thread.sleep(li_0.b(6082, 7400185198242155883L));
lbl33:
                // 2 sources

                while (true) {
                    if (this.F != null) {
                        continue;
                    }
                    break;
                }
            }
            catch (Exception var5_9) {
                var5_9.printStackTrace();
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException var6_10) {
                    var6_10.printStackTrace();
                }
            }
            ++var4_6;
lbl45:
            // 2 sources

        } while (var4_6 < 5);
        ** while (var1_2 != null)
lbl47:
        // 1 sources

    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p() {
        int n10 = 0;
        boolean bl = true;
        do {
            String[] stringArray;
            if (bl && !(bl = false) && (stringArray = li_0.I()) == null) continue;
            try {
                DatagramSocket datagramSocket = new DatagramSocket();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[li_0.a(1623, 7826633246941215207L)], li_0.a(3039, 1410208639654130786L));
                datagramPacket.setAddress(InetAddress.getByName(this.Y));
                datagramPacket.setPort(li_0.a(4994, 7698246445091974200L));
                datagramSocket.send(datagramPacket);
                datagramSocket.close();
                Thread.sleep(li_0.b(6082, 7400185198242155883L));
                if (this.F != null) {
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                try {
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            ++n10;
        } while (n10 < li_0.a(25698, 3320641701648473041L));
    }

    public short f() {
        return this.d;
    }

    public void m(short s2) {
        this.d = s2;
        if (!this.j) {
            jy_0.b(li_0.a(-17278, 19352) + li_0.S(s2));
        }
    }

    public static int S(short s2) {
        return s2 & li_0.a(31153, 3624991499218781703L);
    }

    public static void K(String[] stringArray) {
        J = stringArray;
    }

    public static String[] I() {
        return J;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
                                var21 = new String[21];
                                var19_1 = 0;
                                var18_2 = "\u00ee5%\u0094/r\u008f\u0014\u009eF\u00fe5\u00e0)g\u000bx\u00104\u00d8\u00c4\u009d\u00edo\u00d9}\u0093\u00d8V\u0082\u00cc;\u00cfk\bW\u008dO\u0092J\u008aXf\t\u0090\u0004a\u0090\u00c4\u00a9\u00b1<|\u0002#>\b\u008d\u00ba\u00bfv\u0089R6\u00a5\u0003\u0015\u00c8\u00e8\u0010O)\u0088\u0083\u00e8\u00fbc|\u0093=\u00bd\u00fe<!\u008en/\u0013/gXF\u00b5\u00a2q=\u00aa\u001f\u00f3\u00e5\u00d7\u0093\u0014`9\u00e1_\u009e>\u001e\u0014\u0018\u00ceh\u00c6\u00a8*\u00e6\f\u00f5\u0014vn\u0010I\u0094\u00eb A`\u009d\u0015\u000fb\u0010\u5759\u5402\u89a2\u677e\u5909\u8d1c\u0099\u8b78\u6872\u67ad\u00d0Q\u00f1\u8b90\u7fe4r\u0005\u95fe\u5eef\u4e0c\u7bab\u00ff\u0003\u00b8Q]\r,\u00efA\u00d0\u00c19'\u0097F\u00f7\u00c6\u00fb\u00b0\u0007\u0091\u00e3X\u00a0\u00ce\u00e48\u0007\u001a\u00c2\u00ab\u009f B!8\u00d1\\!%Um\u0006\u0094\u00a9/\u0089\u0083\u00ae\u001aD$\u008c\u0092\u00a4\u00ae\u00b8\u0005\u00f6\u00c6\u00f3\u0084O\u00d0E\u0013c\u0085\u0014\f`f\u00f3a\u00f3\u0088\u00b4\u00af\u0086\u00ba\u0010^\u00db\u00e9\u00e9\u00f8\u00f8\u00c8\u00fe\u0089\u00c7Y\u0003\u00f0\u00d4\u00da\u0007\u522c\u5e13\u9614\u9096\u5913\u8dba\u00d7\u001e\u00bdi\u00ac\u0083\u00e4\u00b9u$ol\u00ae\u008d\u001f\u00a7\u00855\u00e2\u00eb\u00e5\u001d\u00f9\u00a6\u00b8\u00c7\u00dc#\u00da$\u008b\u00c7";
                                var20_3 = "\u00ee5%\u0094/r\u008f\u0014\u009eF\u00fe5\u00e0)g\u000bx\u00104\u00d8\u00c4\u009d\u00edo\u00d9}\u0093\u00d8V\u0082\u00cc;\u00cfk\bW\u008dO\u0092J\u008aXf\t\u0090\u0004a\u0090\u00c4\u00a9\u00b1<|\u0002#>\b\u008d\u00ba\u00bfv\u0089R6\u00a5\u0003\u0015\u00c8\u00e8\u0010O)\u0088\u0083\u00e8\u00fbc|\u0093=\u00bd\u00fe<!\u008en/\u0013/gXF\u00b5\u00a2q=\u00aa\u001f\u00f3\u00e5\u00d7\u0093\u0014`9\u00e1_\u009e>\u001e\u0014\u0018\u00ceh\u00c6\u00a8*\u00e6\f\u00f5\u0014vn\u0010I\u0094\u00eb A`\u009d\u0015\u000fb\u0010\u5759\u5402\u89a2\u677e\u5909\u8d1c\u0099\u8b78\u6872\u67ad\u00d0Q\u00f1\u8b90\u7fe4r\u0005\u95fe\u5eef\u4e0c\u7bab\u00ff\u0003\u00b8Q]\r,\u00efA\u00d0\u00c19'\u0097F\u00f7\u00c6\u00fb\u00b0\u0007\u0091\u00e3X\u00a0\u00ce\u00e48\u0007\u001a\u00c2\u00ab\u009f B!8\u00d1\\!%Um\u0006\u0094\u00a9/\u0089\u0083\u00ae\u001aD$\u008c\u0092\u00a4\u00ae\u00b8\u0005\u00f6\u00c6\u00f3\u0084O\u00d0E\u0013c\u0085\u0014\f`f\u00f3a\u00f3\u0088\u00b4\u00af\u0086\u00ba\u0010^\u00db\u00e9\u00e9\u00f8\u00f8\u00c8\u00fe\u0089\u00c7Y\u0003\u00f0\u00d4\u00da\u0007\u522c\u5e13\u9614\u9096\u5913\u8dba\u00d7\u001e\u00bdi\u00ac\u0083\u00e4\u00b9u$ol\u00ae\u008d\u001f\u00a7\u00855\u00e2\u00eb\u00e5\u001d\u00f9\u00a6\u00b8\u00c7\u00dc#\u00da$\u008b\u00c7".length();
                                li_0.K(null);
                                var17_4 = 17;
                                var16_5 = -1;
lbl8:
                                // 2 sources

                                while (true) {
                                    v0 = 8;
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
                                    var18_2 = "\u00c1=*\u00b4\u008c\u00a6T\u00eaB\u00f6\u00f1Dm\u000b\u00d2/\u0093g\u00abz\u00ef]]\u0090\u0015\u00fc\t53\u00a3w\u00b1\u0083\u00e1\u00ed\u0019\u00d8\u00e4\u00be\u00ef.\u00a4\u0002\u00b4!\u0089";
                                    var20_3 = "\u00c1=*\u00b4\u008c\u00a6T\u00eaB\u00f6\u00f1Dm\u000b\u00d2/\u0093g\u00abz\u00ef]]\u0090\u0015\u00fc\t53\u00a3w\u00b1\u0083\u00e1\u00ed\u0019\u00d8\u00e4\u00be\u00ef.\u00a4\u0002\u00b4!\u0089".length();
                                    var17_4 = 24;
                                    var16_5 = -1;
lbl23:
                                    // 2 sources

                                    while (true) {
                                        v0 = 79;
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
                                            v15 = 3;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 8;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 39;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 10;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 30;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 60;
                                            break;
                                        }
                                        default: {
                                            v15 = 73;
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
                        li_0.e = var21;
                        li_0.i = new String[21];
                        var8_7 = 4925468971200896039L;
                        var14_8 = new long[15];
                        var11_9 = 0;
                        var12_10 = "o\u00d7g>a\u00b8G\u00fc\u00ad\u00bbP1\fV7\u0000\u00db\u00c2\u00cb\u00db\u009f\u00c8Dm\u0097\u00e0\u00c8V[\u0092&(\u008eb\u00afES\u00ebGu7\u0003\u00b8c\u00dc\u001c\u00a5\u00df\u00c7\u0094\u00a8W\u008f\u00c1\u00e5W\u001c\u00f3\u00f4-(\u007f\u00f4v,\u00c8s|\u00ael)\u008d\u0085)\u0082\u00ca\r\u00bd\u00a5\u00ac\u0082\u00fc\u00e2IJ\u00f4\u00ee>\u007f\u0005\u00aa\u00ba\u00d9\u00f7\u008b\u00edr\f1\u00b3\u001d\u00b3\u00f6\u00ad";
                        var13_11 = "o\u00d7g>a\u00b8G\u00fc\u00ad\u00bbP1\fV7\u0000\u00db\u00c2\u00cb\u00db\u009f\u00c8Dm\u0097\u00e0\u00c8V[\u0092&(\u008eb\u00afES\u00ebGu7\u0003\u00b8c\u00dc\u001c\u00a5\u00df\u00c7\u0094\u00a8W\u008f\u00c1\u00e5W\u001c\u00f3\u00f4-(\u007f\u00f4v,\u00c8s|\u00ael)\u008d\u0085)\u0082\u00ca\r\u00bd\u00a5\u00ac\u0082\u00fc\u00e2IJ\u00f4\u00ee>\u007f\u0005\u00aa\u00ba\u00d9\u00f7\u008b\u00edr\f1\u00b3\u001d\u00b3\u00f6\u00ad".length();
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
                            var12_10 = "\u00ea\u00e8~}BI\u00eb\u00b4\u0086[S'\u009df+\u00ad";
                            var13_11 = "\u00ea\u00e8~}BI\u00eb\u00b4\u0086[S'\u009df+\u00ad".length();
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
                li_0.a = var14_8;
                li_0.m = new Integer[15];
                var0_14 = 3946130602888375247L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "\u007f\u00a4\u00b6L\u0097D\u00a6LPq\u00c5\u00da\u00eb&gP";
                var5_18 = "\u007f\u00a4\u00b6L\u0097D\u00a6LPq\u00c5\u00da\u00eb&gP".length();
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
                    var4_17 = "w=\u00a0x\u00c0\u00e4\u00e0bD\u0089\u008a\u00d6\u00ac\u001c\u00c0\u0006";
                    var5_18 = "w=\u00a0x\u00c0\u00e4\u00e0bD\u0089\u008a\u00d6\u00ac\u001c\u00c0\u0006".length();
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
        li_0.n = var6_15;
        li_0.p = new Long[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBC82) & 0xFFFF;
        if (i[n12] == null) {
            int n13;
            int n14;
            char[] cArray = e[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 217;
                    break;
                }
                case 1: {
                    n14 = 223;
                    break;
                }
                case 2: {
                    n14 = 56;
                    break;
                }
                case 3: {
                    n14 = 84;
                    break;
                }
                case 4: {
                    n14 = 236;
                    break;
                }
                case 5: {
                    n14 = 45;
                    break;
                }
                case 6: {
                    n14 = 112;
                    break;
                }
                case 7: {
                    n14 = 158;
                    break;
                }
                case 8: {
                    n14 = 124;
                    break;
                }
                case 9: {
                    n14 = 34;
                    break;
                }
                case 10: {
                    n14 = 73;
                    break;
                }
                case 11: {
                    n14 = 164;
                    break;
                }
                case 12: {
                    n14 = 160;
                    break;
                }
                case 13: {
                    n14 = 180;
                    break;
                }
                case 14: {
                    n14 = 171;
                    break;
                }
                case 15: {
                    n14 = 59;
                    break;
                }
                case 16: {
                    n14 = 8;
                    break;
                }
                case 17: {
                    n14 = 74;
                    break;
                }
                case 18: {
                    n14 = 189;
                    break;
                }
                case 19: {
                    n14 = 70;
                    break;
                }
                case 20: {
                    n14 = 2;
                    break;
                }
                case 21: {
                    n14 = 129;
                    break;
                }
                case 22: {
                    n14 = 39;
                    break;
                }
                case 23: {
                    n14 = 212;
                    break;
                }
                case 24: {
                    n14 = 218;
                    break;
                }
                case 25: {
                    n14 = 15;
                    break;
                }
                case 26: {
                    n14 = 95;
                    break;
                }
                case 27: {
                    n14 = 49;
                    break;
                }
                case 28: {
                    n14 = 77;
                    break;
                }
                case 29: {
                    n14 = 135;
                    break;
                }
                case 30: {
                    n14 = 79;
                    break;
                }
                case 31: {
                    n14 = 7;
                    break;
                }
                case 32: {
                    n14 = 123;
                    break;
                }
                case 33: {
                    n14 = 33;
                    break;
                }
                case 34: {
                    n14 = 44;
                    break;
                }
                case 35: {
                    n14 = 17;
                    break;
                }
                case 36: {
                    n14 = 254;
                    break;
                }
                case 37: {
                    n14 = 19;
                    break;
                }
                case 38: {
                    n14 = 106;
                    break;
                }
                case 39: {
                    n14 = 141;
                    break;
                }
                case 40: {
                    n14 = 175;
                    break;
                }
                case 41: {
                    n14 = 76;
                    break;
                }
                case 42: {
                    n14 = 220;
                    break;
                }
                case 43: {
                    n14 = 83;
                    break;
                }
                case 44: {
                    n14 = 196;
                    break;
                }
                case 45: {
                    n14 = 191;
                    break;
                }
                case 46: {
                    n14 = 244;
                    break;
                }
                case 47: {
                    n14 = 232;
                    break;
                }
                case 48: {
                    n14 = 237;
                    break;
                }
                case 49: {
                    n14 = 13;
                    break;
                }
                case 50: {
                    n14 = 99;
                    break;
                }
                case 51: {
                    n14 = 247;
                    break;
                }
                case 52: {
                    n14 = 143;
                    break;
                }
                case 53: {
                    n14 = 230;
                    break;
                }
                case 54: {
                    n14 = 139;
                    break;
                }
                case 55: {
                    n14 = 75;
                    break;
                }
                case 56: {
                    n14 = 157;
                    break;
                }
                case 57: {
                    n14 = 23;
                    break;
                }
                case 58: {
                    n14 = 89;
                    break;
                }
                case 59: {
                    n14 = 116;
                    break;
                }
                case 60: {
                    n14 = 78;
                    break;
                }
                case 61: {
                    n14 = 238;
                    break;
                }
                case 62: {
                    n14 = 67;
                    break;
                }
                case 63: {
                    n14 = 216;
                    break;
                }
                case 64: {
                    n14 = 29;
                    break;
                }
                case 65: {
                    n14 = 22;
                    break;
                }
                case 66: {
                    n14 = 118;
                    break;
                }
                case 67: {
                    n14 = 179;
                    break;
                }
                case 68: {
                    n14 = 30;
                    break;
                }
                case 69: {
                    n14 = 208;
                    break;
                }
                case 70: {
                    n14 = 227;
                    break;
                }
                case 71: {
                    n14 = 41;
                    break;
                }
                case 72: {
                    n14 = 121;
                    break;
                }
                case 73: {
                    n14 = 60;
                    break;
                }
                case 74: {
                    n14 = 205;
                    break;
                }
                case 75: {
                    n14 = 87;
                    break;
                }
                case 76: {
                    n14 = 181;
                    break;
                }
                case 77: {
                    n14 = 93;
                    break;
                }
                case 78: {
                    n14 = 86;
                    break;
                }
                case 79: {
                    n14 = 234;
                    break;
                }
                case 80: {
                    n14 = 150;
                    break;
                }
                case 81: {
                    n14 = 154;
                    break;
                }
                case 82: {
                    n14 = 14;
                    break;
                }
                case 83: {
                    n14 = 231;
                    break;
                }
                case 84: {
                    n14 = 31;
                    break;
                }
                case 85: {
                    n14 = 219;
                    break;
                }
                case 86: {
                    n14 = 243;
                    break;
                }
                case 87: {
                    n14 = 146;
                    break;
                }
                case 88: {
                    n14 = 250;
                    break;
                }
                case 89: {
                    n14 = 195;
                    break;
                }
                case 90: {
                    n14 = 210;
                    break;
                }
                case 91: {
                    n14 = 25;
                    break;
                }
                case 92: {
                    n14 = 177;
                    break;
                }
                case 93: {
                    n14 = 9;
                    break;
                }
                case 94: {
                    n14 = 255;
                    break;
                }
                case 95: {
                    n14 = 197;
                    break;
                }
                case 96: {
                    n14 = 26;
                    break;
                }
                case 97: {
                    n14 = 166;
                    break;
                }
                case 98: {
                    n14 = 134;
                    break;
                }
                case 99: {
                    n14 = 110;
                    break;
                }
                case 100: {
                    n14 = 194;
                    break;
                }
                case 101: {
                    n14 = 66;
                    break;
                }
                case 102: {
                    n14 = 173;
                    break;
                }
                case 103: {
                    n14 = 192;
                    break;
                }
                case 104: {
                    n14 = 228;
                    break;
                }
                case 105: {
                    n14 = 163;
                    break;
                }
                case 106: {
                    n14 = 20;
                    break;
                }
                case 107: {
                    n14 = 159;
                    break;
                }
                case 108: {
                    n14 = 111;
                    break;
                }
                case 109: {
                    n14 = 229;
                    break;
                }
                case 110: {
                    n14 = 92;
                    break;
                }
                case 111: {
                    n14 = 48;
                    break;
                }
                case 112: {
                    n14 = 90;
                    break;
                }
                case 113: {
                    n14 = 214;
                    break;
                }
                case 114: {
                    n14 = 253;
                    break;
                }
                case 115: {
                    n14 = 88;
                    break;
                }
                case 116: {
                    n14 = 102;
                    break;
                }
                case 117: {
                    n14 = 215;
                    break;
                }
                case 118: {
                    n14 = 127;
                    break;
                }
                case 119: {
                    n14 = 125;
                    break;
                }
                case 120: {
                    n14 = 105;
                    break;
                }
                case 121: {
                    n14 = 161;
                    break;
                }
                case 122: {
                    n14 = 226;
                    break;
                }
                case 123: {
                    n14 = 183;
                    break;
                }
                case 124: {
                    n14 = 103;
                    break;
                }
                case 125: {
                    n14 = 58;
                    break;
                }
                case 126: {
                    n14 = 122;
                    break;
                }
                case 127: {
                    n14 = 107;
                    break;
                }
                case 128: {
                    n14 = 242;
                    break;
                }
                case 129: {
                    n14 = 162;
                    break;
                }
                case 130: {
                    n14 = 198;
                    break;
                }
                case 131: {
                    n14 = 28;
                    break;
                }
                case 132: {
                    n14 = 64;
                    break;
                }
                case 133: {
                    n14 = 81;
                    break;
                }
                case 134: {
                    n14 = 252;
                    break;
                }
                case 135: {
                    n14 = 165;
                    break;
                }
                case 136: {
                    n14 = 206;
                    break;
                }
                case 137: {
                    n14 = 10;
                    break;
                }
                case 138: {
                    n14 = 46;
                    break;
                }
                case 139: {
                    n14 = 57;
                    break;
                }
                case 140: {
                    n14 = 190;
                    break;
                }
                case 141: {
                    n14 = 233;
                    break;
                }
                case 142: {
                    n14 = 6;
                    break;
                }
                case 143: {
                    n14 = 16;
                    break;
                }
                case 144: {
                    n14 = 53;
                    break;
                }
                case 145: {
                    n14 = 186;
                    break;
                }
                case 146: {
                    n14 = 1;
                    break;
                }
                case 147: {
                    n14 = 40;
                    break;
                }
                case 148: {
                    n14 = 178;
                    break;
                }
                case 149: {
                    n14 = 224;
                    break;
                }
                case 150: {
                    n14 = 51;
                    break;
                }
                case 151: {
                    n14 = 109;
                    break;
                }
                case 152: {
                    n14 = 97;
                    break;
                }
                case 153: {
                    n14 = 37;
                    break;
                }
                case 154: {
                    n14 = 153;
                    break;
                }
                case 155: {
                    n14 = 113;
                    break;
                }
                case 156: {
                    n14 = 24;
                    break;
                }
                case 157: {
                    n14 = 47;
                    break;
                }
                case 158: {
                    n14 = 251;
                    break;
                }
                case 159: {
                    n14 = 52;
                    break;
                }
                case 160: {
                    n14 = 132;
                    break;
                }
                case 161: {
                    n14 = 240;
                    break;
                }
                case 162: {
                    n14 = 222;
                    break;
                }
                case 163: {
                    n14 = 188;
                    break;
                }
                case 164: {
                    n14 = 133;
                    break;
                }
                case 165: {
                    n14 = 27;
                    break;
                }
                case 166: {
                    n14 = 0;
                    break;
                }
                case 167: {
                    n14 = 115;
                    break;
                }
                case 168: {
                    n14 = 168;
                    break;
                }
                case 169: {
                    n14 = 21;
                    break;
                }
                case 170: {
                    n14 = 221;
                    break;
                }
                case 171: {
                    n14 = 202;
                    break;
                }
                case 172: {
                    n14 = 119;
                    break;
                }
                case 173: {
                    n14 = 147;
                    break;
                }
                case 174: {
                    n14 = 169;
                    break;
                }
                case 175: {
                    n14 = 120;
                    break;
                }
                case 176: {
                    n14 = 36;
                    break;
                }
                case 177: {
                    n14 = 43;
                    break;
                }
                case 178: {
                    n14 = 138;
                    break;
                }
                case 179: {
                    n14 = 104;
                    break;
                }
                case 180: {
                    n14 = 4;
                    break;
                }
                case 181: {
                    n14 = 38;
                    break;
                }
                case 182: {
                    n14 = 156;
                    break;
                }
                case 183: {
                    n14 = 117;
                    break;
                }
                case 184: {
                    n14 = 85;
                    break;
                }
                case 185: {
                    n14 = 245;
                    break;
                }
                case 186: {
                    n14 = 94;
                    break;
                }
                case 187: {
                    n14 = 12;
                    break;
                }
                case 188: {
                    n14 = 18;
                    break;
                }
                case 189: {
                    n14 = 211;
                    break;
                }
                case 190: {
                    n14 = 246;
                    break;
                }
                case 191: {
                    n14 = 80;
                    break;
                }
                case 192: {
                    n14 = 155;
                    break;
                }
                case 193: {
                    n14 = 62;
                    break;
                }
                case 194: {
                    n14 = 213;
                    break;
                }
                case 195: {
                    n14 = 136;
                    break;
                }
                case 196: {
                    n14 = 151;
                    break;
                }
                case 197: {
                    n14 = 248;
                    break;
                }
                case 198: {
                    n14 = 201;
                    break;
                }
                case 199: {
                    n14 = 130;
                    break;
                }
                case 200: {
                    n14 = 128;
                    break;
                }
                case 201: {
                    n14 = 42;
                    break;
                }
                case 202: {
                    n14 = 98;
                    break;
                }
                case 203: {
                    n14 = 249;
                    break;
                }
                case 204: {
                    n14 = 65;
                    break;
                }
                case 205: {
                    n14 = 114;
                    break;
                }
                case 206: {
                    n14 = 50;
                    break;
                }
                case 207: {
                    n14 = 131;
                    break;
                }
                case 208: {
                    n14 = 149;
                    break;
                }
                case 209: {
                    n14 = 174;
                    break;
                }
                case 210: {
                    n14 = 152;
                    break;
                }
                case 211: {
                    n14 = 100;
                    break;
                }
                case 212: {
                    n14 = 193;
                    break;
                }
                case 213: {
                    n14 = 204;
                    break;
                }
                case 214: {
                    n14 = 176;
                    break;
                }
                case 215: {
                    n14 = 96;
                    break;
                }
                case 216: {
                    n14 = 142;
                    break;
                }
                case 217: {
                    n14 = 61;
                    break;
                }
                case 218: {
                    n14 = 225;
                    break;
                }
                case 219: {
                    n14 = 209;
                    break;
                }
                case 220: {
                    n14 = 172;
                    break;
                }
                case 221: {
                    n14 = 72;
                    break;
                }
                case 222: {
                    n14 = 54;
                    break;
                }
                case 223: {
                    n14 = 199;
                    break;
                }
                case 224: {
                    n14 = 170;
                    break;
                }
                case 225: {
                    n14 = 3;
                    break;
                }
                case 226: {
                    n14 = 68;
                    break;
                }
                case 227: {
                    n14 = 187;
                    break;
                }
                case 228: {
                    n14 = 241;
                    break;
                }
                case 229: {
                    n14 = 239;
                    break;
                }
                case 230: {
                    n14 = 91;
                    break;
                }
                case 231: {
                    n14 = 182;
                    break;
                }
                case 232: {
                    n14 = 200;
                    break;
                }
                case 233: {
                    n14 = 144;
                    break;
                }
                case 234: {
                    n14 = 11;
                    break;
                }
                case 235: {
                    n14 = 71;
                    break;
                }
                case 236: {
                    n14 = 145;
                    break;
                }
                case 237: {
                    n14 = 167;
                    break;
                }
                case 238: {
                    n14 = 137;
                    break;
                }
                case 239: {
                    n14 = 203;
                    break;
                }
                case 240: {
                    n14 = 32;
                    break;
                }
                case 241: {
                    n14 = 82;
                    break;
                }
                case 242: {
                    n14 = 140;
                    break;
                }
                case 243: {
                    n14 = 63;
                    break;
                }
                case 244: {
                    n14 = 69;
                    break;
                }
                case 245: {
                    n14 = 101;
                    break;
                }
                case 246: {
                    n14 = 35;
                    break;
                }
                case 247: {
                    n14 = 185;
                    break;
                }
                case 248: {
                    n14 = 108;
                    break;
                }
                case 249: {
                    n14 = 126;
                    break;
                }
                case 250: {
                    n14 = 235;
                    break;
                }
                case 251: {
                    n14 = 148;
                    break;
                }
                case 252: {
                    n14 = 184;
                    break;
                }
                case 253: {
                    n14 = 207;
                    break;
                }
                case 254: {
                    n14 = 5;
                    break;
                }
                default: {
                    n14 = 55;
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
            li_0.i[n12] = new String(cArray).intern();
        }
        return i[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7FB3;
        if (m[n11] == null) {
            li_0.m[n11] = (int)(a[n11] ^ l2);
        }
        return m[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x5AA8) & Short.MAX_VALUE;
        if (p[n11] == null) {
            li_0.p[n11] = n[n11] ^ l2;
        }
        return p[n11];
    }
}

