/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hb_0;
import com.pa_1;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.n_
 */
class n__0
implements InputMethodRequests {
    final pa_1 C;

    private n__0(pa_1 pa_12) {
        this.C = pa_12;
    }

    @Override
    public Rectangle getTextLocation(TextHitInfo textHitInfo) {
        Rectangle rectangle = new Rectangle(pa_1.D(this.C).Q() * this.C.c4.width + this.C.p(), (pa_1.D(this.C).O() + 1) * this.C.c4.height, 0, 0);
        Point point = this.C.getLocationOnScreen();
        rectangle.translate(point.x, point.y);
        return rectangle;
    }

    @Override
    @Nullable
    public TextHitInfo getLocationOffset(int n10, int n11) {
        return null;
    }

    @Override
    public int getInsertPositionOffset() {
        return 0;
    }

    @Override
    public AttributedCharacterIterator getCommittedText(int n10, int n11, AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    public int getCommittedTextLength() {
        return 0;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator cancelLatestCommittedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator getSelectedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    n__0(pa_1 pa_12, hb_0 hb_02) {
        this(pa_12);
    }
}

