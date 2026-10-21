package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LogPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class FH implements ActionListener {
   public final JCheckBox q;
   public final LogPanel B;

   public FH(LogPanel var1, JCheckBox var2) {
      this.B = var1;
      this.q = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 598983633426453347L;
      Ref.g(598983633426453347L, var2);
      Object var4 = 516913929395634792L;
      Ref.setBoolean(376642468236131701L, this, ((JCheckBox)Ref.g(516913929395634792L, var4)).isSelected());
   }
}





