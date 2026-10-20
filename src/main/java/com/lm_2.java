/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.X4;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Type;

/*
 * Renamed from com.lm
 */
public class lm_2
implements ak_0,
X4 {
    public static final lm_2 m = new lm_2();

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var7_6 = var1_1.w;
                        var6_7 = nv_2.o();
                        var8_8 = (Character)var2_2;
                        try {
                            try {
                                v0 = var8_8;
                                if (var6_7 == null) break block12;
                                if (v0 != null) break block13;
                            }
                            catch (IOException v1) {
                                throw lm_2.a(v1);
                            }
                            var7_6.y("");
                            return;
                        }
                        catch (IOException v2) {
                            throw lm_2.a(v2);
                        }
                    }
                    v0 = var8_8;
                }
                var9_9 = v0.charValue();
                try {
                    try {
                        if (var6_7 == null) break block14;
                        if (var9_9 == '\u0000') {
                        }
                        ** GOTO lbl35
                    }
                    catch (IOException v3) {
                        throw lm_2.a(v3);
                    }
                    var7_6.y("\u0000");
                }
                catch (IOException v4) {
                    throw lm_2.a(v4);
                }
            }
            try {
                if (var6_7 != null) break block15;
lbl35:
                // 2 sources

                var7_6.y(var8_8.toString());
            }
            catch (IOException v5) {
                throw lm_2.a(v5);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Object object2 = yn_22.M();
        String string = nv_2.o();
        Object object3 = object2;
        if (string != null) {
            if (object3 == null) {
                return null;
            }
            object3 = object2;
        }
        Character c2 = B8.S(object3);
        return c2;
    }

    @Override
    public int j() {
        return 4;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

