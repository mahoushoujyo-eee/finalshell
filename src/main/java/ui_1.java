/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from uI
 */
public class ui_1 {
    String v;
    private long J;
    private long X;
    long y;
    long l;
    long C;
    long G;
    public ArrayList e;
    public ArrayList O;
    int d;
    private static final long a;

    public ui_1() {
        this.e = new ArrayList();
        this.O = new ArrayList();
        this.d = (int)a;
    }

    public void t() {
        ((ArrayList)this.e).clear();
        ((ArrayList)this.O).clear();
    }

    public long O() {
        return this.J;
    }

    public synchronized void e(long l2) {
        String[] stringArray = KV.b();
        this.J = l2;
        ((ArrayList)this.e).add(this.J);
        String[] stringArray2 = stringArray;
        ArrayList arrayList = (ArrayList)this.e;
        if (stringArray2 == null && arrayList.size() > this.d) {
            arrayList = ((ArrayList)this.e).remove(0);
        }
        long l3 = 0L;
        Iterator iterator = ((ArrayList)this.e).iterator();
        while (iterator.hasNext()) {
            long l4 = (Long)iterator.next();
            l3 += l4;
            if (stringArray2 == null) continue;
        }
    }

    public long y() {
        return this.X;
    }

    public synchronized void Y(long l2) {
        String[] stringArray = KV.b();
        this.X = l2;
        String[] stringArray2 = stringArray;
        ((ArrayList)this.O).add(this.X);
        ArrayList arrayList = (ArrayList)this.O;
        if (stringArray2 == null && arrayList.size() > this.d) {
            arrayList = ((ArrayList)this.O).remove(0);
        }
        long l3 = 0L;
        Iterator iterator = ((ArrayList)this.O).iterator();
        while (iterator.hasNext()) {
            long l4 = (Long)iterator.next();
            l3 += l4;
            if (stringArray2 == null) continue;
        }
    }

    public ArrayList W() {
        return (ArrayList)this.e;
    }

    public synchronized ArrayList I() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList)this.e);
        return arrayList;
    }

    public synchronized ArrayList k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList)this.O);
        return arrayList;
    }

    public void d() {
        this.G = 0L;
        this.C = 0L;
        this.l = 0L;
        this.y = 0L;
    }

    public ArrayList T() {
        return (ArrayList)this.O;
    }

    public void y(ArrayList arrayList) {
        this.O = arrayList;
    }

    public long T() {
        return this.y;
    }

    public void h(long l2) {
        this.y = l2;
    }

    public long r() {
        return this.l;
    }

    public void T(long l2) {
        this.l = l2;
    }

    public long Y() {
        return this.C;
    }

    public void o(long l2) {
        this.C = l2;
    }

    public long g() {
        return this.G;
    }

    public void y(long l2) {
        this.G = l2;
    }

    public String U() {
        return (String)this.v;
    }

    public void y(String string) {
        this.v = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2690515540993287461L;
        a = 0xFAF7D5592B92A409L ^ l2;
    }
}

