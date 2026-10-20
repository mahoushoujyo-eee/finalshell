/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N3;
import com.N8;
import com.QK;
import com.k6_0;
import com.ky_2;
import com.nd_0;
import com.nf_0;
import com.nh_0;
import com.ni_0;
import com.ug_0;
import com.xo_0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from com.Wq
 */
public class wq_0 {
    public static final long p;
    private static final Logger h;
    private final ug_0 T;
    @Nullable
    private N3 I;
    private final List E;
    private final k6_0 P;
    private boolean g;
    private volatile boolean V;
    private long R;
    private Integer e;
    private boolean b;
    @Nullable
    private nd_0 y;
    private static String[] S;
    private static final String[] c;
    private static final String[] d;

    public wq_0(@NotNull ug_0 ug_02) {
        String[] stringArray = wq_0.y();
        String[] stringArray2 = stringArray;
        try {
            this.E = new ArrayList();
            this.P = new k6_0();
            this.g = false;
            this.V = false;
            this.e = null;
            this.b = false;
            this.y = null;
            this.T = ug_02;
            if (stringArray2 != null) {
                ky_2.K(new String[3]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw wq_0.a(illegalStateException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void O() {
        block56: {
            block50: {
                block49: {
                    block48: {
                        var1_1 = wq_0.y();
                        v0 = this.T.E();
                        if (var1_1 != null) break block48;
                        try {
                            block59: {
                                if (!v0) break block49;
                                break block59;
                                catch (IllegalStateException v1) {
                                    throw wq_0.a(v1);
                                }
                            }
                            v0 = this.V;
                        }
                        catch (IllegalStateException v2) {
                            throw wq_0.a(v2);
                        }
                    }
                    try {
                        if (var1_1 == null) {
                            if (!v0) break block50;
                        }
                        ** GOTO lbl31
                    }
                    catch (IllegalStateException v3) {
                        throw wq_0.a(v3);
                    }
                }
                return;
            }
            this.T.U();
            try {
                block55: {
                    block66: {
                        block54: {
                            block53: {
                                block51: {
                                    block52: {
                                        block62: {
                                            block61: {
                                                block60: {
                                                    v4 = this.T;
                                                    if (var1_1 != null) break block60;
                                                    v0 = v4.x();
lbl31:
                                                    // 2 sources

                                                    if (v0) {
                                                        this.F();
                                                        return;
                                                    }
                                                    v4 = this.T;
                                                }
                                                var2_2 = v4.S();
                                                v5 = this;
                                                if (var1_1 != null) break block51;
                                                if (v5.E.isEmpty()) break block52;
                                                break block61;
                                                catch (IllegalStateException v6) {
                                                    throw wq_0.a(v6);
                                                }
                                            }
                                            this.y(var2_2.f);
                                            v5 = this;
                                            if (var1_1 != null) break block51;
                                            break block62;
                                            catch (IllegalStateException v7) {
                                                throw wq_0.a(v7);
                                            }
                                        }
                                        try {
                                            block63: {
                                                if (v5.I == null) break block52;
                                                break block63;
                                                catch (IllegalStateException v8) {
                                                    throw wq_0.a(v8);
                                                }
                                            }
                                            this.I.q();
                                        }
                                        catch (IllegalStateException v9) {
                                            throw wq_0.a(v9);
                                        }
                                    }
                                    v5 = this;
                                }
                                try {
                                    if (v5.y == null || !var2_2.equals(this.y.E)) break block53;
                                }
                                catch (IllegalStateException v10) {
                                    throw wq_0.a(v10);
                                }
                                return;
                            }
                            var3_3 = new ArrayList<nd_0>();
                            while (!this.E.isEmpty()) {
                                block64: {
                                    v11 = var2_2.equals(((nd_0)this.E.get((int)0)).E);
                                    if (var1_1 != null) break block54;
                                    if (var1_1 != null) break block54;
                                    break block64;
                                    catch (IllegalStateException v12) {
                                        throw wq_0.a(v12);
                                    }
                                }
                                try {
                                    block65: {
                                        if (v11) break;
                                        break block65;
                                        catch (IllegalStateException v13) {
                                            throw wq_0.a(v13);
                                        }
                                    }
                                    var3_3.add((nd_0)this.E.remove(0));
                                    if (var1_1 == null) continue;
                                    break;
                                }
                                catch (IllegalStateException v14) {
                                    throw wq_0.a(v14);
                                }
                            }
                            v11 = this.E.isEmpty();
                        }
                        if (var1_1 != null) break block55;
                        if (!v11) ** GOTO lbl114
                        break block66;
                        catch (IllegalStateException v15) {
                            throw wq_0.a(v15);
                        }
                    }
                    try {
                        block67: {
                            this.V = true;
                            this.F();
                            if (var1_1 == null) break block56;
                            break block67;
                            catch (IllegalStateException v16) {
                                throw wq_0.a(v16);
                            }
                        }
                        this.y = (nd_0)this.E.remove(0);
                        v11 = var3_3.add(this.y);
                    }
                    catch (IllegalStateException v17) {
                        throw wq_0.a(v17);
                    }
                }
                for (nd_0 var5_5 : var3_3) {
                    block58: {
                        block57: {
                            block68: {
                                v18 = this;
                                if (var1_1 != null) break block57;
                                v18.P.E(var5_5);
                                if (var1_1 != null) break block56;
                                break block68;
                                catch (IllegalStateException v19) {
                                    throw wq_0.a(v19);
                                }
                            }
                            try {
                                block69: {
                                    if (!(var5_5 instanceof nf_0)) break block58;
                                    break block69;
                                    catch (IllegalStateException v20) {
                                        throw wq_0.a(v20);
                                    }
                                }
                                v18 = this;
                            }
                            catch (IllegalStateException v21) {
                                throw wq_0.a(v21);
                            }
                        }
                        v18.b = true;
                    }
                    if (var1_1 == null) continue;
                }
                this.T();
            }
            finally {
                this.T.D();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void X(@NotNull QK var1_1) {
        block39: {
            var2_2 = wq_0.y();
            try {
                v0 = this.T.E();
                if (var2_2 == null) {
                    if (v0) break block39;
                }
                ** GOTO lbl17
            }
            catch (IllegalStateException v1) {
                throw wq_0.a(v1);
            }
            return;
        }
        this.T.U();
        try {
            block48: {
                block49: {
                    block55: {
                        block46: {
                            block47: {
                                block45: {
                                    block44: {
                                        block42: {
                                            block43: {
                                                block53: {
                                                    block41: {
                                                        block40: {
                                                            block51: {
                                                                v2 = this.T;
                                                                if (var2_2 != null) break block51;
                                                                v0 = v2.x();
lbl17:
                                                                // 2 sources

                                                                if (v0) {
                                                                    this.F();
                                                                    return;
                                                                }
                                                                v2 = this.T;
                                                            }
                                                            var3_3 = v2.S();
                                                            var4_4 = this.R;
                                                            this.R = System.nanoTime();
                                                            v3 = this.P;
                                                            if (var2_2 != null) break block40;
                                                            try {
                                                                block52: {
                                                                    if (k6_0.m(v3) < 2) break block41;
                                                                    break block52;
                                                                    catch (IllegalStateException v4) {
                                                                        throw wq_0.a(v4);
                                                                    }
                                                                }
                                                                v3 = this.P;
                                                            }
                                                            catch (IllegalStateException v5) {
                                                                throw wq_0.a(v5);
                                                            }
                                                        }
                                                        var6_5 = Math.min(v3.D(), wq_0.p);
                                                        if (var2_2 == null) break block53;
                                                    }
                                                    var6_5 = wq_0.p;
                                                }
                                                try {
                                                    cfr_temp_0 = System.nanoTime() - var4_4 - var6_5;
                                                    v6 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                    if (var2_2 != null) break block42;
                                                    if (v6 >= 0) break block43;
                                                }
                                                catch (IllegalStateException v7) {
                                                    throw wq_0.a(v7);
                                                }
                                                v6 = 1;
                                                break block42;
                                            }
                                            v6 = 0;
                                        }
                                        var8_6 = v6;
                                        v8 = var8_6;
                                        if (var2_2 != null) break block44;
                                        try {
                                            block54: {
                                                if (v8 == false) break block45;
                                                break block54;
                                                catch (IllegalStateException v9) {
                                                    throw wq_0.a(v9);
                                                }
                                            }
                                            v8 = (long)this.V;
                                        }
                                        catch (IllegalStateException v10) {
                                            throw wq_0.a(v10);
                                        }
                                    }
                                    try {
                                        if (var2_2 != null) break block46;
                                        if (v8 == false) break block47;
                                    }
                                    catch (IllegalStateException v11) {
                                        throw wq_0.a(v11);
                                    }
                                    return;
                                }
                                this.V = false;
                            }
                            try {
                                this.a((boolean)var8_6);
                                this.y(var3_3.f);
                                v12 = this;
                                if (var2_2 != null) break block48;
                                v8 = (long)v12.E.isEmpty();
                            }
                            catch (IllegalStateException v13) {
                                throw wq_0.a(v13);
                            }
                        }
                        if (v8 == false) break block49;
                        v12 = this;
                        if (var2_2 != null) break block48;
                        break block55;
                        catch (IllegalStateException v14) {
                            throw wq_0.a(v14);
                        }
                    }
                    try {
                        block56: {
                            if (v12.I == null) break block49;
                            break block56;
                            catch (IllegalStateException v15) {
                                throw wq_0.a(v15);
                            }
                        }
                        this.I.q();
                    }
                    catch (IllegalStateException v16) {
                        throw wq_0.a(v16);
                    }
                }
                v12 = this;
            }
            var9_7 = v12.q(var3_3, var1_1);
            this.E.add(var9_7);
            this.T();
            wq_0.h.debug(wq_0.a(-30570, 1615) + (Object)var1_1.W + wq_0.a(-30569, 1822));
        }
        finally {
            this.T.D();
        }
    }

    /*
     * Loose catch block
     */
    public void R() {
        ug_0 ug_02;
        block6: {
            block7: {
                String[] stringArray = wq_0.y();
                ug_02 = this.T;
                if (stringArray != null) break block6;
                try {
                    block8: {
                        if (ug_02.E()) break block7;
                        break block8;
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                    }
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    throw wq_0.a(illegalStateException);
                }
            }
            this.T.U();
            try {
                this.F();
                ug_02 = this.T;
            }
            catch (Throwable throwable) {
                this.T.D();
                throw throwable;
            }
        }
        ug_02.D();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public int x() {
        int n10;
        int n11;
        String[] stringArray = wq_0.y();
        this.T.U();
        String[] stringArray2 = stringArray;
        try {
            int n12;
            block22: {
                List list;
                block20: {
                    List list2;
                    block21: {
                        List list3;
                        block18: {
                            wq_0 wq_02;
                            block17: {
                                block19: {
                                    block24: {
                                        block23: {
                                            wq_02 = this;
                                            if (stringArray2 != null) break block17;
                                            if (!wq_02.T.x()) break block19;
                                            break block23;
                                            catch (IllegalStateException illegalStateException) {
                                                throw wq_0.a(illegalStateException);
                                            }
                                        }
                                        list3 = this.E;
                                        if (stringArray2 != null) break block18;
                                        break block24;
                                        catch (IllegalStateException illegalStateException) {
                                            throw wq_0.a(illegalStateException);
                                        }
                                    }
                                    try {
                                        block25: {
                                            if (list3.isEmpty()) break block19;
                                            break block25;
                                            catch (IllegalStateException illegalStateException) {
                                                throw wq_0.a(illegalStateException);
                                            }
                                        }
                                        this.F();
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw wq_0.a(illegalStateException);
                                    }
                                }
                                wq_02 = this;
                            }
                            list3 = wq_02.z();
                        }
                        list2 = list3;
                        list = list2;
                        if (stringArray2 != null) break block20;
                        try {
                            block26: {
                                if (!list.isEmpty()) break block21;
                                break block26;
                                catch (IllegalStateException illegalStateException) {
                                    throw wq_0.a(illegalStateException);
                                }
                            }
                            n12 = this.T.S().f;
                            break block22;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                    }
                    list = list2.get(list2.size() - 1);
                }
                n12 = ((nd_0)((Object)list)).E.f;
            }
            int n13 = n12;
            n11 = n13 + 1;
        }
        catch (Throwable throwable) {
            this.T.D();
            throw throwable;
        }
        try {
            this.T.D();
            n10 = n11;
            if (ky_2.F() != null) {
                wq_0.V(new String[5]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw wq_0.a(illegalStateException);
        }
        return n10;
    }

    /*
     * Loose catch block
     */
    public void Y() {
        String[] stringArray = wq_0.y();
        this.T.U();
        String[] stringArray2 = stringArray;
        try {
            wq_0 wq_02;
            block6: {
                block7: {
                    wq_02 = this;
                    if (stringArray2 != null) break block6;
                    try {
                        block8: {
                            if (wq_02.E.isEmpty()) break block7;
                            break block8;
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                        }
                        h.debug(wq_0.a(-30574, -27507));
                        this.F();
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                }
                wq_02 = this;
            }
            wq_02.T.D();
        }
        catch (Throwable throwable) {
            this.T.D();
            throw throwable;
        }
    }

    public void L(@NotNull N3 n32) {
        this.I = n32;
    }

    @Nullable
    private nd_0 e() {
        nd_0 nd_02;
        block6: {
            List list;
            block4: {
                block5: {
                    String[] stringArray = wq_0.y();
                    try {
                        try {
                            list = this.E;
                            if (stringArray != null) break block4;
                            if (!list.isEmpty()) break block5;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                        nd_02 = null;
                        break block6;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                }
                list = this.E.get(this.E.size() - 1);
            }
            nd_02 = (nd_0)((Object)list);
        }
        return nd_02;
    }

    @NotNull
    private List z() {
        List<Object> list;
        int n10;
        int n11;
        block9: {
            String[] stringArray = wq_0.y();
            for (n11 = 0; n11 < this.E.size(); ++n11) {
                try {
                    try {
                        try {
                            n10 = ((nd_0)this.E.get((int)n11)).M ? 1 : 0;
                            if (stringArray != null || stringArray != null) break block9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                        if (n10 == 0) break;
                        continue;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw wq_0.a(illegalStateException);
                }
            }
            n10 = --n11;
        }
        try {
            list = n10 >= 0 ? this.E.subList(0, n11 + 1) : Collections.emptyList();
        }
        catch (IllegalStateException illegalStateException) {
            throw wq_0.a(illegalStateException);
        }
        return list;
    }

    private void y(int n10) {
        block8: {
            block6: {
                String[] stringArray = wq_0.y();
                try {
                    wq_0 wq_02;
                    block7: {
                        try {
                            try {
                                wq_02 = this;
                                if (stringArray != null) break block6;
                                if (wq_02.e != null) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                            this.e = n10;
                            if (stringArray == null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                    }
                    wq_02 = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw wq_0.a(illegalStateException);
                }
            }
            wq_02.e = Math.min(this.e, n10);
        }
    }

    private void F() {
        block5: {
            N3 n32;
            block4: {
                this.T.N();
                String[] stringArray = wq_0.y();
                this.E.clear();
                this.e = null;
                this.y = null;
                String[] stringArray2 = stringArray;
                try {
                    try {
                        this.b = false;
                        n32 = this.I;
                        if (stringArray2 != null) break block4;
                        if (n32 == null) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                    n32 = this.I;
                }
                catch (IllegalStateException illegalStateException) {
                    throw wq_0.a(illegalStateException);
                }
            }
            n32.y();
        }
    }

    private void a(boolean bl) {
        block23: {
            long l2;
            block27: {
                String[] stringArray;
                block25: {
                    k6_0 k6_02;
                    block24: {
                        int n10;
                        block21: {
                            stringArray = wq_0.y();
                            try {
                                try {
                                    block22: {
                                        try {
                                            try {
                                                n10 = this.T.E();
                                                if (stringArray != null) break block21;
                                                if (n10 != 0) break block22;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw wq_0.a(illegalStateException);
                                            }
                                            this.g = false;
                                            if (stringArray == null) break block23;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw wq_0.a(illegalStateException);
                                        }
                                    }
                                    k6_02 = this.P;
                                    if (stringArray != null) break block24;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw wq_0.a(illegalStateException);
                                }
                                n10 = k6_0.m(k6_02);
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                        }
                        try {
                            if (n10 < 2) break block23;
                            k6_02 = this.P;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                    }
                    long l3 = k6_02.w();
                    try {
                        double d2;
                        block26: {
                            try {
                                try {
                                    long l4 = l3 - this.T.j();
                                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                    if (stringArray != null) break block25;
                                    if (l2 < 0) break block26;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw wq_0.a(illegalStateException);
                                }
                                this.g = true;
                                if (stringArray == null) break block23;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                        }
                        l2 = (d2 = (double)l3 - (double)this.T.j() * 0.5) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                }
                try {
                    if (stringArray != null) break block27;
                    if (l2 >= 0) break block23;
                }
                catch (IllegalStateException illegalStateException) {
                    throw wq_0.a(illegalStateException);
                }
                l2 = (long)bl;
            }
            try {
                if (l2 == false) {
                    this.g = false;
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw wq_0.a(illegalStateException);
            }
        }
    }

    private void T() {
        block25: {
            String[] stringArray = wq_0.y();
            List list = this.z();
            this.T.N();
            String[] stringArray2 = stringArray;
            for (nd_0 nd_02 : list) {
                block28: {
                    boolean bl;
                    int n10;
                    block31: {
                        block29: {
                            block26: {
                                n10 = nd_02.E.f;
                                try {
                                    block27: {
                                        try {
                                            try {
                                                try {
                                                    if (stringArray2 != null) break block25;
                                                    bl = nd_02 instanceof nf_0;
                                                    if (stringArray2 != null) break block26;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw wq_0.a(illegalStateException);
                                                }
                                                if (!bl) break block27;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw wq_0.a(illegalStateException);
                                            }
                                            this.T.N(((nf_0)nd_02).o, n10 - 1);
                                            this.T.e(n10);
                                            if (stringArray2 == null) break block28;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw wq_0.a(illegalStateException);
                                        }
                                    }
                                    bl = nd_02 instanceof ni_0;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw wq_0.a(illegalStateException);
                                }
                            }
                            try {
                                block30: {
                                    try {
                                        try {
                                            if (stringArray2 != null) break block29;
                                            if (!bl) break block30;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw wq_0.a(illegalStateException);
                                        }
                                        this.T.e(n10);
                                        this.T.O(n10, ((ni_0)nd_02).o);
                                        if (stringArray2 == null) break block28;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw wq_0.a(illegalStateException);
                                    }
                                }
                                bl = nd_02 instanceof N8;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                        }
                        try {
                            block32: {
                                try {
                                    try {
                                        if (stringArray2 != null) break block31;
                                        if (!bl) break block32;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw wq_0.a(illegalStateException);
                                    }
                                    this.T.e(n10);
                                    if (stringArray2 == null) break block28;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw wq_0.a(illegalStateException);
                                }
                            }
                            bl = nd_02 instanceof nh_0;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw wq_0.a(illegalStateException);
                        }
                    }
                    try {
                        block33: {
                            try {
                                if (!bl) break block33;
                                this.T.O(n10, 1);
                                if (stringArray2 == null) break block28;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw wq_0.a(illegalStateException);
                            }
                        }
                        throw new IllegalStateException(wq_0.a(-30573, 27089));
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw wq_0.a(illegalStateException);
                    }
                }
                if (stringArray2 == null) continue;
            }
            this.T.B();
        }
    }

    /*
     * Exception decompiling
     */
    @NotNull
    private nd_0 q(@NotNull xo_0 var1_1, @NotNull QK var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 37[SWITCH]
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

    private static boolean lambda$createPrediction$0(nd_0 nd_02) {
        return nd_02 instanceof nf_0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var9 = new String[6];
                    var7_1 = 0;
                    var6_2 = "}\u001d\u008f\u00c9\u001e\u008e\u00cd\u00e4h\u007fV\b\u0093\u00b2JzCps\u00e2;\u00edR\u0090\u00b7\u0085i\u00e3\u0095HJ%t\u0080U\u00b5J\u00a4fo\u0091\u007f\u001b\u0007,\u00fb\u00ba\u0081\u008cd|\u0001o\u00d6\u0085\u00d3\u0095E\u0012dx\f\u0018\u0007\u008a\u00dc7\u0000\u00ae\u00bc\u00ba\u00a8\u00c8e\u00b7\u0001\u0087t\u0088O'\u00133\u009b\u00c6\u00d5\u0090\u00d8k\u0016c\u00ca2\u00f2\u009e\u00f5W\u00f7:ET\u0080\u0089*\u001c\u009f\r\u00ab\u00d4YT\u00c3s\u0019\u00c4%\u0013N\u009e\u008b";
                    var8_3 = "}\u001d\u008f\u00c9\u001e\u008e\u00cd\u00e4h\u007fV\b\u0093\u00b2JzCps\u00e2;\u00edR\u0090\u00b7\u0085i\u00e3\u0095HJ%t\u0080U\u00b5J\u00a4fo\u0091\u007f\u001b\u0007,\u00fb\u00ba\u0081\u008cd|\u0001o\u00d6\u0085\u00d3\u0095E\u0012dx\f\u0018\u0007\u008a\u00dc7\u0000\u00ae\u00bc\u00ba\u00a8\u00c8e\u00b7\u0001\u0087t\u0088O'\u00133\u009b\u00c6\u00d5\u0090\u00d8k\u0016c\u00ca2\u00f2\u009e\u00f5W\u00f7:ET\u0080\u0089*\u001c\u009f\r\u00ab\u00d4YT\u00c3s\u0019\u00c4%\u0013N\u009e\u008b".length();
                    wq_0.V(null);
                    var5_4 = 11;
                    var4_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 109;
                        v1 = ++var4_5;
                        v2 = var6_2.substring(v1, v1 + var5_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var9[var7_1++] = v4.intern();
                        if ((var4_5 += var5_4) < var8_3) {
                            var5_4 = var6_2.charAt(var4_5);
                            ** continue;
                        }
                        var6_2 = "T\u009e[_\u009a|\u00ec\u00ad\u00f7\u00b1:C\u00e3\u0090I\u00d6\u00d4\u000b6;\u00fdc\u0081\u00e67\u00ca\u00e9\b\u00d1\u0090\u00c9\u00ee\u00fe\r\u00c9I";
                        var8_3 = "T\u009e[_\u009a|\u00ec\u00ad\u00f7\u00b1:C\u00e3\u0090I\u00d6\u00d4\u000b6;\u00fdc\u0081\u00e67\u00ca\u00e9\b\u00d1\u0090\u00c9\u00ee\u00fe\r\u00c9I".length();
                        var5_4 = 27;
                        var4_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 46;
                            v5 = ++var4_5;
                            v2 = var6_2.substring(v5, v5 + var5_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var9[var7_1++] = v4.intern();
                        if ((var4_5 += var5_4) < var8_3) {
                            var5_4 = var6_2.charAt(var4_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var10_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var10_6;
                    while (true) {
                        switch (var10_6 % 7) {
                            case 0: {
                                v15 = 102;
                                break;
                            }
                            case 1: {
                                v15 = 63;
                                break;
                            }
                            case 2: {
                                v15 = 122;
                                break;
                            }
                            case 3: {
                                v15 = 86;
                                break;
                            }
                            case 4: {
                                v15 = 56;
                                break;
                            }
                            case 5: {
                                v15 = 29;
                                break;
                            }
                            default: {
                                v15 = 66;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var10_6;
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
                } while (v10 > var10_6);
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
            wq_0.c = var9;
            wq_0.d = new String[6];
            break block22;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_7 = 5937570077755257327L;
        ** while (true)
        var0_8 = 5937570077755257907L ^ var2_7;
        wq_0.p = TimeUnit.MILLISECONDS.toNanos(var0_8);
        wq_0.h = LoggerFactory.getLogger(wq_0.class);
    }

    public static void V(String[] stringArray) {
        S = stringArray;
    }

    public static String[] y() {
        return S;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF8897) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 195;
                    break;
                }
                case 1: {
                    n14 = 20;
                    break;
                }
                case 2: {
                    n14 = 106;
                    break;
                }
                case 3: {
                    n14 = 207;
                    break;
                }
                case 4: {
                    n14 = 231;
                    break;
                }
                case 5: {
                    n14 = 114;
                    break;
                }
                case 6: {
                    n14 = 87;
                    break;
                }
                case 7: {
                    n14 = 122;
                    break;
                }
                case 8: {
                    n14 = 53;
                    break;
                }
                case 9: {
                    n14 = 120;
                    break;
                }
                case 10: {
                    n14 = 135;
                    break;
                }
                case 11: {
                    n14 = 144;
                    break;
                }
                case 12: {
                    n14 = 59;
                    break;
                }
                case 13: {
                    n14 = 75;
                    break;
                }
                case 14: {
                    n14 = 164;
                    break;
                }
                case 15: {
                    n14 = 227;
                    break;
                }
                case 16: {
                    n14 = 69;
                    break;
                }
                case 17: {
                    n14 = 68;
                    break;
                }
                case 18: {
                    n14 = 188;
                    break;
                }
                case 19: {
                    n14 = 29;
                    break;
                }
                case 20: {
                    n14 = 98;
                    break;
                }
                case 21: {
                    n14 = 129;
                    break;
                }
                case 22: {
                    n14 = 146;
                    break;
                }
                case 23: {
                    n14 = 8;
                    break;
                }
                case 24: {
                    n14 = 66;
                    break;
                }
                case 25: {
                    n14 = 149;
                    break;
                }
                case 26: {
                    n14 = 158;
                    break;
                }
                case 27: {
                    n14 = 88;
                    break;
                }
                case 28: {
                    n14 = 136;
                    break;
                }
                case 29: {
                    n14 = 1;
                    break;
                }
                case 30: {
                    n14 = 187;
                    break;
                }
                case 31: {
                    n14 = 234;
                    break;
                }
                case 32: {
                    n14 = 193;
                    break;
                }
                case 33: {
                    n14 = 131;
                    break;
                }
                case 34: {
                    n14 = 189;
                    break;
                }
                case 35: {
                    n14 = 150;
                    break;
                }
                case 36: {
                    n14 = 209;
                    break;
                }
                case 37: {
                    n14 = 184;
                    break;
                }
                case 38: {
                    n14 = 38;
                    break;
                }
                case 39: {
                    n14 = 85;
                    break;
                }
                case 40: {
                    n14 = 82;
                    break;
                }
                case 41: {
                    n14 = 92;
                    break;
                }
                case 42: {
                    n14 = 194;
                    break;
                }
                case 43: {
                    n14 = 34;
                    break;
                }
                case 44: {
                    n14 = 51;
                    break;
                }
                case 45: {
                    n14 = 175;
                    break;
                }
                case 46: {
                    n14 = 220;
                    break;
                }
                case 47: {
                    n14 = 239;
                    break;
                }
                case 48: {
                    n14 = 10;
                    break;
                }
                case 49: {
                    n14 = 12;
                    break;
                }
                case 50: {
                    n14 = 24;
                    break;
                }
                case 51: {
                    n14 = 109;
                    break;
                }
                case 52: {
                    n14 = 100;
                    break;
                }
                case 53: {
                    n14 = 138;
                    break;
                }
                case 54: {
                    n14 = 143;
                    break;
                }
                case 55: {
                    n14 = 216;
                    break;
                }
                case 56: {
                    n14 = 52;
                    break;
                }
                case 57: {
                    n14 = 104;
                    break;
                }
                case 58: {
                    n14 = 133;
                    break;
                }
                case 59: {
                    n14 = 105;
                    break;
                }
                case 60: {
                    n14 = 22;
                    break;
                }
                case 61: {
                    n14 = 236;
                    break;
                }
                case 62: {
                    n14 = 56;
                    break;
                }
                case 63: {
                    n14 = 186;
                    break;
                }
                case 64: {
                    n14 = 49;
                    break;
                }
                case 65: {
                    n14 = 196;
                    break;
                }
                case 66: {
                    n14 = 3;
                    break;
                }
                case 67: {
                    n14 = 28;
                    break;
                }
                case 68: {
                    n14 = 255;
                    break;
                }
                case 69: {
                    n14 = 242;
                    break;
                }
                case 70: {
                    n14 = 65;
                    break;
                }
                case 71: {
                    n14 = 7;
                    break;
                }
                case 72: {
                    n14 = 210;
                    break;
                }
                case 73: {
                    n14 = 140;
                    break;
                }
                case 74: {
                    n14 = 130;
                    break;
                }
                case 75: {
                    n14 = 251;
                    break;
                }
                case 76: {
                    n14 = 222;
                    break;
                }
                case 77: {
                    n14 = 112;
                    break;
                }
                case 78: {
                    n14 = 17;
                    break;
                }
                case 79: {
                    n14 = 71;
                    break;
                }
                case 80: {
                    n14 = 30;
                    break;
                }
                case 81: {
                    n14 = 50;
                    break;
                }
                case 82: {
                    n14 = 41;
                    break;
                }
                case 83: {
                    n14 = 156;
                    break;
                }
                case 84: {
                    n14 = 148;
                    break;
                }
                case 85: {
                    n14 = 152;
                    break;
                }
                case 86: {
                    n14 = 212;
                    break;
                }
                case 87: {
                    n14 = 60;
                    break;
                }
                case 88: {
                    n14 = 206;
                    break;
                }
                case 89: {
                    n14 = 55;
                    break;
                }
                case 90: {
                    n14 = 13;
                    break;
                }
                case 91: {
                    n14 = 40;
                    break;
                }
                case 92: {
                    n14 = 121;
                    break;
                }
                case 93: {
                    n14 = 171;
                    break;
                }
                case 94: {
                    n14 = 248;
                    break;
                }
                case 95: {
                    n14 = 160;
                    break;
                }
                case 96: {
                    n14 = 119;
                    break;
                }
                case 97: {
                    n14 = 237;
                    break;
                }
                case 98: {
                    n14 = 238;
                    break;
                }
                case 99: {
                    n14 = 166;
                    break;
                }
                case 100: {
                    n14 = 84;
                    break;
                }
                case 101: {
                    n14 = 81;
                    break;
                }
                case 102: {
                    n14 = 233;
                    break;
                }
                case 103: {
                    n14 = 110;
                    break;
                }
                case 104: {
                    n14 = 199;
                    break;
                }
                case 105: {
                    n14 = 247;
                    break;
                }
                case 106: {
                    n14 = 128;
                    break;
                }
                case 107: {
                    n14 = 14;
                    break;
                }
                case 108: {
                    n14 = 217;
                    break;
                }
                case 109: {
                    n14 = 153;
                    break;
                }
                case 110: {
                    n14 = 115;
                    break;
                }
                case 111: {
                    n14 = 58;
                    break;
                }
                case 112: {
                    n14 = 54;
                    break;
                }
                case 113: {
                    n14 = 0;
                    break;
                }
                case 114: {
                    n14 = 159;
                    break;
                }
                case 115: {
                    n14 = 137;
                    break;
                }
                case 116: {
                    n14 = 179;
                    break;
                }
                case 117: {
                    n14 = 168;
                    break;
                }
                case 118: {
                    n14 = 200;
                    break;
                }
                case 119: {
                    n14 = 78;
                    break;
                }
                case 120: {
                    n14 = 99;
                    break;
                }
                case 121: {
                    n14 = 61;
                    break;
                }
                case 122: {
                    n14 = 80;
                    break;
                }
                case 123: {
                    n14 = 252;
                    break;
                }
                case 124: {
                    n14 = 142;
                    break;
                }
                case 125: {
                    n14 = 27;
                    break;
                }
                case 126: {
                    n14 = 224;
                    break;
                }
                case 127: {
                    n14 = 26;
                    break;
                }
                case 128: {
                    n14 = 147;
                    break;
                }
                case 129: {
                    n14 = 161;
                    break;
                }
                case 130: {
                    n14 = 37;
                    break;
                }
                case 131: {
                    n14 = 91;
                    break;
                }
                case 132: {
                    n14 = 118;
                    break;
                }
                case 133: {
                    n14 = 18;
                    break;
                }
                case 134: {
                    n14 = 64;
                    break;
                }
                case 135: {
                    n14 = 219;
                    break;
                }
                case 136: {
                    n14 = 203;
                    break;
                }
                case 137: {
                    n14 = 9;
                    break;
                }
                case 138: {
                    n14 = 125;
                    break;
                }
                case 139: {
                    n14 = 229;
                    break;
                }
                case 140: {
                    n14 = 240;
                    break;
                }
                case 141: {
                    n14 = 250;
                    break;
                }
                case 142: {
                    n14 = 215;
                    break;
                }
                case 143: {
                    n14 = 244;
                    break;
                }
                case 144: {
                    n14 = 5;
                    break;
                }
                case 145: {
                    n14 = 181;
                    break;
                }
                case 146: {
                    n14 = 103;
                    break;
                }
                case 147: {
                    n14 = 157;
                    break;
                }
                case 148: {
                    n14 = 245;
                    break;
                }
                case 149: {
                    n14 = 77;
                    break;
                }
                case 150: {
                    n14 = 108;
                    break;
                }
                case 151: {
                    n14 = 162;
                    break;
                }
                case 152: {
                    n14 = 116;
                    break;
                }
                case 153: {
                    n14 = 176;
                    break;
                }
                case 154: {
                    n14 = 204;
                    break;
                }
                case 155: {
                    n14 = 197;
                    break;
                }
                case 156: {
                    n14 = 90;
                    break;
                }
                case 157: {
                    n14 = 214;
                    break;
                }
                case 158: {
                    n14 = 205;
                    break;
                }
                case 159: {
                    n14 = 39;
                    break;
                }
                case 160: {
                    n14 = 102;
                    break;
                }
                case 161: {
                    n14 = 126;
                    break;
                }
                case 162: {
                    n14 = 226;
                    break;
                }
                case 163: {
                    n14 = 113;
                    break;
                }
                case 164: {
                    n14 = 32;
                    break;
                }
                case 165: {
                    n14 = 124;
                    break;
                }
                case 166: {
                    n14 = 139;
                    break;
                }
                case 167: {
                    n14 = 180;
                    break;
                }
                case 168: {
                    n14 = 19;
                    break;
                }
                case 169: {
                    n14 = 96;
                    break;
                }
                case 170: {
                    n14 = 249;
                    break;
                }
                case 171: {
                    n14 = 228;
                    break;
                }
                case 172: {
                    n14 = 192;
                    break;
                }
                case 173: {
                    n14 = 15;
                    break;
                }
                case 174: {
                    n14 = 127;
                    break;
                }
                case 175: {
                    n14 = 198;
                    break;
                }
                case 176: {
                    n14 = 174;
                    break;
                }
                case 177: {
                    n14 = 170;
                    break;
                }
                case 178: {
                    n14 = 202;
                    break;
                }
                case 179: {
                    n14 = 221;
                    break;
                }
                case 180: {
                    n14 = 123;
                    break;
                }
                case 181: {
                    n14 = 97;
                    break;
                }
                case 182: {
                    n14 = 57;
                    break;
                }
                case 183: {
                    n14 = 172;
                    break;
                }
                case 184: {
                    n14 = 177;
                    break;
                }
                case 185: {
                    n14 = 70;
                    break;
                }
                case 186: {
                    n14 = 48;
                    break;
                }
                case 187: {
                    n14 = 21;
                    break;
                }
                case 188: {
                    n14 = 72;
                    break;
                }
                case 189: {
                    n14 = 151;
                    break;
                }
                case 190: {
                    n14 = 183;
                    break;
                }
                case 191: {
                    n14 = 36;
                    break;
                }
                case 192: {
                    n14 = 83;
                    break;
                }
                case 193: {
                    n14 = 117;
                    break;
                }
                case 194: {
                    n14 = 201;
                    break;
                }
                case 195: {
                    n14 = 107;
                    break;
                }
                case 196: {
                    n14 = 132;
                    break;
                }
                case 197: {
                    n14 = 11;
                    break;
                }
                case 198: {
                    n14 = 62;
                    break;
                }
                case 199: {
                    n14 = 86;
                    break;
                }
                case 200: {
                    n14 = 253;
                    break;
                }
                case 201: {
                    n14 = 246;
                    break;
                }
                case 202: {
                    n14 = 95;
                    break;
                }
                case 203: {
                    n14 = 163;
                    break;
                }
                case 204: {
                    n14 = 25;
                    break;
                }
                case 205: {
                    n14 = 4;
                    break;
                }
                case 206: {
                    n14 = 165;
                    break;
                }
                case 207: {
                    n14 = 63;
                    break;
                }
                case 208: {
                    n14 = 93;
                    break;
                }
                case 209: {
                    n14 = 211;
                    break;
                }
                case 210: {
                    n14 = 145;
                    break;
                }
                case 211: {
                    n14 = 42;
                    break;
                }
                case 212: {
                    n14 = 35;
                    break;
                }
                case 213: {
                    n14 = 254;
                    break;
                }
                case 214: {
                    n14 = 73;
                    break;
                }
                case 215: {
                    n14 = 169;
                    break;
                }
                case 216: {
                    n14 = 43;
                    break;
                }
                case 217: {
                    n14 = 218;
                    break;
                }
                case 218: {
                    n14 = 16;
                    break;
                }
                case 219: {
                    n14 = 23;
                    break;
                }
                case 220: {
                    n14 = 134;
                    break;
                }
                case 221: {
                    n14 = 178;
                    break;
                }
                case 222: {
                    n14 = 74;
                    break;
                }
                case 223: {
                    n14 = 232;
                    break;
                }
                case 224: {
                    n14 = 213;
                    break;
                }
                case 225: {
                    n14 = 2;
                    break;
                }
                case 226: {
                    n14 = 155;
                    break;
                }
                case 227: {
                    n14 = 94;
                    break;
                }
                case 228: {
                    n14 = 208;
                    break;
                }
                case 229: {
                    n14 = 190;
                    break;
                }
                case 230: {
                    n14 = 241;
                    break;
                }
                case 231: {
                    n14 = 185;
                    break;
                }
                case 232: {
                    n14 = 79;
                    break;
                }
                case 233: {
                    n14 = 46;
                    break;
                }
                case 234: {
                    n14 = 47;
                    break;
                }
                case 235: {
                    n14 = 182;
                    break;
                }
                case 236: {
                    n14 = 31;
                    break;
                }
                case 237: {
                    n14 = 154;
                    break;
                }
                case 238: {
                    n14 = 141;
                    break;
                }
                case 239: {
                    n14 = 225;
                    break;
                }
                case 240: {
                    n14 = 167;
                    break;
                }
                case 241: {
                    n14 = 44;
                    break;
                }
                case 242: {
                    n14 = 173;
                    break;
                }
                case 243: {
                    n14 = 89;
                    break;
                }
                case 244: {
                    n14 = 33;
                    break;
                }
                case 245: {
                    n14 = 230;
                    break;
                }
                case 246: {
                    n14 = 6;
                    break;
                }
                case 247: {
                    n14 = 67;
                    break;
                }
                case 248: {
                    n14 = 191;
                    break;
                }
                case 249: {
                    n14 = 235;
                    break;
                }
                case 250: {
                    n14 = 45;
                    break;
                }
                case 251: {
                    n14 = 101;
                    break;
                }
                case 252: {
                    n14 = 243;
                    break;
                }
                case 253: {
                    n14 = 111;
                    break;
                }
                case 254: {
                    n14 = 76;
                    break;
                }
                default: {
                    n14 = 223;
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
            wq_0.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }
}

