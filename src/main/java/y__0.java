/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.c;
import com.ky_2;
import com.pc_0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/*
 * Renamed from y_
 */
public class y__0 {
    /*
     * Unable to fully structure code
     */
    public static void v(ArrayList var0, DI var1_1) {
        var3_2 = var0.iterator();
        var2_3 = YE.n();
        while (var3_2.hasNext()) {
            block60: {
                block61: {
                    block59: {
                        block58: {
                            block57: {
                                var4_4 = (YE)var3_2.next();
                                var5_5 = null;
                                try {
                                    v0 = (String)var4_4.B();
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                if (var2_3 != null) break block57;
                                try {
                                    block62: {
                                        try {
                                            v2 = (Boolean)lk_0.Y(v0);
                                        }
                                        catch (InvocationTargetException v3) {
                                            throw v3.getTargetException();
                                        }
                                        if (v2) break block58;
                                        break block62;
                                        catch (pc_0 v4) {
                                            throw y__0.a(v4);
                                        }
                                    }
                                    try {
                                        v0 = (String)var4_4.B();
                                    }
                                    catch (InvocationTargetException v5) {
                                        throw v5.getTargetException();
                                    }
                                }
                                catch (pc_0 v6) {
                                    throw y__0.a(v6);
                                }
                            }
                            var5_5 = v0;
                        }
                        try {
                            try {
                                v7 = (Integer)var4_4.O();
                            }
                            catch (InvocationTargetException v8) {
                                throw v8.getTargetException();
                            }
                            v9 = YE.A;
                            if (var2_3 != null) break block59;
                            if (v7 == v9) {
                            }
                            ** GOTO lbl73
                        }
                        catch (pc_0 v10) {
                            throw y__0.a(v10);
                        }
                        try {
                            try {
                                v11 = (Integer)var4_4.r();
                            }
                            catch (InvocationTargetException v12) {
                                throw v12.getTargetException();
                            }
                            try {
                                v13 = (String)var4_4.A();
                            }
                            catch (InvocationTargetException v14) {
                                throw v14.getTargetException();
                            }
                            try {
                                v15 = (Integer)var4_4.D();
                            }
                            catch (InvocationTargetException v16) {
                                throw v16.getTargetException();
                            }
                            var1_1.O(var5_5, v11, v13, v15, false);
                            break block60;
                        }
                        catch (pc_0 var6_7) {
                            try {
                                if (var2_3 == null) break block60;
lbl73:
                                // 2 sources

                                try {
                                    v7 = (Integer)var4_4.O();
                                }
                                catch (InvocationTargetException v17) {
                                    throw v17.getTargetException();
                                }
                                v9 = YE.H;
                            }
                            catch (pc_0 v18) {
                                throw y__0.a(v18);
                            }
                        }
                    }
                    try {
                        if (var2_3 != null) break block61;
                        if (v7 == v9) {
                        }
                        ** GOTO lbl112
                    }
                    catch (pc_0 v19) {
                        throw y__0.a(v19);
                    }
                    try {
                        try {
                            v20 = (Integer)var4_4.r();
                        }
                        catch (InvocationTargetException v21) {
                            throw v21.getTargetException();
                        }
                        try {
                            v22 = (String)var4_4.A();
                        }
                        catch (InvocationTargetException v23) {
                            throw v23.getTargetException();
                        }
                        try {
                            v24 = (Integer)var4_4.D();
                        }
                        catch (InvocationTargetException v25) {
                            throw v25.getTargetException();
                        }
                        var1_1.E(var5_5, v20, v22, v24);
                        break block60;
                    }
                    catch (pc_0 var6_8) {
                        if (var2_3 == null) break block60;
lbl112:
                        // 2 sources

                        try {
                            block63: {
                                try {
                                    v7 = (Integer)var4_4.O();
                                }
                                catch (InvocationTargetException v26) {
                                    throw v26.getTargetException();
                                }
                                if (var2_3 != null) break block60;
                                break block63;
                                catch (pc_0 v27) {
                                    throw y__0.a(v27);
                                }
                            }
                            v9 = YE.e;
                        }
                        catch (pc_0 v28) {
                            throw y__0.a(v28);
                        }
                    }
                }
                if (v7 == v9) {
                    try {
                        try {
                            v29 = (Integer)var4_4.r();
                        }
                        catch (InvocationTargetException v30) {
                            throw v30.getTargetException();
                        }
                        try {
                            v31 = (String)var4_4.A();
                        }
                        catch (InvocationTargetException v32) {
                            throw v32.getTargetException();
                        }
                        try {
                            v33 = (Integer)var4_4.D();
                        }
                        catch (InvocationTargetException v34) {
                            throw v34.getTargetException();
                        }
                        v7 = var1_1.O(var5_5, v29, v31, v33, true);
                    }
                    catch (pc_0 var6_9) {
                        // empty catch block
                    }
                }
            }
            if (var2_3 == null) continue;
        }
        try {
            if (ky_2.F() != null) {
                YE.W(new int[2]);
            }
        }
        catch (pc_0 v35) {
            throw y__0.a(v35);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void j(ArrayList var0, DI var1_1) {
        var3_2 = var0.iterator();
        var2_3 = YE.n();
        while (var3_2.hasNext()) {
            block32: {
                block31: {
                    block29: {
                        block30: {
                            var4_4 = (YE)var3_2.next();
                            try {
                                try {
                                    v0 = (Integer)var4_4.O();
                                }
                                catch (InvocationTargetException v1) {
                                    throw v1.getTargetException();
                                }
                                v2 = YE.A;
                                if (var2_3 != null) break block29;
                                if (v0 != v2) break block30;
                            }
                            catch (pc_0 v3) {
                                throw y__0.a(v3);
                            }
                            try {
                                try {
                                    v4 = (Integer)var4_4.r();
                                }
                                catch (InvocationTargetException v5) {
                                    throw v5.getTargetException();
                                }
                                var1_1.Z(v4);
                            }
                            catch (pc_0 var5_6) {
                                try {
                                    var5_6.printStackTrace();
                                    if (var2_3 == null) ** GOTO lbl86
                                    ky_2.K(new String[3]);
                                }
                                catch (pc_0 v6) {
                                    throw y__0.a(v6);
                                }
                            }
                        }
                        try {
                            v0 = (Integer)var4_4.O();
                        }
                        catch (InvocationTargetException v7) {
                            throw v7.getTargetException();
                        }
                        v2 = YE.H;
                    }
                    try {
                        if (var2_3 != null) break block31;
                        if (v0 == v2) {
                        }
                        ** GOTO lbl64
                    }
                    catch (pc_0 v8) {
                        throw y__0.a(v8);
                    }
                    try {
                        try {
                            v9 = (Integer)var4_4.r();
                        }
                        catch (InvocationTargetException v10) {
                            throw v10.getTargetException();
                        }
                        var1_1.u(v9);
                        break block32;
                    }
                    catch (pc_0 var5_7) {
                        try {
                            var5_7.printStackTrace();
                            if (var2_3 == null) break block32;
lbl64:
                            // 2 sources

                            try {
                                v0 = (Integer)var4_4.O();
                            }
                            catch (InvocationTargetException v11) {
                                throw v11.getTargetException();
                            }
                            v2 = YE.e;
                        }
                        catch (pc_0 v12) {
                            throw y__0.a(v12);
                        }
                    }
                }
                if (v0 == v2) {
                    try {
                        try {
                            v13 = (Integer)var4_4.r();
                        }
                        catch (InvocationTargetException v14) {
                            throw v14.getTargetException();
                        }
                        var1_1.Z(v13);
                    }
                    catch (pc_0 var5_8) {
                        var5_8.printStackTrace();
                    }
                }
            }
            if (var2_3 == null) continue;
        }
    }

    private static pc_0 a(pc_0 pc_02) {
        return pc_02;
    }
}

