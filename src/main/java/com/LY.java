/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dc_0;
import com.pv_2;
import com.sd_0;
import com.y4_0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LY {
    private int x = 0;
    private int[] t;
    private char I;
    private ArrayList j;
    private boolean a = false;
    private boolean P = false;
    private final StringBuilder G = new StringBuilder();
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;

    LY(y4_0 y4_02) throws IOException {
        this.t = new int[5];
        this.v(y4_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void v(y4_0 var1_1) throws IOException {
        this.x = 0;
        var3_2 = 0;
        var4_3 = 0;
        var2_4 = pv_2.r();
        var5_5 = -1;
        do {
            block74: {
                block72: {
                    block71: {
                        block67: {
                            block69: {
                                block70: {
                                    block68: {
                                        block64: {
                                            block66: {
                                                block62: {
                                                    var6_6 = var1_1.C();
                                                    this.G.append(var6_6);
                                                    ++var5_5;
                                                    if (var6_6 != LY.a(8923, 3749490279074827177L)) ** GOTO lbl30
                                                    try {
                                                        block63: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = var5_5;
                                                                        if (var2_4 != null || var2_4 != null) break block62;
                                                                    }
                                                                    catch (IOException v1) {
                                                                        throw LY.a(v1);
                                                                    }
                                                                    if (v0 != 0) break block63;
                                                                }
                                                                catch (IOException v2) {
                                                                    throw LY.a(v2);
                                                                }
                                                                this.a = true;
                                                                if (var2_4 == null) continue;
                                                            }
                                                            catch (IOException v3) {
                                                                throw LY.a(v3);
                                                            }
                                                        }
                                                        v0 = var6_6;
                                                    }
                                                    catch (IOException v4) {
                                                        throw LY.a(v4);
                                                    }
                                                }
                                                try {
                                                    block65: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v5 = LY.a(31865, 3524648769106924810L);
                                                                        if (var2_4 != null) break block64;
                                                                        if (v0 != v5) break block65;
                                                                    }
                                                                    catch (IOException v6) {
                                                                        throw LY.a(v6);
                                                                    }
                                                                    v0 = var5_5;
                                                                    if (var2_4 != null) break block66;
                                                                }
                                                                catch (IOException v7) {
                                                                    throw LY.a(v7);
                                                                }
                                                                if (v0 != 0) break block65;
                                                            }
                                                            catch (IOException v8) {
                                                                throw LY.a(v8);
                                                            }
                                                            this.P = true;
                                                            if (var2_4 == null) continue;
                                                        }
                                                        catch (IOException v9) {
                                                            throw LY.a(v9);
                                                        }
                                                    }
                                                    v0 = var6_6;
                                                }
                                                catch (IOException v10) {
                                                    throw LY.a(v10);
                                                }
                                            }
                                            v5 = LY.a(6009, 4849407136697925124L);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var2_4 != null) break block67;
                                                        if (v0 == v5) {
                                                        }
                                                        ** GOTO lbl109
                                                    }
                                                    catch (IOException v11) {
                                                        throw LY.a(v11);
                                                    }
                                                    v12 = var3_2;
                                                    if (var2_4 != null) break block68;
                                                }
                                                catch (IOException v13) {
                                                    throw LY.a(v13);
                                                }
                                                if (v12 <= 0) continue;
                                            }
                                            catch (IOException v14) {
                                                throw LY.a(v14);
                                            }
                                            v12 = ++this.x;
                                        }
                                        catch (IOException v15) {
                                            throw LY.a(v15);
                                        }
                                    }
                                    try {
                                        if (var2_4 != null) break block69;
                                        if (v12 != this.t.length) break block70;
                                    }
                                    catch (IOException v16) {
                                        throw LY.a(v16);
                                    }
                                    var7_7 = new int[this.t.length * 2];
                                    System.arraycopy(this.t, 0, var7_7, 0, this.t.length);
                                    this.t = var7_7;
                                }
                                this.t[this.x] = 0;
                                v12 = 0;
                            }
                            var3_2 = v12;
                            try {
                                if (var2_4 == null) continue;
lbl109:
                                // 2 sources

                                v0 = LY.a(4990, 7312599300505614859L);
                                v5 = var6_6;
                            }
                            catch (IOException v17) {
                                throw LY.a(v17);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var2_4 != null) break block71;
                                    if (v0 <= v5) {
                                    }
                                    ** GOTO lbl140
                                }
                                catch (IOException v18) {
                                    throw LY.a(v18);
                                }
                                v0 = var6_6;
                                v5 = LY.a(31626, 2864821236645876477L);
                                if (var2_4 != null) break block71;
                            }
                            catch (IOException v19) {
                                throw LY.a(v19);
                            }
                            if (v0 <= v5) {
                            }
                            ** GOTO lbl140
                        }
                        catch (IOException v20) {
                            throw LY.a(v20);
                        }
                        this.t[this.x] = this.t[this.x] * LY.a(26534, 1427044044393205462L) + var6_6 - LY.a(32362, 4560277042066839315L);
                        ++var3_2;
                        var4_3 = 1;
                        try {
                            if (var2_4 == null) continue;
lbl140:
                            // 3 sources

                            v0 = LY.a(11844, 1600636455380092730L);
                            v5 = var6_6;
                        }
                        catch (IOException v21) {
                            throw LY.a(v21);
                        }
                    }
                    try {
                        block73: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var2_4 != null) break block72;
                                            if (v0 > v5) break block73;
                                        }
                                        catch (IOException v22) {
                                            throw LY.a(v22);
                                        }
                                        v0 = var6_6;
                                        v5 = LY.a(8106, 7087231498955405020L);
                                        if (var2_4 != null) break block72;
                                    }
                                    catch (IOException v23) {
                                        throw LY.a(v23);
                                    }
                                    if (v0 > v5) break block73;
                                }
                                catch (IOException v24) {
                                    throw LY.a(v24);
                                }
                                this.I(var6_6);
                                if (var2_4 == null) continue;
                            }
                            catch (IOException v25) {
                                throw LY.a(v25);
                            }
                        }
                        v0 = LY.a(31091, 1598051738249351175L);
                        v5 = var6_6;
                    }
                    catch (IOException v26) {
                        throw LY.a(v26);
                    }
                }
                try {
                    try {
                        if (var2_4 != null) break block74;
                        if (v0 <= v5) {
                        }
                        ** GOTO lbl200
                    }
                    catch (IOException v27) {
                        throw LY.a(v27);
                    }
                    v0 = var6_6;
                    v5 = LY.a(17406, 2017591533633858191L);
                }
                catch (IOException v28) {
                    throw LY.a(v28);
                }
            }
            try {
                try {
                    if (v0 <= v5) {
                        this.I = var6_6;
                        if (var2_4 == null) break;
                    }
                }
                catch (IOException v29) {
                    throw LY.a(v29);
                }
lbl200:
                // 2 sources

                this.I(var6_6);
            }
            catch (IOException v30) {
                throw LY.a(v30);
            }
        } while (var2_4 == null);
        this.x += var4_3;
    }

    private void I(char c2) {
        String string = pv_2.r();
        ArrayList arrayList = this.j;
        if (string == null) {
            if (arrayList == null) {
                this.j = new ArrayList();
            }
            arrayList = this.j;
        }
        arrayList.add(Character.valueOf(c2));
    }

    public boolean q(y4_0 y4_02) throws IOException {
        int n10;
        block31: {
            int n11;
            int n12;
            char[] cArray;
            String string;
            block29: {
                int n13;
                block30: {
                    block27: {
                        block28: {
                            block26: {
                                string = pv_2.r();
                                try {
                                    if (this.j == null) {
                                        return false;
                                    }
                                }
                                catch (IOException iOException) {
                                    throw LY.a(iOException);
                                }
                                cArray = new char[LY.a(13896, 5476812939393507124L)];
                                n12 = 0;
                                Iterator iterator = this.j.iterator();
                                while (iterator.hasNext()) {
                                    char c2 = ((Character)iterator.next()).charValue();
                                    try {
                                        cArray[n12++] = c2;
                                        if (string == null) {
                                            if (string == null) continue;
                                            break;
                                        }
                                        break block26;
                                    }
                                    catch (IOException iOException) {
                                        throw LY.a(iOException);
                                    }
                                }
                                cArray[n12++] = LY.a(21524, 4837511606043606382L);
                                cArray[n12++] = LY.a(619, 3279952298483297040L);
                            }
                            try {
                                try {
                                    n13 = this.a;
                                    if (string != null) break block27;
                                    if (n13 == 0) break block28;
                                }
                                catch (IOException iOException) {
                                    throw LY.a(iOException);
                                }
                                cArray[n12++] = LY.a(8106, 7087231498955405020L);
                            }
                            catch (IOException iOException) {
                                throw LY.a(iOException);
                            }
                        }
                        n13 = this.P;
                    }
                    try {
                        try {
                            if (string != null) break block29;
                            if (n13 == 0) break block30;
                        }
                        catch (IOException iOException) {
                            throw LY.a(iOException);
                        }
                        cArray[n12++] = LY.a(18016, 2845729727191674648L);
                    }
                    catch (IOException iOException) {
                        throw LY.a(iOException);
                    }
                }
                n13 = n11 = 0;
            }
            while (n11 < this.x) {
                block34: {
                    int n14;
                    block32: {
                        block33: {
                            try {
                                try {
                                    try {
                                        n10 = n11;
                                        if (string != null) break block31;
                                        if (string != null) break block32;
                                    }
                                    catch (IOException iOException) {
                                        throw LY.a(iOException);
                                    }
                                    if (n10 == 0) break block33;
                                }
                                catch (IOException iOException) {
                                    throw LY.a(iOException);
                                }
                                cArray[n12++] = LY.a(10651, 208800221344661732L);
                            }
                            catch (IOException iOException) {
                                throw LY.a(iOException);
                            }
                        }
                        n14 = this.t[n11];
                    }
                    String string2 = Integer.toString(n14);
                    for (int i2 = 0; i2 < string2.length(); ++i2) {
                        try {
                            cArray[n12++] = string2.charAt(i2);
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block34;
                        }
                        catch (IOException iOException) {
                            throw LY.a(iOException);
                        }
                    }
                    ++n11;
                }
                if (string == null) continue;
            }
            cArray[n12++] = this.I;
            y4_02.h(cArray, n12);
            n10 = 1;
        }
        return n10 != 0;
    }

    int a() {
        return this.x;
    }

    final int Q(int n10, int n11) {
        String string = pv_2.r();
        int n12 = n10;
        if (string == null) {
            if (n12 >= this.x) {
                return n11;
            }
            n12 = this.t[n10];
        }
        return n12;
    }

    private void p(StringBuilder stringBuilder) {
        block12: {
            String string;
            block11: {
                block10: {
                    String string2 = pv_2.r();
                    stringBuilder.append(LY.a(310, 21811));
                    string = string2;
                    boolean bl = this.a;
                    if (string == null) {
                        if (bl) {
                            stringBuilder.append("?");
                        }
                        bl = this.P;
                    }
                    if (bl) {
                        stringBuilder.append(">");
                    }
                    String string3 = "";
                    for (int i2 = 0; i2 < this.x; ++i2) {
                        stringBuilder.append(string3);
                        stringBuilder.append(this.t[i2]);
                        string3 = ";";
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block10;
                    }
                    stringBuilder.append(this.I);
                }
                if (string != null) break block11;
                if (this.j == null) break block12;
                stringBuilder.append(LY.a(308, 31663));
            }
            dc_0 dc_02 = dc_0.NONE;
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                char c2 = ((Character)iterator.next()).charValue();
                dc_02 = sd_0.Q(stringBuilder, dc_02, c2);
                if (string == null) continue;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.p(stringBuilder);
        return stringBuilder.toString();
    }

    public char R() {
        return this.I;
    }

    public boolean u() {
        return this.a;
    }

    public boolean c() {
        return this.P;
    }

    @NotNull
    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(LY.a(309, 17228));
        this.p(stringBuilder);
        stringBuilder.append(LY.a(311, -30046));
        stringBuilder.append((CharSequence)this.G);
        return stringBuilder.toString();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "\u008f\u0088V\u008d\u000bQB\u00f8\u00f3O\u001d\u00a9\u0094\u007f5s";
                        var12_3 = "\u008f\u0088V\u008d\u000bQB\u00f8\u00f3O\u001d\u00a9\u0094\u007f5s".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 39;
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
                            var10_2 = "\u008d\u0093^\u00b7\u00beE\u00ab\u00c4i\u00b8\u008c\bkD\u00c4\u00e4v]h\u00c0";
                            var12_3 = "\u008d\u0093^\u00b7\u00beE\u00ab\u00c4i\u00b8\u008c\bkD\u00c4\u00e4v]h\u00c0".length();
                            var9_4 = 11;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 42;
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
                                    v15 = 110;
                                    break;
                                }
                                case 1: {
                                    v15 = 89;
                                    break;
                                }
                                case 2: {
                                    v15 = 7;
                                    break;
                                }
                                case 3: {
                                    v15 = 22;
                                    break;
                                }
                                case 4: {
                                    v15 = 56;
                                    break;
                                }
                                case 5: {
                                    v15 = 21;
                                    break;
                                }
                                default: {
                                    v15 = 61;
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
                LY.b = var13;
                LY.c = new String[4];
                var0_7 = 3769862117433599776L;
                var6_8 = new long[16];
                var3_9 = 0;
                var4_10 = "\u00ceCn\u0084\u00a7\u0091g\u00ff\u00cb\u00d4$\u00d8`\u00ac` \u0006\u00f6\u00ce\u00bf\u00b3\u00cbY\u001f\u00c0\u00f1\fx\u0090\u0004\u00fc\u0014i\u00fd\u0092\u00c0\u0086\u0086Lk/\u00d1\u00e3f\u00a2\u00da\u001aUcR\u00b7\u00bc\u00b8\u0017\u00b0\u0003\u008c\u008b\u0095\u00bfE\u00d3\u0088\u0006\u00bf\u0005\u000e\u00cb2\u00915\u00e4h\u00d9`\u0003\u00e9\u00e6\u00d1\u00c3\u0017p6\\\u00a2\u00bc\u00dd\u001b\u0099\u00a0L\u0082\u0086\u00d8\u00b7g\u00c4=]{\u00d9v2\u0014\u009e9\u008f\u0002D\u00dd\u00ec\u00b6";
                var5_11 = "\u00ceCn\u0084\u00a7\u0091g\u00ff\u00cb\u00d4$\u00d8`\u00ac` \u0006\u00f6\u00ce\u00bf\u00b3\u00cbY\u001f\u00c0\u00f1\fx\u0090\u0004\u00fc\u0014i\u00fd\u0092\u00c0\u0086\u0086Lk/\u00d1\u00e3f\u00a2\u00da\u001aUcR\u00b7\u00bc\u00b8\u0017\u00b0\u0003\u008c\u008b\u0095\u00bfE\u00d3\u0088\u0006\u00bf\u0005\u000e\u00cb2\u00915\u00e4h\u00d9`\u0003\u00e9\u00e6\u00d1\u00c3\u0017p6\\\u00a2\u00bc\u00dd\u001b\u0099\u00a0L\u0082\u0086\u00d8\u00b7g\u00c4=]{\u00d9v2\u0014\u009e9\u008f\u0002D\u00dd\u00ec\u00b6".length();
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
                    var4_10 = "\u0095j\u00b6N!\u00c0\r\u00d1\u0003\u00e4\u00d8\u00ab)0)\u00fc";
                    var5_11 = "\u0095j\u00b6N!\u00c0\r\u00d1\u0003\u00e4\u00d8\u00ab)0)\u00fc".length();
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
        LY.d = var6_8;
        LY.e = new Integer[16];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x136) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 255;
                    break;
                }
                case 1: {
                    n14 = 49;
                    break;
                }
                case 2: {
                    n14 = 43;
                    break;
                }
                case 3: {
                    n14 = 100;
                    break;
                }
                case 4: {
                    n14 = 161;
                    break;
                }
                case 5: {
                    n14 = 151;
                    break;
                }
                case 6: {
                    n14 = 23;
                    break;
                }
                case 7: {
                    n14 = 122;
                    break;
                }
                case 8: {
                    n14 = 201;
                    break;
                }
                case 9: {
                    n14 = 80;
                    break;
                }
                case 10: {
                    n14 = 85;
                    break;
                }
                case 11: {
                    n14 = 119;
                    break;
                }
                case 12: {
                    n14 = 162;
                    break;
                }
                case 13: {
                    n14 = 197;
                    break;
                }
                case 14: {
                    n14 = 107;
                    break;
                }
                case 15: {
                    n14 = 190;
                    break;
                }
                case 16: {
                    n14 = 81;
                    break;
                }
                case 17: {
                    n14 = 225;
                    break;
                }
                case 18: {
                    n14 = 233;
                    break;
                }
                case 19: {
                    n14 = 126;
                    break;
                }
                case 20: {
                    n14 = 69;
                    break;
                }
                case 21: {
                    n14 = 114;
                    break;
                }
                case 22: {
                    n14 = 184;
                    break;
                }
                case 23: {
                    n14 = 27;
                    break;
                }
                case 24: {
                    n14 = 110;
                    break;
                }
                case 25: {
                    n14 = 117;
                    break;
                }
                case 26: {
                    n14 = 105;
                    break;
                }
                case 27: {
                    n14 = 18;
                    break;
                }
                case 28: {
                    n14 = 64;
                    break;
                }
                case 29: {
                    n14 = 221;
                    break;
                }
                case 30: {
                    n14 = 223;
                    break;
                }
                case 31: {
                    n14 = 53;
                    break;
                }
                case 32: {
                    n14 = 224;
                    break;
                }
                case 33: {
                    n14 = 2;
                    break;
                }
                case 34: {
                    n14 = 62;
                    break;
                }
                case 35: {
                    n14 = 180;
                    break;
                }
                case 36: {
                    n14 = 195;
                    break;
                }
                case 37: {
                    n14 = 199;
                    break;
                }
                case 38: {
                    n14 = 163;
                    break;
                }
                case 39: {
                    n14 = 89;
                    break;
                }
                case 40: {
                    n14 = 21;
                    break;
                }
                case 41: {
                    n14 = 57;
                    break;
                }
                case 42: {
                    n14 = 236;
                    break;
                }
                case 43: {
                    n14 = 238;
                    break;
                }
                case 44: {
                    n14 = 170;
                    break;
                }
                case 45: {
                    n14 = 47;
                    break;
                }
                case 46: {
                    n14 = 130;
                    break;
                }
                case 47: {
                    n14 = 237;
                    break;
                }
                case 48: {
                    n14 = 59;
                    break;
                }
                case 49: {
                    n14 = 92;
                    break;
                }
                case 50: {
                    n14 = 13;
                    break;
                }
                case 51: {
                    n14 = 179;
                    break;
                }
                case 52: {
                    n14 = 253;
                    break;
                }
                case 53: {
                    n14 = 37;
                    break;
                }
                case 54: {
                    n14 = 133;
                    break;
                }
                case 55: {
                    n14 = 189;
                    break;
                }
                case 56: {
                    n14 = 173;
                    break;
                }
                case 57: {
                    n14 = 32;
                    break;
                }
                case 58: {
                    n14 = 91;
                    break;
                }
                case 59: {
                    n14 = 48;
                    break;
                }
                case 60: {
                    n14 = 245;
                    break;
                }
                case 61: {
                    n14 = 229;
                    break;
                }
                case 62: {
                    n14 = 128;
                    break;
                }
                case 63: {
                    n14 = 120;
                    break;
                }
                case 64: {
                    n14 = 209;
                    break;
                }
                case 65: {
                    n14 = 228;
                    break;
                }
                case 66: {
                    n14 = 61;
                    break;
                }
                case 67: {
                    n14 = 220;
                    break;
                }
                case 68: {
                    n14 = 63;
                    break;
                }
                case 69: {
                    n14 = 207;
                    break;
                }
                case 70: {
                    n14 = 24;
                    break;
                }
                case 71: {
                    n14 = 144;
                    break;
                }
                case 72: {
                    n14 = 234;
                    break;
                }
                case 73: {
                    n14 = 67;
                    break;
                }
                case 74: {
                    n14 = 214;
                    break;
                }
                case 75: {
                    n14 = 138;
                    break;
                }
                case 76: {
                    n14 = 50;
                    break;
                }
                case 77: {
                    n14 = 82;
                    break;
                }
                case 78: {
                    n14 = 158;
                    break;
                }
                case 79: {
                    n14 = 99;
                    break;
                }
                case 80: {
                    n14 = 205;
                    break;
                }
                case 81: {
                    n14 = 213;
                    break;
                }
                case 82: {
                    n14 = 203;
                    break;
                }
                case 83: {
                    n14 = 231;
                    break;
                }
                case 84: {
                    n14 = 208;
                    break;
                }
                case 85: {
                    n14 = 19;
                    break;
                }
                case 86: {
                    n14 = 97;
                    break;
                }
                case 87: {
                    n14 = 215;
                    break;
                }
                case 88: {
                    n14 = 35;
                    break;
                }
                case 89: {
                    n14 = 108;
                    break;
                }
                case 90: {
                    n14 = 87;
                    break;
                }
                case 91: {
                    n14 = 60;
                    break;
                }
                case 92: {
                    n14 = 149;
                    break;
                }
                case 93: {
                    n14 = 230;
                    break;
                }
                case 94: {
                    n14 = 121;
                    break;
                }
                case 95: {
                    n14 = 235;
                    break;
                }
                case 96: {
                    n14 = 102;
                    break;
                }
                case 97: {
                    n14 = 248;
                    break;
                }
                case 98: {
                    n14 = 216;
                    break;
                }
                case 99: {
                    n14 = 33;
                    break;
                }
                case 100: {
                    n14 = 111;
                    break;
                }
                case 101: {
                    n14 = 115;
                    break;
                }
                case 102: {
                    n14 = 137;
                    break;
                }
                case 103: {
                    n14 = 152;
                    break;
                }
                case 104: {
                    n14 = 104;
                    break;
                }
                case 105: {
                    n14 = 150;
                    break;
                }
                case 106: {
                    n14 = 250;
                    break;
                }
                case 107: {
                    n14 = 25;
                    break;
                }
                case 108: {
                    n14 = 112;
                    break;
                }
                case 109: {
                    n14 = 95;
                    break;
                }
                case 110: {
                    n14 = 182;
                    break;
                }
                case 111: {
                    n14 = 56;
                    break;
                }
                case 112: {
                    n14 = 206;
                    break;
                }
                case 113: {
                    n14 = 3;
                    break;
                }
                case 114: {
                    n14 = 125;
                    break;
                }
                case 115: {
                    n14 = 31;
                    break;
                }
                case 116: {
                    n14 = 10;
                    break;
                }
                case 117: {
                    n14 = 39;
                    break;
                }
                case 118: {
                    n14 = 93;
                    break;
                }
                case 119: {
                    n14 = 42;
                    break;
                }
                case 120: {
                    n14 = 51;
                    break;
                }
                case 121: {
                    n14 = 79;
                    break;
                }
                case 122: {
                    n14 = 11;
                    break;
                }
                case 123: {
                    n14 = 36;
                    break;
                }
                case 124: {
                    n14 = 148;
                    break;
                }
                case 125: {
                    n14 = 45;
                    break;
                }
                case 126: {
                    n14 = 143;
                    break;
                }
                case 127: {
                    n14 = 4;
                    break;
                }
                case 128: {
                    n14 = 249;
                    break;
                }
                case 129: {
                    n14 = 140;
                    break;
                }
                case 130: {
                    n14 = 185;
                    break;
                }
                case 131: {
                    n14 = 165;
                    break;
                }
                case 132: {
                    n14 = 65;
                    break;
                }
                case 133: {
                    n14 = 135;
                    break;
                }
                case 134: {
                    n14 = 193;
                    break;
                }
                case 135: {
                    n14 = 146;
                    break;
                }
                case 136: {
                    n14 = 40;
                    break;
                }
                case 137: {
                    n14 = 83;
                    break;
                }
                case 138: {
                    n14 = 28;
                    break;
                }
                case 139: {
                    n14 = 29;
                    break;
                }
                case 140: {
                    n14 = 217;
                    break;
                }
                case 141: {
                    n14 = 204;
                    break;
                }
                case 142: {
                    n14 = 188;
                    break;
                }
                case 143: {
                    n14 = 181;
                    break;
                }
                case 144: {
                    n14 = 5;
                    break;
                }
                case 145: {
                    n14 = 251;
                    break;
                }
                case 146: {
                    n14 = 66;
                    break;
                }
                case 147: {
                    n14 = 136;
                    break;
                }
                case 148: {
                    n14 = 6;
                    break;
                }
                case 149: {
                    n14 = 86;
                    break;
                }
                case 150: {
                    n14 = 139;
                    break;
                }
                case 151: {
                    n14 = 101;
                    break;
                }
                case 152: {
                    n14 = 222;
                    break;
                }
                case 153: {
                    n14 = 94;
                    break;
                }
                case 154: {
                    n14 = 90;
                    break;
                }
                case 155: {
                    n14 = 192;
                    break;
                }
                case 156: {
                    n14 = 142;
                    break;
                }
                case 157: {
                    n14 = 118;
                    break;
                }
                case 158: {
                    n14 = 52;
                    break;
                }
                case 159: {
                    n14 = 38;
                    break;
                }
                case 160: {
                    n14 = 132;
                    break;
                }
                case 161: {
                    n14 = 46;
                    break;
                }
                case 162: {
                    n14 = 16;
                    break;
                }
                case 163: {
                    n14 = 15;
                    break;
                }
                case 164: {
                    n14 = 160;
                    break;
                }
                case 165: {
                    n14 = 12;
                    break;
                }
                case 166: {
                    n14 = 26;
                    break;
                }
                case 167: {
                    n14 = 241;
                    break;
                }
                case 168: {
                    n14 = 8;
                    break;
                }
                case 169: {
                    n14 = 1;
                    break;
                }
                case 170: {
                    n14 = 175;
                    break;
                }
                case 171: {
                    n14 = 9;
                    break;
                }
                case 172: {
                    n14 = 109;
                    break;
                }
                case 173: {
                    n14 = 153;
                    break;
                }
                case 174: {
                    n14 = 72;
                    break;
                }
                case 175: {
                    n14 = 187;
                    break;
                }
                case 176: {
                    n14 = 76;
                    break;
                }
                case 177: {
                    n14 = 183;
                    break;
                }
                case 178: {
                    n14 = 41;
                    break;
                }
                case 179: {
                    n14 = 194;
                    break;
                }
                case 180: {
                    n14 = 134;
                    break;
                }
                case 181: {
                    n14 = 131;
                    break;
                }
                case 182: {
                    n14 = 242;
                    break;
                }
                case 183: {
                    n14 = 212;
                    break;
                }
                case 184: {
                    n14 = 178;
                    break;
                }
                case 185: {
                    n14 = 22;
                    break;
                }
                case 186: {
                    n14 = 20;
                    break;
                }
                case 187: {
                    n14 = 247;
                    break;
                }
                case 188: {
                    n14 = 159;
                    break;
                }
                case 189: {
                    n14 = 58;
                    break;
                }
                case 190: {
                    n14 = 177;
                    break;
                }
                case 191: {
                    n14 = 169;
                    break;
                }
                case 192: {
                    n14 = 164;
                    break;
                }
                case 193: {
                    n14 = 106;
                    break;
                }
                case 194: {
                    n14 = 240;
                    break;
                }
                case 195: {
                    n14 = 127;
                    break;
                }
                case 196: {
                    n14 = 75;
                    break;
                }
                case 197: {
                    n14 = 227;
                    break;
                }
                case 198: {
                    n14 = 176;
                    break;
                }
                case 199: {
                    n14 = 124;
                    break;
                }
                case 200: {
                    n14 = 7;
                    break;
                }
                case 201: {
                    n14 = 198;
                    break;
                }
                case 202: {
                    n14 = 232;
                    break;
                }
                case 203: {
                    n14 = 71;
                    break;
                }
                case 204: {
                    n14 = 171;
                    break;
                }
                case 205: {
                    n14 = 219;
                    break;
                }
                case 206: {
                    n14 = 78;
                    break;
                }
                case 207: {
                    n14 = 77;
                    break;
                }
                case 208: {
                    n14 = 239;
                    break;
                }
                case 209: {
                    n14 = 166;
                    break;
                }
                case 210: {
                    n14 = 200;
                    break;
                }
                case 211: {
                    n14 = 0;
                    break;
                }
                case 212: {
                    n14 = 191;
                    break;
                }
                case 213: {
                    n14 = 156;
                    break;
                }
                case 214: {
                    n14 = 30;
                    break;
                }
                case 215: {
                    n14 = 244;
                    break;
                }
                case 216: {
                    n14 = 174;
                    break;
                }
                case 217: {
                    n14 = 17;
                    break;
                }
                case 218: {
                    n14 = 246;
                    break;
                }
                case 219: {
                    n14 = 211;
                    break;
                }
                case 220: {
                    n14 = 116;
                    break;
                }
                case 221: {
                    n14 = 186;
                    break;
                }
                case 222: {
                    n14 = 44;
                    break;
                }
                case 223: {
                    n14 = 70;
                    break;
                }
                case 224: {
                    n14 = 34;
                    break;
                }
                case 225: {
                    n14 = 113;
                    break;
                }
                case 226: {
                    n14 = 243;
                    break;
                }
                case 227: {
                    n14 = 14;
                    break;
                }
                case 228: {
                    n14 = 129;
                    break;
                }
                case 229: {
                    n14 = 84;
                    break;
                }
                case 230: {
                    n14 = 96;
                    break;
                }
                case 231: {
                    n14 = 88;
                    break;
                }
                case 232: {
                    n14 = 254;
                    break;
                }
                case 233: {
                    n14 = 68;
                    break;
                }
                case 234: {
                    n14 = 55;
                    break;
                }
                case 235: {
                    n14 = 123;
                    break;
                }
                case 236: {
                    n14 = 226;
                    break;
                }
                case 237: {
                    n14 = 252;
                    break;
                }
                case 238: {
                    n14 = 73;
                    break;
                }
                case 239: {
                    n14 = 98;
                    break;
                }
                case 240: {
                    n14 = 147;
                    break;
                }
                case 241: {
                    n14 = 54;
                    break;
                }
                case 242: {
                    n14 = 154;
                    break;
                }
                case 243: {
                    n14 = 145;
                    break;
                }
                case 244: {
                    n14 = 141;
                    break;
                }
                case 245: {
                    n14 = 155;
                    break;
                }
                case 246: {
                    n14 = 196;
                    break;
                }
                case 247: {
                    n14 = 168;
                    break;
                }
                case 248: {
                    n14 = 167;
                    break;
                }
                case 249: {
                    n14 = 202;
                    break;
                }
                case 250: {
                    n14 = 103;
                    break;
                }
                case 251: {
                    n14 = 157;
                    break;
                }
                case 252: {
                    n14 = 172;
                    break;
                }
                case 253: {
                    n14 = 218;
                    break;
                }
                case 254: {
                    n14 = 74;
                    break;
                }
                default: {
                    n14 = 210;
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
            LY.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x297F;
        if (e[n11] == null) {
            LY.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

