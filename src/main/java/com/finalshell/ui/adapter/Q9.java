package com.finalshell.ui.adapter;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class Q9 extends AbstractAction {
   public final SetBackgroundImagePanel k;

   public Q9(SetBackgroundImagePanel var1, String var2) {
      super(var2);
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.k.v$void();
   }
}





