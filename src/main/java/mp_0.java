/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from mp
 */
public class mp_0
extends mW {
    private static int[] A;
    private InputStream j;
    private tr_2 p = new tr_2(DZ.CRC16);
    private boolean Z = false;
    private boolean H = true;
    private static String[] U;
    private static final long[] a;
    private static final Integer[] b;

    public mp_0(InputStream inputStream) {
        this.j = inputStream;
    }

    private boolean i(int n10) {
        String[] stringArray = mp_0.o();
        boolean bl = Arrays.binarySearch(A, n10);
        if (stringArray != null) {
            bl = bl >= false;
        }
        boolean bl2 = bl;
        return bl2;
    }

    private byte Z() throws IOException {
        int n10;
        while (true) {
            n10 = this.j.read();
            try {
                if (!this.i(n10)) break;
            }
            catch (IOException iOException) {
                throw mp_0.a(iOException);
            }
        }
        char c2 = (char)n10;
        return (byte)n10;
    }

    /*
     * Unable to fully structure code
     */
    public ub_0 G() throws IOException {
        block88: {
            var2_1 = kk_0.v(mp_0.a(18799, 8446551102877665149L));
            var3_2 = 1;
            var4_3 = gV.ESCAPE;
            var5_4 = -1;
            var1_5 = mp_0.o();
            var6_6 = 0;
            while (var3_2 != 0) {
                block107: {
                    block106: {
                        block104: {
                            block105: {
                                block102: {
                                    block103: {
                                        block100: {
                                            block101: {
                                                block92: {
                                                    block99: {
                                                        block96: {
                                                            block98: {
                                                                block97: {
                                                                    block95: {
                                                                        block93: {
                                                                            block91: {
                                                                                block89: {
                                                                                    block90: {
                                                                                        var7_7 = this.Z();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var1_5 == null) break block88;
                                                                                                        v0 = this.Z;
                                                                                                        if (var1_5 == null) break block89;
                                                                                                    }
                                                                                                    catch (IOException v1) {
                                                                                                        throw mp_0.a(v1);
                                                                                                    }
                                                                                                    if (v0 == 0) break block90;
                                                                                                }
                                                                                                catch (IOException v2) {
                                                                                                    throw mp_0.a(v2);
                                                                                                }
                                                                                                v0 = var7_7;
                                                                                                v3 = mp_0.a(31475, 119318289512477920L);
                                                                                                if (var1_5 == null) break block91;
                                                                                            }
                                                                                            catch (IOException v4) {
                                                                                                throw mp_0.a(v4);
                                                                                            }
                                                                                            if (v0 != v3) break block90;
                                                                                        }
                                                                                        catch (IOException v5) {
                                                                                            throw mp_0.a(v5);
                                                                                        }
                                                                                        var7_7 = this.Z();
                                                                                        try {
                                                                                            try {
                                                                                                v0 = var7_7;
                                                                                                v3 = mp_0.a(14070, 1743523885827913952L);
                                                                                                if (var1_5 == null) break block91;
                                                                                                if (v0 != v3) break block90;
                                                                                            }
                                                                                            catch (IOException v6) {
                                                                                                throw mp_0.a(v6);
                                                                                            }
                                                                                            return new um_0();
                                                                                        }
                                                                                        catch (IOException v7) {
                                                                                            throw mp_0.a(v7);
                                                                                        }
                                                                                    }
                                                                                    v0 = var7_7;
                                                                                }
                                                                                try {
                                                                                    if (var1_5 == null) break block92;
                                                                                    v3 = x9.ZDLE.r();
                                                                                }
                                                                                catch (IOException v8) {
                                                                                    throw mp_0.a(v8);
                                                                                }
                                                                            }
                                                                            if (v0 != v3) break block99;
                                                                            var7_7 = (byte)this.j.read();
                                                                            var8_9 = (char)var7_7;
                                                                            try {
                                                                                block94: {
                                                                                    try {
                                                                                        try {
                                                                                            v9 = var7_7;
                                                                                            if (var1_5 == null) break block93;
                                                                                            if (v9 != x9.ZDLE.r()) break block94;
                                                                                        }
                                                                                        catch (IOException v10) {
                                                                                            throw mp_0.a(v10);
                                                                                        }
                                                                                        var6_6 += 2;
                                                                                        if (var1_5 != null) break block95;
                                                                                    }
                                                                                    catch (IOException v11) {
                                                                                        throw mp_0.a(v11);
                                                                                    }
                                                                                }
                                                                                v9 = 0;
                                                                            }
                                                                            catch (IOException v12) {
                                                                                throw mp_0.a(v12);
                                                                            }
                                                                        }
                                                                        var6_6 = v9;
                                                                    }
                                                                    var9_10 = xP.g((byte)var7_7, this.H);
                                                                    try {
                                                                        try {
                                                                            if (var9_10.V() != gV.ESCAPE) {
                                                                                v13 = var5_4;
                                                                                if (var1_5 == null) break block96;
                                                                            }
                                                                            ** GOTO lbl118
                                                                        }
                                                                        catch (IOException v14) {
                                                                            throw mp_0.a(v14);
                                                                        }
                                                                        if (v13 < 0) {
                                                                        }
                                                                        ** GOTO lbl118
                                                                    }
                                                                    catch (IOException v15) {
                                                                        throw mp_0.a(v15);
                                                                    }
                                                                    var4_3 = var9_10.V();
                                                                    try {
                                                                        v16 = var9_10;
                                                                        if (var1_5 == null) break block97;
                                                                        if (v16.V() == gV.DATA) {
                                                                        }
                                                                        ** GOTO lbl108
                                                                    }
                                                                    catch (IOException v17) {
                                                                        throw mp_0.a(v17);
                                                                    }
                                                                    var5_4 = this.p.i();
                                                                    try {
                                                                        if (var1_5 != null) break block98;
lbl108:
                                                                        // 2 sources

                                                                        v16 = var9_10;
                                                                    }
                                                                    catch (IOException v18) {
                                                                        throw mp_0.a(v18);
                                                                    }
                                                                }
                                                                var5_4 = v16.C();
                                                            }
                                                            try {
                                                                this.p.x((byte)var7_7);
                                                                if (var1_5 != null) break block99;
lbl118:
                                                                // 3 sources

                                                                v13 = xP.c((byte)var7_7);
                                                            }
                                                            catch (IOException v19) {
                                                                throw mp_0.a(v19);
                                                            }
                                                        }
                                                        var7_7 = v13;
                                                    }
                                                    var2_1.c((byte)var7_7);
                                                    v0 = var5_4;
                                                }
                                                try {
                                                    try {
                                                        if (var1_5 == null) break block100;
                                                        if (v0 >= 0) break block101;
                                                    }
                                                    catch (IOException v20) {
                                                        throw mp_0.a(v20);
                                                    }
                                                    this.p.x((byte)var7_7);
                                                }
                                                catch (IOException v21) {
                                                    throw mp_0.a(v21);
                                                }
                                            }
                                            v0 = var5_4;
                                        }
                                        try {
                                            if (var1_5 == null) break block102;
                                            if (v0 != 0) break block103;
                                        }
                                        catch (IOException v22) {
                                            throw mp_0.a(v22);
                                        }
                                        var3_2 = 0;
                                    }
                                    v0 = var5_4;
                                }
                                try {
                                    if (var1_5 == null) break block104;
                                    if (v0 <= 0) break block105;
                                }
                                catch (IOException v23) {
                                    throw mp_0.a(v23);
                                }
                                --var5_4;
                            }
                            v0 = var6_6;
                        }
                        try {
                            try {
                                if (var1_5 == null) break block106;
                                if (v0 < 5) break block107;
                            }
                            catch (IOException v24) {
                                throw mp_0.a(v24);
                            }
                            v0 = 0;
                        }
                        catch (IOException v25) {
                            throw mp_0.a(v25);
                        }
                    }
                    var3_2 = v0;
                    var4_3 = gV.CANCEL;
                }
                if (var1_5 != null) continue;
            }
            var2_1.a();
        }
        var7_8 = null;
        switch (C0.k[var4_3.ordinal()]) {
            case 1: {
                var7_8 = uw_0.J(var2_1);
                try {
                    try {
                        if (var1_5 == null) ** GOTO lbl197
                        if (var7_8.f() == yu_2.BIN32) {
                        }
                        ** GOTO lbl199
                    }
                    catch (IOException v26) {
                        throw mp_0.a(v26);
                    }
                    this.p = new tr_2(DZ.CRC32);
                }
                catch (IOException v27) {
                    throw mp_0.a(v27);
                }
lbl197:
                // 2 sources

                try {
                    if (var1_5 != null) ** GOTO lbl204
lbl199:
                    // 2 sources

                    this.p = new tr_2(DZ.CRC16);
                }
                catch (IOException v28) {
                    throw mp_0.a(v28);
                }
lbl204:
                // 2 sources

                try {
                    try {
                        v29 = var7_8.h();
                        v30 = x9.ZFIN;
                        if (var1_5 == null) ** GOTO lbl220
                        if (v29 == v30) {
                        }
                        ** GOTO lbl218
                    }
                    catch (IOException v31) {
                        throw mp_0.a(v31);
                    }
                    this.Z = true;
                }
                catch (IOException v32) {
                    throw mp_0.a(v32);
                }
lbl218:
                // 2 sources

                v29 = ((uw_0)var7_8).h();
                v30 = x9.ZDATA;
lbl220:
                // 2 sources

                try {
                    try {
                        try {
                            if (var1_5 == null) ** GOTO lbl239
                            if (v29 != v30) {
                            }
                            ** GOTO lbl241
                        }
                        catch (IOException v33) {
                            throw mp_0.a(v33);
                        }
                        v34 = (uw_0)var7_8;
                        if (var1_5 == null) break;
                    }
                    catch (IOException v35) {
                        throw mp_0.a(v35);
                    }
                    v29 = v34.h();
                    v30 = x9.ZFILE;
                }
                catch (IOException v36) {
                    throw mp_0.a(v36);
                }
lbl239:
                // 2 sources

                try {
                    if (v29 != v30) ** GOTO lbl272
lbl241:
                    // 2 sources

                    this.H = false;
                    ** GOTO lbl272
                }
                catch (IOException v37) {
                    throw mp_0.a(v37);
                }
            }
            case 2: {
                this.p.finalize();
                var7_8 = UK.v(var2_1, this.p);
                try {
                    try {
                        try {
                            this.p = new tr_2(this.p.y());
                            if (var1_5 == null) ** GOTO lbl272
                            if (((UK)var7_8).e() == x9.ZCRCG) {
                            }
                            ** GOTO lbl265
                        }
                        catch (IOException v38) {
                            throw mp_0.a(v38);
                        }
                        this.H = false;
                        if (var1_5 == null) {
                        }
                        ** GOTO lbl272
                    }
                    catch (IOException v39) {
                        throw mp_0.a(v39);
                    }
lbl265:
                    // 2 sources

                    this.H = true;
                    ** GOTO lbl272
                }
                catch (IOException v40) {
                    throw mp_0.a(v40);
                }
            }
            case 3: {
                var7_8 = new ut_0();
                this.p = new tr_2(this.p.y());
            }
lbl272:
            // 7 sources

            default: {
                v34 = var7_8;
            }
        }
        try {
            if (ky_2.F() != null) {
                mp_0.T(new String[3]);
            }
        }
        catch (IOException v41) {
            throw mp_0.a(v41);
        }
        return v34;
    }

    @Override
    public Object Z() throws IOException {
        return this.G();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3556322743778078676L;
                var6_1 = new long[7];
                mp_0.T(new String[2]);
                var3_2 = 0;
                var4_3 = "%\u0086J9\u00e9\u00a6\u0097{\u00ab\u00a2p?.\u00b4p\u00a9\u00da7Se\u00b9\u00fd\u00a8\u008c\u0096&\u00b4F\u00bb$\u009f\u001d\u00d0\u009cK\u00b9\u0089\u00bd\u00f8\u00a9";
                var5_4 = "%\u0086J9\u00e9\u00a6\u0097{\u00ab\u00a2p?.\u00b4p\u00a9\u00da7Se\u00b9\u00fd\u00a8\u008c\u0096&\u00b4F\u00bb$\u009f\u001d\u00d0\u009cK\u00b9\u0089\u00bd\u00f8\u00a9".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl15:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "qad\u0016\\\u0011\u00db{\u008e\u00fd\u0016\u00a2\u0005\u00bc\bd";
                    var5_4 = "qad\u0016\\\u0011\u00db{\u008e\u00fd\u0016\u00a2\u0005\u00bc\bd".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl39:
                // 1 sources

                ** continue;
            }
        }
        mp_0.a = var6_1;
        mp_0.b = new Integer[7];
        mp_0.A = new int[]{mp_0.a(10673, 2641214239820539809L), mp_0.a(20857, 453810510861475694L), mp_0.a(2525, 6345260218187073481L), mp_0.a(15951, 691144332357169242L)};
    }

    public static void T(String[] stringArray) {
        U = stringArray;
    }

    public static String[] o() {
        return U;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4E16;
        if (b[n11] == null) {
            mp_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

