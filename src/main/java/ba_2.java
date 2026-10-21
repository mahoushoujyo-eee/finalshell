import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class Ba_2 extends AbstractTableModel {
   private ArrayList R;
   String[] T;
   Class[] L;

   Ba_2() {
      com.c.c(340080073196519749L).set(this, new ArrayList());
      com.c.c(613939194239887285L).set(this, new Class[]{Object.class});
      com.c.c(453953360809999237L).set(this, new String[]{""});
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      if (var1 < ((ArrayList)com.c.c(340080073196519749L).get(this)).size()) {
         var3 = (String)((ArrayList)com.c.c(340080073196519749L).get(this)).get(var1);
      }

      return var3;
   }

   public int p(String var1) {
      String[] var10000 = Br_2.w();
      int var3 = 0;
      Iterator var4 = ((ArrayList)com.c.c(340080073196519749L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         label24:
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 == null) {
               var6 = var1.equals(var5);
               if (var2 != null) {
                  break;
               }

               if (var6 != 0 && var2 == null) {
                  break label24;
               }

               var3++;
            }

            if (var2 == null) {
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
      return ((ArrayList)com.c.c(340080073196519749L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(453953360809999237L).get(this)).length;
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(453953360809999237L).get(this))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      return ((Class[])com.c.c(613939194239887285L).get(this))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String[] var10000 = Br_2.w();
      boolean var4 = false;
      String[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return (boolean)var6;
   }

   public ArrayList u() {
      return (ArrayList)com.c.c(340080073196519749L).get(this);
   }

   public void p(ArrayList var1) {
      com.c.c(340080073196519749L).set(this, var1);
   }
}





