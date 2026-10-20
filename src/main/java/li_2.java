/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from li
 */
public class li_2
extends ln_2 {
    static Random H;
    ArrayList z;

    public li_2() {
        this.z = new ArrayList();
    }

    public void w(lj_2 lj_22) {
        Iterator iterator = ((ArrayList)this.z).iterator();
        int[] nArray = yb_1.Y();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    lj_2 lj_23 = (lj_2)iterator.next();
                    boolean bl = lj_22.equals(lj_23);
                    if (nArray != null) break block3;
                    if (!bl) break block4;
                    bl = ((ArrayList)this.z).remove(lj_22);
                }
                if (nArray == null) break;
            }
            if (nArray == null) continue;
        }
    }

    public ArrayList Z() {
        return (ArrayList)this.z;
    }

    public void m(ArrayList arrayList) {
        this.z = arrayList;
    }

    @Override
    public ln_2 B() {
        li_2 li_22 = new li_2();
        return li_22;
    }

    static {
        li_2.H = new Random();
    }
}

