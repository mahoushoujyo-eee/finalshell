/*
 * Decompiled with CFR 0.152.
 */
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
import org.pcap4j.packet.Packet;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.util.MacAddress;

/*
 * Renamed from xx
 */
public class xx_0 {
    HashMap l = new HashMap();
    HashMap h = new HashMap();
    int x;
    static Random W;
    PcapHandle P;
    HashSet A;
    HashMap j;
    MacAddress z;
    int N;
    boolean I;
    short q;
    ArrayList Z;
    HashMap r;
    HashMap s;
    HashMap X;
    HashMap Y;
    ArrayList Q;
    Object k;
    int e;
    int t;
    long y;
    long w;
    Object U;
    boolean n;
    boolean v;
    li_0 p;
    public Inet4Address o;
    public short S;
    int G;
    int B;
    int m;
    Inet4Address f;
    short i;
    int c;
    int b;
    int u;
    Object R;
    long a;
    long L;
    long M;
    String T;
    Object J;
    private static final String[] d;
    private static final String[] g;
    private static final long[] C;
    private static final Integer[] D;
    private static final long[] E;
    private static final Long[] F;

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                var21 = new String[34];
                                var19_1 = 0;
                                var18_2 = "7@\u00e2\u0010\u00a8\u00a8\u0001\u000f\u5334\u9050\u7b05\u4e1b\u6b5a\u63bd\u6292\u00b8U\u001e\u00d3\u0090\u00eb8\f\b\u531a\u9053\u7bc0\u4efe\u6be2\u6334\u6285\u0089\f\u6364\u650c\u5414\u5edc\u00a4\u00aaN\u00e7\u00ed>96\r\u0099\u00f68K\u001c\u0097\u009eE\u00cb\u00ca*Y\u00bb\u0018\u00b4{\u0097\u00baF\u0080\u00e2\u0084\u00cc\u00fe\u0018.\"\u0013\u00f1\u00de\u009e\u00ddE\u00ac\u00a8F\u00a5O \u00c1\u00b1ve\u00c3\u0006\u00bc\u008dt{{v\u0093\u00df\u00a3g\u009b\u00cf_\f9\u001b|\u00ea\u00f7\u00a1Lh\u00ee n\u00fe\u000f\u5389\u908f\u7bb2\u4ee9\u6bac\u63cb\u624cv\u008e\u00c7\u00a8\u00ab\u0084_\u00e1\u0018Lb\u0088\u0099\u00a5\u00e4\u009e\bCo\u00e9\u001c\u001cU6\u0016f\u00c4Z\u008fK\"\u00d9\u00c3\b\u6335\u65a4\u7bdf\u4e5d\u6b01\u635d\u62f9\u00a4\u00028Q\u0002\u00f8\u008d\u0002}\u00a8\u000f\u63c5\u65f7\u7bc1\u4ebb\u6bc2\u639c\u6281\u009c7\u009a\u009f\u0000b*=\u0005u\u00d5\u0011N\u00a1\f\u5353\u90d7\u8b32\u6ca0\u001d)y\u0097\u000b0\u00e5\u00f7\t&\u00c4\u00f0\u00b4\u00e2p\u00a0\u00187\u0002\u00c1\u008a\u0004l\u00d8M@\f\u63b7\u6551\u8b54\u6ca1\u00d1\t\u00e0\u00938\u00b0\u0083\u00e7\r&z\u00cf\u00da\u00e2\u00a5A\u00030\u0002U@T\u000f\u632a\u653a\u7b3c\u4e87\u6b7d\u632e\u6276\u00ca\u00c9P@Y\u0099\u0001B \u00c4\u00fe\u0097Y\u00d9\u00f6_0\u00d2\u0016k\u00ad_HS\u00f7\u00ca\u0081\u00eeb\u0094\u0089,\u0012\u00f4u4\u00d5\u00dd0\u00cb9\f\u53b7\u90fe\u5494\u5e53\u00b4[L\u00d9\u00ad\u00f91\u00ce\u0017\u00d8\u00aaq&6]\u00ff\u009b\u001a?\u0012:\u0086#.M\u00c9\u00f8\u00c7\u00a4\u00af\u0086\u00fd\u0011\u00ec\u0093\u00cc\u00c5\u001a\u00c40L\u00c8\u00e84+\u0087\u008bm\u00df\u00c1\u0018o\u00f5\u00a3\u00edy\u0017\u00eb\u00a6\u0091;!\u00c3\u00d9S\u00e1\u00de\u0091\u00e5\f\u00b30B%\u0081|\u00daO\u0015\u00ba\u00af\u00fd&\u0097\u00dd\u00e2\u00bf<\u00f7\u0092),E)\u00f0\u009fR\u00e6Uc~b \u00e6\u00e4\u00ceZ\u00c5B\u008bJ\u00a9\u00e2\u00f2\u00a5e\u0086\u009c\n2\u00a6\u00c5\u00e4\u00b6\u00ee\u008f\u0010\u00e1\u0006\\\u00c0\u009e\u00cf\u00ad\u0099\u0019k\u0099!j;(\u00b5\u00ee\u0082QN\u00eeM\u00ad\u00fe\u0005`\u00f6\u00a79 =\u0099\u00f0\u0088>\u00f2\u00d6\u0088t&r\u0083\u0013\u00ac\u00bbJ\u00b4\u0086\u0081\u0083\u008b'\u001dW\u00c4\u00c5qZ\u00bbF\u001b\u00d7\u0003TO\u00a6\u009f\u001d\u0082\u00adQK=(\u00c129\u0089\u0093\u00b2X*\u00a0\u00f0\u0083_#\u0095\u008a\u00e3(W`\u007f\u00bef\u00f6\u001d\u00cd|b\u00b1HY\u00c3\u00f6\u00835\u0088\u00cbI\u0099P\u008b\u0016\u009e=\u009d\u00f4\u00be4\u0013\u00dc\u008e\u00a9\u00c2\u0081\u00b7T9\u0090>q\u0086\u00b0\u0083\u00f3V{h\u00b1[\u00a0\u0001l\u00dem\"\r\u00ec\u0086A\u00bc\u00c6\u008a\u00c9\u00a3\u00e0\u009b\n\u00d5\u00ce\u009d\u00d8\u00e0_\u00ce\"\u0002\u008c\u008b\u00d5\u0096\u00ef?\u00b3\u001f\u00d4\u00c3\u0006\u00e1/\u00e8U\u00a4/-E\u00a6g\u00a6\u00e5\u0003\u00e9\u0084s\u0095\u009bb\u0004\u00f2\u00c2\u00a1Y\u000b~q^\u00fa\u00d8Jo\u00c7\u00db5/q\fS\u000f\u0006\u00b6\u00d4\u00ef\u0007\u00a9\u00a21L\u00d2#N";
                                var20_3 = "7@\u00e2\u0010\u00a8\u00a8\u0001\u000f\u5334\u9050\u7b05\u4e1b\u6b5a\u63bd\u6292\u00b8U\u001e\u00d3\u0090\u00eb8\f\b\u531a\u9053\u7bc0\u4efe\u6be2\u6334\u6285\u0089\f\u6364\u650c\u5414\u5edc\u00a4\u00aaN\u00e7\u00ed>96\r\u0099\u00f68K\u001c\u0097\u009eE\u00cb\u00ca*Y\u00bb\u0018\u00b4{\u0097\u00baF\u0080\u00e2\u0084\u00cc\u00fe\u0018.\"\u0013\u00f1\u00de\u009e\u00ddE\u00ac\u00a8F\u00a5O \u00c1\u00b1ve\u00c3\u0006\u00bc\u008dt{{v\u0093\u00df\u00a3g\u009b\u00cf_\f9\u001b|\u00ea\u00f7\u00a1Lh\u00ee n\u00fe\u000f\u5389\u908f\u7bb2\u4ee9\u6bac\u63cb\u624cv\u008e\u00c7\u00a8\u00ab\u0084_\u00e1\u0018Lb\u0088\u0099\u00a5\u00e4\u009e\bCo\u00e9\u001c\u001cU6\u0016f\u00c4Z\u008fK\"\u00d9\u00c3\b\u6335\u65a4\u7bdf\u4e5d\u6b01\u635d\u62f9\u00a4\u00028Q\u0002\u00f8\u008d\u0002}\u00a8\u000f\u63c5\u65f7\u7bc1\u4ebb\u6bc2\u639c\u6281\u009c7\u009a\u009f\u0000b*=\u0005u\u00d5\u0011N\u00a1\f\u5353\u90d7\u8b32\u6ca0\u001d)y\u0097\u000b0\u00e5\u00f7\t&\u00c4\u00f0\u00b4\u00e2p\u00a0\u00187\u0002\u00c1\u008a\u0004l\u00d8M@\f\u63b7\u6551\u8b54\u6ca1\u00d1\t\u00e0\u00938\u00b0\u0083\u00e7\r&z\u00cf\u00da\u00e2\u00a5A\u00030\u0002U@T\u000f\u632a\u653a\u7b3c\u4e87\u6b7d\u632e\u6276\u00ca\u00c9P@Y\u0099\u0001B \u00c4\u00fe\u0097Y\u00d9\u00f6_0\u00d2\u0016k\u00ad_HS\u00f7\u00ca\u0081\u00eeb\u0094\u0089,\u0012\u00f4u4\u00d5\u00dd0\u00cb9\f\u53b7\u90fe\u5494\u5e53\u00b4[L\u00d9\u00ad\u00f91\u00ce\u0017\u00d8\u00aaq&6]\u00ff\u009b\u001a?\u0012:\u0086#.M\u00c9\u00f8\u00c7\u00a4\u00af\u0086\u00fd\u0011\u00ec\u0093\u00cc\u00c5\u001a\u00c40L\u00c8\u00e84+\u0087\u008bm\u00df\u00c1\u0018o\u00f5\u00a3\u00edy\u0017\u00eb\u00a6\u0091;!\u00c3\u00d9S\u00e1\u00de\u0091\u00e5\f\u00b30B%\u0081|\u00daO\u0015\u00ba\u00af\u00fd&\u0097\u00dd\u00e2\u00bf<\u00f7\u0092),E)\u00f0\u009fR\u00e6Uc~b \u00e6\u00e4\u00ceZ\u00c5B\u008bJ\u00a9\u00e2\u00f2\u00a5e\u0086\u009c\n2\u00a6\u00c5\u00e4\u00b6\u00ee\u008f\u0010\u00e1\u0006\\\u00c0\u009e\u00cf\u00ad\u0099\u0019k\u0099!j;(\u00b5\u00ee\u0082QN\u00eeM\u00ad\u00fe\u0005`\u00f6\u00a79 =\u0099\u00f0\u0088>\u00f2\u00d6\u0088t&r\u0083\u0013\u00ac\u00bbJ\u00b4\u0086\u0081\u0083\u008b'\u001dW\u00c4\u00c5qZ\u00bbF\u001b\u00d7\u0003TO\u00a6\u009f\u001d\u0082\u00adQK=(\u00c129\u0089\u0093\u00b2X*\u00a0\u00f0\u0083_#\u0095\u008a\u00e3(W`\u007f\u00bef\u00f6\u001d\u00cd|b\u00b1HY\u00c3\u00f6\u00835\u0088\u00cbI\u0099P\u008b\u0016\u009e=\u009d\u00f4\u00be4\u0013\u00dc\u008e\u00a9\u00c2\u0081\u00b7T9\u0090>q\u0086\u00b0\u0083\u00f3V{h\u00b1[\u00a0\u0001l\u00dem\"\r\u00ec\u0086A\u00bc\u00c6\u008a\u00c9\u00a3\u00e0\u009b\n\u00d5\u00ce\u009d\u00d8\u00e0_\u00ce\"\u0002\u008c\u008b\u00d5\u0096\u00ef?\u00b3\u001f\u00d4\u00c3\u0006\u00e1/\u00e8U\u00a4/-E\u00a6g\u00a6\u00e5\u0003\u00e9\u0084s\u0095\u009bb\u0004\u00f2\u00c2\u00a1Y\u000b~q^\u00fa\u00d8Jo\u00c7\u00db5/q\fS\u000f\u0006\u00b6\u00d4\u00ef\u0007\u00a9\u00a21L\u00d2#N".length();
                                var17_4 = 7;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 21;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block28;
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
                                    var18_2 = "\u00a4d\u00bd\u001c\u00bd\u0011\u0010\u00d2\u0002\u0004\u00d0k\u00c6\u0018\u00fb\u00ef\u00890\u00b2\u0099}^\u00b0";
                                    var20_3 = "\u00a4d\u00bd\u001c\u00bd\u0011\u0010\u00d2\u0002\u0004\u00d0k\u00c6\u0018\u00fb\u00ef\u00890\u00b2\u0099}^\u00b0".length();
                                    var17_4 = 6;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 100;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block28;
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
                                    break block29;
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
                                            v15 = 100;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 30;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 127;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 77;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 42;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 9;
                                            break;
                                        }
                                        default: {
                                            v15 = 101;
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
                        xx_0.d = var21;
                        xx_0.g = new String[34];
                        var8_7 = 510751862828541980L;
                        var14_8 = new long[12];
                        var11_9 = 0;
                        var12_10 = "\u001c\u00dfiT\u00cf\u00f4\u0088\u00df\u00e5\bPg\u00af\u0000\u0082&n\u008e\u0080\u001fe,\u00fa\u00e6\u00a9\u00fbg\u00de\u00c6\u001d\u008c\u00fcE\u00bf\u00a7\u00cb8\u0001\u00b1\f\u00f6G\u00d1Y\u00d0\u00fc\u001e$Ah\u00ab{t\u009eQ\u00c2\u00ca\u00d5\u00cf\u0000A\u0098\u00a3\u00e5$\f\u00bf\u00afq\u0010\u00a1v3\u00fd]'\u0089%c\u00be";
                        var13_11 = "\u001c\u00dfiT\u00cf\u00f4\u0088\u00df\u00e5\bPg\u00af\u0000\u0082&n\u008e\u0080\u001fe,\u00fa\u00e6\u00a9\u00fbg\u00de\u00c6\u001d\u008c\u00fcE\u00bf\u00a7\u00cb8\u0001\u00b1\f\u00f6G\u00d1Y\u00d0\u00fc\u001e$Ah\u00ab{t\u009eQ\u00c2\u00ca\u00d5\u00cf\u0000A\u0098\u00a3\u00e5$\f\u00bf\u00afq\u0010\u00a1v3\u00fd]'\u0089%c\u00be".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block30;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u0089m\u00e4P1\u0093\u00a6\\\u0011>\u009b\u00be>f\u00e9\u00f0";
                            var13_11 = "\u0089m\u00e4P1\u0093\u00a6\\\u0011>\u009b\u00be>f\u00e9\u00f0".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block30;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block31;
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
                xx_0.C = var14_8;
                xx_0.D = new Integer[12];
                var0_14 = 933695728441103365L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "\u000f^\u008b):\u00fbQ\u008as\u0083\u008e\u00a7\u00f5\u00d89nj\u00c9=S#\u0015_m";
                var5_18 = "\u000f^\u008b):\u00fbQ\u008as\u0083\u008e\u00a7\u00f5\u00d89nj\u00c9=S#\u0015_m".length();
                var2_19 = 0;
                while (true) {
                    break block32;
                    break;
                }
lbl148:
                // 1 sources

                while (true) {
                    var6_15[v22] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block33;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v22 = var3_16++;
            ** while (true)
        }
        xx_0.E = var6_15;
        xx_0.F = new Long[3];
        xx_0.W = new Random();
    }

    xx_0(li_0 li_02, Inet4Address inet4Address, short s2, MacAddress macAddress, MacAddress macAddress2) {
        this.x = xx_0.a(3703, 9014151815894142528L);
        this.A = new HashSet();
        this.j = new HashMap();
        this.N = -1;
        this.I = false;
        this.q = (short)xx_0.a(8346, 2833999502224335015L);
        this.Z = new ArrayList();
        this.r = new HashMap();
        this.s = new HashMap();
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Q = new ArrayList();
        this.k = new Object();
        this.e = xx_0.a(21189, 7510058056251560698L);
        this.t = 0;
        this.y = 0L;
        this.w = xx_0.b(20043, 9184715366709865543L);
        this.U = new Object();
        this.n = false;
        this.v = false;
        this.c = W.nextInt();
        this.u = W.nextInt(xx_0.a(15937, 5884202028882017911L));
        this.R = new Object();
        this.M = System.currentTimeMillis();
        this.J = new Object();
        this.p = li_02;
        this.P = li_02.h;
        this.o = inet4Address;
        this.S = s2;
        this.f = li_02.W;
        this.i = (short)(W.nextInt(xx_0.a(28399, 1108740448026848983L)) + xx_0.a(15929, 2532844386358803968L));
        Packet packet = null;
        try {
            packet = W1.j(macAddress, macAddress2, this.f, this.i, inet4Address, s2, this.c, this.x());
            try {
                this.P.sendPacket(packet);
                this.b = this.c + 1;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        jy_0.g("发送第一次握手  ident " + this.u);
        jy_0.g("" + packet);
    }

    xx_0(li_0 li_02, Inet4Address inet4Address, short s2) {
        this.x = xx_0.a(21189, 7510058056251560698L);
        this.A = new HashSet();
        this.j = new HashMap();
        this.N = -1;
        this.I = false;
        this.q = (short)xx_0.a(9402, 4949397124704773252L);
        this.Z = new ArrayList();
        this.r = new HashMap();
        this.s = new HashMap();
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Q = new ArrayList();
        this.k = new Object();
        this.e = xx_0.a(21189, 7510058056251560698L);
        this.t = 0;
        this.y = 0L;
        this.w = xx_0.b(9902, 264494635952587939L);
        this.U = new Object();
        this.n = false;
        this.v = false;
        this.c = W.nextInt();
        this.u = W.nextInt(xx_0.a(29784, 7214297505542665314L));
        this.R = new Object();
        this.M = System.currentTimeMillis();
        this.J = new Object();
        this.p = li_02;
        this.o = inet4Address;
        this.S = s2;
        this.P = this.p.h;
        this.i = li_02.d;
        this.f = this.p.W;
    }

    void b(Inet4Address inet4Address, int n10, Inet4Address inet4Address2, int n11, int n12) {
    }

    void E(Inet4Address inet4Address, int n10, Inet4Address inet4Address2, int n11, int n12, int n13) {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void w(Packet var1_1, EthernetPacket.EthernetHeader var2_2, IpV4Packet.IpV4Header var3_3, TcpPacket var4_4, boolean var5_5) {
        block41: {
            block42: {
                block45: {
                    block43: {
                        block44: {
                            block39: {
                                block40: {
                                    block48: {
                                        block38: {
                                            block37: {
                                                var7_6 = var4_4.getHeader();
                                                var6_7 = li_0.I();
                                                v0 = this.v;
                                                if (var6_7 != null) break block37;
                                                try {
                                                    block46: {
                                                        if (v0) ** GOTO lbl130
                                                        break block46;
                                                        catch (Exception v1) {
                                                            throw xx_0.a(v1);
                                                        }
                                                    }
                                                    v0 = this.n;
                                                }
                                                catch (Exception v2) {
                                                    throw xx_0.a(v2);
                                                }
                                            }
                                            if (var6_7 != null) break block38;
                                            try {
                                                block47: {
                                                    if (v0) ** GOTO lbl117
                                                    break block47;
                                                    catch (Exception v3) {
                                                        throw xx_0.a(v3);
                                                    }
                                                }
                                                this.z = var2_2.getSrcAddr();
                                                v0 = var7_6.getSyn();
                                            }
                                            catch (Exception v4) {
                                                throw xx_0.a(v4);
                                            }
                                        }
                                        if (var6_7 != null) break block39;
                                        if (!v0) break block40;
                                        break block48;
                                        catch (Exception v5) {
                                            throw xx_0.a(v5);
                                        }
                                    }
                                    try {
                                        block49: {
                                            v0 = var7_6.getAck();
                                            if (var6_7 != null) break block39;
                                            break block49;
                                            catch (Exception v6) {
                                                throw xx_0.a(v6);
                                            }
                                        }
                                        if (v0) break block40;
                                    }
                                    catch (Exception v7) {
                                        throw xx_0.a(v7);
                                    }
                                    this.G = var7_6.getSequenceNumber();
                                    this.m = this.B = this.G + 1;
                                    jy_0.g("接收第一次握手 " + this.o.getHostAddress() + ":" + this.S + "->" + this.f.getHostAddress() + ":" + this.i + " ident " + var3_3.getIdentification());
                                    jy_0.g("" + var1_1);
                                    var8_8 = W1.o(this.p.F, this.p.c, this.f, this.i, var3_3.getSrcAddr(), (Short)var7_6.getSrcPort().value(), var7_6.getSequenceNumber() + 1, this.c, (short)0);
                                    try {
                                        this.P.sendPacket((Packet)var8_8);
                                    }
                                    catch (Exception var9_11) {
                                        var9_11.printStackTrace();
                                    }
                                    this.b = this.c + 1;
                                    jy_0.g("发送第二次握手 " + this.p.F + "->" + this.p.c + " " + this.f + "->" + " ident " + 0);
                                    jy_0.g("" + var8_8);
                                }
                                v0 = var7_6.getSyn();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var6_7 != null) break block41;
                                                        if (v0) break block42;
                                                    }
                                                    catch (Exception v8) {
                                                        throw xx_0.a(v8);
                                                    }
                                                    v0 = var7_6.getAck();
                                                    if (var6_7 != null) break block41;
                                                }
                                                catch (Exception v9) {
                                                    throw xx_0.a(v9);
                                                }
                                                if (!v0) break block42;
                                            }
                                            catch (Exception v10) {
                                                throw xx_0.a(v10);
                                            }
                                            v11 /* !! */  = var4_4.getPayload();
                                            if (var6_7 != null) break block43;
                                        }
                                        catch (Exception v12) {
                                            throw xx_0.a(v12);
                                        }
                                        if (v11 /* !! */  != null) break block44;
                                    }
                                    catch (Exception v13) {
                                        throw xx_0.a(v13);
                                    }
                                    v14 = var7_6.getAcknowledgmentNumber();
                                    if (var6_7 != null) break block45;
                                }
                                catch (Exception v15) {
                                    throw xx_0.a(v15);
                                }
                                if (v14 != this.b) break block44;
                            }
                            catch (Exception v16) {
                                throw xx_0.a(v16);
                            }
                            jy_0.g("接收第三次握手  ident " + var3_3.getIdentification());
                            jy_0.g("" + var1_1);
                            var8_8 = new FS(this);
                            this.n = true;
                        }
                        v11 /* !! */  = this.l.remove(var7_6.getAcknowledgmentNumber());
                    }
                    v14 = (int)this.A.contains(var3_3.getIdentification());
                }
                var8_9 = v14;
                try {
                    if (var6_7 == null) break block42;
lbl117:
                    // 2 sources

                    if (var4_4.getPayload() == null) break block42;
                }
                catch (Exception v17) {
                    throw xx_0.a(v17);
                }
                this.v = true;
                this.i(var4_4, var7_6, var3_3);
                var8_10 = new String(var4_4.getPayload().getRawData());
                jy_0.g("接收请求  ident " + var3_3.getIdentification());
                jy_0.g("发送响应  ident " + this.u);
                var9_12 = xx_0.K();
                try {
                    this.P(var9_12);
                    if (var6_7 == null) break block42;
lbl130:
                    // 2 sources

                    if (var4_4.getPayload() == null) break block42;
                }
                catch (Exception v18) {
                    throw xx_0.a(v18);
                }
                this.i(var4_4, var7_6, var3_3);
                var8_10 = new UL();
                var8_10.V = this;
                var8_10.W = var4_4.getPayload().getRawData();
                this.p.f.T((UL)var8_10);
            }
            v0 = var7_6.getRst();
        }
        try {
            if (v0) {
                jy_0.g("reset packet " + var3_3.getIdentification() + " " + var7_6.getSequenceNumber() + " " + this.o.getHostAddress() + ":" + this.S + "->" + this.f.getHostAddress() + ":" + this.i + " " + " ident " + var3_3.getIdentification());
            }
        }
        catch (Exception v19) {
            throw xx_0.a(v19);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void P(li_0 var1_1, Packet var2_2, EthernetPacket.EthernetHeader var3_3, IpV4Packet.IpV4Header var4_4, TcpPacket var5_5, boolean var6_6) {
        block35: {
            block36: {
                block43: {
                    block42: {
                        block41: {
                            block34: {
                                block33: {
                                    block32: {
                                        block37: {
                                            var8_7 = var5_5.getHeader();
                                            var7_8 = li_0.I();
                                            var9_9 = null;
                                            v0 = var5_5.getPayload();
                                            if (var7_8 != null) break block37;
                                            try {
                                                block38: {
                                                    if (v0 == null) break block32;
                                                    break block38;
                                                    catch (PcapNativeException v1) {
                                                        throw xx_0.a(v1);
                                                    }
                                                }
                                                v0 = var5_5.getPayload();
                                            }
                                            catch (PcapNativeException v2) {
                                                throw xx_0.a(v2);
                                            }
                                        }
                                        var9_9 = v0.getRawData();
                                    }
                                    v3 = this.v;
                                    if (var7_8 != null) break block33;
                                    try {
                                        block39: {
                                            if (v3 != 0) ** GOTO lbl110
                                            break block39;
                                            catch (PcapNativeException v4) {
                                                throw xx_0.a(v4);
                                            }
                                        }
                                        v3 = this.n;
                                    }
                                    catch (PcapNativeException v5) {
                                        throw xx_0.a(v5);
                                    }
                                }
                                if (var7_8 != null) break block34;
                                try {
                                    block40: {
                                        if (v3 != 0) ** GOTO lbl100
                                        break block40;
                                        catch (PcapNativeException v6) {
                                            throw xx_0.a(v6);
                                        }
                                    }
                                    v3 = var8_7.getAck();
                                }
                                catch (PcapNativeException v7) {
                                    throw xx_0.a(v7);
                                }
                            }
                            if (var7_8 != null) break block35;
                            if (v3 == 0) break block36;
                            break block41;
                            catch (PcapNativeException v8) {
                                throw xx_0.a(v8);
                            }
                        }
                        v3 = var8_7.getSyn();
                        if (var7_8 != null) break block35;
                        break block42;
                        catch (PcapNativeException v9) {
                            throw xx_0.a(v9);
                        }
                    }
                    if (v3 == 0) break block36;
                    break block43;
                    catch (PcapNativeException v10) {
                        throw xx_0.a(v10);
                    }
                }
                try {
                    block44: {
                        v3 = var8_7.getAcknowledgmentNumber();
                        if (var7_8 != null) break block35;
                        break block44;
                        catch (PcapNativeException v11) {
                            throw xx_0.a(v11);
                        }
                    }
                    if (v3 != this.c + 1) break block36;
                }
                catch (PcapNativeException v12) {
                    throw xx_0.a(v12);
                }
                jy_0.g("接收第二次握手  ident " + var4_4.getIdentification());
                jy_0.g("" + var2_2);
                this.G = var8_7.getSequenceNumber();
                this.m = this.B = this.G + 1;
                var10_10 = W1.X(var1_1.F, var1_1.c, var1_1.W, this.i, this.o, this.S, this.B, this.b, this.x());
                try {
                    this.P.sendPacket((Packet)var10_10);
                    jy_0.g("发送第三次握手  ident " + this.u);
                    jy_0.g("" + var10_10);
                    this.n = true;
                    var11_11 = xx_0.A(this.S);
                    this.P(var11_11);
                    jy_0.g("发送请求  ident " + this.u);
                    break block36;
                }
                catch (PcapNativeException var11_12) {
                    var11_12.printStackTrace();
                    break block36;
                }
                catch (NotOpenException var11_13) {
                    try {
                        var11_13.printStackTrace();
                        if (var7_8 == null) break block36;
lbl100:
                        // 2 sources

                        if (var5_5.getPayload() == null) break block36;
                    }
                    catch (PcapNativeException v13) {
                        throw xx_0.a(v13);
                    }
                }
                this.v = true;
                this.i(var5_5, var8_7, var4_4);
                var10_10 = new String(var5_5.getPayload().getRawData());
                try {
                    jy_0.g("接收响应  ident " + var4_4.getIdentification());
                    if (var7_8 == null) break block36;
lbl110:
                    // 2 sources

                    if (var5_5.getPayload() == null) break block36;
                }
                catch (PcapNativeException v14) {
                    throw xx_0.a(v14);
                }
                this.i(var5_5, var8_7, var4_4);
                var10_10 = new UL();
                var10_10.V = this;
                var10_10.W = var5_5.getPayload().getRawData();
                var1_1.f.T((UL)var10_10);
            }
            v3 = var8_7.getRst();
        }
        try {
            if (v3 != 0) {
                jy_0.g("reset packet " + var4_4.getIdentification() + " " + var8_7.getSequenceNumber() + " " + this.o.getHostAddress() + ":" + this.S + "->" + this.f.getHostAddress() + ":" + this.i);
            }
        }
        catch (PcapNativeException v15) {
            throw xx_0.a(v15);
        }
    }

    /*
     * Loose catch block
     */
    void i(TcpPacket tcpPacket, TcpPacket.TcpHeader tcpHeader, IpV4Packet.IpV4Header ipV4Header) {
        block10: {
            long l2;
            block9: {
                String[] stringArray = li_0.I();
                long l3 = System.currentTimeMillis() - this.a - xx_0.b(10895, 7366791687657310336L);
                l2 = l3 == 0L ? (byte)0 : (l3 < 0L ? (byte)-1 : 1);
                if (stringArray != null) break block9;
                try {
                    block11: {
                        if (l2 <= 0) break block10;
                        break block11;
                        catch (Exception exception) {
                            throw xx_0.a(exception);
                        }
                    }
                    l2 = tcpHeader.getSequenceNumber() + tcpPacket.getPayload().getRawData().length;
                }
                catch (Exception exception) {
                    throw xx_0.a(exception);
                }
            }
            long l4 = l2;
            try {
                if (l4 > this.m) {
                    this.m = (int)l4;
                }
            }
            catch (Exception exception) {
                throw xx_0.a(exception);
            }
            Packet packet = W1.X(this.p.F, this.p.c, this.f, this.i, ipV4Header.getSrcAddr(), (Short)tcpHeader.getSrcPort().value(), this.m, this.b, this.x());
            try {
                this.P.sendPacket(packet);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            this.a = System.currentTimeMillis();
            this.L = System.currentTimeMillis();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void P(byte[] byArray) {
        Packet packet = W1.V(this.p.F, this.p.c, this.f, this.i, this.o, this.S, this.b, this.m, byArray, this.x());
        Object object = this.R;
        synchronized (object) {
            try {
                this.P.sendPacket(packet);
                this.b += byArray.length;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    short x() {
        Object object = this.J;
        synchronized (object) {
            String[] stringArray = li_0.I();
            ++this.u;
            Object object2 = this;
            if (stringArray == null) {
                if (((xx_0)object2).u >= xx_0.a(1562, 7439966017211434529L)) {
                    this.u = 0;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return (short)this.u;
        }
    }

    public static byte[] K() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP/1.1 200 OK");
        stringBuffer.append("Server: Apache/2.2.15 (CentOS)");
        stringBuffer.append("Accept-Ranges: bytes");
        stringBuffer.append("Content-Length: " + Math.abs(W.nextInt()) + "");
        stringBuffer.append("Connection: Keep-Alive");
        stringBuffer.append("Content-Type: application/octet-stream");
        stringBuffer.append("");
        String string = stringBuffer.toString();
        byte[] byArray = string.getBytes();
        int n10 = byArray.length;
        return byArray;
    }

    public static byte[] A(int n10) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = String.valueOf(xx_0.f(5 + W.nextInt(xx_0.a(10764, 9129136843777059376L)))) + ".com";
        stringBuffer.append("GET /" + xx_0.f(xx_0.a(19358, 2880729365847919530L) + W.nextInt(xx_0.a(2389, 5394392816280602976L))) + "." + xx_0.f(2 + W.nextInt(5)) + " HTTP/1.1" + "");
        stringBuffer.append("Accept: application/x-ms-application, image/jpeg, application/xaml+xml, image/gif, image/pjpeg, application/x-ms-xbap, */*");
        stringBuffer.append("Accept-Language: zh-CN");
        stringBuffer.append("Accept-Encoding: gzip, deflate");
        stringBuffer.append("User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0");
        stringBuffer.append("Host: " + string + "");
        stringBuffer.append("Connection: Keep-Alive");
        stringBuffer.append("");
        String string2 = stringBuffer.toString();
        byte[] byArray = string2.getBytes();
        return byArray;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static String f(int n10) {
        String string = "abcdefghkmnopqrstuvwxyz";
        Random random = new Random();
        String[] stringArray = li_0.I();
        StringBuffer stringBuffer = new StringBuffer();
        int n11 = 0;
        boolean bl = true;
        do {
            if (bl && !(bl = false) && stringArray == null) continue;
            int n12 = random.nextInt(string.length());
            stringBuffer.append(string.charAt(n12));
            ++n11;
        } while (n11 < n10);
        return stringBuffer.toString();
    }

    public InetAddress U() {
        return this.f;
    }

    public int D() {
        return this.i;
    }

    public void G(short s2) {
        this.i = s2;
    }

    public boolean P() {
        return this.n;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public String u() {
        return this.T;
    }

    public void u(String string) {
        this.T = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6AD5) & 0xFFFF;
        if (g[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 69;
                    break;
                }
                case 1: {
                    n14 = 200;
                    break;
                }
                case 2: {
                    n14 = 214;
                    break;
                }
                case 3: {
                    n14 = 9;
                    break;
                }
                case 4: {
                    n14 = 249;
                    break;
                }
                case 5: {
                    n14 = 105;
                    break;
                }
                case 6: {
                    n14 = 117;
                    break;
                }
                case 7: {
                    n14 = 40;
                    break;
                }
                case 8: {
                    n14 = 161;
                    break;
                }
                case 9: {
                    n14 = 253;
                    break;
                }
                case 10: {
                    n14 = 134;
                    break;
                }
                case 11: {
                    n14 = 158;
                    break;
                }
                case 12: {
                    n14 = 20;
                    break;
                }
                case 13: {
                    n14 = 73;
                    break;
                }
                case 14: {
                    n14 = 254;
                    break;
                }
                case 15: {
                    n14 = 101;
                    break;
                }
                case 16: {
                    n14 = 18;
                    break;
                }
                case 17: {
                    n14 = 184;
                    break;
                }
                case 18: {
                    n14 = 204;
                    break;
                }
                case 19: {
                    n14 = 31;
                    break;
                }
                case 20: {
                    n14 = 98;
                    break;
                }
                case 21: {
                    n14 = 126;
                    break;
                }
                case 22: {
                    n14 = 80;
                    break;
                }
                case 23: {
                    n14 = 143;
                    break;
                }
                case 24: {
                    n14 = 150;
                    break;
                }
                case 25: {
                    n14 = 206;
                    break;
                }
                case 26: {
                    n14 = 151;
                    break;
                }
                case 27: {
                    n14 = 121;
                    break;
                }
                case 28: {
                    n14 = 14;
                    break;
                }
                case 29: {
                    n14 = 227;
                    break;
                }
                case 30: {
                    n14 = 191;
                    break;
                }
                case 31: {
                    n14 = 78;
                    break;
                }
                case 32: {
                    n14 = 197;
                    break;
                }
                case 33: {
                    n14 = 217;
                    break;
                }
                case 34: {
                    n14 = 248;
                    break;
                }
                case 35: {
                    n14 = 55;
                    break;
                }
                case 36: {
                    n14 = 183;
                    break;
                }
                case 37: {
                    n14 = 250;
                    break;
                }
                case 38: {
                    n14 = 129;
                    break;
                }
                case 39: {
                    n14 = 224;
                    break;
                }
                case 40: {
                    n14 = 81;
                    break;
                }
                case 41: {
                    n14 = 7;
                    break;
                }
                case 42: {
                    n14 = 52;
                    break;
                }
                case 43: {
                    n14 = 115;
                    break;
                }
                case 44: {
                    n14 = 3;
                    break;
                }
                case 45: {
                    n14 = 5;
                    break;
                }
                case 46: {
                    n14 = 174;
                    break;
                }
                case 47: {
                    n14 = 72;
                    break;
                }
                case 48: {
                    n14 = 255;
                    break;
                }
                case 49: {
                    n14 = 148;
                    break;
                }
                case 50: {
                    n14 = 131;
                    break;
                }
                case 51: {
                    n14 = 180;
                    break;
                }
                case 52: {
                    n14 = 66;
                    break;
                }
                case 53: {
                    n14 = 24;
                    break;
                }
                case 54: {
                    n14 = 110;
                    break;
                }
                case 55: {
                    n14 = 203;
                    break;
                }
                case 56: {
                    n14 = 27;
                    break;
                }
                case 57: {
                    n14 = 240;
                    break;
                }
                case 58: {
                    n14 = 19;
                    break;
                }
                case 59: {
                    n14 = 181;
                    break;
                }
                case 60: {
                    n14 = 231;
                    break;
                }
                case 61: {
                    n14 = 142;
                    break;
                }
                case 62: {
                    n14 = 62;
                    break;
                }
                case 63: {
                    n14 = 141;
                    break;
                }
                case 64: {
                    n14 = 94;
                    break;
                }
                case 65: {
                    n14 = 82;
                    break;
                }
                case 66: {
                    n14 = 190;
                    break;
                }
                case 67: {
                    n14 = 21;
                    break;
                }
                case 68: {
                    n14 = 107;
                    break;
                }
                case 69: {
                    n14 = 26;
                    break;
                }
                case 70: {
                    n14 = 70;
                    break;
                }
                case 71: {
                    n14 = 230;
                    break;
                }
                case 72: {
                    n14 = 212;
                    break;
                }
                case 73: {
                    n14 = 219;
                    break;
                }
                case 74: {
                    n14 = 36;
                    break;
                }
                case 75: {
                    n14 = 233;
                    break;
                }
                case 76: {
                    n14 = 133;
                    break;
                }
                case 77: {
                    n14 = 195;
                    break;
                }
                case 78: {
                    n14 = 8;
                    break;
                }
                case 79: {
                    n14 = 192;
                    break;
                }
                case 80: {
                    n14 = 25;
                    break;
                }
                case 81: {
                    n14 = 252;
                    break;
                }
                case 82: {
                    n14 = 170;
                    break;
                }
                case 83: {
                    n14 = 243;
                    break;
                }
                case 84: {
                    n14 = 102;
                    break;
                }
                case 85: {
                    n14 = 104;
                    break;
                }
                case 86: {
                    n14 = 144;
                    break;
                }
                case 87: {
                    n14 = 108;
                    break;
                }
                case 88: {
                    n14 = 202;
                    break;
                }
                case 89: {
                    n14 = 171;
                    break;
                }
                case 90: {
                    n14 = 226;
                    break;
                }
                case 91: {
                    n14 = 39;
                    break;
                }
                case 92: {
                    n14 = 56;
                    break;
                }
                case 93: {
                    n14 = 53;
                    break;
                }
                case 94: {
                    n14 = 244;
                    break;
                }
                case 95: {
                    n14 = 32;
                    break;
                }
                case 96: {
                    n14 = 23;
                    break;
                }
                case 97: {
                    n14 = 182;
                    break;
                }
                case 98: {
                    n14 = 89;
                    break;
                }
                case 99: {
                    n14 = 99;
                    break;
                }
                case 100: {
                    n14 = 6;
                    break;
                }
                case 101: {
                    n14 = 237;
                    break;
                }
                case 102: {
                    n14 = 74;
                    break;
                }
                case 103: {
                    n14 = 60;
                    break;
                }
                case 104: {
                    n14 = 111;
                    break;
                }
                case 105: {
                    n14 = 216;
                    break;
                }
                case 106: {
                    n14 = 159;
                    break;
                }
                case 107: {
                    n14 = 236;
                    break;
                }
                case 108: {
                    n14 = 88;
                    break;
                }
                case 109: {
                    n14 = 185;
                    break;
                }
                case 110: {
                    n14 = 218;
                    break;
                }
                case 111: {
                    n14 = 93;
                    break;
                }
                case 112: {
                    n14 = 246;
                    break;
                }
                case 113: {
                    n14 = 245;
                    break;
                }
                case 114: {
                    n14 = 114;
                    break;
                }
                case 115: {
                    n14 = 61;
                    break;
                }
                case 116: {
                    n14 = 96;
                    break;
                }
                case 117: {
                    n14 = 44;
                    break;
                }
                case 118: {
                    n14 = 222;
                    break;
                }
                case 119: {
                    n14 = 221;
                    break;
                }
                case 120: {
                    n14 = 10;
                    break;
                }
                case 121: {
                    n14 = 90;
                    break;
                }
                case 122: {
                    n14 = 234;
                    break;
                }
                case 123: {
                    n14 = 167;
                    break;
                }
                case 124: {
                    n14 = 205;
                    break;
                }
                case 125: {
                    n14 = 225;
                    break;
                }
                case 126: {
                    n14 = 146;
                    break;
                }
                case 127: {
                    n14 = 43;
                    break;
                }
                case 128: {
                    n14 = 30;
                    break;
                }
                case 129: {
                    n14 = 58;
                    break;
                }
                case 130: {
                    n14 = 75;
                    break;
                }
                case 131: {
                    n14 = 211;
                    break;
                }
                case 132: {
                    n14 = 229;
                    break;
                }
                case 133: {
                    n14 = 48;
                    break;
                }
                case 134: {
                    n14 = 213;
                    break;
                }
                case 135: {
                    n14 = 46;
                    break;
                }
                case 136: {
                    n14 = 79;
                    break;
                }
                case 137: {
                    n14 = 106;
                    break;
                }
                case 138: {
                    n14 = 120;
                    break;
                }
                case 139: {
                    n14 = 113;
                    break;
                }
                case 140: {
                    n14 = 136;
                    break;
                }
                case 141: {
                    n14 = 239;
                    break;
                }
                case 142: {
                    n14 = 95;
                    break;
                }
                case 143: {
                    n14 = 145;
                    break;
                }
                case 144: {
                    n14 = 149;
                    break;
                }
                case 145: {
                    n14 = 47;
                    break;
                }
                case 146: {
                    n14 = 130;
                    break;
                }
                case 147: {
                    n14 = 84;
                    break;
                }
                case 148: {
                    n14 = 132;
                    break;
                }
                case 149: {
                    n14 = 87;
                    break;
                }
                case 150: {
                    n14 = 15;
                    break;
                }
                case 151: {
                    n14 = 37;
                    break;
                }
                case 152: {
                    n14 = 16;
                    break;
                }
                case 153: {
                    n14 = 49;
                    break;
                }
                case 154: {
                    n14 = 13;
                    break;
                }
                case 155: {
                    n14 = 116;
                    break;
                }
                case 156: {
                    n14 = 152;
                    break;
                }
                case 157: {
                    n14 = 176;
                    break;
                }
                case 158: {
                    n14 = 35;
                    break;
                }
                case 159: {
                    n14 = 169;
                    break;
                }
                case 160: {
                    n14 = 163;
                    break;
                }
                case 161: {
                    n14 = 164;
                    break;
                }
                case 162: {
                    n14 = 2;
                    break;
                }
                case 163: {
                    n14 = 34;
                    break;
                }
                case 164: {
                    n14 = 17;
                    break;
                }
                case 165: {
                    n14 = 173;
                    break;
                }
                case 166: {
                    n14 = 140;
                    break;
                }
                case 167: {
                    n14 = 51;
                    break;
                }
                case 168: {
                    n14 = 209;
                    break;
                }
                case 169: {
                    n14 = 122;
                    break;
                }
                case 170: {
                    n14 = 193;
                    break;
                }
                case 171: {
                    n14 = 97;
                    break;
                }
                case 172: {
                    n14 = 196;
                    break;
                }
                case 173: {
                    n14 = 119;
                    break;
                }
                case 174: {
                    n14 = 153;
                    break;
                }
                case 175: {
                    n14 = 137;
                    break;
                }
                case 176: {
                    n14 = 22;
                    break;
                }
                case 177: {
                    n14 = 215;
                    break;
                }
                case 178: {
                    n14 = 124;
                    break;
                }
                case 179: {
                    n14 = 68;
                    break;
                }
                case 180: {
                    n14 = 235;
                    break;
                }
                case 181: {
                    n14 = 172;
                    break;
                }
                case 182: {
                    n14 = 187;
                    break;
                }
                case 183: {
                    n14 = 201;
                    break;
                }
                case 184: {
                    n14 = 162;
                    break;
                }
                case 185: {
                    n14 = 63;
                    break;
                }
                case 186: {
                    n14 = 42;
                    break;
                }
                case 187: {
                    n14 = 208;
                    break;
                }
                case 188: {
                    n14 = 156;
                    break;
                }
                case 189: {
                    n14 = 91;
                    break;
                }
                case 190: {
                    n14 = 92;
                    break;
                }
                case 191: {
                    n14 = 50;
                    break;
                }
                case 192: {
                    n14 = 188;
                    break;
                }
                case 193: {
                    n14 = 189;
                    break;
                }
                case 194: {
                    n14 = 223;
                    break;
                }
                case 195: {
                    n14 = 83;
                    break;
                }
                case 196: {
                    n14 = 207;
                    break;
                }
                case 197: {
                    n14 = 71;
                    break;
                }
                case 198: {
                    n14 = 199;
                    break;
                }
                case 199: {
                    n14 = 29;
                    break;
                }
                case 200: {
                    n14 = 247;
                    break;
                }
                case 201: {
                    n14 = 57;
                    break;
                }
                case 202: {
                    n14 = 186;
                    break;
                }
                case 203: {
                    n14 = 177;
                    break;
                }
                case 204: {
                    n14 = 125;
                    break;
                }
                case 205: {
                    n14 = 103;
                    break;
                }
                case 206: {
                    n14 = 135;
                    break;
                }
                case 207: {
                    n14 = 232;
                    break;
                }
                case 208: {
                    n14 = 154;
                    break;
                }
                case 209: {
                    n14 = 12;
                    break;
                }
                case 210: {
                    n14 = 1;
                    break;
                }
                case 211: {
                    n14 = 123;
                    break;
                }
                case 212: {
                    n14 = 139;
                    break;
                }
                case 213: {
                    n14 = 241;
                    break;
                }
                case 214: {
                    n14 = 45;
                    break;
                }
                case 215: {
                    n14 = 59;
                    break;
                }
                case 216: {
                    n14 = 76;
                    break;
                }
                case 217: {
                    n14 = 179;
                    break;
                }
                case 218: {
                    n14 = 38;
                    break;
                }
                case 219: {
                    n14 = 157;
                    break;
                }
                case 220: {
                    n14 = 155;
                    break;
                }
                case 221: {
                    n14 = 165;
                    break;
                }
                case 222: {
                    n14 = 28;
                    break;
                }
                case 223: {
                    n14 = 128;
                    break;
                }
                case 224: {
                    n14 = 54;
                    break;
                }
                case 225: {
                    n14 = 0;
                    break;
                }
                case 226: {
                    n14 = 210;
                    break;
                }
                case 227: {
                    n14 = 147;
                    break;
                }
                case 228: {
                    n14 = 112;
                    break;
                }
                case 229: {
                    n14 = 109;
                    break;
                }
                case 230: {
                    n14 = 4;
                    break;
                }
                case 231: {
                    n14 = 11;
                    break;
                }
                case 232: {
                    n14 = 33;
                    break;
                }
                case 233: {
                    n14 = 251;
                    break;
                }
                case 234: {
                    n14 = 242;
                    break;
                }
                case 235: {
                    n14 = 198;
                    break;
                }
                case 236: {
                    n14 = 194;
                    break;
                }
                case 237: {
                    n14 = 238;
                    break;
                }
                case 238: {
                    n14 = 85;
                    break;
                }
                case 239: {
                    n14 = 138;
                    break;
                }
                case 240: {
                    n14 = 64;
                    break;
                }
                case 241: {
                    n14 = 228;
                    break;
                }
                case 242: {
                    n14 = 168;
                    break;
                }
                case 243: {
                    n14 = 166;
                    break;
                }
                case 244: {
                    n14 = 220;
                    break;
                }
                case 245: {
                    n14 = 65;
                    break;
                }
                case 246: {
                    n14 = 127;
                    break;
                }
                case 247: {
                    n14 = 41;
                    break;
                }
                case 248: {
                    n14 = 118;
                    break;
                }
                case 249: {
                    n14 = 86;
                    break;
                }
                case 250: {
                    n14 = 160;
                    break;
                }
                case 251: {
                    n14 = 77;
                    break;
                }
                case 252: {
                    n14 = 67;
                    break;
                }
                case 253: {
                    n14 = 178;
                    break;
                }
                case 254: {
                    n14 = 100;
                    break;
                }
                default: {
                    n14 = 175;
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
            xx_0.g[n12] = new String(cArray).intern();
        }
        return g[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3D;
        if (D[n11] == null) {
            xx_0.D[n11] = (int)(C[n11] ^ l2);
        }
        return D[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x620D) & Short.MAX_VALUE;
        if (F[n11] == null) {
            xx_0.F[n11] = E[n11] ^ l2;
        }
        return F[n11];
    }
}

