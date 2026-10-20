/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NB;
import com.NH;
import com.NQ;
import com.NS;
import com.NX;
import com.NY;
import com.QT;
import com.na_0;
import com.ne_0;
import com.ng_0;
import com.nq_0;
import com.nr_0;
import com.nx_0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NZ
extends Enum {
    public static final NZ Null;
    public static final NZ CursorKey;
    public static final NZ ANSI;
    public static final NZ WideColumn;
    public static final NZ CursorVisible;
    public static final NZ AlternateBuffer;
    public static final NZ SmoothScroll;
    public static final NZ ReverseVideo;
    public static final NZ OriginMode;
    public static final NZ AutoWrap;
    public static final NZ AutoRepeatKeys;
    public static final NZ Interlace;
    public static final NZ Keypad;
    public static final NZ StoreCursor;
    public static final NZ CursorBlinking;
    public static final NZ AllowWideColumn;
    public static final NZ ReverseWrapAround;
    public static final NZ AutoNewLine;
    public static final NZ KeyboardAction;
    public static final NZ InsertMode;
    public static final NZ SendReceive;
    public static final NZ EightBitInput;
    public static final NZ AltSendsEscape;
    public static final NZ BracketedPasteMode;
    private static final Logger n;
    private static final NZ[] D;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static NZ[] values() {
        return (NZ[])D.clone();
    }

    public static NZ valueOf(String string) {
        return Enum.valueOf(NZ.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NZ() {
        void var2_-1;
        void var1_-1;
    }

    public void r(QT qT, boolean bl) {
        n.warn(NZ.a(-11505, -4649) + this.name() + NZ.a(-11506, 2422) + bl);
    }

    private static NZ[] B() {
        NZ[] nZArray = new NZ[NZ.a(22077, 3544754728306059369L)];
        nZArray[0] = Null;
        nZArray[1] = CursorKey;
        nZArray[2] = ANSI;
        nZArray[3] = WideColumn;
        nZArray[4] = CursorVisible;
        nZArray[5] = AlternateBuffer;
        nZArray[NZ.a((int)14073, (long)5975599269218273450L)] = SmoothScroll;
        nZArray[NZ.a((int)21460, (long)3524181912284507528L)] = ReverseVideo;
        nZArray[NZ.a((int)6368, (long)592313719776175777L)] = OriginMode;
        nZArray[NZ.a((int)28257, (long)6116053736867696692L)] = AutoWrap;
        nZArray[NZ.a((int)28688, (long)2378633930140552809L)] = AutoRepeatKeys;
        nZArray[NZ.a((int)4552, (long)8282995915889995658L)] = Interlace;
        nZArray[NZ.a((int)2228, (long)8310274348142589679L)] = Keypad;
        nZArray[NZ.a((int)24619, (long)7060706961384316518L)] = StoreCursor;
        nZArray[NZ.a((int)18496, (long)1367245728305886729L)] = CursorBlinking;
        nZArray[NZ.a((int)30041, (long)4021946828120427293L)] = AllowWideColumn;
        nZArray[NZ.a((int)14887, (long)2098912396953306217L)] = ReverseWrapAround;
        nZArray[NZ.a((int)30854, (long)4645360125039576825L)] = AutoNewLine;
        nZArray[NZ.a((int)8896, (long)4264810383346621591L)] = KeyboardAction;
        nZArray[NZ.a((int)26293, (long)2875323550284421320L)] = InsertMode;
        nZArray[NZ.a((int)9733, (long)4108778946185222232L)] = SendReceive;
        nZArray[NZ.a((int)32484, (long)8706764320168214716L)] = EightBitInput;
        nZArray[NZ.a((int)25162, (long)8992471510125222933L)] = AltSendsEscape;
        nZArray[NZ.a((int)749, (long)3562758506988633279L)] = BracketedPasteMode;
        return nZArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    NZ() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[26];
                        var11_1 = 0;
                        var10_2 = "\u0093P\u00b5\u000e\u00ddw\u0003\u00d3\u008c\u00a3\u00c5\u00c0^\u00fb\u00f8\u00ae2s\u00c0v\u00bf\u008b\u00c9\u0088\u00e4\u009a\u00f5\u001f\u00a2c\u008f\u00d6\u0005\u0004\u007f\u0090h\u00c2\t=\r#\u0007\u00f4\u00b8\u00ac\n\u00c2\n\u00f6\u00ce\u0097\u0098AH\u0000a\u00f3\t\t\u0015\u00d9k\u00f3&\u00ecb[h\f\u0091\u00e0\u00cc\u00d0K]_\u007f4\u0087\u00c7o\f}\u00b7i9\u00c30\u00be\u009f\u00e3\u0003L\u0096\r\u00dfm2e\r>\u001a\r\u00d3\u001ce\u00b3\u001a\u000e\u00b8\"\u00dc\u008f\u00baC\u00c8\u00de\u001b\u00c0\u001ef\u00ab\u0089\b\u00ee{P\u00bb\u00bfzD\u009c\u000e\u00db\u00a8\u00f6\u00c1n\"\u00caw9\u00c3A\u00ff\u008e*\u000e?Xj\u00d9\u00ca\u0091\u009b}\u00a1Q\u00daN\u00d9\u008e\u000b\u00b5\u00a0p\u00fc\u00f1\u001d\u00edejoB\u000b\u008e\u00a9\u0016\u00f8+oq\u00de7\u00f4\u00a7\n*\u0018\u00c6\u00a5\u00af\u00f4\u00eb\u0094\u0082\u00e5\u0011,\u00d7{6\u00bd\u0081\u0081\u00e5\u00f4\u00f0\u00b2\n\u00a7(\"\u0096k\u0012\u00d9M\u00c0\u0096&E\u00d9\u009b\u00daz\u00b2~\u0092\u00d8z\u00c2_\u00df\u0004\u00c06c\u0011\u000f\u00de\u00b1V\u00d2Z\u0000yHx!\u00d3P:\u00aa\u0000\u000e\u008a\u00f9\u0098\u00f7Xl\u00a4B\u0088W^8^K\r\u00fc\u00f6\u0085\u0092W\u0088\u0016\u00f0\u00b0\u001af\u008d;\u000b\u00c12\u00b5\u0092\u001aH\u00dc\u0013\u0014Y\u00c3\n.2\u009a}f\u00b7\u00aa\u00a5\u00aa\u00c3\u0004\u00c5f\u0012b";
                        var12_3 = "\u0093P\u00b5\u000e\u00ddw\u0003\u00d3\u008c\u00a3\u00c5\u00c0^\u00fb\u00f8\u00ae2s\u00c0v\u00bf\u008b\u00c9\u0088\u00e4\u009a\u00f5\u001f\u00a2c\u008f\u00d6\u0005\u0004\u007f\u0090h\u00c2\t=\r#\u0007\u00f4\u00b8\u00ac\n\u00c2\n\u00f6\u00ce\u0097\u0098AH\u0000a\u00f3\t\t\u0015\u00d9k\u00f3&\u00ecb[h\f\u0091\u00e0\u00cc\u00d0K]_\u007f4\u0087\u00c7o\f}\u00b7i9\u00c30\u00be\u009f\u00e3\u0003L\u0096\r\u00dfm2e\r>\u001a\r\u00d3\u001ce\u00b3\u001a\u000e\u00b8\"\u00dc\u008f\u00baC\u00c8\u00de\u001b\u00c0\u001ef\u00ab\u0089\b\u00ee{P\u00bb\u00bfzD\u009c\u000e\u00db\u00a8\u00f6\u00c1n\"\u00caw9\u00c3A\u00ff\u008e*\u000e?Xj\u00d9\u00ca\u0091\u009b}\u00a1Q\u00daN\u00d9\u008e\u000b\u00b5\u00a0p\u00fc\u00f1\u001d\u00edejoB\u000b\u008e\u00a9\u0016\u00f8+oq\u00de7\u00f4\u00a7\n*\u0018\u00c6\u00a5\u00af\u00f4\u00eb\u0094\u0082\u00e5\u0011,\u00d7{6\u00bd\u0081\u0081\u00e5\u00f4\u00f0\u00b2\n\u00a7(\"\u0096k\u0012\u00d9M\u00c0\u0096&E\u00d9\u009b\u00daz\u00b2~\u0092\u00d8z\u00c2_\u00df\u0004\u00c06c\u0011\u000f\u00de\u00b1V\u00d2Z\u0000yHx!\u00d3P:\u00aa\u0000\u000e\u008a\u00f9\u0098\u00f7Xl\u00a4B\u0088W^8^K\r\u00fc\u00f6\u0085\u0092W\u0088\u0016\u00f0\u00b0\u001af\u008d;\u000b\u00c12\u00b5\u0092\u001aH\u00dc\u0013\u0014Y\u00c3\n.2\u009a}f\u00b7\u00aa\u00a5\u00aa\u00c3\u0004\u00c5f\u0012b".length();
                        var9_4 = 32;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 2;
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
                            var10_2 = "<\u00192\u0084\u0017\t\u000f\u00d0\u0084\u00f1\u0000\u00ceV8\u00f2'\u001b\\B\u00ff\u00d5\u00ab";
                            var12_3 = "<\u00192\u0084\u0017\t\u000f\u00d0\u0084\u00f1\u0000\u00ceV8\u00f2'\u001b\\B\u00ff\u00d5\u00ab".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 114;
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
                                    v15 = 30;
                                    break;
                                }
                                case 1: {
                                    v15 = 121;
                                    break;
                                }
                                case 2: {
                                    v15 = 17;
                                    break;
                                }
                                case 3: {
                                    v15 = 13;
                                    break;
                                }
                                case 4: {
                                    v15 = 120;
                                    break;
                                }
                                case 5: {
                                    v15 = 30;
                                    break;
                                }
                                default: {
                                    v15 = 34;
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
                NZ.a = var13;
                NZ.b = new String[26];
                var0_7 = 2119610083902866733L;
                var6_8 = new long[37];
                var3_9 = 0;
                var4_10 = "\u00f7\u008c\u00c2{\u008a\u00a4\u009da\u00bd\u001dg\u0090\u00dc\u00ce\u00e8\u00a2~n\u001e\u00d7\u009c\u0088Y.\u000e\u0015\u00cf\u00bcs\u00ef\u008e\u00d6V\u00ce\u00ccf\u009e\u000b\u001f\u00f3\u00fd<$\\\u00ef\u00f1\u00c5\u0084\u0014\u009b]=JI\u00b3\u00ce\u00d2\u00ab\u00fdorW\u00f9\u00ef\u00a99\u00aej\fn\u00d5\u0010\u0017\u00d0\u00f7\u00b9\u00dd\u00ccm\\M\u00d6\u00c4\u00ef\u00bc\u0098\u0019\u00a8\u00e2K\u0081\u00de=A\u00c4\u00b4\u00c0\u0094\u00fbhV\u00e3\u00ba\u0089\u00cff\u000e\u00b8\u00b0\u0011\u0084\u0018\u00f0\u00af\u00d8\u000e0\u008b\r\u0081\u00dd6\t\u00a1|\u00d39\u0085\u00b7IO\u00d1Y-[F\u00b2\u00dc\u00cc\u0007\u00da\u00aa\u00f4p\u000b{\u00ac\u00c6T\u00b8\\M?\u001dL\u00cazM\u0001T\u0019m\u00b7v\u00d5\ns*\u00d9[(\u0013~d\u00ec\u008e\u00ca\u0083\u00dc<*=\u0012\u00ad\u00ec\n\u00f1\u00dc\u00e1\u0097\u001a\u00f0O\u00cc\u0014\u0093OH\u0084>\u0007\u0092\u009f*\u009a\u00fdN?1O\u0006\u00c5B\u000ew\u001e\u0081\u00b5\u00da\u00c0h9m\u00ce\u0080\u0015\u00ed\u00ce\u00bf\u0084\u00a3\u0084\u00b4\u00f4\u0007\u00ee\n\u0014\u00b3;3O\u001c\u0090\u00f3s{\u00f9\u00caf\u00a9g[\u00ff\u00aa\u00acu\u00f4z\u0089\u00ccY]\u00f6\n\u008f~\u00c61\u0017\u00f0.\nTL\u00ff\u00cb\u00e2C\u00c5";
                var5_11 = "\u00f7\u008c\u00c2{\u008a\u00a4\u009da\u00bd\u001dg\u0090\u00dc\u00ce\u00e8\u00a2~n\u001e\u00d7\u009c\u0088Y.\u000e\u0015\u00cf\u00bcs\u00ef\u008e\u00d6V\u00ce\u00ccf\u009e\u000b\u001f\u00f3\u00fd<$\\\u00ef\u00f1\u00c5\u0084\u0014\u009b]=JI\u00b3\u00ce\u00d2\u00ab\u00fdorW\u00f9\u00ef\u00a99\u00aej\fn\u00d5\u0010\u0017\u00d0\u00f7\u00b9\u00dd\u00ccm\\M\u00d6\u00c4\u00ef\u00bc\u0098\u0019\u00a8\u00e2K\u0081\u00de=A\u00c4\u00b4\u00c0\u0094\u00fbhV\u00e3\u00ba\u0089\u00cff\u000e\u00b8\u00b0\u0011\u0084\u0018\u00f0\u00af\u00d8\u000e0\u008b\r\u0081\u00dd6\t\u00a1|\u00d39\u0085\u00b7IO\u00d1Y-[F\u00b2\u00dc\u00cc\u0007\u00da\u00aa\u00f4p\u000b{\u00ac\u00c6T\u00b8\\M?\u001dL\u00cazM\u0001T\u0019m\u00b7v\u00d5\ns*\u00d9[(\u0013~d\u00ec\u008e\u00ca\u0083\u00dc<*=\u0012\u00ad\u00ec\n\u00f1\u00dc\u00e1\u0097\u001a\u00f0O\u00cc\u0014\u0093OH\u0084>\u0007\u0092\u009f*\u009a\u00fdN?1O\u0006\u00c5B\u000ew\u001e\u0081\u00b5\u00da\u00c0h9m\u00ce\u0080\u0015\u00ed\u00ce\u00bf\u0084\u00a3\u0084\u00b4\u00f4\u0007\u00ee\n\u0014\u00b3;3O\u001c\u0090\u00f3s{\u00f9\u00caf\u00a9g[\u00ff\u00aa\u00acu\u00f4z\u0089\u00ccY]\u00f6\n\u008f~\u00c61\u0017\u00f0.\nTL\u00ff\u00cb\u00e2C\u00c5".length();
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
                    var4_10 = "\u00d04}\\\u0016\u0086g\u009a\u0006\u001e\u00b4\u0080\u00d9\u00e5\u00cbN";
                    var5_11 = "\u00d04}\\\u0016\u0086g\u009a\u0006\u001e\u00b4\u0080\u00d9\u00e5\u00cbN".length();
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
        NZ.c = var6_8;
        NZ.d = new Integer[37];
        NZ.Null = new NZ(NZ.a(-11489, -19185), 0);
        NZ.CursorKey = new NX();
        NZ.ANSI = new NZ(NZ.a(-11495, -4300), 2);
        NZ.WideColumn = new NY();
        NZ.CursorVisible = new NQ();
        NZ.AlternateBuffer = new ng_0();
        NZ.SmoothScroll = new NZ(NZ.a(-11512, -6794), NZ.a(20247, 3744789364068528475L));
        NZ.ReverseVideo = new NZ(NZ.a(-11509, -24704), NZ.a(19571, 2099120230559363636L));
        NZ.OriginMode = new ne_0();
        NZ.AutoWrap = new nx_0();
        NZ.AutoRepeatKeys = new NZ(NZ.a(-11516, 19243), NZ.a(23747, 5656672109604872893L));
        NZ.Interlace = new NZ(NZ.a(-11508, -19709), NZ.a(32708, 3072213295828828562L));
        NZ.Keypad = new na_0();
        NZ.StoreCursor = new nr_0();
        NZ.CursorBlinking = new NH();
        NZ.AllowWideColumn = new NZ(NZ.a(-11497, 11077), NZ.a(9352, 9200489519463717585L));
        NZ.ReverseWrapAround = new NZ(NZ.a(-11519, -30687), NZ.a(17032, 4938434551741037778L));
        NZ.AutoNewLine = new NS();
        NZ.KeyboardAction = new NZ(NZ.a(-11514, -9330), NZ.a(19309, 7844818110707807505L));
        NZ.InsertMode = new NZ(NZ.a(-11520, -13507), NZ.a(8580, 7520867954805366734L));
        NZ.SendReceive = new NZ(NZ.a(-11517, 3351), NZ.a(16194, 5986066106066223367L));
        NZ.EightBitInput = new NZ(NZ.a(-11494, 15356), NZ.a(16240, 6382692244654932256L));
        NZ.AltSendsEscape = new nq_0();
        NZ.BracketedPasteMode = new NB();
        NZ.D = NZ.B();
        NZ.n = LoggerFactory.getLogger(NZ.class);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD30E) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 62;
                    break;
                }
                case 1: {
                    n14 = 141;
                    break;
                }
                case 2: {
                    n14 = 234;
                    break;
                }
                case 3: {
                    n14 = 179;
                    break;
                }
                case 4: {
                    n14 = 13;
                    break;
                }
                case 5: {
                    n14 = 6;
                    break;
                }
                case 6: {
                    n14 = 126;
                    break;
                }
                case 7: {
                    n14 = 39;
                    break;
                }
                case 8: {
                    n14 = 18;
                    break;
                }
                case 9: {
                    n14 = 144;
                    break;
                }
                case 10: {
                    n14 = 184;
                    break;
                }
                case 11: {
                    n14 = 69;
                    break;
                }
                case 12: {
                    n14 = 219;
                    break;
                }
                case 13: {
                    n14 = 202;
                    break;
                }
                case 14: {
                    n14 = 206;
                    break;
                }
                case 15: {
                    n14 = 178;
                    break;
                }
                case 16: {
                    n14 = 16;
                    break;
                }
                case 17: {
                    n14 = 103;
                    break;
                }
                case 18: {
                    n14 = 57;
                    break;
                }
                case 19: {
                    n14 = 106;
                    break;
                }
                case 20: {
                    n14 = 207;
                    break;
                }
                case 21: {
                    n14 = 244;
                    break;
                }
                case 22: {
                    n14 = 77;
                    break;
                }
                case 23: {
                    n14 = 167;
                    break;
                }
                case 24: {
                    n14 = 130;
                    break;
                }
                case 25: {
                    n14 = 29;
                    break;
                }
                case 26: {
                    n14 = 67;
                    break;
                }
                case 27: {
                    n14 = 176;
                    break;
                }
                case 28: {
                    n14 = 105;
                    break;
                }
                case 29: {
                    n14 = 113;
                    break;
                }
                case 30: {
                    n14 = 198;
                    break;
                }
                case 31: {
                    n14 = 95;
                    break;
                }
                case 32: {
                    n14 = 22;
                    break;
                }
                case 33: {
                    n14 = 155;
                    break;
                }
                case 34: {
                    n14 = 209;
                    break;
                }
                case 35: {
                    n14 = 215;
                    break;
                }
                case 36: {
                    n14 = 116;
                    break;
                }
                case 37: {
                    n14 = 0;
                    break;
                }
                case 38: {
                    n14 = 146;
                    break;
                }
                case 39: {
                    n14 = 248;
                    break;
                }
                case 40: {
                    n14 = 25;
                    break;
                }
                case 41: {
                    n14 = 74;
                    break;
                }
                case 42: {
                    n14 = 9;
                    break;
                }
                case 43: {
                    n14 = 91;
                    break;
                }
                case 44: {
                    n14 = 83;
                    break;
                }
                case 45: {
                    n14 = 58;
                    break;
                }
                case 46: {
                    n14 = 177;
                    break;
                }
                case 47: {
                    n14 = 249;
                    break;
                }
                case 48: {
                    n14 = 191;
                    break;
                }
                case 49: {
                    n14 = 94;
                    break;
                }
                case 50: {
                    n14 = 243;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 162;
                    break;
                }
                case 53: {
                    n14 = 27;
                    break;
                }
                case 54: {
                    n14 = 190;
                    break;
                }
                case 55: {
                    n14 = 136;
                    break;
                }
                case 56: {
                    n14 = 53;
                    break;
                }
                case 57: {
                    n14 = 210;
                    break;
                }
                case 58: {
                    n14 = 43;
                    break;
                }
                case 59: {
                    n14 = 242;
                    break;
                }
                case 60: {
                    n14 = 134;
                    break;
                }
                case 61: {
                    n14 = 143;
                    break;
                }
                case 62: {
                    n14 = 14;
                    break;
                }
                case 63: {
                    n14 = 90;
                    break;
                }
                case 64: {
                    n14 = 147;
                    break;
                }
                case 65: {
                    n14 = 108;
                    break;
                }
                case 66: {
                    n14 = 50;
                    break;
                }
                case 67: {
                    n14 = 30;
                    break;
                }
                case 68: {
                    n14 = 218;
                    break;
                }
                case 69: {
                    n14 = 197;
                    break;
                }
                case 70: {
                    n14 = 153;
                    break;
                }
                case 71: {
                    n14 = 15;
                    break;
                }
                case 72: {
                    n14 = 46;
                    break;
                }
                case 73: {
                    n14 = 112;
                    break;
                }
                case 74: {
                    n14 = 63;
                    break;
                }
                case 75: {
                    n14 = 194;
                    break;
                }
                case 76: {
                    n14 = 64;
                    break;
                }
                case 77: {
                    n14 = 19;
                    break;
                }
                case 78: {
                    n14 = 222;
                    break;
                }
                case 79: {
                    n14 = 204;
                    break;
                }
                case 80: {
                    n14 = 231;
                    break;
                }
                case 81: {
                    n14 = 175;
                    break;
                }
                case 82: {
                    n14 = 65;
                    break;
                }
                case 83: {
                    n14 = 55;
                    break;
                }
                case 84: {
                    n14 = 115;
                    break;
                }
                case 85: {
                    n14 = 137;
                    break;
                }
                case 86: {
                    n14 = 169;
                    break;
                }
                case 87: {
                    n14 = 79;
                    break;
                }
                case 88: {
                    n14 = 171;
                    break;
                }
                case 89: {
                    n14 = 121;
                    break;
                }
                case 90: {
                    n14 = 11;
                    break;
                }
                case 91: {
                    n14 = 17;
                    break;
                }
                case 92: {
                    n14 = 98;
                    break;
                }
                case 93: {
                    n14 = 97;
                    break;
                }
                case 94: {
                    n14 = 52;
                    break;
                }
                case 95: {
                    n14 = 154;
                    break;
                }
                case 96: {
                    n14 = 163;
                    break;
                }
                case 97: {
                    n14 = 68;
                    break;
                }
                case 98: {
                    n14 = 70;
                    break;
                }
                case 99: {
                    n14 = 2;
                    break;
                }
                case 100: {
                    n14 = 174;
                    break;
                }
                case 101: {
                    n14 = 166;
                    break;
                }
                case 102: {
                    n14 = 213;
                    break;
                }
                case 103: {
                    n14 = 73;
                    break;
                }
                case 104: {
                    n14 = 214;
                    break;
                }
                case 105: {
                    n14 = 138;
                    break;
                }
                case 106: {
                    n14 = 230;
                    break;
                }
                case 107: {
                    n14 = 255;
                    break;
                }
                case 108: {
                    n14 = 110;
                    break;
                }
                case 109: {
                    n14 = 38;
                    break;
                }
                case 110: {
                    n14 = 196;
                    break;
                }
                case 111: {
                    n14 = 237;
                    break;
                }
                case 112: {
                    n14 = 142;
                    break;
                }
                case 113: {
                    n14 = 3;
                    break;
                }
                case 114: {
                    n14 = 132;
                    break;
                }
                case 115: {
                    n14 = 211;
                    break;
                }
                case 116: {
                    n14 = 254;
                    break;
                }
                case 117: {
                    n14 = 188;
                    break;
                }
                case 118: {
                    n14 = 245;
                    break;
                }
                case 119: {
                    n14 = 226;
                    break;
                }
                case 120: {
                    n14 = 250;
                    break;
                }
                case 121: {
                    n14 = 187;
                    break;
                }
                case 122: {
                    n14 = 44;
                    break;
                }
                case 123: {
                    n14 = 212;
                    break;
                }
                case 124: {
                    n14 = 80;
                    break;
                }
                case 125: {
                    n14 = 85;
                    break;
                }
                case 126: {
                    n14 = 37;
                    break;
                }
                case 127: {
                    n14 = 96;
                    break;
                }
                case 128: {
                    n14 = 127;
                    break;
                }
                case 129: {
                    n14 = 89;
                    break;
                }
                case 130: {
                    n14 = 5;
                    break;
                }
                case 131: {
                    n14 = 119;
                    break;
                }
                case 132: {
                    n14 = 133;
                    break;
                }
                case 133: {
                    n14 = 78;
                    break;
                }
                case 134: {
                    n14 = 99;
                    break;
                }
                case 135: {
                    n14 = 101;
                    break;
                }
                case 136: {
                    n14 = 12;
                    break;
                }
                case 137: {
                    n14 = 42;
                    break;
                }
                case 138: {
                    n14 = 123;
                    break;
                }
                case 139: {
                    n14 = 238;
                    break;
                }
                case 140: {
                    n14 = 186;
                    break;
                }
                case 141: {
                    n14 = 161;
                    break;
                }
                case 142: {
                    n14 = 168;
                    break;
                }
                case 143: {
                    n14 = 199;
                    break;
                }
                case 144: {
                    n14 = 104;
                    break;
                }
                case 145: {
                    n14 = 124;
                    break;
                }
                case 146: {
                    n14 = 86;
                    break;
                }
                case 147: {
                    n14 = 235;
                    break;
                }
                case 148: {
                    n14 = 36;
                    break;
                }
                case 149: {
                    n14 = 51;
                    break;
                }
                case 150: {
                    n14 = 71;
                    break;
                }
                case 151: {
                    n14 = 10;
                    break;
                }
                case 152: {
                    n14 = 203;
                    break;
                }
                case 153: {
                    n14 = 34;
                    break;
                }
                case 154: {
                    n14 = 216;
                    break;
                }
                case 155: {
                    n14 = 47;
                    break;
                }
                case 156: {
                    n14 = 82;
                    break;
                }
                case 157: {
                    n14 = 173;
                    break;
                }
                case 158: {
                    n14 = 93;
                    break;
                }
                case 159: {
                    n14 = 229;
                    break;
                }
                case 160: {
                    n14 = 122;
                    break;
                }
                case 161: {
                    n14 = 109;
                    break;
                }
                case 162: {
                    n14 = 220;
                    break;
                }
                case 163: {
                    n14 = 48;
                    break;
                }
                case 164: {
                    n14 = 159;
                    break;
                }
                case 165: {
                    n14 = 35;
                    break;
                }
                case 166: {
                    n14 = 181;
                    break;
                }
                case 167: {
                    n14 = 148;
                    break;
                }
                case 168: {
                    n14 = 114;
                    break;
                }
                case 169: {
                    n14 = 20;
                    break;
                }
                case 170: {
                    n14 = 66;
                    break;
                }
                case 171: {
                    n14 = 24;
                    break;
                }
                case 172: {
                    n14 = 185;
                    break;
                }
                case 173: {
                    n14 = 145;
                    break;
                }
                case 174: {
                    n14 = 246;
                    break;
                }
                case 175: {
                    n14 = 172;
                    break;
                }
                case 176: {
                    n14 = 60;
                    break;
                }
                case 177: {
                    n14 = 56;
                    break;
                }
                case 178: {
                    n14 = 129;
                    break;
                }
                case 179: {
                    n14 = 170;
                    break;
                }
                case 180: {
                    n14 = 205;
                    break;
                }
                case 181: {
                    n14 = 228;
                    break;
                }
                case 182: {
                    n14 = 75;
                    break;
                }
                case 183: {
                    n14 = 139;
                    break;
                }
                case 184: {
                    n14 = 23;
                    break;
                }
                case 185: {
                    n14 = 225;
                    break;
                }
                case 186: {
                    n14 = 40;
                    break;
                }
                case 187: {
                    n14 = 7;
                    break;
                }
                case 188: {
                    n14 = 72;
                    break;
                }
                case 189: {
                    n14 = 192;
                    break;
                }
                case 190: {
                    n14 = 182;
                    break;
                }
                case 191: {
                    n14 = 54;
                    break;
                }
                case 192: {
                    n14 = 59;
                    break;
                }
                case 193: {
                    n14 = 111;
                    break;
                }
                case 194: {
                    n14 = 88;
                    break;
                }
                case 195: {
                    n14 = 236;
                    break;
                }
                case 196: {
                    n14 = 208;
                    break;
                }
                case 197: {
                    n14 = 131;
                    break;
                }
                case 198: {
                    n14 = 232;
                    break;
                }
                case 199: {
                    n14 = 165;
                    break;
                }
                case 200: {
                    n14 = 120;
                    break;
                }
                case 201: {
                    n14 = 200;
                    break;
                }
                case 202: {
                    n14 = 118;
                    break;
                }
                case 203: {
                    n14 = 81;
                    break;
                }
                case 204: {
                    n14 = 4;
                    break;
                }
                case 205: {
                    n14 = 160;
                    break;
                }
                case 206: {
                    n14 = 189;
                    break;
                }
                case 207: {
                    n14 = 150;
                    break;
                }
                case 208: {
                    n14 = 224;
                    break;
                }
                case 209: {
                    n14 = 217;
                    break;
                }
                case 210: {
                    n14 = 128;
                    break;
                }
                case 211: {
                    n14 = 183;
                    break;
                }
                case 212: {
                    n14 = 164;
                    break;
                }
                case 213: {
                    n14 = 45;
                    break;
                }
                case 214: {
                    n14 = 33;
                    break;
                }
                case 215: {
                    n14 = 31;
                    break;
                }
                case 216: {
                    n14 = 107;
                    break;
                }
                case 217: {
                    n14 = 156;
                    break;
                }
                case 218: {
                    n14 = 157;
                    break;
                }
                case 219: {
                    n14 = 76;
                    break;
                }
                case 220: {
                    n14 = 125;
                    break;
                }
                case 221: {
                    n14 = 195;
                    break;
                }
                case 222: {
                    n14 = 201;
                    break;
                }
                case 223: {
                    n14 = 102;
                    break;
                }
                case 224: {
                    n14 = 87;
                    break;
                }
                case 225: {
                    n14 = 253;
                    break;
                }
                case 226: {
                    n14 = 117;
                    break;
                }
                case 227: {
                    n14 = 26;
                    break;
                }
                case 228: {
                    n14 = 180;
                    break;
                }
                case 229: {
                    n14 = 240;
                    break;
                }
                case 230: {
                    n14 = 84;
                    break;
                }
                case 231: {
                    n14 = 251;
                    break;
                }
                case 232: {
                    n14 = 8;
                    break;
                }
                case 233: {
                    n14 = 21;
                    break;
                }
                case 234: {
                    n14 = 135;
                    break;
                }
                case 235: {
                    n14 = 247;
                    break;
                }
                case 236: {
                    n14 = 233;
                    break;
                }
                case 237: {
                    n14 = 61;
                    break;
                }
                case 238: {
                    n14 = 241;
                    break;
                }
                case 239: {
                    n14 = 239;
                    break;
                }
                case 240: {
                    n14 = 151;
                    break;
                }
                case 241: {
                    n14 = 149;
                    break;
                }
                case 242: {
                    n14 = 152;
                    break;
                }
                case 243: {
                    n14 = 140;
                    break;
                }
                case 244: {
                    n14 = 193;
                    break;
                }
                case 245: {
                    n14 = 49;
                    break;
                }
                case 246: {
                    n14 = 223;
                    break;
                }
                case 247: {
                    n14 = 41;
                    break;
                }
                case 248: {
                    n14 = 221;
                    break;
                }
                case 249: {
                    n14 = 100;
                    break;
                }
                case 250: {
                    n14 = 1;
                    break;
                }
                case 251: {
                    n14 = 28;
                    break;
                }
                case 252: {
                    n14 = 92;
                    break;
                }
                case 253: {
                    n14 = 158;
                    break;
                }
                case 254: {
                    n14 = 227;
                    break;
                }
                default: {
                    n14 = 32;
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
            NZ.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7E5D;
        if (d[n11] == null) {
            NZ.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

