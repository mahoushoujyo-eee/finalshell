/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dx_2;
import com.xf_1;
import java.util.Objects;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.Et
 */
public class et_0 {
    public static final et_0 I;
    public static final et_0 E;
    private final int u;
    private final xf_1 k;
    private final Supplier m;
    static final /* synthetic */ boolean h;
    private static final String a;

    public et_0(int n10) {
        this(n10, null, null);
    }

    public et_0(int n10, int n11, int n12) {
        this(-1, new xf_1(n10, n11, n12), null);
    }

    public et_0(@NotNull Supplier supplier) {
        this(-1, null, supplier);
    }

    private et_0(int n10, @Nullable xf_1 xf_12, @Nullable Supplier supplier) {
        block20: {
            block21: {
                if (n10 != -1) {
                    block19: {
                        try {
                            try {
                                if (h || xf_12 == null) break block19;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw et_0.a(illegalArgumentException);
                            }
                            throw new AssertionError();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw et_0.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (h || supplier == null) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw et_0.a(illegalArgumentException);
                        }
                        throw new AssertionError();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        try {
                            if (xf_12 == null) break block21;
                            if (h) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw et_0.a(illegalArgumentException);
                        }
                        if (supplier == null) break block20;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                    throw new AssertionError();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw et_0.a(illegalArgumentException);
                }
            }
            try {
                try {
                    if (h || supplier != null) break block20;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw et_0.a(illegalArgumentException);
                }
                throw new AssertionError();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw et_0.a(illegalArgumentException);
            }
        }
        this.u = n10;
        this.k = xf_12;
        this.m = supplier;
    }

    @NotNull
    public static et_0 W(int n10) {
        return new et_0(n10);
    }

    public static et_0 U(int n10, int n11, int n12) {
        return new et_0(n10, n11, n12);
    }

    public boolean h() {
        boolean bl;
        block4: {
            block5: {
                String string = dx_2.g();
                try {
                    try {
                        bl = this.u;
                        if (string != null) break block4;
                        if (bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw et_0.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @NotNull
    public xf_1 d() {
        xf_1 xf_12;
        block12: {
            xf_1 xf_13;
            block10: {
                block11: {
                    et_0 et_02;
                    String string;
                    block8: {
                        block9: {
                            string = dx_2.g();
                            try {
                                try {
                                    et_02 = this;
                                    if (string != null) break block8;
                                    if (!et_02.h()) break block9;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw et_0.a(illegalArgumentException);
                                }
                                throw new IllegalArgumentException(a);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw et_0.a(illegalArgumentException);
                            }
                        }
                        et_02 = this;
                    }
                    try {
                        try {
                            xf_13 = et_02.k;
                            if (string != null) break block10;
                            if (xf_13 == null) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw et_0.a(illegalArgumentException);
                        }
                        xf_12 = this.k;
                        break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                }
                xf_13 = Objects.requireNonNull(this.m).get();
            }
            xf_12 = xf_13;
        }
        return xf_12;
    }

    public int q() {
        return this.u;
    }

    public boolean equals(Object object) {
        boolean bl;
        block23: {
            block22: {
                String string;
                block21: {
                    Object object2;
                    block19: {
                        block20: {
                            Object object3;
                            block16: {
                                block17: {
                                    string = dx_2.g();
                                    try {
                                        try {
                                            object3 = this;
                                            if (string != null) break block16;
                                            if (object3 != object) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw et_0.a(illegalArgumentException);
                                        }
                                        return true;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw et_0.a(illegalArgumentException);
                                    }
                                }
                                object3 = object;
                            }
                            try {
                                block18: {
                                    try {
                                        try {
                                            if (object3 == null) break block18;
                                            object2 = this.getClass();
                                            if (string != null) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw et_0.a(illegalArgumentException);
                                        }
                                        if (object2 == object.getClass()) break block20;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw et_0.a(illegalArgumentException);
                                    }
                                }
                                return false;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw et_0.a(illegalArgumentException);
                            }
                        }
                        object2 = object;
                    }
                    et_0 et_02 = (et_0)object2;
                    try {
                        try {
                            bl = this.u;
                            if (string != null) break block21;
                            if (bl != et_02.u) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw et_0.a(illegalArgumentException);
                        }
                        bl = Objects.equals(this.k, et_02.k);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                }
                try {
                    if (string != null) break block23;
                    if (!bl) break block22;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw et_0.a(illegalArgumentException);
                }
                bl = true;
                break block23;
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.u, this.k);
    }

    @Nullable
    public static et_0 R(@Nullable xf_1 xf_12) {
        xf_1 xf_13;
        block4: {
            block5: {
                String string = dx_2.g();
                try {
                    try {
                        xf_13 = xf_12;
                        if (string != null) break block4;
                        if (xf_13 != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw et_0.a(illegalArgumentException);
                    }
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw et_0.a(illegalArgumentException);
                }
            }
            xf_13 = xf_12;
        }
        return et_0.U(xf_13.U(), xf_12.K(), xf_12.E());
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "E UPCA:uoPQU\u0004+c+\u0019\\^\r<toJP\u0011\u0000sv.UZE\u00156&&J\u001f_\u00046b*]".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 55;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 49;
                            break;
                        }
                        case 1: {
                            n17 = 120;
                            break;
                        }
                        case 2: {
                            n17 = 14;
                            break;
                        }
                        case 3: {
                            n17 = 8;
                            break;
                        }
                        case 4: {
                            n17 = 6;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 100;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 4857096518171312323L;
        long l3 = 0x15A616929D6340CCL ^ l2;
        try {
            bl = !et_0.class.desiredAssertionStatus();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw et_0.a(illegalArgumentException);
        }
        h = bl;
        I = et_0.W(0);
        E = et_0.W((int)l3);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

