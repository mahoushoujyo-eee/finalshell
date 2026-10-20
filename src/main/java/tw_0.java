/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from Tw
 */
class tw_0
implements Runnable {
    final ax_0 D;

    tw_0(ax_0 ax_02) {
        this.D = ax_02;
    }

    @Override
    public void run() {
        ((aJ)this.D.i.T.D).startEditingAtPath(((aJ)this.D.i.T.D).getSelectionPath());
    }
}

