/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WI;
import com.uS;
import com.wq_0;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.Xo
 */
public class xo_0 {
    @NotNull
    public final StringBuffer x;
    public int f;
    private static final String a;

    public xo_0(@NotNull StringBuffer stringBuffer, int n10) {
        this.x = stringBuffer;
        this.f = n10;
    }

    @NotNull
    public xo_0 k() {
        return new xo_0(new StringBuffer(this.x), this.f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] stringArray = wq_0.y();
        Object object2 = this;
        if (stringArray == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (stringArray == null) {
            if (!(object2 instanceof xo_0)) {
                return false;
            }
            object2 = object;
        }
        xo_0 xo_02 = (xo_0)object2;
        boolean bl = this.f;
        if (stringArray == null) {
            if (bl != xo_02.f) return false;
            bl = this.x.toString().stripTrailing().equals(xo_02.x.toString().stripTrailing());
        }
        if (stringArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.x, this.f);
    }

    /*
     * Unable to fully structure code
     */
    void X(boolean var1_1, uS var2_2) {
        var3_3 = wq_0.y();
        if (var3_3 != null) ** GOTO lbl6
        switch (WI.f[var2_2.ordinal()]) {
            default: {
                this.M(var1_1);
lbl6:
                // 2 sources

                if (var3_3 == null) break;
            }
            case 2: {
                this.A(var1_1);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void A(boolean var1_1) {
        block14: {
            block15: {
                var3_2 = this.x.toString();
                var4_3 = xo_0.a;
                var2_4 = wq_0.y();
                v0 = var1_1;
                if (var2_4 != null) ** GOTO lbl9
                if (v0 == 0) break block15;
                do {
                    block17: {
                        block16: {
                            v0 = this.f;
lbl9:
                            // 2 sources

                            if (v0 >= var3_2.length()) break;
                            v1 = (int)Character.isLetterOrDigit(var3_2.charAt(this.f));
                            if (var2_4 != null) ** GOTO lbl25
                            if (var2_4 != null) break block16;
                            if (v1 != 0) break block17;
                            v1 = var4_3.indexOf(var3_2.charAt(this.f));
                        }
                        v2 = -1;
                        if (var2_4 == null) {
                            if (v1 == v2) break;
                        }
                        ** GOTO lbl26
                    }
                    ++this.f;
                } while (var2_4 == null);
                do {
                    v1 = this.f;
lbl25:
                    // 2 sources

                    v2 = var3_2.length();
lbl26:
                    // 2 sources

                    if (v1 >= v2) break block14;
                    v3 = Character.isLetterOrDigit(var3_2.charAt(this.f));
                    if (var2_4 == null) {
                        if (v3 != 0) break block14;
                        v3 = var4_3.indexOf(var3_2.charAt(this.f));
                    }
                    if (v3 != -1) break block14;
                    ++this.f;
                } while (var2_4 == null);
            }
            --this.f;
            while (this.f >= 0) {
                v4 = (int)Character.isLetterOrDigit(var3_2.charAt(this.f));
                if (var2_4 == null && var2_4 == null) {
                    if (v4 != 0) break;
                    v4 = var4_3.indexOf(var3_2.charAt(this.f));
                    if (var2_4 == null) {
                        if (v4 != -1) break;
                        --this.f;
                        if (var2_4 == null) continue;
                    }
                }
                ** GOTO lbl48
            }
            do {
                block19: {
                    block18: {
                        v4 = this.f;
lbl48:
                        // 2 sources

                        if (v4 < 0) break;
                        v5 = Character.isLetterOrDigit(var3_2.charAt(this.f));
                        if (var2_4 != null) break block18;
                        if (v5 != 0) break block19;
                        v5 = var4_3.indexOf(var3_2.charAt(this.f));
                    }
                    if (v5 == -1) break;
                }
                --this.f;
            } while (var2_4 == null);
            ++this.f;
        }
    }

    private void M(boolean n10) {
        int n11;
        block10: {
            int n12;
            String string = this.x.toString();
            String[] stringArray = wq_0.y();
            int n13 = n10;
            if (stringArray == null) {
                if (n13 == 0) {
                    --this.f;
                }
                n13 = n12 = 0;
            }
            while (this.f >= 0) {
                block13: {
                    int n14;
                    block11: {
                        block12: {
                            char c2;
                            n11 = this.f;
                            if (stringArray != null) break block10;
                            if (stringArray == null) {
                                if (n11 >= string.length()) {
                                    return;
                                }
                                c2 = string.charAt(this.f);
                            }
                            void var5_5 = c2;
                            n14 = Character.isLetterOrDigit((char)var5_5);
                            if (stringArray != null) break block11;
                            if (n14 == 0) break block12;
                            n12 = 1;
                            if (stringArray == null) break block13;
                        }
                        n14 = n12;
                    }
                    if (n14 != 0 && stringArray == null) break;
                }
                int n15 = n10;
                if (stringArray == null) {
                    n15 = n15 != 0 ? 1 : -1;
                }
                this.f += n15;
                if (stringArray == null) continue;
            }
            n11 = n10;
        }
        if (n11 == 0) {
            ++this.f;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "L\f\u0000\u007fap=\u0018\u000eptt\nCB\u0016\u0001zfP\u001dZ\r".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 93;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 110;
                            break;
                        }
                        case 2: {
                            n17 = 2;
                            break;
                        }
                        case 3: {
                            n17 = 15;
                            break;
                        }
                        case 4: {
                            n17 = 18;
                            break;
                        }
                        case 5: {
                            n17 = 118;
                            break;
                        }
                        default: {
                            n17 = 61;
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
    }
}

