/*
 * Decompiled with CFR 0.152.
 */
package org.v;

/*
 * Renamed from org.v.Rd
 */
public final class rd_0
extends Enum {
    public static final rd_0 PRIVATE_MEMBERS_OF_ENCLOSING_AND_ENCLOSED_TYPES_INACCESSIBLE;
    public static final rd_0 EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED;
    private static final /* synthetic */ rd_0[] s;

    public static rd_0[] values() {
        return (rd_0[])s.clone();
    }

    public static rd_0 valueOf(String string) {
        return Enum.valueOf(rd_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rd_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ rd_0[] N() {
        return new rd_0[]{PRIVATE_MEMBERS_OF_ENCLOSING_AND_ENCLOSED_TYPES_INACCESSIBLE, EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u001eX(<\u000eRN\u0011G$'\rCY\u001dU.,\u0010CE\rF.9\u0006HL\u0011K/.\u0010CE\rF.9\nBT\u001aS1/\u001cYB\u0000K\")\nUX\u0007H-/)\u000bR18\nUX\u0007E/9\u0010OE\u0011^33\u0010QB\u001aB>8\nUD\u001bX\"/\u001cYJ\u0002F.=\nB";
            var5_3 = "\u001eX(<\u000eRN\u0011G$'\rCY\u001dU.,\u0010CE\rF.9\u0006HL\u0011K/.\u0010CE\rF.9\nBT\u001aS1/\u001cYB\u0000K\")\nUX\u0007H-/)\u000bR18\nUX\u0007E/9\u0010OE\u0011^33\u0010QB\u001aB>8\nUD\u001bX\"/\u001cYJ\u0002F.=\nB".length();
            var2_4 = 60;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 53;
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
                            v11 = 123;
                            break;
                        }
                        case 1: {
                            v11 = 63;
                            break;
                        }
                        case 2: {
                            v11 = 84;
                            break;
                        }
                        case 3: {
                            v11 = 95;
                            break;
                        }
                        case 4: {
                            v11 = 122;
                            break;
                        }
                        case 5: {
                            v11 = 51;
                            break;
                        }
                        default: {
                            v11 = 62;
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
        rd_0.PRIVATE_MEMBERS_OF_ENCLOSING_AND_ENCLOSED_TYPES_INACCESSIBLE = new rd_0(var0[0], 0);
        rd_0.EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED = new rd_0(var0[1], 1);
        rd_0.s = rd_0.N();
    }
}

