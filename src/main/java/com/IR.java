/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EC;
import com.GS;
import com.NZ;
import com.O2;
import com.OT;
import com.PX;
import com.QT;
import com.R3;
import com.WZ;
import com.XE;
import com.XQ;
import com.YP;
import com.YT;
import com._y_0;
import com.ab_0;
import com.c;
import com.dc_1;
import com.dv_1;
import com.dx_2;
import com.eo_0;
import com.gl_0;
import com.im_2;
import com.in_2;
import com.iy_1;
import com.j_0;
import com.ky_2;
import com.lc_2;
import com.nk_2;
import com.on_2;
import com.ov_2;
import com.pd_1;
import com.pg_1;
import com.rh_0;
import com.rp_1;
import com.sd_0;
import com.wf_1;
import com.xc_0;
import com.xf_1;
import com.xv_1;
import com.yi_1;
import com.yw_0;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IR
implements QT,
iy_1,
ab_0 {
    private static Logger f;
    private static int a;
    private static int d;
    private int P;
    private int Z;
    private volatile int k = 0;
    private volatile int V = 1;
    private int A;
    private int S;
    private dv_1 N;
    private im_2 O;
    private ov_2 j;
    private XQ U = null;
    private EnumSet w = EnumSet.noneOf(NZ.class);
    private nk_2 W;
    private Stack Y = new Stack();
    private xv_1 G;
    private R3 F;
    private on_2 e = on_2.MOUSE_FORMAT_XTERM;
    @Nullable
    private pd_1 D = null;
    private YT d2 = YT.MOUSE_REPORTING_NONE;
    private XE p = null;
    private boolean o;
    _y_0 r;
    String z;
    String c;
    String m;
    int B;
    StringBuffer i = new StringBuffer();
    ArrayList u = new ArrayList();
    String H;
    String X;
    boolean t = true;
    boolean K = false;
    boolean Q = false;
    long b;
    Thread L;
    int g = -1;
    int M = 0;
    long I;
    boolean J = true;
    String h;
    boolean dD = false;
    long R;
    String n = "";
    boolean y = true;
    String q;
    Object T = new Object();
    boolean dH = false;
    String E = "";
    private List l = new CopyOnWriteArrayList();
    int C = 0;
    long s;
    int v = IR.a(25172, 5946706806784439709L);
    private XQ x = null;
    private static final String[] ab;
    private static final String[] bb;
    private static final long[] cb;
    private static final Integer[] db;
    private static final long eb;

    public String i() {
        return this.H;
    }

    public String u() {
        return this.X;
    }

    public String U() {
        return this.h;
    }

    public IR(dv_1 dv_12, im_2 im_22, ov_2 ov_22) {
        this.W = new nk_2(GS.t());
        this.N = dv_12;
        this.O = im_22;
        this.j = ov_22;
        this.A = dv_12.U();
        this.S = dv_12.L();
        this.P = 1;
        boolean bl = j_0.P();
        try {
            this.Z = this.S;
            this.G = new xc_0(this.A);
            this.F = new R3();
            this.V();
            if (bl) {
                ky_2.K(new String[2]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IR.a(illegalArgumentException);
        }
    }

    public void G(_y_0 _y_02) {
        this.r = _y_02;
    }

    public void A() {
        IR iR;
        block4: {
            block5: {
                this.O.W();
                boolean bl = j_0.P();
                this.O.c();
                boolean bl2 = bl;
                try {
                    try {
                        iR = this;
                        if (bl2) break block4;
                        if (iR.L == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.L.interrupt();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR = this;
        }
        iR.I();
    }

    public void y() {
        block5: {
            QT qT;
            block4: {
                boolean bl = j_0.P();
                try {
                    try {
                        qT = this;
                        if (bl) break block4;
                        if (!qT.dH) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.dH = false;
                    this.L.interrupt();
                    this.d(0);
                    this.r.O().K();
                    this.r.O().a(IR.a(-2816, -6100));
                    qT = this.r.O();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            qT.K();
        }
    }

    public void l() {
        block5: {
            IR iR;
            block4: {
                boolean bl = j_0.g();
                try {
                    try {
                        iR = this;
                        if (!bl) break block4;
                        if (iR.dH) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.N.G(true);
                    this.N.N(true);
                    this.dH = true;
                    this.n = "";
                    this.R = 0L;
                    this.h = "";
                    this.L = new gl_0(this);
                    iR = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR.L.start();
        }
    }

    void G() {
    }

    void N(String string) {
    }

    public boolean z(NZ nZ2) {
        return this.w.contains((Object)nZ2);
    }

    @Override
    public void x() {
        this.N(IR.a(-2795, -12347));
        this.t = false;
        this.N.G(true);
        this.N.N(false);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void k(String var1_1) {
        block14: {
            var3_2 = this.k;
            this.b = System.currentTimeMillis();
            var2_3 = j_0.P();
            try {
                block15: {
                    block13: {
                        this.u(this.l(var1_1));
                        var4_4 = this.O.D(this.V - 2);
                        var5_6 = this.O.D(this.V - 1);
                        var6_7 = var5_6.V();
                        var7_8 = var4_4.V();
                        v0 = this.t;
                        if (var2_3) break block13;
                        try {
                            block16: {
                                if (v0) break block14;
                                break block16;
                                catch (Exception v1) {
                                    throw IR.a(v1);
                                }
                            }
                            v0 = var6_7.contains("@") & var6_7.contains(IR.a(-2807, -25050));
                        }
                        catch (Exception v2) {
                            throw IR.a(v2);
                        }
                    }
                    if (var2_3) break block15;
                    try {
                        block17: {
                            if (v0) ** GOTO lbl39
                            break block17;
                            catch (Exception v3) {
                                throw IR.a(v3);
                            }
                        }
                        v0 = var6_7.contains("@") & var6_7.contains("$");
                    }
                    catch (Exception v4) {
                        throw IR.a(v4);
                    }
                }
                try {
                    if (!v0) break block14;
lbl39:
                    // 2 sources

                    this.t = true;
                }
                catch (Exception v5) {
                    throw IR.a(v5);
                }
            }
            catch (Exception var4_5) {
                var4_5.printStackTrace();
            }
        }
        this.E = var1_1;
    }

    public void L(String string) {
        block6: {
            this.K = true;
            this.H = string;
            String string2 = string;
            Iterator iterator = this.u.iterator();
            boolean bl = j_0.g();
            while (iterator.hasNext()) {
                String string3;
                String string4 = (String)iterator.next();
                try {
                    string3 = (String)lk_0.I((Object)string2, (Object)string4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                string2 = string3;
                try {
                    if (bl) {
                        if (bl) continue;
                        break;
                    }
                    break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            this.X = string2;
        }
    }

    void l(String string) {
        String string2 = "";
        if (!string.startsWith("/")) {
            // empty if block
        }
    }

    @Override
    public void o(NZ nZ2, boolean bl) {
        block6: {
            boolean bl2 = j_0.g();
            try {
                boolean bl3;
                block7: {
                    try {
                        try {
                            bl3 = bl;
                            if (!bl2) break block6;
                            if (!bl3) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        this.w.add(nZ2);
                        if (bl2) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                bl3 = this.w.remove((Object)nZ2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IR.a(illegalArgumentException);
            }
        }
        nZ2.r(this, bl);
    }

    private void f() {
        block9: {
            IR iR;
            block10: {
                int n10;
                block8: {
                    boolean bl = j_0.g();
                    try {
                        try {
                            try {
                                n10 = this.k;
                                if (!bl) break block8;
                                if (n10 < this.A) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            this.k = 0;
                            this.O.D(this.V - 1).d(this.A);
                            iR = this;
                            if (!bl) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        n10 = iR.Q() ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    if (n10 == 0) break block9;
                    this.O.D(this.V - 1).M(true);
                    iR = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            ++iR.V;
        }
    }

    private void E() {
        this.N.x(this.k, this.V);
        this.d();
    }

    /*
     * Loose catch block
     */
    private void u(char[] cArray) {
        block20: {
            boolean bl = j_0.P();
            this.O.w();
            boolean bl2 = bl;
            try {
                int n10;
                block18: {
                    block19: {
                        block24: {
                            block23: {
                                block22: {
                                    block21: {
                                        n10 = this.o;
                                        if (bl2) break block18;
                                        if (n10 == 0) break block19;
                                        break block21;
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IR.a(illegalArgumentException);
                                        }
                                    }
                                    n10 = cArray.length;
                                    if (bl2) break block18;
                                    break block22;
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                }
                                if (n10 <= 0) break block19;
                                break block23;
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                            }
                            this.o = false;
                            n10 = this.V;
                            if (bl2) break block18;
                            break block24;
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                        }
                        try {
                            block25: {
                                if (n10 <= 1) break block19;
                                break block25;
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                            }
                            this.O.D(this.V - 2).M(false);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    try {
                        this.f();
                        this.d();
                        if (bl2) break block20;
                        n10 = cArray.length;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                if (n10 != 0) {
                    j_0 j_02 = this.j(cArray);
                    this.O.h(this.k, this.V, j_02);
                    this.k += j_02.length();
                }
                this.E();
            }
            finally {
                this.O.h();
            }
        }
    }

    @Override
    public void v(char[] cArray) throws UnsupportedEncodingException {
        this.k(new String(cArray, 0, 2));
    }

    private char[] l(String string) {
        StringBuilder stringBuilder;
        block4: {
            StringBuilder stringBuilder2 = new StringBuilder();
            char[] cArray = string.toCharArray();
            int n10 = cArray.length;
            boolean bl = j_0.P();
            for (int i2 = 0; i2 < n10; ++i2) {
                char c2 = cArray[i2];
                try {
                    stringBuilder = stringBuilder2.append(this.F.U(c2));
                    if (!bl) {
                        if (!bl) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString().toCharArray();
    }

    @Override
    public void a(String string) {
        int n10;
        int n11 = string.length();
        boolean bl = j_0.g();
        for (int i2 = 0; i2 < n11; i2 += n10) {
            n10 = Math.min(this.w(), n11 - i2);
            this.k(string.substring(i2, i2 + n10));
            this.f();
            this.d();
            if (bl) continue;
        }
    }

    public void d() {
        boolean bl = j_0.P();
        this.O.w();
        boolean bl2 = bl;
        try {
            IR iR;
            block11: {
                int n10;
                int n11;
                block9: {
                    block10: {
                        try {
                            n11 = this.V;
                            n10 = this.Z;
                            if (bl2) break block9;
                            if (n11 <= n10) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        int n12 = this.Z - this.V;
                        this.V = this.Z;
                        this.d(this.P, this.x(), n12);
                        this.N.x(this.k, this.V);
                    }
                    try {
                        iR = this;
                        if (bl2) break block11;
                        n11 = iR.V;
                        n10 = this.P;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    if (n11 < n10) {
                        this.V = this.P;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
                iR = this;
            }
            iR.O.h();
        }
        catch (Throwable throwable) {
            this.O.h();
            throw throwable;
        }
    }

    public void S() {
        this.D();
        this.M();
    }

    @Override
    public void M() {
        IR iR;
        block4: {
            block5: {
                boolean bl = j_0.P();
                this.o = true;
                ++this.V;
                this.d();
                boolean bl2 = bl;
                try {
                    try {
                        iR = this;
                        if (bl2) break block4;
                        if (!iR.V()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.D();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR = this;
        }
        iR.N.x(this.k, this.V);
    }

    @Override
    public void R(int n10) {
        this.F.f(n10);
    }

    @Override
    public void Q(int n10) {
        this.F.o(n10);
    }

    @Override
    public void K(int n10, char c2) {
        PX pX = this.F.D(n10);
        this.F.k(pX, c2);
    }

    @Override
    public void X(int n10) {
        this.F.F(n10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l(int var1_1) {
        block18: {
            block17: {
                block15: {
                    var2_2 = j_0.g();
                    try {
                        block16: {
                            try {
                                try {
                                    try {
                                        if (!var2_2) break block15;
                                        if (var1_1 == 1) break block16;
                                    }
                                    catch (IllegalArgumentException v0) {
                                        throw IR.a(v0);
                                    }
                                    v1 = var1_1;
                                    v2 = 2;
                                    if (!var2_2) break block17;
                                }
                                catch (IllegalArgumentException v3) {
                                    throw IR.a(v3);
                                }
                                if (v1 == v2) {
                                }
                                ** GOTO lbl33
                            }
                            catch (IllegalArgumentException v4) {
                                throw IR.a(v4);
                            }
                        }
                        this.F.E(0, pg_1.ASCII);
                        this.F.E(1, pg_1.DEC_SUPPLEMENTAL);
                        this.R(0);
                        this.Q(1);
                    }
                    catch (IllegalArgumentException v5) {
                        throw IR.a(v5);
                    }
                }
                try {
                    if (var2_2) break block18;
lbl33:
                    // 2 sources

                    v1 = var1_1;
                    v2 = 3;
                }
                catch (IllegalArgumentException v6) {
                    throw IR.a(v6);
                }
            }
            try {
                block19: {
                    try {
                        if (v1 != v2) break block19;
                        this.K(0, (char)IR.a(24257, 7286141354745268492L));
                        this.R(0);
                        if (var2_2) break block18;
                    }
                    catch (IllegalArgumentException v7) {
                        throw IR.a(v7);
                    }
                }
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException v8) {
                throw IR.a(v8);
            }
        }
    }

    @Override
    public void X(String string) {
        this.N.Y(string);
    }

    @Override
    public void v() {
        String string = this.N.U();
        this.Y.push(string);
    }

    @Override
    public void C() {
        block5: {
            Stack stack;
            block4: {
                boolean bl = j_0.P();
                try {
                    try {
                        stack = this.Y;
                        if (bl) break block4;
                        if (stack.empty()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    stack = this.Y.pop();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            String string = (String)((Object)stack);
            this.N.Y(string);
        }
    }

    @Override
    @Nullable
    public xf_1 D() {
        return this.N.k();
    }

    @Override
    @Nullable
    public xf_1 r() {
        return this.N.T();
    }

    @Override
    public void X(@NotNull rh_0 rh_02) {
        this.l.add(rh_02);
    }

    @Override
    public void c(@NotNull List list) {
        Iterator iterator = this.l.iterator();
        boolean bl = j_0.g();
        while (iterator.hasNext()) {
            rh_0 rh_02 = (rh_0)iterator.next();
            rh_02.B(list);
            if (bl) continue;
        }
    }

    @Override
    public void Q() {
        IR iR;
        block4: {
            block5: {
                --this.k;
                boolean bl = j_0.g();
                try {
                    try {
                        iR = this;
                        if (!bl) break block4;
                        if (iR.k >= 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    --this.V;
                    this.k = this.A - 1;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            this.m(-1);
            iR = this;
        }
        iR.N.x(this.k, this.V);
    }

    @Override
    public void D() {
        this.k = 0;
        this.N.x(this.k, this.V);
        this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void i() {
        var2_1 = this.T;
        synchronized (var2_1) {
            block44: {
                block45: {
                    block42: {
                        block43: {
                            block39: {
                                block41: {
                                    block40: {
                                        block38: {
                                            block46: {
                                                block37: {
                                                    block35: {
                                                        block36: {
                                                            var1_2 = j_0.g();
                                                            this.dD = true;
                                                            var3_3 = this.O.D(this.V + 1);
                                                            var4_4 = var3_3.V().trim();
                                                            try {
                                                                v0 = var4_4.equals("");
                                                                if (!var1_2) break block35;
                                                                if (v0) break block36;
                                                            }
                                                            catch (IllegalArgumentException v1) {
                                                                throw IR.a(v1);
                                                            }
                                                            return;
                                                        }
                                                        try {
                                                            v2 = this.r.O();
                                                            if (!var1_2) break block37;
                                                            v0 = v2.V();
                                                        }
                                                        catch (IllegalArgumentException v3) {
                                                            throw IR.a(v3);
                                                        }
                                                    }
                                                    try {
                                                        if (v0) {
                                                            this.J = true;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException v4) {
                                                        throw IR.a(v4);
                                                    }
                                                    v2 = this.r.O();
                                                }
                                                var5_5 = v2.c();
                                                v5 = var5_5;
                                                if (!var1_2) break block38;
                                                if (v5 != null) ** GOTO lbl49
                                                break block46;
                                                catch (IllegalArgumentException v6) {
                                                    throw IR.a(v6);
                                                }
                                            }
                                            try {
                                                block47: {
                                                    this.J = false;
                                                    if (var1_2) break block39;
                                                    break block47;
                                                    catch (IllegalArgumentException v7) {
                                                        throw IR.a(v7);
                                                    }
                                                }
                                                v5 = var5_5;
                                            }
                                            catch (IllegalArgumentException v8) {
                                                throw IR.a(v8);
                                            }
                                        }
                                        var6_6 = v5.getKeyCode();
                                        var7_7 = System.currentTimeMillis() - this.R;
                                        v9 = var6_6;
                                        v10 = IR.a(9464, 4750108676163662648L);
                                        if (!var1_2) break block40;
                                        try {
                                            block48: {
                                                if (v9 == v10) ** GOTO lbl89
                                                break block48;
                                                catch (IllegalArgumentException v11) {
                                                    throw IR.a(v11);
                                                }
                                            }
                                            v9 = var5_5.getKeyCode();
                                            v10 = IR.a(16727, 7889870025155188373L);
                                        }
                                        catch (IllegalArgumentException v12) {
                                            throw IR.a(v12);
                                        }
                                    }
                                    if (!var1_2) break block41;
                                    try {
                                        block49: {
                                            if (v9 != v10) break block39;
                                            break block49;
                                            catch (IllegalArgumentException v13) {
                                                throw IR.a(v13);
                                            }
                                        }
                                        v9 = var5_5.getModifiers();
                                        v10 = 2;
                                    }
                                    catch (IllegalArgumentException v14) {
                                        throw IR.a(v14);
                                    }
                                }
                                try {
                                    if ((v9 & v10) == 0) break block39;
lbl89:
                                    // 2 sources

                                    this.J = false;
                                }
                                catch (IllegalArgumentException v15) {
                                    throw IR.a(v15);
                                }
                            }
                            v16 = this;
                            if (!var1_2) break block42;
                            try {
                                block50: {
                                    if (v16.h != null) break block43;
                                    break block50;
                                    catch (IllegalArgumentException v17) {
                                        throw IR.a(v17);
                                    }
                                }
                                this.J = false;
                            }
                            catch (IllegalArgumentException v18) {
                                throw IR.a(v18);
                            }
                        }
                        v16 = this;
                    }
                    if (!var1_2) break block44;
                    try {
                        block51: {
                            if (v16.J) break block45;
                            break block51;
                            catch (IllegalArgumentException v19) {
                                throw IR.a(v19);
                            }
                        }
                        this.R = System.currentTimeMillis();
                    }
                    catch (IllegalArgumentException v20) {
                        throw IR.a(v20);
                    }
                }
                this.R();
                this.dD = false;
                v16 = var2_1;
            }
            // ** MonitorExit[v16] (shouldn't be in output)
            return;
        }
    }

    void R() {
        block50: {
            int n10;
            block53: {
                int n11;
                block52: {
                    Object object;
                    Object object2;
                    Object object3;
                    Object object4;
                    boolean bl;
                    block54: {
                        block55: {
                            String string;
                            int n12;
                            String string2;
                            int n13;
                            block51: {
                                KeyEvent keyEvent;
                                block49: {
                                    String string3;
                                    dc_1 dc_12;
                                    block47: {
                                        dc_1 dc_13;
                                        block48: {
                                            n13 = this.V - 1;
                                            dc_13 = this.O.D(n13);
                                            bl = j_0.P();
                                            string2 = dc_13.V();
                                            dc_1 dc_14 = this.O.D(this.V - 2);
                                            int n14 = this.V - 2;
                                            try {
                                                dc_12 = dc_14;
                                                if (bl) break block47;
                                                if (!dc_12.G()) break block48;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IR.a(illegalArgumentException);
                                            }
                                            string3 = dc_14.V();
                                            string2 = string3 + string2;
                                            dc_14 = this.O.D(n14);
                                            --n14;
                                        }
                                        dc_12 = dc_13;
                                    }
                                    string3 = dc_12.V();
                                    string3 = string2;
                                    KeyEvent keyEvent2 = this.r.O().c();
                                    try {
                                        keyEvent = keyEvent2;
                                        if (bl) break block49;
                                        if (keyEvent == null) break block50;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    keyEvent = keyEvent2;
                                }
                                n12 = keyEvent.getKeyCode();
                                n11 = 0;
                                try {
                                    try {
                                        string = this.h;
                                        if (bl) break block51;
                                        if (string == null) break block52;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    string = this.h;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        n10 = string.equals("");
                                        if (bl) break block53;
                                        if (n10 != 0) break block52;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    n10 = n12;
                                    if (bl) break block53;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                if (n10 != IR.a(9464, 4750108676163662648L)) break block52;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            int n15 = this.h.length();
                            int n16 = string2.indexOf(this.h);
                            try {
                                try {
                                    String string3;
                                    try {
                                        n10 = n16;
                                        if (bl) break block53;
                                        if (n10 <= -1) break block52;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    this.z = string2.substring(n15);
                                    try {
                                        string3 = (String)lk_0.L(this.z);
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    this.z = string3.trim();
                                    this.z.replace("\n", "");
                                    this.B = this.O.H() + n13;
                                    n10 = this.z.trim().equals("") ? 1 : 0;
                                    if (bl) break block53;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                if (n10 != 0) break block52;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            char c2 = IR.a(20383, 4107335223896741982L);
                            try {
                                n10 = this.z.contains(c2 + "") ? 1 : 0;
                                if (bl) break block53;
                                if (n10 != 0) break block52;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            n11 = 1;
                            try {
                                try {
                                    this.Q = false;
                                    long l2 = System.currentTimeMillis() - this.s - eb;
                                    n10 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                    if (bl) break block54;
                                    if (n10 <= 0) break block55;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                this.C = 0;
                                this.s = System.currentTimeMillis();
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                        }
                        n10 = ++this.C;
                    }
                    try {
                        if (bl) break block53;
                        if (n10 > this.v) break block52;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    L1 l1 = new L1("", this.z);
                    try {
                        l1.m(0);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object4 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object3 = object4.h();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2 = object3.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object2.h(l1);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object.S();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.r.O().b(true);
                }
                n10 = n11;
            }
            try {
                if (n10 != 0) {
                    this.y = false;
                    this.i = new StringBuffer();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IR.a(illegalArgumentException);
            }
        }
    }

    public void x(String string, String string2) {
        this.i.append(string2 + "\n");
    }

    public void r(String string) {
        block44: {
            F6 f62;
            String string2;
            String string3;
            IR iR;
            String string4;
            block42: {
                block43: {
                    boolean bl;
                    boolean bl2;
                    block40: {
                        block41: {
                            String string5;
                            block39: {
                                int n10;
                                String string6;
                                block38: {
                                    String string7;
                                    block35: {
                                        int n11;
                                        String string8;
                                        int n12;
                                        int n13;
                                        block36: {
                                            int n14;
                                            block34: {
                                                string6 = "";
                                                bl2 = j_0.P();
                                                this.z = this.z.trim();
                                                n13 = this.z.indexOf(" ");
                                                string7 = null;
                                                try {
                                                    try {
                                                        n14 = n13;
                                                        if (bl2) break block34;
                                                        if (n14 <= -1) break block35;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IR.a(illegalArgumentException);
                                                    }
                                                    n14 = -1;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IR.a(illegalArgumentException);
                                                }
                                            }
                                            n12 = n14;
                                            for (int i2 = n13; i2 < this.z.length(); ++i2) {
                                                int n15;
                                                block37: {
                                                    try {
                                                        try {
                                                            try {
                                                                string8 = this.z;
                                                                n11 = i2;
                                                                if (bl2) break block36;
                                                                n15 = string8.charAt(n11);
                                                                if (bl2) break block37;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw IR.a(illegalArgumentException);
                                                            }
                                                            if (n15 == IR.a(13304, 4301922201866495030L)) continue;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw IR.a(illegalArgumentException);
                                                        }
                                                        n15 = i2;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw IR.a(illegalArgumentException);
                                                    }
                                                }
                                                n12 = n15;
                                                try {
                                                    if (!bl2) break;
                                                    if (!bl2) continue;
                                                    break;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw IR.a(illegalArgumentException);
                                                }
                                            }
                                            string8 = this.z;
                                            n11 = 0;
                                        }
                                        string7 = string8.substring(n11, n13);
                                        try {
                                            n10 = n12;
                                            if (bl2) break block38;
                                            if (n10 <= -1) break block35;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IR.a(illegalArgumentException);
                                        }
                                        string6 = this.z.substring(n12);
                                    }
                                    try {
                                        string5 = string7;
                                        if (bl2) break block39;
                                        n10 = string5.equals(IR.a(-2794, 29635));
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                }
                                if (n10 == 0) break block44;
                                string5 = string6;
                            }
                            string4 = string5;
                            try {
                                try {
                                    try {
                                        bl = string4.equals("/");
                                        if (bl2) break block40;
                                        if (bl) break block41;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    bl = string4.endsWith("/");
                                    if (bl2) break block40;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                if (!bl) break block41;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            string4 = string4.substring(0, string4.length() - 1);
                        }
                        try {
                            iR = this;
                            if (bl2) break block42;
                            bl = iR.K;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (bl) break block43;
                        this.u.add(string4);
                        if (!bl2) break block44;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                string4 = string4.replaceAll("~", this.H);
                iR = this;
            }
            try {
                string3 = (String)lk_0.I((Object)iR.X, (Object)string4);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.X = string2 = string3;
            try {
                f62 = (F6)this.r.q().p();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            F6 f63 = f62;
            try {
                f63.t((Object)string2, true, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    public void I(boolean bl) {
    }

    public dc_1 D() {
        int n10;
        block5: {
            int n11;
            block4: {
                n10 = this.O.k();
                boolean bl = j_0.P();
                int n12 = this.O.O();
                try {
                    try {
                        n11 = n10;
                        if (bl) break block4;
                        if (n11 <= n12) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    n11 = n12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            n10 = n11;
        }
        dc_1 dc_12 = this.O.D(n10 - 1);
        return dc_12;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void N() {
        block12: {
            block11: {
                block9: {
                    block10: {
                        var1_1 = j_0.g();
                        try {
                            try {
                                v0 = this.k;
                                if (!var1_1) break block9;
                                if (v0 < this.A) break block10;
                            }
                            catch (IllegalArgumentException v1) {
                                throw IR.a(v1);
                            }
                            return;
                        }
                        catch (IllegalArgumentException v2) {
                            throw IR.a(v2);
                        }
                    }
                    v0 = this.O.D(this.V - 1).V().length();
                }
                var2_2 = v0;
                var3_3 = this.G.U(this.k);
                try {
                    this.k = Math.max(this.k, var2_2);
                    v3 = this;
                    if (!var1_1) break block11;
                    if (v3.k < var3_3) {
                    }
                    ** GOTO lbl32
                }
                catch (IllegalArgumentException v4) {
                    throw IR.a(v4);
                }
                var4_4 = new char[var3_3 - this.k];
                try {
                    Arrays.fill(var4_4, (char)IR.a(13304, 4301922201866495030L));
                    this.u(var4_4);
                    if (var1_1) break block12;
lbl32:
                    // 2 sources

                    v3 = this;
                }
                catch (IllegalArgumentException v5) {
                    throw IR.a(v5);
                }
            }
            v3.k = var3_3;
        }
        this.m(1);
        this.N.x(this.k, this.V);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void d(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void b(int n10, int n11) {
        this.O.w();
        try {
            this.O.U(n10, n11);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void w() {
        this.b(0, this.S - 1);
    }

    @Override
    public void X(boolean bl) {
        this.N.G(bl);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void W(boolean var1_1) {
        block13: {
            block11: {
                block12: {
                    v0 = j_0.P();
                    this.N(IR.a(-2808, -24549) + var1_1);
                    var2_2 = v0;
                    try {
                        try {
                            try {
                                try {
                                    this.O.P(var1_1);
                                    v1 = this;
                                    if (var2_2) break block11;
                                    v1.N.x(true);
                                    if (!var1_1) {
                                    }
                                    ** GOTO lbl36
                                }
                                catch (IllegalArgumentException v2) {
                                    throw IR.a(v2);
                                }
                                v3 = this;
                                if (var2_2) break block12;
                            }
                            catch (IllegalArgumentException v4) {
                                throw IR.a(v4);
                            }
                            if (v3.x == null) break block13;
                        }
                        catch (IllegalArgumentException v5) {
                            throw IR.a(v5);
                        }
                        this.n(this.x);
                        this.N.x(this.k, this.V);
                        v3 = this;
                    }
                    catch (IllegalArgumentException v6) {
                        throw IR.a(v6);
                    }
                }
                try {
                    v3.x = null;
                    if (!var2_2) break block13;
lbl36:
                    // 2 sources

                    v1 = this;
                }
                catch (IllegalArgumentException v7) {
                    throw IR.a(v7);
                }
            }
            v1.x = this.e();
        }
    }

    @Override
    public byte[] r(int n10, int n11) {
        return this.W.C(n10, n11);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void V(boolean var1_1) {
        block9: {
            block8: {
                var2_2 = j_0.g();
                try {
                    try {
                        if (!var2_2) break block8;
                        if (var1_1) {
                        }
                        ** GOTO lbl17
                    }
                    catch (IllegalArgumentException v0) {
                        throw IR.a(v0);
                    }
                    this.W.J();
                }
                catch (IllegalArgumentException v1) {
                    throw IR.a(v1);
                }
            }
            try {
                if (var2_2) break block9;
lbl17:
                // 2 sources

                this.W.E();
            }
            catch (IllegalArgumentException v2) {
                throw IR.a(v2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void x(boolean var1_1) {
        block9: {
            block8: {
                var2_2 = j_0.P();
                try {
                    try {
                        if (var2_2) break block8;
                        if (var1_1) {
                        }
                        ** GOTO lbl17
                    }
                    catch (IllegalArgumentException v0) {
                        throw IR.a(v0);
                    }
                    this.W.K();
                }
                catch (IllegalArgumentException v1) {
                    throw IR.a(v1);
                }
            }
            try {
                if (!var2_2) break block9;
lbl17:
                // 2 sources

                this.W.S();
            }
            catch (IllegalArgumentException v2) {
                throw IR.a(v2);
            }
        }
    }

    @Override
    public void P(boolean bl) {
        this.W.r(bl);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void J(int n10) {
        this.O.w();
        try {
            this.O.O(this.k, this.V - 1, n10);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void u(int n10) {
        this.O.w();
        try {
            int n11 = Math.min(n10, this.A - this.k);
            this.O.X(this.k, this.V - 1, n11);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void e(int n10) {
        this.O.w();
        try {
            this.O.y(this.k, this.k + n10, this.V - 1);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void P() {
        this.G.c(this.k);
    }

    @Override
    public void B() {
        this.G.n();
    }

    @Override
    public void n() {
        this.G.h(this.k);
    }

    @Override
    public void M(int n10) {
        this.O.w();
        try {
            this.O.S(this.V - 1, n10, this.Z);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void x(int n10) {
        this.O.w();
        try {
            this.O.o(this.V - 1, n10, this.Z);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void i(boolean bl) {
        this.N.N(bl);
    }

    @Override
    public void E(int n10) {
        this.O.w();
        try {
            this.o = true;
            this.V -= n10;
            this.V = Math.max(this.V, this.o());
            this.m(-1);
            this.N.x(this.k, this.V);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void T(int n10) {
        this.O.w();
        try {
            this.o = true;
            this.V += n10;
            this.V = Math.min(this.V, this.a());
            this.m(-1);
            this.N.x(this.k, this.V);
        }
        finally {
            this.O.h();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void o() {
        block10: {
            v0 = j_0.P();
            this.O.w();
            var1_1 = v0;
            try {
                block9: {
                    block11: {
                        v1 = this;
                        if (var1_1) break block9;
                        if (v1.V != this.Z) ** GOTO lbl20
                        break block11;
                        catch (IllegalArgumentException v2) {
                            throw IR.a(v2);
                        }
                    }
                    try {
                        block12: {
                            this.d(this.P, this.x(), -1);
                            if (!var1_1) break block10;
                            break block12;
                            catch (IllegalArgumentException v3) {
                                throw IR.a(v3);
                            }
                        }
                        ++this.V;
                        this.m(-1);
                        v1 = this;
                    }
                    catch (IllegalArgumentException v4) {
                        throw IR.a(v4);
                    }
                }
                v1.N.x(this.k, this.V);
            }
            finally {
                this.O.h();
            }
        }
    }

    private void d(int n10, int n11, int n12) {
        this.N.l(n10, n11, n12);
        this.O.C(n10, n12, n10 + n11 - 1);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void K() {
        v0 = j_0.P();
        this.O.w();
        var1_1 = v0;
        try {
            block10: {
                block9: {
                    block12: {
                        this.k = 0;
                        v1 = this;
                        if (var1_1) break block9;
                        if (v1.V != this.Z) ** GOTO lbl21
                        break block12;
                        catch (IllegalArgumentException v2) {
                            throw IR.a(v2);
                        }
                    }
                    try {
                        block13: {
                            this.d(this.P, this.x(), -1);
                            if (!var1_1) break block10;
                            break block13;
                            catch (IllegalArgumentException v3) {
                                throw IR.a(v3);
                            }
                        }
                        v1 = this;
                    }
                    catch (IllegalArgumentException v4) {
                        throw IR.a(v4);
                    }
                }
                ++v1.V;
            }
            this.N.x(this.k, this.V);
        }
        finally {
            this.O.h();
        }
    }

    private int x() {
        return this.Z - this.P + 1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void e() {
        block10: {
            v0 = j_0.g();
            this.O.w();
            var1_1 = v0;
            try {
                block9: {
                    block11: {
                        v1 = this;
                        if (!var1_1) break block9;
                        if (v1.V != this.P) ** GOTO lbl20
                        break block11;
                        catch (IllegalArgumentException v2) {
                            throw IR.a(v2);
                        }
                    }
                    try {
                        block12: {
                            this.d(this.P, this.x(), 1);
                            if (var1_1) break block10;
                            break block12;
                            catch (IllegalArgumentException v3) {
                                throw IR.a(v3);
                            }
                        }
                        --this.V;
                        v1 = this;
                    }
                    catch (IllegalArgumentException v4) {
                        throw IR.a(v4);
                    }
                }
                v1.N.x(this.k, this.V);
            }
            finally {
                this.O.h();
            }
        }
    }

    private int o() {
        int n10;
        block4: {
            block5: {
                boolean bl = j_0.g();
                try {
                    try {
                        n10 = this.q();
                        if (!bl) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    n10 = this.P;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            n10 = 1;
        }
        return n10;
    }

    private int a() {
        int n10;
        block6: {
            IR iR;
            block4: {
                block5: {
                    boolean bl = j_0.g();
                    try {
                        try {
                            iR = this;
                            if (!bl) break block4;
                            if (!iR.q()) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        n10 = this.Z;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                iR = this;
            }
            n10 = iR.S;
        }
        return n10;
    }

    @Override
    public void Z(int n10) {
        this.k += n10;
        this.k = Math.min(this.k, this.A - 1);
        this.m(1);
        this.N.x(this.k, this.V);
    }

    @Override
    public void p(int n10) {
        this.k -= n10;
        this.k = Math.max(this.k, 0);
        this.m(-1);
        this.N.x(this.k, this.V);
    }

    @Override
    public void R(rp_1 rp_12) {
        this.N.e(rp_12);
    }

    @Override
    public void A(int n10) {
        this.i(n10, this.V);
    }

    @Override
    public void n(int n10) {
        this.V = n10;
        this.m(-1);
        this.N.x(this.k, this.V);
    }

    @Override
    public void i(int n10, int n11) {
        IR iR;
        block13: {
            block14: {
                boolean bl;
                block12: {
                    block10: {
                        bl = j_0.g();
                        try {
                            IR iR2;
                            block11: {
                                try {
                                    try {
                                        iR2 = this;
                                        if (!bl) break block10;
                                        if (!iR2.q()) break block11;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    this.V = n11 + this.o() - 1;
                                    if (bl) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                            }
                            iR2 = this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    iR2.V = n11;
                }
                try {
                    try {
                        iR = this;
                        if (!bl) break block13;
                        if (iR.V <= this.a()) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.V = this.a();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            this.k = Math.max(0, n10 - 1);
            this.k = Math.min(this.k, this.A - 1);
            this.V = Math.max(0, this.V);
            this.m(-1);
            iR = this;
        }
        iR.N.x(this.k, this.V);
    }

    @Override
    public void x(int n10, int n11) {
        block4: {
            block5: {
                boolean bl = j_0.P();
                try {
                    try {
                        if (bl) break block4;
                        if (n10 <= n11) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    f.error(IR.a(-2813, 14229) + n10 + ">" + n11);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            this.P = Math.max(1, n10);
            this.Z = Math.min(this.S, n11);
            this.i(1, 1);
        }
    }

    @Override
    public void N(int n10) {
        this.g(-n10);
    }

    @Override
    public void g(int n10) {
        this.O.w();
        try {
            this.d(this.P, this.x(), n10);
        }
        finally {
            this.O.h();
        }
    }

    @Override
    public void j() {
        this.x(1, this.S);
    }

    @Override
    public void c(YP yP) {
        this.j.W(yP);
    }

    @Override
    public void Y() {
        this.N.I();
    }

    @Override
    public int w() {
        return this.A - this.k;
    }

    @Override
    public void h() {
        this.U = this.e();
    }

    private XQ e() {
        return new XQ(this.k, this.V, this.j.U(), this.Q(), this.q(), this.F);
    }

    @Override
    public void t() {
        block8: {
            IR iR;
            block6: {
                boolean bl = j_0.g();
                try {
                    block7: {
                        try {
                            try {
                                iR = this;
                                if (!bl) break block6;
                                if (iR.U == null) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            this.n(this.U);
                            if (bl) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    this.o(NZ.OriginMode, false);
                    this.i(1, 1);
                    this.j.L();
                    iR = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR.F.o();
        }
        this.N.x(this.k, this.V);
    }

    public void n(@NotNull XQ xQ2) {
        block10: {
            int n10;
            R3 r3;
            block9: {
                block8: {
                    this.k = xQ2.e();
                    this.V = xQ2.q();
                    boolean bl = j_0.g();
                    this.m(-1);
                    this.j.W(xQ2.e());
                    this.o(NZ.AutoWrap, xQ2.Z());
                    this.o(NZ.OriginMode, xQ2.u());
                    pg_1[] pg_1Array = xQ2.E();
                    for (int i2 = 0; i2 < pg_1Array.length; ++i2) {
                        try {
                            this.F.E(i2, pg_1Array[i2]);
                            if (bl) {
                                if (bl) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    try {
                        this.F.f(xQ2.g());
                        r3 = this.F;
                        n10 = xQ2.S();
                        if (!bl) break block9;
                        r3.o(n10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    if (xQ2.Y() < 0) break block10;
                    r3 = this.F;
                    n10 = xQ2.Y();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            r3.F(n10);
        }
    }

    @Override
    public void V() {
        this.F.o();
        this.j.L();
        this.O.W();
        this.N.x(true);
        this.m();
        this.F();
        this.i(1, 1);
    }

    private void F() {
        this.d(YT.MOUSE_REPORTING_NONE);
        this.L(on_2.MOUSE_FORMAT_XTERM);
    }

    private void m() {
        this.w.clear();
        this.o(NZ.AutoWrap, true);
        this.o(NZ.AutoNewLine, false);
        this.o(NZ.CursorVisible, true);
        this.o(NZ.CursorBlinking, true);
    }

    public boolean G(@NotNull NZ nZ2) {
        return this.w.contains((Object)nZ2);
    }

    public boolean V() {
        return this.w.contains((Object)NZ.AutoNewLine);
    }

    public boolean q() {
        return this.w.contains((Object)NZ.OriginMode);
    }

    public boolean Q() {
        return this.w.contains((Object)NZ.AutoWrap);
    }

    /*
     * Exception decompiling
     */
    private byte[] X(int var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 6[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean E(YT[] yTArray) {
        IR iR;
        boolean bl;
        block17: {
            block18: {
                block16: {
                    bl = j_0.g();
                    try {
                        try {
                            iR = this;
                            if (!bl) break block16;
                            if (iR.d2 == YT.MOUSE_REPORTING_NONE) return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        iR = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (!bl) break block17;
                        if (iR.D != null) break block18;
                        return false;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR = this;
        }
        try {
            if (iR.d2 == YT.MOUSE_REPORTING_ALL_MOTION) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IR.a(illegalArgumentException);
        }
        YT[] yTArray2 = yTArray;
        int n10 = yTArray2.length;
        int n11 = 0;
        while (n11 < n10) {
            block19: {
                block20: {
                    YT yT = yTArray2[n11];
                    try {
                        try {
                            if (!bl) break block19;
                            if (this.d2 != yT) break block20;
                            return true;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                ++n11;
            }
            if (bl) continue;
        }
        return false;
    }

    @Override
    public void u(int n10, int n11, @NotNull EC eC) {
        block19: {
            pd_1 pd_12;
            int n12;
            block25: {
                int n13;
                int n14;
                boolean bl;
                block23: {
                    block24: {
                        int n15;
                        block21: {
                            block22: {
                                int n16;
                                block20: {
                                    int n17;
                                    block18: {
                                        bl = j_0.P();
                                        try {
                                            try {
                                                n17 = this.E(new YT[]{YT.MOUSE_REPORTING_NORMAL, YT.MOUSE_REPORTING_BUTTON_MOTION});
                                                if (bl) break block18;
                                                if (n17 == 0) break block19;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IR.a(illegalArgumentException);
                                            }
                                            n17 = eC.O();
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IR.a(illegalArgumentException);
                                        }
                                    }
                                    n12 = n17;
                                    try {
                                        try {
                                            try {
                                                n15 = n12;
                                                n16 = -1;
                                                if (bl) break block20;
                                                if (n15 == n16) break block19;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw IR.a(illegalArgumentException);
                                            }
                                            n15 = n12;
                                            if (bl) break block21;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IR.a(illegalArgumentException);
                                        }
                                        n16 = 4;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n15 == n16) break block22;
                                        n14 = n12;
                                        n13 = 5;
                                        if (bl) break block23;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    if (n14 != n13) break block24;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                            }
                            n15 = 4;
                        }
                        int n18 = n15;
                        n12 -= n18;
                        n12 |= IR.a(4151, 934655854567147507L);
                    }
                    n14 = n12;
                    n13 = eC.C();
                }
                n12 = n14 | n13;
                try {
                    try {
                        pd_12 = this.D;
                        if (bl) break block25;
                        if (pd_12 == null) break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    pd_12 = this.D;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            pd_12.L(this.X(n12, n10 + 1, n11 + 1), true);
        }
    }

    @Override
    public void z(int n10, int n11, @NotNull EC eC) {
        block14: {
            block12: {
                IR iR;
                block13: {
                    int n12;
                    boolean bl;
                    block16: {
                        block15: {
                            bl = j_0.P();
                            try {
                                iR = this;
                                if (bl) break block12;
                                if (!iR.E(new YT[]{YT.MOUSE_REPORTING_NORMAL, YT.MOUSE_REPORTING_BUTTON_MOTION})) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            n12 = eC.O();
                            try {
                                try {
                                    if (bl) break block14;
                                    if (n12 == -1) break block13;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                if (this.e != on_2.MOUSE_FORMAT_SGR) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            n12 |= IR.a(4309, 5314941769028880153L);
                            if (!bl) break block16;
                        }
                        n12 = 3;
                    }
                    n12 |= eC.C();
                    try {
                        try {
                            iR = this;
                            if (bl) break block12;
                            if (iR.D == null) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        this.D.L(this.X(n12, n10 + 1, n11 + 1), true);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                iR = this;
            }
            iR.p = null;
        }
    }

    @Override
    public void R(int n10, int n11, @NotNull EC eC) {
        block17: {
            IR iR;
            block18: {
                boolean bl;
                boolean bl2;
                block16: {
                    block14: {
                        block15: {
                            bl2 = j_0.g();
                            try {
                                try {
                                    try {
                                        iR = this;
                                        if (!bl2) break block14;
                                        if (iR.p == null) break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    bl = this.p.equals(new XE(n10, n11));
                                    if (!bl2) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                if (!bl) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            return;
                        }
                        iR = this;
                    }
                    try {
                        if (!bl2) break block17;
                        bl = iR.E(new YT[]{YT.MOUSE_REPORTING_ALL_MOTION});
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        try {
                            if (!bl) break block18;
                            iR = this;
                            if (!bl2) break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        if (iR.D == null) break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    this.D.L(this.X(3, n10 + 1, n11 + 1), true);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            iR = this;
        }
        iR.p = new XE(n10, n11);
    }

    @Override
    public void G(int n10, int n11, @NotNull EC eC) {
        block19: {
            block18: {
                IR iR;
                block20: {
                    boolean bl;
                    boolean bl2;
                    block17: {
                        block15: {
                            block16: {
                                bl2 = j_0.P();
                                try {
                                    try {
                                        try {
                                            iR = this;
                                            if (bl2) break block15;
                                            if (iR.p == null) break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw IR.a(illegalArgumentException);
                                        }
                                        bl = this.p.equals(new XE(n10, n11));
                                        if (bl2) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    if (!bl) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                return;
                            }
                            iR = this;
                        }
                        try {
                            if (bl2) break block18;
                            bl = iR.E(new YT[]{YT.MOUSE_REPORTING_BUTTON_MOTION});
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                    if (bl) {
                        int n12 = eC.O();
                        try {
                            if (bl2) break block19;
                            if (n12 == -1) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        n12 |= IR.a(13304, 4301922201866495030L);
                        n12 |= eC.C();
                        try {
                            try {
                                iR = this;
                                if (bl2) break block18;
                                if (iR.D == null) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            this.D.L(this.X(n12, n10 + 1, n11 + 1), true);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                    }
                }
                iR = this;
            }
            iR.p = new XE(n10, n11);
        }
    }

    @Override
    public void i(int n10, int n11, @NotNull eo_0 eo_02) {
        this.u(n10, n11, eo_02);
    }

    @Override
    public void e(pd_1 pd_12) {
        this.D = pd_12;
    }

    @Override
    public void d(@NotNull YT yT) {
        this.d2 = yT;
        this.N.W(yT);
    }

    @Override
    public void h(boolean bl) {
        this.W.D(bl);
    }

    @Override
    public void I(String string) {
        block5: {
            pd_1 pd_12;
            block4: {
                boolean bl = j_0.P();
                try {
                    try {
                        pd_12 = this.D;
                        if (bl) break block4;
                        if (pd_12 == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    pd_12 = this.D;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            pd_12.s(string, false);
        }
    }

    @Override
    public void R(byte[] byArray) {
        block5: {
            pd_1 pd_12;
            block4: {
                boolean bl = j_0.P();
                try {
                    try {
                        pd_12 = this.D;
                        if (bl) break block4;
                        if (pd_12 == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    pd_12 = this.D;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            pd_12.L(byArray, false);
        }
    }

    @Override
    public void T(@NotNull String string) {
        block3: {
            in_2 in_22;
            YP yP;
            block2: {
                yP = this.j.U();
                in_2 in_23 = this.O.p();
                boolean bl = j_0.P();
                try {
                    in_22 = in_23;
                    if (bl) break block2;
                    if (in_22 == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
                in_22 = in_23;
            }
            List list = in_22.Y(string);
            list.stream().filter(arg_0 -> IR.lambda$setLinkUriStarted$0(string, arg_0)).findFirst().ifPresent(arg_0 -> this.lambda$setLinkUriStarted$1(yP, arg_0));
        }
    }

    @Override
    public void s() {
        block8: {
            YP yP;
            block7: {
                YP yP2 = this.j.U();
                boolean bl = j_0.P();
                try {
                    try {
                        yP = yP2;
                        if (bl) break block7;
                        if (!(yP instanceof yw_0)) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    yP = ((yw_0)yP2).J();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            YP yP3 = yP;
            try {
                if (yP3 != null) {
                    this.j.W(yP3);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IR.a(illegalArgumentException);
            }
        }
    }

    @Override
    public void v(boolean bl) {
        this.N.z(bl);
    }

    @Override
    public void L(on_2 on_22) {
        this.e = on_22;
    }

    /*
     * Unable to fully structure code
     */
    private void m(int var1_1) {
        block21: {
            block24: {
                block23: {
                    block22: {
                        block20: {
                            var2_2 = j_0.P();
                            try {
                                try {
                                    v0 = this.V;
                                    if (var2_2) break block20;
                                    if (v0 <= -this.O.H()) break block21;
                                }
                                catch (IllegalArgumentException v1) {
                                    throw IR.a(v1);
                                }
                                v0 = (int)Character.isLowSurrogate(this.O.E(this.k, this.V - 1));
                            }
                            catch (IllegalArgumentException v2) {
                                throw IR.a(v2);
                            }
                        }
                        try {
                            if (var2_2) break block22;
                            if (v0 == 0) break block21;
                        }
                        catch (IllegalArgumentException v3) {
                            throw IR.a(v3);
                        }
                        v0 = var1_1;
                    }
                    try {
                        try {
                            try {
                                if (var2_2) break block23;
                                if (v0 > 0) {
                                }
                                ** GOTO lbl59
                            }
                            catch (IllegalArgumentException v4) {
                                throw IR.a(v4);
                            }
                            v5 = this;
                            if (var2_2) break block24;
                        }
                        catch (IllegalArgumentException v6) {
                            throw IR.a(v6);
                        }
                        v0 = v5.k;
                    }
                    catch (IllegalArgumentException v7) {
                        throw IR.a(v7);
                    }
                }
                try {
                    block25: {
                        try {
                            if (v0 != this.A) break block25;
                            --this.k;
                            if (!var2_2) break block21;
                        }
                        catch (IllegalArgumentException v8) {
                            throw IR.a(v8);
                        }
                    }
                    v5 = this;
                }
                catch (IllegalArgumentException v9) {
                    throw IR.a(v9);
                }
            }
            try {
                ++v5.k;
                if (!var2_2) break block21;
lbl59:
                // 2 sources

                --this.k;
            }
            catch (IllegalArgumentException v10) {
                throw IR.a(v10);
            }
        }
    }

    @Override
    public int N() {
        return this.k;
    }

    @Override
    public void i(int n10) {
        this.k = n10;
        this.m(-1);
    }

    @Override
    public int I() {
        return this.V;
    }

    @Override
    public void q(int n10) {
        this.V = n10;
        this.m(-1);
    }

    public void R(String string) {
        this.k(string);
    }

    @Override
    public void m(@NotNull OT oT, @NotNull wf_1 wf_12) {
        this.z(oT, wf_12, CompletableFuture.completedFuture(null));
    }

    @Override
    public void z(@NotNull OT oT, @NotNull wf_1 wf_12, @NotNull CompletableFuture completableFuture) {
        this.Z(IR.V(oT), wf_12, completableFuture);
    }

    private void Z(@NotNull OT oT, @NotNull wf_1 wf_12, @NotNull CompletableFuture completableFuture) {
        block13: {
            int n10;
            int n11;
            boolean bl;
            int n12;
            block10: {
                block11: {
                    n12 = this.S;
                    bl = j_0.P();
                    try {
                        try {
                            try {
                                n11 = oT.R();
                                n10 = this.A;
                                if (bl) break block10;
                                if (n11 != n10) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                            n11 = oT.c();
                            n10 = this.S;
                            if (bl) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        if (n11 != n10) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    return;
                }
                n11 = oT.R();
                n10 = this.A;
            }
            try {
                block12: {
                    try {
                        if (n11 != n10) break block12;
                        this.L(oT, wf_12, n12);
                        if (!bl) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                this.A = oT.R();
                this.S = oT.c();
                completableFuture.thenRun(() -> this.lambda$resizeInternal$2(oT, wf_12, n12));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw IR.a(illegalArgumentException);
            }
        }
    }

    private void L(@NotNull OT oT, @NotNull wf_1 wf_12, int n10) {
        this.N.c(oT, wf_12, this.k, this.V, this::lambda$doResize$3);
        this.Z += this.S - n10;
        if (this.S - n10 < 0) {
            // empty if block
        }
    }

    @NotNull
    public static OT V(@NotNull OT oT) {
        return new OT(Math.max(a, oT.R()), Math.max(d, oT.c()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void w(char c2) {
        boolean bl = j_0.P();
        this.O.w();
        boolean bl2 = bl;
        try {
            char[] cArray = new char[this.A];
            Arrays.fill(cArray, c2);
            for (int i2 = 1; i2 <= this.S; ++i2) {
                try {
                    this.O.h(0, i2, this.j(cArray));
                    if (bl2) return;
                    if (!bl2) continue;
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                    return;
                }
            }
        }
        finally {
            this.O.h();
        }
    }

    @NotNull
    private j_0 j(char[] cArray) {
        char[] cArray2;
        block15: {
            block14: {
                int n10;
                boolean bl;
                block13: {
                    int n11 = sd_0.u(cArray, 0, cArray.length, this.N.H());
                    bl = j_0.g();
                    try {
                        try {
                            n10 = n11;
                            if (!bl) break block13;
                            if (n10 <= 0) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        n10 = cArray.length + n11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                cArray2 = new char[n10];
                int n12 = 0;
                int n13 = 0;
                while (n13 < cArray.length) {
                    block16: {
                        block17: {
                            cArray2[n12] = cArray[n13];
                            int n14 = Character.codePointAt(cArray, n13);
                            boolean bl2 = sd_0.U(n14, this.N.H());
                            try {
                                try {
                                    try {
                                        if (!bl) break block15;
                                        if (!bl) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw IR.a(illegalArgumentException);
                                    }
                                    if (!bl2) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw IR.a(illegalArgumentException);
                                }
                                cArray2[++n12] = IR.a(5580, 9183414307772318219L);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw IR.a(illegalArgumentException);
                            }
                        }
                        ++n12;
                        ++n13;
                    }
                    if (bl) continue;
                }
                if (bl) break block15;
            }
            cArray2 = cArray;
        }
        return new j_0(cArray2, 0, cArray2.length);
    }

    @Override
    public int R() {
        return this.A;
    }

    @Override
    public int b() {
        return this.S;
    }

    @Override
    public int z() {
        return this.k + 1;
    }

    @Override
    public int A() {
        return this.V;
    }

    @Override
    public ov_2 I() {
        return this.j;
    }

    public WZ S(@NotNull String string, boolean bl) {
        try {
            if (string.length() == 0) {
                return null;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IR.a(illegalArgumentException);
        }
        dx_2 dx_22 = new dx_2(string, bl);
        this.O.q(-this.O.H(), -1, new lc_2(this, dx_22));
        return dx_22.i();
    }

    public void X() {
        this.N = null;
        this.O = null;
        this.j = null;
        this.U = null;
        this.w = null;
        this.W = null;
        this.Y = null;
        this.G = null;
        this.F = null;
        this.e = null;
        this.D = null;
        this.d2 = null;
        this.p = null;
        this.r = null;
        this.z = null;
        this.c = null;
        this.m = null;
        this.i = null;
        this.u = null;
        this.H = null;
        this.X = null;
        this.L = null;
        this.h = null;
        this.n = null;
        this.q = null;
        this.T = null;
        this.E = null;
        this.l = null;
        this.x = null;
    }

    public void I() {
        try {
            yt_1.F.W((Object)new yi_1(this), dd_1.y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private void lambda$doResize$3(int n10, int n11, int n12, int n13) {
        this.A = n10;
        this.S = n11;
        this.V = n13;
        this.k = Math.min(n12, this.A - 1);
        this.N.x(this.k, this.V);
        this.G.K(this.A);
    }

    private void lambda$resizeInternal$2(OT oT, wf_1 wf_12, int n10) {
        this.L(oT, wf_12, n10);
    }

    private void lambda$setLinkUriStarted$1(YP yP, O2 o2) {
        this.j.W(new yw_0(yP, o2.O()));
    }

    private static boolean lambda$setLinkUriStarted$0(String string, O2 o2) {
        int n10;
        block10: {
            block9: {
                boolean bl;
                block8: {
                    bl = j_0.g();
                    try {
                        try {
                            n10 = o2.U();
                            if (!bl) break block8;
                            if (n10 != 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw IR.a(illegalArgumentException);
                        }
                        n10 = o2.c();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (!bl) break block10;
                        if (n10 != string.length()) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IR.a(illegalArgumentException);
                    }
                    n10 = 1;
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IR.a(illegalArgumentException);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    static int W(IR iR) {
        return iR.V;
    }

    static im_2 y(IR iR) {
        return iR.O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            var15 = new String[19];
                            var13_1 = 0;
                            var12_2 = "Aj\u0000\\\u0095\u00c5\u00ae\u0093\u00a5\u00e4\u00e0\u0002\u001d\u00ac\u000b\u00ceQ\u00d2.9\u00e0\u000f{@\u0001\u0094\nU\t\u00d3e=\u00f4\u00bdEe\u00d1\u0004\u8f24\u6320\u657a\u5f45\u001f\u008bQ\u00ab\u00ac\u00c1\u00d69\u000b\u00bdny\u00fdJ\u00f9<\u001c\u00f9\u00eeF\u007f\u00bc\u00fd\u00b6f\u00a7\u0096\u00b8\u0089n\u00baI\f\u0003\u00bcr\u00d2H\b\u00d4\u00e4L\u0007\u00e1\u00f5:\u008a<\u00a9u\u00ff\u0003]\u0097\u0092Af=f\u0015\u00c8\u0089 \u0001\u008d&`\u008a!\\\u00d4\u00b6Xd\u0016\u00a5\u00f5\u008e\u00b0\u00da\u009e\u00c7\u00b1\u000007\u00b3K\u0083\u008d\u00cf\u00a9lB\u0096|\u007f\u0092\u00e5}\u00c1(]\u0089\u0003\u0001\u001br\u0002\u00c9\u00d4\t\u00b8\u00f7t\u00bb\u00d0;f\u001e\u00cc\t\u00b9\u00d9T~\u00d4\u0083\u00e6\t\u00dc\u0013+\u0083\u008d|\u00cdz-\u001anHJ\u00f8\u0019\u00b3\u0092\u00a7\u00cb|I\u0002\u0007\u00af\u0005/$\n'.\"N\u0092\u0013\u00d4\u00d6\u00d9\u00db\u00ea\u00e1R\u00f2z;\t\u0012\u0002<-\u00fe\u0007\u00ab\u00faT\u0092\u00ee\u00fa*\u00d7\u00f5\u00ad\u00a3AJ\u0012\f]\u00c9\u00b9|1\u00dd\u00fb^\u00a9P]?";
                            var14_3 = "Aj\u0000\\\u0095\u00c5\u00ae\u0093\u00a5\u00e4\u00e0\u0002\u001d\u00ac\u000b\u00ceQ\u00d2.9\u00e0\u000f{@\u0001\u0094\nU\t\u00d3e=\u00f4\u00bdEe\u00d1\u0004\u8f24\u6320\u657a\u5f45\u001f\u008bQ\u00ab\u00ac\u00c1\u00d69\u000b\u00bdny\u00fdJ\u00f9<\u001c\u00f9\u00eeF\u007f\u00bc\u00fd\u00b6f\u00a7\u0096\u00b8\u0089n\u00baI\f\u0003\u00bcr\u00d2H\b\u00d4\u00e4L\u0007\u00e1\u00f5:\u008a<\u00a9u\u00ff\u0003]\u0097\u0092Af=f\u0015\u00c8\u0089 \u0001\u008d&`\u008a!\\\u00d4\u00b6Xd\u0016\u00a5\u00f5\u008e\u00b0\u00da\u009e\u00c7\u00b1\u000007\u00b3K\u0083\u008d\u00cf\u00a9lB\u0096|\u007f\u0092\u00e5}\u00c1(]\u0089\u0003\u0001\u001br\u0002\u00c9\u00d4\t\u00b8\u00f7t\u00bb\u00d0;f\u001e\u00cc\t\u00b9\u00d9T~\u00d4\u0083\u00e6\t\u00dc\u0013+\u0083\u008d|\u00cdz-\u001anHJ\u00f8\u0019\u00b3\u0092\u00a7\u00cb|I\u0002\u0007\u00af\u0005/$\n'.\"N\u0092\u0013\u00d4\u00d6\u00d9\u00db\u00ea\u00e1R\u00f2z;\t\u0012\u0002<-\u00fe\u0007\u00ab\u00faT\u0092\u00ee\u00fa*\u00d7\u00f5\u00ad\u00a3AJ\u0012\f]\u00c9\u00b9|1\u00dd\u00fb^\u00a9P]?".length();
                            var11_4 = 11;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = 24;
                                v1 = ++var10_5;
                                v2 = var12_2.substring(v1, v1 + var11_4);
                                v3 = -1;
                                break block27;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "\u00a3k\u00b5\u0016\u0011G\u00d2\u00ff\u00fa\u0018iH \u0081\u0082\u00c6c\u000e6|r\rA/!\u00df\u00ed\u0098D8\u000e\u00f4\u00ef\u00bc\u00df\u00c2\u0002U\u00d1";
                                var14_3 = "\u00a3k\u00b5\u0016\u0011G\u00d2\u00ff\u00fa\u0018iH \u0081\u0082\u00c6c\u000e6|r\rA/!\u00df\u00ed\u0098D8\u000e\u00f4\u00ef\u00bc\u00df\u00c2\u0002U\u00d1".length();
                                var11_4 = 36;
                                var10_5 = -1;
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = 49;
                                    v5 = ++var10_5;
                                    v2 = var12_2.substring(v5, v5 + var11_4);
                                    v3 = 0;
                                    break block27;
                                    break;
                                }
                                break;
                            }
lbl28:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v4.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block28;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var16_6 = 0;
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) ** GOTO lbl85
                        do {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v15 = 8;
                                        break;
                                    }
                                    case 1: {
                                        v15 = 59;
                                        break;
                                    }
                                    case 2: {
                                        v15 = 76;
                                        break;
                                    }
                                    case 3: {
                                        v15 = 44;
                                        break;
                                    }
                                    case 4: {
                                        v15 = 75;
                                        break;
                                    }
                                    case 5: {
                                        v15 = 118;
                                        break;
                                    }
                                    default: {
                                        v15 = 98;
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var16_6;
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
                        } while (v10 > var16_6);
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
                    IR.ab = var15;
                    IR.bb = new String[19];
                    var2_7 = 4198127134739778865L;
                    var8_8 = new long[13];
                    var5_9 = 0;
                    var6_10 = "}\u0018\u00ed\u00d04\u008d\u00d3\u00aa\u0094\u00bb\u00e1\u00a1\u00da\u00a1\n\u0082OT~\u00d8\u00d4\u0015o:\u0010\u0087\u0088P\u00a3\u00b9a[\u00c1\u00fe\u00b7\u0019\r\u00c7\u00aa\u00923\u00a2M\u0006\u0093+\u00be\u0003Q\u0018\u00c9\u0013\u0000\u0094\u0080=h\u00b5z\u000b\u00a1w[\u00e7H<N\u0082\u008c\u00f7\u00c4\u007ff\u0083\u009a\u0084\u00fc\u00cd\u008a\u00a8\u000e\u0014\u00f1@/eG\u00d1";
                    var7_11 = "}\u0018\u00ed\u00d04\u008d\u00d3\u00aa\u0094\u00bb\u00e1\u00a1\u00da\u00a1\n\u0082OT~\u00d8\u00d4\u0015o:\u0010\u0087\u0088P\u00a3\u00b9a[\u00c1\u00fe\u00b7\u0019\r\u00c7\u00aa\u00923\u00a2M\u0006\u0093+\u00be\u0003Q\u0018\u00c9\u0013\u0000\u0094\u0080=h\u00b5z\u000b\u00a1w[\u00e7H<N\u0082\u008c\u00f7\u00c4\u007ff\u0083\u009a\u0084\u00fc\u00cd\u008a\u00a8\u000e\u0014\u00f1@/eG\u00d1".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v17 = var8_8;
                        v18 = var5_9++;
                        v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v20 = -1;
                        break block29;
                        break;
                    }
lbl112:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\u00da\u0089\b?\u00d9\u0089\u00a9'^\u00fb\u00c2\u00a4\u009d\u00dfx\u00a6";
                        var7_11 = "\u00da\u0089\b?\u00d9\u0089\u00a9'^\u00fb\u00c2\u00a4\u009d\u00dfx\u00a6".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v17 = var8_8;
                            v18 = var5_9++;
                            v19 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v20 = 0;
                            break block29;
                            break;
                        }
                        break;
                    }
lbl125:
                    // 1 sources

                    while (true) {
                        v17[v18] = v21;
                        if (var4_12 < var7_11) ** continue;
                        break block30;
                        break;
                    }
                }
                v21 = v19 ^ var2_7;
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
            IR.cb = var8_8;
            IR.db = new Integer[13];
            break block31;
lbl141:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 7533973909462191033L;
        ** while (true)
        IR.eb = 7533973909462190161L ^ var0_14;
        IR.f = LoggerFactory.getLogger(IR.class.getName());
        IR.a = IR.a(23850, 3864876180565035749L);
        IR.d = IR.a(18780, 6761194691306856089L);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF504) & 0xFFFF;
        if (bb[n12] == null) {
            int n13;
            int n14;
            char[] cArray = ab[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 150;
                    break;
                }
                case 1: {
                    n14 = 198;
                    break;
                }
                case 2: {
                    n14 = 171;
                    break;
                }
                case 3: {
                    n14 = 173;
                    break;
                }
                case 4: {
                    n14 = 19;
                    break;
                }
                case 5: {
                    n14 = 105;
                    break;
                }
                case 6: {
                    n14 = 5;
                    break;
                }
                case 7: {
                    n14 = 252;
                    break;
                }
                case 8: {
                    n14 = 4;
                    break;
                }
                case 9: {
                    n14 = 178;
                    break;
                }
                case 10: {
                    n14 = 136;
                    break;
                }
                case 11: {
                    n14 = 230;
                    break;
                }
                case 12: {
                    n14 = 82;
                    break;
                }
                case 13: {
                    n14 = 46;
                    break;
                }
                case 14: {
                    n14 = 219;
                    break;
                }
                case 15: {
                    n14 = 56;
                    break;
                }
                case 16: {
                    n14 = 156;
                    break;
                }
                case 17: {
                    n14 = 223;
                    break;
                }
                case 18: {
                    n14 = 215;
                    break;
                }
                case 19: {
                    n14 = 123;
                    break;
                }
                case 20: {
                    n14 = 57;
                    break;
                }
                case 21: {
                    n14 = 183;
                    break;
                }
                case 22: {
                    n14 = 212;
                    break;
                }
                case 23: {
                    n14 = 242;
                    break;
                }
                case 24: {
                    n14 = 104;
                    break;
                }
                case 25: {
                    n14 = 133;
                    break;
                }
                case 26: {
                    n14 = 71;
                    break;
                }
                case 27: {
                    n14 = 58;
                    break;
                }
                case 28: {
                    n14 = 78;
                    break;
                }
                case 29: {
                    n14 = 129;
                    break;
                }
                case 30: {
                    n14 = 200;
                    break;
                }
                case 31: {
                    n14 = 145;
                    break;
                }
                case 32: {
                    n14 = 22;
                    break;
                }
                case 33: {
                    n14 = 36;
                    break;
                }
                case 34: {
                    n14 = 228;
                    break;
                }
                case 35: {
                    n14 = 188;
                    break;
                }
                case 36: {
                    n14 = 63;
                    break;
                }
                case 37: {
                    n14 = 158;
                    break;
                }
                case 38: {
                    n14 = 170;
                    break;
                }
                case 39: {
                    n14 = 35;
                    break;
                }
                case 40: {
                    n14 = 80;
                    break;
                }
                case 41: {
                    n14 = 185;
                    break;
                }
                case 42: {
                    n14 = 232;
                    break;
                }
                case 43: {
                    n14 = 197;
                    break;
                }
                case 44: {
                    n14 = 30;
                    break;
                }
                case 45: {
                    n14 = 86;
                    break;
                }
                case 46: {
                    n14 = 116;
                    break;
                }
                case 47: {
                    n14 = 238;
                    break;
                }
                case 48: {
                    n14 = 128;
                    break;
                }
                case 49: {
                    n14 = 247;
                    break;
                }
                case 50: {
                    n14 = 244;
                    break;
                }
                case 51: {
                    n14 = 108;
                    break;
                }
                case 52: {
                    n14 = 66;
                    break;
                }
                case 53: {
                    n14 = 42;
                    break;
                }
                case 54: {
                    n14 = 233;
                    break;
                }
                case 55: {
                    n14 = 69;
                    break;
                }
                case 56: {
                    n14 = 135;
                    break;
                }
                case 57: {
                    n14 = 0;
                    break;
                }
                case 58: {
                    n14 = 210;
                    break;
                }
                case 59: {
                    n14 = 205;
                    break;
                }
                case 60: {
                    n14 = 8;
                    break;
                }
                case 61: {
                    n14 = 62;
                    break;
                }
                case 62: {
                    n14 = 195;
                    break;
                }
                case 63: {
                    n14 = 239;
                    break;
                }
                case 64: {
                    n14 = 27;
                    break;
                }
                case 65: {
                    n14 = 48;
                    break;
                }
                case 66: {
                    n14 = 190;
                    break;
                }
                case 67: {
                    n14 = 117;
                    break;
                }
                case 68: {
                    n14 = 53;
                    break;
                }
                case 69: {
                    n14 = 93;
                    break;
                }
                case 70: {
                    n14 = 140;
                    break;
                }
                case 71: {
                    n14 = 211;
                    break;
                }
                case 72: {
                    n14 = 11;
                    break;
                }
                case 73: {
                    n14 = 88;
                    break;
                }
                case 74: {
                    n14 = 126;
                    break;
                }
                case 75: {
                    n14 = 151;
                    break;
                }
                case 76: {
                    n14 = 218;
                    break;
                }
                case 77: {
                    n14 = 24;
                    break;
                }
                case 78: {
                    n14 = 161;
                    break;
                }
                case 79: {
                    n14 = 32;
                    break;
                }
                case 80: {
                    n14 = 94;
                    break;
                }
                case 81: {
                    n14 = 243;
                    break;
                }
                case 82: {
                    n14 = 2;
                    break;
                }
                case 83: {
                    n14 = 28;
                    break;
                }
                case 84: {
                    n14 = 40;
                    break;
                }
                case 85: {
                    n14 = 245;
                    break;
                }
                case 86: {
                    n14 = 120;
                    break;
                }
                case 87: {
                    n14 = 29;
                    break;
                }
                case 88: {
                    n14 = 26;
                    break;
                }
                case 89: {
                    n14 = 255;
                    break;
                }
                case 90: {
                    n14 = 55;
                    break;
                }
                case 91: {
                    n14 = 83;
                    break;
                }
                case 92: {
                    n14 = 146;
                    break;
                }
                case 93: {
                    n14 = 52;
                    break;
                }
                case 94: {
                    n14 = 112;
                    break;
                }
                case 95: {
                    n14 = 147;
                    break;
                }
                case 96: {
                    n14 = 254;
                    break;
                }
                case 97: {
                    n14 = 160;
                    break;
                }
                case 98: {
                    n14 = 144;
                    break;
                }
                case 99: {
                    n14 = 77;
                    break;
                }
                case 100: {
                    n14 = 90;
                    break;
                }
                case 101: {
                    n14 = 9;
                    break;
                }
                case 102: {
                    n14 = 177;
                    break;
                }
                case 103: {
                    n14 = 166;
                    break;
                }
                case 104: {
                    n14 = 119;
                    break;
                }
                case 105: {
                    n14 = 213;
                    break;
                }
                case 106: {
                    n14 = 250;
                    break;
                }
                case 107: {
                    n14 = 14;
                    break;
                }
                case 108: {
                    n14 = 180;
                    break;
                }
                case 109: {
                    n14 = 122;
                    break;
                }
                case 110: {
                    n14 = 13;
                    break;
                }
                case 111: {
                    n14 = 229;
                    break;
                }
                case 112: {
                    n14 = 127;
                    break;
                }
                case 113: {
                    n14 = 235;
                    break;
                }
                case 114: {
                    n14 = 87;
                    break;
                }
                case 115: {
                    n14 = 236;
                    break;
                }
                case 116: {
                    n14 = 141;
                    break;
                }
                case 117: {
                    n14 = 220;
                    break;
                }
                case 118: {
                    n14 = 179;
                    break;
                }
                case 119: {
                    n14 = 75;
                    break;
                }
                case 120: {
                    n14 = 33;
                    break;
                }
                case 121: {
                    n14 = 240;
                    break;
                }
                case 122: {
                    n14 = 92;
                    break;
                }
                case 123: {
                    n14 = 51;
                    break;
                }
                case 124: {
                    n14 = 214;
                    break;
                }
                case 125: {
                    n14 = 176;
                    break;
                }
                case 126: {
                    n14 = 64;
                    break;
                }
                case 127: {
                    n14 = 169;
                    break;
                }
                case 128: {
                    n14 = 7;
                    break;
                }
                case 129: {
                    n14 = 70;
                    break;
                }
                case 130: {
                    n14 = 174;
                    break;
                }
                case 131: {
                    n14 = 241;
                    break;
                }
                case 132: {
                    n14 = 143;
                    break;
                }
                case 133: {
                    n14 = 79;
                    break;
                }
                case 134: {
                    n14 = 103;
                    break;
                }
                case 135: {
                    n14 = 142;
                    break;
                }
                case 136: {
                    n14 = 50;
                    break;
                }
                case 137: {
                    n14 = 59;
                    break;
                }
                case 138: {
                    n14 = 137;
                    break;
                }
                case 139: {
                    n14 = 253;
                    break;
                }
                case 140: {
                    n14 = 202;
                    break;
                }
                case 141: {
                    n14 = 157;
                    break;
                }
                case 142: {
                    n14 = 76;
                    break;
                }
                case 143: {
                    n14 = 15;
                    break;
                }
                case 144: {
                    n14 = 60;
                    break;
                }
                case 145: {
                    n14 = 118;
                    break;
                }
                case 146: {
                    n14 = 221;
                    break;
                }
                case 147: {
                    n14 = 168;
                    break;
                }
                case 148: {
                    n14 = 101;
                    break;
                }
                case 149: {
                    n14 = 23;
                    break;
                }
                case 150: {
                    n14 = 102;
                    break;
                }
                case 151: {
                    n14 = 167;
                    break;
                }
                case 152: {
                    n14 = 153;
                    break;
                }
                case 153: {
                    n14 = 184;
                    break;
                }
                case 154: {
                    n14 = 199;
                    break;
                }
                case 155: {
                    n14 = 95;
                    break;
                }
                case 156: {
                    n14 = 234;
                    break;
                }
                case 157: {
                    n14 = 191;
                    break;
                }
                case 158: {
                    n14 = 67;
                    break;
                }
                case 159: {
                    n14 = 231;
                    break;
                }
                case 160: {
                    n14 = 85;
                    break;
                }
                case 161: {
                    n14 = 203;
                    break;
                }
                case 162: {
                    n14 = 193;
                    break;
                }
                case 163: {
                    n14 = 124;
                    break;
                }
                case 164: {
                    n14 = 181;
                    break;
                }
                case 165: {
                    n14 = 192;
                    break;
                }
                case 166: {
                    n14 = 224;
                    break;
                }
                case 167: {
                    n14 = 248;
                    break;
                }
                case 168: {
                    n14 = 175;
                    break;
                }
                case 169: {
                    n14 = 237;
                    break;
                }
                case 170: {
                    n14 = 148;
                    break;
                }
                case 171: {
                    n14 = 172;
                    break;
                }
                case 172: {
                    n14 = 227;
                    break;
                }
                case 173: {
                    n14 = 20;
                    break;
                }
                case 174: {
                    n14 = 1;
                    break;
                }
                case 175: {
                    n14 = 196;
                    break;
                }
                case 176: {
                    n14 = 251;
                    break;
                }
                case 177: {
                    n14 = 34;
                    break;
                }
                case 178: {
                    n14 = 164;
                    break;
                }
                case 179: {
                    n14 = 84;
                    break;
                }
                case 180: {
                    n14 = 121;
                    break;
                }
                case 181: {
                    n14 = 111;
                    break;
                }
                case 182: {
                    n14 = 187;
                    break;
                }
                case 183: {
                    n14 = 216;
                    break;
                }
                case 184: {
                    n14 = 225;
                    break;
                }
                case 185: {
                    n14 = 162;
                    break;
                }
                case 186: {
                    n14 = 226;
                    break;
                }
                case 187: {
                    n14 = 130;
                    break;
                }
                case 188: {
                    n14 = 61;
                    break;
                }
                case 189: {
                    n14 = 96;
                    break;
                }
                case 190: {
                    n14 = 201;
                    break;
                }
                case 191: {
                    n14 = 186;
                    break;
                }
                case 192: {
                    n14 = 98;
                    break;
                }
                case 193: {
                    n14 = 194;
                    break;
                }
                case 194: {
                    n14 = 222;
                    break;
                }
                case 195: {
                    n14 = 44;
                    break;
                }
                case 196: {
                    n14 = 38;
                    break;
                }
                case 197: {
                    n14 = 18;
                    break;
                }
                case 198: {
                    n14 = 206;
                    break;
                }
                case 199: {
                    n14 = 189;
                    break;
                }
                case 200: {
                    n14 = 115;
                    break;
                }
                case 201: {
                    n14 = 154;
                    break;
                }
                case 202: {
                    n14 = 74;
                    break;
                }
                case 203: {
                    n14 = 132;
                    break;
                }
                case 204: {
                    n14 = 155;
                    break;
                }
                case 205: {
                    n14 = 217;
                    break;
                }
                case 206: {
                    n14 = 16;
                    break;
                }
                case 207: {
                    n14 = 68;
                    break;
                }
                case 208: {
                    n14 = 139;
                    break;
                }
                case 209: {
                    n14 = 208;
                    break;
                }
                case 210: {
                    n14 = 152;
                    break;
                }
                case 211: {
                    n14 = 3;
                    break;
                }
                case 212: {
                    n14 = 165;
                    break;
                }
                case 213: {
                    n14 = 21;
                    break;
                }
                case 214: {
                    n14 = 65;
                    break;
                }
                case 215: {
                    n14 = 54;
                    break;
                }
                case 216: {
                    n14 = 100;
                    break;
                }
                case 217: {
                    n14 = 37;
                    break;
                }
                case 218: {
                    n14 = 43;
                    break;
                }
                case 219: {
                    n14 = 73;
                    break;
                }
                case 220: {
                    n14 = 182;
                    break;
                }
                case 221: {
                    n14 = 17;
                    break;
                }
                case 222: {
                    n14 = 81;
                    break;
                }
                case 223: {
                    n14 = 149;
                    break;
                }
                case 224: {
                    n14 = 249;
                    break;
                }
                case 225: {
                    n14 = 209;
                    break;
                }
                case 226: {
                    n14 = 138;
                    break;
                }
                case 227: {
                    n14 = 12;
                    break;
                }
                case 228: {
                    n14 = 163;
                    break;
                }
                case 229: {
                    n14 = 109;
                    break;
                }
                case 230: {
                    n14 = 207;
                    break;
                }
                case 231: {
                    n14 = 39;
                    break;
                }
                case 232: {
                    n14 = 10;
                    break;
                }
                case 233: {
                    n14 = 45;
                    break;
                }
                case 234: {
                    n14 = 41;
                    break;
                }
                case 235: {
                    n14 = 204;
                    break;
                }
                case 236: {
                    n14 = 110;
                    break;
                }
                case 237: {
                    n14 = 113;
                    break;
                }
                case 238: {
                    n14 = 107;
                    break;
                }
                case 239: {
                    n14 = 97;
                    break;
                }
                case 240: {
                    n14 = 131;
                    break;
                }
                case 241: {
                    n14 = 6;
                    break;
                }
                case 242: {
                    n14 = 106;
                    break;
                }
                case 243: {
                    n14 = 47;
                    break;
                }
                case 244: {
                    n14 = 72;
                    break;
                }
                case 245: {
                    n14 = 134;
                    break;
                }
                case 246: {
                    n14 = 159;
                    break;
                }
                case 247: {
                    n14 = 89;
                    break;
                }
                case 248: {
                    n14 = 31;
                    break;
                }
                case 249: {
                    n14 = 246;
                    break;
                }
                case 250: {
                    n14 = 91;
                    break;
                }
                case 251: {
                    n14 = 125;
                    break;
                }
                case 252: {
                    n14 = 25;
                    break;
                }
                case 253: {
                    n14 = 114;
                    break;
                }
                case 254: {
                    n14 = 99;
                    break;
                }
                default: {
                    n14 = 49;
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
            IR.bb[n12] = new String(cArray).intern();
        }
        return bb[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x57C5;
        if (db[n11] == null) {
            IR.db[n11] = (int)(cb[n11] ^ l2);
        }
        return db[n11];
    }
}

