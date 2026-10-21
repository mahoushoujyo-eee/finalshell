package com.finalshell.ui.adapter;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Oq4 extends AbstractAction {
   public final SetBackgroundImagePanel B;

   public Oq4(SetBackgroundImagePanel var1, String var2) {
      super(var2);
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.y();
   }

   @Override
   public boolean isEnabled() {
      return SetBackgroundImagePanel.e(this.B) != null;
   }
}





