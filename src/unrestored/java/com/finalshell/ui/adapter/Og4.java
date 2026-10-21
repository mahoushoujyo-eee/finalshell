package com.finalshell.ui.adapter;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableCellEditor;

public class Og4 extends AbstractAction {
   public final Km2 B;

   public Og4(Km2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Km2.U$String();
      Object var4 = 121229514840864611L;
      TableCellEditor var3 = ((Km2)Ref.g(121229514840864611L, var4)).getCellEditor();
      Object var10001 = var3;
      if (this == null) {
         if (var3 == null) {
            return;
         }

         var10001 = this;
         Object var6 = 121229514840864611L;
         ((Km2)Ref.g(121229514840864611L, var6)).getCellEditor();
      }

      var10001.stopCellEditing();
   }
}





