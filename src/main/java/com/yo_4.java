package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

class yo_4 implements ActionListener, ItemListener {
   private String L;
   private String B;
   final JComboBox e;
   final com.Kf_2 u;
   final JSlider l;
   final JSpinner o;
   final w8_2 n;
   final JTextArea b;
   final JTextArea V;
   final S1 m;

   yo_4(S1 var1, JComboBox var2, com.Kf_2 var3, JSlider var4, JSpinner var5, w8_2 var6, JTextArea var7, JTextArea var8) {
      this.m = var1;
      this.e = var2;
      this.u = var3;
      this.l = var4;
      this.o = var5;
      this.n = var6;
      this.b = var7;
      this.V = var8;
      this.L = "";
      this.B = "";
   }

   public void s() {
      com.LN var2 = (com.LN)this.e.getSelectedItem();
      int var3 = this.u.P();
      int var4 = var3 + this.u.r().size();
      this.l.setMinimum(var3);
      int var10000 = com.af_2.p();
      this.l.setMaximum(var4);
      int var1 = var10000;
      SpinnerNumberModel var5 = new SpinnerNumberModel(Math.max((Integer)this.o.getValue(), var3), var3, var4, 1);
      this.o.setModel(var5);
      int var6 = this.l.getValue() - this.l.getMinimum();
      String var7 = this.n.c(var2, var6);
      String var8 = S1.y(this.m, this.n, var6);
      boolean var10 = var7.equals(this.L);
      if (var1 == 0) {
         if (!var10) {
            this.b.setText(var7);
            this.L = var7;
         }

         var10 = var8.equals(this.B);
      }

      if (!var10) {
         this.V.setText(var8);
         this.B = var8;
      }

      if (com.ky_4.F() != null) {
         com.af_2.J(++var1);
      }
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.s();
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.s();
   }
}





