package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class OV3 implements ItemListener {
   public final JComboBox u;
   public final JTable D;
   public final int[] Y;

   public OV3(JComboBox var1, JTable var2, int[] var3) {
      this.u = var1;
      this.D = var2;
      this.Y = var3;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      Object var3 = 527786525229751657L;
      int var2 = ((JComboBox)Ref.g(527786525229751657L, var3)).getSelectedIndex();
      Object var5 = 471266748782016056L;
      JTable var10002 = (JTable)Ref.g(471266748782016056L, var5);
      Object var7 = 384109096542722567L;
      this.setAutoResizeMode(((int[])Ref.g(384109096542722567L, var7))[var2]);
   }
}





