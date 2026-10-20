/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E;
import com.rk_2;

public class _1 {
    private rk_2 n;
    private int o;
    private int f;
    private E l;

    public _1() {
        this.n = rk_2.fill;
    }

    public _1(int n10, int n11) {
        this.n = rk_2.align;
        this.o = n10;
        this.f = n11;
    }

    public _1(E e2) {
        this.n = rk_2.custom;
        this.l = e2;
    }

    public _1(rk_2 rk_22, int n10, int n11, E e2) {
        this.n = rk_22;
        this.o = n10;
        this.f = n11;
        this.l = e2;
    }

    public rk_2 c() {
        return this.n;
    }

    public void Q(rk_2 rk_22) {
        this.n = rk_22;
    }

    public int r() {
        return this.o;
    }

    public void l(int n10) {
        this.o = n10;
    }

    public int X() {
        return this.f;
    }

    public void G(int n10) {
        this.f = n10;
    }

    public E Q() {
        return this.l;
    }

    public void a(E e2) {
        this.l = e2;
    }
}

