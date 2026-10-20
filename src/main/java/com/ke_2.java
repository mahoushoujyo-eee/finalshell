/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cn_0;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * Renamed from com.ke
 */
public class ke_2
extends PlainDocument {
    private int T;

    public ke_2(int n10) {
        this.T = n10;
    }

    @Override
    public void insertString(int n10, String string, AttributeSet attributeSet) throws BadLocationException {
        block8: {
            ke_2 ke_22;
            block7: {
                String[] stringArray = cn_0.Q();
                try {
                    if (string == null) {
                        return;
                    }
                }
                catch (BadLocationException badLocationException) {
                    throw ke_2.a(badLocationException);
                }
                try {
                    try {
                        ke_22 = this;
                        if (stringArray == null) break block7;
                        if (ke_22.getLength() + string.length() > this.T) break block8;
                    }
                    catch (BadLocationException badLocationException) {
                        throw ke_2.a(badLocationException);
                    }
                    ke_22 = this;
                }
                catch (BadLocationException badLocationException) {
                    throw ke_2.a(badLocationException);
                }
            }
            super.insertString(n10, string, attributeSet);
        }
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }
}

