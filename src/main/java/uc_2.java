/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.Vector;

/*
 * Renamed from uc
 */
class uc_2
extends Vector {
    String B;

    uc_2(String string) {
        this.B = string;
    }

    uc_2(String string, Object[] objectArray) {
        String string2 = aA.z();
        this.B = string;
        String string3 = string2;
        int n10 = objectArray.length;
        for (int i2 = 0; i2 < n10; ++i2) {
            this.add(objectArray[i2]);
            if (string3 == null) continue;
        }
    }

    @Override
    public String toString() {
        return "[" + (String)this.B + "]";
    }
}

