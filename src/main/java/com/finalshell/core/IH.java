package com.finalshell.core;

import com.finalshell.ui.listener.Wc4;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class IH extends IB {
   public ActionListener W;
   public FocusAdapter w;
   public static String[] H;

   public IH(AS var1) {
      super(var1);
   }

   public String W() {
      String[] var10000 = M();
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

   protected void I(JTextComponent var1) {
      String[] var10000 = M();
      this.w = new Wc4(this);
      var1.addFocusListener(this.w);
      String[] var2 = var10000;
      JTextComponent var4 = var1;
      if (var2 != null) {
         if (!(var1 instanceof JTextField)) {
            return;
         }

         var4 = var1;
      }

      JTextField var3 = (JTextField)var4;
      this.W = new com.finalshell.ui.listener.B6(this);
      var3.addActionListener(this.W);
   }

   protected void y(JTextComponent var1) {
      var1.setText((String)this.o());
   }

   protected void r(JTextComponent var1) {
      this.J(var1.getText());
   }

   protected void C(JTextComponent var1) {
      String[] var10000 = M();
      var1.removeFocusListener(this.w);
      this.w = null;
      String[] var2 = var10000;
      JTextComponent var4 = var1;
      if (var2 != null) {
         if (!(var1 instanceof JTextField)) {
            return;
         }

         var4 = var1;
      }

      JTextField var3 = (JTextField)var4;
      var3.removeActionListener(this.W);
      this.W = null;
   }

   @Override
   protected void T(JComponent var1) {
      this.r((JTextComponent)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.y((JTextComponent)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.C((JTextComponent)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.I((JTextComponent)var1);
   }

   @Override
   public Serializable Y() {
      return this.W();
   }

   public static void x(String[] var0) {
      H = var0;
   }

   public static String[] M() {
      return H;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (M() == null) {
         x(new String[3]);
      }
   }
}





