/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.YO;
import com.i2_0;
import java.awt.ComponentOrientation;

class YI
extends YO {
    YI() {
    }

    @Override
    public void Z(String string, String string2) {
        ComponentOrientation componentOrientation = ComponentOrientation.getOrientation(i2_0.Z(string));
        ComponentOrientation componentOrientation2 = ComponentOrientation.getOrientation(i2_0.Z(string2));
        if (componentOrientation.isLeftToRight() != componentOrientation2.isLeftToRight()) {
            FN.D();
        }
    }
}

