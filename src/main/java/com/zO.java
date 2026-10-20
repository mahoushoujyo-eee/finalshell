/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

public class zO
implements ak_0 {
    public static final zO g = new zO();
    private DecimalFormat m = null;

    public zO() {
    }

    public zO(DecimalFormat decimalFormat) {
        this.m = decimalFormat;
    }

    public zO(String string) {
        this(new DecimalFormat(string));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block23: {
            block24: {
                block21: {
                    block19: {
                        block20: {
                            var7_6 = var1_1.w;
                            var6_7 = nv_2.o();
                            try {
                                try {
                                    v0 = var2_2;
                                    if (var6_7 == null) break block19;
                                    if (v0 != null) break block20;
                                }
                                catch (IOException v1) {
                                    throw zO.a(v1);
                                }
                                var7_6.x(EP.WriteNullNumberAsZero);
                                return;
                            }
                            catch (IOException v2) {
                                throw zO.a(v2);
                            }
                        }
                        v0 = var2_2;
                    }
                    var8_8 = (Double)v0;
                    try {
                        block22: {
                            try {
                                try {
                                    if (var6_7 == null) break block21;
                                    if (Double.isNaN(var8_8)) break block22;
                                }
                                catch (IOException v3) {
                                    throw zO.a(v3);
                                }
                                if (Double.isInfinite(var8_8)) {
                                }
                                ** GOTO lbl43
                            }
                            catch (IOException v4) {
                                throw zO.a(v4);
                            }
                        }
                        var7_6.Y();
                    }
                    catch (IOException v5) {
                        throw zO.a(v5);
                    }
                }
                try {
                    block25: {
                        try {
                            try {
                                try {
                                    if (var6_7 != null) break block23;
lbl43:
                                    // 2 sources

                                    v6 = this.m;
                                    if (var6_7 == null) break block24;
                                }
                                catch (IOException v7) {
                                    throw zO.a(v7);
                                }
                                if (v6 != null) break block25;
                            }
                            catch (IOException v8) {
                                throw zO.a(v8);
                            }
                            var7_6.B(var8_8, true);
                            if (var6_7 != null) break block23;
                        }
                        catch (IOException v9) {
                            throw zO.a(v9);
                        }
                    }
                    v6 = this.m;
                }
                catch (IOException v10) {
                    throw zO.a(v10);
                }
            }
            var10_9 = v6.format(var8_8);
            var7_6.write(var10_9);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

