/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import org.pcap4j.packet.LengthBuilder;

/*
 * Renamed from bB
 */
public final class bb_1
implements LengthBuilder {
    private byte v;
    private boolean C;
    private List O;

    public bb_1() {
    }

    private bb_1(fi_0 fi_02) {
        this.v = fi_0.j(fi_02);
    }

    public bb_1 u(byte by) {
        this.v = by;
        return this;
    }

    public bb_1 E(List list) {
        this.O = list;
        return this;
    }

    public bb_1 a(boolean bl) {
        this.C = bl;
        return this;
    }

    public fi_0 D() {
        return new fi_0(this, null);
    }

    public Object build() {
        return this.D();
    }

    public LengthBuilder correctLengthAtBuild(boolean bl) {
        return this.a(bl);
    }

    static List B(bb_1 bb_12) {
        return bb_12.O;
    }

    static boolean t(bb_1 bb_12) {
        return bb_12.C;
    }

    static byte A(bb_1 bb_12) {
        return bb_12.v;
    }

    bb_1(fi_0 fi_02, bb_1 bb_12) {
        this(fi_02);
    }
}

