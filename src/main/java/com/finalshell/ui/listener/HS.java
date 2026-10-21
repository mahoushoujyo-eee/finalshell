package com.finalshell.ui.listener;

import com.finalshell.core.C_c_2;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.JTextComponent;

public class HS implements FocusListener {
   public final JTextComponent K;
   public final C_c_2 z;

   public HS(C_c_2 var1, JTextComponent var2) {
      this.z = var1;
      this.K = var2;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.K.repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.K.repaint();
   }
}





