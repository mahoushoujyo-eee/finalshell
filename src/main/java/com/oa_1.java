/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * Renamed from com.oA
 */
public class oa_1
extends PlainDocument {
    private final int Z;
    private final boolean H;

    public oa_1() {
        this.Z = 0;
        this.H = false;
    }

    public oa_1(int n10) {
        this.Z = n10;
        this.H = false;
    }

    public oa_1(int n10, boolean bl) {
        this.Z = n10;
        this.H = bl;
    }

    public int r() {
        return this.Z;
    }

    public boolean V() {
        return this.H;
    }

    @Override
    public void insertString(int n10, String string, AttributeSet attributeSet) throws BadLocationException {
        block15: {
            oa_1 oa_12;
            block17: {
                int n11;
                block16: {
                    int[] nArray;
                    block14: {
                        nArray = WC.V();
                        try {
                            if (string == null) {
                                return;
                            }
                        }
                        catch (BadLocationException badLocationException) {
                            throw oa_1.a(badLocationException);
                        }
                        try {
                            try {
                                n11 = this.r();
                                if (nArray != null) break block14;
                                if (n11 <= 0) break block15;
                            }
                            catch (BadLocationException badLocationException) {
                                throw oa_1.a(badLocationException);
                            }
                            n11 = this.getLength() + string.length();
                        }
                        catch (BadLocationException badLocationException) {
                            throw oa_1.a(badLocationException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (nArray != null) break block16;
                                if (n11 > this.r()) break block15;
                            }
                            catch (BadLocationException badLocationException) {
                                throw oa_1.a(badLocationException);
                            }
                            oa_12 = this;
                            if (nArray != null) break block17;
                        }
                        catch (BadLocationException badLocationException) {
                            throw oa_1.a(badLocationException);
                        }
                        n11 = oa_12.V() ? 1 : 0;
                    }
                    catch (BadLocationException badLocationException) {
                        throw oa_1.a(badLocationException);
                    }
                }
                if (n11 != 0) {
                    string = string.toUpperCase();
                }
                oa_12 = this;
            }
            super.insertString(n10, string, attributeSet);
        }
    }

    private static BadLocationException a(BadLocationException badLocationException) {
        return badLocationException;
    }
}

