package com.finalshell.core;

import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class QQ extends BasicScrollBarUI {
   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(this.scrollbar);
      FN.g(this.scrollbar);
      Ox4.B(this.scrollbar);
   }
}





