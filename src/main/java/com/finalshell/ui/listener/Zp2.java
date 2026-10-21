package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SendSyncMailPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class Zp2 implements ActionListener {
   final JCheckBox Q;
   final SendSyncMailPanel C;

   Zp2(SendSyncMailPanel var1, JCheckBox var2) {
      this.C = var1;
      this.Q = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 474425056060006573L;
      Ref.g(474425056060006573L, var2);
      Object var4 = 247641154193850073L;
      Registry.lookupField(370516434131129032L).setBoolean(this, ((JCheckBox)Ref.g(247641154193850073L, var4)).isSelected());
   }
}





