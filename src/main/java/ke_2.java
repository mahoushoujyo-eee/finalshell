/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/*
 * Renamed from ke
 */
public class ke_2 {
    private InputStream K;
    private OutputStream Z;
    boolean S = true;

    public ke_2(InputStream inputStream, OutputStream outputStream) {
        this.K = inputStream;
        this.Z = outputStream;
    }

    public void G(FY fY2) throws IOException {
        Q8 q8 = new Q8(this, fY2, this.K, this.Z);
        q8.o();
        this.Z.flush();
    }

    public void N(Map map) throws IOException {
        DH dH = new DH(this, map, this.K, this.Z);
        dH.k();
        this.Z.flush();
    }

    public void g() {
        this.S = false;
    }

    public boolean J() {
        int n10 = to_0.L();
        boolean bl = this.S;
        if (n10 != 0) {
            bl = !bl;
        }
        return bl;
    }
}

