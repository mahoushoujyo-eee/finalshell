/*
 * Decompiled with CFR 0.152.
 */
package com;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/*
 * Renamed from com.eK
 */
public abstract class ek_1
implements DocumentListener {
    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        this.u(documentEvent);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        this.u(documentEvent);
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        this.u(documentEvent);
    }

    public abstract void u(DocumentEvent var1);

    protected String Y(DocumentEvent documentEvent) {
        String string;
        Document document = documentEvent.getDocument();
        try {
            string = document.getText(0, document.getLength());
        }
        catch (BadLocationException badLocationException) {
            string = null;
        }
        return string;
    }
}

