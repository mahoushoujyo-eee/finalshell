/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;

public class BR {
    InetSocketAddress m;
    InetSocketAddress a;

    BR(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        this.m = inetSocketAddress;
        this.a = inetSocketAddress2;
    }

    public InetSocketAddress B() {
        return this.m;
    }

    public void F(InetSocketAddress inetSocketAddress) {
        this.m = inetSocketAddress;
    }

    public InetSocketAddress v() {
        return this.a;
    }

    public void j(InetSocketAddress inetSocketAddress) {
        this.a = inetSocketAddress;
    }
}

