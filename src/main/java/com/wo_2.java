/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_0;
import java.io.File;
import javax.swing.ImageIcon;

/*
 * Renamed from com.wo
 */
public class wo_2 {
    private final Object z = new Object();
    private File T;
    private boolean n = false;
    private boolean M = false;
    private ImageIcon r = null;
    private ImageIcon Y = null;

    public wo_2() {
    }

    public wo_2(File file) {
        this.T = file;
    }

    public File T() {
        return this.T;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j(File file) {
        Object object = this.z;
        synchronized (object) {
            String string = co_0.U();
            this.T = file;
            Object object2 = file;
            if (string != null) {
                if (object2 == null) {
                    this.n = false;
                    this.M = false;
                    this.r = null;
                    this.Y = null;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Y() {
        Object object = this.z;
        synchronized (object) {
            return this.n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void F(boolean bl) {
        Object object = this.z;
        synchronized (object) {
            String string = co_0.U();
            Object object2 = this.T;
            if (string != null) {
                if (object2 != null) {
                    this.n = bl;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Z() {
        Object object = this.z;
        synchronized (object) {
            return this.M;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y(boolean bl) {
        Object object = this.z;
        synchronized (object) {
            String string = co_0.U();
            Object object2 = this.T;
            if (string != null) {
                if (object2 != null) {
                    this.M = bl;
                }
                object2 = object;
            }
            // ** MonitorExit[v0] (shouldn't be in output)
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ImageIcon k() {
        Object object = this.z;
        synchronized (object) {
            return this.r;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void U(ImageIcon imageIcon) {
        Object object = this.z;
        synchronized (object) {
            this.r = imageIcon;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ImageIcon P() {
        Object object = this.z;
        synchronized (object) {
            return this.Y;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void C(ImageIcon imageIcon) {
        Object object = this.z;
        synchronized (object) {
            this.Y = imageIcon;
        }
    }

    public Object S() {
        return this.z;
    }
}

