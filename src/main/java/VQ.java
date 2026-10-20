/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class VQ
implements ListSelectionListener {
    final km_0 f;

    VQ(km_0 km_02) {
        this.f = km_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        this.f.S = System.currentTimeMillis();
    }
}

