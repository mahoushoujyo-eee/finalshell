package com.finalshell.ui.listener;

import com.finalshell.ui.panel.NO;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CL3 implements ActionListener {
   final NO x;

   CL3(NO var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JTable var2 = (JTable)SwingUtilities.getAncestorOfClass(JTable.class, (Component)var1.getSource());
      int var3 = var2.getEditingRow();
      var2.getCellEditor().stopCellEditing();
      ((DefaultTableModel)var2.getModel()).removeRow(var3);
   }
}





