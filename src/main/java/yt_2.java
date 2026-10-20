/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/*
 * Renamed from yt
 */
class yt_2
implements FocusListener {
    final KC x;

    yt_2(KC kC) {
        this.x = kC;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        ((a3)this.x.x).stopEditing();
    }
}

