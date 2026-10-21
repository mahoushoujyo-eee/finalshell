package com.finalshell.ui.adapter;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Yk2 extends AbstractAction {
   public final SetBackgroundImagePanel h;

   public Yk2(SetBackgroundImagePanel var1, String var2) {
      super(var2);
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.r();
   }

   @Override
   public boolean isEnabled() {
      return SetBackgroundImagePanel.r(this.h) != null;
   }
}





