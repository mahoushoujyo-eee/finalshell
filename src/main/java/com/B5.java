/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.pi_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Point;

@XStreamAlias(value="Line")
public class B5 {
    @XStreamAsAttribute
    public int L;
    @XStreamAsAttribute
    public int I;
    @XStreamAsAttribute
    public int z;
    @XStreamAsAttribute
    public int A;

    public B5() {
    }

    public B5(int n10, int n11, int n12, int n13) {
        this.L = n10;
        this.I = n11;
        this.z = n12;
        this.A = n13;
    }

    public B5(Point point, Point point2) {
        String[] stringArray = pi_1.v();
        this.L = point.x;
        this.I = point.y;
        String[] stringArray2 = stringArray;
        this.z = point2.x;
        this.A = point2.y;
        if (ky_2.F() != null) {
            pi_1.t(new String[5]);
        }
    }

    public B5(B5 b5) {
        this.L = b5.L;
        this.I = b5.I;
        this.z = b5.z;
        String[] stringArray = pi_1.v();
        this.A = b5.A;
        if (stringArray != null) {
            ky_2.K(new String[5]);
        }
    }

    public double r() {
        return this.L;
    }

    public void R(int n10) {
        this.L = n10;
    }

    public double Q() {
        return this.I;
    }

    public void Z(int n10) {
        this.I = n10;
    }

    public double e() {
        return this.z;
    }

    public void d(int n10) {
        this.z = n10;
    }

    public double b() {
        return this.A;
    }

    public void r(int n10) {
        this.A = n10;
    }

    public void H(Point point) {
        this.L = point.x;
        this.I = point.y;
    }

    public void g(Point point) {
        this.z = point.x;
        this.A = point.y;
    }
}

