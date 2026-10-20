/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.H2;
import com.IK;
import com.K2;
import com.KK;
import com.N9;
import com.WX;
import com.cw_1;
import com.dl_1;
import com.nl_1;
import com.ok_0;
import com.wr_2;
import com.wy_2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.nv
 */
public abstract class nv_2 {
    protected List J = null;
    protected List s = null;
    protected List m = null;
    protected List p = null;
    protected List U = null;
    protected List K = null;
    protected List d = null;
    protected List x = null;
    protected boolean Q = true;
    private static String o;

    public List z() {
        String string = nv_2.o();
        List list = this.J;
        if (string != null) {
            if (list == null) {
                this.J = new ArrayList();
                this.Q = false;
            }
            list = this.J;
        }
        return list;
    }

    public List K() {
        String string = nv_2.o();
        List list = this.s;
        if (string != null) {
            if (list == null) {
                this.s = new ArrayList();
                this.Q = false;
            }
            list = this.s;
        }
        return list;
    }

    public List Y() {
        String string = nv_2.o();
        List list = this.U;
        if (string != null) {
            if (list == null) {
                this.U = new ArrayList();
                this.Q = false;
            }
            list = this.U;
        }
        return list;
    }

    public List d() {
        String string = nv_2.o();
        List list = this.K;
        if (string != null) {
            if (list == null) {
                this.K = new ArrayList();
                this.Q = false;
            }
            list = this.K;
        }
        return list;
    }

    public List Z() {
        String string = nv_2.o();
        List list = this.d;
        if (string != null) {
            if (list == null) {
                this.d = new ArrayList();
                this.Q = false;
            }
            list = this.d;
        }
        return list;
    }

    public List w() {
        String string = nv_2.o();
        List list = this.m;
        if (string != null) {
            if (list == null) {
                this.m = new ArrayList();
                this.Q = false;
            }
            list = this.m;
        }
        return list;
    }

    public List p() {
        String string = nv_2.o();
        List list = this.x;
        if (string != null) {
            if (list == null) {
                this.x = new ArrayList();
                this.Q = false;
            }
            list = this.x;
        }
        return list;
    }

    public List A() {
        String string = nv_2.o();
        List list = this.p;
        if (string != null) {
            if (list == null) {
                this.p = new ArrayList();
                this.Q = false;
            }
            list = this.p;
        }
        return list;
    }

    public void a(wr_2 wr_22) {
        String string = nv_2.o();
        wr_2 wr_23 = wr_22;
        if (string != null) {
            if (wr_23 == null) {
                return;
            }
            wr_23 = wr_22;
        }
        boolean bl = wr_23 instanceof cw_1;
        if (string != null) {
            if (bl) {
                this.d().add((cw_1)wr_22);
            }
            bl = wr_22 instanceof WX;
        }
        if (string != null) {
            if (bl) {
                this.Y().add((WX)wr_22);
            }
            bl = wr_22 instanceof N9;
        }
        if (string != null) {
            if (bl) {
                this.A().add((N9)wr_22);
            }
            bl = wr_22 instanceof K2;
        }
        if (string != null) {
            if (bl) {
                this.p().add((K2)wr_22);
            }
            bl = wr_22 instanceof KK;
        }
        if (string != null) {
            if (bl) {
                this.w().add((KK)wr_22);
            }
            bl = wr_22 instanceof IK;
        }
        if (string != null) {
            if (bl) {
                this.z().add((IK)wr_22);
            }
            bl = wr_22 instanceof H2;
        }
        if (string != null) {
            if (bl) {
                this.K().add((H2)wr_22);
            }
            bl = wr_22 instanceof wy_2;
        }
        if (string != null && bl) {
            bl = this.Z().add((wy_2)wr_22);
        }
    }

