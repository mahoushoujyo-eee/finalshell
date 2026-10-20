/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EZ;
import com.F2;
import com.FV;
import com.GO;
import com.L3;
import com.LC;
import com.PM;
import com.RV;
import com.aL;
import com.fj_0;
import com.ky_2;
import com.nu_0;
import com.pf_1;
import com.xg_0;
import com.zf_0;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from com.Fk
 */
public final class fk_0 {
    private static final Map L;
    private static final String[] a;
    private static final String[] b;

    public static pf_1 I(int n10, int n11, float f10) {
        String string = fk_0.a(-16451, -1119) + n10 + ";" + n11 + ";" + f10;
        pf_1 pf_12 = fk_0.i(string);
        String string2 = FV.D();
        pf_1 pf_13 = pf_12;
        if (string2 == null) {
            if (pf_13 != null) {
                return pf_12;
            }
            pf_13 = fk_0.h(n10, n11, f10);
        }
        pf_1 pf_14 = pf_13;
        L.put(string, new WeakReference<pf_1>(pf_14));
        return pf_14;
    }

    public static pf_1 h(int n10, int n11, float f10) {
        int n12 = Math.max(n10, n11) / 2;
        int n13 = n10 * 2 + n12 * 2;
        BufferedImage bufferedImage = new BufferedImage(n13, n13, 2);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fillRoundRect(n10, n10, n13 - n10 * 2, n13 - n10 * 2, n11 * 2, n11 * 2);
        graphics2D.dispose();
        zf_0 zf_02 = new zf_0(n10, 0, 0, f10);
        BufferedImage bufferedImage2 = zf_02.filter(bufferedImage, null);
        Graphics2D graphics2D2 = bufferedImage2.createGraphics();
        RV.X(graphics2D2);
        graphics2D2.setComposite(AlphaComposite.getInstance(5));
        graphics2D2.setPaint(GO.l);
        graphics2D2.fillRoundRect(n10, n10, n13 - n10 * 2, n13 - n10 * 2, n11 * 2, n11 * 2);
        graphics2D2.dispose();
        pf_1 pf_12 = pf_1.D(bufferedImage2);
        pf_12.L(0, n10 + n12, true);
        String string = FV.D();
        pf_12.L(n10 + n12 + 1, n13 - n10 - n12 - 1, false);
        pf_12.L(n13 - n10 - n12, n13, true);
        String string2 = string;
        pf_12.s(0, n10 + n12, true);
        pf_12.s(n10 + n12 + 1, n13 - n10 - n12 - 1, false);
        pf_12.s(n13 - n10 - n12, n13, true);
        pf_12.n(n10);
        if (ky_2.F() != null) {
            FV.D("EvHST");
        }
        return pf_12;
    }

