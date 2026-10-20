/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Renamed from tZ
 */
class tz_1
implements KeyListener {
    final yz_0 n;

    tz_1(yz_0 yz_02) {
        this.n = yz_02;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block5: {
            int n10;
            block4: {
                int n11 = keyEvent.getModifiers();
                String[] stringArray = zK.B();
                n10 = n11;
                if (stringArray == null) break block4;
                if (n10 <= 0) break block5;
                n10 = n11 & 2;
            }
            if (n10 != 0) {
                // empty if block
            }
        }
    }
}

