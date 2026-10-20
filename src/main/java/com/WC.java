/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BW;
import com.FV;
import com.NE;
import com.SQ;
import com.aL;
import com.gk_0;
import com.ky_2;
import com.ne_1;
import com.xz_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class WC {
    public static String C;
    public static int O;
    public static boolean U;
    protected final List j = new ArrayList(1);
    protected int o = 0;
    protected int a;
    protected final Map r = new Hashtable();
    protected long E = 0L;
    protected long t = 0L;
    protected int N = 0;
    protected Thread d = null;
    protected long b;
    protected long H;
    protected boolean p = true;
    protected boolean M = true;
    protected boolean A = true;
    protected boolean Y = false;
    protected boolean T;
    protected String Q;
    protected String y;
    protected int h;
    private static int[] m;
    private static final String[] c;
    private static final String[] e;
    private static final long[] f;
    private static final Long[] g;

    public WC(String string) {
        this(NE.X(string));
    }

    public WC(long l2) {
        this(C, l2);
    }

    public WC(String string, String string2) {
        this(string, NE.X(string2));
    }

    public WC(String string, long l2) {
        this(string, l2, null);
    }

    public WC(long l2, long l3) {
        this(C, l2, l3);
    }

    public WC(String string, long l2, long l3) {
        this(string, l2, l3, null);
    }

    public WC(String string, ActionListener actionListener) {
        this(NE.X(string), actionListener);
    }

    public WC(long l2, ActionListener actionListener) {
        this(C, l2, actionListener);
    }

    public WC(String string, String string2, ActionListener actionListener) {
        this(string, NE.X(string2), actionListener);
    }

    public WC(String string, long l2, ActionListener actionListener) {
        this(string, l2, WC.a(12212, 5598005336202504494L), actionListener);
    }

    public WC(long l2, long l3, ActionListener actionListener) {
        this(C, l2, l3, actionListener);
    }

    public WC(String string, String string2, String string3, ActionListener actionListener) {
        this(string, NE.X(string2), NE.X(string3), actionListener);
    }

    public WC(String string, long l2, long l3, ActionListener actionListener) {
        int[] nArray = WC.V();
        try {
            this.T = false;
            this.Q = "";
            this.y = null;
            this.h = 0;
            this.m(string);
            this.M(l2);
            this.o(l3);
            this.q(actionListener);
            if (nArray != null) {
                ky_2.K(new String[1]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw WC.a(illegalArgumentException);
        }
    }

    public long E() {
        return this.H;
    }

    public String W() {
        return NE.I(this.H);
    }

    public WC A(String string) {
        this.o(NE.X(string));
        return this;
    }

    public WC o(long l2) {
        block6: {
            block7: {
                int[] nArray = WC.V();
                try {
                    try {
                        try {
                            if (nArray != null) break block6;
                            if (l2 == WC.a(12727, 4168816998890403628L)) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                        if (l2 >= 0L) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(WC.a(17030, 32504) + l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
            }
            this.H = l2;
        }
        return this;
    }

    public long k() {
        return this.b;
    }

    public String y() {
        return NE.I(this.b);
    }

    public WC P(String string) {
        this.M(NE.X(string));
        return this;
    }

    public WC M(long l2) {
        block4: {
            block5: {
                int[] nArray = WC.V();
                try {
                    try {
                        if (nArray != null) break block4;
                        if (l2 >= 0L) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(WC.a(17029, 12396) + l2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
            }
            this.b = l2;
        }
        return this;
    }

    public boolean y() {
        return this.p;
    }

    public WC x(boolean bl) {
        this.p = bl;
        return this;
    }

    public boolean q() {
        return this.M;
    }

    public WC Y(boolean bl) {
        this.M = bl;
        return this;
    }

    public boolean Z() {
        return this.A;
    }

    public WC r(boolean bl) {
        this.A = bl;
        return this;
    }

    public boolean F() {
        return this.Y;
    }

    public WC O(boolean bl) {
        this.Y = bl;
        return this;
    }

    public boolean v() {
        return this.T;
    }

    public WC T(boolean bl) {
        this.T = bl;
        return this;
    }

    public String u() {
        return this.Q;
    }

    public WC Q(String string) {
        this.Q = string;
        return this;
    }

    public int p() {
        return this.h;
    }

    public WC e(int n10) {
        this.h = n10;
        return this;
    }

    public String J() {
        return this.y;
    }

    public WC m(String string) {
        WC wC;
        block4: {
            block5: {
                this.y = string;
                int[] nArray = WC.V();
                try {
                    try {
                        wC = this;
                        if (nArray != null) break block4;
                        if (wC.d == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                    this.d.setName(string);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
            }
            wC = this;
        }
        return wC;
    }

    public long m() {
        return System.currentTimeMillis() - this.E;
    }

    public long I() {
        return this.t - this.m();
    }

    public int o() {
        return this.N;
    }

    public int Q() {
        return this.N + 1;
    }

    public boolean u() {
        int n10;
        block10: {
            block9: {
                int[] nArray;
                block8: {
                    nArray = WC.V();
                    try {
                        try {
                            n10 = this.p();
                            if (nArray != null) break block8;
                            if (n10 <= 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                        n10 = this.Q();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (nArray != null) break block10;
                        if (n10 != this.p()) break block9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                    n10 = 1;
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public WC u() {
        this.K();
        return this;
    }

    public WC Y() {
        this.j();
        return this;
    }

    public WC q() {
        this.j();
        this.K();
        return this;
    }

    public WC h(long l2) {
        this.j();
        this.o(l2);
        this.M(l2);
        this.K();
        return this;
    }

    public WC m(long l2, long l3) {
        this.j();
        this.o(l2);
        this.M(l3);
        this.K();
        return this;
    }

    public WC z(String string) {
        this.j();
        this.A(string);
        this.P(string);
        this.K();
        return this;
    }

    public WC e(String string, String string2) {
        this.j();
        this.A(string);
        this.P(string2);
        this.K();
        return this;
    }

    public synchronized boolean i() {
        boolean bl;
        block8: {
            block7: {
                Thread thread;
                int[] nArray;
                block6: {
                    nArray = WC.V();
                    try {
                        try {
                            thread = this.d;
                            if (nArray != null) break block6;
                            if (thread == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                        thread = this.d;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                }
                try {
                    bl = thread.isAlive();
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    protected synchronized void K() {
        int n10;
        block2: {
            block3: {
                int[] nArray = WC.V();
                try {
                    n10 = this.i();
                    if (nArray != null) break block2;
                    if (n10 == 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
                return;
            }
            n10 = this.a = this.o++;
        }
        int n11 = n10;
        this.d = new Thread((Runnable)new SQ(this, n11), this.y);
        this.d.setDaemon(this.Y);
        this.d.start();
    }

    protected boolean E(int n10, int n11) {
        int n12;
        block19: {
            block17: {
                int[] nArray;
                block18: {
                    block16: {
                        nArray = WC.V();
                        try {
                            try {
                                n12 = ((Boolean)this.r.get(n11)).booleanValue();
                                if (nArray != null) break block16;
                                if (n12 == 0) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw WC.a(illegalArgumentException);
                            }
                            n12 = Thread.currentThread().isInterrupted();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (nArray != null) break block18;
                            if (n12 != 0) break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                        n12 = this.h;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                }
                try {
                    block20: {
                        try {
                            try {
                                try {
                                    if (nArray != null) break block19;
                                    if (n12 <= 0) break block20;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw WC.a(illegalArgumentException);
                                }
                                n12 = this.h;
                                if (nArray != null) break block19;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw WC.a(illegalArgumentException);
                            }
                            if (n12 <= n10) break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                    }
                    n12 = 1;
                    break block19;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw WC.a(illegalArgumentException);
                }
            }
            n12 = 0;
        }
        return n12 != 0;
    }

    protected void R(int n10, boolean bl) {
        this.r.put(n10, bl);
    }

    protected void L(int n10) {
        this.r.remove(n10);
    }

    /*
     * Unable to fully structure code
     */
    protected synchronized void j() {
        block10: {
            block9: {
                var1_1 = WC.V();
                v0 = this.d;
                if (var1_1 != null) break block9;
                try {
                    block11: {
                        if (v0 == null) break block10;
                        break block11;
                        catch (InterruptedException v1) {
                            throw WC.a(v1);
                        }
                    }
                    v0 = this.d;
                }
                catch (InterruptedException v2) {
                    throw WC.a(v2);
                }
            }
            try {
                v0.interrupt();
                this.R(this.a, false);
                v3 = this;
                if (var1_1 == null) {
                    if (v3.T) break block10;
                }
                ** GOTO lbl28
            }
            catch (InterruptedException v4) {
                throw WC.a(v4);
            }
            try {
                v3 = this;
lbl28:
                // 2 sources

                v3.d.join();
            }
            catch (InterruptedException var2_2) {
                ne_1.g(this, var2_2);
            }
        }
    }

    public WC q(ActionListener actionListener) {
        try {
            if (actionListener != null) {
                this.j.add(actionListener);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw WC.a(illegalArgumentException);
        }
        return this;
    }

    public WC C(ActionListener actionListener) {
        try {
            if (actionListener != null) {
                this.j.remove(actionListener);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw WC.a(illegalArgumentException);
        }
        return this;
    }

    public List G() {
        return this.j;
    }

    public void X(int n10) {
        block23: {
            ArrayList arrayList;
            ActionEvent actionEvent;
            int[] nArray;
            block25: {
                block27: {
                    boolean bl;
                    block26: {
                        block24: {
                            WC wC;
                            block22: {
                                nArray = WC.V();
                                try {
                                    try {
                                        wC = this;
                                        if (nArray != null) break block22;
                                        if (wC.j.size() <= 0) break block23;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw WC.a(illegalArgumentException);
                                    }
                                    wC = this;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw WC.a(illegalArgumentException);
                                }
                            }
                            actionEvent = wC.w();
                            arrayList = aL.J((Collection)this.j);
                            try {
                                try {
                                    bl = this.A;
                                    if (nArray != null) break block24;
                                    if (!bl) break block25;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw WC.a(illegalArgumentException);
                                }
                                bl = this.M;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw WC.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (nArray != null) break block26;
                                if (!bl) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw WC.a(illegalArgumentException);
                            }
                            bl = this.E(this.N, n10);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (!bl) break block23;
                        FV.G(new BW(this, arrayList, actionEvent));
                        if (nArray == null) break block23;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw WC.a(illegalArgumentException);
                    }
                }
                for (ActionListener actionListener : arrayList) {
                    block28: {
                        try {
                            try {
                                if (nArray != null) break block23;
                                if (!this.E(this.N, n10)) break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw WC.a(illegalArgumentException);
                            }
                            FV.G(new xz_1(this, actionListener, actionEvent));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw WC.a(illegalArgumentException);
                        }
                    }
                    if (nArray == null) continue;
                }
                if (nArray == null) break block23;
            }
            for (ActionListener actionListener : arrayList) {
                actionListener.actionPerformed(actionEvent);
                if (nArray == null) continue;
            }
        }
    }

    protected ActionEvent w() {
        return new ActionEvent(this, 0, this.Q, gk_0.r(), 0);
    }

    public String toString() {
        return this.y + WC.a(17027, 13678) + this.y() + WC.a(17031, 14602) + this.W() + ")";
    }

    public static WC m(String string, ActionListener actionListener) {
        return WC.A(NE.X(string), actionListener);
    }

    public static WC A(long l2, ActionListener actionListener) {
        return WC.w(C, l2, actionListener);
    }

    public static WC v(String string, String string2, ActionListener actionListener) {
        return WC.w(string, NE.X(string2), actionListener);
    }

    public static WC w(String string, long l2, ActionListener actionListener) {
        return WC.n(string, l2, true, actionListener);
    }

    public static WC R(String string, boolean bl, ActionListener actionListener) {
        return WC.d(NE.X(string), bl, actionListener);
    }

    public static WC d(long l2, boolean bl, ActionListener actionListener) {
        return WC.n(C, l2, bl, actionListener);
    }

    public static WC h(String string, String string2, boolean bl, ActionListener actionListener) {
        return WC.n(string, NE.X(string2), bl, actionListener);
    }

    public static WC n(String string, long l2, boolean bl, ActionListener actionListener) {
        WC wC = new WC(string, l2, actionListener);
        wC.x(false);
        wC.r(bl);
        wC.u();
        return wC;
    }

    public static WC q(String string, ActionListener actionListener) {
        long l2 = NE.X(string);
        return WC.r(C, l2, l2, O, U, actionListener);
    }

    public static WC g(String string, int n10, ActionListener actionListener) {
        long l2 = NE.X(string);
        return WC.r(C, l2, l2, n10, U, actionListener);
    }

    public static WC x(long l2, ActionListener actionListener) {
        return WC.r(C, l2, l2, O, U, actionListener);
    }

    public static WC V(long l2, int n10, ActionListener actionListener) {
        return WC.r(C, l2, l2, n10, U, actionListener);
    }

    public static WC c(String string, String string2, ActionListener actionListener) {
        long l2 = NE.X(string2);
        return WC.r(string, l2, l2, O, U, actionListener);
    }

    public static WC h(String string, String string2, int n10, ActionListener actionListener) {
        long l2 = NE.X(string2);
        return WC.r(string, l2, l2, n10, U, actionListener);
    }

    public static WC s(String string, long l2, ActionListener actionListener) {
        return WC.r(string, l2, l2, O, U, actionListener);
    }

    public static WC e(String string, long l2, int n10, ActionListener actionListener) {
        return WC.r(string, l2, l2, n10, U, actionListener);
    }

    public static WC N(String string, boolean bl, ActionListener actionListener) {
        long l2 = NE.X(string);
        return WC.r(C, l2, l2, O, bl, actionListener);
    }

    public static WC d(String string, int n10, boolean bl, ActionListener actionListener) {
        long l2 = NE.X(string);
        return WC.r(C, l2, l2, n10, bl, actionListener);
    }

    public static WC l(long l2, boolean bl, ActionListener actionListener) {
        return WC.r(C, l2, l2, O, bl, actionListener);
    }

    public static WC g(long l2, int n10, boolean bl, ActionListener actionListener) {
        return WC.r(C, l2, l2, n10, bl, actionListener);
    }

    public static WC R(String string, String string2, boolean bl, ActionListener actionListener) {
        long l2 = NE.X(string2);
        return WC.r(string, l2, l2, O, bl, actionListener);
    }

    public static WC D(String string, String string2, int n10, boolean bl, ActionListener actionListener) {
        long l2 = NE.X(string2);
        return WC.r(string, l2, l2, n10, bl, actionListener);
    }

    public static WC V(String string, long l2, boolean bl, ActionListener actionListener) {
        return WC.r(string, l2, l2, O, bl, actionListener);
    }

    public static WC N(String string, long l2, int n10, boolean bl, ActionListener actionListener) {
        return WC.r(string, l2, l2, n10, bl, actionListener);
    }

    public static WC E(long l2, long l3, ActionListener actionListener) {
        return WC.r(C, l2, l3, O, U, actionListener);
    }

    public static WC N(long l2, long l3, int n10, ActionListener actionListener) {
        return WC.r(C, l2, l3, n10, U, actionListener);
    }

    public static WC I(String string, long l2, long l3, ActionListener actionListener) {
        return WC.r(string, l2, l3, O, U, actionListener);
    }

    public static WC O(String string, long l2, long l3, int n10, ActionListener actionListener) {
        return WC.r(string, l2, l3, n10, U, actionListener);
    }

    public static WC M(long l2, long l3, boolean bl, ActionListener actionListener) {
        return WC.r(C, l2, l3, O, bl, actionListener);
    }

    public static WC L(long l2, long l3, int n10, boolean bl, ActionListener actionListener) {
        return WC.r(C, l2, l3, n10, bl, actionListener);
    }

    public static WC r(String string, long l2, long l3, boolean bl, ActionListener actionListener) {
        return WC.r(string, l2, l3, O, bl, actionListener);
    }

    public static WC r(String string, long l2, long l3, int n10, boolean bl, ActionListener actionListener) {
        WC wC = new WC(string, l2, l3, actionListener);
        wC.x(true);
        wC.r(bl);
        wC.e(n10);
        wC.u();
        return wC;
    }

    public static WC M(boolean bl, String string, long l2, ActionListener actionListener) {
        return WC.c(bl, string, l2, l2, actionListener);
    }

    public static WC c(boolean bl, String string, long l2, long l3, ActionListener actionListener) {
        return WC.v(bl, string, l2, l3, O, actionListener);
    }

    public static WC v(boolean bl, String string, long l2, long l3, int n10, ActionListener actionListener) {
        WC wC = new WC(string, l2, l3, actionListener);
        wC.x(true);
        wC.O(bl);
        wC.r(false);
        wC.e(n10);
        wC.u();
        return wC;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[5];
                        var11_1 = 0;
                        var10_2 = "e\u0099\u00a7\u001d\u00d2\u00bc\u00ac|\u00ac\u0080r\u00f8\u00dc\u0096\u00c5\u001d\u00e1\u0017(\u00874\u00dc>\u008dc\u0013O\u000f*ZZ\u00f1\u00a5\u00f1\u0016\u0091*\u00a8\u00fc\u00a4K\u000f\u0094\u00f1\u00a3\u0012\u00ccT=(\u0089c[\u00a8\u00c1C\u0088";
                        var12_3 = "e\u0099\u00a7\u001d\u00d2\u00bc\u00ac|\u00ac\u0080r\u00f8\u00dc\u0096\u00c5\u001d\u00e1\u0017(\u00874\u00dc>\u008dc\u0013O\u000f*ZZ\u00f1\u00a5\u00f1\u0016\u0091*\u00a8\u00fc\u00a4K\u000f\u0094\u00f1\u00a3\u0012\u00ccT=(\u0089c[\u00a8\u00c1C\u0088".length();
                        var9_4 = 17;
                        var8_5 = -1;
                        WC.I(null);
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 107;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00deK\u0086\u00bf^\u00d3n\u00ab\t\u00d4\u009f\u00d5\u00f9\u00f7\u0000\u00e2\u000e%";
                            var12_3 = "\u00deK\u0086\u00bf^\u00d3n\u00ab\t\u00d4\u009f\u00d5\u00f9\u00f7\u0000\u00e2\u000e%".length();
                            var9_4 = 8;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 110;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
                                break;
                            }
                            break;
                        }
lbl29:
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
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 67;
                                    break;
                                }
                                case 1: {
                                    v15 = 77;
                                    break;
                                }
                                case 2: {
                                    v15 = 73;
                                    break;
                                }
                                case 3: {
                                    v15 = 65;
                                    break;
                                }
                                case 4: {
                                    v15 = 67;
                                    break;
                                }
                                case 5: {
                                    v15 = 28;
                                    break;
                                }
                                default: {
                                    v15 = 79;
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
lbl86:
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
lbl96:
                        // 1 sources

                        ** continue;
                    }
                }
                WC.c = var13;
                WC.e = new String[5];
                var0_7 = 8669330064997551113L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "\u00ca\u0000F\rp#\u009a\u00d8\u00bej\u00c6\u00c5\u00cbL\u0004\u00da";
                var5_11 = "\u00ca\u0000F\rp#\u009a\u00d8\u00bej\u00c6\u00c5\u00cbL\u0004\u00da".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl108:
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
        WC.f = var6_8;
        WC.g = new Long[2];
        WC.C = WC.a(17028, 23024);
        WC.O = 0;
        WC.U = true;
    }

    public static void I(int[] nArray) {
        m = nArray;
    }

    public static int[] V() {
        return m;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x4287) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 175;
                    break;
                }
                case 1: {
                    n14 = 85;
                    break;
                }
                case 2: {
                    n14 = 31;
                    break;
                }
                case 3: {
                    n14 = 152;
                    break;
                }
                case 4: {
                    n14 = 52;
                    break;
                }
                case 5: {
                    n14 = 239;
                    break;
                }
                case 6: {
                    n14 = 115;
                    break;
                }
                case 7: {
                    n14 = 13;
                    break;
                }
                case 8: {
                    n14 = 94;
                    break;
                }
                case 9: {
                    n14 = 134;
                    break;
                }
                case 10: {
                    n14 = 8;
                    break;
                }
                case 11: {
                    n14 = 244;
                    break;
                }
                case 12: {
                    n14 = 250;
                    break;
                }
                case 13: {
                    n14 = 219;
                    break;
                }
                case 14: {
                    n14 = 151;
                    break;
                }
                case 15: {
                    n14 = 225;
                    break;
                }
                case 16: {
                    n14 = 165;
                    break;
                }
                case 17: {
                    n14 = 45;
                    break;
                }
                case 18: {
                    n14 = 100;
                    break;
                }
                case 19: {
                    n14 = 235;
                    break;
                }
                case 20: {
                    n14 = 104;
                    break;
                }
                case 21: {
                    n14 = 177;
                    break;
                }
                case 22: {
                    n14 = 136;
                    break;
                }
                case 23: {
                    n14 = 105;
                    break;
                }
                case 24: {
                    n14 = 184;
                    break;
                }
                case 25: {
                    n14 = 117;
                    break;
                }
                case 26: {
                    n14 = 208;
                    break;
                }
                case 27: {
                    n14 = 167;
                    break;
                }
                case 28: {
                    n14 = 93;
                    break;
                }
                case 29: {
                    n14 = 157;
                    break;
                }
                case 30: {
                    n14 = 81;
                    break;
                }
                case 31: {
                    n14 = 144;
                    break;
                }
                case 32: {
                    n14 = 34;
                    break;
                }
                case 33: {
                    n14 = 164;
                    break;
                }
                case 34: {
                    n14 = 179;
                    break;
                }
                case 35: {
                    n14 = 79;
                    break;
                }
                case 36: {
                    n14 = 86;
                    break;
                }
                case 37: {
                    n14 = 159;
                    break;
                }
                case 38: {
                    n14 = 19;
                    break;
                }
                case 39: {
                    n14 = 23;
                    break;
                }
                case 40: {
                    n14 = 121;
                    break;
                }
                case 41: {
                    n14 = 116;
                    break;
                }
                case 42: {
                    n14 = 241;
                    break;
                }
                case 43: {
                    n14 = 216;
                    break;
                }
                case 44: {
                    n14 = 92;
                    break;
                }
                case 45: {
                    n14 = 206;
                    break;
                }
                case 46: {
                    n14 = 24;
                    break;
                }
                case 47: {
                    n14 = 80;
                    break;
                }
                case 48: {
                    n14 = 194;
                    break;
                }
                case 49: {
                    n14 = 236;
                    break;
                }
                case 50: {
                    n14 = 142;
                    break;
                }
                case 51: {
                    n14 = 120;
                    break;
                }
                case 52: {
                    n14 = 217;
                    break;
                }
                case 53: {
                    n14 = 18;
                    break;
                }
                case 54: {
                    n14 = 162;
                    break;
                }
                case 55: {
                    n14 = 22;
                    break;
                }
                case 56: {
                    n14 = 249;
                    break;
                }
                case 57: {
                    n14 = 78;
                    break;
                }
                case 58: {
                    n14 = 69;
                    break;
                }
                case 59: {
                    n14 = 133;
                    break;
                }
                case 60: {
                    n14 = 145;
                    break;
                }
                case 61: {
                    n14 = 193;
                    break;
                }
                case 62: {
                    n14 = 54;
                    break;
                }
                case 63: {
                    n14 = 180;
                    break;
                }
                case 64: {
                    n14 = 53;
                    break;
                }
                case 65: {
                    n14 = 17;
                    break;
                }
                case 66: {
                    n14 = 187;
                    break;
                }
                case 67: {
                    n14 = 6;
                    break;
                }
                case 68: {
                    n14 = 68;
                    break;
                }
                case 69: {
                    n14 = 143;
                    break;
                }
                case 70: {
                    n14 = 56;
                    break;
                }
                case 71: {
                    n14 = 129;
                    break;
                }
                case 72: {
                    n14 = 185;
                    break;
                }
                case 73: {
                    n14 = 49;
                    break;
                }
                case 74: {
                    n14 = 245;
                    break;
                }
                case 75: {
                    n14 = 200;
                    break;
                }
                case 76: {
                    n14 = 106;
                    break;
                }
                case 77: {
                    n14 = 166;
                    break;
                }
                case 78: {
                    n14 = 28;
                    break;
                }
                case 79: {
                    n14 = 212;
                    break;
                }
                case 80: {
                    n14 = 103;
                    break;
                }
                case 81: {
                    n14 = 123;
                    break;
                }
                case 82: {
                    n14 = 154;
                    break;
                }
                case 83: {
                    n14 = 130;
                    break;
                }
                case 84: {
                    n14 = 168;
                    break;
                }
                case 85: {
                    n14 = 122;
                    break;
                }
                case 86: {
                    n14 = 7;
                    break;
                }
                case 87: {
                    n14 = 95;
                    break;
                }
                case 88: {
                    n14 = 58;
                    break;
                }
                case 89: {
                    n14 = 15;
                    break;
                }
                case 90: {
                    n14 = 248;
                    break;
                }
                case 91: {
                    n14 = 0;
                    break;
                }
                case 92: {
                    n14 = 201;
                    break;
                }
                case 93: {
                    n14 = 237;
                    break;
                }
                case 94: {
                    n14 = 135;
                    break;
                }
                case 95: {
                    n14 = 173;
                    break;
                }
                case 96: {
                    n14 = 222;
                    break;
                }
                case 97: {
                    n14 = 228;
                    break;
                }
                case 98: {
                    n14 = 229;
                    break;
                }
                case 99: {
                    n14 = 36;
                    break;
                }
                case 100: {
                    n14 = 33;
                    break;
                }
                case 101: {
                    n14 = 199;
                    break;
                }
                case 102: {
                    n14 = 155;
                    break;
                }
                case 103: {
                    n14 = 107;
                    break;
                }
                case 104: {
                    n14 = 77;
                    break;
                }
                case 105: {
                    n14 = 88;
                    break;
                }
                case 106: {
                    n14 = 224;
                    break;
                }
                case 107: {
                    n14 = 141;
                    break;
                }
                case 108: {
                    n14 = 188;
                    break;
                }
                case 109: {
                    n14 = 148;
                    break;
                }
                case 110: {
                    n14 = 231;
                    break;
                }
                case 111: {
                    n14 = 125;
                    break;
                }
                case 112: {
                    n14 = 43;
                    break;
                }
                case 113: {
                    n14 = 4;
                    break;
                }
                case 114: {
                    n14 = 98;
                    break;
                }
                case 115: {
                    n14 = 60;
                    break;
                }
                case 116: {
                    n14 = 47;
                    break;
                }
                case 117: {
                    n14 = 161;
                    break;
                }
                case 118: {
                    n14 = 254;
                    break;
                }
                case 119: {
                    n14 = 101;
                    break;
                }
                case 120: {
                    n14 = 242;
                    break;
                }
                case 121: {
                    n14 = 112;
                    break;
                }
                case 122: {
                    n14 = 233;
                    break;
                }
                case 123: {
                    n14 = 1;
                    break;
                }
                case 124: {
                    n14 = 230;
                    break;
                }
                case 125: {
                    n14 = 150;
                    break;
                }
                case 126: {
                    n14 = 27;
                    break;
                }
                case 127: {
                    n14 = 62;
                    break;
                }
                case 128: {
                    n14 = 232;
                    break;
                }
                case 129: {
                    n14 = 174;
                    break;
                }
                case 130: {
                    n14 = 51;
                    break;
                }
                case 131: {
                    n14 = 30;
                    break;
                }
                case 132: {
                    n14 = 29;
                    break;
                }
                case 133: {
                    n14 = 149;
                    break;
                }
                case 134: {
                    n14 = 114;
                    break;
                }
                case 135: {
                    n14 = 203;
                    break;
                }
                case 136: {
                    n14 = 211;
                    break;
                }
                case 137: {
                    n14 = 20;
                    break;
                }
                case 138: {
                    n14 = 97;
                    break;
                }
                case 139: {
                    n14 = 109;
                    break;
                }
                case 140: {
                    n14 = 83;
                    break;
                }
                case 141: {
                    n14 = 210;
                    break;
                }
                case 142: {
                    n14 = 16;
                    break;
                }
                case 143: {
                    n14 = 255;
                    break;
                }
                case 144: {
                    n14 = 197;
                    break;
                }
                case 145: {
                    n14 = 11;
                    break;
                }
                case 146: {
                    n14 = 2;
                    break;
                }
                case 147: {
                    n14 = 181;
                    break;
                }
                case 148: {
                    n14 = 111;
                    break;
                }
                case 149: {
                    n14 = 118;
                    break;
                }
                case 150: {
                    n14 = 220;
                    break;
                }
                case 151: {
                    n14 = 108;
                    break;
                }
                case 152: {
                    n14 = 55;
                    break;
                }
                case 153: {
                    n14 = 234;
                    break;
                }
                case 154: {
                    n14 = 132;
                    break;
                }
                case 155: {
                    n14 = 156;
                    break;
                }
                case 156: {
                    n14 = 61;
                    break;
                }
                case 157: {
                    n14 = 50;
                    break;
                }
                case 158: {
                    n14 = 46;
                    break;
                }
                case 159: {
                    n14 = 131;
                    break;
                }
                case 160: {
                    n14 = 73;
                    break;
                }
                case 161: {
                    n14 = 160;
                    break;
                }
                case 162: {
                    n14 = 38;
                    break;
                }
                case 163: {
                    n14 = 139;
                    break;
                }
                case 164: {
                    n14 = 74;
                    break;
                }
                case 165: {
                    n14 = 146;
                    break;
                }
                case 166: {
                    n14 = 72;
                    break;
                }
                case 167: {
                    n14 = 247;
                    break;
                }
                case 168: {
                    n14 = 205;
                    break;
                }
                case 169: {
                    n14 = 252;
                    break;
                }
                case 170: {
                    n14 = 243;
                    break;
                }
                case 171: {
                    n14 = 163;
                    break;
                }
                case 172: {
                    n14 = 183;
                    break;
                }
                case 173: {
                    n14 = 110;
                    break;
                }
                case 174: {
                    n14 = 172;
                    break;
                }
                case 175: {
                    n14 = 213;
                    break;
                }
                case 176: {
                    n14 = 71;
                    break;
                }
                case 177: {
                    n14 = 186;
                    break;
                }
                case 178: {
                    n14 = 196;
                    break;
                }
                case 179: {
                    n14 = 91;
                    break;
                }
                case 180: {
                    n14 = 84;
                    break;
                }
                case 181: {
                    n14 = 9;
                    break;
                }
                case 182: {
                    n14 = 59;
                    break;
                }
                case 183: {
                    n14 = 39;
                    break;
                }
                case 184: {
                    n14 = 176;
                    break;
                }
                case 185: {
                    n14 = 214;
                    break;
                }
                case 186: {
                    n14 = 207;
                    break;
                }
                case 187: {
                    n14 = 158;
                    break;
                }
                case 188: {
                    n14 = 119;
                    break;
                }
                case 189: {
                    n14 = 113;
                    break;
                }
                case 190: {
                    n14 = 63;
                    break;
                }
                case 191: {
                    n14 = 102;
                    break;
                }
                case 192: {
                    n14 = 140;
                    break;
                }
                case 193: {
                    n14 = 37;
                    break;
                }
                case 194: {
                    n14 = 192;
                    break;
                }
                case 195: {
                    n14 = 169;
                    break;
                }
                case 196: {
                    n14 = 251;
                    break;
                }
                case 197: {
                    n14 = 26;
                    break;
                }
                case 198: {
                    n14 = 147;
                    break;
                }
                case 199: {
                    n14 = 189;
                    break;
                }
                case 200: {
                    n14 = 32;
                    break;
                }
                case 201: {
                    n14 = 191;
                    break;
                }
                case 202: {
                    n14 = 124;
                    break;
                }
                case 203: {
                    n14 = 171;
                    break;
                }
                case 204: {
                    n14 = 87;
                    break;
                }
                case 205: {
                    n14 = 170;
                    break;
                }
                case 206: {
                    n14 = 182;
                    break;
                }
                case 207: {
                    n14 = 246;
                    break;
                }
                case 208: {
                    n14 = 90;
                    break;
                }
                case 209: {
                    n14 = 48;
                    break;
                }
                case 210: {
                    n14 = 215;
                    break;
                }
                case 211: {
                    n14 = 66;
                    break;
                }
                case 212: {
                    n14 = 12;
                    break;
                }
                case 213: {
                    n14 = 44;
                    break;
                }
                case 214: {
                    n14 = 5;
                    break;
                }
                case 215: {
                    n14 = 198;
                    break;
                }
                case 216: {
                    n14 = 57;
                    break;
                }
                case 217: {
                    n14 = 70;
                    break;
                }
                case 218: {
                    n14 = 64;
                    break;
                }
                case 219: {
                    n14 = 223;
                    break;
                }
                case 220: {
                    n14 = 25;
                    break;
                }
                case 221: {
                    n14 = 195;
                    break;
                }
                case 222: {
                    n14 = 75;
                    break;
                }
                case 223: {
                    n14 = 99;
                    break;
                }
                case 224: {
                    n14 = 204;
                    break;
                }
                case 225: {
                    n14 = 218;
                    break;
                }
                case 226: {
                    n14 = 89;
                    break;
                }
                case 227: {
                    n14 = 14;
                    break;
                }
                case 228: {
                    n14 = 67;
                    break;
                }
                case 229: {
                    n14 = 138;
                    break;
                }
                case 230: {
                    n14 = 82;
                    break;
                }
                case 231: {
                    n14 = 202;
                    break;
                }
                case 232: {
                    n14 = 41;
                    break;
                }
                case 233: {
                    n14 = 253;
                    break;
                }
                case 234: {
                    n14 = 65;
                    break;
                }
                case 235: {
                    n14 = 190;
                    break;
                }
                case 236: {
                    n14 = 127;
                    break;
                }
                case 237: {
                    n14 = 10;
                    break;
                }
                case 238: {
                    n14 = 221;
                    break;
                }
                case 239: {
                    n14 = 96;
                    break;
                }
                case 240: {
                    n14 = 40;
                    break;
                }
                case 241: {
                    n14 = 42;
                    break;
                }
                case 242: {
                    n14 = 227;
                    break;
                }
                case 243: {
                    n14 = 76;
                    break;
                }
                case 244: {
                    n14 = 209;
                    break;
                }
                case 245: {
                    n14 = 226;
                    break;
                }
                case 246: {
                    n14 = 3;
                    break;
                }
                case 247: {
                    n14 = 21;
                    break;
                }
                case 248: {
                    n14 = 238;
                    break;
                }
                case 249: {
                    n14 = 153;
                    break;
                }
                case 250: {
                    n14 = 126;
                    break;
                }
                case 251: {
                    n14 = 35;
                    break;
                }
                case 252: {
                    n14 = 137;
                    break;
                }
                case 253: {
                    n14 = 240;
                    break;
                }
                case 254: {
                    n14 = 178;
                    break;
                }
                default: {
                    n14 = 128;
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
            WC.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x469A) & Short.MAX_VALUE;
        if (g[n11] == null) {
            WC.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