    public static pf_1 p(int n10, int n11, float f10) {
        String string = fk_0.a(-16452, -14834) + n10 + ";" + n11 + ";" + f10;
        pf_1 pf_12 = fk_0.i(string);
        String string2 = FV.D();
        pf_1 pf_13 = pf_12;
        if (string2 == null) {
            if (pf_13 != null) {
                return pf_12;
            }
            pf_13 = fk_0.o(n10, n11, f10);
        }
        pf_1 pf_14 = pf_13;
        L.put(string, new WeakReference<pf_1>(pf_14));
        return pf_14;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static pf_1 i(String string) {
        String string2 = FV.D();
        Map map = L;
        String string3 = string;
        if (string2 == null) {
            if (!map.containsKey(string3)) return null;
            map = L;
            string3 = string;
        }
        pf_1 pf_12 = (pf_1)((WeakReference)map.get(string3)).get();
        return pf_12;
    }

    public static pf_1 o(int n10, int n11, float f10) {
        int n12 = Math.max(n10, n11);
        int n13 = n10 * 2 + n12 * 2;
        BufferedImage bufferedImage = new BufferedImage(n13, n13, 2);
        String string = FV.D();
        Graphics2D graphics2D = bufferedImage.createGraphics();
        RV.X(graphics2D);
        Area area = new Area(new Rectangle(0, 0, n13, n13));
        String string2 = string;
        area.exclusiveOr(new Area(new RoundRectangle2D.Double(n10, n10, n13 - n10 * 2, n13 - n10 * 2, n11 * 2, n11 * 2)));
        graphics2D.setPaint(Color.BLACK);
        graphics2D.fill(area);
        graphics2D.dispose();
        zf_0 zf_02 = new zf_0(n10, 0, 0, f10);
        BufferedImage bufferedImage2 = zf_02.filter(bufferedImage, null);
        Graphics2D graphics2D2 = bufferedImage2.createGraphics();
        RV.X(graphics2D2);
        graphics2D2.setComposite(AlphaComposite.getInstance(5));
        graphics2D2.setPaint(GO.l);
        graphics2D2.fill(area);
        graphics2D2.dispose();
        BufferedImage bufferedImage3 = bufferedImage2.getSubimage(n10, n10, n13 - n10 * 2, n13 - n10 * 2);
        n13 = bufferedImage3.getWidth();
        pf_1 pf_12 = pf_1.D(bufferedImage3);
        pf_12.L(0, n12, true);
        pf_12.L(n12 + 1, n13 - n12 - 1, false);
        pf_12.L(n13 - n12, n13, true);
        pf_12.s(0, n12, true);
        pf_12.s(n12 + 1, n13 - n12 - 1, false);
        pf_12.s(n13 - n12, n13, true);
        pf_12.n(n10);
        if (string2 != null) {
            ky_2.K(new String[2]);
        }
        return pf_12;
    }

    public static List O(BufferedImage bufferedImage, fj_0 fj_02) {
        boolean bl = fj_02.equals((Object)fj_0.horizontalStretch) || fj_02.equals((Object)fj_0.verticalStretch);
        int n10 = (fj_02.equals((Object)fj_0.horizontalStretch) || fj_02.equals((Object)fj_0.horizontalContent) ? bufferedImage.getWidth() : bufferedImage.getHeight()) - 1;
        ArrayList<EZ> arrayList = new ArrayList<EZ>();
        EZ eZ = null;
        for (int i2 = 1; i2 < n10; ++i2) {
            boolean bl2;
            int n11;
            switch (fj_02) {
                case horizontalStretch: {
                    n11 = bufferedImage.getRGB(i2, 0);
                    break;
                }
                case verticalStretch: {
                    n11 = bufferedImage.getRGB(0, i2);
                    break;
                }
                case horizontalContent: {
                    n11 = bufferedImage.getRGB(i2, bufferedImage.getHeight() - 1);
                    break;
                }
                case verticalContent: {
                    n11 = bufferedImage.getRGB(bufferedImage.getWidth() - 1, i2);
                    break;
                }
                default: {
                    n11 = 0;
                }
            }
            boolean bl3 = bl2 = n11 != Color.BLACK.getRGB();
            if (eZ == null) {
                eZ = new EZ(i2 - 1, i2 - 1, bl2);
                continue;
            }
            if (bl2 == eZ.C()) {
                eZ.T(i2 - 1);
                continue;
            }
            if (bl2 == eZ.C()) continue;
            if (bl || !eZ.C()) {
                arrayList.add(eZ);
            }
            eZ = new EZ(i2 - 1, i2 - 1, bl2);
        }
        if (eZ != null && (bl || !eZ.C())) {
            arrayList.add(eZ);
        }
        return arrayList;
    }

    public static List h(boolean[] blArray) {
        ArrayList<EZ> arrayList;
        block10: {
            boolean bl;
            arrayList = new ArrayList<EZ>();
            EZ eZ = null;
            String string = FV.D();
            for (int i2 = 0; i2 < blArray.length; ++i2) {
                boolean bl2;
                block14: {
                    boolean bl3;
                    boolean bl4;
                    block13: {
                        block12: {
                            block11: {
                                boolean bl5;
                                bl = blArray[i2];
                                if (string != null) break block10;
                                if (string == null) {
                                    bl5 = !bl;
                                }
                                bl2 = bl5;
                                EZ eZ2 = eZ;
                                if (string != null) break block11;
                                if (eZ2 != null) break block12;
                                eZ2 = eZ = new EZ(i2, i2, bl2);
                            }
                            if (string == null) continue;
                        }
                        bl4 = bl2;
                        bl3 = eZ.C();
                        if (string != null) break block13;
                        if (bl4 == bl3) {
                            eZ.T(i2);
                            if (string == null) continue;
                        }
                        bl4 = bl2;
                        if (string != null) break block14;
                        bl3 = eZ.C();
                    }
                    if (bl4 == bl3) continue;
                    bl4 = arrayList.add(eZ);
                }
                eZ = new EZ(i2, i2, bl2);
                if (string == null) continue;
            }
            if (eZ != null) {
                bl = arrayList.add(eZ);
            }
        }
        return arrayList;
    }

    public static pf_1 D(pf_1 pf_12) {
        BufferedImage bufferedImage = xg_0.g(pf_12.G());
        pf_1 pf_13 = pf_1.D(bufferedImage);
        pf_13.f(aL.J((Collection)pf_12.g()));
        pf_13.e(aL.J((Collection)pf_12.U()));
        Insets insets = pf_12.U();
        pf_13.t(insets.left, insets.bottom, insets.right, insets.top);
        return pf_13;
    }

    public static pf_1 N(pf_1 pf_12) {
        BufferedImage bufferedImage = xg_0.X(pf_12.G());
        pf_1 pf_13 = pf_1.D(bufferedImage);
        pf_13.f(aL.J((Collection)pf_12.g()));
        pf_13.e(aL.J((Collection)pf_12.U()));
        Insets insets = pf_12.U();
        pf_13.t(insets.right, insets.top, insets.left, insets.bottom);
        return pf_13;
    }

    public static pf_1 K(pf_1 pf_12) {
        BufferedImage bufferedImage = xg_0.F(pf_12.G());
        pf_1 pf_13 = pf_1.D(bufferedImage);
        pf_13.f(aL.J((Collection)pf_12.U()));
        pf_13.e(aL.J((Collection)pf_12.g()));
        Insets insets = pf_12.U();
        pf_13.t(insets.bottom, insets.right, insets.top, insets.left);
        return pf_13;
    }

    public static pf_1 b(Object object) {
        return fk_0.y(PM.P(object));
    }

    public static pf_1 y(F2 f22) {
        return new pf_1(PM.j(f22));
    }

    public static LC w(Object object) {
        return fk_0.D(PM.d(object));
    }

    public static LC D(nu_0 nu_02) {
        LC lC;
        block2: {
            LC lC2 = new LC();
            Iterator iterator = nu_02.b().keySet().iterator();
            String string = FV.D();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                lC = lC2;
                if (string == null) {
                    lC.C(string2, fk_0.y(nu_02.S(string2)));
                    if (string == null) continue;
                }
                break block2;
            }
            lC = lC2;
        }
        return lC;
    }

