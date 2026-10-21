import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class UN extends AbstractTableModel {
   private ArrayList F;
   String[] a;
   Class[] j;

   UN() {
      com.c.c(388227650086417294L).set(this, new ArrayList());
      com.c.c(281087138368221367L).set(this, new Class[]{Object.class});
      com.c.c(493768440842237655L).set(this, new String[]{""});
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      if (var1 < ((ArrayList)com.c.c(388227650086417294L).get(this)).size()) {
         var3 = (String)((ArrayList)com.c.c(388227650086417294L).get(this)).get(var1);
      }

      return var3;
   }

   public int j(String var1) {
      com.ky_4[] var10000 = zM.I();
      int var3 = 0;
      Iterator var4 = ((ArrayList)com.c.c(388227650086417294L).get(this)).iterator();
      com.ky_4[] var2 = var10000;

      while (true) {
         label24:
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 != null) {
               var6 = var1.equals(var5);
               if (var2 == null) {
                  break;
               }

               if (var6 != 0 && var2 != null) {
                  break label24;
               }

               var3++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      return ((ArrayList)com.c.c(388227650086417294L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(493768440842237655L).get(this)).length;
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(493768440842237655L).get(this))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      return ((Class[])com.c.c(281087138368221367L).get(this))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      com.ky_4[] var10000 = zM.I();
      boolean var4 = false;
      com.ky_4[] var3 = var10000;
      int var6 = var2;
      if (var3 != null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return (boolean)var6;
   }

   public ArrayList B() {
      return (ArrayList)com.c.c(388227650086417294L).get(this);
   }

   public void N(ArrayList var1) {
      com.c.c(388227650086417294L).set(this, var1);
   }
}





