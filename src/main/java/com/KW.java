/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.BY;
import com.EP;
import com.FW;
import com.GT;
import com.GU;
import com.GV;
import com.H2;
import com.HI;
import com.HK;
import com.IG;
import com.IK;
import com.K2;
import com.KK;
import com.N9;
import com.O0;
import com.P7;
import com.S7;
import com.WX;
import com.X4;
import com.ak_0;
import com.ca_1;
import com.cw_1;
import com.da_0;
import com.df_2;
import com.dl_1;
import com.en_0;
import com.ep_2;
import com.ge_0;
import com.hf_0;
import com.hi_0;
import com.ks_0;
import com.nj_2;
import com.nl_1;
import com.nv_2;
import com.o1_0;
import com.oc_0;
import com.ok_0;
import com.on_1;
import com.ph_0;
import com.ph_2;
import com.sw_0;
import com.u7;
import com.u9;
import com.uT;
import com.ub_0;
import com.uh_0;
import com.uy_0;
import com.wr_2;
import com.wy_2;
import com.xd_2;
import com.xm_1;
import com.xw_2;
import com.ym_1;
import com.yn_2;
import com.zzzzF6BeanInfo;
import com.zzzzd4BeanInfo;
import java.security.AccessController;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;

public class KW
extends ClassLoader {
    private static ProtectionDomain n;
    private static Map G;

    public KW() {
        super(KW.q());
    }

    public KW(ClassLoader classLoader) {
        super(classLoader);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ClassLoader q() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            if (classLoader == null) return ok_0.class.getClassLoader();
            try {
                classLoader.loadClass(ok_0.class.getName());
                return classLoader;
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
                return ok_0.class.getClassLoader();
            }
        }
        catch (hi_0 hi_02) {
            throw KW.a(hi_02);
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected Class loadClass(String string, boolean bl) throws ClassNotFoundException {
        Class<?> clazz;
        block6: {
            Class<?> clazz2 = (Class<?>)G.get(string);
            int n10 = ph_0.w();
            clazz = clazz2;
            if (n10 == 0) return clazz;
            try {
                if (clazz == null) break block6;
                return clazz2;
                catch (ClassNotFoundException classNotFoundException) {
                    throw KW.a(classNotFoundException);
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw KW.a(classNotFoundException);
            }
        }
        clazz = super.loadClass(string, bl);
        return clazz;
    }

    public Class F(String string, byte[] byArray, int n10, int n11) throws ClassFormatError {
        Class<?> clazz = this.defineClass(string, byArray, n10, n11, n);
        return clazz;
    }

    public boolean W(Class clazz) {
        ClassLoader classLoader = clazz.getClassLoader();
        int n10 = ph_0.w();
        try {
            if (classLoader == null) {
                return false;
            }
        }
        catch (hi_0 hi_02) {
            throw KW.a(hi_02);
        }
        KW kW = this;
        while (kW != null) {
            block8: {
                ClassLoader classLoader2;
                block9: {
                    try {
                        try {
                            classLoader2 = kW;
                            if (n10 == 0) break block8;
                            if (classLoader2 != classLoader) break block9;
                        }
                        catch (hi_0 hi_03) {
                            throw KW.a(hi_03);
                        }
                        return false;
                    }
                    catch (hi_0 hi_04) {
                        throw KW.a(hi_04);
                    }
                }
                classLoader2 = kW = kW.getParent();
            }
            if (n10 != 0) continue;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var1 = 4290589594971281358L;
                var0_1 = new long[51];
                var4_2 = 0;
                var5_3 = "\u00f0s\bn\r@\u0017\u00c4Wl\u00be\u000f\r@\u0017\u00d2S\u008e\u001b'\r@\u0017\u00d4w%\u000bg\r@\u0017\u00c9wP:\u00a4\r@\u0017\u00c7*,\u000fY\r@\u0017\u00e5\u00d4e\u009b\u00a0\r@\u0017\u00dd\u0088CVI\r@\u0017\u00ff\u00f4\u00ff\u0087\u0089\r@\u0017\u00e0\u007f/n\u0005\r@\u0017\u00c6v\bP\u0018\r@\u0017\u00d8\u00c8\u00af\u00e0G\r@\u0017\u00d7\u001e\u009a~^\r@\u0017\u00e7\u00a9%\u0012b\r@\u0017\u00f6Q\u00bb\u0081\u00eb\r@\u0017\u00fc\u0018\u00a2\u00f1\u00c8\r@\u0017\u00c2\u00c2E5*\r@\u0017\u00eaT\u009dtn\r@\u0017\u00e6\u00d9\u0012h\\\r@\u0017\u00fb\u00e9\u0019:\u00fa\r@\u0017\u00f8u^\u00b7\u00f3\r@\u0017\u00e1Ry\u00a1_\r@\u0017\u00fem*{\u00d6\r@\u0017\u00d1\u00ad@C<\r@\u0017\u00eee\u00bd-\u00c7\r@\u0017\u00eb\u000e\u00f7\u00b7#\r@\u0017\u00e3@\u0012\u00a7\u00d7\r@\u0017\u00faU\u00c3\u000e\u00fe\r@\u0017\u00ed\u00fa\u00ba\u009aL\r@\u0017\u00c3I/\u0002O\r@\u0017\u00e9\u00e5l\u0097%\r@\u0017\u00c1\u00ec\u00b8\u00edV\r@\u0017\u00dc!\u00fcL\u00b6\r@\u0017\u00d5\u00cb\u00a7Kk\r@\u0017\u00ef\u0017g&\u0081\r@\u0017\u00de%\u00a6\u00a6\u00d9\r@\u0017\u00f9\u00c2f7\u00fe\r@\u0017\u00e4\u00c4i\u00df\u00ca\r@\u0017\u00d9\u00e3\u00db\u001a\u00af\r@\u0017\u00e8\r\u001a G\r@\u0017\u00fdH\u00cf\u009b\f\r@\u0017\u00e2\u00ba\u00dc\u00a7\u001d\r@\u0017\u00d3\u00e1 \u00fc\b\r@\u0017\u00db\u00c8\u009co\u00ac\r@\u0017\u00c0\u0098\u00824\u0006\r@\u0017\u00da\u00b2ZD\u0092\r@\u0017\u00d6i3\u000e\u008b\r@\u0017\u00d0qZ.\u00e1\r@\u0017\u00c5\u001e\u001cw\u0095\r@\u0017\u00ec";
                var6_4 = "\u00f0s\bn\r@\u0017\u00c4Wl\u00be\u000f\r@\u0017\u00d2S\u008e\u001b'\r@\u0017\u00d4w%\u000bg\r@\u0017\u00c9wP:\u00a4\r@\u0017\u00c7*,\u000fY\r@\u0017\u00e5\u00d4e\u009b\u00a0\r@\u0017\u00dd\u0088CVI\r@\u0017\u00ff\u00f4\u00ff\u0087\u0089\r@\u0017\u00e0\u007f/n\u0005\r@\u0017\u00c6v\bP\u0018\r@\u0017\u00d8\u00c8\u00af\u00e0G\r@\u0017\u00d7\u001e\u009a~^\r@\u0017\u00e7\u00a9%\u0012b\r@\u0017\u00f6Q\u00bb\u0081\u00eb\r@\u0017\u00fc\u0018\u00a2\u00f1\u00c8\r@\u0017\u00c2\u00c2E5*\r@\u0017\u00eaT\u009dtn\r@\u0017\u00e6\u00d9\u0012h\\\r@\u0017\u00fb\u00e9\u0019:\u00fa\r@\u0017\u00f8u^\u00b7\u00f3\r@\u0017\u00e1Ry\u00a1_\r@\u0017\u00fem*{\u00d6\r@\u0017\u00d1\u00ad@C<\r@\u0017\u00eee\u00bd-\u00c7\r@\u0017\u00eb\u000e\u00f7\u00b7#\r@\u0017\u00e3@\u0012\u00a7\u00d7\r@\u0017\u00faU\u00c3\u000e\u00fe\r@\u0017\u00ed\u00fa\u00ba\u009aL\r@\u0017\u00c3I/\u0002O\r@\u0017\u00e9\u00e5l\u0097%\r@\u0017\u00c1\u00ec\u00b8\u00edV\r@\u0017\u00dc!\u00fcL\u00b6\r@\u0017\u00d5\u00cb\u00a7Kk\r@\u0017\u00ef\u0017g&\u0081\r@\u0017\u00de%\u00a6\u00a6\u00d9\r@\u0017\u00f9\u00c2f7\u00fe\r@\u0017\u00e4\u00c4i\u00df\u00ca\r@\u0017\u00d9\u00e3\u00db\u001a\u00af\r@\u0017\u00e8\r\u001a G\r@\u0017\u00fdH\u00cf\u009b\f\r@\u0017\u00e2\u00ba\u00dc\u00a7\u001d\r@\u0017\u00d3\u00e1 \u00fc\b\r@\u0017\u00db\u00c8\u009co\u00ac\r@\u0017\u00c0\u0098\u00824\u0006\r@\u0017\u00da\u00b2ZD\u0092\r@\u0017\u00d6i3\u000e\u008b\r@\u0017\u00d0qZ.\u00e1\r@\u0017\u00c5\u001e\u001cw\u0095\r@\u0017\u00ec".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block8;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "\u0004-\u001a\u00d6\r@\u0017\u00df\u0095L\u00b7\u0003\r@\u0017\u00c8";
                    var6_4 = "\u0004-\u001a\u00d6\r@\u0017\u00df\u0095L\u00b7\u0003\r@\u0017\u00c8".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block9;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        KW.G = new HashMap<K, V>();
        KW.n = (ProtectionDomain)AccessController.doPrivileged(new xw_2());
        v5 = new Class[(int)var0_1[13]];
        v5[0] = ok_0.class;
        v5[1] = O0.class;
        v5[2] = oc_0.class;
        v5[3] = ph_2.class;
        v5[4] = xd_2.class;
        v5[5] = hi_0.class;
        v5[(int)var0_1[50]] = hf_0.class;
        v5[(int)var0_1[3]] = df_2.class;
        v5[(int)var0_1[9]] = ca_1.class;
        v5[(int)var0_1[4]] = on_1.class;
        v5[(int)var0_1[0]] = HI.class;
        v5[(int)var0_1[47]] = ph_0.class;
        v5[(int)var0_1[15]] = B8.class;
        v5[(int)var0_1[28]] = S7.class;
        v5[(int)var0_1[43]] = GT.class;
        v5[(int)var0_1[30]] = HK.class;
        v5[(int)var0_1[34]] = zzzzF6BeanInfo.class;
        v5[(int)var0_1[49]] = ak_0.class;
        v5[(int)var0_1[31]] = nj_2.class;
        v5[(int)var0_1[6]] = nv_2.class;
        v5[(int)var0_1[44]] = zzzzd4BeanInfo.class;
        v5[(int)var0_1[42]] = nl_1.class;
        v5[(int)var0_1[10]] = ym_1.class;
        v5[(int)var0_1[37]] = wr_2.class;
        v5[(int)var0_1[45]] = BY.class;
        v5[(int)var0_1[11]] = wy_2.class;
        v5[(int)var0_1[2]] = K2.class;
        v5[(int)var0_1[32]] = H2.class;
        v5[(int)var0_1[1]] = IK.class;
        v5[(int)var0_1[41]] = WX.class;
        v5[(int)var0_1[46]] = KK.class;
        v5[(int)var0_1[22]] = cw_1.class;
        v5[(int)var0_1[23]] = N9.class;
        v5[(int)var0_1[33]] = EP.class;
        v5[(int)var0_1[48]] = FW.class;
        v5[(int)var0_1[27]] = uh_0.class;
        v5[(int)var0_1[16]] = en_0.class;
        v5[(int)var0_1[24]] = ep_2.class;
        v5[(int)var0_1[38]] = IG.class;
        v5[(int)var0_1[29]] = yn_2.class;
        v5[(int)var0_1[17]] = P7.class;
        v5[(int)var0_1[12]] = u9.class;
        v5[(int)var0_1[36]] = xm_1.class;
        v5[(int)var0_1[5]] = ge_0.class;
        v5[(int)var0_1[40]] = o1_0.class;
        v5[(int)var0_1[25]] = ks_0.class;
        v5[(int)var0_1[8]] = uy_0.class;
        v5[(int)var0_1[20]] = u7.class;
        v5[(int)var0_1[21]] = sw_0.class;
        v5[(int)var0_1[7]] = X4.class;
        v5[(int)var0_1[14]] = GV.class;
        v5[(int)var0_1[39]] = GU.class;
        v5[(int)var0_1[26]] = da_0.class;
        v5[(int)var0_1[18]] = dl_1.class;
        v5[(int)var0_1[19]] = uT.class;
        v5[(int)var0_1[35]] = ub_0.class;
        for (Class var12_11 : var8_7 = v5) {
            KW.G.put(var12_11.getName(), var12_11);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

