/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EG;
import com.KB;
import com.OT;
import com.XE;
import com.YP;
import com.dc_1;
import com.il_1;
import com.in_2;
import com.j_0;
import com.lf_0;
import com.lu_2;
import com.no_1;
import com.ov_2;
import com.pl_2;
import com.ru_1;
import com.ua_0;
import com.wf_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.im
 */
public class im_2 {
    private static final Logger B;
    @NotNull
    private final ov_2 t;
    private ua_0 M;
    private ua_0 F;
    private int D;
    private int R;
    private final int I;
    private final Lock v = new ReentrantLock();
    private ua_0 e;
    private ua_0 f;
    private boolean V = false;
    private boolean z = false;
    private final List o = new CopyOnWriteArrayList();
    private final List p = new CopyOnWriteArrayList();
    @Nullable
    private final in_2 J;
    boolean X = false;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public im_2(int n10, int n11, @NotNull ov_2 ov_22) {
        this(n10, n11, ov_22, null);
    }

    public im_2(int n10, int n11, @NotNull ov_2 ov_22, @Nullable in_2 in_22) {
        this(n10, n11, ov_22, im_2.a(27699, 1595548852316604916L), in_22);
    }

    public im_2(int n10, int n11, @NotNull ov_2 ov_22, int n12, @Nullable in_2 in_22) {
        this.t = ov_22;
        this.D = n10;
        this.R = n11;
        this.I = n12;
        this.J = in_22;
        this.F = this.L();
        this.M = this.R();
    }

    @NotNull
    private ua_0 L() {
        return new ua_0(-1, this.J);
    }

