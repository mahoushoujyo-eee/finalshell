/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ek_1;
import javax.swing.event.DocumentEvent;

/*
 * Renamed from com.eO
 */
public abstract class eo_1
extends ek_1 {
    @Override
    public void u(DocumentEvent documentEvent) {
        try {
            this.d(Integer.parseInt(this.Y(documentEvent)), documentEvent);
        }
        catch (Throwable throwable) {
            this.d(null, documentEvent);
        }
    }

    public abstract void d(Integer var1, DocumentEvent var2);
}

