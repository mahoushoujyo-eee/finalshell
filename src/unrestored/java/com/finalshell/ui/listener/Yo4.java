package com.finalshell.ui.listener;

import com.finalshell.core.Kf2;
import com.finalshell.core.W82;
import com.finalshell.ui.model.LN;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.S1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class Yo4 implements ActionListener, ItemListener {
   public String L;
   public String B;
   public final JComboBox e;
   public final Kf2 u;
   public final JSlider l;
   public final JSpinner o;
   public final W82 n;
   public final JTextArea b;
   public final JTextArea V;
   public final S1 m;

   public Yo4(S1 var1, JComboBox var2, Kf2 var3, JSlider var4, JSpinner var5, W82 var6, JTextArea var7, JTextArea var8) {
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
      LN var2 = (LN)this.e.getSelectedItem();
      int var3 = this.u.P();
      int var4 = var3 + this.u.r().size();
      this.l.setMinimum(var3);
      int var10000 = com.finalshell.core.Af2.p();
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

      if (Ky4.F$arrString() != null) {
         com.finalshell.core.Af2.J(++var1);
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





