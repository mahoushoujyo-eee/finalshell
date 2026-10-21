package com;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JPasswordField;

public class Ig_2 extends IB {
   private ActionListener R;
   private FocusAdapter V;

   public Ig_2(com.aS var1) {
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
      this.R = new eZ_3(this);
      var1.addActionListener(this.R);
      this.V = new X3(this);
      String[] var10000 = IH.M();
      var1.addFocusListener(this.V);
      String[] var2 = var10000;
      if (var2 == null) {
         com.ky_4.K(new String[3]);
      }
   }

   protected void q(JPasswordField var1) {
      IH.M();
      var1.removeActionListener(this.R);
      this.R = null;
      var1.removeFocusListener(this.V);
      this.V = null;
      if (com.ky_4.F() != null) {
         IH.x(new String[4]);
      }
   }

   protected void S(JPasswordField var1) {
      var1.setText(com.LE.o((String)this.o()));
   }

   protected void f(JPasswordField var1) {
      this.J(com.LE.E(new String(var1.getPassword())));
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





