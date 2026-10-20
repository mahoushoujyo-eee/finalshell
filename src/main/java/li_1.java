/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from lI
 */
public class li_1 {
    int w;
    String W;
    float N;
    float b;
    long G;
    String z;
    int i;
    String Y;
    String Q;
    String n;
    CB R;
    public static int p;
    boolean y;

    public li_1() {
        this.y = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public u8_0 P() {
        u8_0 u8_02;
        u8_0 u8_03;
        block15: {
            u8_0 u8_04;
            int n10;
            KV kV;
            String[] stringArray;
            block17: {
                KV kV2;
                ty_0 ty_02;
                KV kV3;
                block16: {
                    ty_0 ty_03;
                    CB cB;
                    ty_0 ty_04;
                    block14: {
                        CB cB2;
                        try {
                            cB2 = (CB)this.L();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        CB cB3 = cB2;
                        stringArray = KV.b();
                        ty_04 = null;
                        kV3 = null;
                        u8_03 = null;
                        cB = cB3;
                        if (stringArray != null) break block14;
                        if (cB == null) break block15;
                        cB = cB3;
                    }
                    try {
                        ty_03 = (ty_0)cB.Z();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ty_02 = ty_04 = ty_03;
                    if (stringArray != null) break block16;
                    if (ty_02 == null) break block15;
                    ty_02 = ty_04;
                }
                try {
                    kV2 = (KV)ty_02.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                kV = kV3 = kV2;
                if (stringArray != null) break block17;
                if (kV == null) break block15;
                kV = kV3;
            }
            try {
                n10 = (Integer)this.m();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                u8_04 = (u8_0)kV.m(n10);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            u8_02 = u8_03 = u8_04;
            if (stringArray != null) return u8_02;
            if (u8_02 != null) {
                try {
                    u8_03.F(this);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
        u8_02 = u8_03;
        return u8_02;
    }

    public int m() {
        return this.w;
    }

    public void F(int n10) {
        this.w = n10;
    }

    public String R() {
        return (String)this.W;
    }

    public void X(String string) {
        this.W = string;
    }

    public float r() {
        return this.N;
    }

    public void j(float f10) {
        this.N = f10;
    }

    public float c() {
        return this.b;
    }

    public void M(float f10) {
        this.b = f10;
    }

    public long c() {
        return this.G;
    }

    public void P(long l2) {
        this.G = l2;
    }

    public String B() {
        return (String)this.z;
    }

    public void H(String string) {
        this.z = string;
    }

    public int G() {
        return this.i;
    }

    public void O(int n10) {
        this.i = n10;
    }

    public String y() {
        return (String)this.Y;
    }

    public void V(String string) {
        this.Y = string;
    }

    public CB L() {
        return (CB)this.R;
    }

    public void H(CB cB) {
        this.R = cB;
    }

    public String L() {
        return (String)this.Q;
    }

    public void d(String string) {
        this.Q = string;
    }

    public String g() {
        return (String)this.n;
    }

    public void D(String string) {
        this.n = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2892425092713227975L;
        long l3 = 0x12A4CFBF0EDC8B8EL ^ l2;
        li_1.p = (int)l3;
    }
}

