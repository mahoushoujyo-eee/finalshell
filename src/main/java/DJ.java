/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.LambdaMetafactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapAddress;
import org.pcap4j.core.PcapDumper;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DJ {
    private static final int Y;
    private static final boolean w;
    private static final String Q;
    private static final int P;
    private static final int x;
    private static final int I;
    private static final boolean i;
    private static final SimpleDateFormat D;
    private static final String p;
    private static final String[] a;
    private static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[53];
                        var11_1 = 0;
                        var10_2 = "`\u00df\u00c3q\u00e3\u001b\u00c9\u00b8]\u00d4\u001f1\u000f\u00e7\u0096#?M\u00c2\u0016\u00fa\u00f3\u00c15s8\"\u00d6auT\u0016\u00e0\u00b4\u0094\u00cb\u001d\u00d3U\u0098\u00f4\u0087x\u00faV\u00b9\u00a5\f:\u0080\u0010Hd\\\u007fE<\u00b5*\u00a5\u0013\u0090\u00da\u00f8\u00fe\u00bd>\\|\td\u00a4\nI\\`4\u0018\u00c4\u0092d\u008e\u0018]\u0097\u0088:\u00e4&\u00fb\u009c\u009d\u00d0wD@\u0000\t\u009f\u0003\u0094E\u0093\u001c\u0005\u0085&\r\u00ca\b\u0086\u00cf\u00dc\u0001\u0002\u009f,\u00cd\u0010M\u00a1\u0011\u0089\u00bda\u007f\u00b6\u009c\u0007\u0091nv\u008f\u001a(>\u00ff4y\n\u00cc\u00e8\u00f9N\u00ae8\u0016\u00ccV\u007f@\u0019\u00846\\\u00ee{\u00b6\u0098\u00fc\u001c\u00b0j~\u00c6\u00ce\f\u00b2\u00aa\u000f\u00bf\u00dd\r\ft\u0086\u00ef\u00e3\u00b3 \u00b1\u00ba\u0004tG\u0094\u009f\u00c6:\u001f\u00b5\\u\u008b:M\u0019X:\u00d8`\u00ee0\u008e\u00e7&>\u00d5]\u009fgtS\u009ap\u0007\u009bQ\u008d\u009a\u00851\u0015\u0004\u00d5\u00c1\b\u009e\u000bw\u00981\u00dd*C\u00dc\u00d7\u00f7\u00c4k\u0004\u00daAx\u00e0\u0005\u0082\u0013\u00a8\u00ed\u00af\u0005Z\u001c\u00b3\f\u00cc\u0015\fu\u0007\u00c9\u00f1D\n\u0012\u009b\u0081\u008b\u008fg\u00bd>DR~u\u000e\u0007\u0005\u00a34~\u00fa\u00a5\u0005\u0002\u0092\u0090\u00d0\u0084B\u008cj,\u00ae*\u0084R\u00a4\u00c5v\u00d1*\u00a4R\u00ac\u00c3\u00f0\u0098\u00ab o\\\u00a6\u00a6\u00ea\b\f\u0004\u00b0\u0015Q\u0090\u009d\u00ca\u00df\u00e5`\u00d9\u00f7\u0089\u00c2\u00d5\u00ee\u00ca\u00b8\u0007\u00bc\u00d3))\u008fs~\u00c2|8!\u0002.\u008c\u008d!\u00b3\u0095Q4\u0003\u000e>\u0095\u001e9E\u0002l\u00f2S\u00d3S\u001eO\u0007[V\u00a8\u00ca\u00ac\u00f3@\u009f\u00d6~\u00e3\u00abY\u00b1\u0099\u00e8\u00be$\u00b3\u0012rr\u00b5\u0080\u00ce\u00f5\u00be\u00b75\u00dby\u0098\u00ad\u00aaa\u00f2`j:\u00b7]\u00023\u009fU\u00bd\u00e6%hy(\u00bf\u00b8\"p!\u00ba\u00d8\u009fs\tn\u00f3\u00cd\u00e2#\u001f\u00ac\u00afNa5\u0085\u00c7\r\u0099\u008b\u001c\u0016\u00ea\u0006|\u00c2\u0096z\u00ae\u00dfq)r\u00e2\u00c9M\u00a1\u00c9\u009a?\u00034\u00b9V\u001cy\u00d2\u00a9=$\u00da\u00b0\u00c1\u00c4\u00f7t\u00c4t\u00d8U@\u0000O\u00fc\u00cd\u00f5\u000e\u00e7\u00ce\u00d0vD\u00d9\u0005rs\u00fa\u00b3z\u000f\u00a9\u00bb\u00a1\u00d6\u00f5\u0087\u0011\n`\u0089[\u00f2\u0018\u0081m\u001a\u00f4\u00f9*\u00fe\u00a5\u00ed\u0011\u00c6b\u00b8ef\u0005\u00a7@\u0091\u00eb\u00b7\u00b8GT=\u0093\u00d5@\u00fd \u00daL~M}w\"\u00d7 \u00df\u00c0I\u00ae\u00ea\u00d5\u00e4\u0010I\u00e3\u00f7\u00f1\u00c7Z\u00dd\u008f\t/\u00ac\u00dc\u00f1\u0089\u00cd\u0019rR[\b\u00cd\u00c5\u00ef\u00b1\u0003$\u000f\u00ae\u00c7_\u001a\u0005\u00b3\u00e9\u00cf\u0089Yb\u00caW\u0098Qn\u009e\u00f4\u00f5$\u008ah\u00ffJ\u00f5\u00c3\u00f2]\u00cd0a\u00cb\u00f5\u0018\u00b5\u0003\u008ai\u0084*\u00eby'\u0099\u00c7\u000f\u00d6\u0019\u008f\u00d3~\u00f5\u00d2\u0098\u00e5/\u00e9B\u00f5BcA\u00baO\u000f\u001a\u00e7\u00a8\u00009`\u00dd\u0018u\u00ff\u00fe\u0018\u00b8R\u00f5\u0087|\u0099\u00e1?\u00beM\u0003h=3\u0007\u0093(u\u00cd:<e\u0002m\u00dd\u0098\u00c7\u009d\u00d5\u008e\u0018_;\u00a8\u0010X\u00cc\u00f7\u00c9(^]8\u00ad\u00ecI\u00bd_\u0090-\u008b\u0089\u00de<\u00833\u0011&\u0016\u00bc\u00d2\u00f1[\u00b8F9\u0005i\u00c2\u008e\u0000\u0005I\u00fc\u00b6\u000b\u00e6\u001f\b\u00de\u00b9F+\u00d6\u000b\u0012\u00de\u0005\u0001\u00d7\u0094'\u00b7\u0017\u00d0\u00ac\u000f\u00d7G>\u00be\u00ce)\u00cbJSo\u00e0\u000f\u00f2\u0011\u0017\u009bV\u00d3\u0099\u009b\t\u00d3*\u0084\u00f5\u00a4\u00dc1\u00f6f\u0004huN\u00f6\u000b\u00c9\u001d\u00e6m\u00d0U\u0083\u0015\u001c\u009c\u0016\u0003Q\u00a7\u00fa\u0007\u0093#\u00a8\u00d4\u0001\u00f8\u00a1\u000f#\u001a\u00f0\u00e2\u00df\u0001T\u00da\u00c8\u0093N\u00b1\u00ba\u00e99\u0007/\bQ\u00dc\u000f\u0011\u0011\b\u008a\u00e7\u00cc\u00e0\u0087r8\u00f1A\u00bd\u0014\u0092\n\r\bM\u0017\u00c5=\u0012\u009aG\u0090\r\u009a\u00fc\u00dc5mD\u00f7\u000e\u00d7\u008a\u00c9\u0092B\u00a35\u00eau\u0003\u00f4\u00ba\u00fb\u00db\u00bcqk\u00d9\u000b:\u00e7o\u00d4\u0085\u0013\u00c3\u00a3\u0006\u00d95c\\rX\u0092\u00f6\\\u00d3\u00bf\u0096H\u0083\u0011]T-\u00ed\u00b4\u00c0\u00a2\u0082\u008b\u0092;\u00dd\u0093\u00deV?u#\u00e9\u001a\u00b8\u0082\u00bal\u001c~\u0090\f\u0018}\u00ef\u00d5\u0089\u00e6\u00a4V\u00dc\u00e3\u0088jA\u0091z}\u0088\ff>\u0019\u00c9\u0006 XL\u0082\u0097\u0087=gc\u00e9i\u00fa\u0086}[v\u009aq\u00bf\u000b\u00c5\u00bax\u00d8\u00cd1/A\u00edU\u008c0\u00ff\u00c44E\u0087\u00c9\u00b4\u001bQ\u007f\u0006\u009db\u0093\u0093IT!\u00d5dV\u00f5\u009e\u00e0\u00003\u0088\u00a1\u0098\u000b\u00b6\u00fcF\u00ae\u0003\u00f2\u009d\u008a\u00ed\u00f2d\u0091y\u001f(2x\u0013h\u001f\u00a0\u00afz\u0097\u00a0\u00a5W\u00da>\u00eeB\u00e9\u00fa'B4\u009a\f\u00c5U?zJ1u\u0088w;Q%\u0007\u00ea\u008a\u00a3\u00e1@^\u00ad\u0018\u0080\u0015\u00df(`0\u00b9\u00ddRh\u00df\u00b3\rV\u00c4\u0095W\u0017\u00deZH\u0090\u00c0\u00b5\u0006\u00c5\u00da\n\u00fd\u0094L3\r \u001aA<#\u0017 R\u00d7\u00e7V \u00bc F\u00bb\u000e)K\u00ad~' ,\u0000\u00f0\u00dc\u00d9\u00c6P\u0012U+N\u00c2\u00b8=f[+\u0016E<\u00ce\u00846P\u00bea\u0097";
                        var12_3 = "`\u00df\u00c3q\u00e3\u001b\u00c9\u00b8]\u00d4\u001f1\u000f\u00e7\u0096#?M\u00c2\u0016\u00fa\u00f3\u00c15s8\"\u00d6auT\u0016\u00e0\u00b4\u0094\u00cb\u001d\u00d3U\u0098\u00f4\u0087x\u00faV\u00b9\u00a5\f:\u0080\u0010Hd\\\u007fE<\u00b5*\u00a5\u0013\u0090\u00da\u00f8\u00fe\u00bd>\\|\td\u00a4\nI\\`4\u0018\u00c4\u0092d\u008e\u0018]\u0097\u0088:\u00e4&\u00fb\u009c\u009d\u00d0wD@\u0000\t\u009f\u0003\u0094E\u0093\u001c\u0005\u0085&\r\u00ca\b\u0086\u00cf\u00dc\u0001\u0002\u009f,\u00cd\u0010M\u00a1\u0011\u0089\u00bda\u007f\u00b6\u009c\u0007\u0091nv\u008f\u001a(>\u00ff4y\n\u00cc\u00e8\u00f9N\u00ae8\u0016\u00ccV\u007f@\u0019\u00846\\\u00ee{\u00b6\u0098\u00fc\u001c\u00b0j~\u00c6\u00ce\f\u00b2\u00aa\u000f\u00bf\u00dd\r\ft\u0086\u00ef\u00e3\u00b3 \u00b1\u00ba\u0004tG\u0094\u009f\u00c6:\u001f\u00b5\\u\u008b:M\u0019X:\u00d8`\u00ee0\u008e\u00e7&>\u00d5]\u009fgtS\u009ap\u0007\u009bQ\u008d\u009a\u00851\u0015\u0004\u00d5\u00c1\b\u009e\u000bw\u00981\u00dd*C\u00dc\u00d7\u00f7\u00c4k\u0004\u00daAx\u00e0\u0005\u0082\u0013\u00a8\u00ed\u00af\u0005Z\u001c\u00b3\f\u00cc\u0015\fu\u0007\u00c9\u00f1D\n\u0012\u009b\u0081\u008b\u008fg\u00bd>DR~u\u000e\u0007\u0005\u00a34~\u00fa\u00a5\u0005\u0002\u0092\u0090\u00d0\u0084B\u008cj,\u00ae*\u0084R\u00a4\u00c5v\u00d1*\u00a4R\u00ac\u00c3\u00f0\u0098\u00ab o\\\u00a6\u00a6\u00ea\b\f\u0004\u00b0\u0015Q\u0090\u009d\u00ca\u00df\u00e5`\u00d9\u00f7\u0089\u00c2\u00d5\u00ee\u00ca\u00b8\u0007\u00bc\u00d3))\u008fs~\u00c2|8!\u0002.\u008c\u008d!\u00b3\u0095Q4\u0003\u000e>\u0095\u001e9E\u0002l\u00f2S\u00d3S\u001eO\u0007[V\u00a8\u00ca\u00ac\u00f3@\u009f\u00d6~\u00e3\u00abY\u00b1\u0099\u00e8\u00be$\u00b3\u0012rr\u00b5\u0080\u00ce\u00f5\u00be\u00b75\u00dby\u0098\u00ad\u00aaa\u00f2`j:\u00b7]\u00023\u009fU\u00bd\u00e6%hy(\u00bf\u00b8\"p!\u00ba\u00d8\u009fs\tn\u00f3\u00cd\u00e2#\u001f\u00ac\u00afNa5\u0085\u00c7\r\u0099\u008b\u001c\u0016\u00ea\u0006|\u00c2\u0096z\u00ae\u00dfq)r\u00e2\u00c9M\u00a1\u00c9\u009a?\u00034\u00b9V\u001cy\u00d2\u00a9=$\u00da\u00b0\u00c1\u00c4\u00f7t\u00c4t\u00d8U@\u0000O\u00fc\u00cd\u00f5\u000e\u00e7\u00ce\u00d0vD\u00d9\u0005rs\u00fa\u00b3z\u000f\u00a9\u00bb\u00a1\u00d6\u00f5\u0087\u0011\n`\u0089[\u00f2\u0018\u0081m\u001a\u00f4\u00f9*\u00fe\u00a5\u00ed\u0011\u00c6b\u00b8ef\u0005\u00a7@\u0091\u00eb\u00b7\u00b8GT=\u0093\u00d5@\u00fd \u00daL~M}w\"\u00d7 \u00df\u00c0I\u00ae\u00ea\u00d5\u00e4\u0010I\u00e3\u00f7\u00f1\u00c7Z\u00dd\u008f\t/\u00ac\u00dc\u00f1\u0089\u00cd\u0019rR[\b\u00cd\u00c5\u00ef\u00b1\u0003$\u000f\u00ae\u00c7_\u001a\u0005\u00b3\u00e9\u00cf\u0089Yb\u00caW\u0098Qn\u009e\u00f4\u00f5$\u008ah\u00ffJ\u00f5\u00c3\u00f2]\u00cd0a\u00cb\u00f5\u0018\u00b5\u0003\u008ai\u0084*\u00eby'\u0099\u00c7\u000f\u00d6\u0019\u008f\u00d3~\u00f5\u00d2\u0098\u00e5/\u00e9B\u00f5BcA\u00baO\u000f\u001a\u00e7\u00a8\u00009`\u00dd\u0018u\u00ff\u00fe\u0018\u00b8R\u00f5\u0087|\u0099\u00e1?\u00beM\u0003h=3\u0007\u0093(u\u00cd:<e\u0002m\u00dd\u0098\u00c7\u009d\u00d5\u008e\u0018_;\u00a8\u0010X\u00cc\u00f7\u00c9(^]8\u00ad\u00ecI\u00bd_\u0090-\u008b\u0089\u00de<\u00833\u0011&\u0016\u00bc\u00d2\u00f1[\u00b8F9\u0005i\u00c2\u008e\u0000\u0005I\u00fc\u00b6\u000b\u00e6\u001f\b\u00de\u00b9F+\u00d6\u000b\u0012\u00de\u0005\u0001\u00d7\u0094'\u00b7\u0017\u00d0\u00ac\u000f\u00d7G>\u00be\u00ce)\u00cbJSo\u00e0\u000f\u00f2\u0011\u0017\u009bV\u00d3\u0099\u009b\t\u00d3*\u0084\u00f5\u00a4\u00dc1\u00f6f\u0004huN\u00f6\u000b\u00c9\u001d\u00e6m\u00d0U\u0083\u0015\u001c\u009c\u0016\u0003Q\u00a7\u00fa\u0007\u0093#\u00a8\u00d4\u0001\u00f8\u00a1\u000f#\u001a\u00f0\u00e2\u00df\u0001T\u00da\u00c8\u0093N\u00b1\u00ba\u00e99\u0007/\bQ\u00dc\u000f\u0011\u0011\b\u008a\u00e7\u00cc\u00e0\u0087r8\u00f1A\u00bd\u0014\u0092\n\r\bM\u0017\u00c5=\u0012\u009aG\u0090\r\u009a\u00fc\u00dc5mD\u00f7\u000e\u00d7\u008a\u00c9\u0092B\u00a35\u00eau\u0003\u00f4\u00ba\u00fb\u00db\u00bcqk\u00d9\u000b:\u00e7o\u00d4\u0085\u0013\u00c3\u00a3\u0006\u00d95c\\rX\u0092\u00f6\\\u00d3\u00bf\u0096H\u0083\u0011]T-\u00ed\u00b4\u00c0\u00a2\u0082\u008b\u0092;\u00dd\u0093\u00deV?u#\u00e9\u001a\u00b8\u0082\u00bal\u001c~\u0090\f\u0018}\u00ef\u00d5\u0089\u00e6\u00a4V\u00dc\u00e3\u0088jA\u0091z}\u0088\ff>\u0019\u00c9\u0006 XL\u0082\u0097\u0087=gc\u00e9i\u00fa\u0086}[v\u009aq\u00bf\u000b\u00c5\u00bax\u00d8\u00cd1/A\u00edU\u008c0\u00ff\u00c44E\u0087\u00c9\u00b4\u001bQ\u007f\u0006\u009db\u0093\u0093IT!\u00d5dV\u00f5\u009e\u00e0\u00003\u0088\u00a1\u0098\u000b\u00b6\u00fcF\u00ae\u0003\u00f2\u009d\u008a\u00ed\u00f2d\u0091y\u001f(2x\u0013h\u001f\u00a0\u00afz\u0097\u00a0\u00a5W\u00da>\u00eeB\u00e9\u00fa'B4\u009a\f\u00c5U?zJ1u\u0088w;Q%\u0007\u00ea\u008a\u00a3\u00e1@^\u00ad\u0018\u0080\u0015\u00df(`0\u00b9\u00ddRh\u00df\u00b3\rV\u00c4\u0095W\u0017\u00deZH\u0090\u00c0\u00b5\u0006\u00c5\u00da\n\u00fd\u0094L3\r \u001aA<#\u0017 R\u00d7\u00e7V \u00bc F\u00bb\u000e)K\u00ad~' ,\u0000\u00f0\u00dc\u00d9\u00c6P\u0012U+N\u00c2\u00b8=f[+\u0016E<\u00ce\u00846P\u00bea\u0097".length();
                        var9_4 = 25;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 13;
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
                            var10_2 = "Y\u00dd\u00e4`\f\u0019\u001d\u00d9\u000e\u00eb\u00c2<\u008b#&\u00a6\u00fb";
                            var12_3 = "Y\u00dd\u00e4`\f\u0019\u001d\u00d9\u000e\u00eb\u00c2<\u008b#&\u00a6\u00fb".length();
                            var9_4 = 4;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 55;
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
                                    v15 = 16;
                                    break;
                                }
                                case 1: {
                                    v15 = 79;
                                    break;
                                }
                                case 2: {
                                    v15 = 44;
                                    break;
                                }
                                case 3: {
                                    v15 = 38;
                                    break;
                                }
                                case 4: {
                                    v15 = 60;
                                    break;
                                }
                                case 5: {
                                    v15 = 17;
                                    break;
                                }
                                default: {
                                    v15 = 1;
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
                DJ.a = var13;
                DJ.b = new String[53];
                var1_7 = 6274525002612250120L;
                var0_8 = new long[4];
                var4_9 = 0;
                var5_10 = "a7\u008a\u00f1\u00fb\u0002\u0096\u0002\u00d2\\\u00df\u00cf\u0084\u00fdi\u00f7";
                var6_11 = "a7\u008a\u00f1\u00fb\u0002\u0096\u0002\u00d2\\\u00df\u00cf\u0084\u00fdi\u00f7".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v17 = var0_8;
                    v18 = var4_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "I\u00f5\u008e\u008f\u00fb\u0002\u0096pp\u0006\u00a0\u00b4\u00fb\u0003\u0096\b";
                    var6_11 = "I\u00f5\u008e\u008f\u00fb\u0002\u0096pp\u0006\u00a0\u00b4\u00fb\u0003\u0096\b".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v17 = var0_8;
                        v18 = var4_9++;
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
                    if (var3_12 < var6_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var1_7;
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
        DJ.Y = Integer.getInteger("count", (int)var0_8[1]);
        DJ.w = Boolean.getBoolean("quiet");
        DJ.Q = System.getProperty("intf", "");
        DJ.P = Integer.getInteger("run", (int)var0_8[2]);
        DJ.x = Integer.getInteger("readTimeout", (int)var0_8[0]);
        DJ.I = Integer.getInteger("snaplen", (int)var0_8[3]);
        DJ.i = Boolean.getBoolean("timestampPrecision.nano");
        DJ.D = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
        DJ.p = System.getProperty("pcapFile", "Dump" + DJ.D.format(new Date()) + ".pcap");
    }

    private DJ() {
    }

    static void a() {
        System.out.println("============Usage=============");
        System.out.println("You can set other attributes as -D:");
        System.out.println(String.format("\t%-20s -> %s", "count", "Packets numbers. Not supported Anymore. use -Drun. "));
        System.out.println(String.format("\t%-20s -> %s", "readTimeout", "Read timeout in ms"));
        System.out.println(String.format("\t%-20s -> %s", "snaplen", "SnapLen"));
        System.out.println(String.format("\t%-20s -> %s", "run", "How long in seconds to run"));
        System.out.println(String.format("\t%-20s -> %s", "quiet", "Run in quiet mode? if it's true, you should set the - intf"));
        System.out.println(String.format("\t%-20s -> %s", "intf", "Set the network interface"));
        System.out.println(String.format("\t%-20s -> %s", "pcapFile", "Set the output file path"));
        System.out.println("============Usage=============");
    }

    /*
     * Unable to fully structure code
     */
    public static void main(String[] var0) throws PcapNativeException, NotOpenException, IOException {
        block57: {
            block61: {
                block55: {
                    block54: {
                        block52: {
                            block53: {
                                block63: {
                                    block51: {
                                        block50: {
                                            var1_1 = xQ.B();
                                            v0 = var0;
                                            if (var1_1 == null) break block50;
                                            try {
                                                block62: {
                                                    if (v0.length == 0) break block51;
                                                    break block62;
                                                    catch (Exception v1) {
                                                        throw DJ.a(v1);
                                                    }
                                                }
                                                v0 = var0;
                                            }
                                            catch (Exception v2) {
                                                throw DJ.a(v2);
                                            }
                                        }
                                        v3 = v0[0];
                                        break block63;
                                    }
                                    v3 = "";
                                }
                                var2_2 = v3;
                                v4 = var2_2;
                                if (var1_1 == null) break block52;
                                try {
                                    block64: {
                                        if (!v4.isEmpty()) break block53;
                                        break block64;
                                        catch (Exception v5) {
                                            throw DJ.a(v5);
                                        }
                                    }
                                    System.out.println("You Should set the filter expression as the first argument");
                                    System.out.println("The filter expression is same with the capture filter in the Wireshark or tcpdump");
                                    DJ.a();
                                    return;
                                }
                                catch (Exception v6) {
                                    throw DJ.a(v6);
                                }
                            }
                            v4 = System.getProperty("quiet");
                        }
                        try {
                            if (v4 == null) {
                                System.out.println("Must set whether this is in a quiet mode. use -Dquiet=true|false");
                                DJ.a();
                                return;
                            }
                        }
                        catch (Exception v7) {
                            throw DJ.a(v7);
                        }
                        try {
                            System.out.println("readTimeout: " + DJ.x);
                            System.out.println("snaplen: " + DJ.I);
                            System.out.println("timestampPrecision.nano: " + DJ.i);
                            System.out.println("run: " + DJ.P);
                            System.out.println("quiet: " + DJ.w);
                            System.out.println("intf: " + DJ.Q);
                            System.out.println("Filter is " + var2_2);
                            System.out.println("\n");
                            v8 = DJ.w;
                            if (var1_1 == null) break block54;
                            if (v8) {
                            }
                            ** GOTO lbl67
                        }
                        catch (Exception v9) {
                            throw DJ.a(v9);
                        }
                        var3_3 = DJ.o(DJ.Q);
                        if (var1_1 != null) break block55;
lbl67:
                        // 2 sources

                        try {
                            block65: {
                                v10 = DJ.Q;
                                if (var1_1 == null) ** GOTO lbl87
                                break block65;
                                catch (Exception v11) {
                                    throw DJ.a(v11);
                                }
                            }
                            v8 = v10.isEmpty();
                        }
                        catch (Exception v12) {
                            throw DJ.a(v12);
                        }
                    }
                    if (v8) {
                        try {
                            var3_3 = DJ.n();
                        }
                        catch (Exception var4_4) {
                            var4_4.printStackTrace();
                            return;
                        }
                    } else {
                        v10 = DJ.Q;
lbl87:
                        // 2 sources

                        var3_3 = DJ.o(v10);
                    }
                }
                try {
                    if (var3_3 == null) {
                        System.out.println("No interfaces found, make sure your set the correct libpcap files");
                        return;
                    }
                }
                catch (Exception v13) {
                    throw DJ.a(v13);
                }
                System.out.println(var3_3.getName() + "(" + var3_3.getDescription() + ")");
                var4_5 = new PcapHandle.Builder(var3_3.getName()).snaplen(DJ.I).promiscuousMode(PcapNetworkInterface.PromiscuousMode.PROMISCUOUS).timeoutMillis(DJ.x);
                try {
                    if (DJ.i) {
                        var4_5.timestampPrecision(PcapHandle.TimestampPrecision.NANO);
                    }
                }
                catch (Exception v14) {
                    throw DJ.a(v14);
                }
                var5_6 = var4_5.build();
                var5_6.setFilter(var2_2, BpfProgram.BpfCompileMode.OPTIMIZE);
                Runtime.getRuntime().addShutdownHook(new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$0(), ()V)()));
                var6_7 = new CountDownLatch(1);
                var7_8 = new AtomicReference<V>();
                var8_9 = new Thread(new VP(var5_6, var6_7, var7_8));
                var8_9.start();
                try {
                    try {
                        var6_7.await(DJ.P, TimeUnit.SECONDS);
                    }
                    catch (InterruptedException var9_10) {
                        block58: {
                            var8_9.interrupt();
                            var11_11 = (PcapDumper)var7_8.get();
                            try {
                                if (var1_1 == null) break block57;
                                if (var11_11 == null) break block58;
                            }
                            catch (Exception v15) {
                                throw DJ.a(v15);
                            }
                            try {
                                var11_11.close();
                            }
                            catch (Exception var12_14) {
                                // empty catch block
                            }
                        }
                        try {
                            var5_6.close();
                        }
                        catch (Exception var12_15) {}
                        break block57;
                    }
                }
                catch (Throwable var10_20) {
                    block59: {
                        block60: {
                            var8_9.interrupt();
                            var11_12 = (PcapDumper)var7_8.get();
                            try {
                                if (var1_1 == null) break block59;
                                if (var11_12 == null) break block60;
                            }
                            catch (Exception v16) {
                                throw DJ.a(v16);
                            }
                            try {
                                var11_12.close();
                            }
                            catch (Exception var12_16) {
                                // empty catch block
                            }
                        }
                        try {
                            var5_6.close();
                        }
                        catch (Exception var12_17) {
                            // empty catch block
                        }
                    }
                    throw var10_20;
                }
                var8_9.interrupt();
                var11_13 = (PcapDumper)var7_8.get();
                try {
                    if (var1_1 == null) break block57;
                    if (var11_13 == null) break block61;
                }
                catch (Exception v17) {
                    throw DJ.a(v17);
                }
                try {
                    var11_13.close();
                }
                catch (Exception var12_18) {
                    // empty catch block
                }
            }
            try {
                var5_6.close();
            }
            catch (Exception var12_19) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static PcapNetworkInterface n() throws Exception {
        var1 = DJ.e();
        var0_1 = xQ.B();
        DJ.A();
        var2_2 = 0;
        while (true) {
            block18: {
                block17: {
                    DJ.s(String.format("Select a device number ( 0 - %d) to capture packets, or enter 'q' to quit > ", new Object[]{var1.size() - 1}));
                    var3_3 = DJ.A();
                    if (var3_3 != null) break block17;
                    try {
                        block19: {
                            if (var0_1 == null) ** GOTO lbl36
                            break block19;
                            catch (NumberFormatException v0) {
                                throw DJ.a(v0);
                            }
                        }
                        if (var0_1 != null) continue;
                    }
                    catch (NumberFormatException v1) {
                        throw DJ.a(v1);
                    }
                }
                v2 = var3_3.equals("q");
                if (var0_1 == null) ** GOTO lbl43
                try {
                    block20: {
                        if (v2 == 0) break block18;
                        break block20;
                        catch (NumberFormatException v3) {
                            throw DJ.a(v3);
                        }
                    }
                    return null;
                }
                catch (NumberFormatException v4) {
                    throw DJ.a(v4);
                }
            }
            try {
                var2_2 = Integer.parseInt(var3_3);
lbl36:
                // 2 sources

                try {
                    if (var0_1 == null) continue;
                    v2 = var2_2;
                }
                catch (NumberFormatException v5) {
                    throw DJ.a(v5);
                }
lbl43:
                // 3 sources

                if (v2 < 0) ** GOTO lbl49
                try {
                    block21: {
                        if (var2_2 < var1.size()) break;
                        break block21;
                        catch (NumberFormatException v6) {
                            throw DJ.a(v6);
                        }
                    }
                    DJ.s("Invalid input.");
                    continue;
                }
                catch (NumberFormatException v7) {
                    throw DJ.a(v7);
                }
            }
            catch (NumberFormatException var4_4) {
                DJ.s("Invalid input.");
                if (var0_1 == null) break;
                continue;
            }
            break;
        }
        return (PcapNetworkInterface)var1.get(var2_2);
    }

    protected static void s(String string) throws IOException {
        System.out.print(string);
    }

    protected static String A() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static List e() throws IOException {
        List<PcapNetworkInterface> list;
        List<PcapNetworkInterface> list2;
        block9: {
            String[] stringArray;
            block8: {
                list2 = null;
                stringArray = xQ.B();
                try {
                    list2 = Pcaps.findAllDevs();
                }
                catch (PcapNativeException pcapNativeException) {
                    throw new IOException(pcapNativeException.getMessage());
                }
                try {
                    list = list2;
                    if (stringArray == null) break block8;
                    if (list == null) throw new IOException("No NIF found, is the libpcap successfully set/installed?");
                }
                catch (PcapNativeException pcapNativeException) {
                    throw DJ.a(pcapNativeException);
                }
                list = list2;
            }
            try {
                try {
                    if (stringArray == null) return list;
                    if (!list.isEmpty()) break block9;
                    throw new IOException("No NIF found, is the libpcap successfully set/installed?");
                }
                catch (PcapNativeException pcapNativeException) {
                    throw DJ.a(pcapNativeException);
                }
            }
            catch (PcapNativeException pcapNativeException) {
                throw DJ.a(pcapNativeException);
            }
        }
        list = list2;
        return list;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static PcapNetworkInterface o(String string) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = xQ.B();
        Iterator iterator = DJ.e().iterator();
        boolean bl = true;
        do {
            if (bl && !(bl = false) && stringArray != null) continue;
            PcapNetworkInterface pcapNetworkInterface = (PcapNetworkInterface)iterator.next();
            stringBuilder.append(pcapNetworkInterface.getName()).append(";");
            if (!pcapNetworkInterface.getName().equals(string)) continue;
            try {
                if (stringArray == null) throw new IllegalArgumentException("Please choose one interface from above names. Unknown interface - " + string);
                return pcapNetworkInterface;
            }
            catch (IOException iOException) {
                throw DJ.a(iOException);
            }
        } while (iterator.hasNext());
        DJ.A();
        throw new IllegalArgumentException("Please choose one interface from above names. Unknown interface - " + string);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void A() throws IOException {
        var1 = DJ.e();
        var2_1 = new StringBuilder();
        var3_2 = 0;
        var0_3 = xQ.B();
        var5_4 = var1.iterator();
        try {
            if (var0_3 == null) {
                while (true) {
                    v0 = var5_4.next();
                    break;
                }
            }
            ** GOTO lbl61
        }
        catch (IOException v1) {
            throw DJ.a(v1);
        }
        do {
            var4_5 = (PcapNetworkInterface)v0;
            var2_1.append("NIF[").append(var3_2).append("]: ").append(var4_5.getName()).append("\n");
            v2 = var4_5;
            if (var0_3 != null) {
                try {
                    if (v2.getDescription() != null) {
                        var2_1.append("      : description: ").append(var4_5.getDescription()).append("\n");
                    }
                }
                catch (IOException v3) {
                    throw DJ.a(v3);
                }
                v2 = var4_5;
            }
            var7_7 = v2.getLinkLayerAddresses().iterator();
            try {
                if (var0_3 == null) {
                    while (true) {
                        v4 = var7_7.next();
                        break;
                    }
                }
                ** GOTO lbl41
            }
            catch (IOException v5) {
                throw DJ.a(v5);
            }
            do {
                var6_6 = v4;
                var2_1.append("      : link layer address: ").append(var6_6).append("\n");
lbl41:
                // 2 sources

                if (var7_7.hasNext()) ** continue;
                v4 = var4_5.getAddresses().iterator();
            } while (var0_3 == null);
            var7_7 = v4;
            try {
                if (var0_3 == null) {
                    while (true) {
                        v6 /* !! */  = var7_7.next();
                        break;
                    }
                }
                ** GOTO lbl57
            }
            catch (IOException v7) {
                throw DJ.a(v7);
            }
            do {
                var6_6 = (PcapAddress)v6 /* !! */ ;
                var2_1.append("      : address: ").append(var6_6.getAddress()).append("\n");
lbl57:
                // 2 sources

                if (var7_7.hasNext()) ** continue;
                v6 /* !! */  = var2_1.append("\n").append("\n");
            } while (var0_3 == null);
            ++var3_2;
lbl61:
            // 2 sources

            if (var5_4.hasNext()) ** continue;
            var2_1.append("\n");
            v0 = System.out;
        } while (var0_3 == null);
        v0.println(var2_1.toString());
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$0() {
        block8: {
            var1 = new File(DJ.p);
            var0_1 = xQ.B();
            try {
                block9: {
                    if (var0_1 == null) break block8;
                    if (!var1.exists()) ** GOTO lbl18
                    break block9;
                    catch (IOException v0) {
                        throw DJ.a(v0);
                    }
                }
                try {
                    block10: {
                        System.out.println("Output file is - " + var1.getCanonicalPath());
                        if (var0_1 != null) break block8;
                        break block10;
                        catch (IOException v1) {
                            throw DJ.a(v1);
                        }
                    }
                    System.out.println("Dump file not existed - " + var1.getCanonicalPath());
                }
                catch (IOException v2) {
                    throw DJ.a(v2);
                }
            }
            catch (IOException var2_2) {
                // empty catch block
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x357E) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 10;
                case 1 -> 74;
                case 2 -> 126;
                case 3 -> 12;
                case 4 -> 192;
                case 5 -> 119;
                case 6 -> 28;
                case 7 -> 187;
                case 8 -> 81;
                case 9 -> 59;
                case 10 -> 49;
                case 11 -> 210;
                case 12 -> 117;
                case 13 -> 240;
                case 14 -> 249;
                case 15 -> 110;
                case 16 -> 146;
                case 17 -> 18;
                case 18 -> 231;
                case 19 -> 102;
                case 20 -> 27;
                case 21 -> 248;
                case 22 -> 198;
                case 23 -> 26;
                case 24 -> 216;
                case 25 -> 149;
                case 26 -> 153;
                case 27 -> 4;
                case 28 -> 109;
                case 29 -> 84;
                case 30 -> 50;
                case 31 -> 164;
                case 32 -> 21;
                case 33 -> 160;
                case 34 -> 250;
                case 35 -> 46;
                case 36 -> 212;
                case 37 -> 173;
                case 38 -> 179;
                case 39 -> 161;
                case 40 -> 168;
                case 41 -> 108;
                case 42 -> 65;
                case 43 -> 180;
                case 44 -> 205;
                case 45 -> 103;
                case 46 -> 123;
                case 47 -> 2;
                case 48 -> 223;
                case 49 -> 128;
                case 50 -> 7;
                case 51 -> 221;
                case 52 -> 169;
                case 53 -> 235;
                case 54 -> 17;
                case 55 -> 214;
                case 56 -> 95;
                case 57 -> 172;
                case 58 -> 141;
                case 59 -> 87;
                case 60 -> 189;
                case 61 -> 73;
                case 62 -> 226;
                case 63 -> 124;
                case 64 -> 72;
                case 65 -> 155;
                case 66 -> 143;
                case 67 -> 219;
                case 68 -> 62;
                case 69 -> 145;
                case 70 -> 91;
                case 71 -> 159;
                case 72 -> 151;
                case 73 -> 222;
                case 74 -> 142;
                case 75 -> 204;
                case 76 -> 15;
                case 77 -> 217;
                case 78 -> 35;
                case 79 -> 182;
                case 80 -> 32;
                case 81 -> 36;
                case 82 -> 48;
                case 83 -> 137;
                case 84 -> 165;
                case 85 -> 11;
                case 86 -> 234;
                case 87 -> 8;
                case 88 -> 64;
                case 89 -> 19;
                case 90 -> 71;
                case 91 -> 181;
                case 92 -> 162;
                case 93 -> 206;
                case 94 -> 202;
                case 95 -> 121;
                case 96 -> 44;
                case 97 -> 158;
                case 98 -> 61;
                case 99 -> 133;
                case 100 -> 183;
                case 101 -> 154;
                case 102 -> 207;
                case 103 -> 131;
                case 104 -> 227;
                case 105 -> 40;
                case 106 -> 208;
                case 107 -> 241;
                case 108 -> 176;
                case 109 -> 156;
                case 110 -> 83;
                case 111 -> 43;
                case 112 -> 230;
                case 113 -> 197;
                case 114 -> 175;
                case 115 -> 218;
                case 116 -> 129;
                case 117 -> 239;
                case 118 -> 247;
                case 119 -> 170;
                case 120 -> 166;
                case 121 -> 78;
                case 122 -> 105;
                case 123 -> 225;
                case 124 -> 188;
                case 125 -> 25;
                case 126 -> 31;
                case 127 -> 63;
                case 128 -> 116;
                case 129 -> 79;
                case 130 -> 82;
                case 131 -> 136;
                case 132 -> 255;
                case 133 -> 185;
                case 134 -> 20;
                case 135 -> 139;
                case 136 -> 1;
                case 137 -> 245;
                case 138 -> 122;
                case 139 -> 0;
                case 140 -> 171;
                case 141 -> 57;
                case 142 -> 177;
                case 143 -> 152;
                case 144 -> 253;
                case 145 -> 6;
                case 146 -> 254;
                case 147 -> 157;
                case 148 -> 111;
                case 149 -> 120;
                case 150 -> 113;
                case 151 -> 112;
                case 152 -> 68;
                case 153 -> 3;
                case 154 -> 5;
                case 155 -> 92;
                case 156 -> 96;
                case 157 -> 243;
                case 158 -> 13;
                case 159 -> 224;
                case 160 -> 67;
                case 161 -> 134;
                case 162 -> 215;
                case 163 -> 9;
                case 164 -> 148;
                case 165 -> 101;
                case 166 -> 16;
                case 167 -> 186;
                case 168 -> 97;
                case 169 -> 229;
                case 170 -> 24;
                case 171 -> 244;
                case 172 -> 47;
                case 173 -> 76;
                case 174 -> 246;
                case 175 -> 232;
                case 176 -> 45;
                case 177 -> 220;
                case 178 -> 150;
                case 179 -> 22;
                case 180 -> 29;
                case 181 -> 118;
                case 182 -> 70;
                case 183 -> 77;
                case 184 -> 51;
                case 185 -> 85;
                case 186 -> 37;
                case 187 -> 195;
                case 188 -> 33;
                case 189 -> 211;
                case 190 -> 238;
                case 191 -> 39;
                case 192 -> 193;
                case 193 -> 190;
                case 194 -> 252;
                case 195 -> 80;
                case 196 -> 41;
                case 197 -> 213;
                case 198 -> 199;
                case 199 -> 138;
                case 200 -> 201;
                case 201 -> 88;
                case 202 -> 60;
                case 203 -> 90;
                case 204 -> 237;
                case 205 -> 69;
                case 206 -> 194;
                case 207 -> 23;
                case 208 -> 203;
                case 209 -> 184;
                case 210 -> 86;
                case 211 -> 99;
                case 212 -> 106;
                case 213 -> 233;
                case 214 -> 94;
                case 215 -> 58;
                case 216 -> 56;
                case 217 -> 30;
                case 218 -> 163;
                case 219 -> 236;
                case 220 -> 200;
                case 221 -> 38;
                case 222 -> 75;
                case 223 -> 174;
                case 224 -> 93;
                case 225 -> 147;
                case 226 -> 42;
                case 227 -> 144;
                case 228 -> 104;
                case 229 -> 98;
                case 230 -> 191;
                case 231 -> 242;
                case 232 -> 34;
                case 233 -> 55;
                case 234 -> 228;
                case 235 -> 107;
                case 236 -> 196;
                case 237 -> 167;
                case 238 -> 140;
                case 239 -> 114;
                case 240 -> 53;
                case 241 -> 115;
                case 242 -> 251;
                case 243 -> 178;
                case 244 -> 66;
                case 245 -> 135;
                case 246 -> 100;
                case 247 -> 127;
                case 248 -> 209;
                case 249 -> 54;
                case 250 -> 130;
                case 251 -> 89;
                case 252 -> 52;
                case 253 -> 125;
                case 254 -> 132;
                default -> 14;
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
            DJ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

