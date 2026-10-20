/*
 * Decompiled with CFR 0.152.
 */
import java.util.EventObject;

public class TX
extends EventObject {
    private final int N;
    private final boolean l;
    private final boolean P;

    public TX(xJ xJ2, int n10, boolean bl, boolean bl2) {
        super(xJ2);
        this.N = n10;
        this.l = bl2;
        this.P = bl;
    }

    public int C() {
        return this.N;
    }

    public boolean H() {
        return this.l;
    }

    public boolean O() {
        return this.P;
    }
}

