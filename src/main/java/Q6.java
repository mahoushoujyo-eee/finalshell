import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Q6 extends AbstractTableModel {
   private ArrayList v;
   String[] N;
   Class[] j;
   private static final long a;

   Q6() {
      com.c.c(593268998095649359L).set(this, new ArrayList());
      com.c.c(382572070510439589L).set(this, new Class[]{Object.class});
      com.c.c(332657287529601498L).set(this, new String[]{""});
   }

   @Override
   public int getRowCount() {
      String var10000 = Vn_2.C();
      int var2 = (int)a;
      String var1 = var10000;
      int var3 = ((ArrayList)com.c.c(593268998095649359L).get(this)).size();
      if (var1 == null) {
         if (var3 > var2) {
            return var2;
         }

         var3 = ((ArrayList)com.c.c(593268998095649359L).get(this)).size();
      }

      return var3;
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(332657287529601498L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(593268998095649359L).get(this)).get(var1);
   }

   public ArrayList J() {
      return (ArrayList)com.c.c(593268998095649359L).get(this);
   }

   public void B(ArrayList var1) {
      com.c.c(593268998095649359L).set(this, var1);
   }

   static {
      long var0 = 423249386125184514L;
      long var10002 = -7628093244644733412L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





