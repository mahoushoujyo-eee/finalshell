/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fL
 */
public class fl_1
implements J1 {
    @Override
    public int Z() {
        return 1;
    }

    @Override
    public long C(byte[] byArray) {
        byte by;
        block2: {
            int n10 = 0;
            boolean bl = DF.M();
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                by = (byte)(n10 + byArray[i2]);
                if (bl) {
                    n10 = by;
                    if (bl) continue;
                }
                break block2;
            }
            by = n10;
        }
        return by;
    }
}

