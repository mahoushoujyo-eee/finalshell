/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.EY;
import com.Z.T;
import com.cz_0;
import com.z.d_0;
import java.io.File;
import java.util.List;

/*
 * Renamed from com.Z.q
 */
public class q_0
extends EY {
    protected d_0 p;
    final T k;

    public q_0(T t2, d_0 d_02) {
        this.k = t2;
        this.p = d_02;
    }

    @Override
    public boolean d(List list) {
        boolean bl;
        block2: {
            block3: {
                block6: {
                    block4: {
                        File file;
                        block5: {
                            String string = T.v();
                            bl = list.size();
                            if (string != null) break block2;
                            if (bl <= false) break block3;
                            file = (File)list.get(0);
                            if (string != null) break block4;
                            if (list.size() != 1 || !cz_0.z(file)) break block5;
                            this.k.M(file, this.p);
                            if (string == null) break block6;
                        }
                        this.k.M(file.getParentFile(), this.p);
                    }
                    this.k.S(list);
                }
                return true;
            }
            bl = false;
        }
        return bl;
    }
}

