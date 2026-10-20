/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NJ;
import com.TW;
import com.WD;
import com._y_0;
import com.wh_1;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.it
 */
public class it_2
implements wh_1 {
    protected JTabbedPane E = new JTabbedPane();

    @Override
    public int n() {
        return this.E.getTabCount();
    }

    public void y(String string, _y_0 _y_02) {
        this.E.addTab(string, _y_02);
    }

    @Override
    public String r(int n10) {
        return this.E.getTitleAt(n10);
    }

    @Override
    public int z() {
        return this.E.getSelectedIndex();
    }

    @Override
    public void k(int n10) {
        this.E.setSelectedIndex(n10);
    }

    @Override
    public void v(int n10, Component component) {
        this.E.setTabComponentAt(n10, component);
    }

    @Override
    public int S(Component component) {
        return this.E.indexOfComponent(component);
    }

    @Override
    public int F(Component component) {
        return this.E.indexOfTabComponent(component);
    }

    @Override
    public void o() {
        this.E.removeAll();
    }

    public void P(_y_0 _y_02) {
        this.E.remove(_y_02);
    }

    @Override
    public void R(int n10, String string) {
        this.E.setTitleAt(n10, string);
    }

    public void u(_y_0 _y_02) {
        this.E.setSelectedComponent(_y_02);
    }

    @Override
    public JComponent z() {
        return this.E;
    }

    public _y_0 F(int n10) {
        return (_y_0)this.E.getComponentAt(n10);
    }

    @Override
    public void C(NJ nJ2) {
        this.E.addChangeListener(new WD(this, nJ2));
        this.E.addContainerListener(new TW(this, nJ2));
    }

    @Override
    public Component u(int n10) {
        return this.F(n10);
    }

    @Override
    public void i(Component component) {
        this.u((_y_0)component);
    }

    @Override
    public void S(Component component) {
        this.P((_y_0)component);
    }

    @Override
    public void G(String string, Component component) {
        this.y(string, (_y_0)component);
    }
}

