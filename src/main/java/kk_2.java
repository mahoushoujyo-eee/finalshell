/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import org.icmp4j.j;

/*
 * Renamed from kk
 */
class kk_2
implements Q0 {
    final j c;
    final int Z;
    final dw_2 b;

    kk_2(dw_2 dw_22, j j2, int n10) {
        this.b = dw_22;
        this.c = j2;
        this.Z = n10;
    }

    @Override
    public void a(B0 b0) {
        j j2 = b0.w();
        ((j)this.c).i(System.currentTimeMillis());
        ((j)this.c).w((int)(((j)this.c).q() - ((j)this.c).R()));
        ((j)this.c).S(j2.A());
        ((j)this.c).q(j2.H());
        ((j)this.c).a(this.Z);
        ((j)this.c).v(true);
    }
}

