/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import org.pcap4j.packet.IllegalRawDataException;
import org.pcap4j.packet.TcpPacket;
import org.pcap4j.packet.namednumber.TcpOptionKind;
import org.pcap4j.util.ByteArrays;

/*
 * Renamed from Fi
 */
public final class fi_0
implements TcpPacket.TcpOption {
    private static final long serialVersionUID;
    private final TcpOptionKind z;
    private final byte r;
    private final List j;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public static fi_0 Y(byte[] byArray, int n10, int n11) throws IllegalRawDataException {
        ByteArrays.validateBounds(byArray, n10, n11);
        return new fi_0(byArray, n10, n11);
    }

    /*
     * Unable to fully structure code
     */
    private fi_0(byte[] var1_1, int var2_2, int var3_3) throws IllegalRawDataException {
        block25: {
            block26: {
                block23: {
                    block24: {
                        block21: {
                            block22: {
                                block20: {
                                    block18: {
                                        block19: {
                                            super();
                                            this.z = TcpOptionKind.SACK;
                                            this.j = new ArrayList<E>();
                                            var4_4 = li_0.I();
                                            try {
                                                v0 = var3_3;
                                                v1 = 2;
                                                if (var4_4 != null) break block18;
                                                if (v0 >= v1) break block19;
                                            }
                                            catch (IllegalRawDataException v2) {
                                                throw fi_0.a(v2);
                                            }
                                            var5_5 = new StringBuilder(fi_0.a(22231, 4324881667024271662L));
                                            var5_5.append("The raw data length must be more than 1. rawData: ").append(ByteArrays.toHexString(var1_1, " ")).append(", offset: ").append(var2_2).append(", length: ").append(var3_3);
                                            throw new IllegalRawDataException(var5_5.toString());
                                        }
                                        try {
                                            v0 = var1_1[var2_2];
                                            if (var4_4 != null) break block20;
                                            v1 = ((Byte)this.z.value()).byteValue();
                                        }
                                        catch (IllegalRawDataException v3) {
                                            throw fi_0.a(v3);
                                        }
                                    }
                                    if (v0 != v1) {
                                        var5_6 = new StringBuilder(fi_0.a(13026, 6583125517290954008L));
                                        var5_6.append("The kind must be: ").append(this.z.valueAsString()).append(" rawData: ").append(ByteArrays.toHexString(var1_1, " ")).append(", offset: ").append(var2_2).append(", length: ").append(var3_3);
                                        throw new IllegalRawDataException(var5_6.toString());
                                    }
                                    this.r = var1_1[1 + var2_2];
                                    v0 = this.R();
                                }
                                var5_7 = v0;
                                try {
                                    try {
                                        v4 = var5_7;
                                        v5 = 2;
                                        if (var4_4 != null) break block21;
                                        if (v4 >= v5) break block22;
                                    }
                                    catch (IllegalRawDataException v6) {
                                        throw fi_0.a(v6);
                                    }
                                    throw new IllegalRawDataException("The value of length field must be  more than 1 but: " + var5_7);
                                }
                                catch (IllegalRawDataException v7) {
                                    throw fi_0.a(v7);
                                }
                            }
                            v4 = var5_7 - 2;
                            v5 = fi_0.a(642, 3892549993512463742L);
                        }
                        try {
                            v8 = v4 % v5;
                            if (var4_4 != null) break block23;
                            if (v8 == 0) break block24;
                        }
                        catch (IllegalRawDataException v9) {
                            throw fi_0.a(v9);
                        }
                        var6_8 = new StringBuilder(fi_0.a(21942, 2704719501806549576L));
                        var6_8.append("The value of length field must be an integer multiple of 8 octets long but: ").append(var5_7);
                        throw new IllegalRawDataException(var6_8.toString());
                    }
                    v8 = var3_3;
                }
                try {
                    if (var4_4 != null) break block25;
                    if (v8 >= var5_7) break block26;
                }
                catch (IllegalRawDataException v10) {
                    throw fi_0.a(v10);
                }
                var6_9 = new StringBuilder(fi_0.a(21942, 2704719501806549576L));
                var6_9.append("rawData is too short. length field: ").append(var5_7).append(", rawData: ").append(ByteArrays.toHexString(var1_1, " ")).append(", offset: ").append(var2_2).append(", length: ").append(var3_3);
                throw new IllegalRawDataException(var6_9.toString());
            }
            v8 = 2;
        }
        var6_10 = v8;
        try {
            if (var4_4 != null) {
                while (true) {
                    this.j.add(new jf_0(ByteArrays.getInt(var1_1, var6_10 + var2_2), ByteArrays.getInt(var1_1, var6_10 + 4 + var2_2)));
                    break;
                }
            }
            ** GOTO lbl90
        }
        catch (IllegalRawDataException v11) {
            throw fi_0.a(v11);
        }
        do {
            var6_10 += 8;
lbl90:
            // 2 sources

            if (var6_10 < var5_7) ** continue;
        } while (var4_4 != null);
    }

    private fi_0(bb_1 bb_12) {
        block16: {
            block14: {
                fi_0 fi_02;
                List list;
                String[] stringArray;
                block12: {
                    block13: {
                        block11: {
                            bb_1 bb_13;
                            block10: {
                                String[] stringArray2 = li_0.I();
                                this.z = TcpOptionKind.SACK;
                                this.j = new ArrayList();
                                stringArray = stringArray2;
                                try {
                                    bb_13 = bb_12;
                                    if (stringArray != null) break block10;
                                    if (bb_13 == null) break block11;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw fi_0.a(nullPointerException);
                                }
                                bb_13 = bb_12;
                            }
                            try {
                                list = bb_1.B(bb_13);
                                if (stringArray != null) break block12;
                                if (list != null) break block13;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw fi_0.a(nullPointerException);
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("builder: ").append(bb_12).append(" builder.sacks: ").append(bb_1.B(bb_12));
                        throw new NullPointerException(stringBuilder.toString());
                    }
                    try {
                        fi_02 = this;
                        if (stringArray != null) break block14;
                        list = fi_02.j;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw fi_0.a(nullPointerException);
                    }
                }
                try {
                    block15: {
                        try {
                            list.addAll(bb_1.B(bb_12));
                            if (!bb_1.t(bb_12)) break block15;
                            this.r = (byte)this.length();
                            if (stringArray == null) break block16;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fi_0.a(nullPointerException);
                        }
                    }
                    fi_02 = this;
                }
                catch (NullPointerException nullPointerException) {
                    throw fi_0.a(nullPointerException);
                }
            }
            fi_02.r = bb_1.A(bb_12);
        }
    }

    @Override
    public TcpOptionKind getKind() {
        return this.z;
    }

    public byte o() {
        return this.r;
    }

    public int R() {
        return fi_0.a(20711, 2672142846314626844L) & this.r;
    }

    @Override
    public int length() {
        return this.j.size() * 4 * 2 + 2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public byte[] getRawData() {
        var2_1 = new byte[this.length()];
        var2_1[0] = (Byte)this.z.value();
        var1_2 = li_0.I();
        var2_1[1] = this.r;
        var3_3 = 2;
        var5_4 = this.j.iterator();
        try {
            if (var1_2 != null) {
                while (true) {
                    v0 /* !! */  = var5_4.next();
                    break;
                }
            }
            ** GOTO lbl20
        }
        catch (NullPointerException v1) {
            throw fi_0.a(v1);
        }
        do {
            var4_5 = (jf_0)v0 /* !! */ ;
            System.arraycopy(ByteArrays.toByteArray(jf_0.s(var4_5)), 0, var2_1, var3_3, 4);
            System.arraycopy(ByteArrays.toByteArray(jf_0.v(var4_5)), 0, var2_1, var3_3 + 4, 4);
            var3_3 += 8;
lbl20:
            // 2 sources

            if (var5_4.hasNext()) ** continue;
            v0 /* !! */  = (E)var2_1;
        } while (var1_2 != null);
        return v0 /* !! */ ;
    }

    public bb_1 Z() {
        return new bb_1(this, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String toString() {
        v0 = li_0.I();
        var2_1 = new StringBuilder();
        var2_1.append("[Kind: ").append(this.z);
        var1_2 = v0;
        var2_1.append("] [Length: ").append(this.R()).append(" bytes]");
        var4_3 = this.j.iterator();
        try {
            if (var1_2 != null) {
                while (true) {
                    v1 /* !! */  = var4_3.next();
                    break;
                }
            }
            ** GOTO lbl21
        }
        catch (NullPointerException v2) {
            throw fi_0.a(v2);
        }
        do {
            var3_4 = (jf_0)v1 /* !! */ ;
            var2_1.append(" [LE: ").append(var3_4.C()).append(" RE: ").append(var3_4.y()).append("]");
lbl21:
            // 2 sources

            if (var4_3.hasNext()) ** continue;
            v1 /* !! */  = var2_1.toString();
        } while (var1_2 != null);
        return v1 /* !! */ ;
    }

    public boolean equals(Object object) {
        byte by;
        block17: {
            block18: {
                Object object2;
                String[] stringArray;
                block15: {
                    block16: {
                        stringArray = li_0.I();
                        try {
                            if (object == this) {
                                return true;
                            }
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fi_0.a(nullPointerException);
                        }
                        try {
                            try {
                                object2 = this.getClass();
                                if (stringArray != null) break block15;
                                if (((Class)object2).isInstance(object)) break block16;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw fi_0.a(nullPointerException);
                            }
                            return false;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fi_0.a(nullPointerException);
                        }
                    }
                    object2 = object;
                }
                fi_0 fi_02 = (fi_0)object2;
                try {
                    try {
                        try {
                            try {
                                by = this.r;
                                if (stringArray != null) break block17;
                                if (by != fi_02.r) break block18;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw fi_0.a(nullPointerException);
                            }
                            by = this.j.equals(fi_02.j) ? 1 : 0;
                            if (stringArray != null) break block17;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw fi_0.a(nullPointerException);
                        }
                        if (by == 0) break block18;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw fi_0.a(nullPointerException);
                    }
                    return true;
                }
                catch (NullPointerException nullPointerException) {
                    throw fi_0.a(nullPointerException);
                }
            }
            by = 0;
        }
        return by != 0;
    }

    public List I() {
        return this.j;
    }

    public int hashCode() {
        int n10 = fi_0.a(21466, 7932917142897835047L);
        n10 = fi_0.a(29172, 4223815167686483467L) * n10 + this.r;
        n10 = fi_0.a(30806, 2460151967734568878L) * n10 + this.j.hashCode();
        return n10;
    }

    static byte j(fi_0 fi_02) {
        return fi_02.r;
    }

    fi_0(bb_1 bb_12, fi_0 fi_02) {
        this(bb_12);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var17 = new String[18];
                            var15_1 = 0;
                            var14_2 = "\u008a\u0004}\u00bcAz\u00f4\u00d6\u00bc\brx<\u00b92g\u007fBY:\u00b4\u00e2\u00fad\u001bA\u008a\u00b1\u0001\u00a2\u0005\u00ca\u00e9L\u00e6\u00e6\b&\u00ea\u009b\u00c2}\u00e9;\u00a3\u00e6\u0099Xd\u0092\n\u00c5;\u00e9\\\u008c\u00fa\u00c9\u00c2\u0015\u0015\t\u00e5\u001clM\u00f8\u0085\u0012\u00b7\u0081\n\b\u00b8S/\u00b0\u00e3Vk\u00d5\u00bf$\u007f]3\u00db\u00cbk\u00c2C\u00a3\u00a8i)\u00ce'\u008f\u00ca*R\u0007\u0014e\u00ac\u00f4Ch\u0093r\u0006`\u001c\u00d65\u00a7\u00a3\u00b8H\u0010\u00b2\u00d7\u0090\u00c4\u00f0\u0010\rl\u0099U\u00c0\u0081\u0096\u00db\u001a\u0099\nqd\u00fc\u00be\u00c3\u0087W(\u00f5\u00ff\u0012\u00f5\u00b1\u0092\n\u00a5\u00a4K@5\u001a\u008e\u00a5\u00d6\u001e\u00b6]U;\u0007i\u00e5\u00e7\u009f\u009a\u00d2P\n\u00bd?\u00e6\u00dcm\u00ea\u00f5\u00c0\u0092U\n\u00c0?J\u00df\u0093\u00fd2\u00a8Y\u00c7\u000bz_u\u00fa\u00ae\\\u00ec\u00a8\u00a1B\b4\u00a1\u008a\u0018m\u00e9@~\u00c4\u0094\u00f4M\u0089\u00a3`\u00c1\\\u0001%\u0096\u00d6Fc\u00d8\u00d3\u00cf\u00ee\u00d4\u001b\u00dd\u0013\u0011\u00836\u00d6\u00b8g\u0083\u00c9\u00eep\u00c8\u00d5vn4&\u00d7\u0019<\u008d\u00b9\u00fcL=\u00e3\u008b@\u009b\u00e50p]bt[\u0084:%\u0017\u009dL\u0005\u00fb4\u00c6\u0096g\u0006x\u00ed\u00c9\u00faI\u00f5\u00c8\u00aa\u00bfjI\u00fft\u00cc\u00eb\u00f7w\u00a6\u00c8\u00aa1Q\"\u00128\u0017\u00b8\u0080\u0083\u001e\u00a5\u0095\u00f9!\u00166\u009c;\u00e9\u0002pH\u0010.p\u00b28\u0090$\u00a6\u00f6\u0005\u0081\u0091\u00c6i@\u0007{\u008b\u00a1DA\u00b9w";
                            var16_3 = "\u008a\u0004}\u00bcAz\u00f4\u00d6\u00bc\brx<\u00b92g\u007fBY:\u00b4\u00e2\u00fad\u001bA\u008a\u00b1\u0001\u00a2\u0005\u00ca\u00e9L\u00e6\u00e6\b&\u00ea\u009b\u00c2}\u00e9;\u00a3\u00e6\u0099Xd\u0092\n\u00c5;\u00e9\\\u008c\u00fa\u00c9\u00c2\u0015\u0015\t\u00e5\u001clM\u00f8\u0085\u0012\u00b7\u0081\n\b\u00b8S/\u00b0\u00e3Vk\u00d5\u00bf$\u007f]3\u00db\u00cbk\u00c2C\u00a3\u00a8i)\u00ce'\u008f\u00ca*R\u0007\u0014e\u00ac\u00f4Ch\u0093r\u0006`\u001c\u00d65\u00a7\u00a3\u00b8H\u0010\u00b2\u00d7\u0090\u00c4\u00f0\u0010\rl\u0099U\u00c0\u0081\u0096\u00db\u001a\u0099\nqd\u00fc\u00be\u00c3\u0087W(\u00f5\u00ff\u0012\u00f5\u00b1\u0092\n\u00a5\u00a4K@5\u001a\u008e\u00a5\u00d6\u001e\u00b6]U;\u0007i\u00e5\u00e7\u009f\u009a\u00d2P\n\u00bd?\u00e6\u00dcm\u00ea\u00f5\u00c0\u0092U\n\u00c0?J\u00df\u0093\u00fd2\u00a8Y\u00c7\u000bz_u\u00fa\u00ae\\\u00ec\u00a8\u00a1B\b4\u00a1\u008a\u0018m\u00e9@~\u00c4\u0094\u00f4M\u0089\u00a3`\u00c1\\\u0001%\u0096\u00d6Fc\u00d8\u00d3\u00cf\u00ee\u00d4\u001b\u00dd\u0013\u0011\u00836\u00d6\u00b8g\u0083\u00c9\u00eep\u00c8\u00d5vn4&\u00d7\u0019<\u008d\u00b9\u00fcL=\u00e3\u008b@\u009b\u00e50p]bt[\u0084:%\u0017\u009dL\u0005\u00fb4\u00c6\u0096g\u0006x\u00ed\u00c9\u00faI\u00f5\u00c8\u00aa\u00bfjI\u00fft\u00cc\u00eb\u00f7w\u00a6\u00c8\u00aa1Q\"\u00128\u0017\u00b8\u0080\u0083\u001e\u00a5\u0095\u00f9!\u00166\u009c;\u00e9\u0002pH\u0010.p\u00b28\u0090$\u00a6\u00f6\u0005\u0081\u0091\u00c6i@\u0007{\u008b\u00a1DA\u00b9w".length();
                            var13_4 = 50;
                            var12_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 61;
                                v1 = ++var12_5;
                                v2 = var14_2.substring(v1, v1 + var13_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 = "\u00ed\u00ae\u00d0\u00c8%\u0099\u00ea^\u008f\u00bd\u00c4\u0006\\\u00c2Uu!\u00ea";
                                var16_3 = "\u00ed\u00ae\u00d0\u00c8%\u0099\u00ea^\u008f\u00bd\u00c4\u0006\\\u00c2Uu!\u00ea".length();
                                var13_4 = 11;
                                var12_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 60;
                                    v5 = ++var12_5;
                                    v2 = var14_2.substring(v5, v5 + var13_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v4.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var18_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var18_6;
                            while (true) {
                                switch (var18_6 % 7) {
                                    case 0: {
                                        v15 = 1;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 77;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 45;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 74;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 106;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 123;
                                        break;
                                    }
                                    default: {
                                        v15 = 64;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var18_6;
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
                        } while (v10 > var18_6);
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
                    fi_0.a = var17;
                    fi_0.b = new String[18];
                    var4_7 = 933744839589915477L;
                    var10_8 = new long[8];
                    var7_9 = 0;
                    var8_10 = "\u00e2\u00c4\u00ff\nss\u00b6)\u00cat\u00ad\u000f\u00d53T\u00b6\u00c162\u00a8 \u00d0|\u00e4\u0001N\u00a5\u0089@\b\u00d2I\u00b2\u00b0\u00c0\u00a2\u0080\u00dcQy^\u00c4\u00b5\u0096(@uA";
                    var9_11 = "\u00e2\u00c4\u00ff\nss\u00b6)\u00cat\u00ad\u000f\u00d53T\u00b6\u00c162\u00a8 \u00d0|\u00e4\u0001N\u00a5\u0089@\b\u00d2I\u00b2\u00b0\u00c0\u00a2\u0080\u00dcQy^\u00c4\u00b5\u0096(@uA".length();
                    var6_12 = 0;
                    while (true) {
                        var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                        v17 = var10_8;
                        v18 = var7_9++;
                        v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        var8_10 = "\u00fc\u00c6\u00aa\u00d3s^\u0006#\n\u00d2^\u00dcm\u0094Wc";
                        var9_11 = "\u00fc\u00c6\u00aa\u00d3s^\u0006#\n\u00d2^\u00dcm\u0094Wc".length();
                        var6_12 = 0;
                        while (true) {
                            var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                            v17 = var10_8;
                            v18 = var7_9++;
                            v19 = ((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var6_12 < var9_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var4_7;
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
            fi_0.c = var10_8;
            fi_0.d = new Integer[8];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 5649775051527036211L;
        ** while (true)
        fi_0.serialVersionUID = var0_15 = -7170584330509061148L ^ var2_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x739A) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 160;
                    break;
                }
                case 1: {
                    n14 = 2;
                    break;
                }
                case 2: {
                    n14 = 220;
                    break;
                }
                case 3: {
                    n14 = 102;
                    break;
                }
                case 4: {
                    n14 = 190;
                    break;
                }
                case 5: {
                    n14 = 172;
                    break;
                }
                case 6: {
                    n14 = 59;
                    break;
                }
                case 7: {
                    n14 = 51;
                    break;
                }
                case 8: {
                    n14 = 87;
                    break;
                }
                case 9: {
                    n14 = 136;
                    break;
                }
                case 10: {
                    n14 = 6;
                    break;
                }
                case 11: {
                    n14 = 222;
                    break;
                }
                case 12: {
                    n14 = 116;
                    break;
                }
                case 13: {
                    n14 = 97;
                    break;
                }
                case 14: {
                    n14 = 55;
                    break;
                }
                case 15: {
                    n14 = 100;
                    break;
                }
                case 16: {
                    n14 = 244;
                    break;
                }
                case 17: {
                    n14 = 23;
                    break;
                }
                case 18: {
                    n14 = 110;
                    break;
                }
                case 19: {
                    n14 = 33;
                    break;
                }
                case 20: {
                    n14 = 28;
                    break;
                }
                case 21: {
                    n14 = 117;
                    break;
                }
                case 22: {
                    n14 = 204;
                    break;
                }
                case 23: {
                    n14 = 245;
                    break;
                }
                case 24: {
                    n14 = 1;
                    break;
                }
                case 25: {
                    n14 = 129;
                    break;
                }
                case 26: {
                    n14 = 235;
                    break;
                }
                case 27: {
                    n14 = 216;
                    break;
                }
                case 28: {
                    n14 = 63;
                    break;
                }
                case 29: {
                    n14 = 105;
                    break;
                }
                case 30: {
                    n14 = 249;
                    break;
                }
                case 31: {
                    n14 = 10;
                    break;
                }
                case 32: {
                    n14 = 233;
                    break;
                }
                case 33: {
                    n14 = 90;
                    break;
                }
                case 34: {
                    n14 = 101;
                    break;
                }
                case 35: {
                    n14 = 82;
                    break;
                }
                case 36: {
                    n14 = 238;
                    break;
                }
                case 37: {
                    n14 = 98;
                    break;
                }
                case 38: {
                    n14 = 121;
                    break;
                }
                case 39: {
                    n14 = 237;
                    break;
                }
                case 40: {
                    n14 = 188;
                    break;
                }
                case 41: {
                    n14 = 227;
                    break;
                }
                case 42: {
                    n14 = 39;
                    break;
                }
                case 43: {
                    n14 = 78;
                    break;
                }
                case 44: {
                    n14 = 16;
                    break;
                }
                case 45: {
                    n14 = 140;
                    break;
                }
                case 46: {
                    n14 = 164;
                    break;
                }
                case 47: {
                    n14 = 81;
                    break;
                }
                case 48: {
                    n14 = 177;
                    break;
                }
                case 49: {
                    n14 = 157;
                    break;
                }
                case 50: {
                    n14 = 248;
                    break;
                }
                case 51: {
                    n14 = 201;
                    break;
                }
                case 52: {
                    n14 = 74;
                    break;
                }
                case 53: {
                    n14 = 200;
                    break;
                }
                case 54: {
                    n14 = 73;
                    break;
                }
                case 55: {
                    n14 = 85;
                    break;
                }
                case 56: {
                    n14 = 131;
                    break;
                }
                case 57: {
                    n14 = 118;
                    break;
                }
                case 58: {
                    n14 = 72;
                    break;
                }
                case 59: {
                    n14 = 146;
                    break;
                }
                case 60: {
                    n14 = 46;
                    break;
                }
                case 61: {
                    n14 = 50;
                    break;
                }
                case 62: {
                    n14 = 25;
                    break;
                }
                case 63: {
                    n14 = 156;
                    break;
                }
                case 64: {
                    n14 = 255;
                    break;
                }
                case 65: {
                    n14 = 114;
                    break;
                }
                case 66: {
                    n14 = 79;
                    break;
                }
                case 67: {
                    n14 = 203;
                    break;
                }
                case 68: {
                    n14 = 166;
                    break;
                }
                case 69: {
                    n14 = 58;
                    break;
                }
                case 70: {
                    n14 = 94;
                    break;
                }
                case 71: {
                    n14 = 158;
                    break;
                }
                case 72: {
                    n14 = 26;
                    break;
                }
                case 73: {
                    n14 = 40;
                    break;
                }
                case 74: {
                    n14 = 228;
                    break;
                }
                case 75: {
                    n14 = 239;
                    break;
                }
                case 76: {
                    n14 = 137;
                    break;
                }
                case 77: {
                    n14 = 21;
                    break;
                }
                case 78: {
                    n14 = 115;
                    break;
                }
                case 79: {
                    n14 = 167;
                    break;
                }
                case 80: {
                    n14 = 194;
                    break;
                }
                case 81: {
                    n14 = 171;
                    break;
                }
                case 82: {
                    n14 = 109;
                    break;
                }
                case 83: {
                    n14 = 218;
                    break;
                }
                case 84: {
                    n14 = 207;
                    break;
                }
                case 85: {
                    n14 = 80;
                    break;
                }
                case 86: {
                    n14 = 20;
                    break;
                }
                case 87: {
                    n14 = 179;
                    break;
                }
                case 88: {
                    n14 = 56;
                    break;
                }
                case 89: {
                    n14 = 135;
                    break;
                }
                case 90: {
                    n14 = 111;
                    break;
                }
                case 91: {
                    n14 = 99;
                    break;
                }
                case 92: {
                    n14 = 139;
                    break;
                }
                case 93: {
                    n14 = 215;
                    break;
                }
                case 94: {
                    n14 = 246;
                    break;
                }
                case 95: {
                    n14 = 27;
                    break;
                }
                case 96: {
                    n14 = 193;
                    break;
                }
                case 97: {
                    n14 = 243;
                    break;
                }
                case 98: {
                    n14 = 69;
                    break;
                }
                case 99: {
                    n14 = 47;
                    break;
                }
                case 100: {
                    n14 = 214;
                    break;
                }
                case 101: {
                    n14 = 49;
                    break;
                }
                case 102: {
                    n14 = 223;
                    break;
                }
                case 103: {
                    n14 = 75;
                    break;
                }
                case 104: {
                    n14 = 62;
                    break;
                }
                case 105: {
                    n14 = 104;
                    break;
                }
                case 106: {
                    n14 = 4;
                    break;
                }
                case 107: {
                    n14 = 250;
                    break;
                }
                case 108: {
                    n14 = 209;
                    break;
                }
                case 109: {
                    n14 = 253;
                    break;
                }
                case 110: {
                    n14 = 113;
                    break;
                }
                case 111: {
                    n14 = 155;
                    break;
                }
                case 112: {
                    n14 = 217;
                    break;
                }
                case 113: {
                    n14 = 83;
                    break;
                }
                case 114: {
                    n14 = 93;
                    break;
                }
                case 115: {
                    n14 = 234;
                    break;
                }
                case 116: {
                    n14 = 189;
                    break;
                }
                case 117: {
                    n14 = 132;
                    break;
                }
                case 118: {
                    n14 = 123;
                    break;
                }
                case 119: {
                    n14 = 169;
                    break;
                }
                case 120: {
                    n14 = 60;
                    break;
                }
                case 121: {
                    n14 = 24;
                    break;
                }
                case 122: {
                    n14 = 149;
                    break;
                }
                case 123: {
                    n14 = 219;
                    break;
                }
                case 124: {
                    n14 = 41;
                    break;
                }
                case 125: {
                    n14 = 145;
                    break;
                }
                case 126: {
                    n14 = 44;
                    break;
                }
                case 127: {
                    n14 = 18;
                    break;
                }
                case 128: {
                    n14 = 229;
                    break;
                }
                case 129: {
                    n14 = 197;
                    break;
                }
                case 130: {
                    n14 = 148;
                    break;
                }
                case 131: {
                    n14 = 191;
                    break;
                }
                case 132: {
                    n14 = 112;
                    break;
                }
                case 133: {
                    n14 = 241;
                    break;
                }
                case 134: {
                    n14 = 31;
                    break;
                }
                case 135: {
                    n14 = 210;
                    break;
                }
                case 136: {
                    n14 = 144;
                    break;
                }
                case 137: {
                    n14 = 187;
                    break;
                }
                case 138: {
                    n14 = 91;
                    break;
                }
                case 139: {
                    n14 = 52;
                    break;
                }
                case 140: {
                    n14 = 192;
                    break;
                }
                case 141: {
                    n14 = 119;
                    break;
                }
                case 142: {
                    n14 = 125;
                    break;
                }
                case 143: {
                    n14 = 86;
                    break;
                }
                case 144: {
                    n14 = 213;
                    break;
                }
                case 145: {
                    n14 = 142;
                    break;
                }
                case 146: {
                    n14 = 103;
                    break;
                }
                case 147: {
                    n14 = 5;
                    break;
                }
                case 148: {
                    n14 = 11;
                    break;
                }
                case 149: {
                    n14 = 8;
                    break;
                }
                case 150: {
                    n14 = 92;
                    break;
                }
                case 151: {
                    n14 = 43;
                    break;
                }
                case 152: {
                    n14 = 159;
                    break;
                }
                case 153: {
                    n14 = 183;
                    break;
                }
                case 154: {
                    n14 = 130;
                    break;
                }
                case 155: {
                    n14 = 181;
                    break;
                }
                case 156: {
                    n14 = 230;
                    break;
                }
                case 157: {
                    n14 = 22;
                    break;
                }
                case 158: {
                    n14 = 35;
                    break;
                }
                case 159: {
                    n14 = 84;
                    break;
                }
                case 160: {
                    n14 = 208;
                    break;
                }
                case 161: {
                    n14 = 141;
                    break;
                }
                case 162: {
                    n14 = 178;
                    break;
                }
                case 163: {
                    n14 = 252;
                    break;
                }
                case 164: {
                    n14 = 96;
                    break;
                }
                case 165: {
                    n14 = 143;
                    break;
                }
                case 166: {
                    n14 = 225;
                    break;
                }
                case 167: {
                    n14 = 120;
                    break;
                }
                case 168: {
                    n14 = 186;
                    break;
                }
                case 169: {
                    n14 = 254;
                    break;
                }
                case 170: {
                    n14 = 128;
                    break;
                }
                case 171: {
                    n14 = 212;
                    break;
                }
                case 172: {
                    n14 = 37;
                    break;
                }
                case 173: {
                    n14 = 150;
                    break;
                }
                case 174: {
                    n14 = 221;
                    break;
                }
                case 175: {
                    n14 = 152;
                    break;
                }
                case 176: {
                    n14 = 247;
                    break;
                }
                case 177: {
                    n14 = 89;
                    break;
                }
                case 178: {
                    n14 = 0;
                    break;
                }
                case 179: {
                    n14 = 19;
                    break;
                }
                case 180: {
                    n14 = 34;
                    break;
                }
                case 181: {
                    n14 = 205;
                    break;
                }
                case 182: {
                    n14 = 65;
                    break;
                }
                case 183: {
                    n14 = 224;
                    break;
                }
                case 184: {
                    n14 = 232;
                    break;
                }
                case 185: {
                    n14 = 15;
                    break;
                }
                case 186: {
                    n14 = 211;
                    break;
                }
                case 187: {
                    n14 = 138;
                    break;
                }
                case 188: {
                    n14 = 12;
                    break;
                }
                case 189: {
                    n14 = 185;
                    break;
                }
                case 190: {
                    n14 = 66;
                    break;
                }
                case 191: {
                    n14 = 57;
                    break;
                }
                case 192: {
                    n14 = 122;
                    break;
                }
                case 193: {
                    n14 = 168;
                    break;
                }
                case 194: {
                    n14 = 251;
                    break;
                }
                case 195: {
                    n14 = 106;
                    break;
                }
                case 196: {
                    n14 = 61;
                    break;
                }
                case 197: {
                    n14 = 174;
                    break;
                }
                case 198: {
                    n14 = 67;
                    break;
                }
                case 199: {
                    n14 = 127;
                    break;
                }
                case 200: {
                    n14 = 226;
                    break;
                }
                case 201: {
                    n14 = 202;
                    break;
                }
                case 202: {
                    n14 = 163;
                    break;
                }
                case 203: {
                    n14 = 147;
                    break;
                }
                case 204: {
                    n14 = 95;
                    break;
                }
                case 205: {
                    n14 = 13;
                    break;
                }
                case 206: {
                    n14 = 53;
                    break;
                }
                case 207: {
                    n14 = 161;
                    break;
                }
                case 208: {
                    n14 = 32;
                    break;
                }
                case 209: {
                    n14 = 48;
                    break;
                }
                case 210: {
                    n14 = 180;
                    break;
                }
                case 211: {
                    n14 = 195;
                    break;
                }
                case 212: {
                    n14 = 45;
                    break;
                }
                case 213: {
                    n14 = 162;
                    break;
                }
                case 214: {
                    n14 = 170;
                    break;
                }
                case 215: {
                    n14 = 134;
                    break;
                }
                case 216: {
                    n14 = 7;
                    break;
                }
                case 217: {
                    n14 = 199;
                    break;
                }
                case 218: {
                    n14 = 153;
                    break;
                }
                case 219: {
                    n14 = 14;
                    break;
                }
                case 220: {
                    n14 = 236;
                    break;
                }
                case 221: {
                    n14 = 176;
                    break;
                }
                case 222: {
                    n14 = 196;
                    break;
                }
                case 223: {
                    n14 = 29;
                    break;
                }
                case 224: {
                    n14 = 231;
                    break;
                }
                case 225: {
                    n14 = 184;
                    break;
                }
                case 226: {
                    n14 = 70;
                    break;
                }
                case 227: {
                    n14 = 68;
                    break;
                }
                case 228: {
                    n14 = 154;
                    break;
                }
                case 229: {
                    n14 = 240;
                    break;
                }
                case 230: {
                    n14 = 88;
                    break;
                }
                case 231: {
                    n14 = 71;
                    break;
                }
                case 232: {
                    n14 = 108;
                    break;
                }
                case 233: {
                    n14 = 182;
                    break;
                }
                case 234: {
                    n14 = 9;
                    break;
                }
                case 235: {
                    n14 = 77;
                    break;
                }
                case 236: {
                    n14 = 3;
                    break;
                }
                case 237: {
                    n14 = 30;
                    break;
                }
                case 238: {
                    n14 = 124;
                    break;
                }
                case 239: {
                    n14 = 173;
                    break;
                }
                case 240: {
                    n14 = 38;
                    break;
                }
                case 241: {
                    n14 = 42;
                    break;
                }
                case 242: {
                    n14 = 151;
                    break;
                }
                case 243: {
                    n14 = 242;
                    break;
                }
                case 244: {
                    n14 = 198;
                    break;
                }
                case 245: {
                    n14 = 206;
                    break;
                }
                case 246: {
                    n14 = 17;
                    break;
                }
                case 247: {
                    n14 = 54;
                    break;
                }
                case 248: {
                    n14 = 36;
                    break;
                }
                case 249: {
                    n14 = 165;
                    break;
                }
                case 250: {
                    n14 = 133;
                    break;
                }
                case 251: {
                    n14 = 76;
                    break;
                }
                case 252: {
                    n14 = 64;
                    break;
                }
                case 253: {
                    n14 = 126;
                    break;
                }
                case 254: {
                    n14 = 175;
                    break;
                }
                default: {
                    n14 = 107;
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
            fi_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6FFA;
        if (d[n11] == null) {
            fi_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

