/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.F.c;
import org.I;
import org.U;
import org.V.J;
import org.V.N;
import org.Y;
import org.b_0;
import org.h.cr_0;
import org.v.RB;
import org.v.RG;
import org.v._L;
import org.v.f0;
import org.v.hG;
import org.v.h_1;
import org.v.hc_0;
import org.v.hd_0;
import org.v.rd_0;

/*
 * Renamed from org.v._y
 */
public class _y_0
extends _L {
    private static final Logger MG;
    private J M2;
    private Charset MR;
    private EnumSet Mv = EnumSet.noneOf(rd_0.class);
    private final Set MZ = new HashSet<E>();
    private int M3 = -1;
    private int Mz = -1;
    @c
    private U MK;
    @c
    private Y Mf;
    private static final String[] cb;
    private static final String[] db;
    private static final long eb;

    /*
     * Unable to fully structure code
     */
    public _y_0(J var1_1, @c String var2_2, @c _L var3_3) {
        super(var3_3);
        this.M2 = var1_1;
        var4_4 = RG.C();
        v0 = var2_2;
        if (var4_4 == null) ** GOTO lbl14
        if (v0 == null) {
            v1 = Charset.defaultCharset();
        } else {
            v0 = var2_2;
lbl14:
            // 2 sources

            v1 = Charset.forName(v0);
        }
        this.MR = v1;
        super.L();
    }

    public void n(int n10) {
        this.M3 = n10;
    }

    public void P(int n10) {
        this.Mz = n10;
    }

    public Set V() {
        return this.MZ;
    }

    public void T(J j2) {
        this.M2 = j2;
    }

    public J x() {
        return this.M2;
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    public void I(@c String var1_1) {
        var2_2 = RG.C();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl8
        if (v0 == null) {
            v1 = Charset.defaultCharset();
        } else {
            v0 = var1_1;
lbl8:
            // 2 sources

            v1 = Charset.forName(v0);
        }
        this.v(v1);
    }

    public void v(Charset charset) {
        this.MR = charset;
    }

    public void H(@c U u10) {
        this.MK = u10;
    }

    public void z(@c Y y2) {
        this.Mf = y2;
    }

    public EnumSet e() {
        return this.Mv;
    }

    public _y_0 G(EnumSet enumSet) {
        this.Mv = enumSet;
        return this;
    }

    /*
     * Loose catch block
     */
    @Override
    @c
    public hd_0 x(String string) throws ClassNotFoundException {
        hd_0 hd_02;
        String string2;
        int n10;
        String[] stringArray;
        String string3;
        block23: {
            block24: {
                String[] stringArray2 = RG.C();
                MG.entering(null, _y_0.b(-26817, -4411), string);
                string3 = f0.F(string);
                stringArray = stringArray2;
                MG.log(Level.FINE, _y_0.b(-26820, 717), string3);
                n10 = string3.startsWith(_y_0.b(-26821, -15576));
                if (stringArray == null) break block23;
                try {
                    block31: {
                        if (n10 == 0) break block24;
                        break block31;
                        catch (IOException iOException) {
                            throw _y_0.a(iOException);
                        }
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw _y_0.a(iOException);
                }
            }
            n10 = string3.indexOf((int)eb);
        }
        int n11 = n10;
        try {
            string2 = n11 == -1 ? string3 : string3.substring(0, n11);
        }
        catch (IOException iOException) {
            throw _y_0.a(iOException);
        }
        String string4 = string2;
        for (h_1 h_12 : this.MZ) {
            block25: {
                hd_0 hd_03;
                block27: {
                    block26: {
                        hd_02 = h_12.u(string4);
                        try {
                            if (hd_02 == null) break block25;
                            if (string3.equals(string4)) break block26;
                        }
                        catch (IOException iOException) {
                            throw _y_0.a(iOException);
                        }
                        hd_02 = h_12.u(string3);
                        hd_03 = hd_02;
                        if (stringArray == null) break block27;
                        try {
                            block32: {
                                if (hd_03 != null) break block26;
                                break block32;
                                catch (IOException iOException) {
                                    throw _y_0.a(iOException);
                                }
                            }
                            return null;
                        }
                        catch (IOException iOException) {
                            throw _y_0.a(iOException);
                        }
                    }
                    this.l(hd_02);
                    hd_03 = hd_02;
                }
                return hd_03;
            }
            if (stringArray != null) continue;
        }
        try {
            hd_0 hd_04;
            block28: {
                block29: {
                    block30: {
                        block33: {
                            h_1 h_12;
                            RB rB = this.l(string3);
                            if (rB == null) {
                                return null;
                            }
                            h_12 = new h_1(rB, this).F(this.Mv);
                            h_12.s(this.Mz);
                            h_12.E(this.MK);
                            h_12.Y(this.Mf);
                            this.MZ.add(h_12);
                            hd_02 = h_12.u(string3);
                            hd_04 = hd_02;
                            if (stringArray == null) break block28;
                            if (hd_04 != null) break block29;
                            break block33;
                            catch (IOException iOException) {
                                throw _y_0.a(iOException);
                            }
                        }
                        try {
                            block34: {
                                if (!string3.equals(string4)) break block30;
                                break block34;
                                catch (IOException iOException) {
                                    throw _y_0.a(iOException);
                                }
                            }
                            throw new b_0(_y_0.b(-26823, -32633) + string3 + _y_0.b(-26824, 12573), (I)null);
                        }
                        catch (IOException iOException) {
                            throw _y_0.a(iOException);
                        }
                    }
                    return null;
                }
                this.l(hd_02);
                hd_04 = hd_02;
            }
            return hd_04;
        }
        catch (IOException iOException) {
            throw new ClassNotFoundException(_y_0.b(-26818, -23400) + string3 + "'", iOException);
        }
        catch (b_0 b_02) {
            throw new ClassNotFoundException(_y_0.b(-26819, -31325) + string3 + "'", b_02);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @c
    protected RB l(String string) throws IOException, b_0 {
        N n10;
        N n11;
        block11: {
            block12: {
                String[] stringArray = RG.C();
                n11 = this.M2.J(cr_0.R(string));
                MG.log(Level.FINE, _y_0.b(-26822, 11131), n11);
                String[] stringArray2 = stringArray;
                n10 = n11;
                if (stringArray2 == null) break block11;
                try {
                    block13: {
                        if (n10 != null) break block12;
                        break block13;
                        catch (IOException iOException) {
                            throw _y_0.a(iOException);
                        }
                    }
                    return null;
                }
                catch (IOException iOException) {
                    throw _y_0.a(iOException);
                }
            }
            n10 = n11;
        }
        InputStream inputStream = n10.o();
        try {
            hc_0 hc_02 = new hc_0(n11.o(), new InputStreamReader(inputStream, this.MR));
            hG hG2 = new hG(hc_02);
            hG2.Q(this.M3);
            hG2.S(this.Mf);
            RB rB = hG2.X();
            return rB;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {}
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[8];
                    var5_1 = 0;
                    var4_2 = "Jl\u0090\u00f4P\u00fb\u00beS\u0018`\u00a2E\u00f5s\u00b5RM\u001c-B\"p\u0084h\u0016u\b\u000eI\u00e8\\+\u0091y\u00b7#U\u0093u\u00e79_\u00d6\u00f2\u000f\u0014\u001avE}\u00f9U\u0004\u00a4|\u00c5UCi\u00ff\u001b\u0003F\u00d7\u0005\u0097\u0010<\u00a5\u00fa\u0012\u00d5\u008aM*\u00fak\u0093x\u00f26\u00bd\u00ddxs\u00847\u00a5\u0004\u001aL\b>\u00b4y\u0092\u009dh\u00b0\u00d9\u00ff\"!\u00c7\u00b8\u0086\u00ac\u00ceT\f\u00cdr\u00e0\u0006\u00f3\u00f6\r~W>\u00f3\u0012Z\u00af\u00186a\u00ffm\u00e1";
                    var6_3 = "Jl\u0090\u00f4P\u00fb\u00beS\u0018`\u00a2E\u00f5s\u00b5RM\u001c-B\"p\u0084h\u0016u\b\u000eI\u00e8\\+\u0091y\u00b7#U\u0093u\u00e79_\u00d6\u00f2\u000f\u0014\u001avE}\u00f9U\u0004\u00a4|\u00c5UCi\u00ff\u001b\u0003F\u00d7\u0005\u0097\u0010<\u00a5\u00fa\u0012\u00d5\u008aM*\u00fak\u0093x\u00f26\u00bd\u00ddxs\u00847\u00a5\u0004\u001aL\b>\u00b4y\u0092\u009dh\u00b0\u00d9\u00ff\"!\u00c7\u00b8\u0086\u00ac\u00ceT\f\u00cdr\u00e0\u0006\u00f3\u00f6\r~W>\u00f3\u0012Z\u00af\u00186a\u00ffm\u00e1".length();
                    var3_4 = 18;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = 3;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "`WLZ\u0093\u008c\u00f4y\u00fc\u0095\u001a\u00c3\u00d5\u00d4\u0014?\u009dN\u0092\u00d1\u009d\u00c8\u00b1\u00dc\u00ae\u001c\u00b0#\u0013\u00be\u00ac\u008b}3\u00fc\u0092\u00b2";
                        var6_3 = "`WLZ\u0093\u008c\u00f4y\u00fc\u0095\u001a\u00c3\u00d5\u00d4\u0014?\u009dN\u0092\u00d1\u009d\u00c8\u00b1\u00dc\u00ae\u001c\u00b0#\u0013\u00be\u00ac\u008b}3\u00fc\u0092\u00b2".length();
                        var3_4 = 10;
                        var2_5 = -1;
lbl22:
                        // 2 sources

                        while (true) {
                            v0 = 27;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl28:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl85
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 92;
                                break;
                            }
                            case 1: {
                                v15 = 79;
                                break;
                            }
                            case 2: {
                                v15 = 119;
                                break;
                            }
                            case 3: {
                                v15 = 1;
                                break;
                            }
                            case 4: {
                                v15 = 102;
                                break;
                            }
                            case 5: {
                                v15 = 52;
                                break;
                            }
                            default: {
                                v15 = 62;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
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
                } while (v10 > var8_6);
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
            _y_0.cb = var7;
            _y_0.db = new String[8];
            break block22;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4577641707573346436L;
        ** while (true)
        _y_0.eb = 1830607309683556512L ^ var0_7;
        _y_0.MG = Logger.getLogger(_y_0.class.getName());
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9739) & 0xFFFF;
        if (db[n12] == null) {
            int n13;
            int n14;
            char[] cArray = cb[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 29;
                    break;
                }
                case 1: {
                    n14 = 126;
                    break;
                }
                case 2: {
                    n14 = 237;
                    break;
                }
                case 3: {
                    n14 = 25;
                    break;
                }
                case 4: {
                    n14 = 188;
                    break;
                }
                case 5: {
                    n14 = 162;
                    break;
                }
                case 6: {
                    n14 = 206;
                    break;
                }
                case 7: {
                    n14 = 215;
                    break;
                }
                case 8: {
                    n14 = 74;
                    break;
                }
                case 9: {
                    n14 = 172;
                    break;
                }
                case 10: {
                    n14 = 103;
                    break;
                }
                case 11: {
                    n14 = 124;
                    break;
                }
                case 12: {
                    n14 = 128;
                    break;
                }
                case 13: {
                    n14 = 160;
                    break;
                }
                case 14: {
                    n14 = 48;
                    break;
                }
                case 15: {
                    n14 = 60;
                    break;
                }
                case 16: {
                    n14 = 195;
                    break;
                }
                case 17: {
                    n14 = 1;
                    break;
                }
                case 18: {
                    n14 = 152;
                    break;
                }
                case 19: {
                    n14 = 96;
                    break;
                }
                case 20: {
                    n14 = 203;
                    break;
                }
                case 21: {
                    n14 = 49;
                    break;
                }
                case 22: {
                    n14 = 75;
                    break;
                }
                case 23: {
                    n14 = 101;
                    break;
                }
                case 24: {
                    n14 = 13;
                    break;
                }
                case 25: {
                    n14 = 86;
                    break;
                }
                case 26: {
                    n14 = 14;
                    break;
                }
                case 27: {
                    n14 = 97;
                    break;
                }
                case 28: {
                    n14 = 44;
                    break;
                }
                case 29: {
                    n14 = 227;
                    break;
                }
                case 30: {
                    n14 = 107;
                    break;
                }
                case 31: {
                    n14 = 242;
                    break;
                }
                case 32: {
                    n14 = 57;
                    break;
                }
                case 33: {
                    n14 = 139;
                    break;
                }
                case 34: {
                    n14 = 56;
                    break;
                }
                case 35: {
                    n14 = 222;
                    break;
                }
                case 36: {
                    n14 = 52;
                    break;
                }
                case 37: {
                    n14 = 92;
                    break;
                }
                case 38: {
                    n14 = 213;
                    break;
                }
                case 39: {
                    n14 = 132;
                    break;
                }
                case 40: {
                    n14 = 247;
                    break;
                }
                case 41: {
                    n14 = 253;
                    break;
                }
                case 42: {
                    n14 = 151;
                    break;
                }
                case 43: {
                    n14 = 148;
                    break;
                }
                case 44: {
                    n14 = 210;
                    break;
                }
                case 45: {
                    n14 = 198;
                    break;
                }
                case 46: {
                    n14 = 226;
                    break;
                }
                case 47: {
                    n14 = 113;
                    break;
                }
                case 48: {
                    n14 = 140;
                    break;
                }
                case 49: {
                    n14 = 83;
                    break;
                }
                case 50: {
                    n14 = 149;
                    break;
                }
                case 51: {
                    n14 = 231;
                    break;
                }
                case 52: {
                    n14 = 3;
                    break;
                }
                case 53: {
                    n14 = 39;
                    break;
                }
                case 54: {
                    n14 = 55;
                    break;
                }
                case 55: {
                    n14 = 89;
                    break;
                }
                case 56: {
                    n14 = 201;
                    break;
                }
                case 57: {
                    n14 = 20;
                    break;
                }
                case 58: {
                    n14 = 120;
                    break;
                }
                case 59: {
                    n14 = 147;
                    break;
                }
                case 60: {
                    n14 = 249;
                    break;
                }
                case 61: {
                    n14 = 40;
                    break;
                }
                case 62: {
                    n14 = 189;
                    break;
                }
                case 63: {
                    n14 = 21;
                    break;
                }
                case 64: {
                    n14 = 61;
                    break;
                }
                case 65: {
                    n14 = 68;
                    break;
                }
                case 66: {
                    n14 = 36;
                    break;
                }
                case 67: {
                    n14 = 123;
                    break;
                }
                case 68: {
                    n14 = 119;
                    break;
                }
                case 69: {
                    n14 = 143;
                    break;
                }
                case 70: {
                    n14 = 181;
                    break;
                }
                case 71: {
                    n14 = 2;
                    break;
                }
                case 72: {
                    n14 = 207;
                    break;
                }
                case 73: {
                    n14 = 229;
                    break;
                }
                case 74: {
                    n14 = 37;
                    break;
                }
                case 75: {
                    n14 = 72;
                    break;
                }
                case 76: {
                    n14 = 125;
                    break;
                }
                case 77: {
                    n14 = 88;
                    break;
                }
                case 78: {
                    n14 = 81;
                    break;
                }
                case 79: {
                    n14 = 5;
                    break;
                }
                case 80: {
                    n14 = 109;
                    break;
                }
                case 81: {
                    n14 = 15;
                    break;
                }
                case 82: {
                    n14 = 105;
                    break;
                }
                case 83: {
                    n14 = 145;
                    break;
                }
                case 84: {
                    n14 = 167;
                    break;
                }
                case 85: {
                    n14 = 108;
                    break;
                }
                case 86: {
                    n14 = 93;
                    break;
                }
                case 87: {
                    n14 = 186;
                    break;
                }
                case 88: {
                    n14 = 173;
                    break;
                }
                case 89: {
                    n14 = 11;
                    break;
                }
                case 90: {
                    n14 = 219;
                    break;
                }
                case 91: {
                    n14 = 110;
                    break;
                }
                case 92: {
                    n14 = 252;
                    break;
                }
                case 93: {
                    n14 = 64;
                    break;
                }
                case 94: {
                    n14 = 112;
                    break;
                }
                case 95: {
                    n14 = 158;
                    break;
                }
                case 96: {
                    n14 = 220;
                    break;
                }
                case 97: {
                    n14 = 76;
                    break;
                }
                case 98: {
                    n14 = 98;
                    break;
                }
                case 99: {
                    n14 = 204;
                    break;
                }
                case 100: {
                    n14 = 115;
                    break;
                }
                case 101: {
                    n14 = 73;
                    break;
                }
                case 102: {
                    n14 = 28;
                    break;
                }
                case 103: {
                    n14 = 205;
                    break;
                }
                case 104: {
                    n14 = 133;
                    break;
                }
                case 105: {
                    n14 = 84;
                    break;
                }
                case 106: {
                    n14 = 100;
                    break;
                }
                case 107: {
                    n14 = 23;
                    break;
                }
                case 108: {
                    n14 = 4;
                    break;
                }
                case 109: {
                    n14 = 191;
                    break;
                }
                case 110: {
                    n14 = 116;
                    break;
                }
                case 111: {
                    n14 = 31;
                    break;
                }
                case 112: {
                    n14 = 216;
                    break;
                }
                case 113: {
                    n14 = 183;
                    break;
                }
                case 114: {
                    n14 = 185;
                    break;
                }
                case 115: {
                    n14 = 85;
                    break;
                }
                case 116: {
                    n14 = 146;
                    break;
                }
                case 117: {
                    n14 = 156;
                    break;
                }
                case 118: {
                    n14 = 180;
                    break;
                }
                case 119: {
                    n14 = 209;
                    break;
                }
                case 120: {
                    n14 = 179;
                    break;
                }
                case 121: {
                    n14 = 190;
                    break;
                }
                case 122: {
                    n14 = 65;
                    break;
                }
                case 123: {
                    n14 = 12;
                    break;
                }
                case 124: {
                    n14 = 137;
                    break;
                }
                case 125: {
                    n14 = 175;
                    break;
                }
                case 126: {
                    n14 = 163;
                    break;
                }
                case 127: {
                    n14 = 178;
                    break;
                }
                case 128: {
                    n14 = 217;
                    break;
                }
                case 129: {
                    n14 = 223;
                    break;
                }
                case 130: {
                    n14 = 164;
                    break;
                }
                case 131: {
                    n14 = 221;
                    break;
                }
                case 132: {
                    n14 = 196;
                    break;
                }
                case 133: {
                    n14 = 0;
                    break;
                }
                case 134: {
                    n14 = 142;
                    break;
                }
                case 135: {
                    n14 = 153;
                    break;
                }
                case 136: {
                    n14 = 87;
                    break;
                }
                case 137: {
                    n14 = 30;
                    break;
                }
                case 138: {
                    n14 = 130;
                    break;
                }
                case 139: {
                    n14 = 90;
                    break;
                }
                case 140: {
                    n14 = 66;
                    break;
                }
                case 141: {
                    n14 = 34;
                    break;
                }
                case 142: {
                    n14 = 95;
                    break;
                }
                case 143: {
                    n14 = 9;
                    break;
                }
                case 144: {
                    n14 = 102;
                    break;
                }
                case 145: {
                    n14 = 230;
                    break;
                }
                case 146: {
                    n14 = 238;
                    break;
                }
                case 147: {
                    n14 = 182;
                    break;
                }
                case 148: {
                    n14 = 135;
                    break;
                }
                case 149: {
                    n14 = 184;
                    break;
                }
                case 150: {
                    n14 = 24;
                    break;
                }
                case 151: {
                    n14 = 118;
                    break;
                }
                case 152: {
                    n14 = 129;
                    break;
                }
                case 153: {
                    n14 = 53;
                    break;
                }
                case 154: {
                    n14 = 224;
                    break;
                }
                case 155: {
                    n14 = 7;
                    break;
                }
                case 156: {
                    n14 = 254;
                    break;
                }
                case 157: {
                    n14 = 51;
                    break;
                }
                case 158: {
                    n14 = 154;
                    break;
                }
                case 159: {
                    n14 = 244;
                    break;
                }
                case 160: {
                    n14 = 187;
                    break;
                }
                case 161: {
                    n14 = 18;
                    break;
                }
                case 162: {
                    n14 = 141;
                    break;
                }
                case 163: {
                    n14 = 232;
                    break;
                }
                case 164: {
                    n14 = 77;
                    break;
                }
                case 165: {
                    n14 = 50;
                    break;
                }
                case 166: {
                    n14 = 251;
                    break;
                }
                case 167: {
                    n14 = 168;
                    break;
                }
                case 168: {
                    n14 = 174;
                    break;
                }
                case 169: {
                    n14 = 165;
                    break;
                }
                case 170: {
                    n14 = 46;
                    break;
                }
                case 171: {
                    n14 = 241;
                    break;
                }
                case 172: {
                    n14 = 236;
                    break;
                }
                case 173: {
                    n14 = 212;
                    break;
                }
                case 174: {
                    n14 = 6;
                    break;
                }
                case 175: {
                    n14 = 63;
                    break;
                }
                case 176: {
                    n14 = 228;
                    break;
                }
                case 177: {
                    n14 = 248;
                    break;
                }
                case 178: {
                    n14 = 234;
                    break;
                }
                case 179: {
                    n14 = 47;
                    break;
                }
                case 180: {
                    n14 = 10;
                    break;
                }
                case 181: {
                    n14 = 243;
                    break;
                }
                case 182: {
                    n14 = 27;
                    break;
                }
                case 183: {
                    n14 = 138;
                    break;
                }
                case 184: {
                    n14 = 70;
                    break;
                }
                case 185: {
                    n14 = 131;
                    break;
                }
                case 186: {
                    n14 = 16;
                    break;
                }
                case 187: {
                    n14 = 94;
                    break;
                }
                case 188: {
                    n14 = 155;
                    break;
                }
                case 189: {
                    n14 = 200;
                    break;
                }
                case 190: {
                    n14 = 58;
                    break;
                }
                case 191: {
                    n14 = 169;
                    break;
                }
                case 192: {
                    n14 = 80;
                    break;
                }
                case 193: {
                    n14 = 54;
                    break;
                }
                case 194: {
                    n14 = 136;
                    break;
                }
                case 195: {
                    n14 = 33;
                    break;
                }
                case 196: {
                    n14 = 82;
                    break;
                }
                case 197: {
                    n14 = 117;
                    break;
                }
                case 198: {
                    n14 = 194;
                    break;
                }
                case 199: {
                    n14 = 218;
                    break;
                }
                case 200: {
                    n14 = 134;
                    break;
                }
                case 201: {
                    n14 = 122;
                    break;
                }
                case 202: {
                    n14 = 214;
                    break;
                }
                case 203: {
                    n14 = 202;
                    break;
                }
                case 204: {
                    n14 = 8;
                    break;
                }
                case 205: {
                    n14 = 235;
                    break;
                }
                case 206: {
                    n14 = 99;
                    break;
                }
                case 207: {
                    n14 = 38;
                    break;
                }
                case 208: {
                    n14 = 42;
                    break;
                }
                case 209: {
                    n14 = 104;
                    break;
                }
                case 210: {
                    n14 = 71;
                    break;
                }
                case 211: {
                    n14 = 225;
                    break;
                }
                case 212: {
                    n14 = 245;
                    break;
                }
                case 213: {
                    n14 = 91;
                    break;
                }
                case 214: {
                    n14 = 157;
                    break;
                }
                case 215: {
                    n14 = 171;
                    break;
                }
                case 216: {
                    n14 = 246;
                    break;
                }
                case 217: {
                    n14 = 19;
                    break;
                }
                case 218: {
                    n14 = 78;
                    break;
                }
                case 219: {
                    n14 = 197;
                    break;
                }
                case 220: {
                    n14 = 250;
                    break;
                }
                case 221: {
                    n14 = 240;
                    break;
                }
                case 222: {
                    n14 = 233;
                    break;
                }
                case 223: {
                    n14 = 159;
                    break;
                }
                case 224: {
                    n14 = 32;
                    break;
                }
                case 225: {
                    n14 = 22;
                    break;
                }
                case 226: {
                    n14 = 26;
                    break;
                }
                case 227: {
                    n14 = 170;
                    break;
                }
                case 228: {
                    n14 = 193;
                    break;
                }
                case 229: {
                    n14 = 255;
                    break;
                }
                case 230: {
                    n14 = 17;
                    break;
                }
                case 231: {
                    n14 = 176;
                    break;
                }
                case 232: {
                    n14 = 121;
                    break;
                }
                case 233: {
                    n14 = 161;
                    break;
                }
                case 234: {
                    n14 = 35;
                    break;
                }
                case 235: {
                    n14 = 79;
                    break;
                }
                case 236: {
                    n14 = 211;
                    break;
                }
                case 237: {
                    n14 = 150;
                    break;
                }
                case 238: {
                    n14 = 199;
                    break;
                }
                case 239: {
                    n14 = 67;
                    break;
                }
                case 240: {
                    n14 = 59;
                    break;
                }
                case 241: {
                    n14 = 111;
                    break;
                }
                case 242: {
                    n14 = 177;
                    break;
                }
                case 243: {
                    n14 = 144;
                    break;
                }
                case 244: {
                    n14 = 43;
                    break;
                }
                case 245: {
                    n14 = 127;
                    break;
                }
                case 246: {
                    n14 = 114;
                    break;
                }
                case 247: {
                    n14 = 69;
                    break;
                }
                case 248: {
                    n14 = 106;
                    break;
                }
                case 249: {
                    n14 = 192;
                    break;
                }
                case 250: {
                    n14 = 62;
                    break;
                }
                case 251: {
                    n14 = 41;
                    break;
                }
                case 252: {
                    n14 = 239;
                    break;
                }
                case 253: {
                    n14 = 166;
                    break;
                }
                case 254: {
                    n14 = 45;
                    break;
                }
                default: {
                    n14 = 208;
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
            _y_0.db[n12] = new String(cArray).intern();
        }
        return db[n12];
    }
}