    @NotNull
    private ua_0 R() {
        return new ua_0(this.I, this.J);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h(@NotNull OT oT, @NotNull wf_1 wf_12, int n10, int n11, @NotNull no_1 no_12, @Nullable ru_1 ru_12) {
        this.w();
        try {
            this.Q(oT, n10, n11, no_12, ru_12);
        }
        finally {
            this.h();
        }
    }

    private void Q(@NotNull OT oT, int n10, int n11, @NotNull no_1 no_12, @Nullable ru_1 ru_12) {
        int n12;
        int n13;
        int n14;
        int n15;
        block27: {
            ru_1 ru_13;
            block32: {
                boolean bl;
                block31: {
                    int n16;
                    block29: {
                        block30: {
                            int n17;
                            block28: {
                                int n18;
                                block20: {
                                    block21: {
                                        block26: {
                                            ru_1 ru_14;
                                            int n19;
                                            block25: {
                                                block24: {
                                                    int n20;
                                                    block22: {
                                                        block23: {
                                                            int n21;
                                                            block18: {
                                                                block19: {
                                                                    n15 = oT.R();
                                                                    n14 = oT.c();
                                                                    n13 = n10;
                                                                    bl = j_0.P();
                                                                    n12 = n11;
                                                                    n21 = this.D;
                                                                    if (bl) break block18;
                                                                    if (n21 == n15) break block19;
                                                                    EG eG = new EG(this, n15, n14);
                                                                    XE xE2 = new XE(n10, n11 - 1);
                                                                    eG.U(xE2, true);
                                                                    if (!bl) {
                                                                        if (ru_12 != null) {
                                                                            eG.W(ru_12.N());
                                                                            eG.W(ru_12.e());
                                                                        }
                                                                        eG.i();
                                                                        this.D = n15;
                                                                        this.R = n14;
                                                                    }
                                                                    XE xE3 = eG.d(xE2);
                                                                    n13 = xE3.q;
                                                                    n21 = xE3.r + 1;
                                                                    if (bl) break block18;
                                                                    n12 = n21;
                                                                    if (ru_12 != null) {
                                                                        ru_12.N().A(eG.d(ru_12.N()));
                                                                        ru_12.e().A(eG.d(ru_12.e()));
                                                                    }
                                                                }
                                                                n21 = this.R;
                                                            }
                                                            n17 = n21;
                                                            n16 = n14;
                                                            n18 = n17;
                                                            if (bl) break block20;
                                                            if (n16 >= n18) break block21;
                                                            n19 = n17 - n14;
                                                            n20 = this.V;
                                                            if (bl) break block22;
                                                            if (n20 != 0) break block23;
                                                            int n22 = this.F.Q(n17 - 1, n19);
                                                            this.F.Q(n19 - n22, this.M);
                                                            n12 = n11 - (n19 - n22);
                                                            if (!bl) break block24;
                                                        }
                                                        n20 = n11;
                                                    }
                                                    n12 = n20;
                                                }
                                                ru_14 = ru_12;
                                                if (bl) break block25;
                                                if (ru_14 == null) break block26;
                                                ru_14 = ru_12;
                                            }
                                            ru_14.t(-n19);
                                        }
                                        if (!bl) break block27;
                                    }
                                    n16 = n14;
                                    if (bl) break block28;
                                    n18 = n17;
                                }
                                if (n16 <= n18) break block27;
                                n16 = this.V ? 1 : 0;
                            }
                            if (bl) break block29;
                            if (n16 != 0) break block30;
                            int n23 = Math.min(n14 - n17, this.M.b());
                            this.M.U(n23, this.F);
                            n12 = n11 + n23;
                            if (!bl) break block31;
                        }
                        n16 = n11;
                    }
                    n12 = n16;
                }
                ru_13 = ru_12;
                if (bl) break block32;
                if (ru_13 == null) break block27;
                ru_13 = ru_12;
            }
            ru_13.t(n14 - n11);
        }
        this.D = n15;
        this.R = n14;
        no_12.L(this.D, this.R, n13, n12);
        this.P();
    }

    public void P(il_1 il_12) {
        this.o.add(il_12);
    }

    public void Y(il_1 il_12) {
        this.p.add(il_12);
    }

    public void q(il_1 il_12) {
        this.o.remove(il_12);
    }

    public void w(il_1 il_12) {
        this.p.remove(il_12);
    }

    public boolean u() {
        return this.X;
    }

    public void d(boolean bl) {
        this.X = bl;
    }

    void P() {
        this.X = true;
        Iterator iterator = this.o.iterator();
        boolean bl = j_0.P();
        while (iterator.hasNext()) {
            il_1 il_12 = (il_1)iterator.next();
            il_12.s();
            if (!bl) continue;
        }
    }

    void z() {
        Iterator iterator = this.p.iterator();
        boolean bl = j_0.g();
        while (iterator.hasNext()) {
            il_1 il_12 = (il_1)iterator.next();
            il_12.s();
            if (bl) continue;
        }
    }

    private YP W() {
        return this.t.U().j();
    }

    private lu_2 h() {
        return new lu_2(this.W(), new j_0('\u0000', this.D));
    }

    public void O(int n10, int n11, int n12) {
        block8: {
            int n13;
            block9: {
                block10: {
                    boolean bl;
                    block6: {
                        block7: {
                            block4: {
                                block5: {
                                    bl = j_0.g();
                                    if (!bl) break block4;
                                    if (n11 > this.R - 1) break block5;
                                    n13 = n11;
                                    if (!bl) break block6;
                                    if (n13 >= 0) break block7;
                                }
                                B.error(im_2.a(-24930, -24854) + n11 + im_2.a(-24934, -2976) + n10 + im_2.a(-24938, 29287) + n12);
                            }
                            if (bl) break block8;
                        }
                        n13 = n12;
                    }
                    if (!bl) break block9;
                    if (n13 >= 0) break block10;
                    B.error(im_2.a(-24939, 10972) + n12);
                    if (bl) break block8;
                }
                n13 = n12;
            }
            if (n13 > 0) {
                this.F.Z(n10, n11, n12, this.W());
                this.P();
            }
        }
    }

    public void X(int n10, int n11, int n12) {
        block8: {
            int n13;
            block9: {
                block10: {
                    boolean bl;
                    block6: {
                        block7: {
                            block4: {
                                block5: {
                                    bl = j_0.g();
                                    if (!bl) break block4;
                                    if (n11 > this.R - 1) break block5;
                                    n13 = n11;
                                    if (!bl) break block6;
                                    if (n13 >= 0) break block7;
                                }
                                B.error(im_2.a(-24935, 10312) + n11 + im_2.a(-24942, -21400) + n10 + im_2.a(-24937, 1662) + n12);
                            }
                            if (bl) break block8;
                        }
                        n13 = n12;
                    }
                    if (!bl) break block9;
                    if (n13 >= 0) break block10;
                    B.error(im_2.a(-24941, -6928) + n12);
                    if (bl) break block8;
                }
                n13 = n12;
            }
            if (n13 > 0) {
                this.F.w(n10, n11, n12, this.D, this.W());
                this.P();
            }
        }
    }

    public void h(int n10, int n11, @NotNull j_0 j_02) {
        this.p(n10, n11, j_02, this.t.U());
    }

    public void j(@NotNull dc_1 dc_12) {
        this.F.O(List.of(dc_12));
        this.P();
    }

    private void p(int n10, int n11, @NotNull j_0 j_02, @NotNull YP yP) {
        this.F.S(n10, n11 - 1, j_02, yP);
        this.P();
    }

    public void C(int n10, int n11, int n12) {
        block7: {
            block6: {
                boolean bl = j_0.g();
                int n13 = n11;
                if (bl) {
                    if (n13 == 0) {
                        return;
                    }
                    n13 = n11;
                }
                if (n13 <= 0) break block6;
                this.S(n10 - 1, n11, n12);
                if (bl) break block7;
            }
            ua_0 ua_02 = this.o(n10 - 1, -n11, n12);
            if (n10 == 1) {
                ua_02.Q(ua_02.b(), this.M);
            }
            this.P();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String M() {
        HashMap hashMap = new HashMap();
        this.v.lock();
        try {
            StringBuilder stringBuilder = new StringBuilder();
            this.F.A(0, this.R, new pl_2(this, stringBuilder, hashMap));
            String string = stringBuilder.toString();
            return string;
        }
        finally {
            this.v.unlock();
        }
    }

    public dc_1 D(int n10) {
        boolean bl = j_0.g();
        int n11 = n10;
        if (bl) {
            if (n11 >= 0) {
                if (n10 >= this.O()) {
                    B.error(im_2.a(-24943, -9739) + n10 + im_2.a(-24933, -21269) + this.O());
                    return dc_1.v();
                }
                return this.F.t(n10);
            }
            n11 = n10;
        }
        if (n11 < -this.H()) {
            B.error(im_2.a(-24936, -14973) + n10 + im_2.a(-24944, 30249) + -this.H());
            return dc_1.v();
        }
        return this.M.t(this.H() + n10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String c() {
        boolean bl = j_0.g();
        this.v.lock();
        boolean bl2 = bl;
        try {
            StringBuilder stringBuilder;
            block8: {
                StringBuilder stringBuilder2 = new StringBuilder();
                int n10 = 0;
                while (n10 < this.R) {
                    block9: {
                        StringBuilder stringBuilder3;
                        stringBuilder = stringBuilder3 = new StringBuilder(this.F.t(n10).V());
                        if (!bl2) break block8;
                        for (int i2 = (v8281420).length(); i2 < this.D; ++i2) {
                            stringBuilder3.append((char)im_2.a(26422, 2769665079420388080L));
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block9;
                        }
                        StringBuilder stringBuilder4 = stringBuilder3;
                        if (bl2) {
                            if (stringBuilder4.length() > this.D) {
                                stringBuilder3.setLength(this.D);
                            }
                            stringBuilder2.append((CharSequence)stringBuilder3);
                            stringBuilder4 = stringBuilder2.append((char)im_2.a(25581, 2370700456817460777L));
                        }
                        ++n10;
                    }
                    if (bl2) continue;
                }
                stringBuilder = stringBuilder2;
            }
            String string = stringBuilder.toString();
            return string;
        }
        finally {
            this.v.unlock();
        }
    }

    public void x(int n10, int n11, @NotNull lf_0 lf_02) {
        this.F.A(n10, n11, lf_02);
    }

    public void w() {
        this.v.lock();
    }

    public void h() {
        this.v.unlock();
    }

    public boolean d() {
        return this.v.tryLock();
    }

    public int B() {
        return this.D;
    }

    public int O() {
        return this.R;
    }

    public int H() {
        return this.M.b();
    }

    public int k() {
        return this.F.b();
    }

    public char g(int n10, int n11) {
        return this.D(n11).N(n10);
    }

    public YP l(int n10, int n11) {
        return this.D(n11).x(n10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public KB X(int n10, int n11) {
        ua_0 ua_02 = this.F;
        synchronized (ua_02) {
            dc_1 dc_12 = this.D(n11);
            return new KB(Character.valueOf(dc_12.N(n10)), dc_12.x(n10));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public char E(int n10, int n11) {
        ua_0 ua_02 = this.F;
        synchronized (ua_02) {
            dc_1 dc_12 = this.D(n11);
            return dc_12.N(n10);
        }
    }

    public boolean T() {
        return this.z;
    }

    public void P(boolean bl) {
        im_2 im_22;
        block6: {
            block7: {
                boolean bl2;
                block4: {
                    boolean bl3;
                    block5: {
                        this.V = bl;
                        bl3 = j_0.P();
                        bl2 = bl;
                        if (bl3) break block4;
                        if (!bl2) break block5;
                        im_22 = this;
                        if (bl3) break block6;
                        if (im_22.z) break block7;
                        this.f = this.F;
                        this.e = this.M;
                        this.F = this.L();
                        this.M = this.R();
                        this.z = true;
                        if (!bl3) break block7;
                    }
                    im_22 = this;
                    if (bl3) break block6;
                    bl2 = im_22.z;
                }
                if (bl2) {
                    this.F = this.f;
                    this.M = this.e;
                    this.f = this.L();
                    this.e = this.R();
                    this.z = false;
                }
            }
            im_22 = this;
        }
        im_22.P();
    }

    public ua_0 x() {
        return this.M;
    }

    @NotNull
    public ua_0 l() {
        return this.F;
    }

    public void S(int n10, int n11, int n12) {
        this.F.D(n10, n11, n12 - 1, this.h());
        this.P();
    }

    public ua_0 o(int n10, int n11, int n12) {
        ua_0 ua_02 = this.F.K(n10, n11, n12 - 1, this.h());
        this.P();
        return ua_02;
    }

    public void U(int n10, int n11) {
        this.F.b(n10, n11, this.h());
        this.P();
    }

    public void y(int n10, int n11, int n12) {
        block4: {
            block3: {
                boolean bl;
                block2: {
                    YP yP = this.W();
                    bl = j_0.P();
                    if (bl) break block2;
                    if (n12 < 0) break block3;
                    this.F.k(n10, n12, n11, n12 + 1, yP);
                    this.P();
                }
                if (this.J == null || n12 >= this.O()) break block4;
                this.J.U(this.F, this.D(n12));
                if (!bl) break block4;
            }
            B.error(im_2.a(-24940, 2314) + n12);
        }
    }

    public void W() {
        this.F.D();
        this.P();
    }

    public void q(int n10, int n11, lf_0 lf_02) {
        block8: {
            int n12;
            lf_0 lf_03;
            int n13;
            int n14;
            ua_0 ua_02;
            block7: {
                int n15;
                int n16;
                block6: {
                    int n17;
                    boolean bl = j_0.P();
                    int n18 = n11;
                    if (!bl) {
                        if (n18 < 0) {
                            n11 = this.M.b() + this.F.b();
                        }
                        n18 = Math.min(-n10, n11);
                    }
                    n16 = n18;
                    n15 = n17 = this.M.b() + n10;
                    if (bl) break block6;
                    if (n15 < 0) {
                        n17 = 0;
                    }
                    ua_02 = this.M;
                    n14 = n17;
                    n13 = n16;
                    lf_03 = lf_02;
                    n12 = n17;
                    if (bl) break block7;
                    ua_02.t(n14, n13, lf_03, n12);
                    n15 = n16;
                }
                if (n15 >= n11) break block8;
                ua_02 = this.F;
                n14 = 0;
                n13 = n11 - n16;
                lf_03 = lf_02;
                n12 = -n16;
            }
            ua_02.t(n14, n13, lf_03, n12);
        }
    }

    public void c() {
        this.M.D();
        this.P();
    }

    void B() {
        boolean bl = j_0.g();
        this.v.lock();
        boolean bl2 = bl;
        try {
            this.F.Q(this.F.b() - 1, this.F.b());
            this.F.Q(this.F.b(), this.M);
            im_2 im_22 = this;
            if (bl2) {
                if (im_22.M.b() > 0) {
                    this.M.t(this.M.b() - 1).M(false);
                }
                im_22 = this;
            }
            im_22.v.unlock();
        }
        catch (Throwable throwable) {
            this.v.unlock();
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    ua_0 T() {
        ua_0 ua_02;
        boolean bl = j_0.P();
        im_2 im_22 = this;
        if (!bl) {
            if (im_22.z) {
                ua_02 = this.e;
                return ua_02;
            }
            im_22 = this;
        }
        ua_02 = im_22.M;
        return ua_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    ua_0 N() {
        ua_0 ua_02;
        boolean bl = j_0.g();
        im_2 im_22 = this;
        if (bl) {
            if (im_22.z) {
                ua_02 = this.f;
                return ua_02;
            }
            im_22 = this;
        }
        ua_02 = im_22.F;
        return ua_02;
    }

    public int R(@NotNull dc_1 dc_12) {
        return this.F.h(dc_12);
    }

    public void D() {
        this.F.e();
        this.M.e();
        this.P();
    }

    @Nullable
    in_2 p() {
        return this.J;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[13];
                        var11_1 = 0;
                        var10_2 = "\u0011\u00cf\u00c1\u001d\u00e4\u00ab\u00c2\u0086\u00f6\u00a6\f\u00f6<5\u009b\u00eb\u00b4,\u0092\u009f\u00d2\u001f\u0091r&6-\u00c5\u00d1\u0092]\u0080\u00ac\u00f2eD\u0016v\u0080|+\u0010\u009f\b\u00a6\u00e9\u00c4\u00fb\u00e0\u00a3N\u0090\u001b\u00f2\u0091\u00a49t\u00a1\u00b3\u00bb\u00cb\b\u00b1\u00a8CB\u00039\u008f\u00f9#1\u0081\u00e1a86\u0087*;\u00d4s\u00ec\u008cV\u00ca\u0019\u00cebkl\u00ffnL\u00ec\u00d2L[u\u0092\u00b0dg\u00cf\u009d\u00f0\u0007\u008e\u00bf@CwdC\u0007\u00f5W/^\u009a\u00c7\u00fe%T\u0019Mr\u00adT5fm]\u00b9\u00df\u00c2g\u00a5\u0081ST\u00b5G\u0095v\u00a8-\u00b1\u00be/\u00ff#\u00f0\u00da\u001f\u0085\u00cf\u00a5\u00d2\u0018/\u00d6D\u001d\u00d9\u00a7!t\u00c8E\u0088\u00bcdu<\u00b0W`\u00fe8=\u00f7\u00bdDI\u00ca\u009bb\u00ed\u00b2\u0096\u009b\"\u00fc\u0094\u00fa\u00ee\u00a3\u00a2\u00e64c\u00ac\u0095\u00aa\u00844\u009a\r\u00dfY\u0018\u00cf\u00df\u00f1\u00a5\u00cd\u001a\u00cf\u0091\u00db\u008f\u0004\u00ac\u008aVF#\u00b7\u00b91f\"\u00d6\u00c46SW~\u009c-X\u00fe\u00d8HZ\u00bbk\u00e5\u008e\u000f\u00f0\u00ba\u00cfV\u00053\u00beP\u00a6I\u00a5 ";
                        var12_3 = "\u0011\u00cf\u00c1\u001d\u00e4\u00ab\u00c2\u0086\u00f6\u00a6\f\u00f6<5\u009b\u00eb\u00b4,\u0092\u009f\u00d2\u001f\u0091r&6-\u00c5\u00d1\u0092]\u0080\u00ac\u00f2eD\u0016v\u0080|+\u0010\u009f\b\u00a6\u00e9\u00c4\u00fb\u00e0\u00a3N\u0090\u001b\u00f2\u0091\u00a49t\u00a1\u00b3\u00bb\u00cb\b\u00b1\u00a8CB\u00039\u008f\u00f9#1\u0081\u00e1a86\u0087*;\u00d4s\u00ec\u008cV\u00ca\u0019\u00cebkl\u00ffnL\u00ec\u00d2L[u\u0092\u00b0dg\u00cf\u009d\u00f0\u0007\u008e\u00bf@CwdC\u0007\u00f5W/^\u009a\u00c7\u00fe%T\u0019Mr\u00adT5fm]\u00b9\u00df\u00c2g\u00a5\u0081ST\u00b5G\u0095v\u00a8-\u00b1\u00be/\u00ff#\u00f0\u00da\u001f\u0085\u00cf\u00a5\u00d2\u0018/\u00d6D\u001d\u00d9\u00a7!t\u00c8E\u0088\u00bcdu<\u00b0W`\u00fe8=\u00f7\u00bdDI\u00ca\u009bb\u00ed\u00b2\u0096\u009b\"\u00fc\u0094\u00fa\u00ee\u00a3\u00a2\u00e64c\u00ac\u0095\u00aa\u00844\u009a\r\u00dfY\u0018\u00cf\u00df\u00f1\u00a5\u00cd\u001a\u00cf\u0091\u00db\u008f\u0004\u00ac\u008aVF#\u00b7\u00b91f\"\u00d6\u00c46SW~\u009c-X\u00fe\u00d8HZ\u00bbk\u00e5\u008e\u000f\u00f0\u00ba\u00cfV\u00053\u00beP\u00a6I\u00a5 ".length();
                        var9_4 = 13;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 60;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00cb\u00c7Ufa\u0019c\u0000h^\u00d6|\u00fcC$\u008d,\u00acA\u00b1\u009c\u00c4?\u000e\u0083\u00d1r\u00d6\rL\u00c0\u00c2 \u00fb\u00b2\u008d\u00fd'\u001a3\u00abJ\u00eb\u0082\u00a8\u001f6\u00e7\u0098'\u00a9\u00c9J\u00e8V\u00a4\u0011h\u0004\u00922\u0095\u00dc\u0092D";
                            var12_3 = "\u00cb\u00c7Ufa\u0019c\u0000h^\u00d6|\u00fcC$\u008d,\u00acA\u00b1\u009c\u00c4?\u000e\u0083\u00d1r\u00d6\rL\u00c0\u00c2 \u00fb\u00b2\u008d\u00fd'\u001a3\u00abJ\u00eb\u0082\u00a8\u001f6\u00e7\u0098'\u00a9\u00c9J\u00e8V\u00a4\u0011h\u0004\u00922\u0095\u00dc\u0092D".length();
                            var9_4 = 38;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 50;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block22;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 66;
                                    break;
                                }
                                case 1: {
                                    v15 = 59;
                                    break;
                                }
                                case 2: {
                                    v15 = 41;
                                    break;
                                }
                                case 3: {
                                    v15 = 18;
                                    break;
                                }
                                case 4: {
                                    v15 = 13;
                                    break;
                                }
                                case 5: {
                                    v15 = 90;
                                    break;
                                }
                                default: {
                                    v15 = 46;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                im_2.a = var13;
                im_2.b = new String[13];
                var0_7 = 4819120483196325120L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u00d4\u00df\u00c3D\u00d7\u0011\u00cf\u00d0T\u00db!k\u00b6\u00a4\u00d7|\u001a\u00e2\u00c1\u00a0\u00b7\u00cf\u00cb#";
                var5_11 = "\u00d4\u00df\u00c3D\u00d7\u0011\u00cf\u00d0T\u00db!k\u00b6\u00a4\u00d7|\u001a\u00e2\u00c1\u00a0\u00b7\u00cf\u00cb#".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        im_2.c = var6_8;
        im_2.d = new Integer[3];
        im_2.B = LoggerFactory.getLogger(im_2.class);
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9E92) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 67;
                    break;
                }
                case 1: {
                    n14 = 117;
                    break;
                }
                case 2: {
                    n14 = 49;
                    break;
                }
                case 3: {
                    n14 = 28;
                    break;
                }
                case 4: {
                    n14 = 93;
                    break;
                }
                case 5: {
                    n14 = 174;
                    break;
                }
                case 6: {
                    n14 = 255;
                    break;
                }
                case 7: {
                    n14 = 46;
                    break;
                }
                case 8: {
                    n14 = 195;
                    break;
                }
                case 9: {
                    n14 = 223;
                    break;
                }
                case 10: {
                    n14 = 145;
                    break;
                }
                case 11: {
                    n14 = 61;
                    break;
                }
                case 12: {
                    n14 = 196;
                    break;
                }
                case 13: {
                    n14 = 38;
                    break;
                }
                case 14: {
                    n14 = 85;
                    break;
                }
                case 15: {
                    n14 = 102;
                    break;
                }
                case 16: {
                    n14 = 22;
                    break;
                }
                case 17: {
                    n14 = 73;
                    break;
                }
                case 18: {
                    n14 = 128;
                    break;
                }
                case 19: {
                    n14 = 41;
                    break;
                }
                case 20: {
                    n14 = 202;
                    break;
                }
                case 21: {
                    n14 = 192;
                    break;
                }
                case 22: {
                    n14 = 74;
                    break;
                }
                case 23: {
                    n14 = 160;
                    break;
                }
                case 24: {
                    n14 = 132;
                    break;
                }
                case 25: {
                    n14 = 244;
                    break;
                }
                case 26: {
                    n14 = 47;
                    break;
                }
                case 27: {
                    n14 = 98;
                    break;
                }
                case 28: {
                    n14 = 11;
                    break;
                }
                case 29: {
                    n14 = 238;
                    break;
                }
                case 30: {
                    n14 = 147;
                    break;
                }
                case 31: {
                    n14 = 53;
                    break;
                }
                case 32: {
                    n14 = 218;
                    break;
                }
                case 33: {
                    n14 = 45;
                    break;
                }
                case 34: {
                    n14 = 13;
                    break;
                }
                case 35: {
                    n14 = 179;
                    break;
                }
                case 36: {
                    n14 = 106;
                    break;
                }
                case 37: {
                    n14 = 171;
                    break;
                }
                case 38: {
                    n14 = 71;
                    break;
                }
                case 39: {
                    n14 = 24;
                    break;
                }
                case 40: {
                    n14 = 219;
                    break;
                }
                case 41: {
                    n14 = 15;
                    break;
                }
                case 42: {
                    n14 = 159;
                    break;
                }
                case 43: {
                    n14 = 214;
                    break;
                }
                case 44: {
                    n14 = 126;
                    break;
                }
                case 45: {
                    n14 = 121;
                    break;
                }
                case 46: {
                    n14 = 185;
                    break;
                }
                case 47: {
                    n14 = 157;
                    break;
                }
                case 48: {
                    n14 = 30;
                    break;
                }
                case 49: {
                    n14 = 109;
                    break;
                }
                case 50: {
                    n14 = 164;
                    break;
                }
                case 51: {
                    n14 = 153;
                    break;
                }
                case 52: {
                    n14 = 16;
                    break;
                }
                case 53: {
                    n14 = 215;
                    break;
                }
                case 54: {
                    n14 = 235;
                    break;
                }
                case 55: {
                    n14 = 213;
                    break;
                }
                case 56: {
                    n14 = 138;
                    break;
                }
                case 57: {
                    n14 = 82;
                    break;
                }
                case 58: {
                    n14 = 79;
                    break;
                }
                case 59: {
                    n14 = 119;
                    break;
                }
                case 60: {
                    n14 = 246;
                    break;
                }
                case 61: {
                    n14 = 188;
                    break;
                }
                case 62: {
                    n14 = 143;
                    break;
                }
                case 63: {
                    n14 = 254;
                    break;
                }
                case 64: {
                    n14 = 118;
                    break;
                }
                case 65: {
                    n14 = 122;
                    break;
                }
                case 66: {
                    n14 = 222;
                    break;
                }
                case 67: {
                    n14 = 200;
                    break;
                }
                case 68: {
                    n14 = 176;
                    break;
                }
                case 69: {
                    n14 = 237;
                    break;
                }
                case 70: {
                    n14 = 77;
                    break;
                }
                case 71: {
                    n14 = 194;
                    break;
                }
                case 72: {
                    n14 = 1;
                    break;
                }
                case 73: {
                    n14 = 52;
                    break;
                }
                case 74: {
                    n14 = 248;
                    break;
                }
                case 75: {
                    n14 = 178;
                    break;
                }
                case 76: {
                    n14 = 216;
                    break;
                }
                case 77: {
                    n14 = 78;
                    break;
                }
                case 78: {
                    n14 = 94;
                    break;
                }
                case 79: {
                    n14 = 231;
                    break;
                }
                case 80: {
                    n14 = 241;
                    break;
                }
                case 81: {
                    n14 = 221;
                    break;
                }
                case 82: {
                    n14 = 242;
                    break;
                }
                case 83: {
                    n14 = 20;
                    break;
                }
                case 84: {
                    n14 = 230;
                    break;
                }
                case 85: {
                    n14 = 50;
                    break;
                }
                case 86: {
                    n14 = 92;
                    break;
                }
                case 87: {
                    n14 = 191;
                    break;
                }
                case 88: {
                    n14 = 149;
                    break;
                }
                case 89: {
                    n14 = 91;
                    break;
                }
                case 90: {
                    n14 = 141;
                    break;
                }
                case 91: {
                    n14 = 207;
                    break;
                }
                case 92: {
                    n14 = 175;
                    break;
                }
                case 93: {
                    n14 = 140;
                    break;
                }
                case 94: {
                    n14 = 64;
                    break;
                }
                case 95: {
                    n14 = 158;
                    break;
                }
                case 96: {
                    n14 = 62;
                    break;
                }
                case 97: {
                    n14 = 96;
                    break;
                }
                case 98: {
                    n14 = 139;
                    break;
                }
                case 99: {
                    n14 = 35;
                    break;
                }
                case 100: {
                    n14 = 104;
                    break;
                }
                case 101: {
                    n14 = 2;
                    break;
                }
                case 102: {
                    n14 = 203;
                    break;
                }
                case 103: {
                    n14 = 60;
                    break;
                }
                case 104: {
                    n14 = 70;
                    break;
                }
                case 105: {
                    n14 = 236;
                    break;
                }
                case 106: {
                    n14 = 116;
                    break;
                }
                case 107: {
                    n14 = 33;
                    break;
                }
                case 108: {
                    n14 = 133;
                    break;
                }
                case 109: {
                    n14 = 135;
                    break;
                }
                case 110: {
                    n14 = 26;
                    break;
                }
                case 111: {
                    n14 = 3;
                    break;
                }
                case 112: {
                    n14 = 187;
                    break;
                }
                case 113: {
                    n14 = 7;
                    break;
                }
                case 114: {
                    n14 = 127;
                    break;
                }
                case 115: {
                    n14 = 152;
                    break;
                }
                case 116: {
                    n14 = 34;
                    break;
                }
                case 117: {
                    n14 = 14;
                    break;
                }
                case 118: {
                    n14 = 58;
                    break;
                }
                case 119: {
                    n14 = 226;
                    break;
                }
                case 120: {
                    n14 = 83;
                    break;
                }
                case 121: {
                    n14 = 137;
                    break;
                }
                case 122: {
                    n14 = 88;
                    break;
                }
                case 123: {
                    n14 = 4;
                    break;
                }
                case 124: {
                    n14 = 59;
                    break;
                }
                case 125: {
                    n14 = 63;
                    break;
                }
                case 126: {
                    n14 = 233;
                    break;
                }
                case 127: {
                    n14 = 193;
                    break;
                }
                case 128: {
                    n14 = 27;
                    break;
                }
                case 129: {
                    n14 = 32;
                    break;
                }
                case 130: {
                    n14 = 227;
                    break;
                }
                case 131: {
                    n14 = 9;
                    break;
                }
                case 132: {
                    n14 = 229;
                    break;
                }
                case 133: {
                    n14 = 89;
                    break;
                }
                case 134: {
                    n14 = 129;
                    break;
                }
                case 135: {
                    n14 = 205;
                    break;
                }
                case 136: {
                    n14 = 123;
                    break;
                }
                case 137: {
                    n14 = 201;
                    break;
                }
                case 138: {
                    n14 = 57;
                    break;
                }
                case 139: {
                    n14 = 211;
                    break;
                }
                case 140: {
                    n14 = 23;
                    break;
                }
                case 141: {
                    n14 = 198;
                    break;
                }
                case 142: {
                    n14 = 90;
                    break;
                }
                case 143: {
                    n14 = 84;
                    break;
                }
                case 144: {
                    n14 = 72;
                    break;
                }
                case 145: {
                    n14 = 19;
                    break;
                }
                case 146: {
                    n14 = 177;
                    break;
                }
                case 147: {
                    n14 = 167;
                    break;
                }
                case 148: {
                    n14 = 8;
                    break;
                }
                case 149: {
                    n14 = 44;
                    break;
                }
                case 150: {
                    n14 = 156;
                    break;
                }
                case 151: {
                    n14 = 69;
                    break;
                }
                case 152: {
                    n14 = 6;
                    break;
                }
                case 153: {
                    n14 = 100;
                    break;
                }
                case 154: {
                    n14 = 54;
                    break;
                }
                case 155: {
                    n14 = 68;
                    break;
                }
                case 156: {
                    n14 = 190;
                    break;
                }
                case 157: {
                    n14 = 0;
                    break;
                }
                case 158: {
                    n14 = 161;
                    break;
                }
                case 159: {
                    n14 = 228;
                    break;
                }
                case 160: {
                    n14 = 113;
                    break;
                }
                case 161: {
                    n14 = 181;
                    break;
                }
                case 162: {
                    n14 = 31;
                    break;
                }
                case 163: {
                    n14 = 131;
                    break;
                }
                case 164: {
                    n14 = 224;
                    break;
                }
                case 165: {
                    n14 = 182;
                    break;
                }
                case 166: {
                    n14 = 150;
                    break;
                }
                case 167: {
                    n14 = 134;
                    break;
                }
                case 168: {
                    n14 = 243;
                    break;
                }
                case 169: {
                    n14 = 173;
                    break;
                }
                case 170: {
                    n14 = 18;
                    break;
                }
                case 171: {
                    n14 = 51;
                    break;
                }
                case 172: {
                    n14 = 97;
                    break;
                }
                case 173: {
                    n14 = 95;
                    break;
                }
                case 174: {
                    n14 = 99;
                    break;
                }
                case 175: {
                    n14 = 172;
                    break;
                }
                case 176: {
                    n14 = 204;
                    break;
                }
                case 177: {
                    n14 = 247;
                    break;
                }
                case 178: {
                    n14 = 86;
                    break;
                }
                case 179: {
                    n14 = 225;
                    break;
                }
                case 180: {
                    n14 = 183;
                    break;
                }
                case 181: {
                    n14 = 124;
                    break;
                }
                case 182: {
                    n14 = 10;
                    break;
                }
                case 183: {
                    n14 = 199;
                    break;
                }
                case 184: {
                    n14 = 168;
                    break;
                }
                case 185: {
                    n14 = 130;
                    break;
                }
                case 186: {
                    n14 = 169;
                    break;
                }
                case 187: {
                    n14 = 110;
                    break;
                }
                case 188: {
                    n14 = 163;
                    break;
                }
                case 189: {
                    n14 = 112;
                    break;
                }
                case 190: {
                    n14 = 66;
                    break;
                }
                case 191: {
                    n14 = 65;
                    break;
                }
                case 192: {
                    n14 = 111;
                    break;
                }
                case 193: {
                    n14 = 155;
                    break;
                }
                case 194: {
                    n14 = 17;
                    break;
                }
                case 195: {
                    n14 = 39;
                    break;
                }
                case 196: {
                    n14 = 29;
                    break;
                }
                case 197: {
                    n14 = 165;
                    break;
                }
                case 198: {
                    n14 = 206;
                    break;
                }
                case 199: {
                    n14 = 186;
                    break;
                }
                case 200: {
                    n14 = 42;
                    break;
                }
                case 201: {
                    n14 = 251;
                    break;
                }
                case 202: {
                    n14 = 101;
                    break;
                }
                case 203: {
                    n14 = 144;
                    break;
                }
                case 204: {
                    n14 = 180;
                    break;
                }
                case 205: {
                    n14 = 43;
                    break;
                }
                case 206: {
                    n14 = 120;
                    break;
                }
                case 207: {
                    n14 = 240;
                    break;
                }
                case 208: {
                    n14 = 12;
                    break;
                }
                case 209: {
                    n14 = 208;
                    break;
                }
                case 210: {
                    n14 = 249;
                    break;
                }
                case 211: {
                    n14 = 114;
                    break;
                }
                case 212: {
                    n14 = 136;
                    break;
                }
                case 213: {
                    n14 = 162;
                    break;
                }
                case 214: {
                    n14 = 166;
                    break;
                }
                case 215: {
                    n14 = 252;
                    break;
                }
                case 216: {
                    n14 = 170;
                    break;
                }
                case 217: {
                    n14 = 146;
                    break;
                }
                case 218: {
                    n14 = 239;
                    break;
                }
                case 219: {
                    n14 = 217;
                    break;
                }
                case 220: {
                    n14 = 36;
                    break;
                }
                case 221: {
                    n14 = 189;
                    break;
                }
                case 222: {
                    n14 = 40;
                    break;
                }
                case 223: {
                    n14 = 21;
                    break;
                }
                case 224: {
                    n14 = 37;
                    break;
                }
                case 225: {
                    n14 = 75;
                    break;
                }
                case 226: {
                    n14 = 107;
                    break;
                }
                case 227: {
                    n14 = 25;
                    break;
                }
                case 228: {
                    n14 = 56;
                    break;
                }
                case 229: {
                    n14 = 76;
                    break;
                }
                case 230: {
                    n14 = 103;
                    break;
                }
                case 231: {
                    n14 = 234;
                    break;
                }
                case 232: {
                    n14 = 55;
                    break;
                }
                case 233: {
                    n14 = 108;
                    break;
                }
                case 234: {
                    n14 = 5;
                    break;
                }
                case 235: {
                    n14 = 184;
                    break;
                }
                case 236: {
                    n14 = 81;
                    break;
                }
                case 237: {
                    n14 = 253;
                    break;
                }
                case 238: {
                    n14 = 154;
                    break;
                }
                case 239: {
                    n14 = 197;
                    break;
                }
                case 240: {
                    n14 = 151;
                    break;
                }
                case 241: {
                    n14 = 220;
                    break;
                }
                case 242: {
                    n14 = 125;
                    break;
                }
                case 243: {
                    n14 = 212;
                    break;
                }
                case 244: {
                    n14 = 210;
                    break;
                }
                case 245: {
                    n14 = 48;
                    break;
                }
                case 246: {
                    n14 = 232;
                    break;
                }
                case 247: {
                    n14 = 245;
                    break;
                }
                case 248: {
                    n14 = 105;
                    break;
                }
                case 249: {
                    n14 = 87;
                    break;
                }
                case 250: {
                    n14 = 209;
                    break;
                }
                case 251: {
                    n14 = 250;
                    break;
                }
                case 252: {
                    n14 = 80;
                    break;
                }
                case 253: {
                    n14 = 142;
                    break;
                }
                case 254: {
                    n14 = 115;
                    break;
                }
                default: {
                    n14 = 148;
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
            im_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x65C6;
        if (d[n11] == null) {
            im_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

