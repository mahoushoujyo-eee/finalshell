package com.finalshell.ui.listener;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class GJ extends FocusAdapter {
   public final int W;
   public final Component N;
   public final JTextField v;
   public final com.finalshell.core.T5 S;
   public final com.finalshell.core.X0 Y;

   public GJ(com.finalshell.core.X0 var1, int var2, Component var3, JTextField var4, com.finalshell.core.T5 var5) {
      this.Y = var1;
      this.W = var2;
      this.N = var3;
      this.v = var4;
      this.S = var5;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.finalshell.core.X0.k(this.W, this.N, this.v.getText(), this.S);
   }
}





