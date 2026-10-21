package com.finalshell.core;

import com.finalshell.ui.listener.TW2;
import com.finalshell.ui.listener.WD;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class It4 implements WH3 {
   protected JTabbedPane E = new JTabbedPane();

   @Override
   public int n() {
      return this.E.getTabCount();
   }

   public void y(String var1, ConnectionProperty var2) {
      this.E.addTab(var1, var2);
   }

   @Override
   public String r(int var1) {
      return this.E.getTitleAt(var1);
   }

   @Override
   public int z$int() {
      return this.E.getSelectedIndex();
   }

   @Override
   public void k(int var1) {
      this.E.setSelectedIndex(var1);
   }

   @Override
   public void v(int var1, Component var2) {
      this.E.setTabComponentAt(var1, var2);
   }

   @Override
   public int S$int(Component var1) {
      return this.E.indexOfComponent(var1);
   }

   @Override
   public int F(Component var1) {
      return this.E.indexOfTabComponent(var1);
   }

   @Override
   public void o() {
      this.E.removeAll();
   }

   public void P(ConnectionProperty var1) {
      this.E.remove(var1);
   }

   @Override
   public void R(int var1, String var2) {
      this.E.setTitleAt(var1, var2);
   }

   public void u(ConnectionProperty var1) {
      this.E.setSelectedComponent(var1);
   }

   @Override
   public JComponent z$JComponent() {
      return this.E;
   }

   public ConnectionProperty F(int var1) {
      return (ConnectionProperty)this.E.getComponentAt(var1);
   }

   @Override
   public void C(NJ var1) {
      this.E.addChangeListener(new WD(this, var1));
      this.E.addContainerListener(new TW2(this, var1));
   }

   @Override
   public Component u(int var1) {
      return this.F(var1);
   }

   @Override
   public void i(Component var1) {
      this.u((ConnectionProperty)var1);
   }

   @Override
   public void S$void(Component var1) {
      this.P((ConnectionProperty)var1);
   }

   @Override
   public void G(String var1, Component var2) {
      this.y(var1, (ConnectionProperty)var2);
   }
}





