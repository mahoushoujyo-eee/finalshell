/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SY;
import com.aG;
import com.dx_2;
import com.et_0;
import com.yw_0;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class YP {
    private static final EnumSet o = EnumSet.noneOf(SY.class);
    public static final YP r = new YP();
    private static final WeakHashMap j = new WeakHashMap();
    private et_0 a;
    private et_0 v;
    private final EnumSet U;
    public int w = new Random().nextInt();
    boolean W = false;
    boolean m = false;
    boolean f;
    boolean c;

    public YP() {
        this(null, null, o);
    }

    public YP(@Nullable et_0 et_02, @Nullable et_0 et_03) {
        this(et_02, et_03, o);
    }

    public YP(@Nullable et_0 et_02, @Nullable et_0 et_03, @NotNull EnumSet enumSet) {
        this.a = et_02;
        this.v = et_03;
        this.U = enumSet.clone();
    }

    public boolean u() {
        return this.c;
    }

    public void Z(boolean bl) {
        this.c = bl;
    }

    public void d(et_0 et_02) {
        this.v = et_02;
    }

    public void p(et_0 et_02) {
        this.a = et_02;
    }

    public boolean w() {
        return this.f;
    }

    public void t(boolean bl) {
        this.f = bl;
    }

    public boolean r() {
        return this.W;
    }

    public void C(boolean bl) {
        String string = dx_2.g();
        YP yP = this;
        if (string == null) {
            if (yP.W || bl) {
                // empty if block
            }
            yP = this;
        }
        yP.W = bl;
    }

    public boolean a() {
        return this.m;
    }

    public void e(boolean bl) {
        this.m = bl;
    }

    public YP q() {
        YP yP = new YP(this.a, this.v, this.U);
        yP.e(this.m);
        yP.C(this.W);
        yP.t(this.f);
        return yP;
    }

    public int q() {
        return this.w;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    public static YP P(YP yP) {
        YP yP2;
        WeakReference<YP> weakReference;
        String string = dx_2.g();
        YP yP3 = yP;
        if (string == null) {
            if (yP3 instanceof yw_0) {
                return yP;
            }
            yP3 = j.get(yP);
        }
        WeakReference<YP> weakReference2 = weakReference = (WeakReference<YP>)((Object)yP3);
        if (string == null) {
            if (weakReference2 != null) {
                YP yP4;
                yP2 = yP4 = (YP)weakReference.get();
                if (string != null) return yP2;
                if (yP2 != null) {
                    return yP4;
                }
            }
            weakReference2 = j.put(yP, new WeakReference<YP>(yP));
        }
        yP2 = yP;
        return yP2;
    }

    @Nullable
    public et_0 K() {
        return this.a;
    }

    @Nullable
    public et_0 s() {
        return this.v;
    }

    public YP j() {
        return new YP(this.a, this.v);
    }

    public boolean v(SY sY) {
        return this.U.contains((Object)sY);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = dx_2.g();
        Object object2 = this;
        if (string == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (string == null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        YP yP = (YP)object3;
        boolean bl = Objects.equals(this.a, yP.a);
        if (string == null) {
            if (!bl) return false;
            bl = Objects.equals(this.v, yP.v);
        }
        if (string == null) {
            if (!bl) return false;
            bl = this.U.equals(yP.U);
        }
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.v, this.U);
    }

    /*
     * Enabled aggressive block sorting
     */
    public et_0 Z() {
        et_0 et_02;
        String string = dx_2.g();
        YP yP = this;
        if (string == null) {
            if (yP.U.contains((Object)SY.INVERSE)) {
                et_02 = this.a;
                return et_02;
            }
            yP = this;
        }
        et_02 = yP.v;
        return et_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public et_0 O() {
        et_0 et_02;
        String string = dx_2.g();
        YP yP = this;
        if (string == null) {
            if (yP.U.contains((Object)SY.INVERSE)) {
                et_02 = this.v;
                return et_02;
            }
            yP = this;
        }
        et_02 = yP.a;
        return et_02;
    }

    @NotNull
    public aG n() {
        return new aG(this);
    }

    public Object clone() throws CloneNotSupportedException {
        return this.q();
    }

    static et_0 i(YP yP) {
        return yP.a;
    }

    static et_0 r(YP yP) {
        return yP.v;
    }

    static EnumSet h(YP yP) {
        return yP.U;
    }
}

