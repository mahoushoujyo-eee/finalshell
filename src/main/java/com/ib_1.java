/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com._Y;
import com.db_0;
import com.dm_2;
import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.platform.win32.WinUser;
import com.uJ;

/*
 * Renamed from com.iB
 */
public class ib_1
implements db_0 {
    private final User32 h;
    private final Kernel32 d;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] e;
    private static final long[] f;
    private static final Long[] g;

    /*
     * Loose catch block
     */
    public ib_1() throws _Y {
        block6: {
            block7: {
                boolean bl = dm_2.J();
                boolean bl2 = bl;
                if (bl2) break block6;
                try {
                    block8: {
                        if (E8.V(ib_1.a(4699, -1087), "").startsWith(ib_1.a(4689, 7955))) break block7;
                        break block8;
                        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                            throw ib_1.a(unsatisfiedLinkError);
                        }
                    }
                    throw new _Y(ib_1.a(4700, -31459));
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                    throw ib_1.a(unsatisfiedLinkError);
                }
            }
            try {
                this.h = User32.INSTANCE;
                this.d = Kernel32.INSTANCE;
            }
            catch (NoClassDefFoundError | UnsatisfiedLinkError linkageError) {
                throw new _Y(linkageError.toString(), linkageError);
            }
        }
    }

    @Override
    public String B() {
        return ib_1.a(4692, 15263);
    }

    @Override
    public boolean x() {
        return this.h.FindWindow(ib_1.a(4701, 10894), ib_1.a(4694, 12740)) != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void Z(uJ uJ2) throws _Y {
        boolean bl = dm_2.J();
        try {
            if (uJ2.P() > ib_1.a(15310, 8167174058287312919L)) {
                throw new _Y(ib_1.a(4702, -8549));
            }
        }
        catch (_Y _Y2) {
            throw ib_1.a(_Y2);
        }
        WinDef.HWND hWND = this.h.FindWindow(ib_1.a(4694, 12740), ib_1.a(4694, 12740));
        try {
            if (hWND == null) {
                throw new _Y(ib_1.a(4696, -5290));
            }
        }
        catch (_Y _Y3) {
            throw ib_1.a(_Y3);
        }
        String string = String.format(ib_1.a(4688, 31953), this.d.GetCurrentThreadId());
        WinNT.HANDLE hANDLE = null;
        Pointer pointer = null;
        try {
            long l2;
            long l3;
            long l4;
            block42: {
                long l5;
                block41: {
                    Pointer pointer2;
                    block43: {
                        block40: {
                            WinNT.HANDLE hANDLE2;
                            block39: {
                                WinBase.SECURITY_ATTRIBUTES sECURITY_ATTRIBUTES = null;
                                hANDLE = this.d.CreateFileMapping(WinBase.INVALID_HANDLE_VALUE, sECURITY_ATTRIBUTES, 4, 0, ib_1.a(19280, 4701741163533648008L), string);
                                try {
                                    hANDLE2 = hANDLE;
                                    if (bl) break block39;
                                    if (hANDLE2 == null) throw new _Y(ib_1.a(4695, -24469));
                                }
                                catch (_Y _Y4) {
                                    throw ib_1.a(_Y4);
                                }
                                hANDLE2 = hANDLE;
                            }
                            try {
                                if (hANDLE2 == WinBase.INVALID_HANDLE_VALUE) {
                                    throw new _Y(ib_1.a(4695, -24469));
                                }
                            }
                            catch (_Y _Y5) {
                                throw ib_1.a(_Y5);
                            }
                            pointer = this.d.MapViewOfFile(hANDLE, 2, 0, 0, 0);
                            pointer2 = pointer;
                            if (bl) break block43;
                            try {
                                if (pointer2 != null) break block40;
                                throw new _Y(ib_1.a(4703, -9221));
                                catch (_Y _Y6) {
                                    throw ib_1.a(_Y6);
                                }
                            }
                            catch (_Y _Y7) {
                                throw ib_1.a(_Y7);
                            }
                        }
                        pointer2 = pointer;
                    }
                    pointer2.write(0L, uJ2.g, 0, uJ2.P());
                    WinUser.COPYDATASTRUCT cOPYDATASTRUCT = ib_1.u(string);
                    long l6 = this.Z(hWND, cOPYDATASTRUCT);
                    l4 = cOPYDATASTRUCT.dwData.longValue();
                    uJ2.a();
                    long l7 = l6 - 0L;
                    l5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (bl) break block41;
                    try {
                        block44: {
                            if (l5 == false) throw new _Y(ib_1.a(4697, -12232) + Long.toHexString(l4));
                            break block44;
                            catch (_Y _Y8) {
                                throw ib_1.a(_Y8);
                            }
                        }
                        pointer.read(0L, uJ2.g, 0, 4);
                        l5 = uJ2.d();
                    }
                    catch (_Y _Y9) {
                        throw ib_1.a(_Y9);
                    }
                }
                l3 = l5;
                try {
                    l2 = l3;
                    if (bl) break block42;
                    if (l2 <= 0) throw new _Y(ib_1.a(4693, 25612) + (int)l3);
                }
                catch (_Y _Y10) {
                    throw ib_1.a(_Y10);
                }
                l2 = l3;
            }
            try {
                if (l2 > ib_1.a(24136, 8962438291225073042L)) {
                    throw new _Y(ib_1.a(4693, 25612) + (int)l3);
                }
            }
            catch (_Y _Y11) {
                throw ib_1.a(_Y11);
            }
            try {
                uJ2.a();
                uJ2.X((int)l3);
                pointer.read(ib_1.b(22578, 1709190237613560372L), uJ2.g, 0, (int)l3);
                if (bl) {
                    throw new _Y(ib_1.a(4697, -12232) + Long.toHexString(l4));
                }
            }
            catch (_Y _Y12) {
                throw ib_1.a(_Y12);
            }
        }
        catch (Throwable throwable) {
            try {
                if (pointer != null) {
                    this.d.UnmapViewOfFile(pointer);
                }
            }
            catch (_Y _Y13) {
                throw ib_1.a(_Y13);
            }
            try {
                if (hANDLE == null) throw throwable;
                this.d.CloseHandle(hANDLE);
                throw throwable;
            }
            catch (_Y _Y14) {
                throw ib_1.a(_Y14);
            }
        }
        try {
            if (pointer != null) {
                this.d.UnmapViewOfFile(pointer);
            }
        }
        catch (_Y _Y15) {
            throw ib_1.a(_Y15);
        }
        try {
            if (hANDLE == null) return;
            this.d.CloseHandle(hANDLE);
            return;
        }
        catch (_Y _Y16) {
            throw ib_1.a(_Y16);
        }
    }

    static WinUser.COPYDATASTRUCT u(String string) {
        Memory memory = new Memory(string.length() + 1);
        memory.setString(0L, string, ib_1.a(4698, -15794));
        WinUser.COPYDATASTRUCT cOPYDATASTRUCT = new WinUser.COPYDATASTRUCT();
        cOPYDATASTRUCT.dwData = new BaseTSD.ULONG_PTR(ib_1.b(15321, 1005935216389583326L));
        cOPYDATASTRUCT.cbData = (int)memory.size();
        cOPYDATASTRUCT.lpData = memory;
        cOPYDATASTRUCT.write();
        return cOPYDATASTRUCT;
    }

    long Z(WinDef.HWND hWND, WinUser.COPYDATASTRUCT cOPYDATASTRUCT) {
        WinDef.LPARAM lPARAM = new WinDef.LPARAM(Pointer.nativeValue(cOPYDATASTRUCT.getPointer()));
        WinDef.LRESULT lRESULT = this.h.SendMessage(hWND, ib_1.a(31717, 3260472462419095614L), null, lPARAM);
        return lRESULT.longValue();
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

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
                                var21 = new String[14];
                                var19_1 = 0;
                                var18_2 = "y\u00e5\u00ac1i\u00d4\u00d9+\u00ddM8$\u00fbv\u008b.\u008e>\u0098\u0017\u0086\u0092\u00b0\u00b0\n\u00e0\u001d\u00a7\u00b45\u00cbJ\u00f0\u008ej9\u00cel,\u00e95\"\u00c9\u00b0\u001e{F\u00b5\u0002\u008a\u00f7%\u000f\u001d\u00c1\u00c7\u000f\u00e6\u00eda\u009cH\u00d7I\u00c5\u00b9\u0005u\u00c4\u00b1\u00c2\u001f\u0082\u00cbb.g\u009e\u007f?.)>0\u00ecD@\u00ab\u00ef\u0010d\u000e,\u00cd#\u00f0\u008bU\u008e\u00b6\u009a\u0085\u0095W\u00eb%1L\u009b\u00ad\u00b9Yl\u009d\u00aaW\u00bc\u00e2o\u0084\u00b7*\u00e0\u0081\u0091\u0085\u0087p\u008e%'\u00bdzW\u00db-\u00f8\u00c3\u00be/\u00cf\u00c5\u00d5\b\u0002\u00e4*\u000f\u00f1}\u00f8\u00e9\u0002\u0007\u00d5@\u0018\u0018\u00bb\u0080\u00fa\u00ec\u00adi6\u00d4/[\u0080u\n\f\u00a3n\u0083n\u00e8\u00ca\u00d0\u0010)\u0007y&=\u0012;\u00d9\u0082\b\u00ee}\u00b1r\u00fb1\u00c2D\u0010\u001c\u009812\u00b6\u00bb\u00fc\u001ax\u00bc%/&\u00cb\u0004V\u0007\"^\u00e3F\u0080:\u00e4%W*\u00ca!n:\u00c1\u00fa\u0019;g'\u00d3t\u00c7\u00cc\u009c\u0086\u00c9\u00f9\u00e3\u0017N\u00b5\u00e2\u00ed\u00cfQ8\u00e4\u00fc\u0089\u00b4sKM\u008e\u0007\u00c0k\u009b\u00e0\u008f\u00ee\u0005";
                                var20_3 = "y\u00e5\u00ac1i\u00d4\u00d9+\u00ddM8$\u00fbv\u008b.\u008e>\u0098\u0017\u0086\u0092\u00b0\u00b0\n\u00e0\u001d\u00a7\u00b45\u00cbJ\u00f0\u008ej9\u00cel,\u00e95\"\u00c9\u00b0\u001e{F\u00b5\u0002\u008a\u00f7%\u000f\u001d\u00c1\u00c7\u000f\u00e6\u00eda\u009cH\u00d7I\u00c5\u00b9\u0005u\u00c4\u00b1\u00c2\u001f\u0082\u00cbb.g\u009e\u007f?.)>0\u00ecD@\u00ab\u00ef\u0010d\u000e,\u00cd#\u00f0\u008bU\u008e\u00b6\u009a\u0085\u0095W\u00eb%1L\u009b\u00ad\u00b9Yl\u009d\u00aaW\u00bc\u00e2o\u0084\u00b7*\u00e0\u0081\u0091\u0085\u0087p\u008e%'\u00bdzW\u00db-\u00f8\u00c3\u00be/\u00cf\u00c5\u00d5\b\u0002\u00e4*\u000f\u00f1}\u00f8\u00e9\u0002\u0007\u00d5@\u0018\u0018\u00bb\u0080\u00fa\u00ec\u00adi6\u00d4/[\u0080u\n\f\u00a3n\u0083n\u00e8\u00ca\u00d0\u0010)\u0007y&=\u0012;\u00d9\u0082\b\u00ee}\u00b1r\u00fb1\u00c2D\u0010\u001c\u009812\u00b6\u00bb\u00fc\u001ax\u00bc%/&\u00cb\u0004V\u0007\"^\u00e3F\u0080:\u00e4%W*\u00ca!n:\u00c1\u00fa\u0019;g'\u00d3t\u00c7\u00cc\u009c\u0086\u00c9\u00f9\u00e3\u0017N\u00b5\u00e2\u00ed\u00cfQ8\u00e4\u00fc\u0089\u00b4sKM\u008e\u0007\u00c0k\u009b\u00e0\u008f\u00ee\u0005".length();
                                var17_4 = 7;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 55;
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
                                    var18_2 = "\u001c\u00df\u0096\u0006prJ\u0012I\u0084\u00d2e\u00de&WMg\u0006\u008d\u00944\u009a\u00c6\u008b\u00a7\u00e2";
                                    var20_3 = "\u001c\u00df\u0096\u0006prJ\u0012I\u0084\u00d2e\u00de&WMg\u0006\u008d\u00944\u009a\u00c6\u008b\u00a7\u00e2".length();
                                    var17_4 = 7;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 44;
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
                                            v15 = 24;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 17;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 108;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 86;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 74;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 78;
                                            break;
                                        }
                                        default: {
                                            v15 = 85;
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
                        ib_1.a = var21;
                        ib_1.b = new String[14];
                        var8_7 = 8807840377652517790L;
                        var14_8 = new long[4];
                        var11_9 = 0;
                        var12_10 = "-\u00b2gu2\u0017[\u00162\u00bf\u00d3#\u0087V+\u0089";
                        var13_11 = "-\u00b2gu2\u0017[\u00162\u00bf\u00d3#\u0087V+\u0089".length();
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
                            var12_10 = "\u0080\u00e7D\u00ecY\u0085\u00b1\u00f0I^3\u00c5^<\u00eb\u00ea";
                            var13_11 = "\u0080\u00e7D\u00ecY\u0085\u00b1\u00f0I^3\u00c5^<\u00eb\u00ea".length();
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
                ib_1.c = var14_8;
                ib_1.e = new Integer[4];
                var0_14 = 950789062543319799L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "\u001a\u0089\u00a2\u00eaO\u00bd0\u00c7\u0000\u00c4-\"\u000e\u0082\u0003\u0093";
                var5_18 = "\u001a\u0089\u00a2\u00eaO\u00bd0\u00c7\u0000\u00c4-\"\u000e\u0082\u0003\u0093".length();
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
        ib_1.f = var6_15;
        ib_1.g = new Long[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x125D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 18;
                    break;
                }
                case 1: {
                    n14 = 204;
                    break;
                }
                case 2: {
                    n14 = 249;
                    break;
                }
                case 3: {
                    n14 = 229;
                    break;
                }
                case 4: {
                    n14 = 159;
                    break;
                }
                case 5: {
                    n14 = 219;
                    break;
                }
                case 6: {
                    n14 = 124;
                    break;
                }
                case 7: {
                    n14 = 7;
                    break;
                }
                case 8: {
                    n14 = 233;
                    break;
                }
                case 9: {
                    n14 = 230;
                    break;
                }
                case 10: {
                    n14 = 57;
                    break;
                }
                case 11: {
                    n14 = 132;
                    break;
                }
                case 12: {
                    n14 = 80;
                    break;
                }
                case 13: {
                    n14 = 34;
                    break;
                }
                case 14: {
                    n14 = 113;
                    break;
                }
                case 15: {
                    n14 = 206;
                    break;
                }
                case 16: {
                    n14 = 246;
                    break;
                }
                case 17: {
                    n14 = 227;
                    break;
                }
                case 18: {
                    n14 = 96;
                    break;
                }
                case 19: {
                    n14 = 184;
                    break;
                }
                case 20: {
                    n14 = 157;
                    break;
                }
                case 21: {
                    n14 = 176;
                    break;
                }
                case 22: {
                    n14 = 70;
                    break;
                }
                case 23: {
                    n14 = 235;
                    break;
                }
                case 24: {
                    n14 = 216;
                    break;
                }
                case 25: {
                    n14 = 49;
                    break;
                }
                case 26: {
                    n14 = 87;
                    break;
                }
                case 27: {
                    n14 = 185;
                    break;
                }
                case 28: {
                    n14 = 156;
                    break;
                }
                case 29: {
                    n14 = 234;
                    break;
                }
                case 30: {
                    n14 = 0;
                    break;
                }
                case 31: {
                    n14 = 93;
                    break;
                }
                case 32: {
                    n14 = 134;
                    break;
                }
                case 33: {
                    n14 = 253;
                    break;
                }
                case 34: {
                    n14 = 155;
                    break;
                }
                case 35: {
                    n14 = 168;
                    break;
                }
                case 36: {
                    n14 = 48;
                    break;
                }
                case 37: {
                    n14 = 95;
                    break;
                }
                case 38: {
                    n14 = 236;
                    break;
                }
                case 39: {
                    n14 = 138;
                    break;
                }
                case 40: {
                    n14 = 148;
                    break;
                }
                case 41: {
                    n14 = 210;
                    break;
                }
                case 42: {
                    n14 = 251;
                    break;
                }
                case 43: {
                    n14 = 75;
                    break;
                }
                case 44: {
                    n14 = 11;
                    break;
                }
                case 45: {
                    n14 = 88;
                    break;
                }
                case 46: {
                    n14 = 165;
                    break;
                }
                case 47: {
                    n14 = 43;
                    break;
                }
                case 48: {
                    n14 = 33;
                    break;
                }
                case 49: {
                    n14 = 52;
                    break;
                }
                case 50: {
                    n14 = 217;
                    break;
                }
                case 51: {
                    n14 = 146;
                    break;
                }
                case 52: {
                    n14 = 39;
                    break;
                }
                case 53: {
                    n14 = 67;
                    break;
                }
                case 54: {
                    n14 = 149;
                    break;
                }
                case 55: {
                    n14 = 239;
                    break;
                }
                case 56: {
                    n14 = 133;
                    break;
                }
                case 57: {
                    n14 = 76;
                    break;
                }
                case 58: {
                    n14 = 207;
                    break;
                }
                case 59: {
                    n14 = 244;
                    break;
                }
                case 60: {
                    n14 = 64;
                    break;
                }
                case 61: {
                    n14 = 29;
                    break;
                }
                case 62: {
                    n14 = 107;
                    break;
                }
                case 63: {
                    n14 = 189;
                    break;
                }
                case 64: {
                    n14 = 228;
                    break;
                }
                case 65: {
                    n14 = 248;
                    break;
                }
                case 66: {
                    n14 = 100;
                    break;
                }
                case 67: {
                    n14 = 108;
                    break;
                }
                case 68: {
                    n14 = 167;
                    break;
                }
                case 69: {
                    n14 = 139;
                    break;
                }
                case 70: {
                    n14 = 178;
                    break;
                }
                case 71: {
                    n14 = 223;
                    break;
                }
                case 72: {
                    n14 = 190;
                    break;
                }
                case 73: {
                    n14 = 142;
                    break;
                }
                case 74: {
                    n14 = 242;
                    break;
                }
                case 75: {
                    n14 = 129;
                    break;
                }
                case 76: {
                    n14 = 131;
                    break;
                }
                case 77: {
                    n14 = 199;
                    break;
                }
                case 78: {
                    n14 = 28;
                    break;
                }
                case 79: {
                    n14 = 1;
                    break;
                }
                case 80: {
                    n14 = 65;
                    break;
                }
                case 81: {
                    n14 = 143;
                    break;
                }
                case 82: {
                    n14 = 163;
                    break;
                }
                case 83: {
                    n14 = 90;
                    break;
                }
                case 84: {
                    n14 = 194;
                    break;
                }
                case 85: {
                    n14 = 128;
                    break;
                }
                case 86: {
                    n14 = 136;
                    break;
                }
                case 87: {
                    n14 = 25;
                    break;
                }
                case 88: {
                    n14 = 174;
                    break;
                }
                case 89: {
                    n14 = 161;
                    break;
                }
                case 90: {
                    n14 = 127;
                    break;
                }
                case 91: {
                    n14 = 173;
                    break;
                }
                case 92: {
                    n14 = 115;
                    break;
                }
                case 93: {
                    n14 = 66;
                    break;
                }
                case 94: {
                    n14 = 147;
                    break;
                }
                case 95: {
                    n14 = 175;
                    break;
                }
                case 96: {
                    n14 = 225;
                    break;
                }
                case 97: {
                    n14 = 192;
                    break;
                }
                case 98: {
                    n14 = 205;
                    break;
                }
                case 99: {
                    n14 = 2;
                    break;
                }
                case 100: {
                    n14 = 61;
                    break;
                }
                case 101: {
                    n14 = 125;
                    break;
                }
                case 102: {
                    n14 = 9;
                    break;
                }
                case 103: {
                    n14 = 77;
                    break;
                }
                case 104: {
                    n14 = 238;
                    break;
                }
                case 105: {
                    n14 = 111;
                    break;
                }
                case 106: {
                    n14 = 162;
                    break;
                }
                case 107: {
                    n14 = 212;
                    break;
                }
                case 108: {
                    n14 = 183;
                    break;
                }
                case 109: {
                    n14 = 140;
                    break;
                }
                case 110: {
                    n14 = 16;
                    break;
                }
                case 111: {
                    n14 = 182;
                    break;
                }
                case 112: {
                    n14 = 137;
                    break;
                }
                case 113: {
                    n14 = 35;
                    break;
                }
                case 114: {
                    n14 = 22;
                    break;
                }
                case 115: {
                    n14 = 89;
                    break;
                }
                case 116: {
                    n14 = 6;
                    break;
                }
                case 117: {
                    n14 = 177;
                    break;
                }
                case 118: {
                    n14 = 135;
                    break;
                }
                case 119: {
                    n14 = 3;
                    break;
                }
                case 120: {
                    n14 = 62;
                    break;
                }
                case 121: {
                    n14 = 37;
                    break;
                }
                case 122: {
                    n14 = 112;
                    break;
                }
                case 123: {
                    n14 = 179;
                    break;
                }
                case 124: {
                    n14 = 120;
                    break;
                }
                case 125: {
                    n14 = 164;
                    break;
                }
                case 126: {
                    n14 = 40;
                    break;
                }
                case 127: {
                    n14 = 145;
                    break;
                }
                case 128: {
                    n14 = 247;
                    break;
                }
                case 129: {
                    n14 = 72;
                    break;
                }
                case 130: {
                    n14 = 81;
                    break;
                }
                case 131: {
                    n14 = 158;
                    break;
                }
                case 132: {
                    n14 = 50;
                    break;
                }
                case 133: {
                    n14 = 54;
                    break;
                }
                case 134: {
                    n14 = 19;
                    break;
                }
                case 135: {
                    n14 = 91;
                    break;
                }
                case 136: {
                    n14 = 30;
                    break;
                }
                case 137: {
                    n14 = 98;
                    break;
                }
                case 138: {
                    n14 = 232;
                    break;
                }
                case 139: {
                    n14 = 63;
                    break;
                }
                case 140: {
                    n14 = 56;
                    break;
                }
                case 141: {
                    n14 = 195;
                    break;
                }
                case 142: {
                    n14 = 250;
                    break;
                }
                case 143: {
                    n14 = 213;
                    break;
                }
                case 144: {
                    n14 = 24;
                    break;
                }
                case 145: {
                    n14 = 222;
                    break;
                }
                case 146: {
                    n14 = 187;
                    break;
                }
                case 147: {
                    n14 = 172;
                    break;
                }
                case 148: {
                    n14 = 14;
                    break;
                }
                case 149: {
                    n14 = 114;
                    break;
                }
                case 150: {
                    n14 = 197;
                    break;
                }
                case 151: {
                    n14 = 20;
                    break;
                }
                case 152: {
                    n14 = 31;
                    break;
                }
                case 153: {
                    n14 = 53;
                    break;
                }
                case 154: {
                    n14 = 79;
                    break;
                }
                case 155: {
                    n14 = 102;
                    break;
                }
                case 156: {
                    n14 = 188;
                    break;
                }
                case 157: {
                    n14 = 226;
                    break;
                }
                case 158: {
                    n14 = 23;
                    break;
                }
                case 159: {
                    n14 = 84;
                    break;
                }
                case 160: {
                    n14 = 170;
                    break;
                }
                case 161: {
                    n14 = 45;
                    break;
                }
                case 162: {
                    n14 = 141;
                    break;
                }
                case 163: {
                    n14 = 104;
                    break;
                }
                case 164: {
                    n14 = 78;
                    break;
                }
                case 165: {
                    n14 = 32;
                    break;
                }
                case 166: {
                    n14 = 202;
                    break;
                }
                case 167: {
                    n14 = 106;
                    break;
                }
                case 168: {
                    n14 = 44;
                    break;
                }
                case 169: {
                    n14 = 122;
                    break;
                }
                case 170: {
                    n14 = 208;
                    break;
                }
                case 171: {
                    n14 = 169;
                    break;
                }
                case 172: {
                    n14 = 231;
                    break;
                }
                case 173: {
                    n14 = 21;
                    break;
                }
                case 174: {
                    n14 = 47;
                    break;
                }
                case 175: {
                    n14 = 160;
                    break;
                }
                case 176: {
                    n14 = 144;
                    break;
                }
                case 177: {
                    n14 = 245;
                    break;
                }
                case 178: {
                    n14 = 94;
                    break;
                }
                case 179: {
                    n14 = 203;
                    break;
                }
                case 180: {
                    n14 = 117;
                    break;
                }
                case 181: {
                    n14 = 74;
                    break;
                }
                case 182: {
                    n14 = 12;
                    break;
                }
                case 183: {
                    n14 = 154;
                    break;
                }
                case 184: {
                    n14 = 103;
                    break;
                }
                case 185: {
                    n14 = 119;
                    break;
                }
                case 186: {
                    n14 = 200;
                    break;
                }
                case 187: {
                    n14 = 8;
                    break;
                }
                case 188: {
                    n14 = 211;
                    break;
                }
                case 189: {
                    n14 = 105;
                    break;
                }
                case 190: {
                    n14 = 252;
                    break;
                }
                case 191: {
                    n14 = 51;
                    break;
                }
                case 192: {
                    n14 = 110;
                    break;
                }
                case 193: {
                    n14 = 186;
                    break;
                }
                case 194: {
                    n14 = 59;
                    break;
                }
                case 195: {
                    n14 = 241;
                    break;
                }
                case 196: {
                    n14 = 60;
                    break;
                }
                case 197: {
                    n14 = 41;
                    break;
                }
                case 198: {
                    n14 = 92;
                    break;
                }
                case 199: {
                    n14 = 193;
                    break;
                }
                case 200: {
                    n14 = 82;
                    break;
                }
                case 201: {
                    n14 = 121;
                    break;
                }
                case 202: {
                    n14 = 85;
                    break;
                }
                case 203: {
                    n14 = 243;
                    break;
                }
                case 204: {
                    n14 = 71;
                    break;
                }
                case 205: {
                    n14 = 237;
                    break;
                }
                case 206: {
                    n14 = 180;
                    break;
                }
                case 207: {
                    n14 = 36;
                    break;
                }
                case 208: {
                    n14 = 198;
                    break;
                }
                case 209: {
                    n14 = 254;
                    break;
                }
                case 210: {
                    n14 = 218;
                    break;
                }
                case 211: {
                    n14 = 152;
                    break;
                }
                case 212: {
                    n14 = 109;
                    break;
                }
                case 213: {
                    n14 = 83;
                    break;
                }
                case 214: {
                    n14 = 99;
                    break;
                }
                case 215: {
                    n14 = 181;
                    break;
                }
                case 216: {
                    n14 = 101;
                    break;
                }
                case 217: {
                    n14 = 171;
                    break;
                }
                case 218: {
                    n14 = 196;
                    break;
                }
                case 219: {
                    n14 = 151;
                    break;
                }
                case 220: {
                    n14 = 255;
                    break;
                }
                case 221: {
                    n14 = 86;
                    break;
                }
                case 222: {
                    n14 = 38;
                    break;
                }
                case 223: {
                    n14 = 166;
                    break;
                }
                case 224: {
                    n14 = 209;
                    break;
                }
                case 225: {
                    n14 = 224;
                    break;
                }
                case 226: {
                    n14 = 42;
                    break;
                }
                case 227: {
                    n14 = 27;
                    break;
                }
                case 228: {
                    n14 = 13;
                    break;
                }
                case 229: {
                    n14 = 69;
                    break;
                }
                case 230: {
                    n14 = 55;
                    break;
                }
                case 231: {
                    n14 = 153;
                    break;
                }
                case 232: {
                    n14 = 221;
                    break;
                }
                case 233: {
                    n14 = 26;
                    break;
                }
                case 234: {
                    n14 = 73;
                    break;
                }
                case 235: {
                    n14 = 191;
                    break;
                }
                case 236: {
                    n14 = 15;
                    break;
                }
                case 237: {
                    n14 = 118;
                    break;
                }
                case 238: {
                    n14 = 4;
                    break;
                }
                case 239: {
                    n14 = 5;
                    break;
                }
                case 240: {
                    n14 = 17;
                    break;
                }
                case 241: {
                    n14 = 58;
                    break;
                }
                case 242: {
                    n14 = 123;
                    break;
                }
                case 243: {
                    n14 = 116;
                    break;
                }
                case 244: {
                    n14 = 46;
                    break;
                }
                case 245: {
                    n14 = 220;
                    break;
                }
                case 246: {
                    n14 = 215;
                    break;
                }
                case 247: {
                    n14 = 130;
                    break;
                }
                case 248: {
                    n14 = 240;
                    break;
                }
                case 249: {
                    n14 = 10;
                    break;
                }
                case 250: {
                    n14 = 126;
                    break;
                }
                case 251: {
                    n14 = 214;
                    break;
                }
                case 252: {
                    n14 = 201;
                    break;
                }
                case 253: {
                    n14 = 68;
                    break;
                }
                case 254: {
                    n14 = 150;
                    break;
                }
                default: {
                    n14 = 97;
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
            ib_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xBD8;
        if (e[n11] == null) {
            ib_1.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x4A06) & Short.MAX_VALUE;
        if (g[n11] == null) {
            ib_1.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

