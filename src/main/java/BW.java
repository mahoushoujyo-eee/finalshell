/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;

class BW
implements ComponentListener {
    final bq_0 p;
    final U u;
    final yn_1 s;

    BW(yn_1 yn_12, bq_0 bq_02, U u10) {
        this.s = yn_12;
        this.p = bq_02;
        this.u = u10;
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        Point point = new Point();
        Point point2 = MouseInfo.getPointerInfo().getLocation();
        Point point3 = ((bq_0)this.p).getLocationOnScreen();
        point.x = point2.x - (point3.x - ((U)c.c((long)297636157862580024L).get((Object)this)).getLocationOnScreen().x + ((Point)c.c((long)161378981027509202L).get((Object)c.c((long)479413945485822457L).get((Object)c.c((long)312271273134902461L).get((Object)this)))).x);
        point.y = point2.y - (point3.y - ((U)c.c((long)297636157862580024L).get((Object)this)).getLocationOnScreen().y + ((Point)c.c((long)161378981027509202L).get((Object)c.c((long)479413945485822457L).get((Object)c.c((long)312271273134902461L).get((Object)this)))).y);
        ((U)this.u).setLocation(point);
        try {
            lk_0.V(this.u);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((U)this.u).removeComponentListener(this);
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
    }
}

