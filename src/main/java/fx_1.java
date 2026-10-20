/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;

/*
 * Renamed from fX
 */
public class fx_1 {
    ArrayList O;

    fx_1() {
        this.O = new ArrayList();
    }

    public boolean C(String string) {
        boolean bl = false;
        bl = ((ArrayList)this.O).contains(string);
        return bl;
    }

    public int i() {
        return ((ArrayList)this.O).size();
    }

    public void f(String string) {
        ((ArrayList)this.O).remove(string);
        ((ArrayList)this.O).add(0, string);
    }

    public void o(String string) {
        ((ArrayList)this.O).remove(string);
    }

    public void F(String string) {
        ((ArrayList)this.O).add(string);
    }

    public ArrayList x() {
        return (ArrayList)this.O;
    }

    public void K(ArrayList arrayList) {
        this.O = arrayList;
    }
}

