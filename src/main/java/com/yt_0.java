/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;

/*
 * Renamed from com.Yt
 */
public class yt_0 {
    private String g;
    private String j;
    private String N;
    private String R;
    private static int l;

    public yt_0() {
    }

    public yt_0(String string, String string2, String string3, String string4) {
        this.g = string;
        this.j = string2;
        int n10 = yt_0.L();
        this.N = string3;
        this.R = string4;
        if (n10 != 0) {
            ky_2.K(new String[1]);
        }
    }

    public String h() {
        return this.g;
    }

    public void p(String string) {
        this.g = string;
    }

    public String U() {
        return this.j;
    }

    public void e(String string) {
        this.j = string;
    }

    public String Q() {
        return this.N;
    }

    public void v(String string) {
        this.N = string;
    }

    public String b() {
        return this.R;
    }

    public void b(String string) {
        this.R = string;
    }

    public static void A(int n10) {
        l = n10;
    }

    public static int C() {
        return l;
    }

    public static int L() {
        int n10 = yt_0.C();
        if (n10 == 0) {
            return 51;
        }
        return 0;
    }

    static {
        if (yt_0.C() == 0) {
            yt_0.A(108);
        }
    }
}

