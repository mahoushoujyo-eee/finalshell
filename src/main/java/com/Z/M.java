/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.E;
import com.Z.T;

class M
implements E {
    final T k;

    M(T t2) {
        this.k = t2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Boolean Y() {
        boolean bl;
        block5: {
            String string;
            block8: {
                block7: {
                    block6: {
                        block4: {
                            string = T.v();
                            bl = this.k.H.isEditing();
                            if (string != null) break block4;
                            if (bl) break block5;
                            bl = this.k.E.k();
                        }
                        if (string != null) break block6;
                        if (bl) break block5;
                        bl = this.k.hD.isEditing();
                    }
                    if (string != null) break block7;
                    if (bl) break block5;
                    bl = this.k.D.V();
                }
                if (string != null) break block8;
                if (bl) break block5;
                bl = this.k.R.isFocusOwner();
            }
            if (string != null) return bl;
            if (!bl) {
                bl = true;
                return bl;
            }
        }
        bl = false;
        return bl;
    }

    @Override
    public Object J() {
        return this.Y();
    }
}

