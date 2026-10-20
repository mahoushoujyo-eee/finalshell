/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class DO
implements MouseMotionListener {
    final a3 F;

    DO(a3 a32) {
        this.F = a32;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        this.F.U = false;
    }
}

