import javax.swing.table.DefaultTableModel;

class ll_4 extends DefaultTableModel {
   @Override
   public int getColumnCount() {
      return 1;
   }

   public void G() {
      super.addRow(new Object[]{new UC(0, 0, "", "")});
   }
}





