package com.finalshell.ui.listener;

import com.finalshell.core.Yi2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

public class Wz4 implements ActionListener {
   public final JComponent o;
   public final int E;
   public final int G;
   public final Yi2 D;

   public Wz4(Yi2 var1, JComponent var2, int var3, int var4) {
      this.D = var1;
      this.o = var2;
      this.E = var3;
      this.G = var4;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.D.z(this.o, this.E, this.G);
   }
}





