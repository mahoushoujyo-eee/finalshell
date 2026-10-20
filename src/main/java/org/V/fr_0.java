/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import com.ky_2;
import org.I;
import org.b_0;
import org.v.R_;
import org.v._u_0;

/*
 * Renamed from org.v.fr
 */
public abstract class fr_0
implements _u_0 {
    public static final fr_0 X = new R_(I.z);
    private final I y;
    private static ky_2[] c;

    protected fr_0(I i2) {
        this.y = i2;
    }

    @Override
    public I Q() {
        return this.y;
    }

    @Override
    public void M(String string) throws b_0 {
        throw new b_0(string, this.y);
    }

    static {
        fr_0.v(new ky_2[4]);
    }

    public static void v(ky_2[] ky_2Array) {
        c = ky_2Array;
    }

    public static ky_2[] M() {
        return c;
    }
}

