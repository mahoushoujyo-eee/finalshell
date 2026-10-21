package com.finalshell.ui.adapter;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GD extends AbstractAction {
   final SetBackgroundImagePanel T;

   GD(SetBackgroundImagePanel var1, String var2) {
      super(var2);
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.n$void();
   }
}





