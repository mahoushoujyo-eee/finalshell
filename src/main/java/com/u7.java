/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S7;
import com.hi_0;
import com.o1_0;
import com.ok_0;
import com.u9;
import com.yn_2;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.MathContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class u7
extends u9 {
    private static final ThreadLocal w;
    private Reader r;
    private char[] m;
    private int Q;
    private static final String[] f;
    private static final String[] g;
    private static final long[] k;
    private static final Integer[] o;

    public u7(String string) {
        this(string, ok_0.h);
    }

    public u7(String string, int n10) {
        this(new StringReader(string), n10);
    }

    public u7(char[] cArray, int n10) {
        this(cArray, n10, ok_0.h);
    }

    public u7(Reader reader) {
        this(reader, ok_0.h);
    }

    /*
     * Unable to fully structure code
     */
    public u7(Reader var1_1, int var2_2) {
        block18: {
            block16: {
                block17: {
                    super(var2_2);
                    this.r = var1_1;
                    var3_3 = yn_2.o();
                    v0 = this.m = (char[])u7.w.get();
                    if (var3_3) break block16;
                    try {
                        block19: {
                            if (v0 == null) break block17;
                            break block19;
                            catch (IOException v1) {
                                throw u7.b(v1);
                            }
                        }
                        u7.w.set(null);
                    }
                    catch (IOException v2) {
                        throw u7.b(v2);
                    }
                }
                try {
                    v3 = this;
                    if (!var3_3) {
                        v0 = v3.m;
                    }
                    ** GOTO lbl35
                }
                catch (IOException v4) {
                    throw u7.b(v4);
                }
            }
            try {
                if (v0 == null) {
                    this.m = new char[u7.b(22853, 5147085739708625868L)];
                }
            }
            catch (IOException v5) {
                throw u7.b(v5);
            }
            try {
                v3 = this;
lbl35:
                // 2 sources

                v3.Q = var1_1.read(this.m);
            }
            catch (IOException var4_4) {
                throw new hi_0(var4_4.getMessage(), var4_4);
            }
            try {
                try {
                    this.d = -1;
                    this.C();
                    v6 = this.l;
                    if (var3_3 || v6 != u7.b(29757, 2093695566083923635L)) break block18;
                }
                catch (IOException v7) {
                    throw u7.b(v7);
                }
                v6 = this.C();
            }
            catch (IOException v8) {
                throw u7.b(v8);
            }
        }
    }

    public u7(char[] cArray, int n10, int n11) {
        this(new CharArrayReader(cArray, 0, n10), n11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final char C(int var1_1) {
        block33: {
            block34: {
                block44: {
                    block45: {
                        block42: {
                            block43: {
                                block40: {
                                    block41: {
                                        block39: {
                                            block35: {
                                                block36: {
                                                    block37: {
                                                        block38: {
                                                            block49: {
                                                                block48: {
                                                                    block47: {
                                                                        block46: {
                                                                            var2_2 = yn_2.Y();
                                                                            v0 = var1_1;
                                                                            if (!var2_2) break block33;
                                                                            if (v0 < this.Q) break block34;
                                                                            break block46;
                                                                            catch (IOException v1) {
                                                                                throw u7.b(v1);
                                                                            }
                                                                        }
                                                                        v2 = this.Q;
                                                                        if (!var2_2) break block35;
                                                                        break block47;
                                                                        catch (IOException v3) {
                                                                            throw u7.b(v3);
                                                                        }
                                                                    }
                                                                    if (v2 != -1) break block36;
                                                                    break block48;
                                                                    catch (IOException v4) {
                                                                        throw u7.b(v4);
                                                                    }
                                                                }
                                                                v5 = var1_1;
                                                                if (!var2_2) break block37;
                                                                break block49;
                                                                catch (IOException v6) {
                                                                    throw u7.b(v6);
                                                                }
                                                            }
                                                            try {
                                                                block50: {
                                                                    if (v5 >= this.e) break block38;
                                                                    break block50;
                                                                    catch (IOException v7) {
                                                                        throw u7.b(v7);
                                                                    }
                                                                }
                                                                return this.m[var1_1];
                                                            }
                                                            catch (IOException v8) {
                                                                throw u7.b(v8);
                                                            }
                                                        }
                                                        v5 = u7.b(15669, 2896399328214996914L);
                                                    }
                                                    return (char)v5;
                                                }
                                                v2 = this.d;
                                            }
                                            try {
                                                if (!var2_2) break block39;
                                                if (v2 == 0) {
                                                }
                                                ** GOTO lbl66
                                            }
                                            catch (IOException v9) {
                                                throw u7.b(v9);
                                            }
                                            var3_3 = new char[this.m.length * 3 / 2];
                                            System.arraycopy(this.m, this.d, var3_3, 0, this.Q);
                                            var4_5 = var3_3.length - this.Q;
                                            try {
                                                var5_7 = this.r.read(var3_3, this.Q, var4_5);
                                                this.Q += var5_7;
                                                this.m = var3_3;
                                            }
                                            catch (IOException var5_8) {
                                                throw new hi_0(var5_8.getMessage(), var5_8);
                                            }
                                            try {
                                                if (var2_2) break block34;
lbl66:
                                                // 2 sources

                                                v2 = this.Q - this.d;
                                            }
                                            catch (IOException v10) {
                                                throw u7.b(v10);
                                            }
                                        }
                                        var3_4 = v2;
                                        if (!var2_2) break block40;
                                        try {
                                            block51: {
                                                if (var3_4 <= 0) break block41;
                                                break block51;
                                                catch (IOException v11) {
                                                    throw u7.b(v11);
                                                }
                                            }
                                            System.arraycopy(this.m, this.d, this.m, 0, var3_4);
                                        }
                                        catch (IOException v12) {
                                            throw u7.b(v12);
                                        }
                                    }
                                    try {
                                        this.Q = this.r.read(this.m, var3_4, this.m.length - var3_4);
                                    }
                                    catch (IOException var4_6) {
                                        throw new hi_0(var4_6.getMessage(), var4_6);
                                    }
                                }
                                try {
                                    try {
                                        v13 = this.Q;
                                        if (!var2_2) break block42;
                                        if (v13 != 0) break block43;
                                    }
                                    catch (IOException v14) {
                                        throw u7.b(v14);
                                    }
                                    throw new hi_0(u7.b(31639, -15977));
                                }
                                catch (IOException v15) {
                                    throw u7.b(v15);
                                }
                            }
                            v13 = this.Q;
                        }
                        try {
                            try {
                                v16 = -1;
                                if (!var2_2) break block44;
                                if (v13 != v16) break block45;
                            }
                            catch (IOException v17) {
                                throw u7.b(v17);
                            }
                            return (char)u7.b(15669, 2896399328214996914L);
                        }
                        catch (IOException v18) {
                            throw u7.b(v18);
                        }
                    }
                    this.Q += var3_4;
                    v13 = var1_1;
                    v16 = this.d;
                }
                var1_1 = v13 - v16;
                this.S -= this.d;
                this.d = 0;
            }
            v0 = this.m[var1_1];
        }
        return v0;
    }

    @Override
    public final int d(char c2, int n10) {
        int n11 = n10 - this.d;
        boolean bl = yn_2.Y();
        while (true) {
            block12: {
                int n12;
                block11: {
                    block10: {
                        int n13;
                        block9: {
                            int n14 = this.d + n11;
                            n13 = this.C(n14);
                            try {
                                try {
                                    if (c2 != n13) break block9;
                                    n12 = n11 + this.d;
                                    if (!bl) break block10;
                                }
                                catch (hi_0 hi_02) {
                                    throw u7.b(hi_02);
                                }
                                return n12;
                            }
                            catch (hi_0 hi_03) {
                                throw u7.b(hi_03);
                            }
                        }
                        n12 = n13;
                    }
                    try {
                        try {
                            if (!bl) break block11;
                            if (n12 != u7.b(15669, 2896399328214996914L)) break block12;
                        }
                        catch (hi_0 hi_04) {
                            throw u7.b(hi_04);
                        }
                        n12 = -1;
                    }
                    catch (hi_0 hi_05) {
                        throw u7.b(hi_05);
                    }
                }
                return n12;
            }
            ++n11;
        }
    }

    @Override
    public final String e(int n10, int n11, int n12, o1_0 o1_02) {
        return o1_02.n(this.m, n10, n11, n12);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final char C() {
        block30: {
            block31: {
                block41: {
                    block39: {
                        block40: {
                            block37: {
                                block34: {
                                    block35: {
                                        block36: {
                                            block45: {
                                                block32: {
                                                    block33: {
                                                        block43: {
                                                            block42: {
                                                                var2_1 = ++this.d;
                                                                var1_2 = yn_2.Y();
                                                                v0 = var2_1;
                                                                if (!var1_2) break block30;
                                                                if (v0 < this.Q) break block31;
                                                                break block42;
                                                                catch (IOException v1) {
                                                                    throw u7.b(v1);
                                                                }
                                                            }
                                                            v2 = this.Q;
                                                            if (!var1_2) break block32;
                                                            break block43;
                                                            catch (IOException v3) {
                                                                throw u7.b(v3);
                                                            }
                                                        }
                                                        try {
                                                            block44: {
                                                                if (v2 != -1) break block33;
                                                                break block44;
                                                                catch (IOException v4) {
                                                                    throw u7.b(v4);
                                                                }
                                                            }
                                                            return (char)u7.b(15669, 2896399328214996914L);
                                                        }
                                                        catch (IOException v5) {
                                                            throw u7.b(v5);
                                                        }
                                                    }
                                                    v2 = this.e;
                                                }
                                                try {
                                                    if (var1_2) {
                                                        if (v2 <= 0) break block34;
                                                    }
                                                    ** GOTO lbl67
                                                }
                                                catch (IOException v6) {
                                                    throw u7.b(v6);
                                                }
                                                var3_3 = this.Q - this.e;
                                                v7 = this;
                                                if (!var1_2) break block35;
                                                if (v7.l != u7.b(26594, 2219415280460008803L)) break block36;
                                                break block45;
                                                catch (IOException v8) {
                                                    throw u7.b(v8);
                                                }
                                            }
                                            try {
                                                block46: {
                                                    if (var3_3 <= 0) break block36;
                                                    break block46;
                                                    catch (IOException v9) {
                                                        throw u7.b(v9);
                                                    }
                                                }
                                                --var3_3;
                                            }
                                            catch (IOException v10) {
                                                throw u7.b(v10);
                                            }
                                        }
                                        v7 = this;
                                    }
                                    System.arraycopy(v7.m, var3_3, this.m, 0, this.e);
                                }
                                this.S = -1;
                                var2_1 = this.d = this.e;
                                try {
                                    block38: {
                                        v2 = this.d;
lbl67:
                                        // 2 sources

                                        var3_3 = v2;
                                        var4_5 = this.m.length - var3_3;
                                        try {
                                            if (!var1_2) break block37;
                                            if (var4_5 != 0) break block38;
                                        }
                                        catch (IOException v11) {
                                            throw u7.b(v11);
                                        }
                                        var5_6 = new char[this.m.length * 2];
                                        System.arraycopy(this.m, 0, var5_6, 0, this.m.length);
                                        this.m = var5_6;
                                        var4_5 = this.m.length - var3_3;
                                    }
                                    this.Q = this.r.read(this.m, this.d, var4_5);
                                }
                                catch (IOException var3_4) {
                                    throw new hi_0(var3_4.getMessage(), var3_4);
                                }
                            }
                            try {
                                try {
                                    v12 = this.Q;
                                    if (!var1_2) break block39;
                                    if (v12 != 0) break block40;
                                }
                                catch (IOException v13) {
                                    throw u7.b(v13);
                                }
                                throw new hi_0(u7.b(31638, 19609));
                            }
                            catch (IOException v14) {
                                throw u7.b(v14);
                            }
                        }
                        try {
                            v15 = this;
                            if (!var1_2) break block41;
                            v12 = v15.Q;
                        }
                        catch (IOException v16) {
                            throw u7.b(v16);
                        }
                    }
                    try {
                        if (v12 == -1) {
                            v17 = u7.b(15669, 2896399328214996914L);
                            this.l = v17;
                            return v17;
                        }
                    }
                    catch (IOException v18) {
                        throw u7.b(v18);
                    }
                    v15 = this;
                }
                v15.Q += this.d;
            }
            v0 = this.l = this.m[var2_1];
        }
        return (char)v0;
    }

    @Override
    protected final void l(int n10, int n11, char[] cArray) {
        System.arraycopy(this.m, n10, cArray, 0, n11);
    }

    @Override
    public final boolean P(char[] cArray) {
        int c2;
        block7: {
            boolean bl = yn_2.Y();
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                boolean bl2;
                block8: {
                    try {
                        try {
                            try {
                                c2 = this.C(this.d + i2);
                                if (!bl) break block7;
                                if (!bl) break block8;
                            }
                            catch (hi_0 hi_02) {
                                throw u7.b(hi_02);
                            }
                            if (c2 == cArray[i2]) continue;
                        }
                        catch (hi_0 hi_03) {
                            throw u7.b(hi_03);
                        }
                        bl2 = false;
                    }
                    catch (hi_0 hi_04) {
                        throw u7.b(hi_04);
                    }
                }
                return bl2;
            }
            c2 = 1;
        }
        return c2 != 0;
    }

    @Override
    public byte[] e() {
        u7 u72;
        block4: {
            block5: {
                boolean bl = yn_2.o();
                try {
                    try {
                        u72 = this;
                        if (bl) break block4;
                        if (u72.Y != u7.b(22933, 3031693160495461151L)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw u7.b(hi_02);
                    }
                    throw new hi_0(u7.b(31636, -23037));
                }
                catch (hi_0 hi_03) {
                    throw u7.b(hi_03);
                }
            }
            u72 = this;
        }
        return S7.U(u72.m, this.S + 1, this.e);
    }

    @Override
    protected final void w(int n10, char[] cArray, int n11, int n12) {
        System.arraycopy(this.m, n10, cArray, n11, n12);
    }

    @Override
    public final String z() {
        block12: {
            int n10;
            int n11;
            block13: {
                block14: {
                    int n12;
                    boolean bl;
                    block11: {
                        bl = yn_2.o();
                        try {
                            try {
                                n12 = this.L;
                                if (bl) break block11;
                                if (n12 != 0) break block12;
                            }
                            catch (hi_0 hi_02) {
                                throw u7.b(hi_02);
                            }
                            n12 = this.S + 1;
                        }
                        catch (hi_0 hi_03) {
                            throw u7.b(hi_03);
                        }
                    }
                    n11 = n12;
                    try {
                        try {
                            n10 = n11;
                            if (bl) break block13;
                            if (n10 >= 0) break block14;
                        }
                        catch (hi_0 hi_04) {
                            throw u7.b(hi_04);
                        }
                        throw new IllegalStateException();
                    }
                    catch (hi_0 hi_05) {
                        throw u7.b(hi_05);
                    }
                }
                n10 = n11;
            }
            try {
                if (n10 > this.m.length - this.e) {
                    throw new IllegalStateException();
                }
            }
            catch (hi_0 hi_06) {
                throw u7.b(hi_06);
            }
            return new String(this.m, n11, this.e);
        }
        return new String(this.V, 0, this.e);
    }

    @Override
    public final String R(int n10, int n11) {
        try {
            if (n11 < 0) {
                throw new StringIndexOutOfBoundsException(n11);
            }
        }
        catch (hi_0 hi_02) {
            throw u7.b(hi_02);
        }
        return new String(this.m, n10, n11);
    }

    @Override
    public final char[] s(int n10, int n11) {
        int n12;
        block10: {
            block11: {
                boolean bl;
                block8: {
                    block9: {
                        bl = yn_2.o();
                        try {
                            try {
                                n12 = n11;
                                if (bl) break block8;
                                if (n12 >= 0) break block9;
                            }
                            catch (hi_0 hi_02) {
                                throw u7.b(hi_02);
                            }
                            throw new StringIndexOutOfBoundsException(n11);
                        }
                        catch (hi_0 hi_03) {
                            throw u7.b(hi_03);
                        }
                    }
                    n12 = n10;
                }
                try {
                    try {
                        if (bl) break block10;
                        if (n12 != 0) break block11;
                    }
                    catch (hi_0 hi_04) {
                        throw u7.b(hi_04);
                    }
                    return this.m;
                }
                catch (hi_0 hi_05) {
                    throw u7.b(hi_05);
                }
            }
            n12 = n11;
        }
        char[] cArray = new char[n12];
        System.arraycopy(this.m, n10, cArray, 0, n11);
        return cArray;
    }

    @Override
    public final String c() {
        int n10;
        int n11;
        block27: {
            block23: {
                int n12;
                int n13;
                block26: {
                    int n14;
                    boolean bl;
                    block25: {
                        block24: {
                            block22: {
                                int n15;
                                block20: {
                                    block21: {
                                        n11 = this.S;
                                        bl = yn_2.o();
                                        try {
                                            n15 = n11;
                                            if (bl) break block20;
                                            if (n15 != -1) break block21;
                                        }
                                        catch (hi_0 hi_02) {
                                            throw u7.b(hi_02);
                                        }
                                        n11 = 0;
                                    }
                                    n15 = this.C(n11 + this.e - 1);
                                }
                                n14 = n15;
                                n10 = this.e;
                                try {
                                    try {
                                        n13 = n14;
                                        n12 = u7.b(13184, 6574460218966104320L);
                                        if (bl) break block22;
                                        if (n13 == n12) break block23;
                                    }
                                    catch (hi_0 hi_03) {
                                        throw u7.b(hi_03);
                                    }
                                    n13 = n14;
                                    n12 = u7.b(20570, 3883114863963454149L);
                                }
                                catch (hi_0 hi_04) {
                                    throw u7.b(hi_04);
                                }
                            }
                            try {
                                try {
                                    if (bl) break block24;
                                    if (n13 == n12) break block23;
                                }
                                catch (hi_0 hi_05) {
                                    throw u7.b(hi_05);
                                }
                                n13 = n14;
                                n12 = u7.b(4376, 2012832365130480539L);
                            }
                            catch (hi_0 hi_06) {
                                throw u7.b(hi_06);
                            }
                        }
                        try {
                            try {
                                if (bl) break block25;
                                if (n13 == n12) break block23;
                            }
                            catch (hi_0 hi_07) {
                                throw u7.b(hi_07);
                            }
                            n13 = n14;
                            n12 = u7.b(26750, 8301644516542415611L);
                        }
                        catch (hi_0 hi_08) {
                            throw u7.b(hi_08);
                        }
                    }
                    try {
                        try {
                            if (bl) break block26;
                            if (n13 == n12) break block23;
                        }
                        catch (hi_0 hi_09) {
                            throw u7.b(hi_09);
                        }
                        n13 = n14;
                        n12 = u7.b(20094, 4991264910050600177L);
                    }
                    catch (hi_0 hi_010) {
                        throw u7.b(hi_010);
                    }
                }
                if (n13 != n12) break block27;
            }
            --n10;
        }
        String string = new String(this.m, n11, n10);
        return string;
    }

    @Override
    public final BigDecimal c() {
        int n10;
        int n11;
        int n12;
        int n13;
        block31: {
            block27: {
                boolean bl;
                block30: {
                    int n14;
                    block29: {
                        block28: {
                            block26: {
                                int n15;
                                block24: {
                                    block25: {
                                        n13 = this.S;
                                        bl = yn_2.Y();
                                        try {
                                            n15 = n13;
                                            if (!bl) break block24;
                                            if (n15 != -1) break block25;
                                        }
                                        catch (hi_0 hi_02) {
                                            throw u7.b(hi_02);
                                        }
                                        n13 = 0;
                                    }
                                    n15 = this.C(n13 + this.e - 1);
                                }
                                n14 = n15;
                                n12 = this.e;
                                try {
                                    try {
                                        n11 = n14;
                                        n10 = u7.b(16147, 9145189710988301723L);
                                        if (!bl) break block26;
                                        if (n11 == n10) break block27;
                                    }
                                    catch (hi_0 hi_03) {
                                        throw u7.b(hi_03);
                                    }
                                    n11 = n14;
                                    n10 = u7.b(29422, 2135190967384381548L);
                                }
                                catch (hi_0 hi_04) {
                                    throw u7.b(hi_04);
                                }
                            }
                            try {
                                try {
                                    if (!bl) break block28;
                                    if (n11 == n10) break block27;
                                }
                                catch (hi_0 hi_05) {
                                    throw u7.b(hi_05);
                                }
                                n11 = n14;
                                n10 = u7.b(11201, 732836544553435468L);
                            }
                            catch (hi_0 hi_06) {
                                throw u7.b(hi_06);
                            }
                        }
                        try {
                            try {
                                if (!bl) break block29;
                                if (n11 == n10) break block27;
                            }
                            catch (hi_0 hi_07) {
                                throw u7.b(hi_07);
                            }
                            n11 = n14;
                            n10 = u7.b(21038, 8407480765995923618L);
                        }
                        catch (hi_0 hi_08) {
                            throw u7.b(hi_08);
                        }
                    }
                    try {
                        try {
                            if (!bl) break block30;
                            if (n11 == n10) break block27;
                        }
                        catch (hi_0 hi_09) {
                            throw u7.b(hi_09);
                        }
                        n11 = n14;
                        n10 = u7.b(30468, 2657723547539348890L);
                    }
                    catch (hi_0 hi_010) {
                        throw u7.b(hi_010);
                    }
                }
                try {
                    if (!bl) break block31;
                    if (n11 == n10) {
                        // empty if block
                    }
                }
                catch (hi_0 hi_011) {
                    throw u7.b(hi_011);
                }
            }
            n11 = --n12;
            n10 = u7.b(7062, 4438276088353452317L);
        }
        try {
            if (n11 > n10) {
                throw new hi_0(u7.b(31637, -3912));
            }
        }
        catch (hi_0 hi_012) {
            throw u7.b(hi_012);
        }
        return new BigDecimal(this.m, n13, n12, MathContext.UNLIMITED);
    }

    @Override
    public void close() {
        u7 u72;
        block4: {
            block5: {
                boolean bl = yn_2.Y();
                super.close();
                boolean bl2 = bl;
                try {
                    try {
                        u72 = this;
                        if (!bl2) break block4;
                        if (u72.m.length > u7.b(30669, 5605827137821809993L)) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw u7.b(hi_02);
                    }
                    w.set(this.m);
                }
                catch (hi_0 hi_03) {
                    throw u7.b(hi_03);
                }
            }
            this.m = null;
            u72 = this;
        }
        S7.o(u72.r);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean A() {
        int n10;
        int n11;
        block14: {
            boolean bl = yn_2.o();
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        n11 = this.Q;
                                        if (bl) return n11 != 0;
                                        if (n11 == -1) return 1 != 0;
                                    }
                                    catch (hi_0 hi_02) {
                                        throw u7.b(hi_02);
                                    }
                                    n11 = this.d;
                                    if (bl) return n11 != 0;
                                }
                                catch (hi_0 hi_03) {
                                    throw u7.b(hi_03);
                                }
                                if (n11 == this.m.length) return 1 != 0;
                            }
                            catch (hi_0 hi_04) {
                                throw u7.b(hi_04);
                            }
                            n11 = this.l;
                            n10 = u7.b(15669, 2896399328214996914L);
                            if (bl) break block14;
                        }
                        catch (hi_0 hi_05) {
                            throw u7.b(hi_05);
                        }
                        if (n11 != n10) return 0 != 0;
                    }
                    catch (hi_0 hi_06) {
                        throw u7.b(hi_06);
                    }
                    n11 = this.d + 1;
                    if (bl) return n11 != 0;
                }
                catch (hi_0 hi_07) {
                    throw u7.b(hi_07);
                }
                n10 = this.m.length;
            }
            catch (hi_0 hi_08) {
                throw u7.b(hi_08);
            }
        }
        if (n11 < n10) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean k() {
        var2_1 = 0;
        var1_2 = yn_2.Y();
        do {
            block8: {
                block7: {
                    if ((var3_3 = this.m[var2_1]) != u7.b(15669, 2896399328214996914L)) ** GOTO lbl14
                    try {
                        try {
                            try {
                                this.Y = u7.b(12224, 5941096270837695814L);
                                if (!var1_2) continue;
                                if (var1_2) break;
                            }
                            catch (hi_0 v0) {
                                throw u7.b(v0);
                            }
lbl14:
                            // 2 sources

                            v1 = u7.Y(var3_3);
                            if (!var1_2) break block7;
                        }
                        catch (hi_0 v2) {
                            throw u7.b(v2);
                        }
                        if (v1) break block8;
                    }
                    catch (hi_0 v3) {
                        throw u7.b(v3);
                    }
                    v1 = false;
                }
                return v1;
            }
            ++var2_1;
        } while (var1_2);
        return true;
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
                        var10_2 = "\u00aaM\u00bcR\u0010?7\u001fT\u0016\b\u00c4\u00a6(\u00f5\u00f0\u00e3\u0016\u0086\u00cdx";
                        var12_3 = "\u00aaM\u00bcR\u0010?7\u001fT\u0016\b\u00c4\u00a6(\u00f5\u00f0\u00e3\u0016\u0086\u00cdx".length();
                        var9_4 = 4;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 55;
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
                            var10_2 = "qh\u00ce s\u00b0\u0098\n\u0004\u00d9U\u0099\u00d7\u00f8V\u00db\u0080o\u0007nZ\u0012\u0019iP\rA\u00d4>^H\u00c4!O\u00f1\t\u0013\u008b\u00d6\u0087\u00c6\u00e7@)\u00aa\u0011\u0092\u00ba\n\u00dejJj\u00c7\u0097\u00d3\u00ed0K\u0016/\u00d7\u0007s\u000e\u00e4";
                            var12_3 = "qh\u00ce s\u00b0\u0098\n\u0004\u00d9U\u0099\u00d7\u00f8V\u00db\u0080o\u0007nZ\u0012\u0019iP\rA\u00d4>^H\u00c4!O\u00f1\t\u0013\u008b\u00d6\u0087\u00c6\u00e7@)\u00aa\u0011\u0092\u00ba\n\u00dejJj\u00c7\u0097\u00d3\u00ed0K\u0016/\u00d7\u0007s\u000e\u00e4".length();
                            var9_4 = 32;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 11;
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
                                    v15 = 92;
                                    break;
                                }
                                case 1: {
                                    v15 = 13;
                                    break;
                                }
                                case 2: {
                                    v15 = 41;
                                    break;
                                }
                                case 3: {
                                    v15 = 98;
                                    break;
                                }
                                case 4: {
                                    v15 = 99;
                                    break;
                                }
                                case 5: {
                                    v15 = 58;
                                    break;
                                }
                                default: {
                                    v15 = 23;
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
                u7.f = var13;
                u7.g = new String[4];
                var0_7 = 2052181861655698056L;
                var6_8 = new long[18];
                var3_9 = 0;
                var4_10 = "\u0005w\u00ea^\u0019\f\u00fe=_g\u00b9\u00fc\u00faB:\u00c4\u0082\u001dT\u00e2\u00e2\u00f4\u009b\u0086\u00f6\u00fe\u00b1\u00ea\u00ffabl\u00de?\u00b5\u0083\u00e3\u0016\u00d4j!\u00b4tyU,\u00e9\u008d\\\u00bb(\u00e1\t\u00b3)Dv\t\u00c9\u00ed\u0001\u007f\u000f_\u00b9\u00c9\u00aa\u0090c\u0093\u008d \u0080,\u0094\u00dd\u0001\u00d1\u001f\u00da\u00c8\u00a9`{\u0092hX5\u0002M\u00a2T\b`\u00c7\u00c1\u000f\u0088E\u0007\u009a~!Qk\u0013\u001f\u00ab\u00fc\u00edB\u00b7\u00df\u0010\u00c4\u0015\u00f6\u0098W\u00c9^\u009b\u0082\u00c4\u00cb\u0015\u0083\u00c4";
                var5_11 = "\u0005w\u00ea^\u0019\f\u00fe=_g\u00b9\u00fc\u00faB:\u00c4\u0082\u001dT\u00e2\u00e2\u00f4\u009b\u0086\u00f6\u00fe\u00b1\u00ea\u00ffabl\u00de?\u00b5\u0083\u00e3\u0016\u00d4j!\u00b4tyU,\u00e9\u008d\\\u00bb(\u00e1\t\u00b3)Dv\t\u00c9\u00ed\u0001\u007f\u000f_\u00b9\u00c9\u00aa\u0090c\u0093\u008d \u0080,\u0094\u00dd\u0001\u00d1\u001f\u00da\u00c8\u00a9`{\u0092hX5\u0002M\u00a2T\b`\u00c7\u00c1\u000f\u0088E\u0007\u009a~!Qk\u0013\u001f\u00ab\u00fc\u00edB\u00b7\u00df\u0010\u00c4\u0015\u00f6\u0098W\u00c9^\u009b\u0082\u00c4\u00cb\u0015\u0083\u00c4".length();
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
                    var4_10 = "1>\u00b2\u0019\u0096\u00e8`\u001eP\u001dx\u00fd\u0084:\u00c7V";
                    var5_11 = "1>\u00b2\u0019\u0096\u00e8`\u001eP\u001dx\u00fd\u0084:\u00c7V".length();
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
        u7.k = var6_8;
        u7.o = new Integer[18];
        u7.w = new ThreadLocal<T>();
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x7B94) & 0xFFFF;
        if (g[n12] == null) {
            int n13;
            int n14;
            char[] cArray = f[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 79;
                    break;
                }
                case 1: {
                    n14 = 169;
                    break;
                }
                case 2: {
                    n14 = 20;
                    break;
                }
                case 3: {
                    n14 = 48;
                    break;
                }
                case 4: {
                    n14 = 215;
                    break;
                }
                case 5: {
                    n14 = 51;
                    break;
                }
                case 6: {
                    n14 = 87;
                    break;
                }
                case 7: {
                    n14 = 55;
                    break;
                }
                case 8: {
                    n14 = 147;
                    break;
                }
                case 9: {
                    n14 = 248;
                    break;
                }
                case 10: {
                    n14 = 15;
                    break;
                }
                case 11: {
                    n14 = 75;
                    break;
                }
                case 12: {
                    n14 = 240;
                    break;
                }
                case 13: {
                    n14 = 44;
                    break;
                }
                case 14: {
                    n14 = 59;
                    break;
                }
                case 15: {
                    n14 = 174;
                    break;
                }
                case 16: {
                    n14 = 84;
                    break;
                }
                case 17: {
                    n14 = 123;
                    break;
                }
                case 18: {
                    n14 = 185;
                    break;
                }
                case 19: {
                    n14 = 6;
                    break;
                }
                case 20: {
                    n14 = 78;
                    break;
                }
                case 21: {
                    n14 = 89;
                    break;
                }
                case 22: {
                    n14 = 223;
                    break;
                }
                case 23: {
                    n14 = 253;
                    break;
                }
                case 24: {
                    n14 = 38;
                    break;
                }
                case 25: {
                    n14 = 95;
                    break;
                }
                case 26: {
                    n14 = 88;
                    break;
                }
                case 27: {
                    n14 = 142;
                    break;
                }
                case 28: {
                    n14 = 211;
                    break;
                }
                case 29: {
                    n14 = 108;
                    break;
                }
                case 30: {
                    n14 = 254;
                    break;
                }
                case 31: {
                    n14 = 255;
                    break;
                }
                case 32: {
                    n14 = 241;
                    break;
                }
                case 33: {
                    n14 = 54;
                    break;
                }
                case 34: {
                    n14 = 102;
                    break;
                }
                case 35: {
                    n14 = 122;
                    break;
                }
                case 36: {
                    n14 = 53;
                    break;
                }
                case 37: {
                    n14 = 193;
                    break;
                }
                case 38: {
                    n14 = 74;
                    break;
                }
                case 39: {
                    n14 = 32;
                    break;
                }
                case 40: {
                    n14 = 187;
                    break;
                }
                case 41: {
                    n14 = 68;
                    break;
                }
                case 42: {
                    n14 = 180;
                    break;
                }
                case 43: {
                    n14 = 7;
                    break;
                }
                case 44: {
                    n14 = 132;
                    break;
                }
                case 45: {
                    n14 = 86;
                    break;
                }
                case 46: {
                    n14 = 46;
                    break;
                }
                case 47: {
                    n14 = 62;
                    break;
                }
                case 48: {
                    n14 = 30;
                    break;
                }
                case 49: {
                    n14 = 91;
                    break;
                }
                case 50: {
                    n14 = 160;
                    break;
                }
                case 51: {
                    n14 = 229;
                    break;
                }
                case 52: {
                    n14 = 76;
                    break;
                }
                case 53: {
                    n14 = 200;
                    break;
                }
                case 54: {
                    n14 = 161;
                    break;
                }
                case 55: {
                    n14 = 195;
                    break;
                }
                case 56: {
                    n14 = 67;
                    break;
                }
                case 57: {
                    n14 = 24;
                    break;
                }
                case 58: {
                    n14 = 45;
                    break;
                }
                case 59: {
                    n14 = 238;
                    break;
                }
                case 60: {
                    n14 = 149;
                    break;
                }
                case 61: {
                    n14 = 99;
                    break;
                }
                case 62: {
                    n14 = 121;
                    break;
                }
                case 63: {
                    n14 = 100;
                    break;
                }
                case 64: {
                    n14 = 227;
                    break;
                }
                case 65: {
                    n14 = 194;
                    break;
                }
                case 66: {
                    n14 = 228;
                    break;
                }
                case 67: {
                    n14 = 139;
                    break;
                }
                case 68: {
                    n14 = 162;
                    break;
                }
                case 69: {
                    n14 = 2;
                    break;
                }
                case 70: {
                    n14 = 93;
                    break;
                }
                case 71: {
                    n14 = 130;
                    break;
                }
                case 72: {
                    n14 = 231;
                    break;
                }
                case 73: {
                    n14 = 73;
                    break;
                }
                case 74: {
                    n14 = 5;
                    break;
                }
                case 75: {
                    n14 = 208;
                    break;
                }
                case 76: {
                    n14 = 154;
                    break;
                }
                case 77: {
                    n14 = 192;
                    break;
                }
                case 78: {
                    n14 = 205;
                    break;
                }
                case 79: {
                    n14 = 214;
                    break;
                }
                case 80: {
                    n14 = 197;
                    break;
                }
                case 81: {
                    n14 = 242;
                    break;
                }
                case 82: {
                    n14 = 39;
                    break;
                }
                case 83: {
                    n14 = 144;
                    break;
                }
                case 84: {
                    n14 = 136;
                    break;
                }
                case 85: {
                    n14 = 189;
                    break;
                }
                case 86: {
                    n14 = 31;
                    break;
                }
                case 87: {
                    n14 = 11;
                    break;
                }
                case 88: {
                    n14 = 69;
                    break;
                }
                case 89: {
                    n14 = 198;
                    break;
                }
                case 90: {
                    n14 = 252;
                    break;
                }
                case 91: {
                    n14 = 222;
                    break;
                }
                case 92: {
                    n14 = 126;
                    break;
                }
                case 93: {
                    n14 = 177;
                    break;
                }
                case 94: {
                    n14 = 183;
                    break;
                }
                case 95: {
                    n14 = 66;
                    break;
                }
                case 96: {
                    n14 = 71;
                    break;
                }
                case 97: {
                    n14 = 237;
                    break;
                }
                case 98: {
                    n14 = 17;
                    break;
                }
                case 99: {
                    n14 = 133;
                    break;
                }
                case 100: {
                    n14 = 151;
                    break;
                }
                case 101: {
                    n14 = 22;
                    break;
                }
                case 102: {
                    n14 = 202;
                    break;
                }
                case 103: {
                    n14 = 34;
                    break;
                }
                case 104: {
                    n14 = 56;
                    break;
                }
                case 105: {
                    n14 = 220;
                    break;
                }
                case 106: {
                    n14 = 36;
                    break;
                }
                case 107: {
                    n14 = 81;
                    break;
                }
                case 108: {
                    n14 = 57;
                    break;
                }
                case 109: {
                    n14 = 1;
                    break;
                }
                case 110: {
                    n14 = 186;
                    break;
                }
                case 111: {
                    n14 = 25;
                    break;
                }
                case 112: {
                    n14 = 204;
                    break;
                }
                case 113: {
                    n14 = 70;
                    break;
                }
                case 114: {
                    n14 = 43;
                    break;
                }
                case 115: {
                    n14 = 129;
                    break;
                }
                case 116: {
                    n14 = 226;
                    break;
                }
                case 117: {
                    n14 = 212;
                    break;
                }
                case 118: {
                    n14 = 239;
                    break;
                }
                case 119: {
                    n14 = 218;
                    break;
                }
                case 120: {
                    n14 = 234;
                    break;
                }
                case 121: {
                    n14 = 249;
                    break;
                }
                case 122: {
                    n14 = 64;
                    break;
                }
                case 123: {
                    n14 = 251;
                    break;
                }
                case 124: {
                    n14 = 168;
                    break;
                }
                case 125: {
                    n14 = 26;
                    break;
                }
                case 126: {
                    n14 = 232;
                    break;
                }
                case 127: {
                    n14 = 47;
                    break;
                }
                case 128: {
                    n14 = 201;
                    break;
                }
                case 129: {
                    n14 = 210;
                    break;
                }
                case 130: {
                    n14 = 120;
                    break;
                }
                case 131: {
                    n14 = 0;
                    break;
                }
                case 132: {
                    n14 = 181;
                    break;
                }
                case 133: {
                    n14 = 196;
                    break;
                }
                case 134: {
                    n14 = 146;
                    break;
                }
                case 135: {
                    n14 = 9;
                    break;
                }
                case 136: {
                    n14 = 243;
                    break;
                }
                case 137: {
                    n14 = 92;
                    break;
                }
                case 138: {
                    n14 = 216;
                    break;
                }
                case 139: {
                    n14 = 135;
                    break;
                }
                case 140: {
                    n14 = 191;
                    break;
                }
                case 141: {
                    n14 = 33;
                    break;
                }
                case 142: {
                    n14 = 119;
                    break;
                }
                case 143: {
                    n14 = 83;
                    break;
                }
                case 144: {
                    n14 = 28;
                    break;
                }
                case 145: {
                    n14 = 60;
                    break;
                }
                case 146: {
                    n14 = 42;
                    break;
                }
                case 147: {
                    n14 = 158;
                    break;
                }
                case 148: {
                    n14 = 49;
                    break;
                }
                case 149: {
                    n14 = 170;
                    break;
                }
                case 150: {
                    n14 = 104;
                    break;
                }
                case 151: {
                    n14 = 141;
                    break;
                }
                case 152: {
                    n14 = 118;
                    break;
                }
                case 153: {
                    n14 = 27;
                    break;
                }
                case 154: {
                    n14 = 171;
                    break;
                }
                case 155: {
                    n14 = 233;
                    break;
                }
                case 156: {
                    n14 = 137;
                    break;
                }
                case 157: {
                    n14 = 52;
                    break;
                }
                case 158: {
                    n14 = 18;
                    break;
                }
                case 159: {
                    n14 = 152;
                    break;
                }
                case 160: {
                    n14 = 225;
                    break;
                }
                case 161: {
                    n14 = 236;
                    break;
                }
                case 162: {
                    n14 = 199;
                    break;
                }
                case 163: {
                    n14 = 178;
                    break;
                }
                case 164: {
                    n14 = 246;
                    break;
                }
                case 165: {
                    n14 = 176;
                    break;
                }
                case 166: {
                    n14 = 82;
                    break;
                }
                case 167: {
                    n14 = 111;
                    break;
                }
                case 168: {
                    n14 = 61;
                    break;
                }
                case 169: {
                    n14 = 164;
                    break;
                }
                case 170: {
                    n14 = 19;
                    break;
                }
                case 171: {
                    n14 = 184;
                    break;
                }
                case 172: {
                    n14 = 209;
                    break;
                }
                case 173: {
                    n14 = 8;
                    break;
                }
                case 174: {
                    n14 = 94;
                    break;
                }
                case 175: {
                    n14 = 4;
                    break;
                }
                case 176: {
                    n14 = 247;
                    break;
                }
                case 177: {
                    n14 = 250;
                    break;
                }
                case 178: {
                    n14 = 90;
                    break;
                }
                case 179: {
                    n14 = 131;
                    break;
                }
                case 180: {
                    n14 = 12;
                    break;
                }
                case 181: {
                    n14 = 138;
                    break;
                }
                case 182: {
                    n14 = 163;
                    break;
                }
                case 183: {
                    n14 = 37;
                    break;
                }
                case 184: {
                    n14 = 96;
                    break;
                }
                case 185: {
                    n14 = 143;
                    break;
                }
                case 186: {
                    n14 = 190;
                    break;
                }
                case 187: {
                    n14 = 58;
                    break;
                }
                case 188: {
                    n14 = 127;
                    break;
                }
                case 189: {
                    n14 = 114;
                    break;
                }
                case 190: {
                    n14 = 203;
                    break;
                }
                case 191: {
                    n14 = 107;
                    break;
                }
                case 192: {
                    n14 = 221;
                    break;
                }
                case 193: {
                    n14 = 110;
                    break;
                }
                case 194: {
                    n14 = 29;
                    break;
                }
                case 195: {
                    n14 = 156;
                    break;
                }
                case 196: {
                    n14 = 140;
                    break;
                }
                case 197: {
                    n14 = 113;
                    break;
                }
                case 198: {
                    n14 = 105;
                    break;
                }
                case 199: {
                    n14 = 85;
                    break;
                }
                case 200: {
                    n14 = 172;
                    break;
                }
                case 201: {
                    n14 = 13;
                    break;
                }
                case 202: {
                    n14 = 219;
                    break;
                }
                case 203: {
                    n14 = 117;
                    break;
                }
                case 204: {
                    n14 = 167;
                    break;
                }
                case 205: {
                    n14 = 80;
                    break;
                }
                case 206: {
                    n14 = 235;
                    break;
                }
                case 207: {
                    n14 = 40;
                    break;
                }
                case 208: {
                    n14 = 63;
                    break;
                }
                case 209: {
                    n14 = 244;
                    break;
                }
                case 210: {
                    n14 = 98;
                    break;
                }
                case 211: {
                    n14 = 97;
                    break;
                }
                case 212: {
                    n14 = 50;
                    break;
                }
                case 213: {
                    n14 = 134;
                    break;
                }
                case 214: {
                    n14 = 3;
                    break;
                }
                case 215: {
                    n14 = 35;
                    break;
                }
                case 216: {
                    n14 = 230;
                    break;
                }
                case 217: {
                    n14 = 179;
                    break;
                }
                case 218: {
                    n14 = 165;
                    break;
                }
                case 219: {
                    n14 = 157;
                    break;
                }
                case 220: {
                    n14 = 166;
                    break;
                }
                case 221: {
                    n14 = 101;
                    break;
                }
                case 222: {
                    n14 = 155;
                    break;
                }
                case 223: {
                    n14 = 145;
                    break;
                }
                case 224: {
                    n14 = 124;
                    break;
                }
                case 225: {
                    n14 = 14;
                    break;
                }
                case 226: {
                    n14 = 128;
                    break;
                }
                case 227: {
                    n14 = 245;
                    break;
                }
                case 228: {
                    n14 = 188;
                    break;
                }
                case 229: {
                    n14 = 10;
                    break;
                }
                case 230: {
                    n14 = 65;
                    break;
                }
                case 231: {
                    n14 = 116;
                    break;
                }
                case 232: {
                    n14 = 125;
                    break;
                }
                case 233: {
                    n14 = 148;
                    break;
                }
                case 234: {
                    n14 = 224;
                    break;
                }
                case 235: {
                    n14 = 16;
                    break;
                }
                case 236: {
                    n14 = 72;
                    break;
                }
                case 237: {
                    n14 = 182;
                    break;
                }
                case 238: {
                    n14 = 77;
                    break;
                }
                case 239: {
                    n14 = 173;
                    break;
                }
                case 240: {
                    n14 = 21;
                    break;
                }
                case 241: {
                    n14 = 206;
                    break;
                }
                case 242: {
                    n14 = 106;
                    break;
                }
                case 243: {
                    n14 = 112;
                    break;
                }
                case 244: {
                    n14 = 150;
                    break;
                }
                case 245: {
                    n14 = 213;
                    break;
                }
                case 246: {
                    n14 = 217;
                    break;
                }
                case 247: {
                    n14 = 41;
                    break;
                }
                case 248: {
                    n14 = 153;
                    break;
                }
                case 249: {
                    n14 = 109;
                    break;
                }
                case 250: {
                    n14 = 159;
                    break;
                }
                case 251: {
                    n14 = 207;
                    break;
                }
                case 252: {
                    n14 = 115;
                    break;
                }
                case 253: {
                    n14 = 103;
                    break;
                }
                case 254: {
                    n14 = 23;
                    break;
                }
                default: {
                    n14 = 175;
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
            u7.g[n12] = new String(cArray).intern();
        }
        return g[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A8F;
        if (o[n11] == null) {
            u7.o[n11] = (int)(k[n11] ^ l2);
        }
        return o[n11];
    }
}

