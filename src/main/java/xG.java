import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class xG extends AbstractTableModel {
   private ArrayList Z;
   String[] w;
   Class[] E;

   xG() {
      com.c.c(410487397827032565L).set(this, new ArrayList());
      com.c.c(186695375521450227L).set(this, new Class[]{Object.class});
      com.c.c(338876892181440577L).set(this, new String[]{""});
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      if (var1 < ((ArrayList)com.c.c(410487397827032565L).get(this)).size()) {
         var3 = (String)((ArrayList)com.c.c(410487397827032565L).get(this)).get(var1);
      }

      return var3;
   }

   public int L(String var1) {
      int[] var10000 = zn_2.g();
      int var3 = 0;
      int[] var2 = var10000;
      Iterator var4 = ((ArrayList)com.c.c(410487397827032565L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 == null) {
               if (var1 != null) {
                  var6 = var1.equals(var5);
                  if (var2 != null) {
                     break;
                  }

                  if (var6 != 0) {
                     var6 = var3;
                     break;
                  }
               }

               var3++;
            }

            if (var2 == null) {
               continue;
            }
         }

         return -1;
      }

      return var6;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      return ((ArrayList)com.c.c(410487397827032565L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(338876892181440577L).get(this)).length;
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(338876892181440577L).get(this))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      return ((Class[])com.c.c(186695375521450227L).get(this))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      int[] var10000 = zn_2.g();
      boolean var4 = false;
      int[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return (boolean)var6;
   }

   public ArrayList j() {
      return (ArrayList)com.c.c(410487397827032565L).get(this);
   }

   public void g(ArrayList var1) {
      com.c.c(410487397827032565L).set(this, var1);
   }
}





