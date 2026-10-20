/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.sd_0;
import org.jetbrains.annotations.NotNull;

public class KB {
    public final Object X;
    public final Object S;
    private static final KB j;
    private static final long a;

    @NotNull
    public static KB Z(Object object, Object object2) {
        return new KB(object, object2);
    }

    public static Object K(KB kB) {
        ky_2[] ky_2Array = sd_0.t();
        Object object = kB;
        if (ky_2Array != null) {
            object = object != null ? kB.X : null;
        }
        return object;
    }

    public static Object B(KB kB) {
        ky_2[] ky_2Array = sd_0.t();
        Object object = kB;
        if (ky_2Array != null) {
            object = object != null ? kB.S : null;
        }
        return object;
    }

    public static KB w() {
        return j;
    }

    public KB(Object object, Object object2) {
        this.X = object;
        this.S = object2;
    }

    public final Object F() {
        return this.X;
    }

    public final Object e() {
        return this.S;
    }

    public boolean equals(Object object) {
        boolean bl;
        block21: {
            block22: {
                block23: {
                    Object object2;
                    block19: {
                        KB kB;
                        block20: {
                            ky_2[] ky_2Array;
                            block16: {
                                block17: {
                                    block18: {
                                        block14: {
                                            block15: {
                                                Object object3;
                                                block12: {
                                                    block13: {
                                                        block11: {
                                                            ky_2Array = sd_0.t();
                                                            Object object4 = this;
                                                            if (ky_2Array != null) {
                                                                if (object4 == object) {
                                                                    return true;
                                                                }
                                                                object4 = object;
                                                            }
                                                            if (object4 == null) break block11;
                                                            object3 = this.getClass();
                                                            if (ky_2Array == null) break block12;
                                                            if (object3 == object.getClass()) break block13;
                                                        }
                                                        return false;
                                                    }
                                                    object3 = object;
                                                }
                                                kB = (KB)object3;
                                                object2 = this.X;
                                                if (ky_2Array == null) break block14;
                                                if (object2 == null) break block15;
                                                object2 = this.X;
                                                if (ky_2Array == null) break block16;
                                                if (object2.equals(kB.X)) break block17;
                                                break block18;
                                            }
                                            object2 = kB.X;
                                        }
                                        if (ky_2Array == null) break block16;
                                        if (object2 == null) break block17;
                                    }
                                    return false;
                                }
                                object2 = this.S;
                            }
                            if (ky_2Array == null) break block19;
                            if (object2 == null) break block20;
                            bl = this.S.equals(kB.S);
                            if (ky_2Array == null) break block21;
                            if (bl) break block22;
                            break block23;
                        }
                        object2 = kB.S;
                    }
                    if (object2 == null) break block22;
                }
                return false;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    public int hashCode() {
        var1_1 = sd_0.t();
        v0 = this.X;
        if (var1_1 == null) ** GOTO lbl6
        if (v0 != null) {
            v0 = this.X;
lbl6:
            // 2 sources

            v1 = v0.hashCode();
        } else {
            v1 = 0;
        }
        var2_2 = v1;
        v2 = (int)KB.a * var2_2;
        v3 = this.S;
        if (var1_1 == null) ** GOTO lbl15
        if (v3 != null) {
            v3 = this.S;
lbl15:
            // 2 sources

            v4 = v3.hashCode();
        } else {
            v4 = 0;
        }
        var2_2 = v2 + v4;
        return var2_2;
    }

    public String toString() {
        return "<" + this.X + "," + this.S + ">";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5978068851461671251L;
        a = 0xA423324A7E33494CL ^ l2;
        j = KB.Z(null, null);
    }
}

