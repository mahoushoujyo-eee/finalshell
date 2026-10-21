package com.finalshell.core;

import com.finalshell.ui.listener.EZ3;
import com.finalshell.ui.listener.X32;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JPasswordField;

public class Ig2 extends IB {
   public ActionListener R;
   public FocusAdapter V;

   public Ig2(AS var1) {
      super(var1);
   }

   public String X() {
      String[] var10000 = IH.M();
      String var2 = (String)super.Y();
      String[] var1 = var10000;
      String var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = "";
         }

         var3 = var2;
      }

      return var3;
   }

   protected void A(JPasswordField var1) {
      this.R = new EZ3(this);
      var1.addActionListener(this.R);
      this.V = new X32(this);
      String[] var10000 = IH.M();
      var1.addFocusListener(this.V);
      String[] var2 = var10000;
      if (var2 == null) {
         Ky4.K(new String[3]);
      }
   }

   protected void q(JPasswordField var1) {
      IH.M();
      var1.removeActionListener(this.R);
      this.R = null;
      var1.removeFocusListener(this.V);
      this.V = null;
      if (Ky4.F$arrString() != null) {
         IH.x(new String[4]);
      }
   }

   protected void S(JPasswordField var1) {
      var1.setText(LE_2.o((String)this.o()));
   }

   protected void f(JPasswordField var1) {
      this.J(LE_2.E(new String(var1.getPassword())));
   }

   @Override
   protected void T(JComponent var1) {
      this.f((JPasswordField)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.S((JPasswordField)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.q((JPasswordField)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.A((JPasswordField)var1);
   }

   @Override
   public Serializable Y() {
      return this.X();
   }
}





