/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

class m5
implements qa_0 {
    boolean B;
    boolean c;
    String d;
    boolean m;
    final yt_1 J;

    m5(yt_1 yt_12) {
        this.J = yt_12;
        this.B = false;
        this.c = false;
    }

    @Override
    public void j(boolean bl, String string, boolean bl2, boolean bl3) {
        block7: {
            boolean bl4;
            m5 m52;
            block8: {
                boolean bl5;
                block6: {
                    ky_2[] ky_2Array = yt_1.c();
                    this.m = bl;
                    ky_2[] ky_2Array2 = ky_2Array;
                    bl5 = bl;
                    if (ky_2Array2 == null) break block6;
                    if (!bl5) break block7;
                    this.B = bl2;
                    m52 = this;
                    bl4 = bl3;
                    if (ky_2Array2 == null) break block8;
                    m52.c = bl4;
                    bl5 = bl3;
                }
                if (!bl5) break block7;
                m52 = this;
                bl4 = true;
            }
            m52.B = bl4;
        }
        ty_2 ty_22 = new ty_2(ty_2.Y);
        try {
            ty_22.o(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            com.c.d(473928376202613579L).invoke(this.J, com.c.a(ty_22));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public boolean v() {
        return this.B;
    }

    @Override
    public boolean w() {
        return this.c;
    }

    @Override
    public String f() {
        return (String)this.d;
    }

    @Override
    public boolean l() {
        return this.m;
    }
}

