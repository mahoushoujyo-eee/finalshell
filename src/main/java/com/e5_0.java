/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * Renamed from com.e5
 */
public class e5_0
extends PlainDocument {
    /*
     * Loose catch block
     */
    @Override
    public void insertString(int n10, String string, AttributeSet attributeSet) throws BadLocationException {
        block10: {
            int[] nArray = WC.V();
            try {
                if (string == null) {
                    return;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw e5_0.a(numberFormatException);
            }
            int n11 = this.getLength();
            if (n11 + string.length() > 5) break block10;
            String string2 = this.getText(0, n11);
            String string3 = string2.substring(0, n10) + string + string2.substring(n10);
            try {
                int n12;
                e5_0 e5_02;
                block9: {
                    e5_02 = this;
                    n12 = Integer.parseInt(string3 + "0");
                    if (nArray != null) break block9;
                    try {
                        block11: {
                            if (!e5_02.e(n12)) break block10;
                            break block11;
                            catch (NumberFormatException numberFormatException) {
                                throw e5_0.a(numberFormatException);
                            }
                        }
                        e5_02 = this;
                        n12 = n10;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw e5_0.a(numberFormatException);
                    }
                }
                super.insertString(n12, string, attributeSet);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
    }

    protected boolean e(int n10) {
        return true;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}

