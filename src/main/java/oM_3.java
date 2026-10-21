import javax.swing.table.DefaultTableModel;

class oM_3 extends DefaultTableModel {
   final CV d;

   oM_3(CV var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.d = var1;
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}





