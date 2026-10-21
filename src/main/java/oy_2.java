import javax.swing.table.DefaultTableModel;

class Oy_2 extends DefaultTableModel {
   final dE_3 Z;

   Oy_2(dE_3 var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.Z = var1;
   }

   @Override
   public Class getColumnClass(int var1) {
      return var1 == 2 ? Boolean.class : String.class;
   }
}





