package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.PathPanel;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class Oq4 implements FocusListener {
   public final PathPanel u;

   public Oq4(PathPanel var1) {
      this.u = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Object var2 = 132075193542412282L;
      Ref.g(132075193542412282L, var2);
      Object var4 = 626158744249045388L;
      ((JTextField)Ref.g(626158744249045388L, var4)).selectAll();
   }
}





