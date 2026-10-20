/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kp_0;
import com.ky_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias(value="Pair")
public class F5
implements Serializable,
Cloneable {
    @XStreamAsAttribute
    public Object f;
    @XStreamAsAttribute
    public Object q;
    private static boolean e;
    private static final String a;
    private static final long b;

    public F5() {
        this(null, null);
    }

    public F5(Object object) {
        this(object, null);
    }

    public F5(Object object, Object object2) {
        this.f = object;
        this.q = object2;
    }

    public Object H() {
        return this.f;
    }

    public void x(Object object) {
        this.f = object;
    }

    public Object L() {
        return this.q;
    }

    public void s(Object object) {
        this.q = object;
    }

    public String toString() {
        return this.f + "=" + this.q;
    }

    public int hashCode() {
        int n10;
        block11: {
            boolean bl;
            block13: {
                block12: {
                    int n11;
                    int n12;
                    boolean bl2;
                    block10: {
                        Object object;
                        block8: {
                            block9: {
                                bl2 = F5.A();
                                try {
                                    try {
                                        n12 = this.f.hashCode() * (int)b;
                                        object = this.q;
                                        if (bl2) break block8;
                                        if (object != null) break block9;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw F5.a(runtimeException);
                                    }
                                    n11 = 0;
                                    break block10;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw F5.a(runtimeException);
                                }
                            }
                            object = this.q;
                        }
                        n11 = object.hashCode();
                    }
                    try {
                        try {
                            n10 = n12 + n11;
                            if (ky_2.F() == null) break block11;
                            if (!bl2) break block12;
                        }
                        catch (RuntimeException runtimeException) {
                            throw F5.a(runtimeException);
                        }
                        bl = false;
                        break block13;
                    }
                    catch (RuntimeException runtimeException) {
                        throw F5.a(runtimeException);
                    }
                }
                bl = true;
            }
            F5.k(bl);
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    public boolean equals(Object var1_1) {
        block29: {
            block30: {
                block36: {
                    block34: {
                        block35: {
                            block33: {
                                block31: {
                                    block32: {
                                        block27: {
                                            block28: {
                                                var2_2 = F5.A();
                                                try {
                                                    try {
                                                        v0 = this;
                                                        if (var2_2) break block27;
                                                        if (v0 != var1_1) break block28;
                                                    }
                                                    catch (RuntimeException v1) {
                                                        throw F5.a(v1);
                                                    }
                                                    return true;
                                                }
                                                catch (RuntimeException v2) {
                                                    throw F5.a(v2);
                                                }
                                            }
                                            v0 = var1_1;
                                        }
                                        try {
                                            v3 = v0 instanceof F5;
                                            if (var2_2) break block29;
                                            if (!v3) break block30;
                                        }
                                        catch (RuntimeException v4) {
                                            throw F5.a(v4);
                                        }
                                        var3_3 = (F5)var1_1;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v5 = this.f;
                                                        if (var2_2) break block31;
                                                        if (v5 == null) break block32;
                                                    }
                                                    catch (RuntimeException v6) {
                                                        throw F5.a(v6);
                                                    }
                                                    v5 = this.f;
                                                    if (var2_2) break block33;
                                                }
                                                catch (RuntimeException v7) {
                                                    throw F5.a(v7);
                                                }
                                                if (v5.equals(var3_3.f)) ** GOTO lbl56
                                                ** GOTO lbl-1000
                                            }
                                            catch (RuntimeException v8) {
                                                throw F5.a(v8);
                                            }
                                        }
                                        catch (RuntimeException v9) {
                                            throw F5.a(v9);
                                        }
                                    }
                                    v5 = var3_3.f;
                                }
                                try {
                                    try {
                                        if (var2_2) break block33;
                                        if (v5 == null) {
                                        }
                                        ** GOTO lbl-1000
                                    }
                                    catch (RuntimeException v10) {
                                        throw F5.a(v10);
                                    }
lbl56:
                                    // 2 sources

                                    v5 = this.q;
                                }
                                catch (RuntimeException v11) {
                                    throw F5.a(v11);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (var2_2) break block34;
                                        if (v5 == null) break block35;
                                    }
                                    catch (RuntimeException v12) {
                                        throw F5.a(v12);
                                    }
                                    v13 = this.q.equals(var3_3.q);
                                    if (var2_2) break block36;
                                }
                                catch (RuntimeException v14) {
                                    throw F5.a(v14);
                                }
                                if (v13) ** GOTO lbl-1000
                                ** GOTO lbl-1000
                            }
                            catch (RuntimeException v15) {
                                throw F5.a(v15);
                            }
                        }
                        v5 = var3_3.q;
                    }
                    if (v5 == null) lbl-1000:
                    // 2 sources

                    {
                        v13 = true;
                    } else lbl-1000:
                    // 4 sources

                    {
                        v13 = false;
                    }
                }
                return v13;
            }
            v3 = false;
        }
        return v3;
    }

    public F5 N() {
        block12: {
            F5 f52;
            boolean bl;
            block13: {
                boolean bl2;
                block11: {
                    bl = F5.A();
                    try {
                        try {
                            try {
                                bl2 = this.H() instanceof Cloneable;
                                if (bl) break block11;
                                if (!bl2) break block12;
                            }
                            catch (RuntimeException runtimeException) {
                                throw F5.a(runtimeException);
                            }
                            f52 = this;
                            if (bl) break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw F5.a(runtimeException);
                        }
                        bl2 = f52.L() instanceof Cloneable;
                    }
                    catch (RuntimeException runtimeException) {
                        throw F5.a(runtimeException);
                    }
                }
                try {
                    if (!bl2) break block12;
                    f52 = new F5(kp_0.E((Cloneable)this.H()), kp_0.E((Cloneable)this.L()));
                }
                catch (RuntimeException runtimeException) {
                    throw F5.a(runtimeException);
                }
            }
            try {
                if (bl) {
                    ky_2.K(new String[4]);
                }
            }
            catch (RuntimeException runtimeException) {
                throw F5.a(runtimeException);
            }
            return f52;
        }
        throw new RuntimeException(a);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.N();
    }

    public static void k(boolean bl) {
        e = bl;
    }

    public static boolean A() {
        return e;
    }

    public static boolean E() {
        boolean bl = F5.A();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (RuntimeException runtimeException) {
            throw F5.a(runtimeException);
        }
        return false;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (!F5.E()) {
                    F5.k(true);
                }
                char[] cArray3 = "g`H\u000f\u0015\u0013?\\/]\tQX,DcI\u0002\u0015\u000b2JzP\u0003\u0015\u00117UcY\nP\u0016.\u0005LP\b[\u001d;GcYF".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 78;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 107;
                            break;
                        }
                        case 1: {
                            n17 = 65;
                            break;
                        }
                        case 2: {
                            n17 = 114;
                            break;
                        }
                        case 3: {
                            n17 = 41;
                            break;
                        }
                        case 4: {
                            n17 = 123;
                            break;
                        }
                        case 5: {
                            n17 = 54;
                            break;
                        }
                        default: {
                            n17 = 20;
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
        long l2 = 2419539180270016244L;
        b = 0x73907A75B02256F9L ^ l2;
    }
}