    public boolean O(nl_1 nl_12, Object object, String string) {
        boolean bl;
        block6: {
            block12: {
                List list;
                String string2;
                block11: {
                    block7: {
                        block8: {
                            string2 = nv_2.o();
                            list = nl_12.K;
                            if (string2 == null) break block7;
                            if (list == null) break block8;
                            for (cw_1 cw_12 : nl_12.K) {
                                block10: {
                                    boolean bl2;
                                    block9: {
                                        bl = cw_12.G(nl_12, object, string);
                                        if (string2 == null) break block6;
                                        if (string2 == null) break block9;
                                        if (bl) break block10;
                                        bl2 = false;
                                    }
                                    return bl2;
                                }
                                if (string2 != null) continue;
                            }
                        }
                        list = this.K;
                    }
                    if (string2 == null) break block11;
                    if (list == null) break block12;
                    list = this.K;
                }
                for (cw_1 cw_12 : list) {
                    block14: {
                        boolean bl3;
                        block13: {
                            bl = cw_12.G(nl_12, object, string);
                            if (string2 == null) break block6;
                            if (string2 == null) break block13;
                            if (bl) break block14;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    if (string2 != null) continue;
                }
            }
            bl = true;
        }
        return bl;
    }

    public boolean d(nl_1 nl_12, Object object, String string, Object object2) {
        boolean bl;
        block6: {
            block12: {
                List list;
                String string2;
                block11: {
                    block7: {
                        block8: {
                            string2 = nv_2.o();
                            list = nl_12.m;
                            if (string2 == null) break block7;
                            if (list == null) break block8;
                            for (KK kK : nl_12.m) {
                                block10: {
                                    boolean bl2;
                                    block9: {
                                        bl = kK.P(object, string, object2);
                                        if (string2 == null) break block6;
                                        if (string2 == null) break block9;
                                        if (bl) break block10;
                                        bl2 = false;
                                    }
                                    return bl2;
                                }
                                if (string2 != null) continue;
                            }
                        }
                        list = this.m;
                    }
                    if (string2 == null) break block11;
                    if (list == null) break block12;
                    list = this.m;
                }
                for (KK kK : list) {
                    block14: {
                        boolean bl3;
                        block13: {
                            bl = kK.P(object, string, object2);
                            if (string2 == null) break block6;
                            if (string2 == null) break block13;
                            if (bl) break block14;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    if (string2 != null) continue;
                }
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected String i(nl_1 nl_12, Object object, String string, Object object2) {
        String string2;
        block10: {
            List list;
            String string3;
            block11: {
                string3 = nv_2.o();
                list = nl_12.U;
                if (string3 != null) {
                    if (list != null) {
                        for (WX wX : nl_12.U) {
                            string = wX.g(object, string, object2);
                            if (string3 != null) {
                                if (string3 != null) continue;
                            }
                            break block10;
                        }
                    }
                    list = this.U;
                }
                if (string3 == null) break block11;
                if (list == null) break block10;
                list = this.U;
            }
            for (WX wX : list) {
                string2 = wX.g(object, string, object2);
                if (string3 == null) return string2;
                string = string2;
                if (string3 != null) continue;
            }
        }
        string2 = string;
        return string2;
    }

    protected Object c(nl_1 nl_12, dl_1 dl_12, Object object, String string, Object object2) {
        return this.L(nl_12, dl_12, object, string, object2, 0);
    }

    /*
     * Unable to fully structure code
     */
    protected Object L(nl_1 var1_1, dl_1 var2_2, Object var3_3, String var4_4, Object var5_5, int var6_6) {
        block47: {
            block46: {
                block32: {
                    block33: {
                        block45: {
                            block44: {
                                block36: {
                                    block37: {
                                        block42: {
                                            block43: {
                                                block40: {
                                                    block41: {
                                                        block39: {
                                                            block38: {
                                                                block34: {
                                                                    block35: {
                                                                        var7_7 = nv_2.o();
                                                                        if (var5_5 == null) break block33;
                                                                        v0 = EP.a(var1_1.w.q, var6_6, EP.WriteNonStringValueAsString);
                                                                        if (var7_7 == null) break block34;
                                                                        if (v0) break block35;
                                                                        v1 = var2_2;
                                                                        if (var7_7 == null) break block36;
                                                                        if (v1 == null) break block37;
                                                                        v1 = var2_2;
                                                                        if (var7_7 == null) break block36;
                                                                        if ((v1.y() & EP.WriteNonStringValueAsString.mask) == 0) break block37;
                                                                    }
                                                                    v0 = var5_5 instanceof Number;
                                                                }
                                                                if (var7_7 == null) break block38;
                                                                if (v0) break block39;
                                                                v0 = var5_5 instanceof Boolean;
                                                            }
                                                            if (!v0) break block37;
                                                        }
                                                        var8_8 = null;
                                                        if (!(var5_5 instanceof Number)) break block40;
                                                        v2 = var2_2;
                                                        if (var7_7 == null) break block41;
                                                        if (v2 == null) break block40;
                                                        v2 = var2_2;
                                                    }
                                                    var8_8 = v2.Y();
                                                }
                                                v3 = var8_8;
                                                if (var7_7 == null) break block42;
                                                if (v3 == null) break block43;
                                                var5_5 = new DecimalFormat((String)var8_8).format(var5_5);
                                                if (var7_7 != null) break block42;
                                            }
                                            v3 = var5_5 = var5_5.toString();
                                        }
                                        if (var7_7 != null) break block33;
                                    }
                                    v1 = var2_2;
                                }
                                if (var7_7 == null) break block44;
                                if (v1 == null) break block33;
                                v1 = var2_2;
                            }
                            if (var7_7 == null) break block45;
                            if (!v1.U()) break block33;
                            v1 = var5_5;
                        }
                        var8_8 = (String)v1;
                        var5_5 = ok_0.X((String)var8_8);
                    }
                    v4 = var1_1.p;
                    if (var7_7 != null) {
                        if (v4 != null) {
                            var8_8 = var1_1.p.iterator();
                            while (var8_8.hasNext()) {
                                var9_9 = (N9)var8_8.next();
                                var5_5 = var9_9.q(var3_3, var4_4, var5_5);
                                if (var7_7 != null) continue;
                            }
                        }
                        v4 = this.p;
                    }
                    v5 = var8_8 = v4;
                    if (var7_7 != null) {
                        if (v5 != null) {
                            var9_9 = var8_8.iterator();
                            while (var9_9.hasNext()) {
                                var10_10 = (N9)var9_9.next();
                                var5_5 = var10_10.q(var3_3, var4_4, var5_5);
                                if (var7_7 != null) {
                                    if (var7_7 != null) continue;
                                }
                                break block32;
                            }
                        }
                        v5 = var1_1.x;
                    }
                    if (var7_7 == null) break block46;
                    if (v5 == null) break block32;
                    for (wr_2 var10_10 : var1_1.x) {
                        var5_5 = var10_10.F(var2_2, var3_3, var4_4, var5_5);
                        if (var7_7 != null) {
                            if (var7_7 != null) continue;
                        }
                        ** GOTO lbl-1000
                    }
                }
                v5 = this.x;
            }
            if (var7_7 != null) {
                ** if (v5 == null) goto lbl-1000
lbl-1000:
                // 2 sources

                {
                    for (wr_2 var10_10 : this.x) {
                        v5 = var10_10.F((dl_1)var2_2, (Object)var3_3, (String)var4_4, (Object)var5_5);
                        if (var7_7 != null) {
                            var5_5 = v5;
                            if (var7_7 != null) continue;
                        } else {
                            ** GOTO lbl90
                        }
lbl90:
                        // 2 sources

                        ** GOTO lbl93
                    }
                }
            }
            break block47;
lbl-1000:
            // 4 sources

            {
                v5 = var5_5;
            }
        }
        return v5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean q(nl_1 nl_12) {
        String string = nv_2.o();
        boolean bl = nl_12.w.D;
        if (string != null) {
            if (!bl) return false;
            bl = this.Q;
        }
        if (string != null) {
            if (!bl) return false;
            bl = nl_12.Q;
        }
        if (string == null) return bl;
        if (!bl) return false;
        return true;
    }

    public static void J(String string) {
        o = string;
    }

    public static String o() {
        return o;
    }

    static {
        if (nv_2.o() == null) {
            nv_2.J("b2xtYb");
        }
    }
}

