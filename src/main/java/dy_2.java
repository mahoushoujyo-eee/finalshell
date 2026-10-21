import javax.swing.table.DefaultTableModel;

class Dy_2 extends DefaultTableModel {
   Dy_2(Object[][] var1, Object[] var2) {
      super(var1, var2);
   }

   @Override
   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }
}





