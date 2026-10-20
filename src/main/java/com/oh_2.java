/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GA;
import com.W2;
import com.o8_0;
import com.pi_1;
import java.awt.Component;
import java.awt.Shape;

/*
 * Renamed from com.oh
 */
public class oh_2
extends o8_0 {
    private W2 Y;

    public oh_2(Component component) {
        super(component);
    }

    @Override
    public void j(Component component) {
        super.j(component);
        this.Y = GA.e(component);
    }

    @Override
    public Shape v() {
        block3: {
            W2 w2;
            block2: {
                String[] stringArray = pi_1.v();
                w2 = this.Y;
                if (stringArray != null) break block2;
                if (w2 == null) break block3;
                w2 = this.Y;
            }
            return w2.B();
        }
        return null;
    }
}

