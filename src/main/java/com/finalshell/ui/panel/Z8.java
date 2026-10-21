package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import java.awt.CardLayout;
import javax.swing.JComponent;

public class Z8 extends JComponent {
   CardLayout G;

   public Z8() {
      CardLayout var10001 = new CardLayout();
      long var2 = 345630514562266623L;
      CardLayout var1 = var10001;
      Ref.s(345630514562266623L, var1, var2);
      Object var3 = 345630514562266623L;
      this.setLayout((CardLayout)Ref.g(345630514562266623L, var3));
   }

   public void c(JComponent var1) {
      this.add(var1, var1.getName());
   }

   public void P(JComponent var1) {
      Object var2 = 345630514562266623L;
      ((CardLayout)Ref.g(345630514562266623L, var2)).show(this, var1.getName());
   }
}