    public static L3 H(Object object) {
        return fk_0.a(PM.P(object));
    }

    public static L3 a(F2 f22) {
        return new L3(fk_0.y(f22));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\u00b2\u00f5&X\u00f6>\u0006L$%\u001a\u00cfv";
            var4_3 = "\u00b2\u00f5&X\u00f6>\u0006L$%\u001a\u00cfv".length();
            var1_4 = 6;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 109;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 33;
                            break;
                        }
                        case 1: {
                            v11 = 6;
                            break;
                        }
                        case 2: {
                            v11 = 98;
                            break;
                        }
                        case 3: {
                            v11 = 88;
                            break;
                        }
                        case 4: {
                            v11 = 54;
                            break;
                        }
                        case 5: {
                            v11 = 12;
                            break;
                        }
                        default: {
                            v11 = 11;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
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
            } while (v6 > var6_6);
            ** while (true)
        }
        fk_0.a = var5;
        fk_0.b = new String[2];
        fk_0.L = new HashMap<K, V>();
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFBFBD) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 165;
                    break;
                }
                case 1: {
                    n14 = 181;
                    break;
                }
                case 2: {
                    n14 = 243;
                    break;
                }
                case 3: {
                    n14 = 155;
                    break;
                }
                case 4: {
                    n14 = 133;
                    break;
                }
                case 5: {
                    n14 = 22;
                    break;
                }
                case 6: {
                    n14 = 116;
                    break;
                }
                case 7: {
                    n14 = 61;
                    break;
                }
                case 8: {
                    n14 = 192;
                    break;
                }
                case 9: {
                    n14 = 252;
                    break;
                }
                case 10: {
                    n14 = 141;
                    break;
                }
                case 11: {
                    n14 = 46;
                    break;
                }
                case 12: {
                    n14 = 240;
                    break;
                }
                case 13: {
                    n14 = 228;
                    break;
                }
                case 14: {
                    n14 = 90;
                    break;
                }
                case 15: {
                    n14 = 238;
                    break;
                }
                case 16: {
                    n14 = 146;
                    break;
                }
                case 17: {
                    n14 = 196;
                    break;
                }
                case 18: {
                    n14 = 223;
                    break;
                }
                case 19: {
                    n14 = 246;
                    break;
                }
                case 20: {
                    n14 = 171;
                    break;
                }
                case 21: {
                    n14 = 139;
                    break;
                }
                case 22: {
                    n14 = 65;
                    break;
                }
                case 23: {
                    n14 = 217;
                    break;
                }
                case 24: {
                    n14 = 232;
                    break;
                }
                case 25: {
                    n14 = 117;
                    break;
                }
                case 26: {
                    n14 = 5;
                    break;
                }
                case 27: {
                    n14 = 154;
                    break;
                }
                case 28: {
                    n14 = 21;
                    break;
                }
                case 29: {
                    n14 = 95;
                    break;
                }
                case 30: {
                    n14 = 124;
                    break;
                }
                case 31: {
                    n14 = 121;
                    break;
                }
                case 32: {
                    n14 = 188;
                    break;
                }
                case 33: {
                    n14 = 50;
                    break;
                }
                case 34: {
                    n14 = 180;
                    break;
                }
                case 35: {
                    n14 = 214;
                    break;
                }
                case 36: {
                    n14 = 151;
                    break;
                }
                case 37: {
                    n14 = 147;
                    break;
                }
                case 38: {
                    n14 = 157;
                    break;
                }
                case 39: {
                    n14 = 4;
                    break;
                }
                case 40: {
                    n14 = 231;
                    break;
                }
                case 41: {
                    n14 = 233;
                    break;
                }
                case 42: {
                    n14 = 162;
                    break;
                }
                case 43: {
                    n14 = 43;
                    break;
                }
                case 44: {
                    n14 = 48;
                    break;
                }
                case 45: {
                    n14 = 236;
                    break;
                }
                case 46: {
                    n14 = 93;
                    break;
                }
                case 47: {
                    n14 = 60;
                    break;
                }
                case 48: {
                    n14 = 39;
                    break;
                }
                case 49: {
                    n14 = 179;
                    break;
                }
                case 50: {
                    n14 = 167;
                    break;
                }
                case 51: {
                    n14 = 168;
                    break;
                }
                case 52: {
                    n14 = 96;
                    break;
                }
                case 53: {
                    n14 = 197;
                    break;
                }
                case 54: {
                    n14 = 255;
                    break;
                }
                case 55: {
                    n14 = 173;
                    break;
                }
                case 56: {
                    n14 = 247;
                    break;
                }
                case 57: {
                    n14 = 178;
                    break;
                }
                case 58: {
                    n14 = 170;
                    break;
                }
                case 59: {
                    n14 = 115;
                    break;
                }
                case 60: {
                    n14 = 212;
                    break;
                }
                case 61: {
                    n14 = 25;
                    break;
                }
                case 62: {
                    n14 = 164;
                    break;
                }
                case 63: {
                    n14 = 187;
                    break;
                }
                case 64: {
                    n14 = 41;
                    break;
                }
                case 65: {
                    n14 = 203;
                    break;
                }
                case 66: {
                    n14 = 0;
                    break;
                }
                case 67: {
                    n14 = 10;
                    break;
                }
                case 68: {
                    n14 = 57;
                    break;
                }
                case 69: {
                    n14 = 20;
                    break;
                }
                case 70: {
                    n14 = 45;
                    break;
                }
                case 71: {
                    n14 = 242;
                    break;
                }
                case 72: {
                    n14 = 137;
                    break;
                }
                case 73: {
                    n14 = 193;
                    break;
                }
                case 74: {
                    n14 = 78;
                    break;
                }
                case 75: {
                    n14 = 14;
                    break;
                }
                case 76: {
                    n14 = 70;
                    break;
                }
                case 77: {
                    n14 = 17;
                    break;
                }
                case 78: {
                    n14 = 44;
                    break;
                }
                case 79: {
                    n14 = 122;
                    break;
                }
                case 80: {
                    n14 = 249;
                    break;
                }
                case 81: {
                    n14 = 251;
                    break;
                }
                case 82: {
                    n14 = 176;
                    break;
                }
                case 83: {
                    n14 = 224;
                    break;
                }
                case 84: {
                    n14 = 254;
                    break;
                }
                case 85: {
                    n14 = 111;
                    break;
                }
                case 86: {
                    n14 = 114;
                    break;
                }
                case 87: {
                    n14 = 222;
                    break;
                }
                case 88: {
                    n14 = 80;
                    break;
                }
                case 89: {
                    n14 = 73;
                    break;
                }
                case 90: {
                    n14 = 88;
                    break;
                }
                case 91: {
                    n14 = 105;
                    break;
                }
                case 92: {
                    n14 = 75;
                    break;
                }
                case 93: {
                    n14 = 6;
                    break;
                }
                case 94: {
                    n14 = 143;
                    break;
                }
                case 95: {
                    n14 = 63;
                    break;
                }
                case 96: {
                    n14 = 210;
                    break;
                }
                case 97: {
                    n14 = 42;
                    break;
                }
                case 98: {
                    n14 = 213;
                    break;
                }
                case 99: {
                    n14 = 72;
                    break;
                }
                case 100: {
                    n14 = 221;
                    break;
                }
                case 101: {
                    n14 = 64;
                    break;
                }
                case 102: {
                    n14 = 109;
                    break;
                }
                case 103: {
                    n14 = 144;
                    break;
                }
                case 104: {
                    n14 = 29;
                    break;
                }
                case 105: {
                    n14 = 104;
                    break;
                }
                case 106: {
                    n14 = 9;
                    break;
                }
                case 107: {
                    n14 = 92;
                    break;
                }
                case 108: {
                    n14 = 216;
                    break;
                }
                case 109: {
                    n14 = 51;
                    break;
                }
                case 110: {
                    n14 = 97;
                    break;
                }
                case 111: {
                    n14 = 2;
                    break;
                }
                case 112: {
                    n14 = 108;
                    break;
                }
                case 113: {
                    n14 = 113;
                    break;
                }
                case 114: {
                    n14 = 145;
                    break;
                }
                case 115: {
                    n14 = 86;
                    break;
                }
                case 116: {
                    n14 = 215;
                    break;
                }
                case 117: {
                    n14 = 201;
                    break;
                }
                case 118: {
                    n14 = 53;
                    break;
                }
                case 119: {
                    n14 = 32;
                    break;
                }
                case 120: {
                    n14 = 208;
                    break;
                }
                case 121: {
                    n14 = 219;
                    break;
                }
                case 122: {
                    n14 = 149;
                    break;
                }
                case 123: {
                    n14 = 131;
                    break;
                }
                case 124: {
                    n14 = 230;
                    break;
                }
                case 125: {
                    n14 = 177;
                    break;
                }
                case 126: {
                    n14 = 244;
                    break;
                }
                case 127: {
                    n14 = 1;
                    break;
                }
                case 128: {
                    n14 = 153;
                    break;
                }
                case 129: {
                    n14 = 123;
                    break;
                }
                case 130: {
                    n14 = 205;
                    break;
                }
                case 131: {
                    n14 = 160;
                    break;
                }
                case 132: {
                    n14 = 204;
                    break;
                }
                case 133: {
                    n14 = 253;
                    break;
                }
                case 134: {
                    n14 = 59;
                    break;
                }
                case 135: {
                    n14 = 106;
                    break;
                }
                case 136: {
                    n14 = 207;
                    break;
                }
                case 137: {
                    n14 = 89;
                    break;
                }
                case 138: {
                    n14 = 226;
                    break;
                }
                case 139: {
                    n14 = 159;
                    break;
                }
                case 140: {
                    n14 = 84;
                    break;
                }
                case 141: {
                    n14 = 235;
                    break;
                }
                case 142: {
                    n14 = 34;
                    break;
                }
                case 143: {
                    n14 = 3;
                    break;
                }
                case 144: {
                    n14 = 206;
                    break;
                }
                case 145: {
                    n14 = 120;
                    break;
                }
                case 146: {
                    n14 = 152;
                    break;
                }
                case 147: {
                    n14 = 239;
                    break;
                }
                case 148: {
                    n14 = 128;
                    break;
                }
                case 149: {
                    n14 = 55;
                    break;
                }
                case 150: {
                    n14 = 211;
                    break;
                }
                case 151: {
                    n14 = 87;
                    break;
                }
                case 152: {
                    n14 = 31;
                    break;
                }
                case 153: {
                    n14 = 156;
                    break;
                }
                case 154: {
                    n14 = 91;
                    break;
                }
                case 155: {
                    n14 = 76;
                    break;
                }
                case 156: {
                    n14 = 69;
                    break;
                }
                case 157: {
                    n14 = 182;
                    break;
                }
                case 158: {
                    n14 = 237;
                    break;
                }
                case 159: {
                    n14 = 183;
                    break;
                }
                case 160: {
                    n14 = 11;
                    break;
                }
                case 161: {
                    n14 = 35;
                    break;
                }
                case 162: {
                    n14 = 129;
                    break;
                }
                case 163: {
                    n14 = 130;
                    break;
                }
                case 164: {
                    n14 = 234;
                    break;
                }
                case 165: {
                    n14 = 134;
                    break;
                }
                case 166: {
                    n14 = 28;
                    break;
                }
                case 167: {
                    n14 = 209;
                    break;
                }
                case 168: {
                    n14 = 47;
                    break;
                }
                case 169: {
                    n14 = 94;
                    break;
                }
                case 170: {
                    n14 = 62;
                    break;
                }
                case 171: {
                    n14 = 68;
                    break;
                }
                case 172: {
                    n14 = 54;
                    break;
                }
                case 173: {
                    n14 = 40;
                    break;
                }
                case 174: {
                    n14 = 77;
                    break;
                }
                case 175: {
                    n14 = 136;
                    break;
                }
                case 176: {
                    n14 = 58;
                    break;
                }
                case 177: {
                    n14 = 19;
                    break;
                }
                case 178: {
                    n14 = 199;
                    break;
                }
                case 179: {
                    n14 = 163;
                    break;
                }
                case 180: {
                    n14 = 67;
                    break;
                }
                case 181: {
                    n14 = 186;
                    break;
                }
                case 182: {
                    n14 = 169;
                    break;
                }
                case 183: {
                    n14 = 12;
                    break;
                }
                case 184: {
                    n14 = 245;
                    break;
                }
                case 185: {
                    n14 = 37;
                    break;
                }
                case 186: {
                    n14 = 125;
                    break;
                }
                case 187: {
                    n14 = 101;
                    break;
                }
                case 188: {
                    n14 = 250;
                    break;
                }
                case 189: {
                    n14 = 150;
                    break;
                }
                case 190: {
                    n14 = 126;
                    break;
                }
                case 191: {
                    n14 = 227;
                    break;
                }
                case 192: {
                    n14 = 174;
                    break;
                }
                case 193: {
                    n14 = 118;
                    break;
                }
                case 194: {
                    n14 = 248;
                    break;
                }
                case 195: {
                    n14 = 103;
                    break;
                }
                case 196: {
                    n14 = 107;
                    break;
                }
                case 197: {
                    n14 = 175;
                    break;
                }
                case 198: {
                    n14 = 74;
                    break;
                }
                case 199: {
                    n14 = 190;
                    break;
                }
                case 200: {
                    n14 = 24;
                    break;
                }
                case 201: {
                    n14 = 33;
                    break;
                }
                case 202: {
                    n14 = 30;
                    break;
                }
                case 203: {
                    n14 = 49;
                    break;
                }
                case 204: {
                    n14 = 185;
                    break;
                }
                case 205: {
                    n14 = 81;
                    break;
                }
                case 206: {
                    n14 = 8;
                    break;
                }
                case 207: {
                    n14 = 218;
                    break;
                }
                case 208: {
                    n14 = 56;
                    break;
                }
                case 209: {
                    n14 = 184;
                    break;
                }
                case 210: {
                    n14 = 119;
                    break;
                }
                case 211: {
                    n14 = 195;
                    break;
                }
                case 212: {
                    n14 = 225;
                    break;
                }
                case 213: {
                    n14 = 148;
                    break;
                }
                case 214: {
                    n14 = 158;
                    break;
                }
                case 215: {
                    n14 = 172;
                    break;
                }
                case 216: {
                    n14 = 202;
                    break;
                }
                case 217: {
                    n14 = 198;
                    break;
                }
                case 218: {
                    n14 = 66;
                    break;
                }
                case 219: {
                    n14 = 83;
                    break;
                }
                case 220: {
                    n14 = 166;
                    break;
                }
                case 221: {
                    n14 = 161;
                    break;
                }
                case 222: {
                    n14 = 27;
                    break;
                }
                case 223: {
                    n14 = 82;
                    break;
                }
                case 224: {
                    n14 = 189;
                    break;
                }
                case 225: {
                    n14 = 7;
                    break;
                }
                case 226: {
                    n14 = 38;
                    break;
                }
                case 227: {
                    n14 = 138;
                    break;
                }
                case 228: {
                    n14 = 142;
                    break;
                }
                case 229: {
                    n14 = 229;
                    break;
                }
                case 230: {
                    n14 = 99;
                    break;
                }
                case 231: {
                    n14 = 194;
                    break;
                }
                case 232: {
                    n14 = 112;
                    break;
                }
                case 233: {
                    n14 = 18;
                    break;
                }
                case 234: {
                    n14 = 191;
                    break;
                }
                case 235: {
                    n14 = 110;
                    break;
                }
                case 236: {
                    n14 = 23;
                    break;
                }
                case 237: {
                    n14 = 140;
                    break;
                }
                case 238: {
                    n14 = 132;
                    break;
                }
                case 239: {
                    n14 = 127;
                    break;
                }
                case 240: {
                    n14 = 36;
                    break;
                }
                case 241: {
                    n14 = 241;
                    break;
                }
                case 242: {
                    n14 = 71;
                    break;
                }
                case 243: {
                    n14 = 52;
                    break;
                }
                case 244: {
                    n14 = 26;
                    break;
                }
                case 245: {
                    n14 = 13;
                    break;
                }
                case 246: {
                    n14 = 200;
                    break;
                }
                case 247: {
                    n14 = 135;
                    break;
                }
                case 248: {
                    n14 = 220;
                    break;
                }
                case 249: {
                    n14 = 85;
                    break;
                }
                case 250: {
                    n14 = 102;
                    break;
                }
                case 251: {
                    n14 = 79;
                    break;
                }
                case 252: {
                    n14 = 100;
                    break;
                }
                case 253: {
                    n14 = 98;
                    break;
                }
                case 254: {
                    n14 = 16;
                    break;
                }
                default: {
                    n14 = 15;
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
            fk_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

