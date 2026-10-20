/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.ArpPacket;
import org.pcap4j.packet.EthernetPacket;
import org.pcap4j.packet.IcmpV6CommonPacket;
import org.pcap4j.packet.IcmpV6NeighborSolicitationPacket;
import org.pcap4j.packet.IpV6NeighborDiscoverySourceLinkLayerAddressOption;
import org.pcap4j.packet.IpV6Packet;
import org.pcap4j.packet.IpV6SimpleFlowLabel;
import org.pcap4j.packet.IpV6SimpleTrafficClass;
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.namednumber.ArpHardwareType;
import org.pcap4j.packet.namednumber.ArpOperation;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IcmpV6Code;
import org.pcap4j.packet.namednumber.IcmpV6Type;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.util.LinkLayerAddress;
import org.pcap4j.util.MacAddress;

/*
 * Renamed from u
 */
public class u_0 {
    private List C;
    private Map V;
    private byte[] Y;
    private byte[] j;
    private boolean B;
    private Throwable x;
    private int U;
    private int e;
    private int a;
    private ScheduledExecutorService p;
    private int E;
    private int s;
    private int J;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] f;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[25];
                        var11_1 = 0;
                        var10_2 = "c#ZS;;\u00d8\u00ce\u00f1\u008a\u00e0w\u00e4\u00fd\u00be\u0019\u000b#\u000f\u00fe\u00ed\u0094\u00d89\u00e4\u00ddn\u00b1\u00b3\u0095JU\u00d3$\u00b7\u00db\u00c0Lh\u00d8\u00b2\u00b2\u00bc\u0005I\u0082\u00de\u00d0RZy?\u0012\u00d8.E\u00d6\u00a0\u00cck\u0089\u001e\u009eoC\u00d3\u00a2@#\u0095\u0011\r\u0086l1&\u00da\u00ab\u00f8\nW\u00a2\u00f3\u00ea[\u00f4C\u00eb\u000f8fy\u000b\u0005\u009c9J}m\u0096y1\u00c3u\u0018\u0017\u0081\u0012Y\u00a8\u0086IY\u001f\u0015x$|\u0000 \u00f9\u00d5\u00fdA\u00ad\u000fa\u00a1\u00856\u00d5\u0001J\u0093\u00a3Cc\u00c1]4\u009b/\u0097\u00d7Z34\u0086d\u00b8\u008a\u00b2\u0016\u00c0EbL\u00ecq\u0092\u0010\u00e2\u00894Z\u0002\u00c8\u008c\u00f8rXj\u001f\u00f4\u00c5d\u000bsy\u00f5\n\u00da\u00fe\u00dd\u001d\u0082;\u00c6(\u0084?\u00ac|\u00c2\u00e8\u0099\u00fe\u0005\u0081\u00a3\f\u00beVm^\u00e4]7K\u001c\u00c4~Q\u0003>\u00fa\u0003\u008b\u00cd\u0097Zw\u001b'\u00ca\u0014\u00bf\u00aet\u00ea\u0081\u0001\u00cd\u00d3<\u0007\u000e\u0098\u00a3\u00048\u00ee\u0005\u00b5i\r\u00efP\u00cc5\\\u00c5\u0015\u00c9\u00df\u008f\u008e?\u00b6r5G\u00a9\u001b\u000b\u0019f/\u001d\ty\u0097{\u00db8\u0019p}\u00ef}\t\u009f\u00c8\u00017^E\u00f7Od.\u00ee(J\u00f2\u0018\u0010\u00e4kU\u0094\u00bdQ[\u001e\u00af\u00a4~\u00ac\u0010\u00d1\u00d3=\u000f\u00be\u00d1\u00b2cI\u0087\u0010\u0092\u00f9\u000f\u00c5\u00fe\u0086\u00bc\u00cb\n\u009b\"?\u00ca\u00cb\u00acK\u0095c\u0019\u00cet\u00d6R;\u001b&\u00d7~=\u009c\u00d3\u00cae\u00b2\u0096=Q\u00c3\u009bU;\u00f7;\u009d\u00cb\u00d2\u00fe\u00dde|\u00ff\u00fb\u00a6`?6\u008cE\u00f5\u0019\u0093{:'\u008b\u0098:\t\u00c9\u00e3Y}.\u0080N'\u00ba\u0094\u00cd\u00ef7\u00b1\u000f%S\u00ee\u0011\u0010\u00e2\u00c80v*?\u0084\u00ea\u0092e4\u001a\u00f6\r\u009f\u0019\u000b)\u0006\u0090\u00e51\u0007\u00f3\u0088\u008c\u00c9\u00df\u00bb\u000bd>\"\u00c0\u00b4\u00c9f\u0017\u00d2\u0094?\u00f7Ld\u00e4\u00f8\u00d9M\u0002\u00ddd\u0084\u00ff\u00d5N\u00de}$J;\u0090\u00966\n\u0012\u0099\u00df\u00d4\tZ(\r\u00a5\u00d66\u00bb\u0010- \u00f4\u00e8,\u00b3\u0082\u0086\u0096!\u001e\u001b@\u0006mk7\u0000\u0092E\u0000\u0091t\u0016\u00b0\u00b6n\u00c5,\u00ae4\u0091\u0098\tj\u00f3l\u0093\u0016\u00d2\u00ab$\u00a7FD\u0093\u00f3\u00c1\u00ccv\u001b>\r\u0098\f\u00f4\u0011PD\u00c5\u00d5]\u0082\u00e0\u0001\u0093\u0011\u0011\u00c0>#.\u00b9\u00d5\u00c8\u0004\u00f0\u0090\u00b5\u00a6\u00d8<3\u00b9\u0016B#\u00dc\u0018X$c\u00ba\u00a9nE\u00bd~\r`\u00ed\u008dO\u0006\u00bc.\u00ce\u001b\u00cbg\u00ef\u00a3\u00a1N\bRV-\u000bFW\u0096\u00e9\u00ee\u00f7\bF\u00cc\u00eaj\u00d44\u0088\u00cb\u008b&b\u001e\u00c4r\u0080\u007f\u00b2AJ\u0099\u00c0\u00b0/Q\u0084A@\u0018\u00c1\u00f12@\u00e54[\u001c\u00ad\u00f4(\u00eb\u009f\u008d$\u00cb\u0004\u00ed\u0084'\u0018y\r\u0004t\u001e |\u00ade\u00e6r\u00fe\u00b9_\u00be\u00ac\u00ef\u0010\u00f8\u00e5h<p\u00f0\u0013\u0089\u0092\u00d82\u0019\u00b9\u0083\u00e7\u0013\u0090@\u00d8\u00a2uv\u00a1|\u008d,\u00153o\u00a3\u0080\u00ee4\u00b5\u00e0{\f_\u00ae\u0013\u00c6@~\u00d4\u00cf\u00f4c\u00c1\u001a\u00de?\u00f7\u0016?\u00cf\u00e5\u0085=\u008e<F\u00b1c;\rU\u0095\u00e4\u009c\u00f2\u00b1@\u00c1\u00ddk\u001boQ{e3\u0096ZI\u001cNB*~\u001b\u00cc_S>\u00d2\nx\u00b2\u0086/\u00c2\u00a8\u00c2";
                        var12_3 = "c#ZS;;\u00d8\u00ce\u00f1\u008a\u00e0w\u00e4\u00fd\u00be\u0019\u000b#\u000f\u00fe\u00ed\u0094\u00d89\u00e4\u00ddn\u00b1\u00b3\u0095JU\u00d3$\u00b7\u00db\u00c0Lh\u00d8\u00b2\u00b2\u00bc\u0005I\u0082\u00de\u00d0RZy?\u0012\u00d8.E\u00d6\u00a0\u00cck\u0089\u001e\u009eoC\u00d3\u00a2@#\u0095\u0011\r\u0086l1&\u00da\u00ab\u00f8\nW\u00a2\u00f3\u00ea[\u00f4C\u00eb\u000f8fy\u000b\u0005\u009c9J}m\u0096y1\u00c3u\u0018\u0017\u0081\u0012Y\u00a8\u0086IY\u001f\u0015x$|\u0000 \u00f9\u00d5\u00fdA\u00ad\u000fa\u00a1\u00856\u00d5\u0001J\u0093\u00a3Cc\u00c1]4\u009b/\u0097\u00d7Z34\u0086d\u00b8\u008a\u00b2\u0016\u00c0EbL\u00ecq\u0092\u0010\u00e2\u00894Z\u0002\u00c8\u008c\u00f8rXj\u001f\u00f4\u00c5d\u000bsy\u00f5\n\u00da\u00fe\u00dd\u001d\u0082;\u00c6(\u0084?\u00ac|\u00c2\u00e8\u0099\u00fe\u0005\u0081\u00a3\f\u00beVm^\u00e4]7K\u001c\u00c4~Q\u0003>\u00fa\u0003\u008b\u00cd\u0097Zw\u001b'\u00ca\u0014\u00bf\u00aet\u00ea\u0081\u0001\u00cd\u00d3<\u0007\u000e\u0098\u00a3\u00048\u00ee\u0005\u00b5i\r\u00efP\u00cc5\\\u00c5\u0015\u00c9\u00df\u008f\u008e?\u00b6r5G\u00a9\u001b\u000b\u0019f/\u001d\ty\u0097{\u00db8\u0019p}\u00ef}\t\u009f\u00c8\u00017^E\u00f7Od.\u00ee(J\u00f2\u0018\u0010\u00e4kU\u0094\u00bdQ[\u001e\u00af\u00a4~\u00ac\u0010\u00d1\u00d3=\u000f\u00be\u00d1\u00b2cI\u0087\u0010\u0092\u00f9\u000f\u00c5\u00fe\u0086\u00bc\u00cb\n\u009b\"?\u00ca\u00cb\u00acK\u0095c\u0019\u00cet\u00d6R;\u001b&\u00d7~=\u009c\u00d3\u00cae\u00b2\u0096=Q\u00c3\u009bU;\u00f7;\u009d\u00cb\u00d2\u00fe\u00dde|\u00ff\u00fb\u00a6`?6\u008cE\u00f5\u0019\u0093{:'\u008b\u0098:\t\u00c9\u00e3Y}.\u0080N'\u00ba\u0094\u00cd\u00ef7\u00b1\u000f%S\u00ee\u0011\u0010\u00e2\u00c80v*?\u0084\u00ea\u0092e4\u001a\u00f6\r\u009f\u0019\u000b)\u0006\u0090\u00e51\u0007\u00f3\u0088\u008c\u00c9\u00df\u00bb\u000bd>\"\u00c0\u00b4\u00c9f\u0017\u00d2\u0094?\u00f7Ld\u00e4\u00f8\u00d9M\u0002\u00ddd\u0084\u00ff\u00d5N\u00de}$J;\u0090\u00966\n\u0012\u0099\u00df\u00d4\tZ(\r\u00a5\u00d66\u00bb\u0010- \u00f4\u00e8,\u00b3\u0082\u0086\u0096!\u001e\u001b@\u0006mk7\u0000\u0092E\u0000\u0091t\u0016\u00b0\u00b6n\u00c5,\u00ae4\u0091\u0098\tj\u00f3l\u0093\u0016\u00d2\u00ab$\u00a7FD\u0093\u00f3\u00c1\u00ccv\u001b>\r\u0098\f\u00f4\u0011PD\u00c5\u00d5]\u0082\u00e0\u0001\u0093\u0011\u0011\u00c0>#.\u00b9\u00d5\u00c8\u0004\u00f0\u0090\u00b5\u00a6\u00d8<3\u00b9\u0016B#\u00dc\u0018X$c\u00ba\u00a9nE\u00bd~\r`\u00ed\u008dO\u0006\u00bc.\u00ce\u001b\u00cbg\u00ef\u00a3\u00a1N\bRV-\u000bFW\u0096\u00e9\u00ee\u00f7\bF\u00cc\u00eaj\u00d44\u0088\u00cb\u008b&b\u001e\u00c4r\u0080\u007f\u00b2AJ\u0099\u00c0\u00b0/Q\u0084A@\u0018\u00c1\u00f12@\u00e54[\u001c\u00ad\u00f4(\u00eb\u009f\u008d$\u00cb\u0004\u00ed\u0084'\u0018y\r\u0004t\u001e |\u00ade\u00e6r\u00fe\u00b9_\u00be\u00ac\u00ef\u0010\u00f8\u00e5h<p\u00f0\u0013\u0089\u0092\u00d82\u0019\u00b9\u0083\u00e7\u0013\u0090@\u00d8\u00a2uv\u00a1|\u008d,\u00153o\u00a3\u0080\u00ee4\u00b5\u00e0{\f_\u00ae\u0013\u00c6@~\u00d4\u00cf\u00f4c\u00c1\u001a\u00de?\u00f7\u0016?\u00cf\u00e5\u0085=\u008e<F\u00b1c;\rU\u0095\u00e4\u009c\u00f2\u00b1@\u00c1\u00ddk\u001boQ{e3\u0096ZI\u001cNB*~\u001b\u00cc_S>\u00d2\nx\u00b2\u0086/\u00c2\u00a8\u00c2".length();
                        var9_4 = 33;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 89;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
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
                            var10_2 = "\u00d9\u000bj\u00d8K\u00f9\u00c4\u00c4\u0098d\u00a69\u00c7X\u0092\u0082\u0016g\u00b0|=\u0013\rZ]Fv\u000e\u00fc\u0084\u00d3\u001d\u009b_!\u0098";
                            var12_3 = "\u00d9\u000bj\u00d8K\u00f9\u00c4\u00c4\u0098d\u00a69\u00c7X\u0092\u0082\u0016g\u00b0|=\u0013\rZ]Fv\u000e\u00fc\u0084\u00d3\u001d\u009b_!\u0098".length();
                            var9_4 = 22;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 21;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
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
                            break block27;
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
                                    v15 = 59;
                                    break;
                                }
                                case 1: {
                                    v15 = 18;
                                    break;
                                }
                                case 2: {
                                    v15 = 102;
                                    break;
                                }
                                case 3: {
                                    v15 = 109;
                                    break;
                                }
                                case 4: {
                                    v15 = 25;
                                    break;
                                }
                                case 5: {
                                    v15 = 109;
                                    break;
                                }
                                default: {
                                    v15 = 114;
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
                u_0.b = var13;
                u_0.c = new String[25];
                var0_7 = 5972232820219678140L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "\u00d7o\u00dd\u00dc\u0083\u00cc\u00d7\u0093\u00b0.\u001b\u00b3J\u00f4\u008c\u00e4X\u009a\u00d4RO\u00ca\u00af\n \u0098\u001b\u0084\u00f6yV8\u00fa\u00ab\u008cs\u00b6ST\u00e5l\u00b4\u000e\u00a9\u00fdK\u00c0foc\rc\u008f$_\u00b5";
                var5_11 = "\u00d7o\u00dd\u00dc\u0083\u00cc\u00d7\u0093\u00b0.\u001b\u00b3J\u00f4\u008c\u00e4X\u009a\u00d4RO\u00ca\u00af\n \u0098\u001b\u0084\u00f6yV8\u00fa\u00ab\u008cs\u00b6ST\u00e5l\u00b4\u000e\u00a9\u00fdK\u00c0foc\rc\u008f$_\u00b5".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c9\u009b\u0097<V<\u00ca2\u00e7\u00cc/\u009e\u0083\u0082h\f";
                    var5_11 = "\u00c9\u009b\u0097<V<\u00ca2\u00e7\u00cc/\u009e\u0083\u0082h\f".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
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
        u_0.d = var6_8;
        u_0.f = new Integer[9];
        var15_14 = "org.pcap4j.core.pcapLibName";
        var16_15 = "org.pcap4j.core.packetLibName";
    }

    /*
     * Exception decompiling
     */
    private u_0() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    public static u_0 K() {
        return o1_0.V;
    }

    public List k() {
        u_0 u_02;
        block4: {
            block5: {
                String[] stringArray = xQ.B();
                try {
                    try {
                        u_02 = this;
                        if (stringArray == null) break block4;
                        if (u_02.B) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw u_0.a(illegalStateException);
                    }
                    throw new IllegalStateException("Fail to init component", this.x);
                }
                catch (IllegalStateException illegalStateException) {
                    throw u_0.a(illegalStateException);
                }
            }
            u_02 = this;
        }
        return u_02.C;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MacAddress E(InetAddress inetAddress) {
        u_0 u_02;
        boolean bl;
        block14: {
            String[] stringArray;
            block15: {
                stringArray = xQ.B();
                try {
                    if (inetAddress == null) {
                        throw new IllegalArgumentException("Address is null");
                    }
                }
                catch (Exception exception) {
                    throw u_0.a(exception);
                }
                bl = this.B;
                if (stringArray == null) break block14;
                try {
                    if (bl) break block15;
                    throw new IllegalStateException("Fail to init component", this.x);
                    catch (Exception exception) {
                        throw u_0.a(exception);
                    }
                }
                catch (Exception exception) {
                    throw u_0.a(exception);
                }
            }
            try {
                u_02 = this;
                if (stringArray == null) return u_02.M(inetAddress);
                bl = u_02.V.containsKey(inetAddress);
            }
            catch (Exception exception) {
                throw u_0.a(exception);
            }
        }
        try {
            if (bl) {
                return (MacAddress)this.V.get(inetAddress);
            }
        }
        catch (Exception exception) {
            throw u_0.a(exception);
        }
        try {
            u_02 = this;
            return u_02.M(inetAddress);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public void i() {
        block5: {
            ScheduledExecutorService scheduledExecutorService;
            block4: {
                String[] stringArray = xQ.B();
                try {
                    try {
                        scheduledExecutorService = this.p;
                        if (stringArray == null) break block4;
                        if (scheduledExecutorService == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw u_0.a(illegalStateException);
                    }
                    scheduledExecutorService = this.p;
                }
                catch (IllegalStateException illegalStateException) {
                    throw u_0.a(illegalStateException);
                }
            }
            scheduledExecutorService.shutdown();
        }
    }

    /*
     * Loose catch block
     */
    private MacAddress M(InetAddress inetAddress) throws PcapNativeException, NotOpenException, InterruptedException, UnknownHostException {
        EthernetPacket ethernetPacket;
        Future<?> future;
        Object object;
        jq_0 jq_02;
        block15: {
            block16: {
                jq_02 = this.G(inetAddress);
                String[] stringArray = xQ.B();
                object = jq_02.G;
                if (stringArray == null) break block15;
                try {
                    block17: {
                        if (object != null) break block16;
                        break block17;
                        catch (BrokenBarrierException brokenBarrierException) {
                            throw u_0.a(brokenBarrierException);
                        }
                    }
                    throw new IllegalStateException("Can't find interface for address " + String.valueOf(inetAddress));
                }
                catch (BrokenBarrierException brokenBarrierException) {
                    throw u_0.a(brokenBarrierException);
                }
            }
            object = jq_02.G.getLinkLayerAddresses().get(0);
        }
        MacAddress macAddress = MacAddress.getByAddress(((LinkLayerAddress)object).getAddress());
        InetAddress inetAddress2 = jq_02.D;
        PcapHandle pcapHandle = null;
        PcapHandle pcapHandle2 = null;
        AtomicReference atomicReference = new AtomicReference();
        boolean bl = inetAddress instanceof Inet4Address;
        try {
            EthernetPacket.Builder builder;
            String string;
            pcapHandle = jq_02.G.openLive(this.s, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, this.U);
            try {
                string = bl ? this.e(inetAddress, macAddress, inetAddress2) : this.S((Inet6Address)inetAddress, macAddress, (Inet6Address)inetAddress2);
            }
            catch (BrokenBarrierException brokenBarrierException) {
                throw u_0.a(brokenBarrierException);
            }
            String string2 = string;
            System.out.println("receive filter set filter=" + string2);
            pcapHandle.setFilter(string2, BpfProgram.BpfCompileMode.OPTIMIZE);
            pcapHandle2 = jq_02.G.openLive(this.s, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, this.U);
            PacketListener packetListener = arg_0 -> u_0.lambda$0(bl, atomicReference, arg_0);
            CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
            BP bP = new BP(this, pcapHandle, packetListener, cyclicBarrier);
            future = this.p.submit(bP);
            try {
                builder = bl ? this.Q(inetAddress, macAddress, inetAddress2) : this.u((Inet6Address)inetAddress, macAddress, (Inet6Address)inetAddress2);
            }
            catch (BrokenBarrierException brokenBarrierException) {
                throw u_0.a(brokenBarrierException);
            }
            EthernetPacket.Builder builder2 = builder;
            ethernetPacket = builder2.build();
            try {
                cyclicBarrier.await(this.a, TimeUnit.MILLISECONDS);
            }
            catch (BrokenBarrierException | TimeoutException exception) {
                exception.printStackTrace();
                MacAddress macAddress2 = (MacAddress)atomicReference.get();
                this.x(pcapHandle);
                this.x(pcapHandle2);
                return macAddress2;
            }
        }
        catch (Throwable throwable) {
            this.x(pcapHandle);
            this.x(pcapHandle2);
            throw throwable;
        }
        pcapHandle2.sendPacket(ethernetPacket);
        try {
            future.get(this.e, TimeUnit.MILLISECONDS);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        MacAddress macAddress3 = (MacAddress)atomicReference.get();
        this.x(pcapHandle);
        this.x(pcapHandle2);
        return macAddress3;
    }

    private String e(InetAddress inetAddress, MacAddress macAddress, InetAddress inetAddress2) {
        return String.format("arp and src host %s and dst host %s and ether dst %s", inetAddress.getHostAddress(), inetAddress2.getHostAddress(), Pcaps.toBpfString(macAddress));
    }

    private String k(String string) {
        int n10 = string.indexOf("%");
        try {
            if (n10 > 0) {
                return string.substring(0, n10);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw u_0.a(illegalStateException);
        }
        return string;
    }

    private String S(Inet6Address inet6Address, MacAddress macAddress, Inet6Address inet6Address2) {
        return String.format("icmp6 and src host %s and dst host %s and ether dst %s", this.k(inet6Address.getHostAddress()), this.k(inet6Address2.getHostAddress()), Pcaps.toBpfString(macAddress));
    }

    private EthernetPacket.Builder Q(InetAddress inetAddress, MacAddress macAddress, InetAddress inetAddress2) {
        ArpPacket.Builder builder = new ArpPacket.Builder();
        builder.hardwareType(ArpHardwareType.ETHERNET).protocolType(EtherType.IPV4).hardwareAddrLength((byte)u_0.a(11784, 5997725270068648489L)).protocolAddrLength((byte)4).srcHardwareAddr(macAddress).srcProtocolAddr(inetAddress2).dstHardwareAddr(MacAddress.ETHER_BROADCAST_ADDRESS).operation(ArpOperation.REQUEST).dstProtocolAddr(inetAddress);
        EthernetPacket.Builder builder2 = new EthernetPacket.Builder();
        builder2.dstAddr(MacAddress.ETHER_BROADCAST_ADDRESS).srcAddr(macAddress).type(EtherType.ARP).payloadBuilder(builder).paddingAtBuild(true);
        return builder2;
    }

    private EthernetPacket.Builder u(Inet6Address inet6Address, MacAddress macAddress, Inet6Address inet6Address2) throws UnknownHostException {
        MacAddress macAddress2 = this.I(inet6Address);
        Inet6Address inet6Address3 = this.y(inet6Address);
        IcmpV6NeighborSolicitationPacket.Builder builder = new IcmpV6NeighborSolicitationPacket.Builder();
        builder.targetAddress(inet6Address);
        builder.reserved(0);
        IpV6NeighborDiscoverySourceLinkLayerAddressOption.Builder builder2 = new IpV6NeighborDiscoverySourceLinkLayerAddressOption.Builder();
        IpV6NeighborDiscoverySourceLinkLayerAddressOption ipV6NeighborDiscoverySourceLinkLayerAddressOption = builder2.linkLayerAddress(macAddress.getAddress()).correctLengthAtBuild(true).build();
        ArrayList<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption> arrayList = new ArrayList<IcmpV6CommonPacket.IpV6NeighborDiscoveryOption>();
        arrayList.add(ipV6NeighborDiscoverySourceLinkLayerAddressOption);
        builder.options(arrayList);
        IcmpV6CommonPacket.Builder builder3 = new IcmpV6CommonPacket.Builder();
        builder3.type(IcmpV6Type.NEIGHBOR_SOLICITATION).code(IcmpV6Code.NO_CODE).srcAddr(inet6Address2).dstAddr(inet6Address3).payloadBuilder(builder).correctChecksumAtBuild(true);
        IpV6Packet.Builder builder4 = new IpV6Packet.Builder();
        builder4.version(IpVersion.IPV6).trafficClass(IpV6SimpleTrafficClass.newInstance((byte)u_0.a(13242, 8643722369097222044L))).flowLabel(IpV6SimpleFlowLabel.newInstance(0)).nextHeader(IpNumber.ICMPV6).hopLimit((byte)-1).srcAddr(inet6Address2).dstAddr(inet6Address3).correctLengthAtBuild(true).payloadBuilder(builder3);
        EthernetPacket.Builder builder5 = new EthernetPacket.Builder();
        builder5.dstAddr(macAddress2).srcAddr(macAddress).type(EtherType.IPV6).payloadBuilder(builder4).paddingAtBuild(true);
        return builder5;
    }

    /*
     * Unable to fully structure code
     */
    private void x(PcapHandle var1_1) {
        block7: {
            var2_2 = xQ.B();
            try {
                v0 = var1_1;
                if (var2_2 != null) {
                    if (v0 == null) break block7;
                }
                ** GOTO lbl12
            }
            catch (Exception v1) {
                throw u_0.a(v1);
            }
            try {
                v0 = var1_1;
lbl12:
                // 2 sources

                v0.breakLoop();
            }
            catch (Exception var3_3) {
                // empty catch block
            }
            try {
                var1_1.close();
            }
            catch (Exception var3_4) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private jq_0 G(InetAddress var1_1) {
        var3_2 = u_0.a(22165, 7215053323703231158L);
        var2_3 = xQ.B();
        var4_4 = new jq_0(this);
        var5_5 = var1_1.getAddress();
        var7_6 = this.C.iterator();
        try {
            if (var2_3 == null) {
                while (true) {
                    v0 = var7_6;
                    if (var2_3 == null) continue;
                    break;
                }
            }
            ** GOTO lbl68
        }
        catch (IllegalStateException v1) {
            throw u_0.a(v1);
        }
        v2 /* !! */  = v0.next();
        do {
            block22: {
                if ((var8_8 = (var6_7 = (PcapNetworkInterface)v2 /* !! */ ).getAddresses()) == null) break block22;
                var10_10 = var8_8.iterator();
                if (var2_3 != null) ** GOTO lbl65
                do {
                    block21: {
                        if (this.F(var1_1, (var9_9 = var10_10.next()).getAddress()) || var2_3 == null) {
                            block19: {
                                var11_11 = var9_9.getNetmask();
                                try {
                                    block20: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v3 = var11_11;
                                                        if (var2_3 == null) break block19;
                                                        if (v3 == null) break block20;
                                                    }
                                                    catch (IllegalStateException v4) {
                                                        throw u_0.a(v4);
                                                    }
                                                    v3 = var1_1;
                                                    if (var2_3 == null) break block19;
                                                }
                                                catch (IllegalStateException v5) {
                                                    throw u_0.a(v5);
                                                }
                                                if (u_0.U(v3, var9_9.getAddress(), var11_11)) break block20;
                                            }
                                            catch (IllegalStateException v6) {
                                                throw u_0.a(v6);
                                            }
                                            if (var2_3 != null) break block21;
                                        }
                                        catch (IllegalStateException v7) {
                                            throw u_0.a(v7);
                                        }
                                    }
                                    v3 = var9_9.getAddress();
                                }
                                catch (IllegalStateException v8) {
                                    throw u_0.a(v8);
                                }
                            }
                            var12_12 = v3.getAddress();
                            var13_13 = this.f(var5_5, var12_12);
                            try {
                                v9 = var13_13;
                                if (var2_3 == null) continue;
                                if (v9 <= var3_2) break block21;
                            }
                            catch (IllegalStateException v10) {
                                throw u_0.a(v10);
                            }
                            var4_4.G = var6_7;
                            var4_4.D = var9_9.getAddress();
                            var3_2 = var13_13;
                        }
                    }
                    v9 = var10_10.hasNext();
                } while (v9 != 0);
            }
            v0 = var7_6;
            if (v0.hasNext()) ** continue;
            v2 /* !! */  = var4_4;
        } while (var2_3 == null);
        return v2 /* !! */ ;
    }

    private boolean F(InetAddress inetAddress, InetAddress inetAddress2) {
        boolean bl;
        block16: {
            block17: {
                boolean bl2;
                block18: {
                    block19: {
                        String[] stringArray;
                        block14: {
                            stringArray = xQ.B();
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                bl2 = inetAddress instanceof Inet6Address;
                                                if (stringArray == null) break block14;
                                                if (!bl2) break block15;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw u_0.a(illegalStateException);
                                            }
                                            bl = inetAddress2 instanceof Inet6Address;
                                            if (stringArray == null) break block16;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw u_0.a(illegalStateException);
                                        }
                                        if (bl) break block17;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw u_0.a(illegalStateException);
                                    }
                                }
                                bl2 = inetAddress instanceof Inet4Address;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw u_0.a(illegalStateException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (stringArray == null) break block18;
                                    if (!bl2) break block19;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw u_0.a(illegalStateException);
                                }
                                bl = inetAddress2 instanceof Inet4Address;
                                if (stringArray == null) break block16;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw u_0.a(illegalStateException);
                            }
                            if (bl) break block17;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw u_0.a(illegalStateException);
                        }
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private int f(byte[] var1_1, byte[] var2_2) {
        block11: {
            block10: {
                var4_3 = var1_1.length;
                var3_4 = xQ.B();
                var5_5 = 0;
                var5_5 = 0;
                try {
                    if (var3_4 == null) {
                        while (true) {
                            ++var5_5;
                            break;
                        }
                    }
                }
                catch (IllegalStateException v0) {
                    throw u_0.a(v0);
                }
                try {
                    try {
                        try {
                            if (var5_5 >= var4_3) break block10;
                            v1 = var1_1[var5_5];
                            if (var3_4 == null) break block11;
                        }
                        catch (IllegalStateException v2) {
                            throw u_0.a(v2);
                        }
                        if (var3_4 == null) break block11;
                    }
                    catch (IllegalStateException v3) {
                        throw u_0.a(v3);
                    }
                    if (v1 == var2_2[var5_5]) ** continue;
                }
                catch (IllegalStateException v4) {
                    throw u_0.a(v4);
                }
            }
            v1 = var5_5;
        }
        return v1;
    }

    /*
     * Unable to fully structure code
     */
    static boolean U(InetAddress var0, InetAddress var1_1, InetAddress var2_2) {
        var4_3 = var0.getAddress();
        var5_4 = var1_1.getAddress();
        var6_5 = var2_2.getAddress();
        var7_6 = 1;
        var3_7 = xQ.B();
        var8_8 = 0;
        try {
            if (var3_7 == null) {
                while (true) {
                    v0 = var4_3[var8_8] & var6_5[var8_8];
                    break;
                }
            }
            ** GOTO lbl32
        }
        catch (IllegalStateException v1) {
            throw u_0.a(v1);
        }
        do {
            block10: {
                block11: {
                    if (var3_7 == null) break block11;
                    try {
                        if (v0 != (var5_4[var8_8] & var6_5[var8_8])) {
                            v0 = 0;
                        }
                        ** GOTO lbl28
                    }
                    catch (IllegalStateException v2) {
                        throw u_0.a(v2);
                    }
                }
                var7_6 = v0;
                try {
                    if (var3_7 != null) break block10;
lbl28:
                    // 2 sources

                    ++var8_8;
                }
                catch (IllegalStateException v3) {
                    throw u_0.a(v3);
                }
lbl32:
                // 2 sources

                if (var8_8 < var4_3.length) ** continue;
            }
            v4 = var7_6;
        } while (var3_7 == null);
        return (boolean)v4;
    }

    private Inet6Address y(Inet6Address inet6Address) throws UnknownHostException {
        byte[] byArray = inet6Address.getAddress();
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(this.Y, 0, byArray2, 0, this.Y.length);
        int n10 = 3;
        System.arraycopy(byArray, byArray.length - n10, byArray2, this.Y.length - n10, n10);
        return (Inet6Address)Inet6Address.getByAddress(byArray2);
    }

    private MacAddress I(Inet6Address inet6Address) {
        byte[] byArray = inet6Address.getAddress();
        byte[] byArray2 = new byte[this.j.length];
        System.arraycopy(this.j, 0, byArray2, 0, this.j.length);
        int n10 = 3;
        System.arraycopy(byArray, byArray.length - n10, byArray2, this.j.length - n10, n10);
        return MacAddress.getByAddress(byArray2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void main(String[] var0) {
        block30: {
            block31: {
                block29: {
                    block28: {
                        block35: {
                            block36: {
                                block27: {
                                    block32: {
                                        block33: {
                                            var2_1 = "org.pcap4j.core.pcapLibName";
                                            var3_2 = System.getProperty(var2_1);
                                            var1_3 = xQ.B();
                                            if (var1_3 == null) break block32;
                                            if (var3_2 == null) ** GOTO lbl17
                                            break block33;
                                            catch (UnknownHostException v0) {
                                                throw u_0.a(v0);
                                            }
                                        }
                                        try {
                                            block34: {
                                                if (!var3_2.isEmpty()) break block27;
                                                break block34;
                                                catch (UnknownHostException v1) {
                                                    throw u_0.a(v1);
                                                }
                                            }
                                            System.out.println(String.format("no libpcap property set, try with -D%s=YourLibPcapFile", new Object[]{var2_1}));
                                        }
                                        catch (UnknownHostException v2) {
                                            throw u_0.a(v2);
                                        }
                                    }
                                    return;
                                }
                                var4_4 = new File(var3_2);
                                if (var1_3 == null) break block35;
                                if (!var4_4.exists()) ** GOTO lbl39
                                break block36;
                                catch (UnknownHostException v3) {
                                    throw u_0.a(v3);
                                }
                            }
                            try {
                                block37: {
                                    if (var4_4.isFile()) break block28;
                                    break block37;
                                    catch (UnknownHostException v4) {
                                        throw u_0.a(v4);
                                    }
                                }
                                System.out.println("libpcap file not exists " + var4_4.getAbsolutePath());
                            }
                            catch (UnknownHostException v5) {
                                throw u_0.a(v5);
                            }
                        }
                        return;
                    }
                    System.out.println("Use libpcap file - " + var4_4.getAbsolutePath());
                    System.out.println();
                    System.out.println("Version - " + Pcaps.libVersion());
                    var5_5 = u_0.K().k();
                    System.out.println("List local interfaces");
                    var7_6 = var5_5.iterator();
                    try {
                        if (var1_3 == null) {
                            while (true) {
                                v6 /* !! */  = var7_6.next();
                                break;
                            }
                        }
                        ** GOTO lbl64
                    }
                    catch (UnknownHostException v7) {
                        throw u_0.a(v7);
                    }
                    do {
                        var6_8 = (PcapNetworkInterface)v6 /* !! */ ;
                        System.out.println("\t" + String.valueOf(var6_8));
lbl64:
                        // 2 sources

                        if (var7_6.hasNext()) ** continue;
                        v6 /* !! */  = var0;
                    } while (var1_3 == null);
                    try {
                        if (var1_3 == null) break block29;
                        if (v6 /* !! */  != null) {
                        }
                        ** GOTO lbl83
                    }
                    catch (UnknownHostException v8) {
                        throw u_0.a(v8);
                    }
                    v9 = var0;
                }
                if (var1_3 == null) break block30;
                try {
                    block38: {
                        if (v9.length != 0) break block31;
                        break block38;
                        catch (UnknownHostException v10) {
                            throw u_0.a(v10);
                        }
                    }
                    System.out.println("No remote device ips provided. try with arguments IP1,IP2 ....");
                    return;
                }
                catch (UnknownHostException v11) {
                    throw u_0.a(v11);
                }
            }
            v9 = var0;
        }
        var9_9 = v9;
        var8_10 = v9.length;
        var7_7 = 0;
        if (var1_3 != null) ** GOTO lbl106
        do {
            var6_8 = var9_9[var7_7];
            System.out.println("Start find mac for ip - " + (String)var6_8);
            try {
                var10_11 = u_0.K().E(InetAddress.getByName((String)var6_8));
                System.out.println("The mac is - " + String.valueOf(var10_11));
            }
            catch (UnknownHostException var10_12) {
                System.out.println("Unknown host " + (String)var6_8);
                var10_12.printStackTrace();
            }
            ++var7_7;
lbl106:
            // 2 sources

        } while (var7_7 < var8_10);
        u_0.K().i();
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$0(boolean var0, AtomicReference var1_1, Packet var2_2) {
        block24: {
            block26: {
                block25: {
                    block22: {
                        block23: {
                            v0 = xQ.B();
                            System.out.println("Packet received" + var2_2.toString());
                            var3_3 = v0;
                            try {
                                try {
                                    try {
                                        v1 = var0;
                                        if (var3_3 == null) break block22;
                                        if (v1) {
                                        }
                                        ** GOTO lbl39
                                    }
                                    catch (IllegalStateException v2) {
                                        throw u_0.a(v2);
                                    }
                                    v1 = var2_2.contains(ArpPacket.class);
                                    if (var3_3 == null) break block22;
                                }
                                catch (IllegalStateException v3) {
                                    throw u_0.a(v3);
                                }
                                if (v1) {
                                }
                                ** GOTO lbl39
                            }
                            catch (IllegalStateException v4) {
                                throw u_0.a(v4);
                            }
                            var4_4 = var2_2.get(ArpPacket.class);
                            try {
                                try {
                                    if (var3_3 == null) break block23;
                                    if (!var4_4.getHeader().getOperation().equals(ArpOperation.REPLY)) break block24;
                                }
                                catch (IllegalStateException v5) {
                                    throw u_0.a(v5);
                                }
                                var1_1.set(var4_4.getHeader().getSrcHardwareAddr());
                            }
                            catch (IllegalStateException v6) {
                                throw u_0.a(v6);
                            }
                        }
                        try {
                            if (var3_3 != null) break block24;
lbl39:
                            // 3 sources

                            v1 = var0;
                        }
                        catch (IllegalStateException v7) {
                            throw u_0.a(v7);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var3_3 == null) break block25;
                                if (v1) break block24;
                            }
                            catch (IllegalStateException v8) {
                                throw u_0.a(v8);
                            }
                            v9 = var2_2;
                            v10 = EthernetPacket.class;
                            if (var3_3 == null) break block26;
                        }
                        catch (IllegalStateException v11) {
                            throw u_0.a(v11);
                        }
                        v1 = v9.contains(v10);
                    }
                    catch (IllegalStateException v12) {
                        throw u_0.a(v12);
                    }
                }
                try {
                    if (!v1) break block24;
                    v9 = var2_2;
                    v10 = EthernetPacket.class;
                }
                catch (IllegalStateException v13) {
                    throw u_0.a(v13);
                }
            }
            var4_4 = v9.get(v10);
            var1_1.set(var4_4.getHeader().getSrcAddr());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC0D7) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            char[] cArray = b[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 46;
                case 1 -> 2;
                case 2 -> 137;
                case 3 -> 119;
                case 4 -> 134;
                case 5 -> 151;
                case 6 -> 209;
                case 7 -> 173;
                case 8 -> 240;
                case 9 -> 135;
                case 10 -> 171;
                case 11 -> 80;
                case 12 -> 107;
                case 13 -> 188;
                case 14 -> 78;
                case 15 -> 172;
                case 16 -> 35;
                case 17 -> 233;
                case 18 -> 42;
                case 19 -> 183;
                case 20 -> 60;
                case 21 -> 91;
                case 22 -> 75;
                case 23 -> 12;
                case 24 -> 96;
                case 25 -> 95;
                case 26 -> 101;
                case 27 -> 238;
                case 28 -> 246;
                case 29 -> 150;
                case 30 -> 241;
                case 31 -> 253;
                case 32 -> 187;
                case 33 -> 52;
                case 34 -> 252;
                case 35 -> 69;
                case 36 -> 166;
                case 37 -> 72;
                case 38 -> 244;
                case 39 -> 11;
                case 40 -> 49;
                case 41 -> 81;
                case 42 -> 224;
                case 43 -> 194;
                case 44 -> 203;
                case 45 -> 22;
                case 46 -> 74;
                case 47 -> 211;
                case 48 -> 164;
                case 49 -> 7;
                case 50 -> 61;
                case 51 -> 36;
                case 52 -> 117;
                case 53 -> 87;
                case 54 -> 58;
                case 55 -> 223;
                case 56 -> 133;
                case 57 -> 17;
                case 58 -> 39;
                case 59 -> 45;
                case 60 -> 186;
                case 61 -> 130;
                case 62 -> 57;
                case 63 -> 65;
                case 64 -> 77;
                case 65 -> 197;
                case 66 -> 251;
                case 67 -> 159;
                case 68 -> 66;
                case 69 -> 216;
                case 70 -> 239;
                case 71 -> 198;
                case 72 -> 205;
                case 73 -> 5;
                case 74 -> 237;
                case 75 -> 68;
                case 76 -> 201;
                case 77 -> 24;
                case 78 -> 103;
                case 79 -> 176;
                case 80 -> 34;
                case 81 -> 200;
                case 82 -> 6;
                case 83 -> 168;
                case 84 -> 213;
                case 85 -> 190;
                case 86 -> 54;
                case 87 -> 76;
                case 88 -> 64;
                case 89 -> 18;
                case 90 -> 178;
                case 91 -> 245;
                case 92 -> 165;
                case 93 -> 51;
                case 94 -> 86;
                case 95 -> 248;
                case 96 -> 231;
                case 97 -> 196;
                case 98 -> 16;
                case 99 -> 113;
                case 100 -> 219;
                case 101 -> 93;
                case 102 -> 56;
                case 103 -> 227;
                case 104 -> 92;
                case 105 -> 220;
                case 106 -> 110;
                case 107 -> 174;
                case 108 -> 13;
                case 109 -> 192;
                case 110 -> 180;
                case 111 -> 38;
                case 112 -> 242;
                case 113 -> 170;
                case 114 -> 8;
                case 115 -> 84;
                case 116 -> 218;
                case 117 -> 177;
                case 118 -> 125;
                case 119 -> 85;
                case 120 -> 204;
                case 121 -> 142;
                case 122 -> 112;
                case 123 -> 63;
                case 124 -> 41;
                case 125 -> 184;
                case 126 -> 146;
                case 127 -> 229;
                case 128 -> 143;
                case 129 -> 50;
                case 130 -> 148;
                case 131 -> 222;
                case 132 -> 160;
                case 133 -> 193;
                case 134 -> 14;
                case 135 -> 27;
                case 136 -> 195;
                case 137 -> 254;
                case 138 -> 71;
                case 139 -> 156;
                case 140 -> 121;
                case 141 -> 228;
                case 142 -> 116;
                case 143 -> 99;
                case 144 -> 106;
                case 145 -> 250;
                case 146 -> 152;
                case 147 -> 53;
                case 148 -> 189;
                case 149 -> 29;
                case 150 -> 3;
                case 151 -> 129;
                case 152 -> 161;
                case 153 -> 185;
                case 154 -> 83;
                case 155 -> 30;
                case 156 -> 215;
                case 157 -> 44;
                case 158 -> 162;
                case 159 -> 169;
                case 160 -> 9;
                case 161 -> 179;
                case 162 -> 141;
                case 163 -> 232;
                case 164 -> 37;
                case 165 -> 147;
                case 166 -> 94;
                case 167 -> 127;
                case 168 -> 47;
                case 169 -> 26;
                case 170 -> 114;
                case 171 -> 82;
                case 172 -> 181;
                case 173 -> 206;
                case 174 -> 144;
                case 175 -> 115;
                case 176 -> 109;
                case 177 -> 108;
                case 178 -> 0;
                case 179 -> 1;
                case 180 -> 79;
                case 181 -> 234;
                case 182 -> 40;
                case 183 -> 154;
                case 184 -> 111;
                case 185 -> 4;
                case 186 -> 207;
                case 187 -> 138;
                case 188 -> 235;
                case 189 -> 118;
                case 190 -> 89;
                case 191 -> 221;
                case 192 -> 230;
                case 193 -> 149;
                case 194 -> 155;
                case 195 -> 199;
                case 196 -> 128;
                case 197 -> 19;
                case 198 -> 43;
                case 199 -> 33;
                case 200 -> 236;
                case 201 -> 23;
                case 202 -> 105;
                case 203 -> 225;
                case 204 -> 10;
                case 205 -> 153;
                case 206 -> 175;
                case 207 -> 249;
                case 208 -> 123;
                case 209 -> 247;
                case 210 -> 226;
                case 211 -> 90;
                case 212 -> 217;
                case 213 -> 243;
                case 214 -> 32;
                case 215 -> 73;
                case 216 -> 104;
                case 217 -> 136;
                case 218 -> 59;
                case 219 -> 132;
                case 220 -> 122;
                case 221 -> 212;
                case 222 -> 55;
                case 223 -> 21;
                case 224 -> 255;
                case 225 -> 48;
                case 226 -> 67;
                case 227 -> 98;
                case 228 -> 126;
                case 229 -> 28;
                case 230 -> 214;
                case 231 -> 25;
                case 232 -> 62;
                case 233 -> 202;
                case 234 -> 167;
                case 235 -> 158;
                case 236 -> 102;
                case 237 -> 70;
                case 238 -> 131;
                case 239 -> 31;
                case 240 -> 208;
                case 241 -> 88;
                case 242 -> 15;
                case 243 -> 140;
                case 244 -> 191;
                case 245 -> 210;
                case 246 -> 97;
                case 247 -> 139;
                case 248 -> 157;
                case 249 -> 182;
                case 250 -> 163;
                case 251 -> 20;
                case 252 -> 120;
                case 253 -> 100;
                case 254 -> 124;
                default -> 145;
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
            u_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7421;
        if (f[n11] == null) {
            u_0.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

