package com.finalshell.ui.adapter;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Oo2 extends AbstractAction {
   public final SetBackgroundImagePanel C;

   public Oo2(SetBackgroundImagePanel var1, String var2) {
      super(var2);
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.C.A(false);
   }

   @Override
   public boolean isEnabled() {
      return SetBackgroundImagePanel.e(this.C) != null;
   }
}





