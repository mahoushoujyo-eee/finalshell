/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.F.c;
import org.v.RB;
import org.v.RG;
import org.v._9;
import org.v.fK;
import org.v.rs_0;
import org.v.rz_0;

public final class RD
extends RB {
    @c
    public rs_0 V;
    public final List l = new ArrayList();

    public RD(@c String string) {
        this(string, new fK[0]);
    }

    public RD(@c String string, fK[] fKArray) {
        super(string, fKArray);
    }

    public void g(@c rs_0 rs_02) {
        this.V = rs_02;
    }

    public void Y(_9 _92) {
        this.l.add(_92);
        _92.l(this);
    }

    public _9[] E() {
        return this.l.toArray(new _9[this.l.size()]);
    }

    @c
    public _9 o(String string) {
        Iterator iterator = this.l.iterator();
        String[] stringArray = RG.C();
        while (iterator.hasNext()) {
            block4: {
                _9 _92;
                block3: {
                    _9 _93;
                    _92 = _93 = (_9)iterator.next();
                    if (stringArray == null) break block3;
                    if (!_92.j().equals(string)) break block4;
                    _92 = _93;
                }
                return _92;
            }
            if (stringArray != null) continue;
        }
        return null;
    }

    @Override
    @c
    public Object l(rz_0 rz_02) throws Throwable {
        return rz_02.g(this);
    }
}

