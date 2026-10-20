/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;

/*
 * Renamed from Vg
 */
public class vg_0 {
    boolean W;
    ArrayList m;
    z7 k;

    public vg_0() {
        this.W = true;
        this.m = new ArrayList();
    }

    public void Z(String string) {
        ((ArrayList)this.m).add(string);
    }

    public ArrayList Q() {
        return (ArrayList)this.m;
    }

    public boolean x() {
        return this.W;
    }

    public void j(boolean bl) {
        this.W = bl;
    }

    public z7 G() {
        return (z7)this.k;
    }

    public void n(z7 z72) {
        this.k = z72;
    }
}

