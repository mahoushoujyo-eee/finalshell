/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.ek_1;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.text.Document;

/*
 * Renamed from com.La
 */
class la_0
implements PropertyChangeListener {
    final ek_1 O;

    la_0(ek_1 ek_12) {
        this.O = ek_12;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block10: {
            Object object;
            block11: {
                Object object2;
                String string;
                block9: {
                    Object object3;
                    block7: {
                        block8: {
                            Object object4 = propertyChangeEvent.getOldValue();
                            string = FV.D();
                            object3 = object4;
                            if (string != null) break block7;
                            if (object3 == null) break block8;
                            object3 = object4;
                            if (string != null) break block7;
                            if (object3 instanceof Document) {
                                ((Document)object4).removeDocumentListener(this.O);
                            }
                        }
                        object3 = propertyChangeEvent.getNewValue();
                    }
                    object = object2 = object3;
                    if (string != null) break block9;
                    if (object == null) break block10;
                    object = object2;
                }
                if (string != null) break block11;
                if (!(object instanceof Document)) break block10;
                object = object2;
            }
            ((Document)object).addDocumentListener(this.O);
        }
    }
}

