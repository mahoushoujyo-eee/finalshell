import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.table.TableCellEditor;

class og_4 extends AbstractAction {
   final Km_2 B;

   og_4(Km_2 var1) {
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Km_2.U();
      TableCellEditor var3 = ((Km_2)com.c.c(121229514840864611L).get(this)).getCellEditor();
      String var2 = var10000;
      TableCellEditor var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var4 = ((Km_2)com.c.c(121229514840864611L).get(this)).getCellEditor();
      }

      var4.stopCellEditing();
   }
}





