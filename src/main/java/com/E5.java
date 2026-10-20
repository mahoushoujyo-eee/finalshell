/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EW;
import com.eo_0;
import com.ky_2;
import java.awt.event.MouseWheelEvent;
import org.jetbrains.annotations.NotNull;

public final class E5
extends eo_0 {
    private final MouseWheelEvent o;

    public E5(@NotNull MouseWheelEvent mouseWheelEvent) {
        String string = EW.V();
        super(EW.c(mouseWheelEvent), EW.c(mouseWheelEvent));
        String string2 = string;
        this.o = mouseWheelEvent;
        if (ky_2.F() != null) {
            EW.F("cUaUsc");
        }
    }

    public String toString() {
        return this.o.toString();
    }
}

