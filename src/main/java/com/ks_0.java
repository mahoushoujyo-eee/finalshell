/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yn_2;

/*
 * Renamed from com.Ks
 */
public final class ks_0
extends Enum {
    public static final ks_0 AutoCloseSource;
    public static final ks_0 AllowComment;
    public static final ks_0 AllowUnQuotedFieldNames;
    public static final ks_0 AllowSingleQuotes;
    public static final ks_0 InternFieldNames;
    public static final ks_0 AllowISO8601DateFormat;
    public static final ks_0 AllowArbitraryCommas;
    public static final ks_0 UseBigDecimal;
    public static final ks_0 IgnoreNotMatch;
    public static final ks_0 SortFeidFastMatch;
    public static final ks_0 DisableASM;
    public static final ks_0 DisableCircularReferenceDetect;
    public static final ks_0 InitStringFieldAsEmpty;
    public static final ks_0 SupportArrayToBean;
    public static final ks_0 OrderedField;
    public static final ks_0 DisableSpecialKeyDetect;
    public static final ks_0 UseObjectArray;
    public static final ks_0 SupportNonPublicField;
    public static final ks_0 IgnoreAutoType;
    public static final ks_0 DisableFieldSmartMatch;
    public static final ks_0 SupportAutoType;
    public static final ks_0 NonStringKeyAsString;
    public static final ks_0 CustomMapDeserializer;
    public static final ks_0 ErrorOnEnumNotMatch;
    public static final ks_0 SafeMode;
    public static final ks_0 TrimStringFieldValue;
    public static final ks_0 UseNativeJavaObject;
    public final int mask = 1 << this.ordinal();
    private static final /* synthetic */ ks_0[] s;
    private static final long[] a;
    private static final Integer[] b;

    public static ks_0[] values() {
        return (ks_0[])s.clone();
    }

    public static ks_0 valueOf(String string) {
        return Enum.valueOf(ks_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ks_0() {
        void var2_-1;
        void var1_-1;
    }

    public final int v() {
        return this.mask;
    }

    public static boolean D(int n10, ks_0 ks_02) {
        boolean bl = yn_2.Y();
        boolean bl2 = n10 & ks_02.mask;
        if (bl) {
            bl2 = bl2;
        }
        return bl2;
    }

    public static int H(int n10, ks_0 ks_02, boolean n11) {
        block4: {
            int n12;
            block2: {
                block3: {
                    boolean bl = yn_2.o();
                    n12 = n11;
                    if (bl) break block2;
                    if (n12 == 0) break block3;
                    n10 |= ks_02.mask;
                    if (!bl) break block4;
                }
                n12 = n10 & ~ks_02.mask;
            }
            n10 = n12;
        }
        return n10;
    }

    public static int C(ks_0[] ks_0Array) {
        int n10;
        block3: {
            boolean bl = yn_2.o();
            if (ks_0Array == null) {
                return 0;
            }
            int n11 = 0;
            for (ks_0 ks_02 : ks_0Array) {
                n10 = n11 | ks_02.mask;
                if (!bl) {
                    n11 = n10;
                    if (!bl) continue;
                }
                break block3;
            }
            n10 = n11;
        }
        return n10;
    }

    private static /* synthetic */ ks_0[] o() {
        ks_0[] ks_0Array = new ks_0[ks_0.a(19052, 9042932579377124235L)];
        ks_0Array[0] = AutoCloseSource;
        ks_0Array[1] = AllowComment;
        ks_0Array[2] = AllowUnQuotedFieldNames;
        ks_0Array[3] = AllowSingleQuotes;
        ks_0Array[4] = InternFieldNames;
        ks_0Array[5] = AllowISO8601DateFormat;
        ks_0Array[ks_0.a((int)14838, (long)273427173546450959L)] = AllowArbitraryCommas;
        ks_0Array[ks_0.a((int)27965, (long)884364596648162548L)] = UseBigDecimal;
        ks_0Array[ks_0.a((int)1993, (long)2666977999344164401L)] = IgnoreNotMatch;
        ks_0Array[ks_0.a((int)20874, (long)9037375572652591170L)] = SortFeidFastMatch;
        ks_0Array[ks_0.a((int)23059, (long)3699156106125018072L)] = DisableASM;
        ks_0Array[ks_0.a((int)27345, (long)3079804761167115070L)] = DisableCircularReferenceDetect;
        ks_0Array[ks_0.a((int)18816, (long)7875825957104750714L)] = InitStringFieldAsEmpty;
        ks_0Array[ks_0.a((int)12736, (long)3764004021555423284L)] = SupportArrayToBean;
        ks_0Array[ks_0.a((int)32275, (long)6158009256567482334L)] = OrderedField;
        ks_0Array[ks_0.a((int)1165, (long)6840725575770332519L)] = DisableSpecialKeyDetect;
        ks_0Array[ks_0.a((int)4097, (long)6306132288767347185L)] = UseObjectArray;
        ks_0Array[ks_0.a((int)6637, (long)737289851322613795L)] = SupportNonPublicField;
        ks_0Array[ks_0.a((int)21899, (long)3443275236766944372L)] = IgnoreAutoType;
        ks_0Array[ks_0.a((int)20730, (long)4706980585304361235L)] = DisableFieldSmartMatch;
        ks_0Array[ks_0.a((int)15465, (long)6211887169678927236L)] = SupportAutoType;
        ks_0Array[ks_0.a((int)22198, (long)3522355854306873181L)] = NonStringKeyAsString;
        ks_0Array[ks_0.a((int)21164, (long)6129159299292302162L)] = CustomMapDeserializer;
        ks_0Array[ks_0.a((int)11244, (long)7199734300932076079L)] = ErrorOnEnumNotMatch;
        ks_0Array[ks_0.a((int)12744, (long)8386147241851152393L)] = SafeMode;
        ks_0Array[ks_0.a((int)28835, (long)975444149853366595L)] = TrimStringFieldValue;
        ks_0Array[ks_0.a((int)20100, (long)5236946802307241846L)] = UseNativeJavaObject;
        return ks_0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var8 = new String[27];
                        var12_1 = 0;
                        var11_2 = "eY\u0017%a\"ceE\u0010']\u0002ymJ\u0011){\u0014aG\t%d,\u007fBB\u00118r\u001ftcD\b'r\u001e\u000eiL\u000b%a\bLU_\n\u001ej\u001dh\u0012s^\u0015:|\u001fyaY\u0017+j9bbN\u0004$\u0016aG\t%d$^o\u0013Sz\")lTN#%a\u0000lT\ndB\u0016+q\u0001hax(\u0017aG\t%d8cq^\n>v\tKIN\t.]\f`EX\u0011aG\t%d>dNL\t/B\u0018bTN\u0016\foY\u0001/a\bifB\u0000&w\u0016dB\u0016+q\u0001hfB\u0000&w>`AY\u0011\u0007r\u0019nH\u000fa^\u0011%P\u0001bSN6%f\u001fnE\u000fs^\u0015:|\u001fya^\u0011%G\u0014}E\u0010iE\u0011/a\u0003KIN\t.]\f`EX\u000euX\u0000\u0005q\u0007hC_$8a\ft\u0015c^\u0016>|\u0000@A[!/`\b\u007fIJ\t#i\b\u007f\u0016iE\f>@\u0019\u007fIE\u0002\fz\baDj\u0016\u000f~\u001dyY\u000eiL\u000b%a\bCO_(+g\u000ee\u0015s^\u0015:|\u001fynD\u000b\u001af\u000faIH##v\u0001i\u0014tY\f'@\u0019\u007fIE\u0002\fz\baD}\u0004&f\b\faG\t%d.bMF\u0000$g\bsJ\u0003/^\u0002iE\u0014nD\u000b\u0019g\u001fdNL./j,~s_\u0017#}\n\u0017dB\u0016+q\u0001hs[\u0000)z\fakN\u001c\u000ev\u0019hC_\u001edB\u0016+q\u0001hcB\u0017)f\u0001lRy\u0000,v\u001fhNH\u0000\u000ev\u0019hC_\ruX\u0000\bz\nIEH\f'r\u0001";
                        var13_3 = "eY\u0017%a\"ceE\u0010']\u0002ymJ\u0011){\u0014aG\t%d,\u007fBB\u00118r\u001ftcD\b'r\u001e\u000eiL\u000b%a\bLU_\n\u001ej\u001dh\u0012s^\u0015:|\u001fyaY\u0017+j9bbN\u0004$\u0016aG\t%d$^o\u0013Sz\")lTN#%a\u0000lT\ndB\u0016+q\u0001hax(\u0017aG\t%d8cq^\n>v\tKIN\t.]\f`EX\u0011aG\t%d>dNL\t/B\u0018bTN\u0016\foY\u0001/a\bifB\u0000&w\u0016dB\u0016+q\u0001hfB\u0000&w>`AY\u0011\u0007r\u0019nH\u000fa^\u0011%P\u0001bSN6%f\u001fnE\u000fs^\u0015:|\u001fya^\u0011%G\u0014}E\u0010iE\u0011/a\u0003KIN\t.]\f`EX\u000euX\u0000\u0005q\u0007hC_$8a\ft\u0015c^\u0016>|\u0000@A[!/`\b\u007fIJ\t#i\b\u007f\u0016iE\f>@\u0019\u007fIE\u0002\fz\baDj\u0016\u000f~\u001dyY\u000eiL\u000b%a\bCO_(+g\u000ee\u0015s^\u0015:|\u001fynD\u000b\u001af\u000faIH##v\u0001i\u0014tY\f'@\u0019\u007fIE\u0002\fz\baD}\u0004&f\b\faG\t%d.bMF\u0000$g\bsJ\u0003/^\u0002iE\u0014nD\u000b\u0019g\u001fdNL./j,~s_\u0017#}\n\u0017dB\u0016+q\u0001hs[\u0000)z\fakN\u001c\u000ev\u0019hC_\u001edB\u0016+q\u0001hcB\u0017)f\u0001lRy\u0000,v\u001fhNH\u0000\u000ev\u0019hC_\ruX\u0000\bz\nIEH\f'r\u0001".length();
                        var10_4 = 19;
                        var9_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 79;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "Gp#\na<PpY0\rS\u0014X`|9\u0013Al40F-Pbz\u001b\u001fQ8vvu4\u001dS";
                            var13_3 = "Gp#\na<PpY0\rS\u0014X`|9\u0013Al40F-Pbz\u001b\u001fQ8vvu4\u001dS".length();
                            var10_4 = 17;
                            var9_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 123;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
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
                                    v15 = 111;
                                    break;
                                }
                                case 1: {
                                    v15 = 100;
                                    break;
                                }
                                case 2: {
                                    v15 = 42;
                                    break;
                                }
                                case 3: {
                                    v15 = 5;
                                    break;
                                }
                                case 4: {
                                    v15 = 92;
                                    break;
                                }
                                case 5: {
                                    v15 = 34;
                                    break;
                                }
                                default: {
                                    v15 = 66;
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
                var0_7 = 8657948486763682443L;
                var6_8 = new long[43];
                var3_9 = 0;
                var4_10 = "*\u00dd+\u00f4\u00b2\u0094\u0013\u008b\u00ef\u00f8\u0003\u00f4\u00c7\u00a5;_\u0017\u008e\u00ff\u0081YT\u0095\u00c3J}\u00e4T8\u0096G\u00e3\u0080Mh#\u00e0\u00aa\u00ff\u001b\u008cXQI\u00bb\u000f5y\u00dd\u00af\u0003\u009c;\u00c2)\u00bep7\u00dcI\u00b2*\u00f2\u00ad\u00fe\u00be\u009f\u001a\u00a3[\u00b1\u00b9\u00fb\u00e5\u0013\u00e4\u00a7\u00103\u00d1=\u008f\u000e\u00e62w\u0007(\u0000\u00f9\u00b8\u0095\u00f5\u009d\u009e\u00d2\u00b5\u0082Zk\u00dc>\u00dd\u00c3\u0094e\u008a\u0019\t*\u00f9e\u00e3K\u00e9\u00b5\u001c\u00ba\u0089\u001b%\u00f9\u00d5m\u00ac\u00d76\u008e\u00e1\u00ca\u00c7\u001f*\u0002\u00fa\u0082\u00a5\u0001C\u00e5\u00d7\u009e\u00c4\u00b2\u00d2\u00c6*\u001f\u0017\u00aeJ\u001b7\u007f\u00b6\u00c3\u0003)\u008a\u00fd\u00f6T\u00b5T\u0084/\u0083\u00f9-\u00ea\u00b6P\u00c5\u00136\u009b\u00fd\u00fb\u0099\u00c8BJ\u0096\u00edBS\u0019oS7\u0091\u00cf+\u00a91\u0005\u00af\u0018\u00b1\u00d0\u00ce\u00b9\u00c3\u0004'\u00b7Sj\u00d7Yt\u00c0fV\\\\^\u0010\u0016h&\n\r\u00e7^\u000f\u00d9u\b\u0093F\u00ef\u001c\u0004\u008d\u001a\u00e8\u00dd\u00f2\u00b2\u00db\u00feLEN@\u00b7\u009c,pB\u009d\u00e0\u009bd\u008e\u00e1m\u00d9Z\u00a6\u000b.x\u00c7\u000eV\u00d0`\u00ee\u0012\u00c0\u00fb[r\u00d0\u00cfb\u0099Y:\u00fcJ\u00fc.\u00db=\u00c3\u0013\u0003\u0081\u00a20k\u00bd[\u0001z\"\u0006b\u00e7\u008a\u00e1\u00d3\u0001\u00dd\u00f3\u00b1_\u00a0\u008fs\u008b\u00f5\u00a5A\u00bb\u00da\u00b9(]\u00c1k\u00fd\u0086\u00f2\u009a";
                var5_11 = "*\u00dd+\u00f4\u00b2\u0094\u0013\u008b\u00ef\u00f8\u0003\u00f4\u00c7\u00a5;_\u0017\u008e\u00ff\u0081YT\u0095\u00c3J}\u00e4T8\u0096G\u00e3\u0080Mh#\u00e0\u00aa\u00ff\u001b\u008cXQI\u00bb\u000f5y\u00dd\u00af\u0003\u009c;\u00c2)\u00bep7\u00dcI\u00b2*\u00f2\u00ad\u00fe\u00be\u009f\u001a\u00a3[\u00b1\u00b9\u00fb\u00e5\u0013\u00e4\u00a7\u00103\u00d1=\u008f\u000e\u00e62w\u0007(\u0000\u00f9\u00b8\u0095\u00f5\u009d\u009e\u00d2\u00b5\u0082Zk\u00dc>\u00dd\u00c3\u0094e\u008a\u0019\t*\u00f9e\u00e3K\u00e9\u00b5\u001c\u00ba\u0089\u001b%\u00f9\u00d5m\u00ac\u00d76\u008e\u00e1\u00ca\u00c7\u001f*\u0002\u00fa\u0082\u00a5\u0001C\u00e5\u00d7\u009e\u00c4\u00b2\u00d2\u00c6*\u001f\u0017\u00aeJ\u001b7\u007f\u00b6\u00c3\u0003)\u008a\u00fd\u00f6T\u00b5T\u0084/\u0083\u00f9-\u00ea\u00b6P\u00c5\u00136\u009b\u00fd\u00fb\u0099\u00c8BJ\u0096\u00edBS\u0019oS7\u0091\u00cf+\u00a91\u0005\u00af\u0018\u00b1\u00d0\u00ce\u00b9\u00c3\u0004'\u00b7Sj\u00d7Yt\u00c0fV\\\\^\u0010\u0016h&\n\r\u00e7^\u000f\u00d9u\b\u0093F\u00ef\u001c\u0004\u008d\u001a\u00e8\u00dd\u00f2\u00b2\u00db\u00feLEN@\u00b7\u009c,pB\u009d\u00e0\u009bd\u008e\u00e1m\u00d9Z\u00a6\u000b.x\u00c7\u000eV\u00d0`\u00ee\u0012\u00c0\u00fb[r\u00d0\u00cfb\u0099Y:\u00fcJ\u00fc.\u00db=\u00c3\u0013\u0003\u0081\u00a20k\u00bd[\u0001z\"\u0006b\u00e7\u008a\u00e1\u00d3\u0001\u00dd\u00f3\u00b1_\u00a0\u008fs\u008b\u00f5\u00a5A\u00bb\u00da\u00b9(]\u00c1k\u00fd\u0086\u00f2\u009a".length();
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
lbl110:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "k\u00cb\u009b_iH|I\u00cf\u000e\u00aa\u0088\u0089nh\u00b3";
                    var5_11 = "k\u00cb\u009b_iH|I\u00cf\u000e\u00aa\u0088\u0089nh\u00b3".length();
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
lbl123:
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
lbl134:
                // 1 sources

                ** continue;
            }
        }
        ks_0.a = var6_8;
        ks_0.b = new Integer[43];
        ks_0.AutoCloseSource = new ks_0(var8[10], 0);
        ks_0.AllowComment = new ks_0(var8[19], 1);
        ks_0.AllowUnQuotedFieldNames = new ks_0(var8[6], 2);
        ks_0.AllowSingleQuotes = new ks_0(var8[7], 3);
        ks_0.InternFieldNames = new ks_0(var8[12], 4);
        ks_0.AllowISO8601DateFormat = new ks_0(var8[4], 5);
        ks_0.AllowArbitraryCommas = new ks_0(var8[1], ks_0.a(30181, 3104158060755102723L));
        ks_0.UseBigDecimal = new ks_0(var8[24], ks_0.a(23996, 2593361666614985822L));
        ks_0.IgnoreNotMatch = new ks_0(var8[16], ks_0.a(32394, 3782189818217572160L));
        ks_0.SortFeidFastMatch = new ks_0(var8[25], ks_0.a(12737, 5299983739143907375L));
        ks_0.DisableASM = new ks_0(var8[5], ks_0.a(16517, 2314342454767229304L));
        ks_0.DisableCircularReferenceDetect = new ks_0(var8[23], ks_0.a(2400, 3364207239454806171L));
        ks_0.InitStringFieldAsEmpty = new ks_0(var8[15], ks_0.a(29932, 1640517320552918299L));
        ks_0.SupportArrayToBean = new ks_0(var8[3], ks_0.a(7840, 941895511610279749L));
        ks_0.OrderedField = new ks_0(var8[8], ks_0.a(14852, 7330892562661958624L));
        ks_0.DisableSpecialKeyDetect = new ks_0(var8[22], ks_0.a(30771, 6546481104097583579L));
        ks_0.UseObjectArray = new ks_0(var8[13], ks_0.a(18870, 3799911951648788602L));
        ks_0.SupportNonPublicField = new ks_0(var8[17], ks_0.a(16147, 3447915570520286931L));
        ks_0.IgnoreAutoType = new ks_0(var8[2], ks_0.a(25561, 2960200137377430038L));
        ks_0.DisableFieldSmartMatch = new ks_0(var8[9], ks_0.a(10208, 6897072936024636950L));
        ks_0.SupportAutoType = new ks_0(var8[11], ks_0.a(17492, 4894094071806107063L));
        ks_0.NonStringKeyAsString = new ks_0(var8[21], ks_0.a(7985, 1774907525179131586L));
        ks_0.CustomMapDeserializer = new ks_0(var8[14], ks_0.a(30216, 6903372138407866340L));
        ks_0.ErrorOnEnumNotMatch = new ks_0(var8[0], ks_0.a(29380, 8689709427952298789L));
        ks_0.SafeMode = new ks_0(var8[20], ks_0.a(29362, 5834394493661915971L));
        ks_0.TrimStringFieldValue = new ks_0(var8[18], ks_0.a(30197, 8136045283378015241L));
        ks_0.UseNativeJavaObject = new ks_0(var8[26], ks_0.a(1419, 720679066532666494L));
        ks_0.s = ks_0.o();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x59E9;
        if (b[n11] == null) {
            ks_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

