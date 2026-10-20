/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.OU;
import com.T4;
import com.ky_2;
import com.uL;
import com.w4_0;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from com.iX
 */
public class ix_1
implements LayoutManager2,
Serializable,
uL {
    protected static final double[][] e;
    protected static boolean K;
    protected static Method h;
    protected double[][] I;
    protected int[][] H;
    protected int[][] R;
    protected LinkedList w;
    protected boolean B;
    protected int E;
    protected int n;
    protected int q;
    protected int N;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public ix_1() {
        this.I = new double[][]{null, null};
        this.H = new int[][]{null, null};
        this.R = new int[][]{null, null};
        this.h(e[0], e[1]);
    }

    public ix_1(int n10, int n11) {
        this.I = new double[][]{null, null};
        this.H = new int[][]{null, null};
        this.R = new int[][]{null, null};
        this.h(e[0], e[1]);
        this.t(n10, n11);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ix_1(double[][] dArray) {
        double[][] dArray2;
        int n10;
        block6: {
            this.I = new double[][]{null, null};
            this.H = new int[][]{null, null};
            n10 = T4.O();
            try {
                this.R = new int[][]{null, null};
                dArray2 = dArray;
                if (n10 != 0) break block6;
                if (dArray2 == null) throw new IllegalArgumentException(ix_1.a(-15530, 16955));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
            dArray2 = dArray;
        }
        try {
            try {
                if (dArray2.length != 2) throw new IllegalArgumentException(ix_1.a(-15530, 16955));
                this.h(dArray[0], dArray[1]);
                if (n10 == 0) return;
                throw new IllegalArgumentException(ix_1.a(-15530, 16955));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
    }

    public ix_1(double[][] dArray, int n10, int n11) {
        this(dArray);
        this.t(n10, n11);
    }

    public ix_1(double[] dArray, double[] dArray2) {
        this.I = new double[][]{null, null};
        this.H = new int[][]{null, null};
        this.R = new int[][]{null, null};
        this.h(dArray, dArray2);
    }

    public ix_1(double[] dArray, double[] dArray2, int n10, int n11) {
        this(dArray, dArray2);
        this.t(n10, n11);
    }

    protected void h(double[] dArray, double[] dArray2) {
        block55: {
            ix_1 ix_12;
            int n10;
            int n11;
            block50: {
                int n12;
                double[] dArray3;
                block48: {
                    block49: {
                        block46: {
                            block47: {
                                n11 = T4.b();
                                try {
                                    try {
                                        dArray3 = dArray;
                                        if (n11 == 0) break block46;
                                        if (dArray3 != null) break block47;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    throw new IllegalArgumentException(ix_1.a(-15543, 28104));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                            }
                            dArray3 = dArray2;
                        }
                        try {
                            try {
                                if (n11 == 0) break block48;
                                if (dArray3 != null) break block49;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            throw new IllegalArgumentException(ix_1.a(-15544, 15676));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    this.I[0] = new double[dArray.length];
                    this.I[1] = new double[dArray2.length];
                    System.arraycopy(dArray, 0, this.I[0], 0, this.I[0].length);
                    dArray3 = dArray2;
                }
                System.arraycopy(dArray3, 0, this.I[1], 0, this.I[1].length);
                for (n10 = 0; n10 < this.I[0].length; ++n10) {
                    block54: {
                        int n13;
                        double[] dArray4;
                        double d2;
                        block53: {
                            block52: {
                                block51: {
                                    try {
                                        try {
                                            try {
                                                double d3 = this.I[0][n10] - 0.0;
                                                n12 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                                if (n11 == 0) break block50;
                                                if (n11 == 0) break block51;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ix_1.a(illegalArgumentException);
                                            }
                                            if (n12 >= 0) continue;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        double d4 = this.I[0][n10] - -1.0;
                                        d2 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n11 == 0) break block52;
                                        if (d2 == false) continue;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    double d5 = this.I[0][n10] - -2.0;
                                    d2 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (n11 == 0) break block53;
                                        if (d2 == false) continue;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    dArray4 = this.I[0];
                                    n13 = n10;
                                    if (n11 == 0) break block54;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                double d6 = dArray4[n13] - -3.0;
                                d2 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (d2 == false) continue;
                            dArray4 = this.I[0];
                            n13 = n10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    dArray4[n13] = 0.0;
                    if (n11 != 0) continue;
                }
                n12 = n10 = 0;
            }
            while (n10 < this.I[1].length) {
                block57: {
                    block60: {
                        int n14;
                        double[] dArray5;
                        double d7;
                        block59: {
                            block58: {
                                block56: {
                                    try {
                                        try {
                                            try {
                                                ix_12 = this;
                                                if (n11 == 0) break block55;
                                                double d8 = ix_12.I[1][n10] - 0.0;
                                                d7 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                                if (n11 == 0) break block56;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ix_1.a(illegalArgumentException);
                                            }
                                            if (d7 >= 0) break block57;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        double d9 = this.I[1][n10] - -1.0;
                                        d7 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n11 == 0) break block58;
                                        if (d7 == false) break block57;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    double d10 = this.I[1][n10] - -2.0;
                                    d7 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (n11 == 0) break block59;
                                        if (d7 == false) break block57;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    dArray5 = this.I[1];
                                    n14 = n10;
                                    if (n11 == 0) break block60;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                double d11 = dArray5[n14] - -3.0;
                                d7 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            if (d7 == false) break block57;
                            dArray5 = this.I[1];
                            n14 = n10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    dArray5[n14] = 0.0;
                }
                ++n10;
                if (n11 != 0) continue;
            }
            this.w = new LinkedList();
            ix_12 = this;
        }
        ix_12.B = true;
    }

    public w4_0 T(Component component) {
        ListIterator listIterator = this.w.listIterator(0);
        int n10 = T4.b();
        while (listIterator.hasNext()) {
            OU oU = (OU)listIterator.next();
            try {
                if (oU.S == component) {
                    return new w4_0(oU.x[0], oU.x[1], oU.G[0], oU.G[1], oU.b[0], oU.b[1]);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
            if (n10 != 0) continue;
        }
        return null;
    }

    public void a(Component component, w4_0 w4_02) {
        int n10 = T4.b();
        try {
            if (component == null) {
                throw new IllegalArgumentException(ix_1.a(-15532, 21920));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
        try {
            if (w4_02 == null) {
                throw new IllegalArgumentException(ix_1.a(-15529, 15231));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
        ListIterator<OU> listIterator = this.w.listIterator(0);
        while (listIterator.hasNext()) {
            OU oU = (OU)listIterator.next();
            try {
                if (oU.S == component) {
                    listIterator.set(new OU(component, w4_02));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
            if (n10 != 0) continue;
        }
    }

    public void u(double[] dArray) {
        this.X(0, dArray);
    }

    public void S(double[] dArray) {
        this.X(1, dArray);
    }

    protected void X(int n10, double[] dArray) {
        block19: {
            ix_1 ix_12;
            this.I[n10] = new double[dArray.length];
            int n11 = T4.O();
            System.arraycopy(dArray, 0, this.I[n10], 0, this.I[n10].length);
            int n12 = n11;
            for (int i2 = 0; i2 < this.I[n10].length; ++i2) {
                block23: {
                    int n13;
                    double[] dArray2;
                    double d2;
                    block22: {
                        block21: {
                            block20: {
                                try {
                                    try {
                                        try {
                                            ix_12 = this;
                                            if (n12 != 0) break block19;
                                            double d3 = ix_12.I[n10][i2] - 0.0;
                                            d2 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                                            if (n12 != 0) break block20;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        if (d2 >= 0) continue;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    double d4 = this.I[n10][i2] - -1.0;
                                    d2 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (n12 != 0) break block21;
                                    if (d2 == false) continue;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                double d5 = this.I[n10][i2] - -2.0;
                                d2 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n12 != 0) break block22;
                                    if (d2 == false) continue;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                dArray2 = this.I[n10];
                                n13 = i2;
                                if (n12 != 0) break block23;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            double d6 = dArray2[n13] - -3.0;
                            d2 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (d2 == false) continue;
                        dArray2 = this.I[n10];
                        n13 = i2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                dArray2[n13] = 0.0;
                if (n12 == 0) continue;
            }
            ix_12 = this;
        }
        ix_12.B = true;
    }

    public void h(int n10, double d2) {
        this.e(0, n10, d2);
    }

    public void M(int n10, double d2) {
        this.e(1, n10, d2);
    }

    protected void e(int n10, int n11, double d2) {
        block16: {
            block17: {
                double d3;
                block20: {
                    double d4;
                    block19: {
                        int n12;
                        block18: {
                            n12 = T4.O();
                            try {
                                try {
                                    try {
                                        try {
                                            if (n12 != 0) break block16;
                                            if (!(d2 < 0.0)) break block17;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        double d5 = d2 - -1.0;
                                        d4 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                        if (n12 != 0) break block18;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    if (d4 == false) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                double d6 = d2 - -2.0;
                                d4 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n12 != 0) break block19;
                                    if (d4 == false) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                d3 = d2;
                                if (n12 != 0) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            double d7 = d3 - -3.0;
                            d4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    if (d4 == false) break block17;
                    d3 = 0.0;
                }
                d2 = d3;
            }
            this.I[n10][n11] = d2;
            this.B = true;
        }
    }

    public double[] H() {
        double[] dArray = new double[this.I[0].length];
        System.arraycopy(this.I[0], 0, dArray, 0, dArray.length);
        return dArray;
    }

    public double[] n() {
        double[] dArray = new double[this.I[1].length];
        System.arraycopy(this.I[1], 0, dArray, 0, dArray.length);
        return dArray;
    }

    public double V(int n10) {
        return this.I[0][n10];
    }

    public double f(int n10) {
        return this.I[1][n10];
    }

    public int A() {
        return this.I[0].length;
    }

    public int J() {
        return this.I[1].length;
    }

    public int Y() {
        return this.q;
    }

    public int w() {
        return this.N;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void q(int n10) {
        int n11;
        block6: {
            n11 = T4.O();
            try {
                try {
                    if (n11 != 0) break block6;
                    if (n10 < 0) throw new IllegalArgumentException(ix_1.a(-15541, 151));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
                this.q = n10;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
        }
        try {
            if (n11 == 0) return;
            throw new IllegalArgumentException(ix_1.a(-15541, 151));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void p(int n10) {
        int n11;
        block6: {
            n11 = T4.b();
            try {
                try {
                    if (n11 == 0) break block6;
                    if (n10 < 0) throw new IllegalArgumentException(ix_1.a(-15523, -23793));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
                this.N = n10;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ix_1.a(illegalArgumentException);
            }
        }
        try {
            if (n11 != 0) return;
            throw new IllegalArgumentException(ix_1.a(-15523, -23793));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
    }

    public void t(int n10, int n11) {
        this.q(n10);
        this.p(n11);
    }

    public void u(int n10, double d2) {
        this.z(0, n10, d2);
    }

    public void e(int n10, double d2) {
        this.z(1, n10, d2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void z(int n10, int n11, double d2) {
        int n12;
        int n13;
        block34: {
            block35: {
                block32: {
                    block33: {
                        block31: {
                            n13 = T4.O();
                            try {
                                n12 = n11;
                                if (n13 != 0) break block31;
                                if (n12 < 0) throw new IllegalArgumentException(ix_1.a(-15536, -6213) + n11 + ix_1.a(-15524, 6776) + this.I[n10].length + ix_1.a(-15533, 21541));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            n12 = n11;
                        }
                        try {
                            try {
                                if (n13 != 0) break block32;
                                if (n12 <= this.I[n10].length) break block33;
                                throw new IllegalArgumentException(ix_1.a(-15536, -6213) + n11 + ix_1.a(-15524, 6776) + this.I[n10].length + ix_1.a(-15533, 21541));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    double d3 = d2 - 0.0;
                    n12 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n13 != 0) break block34;
                                            if (n12 >= 0) break block35;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        double d4 = d2 - -1.0;
                                        n12 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                        if (n13 != 0) break block34;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    if (n12 == 0) break block35;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                double d5 = d2 - -2.0;
                                n12 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                if (n13 != 0) break block34;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            if (n12 == 0) break block35;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        double d6 = d2 - -3.0;
                        n12 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                        if (n13 != 0) break block34;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                    if (n12 == 0) break block35;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
                d2 = 0.0;
            }
            n12 = this.I[n10].length + 1;
        }
        double[] dArray = new double[n12];
        System.arraycopy(this.I[n10], 0, dArray, 0, n11);
        System.arraycopy(this.I[n10], n11, dArray, n11 + 1, this.I[n10].length - n11);
        dArray[n11] = d2;
        this.I[n10] = dArray;
        ListIterator listIterator = this.w.listIterator(0);
        while (listIterator.hasNext()) {
            block39: {
                int n14;
                int[] nArray;
                block38: {
                    int n15;
                    int n16;
                    OU oU;
                    block36: {
                        block37: {
                            oU = (OU)listIterator.next();
                            try {
                                try {
                                    try {
                                        if (n13 != 0) return;
                                        n16 = oU.x[n10];
                                        n15 = n11;
                                        if (n13 != 0) break block36;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    if (n16 < n15) break block37;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                int n17 = n10;
                                oU.x[n17] = oU.x[n17] + 1;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            nArray = oU.G;
                            n14 = n10;
                            if (n13 != 0) break block38;
                            n16 = nArray[n14];
                            n15 = n11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (n16 < n15) break block39;
                        nArray = oU.G;
                        n14 = n10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                nArray[n14] = nArray[n14] + 1;
            }
            if (n13 == 0) continue;
        }
        this.B = true;
    }

    public void a(int n10) {
        this.H(0, n10);
    }

    public void Z(int n10) {
        this.H(1, n10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void H(int n10, int n11) {
        int n12;
        int n13;
        int n14;
        block18: {
            block19: {
                block17: {
                    n14 = T4.O();
                    try {
                        n13 = n11;
                        if (n14 != 0) break block17;
                        if (n13 < 0) throw new IllegalArgumentException(ix_1.a(-15522, -24059) + n11 + ix_1.a(-15521, 22776) + (this.I[n10].length - 1) + ix_1.a(-15538, -24320));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                    n13 = n11;
                }
                try {
                    try {
                        n12 = this.I[n10].length;
                        if (n14 != 0) break block18;
                        if (n13 < n12) break block19;
                        throw new IllegalArgumentException(ix_1.a(-15522, -24059) + n11 + ix_1.a(-15521, 22776) + (this.I[n10].length - 1) + ix_1.a(-15538, -24320));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
            }
            n13 = this.I[n10].length;
            n12 = 1;
        }
        double[] dArray = new double[n13 - n12];
        System.arraycopy(this.I[n10], 0, dArray, 0, n11);
        System.arraycopy(this.I[n10], n11 + 1, dArray, n11, this.I[n10].length - n11 - 1);
        this.I[n10] = dArray;
        ListIterator listIterator = this.w.listIterator(0);
        while (listIterator.hasNext()) {
            block23: {
                int n15;
                int[] nArray;
                block22: {
                    int n16;
                    int n17;
                    OU oU;
                    block20: {
                        block21: {
                            oU = (OU)listIterator.next();
                            try {
                                try {
                                    try {
                                        if (n14 != 0) return;
                                        n17 = oU.x[n10];
                                        n16 = n11;
                                        if (n14 != 0) break block20;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    if (n17 <= n16) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                int n18 = n10;
                                oU.x[n18] = oU.x[n18] - 1;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        try {
                            nArray = oU.G;
                            n15 = n10;
                            if (n14 != 0) break block22;
                            n17 = nArray[n15];
                            n16 = n11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (n17 <= n16) break block23;
                        nArray = oU.G;
                        n15 = n10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                nArray[n15] = nArray[n15] - 1;
            }
            if (n14 == 0) continue;
        }
        this.B = true;
    }

    public String toString() {
        String string;
        block27: {
            block24: {
                int n10;
                block25: {
                    int n11;
                    block23: {
                        int n12;
                        block26: {
                            block21: {
                                block22: {
                                    block20: {
                                        int n13;
                                        string = ix_1.a(-15531, -24101);
                                        n10 = T4.b();
                                        try {
                                            n13 = this.I[0].length;
                                            if (n10 == 0) break block20;
                                            if (n13 <= 0) break block21;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        n13 = n11 = 0;
                                    }
                                    while (n11 < this.I[0].length - 1) {
                                        string = string + this.I[0][n11] + ix_1.a(-15548, 20570);
                                        try {
                                            ++n11;
                                            if (n10 != 0) {
                                                if (n10 != 0) continue;
                                                break;
                                            }
                                            break block22;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                    }
                                    string = string + this.I[0][this.I[0].length - 1] + ix_1.a(-15537, -7513);
                                }
                                if (n10 != 0) break block26;
                            }
                            string = string + ix_1.a(-15534, 1933);
                        }
                        try {
                            n12 = this.I[1].length;
                            if (n10 == 0) break block23;
                            if (n12 <= 0) break block24;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        n12 = n11 = 0;
                    }
                    while (n11 < this.I[1].length - 1) {
                        string = string + this.I[1][n11] + ix_1.a(-15547, 25082);
                        try {
                            ++n11;
                            if (n10 != 0) {
                                if (n10 != 0) continue;
                                break;
                            }
                            break block25;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    string = string + this.I[1][this.I[1].length - 1] + ix_1.a(-15525, -24355);
                }
                if (n10 != 0) break block27;
            }
            string = string + ix_1.a(-15527, 21779);
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    public List P() {
        block21: {
            var2_1 = new LinkedList<E>();
            var1_2 = T4.b();
            try {
                var3_3 = this.w.listIterator(0);
                while (var3_3.hasNext()) {
                    block22: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                block23: {
                                                    var4_5 = (OU)var3_3.next();
                                                    if (var1_2 == 0) break block21;
                                                    v0 = var4_5.x[1];
                                                    if (var1_2 == 0) break block22;
                                                    break block23;
                                                    catch (CloneNotSupportedException v1) {
                                                        throw ix_1.a(v1);
                                                    }
                                                }
                                                if (v0 < 0) ** GOTO lbl60
                                                break block24;
                                                catch (CloneNotSupportedException v2) {
                                                    throw ix_1.a(v2);
                                                }
                                            }
                                            v0 = var4_5.x[0];
                                            if (var1_2 == 0) break block22;
                                            break block25;
                                            catch (CloneNotSupportedException v3) {
                                                throw ix_1.a(v3);
                                            }
                                        }
                                        if (v0 < 0) ** GOTO lbl60
                                        break block26;
                                        catch (CloneNotSupportedException v4) {
                                            throw ix_1.a(v4);
                                        }
                                    }
                                    v0 = var4_5.G[1];
                                    if (var1_2 == 0) break block22;
                                    break block27;
                                    catch (CloneNotSupportedException v5) {
                                        throw ix_1.a(v5);
                                    }
                                }
                                if (v0 >= this.I[1].length) ** GOTO lbl60
                                break block28;
                                catch (CloneNotSupportedException v6) {
                                    throw ix_1.a(v6);
                                }
                            }
                            v0 = var4_5.G[0];
                            if (var1_2 == 0) break block22;
                            break block29;
                            catch (CloneNotSupportedException v7) {
                                throw ix_1.a(v7);
                            }
                        }
                        try {
                            block30: {
                                if (v0 < this.I[0].length) break block22;
                                break block30;
                                catch (CloneNotSupportedException v8) {
                                    throw ix_1.a(v8);
                                }
                            }
                            v0 = (int)var2_1.add(var4_5.x());
                        }
                        catch (CloneNotSupportedException v9) {
                            throw ix_1.a(v9);
                        }
                    }
                    if (var1_2 != 0) continue;
                    break;
                }
            }
            catch (CloneNotSupportedException var3_4) {
                throw new RuntimeException(ix_1.a(-15540, 23269));
            }
        }
        return var2_1;
    }

    /*
     * Unable to fully structure code
     */
    public List g() {
        block42: {
            var2_1 = new LinkedList<E>();
            var1_2 = T4.O();
            try {
                var3_3 = this.w.size();
                if (var3_3 == 0) {
                    return var2_1;
                }
                var4_5 = this.w.toArray(new OU[var3_3]);
                var5_6 = 1;
                block34: while (true) {
                    v0 = var5_6;
                    v1 = var3_3;
                    block35: while (v0 < v1 && var1_2 == 0) {
                        for (var6_7 = var5_6 - 1; var6_7 >= 0; --var6_7) {
                            block41: {
                                block52: {
                                    block40: {
                                        block39: {
                                            block38: {
                                                block48: {
                                                    block47: {
                                                        block46: {
                                                            block45: {
                                                                block44: {
                                                                    block43: {
                                                                        v0 = var4_5[var6_7].x[0];
                                                                        v1 = var4_5[var5_6].x[0];
                                                                        if (var1_2 != 0) continue block35;
                                                                        if (var1_2 != 0) break block38;
                                                                        if (v0 < v1) ** GOTO lbl65
                                                                        break block43;
                                                                        catch (CloneNotSupportedException v2) {
                                                                            throw ix_1.a(v2);
                                                                        }
                                                                    }
                                                                    v3 = var4_5[var6_7].x[0];
                                                                    v4 = var4_5[var5_6].G[0];
                                                                    if (var1_2 != 0) break block38;
                                                                    break block44;
                                                                    catch (CloneNotSupportedException v5) {
                                                                        throw ix_1.a(v5);
                                                                    }
                                                                }
                                                                if (v3 > v4) ** GOTO lbl65
                                                                break block45;
                                                                catch (CloneNotSupportedException v6) {
                                                                    throw ix_1.a(v6);
                                                                }
                                                            }
                                                            v3 = var4_5[var6_7].x[1];
                                                            v4 = var4_5[var5_6].x[1];
                                                            if (var1_2 != 0) break block38;
                                                            break block46;
                                                            catch (CloneNotSupportedException v7) {
                                                                throw ix_1.a(v7);
                                                            }
                                                        }
                                                        if (v3 < v4) ** GOTO lbl65
                                                        break block47;
                                                        catch (CloneNotSupportedException v8) {
                                                            throw ix_1.a(v8);
                                                        }
                                                    }
                                                    v3 = var4_5[var6_7].x[1];
                                                    if (var1_2 != 0) continue;
                                                    break block48;
                                                    catch (CloneNotSupportedException v9) {
                                                        throw ix_1.a(v9);
                                                    }
                                                }
                                                try {
                                                    block49: {
                                                        if (v3 <= var4_5[var5_6].G[1]) ** GOTO lbl122
                                                        break block49;
                                                        catch (CloneNotSupportedException v10) {
                                                            throw ix_1.a(v10);
                                                        }
                                                    }
                                                    v3 = var4_5[var6_7].G[0];
                                                    v4 = var4_5[var5_6].x[0];
                                                }
                                                catch (CloneNotSupportedException v11) {
                                                    throw ix_1.a(v11);
                                                }
                                            }
                                            if (var1_2 != 0) break block39;
                                            try {
                                                block50: {
                                                    if (v3 < v4) continue;
                                                    break block50;
                                                    catch (CloneNotSupportedException v12) {
                                                        throw ix_1.a(v12);
                                                    }
                                                }
                                                v3 = var4_5[var6_7].G[0];
                                                v4 = var4_5[var5_6].G[0];
                                            }
                                            catch (CloneNotSupportedException v13) {
                                                throw ix_1.a(v13);
                                            }
                                        }
                                        if (var1_2 != 0) break block40;
                                        try {
                                            block51: {
                                                if (v3 > v4) continue;
                                                break block51;
                                                catch (CloneNotSupportedException v14) {
                                                    throw ix_1.a(v14);
                                                }
                                            }
                                            v3 = var4_5[var6_7].G[1];
                                            v4 = var4_5[var5_6].x[1];
                                        }
                                        catch (CloneNotSupportedException v15) {
                                            throw ix_1.a(v15);
                                        }
                                    }
                                    if (var1_2 != 0) break block41;
                                    if (v3 < v4) continue;
                                    break block52;
                                    catch (CloneNotSupportedException v16) {
                                        throw ix_1.a(v16);
                                    }
                                }
                                try {
                                    block53: {
                                        v3 = var4_5[var6_7].G[1];
                                        if (var1_2 != 0) continue;
                                        break block53;
                                        catch (CloneNotSupportedException v17) {
                                            throw ix_1.a(v17);
                                        }
                                    }
                                    v4 = var4_5[var5_6].G[1];
                                }
                                catch (CloneNotSupportedException v18) {
                                    throw ix_1.a(v18);
                                }
                            }
                            try {
                                if (v3 > v4) continue;
lbl122:
                                // 2 sources

                                v3 = (int)var2_1.add(var4_5[var6_7].x());
                                continue;
                            }
                            catch (CloneNotSupportedException v19) {
                                throw ix_1.a(v19);
                            }
                        }
                        ++var5_6;
                        if (var1_2 == 0) continue block34;
                    }
                    break block42;
                    break;
                }
                {
                    break block42;
                    break;
                }
            }
            catch (CloneNotSupportedException var3_4) {
                throw new RuntimeException(ix_1.a(-15542, 16341));
            }
        }
        return var2_1;
    }

    protected void I(Container container) {
        int n10;
        int n11;
        int n12;
        int n13;
        Dimension dimension;
        Insets insets;
        block9: {
            block10: {
                block7: {
                    block8: {
                        insets = container.getInsets();
                        dimension = container.getSize();
                        n13 = dimension.width - insets.left - insets.right;
                        n12 = T4.O();
                        n11 = dimension.height - insets.top - insets.bottom;
                        try {
                            n10 = this.I[0].length;
                            if (n12 != 0) break block7;
                            if (n10 <= 0) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        n13 -= this.q * (this.I[0].length - 1);
                    }
                    n10 = this.I[1].length;
                }
                try {
                    if (n12 != 0) break block9;
                    if (n10 <= 0) break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
                n11 -= this.N * (this.I[1].length - 1);
            }
            this.H[0] = new int[this.I[0].length];
            this.H[1] = new int[this.I[1].length];
            n13 = this.G(0, n13);
            n11 = this.G(1, n11);
            n13 = this.x(0, n13, -3.0);
            n13 = this.x(0, n13, -2.0);
            n11 = this.x(1, n11, -3.0);
            n11 = this.x(1, n11, -2.0);
            n13 = this.T(0, n13);
            n10 = this.T(1, n11);
        }
        n11 = n10;
        try {
            this.p(0, n13);
            this.p(1, n11);
            this.k(0, insets);
            this.k(1, insets);
            this.B = false;
            this.E = dimension.width;
            this.n = dimension.height;
            if (n12 != 0) {
                ky_2.K(new String[5]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ix_1.a(illegalArgumentException);
        }
    }

    protected int G(int n10, int n11) {
        int n12;
        block11: {
            int n13 = this.I[n10].length;
            int n14 = T4.b();
            for (int i2 = 0; i2 < n13; ++i2) {
                double d2;
                block12: {
                    try {
                        block13: {
                            try {
                                try {
                                    try {
                                        try {
                                            double d3 = this.I[n10][i2] - 1.0;
                                            n12 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                            if (n14 == 0) break block11;
                                            if (n14 == 0) break block12;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ix_1.a(illegalArgumentException);
                                        }
                                        if (n12 >= 0) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ix_1.a(illegalArgumentException);
                                    }
                                    double d4 = this.I[n10][i2] - 0.0;
                                    d2 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                    if (n14 == 0) break block12;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                if (d2 != false) continue;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                        }
                        this.H[n10][i2] = (int)(this.I[n10][i2] + 0.5);
                        d2 = n11 - this.H[n10][i2];
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                n11 = d2;
                if (n14 != 0) continue;
            }
            n12 = n11;
        }
        return n12;
    }

    protected int T(int n10, int n11) {
        int n12;
        block15: {
            int n13;
            int n14;
            block13: {
                block14: {
                    n14 = T4.b();
                    try {
                        n13 = n11;
                        if (n14 == 0) break block13;
                        if (n13 >= 0) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                    n13 = 0;
                    break block13;
                }
                n13 = n11;
            }
            int n15 = n13;
            int n16 = this.I[n10].length;
            for (int i2 = 0; i2 < n16; ++i2) {
                double d2;
                block17: {
                    block16: {
                        try {
                            try {
                                try {
                                    double d3 = this.I[n10][i2] - 0.0;
                                    n12 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                    if (n14 == 0) break block15;
                                    if (n14 == 0) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                if (n12 <= 0) continue;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            double d4 = this.I[n10][i2] - 1.0;
                            d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (n14 == 0) break block17;
                            if (d2 >= 0) continue;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        this.H[n10][i2] = (int)(this.I[n10][i2] * (double)n15 + 0.5);
                        d2 = n11 - this.H[n10][i2];
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                n11 = d2;
                if (n14 != 0) continue;
            }
            n12 = n11;
        }
        return n12;
    }

    protected void p(int n10, int n11) {
        int n12;
        int n13;
        int n14;
        block24: {
            int n15;
            int n16;
            int n17;
            block23: {
                int n18;
                int n19;
                block21: {
                    block22: {
                        n14 = T4.O();
                        try {
                            n19 = n11;
                            if (n14 != 0) break block21;
                            if (n19 > 0) break block22;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        return;
                    }
                    n19 = 0;
                }
                n17 = n19;
                n16 = this.I[n10].length;
                for (n13 = 0; n13 < n16; ++n13) {
                    try {
                        double d2 = this.I[n10][n13] - -1.0;
                        n18 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                        if (n14 != 0) break block23;
                        if (n18 != 0) continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                    ++n17;
                    if (n14 == 0) continue;
                }
                n13 = n11;
                n18 = n12 = 0;
            }
            while (n12 < n16) {
                block26: {
                    int n20;
                    block25: {
                        try {
                            try {
                                try {
                                    double d3 = this.I[n10][n12] - -1.0;
                                    n15 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                    if (n14 != 0) break block24;
                                    if (n14 != 0) break block25;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                if (n15 != 0) break block26;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            this.H[n10][n12] = n11 / n17;
                            n20 = n13 - this.H[n10][n12];
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    n13 = n20;
                }
                ++n12;
                if (n14 == 0) continue;
            }
            n15 = n12 = n16 - 1;
        }
        while (n12 >= 0) {
            block29: {
                ix_1 ix_12;
                block28: {
                    int n21;
                    block27: {
                        try {
                            try {
                                try {
                                    n21 = n13;
                                    if (n14 != 0) break block27;
                                    if (n21 <= 0) break;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ix_1.a(illegalArgumentException);
                                }
                                ix_12 = this;
                                if (n14 != 0) break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            double d4 = ix_12.I[n10][n12] - -1.0;
                            n21 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    if (n21 != 0) break block29;
                    ix_12 = this;
                }
                int[] nArray = ix_12.H[n10];
                int n22 = n12;
                nArray[n22] = nArray[n22] + 1;
                --n13;
            }
            --n12;
            if (n14 == 0) continue;
        }
    }

    protected void k(int n10, Insets insets) {
        int n11;
        int n12;
        int n13;
        block5: {
            block6: {
                n13 = this.I[n10].length;
                this.R[n10] = new int[n13 + 1];
                n12 = T4.O();
                try {
                    try {
                        int[] nArray = this.R[n10];
                        int n14 = 0;
                        n11 = n10;
                        if (n12 != 0) break block5;
                        if (n11 != 0) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                    n11 = insets.left;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ix_1.a(illegalArgumentException);
                }
            }
            n11 = insets.top;
        }
        nArray[n14] = n11;
        for (int i2 = 0; i2 < n13; ++i2) {
            this.R[n10][i2 + 1] = this.R[n10][i2] + this.H[n10][i2];
            if (n12 == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected int x(int var1_1, int var2_2, double var3_3) {
        block82: {
            var6_4 = this.I[var1_1].length;
            var5_6 = T4.b();
            for (var7_5 = 0; var7_5 < var6_4; ++var7_5) {
                block84: {
                    block83: {
                        try {
                            try {
                                cfr_temp_0 = this.I[var1_1][var7_5] - var3_3;
                                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                if (var5_6 == 0) break block82;
                                if (var5_6 == 0) break block83;
                            }
                            catch (IllegalArgumentException v1) {
                                throw ix_1.a(v1);
                            }
                            if (v0 != 0) continue;
                        }
                        catch (IllegalArgumentException v2) {
                            throw ix_1.a(v2);
                        }
                        v3 = false;
                    }
                    var8_7 = v3;
                    var9_8 = this.w.listIterator(0);
                    block75: while (var9_8.hasNext()) {
                        block89: {
                            block106: {
                                block95: {
                                    block101: {
                                        block94: {
                                            block92: {
                                                block93: {
                                                    block91: {
                                                        block90: {
                                                            block88: {
                                                                block86: {
                                                                    block87: {
                                                                        block85: {
                                                                            var10_9 = (OU)var9_8.next();
                                                                            try {
                                                                                try {
                                                                                    v4 = var10_9.x[var1_1];
                                                                                    if (var5_6 == 0) break block84;
                                                                                    if (var5_6 == 0) break block85;
                                                                                }
                                                                                catch (IllegalArgumentException v5) {
                                                                                    throw ix_1.a(v5);
                                                                                }
                                                                                if (v4 < 0) continue;
                                                                            }
                                                                            catch (IllegalArgumentException v6) {
                                                                                throw ix_1.a(v6);
                                                                            }
                                                                            v7 = var10_9.G[var1_1];
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v8 = var6_4;
                                                                                if (var5_6 == 0) break block86;
                                                                                if (v7 < v8) break block87;
                                                                            }
                                                                            catch (IllegalArgumentException v9) {
                                                                                throw ix_1.a(v9);
                                                                            }
                                                                            if (var5_6 != 0) continue;
                                                                        }
                                                                        catch (IllegalArgumentException v10) {
                                                                            throw ix_1.a(v10);
                                                                        }
                                                                    }
                                                                    v7 = var10_9.x[var1_1];
                                                                    v8 = var7_5;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var5_6 == 0) break block88;
                                                                            if (v7 > v8) break block89;
                                                                        }
                                                                        catch (IllegalArgumentException v11) {
                                                                            throw ix_1.a(v11);
                                                                        }
                                                                        v7 = var10_9.G[var1_1];
                                                                        if (var5_6 == 0) break block90;
                                                                    }
                                                                    catch (IllegalArgumentException v12) {
                                                                        throw ix_1.a(v12);
                                                                    }
                                                                    v8 = var7_5;
                                                                }
                                                                catch (IllegalArgumentException v13) {
                                                                    throw ix_1.a(v13);
                                                                }
                                                            }
                                                            try {
                                                                if (v7 < v8) break block89;
                                                                cfr_temp_1 = var3_3 - -2.0;
                                                                v7 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                            }
                                                            catch (IllegalArgumentException v14) {
                                                                throw ix_1.a(v14);
                                                            }
                                                        }
                                                        try {
                                                            v15 = v7 == 0 ? var10_9.S.getPreferredSize() : var10_9.S.getMinimumSize();
                                                        }
                                                        catch (IllegalArgumentException v16) {
                                                            throw ix_1.a(v16);
                                                        }
                                                        var11_10 = v15;
                                                        try {
                                                            if (var11_10 != null) break block91;
                                                            v17 = 0;
                                                            break block92;
                                                        }
                                                        catch (IllegalArgumentException v18) {
                                                            throw ix_1.a(v18);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v17 = var1_1;
                                                            if (var5_6 == 0) break block92;
                                                            if (v17 != 0) break block93;
                                                        }
                                                        catch (IllegalArgumentException v19) {
                                                            throw ix_1.a(v19);
                                                        }
                                                        v17 = var11_10.width;
                                                        break block92;
                                                    }
                                                    catch (IllegalArgumentException v20) {
                                                        throw ix_1.a(v20);
                                                    }
                                                }
                                                v17 = var11_10.height;
                                            }
                                            var12_11 = v17;
                                            var13_12 = 0;
                                            try {
                                                cfr_temp_2 = var3_3 - -2.0;
                                                v21 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                if (var5_6 == 0) break block94;
                                                if (v21 == false) {
                                                }
                                                ** GOTO lbl185
                                            }
                                            catch (IllegalArgumentException v22) {
                                                throw ix_1.a(v22);
                                            }
                                            for (var14_13 = (double)var10_9.x[var1_1]; var14_13 <= var10_9.G[var1_1]; ++var14_13) {
                                                block99: {
                                                    block98: {
                                                        block96: {
                                                            try {
                                                                block97: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    cfr_temp_3 = this.I[var1_1][var14_13] - 0.0;
                                                                                    v23 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                    if (var5_6 == 0) break block95;
                                                                                    if (var5_6 == 0) break block96;
                                                                                }
                                                                                catch (IllegalArgumentException v24) {
                                                                                    throw ix_1.a(v24);
                                                                                }
                                                                                if (v23 >= 0) break block97;
                                                                            }
                                                                            catch (IllegalArgumentException v25) {
                                                                                throw ix_1.a(v25);
                                                                            }
                                                                            cfr_temp_4 = this.I[var1_1][var14_13] - -3.0;
                                                                            v26 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                            if (var5_6 == 0) break block98;
                                                                        }
                                                                        catch (IllegalArgumentException v27) {
                                                                            throw ix_1.a(v27);
                                                                        }
                                                                        if (v26 == false) {
                                                                        }
                                                                        ** GOTO lbl154
                                                                    }
                                                                    catch (IllegalArgumentException v28) {
                                                                        throw ix_1.a(v28);
                                                                    }
                                                                }
                                                                v29 = var12_11 - this.H[var1_1][var14_13];
                                                            }
                                                            catch (IllegalArgumentException v30) {
                                                                throw ix_1.a(v30);
                                                            }
                                                        }
                                                        var12_11 = v29;
                                                        try {
                                                            if (var5_6 != 0) continue;
lbl154:
                                                            // 2 sources

                                                            v26 = (cfr_temp_5 = this.I[var1_1][var14_13] - -2.0) == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                        }
                                                        catch (IllegalArgumentException v31) {
                                                            throw ix_1.a(v31);
                                                        }
                                                    }
                                                    try {
                                                        block100: {
                                                            try {
                                                                try {
                                                                    if (var5_6 == 0) break block99;
                                                                    if (v26 != false) break block100;
                                                                }
                                                                catch (IllegalArgumentException v32) {
                                                                    throw ix_1.a(v32);
                                                                }
                                                                ++var13_12;
                                                                if (var5_6 != 0) continue;
                                                            }
                                                            catch (IllegalArgumentException v33) {
                                                                throw ix_1.a(v33);
                                                            }
                                                        }
                                                        v26 = (cfr_temp_6 = this.I[var1_1][var14_13] - -1.0) == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                    }
                                                    catch (IllegalArgumentException v34) {
                                                        throw ix_1.a(v34);
                                                    }
                                                }
                                                try {
                                                    if (v26 == false && var5_6 != 0) continue block75;
                                                    continue;
                                                }
                                                catch (IllegalArgumentException v35) {
                                                    throw ix_1.a(v35);
                                                }
                                            }
                                            try {
                                                if (var5_6 != 0) break block101;
lbl185:
                                                // 2 sources

                                                v21 = var10_9.x[var1_1];
                                            }
                                            catch (IllegalArgumentException v36) {
                                                throw ix_1.a(v36);
                                            }
                                        }
                                        for (var14_13 = v8250201; var14_13 <= var10_9.G[var1_1]; ++var14_13) {
                                            block104: {
                                                block103: {
                                                    block102: {
                                                        try {
                                                            try {
                                                                cfr_temp_7 = this.I[var1_1][var14_13] - 0.0;
                                                                v23 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                                                if (var5_6 == 0) break block95;
                                                                if (var5_6 == 0) break block102;
                                                            }
                                                            catch (IllegalArgumentException v37) {
                                                                throw ix_1.a(v37);
                                                            }
                                                            if (v23 >= 0) {
                                                            }
                                                            ** GOTO lbl208
                                                        }
                                                        catch (IllegalArgumentException v38) {
                                                            throw ix_1.a(v38);
                                                        }
                                                        var12_11 -= this.H[var1_1][var14_13];
                                                        try {
                                                            if (var5_6 != 0) continue;
lbl208:
                                                            // 2 sources

                                                            v39 = (cfr_temp_8 = this.I[var1_1][var14_13] - -2.0) == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                                        }
                                                        catch (IllegalArgumentException v40) {
                                                            throw ix_1.a(v40);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            if (var5_6 == 0) break block103;
                                                            if (v39 != false) {
                                                            }
                                                            ** GOTO lbl235
                                                        }
                                                        catch (IllegalArgumentException v41) {
                                                            throw ix_1.a(v41);
                                                        }
                                                        cfr_temp_9 = this.I[var1_1][var14_13] - -3.0;
                                                        v39 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                                    }
                                                    catch (IllegalArgumentException v42) {
                                                        throw ix_1.a(v42);
                                                    }
                                                }
                                                try {
                                                    block105: {
                                                        try {
                                                            try {
                                                                if (var5_6 == 0) break block104;
                                                                if (v39 != false) break block105;
                                                            }
                                                            catch (IllegalArgumentException v43) {
                                                                throw ix_1.a(v43);
                                                            }
lbl235:
                                                            // 2 sources

                                                            ++var13_12;
                                                            if (var5_6 != 0) continue;
                                                        }
                                                        catch (IllegalArgumentException v44) {
                                                            throw ix_1.a(v44);
                                                        }
                                                    }
                                                    v39 = (cfr_temp_10 = this.I[var1_1][var14_13] - -1.0) == 0.0 ? 0 : (cfr_temp_10 > 0.0 ? 1 : -1);
                                                }
                                                catch (IllegalArgumentException v45) {
                                                    throw ix_1.a(v45);
                                                }
                                            }
                                            try {
                                                if (v39 == false && var5_6 != 0) continue block75;
                                                continue;
                                            }
                                            catch (IllegalArgumentException v46) {
                                                throw ix_1.a(v46);
                                            }
                                        }
                                    }
                                    var12_11 = (int)Math.ceil((double)var12_11 / (double)var13_12);
                                    v23 = var8_7;
                                }
                                try {
                                    try {
                                        if (var5_6 == 0) break block106;
                                        if (v23 >= var12_11) break block89;
                                    }
                                    catch (IllegalArgumentException v47) {
                                        throw ix_1.a(v47);
                                    }
                                    v23 = var12_11;
                                }
                                catch (IllegalArgumentException v48) {
                                    throw ix_1.a(v48);
                                }
                            }
                            var8_7 = v23;
                        }
                        if (var5_6 != 0) continue;
                    }
                    this.H[var1_1][var7_5] = var8_7;
                    v4 = var2_2 - var8_7;
                }
                var2_2 = v4;
                if (var5_6 != 0) continue;
            }
            v0 = var2_2;
        }
        return v0;
    }

    /*
     * Loose catch block
     */
    @Override
    public void layoutContainer(Container container) {
        boolean bl;
        int n10;
        Dimension dimension;
        block40: {
            block39: {
                ComponentOrientation componentOrientation;
                block38: {
                    block51: {
                        ix_1 ix_12;
                        block35: {
                            block36: {
                                int n11;
                                int n12;
                                block37: {
                                    block49: {
                                        block48: {
                                            dimension = container.getSize();
                                            n10 = T4.O();
                                            ix_12 = this;
                                            if (n10 != 0) break block35;
                                            if (ix_12.B) break block36;
                                            break block48;
                                            catch (Exception exception) {
                                                throw ix_1.a(exception);
                                            }
                                        }
                                        n12 = dimension.width;
                                        n11 = this.E;
                                        if (n10 != 0) break block37;
                                        break block49;
                                        catch (Exception exception) {
                                            throw ix_1.a(exception);
                                        }
                                    }
                                    try {
                                        block50: {
                                            if (n12 != n11) break block36;
                                            break block50;
                                            catch (Exception exception) {
                                                throw ix_1.a(exception);
                                            }
                                        }
                                        n12 = dimension.height;
                                        n11 = this.n;
                                    }
                                    catch (Exception exception) {
                                        throw ix_1.a(exception);
                                    }
                                }
                                if (n12 == n11) break block51;
                            }
                            ix_12 = this;
                        }
                        ix_12.I(container);
                    }
                    ComponentOrientation componentOrientation2 = this.k(container);
                    try {
                        componentOrientation = componentOrientation2;
                        if (n10 != 0) break block38;
                        if (componentOrientation == null) break block39;
                    }
                    catch (Exception exception) {
                        throw ix_1.a(exception);
                    }
                    componentOrientation = componentOrientation2;
                }
                try {
                    bl = componentOrientation.isLeftToRight();
                    if (n10 != 0) break block40;
                    if (bl) break block39;
                }
                catch (Exception exception) {
                    throw ix_1.a(exception);
                }
                bl = true;
                break block40;
            }
            bl = false;
        }
        boolean bl2 = bl;
        Insets insets = container.getInsets();
        Component[] componentArray = container.getComponents();
        for (int i2 = 0; i2 < componentArray.length; ++i2) {
            OU oU;
            block43: {
                Component component;
                block41: {
                    ListIterator listIterator = this.w.listIterator(0);
                    oU = null;
                    while (listIterator.hasNext()) {
                        block42: {
                            oU = (OU)listIterator.next();
                            component = oU.S;
                            if (n10 != 0) break block41;
                            try {
                                block52: {
                                    if (component != componentArray[i2]) break block42;
                                    break block52;
                                    catch (Exception exception) {
                                        throw ix_1.a(exception);
                                    }
                                }
                                if (n10 == 0) break;
                            }
                            catch (Exception exception) {
                                throw ix_1.a(exception);
                            }
                        }
                        oU = null;
                    }
                    try {
                        if (oU != null) break block43;
                        component = componentArray[i2];
                    }
                    catch (Exception exception) {
                        throw ix_1.a(exception);
                    }
                }
                component.setBounds(0, 0, 0, 0);
                if (n10 == 0) continue;
            }
            try {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                block47: {
                    Object object5;
                    int[] nArray;
                    int n13;
                    block46: {
                        int n14;
                        block55: {
                            block45: {
                                int n15;
                                int n16;
                                block44: {
                                    block53: {
                                        n14 = 0;
                                        n13 = 0;
                                        n16 = oU.b[0];
                                        n15 = 2;
                                        if (n10 != 0) break block44;
                                        if (n16 != n15) break block45;
                                        break block53;
                                        catch (Exception exception) {
                                            throw ix_1.a(exception);
                                        }
                                    }
                                    try {
                                        block54: {
                                            nArray = oU.b;
                                            if (n10 != 0) break block46;
                                            break block54;
                                            catch (Exception exception) {
                                                throw ix_1.a(exception);
                                            }
                                        }
                                        n16 = nArray[1];
                                        n15 = 2;
                                    }
                                    catch (Exception exception) {
                                        throw ix_1.a(exception);
                                    }
                                }
                                if (n16 == n15) break block55;
                            }
                            object5 = componentArray[i2].getPreferredSize();
                            n14 = ((Dimension)object5).width;
                            n13 = ((Dimension)object5).height;
                        }
                        nArray = this.i(oU, n14, true);
                    }
                    object5 = nArray;
                    object4 = object5[0];
                    object3 = object5[1];
                    object5 = this.i(oU, n13, false);
                    object2 = object5[0];
                    object = object5[1];
                    try {
                        if (n10 != 0) continue;
                        if (!bl2) break block47;
                    }
                    catch (Exception exception) {
                        throw ix_1.a(exception);
                    }
                    object4 = dimension.width - object4 - object3 + insets.left - insets.right;
                }
                componentArray[i2].setBounds((int)object4, (int)object2, (int)object3, (int)object);
                continue;
            }
            catch (Exception exception) {
                componentArray[i2].setBounds(0, 0, 0, 0);
            }
            if (n10 == 0) continue;
        }
    }

    /*
     * Loose catch block
     */
    protected ComponentOrientation k(Container container) {
        ComponentOrientation componentOrientation;
        block13: {
            componentOrientation = null;
            int n10 = T4.b();
            try {
                Object object;
                block12: {
                    block11: {
                        boolean bl;
                        block10: {
                            bl = K;
                            if (n10 == 0) break block10;
                            try {
                                block14: {
                                    if (!bl) break block11;
                                    break block14;
                                    catch (Exception exception) {
                                        throw ix_1.a(exception);
                                    }
                                }
                                h = Class.forName(ix_1.a(-15528, -9712)).getMethod(ix_1.a(-15535, 21006), new Class[0]);
                                bl = false;
                            }
                            catch (Exception exception) {
                                throw ix_1.a(exception);
                            }
                        }
                        K = bl;
                    }
                    object = h;
                    if (n10 == 0) break block12;
                    try {
                        block15: {
                            if (object == null) break block13;
                            break block15;
                            catch (Exception exception) {
                                throw ix_1.a(exception);
                            }
                        }
                        object = h.invoke(container, new Object[0]);
                    }
                    catch (Exception exception) {
                        throw ix_1.a(exception);
                    }
                }
                componentOrientation = (ComponentOrientation)object;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return componentOrientation;
    }

    /*
     * Exception decompiling
     */
    protected int[] i(OU var1_1, int var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    public Dimension preferredLayoutSize(Container container) {
        return this.X(container, -2.0);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.X(container, -3.0);
    }

    protected Dimension X(Container container, double d2) {
        Dimension[] dimensionArray;
        OU[] oUArray;
        block5: {
            int n10;
            oUArray = this.w.toArray(new OU[this.w.size()]);
            int n11 = T4.b();
            int n12 = oUArray.length;
            dimensionArray = new Dimension[n12];
            for (n10 = 0; n10 < n12; ++n10) {
                Dimension dimension;
                block7: {
                    block6: {
                        try {
                            try {
                                if (n11 == 0) break block5;
                                Dimension[] dimensionArray2 = dimensionArray;
                                int n13 = n10;
                                if (d2 != -2.0) break block6;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ix_1.a(illegalArgumentException);
                            }
                            dimension = oUArray[n10].S.getPreferredSize();
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                    }
                    dimension = oUArray[n10].S.getMinimumSize();
                }
                dimensionArray2[n13] = dimension;
                if (n11 != 0) continue;
            }
            n10 = this.b(container, 0, d2, oUArray, dimensionArray);
        }
        int n14 = this.b(container, 1, d2, oUArray, dimensionArray);
        Insets insets = container.getInsets();
        return new Dimension(n10 += insets.left + insets.right, n14 += insets.top + insets.bottom);
    }

    /*
     * Unable to fully structure code
     */
    protected int b(Container var1_1, int var2_2, double var3_3, OU[] var5_4, Dimension[] var6_5) {
        block156: {
            block157: {
                block158: {
                    block159: {
                        block151: {
                            block133: {
                                block131: {
                                    block129: {
                                        block130: {
                                            block127: {
                                                block128: {
                                                    block125: {
                                                        var9_6 = 0;
                                                        var7_7 = T4.O();
                                                        var12_8 = this.I[var2_2].length;
                                                        var13_9 = 1.0;
                                                        var15_10 = 0;
                                                        for (var11_11 = 0; var11_11 < var12_8; ++var11_11) {
                                                            block126: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                cfr_temp_0 = this.I[var2_2][var11_11] - 0.0;
                                                                                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                if (var7_7 != 0) break block125;
                                                                                if (var7_7 != 0) break block126;
                                                                            }
                                                                            catch (IllegalArgumentException v1) {
                                                                                throw ix_1.a(v1);
                                                                            }
                                                                            if (v0 > 0) {
                                                                            }
                                                                            ** GOTO lbl37
                                                                        }
                                                                        catch (IllegalArgumentException v2) {
                                                                            throw ix_1.a(v2);
                                                                        }
                                                                        cfr_temp_1 = this.I[var2_2][var11_11] - 1.0;
                                                                        v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                        if (var7_7 != 0) break block126;
                                                                    }
                                                                    catch (IllegalArgumentException v4) {
                                                                        throw ix_1.a(v4);
                                                                    }
                                                                    if (v3 < 0) {
                                                                    }
                                                                    ** GOTO lbl37
                                                                }
                                                                catch (IllegalArgumentException v5) {
                                                                    throw ix_1.a(v5);
                                                                }
                                                                var13_9 -= this.I[var2_2][var11_11];
                                                                try {
                                                                    if (var7_7 == 0) continue;
lbl37:
                                                                    // 3 sources

                                                                    v3 = (cfr_temp_2 = this.I[var2_2][var11_11] - -1.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                }
                                                                catch (IllegalArgumentException v6) {
                                                                    throw ix_1.a(v6);
                                                                }
                                                            }
                                                            if (v3 != false) continue;
                                                            ++var15_10;
                                                            if (var7_7 == 0) continue;
                                                        }
                                                        v0 = var15_10;
                                                    }
                                                    try {
                                                        if (var7_7 != 0) break block127;
                                                        if (v0 <= true) break block128;
                                                    }
                                                    catch (IllegalArgumentException v7) {
                                                        throw ix_1.a(v7);
                                                    }
                                                    var13_9 /= (double)var15_10;
                                                }
                                                v0 = (cfr_temp_3 = var13_9 - 0.0) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                            }
                                            try {
                                                if (var7_7 != 0) break block129;
                                                if (v0 >= 0) break block130;
                                            }
                                            catch (IllegalArgumentException v8) {
                                                throw ix_1.a(v8);
                                            }
                                            var13_9 = 0.0;
                                        }
                                        this.H[var2_2] = new int[var12_8];
                                        this.G(var2_2, 0);
                                        this.x(var2_2, 0, -3.0);
                                        this.x(var2_2, 0, -2.0);
                                        v0 = var12_8;
                                    }
                                    var16_12 = new int[v0];
                                    for (var11_11 = 0; var11_11 < var12_8; ++var11_11) {
                                        block132: {
                                            try {
                                                try {
                                                    try {
                                                        cfr_temp_4 = this.I[var2_2][var11_11] - -2.0;
                                                        v9 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                        if (var7_7 != 0) break block131;
                                                        if (var7_7 != 0) break block132;
                                                    }
                                                    catch (IllegalArgumentException v10) {
                                                        throw ix_1.a(v10);
                                                    }
                                                    if (v9 != 0) {
                                                    }
                                                    ** GOTO lbl99
                                                }
                                                catch (IllegalArgumentException v11) {
                                                    throw ix_1.a(v11);
                                                }
                                                cfr_temp_5 = this.I[var2_2][var11_11] - -3.0;
                                                v12 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                            }
                                            catch (IllegalArgumentException v13) {
                                                throw ix_1.a(v13);
                                            }
                                        }
                                        try {
                                            if (v12 != false) continue;
lbl99:
                                            // 2 sources

                                            var16_12[var11_11] = this.H[var2_2][var11_11];
                                            continue;
                                        }
                                        catch (IllegalArgumentException v14) {
                                            throw ix_1.a(v14);
                                        }
                                    }
                                    v9 = this.I[0].length;
                                }
                                var17_13 = v9;
                                var18_14 = this.I[1].length;
                                var19_15 = var5_4.length;
                                var20_16 = 0;
                                block112: while (true) {
                                    v15 = var20_16;
                                    block113: while (v15 < var19_15) {
                                        block134: {
                                            block150: {
                                                block149: {
                                                    block148: {
                                                        block144: {
                                                            block139: {
                                                                block140: {
                                                                    block138: {
                                                                        block137: {
                                                                            block136: {
                                                                                block135: {
                                                                                    var21_19 = var5_4[var20_16];
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var7_7 != 0) continue block112;
                                                                                                            v16 = var21_19.x[0];
                                                                                                            if (var7_7 != 0) break block133;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v17) {
                                                                                                            throw ix_1.a(v17);
                                                                                                        }
                                                                                                        if (v16 < 0) break block134;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException v18) {
                                                                                                        throw ix_1.a(v18);
                                                                                                    }
                                                                                                    v19 = var21_19.x[0];
                                                                                                    v20 = var17_13;
                                                                                                    if (var7_7 != 0) break block135;
                                                                                                }
                                                                                                catch (IllegalArgumentException v21) {
                                                                                                    throw ix_1.a(v21);
                                                                                                }
                                                                                                if (v19 >= v20) break block134;
                                                                                            }
                                                                                            catch (IllegalArgumentException v22) {
                                                                                                throw ix_1.a(v22);
                                                                                            }
                                                                                            v19 = var21_19.G[0];
                                                                                            if (var7_7 != 0) break block136;
                                                                                        }
                                                                                        catch (IllegalArgumentException v23) {
                                                                                            throw ix_1.a(v23);
                                                                                        }
                                                                                        v20 = var17_13;
                                                                                    }
                                                                                    catch (IllegalArgumentException v24) {
                                                                                        throw ix_1.a(v24);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v19 >= v20) break block134;
                                                                                    v19 = var21_19.x[1];
                                                                                }
                                                                                catch (IllegalArgumentException v25) {
                                                                                    throw ix_1.a(v25);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var7_7 != 0) break block137;
                                                                                    if (v19 < 0) break block134;
                                                                                }
                                                                                catch (IllegalArgumentException v26) {
                                                                                    throw ix_1.a(v26);
                                                                                }
                                                                                v19 = var21_19.x[1];
                                                                            }
                                                                            catch (IllegalArgumentException v27) {
                                                                                throw ix_1.a(v27);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v28 = var18_14;
                                                                                if (var7_7 != 0) break block138;
                                                                                if (v19 >= v28) break block134;
                                                                            }
                                                                            catch (IllegalArgumentException v29) {
                                                                                throw ix_1.a(v29);
                                                                            }
                                                                            v19 = var21_19.G[1];
                                                                            v28 = var18_14;
                                                                        }
                                                                        catch (IllegalArgumentException v30) {
                                                                            throw ix_1.a(v30);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v19 >= v28 && var7_7 == 0) break block134;
                                                                    }
                                                                    catch (IllegalArgumentException v31) {
                                                                        throw ix_1.a(v31);
                                                                    }
                                                                    var8_17 = var6_5[var20_16];
                                                                    try {
                                                                        try {
                                                                            v32 = var2_2;
                                                                            if (var7_7 != 0) break block139;
                                                                            if (v32 != 0) break block140;
                                                                        }
                                                                        catch (IllegalArgumentException v33) {
                                                                            throw ix_1.a(v33);
                                                                        }
                                                                        v32 = var8_17.width;
                                                                        break block139;
                                                                    }
                                                                    catch (IllegalArgumentException v34) {
                                                                        throw ix_1.a(v34);
                                                                    }
                                                                }
                                                                v32 = var8_17.height;
                                                            }
                                                            var22_20 = v32;
                                                            for (var11_11 = var21_19.x[var2_2]; var11_11 <= var21_19.G[var2_2]; ++var11_11) {
                                                                block142: {
                                                                    block141: {
                                                                        cfr_temp_6 = this.I[var2_2][var11_11] - 1.0;
                                                                        v15 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                                        if (var7_7 != 0) continue block113;
                                                                        try {
                                                                            if (var7_7 != 0) break block141;
                                                                            if (v15 >= 0) {
                                                                            }
                                                                            ** GOTO lbl218
                                                                        }
                                                                        catch (IllegalArgumentException v35) {
                                                                            throw ix_1.a(v35);
                                                                        }
                                                                        var22_20 = (int)((double)var22_20 - this.I[var2_2][var11_11]);
                                                                        try {
                                                                            if (var7_7 == 0) continue;
lbl218:
                                                                            // 2 sources

                                                                            v36 = (cfr_temp_7 = this.I[var2_2][var11_11] - -2.0) == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                                                        }
                                                                        catch (IllegalArgumentException v37) {
                                                                            throw ix_1.a(v37);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block143: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var7_7 != 0) break block142;
                                                                                        if (v36 == false) break block143;
                                                                                    }
                                                                                    catch (IllegalArgumentException v38) {
                                                                                        throw ix_1.a(v38);
                                                                                    }
                                                                                    cfr_temp_8 = this.I[var2_2][var11_11] - -3.0;
                                                                                    v36 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 > 0.0 ? 1 : -1);
                                                                                    if (var7_7 != 0) break block142;
                                                                                }
                                                                                catch (IllegalArgumentException v39) {
                                                                                    throw ix_1.a(v39);
                                                                                }
                                                                                if (v36 != false) continue;
                                                                            }
                                                                            catch (IllegalArgumentException v40) {
                                                                                throw ix_1.a(v40);
                                                                            }
                                                                        }
                                                                        v36 = var22_20 - var16_12[var11_11];
                                                                    }
                                                                    catch (IllegalArgumentException v41) {
                                                                        throw ix_1.a(v41);
                                                                    }
                                                                }
                                                                var22_20 = v36;
                                                                if (var7_7 == 0) continue;
                                                            }
                                                            var23_21 = 0.0;
                                                            for (var11_11 = var21_19.x[var2_2]; var11_11 <= var21_19.G[var2_2]; ++var11_11) {
                                                                block147: {
                                                                    block146: {
                                                                        block145: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            cfr_temp_9 = this.I[var2_2][var11_11] - 0.0;
                                                                                            v42 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                                                                            if (var7_7 != 0) break block144;
                                                                                            if (var7_7 != 0) break block145;
                                                                                        }
                                                                                        catch (IllegalArgumentException v43) {
                                                                                            throw ix_1.a(v43);
                                                                                        }
                                                                                        if (v42 > 0) {
                                                                                        }
                                                                                        ** GOTO lbl282
                                                                                    }
                                                                                    catch (IllegalArgumentException v44) {
                                                                                        throw ix_1.a(v44);
                                                                                    }
                                                                                    cfr_temp_10 = this.I[var2_2][var11_11] - 1.0;
                                                                                    v45 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 < 0.0 ? -1 : 1);
                                                                                    if (var7_7 != 0) break block145;
                                                                                }
                                                                                catch (IllegalArgumentException v46) {
                                                                                    throw ix_1.a(v46);
                                                                                }
                                                                                if (v45 < 0) {
                                                                                }
                                                                                ** GOTO lbl282
                                                                            }
                                                                            catch (IllegalArgumentException v47) {
                                                                                throw ix_1.a(v47);
                                                                            }
                                                                            var23_21 += this.I[var2_2][var11_11];
                                                                            try {
                                                                                if (var7_7 == 0) continue;
lbl282:
                                                                                // 3 sources

                                                                                v45 = (cfr_temp_11 = this.I[var2_2][var11_11] - -1.0) == 0.0 ? 0 : (cfr_temp_11 > 0.0 ? 1 : -1);
                                                                            }
                                                                            catch (IllegalArgumentException v48) {
                                                                                throw ix_1.a(v48);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var7_7 != 0) break block146;
                                                                                    if (v45 != false) continue;
                                                                                }
                                                                                catch (IllegalArgumentException v49) {
                                                                                    throw ix_1.a(v49);
                                                                                }
                                                                                v50 = var13_9;
                                                                                v51 = 0.0;
                                                                                if (var7_7 != 0) break block147;
                                                                            }
                                                                            catch (IllegalArgumentException v52) {
                                                                                throw ix_1.a(v52);
                                                                            }
                                                                            cfr_temp_12 = v50 - v51;
                                                                            v45 = cfr_temp_12 == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                                                                        }
                                                                        catch (IllegalArgumentException v53) {
                                                                            throw ix_1.a(v53);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v45 == false) continue;
                                                                        v50 = var23_21;
                                                                        v51 = var13_9;
                                                                    }
                                                                    catch (IllegalArgumentException v54) {
                                                                        throw ix_1.a(v54);
                                                                    }
                                                                }
                                                                var23_21 = v50 + v51;
                                                                if (var7_7 == 0) continue;
                                                            }
                                                            v42 = (cfr_temp_13 = var23_21 - 0.0) == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1);
                                                        }
                                                        try {
                                                            if (var7_7 != 0) break block148;
                                                            if (v42 == 0) {
                                                            }
                                                            ** GOTO lbl329
                                                        }
                                                        catch (IllegalArgumentException v55) {
                                                            throw ix_1.a(v55);
                                                        }
                                                        var10_18 = (double)false;
                                                        try {
                                                            if (var7_7 == 0) break block149;
lbl329:
                                                            // 2 sources

                                                            v42 = (int)((double)var22_20 / var23_21 + 0.5);
                                                        }
                                                        catch (IllegalArgumentException v56) {
                                                            throw ix_1.a(v56);
                                                        }
                                                    }
                                                    var10_18 = v42;
                                                }
                                                try {
                                                    try {
                                                        v57 = var9_6;
                                                        if (var7_7 != 0) break block150;
                                                        if (v57 >= var10_18) break block134;
                                                    }
                                                    catch (IllegalArgumentException v58) {
                                                        throw ix_1.a(v58);
                                                    }
                                                    v57 = (int)var10_18;
                                                }
                                                catch (IllegalArgumentException v59) {
                                                    throw ix_1.a(v59);
                                                }
                                            }
                                            var9_6 = v57;
                                        }
                                        ++var20_16;
                                        if (var7_7 == 0) continue block112;
                                    }
                                    break;
                                }
                                var20_16 = var9_6;
                                v16 = var11_11 = 0;
                            }
                            while (var11_11 < var12_8) {
                                block153: {
                                    block154: {
                                        block152: {
                                            try {
                                                try {
                                                    cfr_temp_14 = this.I[var2_2][var11_11] - 1.0;
                                                    v60 = cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1);
                                                    if (var7_7 != 0) break block151;
                                                    if (var7_7 != 0) break block152;
                                                }
                                                catch (IllegalArgumentException v61) {
                                                    throw ix_1.a(v61);
                                                }
                                                if (v60 >= 0) {
                                                }
                                                ** GOTO lbl374
                                            }
                                            catch (IllegalArgumentException v62) {
                                                throw ix_1.a(v62);
                                            }
                                            var20_16 += (int)(this.I[var2_2][var11_11] + 0.5);
                                            try {
                                                if (var7_7 == 0) break block153;
lbl374:
                                                // 2 sources

                                                v63 = (cfr_temp_15 = this.I[var2_2][var11_11] - -2.0) == 0.0 ? 0 : (cfr_temp_15 > 0.0 ? 1 : -1);
                                            }
                                            catch (IllegalArgumentException v64) {
                                                throw ix_1.a(v64);
                                            }
                                        }
                                        try {
                                            block155: {
                                                try {
                                                    try {
                                                        try {
                                                            if (var7_7 != 0) break block154;
                                                            if (v63 == false) break block155;
                                                        }
                                                        catch (IllegalArgumentException v65) {
                                                            throw ix_1.a(v65);
                                                        }
                                                        cfr_temp_16 = this.I[var2_2][var11_11] - -3.0;
                                                        v63 = cfr_temp_16 == 0.0 ? 0 : (cfr_temp_16 > 0.0 ? 1 : -1);
                                                        if (var7_7 != 0) break block154;
                                                    }
                                                    catch (IllegalArgumentException v66) {
                                                        throw ix_1.a(v66);
                                                    }
                                                    if (v63 != false) break block153;
                                                }
                                                catch (IllegalArgumentException v67) {
                                                    throw ix_1.a(v67);
                                                }
                                            }
                                            v63 = var20_16 + var16_12[var11_11];
                                        }
                                        catch (IllegalArgumentException v68) {
                                            throw ix_1.a(v68);
                                        }
                                    }
                                    var20_16 = v63;
                                }
                                ++var11_11;
                                if (var7_7 == 0) continue;
                            }
                            v60 = var12_8;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (var7_7 != 0) break block156;
                                        if (v60 <= 0) break block157;
                                    }
                                    catch (IllegalArgumentException v69) {
                                        throw ix_1.a(v69);
                                    }
                                    v70 = var20_16;
                                    v71 = var2_2;
                                    if (var7_7 != 0) break block158;
                                }
                                catch (IllegalArgumentException v72) {
                                    throw ix_1.a(v72);
                                }
                                if (v71 != 0) break block159;
                            }
                            catch (IllegalArgumentException v73) {
                                throw ix_1.a(v73);
                            }
                            v71 = this.q;
                            break block158;
                        }
                        catch (IllegalArgumentException v74) {
                            throw ix_1.a(v74);
                        }
                    }
                    v71 = this.N;
                }
                var20_16 = v70 + v71 * (var12_8 - 1);
            }
            v60 = var20_16;
        }
        return v60;
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
        this.addLayoutComponent(component, string);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void addLayoutComponent(Component var1_1, Object var2_2) {
        block15: {
            block16: {
                block14: {
                    var3_3 = T4.b();
                    try {
                        v0 = var2_2 instanceof String;
                        if (var3_3 == 0) break block14;
                        if (v0) {
                        }
                        ** GOTO lbl17
                    }
                    catch (IllegalArgumentException v1) {
                        throw ix_1.a(v1);
                    }
                    var2_2 = new w4_0((String)var2_2);
                    try {
                        try {
                            this.w.add(new OU(var1_1, (w4_0)var2_2));
                            this.B = true;
                            if (var3_3 != 0) break block15;
lbl17:
                            // 2 sources

                            v2 = var2_2;
                            if (var3_3 == 0) break block16;
                        }
                        catch (IllegalArgumentException v3) {
                            throw ix_1.a(v3);
                        }
                        v0 = v2 instanceof w4_0;
                    }
                    catch (IllegalArgumentException v4) {
                        throw ix_1.a(v4);
                    }
                }
                try {
                    block17: {
                        try {
                            if (!v0) break block17;
                            this.w.add(new OU(var1_1, (w4_0)var2_2));
                            this.B = true;
                            if (var3_3 != 0) break block15;
                        }
                        catch (IllegalArgumentException v5) {
                            throw ix_1.a(v5);
                        }
                    }
                    v2 = var2_2;
                }
                catch (IllegalArgumentException v6) {
                    throw ix_1.a(v6);
                }
            }
            try {
                if (v2 == null) {
                    throw new IllegalArgumentException(ix_1.a(-15539, -29250));
                }
            }
            catch (IllegalArgumentException v7) {
                throw ix_1.a(v7);
            }
            throw new IllegalArgumentException(ix_1.a(-15526, -13249) + var2_2.getClass());
        }
    }

    @Override
    public void removeLayoutComponent(Component component) {
        block5: {
            ListIterator listIterator = this.w.listIterator(0);
            int n10 = T4.b();
            while (listIterator.hasNext()) {
                block6: {
                    OU oU = (OU)listIterator.next();
                    try {
                        try {
                            if (n10 == 0) break block5;
                            if (oU.S != component) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ix_1.a(illegalArgumentException);
                        }
                        listIterator.remove();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ix_1.a(illegalArgumentException);
                    }
                }
                if (n10 != 0) continue;
            }
            this.B = true;
        }
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        return new Dimension(ix_1.a(29226, 762109731313028829L), ix_1.a(20261, 4464891868633150419L));
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public void invalidateLayout(Container container) {
        this.B = true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[26];
                        var11_1 = 0;
                        var10_2 = "\u00ee@v\u00f3\u00da\u00b5;\u00c1\u0099R\u00ael\u00ef\u0086K\u00b5\u00bb\u00d2\u009d\u0084\u00ff\n\u0087el$\u00c1\u009d\u000e\u0001\u00ea\b<nr\u0080\u0016\u00c8/Q@*\u001b\u00b5=\u00a4\u00be\u0006\u00c0\t\nQ\u0097\u00feA\u00dc\u00dfS6\u0016\u00f4\u0091\u00d6\u0097\u00da\u00e1\u00abbgU~\u00bd\u0006\u00a5\u00b0b\u00c2\u00ff[\b\u00a3\u00cc\u001d\u00e0\u00bf\u00b7\f\u00e2J<>y\u00ad\u00ad\u00f4{\u001d\u00d0\u00a1\u00d3\u00d1\u00fd\rO\u00ff\u00f5\u00b4\u00a2\u009e\u00b3~\u00a9\u0002\u00e6/\u00125\u00eft\u0006]\u000f\u00e3\u0003\u00bdZ\u00e4K\u0089\u007fy\u00ba\u008dQ\u0002\u00c4\u0092$n4\u000br\u00e8zk\u000f\\L6\u00b3\u0098\u00fcS\u00ed\u00c7!\u00dc6\u0098r\u00fe\u0098+f\u0005\u008d9em3\u0086\u0017:\u0004\u000eQ%\u0015R\u00ac\u0004\u00e9\u00e7i\\\f5\u00e3-#\u00f0\u0097\u00b5\t\u00a2\u00ea4*x/\u0087\u00ebq[Z\r/\u00bb\u001d\u0017\u00ee|\u00ca/Bw\t\u00a2\u00bb,S\u0003\u00e04\u0007$ \u00de\u00af \u00e1\u00cf\\\u008eu\u00bb&yF\n\u00c4X\u0080\u0089v\u00e2\u0099\u001e\u0000!\u00f4\u00ad\u00aa\u00c3\u0016OO\u0099\u00fd\u001f\u00dc\u00f7|\u00f7\u00c4Uc\u00be\u00a7\u00b7\u0083\b\u001a\u0099K\u00b7\u009c8_\u00c8NL\u00c4\u00e2\u0082\u00a0\u0092\u00cd\u00bf\u0010N\u001b\u00e9\u00df\u00b7\u00fbt\u00dd\u009d\u00b2O\u00ec\u00f4\u00a8\u0094\u0082\u0018\u00c4x\u00c1D\u0093.iPe\u0018+\u00be\u00f2>\u0098\u00b0\u0001\u0091\u0088\u00a3\n5\u00c0\u00dc\u00a6\nb\u000e\u008d\u00b4=>\u0010\u00eb\u00f8K(\u00f8\u00ab6\u009e0\u00d9\u0094\u0002;\u00bd?H\u001b\u00a2K\u0080\"\u009cVlW\u00a5\u00cb6\u009d\u00edu\u0007\u00d2U,?\u00b8/bQ\u00ee\u00f2\u00a8\u0004iA\u00bc\u0017\u008a\u00c7-\u00a5u\u0011\u0088Vw\u00ae\u00f4-\u0091\u00f9&\u0010mh*`\u00b5B\u00ea\u001d\t\u0007\u008a\u001bE\u00a8\u00c8b\u00e7&~\u0085\u00013\u009fd:i\u00c0\u001a\u00e8\u001d\u0001\u00e8<\u0015`\u000f\u00d3\u0002I\u0002\u0004\u00acp\u00e4\u000b\u001f\u0097l\u00d6\u00bb\u00d4\u00f5\u00bf\u00b2\u00eeN_\u00af8\u00a2@iSXg\u00a4\u00a7\n(\u0089\u00b0\u0086Z\u0014w9\u00d0%\u00c7\n\u00e1M\u00c0X\u00d1m&\u00b0\u00fa\u00f8\u00f4\u008f\u00ca`7}P\u009dQ!\u00f7\u00b6%e\u001e\u00e6\u0094:\u009f\u0082\u00c9\u000e\u00fa\u008f\u0003\u0004\u0016\t\u00b3$\u0002\u0017\u00ce\u001c*\u00ed\u00eeF\u00c9\u0003Y\u0017\u00d5\u00882\u001f\u00c6\u0095\u0081\u0081\u00d2\u00c4\u00d3\u00ac\f\u00d6\u00b6W\u00a6\u00fe\u00f8\u00bc\u001ciL\u0086r\u00c4\u0085\u00f8\u00c7\u00e1\u0092\u00a5\\\u001c\u00fd\u00a2\u008c\u00b6e_\u0098\u009dP\u0084\u0087\u00e0\u00e40\u00ff$}\u00d8\u0004\u00e0\u0094\u00d7\u00f2\u008d\u00a0\u00db\u0097]\u0015\u00a0\u0014qPJ\u00e0\u0097Phr)\u00d2\u00ad\u0016\u00ac\u00f4'\u00b5\u00cc\u00d7\u00f6\u000f\u0093%\u00b2(O\t\u0015\u00d0k|q\u0092\u0010\u00bc\u00a9\u0007aqB_\u00fe\u00d9\u0084\u00a9M\u00a7rG\u00f4\u00a2\u00c9\u00b24\u0093\u00bc,T\u00cb\u00d6";
                        var12_3 = "\u00ee@v\u00f3\u00da\u00b5;\u00c1\u0099R\u00ael\u00ef\u0086K\u00b5\u00bb\u00d2\u009d\u0084\u00ff\n\u0087el$\u00c1\u009d\u000e\u0001\u00ea\b<nr\u0080\u0016\u00c8/Q@*\u001b\u00b5=\u00a4\u00be\u0006\u00c0\t\nQ\u0097\u00feA\u00dc\u00dfS6\u0016\u00f4\u0091\u00d6\u0097\u00da\u00e1\u00abbgU~\u00bd\u0006\u00a5\u00b0b\u00c2\u00ff[\b\u00a3\u00cc\u001d\u00e0\u00bf\u00b7\f\u00e2J<>y\u00ad\u00ad\u00f4{\u001d\u00d0\u00a1\u00d3\u00d1\u00fd\rO\u00ff\u00f5\u00b4\u00a2\u009e\u00b3~\u00a9\u0002\u00e6/\u00125\u00eft\u0006]\u000f\u00e3\u0003\u00bdZ\u00e4K\u0089\u007fy\u00ba\u008dQ\u0002\u00c4\u0092$n4\u000br\u00e8zk\u000f\\L6\u00b3\u0098\u00fcS\u00ed\u00c7!\u00dc6\u0098r\u00fe\u0098+f\u0005\u008d9em3\u0086\u0017:\u0004\u000eQ%\u0015R\u00ac\u0004\u00e9\u00e7i\\\f5\u00e3-#\u00f0\u0097\u00b5\t\u00a2\u00ea4*x/\u0087\u00ebq[Z\r/\u00bb\u001d\u0017\u00ee|\u00ca/Bw\t\u00a2\u00bb,S\u0003\u00e04\u0007$ \u00de\u00af \u00e1\u00cf\\\u008eu\u00bb&yF\n\u00c4X\u0080\u0089v\u00e2\u0099\u001e\u0000!\u00f4\u00ad\u00aa\u00c3\u0016OO\u0099\u00fd\u001f\u00dc\u00f7|\u00f7\u00c4Uc\u00be\u00a7\u00b7\u0083\b\u001a\u0099K\u00b7\u009c8_\u00c8NL\u00c4\u00e2\u0082\u00a0\u0092\u00cd\u00bf\u0010N\u001b\u00e9\u00df\u00b7\u00fbt\u00dd\u009d\u00b2O\u00ec\u00f4\u00a8\u0094\u0082\u0018\u00c4x\u00c1D\u0093.iPe\u0018+\u00be\u00f2>\u0098\u00b0\u0001\u0091\u0088\u00a3\n5\u00c0\u00dc\u00a6\nb\u000e\u008d\u00b4=>\u0010\u00eb\u00f8K(\u00f8\u00ab6\u009e0\u00d9\u0094\u0002;\u00bd?H\u001b\u00a2K\u0080\"\u009cVlW\u00a5\u00cb6\u009d\u00edu\u0007\u00d2U,?\u00b8/bQ\u00ee\u00f2\u00a8\u0004iA\u00bc\u0017\u008a\u00c7-\u00a5u\u0011\u0088Vw\u00ae\u00f4-\u0091\u00f9&\u0010mh*`\u00b5B\u00ea\u001d\t\u0007\u008a\u001bE\u00a8\u00c8b\u00e7&~\u0085\u00013\u009fd:i\u00c0\u001a\u00e8\u001d\u0001\u00e8<\u0015`\u000f\u00d3\u0002I\u0002\u0004\u00acp\u00e4\u000b\u001f\u0097l\u00d6\u00bb\u00d4\u00f5\u00bf\u00b2\u00eeN_\u00af8\u00a2@iSXg\u00a4\u00a7\n(\u0089\u00b0\u0086Z\u0014w9\u00d0%\u00c7\n\u00e1M\u00c0X\u00d1m&\u00b0\u00fa\u00f8\u00f4\u008f\u00ca`7}P\u009dQ!\u00f7\u00b6%e\u001e\u00e6\u0094:\u009f\u0082\u00c9\u000e\u00fa\u008f\u0003\u0004\u0016\t\u00b3$\u0002\u0017\u00ce\u001c*\u00ed\u00eeF\u00c9\u0003Y\u0017\u00d5\u00882\u001f\u00c6\u0095\u0081\u0081\u00d2\u00c4\u00d3\u00ac\f\u00d6\u00b6W\u00a6\u00fe\u00f8\u00bc\u001ciL\u0086r\u00c4\u0085\u00f8\u00c7\u00e1\u0092\u00a5\\\u001c\u00fd\u00a2\u008c\u00b6e_\u0098\u009dP\u0084\u0087\u00e0\u00e40\u00ff$}\u00d8\u0004\u00e0\u0094\u00d7\u00f2\u008d\u00a0\u00db\u0097]\u0015\u00a0\u0014qPJ\u00e0\u0097Phr)\u00d2\u00ad\u0016\u00ac\u00f4'\u00b5\u00cc\u00d7\u00f6\u000f\u0093%\u00b2(O\t\u0015\u00d0k|q\u0092\u0010\u00bc\u00a9\u0007aqB_\u00fe\u00d9\u0084\u00a9M\u00a7rG\u00f4\u00a2\u00c9\u00b24\u0093\u00bc,T\u00cb\u00d6".length();
                        var9_4 = 36;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 45;
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
                            var10_2 = "\u008a\u00f6\u0002) ";
                            var12_3 = "\u008a\u00f6\u0002) ".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 83;
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
                                    v15 = 123;
                                    break;
                                }
                                case 1: {
                                    v15 = 112;
                                    break;
                                }
                                case 2: {
                                    v15 = 100;
                                    break;
                                }
                                case 3: {
                                    v15 = 81;
                                    break;
                                }
                                case 4: {
                                    v15 = 65;
                                    break;
                                }
                                case 5: {
                                    v15 = 65;
                                    break;
                                }
                                default: {
                                    v15 = 116;
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
                ix_1.a = var13;
                ix_1.b = new String[26];
                var0_7 = 2194470055122740507L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "-\u008b\u00ae%\u0088E\u00e97\u00c2}\u0096GP\u00e5T9";
                var5_11 = "-\u008b\u00ae%\u0088E\u00e97\u00c2}\u0096GP\u00e5T9".length();
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
        ix_1.c = var6_8;
        ix_1.d = new Integer[2];
        ix_1.e = new double[][]{new double[0], new double[0]};
        ix_1.K = true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFC35D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 231;
                    break;
                }
                case 1: {
                    n14 = 45;
                    break;
                }
                case 2: {
                    n14 = 150;
                    break;
                }
                case 3: {
                    n14 = 137;
                    break;
                }
                case 4: {
                    n14 = 251;
                    break;
                }
                case 5: {
                    n14 = 186;
                    break;
                }
                case 6: {
                    n14 = 3;
                    break;
                }
                case 7: {
                    n14 = 136;
                    break;
                }
                case 8: {
                    n14 = 223;
                    break;
                }
                case 9: {
                    n14 = 54;
                    break;
                }
                case 10: {
                    n14 = 109;
                    break;
                }
                case 11: {
                    n14 = 40;
                    break;
                }
                case 12: {
                    n14 = 55;
                    break;
                }
                case 13: {
                    n14 = 199;
                    break;
                }
                case 14: {
                    n14 = 12;
                    break;
                }
                case 15: {
                    n14 = 198;
                    break;
                }
                case 16: {
                    n14 = 225;
                    break;
                }
                case 17: {
                    n14 = 124;
                    break;
                }
                case 18: {
                    n14 = 182;
                    break;
                }
                case 19: {
                    n14 = 71;
                    break;
                }
                case 20: {
                    n14 = 116;
                    break;
                }
                case 21: {
                    n14 = 127;
                    break;
                }
                case 22: {
                    n14 = 191;
                    break;
                }
                case 23: {
                    n14 = 250;
                    break;
                }
                case 24: {
                    n14 = 176;
                    break;
                }
                case 25: {
                    n14 = 247;
                    break;
                }
                case 26: {
                    n14 = 179;
                    break;
                }
                case 27: {
                    n14 = 87;
                    break;
                }
                case 28: {
                    n14 = 249;
                    break;
                }
                case 29: {
                    n14 = 67;
                    break;
                }
                case 30: {
                    n14 = 168;
                    break;
                }
                case 31: {
                    n14 = 227;
                    break;
                }
                case 32: {
                    n14 = 141;
                    break;
                }
                case 33: {
                    n14 = 48;
                    break;
                }
                case 34: {
                    n14 = 221;
                    break;
                }
                case 35: {
                    n14 = 162;
                    break;
                }
                case 36: {
                    n14 = 129;
                    break;
                }
                case 37: {
                    n14 = 41;
                    break;
                }
                case 38: {
                    n14 = 161;
                    break;
                }
                case 39: {
                    n14 = 197;
                    break;
                }
                case 40: {
                    n14 = 128;
                    break;
                }
                case 41: {
                    n14 = 166;
                    break;
                }
                case 42: {
                    n14 = 99;
                    break;
                }
                case 43: {
                    n14 = 28;
                    break;
                }
                case 44: {
                    n14 = 158;
                    break;
                }
                case 45: {
                    n14 = 203;
                    break;
                }
                case 46: {
                    n14 = 181;
                    break;
                }
                case 47: {
                    n14 = 224;
                    break;
                }
                case 48: {
                    n14 = 78;
                    break;
                }
                case 49: {
                    n14 = 135;
                    break;
                }
                case 50: {
                    n14 = 115;
                    break;
                }
                case 51: {
                    n14 = 159;
                    break;
                }
                case 52: {
                    n14 = 30;
                    break;
                }
                case 53: {
                    n14 = 154;
                    break;
                }
                case 54: {
                    n14 = 234;
                    break;
                }
                case 55: {
                    n14 = 132;
                    break;
                }
                case 56: {
                    n14 = 196;
                    break;
                }
                case 57: {
                    n14 = 100;
                    break;
                }
                case 58: {
                    n14 = 148;
                    break;
                }
                case 59: {
                    n14 = 86;
                    break;
                }
                case 60: {
                    n14 = 88;
                    break;
                }
                case 61: {
                    n14 = 184;
                    break;
                }
                case 62: {
                    n14 = 236;
                    break;
                }
                case 63: {
                    n14 = 205;
                    break;
                }
                case 64: {
                    n14 = 106;
                    break;
                }
                case 65: {
                    n14 = 228;
                    break;
                }
                case 66: {
                    n14 = 244;
                    break;
                }
                case 67: {
                    n14 = 157;
                    break;
                }
                case 68: {
                    n14 = 126;
                    break;
                }
                case 69: {
                    n14 = 44;
                    break;
                }
                case 70: {
                    n14 = 9;
                    break;
                }
                case 71: {
                    n14 = 32;
                    break;
                }
                case 72: {
                    n14 = 232;
                    break;
                }
                case 73: {
                    n14 = 79;
                    break;
                }
                case 74: {
                    n14 = 121;
                    break;
                }
                case 75: {
                    n14 = 226;
                    break;
                }
                case 76: {
                    n14 = 34;
                    break;
                }
                case 77: {
                    n14 = 29;
                    break;
                }
                case 78: {
                    n14 = 188;
                    break;
                }
                case 79: {
                    n14 = 56;
                    break;
                }
                case 80: {
                    n14 = 175;
                    break;
                }
                case 81: {
                    n14 = 131;
                    break;
                }
                case 82: {
                    n14 = 59;
                    break;
                }
                case 83: {
                    n14 = 218;
                    break;
                }
                case 84: {
                    n14 = 167;
                    break;
                }
                case 85: {
                    n14 = 26;
                    break;
                }
                case 86: {
                    n14 = 206;
                    break;
                }
                case 87: {
                    n14 = 253;
                    break;
                }
                case 88: {
                    n14 = 195;
                    break;
                }
                case 89: {
                    n14 = 187;
                    break;
                }
                case 90: {
                    n14 = 133;
                    break;
                }
                case 91: {
                    n14 = 94;
                    break;
                }
                case 92: {
                    n14 = 51;
                    break;
                }
                case 93: {
                    n14 = 208;
                    break;
                }
                case 94: {
                    n14 = 114;
                    break;
                }
                case 95: {
                    n14 = 172;
                    break;
                }
                case 96: {
                    n14 = 93;
                    break;
                }
                case 97: {
                    n14 = 43;
                    break;
                }
                case 98: {
                    n14 = 68;
                    break;
                }
                case 99: {
                    n14 = 7;
                    break;
                }
                case 100: {
                    n14 = 194;
                    break;
                }
                case 101: {
                    n14 = 204;
                    break;
                }
                case 102: {
                    n14 = 122;
                    break;
                }
                case 103: {
                    n14 = 163;
                    break;
                }
                case 104: {
                    n14 = 185;
                    break;
                }
                case 105: {
                    n14 = 142;
                    break;
                }
                case 106: {
                    n14 = 207;
                    break;
                }
                case 107: {
                    n14 = 245;
                    break;
                }
                case 108: {
                    n14 = 239;
                    break;
                }
                case 109: {
                    n14 = 38;
                    break;
                }
                case 110: {
                    n14 = 178;
                    break;
                }
                case 111: {
                    n14 = 80;
                    break;
                }
                case 112: {
                    n14 = 65;
                    break;
                }
                case 113: {
                    n14 = 0;
                    break;
                }
                case 114: {
                    n14 = 117;
                    break;
                }
                case 115: {
                    n14 = 50;
                    break;
                }
                case 116: {
                    n14 = 169;
                    break;
                }
                case 117: {
                    n14 = 75;
                    break;
                }
                case 118: {
                    n14 = 89;
                    break;
                }
                case 119: {
                    n14 = 1;
                    break;
                }
                case 120: {
                    n14 = 164;
                    break;
                }
                case 121: {
                    n14 = 216;
                    break;
                }
                case 122: {
                    n14 = 211;
                    break;
                }
                case 123: {
                    n14 = 107;
                    break;
                }
                case 124: {
                    n14 = 156;
                    break;
                }
                case 125: {
                    n14 = 215;
                    break;
                }
                case 126: {
                    n14 = 85;
                    break;
                }
                case 127: {
                    n14 = 2;
                    break;
                }
                case 128: {
                    n14 = 242;
                    break;
                }
                case 129: {
                    n14 = 110;
                    break;
                }
                case 130: {
                    n14 = 81;
                    break;
                }
                case 131: {
                    n14 = 49;
                    break;
                }
                case 132: {
                    n14 = 220;
                    break;
                }
                case 133: {
                    n14 = 102;
                    break;
                }
                case 134: {
                    n14 = 77;
                    break;
                }
                case 135: {
                    n14 = 97;
                    break;
                }
                case 136: {
                    n14 = 52;
                    break;
                }
                case 137: {
                    n14 = 138;
                    break;
                }
                case 138: {
                    n14 = 222;
                    break;
                }
                case 139: {
                    n14 = 149;
                    break;
                }
                case 140: {
                    n14 = 46;
                    break;
                }
                case 141: {
                    n14 = 84;
                    break;
                }
                case 142: {
                    n14 = 76;
                    break;
                }
                case 143: {
                    n14 = 118;
                    break;
                }
                case 144: {
                    n14 = 151;
                    break;
                }
                case 145: {
                    n14 = 33;
                    break;
                }
                case 146: {
                    n14 = 238;
                    break;
                }
                case 147: {
                    n14 = 58;
                    break;
                }
                case 148: {
                    n14 = 61;
                    break;
                }
                case 149: {
                    n14 = 229;
                    break;
                }
                case 150: {
                    n14 = 112;
                    break;
                }
                case 151: {
                    n14 = 62;
                    break;
                }
                case 152: {
                    n14 = 246;
                    break;
                }
                case 153: {
                    n14 = 212;
                    break;
                }
                case 154: {
                    n14 = 35;
                    break;
                }
                case 155: {
                    n14 = 91;
                    break;
                }
                case 156: {
                    n14 = 92;
                    break;
                }
                case 157: {
                    n14 = 177;
                    break;
                }
                case 158: {
                    n14 = 200;
                    break;
                }
                case 159: {
                    n14 = 72;
                    break;
                }
                case 160: {
                    n14 = 144;
                    break;
                }
                case 161: {
                    n14 = 74;
                    break;
                }
                case 162: {
                    n14 = 108;
                    break;
                }
                case 163: {
                    n14 = 252;
                    break;
                }
                case 164: {
                    n14 = 104;
                    break;
                }
                case 165: {
                    n14 = 240;
                    break;
                }
                case 166: {
                    n14 = 170;
                    break;
                }
                case 167: {
                    n14 = 20;
                    break;
                }
                case 168: {
                    n14 = 209;
                    break;
                }
                case 169: {
                    n14 = 15;
                    break;
                }
                case 170: {
                    n14 = 119;
                    break;
                }
                case 171: {
                    n14 = 155;
                    break;
                }
                case 172: {
                    n14 = 66;
                    break;
                }
                case 173: {
                    n14 = 217;
                    break;
                }
                case 174: {
                    n14 = 202;
                    break;
                }
                case 175: {
                    n14 = 14;
                    break;
                }
                case 176: {
                    n14 = 70;
                    break;
                }
                case 177: {
                    n14 = 69;
                    break;
                }
                case 178: {
                    n14 = 53;
                    break;
                }
                case 179: {
                    n14 = 98;
                    break;
                }
                case 180: {
                    n14 = 254;
                    break;
                }
                case 181: {
                    n14 = 193;
                    break;
                }
                case 182: {
                    n14 = 31;
                    break;
                }
                case 183: {
                    n14 = 192;
                    break;
                }
                case 184: {
                    n14 = 39;
                    break;
                }
                case 185: {
                    n14 = 42;
                    break;
                }
                case 186: {
                    n14 = 173;
                    break;
                }
                case 187: {
                    n14 = 113;
                    break;
                }
                case 188: {
                    n14 = 17;
                    break;
                }
                case 189: {
                    n14 = 23;
                    break;
                }
                case 190: {
                    n14 = 18;
                    break;
                }
                case 191: {
                    n14 = 213;
                    break;
                }
                case 192: {
                    n14 = 90;
                    break;
                }
                case 193: {
                    n14 = 47;
                    break;
                }
                case 194: {
                    n14 = 183;
                    break;
                }
                case 195: {
                    n14 = 25;
                    break;
                }
                case 196: {
                    n14 = 241;
                    break;
                }
                case 197: {
                    n14 = 235;
                    break;
                }
                case 198: {
                    n14 = 13;
                    break;
                }
                case 199: {
                    n14 = 11;
                    break;
                }
                case 200: {
                    n14 = 210;
                    break;
                }
                case 201: {
                    n14 = 120;
                    break;
                }
                case 202: {
                    n14 = 103;
                    break;
                }
                case 203: {
                    n14 = 174;
                    break;
                }
                case 204: {
                    n14 = 96;
                    break;
                }
                case 205: {
                    n14 = 160;
                    break;
                }
                case 206: {
                    n14 = 82;
                    break;
                }
                case 207: {
                    n14 = 10;
                    break;
                }
                case 208: {
                    n14 = 95;
                    break;
                }
                case 209: {
                    n14 = 134;
                    break;
                }
                case 210: {
                    n14 = 230;
                    break;
                }
                case 211: {
                    n14 = 165;
                    break;
                }
                case 212: {
                    n14 = 147;
                    break;
                }
                case 213: {
                    n14 = 139;
                    break;
                }
                case 214: {
                    n14 = 63;
                    break;
                }
                case 215: {
                    n14 = 146;
                    break;
                }
                case 216: {
                    n14 = 130;
                    break;
                }
                case 217: {
                    n14 = 123;
                    break;
                }
                case 218: {
                    n14 = 64;
                    break;
                }
                case 219: {
                    n14 = 73;
                    break;
                }
                case 220: {
                    n14 = 83;
                    break;
                }
                case 221: {
                    n14 = 153;
                    break;
                }
                case 222: {
                    n14 = 101;
                    break;
                }
                case 223: {
                    n14 = 140;
                    break;
                }
                case 224: {
                    n14 = 4;
                    break;
                }
                case 225: {
                    n14 = 189;
                    break;
                }
                case 226: {
                    n14 = 19;
                    break;
                }
                case 227: {
                    n14 = 233;
                    break;
                }
                case 228: {
                    n14 = 36;
                    break;
                }
                case 229: {
                    n14 = 214;
                    break;
                }
                case 230: {
                    n14 = 219;
                    break;
                }
                case 231: {
                    n14 = 105;
                    break;
                }
                case 232: {
                    n14 = 8;
                    break;
                }
                case 233: {
                    n14 = 57;
                    break;
                }
                case 234: {
                    n14 = 152;
                    break;
                }
                case 235: {
                    n14 = 5;
                    break;
                }
                case 236: {
                    n14 = 24;
                    break;
                }
                case 237: {
                    n14 = 125;
                    break;
                }
                case 238: {
                    n14 = 16;
                    break;
                }
                case 239: {
                    n14 = 145;
                    break;
                }
                case 240: {
                    n14 = 111;
                    break;
                }
                case 241: {
                    n14 = 237;
                    break;
                }
                case 242: {
                    n14 = 21;
                    break;
                }
                case 243: {
                    n14 = 180;
                    break;
                }
                case 244: {
                    n14 = 27;
                    break;
                }
                case 245: {
                    n14 = 201;
                    break;
                }
                case 246: {
                    n14 = 60;
                    break;
                }
                case 247: {
                    n14 = 143;
                    break;
                }
                case 248: {
                    n14 = 255;
                    break;
                }
                case 249: {
                    n14 = 171;
                    break;
                }
                case 250: {
                    n14 = 6;
                    break;
                }
                case 251: {
                    n14 = 243;
                    break;
                }
                case 252: {
                    n14 = 248;
                    break;
                }
                case 253: {
                    n14 = 22;
                    break;
                }
                case 254: {
                    n14 = 37;
                    break;
                }
                default: {
                    n14 = 190;
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
            ix_1.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CF6;
        if (d[n11] == null) {
            ix_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

