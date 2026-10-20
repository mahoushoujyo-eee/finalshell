/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F4;
import com.G6;
import com.O_;
import com.T2;
import com.co_0;
import com.cz_0;
import com.ky_2;
import com.oq_0;
import com.wo_2;
import com.wv_1;
import com.xb_2;
import com.yt_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

public class OQ
extends oq_0 {
    public static final Dimension W;
    public static final Dimension b;
    public static final Insets C;
    public static final Insets r;
    protected co_0 s;
    protected O_ z;
    protected O_ a;
    protected O_ U;
    protected O_ o;
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;

    public OQ(co_0 co_02) {
        this.s = co_02;
        this.z = new O_();
        String string = co_0.U();
        this.z.setHorizontalAlignment(0);
        this.z.setPreferredSize(new Dimension(OQ.b(15889, 3001882586815513036L), OQ.b(17105, 7727662519627005195L)));
        this.a = new O_();
        this.a.setFont(this.a.getFont().deriveFont(0));
        this.a.setForeground(Color.BLACK);
        this.a.setVerticalAlignment(0);
        this.o = new O_(OQ.b(27764, 604833310204662690L));
        this.o.setFont(this.o.getFont().deriveFont(0));
        this.o.setForeground(Color.GRAY);
        this.U = new O_(OQ.b(16911, 8473812496660905437L));
        this.U.setFont(this.U.getFont().deriveFont(0));
        this.U.setForeground(new Color(OQ.b(5314, 9191914938725559063L), OQ.b(1690, 2845351451893791044L), OQ.b(13358, 8984094426694667254L)));
        this.setLayout(new T2(this));
        this.add(this.z);
        this.add(this.a);
        this.add(this.o);
        this.add(this.U);
        co_02.addPropertyChangeListener("\u0000ERR:ArrayIndexOutOfBoundsException:Index 21591 out of bounds for length 16", new F4(this, co_02));
        co_02.addPropertyChangeListener("\u0000ERR:ArrayIndexOutOfBoundsException:Index 21590 out of bounds for length 16", new wv_1(this, co_02));
        this.g();
        if (string == null) {
            ky_2.K(new String[4]);
        }
    }

    public Rectangle C() {
        return ((T2)this.getLayout()).K();
    }

    public void g() {
        block4: {
            OQ oQ;
            block2: {
                block3: {
                    String string = co_0.U();
                    oQ = this;
                    if (string == null) break block2;
                    if (!oQ.i()) break block3;
                    this.a.setHorizontalAlignment(OQ.b(16911, 8473812496660905437L));
                    this.s.setFixedCellWidth(OQ.W.width);
                    this.s.setFixedCellHeight(OQ.W.height);
                    if (string != null) break block4;
                }
                this.a.setHorizontalAlignment(0);
                this.s.setFixedCellWidth(OQ.b.width);
                oQ = this;
            }
            oQ.s.setFixedCellHeight(OQ.b.height);
        }
    }

    public JLabel r() {
        return this.z;
    }

    public JLabel d() {
        return this.a;
    }

    public JLabel l() {
        return this.U;
    }

    public JLabel w() {
        return this.o;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public Component getListCellRendererComponent(JList jList, Object object, int n10, boolean bl, boolean bl2) {
        O_ o_;
        block23: {
            block24: {
                String string;
                block29: {
                    O_ o_2;
                    block25: {
                        block26: {
                            block27: {
                                block28: {
                                    Object object2;
                                    String string2;
                                    File file;
                                    block22: {
                                        Object object3;
                                        wo_2 wo_22;
                                        block17: {
                                            block18: {
                                                Object object4;
                                                block21: {
                                                    block19: {
                                                        Object object5;
                                                        block20: {
                                                            String string3 = co_0.U();
                                                            super.getListCellRendererComponent(jList, "", n10, bl, bl2);
                                                            string = string3;
                                                            wo_22 = (wo_2)object;
                                                            file = wo_22.T();
                                                            this.S(this.i() ? C : r);
                                                            string2 = null;
                                                            object3 = this.z;
                                                            if (string == null) break block17;
                                                            if (!((Component)object3).isEnabled()) break block18;
                                                            object2 = wo_22.S();
                                                            // MONITORENTER : object2
                                                            object5 = wo_22;
                                                            if (string == null) break block19;
                                                            if (((wo_2)object5).Y()) break block20;
                                                            object5 = wo_22;
                                                            if (string == null) break block19;
                                                            if (!((wo_2)object5).Z()) {
                                                                xb_2.r(this.s, wo_22, false);
                                                            }
                                                        }
                                                        object5 = object2;
                                                    }
                                                    // MONITOREXIT : object5
                                                    object2 = wo_22.k();
                                                    this.z.setIcon((Icon)object2);
                                                    object4 = object2;
                                                    if (string == null) break block21;
                                                    if (object4 == null) break block22;
                                                    object4 = object2;
                                                }
                                                string2 = ((ImageIcon)object4).getDescription();
                                                break block22;
                                            }
                                            object3 = wo_22.S();
                                        }
                                        object2 = object3;
                                        // MONITORENTER : object3
                                        Object object6 = wo_22;
                                        if (string != null) {
                                            if (!((wo_2)object6).Z()) {
                                                xb_2.r(this.s, wo_22, true);
                                            }
                                            object6 = object2;
                                        }
                                        // MONITOREXIT : object6
                                        this.z.setDisabledIcon(wo_22.P());
                                    }
                                    o_ = this;
                                    if (string == null) break block23;
                                    if (o_.s.K() == n10) break block24;
                                    object2 = cz_0.t(file, string2);
                                    this.a.setText(((yt_0)object2).h());
                                    o_2 = this;
                                    if (string == null) break block25;
                                    if (!o_2.i()) break block26;
                                    this.o.setText(((yt_0)object2).Q());
                                    if (string == null) break block27;
                                    if (((yt_0)object2).U() == null) break block28;
                                    this.U.setText(((yt_0)object2).U());
                                    if (string != null) break block29;
                                }
                                this.U.setText(null);
                            }
                            if (string != null) break block29;
                        }
                        this.o.setText(null);
                        o_2 = this.U;
                    }
                    o_2.setText(null);
                }
                if (string != null) return this;
            }
            this.a.setText(null);
            this.o.setText(null);
            o_ = this.U;
        }
        o_.setText(null);
        return this;
    }

    protected boolean i() {
        return this.s.Q().equals((Object)G6.tiles);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00ac\u0000\u00a4\u00ce\f\u008bv\u00dc\u00b3$\u00c2|C\u00b5\u00b5\u00b4k\u008e\u00cf\u00b9\u0007\u0011 \u00d9\u00f9-60";
                    var12_3 = "\u00ac\u0000\u00a4\u00ce\f\u008bv\u00dc\u00b3$\u00c2|C\u00b5\u00b5\u00b4k\u008e\u00cf\u00b9\u0007\u0011 \u00d9\u00f9-60".length();
                    var9_4 = 20;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 10;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 67;
                                    break;
                                }
                                case 1: {
                                    v11 = 41;
                                    break;
                                }
                                case 2: {
                                    v11 = 112;
                                    break;
                                }
                                case 3: {
                                    v11 = 82;
                                    break;
                                }
                                case 4: {
                                    v11 = 114;
                                    break;
                                }
                                case 5: {
                                    v11 = 67;
                                    break;
                                }
                                default: {
                                    v11 = 21;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                OQ.d = var13;
                OQ.e = new String[2];
                var0_7 = 2419547550954604645L;
                var6_8 = new long[15];
                var3_9 = 0;
                var4_10 = "\u00fc\u00ccIc9\u0011\u0090,\u00d8\u0001\u00e7\u00bbT\u0095\u00b1l\u0095eER\u007fA\t\u009f.\u00c6t)D\u00c0\u00e5\r\u0012\u00bec\u00ac\u00ac\u00da\u00a3\u00da?t\u00ef\u00cf\u00c1\u00a7uX}Qs\u00a7\u00b3\u00b42\u001b\u00f4Y\u00c3d\u00a0c\u0003 w\u009ei\u00b3h\u0082\u00e4Qd\u000f\u0000\u00bdH\u00c2[\u00cdQ\f\u00b1};\u0087#C\u0097T\\\u00b5\u0011\u00cb\u00d9\u00eb\u00de\u001c\u0017\u00b0\u00e3F\u00df/";
                var5_11 = "\u00fc\u00ccIc9\u0011\u0090,\u00d8\u0001\u00e7\u00bbT\u0095\u00b1l\u0095eER\u007fA\t\u009f.\u00c6t)D\u00c0\u00e5\r\u0012\u00bec\u00ac\u00ac\u00da\u00a3\u00da?t\u00ef\u00cf\u00c1\u00a7uX}Qs\u00a7\u00b3\u00b42\u001b\u00f4Y\u00c3d\u00a0c\u0003 w\u009ei\u00b3h\u0082\u00e4Qd\u000f\u0000\u00bdH\u00c2[\u00cdQ\f\u00b1};\u0087#C\u0097T\\\u00b5\u0011\u00cb\u00d9\u00eb\u00de\u001c\u0017\u00b0\u00e3F\u00df/".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\b\r\u00be\rom\u00f5\u00b2\u00d2\u00fcXv\u00e4\u0083\u00ab}";
                    var5_11 = "\b\r\u00be\rom\u00f5\u00b2\u00d2\u00fcXv\u00e4\u0083\u00ab}".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        OQ.f = var6_8;
        OQ.g = new Integer[15];
        OQ.W = new Dimension(OQ.b(1403, 822712397551958690L), OQ.b(7304, 2208138775078593369L));
        OQ.b = new Dimension(OQ.b(26819, 3808783707915294480L), OQ.b(5182, 2839065570086382565L));
        OQ.C = new Insets(OQ.b(28252, 7632135541992657288L), OQ.b(21170, 3578209950495681902L), 5, OQ.b(10142, 479341996624926785L));
        OQ.r = new Insets(5, 5, OQ.b(21483, 6342580841676418108L), 5);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x47F3) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 43;
                    break;
                }
                case 1: {
                    n14 = 64;
                    break;
                }
                case 2: {
                    n14 = 229;
                    break;
                }
                case 3: {
                    n14 = 76;
                    break;
                }
                case 4: {
                    n14 = 176;
                    break;
                }
                case 5: {
                    n14 = 172;
                    break;
                }
                case 6: {
                    n14 = 21;
                    break;
                }
                case 7: {
                    n14 = 240;
                    break;
                }
                case 8: {
                    n14 = 181;
                    break;
                }
                case 9: {
                    n14 = 48;
                    break;
                }
                case 10: {
                    n14 = 121;
                    break;
                }
                case 11: {
                    n14 = 223;
                    break;
                }
                case 12: {
                    n14 = 39;
                    break;
                }
                case 13: {
                    n14 = 179;
                    break;
                }
                case 14: {
                    n14 = 10;
                    break;
                }
                case 15: {
                    n14 = 0;
                    break;
                }
                case 16: {
                    n14 = 86;
                    break;
                }
                case 17: {
                    n14 = 233;
                    break;
                }
                case 18: {
                    n14 = 52;
                    break;
                }
                case 19: {
                    n14 = 192;
                    break;
                }
                case 20: {
                    n14 = 111;
                    break;
                }
                case 21: {
                    n14 = 84;
                    break;
                }
                case 22: {
                    n14 = 56;
                    break;
                }
                case 23: {
                    n14 = 159;
                    break;
                }
                case 24: {
                    n14 = 16;
                    break;
                }
                case 25: {
                    n14 = 26;
                    break;
                }
                case 26: {
                    n14 = 5;
                    break;
                }
                case 27: {
                    n14 = 165;
                    break;
                }
                case 28: {
                    n14 = 187;
                    break;
                }
                case 29: {
                    n14 = 177;
                    break;
                }
                case 30: {
                    n14 = 186;
                    break;
                }
                case 31: {
                    n14 = 198;
                    break;
                }
                case 32: {
                    n14 = 169;
                    break;
                }
                case 33: {
                    n14 = 109;
                    break;
                }
                case 34: {
                    n14 = 145;
                    break;
                }
                case 35: {
                    n14 = 244;
                    break;
                }
                case 36: {
                    n14 = 162;
                    break;
                }
                case 37: {
                    n14 = 29;
                    break;
                }
                case 38: {
                    n14 = 93;
                    break;
                }
                case 39: {
                    n14 = 80;
                    break;
                }
                case 40: {
                    n14 = 149;
                    break;
                }
                case 41: {
                    n14 = 134;
                    break;
                }
                case 42: {
                    n14 = 81;
                    break;
                }
                case 43: {
                    n14 = 216;
                    break;
                }
                case 44: {
                    n14 = 33;
                    break;
                }
                case 45: {
                    n14 = 133;
                    break;
                }
                case 46: {
                    n14 = 144;
                    break;
                }
                case 47: {
                    n14 = 139;
                    break;
                }
                case 48: {
                    n14 = 34;
                    break;
                }
                case 49: {
                    n14 = 163;
                    break;
                }
                case 50: {
                    n14 = 238;
                    break;
                }
                case 51: {
                    n14 = 71;
                    break;
                }
                case 52: {
                    n14 = 150;
                    break;
                }
                case 53: {
                    n14 = 78;
                    break;
                }
                case 54: {
                    n14 = 90;
                    break;
                }
                case 55: {
                    n14 = 237;
                    break;
                }
                case 56: {
                    n14 = 89;
                    break;
                }
                case 57: {
                    n14 = 49;
                    break;
                }
                case 58: {
                    n14 = 13;
                    break;
                }
                case 59: {
                    n14 = 87;
                    break;
                }
                case 60: {
                    n14 = 232;
                    break;
                }
                case 61: {
                    n14 = 183;
                    break;
                }
                case 62: {
                    n14 = 18;
                    break;
                }
                case 63: {
                    n14 = 75;
                    break;
                }
                case 64: {
                    n14 = 140;
                    break;
                }
                case 65: {
                    n14 = 62;
                    break;
                }
                case 66: {
                    n14 = 125;
                    break;
                }
                case 67: {
                    n14 = 55;
                    break;
                }
                case 68: {
                    n14 = 164;
                    break;
                }
                case 69: {
                    n14 = 19;
                    break;
                }
                case 70: {
                    n14 = 112;
                    break;
                }
                case 71: {
                    n14 = 23;
                    break;
                }
                case 72: {
                    n14 = 77;
                    break;
                }
                case 73: {
                    n14 = 45;
                    break;
                }
                case 74: {
                    n14 = 251;
                    break;
                }
                case 75: {
                    n14 = 20;
                    break;
                }
                case 76: {
                    n14 = 32;
                    break;
                }
                case 77: {
                    n14 = 41;
                    break;
                }
                case 78: {
                    n14 = 15;
                    break;
                }
                case 79: {
                    n14 = 102;
                    break;
                }
                case 80: {
                    n14 = 191;
                    break;
                }
                case 81: {
                    n14 = 63;
                    break;
                }
                case 82: {
                    n14 = 116;
                    break;
                }
                case 83: {
                    n14 = 254;
                    break;
                }
                case 84: {
                    n14 = 153;
                    break;
                }
                case 85: {
                    n14 = 156;
                    break;
                }
                case 86: {
                    n14 = 74;
                    break;
                }
                case 87: {
                    n14 = 234;
                    break;
                }
                case 88: {
                    n14 = 122;
                    break;
                }
                case 89: {
                    n14 = 44;
                    break;
                }
                case 90: {
                    n14 = 146;
                    break;
                }
                case 91: {
                    n14 = 235;
                    break;
                }
                case 92: {
                    n14 = 79;
                    break;
                }
                case 93: {
                    n14 = 147;
                    break;
                }
                case 94: {
                    n14 = 220;
                    break;
                }
                case 95: {
                    n14 = 65;
                    break;
                }
                case 96: {
                    n14 = 243;
                    break;
                }
                case 97: {
                    n14 = 180;
                    break;
                }
                case 98: {
                    n14 = 170;
                    break;
                }
                case 99: {
                    n14 = 195;
                    break;
                }
                case 100: {
                    n14 = 117;
                    break;
                }
                case 101: {
                    n14 = 91;
                    break;
                }
                case 102: {
                    n14 = 40;
                    break;
                }
                case 103: {
                    n14 = 252;
                    break;
                }
                case 104: {
                    n14 = 22;
                    break;
                }
                case 105: {
                    n14 = 202;
                    break;
                }
                case 106: {
                    n14 = 208;
                    break;
                }
                case 107: {
                    n14 = 197;
                    break;
                }
                case 108: {
                    n14 = 68;
                    break;
                }
                case 109: {
                    n14 = 1;
                    break;
                }
                case 110: {
                    n14 = 142;
                    break;
                }
                case 111: {
                    n14 = 255;
                    break;
                }
                case 112: {
                    n14 = 206;
                    break;
                }
                case 113: {
                    n14 = 137;
                    break;
                }
                case 114: {
                    n14 = 98;
                    break;
                }
                case 115: {
                    n14 = 136;
                    break;
                }
                case 116: {
                    n14 = 47;
                    break;
                }
                case 117: {
                    n14 = 25;
                    break;
                }
                case 118: {
                    n14 = 217;
                    break;
                }
                case 119: {
                    n14 = 60;
                    break;
                }
                case 120: {
                    n14 = 127;
                    break;
                }
                case 121: {
                    n14 = 113;
                    break;
                }
                case 122: {
                    n14 = 203;
                    break;
                }
                case 123: {
                    n14 = 227;
                    break;
                }
                case 124: {
                    n14 = 50;
                    break;
                }
                case 125: {
                    n14 = 167;
                    break;
                }
                case 126: {
                    n14 = 199;
                    break;
                }
                case 127: {
                    n14 = 114;
                    break;
                }
                case 128: {
                    n14 = 193;
                    break;
                }
                case 129: {
                    n14 = 222;
                    break;
                }
                case 130: {
                    n14 = 94;
                    break;
                }
                case 131: {
                    n14 = 9;
                    break;
                }
                case 132: {
                    n14 = 82;
                    break;
                }
                case 133: {
                    n14 = 2;
                    break;
                }
                case 134: {
                    n14 = 51;
                    break;
                }
                case 135: {
                    n14 = 110;
                    break;
                }
                case 136: {
                    n14 = 189;
                    break;
                }
                case 137: {
                    n14 = 7;
                    break;
                }
                case 138: {
                    n14 = 95;
                    break;
                }
                case 139: {
                    n14 = 173;
                    break;
                }
                case 140: {
                    n14 = 242;
                    break;
                }
                case 141: {
                    n14 = 4;
                    break;
                }
                case 142: {
                    n14 = 241;
                    break;
                }
                case 143: {
                    n14 = 67;
                    break;
                }
                case 144: {
                    n14 = 99;
                    break;
                }
                case 145: {
                    n14 = 166;
                    break;
                }
                case 146: {
                    n14 = 59;
                    break;
                }
                case 147: {
                    n14 = 138;
                    break;
                }
                case 148: {
                    n14 = 12;
                    break;
                }
                case 149: {
                    n14 = 200;
                    break;
                }
                case 150: {
                    n14 = 213;
                    break;
                }
                case 151: {
                    n14 = 218;
                    break;
                }
                case 152: {
                    n14 = 248;
                    break;
                }
                case 153: {
                    n14 = 155;
                    break;
                }
                case 154: {
                    n14 = 249;
                    break;
                }
                case 155: {
                    n14 = 253;
                    break;
                }
                case 156: {
                    n14 = 246;
                    break;
                }
                case 157: {
                    n14 = 245;
                    break;
                }
                case 158: {
                    n14 = 188;
                    break;
                }
                case 159: {
                    n14 = 209;
                    break;
                }
                case 160: {
                    n14 = 97;
                    break;
                }
                case 161: {
                    n14 = 175;
                    break;
                }
                case 162: {
                    n14 = 160;
                    break;
                }
                case 163: {
                    n14 = 214;
                    break;
                }
                case 164: {
                    n14 = 36;
                    break;
                }
                case 165: {
                    n14 = 58;
                    break;
                }
                case 166: {
                    n14 = 201;
                    break;
                }
                case 167: {
                    n14 = 143;
                    break;
                }
                case 168: {
                    n14 = 250;
                    break;
                }
                case 169: {
                    n14 = 161;
                    break;
                }
                case 170: {
                    n14 = 27;
                    break;
                }
                case 171: {
                    n14 = 103;
                    break;
                }
                case 172: {
                    n14 = 69;
                    break;
                }
                case 173: {
                    n14 = 17;
                    break;
                }
                case 174: {
                    n14 = 108;
                    break;
                }
                case 175: {
                    n14 = 211;
                    break;
                }
                case 176: {
                    n14 = 210;
                    break;
                }
                case 177: {
                    n14 = 128;
                    break;
                }
                case 178: {
                    n14 = 204;
                    break;
                }
                case 179: {
                    n14 = 42;
                    break;
                }
                case 180: {
                    n14 = 131;
                    break;
                }
                case 181: {
                    n14 = 30;
                    break;
                }
                case 182: {
                    n14 = 130;
                    break;
                }
                case 183: {
                    n14 = 221;
                    break;
                }
                case 184: {
                    n14 = 205;
                    break;
                }
                case 185: {
                    n14 = 70;
                    break;
                }
                case 186: {
                    n14 = 24;
                    break;
                }
                case 187: {
                    n14 = 120;
                    break;
                }
                case 188: {
                    n14 = 38;
                    break;
                }
                case 189: {
                    n14 = 215;
                    break;
                }
                case 190: {
                    n14 = 107;
                    break;
                }
                case 191: {
                    n14 = 124;
                    break;
                }
                case 192: {
                    n14 = 88;
                    break;
                }
                case 193: {
                    n14 = 92;
                    break;
                }
                case 194: {
                    n14 = 132;
                    break;
                }
                case 195: {
                    n14 = 129;
                    break;
                }
                case 196: {
                    n14 = 207;
                    break;
                }
                case 197: {
                    n14 = 118;
                    break;
                }
                case 198: {
                    n14 = 100;
                    break;
                }
                case 199: {
                    n14 = 53;
                    break;
                }
                case 200: {
                    n14 = 115;
                    break;
                }
                case 201: {
                    n14 = 126;
                    break;
                }
                case 202: {
                    n14 = 73;
                    break;
                }
                case 203: {
                    n14 = 66;
                    break;
                }
                case 204: {
                    n14 = 151;
                    break;
                }
                case 205: {
                    n14 = 226;
                    break;
                }
                case 206: {
                    n14 = 119;
                    break;
                }
                case 207: {
                    n14 = 157;
                    break;
                }
                case 208: {
                    n14 = 35;
                    break;
                }
                case 209: {
                    n14 = 196;
                    break;
                }
                case 210: {
                    n14 = 61;
                    break;
                }
                case 211: {
                    n14 = 8;
                    break;
                }
                case 212: {
                    n14 = 239;
                    break;
                }
                case 213: {
                    n14 = 106;
                    break;
                }
                case 214: {
                    n14 = 14;
                    break;
                }
                case 215: {
                    n14 = 174;
                    break;
                }
                case 216: {
                    n14 = 231;
                    break;
                }
                case 217: {
                    n14 = 46;
                    break;
                }
                case 218: {
                    n14 = 57;
                    break;
                }
                case 219: {
                    n14 = 190;
                    break;
                }
                case 220: {
                    n14 = 141;
                    break;
                }
                case 221: {
                    n14 = 168;
                    break;
                }
                case 222: {
                    n14 = 219;
                    break;
                }
                case 223: {
                    n14 = 158;
                    break;
                }
                case 224: {
                    n14 = 54;
                    break;
                }
                case 225: {
                    n14 = 85;
                    break;
                }
                case 226: {
                    n14 = 104;
                    break;
                }
                case 227: {
                    n14 = 105;
                    break;
                }
                case 228: {
                    n14 = 31;
                    break;
                }
                case 229: {
                    n14 = 28;
                    break;
                }
                case 230: {
                    n14 = 184;
                    break;
                }
                case 231: {
                    n14 = 3;
                    break;
                }
                case 232: {
                    n14 = 6;
                    break;
                }
                case 233: {
                    n14 = 37;
                    break;
                }
                case 234: {
                    n14 = 247;
                    break;
                }
                case 235: {
                    n14 = 148;
                    break;
                }
                case 236: {
                    n14 = 101;
                    break;
                }
                case 237: {
                    n14 = 154;
                    break;
                }
                case 238: {
                    n14 = 212;
                    break;
                }
                case 239: {
                    n14 = 182;
                    break;
                }
                case 240: {
                    n14 = 228;
                    break;
                }
                case 241: {
                    n14 = 185;
                    break;
                }
                case 242: {
                    n14 = 236;
                    break;
                }
                case 243: {
                    n14 = 96;
                    break;
                }
                case 244: {
                    n14 = 135;
                    break;
                }
                case 245: {
                    n14 = 225;
                    break;
                }
                case 246: {
                    n14 = 152;
                    break;
                }
                case 247: {
                    n14 = 11;
                    break;
                }
                case 248: {
                    n14 = 171;
                    break;
                }
                case 249: {
                    n14 = 230;
                    break;
                }
                case 250: {
                    n14 = 224;
                    break;
                }
                case 251: {
                    n14 = 83;
                    break;
                }
                case 252: {
                    n14 = 194;
                    break;
                }
                case 253: {
                    n14 = 178;
                    break;
                }
                case 254: {
                    n14 = 123;
                    break;
                }
                default: {
                    n14 = 72;
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
            OQ.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7FDF;
        if (g[n11] == null) {
            OQ.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

